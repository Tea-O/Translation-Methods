// Generated from C:/Users/kalim/IdeaProjects/MT3/src/lab3.g4 by ANTLR 4.13.1

import java.util.stream.IntStream;
import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link lab3Parser}.
 */
public interface lab3Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link lab3Parser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(lab3Parser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab3Parser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(lab3Parser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab3Parser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(lab3Parser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab3Parser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(lab3Parser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(lab3Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(lab3Parser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab3Parser#addSub}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(lab3Parser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab3Parser#addSub}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(lab3Parser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab3Parser#mulDivTerm}.
	 * @param ctx the parse tree
	 */
	void enterMulDivTerm(lab3Parser.MulDivTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab3Parser#mulDivTerm}.
	 * @param ctx the parse tree
	 */
	void exitMulDivTerm(lab3Parser.MulDivTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab3Parser#mulDiv}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(lab3Parser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab3Parser#mulDiv}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(lab3Parser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab3Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(lab3Parser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab3Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(lab3Parser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab3Parser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(lab3Parser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab3Parser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(lab3Parser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab3Parser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(lab3Parser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab3Parser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(lab3Parser.NumberContext ctx);
}