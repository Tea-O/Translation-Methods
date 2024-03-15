// Generated from C:/Users/kalim/IdeaProjects/MT3/src/mt4/grammar/GrammarForGrammar.g4 by ANTLR 4.13.1
package mt4.grammar;

import java.util.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class GrammarForGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		REGEXP=1, INH=2, SYN=3, CODE=4, SEMICOLON=5, OR=6, EPS=7, RO_OB=8, RO_CB=9, 
		SQ_OB=10, SQ_CB=11, CU_OB=12, CU_CB=13, TR_OB=14, TR_CB=15, GRAMMAR=16, 
		T_NAME=17, NAME=18, WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"REGEXP", "INH", "SYN", "CODE", "SEMICOLON", "OR", "EPS", "RO_OB", "RO_CB", 
			"SQ_OB", "SQ_CB", "CU_OB", "CU_CB", "TR_OB", "TR_CB", "GRAMMAR", "T_NAME", 
			"NAME", "WS"
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


	public GrammarForGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GrammarForGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0013\u0083\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0005\u0000*\b\u0000"+
		"\n\u0000\f\u0000-\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0005\u00013\b\u0001\n\u0001\f\u00016\t\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0005\u0002<\b\u0002\n\u0002\f\u0002?\t\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0005\u0003E\b\u0003"+
		"\n\u0003\f\u0003H\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0004\u0010n\b"+
		"\u0010\u000b\u0010\f\u0010o\u0001\u0011\u0004\u0011s\b\u0011\u000b\u0011"+
		"\f\u0011t\u0001\u0011\u0005\u0011x\b\u0011\n\u0011\f\u0011{\t\u0011\u0001"+
		"\u0012\u0004\u0012~\b\u0012\u000b\u0012\f\u0012\u007f\u0001\u0012\u0001"+
		"\u0012\u0004+4=F\u0000\u0013\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013"+
		"\u0001\u0000\u0003\u0001\u0000AZ\u0001\u0000az\u0003\u0000\t\n\r\r  \u008a"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0001\'\u0001\u0000\u0000\u0000\u00030\u0001\u0000\u0000\u0000"+
		"\u00059\u0001\u0000\u0000\u0000\u0007B\u0001\u0000\u0000\u0000\tK\u0001"+
		"\u0000\u0000\u0000\u000bM\u0001\u0000\u0000\u0000\rO\u0001\u0000\u0000"+
		"\u0000\u000fT\u0001\u0000\u0000\u0000\u0011V\u0001\u0000\u0000\u0000\u0013"+
		"X\u0001\u0000\u0000\u0000\u0015Z\u0001\u0000\u0000\u0000\u0017\\\u0001"+
		"\u0000\u0000\u0000\u0019^\u0001\u0000\u0000\u0000\u001b`\u0001\u0000\u0000"+
		"\u0000\u001db\u0001\u0000\u0000\u0000\u001fd\u0001\u0000\u0000\u0000!"+
		"m\u0001\u0000\u0000\u0000#r\u0001\u0000\u0000\u0000%}\u0001\u0000\u0000"+
		"\u0000\'+\u0005\"\u0000\u0000(*\t\u0000\u0000\u0000)(\u0001\u0000\u0000"+
		"\u0000*-\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000+)\u0001\u0000"+
		"\u0000\u0000,.\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000./\u0005"+
		"\"\u0000\u0000/\u0002\u0001\u0000\u0000\u000004\u0003\u000f\u0007\u0000"+
		"13\t\u0000\u0000\u000021\u0001\u0000\u0000\u000036\u0001\u0000\u0000\u0000"+
		"45\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u000057\u0001\u0000\u0000"+
		"\u000064\u0001\u0000\u0000\u000078\u0003\u0011\b\u00008\u0004\u0001\u0000"+
		"\u0000\u00009=\u0003\u0013\t\u0000:<\t\u0000\u0000\u0000;:\u0001\u0000"+
		"\u0000\u0000<?\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000=;\u0001"+
		"\u0000\u0000\u0000>@\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000"+
		"@A\u0003\u0015\n\u0000A\u0006\u0001\u0000\u0000\u0000BF\u0003\u001b\r"+
		"\u0000CE\t\u0000\u0000\u0000DC\u0001\u0000\u0000\u0000EH\u0001\u0000\u0000"+
		"\u0000FG\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000GI\u0001\u0000"+
		"\u0000\u0000HF\u0001\u0000\u0000\u0000IJ\u0003\u001d\u000e\u0000J\b\u0001"+
		"\u0000\u0000\u0000KL\u0005;\u0000\u0000L\n\u0001\u0000\u0000\u0000MN\u0005"+
		"|\u0000\u0000N\f\u0001\u0000\u0000\u0000OP\u0005@\u0000\u0000PQ\u0005"+
		"e\u0000\u0000QR\u0005p\u0000\u0000RS\u0005s\u0000\u0000S\u000e\u0001\u0000"+
		"\u0000\u0000TU\u0005(\u0000\u0000U\u0010\u0001\u0000\u0000\u0000VW\u0005"+
		")\u0000\u0000W\u0012\u0001\u0000\u0000\u0000XY\u0005[\u0000\u0000Y\u0014"+
		"\u0001\u0000\u0000\u0000Z[\u0005]\u0000\u0000[\u0016\u0001\u0000\u0000"+
		"\u0000\\]\u0005{\u0000\u0000]\u0018\u0001\u0000\u0000\u0000^_\u0005}\u0000"+
		"\u0000_\u001a\u0001\u0000\u0000\u0000`a\u0005<\u0000\u0000a\u001c\u0001"+
		"\u0000\u0000\u0000bc\u0005>\u0000\u0000c\u001e\u0001\u0000\u0000\u0000"+
		"de\u0005g\u0000\u0000ef\u0005r\u0000\u0000fg\u0005a\u0000\u0000gh\u0005"+
		"m\u0000\u0000hi\u0005m\u0000\u0000ij\u0005a\u0000\u0000jk\u0005r\u0000"+
		"\u0000k \u0001\u0000\u0000\u0000ln\u0007\u0000\u0000\u0000ml\u0001\u0000"+
		"\u0000\u0000no\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001"+
		"\u0000\u0000\u0000p\"\u0001\u0000\u0000\u0000qs\u0007\u0001\u0000\u0000"+
		"rq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000"+
		"\u0000tu\u0001\u0000\u0000\u0000uy\u0001\u0000\u0000\u0000vx\u0007\u0000"+
		"\u0000\u0000wv\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000yw\u0001"+
		"\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z$\u0001\u0000\u0000\u0000"+
		"{y\u0001\u0000\u0000\u0000|~\u0007\u0002\u0000\u0000}|\u0001\u0000\u0000"+
		"\u0000~\u007f\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081"+
		"\u0082\u0006\u0012\u0000\u0000\u0082&\u0001\u0000\u0000\u0000\t\u0000"+
		"+4=Foty\u007f\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}