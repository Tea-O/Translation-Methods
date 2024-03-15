// Generated from C:/Users/kalim/IdeaProjects/MT3/src/lab3.g4 by ANTLR 4.13.1

import java.util.stream.IntStream;
import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class lab3Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, VAR=5, NUM=6, ASSIGN=7, SEMICOLON=8, ADD=9, 
		SUB=10, MUL=11, DIV=12, COMMA=13, WS=14;
	public static final int
		RULE_start = 0, RULE_assign = 1, RULE_expr = 2, RULE_addSub = 3, RULE_mulDivTerm = 4, 
		RULE_mulDiv = 5, RULE_term = 6, RULE_variable = 7, RULE_number = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "assign", "expr", "addSub", "mulDivTerm", "mulDiv", "term", 
			"variable", "number"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'['", "']'", null, null, "'='", "';'", "'+'", "'-'", 
			"'*'", "'/'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "VAR", "NUM", "ASSIGN", "SEMICOLON", "ADD", 
			"SUB", "MUL", "DIV", "COMMA", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "lab3.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public lab3Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public StringBuilder res;
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lab3Listener ) ((lab3Listener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lab3Listener ) ((lab3Listener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab3Visitor ) return ((lab3Visitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);

		    Map<String, Integer> vars = new HashMap<>();
		    StringBuilder res = new StringBuilder();
		    ((StartContext)_localctx).res =  res;

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(18);
				assign(vars, res);
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends ParserRuleContext {
		public Map<String, Integer> vars;
		public StringBuilder res;
		public VariableContext variable;
		public ExprContext expr;
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(lab3Parser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(lab3Parser.SEMICOLON, 0); }
		public AssignContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public AssignContext(ParserRuleContext parent, int invokingState, Map<String, Integer> vars, StringBuilder res) {
			super(parent, invokingState);
			this.vars = vars;
			this.res = res;
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lab3Listener ) ((lab3Listener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lab3Listener ) ((lab3Listener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab3Visitor ) return ((lab3Visitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign(Map<String, Integer> vars,StringBuilder res) throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState(), vars, res);
		enterRule(_localctx, 2, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			((AssignContext)_localctx).variable = variable();
			setState(25);
			match(ASSIGN);
			setState(26);
			((AssignContext)_localctx).expr = expr(vars);
			setState(27);
			match(SEMICOLON);

			        _localctx.vars.put((((AssignContext)_localctx).variable!=null?_input.getText(((AssignContext)_localctx).variable.start,((AssignContext)_localctx).variable.stop):null), ((AssignContext)_localctx).expr.val);
			        _localctx.res.append((((AssignContext)_localctx).variable!=null?_input.getText(((AssignContext)_localctx).variable.start,((AssignContext)_localctx).variable.stop):null) + "=" + ((AssignContext)_localctx).expr.val + ";\n");
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public Map<String, Integer> vars;
		public int val;
		public MulDivTermContext mulDivTerm;
		public AddSubContext addSub;
		public MulDivTermContext mulDivTerm() {
			return getRuleContext(MulDivTermContext.class,0);
		}
		public AddSubContext addSub() {
			return getRuleContext(AddSubContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExprContext(ParserRuleContext parent, int invokingState, Map<String, Integer> vars) {
			super(parent, invokingState);
			this.vars = vars;
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lab3Listener ) ((lab3Listener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lab3Listener ) ((lab3Listener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab3Visitor ) return ((lab3Visitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr(Map<String, Integer> vars) throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState(), vars);
		enterRule(_localctx, 4, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			((ExprContext)_localctx).mulDivTerm = mulDivTerm(vars);
			 int mulDivTermResult = ((ExprContext)_localctx).mulDivTerm.val; 
			setState(32);
			((ExprContext)_localctx).addSub = addSub(vars, mulDivTermResult);
			 ((ExprContext)_localctx).val =  ((ExprContext)_localctx).addSub.val; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AddSubContext extends ParserRuleContext {
		public Map<String, Integer> vars;
		public int acc;
		public int val;
		public Token op;
		public MulDivTermContext mulDivTerm;
		public AddSubContext addSub;
		public AddSubContext addSub() {
			return getRuleContext(AddSubContext.class,0);
		}
		public MulDivTermContext mulDivTerm() {
			return getRuleContext(MulDivTermContext.class,0);
		}
		public TerminalNode ADD() { return getToken(lab3Parser.ADD, 0); }
		public TerminalNode SUB() { return getToken(lab3Parser.SUB, 0); }
		public AddSubContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public AddSubContext(ParserRuleContext parent, int invokingState, Map<String, Integer> vars, int acc) {
			super(parent, invokingState);
			this.vars = vars;
			this.acc = acc;
		}
		@Override public int getRuleIndex() { return RULE_addSub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lab3Listener ) ((lab3Listener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lab3Listener ) ((lab3Listener)listener).exitAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab3Visitor ) return ((lab3Visitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddSubContext addSub(Map<String, Integer> vars,int acc) throws RecognitionException {
		AddSubContext _localctx = new AddSubContext(_ctx, getState(), vars, acc);
		enterRule(_localctx, 6, RULE_addSub);
		int _la;
		try {
			setState(43);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case SUB:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(35);
				((AddSubContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
					((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(36);
				((AddSubContext)_localctx).mulDivTerm = mulDivTerm(vars);
				 acc = (((AddSubContext)_localctx).op.getType() == ADD) ?
				    acc + ((AddSubContext)_localctx).mulDivTerm.val : acc - ((AddSubContext)_localctx).mulDivTerm.val; 
				}
				setState(39);
				((AddSubContext)_localctx).addSub = addSub(vars, acc);
				 ((AddSubContext)_localctx).val =  ((AddSubContext)_localctx).addSub.val; 
				}
				break;
			case T__1:
			case T__3:
			case SEMICOLON:
			case COMMA:
				enterOuterAlt(_localctx, 2);
				{
				 ((AddSubContext)_localctx).val =  acc; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MulDivTermContext extends ParserRuleContext {
		public Map <String, Integer> vars;
		public int val;
		public TermContext term;
		public MulDivContext mulDiv;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public MulDivContext mulDiv() {
			return getRuleContext(MulDivContext.class,0);
		}
		public MulDivTermContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MulDivTermContext(ParserRuleContext parent, int invokingState, Map <String, Integer> vars) {
			super(parent, invokingState);
			this.vars = vars;
		}
		@Override public int getRuleIndex() { return RULE_mulDivTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lab3Listener ) ((lab3Listener)listener).enterMulDivTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lab3Listener ) ((lab3Listener)listener).exitMulDivTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab3Visitor ) return ((lab3Visitor<? extends T>)visitor).visitMulDivTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulDivTermContext mulDivTerm(Map <String, Integer> vars) throws RecognitionException {
		MulDivTermContext _localctx = new MulDivTermContext(_ctx, getState(), vars);
		enterRule(_localctx, 8, RULE_mulDivTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			((MulDivTermContext)_localctx).term = term(vars);
			 int termResult = ((MulDivTermContext)_localctx).term.val; 
			setState(47);
			((MulDivTermContext)_localctx).mulDiv = mulDiv(vars, termResult);
			 ((MulDivTermContext)_localctx).val =  ((MulDivTermContext)_localctx).mulDiv.val; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MulDivContext extends ParserRuleContext {
		public Map <String, Integer> vars;
		public int acc;
		public int val;
		public Token op;
		public TermContext term;
		public MulDivContext mulDiv;
		public MulDivContext mulDiv() {
			return getRuleContext(MulDivContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode MUL() { return getToken(lab3Parser.MUL, 0); }
		public TerminalNode DIV() { return getToken(lab3Parser.DIV, 0); }
		public MulDivContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MulDivContext(ParserRuleContext parent, int invokingState, Map <String, Integer> vars, int acc) {
			super(parent, invokingState);
			this.vars = vars;
			this.acc = acc;
		}
		@Override public int getRuleIndex() { return RULE_mulDiv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lab3Listener ) ((lab3Listener)listener).enterMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lab3Listener ) ((lab3Listener)listener).exitMulDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab3Visitor ) return ((lab3Visitor<? extends T>)visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulDivContext mulDiv(Map <String, Integer> vars,int acc) throws RecognitionException {
		MulDivContext _localctx = new MulDivContext(_ctx, getState(), vars, acc);
		enterRule(_localctx, 10, RULE_mulDiv);
		int _la;
		try {
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MUL:
			case DIV:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(50);
				((MulDivContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==MUL || _la==DIV) ) {
					((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(51);
				((MulDivContext)_localctx).term = term(vars);
				acc = (((MulDivContext)_localctx).op.getType() == MUL) ?
				    acc * ((MulDivContext)_localctx).term.val : acc / ((MulDivContext)_localctx).term.val; 
				}
				setState(54);
				((MulDivContext)_localctx).mulDiv = mulDiv(vars, acc);
				((MulDivContext)_localctx).val =  ((MulDivContext)_localctx).mulDiv.val;
				}
				break;
			case T__1:
			case T__3:
			case SEMICOLON:
			case ADD:
			case SUB:
			case COMMA:
				enterOuterAlt(_localctx, 2);
				{
				((MulDivContext)_localctx).val =  acc;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public Map <String, Integer> vars;
		public int val;
		public ExprContext expr;
		public NumberContext number;
		public VariableContext variable;
		public ExprContext n;
		public ExprContext k;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(lab3Parser.COMMA, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TermContext(ParserRuleContext parent, int invokingState, Map <String, Integer> vars) {
			super(parent, invokingState);
			this.vars = vars;
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lab3Listener ) ((lab3Listener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lab3Listener ) ((lab3Listener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab3Visitor ) return ((lab3Visitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term(Map <String, Integer> vars) throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState(), vars);
		enterRule(_localctx, 12, RULE_term);
		try {
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				match(T__0);
				setState(61);
				((TermContext)_localctx).expr = expr(vars);
				setState(62);
				match(T__1);
				 ((TermContext)_localctx).val =  ((TermContext)_localctx).expr.val; 
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				((TermContext)_localctx).number = number();
				 ((TermContext)_localctx).val =  Integer.parseInt((((TermContext)_localctx).number!=null?_input.getText(((TermContext)_localctx).number.start,((TermContext)_localctx).number.stop):null)); 
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				((TermContext)_localctx).variable = variable();

				        Integer varValue = _localctx.vars.get((((TermContext)_localctx).variable!=null?_input.getText(((TermContext)_localctx).variable.start,((TermContext)_localctx).variable.stop):null));
				        ((TermContext)_localctx).val =  (varValue == null) ? 0 : varValue;
				    
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 4);
				{
				setState(71);
				match(T__2);
				setState(72);
				((TermContext)_localctx).n = expr(_localctx.vars);
				setState(73);
				match(COMMA);
				setState(74);
				((TermContext)_localctx).k = expr(_localctx.vars);
				setState(75);
				match(T__3);

				        // Вычисление биномиального коэффициента: n! / (k! * (n-k)!)
				        int nkValue = ((TermContext)_localctx).n.val- ((TermContext)_localctx).k.val;
				        int nFactorial = IntStream.rangeClosed(2, ((TermContext)_localctx).n.val).reduce(1, (x, y) -> x * y);
				        int kFactorial = IntStream.rangeClosed(2, ((TermContext)_localctx).k.val).reduce(1, (x, y) -> x * y);
				        int nkFactorial = IntStream.rangeClosed(2, nkValue).reduce(1, (x, y) -> x * y);
				        ((TermContext)_localctx).val =  nFactorial / (kFactorial * nkFactorial);
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(lab3Parser.VAR, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lab3Listener ) ((lab3Listener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lab3Listener ) ((lab3Listener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab3Visitor ) return ((lab3Visitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(VAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(lab3Parser.NUM, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lab3Listener ) ((lab3Listener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lab3Listener ) ((lab3Listener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lab3Visitor ) return ((lab3Visitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u000eU\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0005\u0000\u0014\b\u0000\n\u0000\f\u0000\u0017"+
		"\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003,\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005;\b"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006O\b\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0000\u0000\t\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0000\u0002"+
		"\u0001\u0000\t\n\u0001\u0000\u000b\fQ\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0002\u0018\u0001\u0000\u0000\u0000\u0004\u001e\u0001\u0000\u0000\u0000"+
		"\u0006+\u0001\u0000\u0000\u0000\b-\u0001\u0000\u0000\u0000\n:\u0001\u0000"+
		"\u0000\u0000\fN\u0001\u0000\u0000\u0000\u000eP\u0001\u0000\u0000\u0000"+
		"\u0010R\u0001\u0000\u0000\u0000\u0012\u0014\u0003\u0002\u0001\u0000\u0013"+
		"\u0012\u0001\u0000\u0000\u0000\u0014\u0017\u0001\u0000\u0000\u0000\u0015"+
		"\u0013\u0001\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016"+
		"\u0001\u0001\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0018"+
		"\u0019\u0003\u000e\u0007\u0000\u0019\u001a\u0005\u0007\u0000\u0000\u001a"+
		"\u001b\u0003\u0004\u0002\u0000\u001b\u001c\u0005\b\u0000\u0000\u001c\u001d"+
		"\u0006\u0001\uffff\uffff\u0000\u001d\u0003\u0001\u0000\u0000\u0000\u001e"+
		"\u001f\u0003\b\u0004\u0000\u001f \u0006\u0002\uffff\uffff\u0000 !\u0003"+
		"\u0006\u0003\u0000!\"\u0006\u0002\uffff\uffff\u0000\"\u0005\u0001\u0000"+
		"\u0000\u0000#$\u0007\u0000\u0000\u0000$%\u0003\b\u0004\u0000%&\u0006\u0003"+
		"\uffff\uffff\u0000&\'\u0001\u0000\u0000\u0000\'(\u0003\u0006\u0003\u0000"+
		"()\u0006\u0003\uffff\uffff\u0000),\u0001\u0000\u0000\u0000*,\u0006\u0003"+
		"\uffff\uffff\u0000+#\u0001\u0000\u0000\u0000+*\u0001\u0000\u0000\u0000"+
		",\u0007\u0001\u0000\u0000\u0000-.\u0003\f\u0006\u0000./\u0006\u0004\uffff"+
		"\uffff\u0000/0\u0003\n\u0005\u000001\u0006\u0004\uffff\uffff\u00001\t"+
		"\u0001\u0000\u0000\u000023\u0007\u0001\u0000\u000034\u0003\f\u0006\u0000"+
		"45\u0006\u0005\uffff\uffff\u000056\u0001\u0000\u0000\u000067\u0003\n\u0005"+
		"\u000078\u0006\u0005\uffff\uffff\u00008;\u0001\u0000\u0000\u00009;\u0006"+
		"\u0005\uffff\uffff\u0000:2\u0001\u0000\u0000\u0000:9\u0001\u0000\u0000"+
		"\u0000;\u000b\u0001\u0000\u0000\u0000<=\u0005\u0001\u0000\u0000=>\u0003"+
		"\u0004\u0002\u0000>?\u0005\u0002\u0000\u0000?@\u0006\u0006\uffff\uffff"+
		"\u0000@O\u0001\u0000\u0000\u0000AB\u0003\u0010\b\u0000BC\u0006\u0006\uffff"+
		"\uffff\u0000CO\u0001\u0000\u0000\u0000DE\u0003\u000e\u0007\u0000EF\u0006"+
		"\u0006\uffff\uffff\u0000FO\u0001\u0000\u0000\u0000GH\u0005\u0003\u0000"+
		"\u0000HI\u0003\u0004\u0002\u0000IJ\u0005\r\u0000\u0000JK\u0003\u0004\u0002"+
		"\u0000KL\u0005\u0004\u0000\u0000LM\u0006\u0006\uffff\uffff\u0000MO\u0001"+
		"\u0000\u0000\u0000N<\u0001\u0000\u0000\u0000NA\u0001\u0000\u0000\u0000"+
		"ND\u0001\u0000\u0000\u0000NG\u0001\u0000\u0000\u0000O\r\u0001\u0000\u0000"+
		"\u0000PQ\u0005\u0005\u0000\u0000Q\u000f\u0001\u0000\u0000\u0000RS\u0005"+
		"\u0006\u0000\u0000S\u0011\u0001\u0000\u0000\u0000\u0004\u0015+:N";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}