package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int RULE_ANY_OTHER=4;
	public static final int RULE_FLOAT=5;
	public static final int RULE_ID=6;
	public static final int RULE_INT=7;
	public static final int RULE_ML_COMMENT=8;
	public static final int RULE_SL_COMMENT=9;
	public static final int RULE_STRING=10;
	public static final int RULE_WS=11;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public InternalMyDslLexer() {} 
	public InternalMyDslLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public InternalMyDslLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "InternalMyDsl.g"; }

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// InternalMyDsl.g:10:7: ( 'endfacet' )
			// InternalMyDsl.g:10:9: 'endfacet'
			{
			match("endfacet"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// InternalMyDsl.g:11:7: ( 'endloop' )
			// InternalMyDsl.g:11:9: 'endloop'
			{
			match("endloop"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// InternalMyDsl.g:12:7: ( 'endsolid' )
			// InternalMyDsl.g:12:9: 'endsolid'
			{
			match("endsolid"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// InternalMyDsl.g:13:7: ( 'facet' )
			// InternalMyDsl.g:13:9: 'facet'
			{
			match("facet"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// InternalMyDsl.g:14:7: ( 'loop' )
			// InternalMyDsl.g:14:9: 'loop'
			{
			match("loop"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// InternalMyDsl.g:15:7: ( 'normal' )
			// InternalMyDsl.g:15:9: 'normal'
			{
			match("normal"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// InternalMyDsl.g:16:7: ( 'outer' )
			// InternalMyDsl.g:16:9: 'outer'
			{
			match("outer"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// InternalMyDsl.g:17:7: ( 'solid' )
			// InternalMyDsl.g:17:9: 'solid'
			{
			match("solid"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// InternalMyDsl.g:18:7: ( 'vertex' )
			// InternalMyDsl.g:18:9: 'vertex'
			{
			match("vertex"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "RULE_FLOAT"
	public final void mRULE_FLOAT() throws RecognitionException {
		try {
			int _type = RULE_FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// InternalMyDsl.g:933:12: ( ( '-' | '.' | 'e' | RULE_INT )+ )
			// InternalMyDsl.g:933:14: ( '-' | '.' | 'e' | RULE_INT )+
			{
			// InternalMyDsl.g:933:14: ( '-' | '.' | 'e' | RULE_INT )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=5;
				switch ( input.LA(1) ) {
				case '-':
					{
					alt1=1;
					}
					break;
				case '.':
					{
					alt1=2;
					}
					break;
				case 'e':
					{
					alt1=3;
					}
					break;
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
				case '8':
				case '9':
					{
					alt1=4;
					}
					break;
				}
				switch (alt1) {
				case 1 :
					// InternalMyDsl.g:933:15: '-'
					{
					match('-'); 
					}
					break;
				case 2 :
					// InternalMyDsl.g:933:19: '.'
					{
					match('.'); 
					}
					break;
				case 3 :
					// InternalMyDsl.g:933:23: 'e'
					{
					match('e'); 
					}
					break;
				case 4 :
					// InternalMyDsl.g:933:27: RULE_INT
					{
					mRULE_INT(); 

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RULE_FLOAT"

	// $ANTLR start "RULE_ID"
	public final void mRULE_ID() throws RecognitionException {
		try {
			int _type = RULE_ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// InternalMyDsl.g:935:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
			// InternalMyDsl.g:935:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
			{
			// InternalMyDsl.g:935:11: ( '^' )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='^') ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// InternalMyDsl.g:935:11: '^'
					{
					match('^'); 
					}
					break;

			}

			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// InternalMyDsl.g:935:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// InternalMyDsl.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop3;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RULE_ID"

	// $ANTLR start "RULE_INT"
	public final void mRULE_INT() throws RecognitionException {
		try {
			// InternalMyDsl.g:937:19: ( ( '0' .. '9' )+ )
			// InternalMyDsl.g:937:21: ( '0' .. '9' )+
			{
			// InternalMyDsl.g:937:21: ( '0' .. '9' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// InternalMyDsl.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RULE_INT"

	// $ANTLR start "RULE_STRING"
	public final void mRULE_STRING() throws RecognitionException {
		try {
			int _type = RULE_STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// InternalMyDsl.g:939:13: ( ( '\"' ( '\\\\' . |~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . |~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
			// InternalMyDsl.g:939:15: ( '\"' ( '\\\\' . |~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . |~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
			{
			// InternalMyDsl.g:939:15: ( '\"' ( '\\\\' . |~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . |~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='\"') ) {
				alt7=1;
			}
			else if ( (LA7_0=='\'') ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// InternalMyDsl.g:939:16: '\"' ( '\\\\' . |~ ( ( '\\\\' | '\"' ) ) )* '\"'
					{
					match('\"'); 
					// InternalMyDsl.g:939:20: ( '\\\\' . |~ ( ( '\\\\' | '\"' ) ) )*
					loop5:
					while (true) {
						int alt5=3;
						int LA5_0 = input.LA(1);
						if ( (LA5_0=='\\') ) {
							alt5=1;
						}
						else if ( ((LA5_0 >= '\u0000' && LA5_0 <= '!')||(LA5_0 >= '#' && LA5_0 <= '[')||(LA5_0 >= ']' && LA5_0 <= '\uFFFF')) ) {
							alt5=2;
						}

						switch (alt5) {
						case 1 :
							// InternalMyDsl.g:939:21: '\\\\' .
							{
							match('\\'); 
							matchAny(); 
							}
							break;
						case 2 :
							// InternalMyDsl.g:939:28: ~ ( ( '\\\\' | '\"' ) )
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop5;
						}
					}

					match('\"'); 
					}
					break;
				case 2 :
					// InternalMyDsl.g:939:48: '\\'' ( '\\\\' . |~ ( ( '\\\\' | '\\'' ) ) )* '\\''
					{
					match('\''); 
					// InternalMyDsl.g:939:53: ( '\\\\' . |~ ( ( '\\\\' | '\\'' ) ) )*
					loop6:
					while (true) {
						int alt6=3;
						int LA6_0 = input.LA(1);
						if ( (LA6_0=='\\') ) {
							alt6=1;
						}
						else if ( ((LA6_0 >= '\u0000' && LA6_0 <= '&')||(LA6_0 >= '(' && LA6_0 <= '[')||(LA6_0 >= ']' && LA6_0 <= '\uFFFF')) ) {
							alt6=2;
						}

						switch (alt6) {
						case 1 :
							// InternalMyDsl.g:939:54: '\\\\' .
							{
							match('\\'); 
							matchAny(); 
							}
							break;
						case 2 :
							// InternalMyDsl.g:939:61: ~ ( ( '\\\\' | '\\'' ) )
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop6;
						}
					}

					match('\''); 
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RULE_STRING"

	// $ANTLR start "RULE_ML_COMMENT"
	public final void mRULE_ML_COMMENT() throws RecognitionException {
		try {
			int _type = RULE_ML_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// InternalMyDsl.g:941:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
			// InternalMyDsl.g:941:19: '/*' ( options {greedy=false; } : . )* '*/'
			{
			match("/*"); 

			// InternalMyDsl.g:941:24: ( options {greedy=false; } : . )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0=='*') ) {
					int LA8_1 = input.LA(2);
					if ( (LA8_1=='/') ) {
						alt8=2;
					}
					else if ( ((LA8_1 >= '\u0000' && LA8_1 <= '.')||(LA8_1 >= '0' && LA8_1 <= '\uFFFF')) ) {
						alt8=1;
					}

				}
				else if ( ((LA8_0 >= '\u0000' && LA8_0 <= ')')||(LA8_0 >= '+' && LA8_0 <= '\uFFFF')) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// InternalMyDsl.g:941:52: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop8;
				}
			}

			match("*/"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RULE_ML_COMMENT"

	// $ANTLR start "RULE_SL_COMMENT"
	public final void mRULE_SL_COMMENT() throws RecognitionException {
		try {
			int _type = RULE_SL_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// InternalMyDsl.g:943:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
			// InternalMyDsl.g:943:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
			{
			match("//"); 

			// InternalMyDsl.g:943:24: (~ ( ( '\\n' | '\\r' ) ) )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( ((LA9_0 >= '\u0000' && LA9_0 <= '\t')||(LA9_0 >= '\u000B' && LA9_0 <= '\f')||(LA9_0 >= '\u000E' && LA9_0 <= '\uFFFF')) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// InternalMyDsl.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop9;
				}
			}

			// InternalMyDsl.g:943:40: ( ( '\\r' )? '\\n' )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0=='\n'||LA11_0=='\r') ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// InternalMyDsl.g:943:41: ( '\\r' )? '\\n'
					{
					// InternalMyDsl.g:943:41: ( '\\r' )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0=='\r') ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// InternalMyDsl.g:943:41: '\\r'
							{
							match('\r'); 
							}
							break;

					}

					match('\n'); 
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RULE_SL_COMMENT"

	// $ANTLR start "RULE_WS"
	public final void mRULE_WS() throws RecognitionException {
		try {
			int _type = RULE_WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// InternalMyDsl.g:945:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
			// InternalMyDsl.g:945:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
			{
			// InternalMyDsl.g:945:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
			int cnt12=0;
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( ((LA12_0 >= '\t' && LA12_0 <= '\n')||LA12_0=='\r'||LA12_0==' ') ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// InternalMyDsl.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt12 >= 1 ) break loop12;
					EarlyExitException eee = new EarlyExitException(12, input);
					throw eee;
				}
				cnt12++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RULE_WS"

	// $ANTLR start "RULE_ANY_OTHER"
	public final void mRULE_ANY_OTHER() throws RecognitionException {
		try {
			int _type = RULE_ANY_OTHER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// InternalMyDsl.g:947:16: ( . )
			// InternalMyDsl.g:947:18: .
			{
			matchAny(); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RULE_ANY_OTHER"

	@Override
	public void mTokens() throws RecognitionException {
		// InternalMyDsl.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | RULE_FLOAT | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
		int alt13=16;
		alt13 = dfa13.predict(input);
		switch (alt13) {
			case 1 :
				// InternalMyDsl.g:1:10: T__12
				{
				mT__12(); 

				}
				break;
			case 2 :
				// InternalMyDsl.g:1:16: T__13
				{
				mT__13(); 

				}
				break;
			case 3 :
				// InternalMyDsl.g:1:22: T__14
				{
				mT__14(); 

				}
				break;
			case 4 :
				// InternalMyDsl.g:1:28: T__15
				{
				mT__15(); 

				}
				break;
			case 5 :
				// InternalMyDsl.g:1:34: T__16
				{
				mT__16(); 

				}
				break;
			case 6 :
				// InternalMyDsl.g:1:40: T__17
				{
				mT__17(); 

				}
				break;
			case 7 :
				// InternalMyDsl.g:1:46: T__18
				{
				mT__18(); 

				}
				break;
			case 8 :
				// InternalMyDsl.g:1:52: T__19
				{
				mT__19(); 

				}
				break;
			case 9 :
				// InternalMyDsl.g:1:58: T__20
				{
				mT__20(); 

				}
				break;
			case 10 :
				// InternalMyDsl.g:1:64: RULE_FLOAT
				{
				mRULE_FLOAT(); 

				}
				break;
			case 11 :
				// InternalMyDsl.g:1:75: RULE_ID
				{
				mRULE_ID(); 

				}
				break;
			case 12 :
				// InternalMyDsl.g:1:83: RULE_STRING
				{
				mRULE_STRING(); 

				}
				break;
			case 13 :
				// InternalMyDsl.g:1:95: RULE_ML_COMMENT
				{
				mRULE_ML_COMMENT(); 

				}
				break;
			case 14 :
				// InternalMyDsl.g:1:111: RULE_SL_COMMENT
				{
				mRULE_SL_COMMENT(); 

				}
				break;
			case 15 :
				// InternalMyDsl.g:1:127: RULE_WS
				{
				mRULE_WS(); 

				}
				break;
			case 16 :
				// InternalMyDsl.g:1:135: RULE_ANY_OTHER
				{
				mRULE_ANY_OTHER(); 

				}
				break;

		}
	}


	protected DFA13 dfa13 = new DFA13(this);
	static final String DFA13_eotS =
		"\1\uffff\1\23\6\26\3\uffff\1\21\1\uffff\3\21\2\uffff\1\26\1\uffff\2\23\1\uffff\6\26\4\uffff\13\26\1\65\7\26\1\75\1\uffff\1\26\1\77\1\100\4\26\1\uffff\1\105\2\uffff\1\106\1\26\1\110\1\26\2\uffff\1\112\1\uffff\1\113\2\uffff";
	static final String DFA13_eofS =
		"\114\uffff";
	static final String DFA13_minS =
		"\1\0\1\60\1\141\2\157\1\165\1\157\1\145\3\uffff\1\101\1\uffff\2\0\1\52\2\uffff\1\144\1\uffff\2\60\1\uffff\1\143\1\157\1\162\1\164\1\154\1\162\4\uffff\1\146\1\145\1\160\1\155\1\145\1\151\1\164\1\141\2\157\1\164\1\60\1\141\1\162\1\144\1\145\1\143\1\157\1\154\1\60\1\uffff\1\154\2\60\1\170\1\145\1\160\1\151\1\uffff\1\60\2\uffff\1\60\1\164\1\60\1\144\2\uffff\1\60\1\uffff\1\60\2\uffff";
	static final String DFA13_maxS =
		"\1\uffff\1\172\1\141\2\157\1\165\1\157\1\145\3\uffff\1\172\1\uffff\2\uffff\1\57\2\uffff\1\144\1\uffff\2\172\1\uffff\1\143\1\157\1\162\1\164\1\154\1\162\4\uffff\1\163\1\145\1\160\1\155\1\145\1\151\1\164\1\141\2\157\1\164\1\172\1\141\1\162\1\144\1\145\1\143\1\157\1\154\1\172\1\uffff\1\154\2\172\1\170\1\145\1\160\1\151\1\uffff\1\172\2\uffff\1\172\1\164\1\172\1\144\2\uffff\1\172\1\uffff\1\172\2\uffff";
	static final String DFA13_acceptS =
		"\10\uffff\3\12\1\uffff\1\13\3\uffff\1\17\1\20\1\uffff\1\12\2\uffff\1\13\6\uffff\1\14\1\15\1\16\1\17\24\uffff\1\5\7\uffff\1\4\1\uffff\1\7\1\10\4\uffff\1\6\1\11\1\uffff\1\2\1\uffff\1\1\1\3";
	static final String DFA13_specialS =
		"\1\2\14\uffff\1\0\1\1\75\uffff}>";
	static final String[] DFA13_transitionS = {
			"\11\21\2\20\2\21\1\20\22\21\1\20\1\21\1\15\4\21\1\16\5\21\1\10\1\11\1\17\12\12\7\21\32\14\3\21\1\13\1\14\1\21\4\14\1\1\1\2\5\14\1\3\1\14\1\4\1\5\3\14\1\6\2\14\1\7\4\14\uff85\21",
			"\12\25\7\uffff\32\26\4\uffff\1\26\1\uffff\4\26\1\24\10\26\1\22\14\26",
			"\1\27",
			"\1\30",
			"\1\31",
			"\1\32",
			"\1\33",
			"\1\34",
			"",
			"",
			"",
			"\32\26\4\uffff\1\26\1\uffff\32\26",
			"",
			"\0\35",
			"\0\35",
			"\1\36\4\uffff\1\37",
			"",
			"",
			"\1\41",
			"",
			"\12\25\7\uffff\32\26\4\uffff\1\26\1\uffff\4\26\1\24\25\26",
			"\12\25\7\uffff\32\26\4\uffff\1\26\1\uffff\4\26\1\24\25\26",
			"",
			"\1\42",
			"\1\43",
			"\1\44",
			"\1\45",
			"\1\46",
			"\1\47",
			"",
			"",
			"",
			"",
			"\1\50\5\uffff\1\51\6\uffff\1\52",
			"\1\53",
			"\1\54",
			"\1\55",
			"\1\56",
			"\1\57",
			"\1\60",
			"\1\61",
			"\1\62",
			"\1\63",
			"\1\64",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"\1\66",
			"\1\67",
			"\1\70",
			"\1\71",
			"\1\72",
			"\1\73",
			"\1\74",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"",
			"\1\76",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"\1\101",
			"\1\102",
			"\1\103",
			"\1\104",
			"",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"",
			"",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"\1\107",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"\1\111",
			"",
			"",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"",
			"\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
			"",
			""
	};

	static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
	static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
	static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
	static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
	static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
	static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
	static final short[][] DFA13_transition;

	static {
		int numStates = DFA13_transitionS.length;
		DFA13_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
		}
	}

	protected class DFA13 extends DFA {

		public DFA13(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 13;
			this.eot = DFA13_eot;
			this.eof = DFA13_eof;
			this.min = DFA13_min;
			this.max = DFA13_max;
			this.accept = DFA13_accept;
			this.special = DFA13_special;
			this.transition = DFA13_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | RULE_FLOAT | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA13_13 = input.LA(1);
						s = -1;
						if ( ((LA13_13 >= '\u0000' && LA13_13 <= '\uFFFF')) ) {s = 29;}
						else s = 17;
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA13_14 = input.LA(1);
						s = -1;
						if ( ((LA13_14 >= '\u0000' && LA13_14 <= '\uFFFF')) ) {s = 29;}
						else s = 17;
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA13_0 = input.LA(1);
						s = -1;
						if ( (LA13_0=='e') ) {s = 1;}
						else if ( (LA13_0=='f') ) {s = 2;}
						else if ( (LA13_0=='l') ) {s = 3;}
						else if ( (LA13_0=='n') ) {s = 4;}
						else if ( (LA13_0=='o') ) {s = 5;}
						else if ( (LA13_0=='s') ) {s = 6;}
						else if ( (LA13_0=='v') ) {s = 7;}
						else if ( (LA13_0=='-') ) {s = 8;}
						else if ( (LA13_0=='.') ) {s = 9;}
						else if ( ((LA13_0 >= '0' && LA13_0 <= '9')) ) {s = 10;}
						else if ( (LA13_0=='^') ) {s = 11;}
						else if ( ((LA13_0 >= 'A' && LA13_0 <= 'Z')||LA13_0=='_'||(LA13_0 >= 'a' && LA13_0 <= 'd')||(LA13_0 >= 'g' && LA13_0 <= 'k')||LA13_0=='m'||(LA13_0 >= 'p' && LA13_0 <= 'r')||(LA13_0 >= 't' && LA13_0 <= 'u')||(LA13_0 >= 'w' && LA13_0 <= 'z')) ) {s = 12;}
						else if ( (LA13_0=='\"') ) {s = 13;}
						else if ( (LA13_0=='\'') ) {s = 14;}
						else if ( (LA13_0=='/') ) {s = 15;}
						else if ( ((LA13_0 >= '\t' && LA13_0 <= '\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 16;}
						else if ( ((LA13_0 >= '\u0000' && LA13_0 <= '\b')||(LA13_0 >= '\u000B' && LA13_0 <= '\f')||(LA13_0 >= '\u000E' && LA13_0 <= '\u001F')||LA13_0=='!'||(LA13_0 >= '#' && LA13_0 <= '&')||(LA13_0 >= '(' && LA13_0 <= ',')||(LA13_0 >= ':' && LA13_0 <= '@')||(LA13_0 >= '[' && LA13_0 <= ']')||LA13_0=='`'||(LA13_0 >= '{' && LA13_0 <= '\uFFFF')) ) {s = 17;}
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 13, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
