import org.antlr4.v4.runtime.*;

public class Main{
    public static void main (String[] args){
        String input = args[0];
        var charStream = CharStreams.fromString(input);
        var lexer = new FuncModsGrammarLexer(charStream);

        var tokenStream = new CommonTokenStream(lexer);
        var parser = new FuncModsGrammarParser(tokenStream);

        parser.program();
    }
}
//type this into command line every time you use command line \|/
//export CLASSPATH='.;antlr.jar'