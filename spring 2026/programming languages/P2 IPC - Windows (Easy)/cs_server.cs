using System;
using System.IO;
using System.IO.Pipes;
using System.Reflection;

public class Server {
  private static NamedPipeServerStream pipe;
  private static StreamReader pipeReader;
  private static StreamWriter pipeWriter;
  private static Methods methods;
  private static BindingFlags flags;
  private static string clientName;
  private const char DELIM = '|';
  private static bool debugMode;
  private const string PIPE_NAME = "multi-lang-assignment";

  public static void Main(string[] args) {
    debugMode = (args.Length > 0 && args[0].ToLower() == "debug");
    OpenPipe();
    methods = new Methods();
    flags = BindingFlags.Public | BindingFlags.Instance | BindingFlags.IgnoreCase;
    if (!debugMode) {
      while (true) {
        string line = pipeReader.ReadLine();
        string msg = (line != null ? line.Trim().ToLower() : "-ERROR-");
        if (msg == "end") {
          ClosePipe();
          break;
        }
        else if (msg == "close") {
          ClosePipe();
          OpenPipe();
        }
        else if (msg.StartsWith("name")) {
          var parts = msg.Split(DELIM);
          clientName = parts[1].Trim();
        }
        else {
          int? result = CallMethod(msg);
          WriteToPipe(result.Value.ToString());
          pipe.WaitForPipeDrain();
        }
      }
    }
    else {
      while (true) {
        string line = pipeReader.ReadLine();
        string msg = (line != null ? line.Trim().ToLower() : "-ERROR-");
        if (msg == "") {
          WriteInfoToStdout("Why are you sending me an empty string? This may be harmless but I'm just letting you know.");
        }
        else if (msg == "-ERROR-") {
          WriteWarningToStdout("Something unexpected happened. Did you close the client connection without telling me? Server will restart now.");
          ClosePipe();
          OpenPipe();
        }
        else if (msg == "end") {
          WriteInfoToStdout("I received the message to end");
          ClosePipe();
          break;
        }
        else if (msg == "close") {
          WriteInfoToStdout("I received the message to close");
          ClosePipe();
          OpenPipe();
        }
        else if (msg.StartsWith("name")) {
          var parts = msg.Split(DELIM);
          if (parts.Length != 2) {
            WriteWarningToStdout("I don't understand your name message. You sent me '" + msg + "'. The format should be 'name|C++' or 'name|Python'");
          }
          else {
            var nameValue = parts[1].Trim();
            if (nameValue.ToLower() != "c++" && nameValue.ToLower() != "python") {
              WriteWarningToStdout("I only speak with C++ or Python not '" + nameValue + "'.");
            }
            else {
              WriteInfoToStdout("Received name message from client. I'm talking with " + nameValue);
              clientName = nameValue;
            }
          }
        }
        else {
          if (string.IsNullOrEmpty(clientName)) {
            WriteWarningToStdout("You sent me '" + msg + "' but I need your name first. You should send either 'name|C++' or 'name|Python' before sending other messages.");
          }
          else {
            int? result = CallMethod(msg);
            if (result == null) {
              WriteWarningToStdout("I don't understand your message. You sent me '" + msg + "'. Double check for spelling mistakes like 'mult' instead of 'mul' and make sure you are sending two numbers.");
            }
            else {
              WriteInfoToStdout("I just sent you a response of '" + result + "'.");
              WriteToPipe(result.Value.ToString());
            }
            pipe.WaitForPipeDrain();
          }
        }
      }
    }
    WriteToStdout("Server closed");
  }
  private static void OpenPipe() {
    clientName = null;
    pipe = new NamedPipeServerStream(PIPE_NAME, PipeDirection.InOut, 1, PipeTransmissionMode.Byte);
    pipeReader = new StreamReader(pipe);
    WriteToStdout("Waiting for new client connection...");
    pipe.WaitForConnection();
    WriteToStdout("Connection found\n");
    pipeWriter = new StreamWriter(pipe);
  }
  private static void ClosePipe() {
    WriteToStdout("Connection closed");
    pipe.Dispose();
  }
  private static void WriteToPipe(string msg) {
    pipeWriter.Write(msg);
    pipeWriter.Write((char)0);
    pipeWriter.Flush();
  }
  private static void WriteToStdout(string msg) {
    Console.WriteLine("\u001b[31mC#: " + msg + "\u001b[0m");
  }
  private static void WriteInfoToStdout(string msg) {
    Console.WriteLine("\u001b[0mC#: " + msg + "\u001b[0m");
  }
  private static void WriteWarningToStdout(string msg) {
    Console.WriteLine("\u001b[33mC#: \n*WARNING* " + msg + "\n\u001b[0m");
  }
  private static int? CallMethod(string msg) {
    var parts = msg.Split(DELIM);
    if (!debugMode) {
      string methodName = parts[0].Trim();
      var methodInfo = methods.GetType().GetMethod(methodName, flags);
      int param1 = int.Parse(parts[1].Trim());
      int param2 = int.Parse(parts[2].Trim());
      var returned = methodInfo.Invoke(methods, new object[]{param1, param2});
      WriteToStdout(string.Format("Honoring request from {0} of {1}({2}, {3})... Sending response", clientName, methodName, param1, param2));
      return int.Parse(returned.ToString());
    }
    else {
      if (parts.Length != 3) {
        WriteWarningToStdout(string.Format("Tried to call method but incorrect format found\nYou sent: '{0}'\nCorrect examples include: 'add{1}1{1}2' and 'sub{1}341{1}56'\n", msg, DELIM));
        return null;
      }
      else {
        string methodName = parts[0].Trim();
        int param1;
        int param2;
        if (!int.TryParse(parts[1].Trim(), out param1)) {
          WriteWarningToStdout("Your first parameter '" + parts[1] + "' is not an integer");
          return null;
        }
        if (!int.TryParse(parts[2].Trim(), out param2)) {
          WriteWarningToStdout("Your second parameter '" + parts[2] + "' is not an integer");
          return null;
        }
        var methodInfo = methods.GetType().GetMethod(methodName, flags);
        if (methodInfo == null) {
          WriteWarningToStdout("I don't understand what method you want me to call.\nYou sent: '" + methodName + "'\nValid methods are 'add', 'sub', 'mul', or 'div' only\n");
          return null;
        }
        var returned = methodInfo.Invoke(methods, new object[]{param1, param2});
        WriteToStdout(string.Format("Honoring request from {0} of {1}({2}, {3})... Sending response", clientName, methodName, param1, param2));
        return int.Parse(returned.ToString());
      }
    }
  }
}

public class Methods {
  public int Add(int x, int y) { return x + y; }
  public int Mul(int x, int y) { return x * y; }
  public int Sub(int x, int y) { return x - y; }
  public int Div(int x, int y) { return x / y; }
}
