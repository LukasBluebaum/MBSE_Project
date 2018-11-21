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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
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
	public AbstractInternalContentAssistParser[] getDelegates() {
		return new AbstractInternalContentAssistParser[] {};
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



	// $ANTLR start "entryRuleSolid"
	// InternalMyDsl.g:53:1: entryRuleSolid : ruleSolid EOF ;
	public final void entryRuleSolid() throws RecognitionException {
		try {
			// InternalMyDsl.g:54:1: ( ruleSolid EOF )
			// InternalMyDsl.g:55:1: ruleSolid EOF
			{
			 before(grammarAccess.getSolidRule()); 
			pushFollow(FOLLOW_1);
			ruleSolid();
			state._fsp--;

			 after(grammarAccess.getSolidRule()); 
			match(input,EOF,FOLLOW_2); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleSolid"



	// $ANTLR start "ruleSolid"
	// InternalMyDsl.g:62:1: ruleSolid : ( ( rule__Solid__Group__0 ) ) ;
	public final void ruleSolid() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:66:2: ( ( ( rule__Solid__Group__0 ) ) )
			// InternalMyDsl.g:67:2: ( ( rule__Solid__Group__0 ) )
			{
			// InternalMyDsl.g:67:2: ( ( rule__Solid__Group__0 ) )
			// InternalMyDsl.g:68:3: ( rule__Solid__Group__0 )
			{
			 before(grammarAccess.getSolidAccess().getGroup()); 
			// InternalMyDsl.g:69:3: ( rule__Solid__Group__0 )
			// InternalMyDsl.g:69:4: rule__Solid__Group__0
			{
			pushFollow(FOLLOW_2);
			rule__Solid__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getSolidAccess().getGroup()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleSolid"



	// $ANTLR start "entryRuleFacet"
	// InternalMyDsl.g:78:1: entryRuleFacet : ruleFacet EOF ;
	public final void entryRuleFacet() throws RecognitionException {
		try {
			// InternalMyDsl.g:79:1: ( ruleFacet EOF )
			// InternalMyDsl.g:80:1: ruleFacet EOF
			{
			 before(grammarAccess.getFacetRule()); 
			pushFollow(FOLLOW_1);
			ruleFacet();
			state._fsp--;

			 after(grammarAccess.getFacetRule()); 
			match(input,EOF,FOLLOW_2); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleFacet"



	// $ANTLR start "ruleFacet"
	// InternalMyDsl.g:87:1: ruleFacet : ( ( rule__Facet__Group__0 ) ) ;
	public final void ruleFacet() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:91:2: ( ( ( rule__Facet__Group__0 ) ) )
			// InternalMyDsl.g:92:2: ( ( rule__Facet__Group__0 ) )
			{
			// InternalMyDsl.g:92:2: ( ( rule__Facet__Group__0 ) )
			// InternalMyDsl.g:93:3: ( rule__Facet__Group__0 )
			{
			 before(grammarAccess.getFacetAccess().getGroup()); 
			// InternalMyDsl.g:94:3: ( rule__Facet__Group__0 )
			// InternalMyDsl.g:94:4: rule__Facet__Group__0
			{
			pushFollow(FOLLOW_2);
			rule__Facet__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getFacetAccess().getGroup()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleFacet"



	// $ANTLR start "entryRuleVector"
	// InternalMyDsl.g:103:1: entryRuleVector : ruleVector EOF ;
	public final void entryRuleVector() throws RecognitionException {
		try {
			// InternalMyDsl.g:104:1: ( ruleVector EOF )
			// InternalMyDsl.g:105:1: ruleVector EOF
			{
			 before(grammarAccess.getVectorRule()); 
			pushFollow(FOLLOW_1);
			ruleVector();
			state._fsp--;

			 after(grammarAccess.getVectorRule()); 
			match(input,EOF,FOLLOW_2); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleVector"



	// $ANTLR start "ruleVector"
	// InternalMyDsl.g:112:1: ruleVector : ( ( rule__Vector__Group__0 ) ) ;
	public final void ruleVector() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:116:2: ( ( ( rule__Vector__Group__0 ) ) )
			// InternalMyDsl.g:117:2: ( ( rule__Vector__Group__0 ) )
			{
			// InternalMyDsl.g:117:2: ( ( rule__Vector__Group__0 ) )
			// InternalMyDsl.g:118:3: ( rule__Vector__Group__0 )
			{
			 before(grammarAccess.getVectorAccess().getGroup()); 
			// InternalMyDsl.g:119:3: ( rule__Vector__Group__0 )
			// InternalMyDsl.g:119:4: rule__Vector__Group__0
			{
			pushFollow(FOLLOW_2);
			rule__Vector__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getVectorAccess().getGroup()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleVector"



	// $ANTLR start "rule__Solid__Group__0"
	// InternalMyDsl.g:127:1: rule__Solid__Group__0 : rule__Solid__Group__0__Impl rule__Solid__Group__1 ;
	public final void rule__Solid__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:131:2: ( rule__Solid__Group__0__Impl rule__Solid__Group__1 )
			// InternalMyDsl.g:132:2: rule__Solid__Group__0__Impl rule__Solid__Group__1
			{
			pushFollow(FOLLOW_3);
			rule__Solid__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Solid__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Solid__Group__0"



	// $ANTLR start "rule__Solid__Group__0__Impl"
	// InternalMyDsl.g:139:1: rule__Solid__Group__0__Impl : ( 'solid' ) ;
	public final void rule__Solid__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:143:2: ( ( 'solid' ) )
			// InternalMyDsl.g:144:2: ( 'solid' )
			{
			// InternalMyDsl.g:144:2: ( 'solid' )
			// InternalMyDsl.g:145:2: 'solid'
			{
			 before(grammarAccess.getSolidAccess().getSolidKeyword_0()); 
			match(input,16,FOLLOW_2); 
			 after(grammarAccess.getSolidAccess().getSolidKeyword_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Solid__Group__0__Impl"



	// $ANTLR start "rule__Solid__Group__1"
	// InternalMyDsl.g:154:1: rule__Solid__Group__1 : rule__Solid__Group__1__Impl rule__Solid__Group__2 ;
	public final void rule__Solid__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:158:2: ( rule__Solid__Group__1__Impl rule__Solid__Group__2 )
			// InternalMyDsl.g:159:2: rule__Solid__Group__1__Impl rule__Solid__Group__2
			{
			pushFollow(FOLLOW_4);
			rule__Solid__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Solid__Group__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Solid__Group__1"



	// $ANTLR start "rule__Solid__Group__1__Impl"
	// InternalMyDsl.g:166:1: rule__Solid__Group__1__Impl : ( ( rule__Solid__NameAssignment_1 ) ) ;
	public final void rule__Solid__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:170:2: ( ( ( rule__Solid__NameAssignment_1 ) ) )
			// InternalMyDsl.g:171:2: ( ( rule__Solid__NameAssignment_1 ) )
			{
			// InternalMyDsl.g:171:2: ( ( rule__Solid__NameAssignment_1 ) )
			// InternalMyDsl.g:172:2: ( rule__Solid__NameAssignment_1 )
			{
			 before(grammarAccess.getSolidAccess().getNameAssignment_1()); 
			// InternalMyDsl.g:173:2: ( rule__Solid__NameAssignment_1 )
			// InternalMyDsl.g:173:3: rule__Solid__NameAssignment_1
			{
			pushFollow(FOLLOW_2);
			rule__Solid__NameAssignment_1();
			state._fsp--;

			}

			 after(grammarAccess.getSolidAccess().getNameAssignment_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Solid__Group__1__Impl"



	// $ANTLR start "rule__Solid__Group__2"
	// InternalMyDsl.g:181:1: rule__Solid__Group__2 : rule__Solid__Group__2__Impl rule__Solid__Group__3 ;
	public final void rule__Solid__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:185:2: ( rule__Solid__Group__2__Impl rule__Solid__Group__3 )
			// InternalMyDsl.g:186:2: rule__Solid__Group__2__Impl rule__Solid__Group__3
			{
			pushFollow(FOLLOW_5);
			rule__Solid__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Solid__Group__3();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Solid__Group__2"



	// $ANTLR start "rule__Solid__Group__2__Impl"
	// InternalMyDsl.g:193:1: rule__Solid__Group__2__Impl : ( ( ( rule__Solid__FacetsAssignment_2 ) ) ( ( rule__Solid__FacetsAssignment_2 )* ) ) ;
	public final void rule__Solid__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:197:2: ( ( ( ( rule__Solid__FacetsAssignment_2 ) ) ( ( rule__Solid__FacetsAssignment_2 )* ) ) )
			// InternalMyDsl.g:198:2: ( ( ( rule__Solid__FacetsAssignment_2 ) ) ( ( rule__Solid__FacetsAssignment_2 )* ) )
			{
			// InternalMyDsl.g:198:2: ( ( ( rule__Solid__FacetsAssignment_2 ) ) ( ( rule__Solid__FacetsAssignment_2 )* ) )
			// InternalMyDsl.g:199:2: ( ( rule__Solid__FacetsAssignment_2 ) ) ( ( rule__Solid__FacetsAssignment_2 )* )
			{
			// InternalMyDsl.g:199:2: ( ( rule__Solid__FacetsAssignment_2 ) )
			// InternalMyDsl.g:200:3: ( rule__Solid__FacetsAssignment_2 )
			{
			 before(grammarAccess.getSolidAccess().getFacetsAssignment_2()); 
			// InternalMyDsl.g:201:3: ( rule__Solid__FacetsAssignment_2 )
			// InternalMyDsl.g:201:4: rule__Solid__FacetsAssignment_2
			{
			pushFollow(FOLLOW_6);
			rule__Solid__FacetsAssignment_2();
			state._fsp--;

			}

			 after(grammarAccess.getSolidAccess().getFacetsAssignment_2()); 
			}

			// InternalMyDsl.g:204:2: ( ( rule__Solid__FacetsAssignment_2 )* )
			// InternalMyDsl.g:205:3: ( rule__Solid__FacetsAssignment_2 )*
			{
			 before(grammarAccess.getSolidAccess().getFacetsAssignment_2()); 
			// InternalMyDsl.g:206:3: ( rule__Solid__FacetsAssignment_2 )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==14) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// InternalMyDsl.g:206:4: rule__Solid__FacetsAssignment_2
					{
					pushFollow(FOLLOW_6);
					rule__Solid__FacetsAssignment_2();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}

			 after(grammarAccess.getSolidAccess().getFacetsAssignment_2()); 
			}

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Solid__Group__2__Impl"



	// $ANTLR start "rule__Solid__Group__3"
	// InternalMyDsl.g:215:1: rule__Solid__Group__3 : rule__Solid__Group__3__Impl rule__Solid__Group__4 ;
	public final void rule__Solid__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:219:2: ( rule__Solid__Group__3__Impl rule__Solid__Group__4 )
			// InternalMyDsl.g:220:2: rule__Solid__Group__3__Impl rule__Solid__Group__4
			{
			pushFollow(FOLLOW_3);
			rule__Solid__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Solid__Group__4();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Solid__Group__3"



	// $ANTLR start "rule__Solid__Group__3__Impl"
	// InternalMyDsl.g:227:1: rule__Solid__Group__3__Impl : ( 'endsolid' ) ;
	public final void rule__Solid__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:231:2: ( ( 'endsolid' ) )
			// InternalMyDsl.g:232:2: ( 'endsolid' )
			{
			// InternalMyDsl.g:232:2: ( 'endsolid' )
			// InternalMyDsl.g:233:2: 'endsolid'
			{
			 before(grammarAccess.getSolidAccess().getEndsolidKeyword_3()); 
			match(input,13,FOLLOW_2); 
			 after(grammarAccess.getSolidAccess().getEndsolidKeyword_3()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Solid__Group__3__Impl"



	// $ANTLR start "rule__Solid__Group__4"
	// InternalMyDsl.g:242:1: rule__Solid__Group__4 : rule__Solid__Group__4__Impl ;
	public final void rule__Solid__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:246:2: ( rule__Solid__Group__4__Impl )
			// InternalMyDsl.g:247:2: rule__Solid__Group__4__Impl
			{
			pushFollow(FOLLOW_2);
			rule__Solid__Group__4__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Solid__Group__4"



	// $ANTLR start "rule__Solid__Group__4__Impl"
	// InternalMyDsl.g:253:1: rule__Solid__Group__4__Impl : ( RULE_ID ) ;
	public final void rule__Solid__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:257:2: ( ( RULE_ID ) )
			// InternalMyDsl.g:258:2: ( RULE_ID )
			{
			// InternalMyDsl.g:258:2: ( RULE_ID )
			// InternalMyDsl.g:259:2: RULE_ID
			{
			 before(grammarAccess.getSolidAccess().getIDTerminalRuleCall_4()); 
			match(input,RULE_ID,FOLLOW_2); 
			 after(grammarAccess.getSolidAccess().getIDTerminalRuleCall_4()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Solid__Group__4__Impl"



	// $ANTLR start "rule__Facet__Group__0"
	// InternalMyDsl.g:269:1: rule__Facet__Group__0 : rule__Facet__Group__0__Impl rule__Facet__Group__1 ;
	public final void rule__Facet__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:273:2: ( rule__Facet__Group__0__Impl rule__Facet__Group__1 )
			// InternalMyDsl.g:274:2: rule__Facet__Group__0__Impl rule__Facet__Group__1
			{
			pushFollow(FOLLOW_7);
			rule__Facet__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Facet__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Facet__Group__0"



	// $ANTLR start "rule__Facet__Group__0__Impl"
	// InternalMyDsl.g:281:1: rule__Facet__Group__0__Impl : ( 'facet' ) ;
	public final void rule__Facet__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:285:2: ( ( 'facet' ) )
			// InternalMyDsl.g:286:2: ( 'facet' )
			{
			// InternalMyDsl.g:286:2: ( 'facet' )
			// InternalMyDsl.g:287:2: 'facet'
			{
			 before(grammarAccess.getFacetAccess().getFacetKeyword_0()); 
			match(input,14,FOLLOW_2); 
			 after(grammarAccess.getFacetAccess().getFacetKeyword_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Facet__Group__0__Impl"



	// $ANTLR start "rule__Facet__Group__1"
	// InternalMyDsl.g:296:1: rule__Facet__Group__1 : rule__Facet__Group__1__Impl rule__Facet__Group__2 ;
	public final void rule__Facet__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:300:2: ( rule__Facet__Group__1__Impl rule__Facet__Group__2 )
			// InternalMyDsl.g:301:2: rule__Facet__Group__1__Impl rule__Facet__Group__2
			{
			pushFollow(FOLLOW_8);
			rule__Facet__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Facet__Group__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Facet__Group__1"



	// $ANTLR start "rule__Facet__Group__1__Impl"
	// InternalMyDsl.g:308:1: rule__Facet__Group__1__Impl : ( ( rule__Facet__NormalAssignment_1 ) ) ;
	public final void rule__Facet__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:312:2: ( ( ( rule__Facet__NormalAssignment_1 ) ) )
			// InternalMyDsl.g:313:2: ( ( rule__Facet__NormalAssignment_1 ) )
			{
			// InternalMyDsl.g:313:2: ( ( rule__Facet__NormalAssignment_1 ) )
			// InternalMyDsl.g:314:2: ( rule__Facet__NormalAssignment_1 )
			{
			 before(grammarAccess.getFacetAccess().getNormalAssignment_1()); 
			// InternalMyDsl.g:315:2: ( rule__Facet__NormalAssignment_1 )
			// InternalMyDsl.g:315:3: rule__Facet__NormalAssignment_1
			{
			pushFollow(FOLLOW_2);
			rule__Facet__NormalAssignment_1();
			state._fsp--;

			}

			 after(grammarAccess.getFacetAccess().getNormalAssignment_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Facet__Group__1__Impl"



	// $ANTLR start "rule__Facet__Group__2"
	// InternalMyDsl.g:323:1: rule__Facet__Group__2 : rule__Facet__Group__2__Impl ;
	public final void rule__Facet__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:327:2: ( rule__Facet__Group__2__Impl )
			// InternalMyDsl.g:328:2: rule__Facet__Group__2__Impl
			{
			pushFollow(FOLLOW_2);
			rule__Facet__Group__2__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Facet__Group__2"



	// $ANTLR start "rule__Facet__Group__2__Impl"
	// InternalMyDsl.g:334:1: rule__Facet__Group__2__Impl : ( 'endfacet' ) ;
	public final void rule__Facet__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:338:2: ( ( 'endfacet' ) )
			// InternalMyDsl.g:339:2: ( 'endfacet' )
			{
			// InternalMyDsl.g:339:2: ( 'endfacet' )
			// InternalMyDsl.g:340:2: 'endfacet'
			{
			 before(grammarAccess.getFacetAccess().getEndfacetKeyword_2()); 
			match(input,12,FOLLOW_2); 
			 after(grammarAccess.getFacetAccess().getEndfacetKeyword_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Facet__Group__2__Impl"



	// $ANTLR start "rule__Vector__Group__0"
	// InternalMyDsl.g:350:1: rule__Vector__Group__0 : rule__Vector__Group__0__Impl rule__Vector__Group__1 ;
	public final void rule__Vector__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:354:2: ( rule__Vector__Group__0__Impl rule__Vector__Group__1 )
			// InternalMyDsl.g:355:2: rule__Vector__Group__0__Impl rule__Vector__Group__1
			{
			pushFollow(FOLLOW_9);
			rule__Vector__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Vector__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Vector__Group__0"



	// $ANTLR start "rule__Vector__Group__0__Impl"
	// InternalMyDsl.g:362:1: rule__Vector__Group__0__Impl : ( 'normal' ) ;
	public final void rule__Vector__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:366:2: ( ( 'normal' ) )
			// InternalMyDsl.g:367:2: ( 'normal' )
			{
			// InternalMyDsl.g:367:2: ( 'normal' )
			// InternalMyDsl.g:368:2: 'normal'
			{
			 before(grammarAccess.getVectorAccess().getNormalKeyword_0()); 
			match(input,15,FOLLOW_2); 
			 after(grammarAccess.getVectorAccess().getNormalKeyword_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Vector__Group__0__Impl"



	// $ANTLR start "rule__Vector__Group__1"
	// InternalMyDsl.g:377:1: rule__Vector__Group__1 : rule__Vector__Group__1__Impl rule__Vector__Group__2 ;
	public final void rule__Vector__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:381:2: ( rule__Vector__Group__1__Impl rule__Vector__Group__2 )
			// InternalMyDsl.g:382:2: rule__Vector__Group__1__Impl rule__Vector__Group__2
			{
			pushFollow(FOLLOW_9);
			rule__Vector__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Vector__Group__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Vector__Group__1"



	// $ANTLR start "rule__Vector__Group__1__Impl"
	// InternalMyDsl.g:389:1: rule__Vector__Group__1__Impl : ( ( rule__Vector__XAssignment_1 ) ) ;
	public final void rule__Vector__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:393:2: ( ( ( rule__Vector__XAssignment_1 ) ) )
			// InternalMyDsl.g:394:2: ( ( rule__Vector__XAssignment_1 ) )
			{
			// InternalMyDsl.g:394:2: ( ( rule__Vector__XAssignment_1 ) )
			// InternalMyDsl.g:395:2: ( rule__Vector__XAssignment_1 )
			{
			 before(grammarAccess.getVectorAccess().getXAssignment_1()); 
			// InternalMyDsl.g:396:2: ( rule__Vector__XAssignment_1 )
			// InternalMyDsl.g:396:3: rule__Vector__XAssignment_1
			{
			pushFollow(FOLLOW_2);
			rule__Vector__XAssignment_1();
			state._fsp--;

			}

			 after(grammarAccess.getVectorAccess().getXAssignment_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Vector__Group__1__Impl"



	// $ANTLR start "rule__Vector__Group__2"
	// InternalMyDsl.g:404:1: rule__Vector__Group__2 : rule__Vector__Group__2__Impl rule__Vector__Group__3 ;
	public final void rule__Vector__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:408:2: ( rule__Vector__Group__2__Impl rule__Vector__Group__3 )
			// InternalMyDsl.g:409:2: rule__Vector__Group__2__Impl rule__Vector__Group__3
			{
			pushFollow(FOLLOW_9);
			rule__Vector__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Vector__Group__3();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Vector__Group__2"



	// $ANTLR start "rule__Vector__Group__2__Impl"
	// InternalMyDsl.g:416:1: rule__Vector__Group__2__Impl : ( ( rule__Vector__YAssignment_2 ) ) ;
	public final void rule__Vector__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:420:2: ( ( ( rule__Vector__YAssignment_2 ) ) )
			// InternalMyDsl.g:421:2: ( ( rule__Vector__YAssignment_2 ) )
			{
			// InternalMyDsl.g:421:2: ( ( rule__Vector__YAssignment_2 ) )
			// InternalMyDsl.g:422:2: ( rule__Vector__YAssignment_2 )
			{
			 before(grammarAccess.getVectorAccess().getYAssignment_2()); 
			// InternalMyDsl.g:423:2: ( rule__Vector__YAssignment_2 )
			// InternalMyDsl.g:423:3: rule__Vector__YAssignment_2
			{
			pushFollow(FOLLOW_2);
			rule__Vector__YAssignment_2();
			state._fsp--;

			}

			 after(grammarAccess.getVectorAccess().getYAssignment_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Vector__Group__2__Impl"



	// $ANTLR start "rule__Vector__Group__3"
	// InternalMyDsl.g:431:1: rule__Vector__Group__3 : rule__Vector__Group__3__Impl ;
	public final void rule__Vector__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:435:2: ( rule__Vector__Group__3__Impl )
			// InternalMyDsl.g:436:2: rule__Vector__Group__3__Impl
			{
			pushFollow(FOLLOW_2);
			rule__Vector__Group__3__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Vector__Group__3"



	// $ANTLR start "rule__Vector__Group__3__Impl"
	// InternalMyDsl.g:442:1: rule__Vector__Group__3__Impl : ( ( rule__Vector__ZAssignment_3 ) ) ;
	public final void rule__Vector__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:446:2: ( ( ( rule__Vector__ZAssignment_3 ) ) )
			// InternalMyDsl.g:447:2: ( ( rule__Vector__ZAssignment_3 ) )
			{
			// InternalMyDsl.g:447:2: ( ( rule__Vector__ZAssignment_3 ) )
			// InternalMyDsl.g:448:2: ( rule__Vector__ZAssignment_3 )
			{
			 before(grammarAccess.getVectorAccess().getZAssignment_3()); 
			// InternalMyDsl.g:449:2: ( rule__Vector__ZAssignment_3 )
			// InternalMyDsl.g:449:3: rule__Vector__ZAssignment_3
			{
			pushFollow(FOLLOW_2);
			rule__Vector__ZAssignment_3();
			state._fsp--;

			}

			 after(grammarAccess.getVectorAccess().getZAssignment_3()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Vector__Group__3__Impl"



	// $ANTLR start "rule__Solid__NameAssignment_1"
	// InternalMyDsl.g:458:1: rule__Solid__NameAssignment_1 : ( RULE_ID ) ;
	public final void rule__Solid__NameAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:462:2: ( ( RULE_ID ) )
			// InternalMyDsl.g:463:2: ( RULE_ID )
			{
			// InternalMyDsl.g:463:2: ( RULE_ID )
			// InternalMyDsl.g:464:3: RULE_ID
			{
			 before(grammarAccess.getSolidAccess().getNameIDTerminalRuleCall_1_0()); 
			match(input,RULE_ID,FOLLOW_2); 
			 after(grammarAccess.getSolidAccess().getNameIDTerminalRuleCall_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Solid__NameAssignment_1"



	// $ANTLR start "rule__Solid__FacetsAssignment_2"
	// InternalMyDsl.g:473:1: rule__Solid__FacetsAssignment_2 : ( ruleFacet ) ;
	public final void rule__Solid__FacetsAssignment_2() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:477:2: ( ( ruleFacet ) )
			// InternalMyDsl.g:478:2: ( ruleFacet )
			{
			// InternalMyDsl.g:478:2: ( ruleFacet )
			// InternalMyDsl.g:479:3: ruleFacet
			{
			 before(grammarAccess.getSolidAccess().getFacetsFacetParserRuleCall_2_0()); 
			pushFollow(FOLLOW_2);
			ruleFacet();
			state._fsp--;

			 after(grammarAccess.getSolidAccess().getFacetsFacetParserRuleCall_2_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Solid__FacetsAssignment_2"



	// $ANTLR start "rule__Facet__NormalAssignment_1"
	// InternalMyDsl.g:488:1: rule__Facet__NormalAssignment_1 : ( ruleVector ) ;
	public final void rule__Facet__NormalAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:492:2: ( ( ruleVector ) )
			// InternalMyDsl.g:493:2: ( ruleVector )
			{
			// InternalMyDsl.g:493:2: ( ruleVector )
			// InternalMyDsl.g:494:3: ruleVector
			{
			 before(grammarAccess.getFacetAccess().getNormalVectorParserRuleCall_1_0()); 
			pushFollow(FOLLOW_2);
			ruleVector();
			state._fsp--;

			 after(grammarAccess.getFacetAccess().getNormalVectorParserRuleCall_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Facet__NormalAssignment_1"



	// $ANTLR start "rule__Vector__XAssignment_1"
	// InternalMyDsl.g:503:1: rule__Vector__XAssignment_1 : ( RULE_DOUBLE ) ;
	public final void rule__Vector__XAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:507:2: ( ( RULE_DOUBLE ) )
			// InternalMyDsl.g:508:2: ( RULE_DOUBLE )
			{
			// InternalMyDsl.g:508:2: ( RULE_DOUBLE )
			// InternalMyDsl.g:509:3: RULE_DOUBLE
			{
			 before(grammarAccess.getVectorAccess().getXDOUBLETerminalRuleCall_1_0()); 
			match(input,RULE_DOUBLE,FOLLOW_2); 
			 after(grammarAccess.getVectorAccess().getXDOUBLETerminalRuleCall_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Vector__XAssignment_1"



	// $ANTLR start "rule__Vector__YAssignment_2"
	// InternalMyDsl.g:518:1: rule__Vector__YAssignment_2 : ( RULE_DOUBLE ) ;
	public final void rule__Vector__YAssignment_2() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:522:2: ( ( RULE_DOUBLE ) )
			// InternalMyDsl.g:523:2: ( RULE_DOUBLE )
			{
			// InternalMyDsl.g:523:2: ( RULE_DOUBLE )
			// InternalMyDsl.g:524:3: RULE_DOUBLE
			{
			 before(grammarAccess.getVectorAccess().getYDOUBLETerminalRuleCall_2_0()); 
			match(input,RULE_DOUBLE,FOLLOW_2); 
			 after(grammarAccess.getVectorAccess().getYDOUBLETerminalRuleCall_2_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Vector__YAssignment_2"



	// $ANTLR start "rule__Vector__ZAssignment_3"
	// InternalMyDsl.g:533:1: rule__Vector__ZAssignment_3 : ( RULE_DOUBLE ) ;
	public final void rule__Vector__ZAssignment_3() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMyDsl.g:537:2: ( ( RULE_DOUBLE ) )
			// InternalMyDsl.g:538:2: ( RULE_DOUBLE )
			{
			// InternalMyDsl.g:538:2: ( RULE_DOUBLE )
			// InternalMyDsl.g:539:3: RULE_DOUBLE
			{
			 before(grammarAccess.getVectorAccess().getZDOUBLETerminalRuleCall_3_0()); 
			match(input,RULE_DOUBLE,FOLLOW_2); 
			 after(grammarAccess.getVectorAccess().getZDOUBLETerminalRuleCall_3_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Vector__ZAssignment_3"

	// Delegated rules



	public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
}
