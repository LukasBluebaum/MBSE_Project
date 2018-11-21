package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ANY_OTHER", "RULE_DOUBLE", 
		"RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_STRING", 
		"RULE_WS", "'endfacet'", "'endsolid'", "'facet'", "'normal'", "'solid'"
	};
	public static final int EOF=-1;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int RULE_ANY_OTHER=4;
	public static final int RULE_DOUBLE=5;
	public static final int RULE_ID=6;
	public static final int RULE_INT=7;
	public static final int RULE_ML_COMMENT=8;
	public static final int RULE_SL_COMMENT=9;
	public static final int RULE_STRING=10;
	public static final int RULE_WS=11;

	// delegates
	public AbstractInternalAntlrParser[] getDelegates() {
		return new AbstractInternalAntlrParser[] {};
	}

	// delegators


	public InternalMyDslParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
	@Override public String getGrammarFileName() { return "InternalMyDsl.g"; }



	 	private MyDslGrammarAccess grammarAccess;

	    public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
	        this(input);
	        this.grammarAccess = grammarAccess;
	        registerRules(grammarAccess.getGrammar());
	    }

	    @Override
	    protected String getFirstRuleName() {
	    	return "Solid";
	   	}

	   	@Override
	   	protected MyDslGrammarAccess getGrammarAccess() {
	   		return grammarAccess;
	   	}




	// $ANTLR start "entryRuleSolid"
	// InternalMyDsl.g:64:1: entryRuleSolid returns [EObject current=null] :iv_ruleSolid= ruleSolid EOF ;
	public final EObject entryRuleSolid() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleSolid =null;

		try {
			// InternalMyDsl.g:64:46: (iv_ruleSolid= ruleSolid EOF )
			// InternalMyDsl.g:65:2: iv_ruleSolid= ruleSolid EOF
			{
			 newCompositeNode(grammarAccess.getSolidRule()); 
			pushFollow(FOLLOW_1);
			iv_ruleSolid=ruleSolid();
			state._fsp--;

			 current =iv_ruleSolid; 
			match(input,EOF,FOLLOW_2); 
			}

		}

		    catch (RecognitionException re) {
		        recover(input,re);
		        appendSkippedTokens();
		    }

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleSolid"



	// $ANTLR start "ruleSolid"
	// InternalMyDsl.g:71:1: ruleSolid returns [EObject current=null] : (otherlv_0= 'solid' ( (lv_name_1_0= RULE_ID ) ) ( (lv_facets_2_0= ruleFacet ) )+ otherlv_3= 'endsolid' this_ID_4= RULE_ID ) ;
	public final EObject ruleSolid() throws RecognitionException {
		EObject current = null;


		Token otherlv_0=null;
		Token lv_name_1_0=null;
		Token otherlv_3=null;
		Token this_ID_4=null;
		EObject lv_facets_2_0 =null;


			enterRule();

		try {
			// InternalMyDsl.g:77:2: ( (otherlv_0= 'solid' ( (lv_name_1_0= RULE_ID ) ) ( (lv_facets_2_0= ruleFacet ) )+ otherlv_3= 'endsolid' this_ID_4= RULE_ID ) )
			// InternalMyDsl.g:78:2: (otherlv_0= 'solid' ( (lv_name_1_0= RULE_ID ) ) ( (lv_facets_2_0= ruleFacet ) )+ otherlv_3= 'endsolid' this_ID_4= RULE_ID )
			{
			// InternalMyDsl.g:78:2: (otherlv_0= 'solid' ( (lv_name_1_0= RULE_ID ) ) ( (lv_facets_2_0= ruleFacet ) )+ otherlv_3= 'endsolid' this_ID_4= RULE_ID )
			// InternalMyDsl.g:79:3: otherlv_0= 'solid' ( (lv_name_1_0= RULE_ID ) ) ( (lv_facets_2_0= ruleFacet ) )+ otherlv_3= 'endsolid' this_ID_4= RULE_ID
			{
			otherlv_0=(Token)match(input,16,FOLLOW_3); 

						newLeafNode(otherlv_0, grammarAccess.getSolidAccess().getSolidKeyword_0());
					
			// InternalMyDsl.g:83:3: ( (lv_name_1_0= RULE_ID ) )
			// InternalMyDsl.g:84:4: (lv_name_1_0= RULE_ID )
			{
			// InternalMyDsl.g:84:4: (lv_name_1_0= RULE_ID )
			// InternalMyDsl.g:85:5: lv_name_1_0= RULE_ID
			{
			lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

								newLeafNode(lv_name_1_0, grammarAccess.getSolidAccess().getNameIDTerminalRuleCall_1_0());
							

								if (current==null) {
									current = createModelElement(grammarAccess.getSolidRule());
								}
								setWithLastConsumed(
									current,
									"name",
									lv_name_1_0,
									"org.eclipse.xtext.common.Terminals.ID");
							
			}

			}

			// InternalMyDsl.g:101:3: ( (lv_facets_2_0= ruleFacet ) )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==14) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// InternalMyDsl.g:102:4: (lv_facets_2_0= ruleFacet )
					{
					// InternalMyDsl.g:102:4: (lv_facets_2_0= ruleFacet )
					// InternalMyDsl.g:103:5: lv_facets_2_0= ruleFacet
					{

										newCompositeNode(grammarAccess.getSolidAccess().getFacetsFacetParserRuleCall_2_0());
									
					pushFollow(FOLLOW_5);
					lv_facets_2_0=ruleFacet();
					state._fsp--;


										if (current==null) {
											current = createModelElementForParent(grammarAccess.getSolidRule());
										}
										add(
											current,
											"facets",
											lv_facets_2_0,
											"org.xtext.example.mydsl.MyDsl.Facet");
										afterParserOrEnumRuleCall();
									
					}

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			otherlv_3=(Token)match(input,13,FOLLOW_3); 

						newLeafNode(otherlv_3, grammarAccess.getSolidAccess().getEndsolidKeyword_3());
					
			this_ID_4=(Token)match(input,RULE_ID,FOLLOW_2); 

						newLeafNode(this_ID_4, grammarAccess.getSolidAccess().getIDTerminalRuleCall_4());
					
			}

			}


				leaveRule();

		}

		    catch (RecognitionException re) {
		        recover(input,re);
		        appendSkippedTokens();
		    }

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleSolid"



	// $ANTLR start "entryRuleFacet"
	// InternalMyDsl.g:132:1: entryRuleFacet returns [EObject current=null] :iv_ruleFacet= ruleFacet EOF ;
	public final EObject entryRuleFacet() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleFacet =null;

		try {
			// InternalMyDsl.g:132:46: (iv_ruleFacet= ruleFacet EOF )
			// InternalMyDsl.g:133:2: iv_ruleFacet= ruleFacet EOF
			{
			 newCompositeNode(grammarAccess.getFacetRule()); 
			pushFollow(FOLLOW_1);
			iv_ruleFacet=ruleFacet();
			state._fsp--;

			 current =iv_ruleFacet; 
			match(input,EOF,FOLLOW_2); 
			}

		}

		    catch (RecognitionException re) {
		        recover(input,re);
		        appendSkippedTokens();
		    }

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleFacet"



	// $ANTLR start "ruleFacet"
	// InternalMyDsl.g:139:1: ruleFacet returns [EObject current=null] : (otherlv_0= 'facet' ( (lv_normal_1_0= ruleVector ) ) otherlv_2= 'endfacet' ) ;
	public final EObject ruleFacet() throws RecognitionException {
		EObject current = null;


		Token otherlv_0=null;
		Token otherlv_2=null;
		EObject lv_normal_1_0 =null;


			enterRule();

		try {
			// InternalMyDsl.g:145:2: ( (otherlv_0= 'facet' ( (lv_normal_1_0= ruleVector ) ) otherlv_2= 'endfacet' ) )
			// InternalMyDsl.g:146:2: (otherlv_0= 'facet' ( (lv_normal_1_0= ruleVector ) ) otherlv_2= 'endfacet' )
			{
			// InternalMyDsl.g:146:2: (otherlv_0= 'facet' ( (lv_normal_1_0= ruleVector ) ) otherlv_2= 'endfacet' )
			// InternalMyDsl.g:147:3: otherlv_0= 'facet' ( (lv_normal_1_0= ruleVector ) ) otherlv_2= 'endfacet'
			{
			otherlv_0=(Token)match(input,14,FOLLOW_6); 

						newLeafNode(otherlv_0, grammarAccess.getFacetAccess().getFacetKeyword_0());
					
			// InternalMyDsl.g:151:3: ( (lv_normal_1_0= ruleVector ) )
			// InternalMyDsl.g:152:4: (lv_normal_1_0= ruleVector )
			{
			// InternalMyDsl.g:152:4: (lv_normal_1_0= ruleVector )
			// InternalMyDsl.g:153:5: lv_normal_1_0= ruleVector
			{

								newCompositeNode(grammarAccess.getFacetAccess().getNormalVectorParserRuleCall_1_0());
							
			pushFollow(FOLLOW_7);
			lv_normal_1_0=ruleVector();
			state._fsp--;


								if (current==null) {
									current = createModelElementForParent(grammarAccess.getFacetRule());
								}
								set(
									current,
									"normal",
									lv_normal_1_0,
									"org.xtext.example.mydsl.MyDsl.Vector");
								afterParserOrEnumRuleCall();
							
			}

			}

			otherlv_2=(Token)match(input,12,FOLLOW_2); 

						newLeafNode(otherlv_2, grammarAccess.getFacetAccess().getEndfacetKeyword_2());
					
			}

			}


				leaveRule();

		}

		    catch (RecognitionException re) {
		        recover(input,re);
		        appendSkippedTokens();
		    }

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleFacet"



	// $ANTLR start "entryRuleVector"
	// InternalMyDsl.g:178:1: entryRuleVector returns [EObject current=null] :iv_ruleVector= ruleVector EOF ;
	public final EObject entryRuleVector() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleVector =null;

		try {
			// InternalMyDsl.g:178:47: (iv_ruleVector= ruleVector EOF )
			// InternalMyDsl.g:179:2: iv_ruleVector= ruleVector EOF
			{
			 newCompositeNode(grammarAccess.getVectorRule()); 
			pushFollow(FOLLOW_1);
			iv_ruleVector=ruleVector();
			state._fsp--;

			 current =iv_ruleVector; 
			match(input,EOF,FOLLOW_2); 
			}

		}

		    catch (RecognitionException re) {
		        recover(input,re);
		        appendSkippedTokens();
		    }

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleVector"



	// $ANTLR start "ruleVector"
	// InternalMyDsl.g:185:1: ruleVector returns [EObject current=null] : (otherlv_0= 'normal' ( (lv_x_1_0= RULE_DOUBLE ) ) ( (lv_y_2_0= RULE_DOUBLE ) ) ( (lv_z_3_0= RULE_DOUBLE ) ) ) ;
	public final EObject ruleVector() throws RecognitionException {
		EObject current = null;


		Token otherlv_0=null;
		Token lv_x_1_0=null;
		Token lv_y_2_0=null;
		Token lv_z_3_0=null;


			enterRule();

		try {
			// InternalMyDsl.g:191:2: ( (otherlv_0= 'normal' ( (lv_x_1_0= RULE_DOUBLE ) ) ( (lv_y_2_0= RULE_DOUBLE ) ) ( (lv_z_3_0= RULE_DOUBLE ) ) ) )
			// InternalMyDsl.g:192:2: (otherlv_0= 'normal' ( (lv_x_1_0= RULE_DOUBLE ) ) ( (lv_y_2_0= RULE_DOUBLE ) ) ( (lv_z_3_0= RULE_DOUBLE ) ) )
			{
			// InternalMyDsl.g:192:2: (otherlv_0= 'normal' ( (lv_x_1_0= RULE_DOUBLE ) ) ( (lv_y_2_0= RULE_DOUBLE ) ) ( (lv_z_3_0= RULE_DOUBLE ) ) )
			// InternalMyDsl.g:193:3: otherlv_0= 'normal' ( (lv_x_1_0= RULE_DOUBLE ) ) ( (lv_y_2_0= RULE_DOUBLE ) ) ( (lv_z_3_0= RULE_DOUBLE ) )
			{
			otherlv_0=(Token)match(input,15,FOLLOW_8); 

						newLeafNode(otherlv_0, grammarAccess.getVectorAccess().getNormalKeyword_0());
					
			// InternalMyDsl.g:197:3: ( (lv_x_1_0= RULE_DOUBLE ) )
			// InternalMyDsl.g:198:4: (lv_x_1_0= RULE_DOUBLE )
			{
			// InternalMyDsl.g:198:4: (lv_x_1_0= RULE_DOUBLE )
			// InternalMyDsl.g:199:5: lv_x_1_0= RULE_DOUBLE
			{
			lv_x_1_0=(Token)match(input,RULE_DOUBLE,FOLLOW_8); 

								newLeafNode(lv_x_1_0, grammarAccess.getVectorAccess().getXDOUBLETerminalRuleCall_1_0());
							

								if (current==null) {
									current = createModelElement(grammarAccess.getVectorRule());
								}
								setWithLastConsumed(
									current,
									"x",
									lv_x_1_0,
									"org.xtext.example.mydsl.MyDsl.DOUBLE");
							
			}

			}

			// InternalMyDsl.g:215:3: ( (lv_y_2_0= RULE_DOUBLE ) )
			// InternalMyDsl.g:216:4: (lv_y_2_0= RULE_DOUBLE )
			{
			// InternalMyDsl.g:216:4: (lv_y_2_0= RULE_DOUBLE )
			// InternalMyDsl.g:217:5: lv_y_2_0= RULE_DOUBLE
			{
			lv_y_2_0=(Token)match(input,RULE_DOUBLE,FOLLOW_8); 

								newLeafNode(lv_y_2_0, grammarAccess.getVectorAccess().getYDOUBLETerminalRuleCall_2_0());
							

								if (current==null) {
									current = createModelElement(grammarAccess.getVectorRule());
								}
								setWithLastConsumed(
									current,
									"y",
									lv_y_2_0,
									"org.xtext.example.mydsl.MyDsl.DOUBLE");
							
			}

			}

			// InternalMyDsl.g:233:3: ( (lv_z_3_0= RULE_DOUBLE ) )
			// InternalMyDsl.g:234:4: (lv_z_3_0= RULE_DOUBLE )
			{
			// InternalMyDsl.g:234:4: (lv_z_3_0= RULE_DOUBLE )
			// InternalMyDsl.g:235:5: lv_z_3_0= RULE_DOUBLE
			{
			lv_z_3_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

								newLeafNode(lv_z_3_0, grammarAccess.getVectorAccess().getZDOUBLETerminalRuleCall_3_0());
							

								if (current==null) {
									current = createModelElement(grammarAccess.getVectorRule());
								}
								setWithLastConsumed(
									current,
									"z",
									lv_z_3_0,
									"org.xtext.example.mydsl.MyDsl.DOUBLE");
							
			}

			}

			}

			}


				leaveRule();

		}

		    catch (RecognitionException re) {
		        recover(input,re);
		        appendSkippedTokens();
		    }

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleVector"

	// Delegated rules



	public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
	public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
}
