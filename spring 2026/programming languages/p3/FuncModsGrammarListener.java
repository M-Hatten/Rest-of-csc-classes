// Generated from FuncModsGrammar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FuncModsGrammarParser}.
 */
public interface FuncModsGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FuncModsGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(FuncModsGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuncModsGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(FuncModsGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuncModsGrammarParser#func_mods}.
	 * @param ctx the parse tree
	 */
	void enterFunc_mods(FuncModsGrammarParser.Func_modsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuncModsGrammarParser#func_mods}.
	 * @param ctx the parse tree
	 */
	void exitFunc_mods(FuncModsGrammarParser.Func_modsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuncModsGrammarParser#access_mod}.
	 * @param ctx the parse tree
	 */
	void enterAccess_mod(FuncModsGrammarParser.Access_modContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuncModsGrammarParser#access_mod}.
	 * @param ctx the parse tree
	 */
	void exitAccess_mod(FuncModsGrammarParser.Access_modContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuncModsGrammarParser#static}.
	 * @param ctx the parse tree
	 */
	void enterStatic(FuncModsGrammarParser.StaticContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuncModsGrammarParser#static}.
	 * @param ctx the parse tree
	 */
	void exitStatic(FuncModsGrammarParser.StaticContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuncModsGrammarParser#final}.
	 * @param ctx the parse tree
	 */
	void enterFinal(FuncModsGrammarParser.FinalContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuncModsGrammarParser#final}.
	 * @param ctx the parse tree
	 */
	void exitFinal(FuncModsGrammarParser.FinalContext ctx);
}