// Generated from C:/Users/kalim/IdeaProjects/MT3/src/mt4/grammar/GrammarForGrammar.g4 by ANTLR 4.13.1
package mt4.grammar;

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
public class GrammarForGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		REGEXP=1, INH=2, SYN=3, CODE=4, SEMICOLON=5, OR=6, EPS=7, RO_OB=8, RO_CB=9, 
		SQ_OB=10, SQ_CB=11, CU_OB=12, CU_CB=13, TR_OB=14, TR_CB=15, GRAMMAR=16, 
		T_NAME=17, NAME=18, WS=19;
	public static final int
		RULE_s = 0, RULE_rule = 1, RULE_inh = 2, RULE_syn = 3, RULE_ntRule = 4, 
		RULE_sequence = 5, RULE_subsequence = 6, RULE_eps = 7, RULE_code = 8, 
		RULE_name = 9, RULE_tRule = 10, RULE_grName = 11, RULE_regexp = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "rule", "inh", "syn", "ntRule", "sequence", "subsequence", "eps", 
			"code", "name", "tRule", "grName", "regexp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "';'", "'|'", "'@eps'", "'('", "')'", "'['", 
			"']'", "'{'", "'}'", "'<'", "'>'", "'grammar'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "REGEXP", "INH", "SYN", "CODE", "SEMICOLON", "OR", "EPS", "RO_OB", 
			"RO_CB", "SQ_OB", "SQ_CB", "CU_OB", "CU_CB", "TR_OB", "TR_CB", "GRAMMAR", 
			"T_NAME", "NAME", "WS"
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
	public String getGrammarFileName() { return "GrammarForGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarForGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SContext extends ParserRuleContext {
		public Grammar grammar;
		public GrNameContext grName;
		public GrNameContext grName() {
			return getRuleContext(GrNameContext.class,0);
		}
		public List<RuleContext> rule_() {
			return getRuleContexts(RuleContext.class);
		}
		public RuleContext rule_(int i) {
			return getRuleContext(RuleContext.class,i);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).exitS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarForGrammarVisitor ) return ((GrammarForGrammarVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);

		    Grammar grammar = new Grammar("", new ArrayList<>(), new ArrayList<>());
		    ((SContext)_localctx).grammar =  grammar;

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			((SContext)_localctx).grName = grName();
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_NAME || _la==NAME) {
				{
				{
				setState(27);
				rule_(grammar);
				}
				}
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 _localctx.grammar.name = ((SContext)_localctx).grName.n; 
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
	public static class RuleContext extends ParserRuleContext {
		public Grammar grammar;
		public NtRuleContext ntRule() {
			return getRuleContext(NtRuleContext.class,0);
		}
		public TRuleContext tRule() {
			return getRuleContext(TRuleContext.class,0);
		}
		public RuleContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public RuleContext(ParserRuleContext parent, int invokingState, Grammar grammar) {
			super(parent, invokingState);
			this.grammar = grammar;
		}
		@Override public int getRuleIndex() { return RULE_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).exitRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarForGrammarVisitor ) return ((GrammarForGrammarVisitor<? extends T>)visitor).visitRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleContext rule_(Grammar grammar) throws RecognitionException {
		RuleContext _localctx = new RuleContext(_ctx, getState(), grammar);
		enterRule(_localctx, 2, RULE_rule);
		try {
			setState(37);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				ntRule(grammar);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				tRule(grammar);
				}
				break;
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
	public static class InhContext extends ParserRuleContext {
		public TerminalNode INH() { return getToken(GrammarForGrammarParser.INH, 0); }
		public InhContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inh; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).enterInh(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).exitInh(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarForGrammarVisitor ) return ((GrammarForGrammarVisitor<? extends T>)visitor).visitInh(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InhContext inh() throws RecognitionException {
		InhContext _localctx = new InhContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_inh);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(INH);
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
	public static class SynContext extends ParserRuleContext {
		public TerminalNode SYN() { return getToken(GrammarForGrammarParser.SYN, 0); }
		public SynContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).enterSyn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).exitSyn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarForGrammarVisitor ) return ((GrammarForGrammarVisitor<? extends T>)visitor).visitSyn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynContext syn() throws RecognitionException {
		SynContext _localctx = new SynContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_syn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(SYN);
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
	public static class NtRuleContext extends ParserRuleContext {
		public Grammar grammar;
		public NameContext name;
		public InhContext inh;
		public SynContext syn;
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public InhContext inh() {
			return getRuleContext(InhContext.class,0);
		}
		public SynContext syn() {
			return getRuleContext(SynContext.class,0);
		}
		public TerminalNode CU_OB() { return getToken(GrammarForGrammarParser.CU_OB, 0); }
		public List<SequenceContext> sequence() {
			return getRuleContexts(SequenceContext.class);
		}
		public SequenceContext sequence(int i) {
			return getRuleContext(SequenceContext.class,i);
		}
		public TerminalNode CU_CB() { return getToken(GrammarForGrammarParser.CU_CB, 0); }
		public List<TerminalNode> OR() { return getTokens(GrammarForGrammarParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(GrammarForGrammarParser.OR, i);
		}
		public NtRuleContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public NtRuleContext(ParserRuleContext parent, int invokingState, Grammar grammar) {
			super(parent, invokingState);
			this.grammar = grammar;
		}
		@Override public int getRuleIndex() { return RULE_ntRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).enterNtRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).exitNtRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarForGrammarVisitor ) return ((GrammarForGrammarVisitor<? extends T>)visitor).visitNtRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NtRuleContext ntRule(Grammar grammar) throws RecognitionException {
		NtRuleContext _localctx = new NtRuleContext(_ctx, getState(), grammar);
		enterRule(_localctx, 8, RULE_ntRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			((NtRuleContext)_localctx).name = name();
			setState(44);
			((NtRuleContext)_localctx).inh = inh();
			setState(45);
			((NtRuleContext)_localctx).syn = syn();
			setState(46);
			match(CU_OB);
			setState(47);
			sequence(grammar, new RuleDeclaration((((NtRuleContext)_localctx).name!=null?_input.getText(((NtRuleContext)_localctx).name.start,((NtRuleContext)_localctx).name.stop):null), (((NtRuleContext)_localctx).inh!=null?_input.getText(((NtRuleContext)_localctx).inh.start,((NtRuleContext)_localctx).inh.stop):null), (((NtRuleContext)_localctx).syn!=null?_input.getText(((NtRuleContext)_localctx).syn.start,((NtRuleContext)_localctx).syn.stop):null)));
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(48);
				match(OR);
				setState(49);
				sequence(grammar, new RuleDeclaration((((NtRuleContext)_localctx).name!=null?_input.getText(((NtRuleContext)_localctx).name.start,((NtRuleContext)_localctx).name.stop):null), (((NtRuleContext)_localctx).inh!=null?_input.getText(((NtRuleContext)_localctx).inh.start,((NtRuleContext)_localctx).inh.stop):null), (((NtRuleContext)_localctx).syn!=null?_input.getText(((NtRuleContext)_localctx).syn.start,((NtRuleContext)_localctx).syn.stop):null)));
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
			match(CU_CB);
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
	public static class SequenceContext extends ParserRuleContext {
		public Grammar grammar;
		public RuleDeclaration decl;
		public SubsequenceContext subsequence;
		public CodeContext code;
		public List<SubsequenceContext> subsequence() {
			return getRuleContexts(SubsequenceContext.class);
		}
		public SubsequenceContext subsequence(int i) {
			return getRuleContext(SubsequenceContext.class,i);
		}
		public EpsContext eps() {
			return getRuleContext(EpsContext.class,0);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public SequenceContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SequenceContext(ParserRuleContext parent, int invokingState, Grammar grammar, RuleDeclaration decl) {
			super(parent, invokingState);
			this.grammar = grammar;
			this.decl = decl;
		}
		@Override public int getRuleIndex() { return RULE_sequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).enterSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).exitSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarForGrammarVisitor ) return ((GrammarForGrammarVisitor<? extends T>)visitor).visitSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequenceContext sequence(Grammar grammar,RuleDeclaration decl) throws RecognitionException {
		SequenceContext _localctx = new SequenceContext(_ctx, getState(), grammar, decl);
		enterRule(_localctx, 10, RULE_sequence);

		    List<Sequence> sequences = new ArrayList<>();

		int _la;
		try {
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_NAME:
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(60); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(57);
					((SequenceContext)_localctx).subsequence = subsequence();
					 sequences.add(((SequenceContext)_localctx).subsequence.seq); 
					}
					}
					setState(62); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T_NAME || _la==NAME );
				 _localctx.grammar.rules.add(new Rule(_localctx.decl, new RuleBody(sequences))); 
				}
				break;
			case EPS:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				eps();
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CODE) {
					{
					setState(67);
					((SequenceContext)_localctx).code = code();
					}
				}

				 _localctx.grammar.rules.add(new Rule(_localctx.decl, new RuleBody(List.of(new Sequence(List.of(), (((SequenceContext)_localctx).code!=null?_input.getText(((SequenceContext)_localctx).code.start,((SequenceContext)_localctx).code.stop):null)))))); 
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
	public static class SubsequenceContext extends ParserRuleContext {
		public Sequence seq;
		public NameContext name;
		public InhContext inh;
		public CodeContext code;
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<InhContext> inh() {
			return getRuleContexts(InhContext.class);
		}
		public InhContext inh(int i) {
			return getRuleContext(InhContext.class,i);
		}
		public SubsequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subsequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).enterSubsequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).exitSubsequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarForGrammarVisitor ) return ((GrammarForGrammarVisitor<? extends T>)visitor).visitSubsequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubsequenceContext subsequence() throws RecognitionException {
		SubsequenceContext _localctx = new SubsequenceContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_subsequence);

		    List<Element> elements = new ArrayList<>();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(74);
				((SubsequenceContext)_localctx).name = name();
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INH) {
					{
					setState(75);
					((SubsequenceContext)_localctx).inh = inh();
					}
				}

				 elements.add(new Element((((SubsequenceContext)_localctx).name!=null?_input.getText(((SubsequenceContext)_localctx).name.start,((SubsequenceContext)_localctx).name.stop):null), (((SubsequenceContext)_localctx).inh!=null?_input.getText(((SubsequenceContext)_localctx).inh.start,((SubsequenceContext)_localctx).inh.stop):null))); 
				}
				}
				setState(82); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_NAME || _la==NAME );
			setState(84);
			((SubsequenceContext)_localctx).code = code();
			 ((SubsequenceContext)_localctx).seq =  new Sequence(elements, (((SubsequenceContext)_localctx).code!=null?_input.getText(((SubsequenceContext)_localctx).code.start,((SubsequenceContext)_localctx).code.stop):null)); 
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
	public static class EpsContext extends ParserRuleContext {
		public TerminalNode EPS() { return getToken(GrammarForGrammarParser.EPS, 0); }
		public EpsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eps; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).enterEps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).exitEps(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarForGrammarVisitor ) return ((GrammarForGrammarVisitor<? extends T>)visitor).visitEps(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EpsContext eps() throws RecognitionException {
		EpsContext _localctx = new EpsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_eps);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(EPS);
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
	public static class CodeContext extends ParserRuleContext {
		public TerminalNode CODE() { return getToken(GrammarForGrammarParser.CODE, 0); }
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).exitCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarForGrammarVisitor ) return ((GrammarForGrammarVisitor<? extends T>)visitor).visitCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_code);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(CODE);
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
	public static class NameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(GrammarForGrammarParser.NAME, 0); }
		public TerminalNode T_NAME() { return getToken(GrammarForGrammarParser.T_NAME, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarForGrammarVisitor ) return ((GrammarForGrammarVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_la = _input.LA(1);
			if ( !(_la==T_NAME || _la==NAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class TRuleContext extends ParserRuleContext {
		public Grammar grammar;
		public NameContext name;
		public RegexpContext regexp;
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode CU_OB() { return getToken(GrammarForGrammarParser.CU_OB, 0); }
		public RegexpContext regexp() {
			return getRuleContext(RegexpContext.class,0);
		}
		public TerminalNode CU_CB() { return getToken(GrammarForGrammarParser.CU_CB, 0); }
		public TRuleContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TRuleContext(ParserRuleContext parent, int invokingState, Grammar grammar) {
			super(parent, invokingState);
			this.grammar = grammar;
		}
		@Override public int getRuleIndex() { return RULE_tRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).enterTRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).exitTRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarForGrammarVisitor ) return ((GrammarForGrammarVisitor<? extends T>)visitor).visitTRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TRuleContext tRule(Grammar grammar) throws RecognitionException {
		TRuleContext _localctx = new TRuleContext(_ctx, getState(), grammar);
		enterRule(_localctx, 20, RULE_tRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			((TRuleContext)_localctx).name = name();
			setState(94);
			match(CU_OB);
			setState(95);
			((TRuleContext)_localctx).regexp = regexp();
			setState(96);
			match(CU_CB);
			 _localctx.grammar.terminals.add(new Terminal((((TRuleContext)_localctx).name!=null?_input.getText(((TRuleContext)_localctx).name.start,((TRuleContext)_localctx).name.stop):null), (((TRuleContext)_localctx).regexp!=null?_input.getText(((TRuleContext)_localctx).regexp.start,((TRuleContext)_localctx).regexp.stop):null))); 
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
	public static class GrNameContext extends ParserRuleContext {
		public String n;
		public NameContext name;
		public TerminalNode GRAMMAR() { return getToken(GrammarForGrammarParser.GRAMMAR, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GrammarForGrammarParser.SEMICOLON, 0); }
		public GrNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).enterGrName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).exitGrName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarForGrammarVisitor ) return ((GrammarForGrammarVisitor<? extends T>)visitor).visitGrName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrNameContext grName() throws RecognitionException {
		GrNameContext _localctx = new GrNameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_grName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(GRAMMAR);
			setState(100);
			((GrNameContext)_localctx).name = name();
			setState(101);
			match(SEMICOLON);
			 ((GrNameContext)_localctx).n =  (((GrNameContext)_localctx).name!=null?_input.getText(((GrNameContext)_localctx).name.start,((GrNameContext)_localctx).name.stop):null); 
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
	public static class RegexpContext extends ParserRuleContext {
		public TerminalNode REGEXP() { return getToken(GrammarForGrammarParser.REGEXP, 0); }
		public RegexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).enterRegexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).exitRegexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarForGrammarVisitor ) return ((GrammarForGrammarVisitor<? extends T>)visitor).visitRegexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegexpContext regexp() throws RecognitionException {
		RegexpContext _localctx = new RegexpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_regexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(REGEXP);
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
		"\u0004\u0001\u0013k\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0001\u0000\u0005\u0000\u001d\b\u0000\n\u0000\f"+
		"\u0000 \t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003"+
		"\u0001&\b\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u00043\b\u0004\n\u0004\f\u00046\t\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005=\b\u0005\u000b"+
		"\u0005\f\u0005>\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005E\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005I\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0003\u0006M\b\u0006\u0001\u0006\u0001\u0006\u0004\u0006"+
		"Q\b\u0006\u000b\u0006\f\u0006R\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0000\u0000\r\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000\u0001\u0001\u0000\u0011"+
		"\u0012e\u0000\u001a\u0001\u0000\u0000\u0000\u0002%\u0001\u0000\u0000\u0000"+
		"\u0004\'\u0001\u0000\u0000\u0000\u0006)\u0001\u0000\u0000\u0000\b+\u0001"+
		"\u0000\u0000\u0000\nH\u0001\u0000\u0000\u0000\fP\u0001\u0000\u0000\u0000"+
		"\u000eW\u0001\u0000\u0000\u0000\u0010Y\u0001\u0000\u0000\u0000\u0012["+
		"\u0001\u0000\u0000\u0000\u0014]\u0001\u0000\u0000\u0000\u0016c\u0001\u0000"+
		"\u0000\u0000\u0018h\u0001\u0000\u0000\u0000\u001a\u001e\u0003\u0016\u000b"+
		"\u0000\u001b\u001d\u0003\u0002\u0001\u0000\u001c\u001b\u0001\u0000\u0000"+
		"\u0000\u001d \u0001\u0000\u0000\u0000\u001e\u001c\u0001\u0000\u0000\u0000"+
		"\u001e\u001f\u0001\u0000\u0000\u0000\u001f!\u0001\u0000\u0000\u0000 \u001e"+
		"\u0001\u0000\u0000\u0000!\"\u0006\u0000\uffff\uffff\u0000\"\u0001\u0001"+
		"\u0000\u0000\u0000#&\u0003\b\u0004\u0000$&\u0003\u0014\n\u0000%#\u0001"+
		"\u0000\u0000\u0000%$\u0001\u0000\u0000\u0000&\u0003\u0001\u0000\u0000"+
		"\u0000\'(\u0005\u0002\u0000\u0000(\u0005\u0001\u0000\u0000\u0000)*\u0005"+
		"\u0003\u0000\u0000*\u0007\u0001\u0000\u0000\u0000+,\u0003\u0012\t\u0000"+
		",-\u0003\u0004\u0002\u0000-.\u0003\u0006\u0003\u0000./\u0005\f\u0000\u0000"+
		"/4\u0003\n\u0005\u000001\u0005\u0006\u0000\u000013\u0003\n\u0005\u0000"+
		"20\u0001\u0000\u0000\u000036\u0001\u0000\u0000\u000042\u0001\u0000\u0000"+
		"\u000045\u0001\u0000\u0000\u000057\u0001\u0000\u0000\u000064\u0001\u0000"+
		"\u0000\u000078\u0005\r\u0000\u00008\t\u0001\u0000\u0000\u00009:\u0003"+
		"\f\u0006\u0000:;\u0006\u0005\uffff\uffff\u0000;=\u0001\u0000\u0000\u0000"+
		"<9\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000><\u0001\u0000\u0000"+
		"\u0000>?\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@A\u0006\u0005"+
		"\uffff\uffff\u0000AI\u0001\u0000\u0000\u0000BD\u0003\u000e\u0007\u0000"+
		"CE\u0003\u0010\b\u0000DC\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000"+
		"EF\u0001\u0000\u0000\u0000FG\u0006\u0005\uffff\uffff\u0000GI\u0001\u0000"+
		"\u0000\u0000H<\u0001\u0000\u0000\u0000HB\u0001\u0000\u0000\u0000I\u000b"+
		"\u0001\u0000\u0000\u0000JL\u0003\u0012\t\u0000KM\u0003\u0004\u0002\u0000"+
		"LK\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000"+
		"\u0000NO\u0006\u0006\uffff\uffff\u0000OQ\u0001\u0000\u0000\u0000PJ\u0001"+
		"\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000"+
		"RS\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TU\u0003\u0010\b\u0000"+
		"UV\u0006\u0006\uffff\uffff\u0000V\r\u0001\u0000\u0000\u0000WX\u0005\u0007"+
		"\u0000\u0000X\u000f\u0001\u0000\u0000\u0000YZ\u0005\u0004\u0000\u0000"+
		"Z\u0011\u0001\u0000\u0000\u0000[\\\u0007\u0000\u0000\u0000\\\u0013\u0001"+
		"\u0000\u0000\u0000]^\u0003\u0012\t\u0000^_\u0005\f\u0000\u0000_`\u0003"+
		"\u0018\f\u0000`a\u0005\r\u0000\u0000ab\u0006\n\uffff\uffff\u0000b\u0015"+
		"\u0001\u0000\u0000\u0000cd\u0005\u0010\u0000\u0000de\u0003\u0012\t\u0000"+
		"ef\u0005\u0005\u0000\u0000fg\u0006\u000b\uffff\uffff\u0000g\u0017\u0001"+
		"\u0000\u0000\u0000hi\u0005\u0001\u0000\u0000i\u0019\u0001\u0000\u0000"+
		"\u0000\b\u001e%4>DHLR";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}