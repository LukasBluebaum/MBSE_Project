/*
 * generated by Xtext 2.15.0
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleSolid
entryRuleSolid returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSolidRule()); }
	iv_ruleSolid=ruleSolid
	{ $current=$iv_ruleSolid.current; }
	EOF;

// Rule Solid
ruleSolid returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='solid'
		{
			newLeafNode(otherlv_0, grammarAccess.getSolidAccess().getSolidKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getSolidAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSolidRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getSolidAccess().getFacetsFacetParserRuleCall_2_0());
				}
				lv_facets_2_0=ruleFacet
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSolidRule());
					}
					add(
						$current,
						"facets",
						lv_facets_2_0,
						"org.xtext.example.mydsl.MyDsl.Facet");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_3='endsolid'
		{
			newLeafNode(otherlv_3, grammarAccess.getSolidAccess().getEndsolidKeyword_3());
		}
		this_ID_4=RULE_ID
		{
			newLeafNode(this_ID_4, grammarAccess.getSolidAccess().getIDTerminalRuleCall_4());
		}
	)
;

// Entry rule entryRuleFacet
entryRuleFacet returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFacetRule()); }
	iv_ruleFacet=ruleFacet
	{ $current=$iv_ruleFacet.current; }
	EOF;

// Rule Facet
ruleFacet returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='facet'
		{
			newLeafNode(otherlv_0, grammarAccess.getFacetAccess().getFacetKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFacetAccess().getNormalNormalvectorParserRuleCall_1_0());
				}
				lv_normal_1_0=ruleNormalvector
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFacetRule());
					}
					set(
						$current,
						"normal",
						lv_normal_1_0,
						"org.xtext.example.mydsl.MyDsl.Normalvector");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='outer'
		{
			newLeafNode(otherlv_2, grammarAccess.getFacetAccess().getOuterKeyword_2());
		}
		otherlv_3='loop'
		{
			newLeafNode(otherlv_3, grammarAccess.getFacetAccess().getLoopKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFacetAccess().getV1VectorParserRuleCall_4_0());
				}
				lv_v1_4_0=ruleVector
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFacetRule());
					}
					set(
						$current,
						"v1",
						lv_v1_4_0,
						"org.xtext.example.mydsl.MyDsl.Vector");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getFacetAccess().getV2VectorParserRuleCall_5_0());
				}
				lv_v2_5_0=ruleVector
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFacetRule());
					}
					set(
						$current,
						"v2",
						lv_v2_5_0,
						"org.xtext.example.mydsl.MyDsl.Vector");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getFacetAccess().getV3VectorParserRuleCall_6_0());
				}
				lv_v3_6_0=ruleVector
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFacetRule());
					}
					set(
						$current,
						"v3",
						lv_v3_6_0,
						"org.xtext.example.mydsl.MyDsl.Vector");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7='endloop'
		{
			newLeafNode(otherlv_7, grammarAccess.getFacetAccess().getEndloopKeyword_7());
		}
		otherlv_8='endfacet'
		{
			newLeafNode(otherlv_8, grammarAccess.getFacetAccess().getEndfacetKeyword_8());
		}
	)
;

// Entry rule entryRuleVector
entryRuleVector returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVectorRule()); }
	iv_ruleVector=ruleVector
	{ $current=$iv_ruleVector.current; }
	EOF;

// Rule Vector
ruleVector returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='vertex'
		{
			newLeafNode(otherlv_0, grammarAccess.getVectorAccess().getVertexKeyword_0());
		}
		(
			(
				lv_x1_1_0=RULE_FLOAT
				{
					newLeafNode(lv_x1_1_0, grammarAccess.getVectorAccess().getX1FLOATTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVectorRule());
					}
					setWithLastConsumed(
						$current,
						"x1",
						lv_x1_1_0,
						"org.xtext.example.mydsl.MyDsl.FLOAT");
				}
			)
		)
		(
			(
				lv_x2_2_0=RULE_FLOAT
				{
					newLeafNode(lv_x2_2_0, grammarAccess.getVectorAccess().getX2FLOATTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVectorRule());
					}
					setWithLastConsumed(
						$current,
						"x2",
						lv_x2_2_0,
						"org.xtext.example.mydsl.MyDsl.FLOAT");
				}
			)
		)
		(
			(
				lv_x3_3_0=RULE_FLOAT
				{
					newLeafNode(lv_x3_3_0, grammarAccess.getVectorAccess().getX3FLOATTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVectorRule());
					}
					setWithLastConsumed(
						$current,
						"x3",
						lv_x3_3_0,
						"org.xtext.example.mydsl.MyDsl.FLOAT");
				}
			)
		)
	)
;

// Entry rule entryRuleNormalvector
entryRuleNormalvector returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNormalvectorRule()); }
	iv_ruleNormalvector=ruleNormalvector
	{ $current=$iv_ruleNormalvector.current; }
	EOF;

// Rule Normalvector
ruleNormalvector returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='normal'
		{
			newLeafNode(otherlv_0, grammarAccess.getNormalvectorAccess().getNormalKeyword_0());
		}
		(
			(
				lv_x1_1_0=RULE_FLOAT
				{
					newLeafNode(lv_x1_1_0, grammarAccess.getNormalvectorAccess().getX1FLOATTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNormalvectorRule());
					}
					setWithLastConsumed(
						$current,
						"x1",
						lv_x1_1_0,
						"org.xtext.example.mydsl.MyDsl.FLOAT");
				}
			)
		)
		(
			(
				lv_x2_2_0=RULE_FLOAT
				{
					newLeafNode(lv_x2_2_0, grammarAccess.getNormalvectorAccess().getX2FLOATTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNormalvectorRule());
					}
					setWithLastConsumed(
						$current,
						"x2",
						lv_x2_2_0,
						"org.xtext.example.mydsl.MyDsl.FLOAT");
				}
			)
		)
		(
			(
				lv_x3_3_0=RULE_FLOAT
				{
					newLeafNode(lv_x3_3_0, grammarAccess.getNormalvectorAccess().getX3FLOATTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNormalvectorRule());
					}
					setWithLastConsumed(
						$current,
						"x3",
						lv_x3_3_0,
						"org.xtext.example.mydsl.MyDsl.FLOAT");
				}
			)
		)
	)
;

RULE_FLOAT : ('-'|'.'|'e'|RULE_INT)+;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

fragment RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
