/*
 * generated by Xtext 2.15.0
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

}
@parser::members {
	private MyDslGrammarAccess grammarAccess;

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleSolid
entryRuleSolid
:
{ before(grammarAccess.getSolidRule()); }
	 ruleSolid
{ after(grammarAccess.getSolidRule()); } 
	 EOF 
;

// Rule Solid
ruleSolid 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSolidAccess().getGroup()); }
		(rule__Solid__Group__0)
		{ after(grammarAccess.getSolidAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFacet
entryRuleFacet
:
{ before(grammarAccess.getFacetRule()); }
	 ruleFacet
{ after(grammarAccess.getFacetRule()); } 
	 EOF 
;

// Rule Facet
ruleFacet 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFacetAccess().getGroup()); }
		(rule__Facet__Group__0)
		{ after(grammarAccess.getFacetAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVector
entryRuleVector
:
{ before(grammarAccess.getVectorRule()); }
	 ruleVector
{ after(grammarAccess.getVectorRule()); } 
	 EOF 
;

// Rule Vector
ruleVector 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVectorAccess().getGroup()); }
		(rule__Vector__Group__0)
		{ after(grammarAccess.getVectorAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNormalvector
entryRuleNormalvector
:
{ before(grammarAccess.getNormalvectorRule()); }
	 ruleNormalvector
{ after(grammarAccess.getNormalvectorRule()); } 
	 EOF 
;

// Rule Normalvector
ruleNormalvector 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNormalvectorAccess().getGroup()); }
		(rule__Normalvector__Group__0)
		{ after(grammarAccess.getNormalvectorAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Solid__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Solid__Group__0__Impl
	rule__Solid__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Solid__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSolidAccess().getSolidKeyword_0()); }
	'solid'
	{ after(grammarAccess.getSolidAccess().getSolidKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Solid__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Solid__Group__1__Impl
	rule__Solid__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Solid__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSolidAccess().getNameAssignment_1()); }
	(rule__Solid__NameAssignment_1)
	{ after(grammarAccess.getSolidAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Solid__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Solid__Group__2__Impl
	rule__Solid__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Solid__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getSolidAccess().getFacetsAssignment_2()); }
		(rule__Solid__FacetsAssignment_2)
		{ after(grammarAccess.getSolidAccess().getFacetsAssignment_2()); }
	)
	(
		{ before(grammarAccess.getSolidAccess().getFacetsAssignment_2()); }
		(rule__Solid__FacetsAssignment_2)*
		{ after(grammarAccess.getSolidAccess().getFacetsAssignment_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Solid__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Solid__Group__3__Impl
	rule__Solid__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Solid__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSolidAccess().getEndsolidKeyword_3()); }
	'endsolid'
	{ after(grammarAccess.getSolidAccess().getEndsolidKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Solid__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Solid__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Solid__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSolidAccess().getIDTerminalRuleCall_4()); }
	RULE_ID
	{ after(grammarAccess.getSolidAccess().getIDTerminalRuleCall_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Facet__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Facet__Group__0__Impl
	rule__Facet__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Facet__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFacetAccess().getFacetKeyword_0()); }
	'facet'
	{ after(grammarAccess.getFacetAccess().getFacetKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Facet__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Facet__Group__1__Impl
	rule__Facet__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Facet__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFacetAccess().getNormalAssignment_1()); }
	(rule__Facet__NormalAssignment_1)
	{ after(grammarAccess.getFacetAccess().getNormalAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Facet__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Facet__Group__2__Impl
	rule__Facet__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Facet__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFacetAccess().getOuterKeyword_2()); }
	'outer'
	{ after(grammarAccess.getFacetAccess().getOuterKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Facet__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Facet__Group__3__Impl
	rule__Facet__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Facet__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFacetAccess().getLoopKeyword_3()); }
	'loop'
	{ after(grammarAccess.getFacetAccess().getLoopKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Facet__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Facet__Group__4__Impl
	rule__Facet__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Facet__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFacetAccess().getV1Assignment_4()); }
	(rule__Facet__V1Assignment_4)
	{ after(grammarAccess.getFacetAccess().getV1Assignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Facet__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Facet__Group__5__Impl
	rule__Facet__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Facet__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFacetAccess().getV2Assignment_5()); }
	(rule__Facet__V2Assignment_5)
	{ after(grammarAccess.getFacetAccess().getV2Assignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Facet__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Facet__Group__6__Impl
	rule__Facet__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Facet__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFacetAccess().getV3Assignment_6()); }
	(rule__Facet__V3Assignment_6)
	{ after(grammarAccess.getFacetAccess().getV3Assignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Facet__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Facet__Group__7__Impl
	rule__Facet__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Facet__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFacetAccess().getEndloopKeyword_7()); }
	'endloop'
	{ after(grammarAccess.getFacetAccess().getEndloopKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Facet__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Facet__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Facet__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFacetAccess().getEndfacetKeyword_8()); }
	'endfacet'
	{ after(grammarAccess.getFacetAccess().getEndfacetKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Vector__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Vector__Group__0__Impl
	rule__Vector__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Vector__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVectorAccess().getVertexKeyword_0()); }
	'vertex'
	{ after(grammarAccess.getVectorAccess().getVertexKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Vector__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Vector__Group__1__Impl
	rule__Vector__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Vector__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVectorAccess().getX1Assignment_1()); }
	(rule__Vector__X1Assignment_1)
	{ after(grammarAccess.getVectorAccess().getX1Assignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Vector__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Vector__Group__2__Impl
	rule__Vector__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Vector__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVectorAccess().getX2Assignment_2()); }
	(rule__Vector__X2Assignment_2)
	{ after(grammarAccess.getVectorAccess().getX2Assignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Vector__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Vector__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Vector__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVectorAccess().getX3Assignment_3()); }
	(rule__Vector__X3Assignment_3)
	{ after(grammarAccess.getVectorAccess().getX3Assignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Normalvector__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Normalvector__Group__0__Impl
	rule__Normalvector__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Normalvector__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNormalvectorAccess().getNormalKeyword_0()); }
	'normal'
	{ after(grammarAccess.getNormalvectorAccess().getNormalKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Normalvector__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Normalvector__Group__1__Impl
	rule__Normalvector__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Normalvector__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNormalvectorAccess().getX1Assignment_1()); }
	(rule__Normalvector__X1Assignment_1)
	{ after(grammarAccess.getNormalvectorAccess().getX1Assignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Normalvector__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Normalvector__Group__2__Impl
	rule__Normalvector__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Normalvector__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNormalvectorAccess().getX2Assignment_2()); }
	(rule__Normalvector__X2Assignment_2)
	{ after(grammarAccess.getNormalvectorAccess().getX2Assignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Normalvector__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Normalvector__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Normalvector__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNormalvectorAccess().getX3Assignment_3()); }
	(rule__Normalvector__X3Assignment_3)
	{ after(grammarAccess.getNormalvectorAccess().getX3Assignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Solid__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSolidAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getSolidAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Solid__FacetsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSolidAccess().getFacetsFacetParserRuleCall_2_0()); }
		ruleFacet
		{ after(grammarAccess.getSolidAccess().getFacetsFacetParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Facet__NormalAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFacetAccess().getNormalNormalvectorParserRuleCall_1_0()); }
		ruleNormalvector
		{ after(grammarAccess.getFacetAccess().getNormalNormalvectorParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Facet__V1Assignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFacetAccess().getV1VectorParserRuleCall_4_0()); }
		ruleVector
		{ after(grammarAccess.getFacetAccess().getV1VectorParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Facet__V2Assignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFacetAccess().getV2VectorParserRuleCall_5_0()); }
		ruleVector
		{ after(grammarAccess.getFacetAccess().getV2VectorParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Facet__V3Assignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFacetAccess().getV3VectorParserRuleCall_6_0()); }
		ruleVector
		{ after(grammarAccess.getFacetAccess().getV3VectorParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Vector__X1Assignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVectorAccess().getX1DOUBLETerminalRuleCall_1_0()); }
		RULE_DOUBLE
		{ after(grammarAccess.getVectorAccess().getX1DOUBLETerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Vector__X2Assignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVectorAccess().getX2DOUBLETerminalRuleCall_2_0()); }
		RULE_DOUBLE
		{ after(grammarAccess.getVectorAccess().getX2DOUBLETerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Vector__X3Assignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVectorAccess().getX3DOUBLETerminalRuleCall_3_0()); }
		RULE_DOUBLE
		{ after(grammarAccess.getVectorAccess().getX3DOUBLETerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Normalvector__X1Assignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNormalvectorAccess().getX1DOUBLETerminalRuleCall_1_0()); }
		RULE_DOUBLE
		{ after(grammarAccess.getNormalvectorAccess().getX1DOUBLETerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Normalvector__X2Assignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNormalvectorAccess().getX2DOUBLETerminalRuleCall_2_0()); }
		RULE_DOUBLE
		{ after(grammarAccess.getNormalvectorAccess().getX2DOUBLETerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Normalvector__X3Assignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNormalvectorAccess().getX3DOUBLETerminalRuleCall_3_0()); }
		RULE_DOUBLE
		{ after(grammarAccess.getNormalvectorAccess().getX3DOUBLETerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_DOUBLE : ('-'|'.'|'e'|'0'..'9')+;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
