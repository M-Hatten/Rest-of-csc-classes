###########################################
# Milo Hatten
# 4,1,2026
# Program 2 - Python

import os
import time
import sys

#Pretty colors 0.0
GREEN = "\033[32m"
RESET = "\033[0m"
CYAN = "\033[36m"
PURPLE = "\033[35m"

# Named pipe file paths
OUT = "/tmp/multi-lang-assignment-client2server"
IN = "/tmp/multi-lang-assignment-server2client"


def write(message):
    # Write a message to the server pipe
    try:
        # open pipe in write mode
        with open(OUT, 'w') as pipeWriter:  
            # writes message    
            pipeWriter.write(message) 
            # forces buffered data to be written to pipe          
            pipeWriter.flush()                 
    except Exception as e:                  
        print(f"Error writing message: {e}")  
    time.sleep(0.1)


def read():
    timeout=2
    # read a message from the pipe man
    timer = time.time() 
    while time.time() - timer < timeout:        
        try:
            with open(IN, 'r') as pipeReader:   # Open pipe in read mode
                os.set_blocking(pipeReader.fileno(), False)
                output = pipeReader.readline()
                if output:
                    return output.strip()    
        except Exception:
            pass               
        time.sleep(0.1)
    return output.strip()    

def main():
    name = "name|Python\n"
    write(name)

    #heehee silly numbers
    ops = [
        ("add", 420, 69),
        ("mul", 67, 42),
        ("sub", 42, 420),
        ("div", 420, 67)
    ]

    for op, arg1, arg2 in ops:
        request = f"{op}({arg1}, {arg2})\n"    
        command = f"{op}|{arg1}|{arg2}\n"   

        write(command)
        response = read()
        if response:
            print(f"{PURPLE}Python: receiving response from C#, {request.strip()} = {response}{RESET}\n")
        else:
            print(f"{PURPLE}No response for {command.strip()}{RESET}")
    
    # If run with end argument, shut ts down
    if len(sys.argv) > 1 and sys.argv[1].lower() == "end":  
        endIt = "end\n"
        write(endIt)
        sys.exit(0)     # exit calmly

    # Tell the server we're closing the session.
    closeIt = "close\n"
    write(closeIt)

if __name__ == "__main__":
    main()
else:
    print("Uh oh we had a problem")
