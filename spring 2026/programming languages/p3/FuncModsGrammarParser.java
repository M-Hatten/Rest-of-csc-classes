// Generated from FuncModsGrammar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class FuncModsGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PUBLIC=1, PRIVATE=2, PROTECTED=3, STATIC=4, FINAL=5;
	public static final int
		RULE_program = 0, RULE_func_mods = 1, RULE_access_mod = 2, RULE_static = 3, 
		RULE_final = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "func_mods", "access_mod", "static", "final"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'public'", "'private'", "'protected'", "'static'", "'final'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PUBLIC", "PRIVATE", "PROTECTED", "STATIC", "FINAL"
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
	public String getGrammarFileName() { return "FuncModsGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FuncModsGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public Func_modsContext func_mods() {
			return getRuleContext(Func_modsContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuncModsGrammarListener ) ((FuncModsGrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuncModsGrammarListener ) ((FuncModsGrammarListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			func_mods();
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
	public static class Func_modsContext extends ParserRuleContext {
		public Access_modContext access_mod() {
			return getRuleContext(Access_modContext.class,0);
		}
		public StaticContext static_() {
			return getRuleContext(StaticContext.class,0);
		}
		public FinalContext final_() {
			return getRuleContext(FinalContext.class,0);
		}
		public Func_modsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_mods; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuncModsGrammarListener ) ((FuncModsGrammarListener)listener).enterFunc_mods(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuncModsGrammarListener ) ((FuncModsGrammarListener)listener).exitFunc_mods(this);
		}
	}

	public final Func_modsContext func_mods() throws RecognitionException {
		Func_modsContext _localctx = new Func_modsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_func_mods);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			access_mod();
			setState(13);
			static_();
			setState(14);
			final_();
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
	public static class Access_modContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(FuncModsGrammarParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(FuncModsGrammarParser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(FuncModsGrammarParser.PROTECTED, 0); }
		public Access_modContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access_mod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuncModsGrammarListener ) ((FuncModsGrammarListener)listener).enterAccess_mod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuncModsGrammarListener ) ((FuncModsGrammarListener)listener).exitAccess_mod(this);
		}
	}

	public final Access_modContext access_mod() throws RecognitionException {
		Access_modContext _localctx = new Access_modContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_access_mod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 14L) != 0)) ) {
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
	public static class StaticContext extends ParserRuleContext {
		public TerminalNode STATIC() { return getToken(FuncModsGrammarParser.STATIC, 0); }
		public StaticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_static; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuncModsGrammarListener ) ((FuncModsGrammarListener)listener).enterStatic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuncModsGrammarListener ) ((FuncModsGrammarListener)listener).exitStatic(this);
		}
	}

	public final StaticContext static_() throws RecognitionException {
		StaticContext _localctx = new StaticContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_static);
		try {
			setState(20);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STATIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				match(STATIC);
				}
				break;
			case EOF:
			case FINAL:
				enterOuterAlt(_localctx, 2);
				{
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
	public static class FinalContext extends ParserRuleContext {
		public TerminalNode FINAL() { return getToken(FuncModsGrammarParser.FINAL, 0); }
		public FinalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_final; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FuncModsGrammarListener ) ((FuncModsGrammarListener)listener).enterFinal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FuncModsGrammarListener ) ((FuncModsGrammarListener)listener).exitFinal(this);
		}
	}

	public final FinalContext final_() throws RecognitionException {
		FinalContext _localctx = new FinalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_final);
		try {
			setState(24);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				match(FINAL);
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
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

	public static final String _serializedATN =
		"\u0004\u0001\u0005\u001b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0003\u0003\u0015\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u0019\b\u0004\u0001\u0004\u0000\u0000"+
		"\u0005\u0000\u0002\u0004\u0006\b\u0000\u0001\u0001\u0000\u0001\u0003\u0017"+
		"\u0000\n\u0001\u0000\u0000\u0000\u0002\f\u0001\u0000\u0000\u0000\u0004"+
		"\u0010\u0001\u0000\u0000\u0000\u0006\u0014\u0001\u0000\u0000\u0000\b\u0018"+
		"\u0001\u0000\u0000\u0000\n\u000b\u0003\u0002\u0001\u0000\u000b\u0001\u0001"+
		"\u0000\u0000\u0000\f\r\u0003\u0004\u0002\u0000\r\u000e\u0003\u0006\u0003"+
		"\u0000\u000e\u000f\u0003\b\u0004\u0000\u000f\u0003\u0001\u0000\u0000\u0000"+
		"\u0010\u0011\u0007\u0000\u0000\u0000\u0011\u0005\u0001\u0000\u0000\u0000"+
		"\u0012\u0015\u0005\u0004\u0000\u0000\u0013\u0015\u0001\u0000\u0000\u0000"+
		"\u0014\u0012\u0001\u0000\u0000\u0000\u0014\u0013\u0001\u0000\u0000\u0000"+
		"\u0015\u0007\u0001\u0000\u0000\u0000\u0016\u0019\u0005\u0005\u0000\u0000"+
		"\u0017\u0019\u0001\u0000\u0000\u0000\u0018\u0016\u0001\u0000\u0000\u0000"+
		"\u0018\u0017\u0001\u0000\u0000\u0000\u0019\t\u0001\u0000\u0000\u0000\u0002"+
		"\u0014\u0018";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}