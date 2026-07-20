// Generated from WeirdCalc.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.*;
import java.util.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WeirdCalcParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEMI=1, ASSIGN=2, PRINT=3, LPAREN=4, RPAREN=5, HASH=6, AT=7, TILDE=8, 
		DOLLAR=9, MINUS=10, DIGITS=11, IDENTIFIER=12, WS=13, LINE_COMMENT=14;
	public static final int
		RULE_program = 0, RULE_line = 1, RULE_assignment = 2, RULE_print = 3, 
		RULE_exp = 4, RULE_item = 5, RULE_operand = 6, RULE_data = 7, RULE_number = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "line", "assignment", "print", "exp", "item", "operand", "data", 
			"number"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'print'", "'('", "')'", "'#'", "'@'", "'~'", "'$'", 
			"'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SEMI", "ASSIGN", "PRINT", "LPAREN", "RPAREN", "HASH", "AT", "TILDE", 
			"DOLLAR", "MINUS", "DIGITS", "IDENTIFIER", "WS", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "WeirdCalc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    // dictionary for storing variables and their values
	    Map<String, Integer> memory = new HashMap<>();

	public WeirdCalcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WeirdCalcListener ) ((WeirdCalcListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WeirdCalcListener ) ((WeirdCalcListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		return program(0);
	}

	private ProgramContext program(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ProgramContext _localctx = new ProgramContext(_ctx, _parentState);
		ProgramContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_program, _p);
		 memory.clear(); 
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(23);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ProgramContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_program);
					setState(19);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(20);
					line();
					}
					} 
				}
				setState(25);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LineContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(WeirdCalcParser.SEMI, 0); }
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WeirdCalcListener ) ((WeirdCalcListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WeirdCalcListener ) ((WeirdCalcListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			setState(32);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				assignment();
				setState(27);
				match(SEMI);
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				print();
				setState(30);
				match(SEMI);
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

	public static class AssignmentContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public ExpContext exp;
		public TerminalNode IDENTIFIER() { return getToken(WeirdCalcParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(WeirdCalcParser.ASSIGN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WeirdCalcListener ) ((WeirdCalcListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WeirdCalcListener ) ((WeirdCalcListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			((AssignmentContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(35);
			match(ASSIGN);
			setState(36);
			((AssignmentContext)_localctx).exp = exp(0);

			        memory.put((((AssignmentContext)_localctx).IDENTIFIER!=null?((AssignmentContext)_localctx).IDENTIFIER.getText():null), ((AssignmentContext)_localctx).exp.val);
			    
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

	public static class PrintContext extends ParserRuleContext {
		public ExpContext exp;
		public TerminalNode PRINT() { return getToken(WeirdCalcParser.PRINT, 0); }
		public TerminalNode LPAREN() { return getToken(WeirdCalcParser.LPAREN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(WeirdCalcParser.RPAREN, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WeirdCalcListener ) ((WeirdCalcListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WeirdCalcListener ) ((WeirdCalcListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_print);
		try {
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				match(PRINT);
				setState(40);
				match(LPAREN);
				setState(41);
				((PrintContext)_localctx).exp = exp(0);
				setState(42);
				match(RPAREN);

				        System.out.println(((PrintContext)_localctx).exp.val);
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				match(PRINT);
				setState(46);
				match(LPAREN);
				setState(47);
				match(RPAREN);

				        System.out.println();
				    
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

	public static class ExpContext extends ParserRuleContext {
		public int val;
		public ExpContext left;
		public ItemContext item;
		public ItemContext right;
		public ItemContext item() {
			return getRuleContext(ItemContext.class,0);
		}
		public TerminalNode HASH() { return getToken(WeirdCalcParser.HASH, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WeirdCalcListener ) ((WeirdCalcListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WeirdCalcListener ) ((WeirdCalcListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(52);
			((ExpContext)_localctx).item = item();
			 ((ExpContext)_localctx).val =  ((ExpContext)_localctx).item.val; 
			}
			_ctx.stop = _input.LT(-1);
			setState(62);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpContext(_parentctx, _parentState);
					_localctx.left = _prevctx;
					_localctx.left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_exp);
					setState(55);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(56);
					match(HASH);
					setState(57);
					((ExpContext)_localctx).right = ((ExpContext)_localctx).item = item();
					 ((ExpContext)_localctx).val =  (((ExpContext)_localctx).left.val % ((ExpContext)_localctx).right.val == 0) ? 0 : 1; 
					}
					} 
				}
				setState(64);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ItemContext extends ParserRuleContext {
		public int val;
		public OperandContext left;
		public ItemContext right;
		public OperandContext operand;
		public TerminalNode AT() { return getToken(WeirdCalcParser.AT, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public ItemContext item() {
			return getRuleContext(ItemContext.class,0);
		}
		public TerminalNode TILDE() { return getToken(WeirdCalcParser.TILDE, 0); }
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WeirdCalcListener ) ((WeirdCalcListener)listener).enterItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WeirdCalcListener ) ((WeirdCalcListener)listener).exitItem(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_item);
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				((ItemContext)_localctx).left = operand();
				setState(66);
				match(AT);
				setState(67);
				((ItemContext)_localctx).right = item();
				 ((ItemContext)_localctx).val =  Math.abs(((ItemContext)_localctx).left.val + ((ItemContext)_localctx).right.val); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				((ItemContext)_localctx).left = operand();
				setState(71);
				match(TILDE);
				setState(72);
				((ItemContext)_localctx).right = item();
				 ((ItemContext)_localctx).val =  (((ItemContext)_localctx).left.val * ((ItemContext)_localctx).left.val) + (((ItemContext)_localctx).right.val * ((ItemContext)_localctx).right.val); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				((ItemContext)_localctx).operand = operand();
				 ((ItemContext)_localctx).val =  ((ItemContext)_localctx).operand.val; 
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

	public static class OperandContext extends ParserRuleContext {
		public int val;
		public OperandContext operand;
		public DataContext data;
		public TerminalNode DOLLAR() { return getToken(WeirdCalcParser.DOLLAR, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WeirdCalcListener ) ((WeirdCalcListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WeirdCalcListener ) ((WeirdCalcListener)listener).exitOperand(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_operand);
		try {
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOLLAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(DOLLAR);
				setState(81);
				((OperandContext)_localctx).operand = operand();

				        if (((OperandContext)_localctx).operand.val < 0) ((OperandContext)_localctx).val =  -1;
				        else if (((OperandContext)_localctx).operand.val == 0) ((OperandContext)_localctx).val =  0;
				        else ((OperandContext)_localctx).val =  1;
				    
				}
				break;
			case MINUS:
			case DIGITS:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				((OperandContext)_localctx).data = data();

				        ((OperandContext)_localctx).val =  ((OperandContext)_localctx).data.val;
				    
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

	public static class DataContext extends ParserRuleContext {
		public int val;
		public NumberContext number;
		public Token IDENTIFIER;
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(WeirdCalcParser.IDENTIFIER, 0); }
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WeirdCalcListener ) ((WeirdCalcListener)listener).enterData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WeirdCalcListener ) ((WeirdCalcListener)listener).exitData(this);
		}
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_data);
		try {
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case DIGITS:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				((DataContext)_localctx).number = number();

				        ((DataContext)_localctx).val =  ((DataContext)_localctx).number.val;
				    
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				((DataContext)_localctx).IDENTIFIER = match(IDENTIFIER);

				        if (memory.containsKey((((DataContext)_localctx).IDENTIFIER!=null?((DataContext)_localctx).IDENTIFIER.getText():null))) {
				            ((DataContext)_localctx).val =  memory.get((((DataContext)_localctx).IDENTIFIER!=null?((DataContext)_localctx).IDENTIFIER.getText():null));
				        } else {
				            System.err.println("Error: Variable '" + (((DataContext)_localctx).IDENTIFIER!=null?((DataContext)_localctx).IDENTIFIER.getText():null) + "' is not initialized.");
				            ((DataContext)_localctx).val =  0;
				        }
				    
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

	public static class NumberContext extends ParserRuleContext {
		public int val;
		public Token DIGITS;
		public TerminalNode MINUS() { return getToken(WeirdCalcParser.MINUS, 0); }
		public TerminalNode DIGITS() { return getToken(WeirdCalcParser.DIGITS, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WeirdCalcListener ) ((WeirdCalcListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WeirdCalcListener ) ((WeirdCalcListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_number);
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				match(MINUS);
				setState(97);
				((NumberContext)_localctx).DIGITS = match(DIGITS);

				        ((NumberContext)_localctx).val =  -Integer.parseInt((((NumberContext)_localctx).DIGITS!=null?((NumberContext)_localctx).DIGITS.getText():null));
				    
				}
				break;
			case DIGITS:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				((NumberContext)_localctx).DIGITS = match(DIGITS);

				        ((NumberContext)_localctx).val =  Integer.parseInt((((NumberContext)_localctx).DIGITS!=null?((NumberContext)_localctx).DIGITS.getText():null));
				    
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return program_sempred((ProgramContext)_localctx, predIndex);
		case 4:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean program_sempred(ProgramContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20j\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\7\2\30\n\2\f\2\16\2\33\13\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3#\n\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\64\n\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6?\n\6\f\6\16\6B\13\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7Q\n\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\bZ\n\b\3\t\3\t\3\t\3\t\3\t\5\ta\n\t\3\n\3\n\3\n\3\n\3\n\5\nh\n"+
		"\n\3\n\2\4\2\n\13\2\4\6\b\n\f\16\20\22\2\2\2i\2\24\3\2\2\2\4\"\3\2\2\2"+
		"\6$\3\2\2\2\b\63\3\2\2\2\n\65\3\2\2\2\fP\3\2\2\2\16Y\3\2\2\2\20`\3\2\2"+
		"\2\22g\3\2\2\2\24\31\b\2\1\2\25\26\f\4\2\2\26\30\5\4\3\2\27\25\3\2\2\2"+
		"\30\33\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\3\3\2\2\2\33\31\3\2\2\2"+
		"\34\35\5\6\4\2\35\36\7\3\2\2\36#\3\2\2\2\37 \5\b\5\2 !\7\3\2\2!#\3\2\2"+
		"\2\"\34\3\2\2\2\"\37\3\2\2\2#\5\3\2\2\2$%\7\16\2\2%&\7\4\2\2&\'\5\n\6"+
		"\2\'(\b\4\1\2(\7\3\2\2\2)*\7\5\2\2*+\7\6\2\2+,\5\n\6\2,-\7\7\2\2-.\b\5"+
		"\1\2.\64\3\2\2\2/\60\7\5\2\2\60\61\7\6\2\2\61\62\7\7\2\2\62\64\b\5\1\2"+
		"\63)\3\2\2\2\63/\3\2\2\2\64\t\3\2\2\2\65\66\b\6\1\2\66\67\5\f\7\2\678"+
		"\b\6\1\28@\3\2\2\29:\f\4\2\2:;\7\b\2\2;<\5\f\7\2<=\b\6\1\2=?\3\2\2\2>"+
		"9\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\13\3\2\2\2B@\3\2\2\2CD\5\16\b"+
		"\2DE\7\t\2\2EF\5\f\7\2FG\b\7\1\2GQ\3\2\2\2HI\5\16\b\2IJ\7\n\2\2JK\5\f"+
		"\7\2KL\b\7\1\2LQ\3\2\2\2MN\5\16\b\2NO\b\7\1\2OQ\3\2\2\2PC\3\2\2\2PH\3"+
		"\2\2\2PM\3\2\2\2Q\r\3\2\2\2RS\7\13\2\2ST\5\16\b\2TU\b\b\1\2UZ\3\2\2\2"+
		"VW\5\20\t\2WX\b\b\1\2XZ\3\2\2\2YR\3\2\2\2YV\3\2\2\2Z\17\3\2\2\2[\\\5\22"+
		"\n\2\\]\b\t\1\2]a\3\2\2\2^_\7\16\2\2_a\b\t\1\2`[\3\2\2\2`^\3\2\2\2a\21"+
		"\3\2\2\2bc\7\f\2\2cd\7\r\2\2dh\b\n\1\2ef\7\r\2\2fh\b\n\1\2gb\3\2\2\2g"+
		"e\3\2\2\2h\23\3\2\2\2\n\31\"\63@PY`g";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}