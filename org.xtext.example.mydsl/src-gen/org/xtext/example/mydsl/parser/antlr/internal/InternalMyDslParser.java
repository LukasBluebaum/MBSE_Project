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
		"RULE_WS", "'endfacet'", "'endloop'", "'endsolid'", "'facet'", "'loop'", 
		"'normal'", "'outer'", "'solid'", "'vertex'"
	};
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
	@Override public String getGrammarFileName() { return "../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g"; }



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
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:64:1: entryRuleSolid returns [EObject current=null] :iv_ruleSolid= ruleSolid EOF ;
	public final EObject entryRuleSolid() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleSolid =null;

		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:64:46: (iv_ruleSolid= ruleSolid EOF )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:65:2: iv_ruleSolid= ruleSolid EOF
			{
			 newCompositeNode(grammarAccess.getSolidRule()); 
			pushFollow(FOLLOW_ruleSolid_in_entryRuleSolid66);
			iv_ruleSolid=ruleSolid();
			state._fsp--;

			 current =iv_ruleSolid; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleSolid72); 
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
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:71:1: ruleSolid returns [EObject current=null] : (otherlv_0= 'solid' ( (lv_name_1_0= RULE_ID ) ) ( (lv_facets_2_0= ruleFacet ) )+ otherlv_3= 'endsolid' this_ID_4= RULE_ID ) ;
	public final EObject ruleSolid() throws RecognitionException {
		EObject current = null;


		Token otherlv_0=null;
		Token lv_name_1_0=null;
		Token otherlv_3=null;
		Token this_ID_4=null;
		EObject lv_facets_2_0 =null;


			enterRule();

		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:77:2: ( (otherlv_0= 'solid' ( (lv_name_1_0= RULE_ID ) ) ( (lv_facets_2_0= ruleFacet ) )+ otherlv_3= 'endsolid' this_ID_4= RULE_ID ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:78:2: (otherlv_0= 'solid' ( (lv_name_1_0= RULE_ID ) ) ( (lv_facets_2_0= ruleFacet ) )+ otherlv_3= 'endsolid' this_ID_4= RULE_ID )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:78:2: (otherlv_0= 'solid' ( (lv_name_1_0= RULE_ID ) ) ( (lv_facets_2_0= ruleFacet ) )+ otherlv_3= 'endsolid' this_ID_4= RULE_ID )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:79:3: otherlv_0= 'solid' ( (lv_name_1_0= RULE_ID ) ) ( (lv_facets_2_0= ruleFacet ) )+ otherlv_3= 'endsolid' this_ID_4= RULE_ID
			{
			otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleSolid101); 

						newLeafNode(otherlv_0, grammarAccess.getSolidAccess().getSolidKeyword_0());
					
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:83:3: ( (lv_name_1_0= RULE_ID ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:84:4: (lv_name_1_0= RULE_ID )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:84:4: (lv_name_1_0= RULE_ID )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:85:5: lv_name_1_0= RULE_ID
			{
			lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSolid122); 

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

			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:101:3: ( (lv_facets_2_0= ruleFacet ) )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==15) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:102:4: (lv_facets_2_0= ruleFacet )
					{
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:102:4: (lv_facets_2_0= ruleFacet )
					// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:103:5: lv_facets_2_0= ruleFacet
					{

										newCompositeNode(grammarAccess.getSolidAccess().getFacetsFacetParserRuleCall_2_0());
									
					pushFollow(FOLLOW_ruleFacet_in_ruleSolid166);
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

			otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleSolid188); 

						newLeafNode(otherlv_3, grammarAccess.getSolidAccess().getEndsolidKeyword_3());
					
			this_ID_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSolid198); 

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
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:132:1: entryRuleFacet returns [EObject current=null] :iv_ruleFacet= ruleFacet EOF ;
	public final EObject entryRuleFacet() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleFacet =null;

		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:132:46: (iv_ruleFacet= ruleFacet EOF )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:133:2: iv_ruleFacet= ruleFacet EOF
			{
			 newCompositeNode(grammarAccess.getFacetRule()); 
			pushFollow(FOLLOW_ruleFacet_in_entryRuleFacet224);
			iv_ruleFacet=ruleFacet();
			state._fsp--;

			 current =iv_ruleFacet; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleFacet230); 
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
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:139:1: ruleFacet returns [EObject current=null] : (otherlv_0= 'facet' ( (lv_normal_1_0= ruleNormalvector ) ) otherlv_2= 'outer' otherlv_3= 'loop' ( (lv_v1_4_0= ruleVector ) ) ( (lv_v2_5_0= ruleVector ) ) ( (lv_v3_6_0= ruleVector ) ) otherlv_7= 'endloop' otherlv_8= 'endfacet' ) ;
	public final EObject ruleFacet() throws RecognitionException {
		EObject current = null;


		Token otherlv_0=null;
		Token otherlv_2=null;
		Token otherlv_3=null;
		Token otherlv_7=null;
		Token otherlv_8=null;
		EObject lv_normal_1_0 =null;
		EObject lv_v1_4_0 =null;
		EObject lv_v2_5_0 =null;
		EObject lv_v3_6_0 =null;


			enterRule();

		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:145:2: ( (otherlv_0= 'facet' ( (lv_normal_1_0= ruleNormalvector ) ) otherlv_2= 'outer' otherlv_3= 'loop' ( (lv_v1_4_0= ruleVector ) ) ( (lv_v2_5_0= ruleVector ) ) ( (lv_v3_6_0= ruleVector ) ) otherlv_7= 'endloop' otherlv_8= 'endfacet' ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:146:2: (otherlv_0= 'facet' ( (lv_normal_1_0= ruleNormalvector ) ) otherlv_2= 'outer' otherlv_3= 'loop' ( (lv_v1_4_0= ruleVector ) ) ( (lv_v2_5_0= ruleVector ) ) ( (lv_v3_6_0= ruleVector ) ) otherlv_7= 'endloop' otherlv_8= 'endfacet' )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:146:2: (otherlv_0= 'facet' ( (lv_normal_1_0= ruleNormalvector ) ) otherlv_2= 'outer' otherlv_3= 'loop' ( (lv_v1_4_0= ruleVector ) ) ( (lv_v2_5_0= ruleVector ) ) ( (lv_v3_6_0= ruleVector ) ) otherlv_7= 'endloop' otherlv_8= 'endfacet' )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:147:3: otherlv_0= 'facet' ( (lv_normal_1_0= ruleNormalvector ) ) otherlv_2= 'outer' otherlv_3= 'loop' ( (lv_v1_4_0= ruleVector ) ) ( (lv_v2_5_0= ruleVector ) ) ( (lv_v3_6_0= ruleVector ) ) otherlv_7= 'endloop' otherlv_8= 'endfacet'
			{
			otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleFacet259); 

						newLeafNode(otherlv_0, grammarAccess.getFacetAccess().getFacetKeyword_0());
					
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:151:3: ( (lv_normal_1_0= ruleNormalvector ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:152:4: (lv_normal_1_0= ruleNormalvector )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:152:4: (lv_normal_1_0= ruleNormalvector )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:153:5: lv_normal_1_0= ruleNormalvector
			{

								newCompositeNode(grammarAccess.getFacetAccess().getNormalNormalvectorParserRuleCall_1_0());
							
			pushFollow(FOLLOW_ruleNormalvector_in_ruleFacet286);
			lv_normal_1_0=ruleNormalvector();
			state._fsp--;


								if (current==null) {
									current = createModelElementForParent(grammarAccess.getFacetRule());
								}
								set(
									current,
									"normal",
									lv_normal_1_0,
									"org.xtext.example.mydsl.MyDsl.Normalvector");
								afterParserOrEnumRuleCall();
							
			}

			}

			otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleFacet307); 

						newLeafNode(otherlv_2, grammarAccess.getFacetAccess().getOuterKeyword_2());
					
			otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleFacet317); 

						newLeafNode(otherlv_3, grammarAccess.getFacetAccess().getLoopKeyword_3());
					
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:178:3: ( (lv_v1_4_0= ruleVector ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:179:4: (lv_v1_4_0= ruleVector )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:179:4: (lv_v1_4_0= ruleVector )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:180:5: lv_v1_4_0= ruleVector
			{

								newCompositeNode(grammarAccess.getFacetAccess().getV1VectorParserRuleCall_4_0());
							
			pushFollow(FOLLOW_ruleVector_in_ruleFacet344);
			lv_v1_4_0=ruleVector();
			state._fsp--;


								if (current==null) {
									current = createModelElementForParent(grammarAccess.getFacetRule());
								}
								set(
									current,
									"v1",
									lv_v1_4_0,
									"org.xtext.example.mydsl.MyDsl.Vector");
								afterParserOrEnumRuleCall();
							
			}

			}

			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:197:3: ( (lv_v2_5_0= ruleVector ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:198:4: (lv_v2_5_0= ruleVector )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:198:4: (lv_v2_5_0= ruleVector )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:199:5: lv_v2_5_0= ruleVector
			{

								newCompositeNode(grammarAccess.getFacetAccess().getV2VectorParserRuleCall_5_0());
							
			pushFollow(FOLLOW_ruleVector_in_ruleFacet382);
			lv_v2_5_0=ruleVector();
			state._fsp--;


								if (current==null) {
									current = createModelElementForParent(grammarAccess.getFacetRule());
								}
								set(
									current,
									"v2",
									lv_v2_5_0,
									"org.xtext.example.mydsl.MyDsl.Vector");
								afterParserOrEnumRuleCall();
							
			}

			}

			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:216:3: ( (lv_v3_6_0= ruleVector ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:217:4: (lv_v3_6_0= ruleVector )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:217:4: (lv_v3_6_0= ruleVector )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:218:5: lv_v3_6_0= ruleVector
			{

								newCompositeNode(grammarAccess.getFacetAccess().getV3VectorParserRuleCall_6_0());
							
			pushFollow(FOLLOW_ruleVector_in_ruleFacet420);
			lv_v3_6_0=ruleVector();
			state._fsp--;


								if (current==null) {
									current = createModelElementForParent(grammarAccess.getFacetRule());
								}
								set(
									current,
									"v3",
									lv_v3_6_0,
									"org.xtext.example.mydsl.MyDsl.Vector");
								afterParserOrEnumRuleCall();
							
			}

			}

			otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleFacet441); 

						newLeafNode(otherlv_7, grammarAccess.getFacetAccess().getEndloopKeyword_7());
					
			otherlv_8=(Token)match(input,12,FOLLOW_12_in_ruleFacet451); 

						newLeafNode(otherlv_8, grammarAccess.getFacetAccess().getEndfacetKeyword_8());
					
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
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:247:1: entryRuleVector returns [EObject current=null] :iv_ruleVector= ruleVector EOF ;
	public final EObject entryRuleVector() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleVector =null;

		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:247:47: (iv_ruleVector= ruleVector EOF )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:248:2: iv_ruleVector= ruleVector EOF
			{
			 newCompositeNode(grammarAccess.getVectorRule()); 
			pushFollow(FOLLOW_ruleVector_in_entryRuleVector477);
			iv_ruleVector=ruleVector();
			state._fsp--;

			 current =iv_ruleVector; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleVector483); 
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
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:254:1: ruleVector returns [EObject current=null] : (otherlv_0= 'vertex' ( (lv_x1_1_0= RULE_DOUBLE ) ) ( (lv_x2_2_0= RULE_DOUBLE ) ) ( (lv_x3_3_0= RULE_DOUBLE ) ) ) ;
	public final EObject ruleVector() throws RecognitionException {
		EObject current = null;


		Token otherlv_0=null;
		Token lv_x1_1_0=null;
		Token lv_x2_2_0=null;
		Token lv_x3_3_0=null;


			enterRule();

		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:260:2: ( (otherlv_0= 'vertex' ( (lv_x1_1_0= RULE_DOUBLE ) ) ( (lv_x2_2_0= RULE_DOUBLE ) ) ( (lv_x3_3_0= RULE_DOUBLE ) ) ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:261:2: (otherlv_0= 'vertex' ( (lv_x1_1_0= RULE_DOUBLE ) ) ( (lv_x2_2_0= RULE_DOUBLE ) ) ( (lv_x3_3_0= RULE_DOUBLE ) ) )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:261:2: (otherlv_0= 'vertex' ( (lv_x1_1_0= RULE_DOUBLE ) ) ( (lv_x2_2_0= RULE_DOUBLE ) ) ( (lv_x3_3_0= RULE_DOUBLE ) ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:262:3: otherlv_0= 'vertex' ( (lv_x1_1_0= RULE_DOUBLE ) ) ( (lv_x2_2_0= RULE_DOUBLE ) ) ( (lv_x3_3_0= RULE_DOUBLE ) )
			{
			otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleVector512); 

						newLeafNode(otherlv_0, grammarAccess.getVectorAccess().getVertexKeyword_0());
					
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:266:3: ( (lv_x1_1_0= RULE_DOUBLE ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:267:4: (lv_x1_1_0= RULE_DOUBLE )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:267:4: (lv_x1_1_0= RULE_DOUBLE )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:268:5: lv_x1_1_0= RULE_DOUBLE
			{
			lv_x1_1_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleVector533); 

								newLeafNode(lv_x1_1_0, grammarAccess.getVectorAccess().getX1DOUBLETerminalRuleCall_1_0());
							

								if (current==null) {
									current = createModelElement(grammarAccess.getVectorRule());
								}
								setWithLastConsumed(
									current,
									"x1",
									lv_x1_1_0,
									"org.xtext.example.mydsl.MyDsl.DOUBLE");
							
			}

			}

			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:284:3: ( (lv_x2_2_0= RULE_DOUBLE ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:285:4: (lv_x2_2_0= RULE_DOUBLE )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:285:4: (lv_x2_2_0= RULE_DOUBLE )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:286:5: lv_x2_2_0= RULE_DOUBLE
			{
			lv_x2_2_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleVector571); 

								newLeafNode(lv_x2_2_0, grammarAccess.getVectorAccess().getX2DOUBLETerminalRuleCall_2_0());
							

								if (current==null) {
									current = createModelElement(grammarAccess.getVectorRule());
								}
								setWithLastConsumed(
									current,
									"x2",
									lv_x2_2_0,
									"org.xtext.example.mydsl.MyDsl.DOUBLE");
							
			}

			}

			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:302:3: ( (lv_x3_3_0= RULE_DOUBLE ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:303:4: (lv_x3_3_0= RULE_DOUBLE )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:303:4: (lv_x3_3_0= RULE_DOUBLE )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:304:5: lv_x3_3_0= RULE_DOUBLE
			{
			lv_x3_3_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleVector609); 

								newLeafNode(lv_x3_3_0, grammarAccess.getVectorAccess().getX3DOUBLETerminalRuleCall_3_0());
							

								if (current==null) {
									current = createModelElement(grammarAccess.getVectorRule());
								}
								setWithLastConsumed(
									current,
									"x3",
									lv_x3_3_0,
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



	// $ANTLR start "entryRuleNormalvector"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:324:1: entryRuleNormalvector returns [EObject current=null] :iv_ruleNormalvector= ruleNormalvector EOF ;
	public final EObject entryRuleNormalvector() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleNormalvector =null;

		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:324:53: (iv_ruleNormalvector= ruleNormalvector EOF )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:325:2: iv_ruleNormalvector= ruleNormalvector EOF
			{
			 newCompositeNode(grammarAccess.getNormalvectorRule()); 
			pushFollow(FOLLOW_ruleNormalvector_in_entryRuleNormalvector652);
			iv_ruleNormalvector=ruleNormalvector();
			state._fsp--;

			 current =iv_ruleNormalvector; 
			match(input,EOF,FOLLOW_EOF_in_entryRuleNormalvector658); 
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
	// $ANTLR end "entryRuleNormalvector"



	// $ANTLR start "ruleNormalvector"
	// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:331:1: ruleNormalvector returns [EObject current=null] : (otherlv_0= 'normal' ( (lv_x1_1_0= RULE_DOUBLE ) ) ( (lv_x2_2_0= RULE_DOUBLE ) ) ( (lv_x3_3_0= RULE_DOUBLE ) ) ) ;
	public final EObject ruleNormalvector() throws RecognitionException {
		EObject current = null;


		Token otherlv_0=null;
		Token lv_x1_1_0=null;
		Token lv_x2_2_0=null;
		Token lv_x3_3_0=null;


			enterRule();

		try {
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:337:2: ( (otherlv_0= 'normal' ( (lv_x1_1_0= RULE_DOUBLE ) ) ( (lv_x2_2_0= RULE_DOUBLE ) ) ( (lv_x3_3_0= RULE_DOUBLE ) ) ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:338:2: (otherlv_0= 'normal' ( (lv_x1_1_0= RULE_DOUBLE ) ) ( (lv_x2_2_0= RULE_DOUBLE ) ) ( (lv_x3_3_0= RULE_DOUBLE ) ) )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:338:2: (otherlv_0= 'normal' ( (lv_x1_1_0= RULE_DOUBLE ) ) ( (lv_x2_2_0= RULE_DOUBLE ) ) ( (lv_x3_3_0= RULE_DOUBLE ) ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:339:3: otherlv_0= 'normal' ( (lv_x1_1_0= RULE_DOUBLE ) ) ( (lv_x2_2_0= RULE_DOUBLE ) ) ( (lv_x3_3_0= RULE_DOUBLE ) )
			{
			otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleNormalvector687); 

						newLeafNode(otherlv_0, grammarAccess.getNormalvectorAccess().getNormalKeyword_0());
					
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:343:3: ( (lv_x1_1_0= RULE_DOUBLE ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:344:4: (lv_x1_1_0= RULE_DOUBLE )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:344:4: (lv_x1_1_0= RULE_DOUBLE )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:345:5: lv_x1_1_0= RULE_DOUBLE
			{
			lv_x1_1_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleNormalvector708); 

								newLeafNode(lv_x1_1_0, grammarAccess.getNormalvectorAccess().getX1DOUBLETerminalRuleCall_1_0());
							

								if (current==null) {
									current = createModelElement(grammarAccess.getNormalvectorRule());
								}
								setWithLastConsumed(
									current,
									"x1",
									lv_x1_1_0,
									"org.xtext.example.mydsl.MyDsl.DOUBLE");
							
			}

			}

			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:361:3: ( (lv_x2_2_0= RULE_DOUBLE ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:362:4: (lv_x2_2_0= RULE_DOUBLE )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:362:4: (lv_x2_2_0= RULE_DOUBLE )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:363:5: lv_x2_2_0= RULE_DOUBLE
			{
			lv_x2_2_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleNormalvector746); 

								newLeafNode(lv_x2_2_0, grammarAccess.getNormalvectorAccess().getX2DOUBLETerminalRuleCall_2_0());
							

								if (current==null) {
									current = createModelElement(grammarAccess.getNormalvectorRule());
								}
								setWithLastConsumed(
									current,
									"x2",
									lv_x2_2_0,
									"org.xtext.example.mydsl.MyDsl.DOUBLE");
							
			}

			}

			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:379:3: ( (lv_x3_3_0= RULE_DOUBLE ) )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:380:4: (lv_x3_3_0= RULE_DOUBLE )
			{
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:380:4: (lv_x3_3_0= RULE_DOUBLE )
			// ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:381:5: lv_x3_3_0= RULE_DOUBLE
			{
			lv_x3_3_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleNormalvector784); 

								newLeafNode(lv_x3_3_0, grammarAccess.getNormalvectorAccess().getX3DOUBLETerminalRuleCall_3_0());
							

								if (current==null) {
									current = createModelElement(grammarAccess.getNormalvectorRule());
								}
								setWithLastConsumed(
									current,
									"x3",
									lv_x3_3_0,
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
	// $ANTLR end "ruleNormalvector"

	// Delegated rules



	public static final BitSet FOLLOW_ruleSolid_in_entryRuleSolid66 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleSolid72 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_ruleSolid101 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleSolid122 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ruleFacet_in_ruleSolid166 = new BitSet(new long[]{0x000000000000C000L});
	public static final BitSet FOLLOW_14_in_ruleSolid188 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_RULE_ID_in_ruleSolid198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleFacet_in_entryRuleFacet224 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleFacet230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_ruleFacet259 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_ruleNormalvector_in_ruleFacet286 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_ruleFacet307 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_ruleFacet317 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_ruleVector_in_ruleFacet344 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_ruleVector_in_ruleFacet382 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_ruleVector_in_ruleFacet420 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_ruleFacet441 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_ruleFacet451 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleVector_in_entryRuleVector477 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleVector483 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_ruleVector512 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleVector533 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleVector571 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleVector609 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ruleNormalvector_in_entryRuleNormalvector652 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_entryRuleNormalvector658 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_ruleNormalvector687 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleNormalvector708 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleNormalvector746 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleNormalvector784 = new BitSet(new long[]{0x0000000000000002L});
}
