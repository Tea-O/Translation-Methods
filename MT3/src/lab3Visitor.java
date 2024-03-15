// Generated from C:/Users/kalim/IdeaProjects/MT3/src/lab3.g4 by ANTLR 4.13.1

import java.util.stream.IntStream;
import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link lab3Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface lab3Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link lab3Parser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(lab3Parser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab3Parser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(lab3Parser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab3Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(lab3Parser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab3Parser#addSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(lab3Parser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab3Parser#mulDivTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivTerm(lab3Parser.MulDivTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab3Parser#mulDiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(lab3Parser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab3Parser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(lab3Parser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab3Parser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(lab3Parser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link lab3Parser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(lab3Parser.NumberContext ctx);
}