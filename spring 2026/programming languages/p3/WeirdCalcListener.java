// Generated from WeirdCalc.g4 by ANTLR 4.9.2

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link WeirdCalcParser}.
 */
public interface WeirdCalcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link WeirdCalcParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(WeirdCalcParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link WeirdCalcParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(WeirdCalcParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link WeirdCalcParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(WeirdCalcParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link WeirdCalcParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(WeirdCalcParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link WeirdCalcParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(WeirdCalcParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link WeirdCalcParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(WeirdCalcParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link WeirdCalcParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(WeirdCalcParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link WeirdCalcParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(WeirdCalcParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link WeirdCalcParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(WeirdCalcParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link WeirdCalcParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(WeirdCalcParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link WeirdCalcParser#item}.
	 * @param ctx the parse tree
	 */
	void enterItem(WeirdCalcParser.ItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link WeirdCalcParser#item}.
	 * @param ctx the parse tree
	 */
	void exitItem(WeirdCalcParser.ItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link WeirdCalcParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(WeirdCalcParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link WeirdCalcParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(WeirdCalcParser.OperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link WeirdCalcParser#data}.
	 * @param ctx the parse tree
	 */
	void enterData(WeirdCalcParser.DataContext ctx);
	/**
	 * Exit a parse tree produced by {@link WeirdCalcParser#data}.
	 * @param ctx the parse tree
	 */
	void exitData(WeirdCalcParser.DataContext ctx);
	/**
	 * Enter a parse tree produced by {@link WeirdCalcParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(WeirdCalcParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link WeirdCalcParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(WeirdCalcParser.NumberContext ctx);
}