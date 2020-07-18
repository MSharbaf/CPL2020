package org.xtext.example.cpl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.cpl.services.CPLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalCPLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_UNQUOTED_STRING", "RULE_SIMPLE_ID", "RULE_ESCAPED_ID", "RULE_INT", "RULE_SINGLE_QUOTED_STRING", "RULE_ESCAPED_CHARACTER", "RULE_LETTER_CHARACTER", "RULE_DOUBLE_QUOTED_STRING", "RULE_ML_SINGLE_QUOTED_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'conflict'", "'{'", "'inmodel'", "'}'", "'import'", "'domain'", "':'", "'::*'", "'where'", "'or'", "'and'", "'description'", "'of'", "'isEquivalent'", "'isContradict'", "'>'", "'<'", "'='", "'<>'", "'!'", "'>='", "'=<'", "'IN'", "'NotIN'", "'.'", "'->'", "'('", "')'", "'^'", "'^^'", "'context'", "'inv'", "'static'", "'def'", "','", "'include'", "'library'", "'pre'", "'post'", "'body'", "'package'", "'endpackage'", "'derive'", "'init'", "'?'", "'Boolean'", "'Integer'", "'Real'", "'String'", "'UnlimitedNatural'", "'OclAny'", "'OclInvalid'", "'OclMessage'", "'OclState'", "'OclVoid'", "'-'", "'not'", "'not2'", "'*'", "'/'", "'+'", "'<='", "'and2'", "'implies'", "'implies2'", "'or2'", "'xor'", "'xor2'", "'?.'", "'?->'", "'Map'", "'Tuple'", "'::'", "'Set'", "'Bag'", "'Sequence'", "'Collection'", "'OrderedSet'", "'..'", "'++'", "'Lambda'", "'<-'", "'true'", "'false'", "'invalid'", "'null'", "'@'", "'['", "']'", "'in'", "'|'", "';'", "'if'", "'then'", "'else'", "'endif'", "'elseif'", "'let'", "'self'", "'|?'", "'|1'", "'extends'", "'&&'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_INT=8;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=14;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_SINGLE_QUOTED_STRING=9;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_DOUBLE_QUOTED_STRING=12;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int RULE_ESCAPED_ID=7;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int RULE_LETTER_CHARACTER=11;
    public static final int T__19=19;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int RULE_ESCAPED_CHARACTER=10;
    public static final int T__95=95;
    public static final int RULE_ML_SINGLE_QUOTED_STRING=13;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__120=120;
    public static final int RULE_STRING=4;
    public static final int RULE_UNQUOTED_STRING=5;
    public static final int RULE_SL_COMMENT=15;
    public static final int T__77=77;
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int RULE_SIMPLE_ID=6;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=16;
    public static final int RULE_ANY_OTHER=17;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalCPLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCPLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCPLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCPL.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private CPLGrammarAccess grammarAccess;

        public InternalCPLParser(TokenStream input, CPLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "TopLevelCP";
       	}

       	@Override
       	protected CPLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTopLevelCP"
    // InternalCPL.g:70:1: entryRuleTopLevelCP returns [EObject current=null] : iv_ruleTopLevelCP= ruleTopLevelCP EOF ;
    public final EObject entryRuleTopLevelCP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopLevelCP = null;


        try {
            // InternalCPL.g:70:51: (iv_ruleTopLevelCP= ruleTopLevelCP EOF )
            // InternalCPL.g:71:2: iv_ruleTopLevelCP= ruleTopLevelCP EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTopLevelCPRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTopLevelCP=ruleTopLevelCP();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTopLevelCP; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTopLevelCP"


    // $ANTLR start "ruleTopLevelCP"
    // InternalCPL.g:77:1: ruleTopLevelCP returns [EObject current=null] : (otherlv_0= 'conflict' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= '{' ( (lv_ownedImports_3_0= ruleImportCP ) )+ (otherlv_4= 'inmodel' ruleUnrestrictedName otherlv_6= '{' ( (lv_ownedContexts_7_0= ruleContextDeclCS ) )+ otherlv_8= '}' )+ ( (lv_ownedRelation_9_0= ruleRelationCP ) )? ( (lv_ownedMessage_10_0= ruleDescriptionCP ) )? otherlv_11= '}' ) ;
    public final EObject ruleTopLevelCP() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_ownedImports_3_0 = null;

        EObject lv_ownedContexts_7_0 = null;

        EObject lv_ownedRelation_9_0 = null;

        EObject lv_ownedMessage_10_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:83:2: ( (otherlv_0= 'conflict' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= '{' ( (lv_ownedImports_3_0= ruleImportCP ) )+ (otherlv_4= 'inmodel' ruleUnrestrictedName otherlv_6= '{' ( (lv_ownedContexts_7_0= ruleContextDeclCS ) )+ otherlv_8= '}' )+ ( (lv_ownedRelation_9_0= ruleRelationCP ) )? ( (lv_ownedMessage_10_0= ruleDescriptionCP ) )? otherlv_11= '}' ) )
            // InternalCPL.g:84:2: (otherlv_0= 'conflict' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= '{' ( (lv_ownedImports_3_0= ruleImportCP ) )+ (otherlv_4= 'inmodel' ruleUnrestrictedName otherlv_6= '{' ( (lv_ownedContexts_7_0= ruleContextDeclCS ) )+ otherlv_8= '}' )+ ( (lv_ownedRelation_9_0= ruleRelationCP ) )? ( (lv_ownedMessage_10_0= ruleDescriptionCP ) )? otherlv_11= '}' )
            {
            // InternalCPL.g:84:2: (otherlv_0= 'conflict' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= '{' ( (lv_ownedImports_3_0= ruleImportCP ) )+ (otherlv_4= 'inmodel' ruleUnrestrictedName otherlv_6= '{' ( (lv_ownedContexts_7_0= ruleContextDeclCS ) )+ otherlv_8= '}' )+ ( (lv_ownedRelation_9_0= ruleRelationCP ) )? ( (lv_ownedMessage_10_0= ruleDescriptionCP ) )? otherlv_11= '}' )
            // InternalCPL.g:85:3: otherlv_0= 'conflict' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= '{' ( (lv_ownedImports_3_0= ruleImportCP ) )+ (otherlv_4= 'inmodel' ruleUnrestrictedName otherlv_6= '{' ( (lv_ownedContexts_7_0= ruleContextDeclCS ) )+ otherlv_8= '}' )+ ( (lv_ownedRelation_9_0= ruleRelationCP ) )? ( (lv_ownedMessage_10_0= ruleDescriptionCP ) )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTopLevelCPAccess().getConflictKeyword_0());
              		
            }
            // InternalCPL.g:89:3: ( (lv_name_1_0= ruleIdentifier ) )
            // InternalCPL.g:90:4: (lv_name_1_0= ruleIdentifier )
            {
            // InternalCPL.g:90:4: (lv_name_1_0= ruleIdentifier )
            // InternalCPL.g:91:5: lv_name_1_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTopLevelCPAccess().getNameIdentifierParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_4);
            lv_name_1_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTopLevelCPRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.ocl.xtext.base.Base.Identifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTopLevelCPAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalCPL.g:112:3: ( (lv_ownedImports_3_0= ruleImportCP ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=22 && LA1_0<=23)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCPL.g:113:4: (lv_ownedImports_3_0= ruleImportCP )
            	    {
            	    // InternalCPL.g:113:4: (lv_ownedImports_3_0= ruleImportCP )
            	    // InternalCPL.g:114:5: lv_ownedImports_3_0= ruleImportCP
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getTopLevelCPAccess().getOwnedImportsImportCPParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_ownedImports_3_0=ruleImportCP();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getTopLevelCPRule());
            	      					}
            	      					add(
            	      						current,
            	      						"ownedImports",
            	      						lv_ownedImports_3_0,
            	      						"org.xtext.example.cpl.CPL.ImportCP");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // InternalCPL.g:131:3: (otherlv_4= 'inmodel' ruleUnrestrictedName otherlv_6= '{' ( (lv_ownedContexts_7_0= ruleContextDeclCS ) )+ otherlv_8= '}' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==20) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCPL.g:132:4: otherlv_4= 'inmodel' ruleUnrestrictedName otherlv_6= '{' ( (lv_ownedContexts_7_0= ruleContextDeclCS ) )+ otherlv_8= '}'
            	    {
            	    otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getTopLevelCPAccess().getInmodelKeyword_4_0());
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				/* */
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getTopLevelCPAccess().getUnrestrictedNameParserRuleCall_4_1());
            	      			
            	    }
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    ruleUnrestrictedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_6, grammarAccess.getTopLevelCPAccess().getLeftCurlyBracketKeyword_4_2());
            	      			
            	    }
            	    // InternalCPL.g:150:4: ( (lv_ownedContexts_7_0= ruleContextDeclCS ) )+
            	    int cnt2=0;
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==48) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalCPL.g:151:5: (lv_ownedContexts_7_0= ruleContextDeclCS )
            	    	    {
            	    	    // InternalCPL.g:151:5: (lv_ownedContexts_7_0= ruleContextDeclCS )
            	    	    // InternalCPL.g:152:6: lv_ownedContexts_7_0= ruleContextDeclCS
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      						newCompositeNode(grammarAccess.getTopLevelCPAccess().getOwnedContextsContextDeclCSParserRuleCall_4_3_0());
            	    	      					
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_9);
            	    	    lv_ownedContexts_7_0=ruleContextDeclCS();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      						if (current==null) {
            	    	      							current = createModelElementForParent(grammarAccess.getTopLevelCPRule());
            	    	      						}
            	    	      						add(
            	    	      							current,
            	    	      							"ownedContexts",
            	    	      							lv_ownedContexts_7_0,
            	    	      							"org.eclipse.ocl.xtext.completeocl.CompleteOCL.ContextDeclCS");
            	    	      						afterParserOrEnumRuleCall();
            	    	      					
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt2 >= 1 ) break loop2;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(2, input);
            	                throw eee;
            	        }
            	        cnt2++;
            	    } while (true);

            	    otherlv_8=(Token)match(input,21,FollowSets000.FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_8, grammarAccess.getTopLevelCPAccess().getRightCurlyBracketKeyword_4_4());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            // InternalCPL.g:174:3: ( (lv_ownedRelation_9_0= ruleRelationCP ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==26) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalCPL.g:175:4: (lv_ownedRelation_9_0= ruleRelationCP )
                    {
                    // InternalCPL.g:175:4: (lv_ownedRelation_9_0= ruleRelationCP )
                    // InternalCPL.g:176:5: lv_ownedRelation_9_0= ruleRelationCP
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTopLevelCPAccess().getOwnedRelationRelationCPParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_11);
                    lv_ownedRelation_9_0=ruleRelationCP();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTopLevelCPRule());
                      					}
                      					add(
                      						current,
                      						"ownedRelation",
                      						lv_ownedRelation_9_0,
                      						"org.xtext.example.cpl.CPL.RelationCP");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCPL.g:193:3: ( (lv_ownedMessage_10_0= ruleDescriptionCP ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==29) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalCPL.g:194:4: (lv_ownedMessage_10_0= ruleDescriptionCP )
                    {
                    // InternalCPL.g:194:4: (lv_ownedMessage_10_0= ruleDescriptionCP )
                    // InternalCPL.g:195:5: lv_ownedMessage_10_0= ruleDescriptionCP
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTopLevelCPAccess().getOwnedMessageDescriptionCPParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_12);
                    lv_ownedMessage_10_0=ruleDescriptionCP();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTopLevelCPRule());
                      					}
                      					add(
                      						current,
                      						"ownedMessage",
                      						lv_ownedMessage_10_0,
                      						"org.xtext.example.cpl.CPL.DescriptionCP");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getTopLevelCPAccess().getRightCurlyBracketKeyword_7());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTopLevelCP"


    // $ANTLR start "entryRuleImportCP"
    // InternalCPL.g:220:1: entryRuleImportCP returns [EObject current=null] : iv_ruleImportCP= ruleImportCP EOF ;
    public final EObject entryRuleImportCP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportCP = null;


        try {
            // InternalCPL.g:220:49: (iv_ruleImportCP= ruleImportCP EOF )
            // InternalCPL.g:221:2: iv_ruleImportCP= ruleImportCP EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportCPRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleImportCP=ruleImportCP();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportCP; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImportCP"


    // $ANTLR start "ruleImportCP"
    // InternalCPL.g:227:1: ruleImportCP returns [EObject current=null] : ( (otherlv_0= 'import' | otherlv_1= 'domain' ) ( ( (lv_name_2_0= ruleIdentifier ) ) otherlv_3= ':' )? ( (lv_ownedPathName_4_0= ruleURIPathNameCS ) ) ( (lv_isAll_5_0= '::*' ) )? ) ;
    public final EObject ruleImportCP() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_isAll_5_0=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_ownedPathName_4_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:233:2: ( ( (otherlv_0= 'import' | otherlv_1= 'domain' ) ( ( (lv_name_2_0= ruleIdentifier ) ) otherlv_3= ':' )? ( (lv_ownedPathName_4_0= ruleURIPathNameCS ) ) ( (lv_isAll_5_0= '::*' ) )? ) )
            // InternalCPL.g:234:2: ( (otherlv_0= 'import' | otherlv_1= 'domain' ) ( ( (lv_name_2_0= ruleIdentifier ) ) otherlv_3= ':' )? ( (lv_ownedPathName_4_0= ruleURIPathNameCS ) ) ( (lv_isAll_5_0= '::*' ) )? )
            {
            // InternalCPL.g:234:2: ( (otherlv_0= 'import' | otherlv_1= 'domain' ) ( ( (lv_name_2_0= ruleIdentifier ) ) otherlv_3= ':' )? ( (lv_ownedPathName_4_0= ruleURIPathNameCS ) ) ( (lv_isAll_5_0= '::*' ) )? )
            // InternalCPL.g:235:3: (otherlv_0= 'import' | otherlv_1= 'domain' ) ( ( (lv_name_2_0= ruleIdentifier ) ) otherlv_3= ':' )? ( (lv_ownedPathName_4_0= ruleURIPathNameCS ) ) ( (lv_isAll_5_0= '::*' ) )?
            {
            // InternalCPL.g:235:3: (otherlv_0= 'import' | otherlv_1= 'domain' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            else if ( (LA6_0==23) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalCPL.g:236:4: otherlv_0= 'import'
                    {
                    otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getImportCPAccess().getImportKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalCPL.g:241:4: otherlv_1= 'domain'
                    {
                    otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getImportCPAccess().getDomainKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalCPL.g:246:3: ( ( (lv_name_2_0= ruleIdentifier ) ) otherlv_3= ':' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_SIMPLE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==24) ) {
                    alt7=1;
                }
            }
            else if ( (LA7_0==RULE_ESCAPED_ID) ) {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==24) ) {
                    alt7=1;
                }
            }
            switch (alt7) {
                case 1 :
                    // InternalCPL.g:247:4: ( (lv_name_2_0= ruleIdentifier ) ) otherlv_3= ':'
                    {
                    // InternalCPL.g:247:4: ( (lv_name_2_0= ruleIdentifier ) )
                    // InternalCPL.g:248:5: (lv_name_2_0= ruleIdentifier )
                    {
                    // InternalCPL.g:248:5: (lv_name_2_0= ruleIdentifier )
                    // InternalCPL.g:249:6: lv_name_2_0= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getImportCPAccess().getNameIdentifierParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_14);
                    lv_name_2_0=ruleIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getImportCPRule());
                      						}
                      						set(
                      							current,
                      							"name",
                      							lv_name_2_0,
                      							"org.eclipse.ocl.xtext.base.Base.Identifier");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getImportCPAccess().getColonKeyword_1_1());
                      			
                    }

                    }
                    break;

            }

            // InternalCPL.g:271:3: ( (lv_ownedPathName_4_0= ruleURIPathNameCS ) )
            // InternalCPL.g:272:4: (lv_ownedPathName_4_0= ruleURIPathNameCS )
            {
            // InternalCPL.g:272:4: (lv_ownedPathName_4_0= ruleURIPathNameCS )
            // InternalCPL.g:273:5: lv_ownedPathName_4_0= ruleURIPathNameCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getImportCPAccess().getOwnedPathNameURIPathNameCSParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_15);
            lv_ownedPathName_4_0=ruleURIPathNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getImportCPRule());
              					}
              					set(
              						current,
              						"ownedPathName",
              						lv_ownedPathName_4_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.URIPathNameCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCPL.g:290:3: ( (lv_isAll_5_0= '::*' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalCPL.g:291:4: (lv_isAll_5_0= '::*' )
                    {
                    // InternalCPL.g:291:4: (lv_isAll_5_0= '::*' )
                    // InternalCPL.g:292:5: lv_isAll_5_0= '::*'
                    {
                    lv_isAll_5_0=(Token)match(input,25,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isAll_5_0, grammarAccess.getImportCPAccess().getIsAllColonColonAsteriskKeyword_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getImportCPRule());
                      					}
                      					setWithLastConsumed(current, "isAll", true, "::*");
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImportCP"


    // $ANTLR start "entryRuleRelationCP"
    // InternalCPL.g:308:1: entryRuleRelationCP returns [EObject current=null] : iv_ruleRelationCP= ruleRelationCP EOF ;
    public final EObject entryRuleRelationCP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationCP = null;


        try {
            // InternalCPL.g:308:51: (iv_ruleRelationCP= ruleRelationCP EOF )
            // InternalCPL.g:309:2: iv_ruleRelationCP= ruleRelationCP EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationCPRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRelationCP=ruleRelationCP();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationCP; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationCP"


    // $ANTLR start "ruleRelationCP"
    // InternalCPL.g:315:1: ruleRelationCP returns [EObject current=null] : (otherlv_0= 'where' otherlv_1= '{' ( (otherlv_2= 'or' | otherlv_3= 'and' )? ( (lv_ownedConditions_4_0= ruleConditionCS ) ) )+ otherlv_5= '}' ) ;
    public final EObject ruleRelationCP() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedConditions_4_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:321:2: ( (otherlv_0= 'where' otherlv_1= '{' ( (otherlv_2= 'or' | otherlv_3= 'and' )? ( (lv_ownedConditions_4_0= ruleConditionCS ) ) )+ otherlv_5= '}' ) )
            // InternalCPL.g:322:2: (otherlv_0= 'where' otherlv_1= '{' ( (otherlv_2= 'or' | otherlv_3= 'and' )? ( (lv_ownedConditions_4_0= ruleConditionCS ) ) )+ otherlv_5= '}' )
            {
            // InternalCPL.g:322:2: (otherlv_0= 'where' otherlv_1= '{' ( (otherlv_2= 'or' | otherlv_3= 'and' )? ( (lv_ownedConditions_4_0= ruleConditionCS ) ) )+ otherlv_5= '}' )
            // InternalCPL.g:323:3: otherlv_0= 'where' otherlv_1= '{' ( (otherlv_2= 'or' | otherlv_3= 'and' )? ( (lv_ownedConditions_4_0= ruleConditionCS ) ) )+ otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRelationCPAccess().getWhereKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRelationCPAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalCPL.g:331:3: ( (otherlv_2= 'or' | otherlv_3= 'and' )? ( (lv_ownedConditions_4_0= ruleConditionCS ) ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_SIMPLE_ID && LA10_0<=RULE_ESCAPED_ID)||LA10_0==22||(LA10_0>=27 && LA10_0<=28)||(LA10_0>=31 && LA10_0<=41)||(LA10_0>=53 && LA10_0<=54)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCPL.g:332:4: (otherlv_2= 'or' | otherlv_3= 'and' )? ( (lv_ownedConditions_4_0= ruleConditionCS ) )
            	    {
            	    // InternalCPL.g:332:4: (otherlv_2= 'or' | otherlv_3= 'and' )?
            	    int alt9=3;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==27) ) {
            	        alt9=1;
            	    }
            	    else if ( (LA9_0==28) ) {
            	        alt9=2;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // InternalCPL.g:333:5: otherlv_2= 'or'
            	            {
            	            otherlv_2=(Token)match(input,27,FollowSets000.FOLLOW_16); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(otherlv_2, grammarAccess.getRelationCPAccess().getOrKeyword_2_0_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalCPL.g:338:5: otherlv_3= 'and'
            	            {
            	            otherlv_3=(Token)match(input,28,FollowSets000.FOLLOW_16); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(otherlv_3, grammarAccess.getRelationCPAccess().getAndKeyword_2_0_1());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    // InternalCPL.g:343:4: ( (lv_ownedConditions_4_0= ruleConditionCS ) )
            	    // InternalCPL.g:344:5: (lv_ownedConditions_4_0= ruleConditionCS )
            	    {
            	    // InternalCPL.g:344:5: (lv_ownedConditions_4_0= ruleConditionCS )
            	    // InternalCPL.g:345:6: lv_ownedConditions_4_0= ruleConditionCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getRelationCPAccess().getOwnedConditionsConditionCSParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_17);
            	    lv_ownedConditions_4_0=ruleConditionCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getRelationCPRule());
            	      						}
            	      						add(
            	      							current,
            	      							"ownedConditions",
            	      							lv_ownedConditions_4_0,
            	      							"org.xtext.example.cpl.CPL.ConditionCS");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getRelationCPAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationCP"


    // $ANTLR start "entryRuleDescriptionCP"
    // InternalCPL.g:371:1: entryRuleDescriptionCP returns [EObject current=null] : iv_ruleDescriptionCP= ruleDescriptionCP EOF ;
    public final EObject entryRuleDescriptionCP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescriptionCP = null;


        try {
            // InternalCPL.g:371:54: (iv_ruleDescriptionCP= ruleDescriptionCP EOF )
            // InternalCPL.g:372:2: iv_ruleDescriptionCP= ruleDescriptionCP EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDescriptionCPRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDescriptionCP=ruleDescriptionCP();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDescriptionCP; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDescriptionCP"


    // $ANTLR start "ruleDescriptionCP"
    // InternalCPL.g:378:1: ruleDescriptionCP returns [EObject current=null] : (otherlv_0= 'description' (otherlv_1= 'of' ( (lv_name_2_0= ruleIdentifier ) ) otherlv_3= 'conflict' )? otherlv_4= '{' ( (lv_ownedExpression_5_0= RULE_STRING ) ) otherlv_6= '}' ) ;
    public final EObject ruleDescriptionCP() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_ownedExpression_5_0=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:384:2: ( (otherlv_0= 'description' (otherlv_1= 'of' ( (lv_name_2_0= ruleIdentifier ) ) otherlv_3= 'conflict' )? otherlv_4= '{' ( (lv_ownedExpression_5_0= RULE_STRING ) ) otherlv_6= '}' ) )
            // InternalCPL.g:385:2: (otherlv_0= 'description' (otherlv_1= 'of' ( (lv_name_2_0= ruleIdentifier ) ) otherlv_3= 'conflict' )? otherlv_4= '{' ( (lv_ownedExpression_5_0= RULE_STRING ) ) otherlv_6= '}' )
            {
            // InternalCPL.g:385:2: (otherlv_0= 'description' (otherlv_1= 'of' ( (lv_name_2_0= ruleIdentifier ) ) otherlv_3= 'conflict' )? otherlv_4= '{' ( (lv_ownedExpression_5_0= RULE_STRING ) ) otherlv_6= '}' )
            // InternalCPL.g:386:3: otherlv_0= 'description' (otherlv_1= 'of' ( (lv_name_2_0= ruleIdentifier ) ) otherlv_3= 'conflict' )? otherlv_4= '{' ( (lv_ownedExpression_5_0= RULE_STRING ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDescriptionCPAccess().getDescriptionKeyword_0());
              		
            }
            // InternalCPL.g:390:3: (otherlv_1= 'of' ( (lv_name_2_0= ruleIdentifier ) ) otherlv_3= 'conflict' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCPL.g:391:4: otherlv_1= 'of' ( (lv_name_2_0= ruleIdentifier ) ) otherlv_3= 'conflict'
                    {
                    otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getDescriptionCPAccess().getOfKeyword_1_0());
                      			
                    }
                    // InternalCPL.g:395:4: ( (lv_name_2_0= ruleIdentifier ) )
                    // InternalCPL.g:396:5: (lv_name_2_0= ruleIdentifier )
                    {
                    // InternalCPL.g:396:5: (lv_name_2_0= ruleIdentifier )
                    // InternalCPL.g:397:6: lv_name_2_0= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDescriptionCPAccess().getNameIdentifierParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_19);
                    lv_name_2_0=ruleIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDescriptionCPRule());
                      						}
                      						set(
                      							current,
                      							"name",
                      							lv_name_2_0,
                      							"org.eclipse.ocl.xtext.base.Base.Identifier");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getDescriptionCPAccess().getConflictKeyword_1_2());
                      			
                    }

                    }
                    break;

            }

            otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDescriptionCPAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalCPL.g:423:3: ( (lv_ownedExpression_5_0= RULE_STRING ) )
            // InternalCPL.g:424:4: (lv_ownedExpression_5_0= RULE_STRING )
            {
            // InternalCPL.g:424:4: (lv_ownedExpression_5_0= RULE_STRING )
            // InternalCPL.g:425:5: lv_ownedExpression_5_0= RULE_STRING
            {
            lv_ownedExpression_5_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_ownedExpression_5_0, grammarAccess.getDescriptionCPAccess().getOwnedExpressionSTRINGTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDescriptionCPRule());
              					}
              					setWithLastConsumed(
              						current,
              						"ownedExpression",
              						lv_ownedExpression_5_0,
              						"org.xtext.example.cpl.CPL.STRING");
              				
            }

            }


            }

            otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDescriptionCPAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDescriptionCP"


    // $ANTLR start "entryRuleConditionCS"
    // InternalCPL.g:449:1: entryRuleConditionCS returns [EObject current=null] : iv_ruleConditionCS= ruleConditionCS EOF ;
    public final EObject entryRuleConditionCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionCS = null;


        try {
            // InternalCPL.g:449:52: (iv_ruleConditionCS= ruleConditionCS EOF )
            // InternalCPL.g:450:2: iv_ruleConditionCS= ruleConditionCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleConditionCS=ruleConditionCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditionCS"


    // $ANTLR start "ruleConditionCS"
    // InternalCPL.g:456:1: ruleConditionCS returns [EObject current=null] : ( ( (lv_ownedElementA_0_0= ruleFQN ) )? (otherlv_1= 'isEquivalent' | otherlv_2= 'isContradict' | otherlv_3= '>' | otherlv_4= '<' | otherlv_5= '=' | otherlv_6= '<>' | otherlv_7= '!' | otherlv_8= '>=' | otherlv_9= '=<' | otherlv_10= 'IN' | otherlv_11= 'NotIN' )? ( (lv_ownedElementB_12_0= ruleFQN ) ) ) ;
    public final EObject ruleConditionCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_ownedElementA_0_0 = null;

        AntlrDatatypeRuleToken lv_ownedElementB_12_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:462:2: ( ( ( (lv_ownedElementA_0_0= ruleFQN ) )? (otherlv_1= 'isEquivalent' | otherlv_2= 'isContradict' | otherlv_3= '>' | otherlv_4= '<' | otherlv_5= '=' | otherlv_6= '<>' | otherlv_7= '!' | otherlv_8= '>=' | otherlv_9= '=<' | otherlv_10= 'IN' | otherlv_11= 'NotIN' )? ( (lv_ownedElementB_12_0= ruleFQN ) ) ) )
            // InternalCPL.g:463:2: ( ( (lv_ownedElementA_0_0= ruleFQN ) )? (otherlv_1= 'isEquivalent' | otherlv_2= 'isContradict' | otherlv_3= '>' | otherlv_4= '<' | otherlv_5= '=' | otherlv_6= '<>' | otherlv_7= '!' | otherlv_8= '>=' | otherlv_9= '=<' | otherlv_10= 'IN' | otherlv_11= 'NotIN' )? ( (lv_ownedElementB_12_0= ruleFQN ) ) )
            {
            // InternalCPL.g:463:2: ( ( (lv_ownedElementA_0_0= ruleFQN ) )? (otherlv_1= 'isEquivalent' | otherlv_2= 'isContradict' | otherlv_3= '>' | otherlv_4= '<' | otherlv_5= '=' | otherlv_6= '<>' | otherlv_7= '!' | otherlv_8= '>=' | otherlv_9= '=<' | otherlv_10= 'IN' | otherlv_11= 'NotIN' )? ( (lv_ownedElementB_12_0= ruleFQN ) ) )
            // InternalCPL.g:464:3: ( (lv_ownedElementA_0_0= ruleFQN ) )? (otherlv_1= 'isEquivalent' | otherlv_2= 'isContradict' | otherlv_3= '>' | otherlv_4= '<' | otherlv_5= '=' | otherlv_6= '<>' | otherlv_7= '!' | otherlv_8= '>=' | otherlv_9= '=<' | otherlv_10= 'IN' | otherlv_11= 'NotIN' )? ( (lv_ownedElementB_12_0= ruleFQN ) )
            {
            // InternalCPL.g:464:3: ( (lv_ownedElementA_0_0= ruleFQN ) )?
            int alt12=2;
            switch ( input.LA(1) ) {
                case RULE_SIMPLE_ID:
                    {
                    int LA12_1 = input.LA(2);

                    if ( (synpred13_InternalCPL()) ) {
                        alt12=1;
                    }
                    }
                    break;
                case RULE_ESCAPED_ID:
                    {
                    int LA12_2 = input.LA(2);

                    if ( (synpred13_InternalCPL()) ) {
                        alt12=1;
                    }
                    }
                    break;
                case 22:
                    {
                    int LA12_3 = input.LA(2);

                    if ( (synpred13_InternalCPL()) ) {
                        alt12=1;
                    }
                    }
                    break;
                case 53:
                    {
                    int LA12_4 = input.LA(2);

                    if ( (synpred13_InternalCPL()) ) {
                        alt12=1;
                    }
                    }
                    break;
                case 54:
                    {
                    int LA12_5 = input.LA(2);

                    if ( (synpred13_InternalCPL()) ) {
                        alt12=1;
                    }
                    }
                    break;
            }

            switch (alt12) {
                case 1 :
                    // InternalCPL.g:465:4: (lv_ownedElementA_0_0= ruleFQN )
                    {
                    // InternalCPL.g:465:4: (lv_ownedElementA_0_0= ruleFQN )
                    // InternalCPL.g:466:5: lv_ownedElementA_0_0= ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getConditionCSAccess().getOwnedElementAFQNParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_21);
                    lv_ownedElementA_0_0=ruleFQN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getConditionCSRule());
                      					}
                      					set(
                      						current,
                      						"ownedElementA",
                      						lv_ownedElementA_0_0,
                      						"org.xtext.example.cpl.CPL.FQN");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCPL.g:483:3: (otherlv_1= 'isEquivalent' | otherlv_2= 'isContradict' | otherlv_3= '>' | otherlv_4= '<' | otherlv_5= '=' | otherlv_6= '<>' | otherlv_7= '!' | otherlv_8= '>=' | otherlv_9= '=<' | otherlv_10= 'IN' | otherlv_11= 'NotIN' )?
            int alt13=12;
            switch ( input.LA(1) ) {
                case 31:
                    {
                    alt13=1;
                    }
                    break;
                case 32:
                    {
                    alt13=2;
                    }
                    break;
                case 33:
                    {
                    alt13=3;
                    }
                    break;
                case 34:
                    {
                    alt13=4;
                    }
                    break;
                case 35:
                    {
                    alt13=5;
                    }
                    break;
                case 36:
                    {
                    alt13=6;
                    }
                    break;
                case 37:
                    {
                    alt13=7;
                    }
                    break;
                case 38:
                    {
                    alt13=8;
                    }
                    break;
                case 39:
                    {
                    alt13=9;
                    }
                    break;
                case 40:
                    {
                    alt13=10;
                    }
                    break;
                case 41:
                    {
                    alt13=11;
                    }
                    break;
            }

            switch (alt13) {
                case 1 :
                    // InternalCPL.g:484:4: otherlv_1= 'isEquivalent'
                    {
                    otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getConditionCSAccess().getIsEquivalentKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalCPL.g:489:4: otherlv_2= 'isContradict'
                    {
                    otherlv_2=(Token)match(input,32,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getConditionCSAccess().getIsContradictKeyword_1_1());
                      			
                    }

                    }
                    break;
                case 3 :
                    // InternalCPL.g:494:4: otherlv_3= '>'
                    {
                    otherlv_3=(Token)match(input,33,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getConditionCSAccess().getGreaterThanSignKeyword_1_2());
                      			
                    }

                    }
                    break;
                case 4 :
                    // InternalCPL.g:499:4: otherlv_4= '<'
                    {
                    otherlv_4=(Token)match(input,34,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getConditionCSAccess().getLessThanSignKeyword_1_3());
                      			
                    }

                    }
                    break;
                case 5 :
                    // InternalCPL.g:504:4: otherlv_5= '='
                    {
                    otherlv_5=(Token)match(input,35,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getConditionCSAccess().getEqualsSignKeyword_1_4());
                      			
                    }

                    }
                    break;
                case 6 :
                    // InternalCPL.g:509:4: otherlv_6= '<>'
                    {
                    otherlv_6=(Token)match(input,36,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getConditionCSAccess().getLessThanSignGreaterThanSignKeyword_1_5());
                      			
                    }

                    }
                    break;
                case 7 :
                    // InternalCPL.g:514:4: otherlv_7= '!'
                    {
                    otherlv_7=(Token)match(input,37,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getConditionCSAccess().getExclamationMarkKeyword_1_6());
                      			
                    }

                    }
                    break;
                case 8 :
                    // InternalCPL.g:519:4: otherlv_8= '>='
                    {
                    otherlv_8=(Token)match(input,38,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getConditionCSAccess().getGreaterThanSignEqualsSignKeyword_1_7());
                      			
                    }

                    }
                    break;
                case 9 :
                    // InternalCPL.g:524:4: otherlv_9= '=<'
                    {
                    otherlv_9=(Token)match(input,39,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getConditionCSAccess().getEqualsSignLessThanSignKeyword_1_8());
                      			
                    }

                    }
                    break;
                case 10 :
                    // InternalCPL.g:529:4: otherlv_10= 'IN'
                    {
                    otherlv_10=(Token)match(input,40,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getConditionCSAccess().getINKeyword_1_9());
                      			
                    }

                    }
                    break;
                case 11 :
                    // InternalCPL.g:534:4: otherlv_11= 'NotIN'
                    {
                    otherlv_11=(Token)match(input,41,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getConditionCSAccess().getNotINKeyword_1_10());
                      			
                    }

                    }
                    break;

            }

            // InternalCPL.g:539:3: ( (lv_ownedElementB_12_0= ruleFQN ) )
            // InternalCPL.g:540:4: (lv_ownedElementB_12_0= ruleFQN )
            {
            // InternalCPL.g:540:4: (lv_ownedElementB_12_0= ruleFQN )
            // InternalCPL.g:541:5: lv_ownedElementB_12_0= ruleFQN
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConditionCSAccess().getOwnedElementBFQNParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_ownedElementB_12_0=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConditionCSRule());
              					}
              					set(
              						current,
              						"ownedElementB",
              						lv_ownedElementB_12_0,
              						"org.xtext.example.cpl.CPL.FQN");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditionCS"


    // $ANTLR start "entryRuleFQN"
    // InternalCPL.g:562:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalCPL.g:562:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalCPL.g:563:2: iv_ruleFQN= ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFQNRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFQN=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFQN.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // InternalCPL.g:569:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_UnrestrictedName_0= ruleUnrestrictedName | this_ID_1= ruleID ) ( (kw= '.' | kw= '->' ) (this_UnrestrictedName_4= ruleUnrestrictedName | this_ID_5= ruleID ) (kw= '(' )? (kw= ')' )? )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_UnrestrictedName_0 = null;

        AntlrDatatypeRuleToken this_ID_1 = null;

        AntlrDatatypeRuleToken this_UnrestrictedName_4 = null;

        AntlrDatatypeRuleToken this_ID_5 = null;



        	enterRule();

        try {
            // InternalCPL.g:575:2: ( ( (this_UnrestrictedName_0= ruleUnrestrictedName | this_ID_1= ruleID ) ( (kw= '.' | kw= '->' ) (this_UnrestrictedName_4= ruleUnrestrictedName | this_ID_5= ruleID ) (kw= '(' )? (kw= ')' )? )* ) )
            // InternalCPL.g:576:2: ( (this_UnrestrictedName_0= ruleUnrestrictedName | this_ID_1= ruleID ) ( (kw= '.' | kw= '->' ) (this_UnrestrictedName_4= ruleUnrestrictedName | this_ID_5= ruleID ) (kw= '(' )? (kw= ')' )? )* )
            {
            // InternalCPL.g:576:2: ( (this_UnrestrictedName_0= ruleUnrestrictedName | this_ID_1= ruleID ) ( (kw= '.' | kw= '->' ) (this_UnrestrictedName_4= ruleUnrestrictedName | this_ID_5= ruleID ) (kw= '(' )? (kw= ')' )? )* )
            // InternalCPL.g:577:3: (this_UnrestrictedName_0= ruleUnrestrictedName | this_ID_1= ruleID ) ( (kw= '.' | kw= '->' ) (this_UnrestrictedName_4= ruleUnrestrictedName | this_ID_5= ruleID ) (kw= '(' )? (kw= ')' )? )*
            {
            // InternalCPL.g:577:3: (this_UnrestrictedName_0= ruleUnrestrictedName | this_ID_1= ruleID )
            int alt14=2;
            switch ( input.LA(1) ) {
            case RULE_SIMPLE_ID:
                {
                int LA14_1 = input.LA(2);

                if ( (synpred25_InternalCPL()) ) {
                    alt14=1;
                }
                else if ( (true) ) {
                    alt14=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ESCAPED_ID:
                {
                int LA14_2 = input.LA(2);

                if ( (synpred25_InternalCPL()) ) {
                    alt14=1;
                }
                else if ( (true) ) {
                    alt14=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 2, input);

                    throw nvae;
                }
                }
                break;
            case 22:
            case 53:
            case 54:
                {
                alt14=1;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalCPL.g:578:4: this_UnrestrictedName_0= ruleUnrestrictedName
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getFQNAccess().getUnrestrictedNameParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_22);
                    this_UnrestrictedName_0=ruleUnrestrictedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_UnrestrictedName_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalCPL.g:589:4: this_ID_1= ruleID
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getFQNAccess().getIDParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_22);
                    this_ID_1=ruleID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ID_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalCPL.g:600:3: ( (kw= '.' | kw= '->' ) (this_UnrestrictedName_4= ruleUnrestrictedName | this_ID_5= ruleID ) (kw= '(' )? (kw= ')' )? )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=42 && LA19_0<=43)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalCPL.g:601:4: (kw= '.' | kw= '->' ) (this_UnrestrictedName_4= ruleUnrestrictedName | this_ID_5= ruleID ) (kw= '(' )? (kw= ')' )?
            	    {
            	    // InternalCPL.g:601:4: (kw= '.' | kw= '->' )
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==42) ) {
            	        alt15=1;
            	    }
            	    else if ( (LA15_0==43) ) {
            	        alt15=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // InternalCPL.g:602:5: kw= '.'
            	            {
            	            kw=(Token)match(input,42,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalCPL.g:608:5: kw= '->'
            	            {
            	            kw=(Token)match(input,43,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getFQNAccess().getHyphenMinusGreaterThanSignKeyword_1_0_1());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    // InternalCPL.g:614:4: (this_UnrestrictedName_4= ruleUnrestrictedName | this_ID_5= ruleID )
            	    int alt16=2;
            	    switch ( input.LA(1) ) {
            	    case RULE_SIMPLE_ID:
            	        {
            	        int LA16_1 = input.LA(2);

            	        if ( (synpred27_InternalCPL()) ) {
            	            alt16=1;
            	        }
            	        else if ( (true) ) {
            	            alt16=2;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 16, 1, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case RULE_ESCAPED_ID:
            	        {
            	        int LA16_2 = input.LA(2);

            	        if ( (synpred27_InternalCPL()) ) {
            	            alt16=1;
            	        }
            	        else if ( (true) ) {
            	            alt16=2;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 16, 2, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 22:
            	    case 53:
            	    case 54:
            	        {
            	        alt16=1;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt16) {
            	        case 1 :
            	            // InternalCPL.g:615:5: this_UnrestrictedName_4= ruleUnrestrictedName
            	            {
            	            if ( state.backtracking==0 ) {

            	              					newCompositeNode(grammarAccess.getFQNAccess().getUnrestrictedNameParserRuleCall_1_1_0());
            	              				
            	            }
            	            pushFollow(FollowSets000.FOLLOW_23);
            	            this_UnrestrictedName_4=ruleUnrestrictedName();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(this_UnrestrictedName_4);
            	              				
            	            }
            	            if ( state.backtracking==0 ) {

            	              					afterParserOrEnumRuleCall();
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalCPL.g:626:5: this_ID_5= ruleID
            	            {
            	            if ( state.backtracking==0 ) {

            	              					newCompositeNode(grammarAccess.getFQNAccess().getIDParserRuleCall_1_1_1());
            	              				
            	            }
            	            pushFollow(FollowSets000.FOLLOW_23);
            	            this_ID_5=ruleID();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(this_ID_5);
            	              				
            	            }
            	            if ( state.backtracking==0 ) {

            	              					afterParserOrEnumRuleCall();
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    // InternalCPL.g:637:4: (kw= '(' )?
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==44) ) {
            	        alt17=1;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // InternalCPL.g:638:5: kw= '('
            	            {
            	            kw=(Token)match(input,44,FollowSets000.FOLLOW_24); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getFQNAccess().getLeftParenthesisKeyword_1_2());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    // InternalCPL.g:644:4: (kw= ')' )?
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==45) ) {
            	        alt18=1;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // InternalCPL.g:645:5: kw= ')'
            	            {
            	            kw=(Token)match(input,45,FollowSets000.FOLLOW_22); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getFQNAccess().getRightParenthesisKeyword_1_3());
            	              				
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleCompleteOCLNavigationOperatorName"
    // InternalCPL.g:656:1: entryRuleCompleteOCLNavigationOperatorName returns [String current=null] : iv_ruleCompleteOCLNavigationOperatorName= ruleCompleteOCLNavigationOperatorName EOF ;
    public final String entryRuleCompleteOCLNavigationOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCompleteOCLNavigationOperatorName = null;


        try {
            // InternalCPL.g:656:73: (iv_ruleCompleteOCLNavigationOperatorName= ruleCompleteOCLNavigationOperatorName EOF )
            // InternalCPL.g:657:2: iv_ruleCompleteOCLNavigationOperatorName= ruleCompleteOCLNavigationOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompleteOCLNavigationOperatorNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCompleteOCLNavigationOperatorName=ruleCompleteOCLNavigationOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompleteOCLNavigationOperatorName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompleteOCLNavigationOperatorName"


    // $ANTLR start "ruleCompleteOCLNavigationOperatorName"
    // InternalCPL.g:663:1: ruleCompleteOCLNavigationOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '^' | kw= '^^' ) ;
    public final AntlrDatatypeRuleToken ruleCompleteOCLNavigationOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCPL.g:669:2: ( (kw= '^' | kw= '^^' ) )
            // InternalCPL.g:670:2: (kw= '^' | kw= '^^' )
            {
            // InternalCPL.g:670:2: (kw= '^' | kw= '^^' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==46) ) {
                alt20=1;
            }
            else if ( (LA20_0==47) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalCPL.g:671:3: kw= '^'
                    {
                    kw=(Token)match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCompleteOCLNavigationOperatorNameAccess().getCircumflexAccentKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCPL.g:677:3: kw= '^^'
                    {
                    kw=(Token)match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCompleteOCLNavigationOperatorNameAccess().getCircumflexAccentCircumflexAccentKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompleteOCLNavigationOperatorName"


    // $ANTLR start "entryRuleClassifierContextDeclCS"
    // InternalCPL.g:686:1: entryRuleClassifierContextDeclCS returns [EObject current=null] : iv_ruleClassifierContextDeclCS= ruleClassifierContextDeclCS EOF ;
    public final EObject entryRuleClassifierContextDeclCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifierContextDeclCS = null;


        try {
            // InternalCPL.g:686:64: (iv_ruleClassifierContextDeclCS= ruleClassifierContextDeclCS EOF )
            // InternalCPL.g:687:2: iv_ruleClassifierContextDeclCS= ruleClassifierContextDeclCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassifierContextDeclCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleClassifierContextDeclCS=ruleClassifierContextDeclCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassifierContextDeclCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassifierContextDeclCS"


    // $ANTLR start "ruleClassifierContextDeclCS"
    // InternalCPL.g:693:1: ruleClassifierContextDeclCS returns [EObject current=null] : (otherlv_0= 'context' ( (lv_ownedSignature_1_0= ruleTemplateSignatureCS ) )? ( (lv_selfName_2_0= ruleUnrestrictedName ) )? ( (lv_ownedPathName_3_0= rulePathNameCS ) ) ( (otherlv_4= 'inv' ( (lv_ownedInvariants_5_0= ruleConstraintCS ) ) ) | ( (lv_ownedDefinitions_6_0= ruleDefCS ) ) )+ ) ;
    public final EObject ruleClassifierContextDeclCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_ownedSignature_1_0 = null;

        AntlrDatatypeRuleToken lv_selfName_2_0 = null;

        EObject lv_ownedPathName_3_0 = null;

        EObject lv_ownedInvariants_5_0 = null;

        EObject lv_ownedDefinitions_6_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:699:2: ( (otherlv_0= 'context' ( (lv_ownedSignature_1_0= ruleTemplateSignatureCS ) )? ( (lv_selfName_2_0= ruleUnrestrictedName ) )? ( (lv_ownedPathName_3_0= rulePathNameCS ) ) ( (otherlv_4= 'inv' ( (lv_ownedInvariants_5_0= ruleConstraintCS ) ) ) | ( (lv_ownedDefinitions_6_0= ruleDefCS ) ) )+ ) )
            // InternalCPL.g:700:2: (otherlv_0= 'context' ( (lv_ownedSignature_1_0= ruleTemplateSignatureCS ) )? ( (lv_selfName_2_0= ruleUnrestrictedName ) )? ( (lv_ownedPathName_3_0= rulePathNameCS ) ) ( (otherlv_4= 'inv' ( (lv_ownedInvariants_5_0= ruleConstraintCS ) ) ) | ( (lv_ownedDefinitions_6_0= ruleDefCS ) ) )+ )
            {
            // InternalCPL.g:700:2: (otherlv_0= 'context' ( (lv_ownedSignature_1_0= ruleTemplateSignatureCS ) )? ( (lv_selfName_2_0= ruleUnrestrictedName ) )? ( (lv_ownedPathName_3_0= rulePathNameCS ) ) ( (otherlv_4= 'inv' ( (lv_ownedInvariants_5_0= ruleConstraintCS ) ) ) | ( (lv_ownedDefinitions_6_0= ruleDefCS ) ) )+ )
            // InternalCPL.g:701:3: otherlv_0= 'context' ( (lv_ownedSignature_1_0= ruleTemplateSignatureCS ) )? ( (lv_selfName_2_0= ruleUnrestrictedName ) )? ( (lv_ownedPathName_3_0= rulePathNameCS ) ) ( (otherlv_4= 'inv' ( (lv_ownedInvariants_5_0= ruleConstraintCS ) ) ) | ( (lv_ownedDefinitions_6_0= ruleDefCS ) ) )+
            {
            otherlv_0=(Token)match(input,48,FollowSets000.FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getClassifierContextDeclCSAccess().getContextKeyword_0());
              		
            }
            // InternalCPL.g:705:3: ( (lv_ownedSignature_1_0= ruleTemplateSignatureCS ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==34||LA21_0==44) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalCPL.g:706:4: (lv_ownedSignature_1_0= ruleTemplateSignatureCS )
                    {
                    // InternalCPL.g:706:4: (lv_ownedSignature_1_0= ruleTemplateSignatureCS )
                    // InternalCPL.g:707:5: lv_ownedSignature_1_0= ruleTemplateSignatureCS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getClassifierContextDeclCSAccess().getOwnedSignatureTemplateSignatureCSParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_25);
                    lv_ownedSignature_1_0=ruleTemplateSignatureCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getClassifierContextDeclCSRule());
                      					}
                      					set(
                      						current,
                      						"ownedSignature",
                      						lv_ownedSignature_1_0,
                      						"org.eclipse.ocl.xtext.completeocl.CompleteOCL.TemplateSignatureCS");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCPL.g:724:3: ( (lv_selfName_2_0= ruleUnrestrictedName ) )?
            int alt22=2;
            switch ( input.LA(1) ) {
                case RULE_SIMPLE_ID:
                    {
                    int LA22_1 = input.LA(2);

                    if ( ((LA22_1>=RULE_SIMPLE_ID && LA22_1<=RULE_ESCAPED_ID)||LA22_1==22||(LA22_1>=53 && LA22_1<=54)) ) {
                        alt22=1;
                    }
                    }
                    break;
                case RULE_ESCAPED_ID:
                    {
                    int LA22_2 = input.LA(2);

                    if ( ((LA22_2>=RULE_SIMPLE_ID && LA22_2<=RULE_ESCAPED_ID)||LA22_2==22||(LA22_2>=53 && LA22_2<=54)) ) {
                        alt22=1;
                    }
                    }
                    break;
                case 22:
                    {
                    int LA22_3 = input.LA(2);

                    if ( ((LA22_3>=RULE_SIMPLE_ID && LA22_3<=RULE_ESCAPED_ID)||LA22_3==22||(LA22_3>=53 && LA22_3<=54)) ) {
                        alt22=1;
                    }
                    }
                    break;
                case 53:
                    {
                    int LA22_4 = input.LA(2);

                    if ( ((LA22_4>=RULE_SIMPLE_ID && LA22_4<=RULE_ESCAPED_ID)||LA22_4==22||(LA22_4>=53 && LA22_4<=54)) ) {
                        alt22=1;
                    }
                    }
                    break;
                case 54:
                    {
                    int LA22_5 = input.LA(2);

                    if ( ((LA22_5>=RULE_SIMPLE_ID && LA22_5<=RULE_ESCAPED_ID)||LA22_5==22||(LA22_5>=53 && LA22_5<=54)) ) {
                        alt22=1;
                    }
                    }
                    break;
            }

            switch (alt22) {
                case 1 :
                    // InternalCPL.g:725:4: (lv_selfName_2_0= ruleUnrestrictedName )
                    {
                    // InternalCPL.g:725:4: (lv_selfName_2_0= ruleUnrestrictedName )
                    // InternalCPL.g:726:5: lv_selfName_2_0= ruleUnrestrictedName
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getClassifierContextDeclCSAccess().getSelfNameUnrestrictedNameParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_25);
                    lv_selfName_2_0=ruleUnrestrictedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getClassifierContextDeclCSRule());
                      					}
                      					set(
                      						current,
                      						"selfName",
                      						lv_selfName_2_0,
                      						"org.eclipse.ocl.xtext.completeocl.CompleteOCL.UnrestrictedName");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCPL.g:743:3: ( (lv_ownedPathName_3_0= rulePathNameCS ) )
            // InternalCPL.g:744:4: (lv_ownedPathName_3_0= rulePathNameCS )
            {
            // InternalCPL.g:744:4: (lv_ownedPathName_3_0= rulePathNameCS )
            // InternalCPL.g:745:5: lv_ownedPathName_3_0= rulePathNameCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getClassifierContextDeclCSAccess().getOwnedPathNamePathNameCSParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_26);
            lv_ownedPathName_3_0=rulePathNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getClassifierContextDeclCSRule());
              					}
              					set(
              						current,
              						"ownedPathName",
              						lv_ownedPathName_3_0,
              						"org.eclipse.ocl.xtext.base.Base.PathNameCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCPL.g:762:3: ( (otherlv_4= 'inv' ( (lv_ownedInvariants_5_0= ruleConstraintCS ) ) ) | ( (lv_ownedDefinitions_6_0= ruleDefCS ) ) )+
            int cnt23=0;
            loop23:
            do {
                int alt23=3;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==49) ) {
                    alt23=1;
                }
                else if ( ((LA23_0>=50 && LA23_0<=51)) ) {
                    alt23=2;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalCPL.g:763:4: (otherlv_4= 'inv' ( (lv_ownedInvariants_5_0= ruleConstraintCS ) ) )
            	    {
            	    // InternalCPL.g:763:4: (otherlv_4= 'inv' ( (lv_ownedInvariants_5_0= ruleConstraintCS ) ) )
            	    // InternalCPL.g:764:5: otherlv_4= 'inv' ( (lv_ownedInvariants_5_0= ruleConstraintCS ) )
            	    {
            	    otherlv_4=(Token)match(input,49,FollowSets000.FOLLOW_27); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_4, grammarAccess.getClassifierContextDeclCSAccess().getInvKeyword_4_0_0());
            	      				
            	    }
            	    // InternalCPL.g:768:5: ( (lv_ownedInvariants_5_0= ruleConstraintCS ) )
            	    // InternalCPL.g:769:6: (lv_ownedInvariants_5_0= ruleConstraintCS )
            	    {
            	    // InternalCPL.g:769:6: (lv_ownedInvariants_5_0= ruleConstraintCS )
            	    // InternalCPL.g:770:7: lv_ownedInvariants_5_0= ruleConstraintCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getClassifierContextDeclCSAccess().getOwnedInvariantsConstraintCSParserRuleCall_4_0_1_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_28);
            	    lv_ownedInvariants_5_0=ruleConstraintCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getClassifierContextDeclCSRule());
            	      							}
            	      							add(
            	      								current,
            	      								"ownedInvariants",
            	      								lv_ownedInvariants_5_0,
            	      								"org.eclipse.ocl.xtext.completeocl.CompleteOCL.ConstraintCS");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalCPL.g:789:4: ( (lv_ownedDefinitions_6_0= ruleDefCS ) )
            	    {
            	    // InternalCPL.g:789:4: ( (lv_ownedDefinitions_6_0= ruleDefCS ) )
            	    // InternalCPL.g:790:5: (lv_ownedDefinitions_6_0= ruleDefCS )
            	    {
            	    // InternalCPL.g:790:5: (lv_ownedDefinitions_6_0= ruleDefCS )
            	    // InternalCPL.g:791:6: lv_ownedDefinitions_6_0= ruleDefCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getClassifierContextDeclCSAccess().getOwnedDefinitionsDefCSParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_28);
            	    lv_ownedDefinitions_6_0=ruleDefCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getClassifierContextDeclCSRule());
            	      						}
            	      						add(
            	      							current,
            	      							"ownedDefinitions",
            	      							lv_ownedDefinitions_6_0,
            	      							"org.eclipse.ocl.xtext.completeocl.CompleteOCL.DefCS");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassifierContextDeclCS"


    // $ANTLR start "entryRuleConstraintCS"
    // InternalCPL.g:813:1: entryRuleConstraintCS returns [EObject current=null] : iv_ruleConstraintCS= ruleConstraintCS EOF ;
    public final EObject entryRuleConstraintCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintCS = null;


        try {
            // InternalCPL.g:813:53: (iv_ruleConstraintCS= ruleConstraintCS EOF )
            // InternalCPL.g:814:2: iv_ruleConstraintCS= ruleConstraintCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstraintCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleConstraintCS=ruleConstraintCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstraintCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstraintCS"


    // $ANTLR start "ruleConstraintCS"
    // InternalCPL.g:820:1: ruleConstraintCS returns [EObject current=null] : ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= '(' ( (lv_ownedMessageSpecification_2_0= ruleSpecificationCS ) ) otherlv_3= ')' )? )? otherlv_4= ':' ( (lv_ownedSpecification_5_0= ruleSpecificationCS ) ) ) ;
    public final EObject ruleConstraintCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedMessageSpecification_2_0 = null;

        EObject lv_ownedSpecification_5_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:826:2: ( ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= '(' ( (lv_ownedMessageSpecification_2_0= ruleSpecificationCS ) ) otherlv_3= ')' )? )? otherlv_4= ':' ( (lv_ownedSpecification_5_0= ruleSpecificationCS ) ) ) )
            // InternalCPL.g:827:2: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= '(' ( (lv_ownedMessageSpecification_2_0= ruleSpecificationCS ) ) otherlv_3= ')' )? )? otherlv_4= ':' ( (lv_ownedSpecification_5_0= ruleSpecificationCS ) ) )
            {
            // InternalCPL.g:827:2: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= '(' ( (lv_ownedMessageSpecification_2_0= ruleSpecificationCS ) ) otherlv_3= ')' )? )? otherlv_4= ':' ( (lv_ownedSpecification_5_0= ruleSpecificationCS ) ) )
            // InternalCPL.g:828:3: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= '(' ( (lv_ownedMessageSpecification_2_0= ruleSpecificationCS ) ) otherlv_3= ')' )? )? otherlv_4= ':' ( (lv_ownedSpecification_5_0= ruleSpecificationCS ) )
            {
            // InternalCPL.g:828:3: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= '(' ( (lv_ownedMessageSpecification_2_0= ruleSpecificationCS ) ) otherlv_3= ')' )? )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_SIMPLE_ID && LA25_0<=RULE_ESCAPED_ID)||LA25_0==22||(LA25_0>=53 && LA25_0<=54)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalCPL.g:829:4: ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= '(' ( (lv_ownedMessageSpecification_2_0= ruleSpecificationCS ) ) otherlv_3= ')' )?
                    {
                    // InternalCPL.g:829:4: ( (lv_name_0_0= ruleUnrestrictedName ) )
                    // InternalCPL.g:830:5: (lv_name_0_0= ruleUnrestrictedName )
                    {
                    // InternalCPL.g:830:5: (lv_name_0_0= ruleUnrestrictedName )
                    // InternalCPL.g:831:6: lv_name_0_0= ruleUnrestrictedName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConstraintCSAccess().getNameUnrestrictedNameParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_29);
                    lv_name_0_0=ruleUnrestrictedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getConstraintCSRule());
                      						}
                      						set(
                      							current,
                      							"name",
                      							lv_name_0_0,
                      							"org.eclipse.ocl.xtext.completeocl.CompleteOCL.UnrestrictedName");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalCPL.g:848:4: (otherlv_1= '(' ( (lv_ownedMessageSpecification_2_0= ruleSpecificationCS ) ) otherlv_3= ')' )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==44) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalCPL.g:849:5: otherlv_1= '(' ( (lv_ownedMessageSpecification_2_0= ruleSpecificationCS ) ) otherlv_3= ')'
                            {
                            otherlv_1=(Token)match(input,44,FollowSets000.FOLLOW_30); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_1, grammarAccess.getConstraintCSAccess().getLeftParenthesisKeyword_0_1_0());
                              				
                            }
                            // InternalCPL.g:853:5: ( (lv_ownedMessageSpecification_2_0= ruleSpecificationCS ) )
                            // InternalCPL.g:854:6: (lv_ownedMessageSpecification_2_0= ruleSpecificationCS )
                            {
                            // InternalCPL.g:854:6: (lv_ownedMessageSpecification_2_0= ruleSpecificationCS )
                            // InternalCPL.g:855:7: lv_ownedMessageSpecification_2_0= ruleSpecificationCS
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getConstraintCSAccess().getOwnedMessageSpecificationSpecificationCSParserRuleCall_0_1_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_31);
                            lv_ownedMessageSpecification_2_0=ruleSpecificationCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getConstraintCSRule());
                              							}
                              							set(
                              								current,
                              								"ownedMessageSpecification",
                              								lv_ownedMessageSpecification_2_0,
                              								"org.eclipse.ocl.xtext.completeocl.CompleteOCL.SpecificationCS");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            otherlv_3=(Token)match(input,45,FollowSets000.FOLLOW_14); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_3, grammarAccess.getConstraintCSAccess().getRightParenthesisKeyword_0_1_2());
                              				
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,24,FollowSets000.FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getConstraintCSAccess().getColonKeyword_1());
              		
            }
            // InternalCPL.g:882:3: ( (lv_ownedSpecification_5_0= ruleSpecificationCS ) )
            // InternalCPL.g:883:4: (lv_ownedSpecification_5_0= ruleSpecificationCS )
            {
            // InternalCPL.g:883:4: (lv_ownedSpecification_5_0= ruleSpecificationCS )
            // InternalCPL.g:884:5: lv_ownedSpecification_5_0= ruleSpecificationCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConstraintCSAccess().getOwnedSpecificationSpecificationCSParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_ownedSpecification_5_0=ruleSpecificationCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConstraintCSRule());
              					}
              					set(
              						current,
              						"ownedSpecification",
              						lv_ownedSpecification_5_0,
              						"org.eclipse.ocl.xtext.completeocl.CompleteOCL.SpecificationCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstraintCS"


    // $ANTLR start "entryRuleContextDeclCS"
    // InternalCPL.g:905:1: entryRuleContextDeclCS returns [EObject current=null] : iv_ruleContextDeclCS= ruleContextDeclCS EOF ;
    public final EObject entryRuleContextDeclCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextDeclCS = null;


        try {
            // InternalCPL.g:905:54: (iv_ruleContextDeclCS= ruleContextDeclCS EOF )
            // InternalCPL.g:906:2: iv_ruleContextDeclCS= ruleContextDeclCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContextDeclCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleContextDeclCS=ruleContextDeclCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContextDeclCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContextDeclCS"


    // $ANTLR start "ruleContextDeclCS"
    // InternalCPL.g:912:1: ruleContextDeclCS returns [EObject current=null] : (this_PropertyContextDeclCS_0= rulePropertyContextDeclCS | this_ClassifierContextDeclCS_1= ruleClassifierContextDeclCS | this_OperationContextDeclCS_2= ruleOperationContextDeclCS ) ;
    public final EObject ruleContextDeclCS() throws RecognitionException {
        EObject current = null;

        EObject this_PropertyContextDeclCS_0 = null;

        EObject this_ClassifierContextDeclCS_1 = null;

        EObject this_OperationContextDeclCS_2 = null;



        	enterRule();

        try {
            // InternalCPL.g:918:2: ( (this_PropertyContextDeclCS_0= rulePropertyContextDeclCS | this_ClassifierContextDeclCS_1= ruleClassifierContextDeclCS | this_OperationContextDeclCS_2= ruleOperationContextDeclCS ) )
            // InternalCPL.g:919:2: (this_PropertyContextDeclCS_0= rulePropertyContextDeclCS | this_ClassifierContextDeclCS_1= ruleClassifierContextDeclCS | this_OperationContextDeclCS_2= ruleOperationContextDeclCS )
            {
            // InternalCPL.g:919:2: (this_PropertyContextDeclCS_0= rulePropertyContextDeclCS | this_ClassifierContextDeclCS_1= ruleClassifierContextDeclCS | this_OperationContextDeclCS_2= ruleOperationContextDeclCS )
            int alt26=3;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==48) ) {
                int LA26_1 = input.LA(2);

                if ( (synpred38_InternalCPL()) ) {
                    alt26=1;
                }
                else if ( (synpred39_InternalCPL()) ) {
                    alt26=2;
                }
                else if ( (true) ) {
                    alt26=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalCPL.g:920:3: this_PropertyContextDeclCS_0= rulePropertyContextDeclCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getContextDeclCSAccess().getPropertyContextDeclCSParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_PropertyContextDeclCS_0=rulePropertyContextDeclCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PropertyContextDeclCS_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCPL.g:932:3: this_ClassifierContextDeclCS_1= ruleClassifierContextDeclCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getContextDeclCSAccess().getClassifierContextDeclCSParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ClassifierContextDeclCS_1=ruleClassifierContextDeclCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ClassifierContextDeclCS_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalCPL.g:944:3: this_OperationContextDeclCS_2= ruleOperationContextDeclCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getContextDeclCSAccess().getOperationContextDeclCSParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_OperationContextDeclCS_2=ruleOperationContextDeclCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_OperationContextDeclCS_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContextDeclCS"


    // $ANTLR start "entryRuleDefCS"
    // InternalCPL.g:959:1: entryRuleDefCS returns [EObject current=null] : iv_ruleDefCS= ruleDefCS EOF ;
    public final EObject entryRuleDefCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefCS = null;


        try {
            // InternalCPL.g:959:46: (iv_ruleDefCS= ruleDefCS EOF )
            // InternalCPL.g:960:2: iv_ruleDefCS= ruleDefCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDefCS=ruleDefCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefCS"


    // $ANTLR start "ruleDefCS"
    // InternalCPL.g:966:1: ruleDefCS returns [EObject current=null] : (this_DefOperationCS_0= ruleDefOperationCS | this_DefPropertyCS_1= ruleDefPropertyCS ) ;
    public final EObject ruleDefCS() throws RecognitionException {
        EObject current = null;

        EObject this_DefOperationCS_0 = null;

        EObject this_DefPropertyCS_1 = null;



        	enterRule();

        try {
            // InternalCPL.g:972:2: ( (this_DefOperationCS_0= ruleDefOperationCS | this_DefPropertyCS_1= ruleDefPropertyCS ) )
            // InternalCPL.g:973:2: (this_DefOperationCS_0= ruleDefOperationCS | this_DefPropertyCS_1= ruleDefPropertyCS )
            {
            // InternalCPL.g:973:2: (this_DefOperationCS_0= ruleDefOperationCS | this_DefPropertyCS_1= ruleDefPropertyCS )
            int alt27=2;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // InternalCPL.g:974:3: this_DefOperationCS_0= ruleDefOperationCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDefCSAccess().getDefOperationCSParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DefOperationCS_0=ruleDefOperationCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DefOperationCS_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCPL.g:986:3: this_DefPropertyCS_1= ruleDefPropertyCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDefCSAccess().getDefPropertyCSParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DefPropertyCS_1=ruleDefPropertyCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DefPropertyCS_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefCS"


    // $ANTLR start "entryRuleDefOperationCS"
    // InternalCPL.g:1001:1: entryRuleDefOperationCS returns [EObject current=null] : iv_ruleDefOperationCS= ruleDefOperationCS EOF ;
    public final EObject entryRuleDefOperationCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefOperationCS = null;


        try {
            // InternalCPL.g:1001:55: (iv_ruleDefOperationCS= ruleDefOperationCS EOF )
            // InternalCPL.g:1002:2: iv_ruleDefOperationCS= ruleDefOperationCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefOperationCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDefOperationCS=ruleDefOperationCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefOperationCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefOperationCS"


    // $ANTLR start "ruleDefOperationCS"
    // InternalCPL.g:1008:1: ruleDefOperationCS returns [EObject current=null] : ( ( (lv_isStatic_0_0= 'static' ) )? otherlv_1= 'def' ( ruleUnrestrictedName )? otherlv_3= ':' ( (lv_ownedSignature_4_0= ruleTemplateSignatureCS ) )? ( (lv_name_5_0= ruleUnrestrictedName ) ) otherlv_6= '(' ( ( (lv_ownedParameters_7_0= ruleDefParameterCS ) ) (otherlv_8= ',' ( (lv_ownedParameters_9_0= ruleDefParameterCS ) ) )* )? otherlv_10= ')' otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) )? otherlv_13= '=' ( (lv_ownedSpecification_14_0= ruleSpecificationCS ) ) ) ;
    public final EObject ruleDefOperationCS() throws RecognitionException {
        EObject current = null;

        Token lv_isStatic_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_ownedSignature_4_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_ownedParameters_7_0 = null;

        EObject lv_ownedParameters_9_0 = null;

        EObject lv_ownedType_12_0 = null;

        EObject lv_ownedSpecification_14_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:1014:2: ( ( ( (lv_isStatic_0_0= 'static' ) )? otherlv_1= 'def' ( ruleUnrestrictedName )? otherlv_3= ':' ( (lv_ownedSignature_4_0= ruleTemplateSignatureCS ) )? ( (lv_name_5_0= ruleUnrestrictedName ) ) otherlv_6= '(' ( ( (lv_ownedParameters_7_0= ruleDefParameterCS ) ) (otherlv_8= ',' ( (lv_ownedParameters_9_0= ruleDefParameterCS ) ) )* )? otherlv_10= ')' otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) )? otherlv_13= '=' ( (lv_ownedSpecification_14_0= ruleSpecificationCS ) ) ) )
            // InternalCPL.g:1015:2: ( ( (lv_isStatic_0_0= 'static' ) )? otherlv_1= 'def' ( ruleUnrestrictedName )? otherlv_3= ':' ( (lv_ownedSignature_4_0= ruleTemplateSignatureCS ) )? ( (lv_name_5_0= ruleUnrestrictedName ) ) otherlv_6= '(' ( ( (lv_ownedParameters_7_0= ruleDefParameterCS ) ) (otherlv_8= ',' ( (lv_ownedParameters_9_0= ruleDefParameterCS ) ) )* )? otherlv_10= ')' otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) )? otherlv_13= '=' ( (lv_ownedSpecification_14_0= ruleSpecificationCS ) ) )
            {
            // InternalCPL.g:1015:2: ( ( (lv_isStatic_0_0= 'static' ) )? otherlv_1= 'def' ( ruleUnrestrictedName )? otherlv_3= ':' ( (lv_ownedSignature_4_0= ruleTemplateSignatureCS ) )? ( (lv_name_5_0= ruleUnrestrictedName ) ) otherlv_6= '(' ( ( (lv_ownedParameters_7_0= ruleDefParameterCS ) ) (otherlv_8= ',' ( (lv_ownedParameters_9_0= ruleDefParameterCS ) ) )* )? otherlv_10= ')' otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) )? otherlv_13= '=' ( (lv_ownedSpecification_14_0= ruleSpecificationCS ) ) )
            // InternalCPL.g:1016:3: ( (lv_isStatic_0_0= 'static' ) )? otherlv_1= 'def' ( ruleUnrestrictedName )? otherlv_3= ':' ( (lv_ownedSignature_4_0= ruleTemplateSignatureCS ) )? ( (lv_name_5_0= ruleUnrestrictedName ) ) otherlv_6= '(' ( ( (lv_ownedParameters_7_0= ruleDefParameterCS ) ) (otherlv_8= ',' ( (lv_ownedParameters_9_0= ruleDefParameterCS ) ) )* )? otherlv_10= ')' otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) )? otherlv_13= '=' ( (lv_ownedSpecification_14_0= ruleSpecificationCS ) )
            {
            // InternalCPL.g:1016:3: ( (lv_isStatic_0_0= 'static' ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==50) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalCPL.g:1017:4: (lv_isStatic_0_0= 'static' )
                    {
                    // InternalCPL.g:1017:4: (lv_isStatic_0_0= 'static' )
                    // InternalCPL.g:1018:5: lv_isStatic_0_0= 'static'
                    {
                    lv_isStatic_0_0=(Token)match(input,50,FollowSets000.FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isStatic_0_0, grammarAccess.getDefOperationCSAccess().getIsStaticStaticKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDefOperationCSRule());
                      					}
                      					setWithLastConsumed(current, "isStatic", true, "static");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,51,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDefOperationCSAccess().getDefKeyword_1());
              		
            }
            // InternalCPL.g:1034:3: ( ruleUnrestrictedName )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=RULE_SIMPLE_ID && LA29_0<=RULE_ESCAPED_ID)||LA29_0==22||(LA29_0>=53 && LA29_0<=54)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalCPL.g:1035:4: ruleUnrestrictedName
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getDefOperationCSAccess().getUnrestrictedNameParserRuleCall_2());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_14);
                    ruleUnrestrictedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDefOperationCSAccess().getColonKeyword_3());
              		
            }
            // InternalCPL.g:1050:3: ( (lv_ownedSignature_4_0= ruleTemplateSignatureCS ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==34||LA30_0==44) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalCPL.g:1051:4: (lv_ownedSignature_4_0= ruleTemplateSignatureCS )
                    {
                    // InternalCPL.g:1051:4: (lv_ownedSignature_4_0= ruleTemplateSignatureCS )
                    // InternalCPL.g:1052:5: lv_ownedSignature_4_0= ruleTemplateSignatureCS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDefOperationCSAccess().getOwnedSignatureTemplateSignatureCSParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_ownedSignature_4_0=ruleTemplateSignatureCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDefOperationCSRule());
                      					}
                      					set(
                      						current,
                      						"ownedSignature",
                      						lv_ownedSignature_4_0,
                      						"org.eclipse.ocl.xtext.completeocl.CompleteOCL.TemplateSignatureCS");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCPL.g:1069:3: ( (lv_name_5_0= ruleUnrestrictedName ) )
            // InternalCPL.g:1070:4: (lv_name_5_0= ruleUnrestrictedName )
            {
            // InternalCPL.g:1070:4: (lv_name_5_0= ruleUnrestrictedName )
            // InternalCPL.g:1071:5: lv_name_5_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefOperationCSAccess().getNameUnrestrictedNameParserRuleCall_5_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_33);
            lv_name_5_0=ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDefOperationCSRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_5_0,
              						"org.eclipse.ocl.xtext.completeocl.CompleteOCL.UnrestrictedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,44,FollowSets000.FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDefOperationCSAccess().getLeftParenthesisKeyword_6());
              		
            }
            // InternalCPL.g:1092:3: ( ( (lv_ownedParameters_7_0= ruleDefParameterCS ) ) (otherlv_8= ',' ( (lv_ownedParameters_9_0= ruleDefParameterCS ) ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=RULE_SIMPLE_ID && LA32_0<=RULE_ESCAPED_ID)||LA32_0==22||(LA32_0>=53 && LA32_0<=54)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalCPL.g:1093:4: ( (lv_ownedParameters_7_0= ruleDefParameterCS ) ) (otherlv_8= ',' ( (lv_ownedParameters_9_0= ruleDefParameterCS ) ) )*
                    {
                    // InternalCPL.g:1093:4: ( (lv_ownedParameters_7_0= ruleDefParameterCS ) )
                    // InternalCPL.g:1094:5: (lv_ownedParameters_7_0= ruleDefParameterCS )
                    {
                    // InternalCPL.g:1094:5: (lv_ownedParameters_7_0= ruleDefParameterCS )
                    // InternalCPL.g:1095:6: lv_ownedParameters_7_0= ruleDefParameterCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDefOperationCSAccess().getOwnedParametersDefParameterCSParserRuleCall_7_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_35);
                    lv_ownedParameters_7_0=ruleDefParameterCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDefOperationCSRule());
                      						}
                      						add(
                      							current,
                      							"ownedParameters",
                      							lv_ownedParameters_7_0,
                      							"org.eclipse.ocl.xtext.completeocl.CompleteOCL.DefParameterCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalCPL.g:1112:4: (otherlv_8= ',' ( (lv_ownedParameters_9_0= ruleDefParameterCS ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==52) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalCPL.g:1113:5: otherlv_8= ',' ( (lv_ownedParameters_9_0= ruleDefParameterCS ) )
                    	    {
                    	    otherlv_8=(Token)match(input,52,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_8, grammarAccess.getDefOperationCSAccess().getCommaKeyword_7_1_0());
                    	      				
                    	    }
                    	    // InternalCPL.g:1117:5: ( (lv_ownedParameters_9_0= ruleDefParameterCS ) )
                    	    // InternalCPL.g:1118:6: (lv_ownedParameters_9_0= ruleDefParameterCS )
                    	    {
                    	    // InternalCPL.g:1118:6: (lv_ownedParameters_9_0= ruleDefParameterCS )
                    	    // InternalCPL.g:1119:7: lv_ownedParameters_9_0= ruleDefParameterCS
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDefOperationCSAccess().getOwnedParametersDefParameterCSParserRuleCall_7_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_35);
                    	    lv_ownedParameters_9_0=ruleDefParameterCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getDefOperationCSRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"ownedParameters",
                    	      								lv_ownedParameters_9_0,
                    	      								"org.eclipse.ocl.xtext.completeocl.CompleteOCL.DefParameterCS");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,45,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getDefOperationCSAccess().getRightParenthesisKeyword_8());
              		
            }
            otherlv_11=(Token)match(input,24,FollowSets000.FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getDefOperationCSAccess().getColonKeyword_9());
              		
            }
            // InternalCPL.g:1146:3: ( (lv_ownedType_12_0= ruleTypeExpCS ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=RULE_SIMPLE_ID && LA33_0<=RULE_ESCAPED_ID)||LA33_0==22||(LA33_0>=53 && LA33_0<=54)||(LA33_0>=63 && LA33_0<=72)||(LA33_0>=88 && LA33_0<=89)||(LA33_0>=91 && LA33_0<=95)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalCPL.g:1147:4: (lv_ownedType_12_0= ruleTypeExpCS )
                    {
                    // InternalCPL.g:1147:4: (lv_ownedType_12_0= ruleTypeExpCS )
                    // InternalCPL.g:1148:5: lv_ownedType_12_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDefOperationCSAccess().getOwnedTypeTypeExpCSParserRuleCall_10_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_37);
                    lv_ownedType_12_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDefOperationCSRule());
                      					}
                      					set(
                      						current,
                      						"ownedType",
                      						lv_ownedType_12_0,
                      						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpCS");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,35,FollowSets000.FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getDefOperationCSAccess().getEqualsSignKeyword_11());
              		
            }
            // InternalCPL.g:1169:3: ( (lv_ownedSpecification_14_0= ruleSpecificationCS ) )
            // InternalCPL.g:1170:4: (lv_ownedSpecification_14_0= ruleSpecificationCS )
            {
            // InternalCPL.g:1170:4: (lv_ownedSpecification_14_0= ruleSpecificationCS )
            // InternalCPL.g:1171:5: lv_ownedSpecification_14_0= ruleSpecificationCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefOperationCSAccess().getOwnedSpecificationSpecificationCSParserRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_ownedSpecification_14_0=ruleSpecificationCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDefOperationCSRule());
              					}
              					set(
              						current,
              						"ownedSpecification",
              						lv_ownedSpecification_14_0,
              						"org.eclipse.ocl.xtext.completeocl.CompleteOCL.SpecificationCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefOperationCS"


    // $ANTLR start "entryRuleDefParameterCS"
    // InternalCPL.g:1192:1: entryRuleDefParameterCS returns [EObject current=null] : iv_ruleDefParameterCS= ruleDefParameterCS EOF ;
    public final EObject entryRuleDefParameterCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefParameterCS = null;


        try {
            // InternalCPL.g:1192:55: (iv_ruleDefParameterCS= ruleDefParameterCS EOF )
            // InternalCPL.g:1193:2: iv_ruleDefParameterCS= ruleDefParameterCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefParameterCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDefParameterCS=ruleDefParameterCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefParameterCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefParameterCS"


    // $ANTLR start "ruleDefParameterCS"
    // InternalCPL.g:1199:1: ruleDefParameterCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ) ;
    public final EObject ruleDefParameterCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:1205:2: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ) )
            // InternalCPL.g:1206:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )
            {
            // InternalCPL.g:1206:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )
            // InternalCPL.g:1207:3: ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
            {
            // InternalCPL.g:1207:3: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // InternalCPL.g:1208:4: (lv_name_0_0= ruleUnrestrictedName )
            {
            // InternalCPL.g:1208:4: (lv_name_0_0= ruleUnrestrictedName )
            // InternalCPL.g:1209:5: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefParameterCSAccess().getNameUnrestrictedNameParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_14);
            lv_name_0_0=ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDefParameterCSRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.ocl.xtext.completeocl.CompleteOCL.UnrestrictedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDefParameterCSAccess().getColonKeyword_1());
              		
            }
            // InternalCPL.g:1230:3: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
            // InternalCPL.g:1231:4: (lv_ownedType_2_0= ruleTypeExpCS )
            {
            // InternalCPL.g:1231:4: (lv_ownedType_2_0= ruleTypeExpCS )
            // InternalCPL.g:1232:5: lv_ownedType_2_0= ruleTypeExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefParameterCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_ownedType_2_0=ruleTypeExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDefParameterCSRule());
              					}
              					set(
              						current,
              						"ownedType",
              						lv_ownedType_2_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefParameterCS"


    // $ANTLR start "entryRuleDefPropertyCS"
    // InternalCPL.g:1253:1: entryRuleDefPropertyCS returns [EObject current=null] : iv_ruleDefPropertyCS= ruleDefPropertyCS EOF ;
    public final EObject entryRuleDefPropertyCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefPropertyCS = null;


        try {
            // InternalCPL.g:1253:54: (iv_ruleDefPropertyCS= ruleDefPropertyCS EOF )
            // InternalCPL.g:1254:2: iv_ruleDefPropertyCS= ruleDefPropertyCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefPropertyCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDefPropertyCS=ruleDefPropertyCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefPropertyCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefPropertyCS"


    // $ANTLR start "ruleDefPropertyCS"
    // InternalCPL.g:1260:1: ruleDefPropertyCS returns [EObject current=null] : ( ( (lv_isStatic_0_0= 'static' ) )? otherlv_1= 'def' ( ruleUnrestrictedName )? otherlv_3= ':' ( (lv_name_4_0= ruleUnrestrictedName ) ) otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) otherlv_7= '=' ( (lv_ownedSpecification_8_0= ruleSpecificationCS ) ) ) ;
    public final EObject ruleDefPropertyCS() throws RecognitionException {
        EObject current = null;

        Token lv_isStatic_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_ownedType_6_0 = null;

        EObject lv_ownedSpecification_8_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:1266:2: ( ( ( (lv_isStatic_0_0= 'static' ) )? otherlv_1= 'def' ( ruleUnrestrictedName )? otherlv_3= ':' ( (lv_name_4_0= ruleUnrestrictedName ) ) otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) otherlv_7= '=' ( (lv_ownedSpecification_8_0= ruleSpecificationCS ) ) ) )
            // InternalCPL.g:1267:2: ( ( (lv_isStatic_0_0= 'static' ) )? otherlv_1= 'def' ( ruleUnrestrictedName )? otherlv_3= ':' ( (lv_name_4_0= ruleUnrestrictedName ) ) otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) otherlv_7= '=' ( (lv_ownedSpecification_8_0= ruleSpecificationCS ) ) )
            {
            // InternalCPL.g:1267:2: ( ( (lv_isStatic_0_0= 'static' ) )? otherlv_1= 'def' ( ruleUnrestrictedName )? otherlv_3= ':' ( (lv_name_4_0= ruleUnrestrictedName ) ) otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) otherlv_7= '=' ( (lv_ownedSpecification_8_0= ruleSpecificationCS ) ) )
            // InternalCPL.g:1268:3: ( (lv_isStatic_0_0= 'static' ) )? otherlv_1= 'def' ( ruleUnrestrictedName )? otherlv_3= ':' ( (lv_name_4_0= ruleUnrestrictedName ) ) otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) otherlv_7= '=' ( (lv_ownedSpecification_8_0= ruleSpecificationCS ) )
            {
            // InternalCPL.g:1268:3: ( (lv_isStatic_0_0= 'static' ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==50) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalCPL.g:1269:4: (lv_isStatic_0_0= 'static' )
                    {
                    // InternalCPL.g:1269:4: (lv_isStatic_0_0= 'static' )
                    // InternalCPL.g:1270:5: lv_isStatic_0_0= 'static'
                    {
                    lv_isStatic_0_0=(Token)match(input,50,FollowSets000.FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isStatic_0_0, grammarAccess.getDefPropertyCSAccess().getIsStaticStaticKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDefPropertyCSRule());
                      					}
                      					setWithLastConsumed(current, "isStatic", true, "static");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,51,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDefPropertyCSAccess().getDefKeyword_1());
              		
            }
            // InternalCPL.g:1286:3: ( ruleUnrestrictedName )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=RULE_SIMPLE_ID && LA35_0<=RULE_ESCAPED_ID)||LA35_0==22||(LA35_0>=53 && LA35_0<=54)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalCPL.g:1287:4: ruleUnrestrictedName
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getDefPropertyCSAccess().getUnrestrictedNameParserRuleCall_2());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_14);
                    ruleUnrestrictedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDefPropertyCSAccess().getColonKeyword_3());
              		
            }
            // InternalCPL.g:1302:3: ( (lv_name_4_0= ruleUnrestrictedName ) )
            // InternalCPL.g:1303:4: (lv_name_4_0= ruleUnrestrictedName )
            {
            // InternalCPL.g:1303:4: (lv_name_4_0= ruleUnrestrictedName )
            // InternalCPL.g:1304:5: lv_name_4_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefPropertyCSAccess().getNameUnrestrictedNameParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_14);
            lv_name_4_0=ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDefPropertyCSRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_4_0,
              						"org.eclipse.ocl.xtext.completeocl.CompleteOCL.UnrestrictedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,24,FollowSets000.FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDefPropertyCSAccess().getColonKeyword_5());
              		
            }
            // InternalCPL.g:1325:3: ( (lv_ownedType_6_0= ruleTypeExpCS ) )
            // InternalCPL.g:1326:4: (lv_ownedType_6_0= ruleTypeExpCS )
            {
            // InternalCPL.g:1326:4: (lv_ownedType_6_0= ruleTypeExpCS )
            // InternalCPL.g:1327:5: lv_ownedType_6_0= ruleTypeExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefPropertyCSAccess().getOwnedTypeTypeExpCSParserRuleCall_6_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_37);
            lv_ownedType_6_0=ruleTypeExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDefPropertyCSRule());
              					}
              					set(
              						current,
              						"ownedType",
              						lv_ownedType_6_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_7=(Token)match(input,35,FollowSets000.FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDefPropertyCSAccess().getEqualsSignKeyword_7());
              		
            }
            // InternalCPL.g:1348:3: ( (lv_ownedSpecification_8_0= ruleSpecificationCS ) )
            // InternalCPL.g:1349:4: (lv_ownedSpecification_8_0= ruleSpecificationCS )
            {
            // InternalCPL.g:1349:4: (lv_ownedSpecification_8_0= ruleSpecificationCS )
            // InternalCPL.g:1350:5: lv_ownedSpecification_8_0= ruleSpecificationCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefPropertyCSAccess().getOwnedSpecificationSpecificationCSParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_ownedSpecification_8_0=ruleSpecificationCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDefPropertyCSRule());
              					}
              					set(
              						current,
              						"ownedSpecification",
              						lv_ownedSpecification_8_0,
              						"org.eclipse.ocl.xtext.completeocl.CompleteOCL.SpecificationCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefPropertyCS"


    // $ANTLR start "entryRuleImportCS"
    // InternalCPL.g:1371:1: entryRuleImportCS returns [EObject current=null] : iv_ruleImportCS= ruleImportCS EOF ;
    public final EObject entryRuleImportCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportCS = null;


        try {
            // InternalCPL.g:1371:49: (iv_ruleImportCS= ruleImportCS EOF )
            // InternalCPL.g:1372:2: iv_ruleImportCS= ruleImportCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleImportCS=ruleImportCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImportCS"


    // $ANTLR start "ruleImportCS"
    // InternalCPL.g:1378:1: ruleImportCS returns [EObject current=null] : ( (otherlv_0= 'import' | otherlv_1= 'include' | otherlv_2= 'library' ) ( ( (lv_name_3_0= ruleIdentifier ) ) otherlv_4= ':' )? ( (lv_ownedPathName_5_0= ruleURIPathNameCS ) ) ( (lv_isAll_6_0= '::*' ) )? ) ;
    public final EObject ruleImportCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_isAll_6_0=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_ownedPathName_5_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:1384:2: ( ( (otherlv_0= 'import' | otherlv_1= 'include' | otherlv_2= 'library' ) ( ( (lv_name_3_0= ruleIdentifier ) ) otherlv_4= ':' )? ( (lv_ownedPathName_5_0= ruleURIPathNameCS ) ) ( (lv_isAll_6_0= '::*' ) )? ) )
            // InternalCPL.g:1385:2: ( (otherlv_0= 'import' | otherlv_1= 'include' | otherlv_2= 'library' ) ( ( (lv_name_3_0= ruleIdentifier ) ) otherlv_4= ':' )? ( (lv_ownedPathName_5_0= ruleURIPathNameCS ) ) ( (lv_isAll_6_0= '::*' ) )? )
            {
            // InternalCPL.g:1385:2: ( (otherlv_0= 'import' | otherlv_1= 'include' | otherlv_2= 'library' ) ( ( (lv_name_3_0= ruleIdentifier ) ) otherlv_4= ':' )? ( (lv_ownedPathName_5_0= ruleURIPathNameCS ) ) ( (lv_isAll_6_0= '::*' ) )? )
            // InternalCPL.g:1386:3: (otherlv_0= 'import' | otherlv_1= 'include' | otherlv_2= 'library' ) ( ( (lv_name_3_0= ruleIdentifier ) ) otherlv_4= ':' )? ( (lv_ownedPathName_5_0= ruleURIPathNameCS ) ) ( (lv_isAll_6_0= '::*' ) )?
            {
            // InternalCPL.g:1386:3: (otherlv_0= 'import' | otherlv_1= 'include' | otherlv_2= 'library' )
            int alt36=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt36=1;
                }
                break;
            case 53:
                {
                alt36=2;
                }
                break;
            case 54:
                {
                alt36=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalCPL.g:1387:4: otherlv_0= 'import'
                    {
                    otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getImportCSAccess().getImportKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalCPL.g:1392:4: otherlv_1= 'include'
                    {
                    otherlv_1=(Token)match(input,53,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getImportCSAccess().getIncludeKeyword_0_1());
                      			
                    }

                    }
                    break;
                case 3 :
                    // InternalCPL.g:1397:4: otherlv_2= 'library'
                    {
                    otherlv_2=(Token)match(input,54,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getImportCSAccess().getLibraryKeyword_0_2());
                      			
                    }

                    }
                    break;

            }

            // InternalCPL.g:1402:3: ( ( (lv_name_3_0= ruleIdentifier ) ) otherlv_4= ':' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_SIMPLE_ID) ) {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==24) ) {
                    alt37=1;
                }
            }
            else if ( (LA37_0==RULE_ESCAPED_ID) ) {
                int LA37_2 = input.LA(2);

                if ( (LA37_2==24) ) {
                    alt37=1;
                }
            }
            switch (alt37) {
                case 1 :
                    // InternalCPL.g:1403:4: ( (lv_name_3_0= ruleIdentifier ) ) otherlv_4= ':'
                    {
                    // InternalCPL.g:1403:4: ( (lv_name_3_0= ruleIdentifier ) )
                    // InternalCPL.g:1404:5: (lv_name_3_0= ruleIdentifier )
                    {
                    // InternalCPL.g:1404:5: (lv_name_3_0= ruleIdentifier )
                    // InternalCPL.g:1405:6: lv_name_3_0= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getImportCSAccess().getNameIdentifierParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_14);
                    lv_name_3_0=ruleIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getImportCSRule());
                      						}
                      						set(
                      							current,
                      							"name",
                      							lv_name_3_0,
                      							"org.eclipse.ocl.xtext.base.Base.Identifier");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,24,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getImportCSAccess().getColonKeyword_1_1());
                      			
                    }

                    }
                    break;

            }

            // InternalCPL.g:1427:3: ( (lv_ownedPathName_5_0= ruleURIPathNameCS ) )
            // InternalCPL.g:1428:4: (lv_ownedPathName_5_0= ruleURIPathNameCS )
            {
            // InternalCPL.g:1428:4: (lv_ownedPathName_5_0= ruleURIPathNameCS )
            // InternalCPL.g:1429:5: lv_ownedPathName_5_0= ruleURIPathNameCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getImportCSAccess().getOwnedPathNameURIPathNameCSParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_15);
            lv_ownedPathName_5_0=ruleURIPathNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getImportCSRule());
              					}
              					set(
              						current,
              						"ownedPathName",
              						lv_ownedPathName_5_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.URIPathNameCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCPL.g:1446:3: ( (lv_isAll_6_0= '::*' ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==25) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalCPL.g:1447:4: (lv_isAll_6_0= '::*' )
                    {
                    // InternalCPL.g:1447:4: (lv_isAll_6_0= '::*' )
                    // InternalCPL.g:1448:5: lv_isAll_6_0= '::*'
                    {
                    lv_isAll_6_0=(Token)match(input,25,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_isAll_6_0, grammarAccess.getImportCSAccess().getIsAllColonColonAsteriskKeyword_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getImportCSRule());
                      					}
                      					setWithLastConsumed(current, "isAll", true, "::*");
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImportCS"


    // $ANTLR start "entryRuleOperationContextDeclCS"
    // InternalCPL.g:1464:1: entryRuleOperationContextDeclCS returns [EObject current=null] : iv_ruleOperationContextDeclCS= ruleOperationContextDeclCS EOF ;
    public final EObject entryRuleOperationContextDeclCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationContextDeclCS = null;


        try {
            // InternalCPL.g:1464:63: (iv_ruleOperationContextDeclCS= ruleOperationContextDeclCS EOF )
            // InternalCPL.g:1465:2: iv_ruleOperationContextDeclCS= ruleOperationContextDeclCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationContextDeclCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOperationContextDeclCS=ruleOperationContextDeclCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationContextDeclCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperationContextDeclCS"


    // $ANTLR start "ruleOperationContextDeclCS"
    // InternalCPL.g:1471:1: ruleOperationContextDeclCS returns [EObject current=null] : (otherlv_0= 'context' ( (lv_ownedSignature_1_0= ruleTemplateSignatureCS ) )? ( (lv_ownedPathName_2_0= rulePathNameCS ) ) otherlv_3= '(' ( ( (lv_ownedParameters_4_0= ruleParameterCS ) ) (otherlv_5= ',' ( (lv_ownedParameters_6_0= ruleParameterCS ) ) )* )? otherlv_7= ')' otherlv_8= ':' ( (lv_ownedType_9_0= ruleTypeExpCS ) )? ( (otherlv_10= 'pre' ( (lv_ownedPreconditions_11_0= ruleConstraintCS ) ) ) | (otherlv_12= 'post' ( (lv_ownedPostconditions_13_0= ruleConstraintCS ) ) ) | (otherlv_14= 'body' ( ruleUnrestrictedName )? otherlv_16= ':' ( (lv_ownedBodies_17_0= ruleSpecificationCS ) ) ) )* ) ;
    public final EObject ruleOperationContextDeclCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        EObject lv_ownedSignature_1_0 = null;

        EObject lv_ownedPathName_2_0 = null;

        EObject lv_ownedParameters_4_0 = null;

        EObject lv_ownedParameters_6_0 = null;

        EObject lv_ownedType_9_0 = null;

        EObject lv_ownedPreconditions_11_0 = null;

        EObject lv_ownedPostconditions_13_0 = null;

        EObject lv_ownedBodies_17_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:1477:2: ( (otherlv_0= 'context' ( (lv_ownedSignature_1_0= ruleTemplateSignatureCS ) )? ( (lv_ownedPathName_2_0= rulePathNameCS ) ) otherlv_3= '(' ( ( (lv_ownedParameters_4_0= ruleParameterCS ) ) (otherlv_5= ',' ( (lv_ownedParameters_6_0= ruleParameterCS ) ) )* )? otherlv_7= ')' otherlv_8= ':' ( (lv_ownedType_9_0= ruleTypeExpCS ) )? ( (otherlv_10= 'pre' ( (lv_ownedPreconditions_11_0= ruleConstraintCS ) ) ) | (otherlv_12= 'post' ( (lv_ownedPostconditions_13_0= ruleConstraintCS ) ) ) | (otherlv_14= 'body' ( ruleUnrestrictedName )? otherlv_16= ':' ( (lv_ownedBodies_17_0= ruleSpecificationCS ) ) ) )* ) )
            // InternalCPL.g:1478:2: (otherlv_0= 'context' ( (lv_ownedSignature_1_0= ruleTemplateSignatureCS ) )? ( (lv_ownedPathName_2_0= rulePathNameCS ) ) otherlv_3= '(' ( ( (lv_ownedParameters_4_0= ruleParameterCS ) ) (otherlv_5= ',' ( (lv_ownedParameters_6_0= ruleParameterCS ) ) )* )? otherlv_7= ')' otherlv_8= ':' ( (lv_ownedType_9_0= ruleTypeExpCS ) )? ( (otherlv_10= 'pre' ( (lv_ownedPreconditions_11_0= ruleConstraintCS ) ) ) | (otherlv_12= 'post' ( (lv_ownedPostconditions_13_0= ruleConstraintCS ) ) ) | (otherlv_14= 'body' ( ruleUnrestrictedName )? otherlv_16= ':' ( (lv_ownedBodies_17_0= ruleSpecificationCS ) ) ) )* )
            {
            // InternalCPL.g:1478:2: (otherlv_0= 'context' ( (lv_ownedSignature_1_0= ruleTemplateSignatureCS ) )? ( (lv_ownedPathName_2_0= rulePathNameCS ) ) otherlv_3= '(' ( ( (lv_ownedParameters_4_0= ruleParameterCS ) ) (otherlv_5= ',' ( (lv_ownedParameters_6_0= ruleParameterCS ) ) )* )? otherlv_7= ')' otherlv_8= ':' ( (lv_ownedType_9_0= ruleTypeExpCS ) )? ( (otherlv_10= 'pre' ( (lv_ownedPreconditions_11_0= ruleConstraintCS ) ) ) | (otherlv_12= 'post' ( (lv_ownedPostconditions_13_0= ruleConstraintCS ) ) ) | (otherlv_14= 'body' ( ruleUnrestrictedName )? otherlv_16= ':' ( (lv_ownedBodies_17_0= ruleSpecificationCS ) ) ) )* )
            // InternalCPL.g:1479:3: otherlv_0= 'context' ( (lv_ownedSignature_1_0= ruleTemplateSignatureCS ) )? ( (lv_ownedPathName_2_0= rulePathNameCS ) ) otherlv_3= '(' ( ( (lv_ownedParameters_4_0= ruleParameterCS ) ) (otherlv_5= ',' ( (lv_ownedParameters_6_0= ruleParameterCS ) ) )* )? otherlv_7= ')' otherlv_8= ':' ( (lv_ownedType_9_0= ruleTypeExpCS ) )? ( (otherlv_10= 'pre' ( (lv_ownedPreconditions_11_0= ruleConstraintCS ) ) ) | (otherlv_12= 'post' ( (lv_ownedPostconditions_13_0= ruleConstraintCS ) ) ) | (otherlv_14= 'body' ( ruleUnrestrictedName )? otherlv_16= ':' ( (lv_ownedBodies_17_0= ruleSpecificationCS ) ) ) )*
            {
            otherlv_0=(Token)match(input,48,FollowSets000.FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getOperationContextDeclCSAccess().getContextKeyword_0());
              		
            }
            // InternalCPL.g:1483:3: ( (lv_ownedSignature_1_0= ruleTemplateSignatureCS ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==34||LA39_0==44) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalCPL.g:1484:4: (lv_ownedSignature_1_0= ruleTemplateSignatureCS )
                    {
                    // InternalCPL.g:1484:4: (lv_ownedSignature_1_0= ruleTemplateSignatureCS )
                    // InternalCPL.g:1485:5: lv_ownedSignature_1_0= ruleTemplateSignatureCS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getOperationContextDeclCSAccess().getOwnedSignatureTemplateSignatureCSParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_25);
                    lv_ownedSignature_1_0=ruleTemplateSignatureCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getOperationContextDeclCSRule());
                      					}
                      					set(
                      						current,
                      						"ownedSignature",
                      						lv_ownedSignature_1_0,
                      						"org.eclipse.ocl.xtext.completeocl.CompleteOCL.TemplateSignatureCS");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCPL.g:1502:3: ( (lv_ownedPathName_2_0= rulePathNameCS ) )
            // InternalCPL.g:1503:4: (lv_ownedPathName_2_0= rulePathNameCS )
            {
            // InternalCPL.g:1503:4: (lv_ownedPathName_2_0= rulePathNameCS )
            // InternalCPL.g:1504:5: lv_ownedPathName_2_0= rulePathNameCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOperationContextDeclCSAccess().getOwnedPathNamePathNameCSParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_33);
            lv_ownedPathName_2_0=rulePathNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOperationContextDeclCSRule());
              					}
              					set(
              						current,
              						"ownedPathName",
              						lv_ownedPathName_2_0,
              						"org.eclipse.ocl.xtext.base.Base.PathNameCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,44,FollowSets000.FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getOperationContextDeclCSAccess().getLeftParenthesisKeyword_3());
              		
            }
            // InternalCPL.g:1525:3: ( ( (lv_ownedParameters_4_0= ruleParameterCS ) ) (otherlv_5= ',' ( (lv_ownedParameters_6_0= ruleParameterCS ) ) )* )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=RULE_SIMPLE_ID && LA41_0<=RULE_ESCAPED_ID)||LA41_0==22||(LA41_0>=53 && LA41_0<=54)||(LA41_0>=63 && LA41_0<=72)||(LA41_0>=88 && LA41_0<=89)||(LA41_0>=91 && LA41_0<=95)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalCPL.g:1526:4: ( (lv_ownedParameters_4_0= ruleParameterCS ) ) (otherlv_5= ',' ( (lv_ownedParameters_6_0= ruleParameterCS ) ) )*
                    {
                    // InternalCPL.g:1526:4: ( (lv_ownedParameters_4_0= ruleParameterCS ) )
                    // InternalCPL.g:1527:5: (lv_ownedParameters_4_0= ruleParameterCS )
                    {
                    // InternalCPL.g:1527:5: (lv_ownedParameters_4_0= ruleParameterCS )
                    // InternalCPL.g:1528:6: lv_ownedParameters_4_0= ruleParameterCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOperationContextDeclCSAccess().getOwnedParametersParameterCSParserRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_35);
                    lv_ownedParameters_4_0=ruleParameterCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOperationContextDeclCSRule());
                      						}
                      						add(
                      							current,
                      							"ownedParameters",
                      							lv_ownedParameters_4_0,
                      							"org.eclipse.ocl.xtext.completeocl.CompleteOCL.ParameterCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalCPL.g:1545:4: (otherlv_5= ',' ( (lv_ownedParameters_6_0= ruleParameterCS ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==52) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalCPL.g:1546:5: otherlv_5= ',' ( (lv_ownedParameters_6_0= ruleParameterCS ) )
                    	    {
                    	    otherlv_5=(Token)match(input,52,FollowSets000.FOLLOW_38); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getOperationContextDeclCSAccess().getCommaKeyword_4_1_0());
                    	      				
                    	    }
                    	    // InternalCPL.g:1550:5: ( (lv_ownedParameters_6_0= ruleParameterCS ) )
                    	    // InternalCPL.g:1551:6: (lv_ownedParameters_6_0= ruleParameterCS )
                    	    {
                    	    // InternalCPL.g:1551:6: (lv_ownedParameters_6_0= ruleParameterCS )
                    	    // InternalCPL.g:1552:7: lv_ownedParameters_6_0= ruleParameterCS
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getOperationContextDeclCSAccess().getOwnedParametersParameterCSParserRuleCall_4_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_35);
                    	    lv_ownedParameters_6_0=ruleParameterCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getOperationContextDeclCSRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"ownedParameters",
                    	      								lv_ownedParameters_6_0,
                    	      								"org.eclipse.ocl.xtext.completeocl.CompleteOCL.ParameterCS");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,45,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getOperationContextDeclCSAccess().getRightParenthesisKeyword_5());
              		
            }
            otherlv_8=(Token)match(input,24,FollowSets000.FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getOperationContextDeclCSAccess().getColonKeyword_6());
              		
            }
            // InternalCPL.g:1579:3: ( (lv_ownedType_9_0= ruleTypeExpCS ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=RULE_SIMPLE_ID && LA42_0<=RULE_ESCAPED_ID)||LA42_0==22||(LA42_0>=53 && LA42_0<=54)||(LA42_0>=63 && LA42_0<=72)||(LA42_0>=88 && LA42_0<=89)||(LA42_0>=91 && LA42_0<=95)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalCPL.g:1580:4: (lv_ownedType_9_0= ruleTypeExpCS )
                    {
                    // InternalCPL.g:1580:4: (lv_ownedType_9_0= ruleTypeExpCS )
                    // InternalCPL.g:1581:5: lv_ownedType_9_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getOperationContextDeclCSAccess().getOwnedTypeTypeExpCSParserRuleCall_7_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_41);
                    lv_ownedType_9_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getOperationContextDeclCSRule());
                      					}
                      					set(
                      						current,
                      						"ownedType",
                      						lv_ownedType_9_0,
                      						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpCS");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCPL.g:1598:3: ( (otherlv_10= 'pre' ( (lv_ownedPreconditions_11_0= ruleConstraintCS ) ) ) | (otherlv_12= 'post' ( (lv_ownedPostconditions_13_0= ruleConstraintCS ) ) ) | (otherlv_14= 'body' ( ruleUnrestrictedName )? otherlv_16= ':' ( (lv_ownedBodies_17_0= ruleSpecificationCS ) ) ) )*
            loop44:
            do {
                int alt44=4;
                switch ( input.LA(1) ) {
                case 55:
                    {
                    alt44=1;
                    }
                    break;
                case 56:
                    {
                    alt44=2;
                    }
                    break;
                case 57:
                    {
                    alt44=3;
                    }
                    break;

                }

                switch (alt44) {
            	case 1 :
            	    // InternalCPL.g:1599:4: (otherlv_10= 'pre' ( (lv_ownedPreconditions_11_0= ruleConstraintCS ) ) )
            	    {
            	    // InternalCPL.g:1599:4: (otherlv_10= 'pre' ( (lv_ownedPreconditions_11_0= ruleConstraintCS ) ) )
            	    // InternalCPL.g:1600:5: otherlv_10= 'pre' ( (lv_ownedPreconditions_11_0= ruleConstraintCS ) )
            	    {
            	    otherlv_10=(Token)match(input,55,FollowSets000.FOLLOW_27); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_10, grammarAccess.getOperationContextDeclCSAccess().getPreKeyword_8_0_0());
            	      				
            	    }
            	    // InternalCPL.g:1604:5: ( (lv_ownedPreconditions_11_0= ruleConstraintCS ) )
            	    // InternalCPL.g:1605:6: (lv_ownedPreconditions_11_0= ruleConstraintCS )
            	    {
            	    // InternalCPL.g:1605:6: (lv_ownedPreconditions_11_0= ruleConstraintCS )
            	    // InternalCPL.g:1606:7: lv_ownedPreconditions_11_0= ruleConstraintCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getOperationContextDeclCSAccess().getOwnedPreconditionsConstraintCSParserRuleCall_8_0_1_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_41);
            	    lv_ownedPreconditions_11_0=ruleConstraintCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getOperationContextDeclCSRule());
            	      							}
            	      							add(
            	      								current,
            	      								"ownedPreconditions",
            	      								lv_ownedPreconditions_11_0,
            	      								"org.eclipse.ocl.xtext.completeocl.CompleteOCL.ConstraintCS");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalCPL.g:1625:4: (otherlv_12= 'post' ( (lv_ownedPostconditions_13_0= ruleConstraintCS ) ) )
            	    {
            	    // InternalCPL.g:1625:4: (otherlv_12= 'post' ( (lv_ownedPostconditions_13_0= ruleConstraintCS ) ) )
            	    // InternalCPL.g:1626:5: otherlv_12= 'post' ( (lv_ownedPostconditions_13_0= ruleConstraintCS ) )
            	    {
            	    otherlv_12=(Token)match(input,56,FollowSets000.FOLLOW_27); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_12, grammarAccess.getOperationContextDeclCSAccess().getPostKeyword_8_1_0());
            	      				
            	    }
            	    // InternalCPL.g:1630:5: ( (lv_ownedPostconditions_13_0= ruleConstraintCS ) )
            	    // InternalCPL.g:1631:6: (lv_ownedPostconditions_13_0= ruleConstraintCS )
            	    {
            	    // InternalCPL.g:1631:6: (lv_ownedPostconditions_13_0= ruleConstraintCS )
            	    // InternalCPL.g:1632:7: lv_ownedPostconditions_13_0= ruleConstraintCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getOperationContextDeclCSAccess().getOwnedPostconditionsConstraintCSParserRuleCall_8_1_1_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_41);
            	    lv_ownedPostconditions_13_0=ruleConstraintCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getOperationContextDeclCSRule());
            	      							}
            	      							add(
            	      								current,
            	      								"ownedPostconditions",
            	      								lv_ownedPostconditions_13_0,
            	      								"org.eclipse.ocl.xtext.completeocl.CompleteOCL.ConstraintCS");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalCPL.g:1651:4: (otherlv_14= 'body' ( ruleUnrestrictedName )? otherlv_16= ':' ( (lv_ownedBodies_17_0= ruleSpecificationCS ) ) )
            	    {
            	    // InternalCPL.g:1651:4: (otherlv_14= 'body' ( ruleUnrestrictedName )? otherlv_16= ':' ( (lv_ownedBodies_17_0= ruleSpecificationCS ) ) )
            	    // InternalCPL.g:1652:5: otherlv_14= 'body' ( ruleUnrestrictedName )? otherlv_16= ':' ( (lv_ownedBodies_17_0= ruleSpecificationCS ) )
            	    {
            	    otherlv_14=(Token)match(input,57,FollowSets000.FOLLOW_27); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_14, grammarAccess.getOperationContextDeclCSAccess().getBodyKeyword_8_2_0());
            	      				
            	    }
            	    // InternalCPL.g:1656:5: ( ruleUnrestrictedName )?
            	    int alt43=2;
            	    int LA43_0 = input.LA(1);

            	    if ( ((LA43_0>=RULE_SIMPLE_ID && LA43_0<=RULE_ESCAPED_ID)||LA43_0==22||(LA43_0>=53 && LA43_0<=54)) ) {
            	        alt43=1;
            	    }
            	    switch (alt43) {
            	        case 1 :
            	            // InternalCPL.g:1657:6: ruleUnrestrictedName
            	            {
            	            if ( state.backtracking==0 ) {

            	              						/* */
            	              					
            	            }
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getOperationContextDeclCSAccess().getUnrestrictedNameParserRuleCall_8_2_1());
            	              					
            	            }
            	            pushFollow(FollowSets000.FOLLOW_14);
            	            ruleUnrestrictedName();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }
            	            break;

            	    }

            	    otherlv_16=(Token)match(input,24,FollowSets000.FOLLOW_30); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_16, grammarAccess.getOperationContextDeclCSAccess().getColonKeyword_8_2_2());
            	      				
            	    }
            	    // InternalCPL.g:1672:5: ( (lv_ownedBodies_17_0= ruleSpecificationCS ) )
            	    // InternalCPL.g:1673:6: (lv_ownedBodies_17_0= ruleSpecificationCS )
            	    {
            	    // InternalCPL.g:1673:6: (lv_ownedBodies_17_0= ruleSpecificationCS )
            	    // InternalCPL.g:1674:7: lv_ownedBodies_17_0= ruleSpecificationCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getOperationContextDeclCSAccess().getOwnedBodiesSpecificationCSParserRuleCall_8_2_3_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_41);
            	    lv_ownedBodies_17_0=ruleSpecificationCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getOperationContextDeclCSRule());
            	      							}
            	      							add(
            	      								current,
            	      								"ownedBodies",
            	      								lv_ownedBodies_17_0,
            	      								"org.eclipse.ocl.xtext.completeocl.CompleteOCL.SpecificationCS");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperationContextDeclCS"


    // $ANTLR start "entryRulePackageDeclarationCS"
    // InternalCPL.g:1697:1: entryRulePackageDeclarationCS returns [EObject current=null] : iv_rulePackageDeclarationCS= rulePackageDeclarationCS EOF ;
    public final EObject entryRulePackageDeclarationCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDeclarationCS = null;


        try {
            // InternalCPL.g:1697:61: (iv_rulePackageDeclarationCS= rulePackageDeclarationCS EOF )
            // InternalCPL.g:1698:2: iv_rulePackageDeclarationCS= rulePackageDeclarationCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackageDeclarationCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePackageDeclarationCS=rulePackageDeclarationCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackageDeclarationCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackageDeclarationCS"


    // $ANTLR start "rulePackageDeclarationCS"
    // InternalCPL.g:1704:1: rulePackageDeclarationCS returns [EObject current=null] : (otherlv_0= 'package' ( (lv_ownedPathName_1_0= rulePathNameCS ) ) (otherlv_2= 'inv' ( (lv_ownedInvariants_3_0= ruleConstraintCS ) ) )* ( (lv_ownedContexts_4_0= ruleContextDeclCS ) )* otherlv_5= 'endpackage' ) ;
    public final EObject rulePackageDeclarationCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_ownedPathName_1_0 = null;

        EObject lv_ownedInvariants_3_0 = null;

        EObject lv_ownedContexts_4_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:1710:2: ( (otherlv_0= 'package' ( (lv_ownedPathName_1_0= rulePathNameCS ) ) (otherlv_2= 'inv' ( (lv_ownedInvariants_3_0= ruleConstraintCS ) ) )* ( (lv_ownedContexts_4_0= ruleContextDeclCS ) )* otherlv_5= 'endpackage' ) )
            // InternalCPL.g:1711:2: (otherlv_0= 'package' ( (lv_ownedPathName_1_0= rulePathNameCS ) ) (otherlv_2= 'inv' ( (lv_ownedInvariants_3_0= ruleConstraintCS ) ) )* ( (lv_ownedContexts_4_0= ruleContextDeclCS ) )* otherlv_5= 'endpackage' )
            {
            // InternalCPL.g:1711:2: (otherlv_0= 'package' ( (lv_ownedPathName_1_0= rulePathNameCS ) ) (otherlv_2= 'inv' ( (lv_ownedInvariants_3_0= ruleConstraintCS ) ) )* ( (lv_ownedContexts_4_0= ruleContextDeclCS ) )* otherlv_5= 'endpackage' )
            // InternalCPL.g:1712:3: otherlv_0= 'package' ( (lv_ownedPathName_1_0= rulePathNameCS ) ) (otherlv_2= 'inv' ( (lv_ownedInvariants_3_0= ruleConstraintCS ) ) )* ( (lv_ownedContexts_4_0= ruleContextDeclCS ) )* otherlv_5= 'endpackage'
            {
            otherlv_0=(Token)match(input,58,FollowSets000.FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPackageDeclarationCSAccess().getPackageKeyword_0());
              		
            }
            // InternalCPL.g:1716:3: ( (lv_ownedPathName_1_0= rulePathNameCS ) )
            // InternalCPL.g:1717:4: (lv_ownedPathName_1_0= rulePathNameCS )
            {
            // InternalCPL.g:1717:4: (lv_ownedPathName_1_0= rulePathNameCS )
            // InternalCPL.g:1718:5: lv_ownedPathName_1_0= rulePathNameCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPackageDeclarationCSAccess().getOwnedPathNamePathNameCSParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_42);
            lv_ownedPathName_1_0=rulePathNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPackageDeclarationCSRule());
              					}
              					set(
              						current,
              						"ownedPathName",
              						lv_ownedPathName_1_0,
              						"org.eclipse.ocl.xtext.base.Base.PathNameCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCPL.g:1735:3: (otherlv_2= 'inv' ( (lv_ownedInvariants_3_0= ruleConstraintCS ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==49) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalCPL.g:1736:4: otherlv_2= 'inv' ( (lv_ownedInvariants_3_0= ruleConstraintCS ) )
            	    {
            	    otherlv_2=(Token)match(input,49,FollowSets000.FOLLOW_27); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getPackageDeclarationCSAccess().getInvKeyword_2_0());
            	      			
            	    }
            	    // InternalCPL.g:1740:4: ( (lv_ownedInvariants_3_0= ruleConstraintCS ) )
            	    // InternalCPL.g:1741:5: (lv_ownedInvariants_3_0= ruleConstraintCS )
            	    {
            	    // InternalCPL.g:1741:5: (lv_ownedInvariants_3_0= ruleConstraintCS )
            	    // InternalCPL.g:1742:6: lv_ownedInvariants_3_0= ruleConstraintCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPackageDeclarationCSAccess().getOwnedInvariantsConstraintCSParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_42);
            	    lv_ownedInvariants_3_0=ruleConstraintCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getPackageDeclarationCSRule());
            	      						}
            	      						add(
            	      							current,
            	      							"ownedInvariants",
            	      							lv_ownedInvariants_3_0,
            	      							"org.eclipse.ocl.xtext.completeocl.CompleteOCL.ConstraintCS");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            // InternalCPL.g:1760:3: ( (lv_ownedContexts_4_0= ruleContextDeclCS ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==48) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalCPL.g:1761:4: (lv_ownedContexts_4_0= ruleContextDeclCS )
            	    {
            	    // InternalCPL.g:1761:4: (lv_ownedContexts_4_0= ruleContextDeclCS )
            	    // InternalCPL.g:1762:5: lv_ownedContexts_4_0= ruleContextDeclCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getPackageDeclarationCSAccess().getOwnedContextsContextDeclCSParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_43);
            	    lv_ownedContexts_4_0=ruleContextDeclCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getPackageDeclarationCSRule());
            	      					}
            	      					add(
            	      						current,
            	      						"ownedContexts",
            	      						lv_ownedContexts_4_0,
            	      						"org.eclipse.ocl.xtext.completeocl.CompleteOCL.ContextDeclCS");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            otherlv_5=(Token)match(input,59,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getPackageDeclarationCSAccess().getEndpackageKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackageDeclarationCS"


    // $ANTLR start "entryRuleParameterCS"
    // InternalCPL.g:1787:1: entryRuleParameterCS returns [EObject current=null] : iv_ruleParameterCS= ruleParameterCS EOF ;
    public final EObject entryRuleParameterCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterCS = null;


        try {
            // InternalCPL.g:1787:52: (iv_ruleParameterCS= ruleParameterCS EOF )
            // InternalCPL.g:1788:2: iv_ruleParameterCS= ruleParameterCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleParameterCS=ruleParameterCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterCS"


    // $ANTLR start "ruleParameterCS"
    // InternalCPL.g:1794:1: ruleParameterCS returns [EObject current=null] : ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' )? ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ) ;
    public final EObject ruleParameterCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:1800:2: ( ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' )? ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ) )
            // InternalCPL.g:1801:2: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' )? ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )
            {
            // InternalCPL.g:1801:2: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' )? ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )
            // InternalCPL.g:1802:3: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' )? ( (lv_ownedType_2_0= ruleTypeExpCS ) )
            {
            // InternalCPL.g:1802:3: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' )?
            int alt47=2;
            switch ( input.LA(1) ) {
                case RULE_SIMPLE_ID:
                    {
                    int LA47_1 = input.LA(2);

                    if ( (LA47_1==24) ) {
                        alt47=1;
                    }
                    }
                    break;
                case RULE_ESCAPED_ID:
                    {
                    int LA47_2 = input.LA(2);

                    if ( (LA47_2==24) ) {
                        alt47=1;
                    }
                    }
                    break;
                case 22:
                    {
                    int LA47_3 = input.LA(2);

                    if ( (LA47_3==24) ) {
                        alt47=1;
                    }
                    }
                    break;
                case 53:
                    {
                    int LA47_4 = input.LA(2);

                    if ( (LA47_4==24) ) {
                        alt47=1;
                    }
                    }
                    break;
                case 54:
                    {
                    int LA47_5 = input.LA(2);

                    if ( (LA47_5==24) ) {
                        alt47=1;
                    }
                    }
                    break;
            }

            switch (alt47) {
                case 1 :
                    // InternalCPL.g:1803:4: ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':'
                    {
                    // InternalCPL.g:1803:4: ( (lv_name_0_0= ruleUnrestrictedName ) )
                    // InternalCPL.g:1804:5: (lv_name_0_0= ruleUnrestrictedName )
                    {
                    // InternalCPL.g:1804:5: (lv_name_0_0= ruleUnrestrictedName )
                    // InternalCPL.g:1805:6: lv_name_0_0= ruleUnrestrictedName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getParameterCSAccess().getNameUnrestrictedNameParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_14);
                    lv_name_0_0=ruleUnrestrictedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getParameterCSRule());
                      						}
                      						set(
                      							current,
                      							"name",
                      							lv_name_0_0,
                      							"org.eclipse.ocl.xtext.completeocl.CompleteOCL.UnrestrictedName");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getParameterCSAccess().getColonKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalCPL.g:1827:3: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
            // InternalCPL.g:1828:4: (lv_ownedType_2_0= ruleTypeExpCS )
            {
            // InternalCPL.g:1828:4: (lv_ownedType_2_0= ruleTypeExpCS )
            // InternalCPL.g:1829:5: lv_ownedType_2_0= ruleTypeExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParameterCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_ownedType_2_0=ruleTypeExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParameterCSRule());
              					}
              					set(
              						current,
              						"ownedType",
              						lv_ownedType_2_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterCS"


    // $ANTLR start "entryRulePropertyContextDeclCS"
    // InternalCPL.g:1850:1: entryRulePropertyContextDeclCS returns [EObject current=null] : iv_rulePropertyContextDeclCS= rulePropertyContextDeclCS EOF ;
    public final EObject entryRulePropertyContextDeclCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyContextDeclCS = null;


        try {
            // InternalCPL.g:1850:62: (iv_rulePropertyContextDeclCS= rulePropertyContextDeclCS EOF )
            // InternalCPL.g:1851:2: iv_rulePropertyContextDeclCS= rulePropertyContextDeclCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyContextDeclCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePropertyContextDeclCS=rulePropertyContextDeclCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyContextDeclCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyContextDeclCS"


    // $ANTLR start "rulePropertyContextDeclCS"
    // InternalCPL.g:1857:1: rulePropertyContextDeclCS returns [EObject current=null] : (otherlv_0= 'context' ( (lv_ownedPathName_1_0= rulePathNameCS ) ) otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) ( (otherlv_4= 'derive' ( ruleUnrestrictedName )? otherlv_6= ':' ( (lv_ownedDefaultExpressions_7_0= ruleSpecificationCS ) ) ) | (otherlv_8= 'init' ( ruleUnrestrictedName )? otherlv_10= ':' ( (lv_ownedDefaultExpressions_11_0= ruleSpecificationCS ) ) ) )* ) ;
    public final EObject rulePropertyContextDeclCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_ownedPathName_1_0 = null;

        EObject lv_ownedType_3_0 = null;

        EObject lv_ownedDefaultExpressions_7_0 = null;

        EObject lv_ownedDefaultExpressions_11_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:1863:2: ( (otherlv_0= 'context' ( (lv_ownedPathName_1_0= rulePathNameCS ) ) otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) ( (otherlv_4= 'derive' ( ruleUnrestrictedName )? otherlv_6= ':' ( (lv_ownedDefaultExpressions_7_0= ruleSpecificationCS ) ) ) | (otherlv_8= 'init' ( ruleUnrestrictedName )? otherlv_10= ':' ( (lv_ownedDefaultExpressions_11_0= ruleSpecificationCS ) ) ) )* ) )
            // InternalCPL.g:1864:2: (otherlv_0= 'context' ( (lv_ownedPathName_1_0= rulePathNameCS ) ) otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) ( (otherlv_4= 'derive' ( ruleUnrestrictedName )? otherlv_6= ':' ( (lv_ownedDefaultExpressions_7_0= ruleSpecificationCS ) ) ) | (otherlv_8= 'init' ( ruleUnrestrictedName )? otherlv_10= ':' ( (lv_ownedDefaultExpressions_11_0= ruleSpecificationCS ) ) ) )* )
            {
            // InternalCPL.g:1864:2: (otherlv_0= 'context' ( (lv_ownedPathName_1_0= rulePathNameCS ) ) otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) ( (otherlv_4= 'derive' ( ruleUnrestrictedName )? otherlv_6= ':' ( (lv_ownedDefaultExpressions_7_0= ruleSpecificationCS ) ) ) | (otherlv_8= 'init' ( ruleUnrestrictedName )? otherlv_10= ':' ( (lv_ownedDefaultExpressions_11_0= ruleSpecificationCS ) ) ) )* )
            // InternalCPL.g:1865:3: otherlv_0= 'context' ( (lv_ownedPathName_1_0= rulePathNameCS ) ) otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) ( (otherlv_4= 'derive' ( ruleUnrestrictedName )? otherlv_6= ':' ( (lv_ownedDefaultExpressions_7_0= ruleSpecificationCS ) ) ) | (otherlv_8= 'init' ( ruleUnrestrictedName )? otherlv_10= ':' ( (lv_ownedDefaultExpressions_11_0= ruleSpecificationCS ) ) ) )*
            {
            otherlv_0=(Token)match(input,48,FollowSets000.FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPropertyContextDeclCSAccess().getContextKeyword_0());
              		
            }
            // InternalCPL.g:1869:3: ( (lv_ownedPathName_1_0= rulePathNameCS ) )
            // InternalCPL.g:1870:4: (lv_ownedPathName_1_0= rulePathNameCS )
            {
            // InternalCPL.g:1870:4: (lv_ownedPathName_1_0= rulePathNameCS )
            // InternalCPL.g:1871:5: lv_ownedPathName_1_0= rulePathNameCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPropertyContextDeclCSAccess().getOwnedPathNamePathNameCSParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_14);
            lv_ownedPathName_1_0=rulePathNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPropertyContextDeclCSRule());
              					}
              					set(
              						current,
              						"ownedPathName",
              						lv_ownedPathName_1_0,
              						"org.eclipse.ocl.xtext.base.Base.PathNameCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPropertyContextDeclCSAccess().getColonKeyword_2());
              		
            }
            // InternalCPL.g:1892:3: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
            // InternalCPL.g:1893:4: (lv_ownedType_3_0= ruleTypeExpCS )
            {
            // InternalCPL.g:1893:4: (lv_ownedType_3_0= ruleTypeExpCS )
            // InternalCPL.g:1894:5: lv_ownedType_3_0= ruleTypeExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPropertyContextDeclCSAccess().getOwnedTypeTypeExpCSParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_44);
            lv_ownedType_3_0=ruleTypeExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPropertyContextDeclCSRule());
              					}
              					set(
              						current,
              						"ownedType",
              						lv_ownedType_3_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCPL.g:1911:3: ( (otherlv_4= 'derive' ( ruleUnrestrictedName )? otherlv_6= ':' ( (lv_ownedDefaultExpressions_7_0= ruleSpecificationCS ) ) ) | (otherlv_8= 'init' ( ruleUnrestrictedName )? otherlv_10= ':' ( (lv_ownedDefaultExpressions_11_0= ruleSpecificationCS ) ) ) )*
            loop50:
            do {
                int alt50=3;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==60) ) {
                    alt50=1;
                }
                else if ( (LA50_0==61) ) {
                    alt50=2;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalCPL.g:1912:4: (otherlv_4= 'derive' ( ruleUnrestrictedName )? otherlv_6= ':' ( (lv_ownedDefaultExpressions_7_0= ruleSpecificationCS ) ) )
            	    {
            	    // InternalCPL.g:1912:4: (otherlv_4= 'derive' ( ruleUnrestrictedName )? otherlv_6= ':' ( (lv_ownedDefaultExpressions_7_0= ruleSpecificationCS ) ) )
            	    // InternalCPL.g:1913:5: otherlv_4= 'derive' ( ruleUnrestrictedName )? otherlv_6= ':' ( (lv_ownedDefaultExpressions_7_0= ruleSpecificationCS ) )
            	    {
            	    otherlv_4=(Token)match(input,60,FollowSets000.FOLLOW_27); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_4, grammarAccess.getPropertyContextDeclCSAccess().getDeriveKeyword_4_0_0());
            	      				
            	    }
            	    // InternalCPL.g:1917:5: ( ruleUnrestrictedName )?
            	    int alt48=2;
            	    int LA48_0 = input.LA(1);

            	    if ( ((LA48_0>=RULE_SIMPLE_ID && LA48_0<=RULE_ESCAPED_ID)||LA48_0==22||(LA48_0>=53 && LA48_0<=54)) ) {
            	        alt48=1;
            	    }
            	    switch (alt48) {
            	        case 1 :
            	            // InternalCPL.g:1918:6: ruleUnrestrictedName
            	            {
            	            if ( state.backtracking==0 ) {

            	              						/* */
            	              					
            	            }
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getPropertyContextDeclCSAccess().getUnrestrictedNameParserRuleCall_4_0_1());
            	              					
            	            }
            	            pushFollow(FollowSets000.FOLLOW_14);
            	            ruleUnrestrictedName();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }
            	            break;

            	    }

            	    otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_30); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_6, grammarAccess.getPropertyContextDeclCSAccess().getColonKeyword_4_0_2());
            	      				
            	    }
            	    // InternalCPL.g:1933:5: ( (lv_ownedDefaultExpressions_7_0= ruleSpecificationCS ) )
            	    // InternalCPL.g:1934:6: (lv_ownedDefaultExpressions_7_0= ruleSpecificationCS )
            	    {
            	    // InternalCPL.g:1934:6: (lv_ownedDefaultExpressions_7_0= ruleSpecificationCS )
            	    // InternalCPL.g:1935:7: lv_ownedDefaultExpressions_7_0= ruleSpecificationCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getPropertyContextDeclCSAccess().getOwnedDefaultExpressionsSpecificationCSParserRuleCall_4_0_3_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_44);
            	    lv_ownedDefaultExpressions_7_0=ruleSpecificationCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getPropertyContextDeclCSRule());
            	      							}
            	      							add(
            	      								current,
            	      								"ownedDefaultExpressions",
            	      								lv_ownedDefaultExpressions_7_0,
            	      								"org.eclipse.ocl.xtext.completeocl.CompleteOCL.SpecificationCS");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalCPL.g:1954:4: (otherlv_8= 'init' ( ruleUnrestrictedName )? otherlv_10= ':' ( (lv_ownedDefaultExpressions_11_0= ruleSpecificationCS ) ) )
            	    {
            	    // InternalCPL.g:1954:4: (otherlv_8= 'init' ( ruleUnrestrictedName )? otherlv_10= ':' ( (lv_ownedDefaultExpressions_11_0= ruleSpecificationCS ) ) )
            	    // InternalCPL.g:1955:5: otherlv_8= 'init' ( ruleUnrestrictedName )? otherlv_10= ':' ( (lv_ownedDefaultExpressions_11_0= ruleSpecificationCS ) )
            	    {
            	    otherlv_8=(Token)match(input,61,FollowSets000.FOLLOW_27); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_8, grammarAccess.getPropertyContextDeclCSAccess().getInitKeyword_4_1_0());
            	      				
            	    }
            	    // InternalCPL.g:1959:5: ( ruleUnrestrictedName )?
            	    int alt49=2;
            	    int LA49_0 = input.LA(1);

            	    if ( ((LA49_0>=RULE_SIMPLE_ID && LA49_0<=RULE_ESCAPED_ID)||LA49_0==22||(LA49_0>=53 && LA49_0<=54)) ) {
            	        alt49=1;
            	    }
            	    switch (alt49) {
            	        case 1 :
            	            // InternalCPL.g:1960:6: ruleUnrestrictedName
            	            {
            	            if ( state.backtracking==0 ) {

            	              						/* */
            	              					
            	            }
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getPropertyContextDeclCSAccess().getUnrestrictedNameParserRuleCall_4_1_1());
            	              					
            	            }
            	            pushFollow(FollowSets000.FOLLOW_14);
            	            ruleUnrestrictedName();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }
            	            break;

            	    }

            	    otherlv_10=(Token)match(input,24,FollowSets000.FOLLOW_30); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_10, grammarAccess.getPropertyContextDeclCSAccess().getColonKeyword_4_1_2());
            	      				
            	    }
            	    // InternalCPL.g:1975:5: ( (lv_ownedDefaultExpressions_11_0= ruleSpecificationCS ) )
            	    // InternalCPL.g:1976:6: (lv_ownedDefaultExpressions_11_0= ruleSpecificationCS )
            	    {
            	    // InternalCPL.g:1976:6: (lv_ownedDefaultExpressions_11_0= ruleSpecificationCS )
            	    // InternalCPL.g:1977:7: lv_ownedDefaultExpressions_11_0= ruleSpecificationCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getPropertyContextDeclCSAccess().getOwnedDefaultExpressionsSpecificationCSParserRuleCall_4_1_3_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_44);
            	    lv_ownedDefaultExpressions_11_0=ruleSpecificationCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getPropertyContextDeclCSRule());
            	      							}
            	      							add(
            	      								current,
            	      								"ownedDefaultExpressions",
            	      								lv_ownedDefaultExpressions_11_0,
            	      								"org.eclipse.ocl.xtext.completeocl.CompleteOCL.SpecificationCS");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyContextDeclCS"


    // $ANTLR start "entryRuleSpecificationCS"
    // InternalCPL.g:2000:1: entryRuleSpecificationCS returns [EObject current=null] : iv_ruleSpecificationCS= ruleSpecificationCS EOF ;
    public final EObject entryRuleSpecificationCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecificationCS = null;


        try {
            // InternalCPL.g:2000:56: (iv_ruleSpecificationCS= ruleSpecificationCS EOF )
            // InternalCPL.g:2001:2: iv_ruleSpecificationCS= ruleSpecificationCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSpecificationCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSpecificationCS=ruleSpecificationCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSpecificationCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpecificationCS"


    // $ANTLR start "ruleSpecificationCS"
    // InternalCPL.g:2007:1: ruleSpecificationCS returns [EObject current=null] : ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) | ( (lv_exprString_1_0= RULE_UNQUOTED_STRING ) ) ) ;
    public final EObject ruleSpecificationCS() throws RecognitionException {
        EObject current = null;

        Token lv_exprString_1_0=null;
        EObject lv_ownedExpression_0_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:2013:2: ( ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) | ( (lv_exprString_1_0= RULE_UNQUOTED_STRING ) ) ) )
            // InternalCPL.g:2014:2: ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) | ( (lv_exprString_1_0= RULE_UNQUOTED_STRING ) ) )
            {
            // InternalCPL.g:2014:2: ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) | ( (lv_exprString_1_0= RULE_UNQUOTED_STRING ) ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=RULE_SIMPLE_ID && LA51_0<=RULE_SINGLE_QUOTED_STRING)||LA51_0==22||LA51_0==44||(LA51_0>=53 && LA51_0<=54)||(LA51_0>=63 && LA51_0<=76)||(LA51_0>=88 && LA51_0<=89)||(LA51_0>=91 && LA51_0<=95)||LA51_0==98||(LA51_0>=100 && LA51_0<=103)||LA51_0==110||(LA51_0>=115 && LA51_0<=116)) ) {
                alt51=1;
            }
            else if ( (LA51_0==RULE_UNQUOTED_STRING) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalCPL.g:2015:3: ( (lv_ownedExpression_0_0= ruleExpCS ) )
                    {
                    // InternalCPL.g:2015:3: ( (lv_ownedExpression_0_0= ruleExpCS ) )
                    // InternalCPL.g:2016:4: (lv_ownedExpression_0_0= ruleExpCS )
                    {
                    // InternalCPL.g:2016:4: (lv_ownedExpression_0_0= ruleExpCS )
                    // InternalCPL.g:2017:5: lv_ownedExpression_0_0= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getSpecificationCSAccess().getOwnedExpressionExpCSParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_ownedExpression_0_0=ruleExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getSpecificationCSRule());
                      					}
                      					set(
                      						current,
                      						"ownedExpression",
                      						lv_ownedExpression_0_0,
                      						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCPL.g:2035:3: ( (lv_exprString_1_0= RULE_UNQUOTED_STRING ) )
                    {
                    // InternalCPL.g:2035:3: ( (lv_exprString_1_0= RULE_UNQUOTED_STRING ) )
                    // InternalCPL.g:2036:4: (lv_exprString_1_0= RULE_UNQUOTED_STRING )
                    {
                    // InternalCPL.g:2036:4: (lv_exprString_1_0= RULE_UNQUOTED_STRING )
                    // InternalCPL.g:2037:5: lv_exprString_1_0= RULE_UNQUOTED_STRING
                    {
                    lv_exprString_1_0=(Token)match(input,RULE_UNQUOTED_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_exprString_1_0, grammarAccess.getSpecificationCSAccess().getExprStringUNQUOTED_STRINGTerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getSpecificationCSRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"exprString",
                      						lv_exprString_1_0,
                      						"org.eclipse.ocl.xtext.completeocl.CompleteOCL.UNQUOTED_STRING");
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpecificationCS"


    // $ANTLR start "entryRuleTemplateSignatureCS"
    // InternalCPL.g:2057:1: entryRuleTemplateSignatureCS returns [EObject current=null] : iv_ruleTemplateSignatureCS= ruleTemplateSignatureCS EOF ;
    public final EObject entryRuleTemplateSignatureCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateSignatureCS = null;


        try {
            // InternalCPL.g:2057:60: (iv_ruleTemplateSignatureCS= ruleTemplateSignatureCS EOF )
            // InternalCPL.g:2058:2: iv_ruleTemplateSignatureCS= ruleTemplateSignatureCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemplateSignatureCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTemplateSignatureCS=ruleTemplateSignatureCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemplateSignatureCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemplateSignatureCS"


    // $ANTLR start "ruleTemplateSignatureCS"
    // InternalCPL.g:2064:1: ruleTemplateSignatureCS returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_ownedParameters_1_0= ruleTypeParameterCS ) ) (otherlv_2= ',' ( (lv_ownedParameters_3_0= ruleTypeParameterCS ) ) )* otherlv_4= ')' ) | (otherlv_5= '<' ( (lv_ownedParameters_6_0= ruleTypeParameterCS ) ) (otherlv_7= ',' ( (lv_ownedParameters_8_0= ruleTypeParameterCS ) ) )* otherlv_9= '>' ) ) ;
    public final EObject ruleTemplateSignatureCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_ownedParameters_1_0 = null;

        EObject lv_ownedParameters_3_0 = null;

        EObject lv_ownedParameters_6_0 = null;

        EObject lv_ownedParameters_8_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:2070:2: ( ( (otherlv_0= '(' ( (lv_ownedParameters_1_0= ruleTypeParameterCS ) ) (otherlv_2= ',' ( (lv_ownedParameters_3_0= ruleTypeParameterCS ) ) )* otherlv_4= ')' ) | (otherlv_5= '<' ( (lv_ownedParameters_6_0= ruleTypeParameterCS ) ) (otherlv_7= ',' ( (lv_ownedParameters_8_0= ruleTypeParameterCS ) ) )* otherlv_9= '>' ) ) )
            // InternalCPL.g:2071:2: ( (otherlv_0= '(' ( (lv_ownedParameters_1_0= ruleTypeParameterCS ) ) (otherlv_2= ',' ( (lv_ownedParameters_3_0= ruleTypeParameterCS ) ) )* otherlv_4= ')' ) | (otherlv_5= '<' ( (lv_ownedParameters_6_0= ruleTypeParameterCS ) ) (otherlv_7= ',' ( (lv_ownedParameters_8_0= ruleTypeParameterCS ) ) )* otherlv_9= '>' ) )
            {
            // InternalCPL.g:2071:2: ( (otherlv_0= '(' ( (lv_ownedParameters_1_0= ruleTypeParameterCS ) ) (otherlv_2= ',' ( (lv_ownedParameters_3_0= ruleTypeParameterCS ) ) )* otherlv_4= ')' ) | (otherlv_5= '<' ( (lv_ownedParameters_6_0= ruleTypeParameterCS ) ) (otherlv_7= ',' ( (lv_ownedParameters_8_0= ruleTypeParameterCS ) ) )* otherlv_9= '>' ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==44) ) {
                alt54=1;
            }
            else if ( (LA54_0==34) ) {
                alt54=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalCPL.g:2072:3: (otherlv_0= '(' ( (lv_ownedParameters_1_0= ruleTypeParameterCS ) ) (otherlv_2= ',' ( (lv_ownedParameters_3_0= ruleTypeParameterCS ) ) )* otherlv_4= ')' )
                    {
                    // InternalCPL.g:2072:3: (otherlv_0= '(' ( (lv_ownedParameters_1_0= ruleTypeParameterCS ) ) (otherlv_2= ',' ( (lv_ownedParameters_3_0= ruleTypeParameterCS ) ) )* otherlv_4= ')' )
                    // InternalCPL.g:2073:4: otherlv_0= '(' ( (lv_ownedParameters_1_0= ruleTypeParameterCS ) ) (otherlv_2= ',' ( (lv_ownedParameters_3_0= ruleTypeParameterCS ) ) )* otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,44,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getTemplateSignatureCSAccess().getLeftParenthesisKeyword_0_0());
                      			
                    }
                    // InternalCPL.g:2077:4: ( (lv_ownedParameters_1_0= ruleTypeParameterCS ) )
                    // InternalCPL.g:2078:5: (lv_ownedParameters_1_0= ruleTypeParameterCS )
                    {
                    // InternalCPL.g:2078:5: (lv_ownedParameters_1_0= ruleTypeParameterCS )
                    // InternalCPL.g:2079:6: lv_ownedParameters_1_0= ruleTypeParameterCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTemplateSignatureCSAccess().getOwnedParametersTypeParameterCSParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_35);
                    lv_ownedParameters_1_0=ruleTypeParameterCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTemplateSignatureCSRule());
                      						}
                      						add(
                      							current,
                      							"ownedParameters",
                      							lv_ownedParameters_1_0,
                      							"org.eclipse.ocl.xtext.base.Base.TypeParameterCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalCPL.g:2096:4: (otherlv_2= ',' ( (lv_ownedParameters_3_0= ruleTypeParameterCS ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==52) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // InternalCPL.g:2097:5: otherlv_2= ',' ( (lv_ownedParameters_3_0= ruleTypeParameterCS ) )
                    	    {
                    	    otherlv_2=(Token)match(input,52,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getTemplateSignatureCSAccess().getCommaKeyword_0_2_0());
                    	      				
                    	    }
                    	    // InternalCPL.g:2101:5: ( (lv_ownedParameters_3_0= ruleTypeParameterCS ) )
                    	    // InternalCPL.g:2102:6: (lv_ownedParameters_3_0= ruleTypeParameterCS )
                    	    {
                    	    // InternalCPL.g:2102:6: (lv_ownedParameters_3_0= ruleTypeParameterCS )
                    	    // InternalCPL.g:2103:7: lv_ownedParameters_3_0= ruleTypeParameterCS
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getTemplateSignatureCSAccess().getOwnedParametersTypeParameterCSParserRuleCall_0_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_35);
                    	    lv_ownedParameters_3_0=ruleTypeParameterCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getTemplateSignatureCSRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"ownedParameters",
                    	      								lv_ownedParameters_3_0,
                    	      								"org.eclipse.ocl.xtext.base.Base.TypeParameterCS");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getTemplateSignatureCSAccess().getRightParenthesisKeyword_0_3());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCPL.g:2127:3: (otherlv_5= '<' ( (lv_ownedParameters_6_0= ruleTypeParameterCS ) ) (otherlv_7= ',' ( (lv_ownedParameters_8_0= ruleTypeParameterCS ) ) )* otherlv_9= '>' )
                    {
                    // InternalCPL.g:2127:3: (otherlv_5= '<' ( (lv_ownedParameters_6_0= ruleTypeParameterCS ) ) (otherlv_7= ',' ( (lv_ownedParameters_8_0= ruleTypeParameterCS ) ) )* otherlv_9= '>' )
                    // InternalCPL.g:2128:4: otherlv_5= '<' ( (lv_ownedParameters_6_0= ruleTypeParameterCS ) ) (otherlv_7= ',' ( (lv_ownedParameters_8_0= ruleTypeParameterCS ) ) )* otherlv_9= '>'
                    {
                    otherlv_5=(Token)match(input,34,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getTemplateSignatureCSAccess().getLessThanSignKeyword_1_0());
                      			
                    }
                    // InternalCPL.g:2132:4: ( (lv_ownedParameters_6_0= ruleTypeParameterCS ) )
                    // InternalCPL.g:2133:5: (lv_ownedParameters_6_0= ruleTypeParameterCS )
                    {
                    // InternalCPL.g:2133:5: (lv_ownedParameters_6_0= ruleTypeParameterCS )
                    // InternalCPL.g:2134:6: lv_ownedParameters_6_0= ruleTypeParameterCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTemplateSignatureCSAccess().getOwnedParametersTypeParameterCSParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_45);
                    lv_ownedParameters_6_0=ruleTypeParameterCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTemplateSignatureCSRule());
                      						}
                      						add(
                      							current,
                      							"ownedParameters",
                      							lv_ownedParameters_6_0,
                      							"org.eclipse.ocl.xtext.base.Base.TypeParameterCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalCPL.g:2151:4: (otherlv_7= ',' ( (lv_ownedParameters_8_0= ruleTypeParameterCS ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==52) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // InternalCPL.g:2152:5: otherlv_7= ',' ( (lv_ownedParameters_8_0= ruleTypeParameterCS ) )
                    	    {
                    	    otherlv_7=(Token)match(input,52,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_7, grammarAccess.getTemplateSignatureCSAccess().getCommaKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalCPL.g:2156:5: ( (lv_ownedParameters_8_0= ruleTypeParameterCS ) )
                    	    // InternalCPL.g:2157:6: (lv_ownedParameters_8_0= ruleTypeParameterCS )
                    	    {
                    	    // InternalCPL.g:2157:6: (lv_ownedParameters_8_0= ruleTypeParameterCS )
                    	    // InternalCPL.g:2158:7: lv_ownedParameters_8_0= ruleTypeParameterCS
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getTemplateSignatureCSAccess().getOwnedParametersTypeParameterCSParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_45);
                    	    lv_ownedParameters_8_0=ruleTypeParameterCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getTemplateSignatureCSRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"ownedParameters",
                    	      								lv_ownedParameters_8_0,
                    	      								"org.eclipse.ocl.xtext.base.Base.TypeParameterCS");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getTemplateSignatureCSAccess().getGreaterThanSignKeyword_1_3());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemplateSignatureCS"


    // $ANTLR start "entryRuleTypedRefCS"
    // InternalCPL.g:2185:1: entryRuleTypedRefCS returns [EObject current=null] : iv_ruleTypedRefCS= ruleTypedRefCS EOF ;
    public final EObject entryRuleTypedRefCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedRefCS = null;


        try {
            // InternalCPL.g:2185:51: (iv_ruleTypedRefCS= ruleTypedRefCS EOF )
            // InternalCPL.g:2186:2: iv_ruleTypedRefCS= ruleTypedRefCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedRefCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypedRefCS=ruleTypedRefCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypedRefCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypedRefCS"


    // $ANTLR start "ruleTypedRefCS"
    // InternalCPL.g:2192:1: ruleTypedRefCS returns [EObject current=null] : (this_TypeLiteralCS_0= ruleTypeLiteralCS | this_TypedTypeRefCS_1= ruleTypedTypeRefCS ) ;
    public final EObject ruleTypedRefCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypeLiteralCS_0 = null;

        EObject this_TypedTypeRefCS_1 = null;



        	enterRule();

        try {
            // InternalCPL.g:2198:2: ( (this_TypeLiteralCS_0= ruleTypeLiteralCS | this_TypedTypeRefCS_1= ruleTypedTypeRefCS ) )
            // InternalCPL.g:2199:2: (this_TypeLiteralCS_0= ruleTypeLiteralCS | this_TypedTypeRefCS_1= ruleTypedTypeRefCS )
            {
            // InternalCPL.g:2199:2: (this_TypeLiteralCS_0= ruleTypeLiteralCS | this_TypedTypeRefCS_1= ruleTypedTypeRefCS )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=63 && LA55_0<=72)||(LA55_0>=88 && LA55_0<=89)||(LA55_0>=91 && LA55_0<=95)) ) {
                alt55=1;
            }
            else if ( ((LA55_0>=RULE_SIMPLE_ID && LA55_0<=RULE_ESCAPED_ID)||LA55_0==22||(LA55_0>=53 && LA55_0<=54)) ) {
                alt55=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // InternalCPL.g:2200:3: this_TypeLiteralCS_0= ruleTypeLiteralCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypedRefCSAccess().getTypeLiteralCSParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TypeLiteralCS_0=ruleTypeLiteralCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TypeLiteralCS_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCPL.g:2212:3: this_TypedTypeRefCS_1= ruleTypedTypeRefCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypedRefCSAccess().getTypedTypeRefCSParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TypedTypeRefCS_1=ruleTypedTypeRefCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TypedTypeRefCS_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypedRefCS"


    // $ANTLR start "entryRuleUnrestrictedName"
    // InternalCPL.g:2227:1: entryRuleUnrestrictedName returns [String current=null] : iv_ruleUnrestrictedName= ruleUnrestrictedName EOF ;
    public final String entryRuleUnrestrictedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnrestrictedName = null;


        try {
            // InternalCPL.g:2227:56: (iv_ruleUnrestrictedName= ruleUnrestrictedName EOF )
            // InternalCPL.g:2228:2: iv_ruleUnrestrictedName= ruleUnrestrictedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnrestrictedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleUnrestrictedName=ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnrestrictedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnrestrictedName"


    // $ANTLR start "ruleUnrestrictedName"
    // InternalCPL.g:2234:1: ruleUnrestrictedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName | kw= 'import' | kw= 'include' | kw= 'library' ) ;
    public final AntlrDatatypeRuleToken ruleUnrestrictedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_EssentialOCLUnrestrictedName_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:2240:2: ( (this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName | kw= 'import' | kw= 'include' | kw= 'library' ) )
            // InternalCPL.g:2241:2: (this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName | kw= 'import' | kw= 'include' | kw= 'library' )
            {
            // InternalCPL.g:2241:2: (this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName | kw= 'import' | kw= 'include' | kw= 'library' )
            int alt56=4;
            switch ( input.LA(1) ) {
            case RULE_SIMPLE_ID:
            case RULE_ESCAPED_ID:
                {
                alt56=1;
                }
                break;
            case 22:
                {
                alt56=2;
                }
                break;
            case 53:
                {
                alt56=3;
                }
                break;
            case 54:
                {
                alt56=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // InternalCPL.g:2242:3: this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getUnrestrictedNameAccess().getEssentialOCLUnrestrictedNameParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_EssentialOCLUnrestrictedName_0=ruleEssentialOCLUnrestrictedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_EssentialOCLUnrestrictedName_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCPL.g:2253:3: kw= 'import'
                    {
                    kw=(Token)match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getUnrestrictedNameAccess().getImportKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalCPL.g:2259:3: kw= 'include'
                    {
                    kw=(Token)match(input,53,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getUnrestrictedNameAccess().getIncludeKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalCPL.g:2265:3: kw= 'library'
                    {
                    kw=(Token)match(input,54,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getUnrestrictedNameAccess().getLibraryKeyword_3());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnrestrictedName"


    // $ANTLR start "entryRuleNavigatingArgExpCS"
    // InternalCPL.g:2274:1: entryRuleNavigatingArgExpCS returns [EObject current=null] : iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF ;
    public final EObject entryRuleNavigatingArgExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingArgExpCS = null;


        try {
            // InternalCPL.g:2274:59: (iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF )
            // InternalCPL.g:2275:2: iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingArgExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNavigatingArgExpCS=ruleNavigatingArgExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingArgExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNavigatingArgExpCS"


    // $ANTLR start "ruleNavigatingArgExpCS"
    // InternalCPL.g:2281:1: ruleNavigatingArgExpCS returns [EObject current=null] : ( ( () otherlv_1= '?' ) | this_ExpCS_2= ruleExpCS ) ;
    public final EObject ruleNavigatingArgExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_ExpCS_2 = null;



        	enterRule();

        try {
            // InternalCPL.g:2287:2: ( ( ( () otherlv_1= '?' ) | this_ExpCS_2= ruleExpCS ) )
            // InternalCPL.g:2288:2: ( ( () otherlv_1= '?' ) | this_ExpCS_2= ruleExpCS )
            {
            // InternalCPL.g:2288:2: ( ( () otherlv_1= '?' ) | this_ExpCS_2= ruleExpCS )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==62) ) {
                alt57=1;
            }
            else if ( ((LA57_0>=RULE_SIMPLE_ID && LA57_0<=RULE_SINGLE_QUOTED_STRING)||LA57_0==22||LA57_0==44||(LA57_0>=53 && LA57_0<=54)||(LA57_0>=63 && LA57_0<=76)||(LA57_0>=88 && LA57_0<=89)||(LA57_0>=91 && LA57_0<=95)||LA57_0==98||(LA57_0>=100 && LA57_0<=103)||LA57_0==110||(LA57_0>=115 && LA57_0<=116)) ) {
                alt57=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // InternalCPL.g:2289:3: ( () otherlv_1= '?' )
                    {
                    // InternalCPL.g:2289:3: ( () otherlv_1= '?' )
                    // InternalCPL.g:2290:4: () otherlv_1= '?'
                    {
                    // InternalCPL.g:2290:4: ()
                    // InternalCPL.g:2291:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getNavigatingArgExpCSAccess().getOCLMessageArgCSAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,62,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getNavigatingArgExpCSAccess().getQuestionMarkKeyword_0_1());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCPL.g:2306:3: this_ExpCS_2= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNavigatingArgExpCSAccess().getExpCSParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ExpCS_2=ruleExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ExpCS_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNavigatingArgExpCS"


    // $ANTLR start "entryRuleNavigationOperatorName"
    // InternalCPL.g:2321:1: entryRuleNavigationOperatorName returns [String current=null] : iv_ruleNavigationOperatorName= ruleNavigationOperatorName EOF ;
    public final String entryRuleNavigationOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNavigationOperatorName = null;


        try {
            // InternalCPL.g:2321:62: (iv_ruleNavigationOperatorName= ruleNavigationOperatorName EOF )
            // InternalCPL.g:2322:2: iv_ruleNavigationOperatorName= ruleNavigationOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigationOperatorNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNavigationOperatorName=ruleNavigationOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigationOperatorName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNavigationOperatorName"


    // $ANTLR start "ruleNavigationOperatorName"
    // InternalCPL.g:2328:1: ruleNavigationOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EssentialOCLNavigationOperatorName_0= ruleEssentialOCLNavigationOperatorName | this_CompleteOCLNavigationOperatorName_1= ruleCompleteOCLNavigationOperatorName ) ;
    public final AntlrDatatypeRuleToken ruleNavigationOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLNavigationOperatorName_0 = null;

        AntlrDatatypeRuleToken this_CompleteOCLNavigationOperatorName_1 = null;



        	enterRule();

        try {
            // InternalCPL.g:2334:2: ( (this_EssentialOCLNavigationOperatorName_0= ruleEssentialOCLNavigationOperatorName | this_CompleteOCLNavigationOperatorName_1= ruleCompleteOCLNavigationOperatorName ) )
            // InternalCPL.g:2335:2: (this_EssentialOCLNavigationOperatorName_0= ruleEssentialOCLNavigationOperatorName | this_CompleteOCLNavigationOperatorName_1= ruleCompleteOCLNavigationOperatorName )
            {
            // InternalCPL.g:2335:2: (this_EssentialOCLNavigationOperatorName_0= ruleEssentialOCLNavigationOperatorName | this_CompleteOCLNavigationOperatorName_1= ruleCompleteOCLNavigationOperatorName )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=42 && LA58_0<=43)||(LA58_0>=86 && LA58_0<=87)) ) {
                alt58=1;
            }
            else if ( ((LA58_0>=46 && LA58_0<=47)) ) {
                alt58=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // InternalCPL.g:2336:3: this_EssentialOCLNavigationOperatorName_0= ruleEssentialOCLNavigationOperatorName
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNavigationOperatorNameAccess().getEssentialOCLNavigationOperatorNameParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_EssentialOCLNavigationOperatorName_0=ruleEssentialOCLNavigationOperatorName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_EssentialOCLNavigationOperatorName_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCPL.g:2347:3: this_CompleteOCLNavigationOperatorName_1= ruleCompleteOCLNavigationOperatorName
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNavigationOperatorNameAccess().getCompleteOCLNavigationOperatorNameParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_CompleteOCLNavigationOperatorName_1=ruleCompleteOCLNavigationOperatorName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_CompleteOCLNavigationOperatorName_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNavigationOperatorName"


    // $ANTLR start "entryRulePrimitiveTypeIdentifier"
    // InternalCPL.g:2361:1: entryRulePrimitiveTypeIdentifier returns [String current=null] : iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF ;
    public final String entryRulePrimitiveTypeIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitiveTypeIdentifier = null;


        try {
            // InternalCPL.g:2361:63: (iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF )
            // InternalCPL.g:2362:2: iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveTypeIdentifierRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePrimitiveTypeIdentifier=rulePrimitiveTypeIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveTypeIdentifier.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveTypeIdentifier"


    // $ANTLR start "rulePrimitiveTypeIdentifier"
    // InternalCPL.g:2368:1: rulePrimitiveTypeIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclMessage' | kw= 'OclState' | kw= 'OclVoid' ) ;
    public final AntlrDatatypeRuleToken rulePrimitiveTypeIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCPL.g:2374:2: ( (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclMessage' | kw= 'OclState' | kw= 'OclVoid' ) )
            // InternalCPL.g:2375:2: (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclMessage' | kw= 'OclState' | kw= 'OclVoid' )
            {
            // InternalCPL.g:2375:2: (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclMessage' | kw= 'OclState' | kw= 'OclVoid' )
            int alt59=10;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt59=1;
                }
                break;
            case 64:
                {
                alt59=2;
                }
                break;
            case 65:
                {
                alt59=3;
                }
                break;
            case 66:
                {
                alt59=4;
                }
                break;
            case 67:
                {
                alt59=5;
                }
                break;
            case 68:
                {
                alt59=6;
                }
                break;
            case 69:
                {
                alt59=7;
                }
                break;
            case 70:
                {
                alt59=8;
                }
                break;
            case 71:
                {
                alt59=9;
                }
                break;
            case 72:
                {
                alt59=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // InternalCPL.g:2376:3: kw= 'Boolean'
                    {
                    kw=(Token)match(input,63,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getBooleanKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCPL.g:2382:3: kw= 'Integer'
                    {
                    kw=(Token)match(input,64,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getIntegerKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalCPL.g:2388:3: kw= 'Real'
                    {
                    kw=(Token)match(input,65,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getRealKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalCPL.g:2394:3: kw= 'String'
                    {
                    kw=(Token)match(input,66,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getStringKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalCPL.g:2400:3: kw= 'UnlimitedNatural'
                    {
                    kw=(Token)match(input,67,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getUnlimitedNaturalKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalCPL.g:2406:3: kw= 'OclAny'
                    {
                    kw=(Token)match(input,68,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getOclAnyKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalCPL.g:2412:3: kw= 'OclInvalid'
                    {
                    kw=(Token)match(input,69,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getOclInvalidKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalCPL.g:2418:3: kw= 'OclMessage'
                    {
                    kw=(Token)match(input,70,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getOclMessageKeyword_7());
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalCPL.g:2424:3: kw= 'OclState'
                    {
                    kw=(Token)match(input,71,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getOclStateKeyword_8());
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalCPL.g:2430:3: kw= 'OclVoid'
                    {
                    kw=(Token)match(input,72,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getOclVoidKeyword_9());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveTypeIdentifier"


    // $ANTLR start "entryRuleEssentialOCLUnaryOperatorName"
    // InternalCPL.g:2439:1: entryRuleEssentialOCLUnaryOperatorName returns [String current=null] : iv_ruleEssentialOCLUnaryOperatorName= ruleEssentialOCLUnaryOperatorName EOF ;
    public final String entryRuleEssentialOCLUnaryOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLUnaryOperatorName = null;


        try {
            // InternalCPL.g:2439:69: (iv_ruleEssentialOCLUnaryOperatorName= ruleEssentialOCLUnaryOperatorName EOF )
            // InternalCPL.g:2440:2: iv_ruleEssentialOCLUnaryOperatorName= ruleEssentialOCLUnaryOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLUnaryOperatorNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEssentialOCLUnaryOperatorName=ruleEssentialOCLUnaryOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLUnaryOperatorName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEssentialOCLUnaryOperatorName"


    // $ANTLR start "ruleEssentialOCLUnaryOperatorName"
    // InternalCPL.g:2446:1: ruleEssentialOCLUnaryOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '-' | kw= 'not' | kw= 'not2' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLUnaryOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCPL.g:2452:2: ( (kw= '-' | kw= 'not' | kw= 'not2' ) )
            // InternalCPL.g:2453:2: (kw= '-' | kw= 'not' | kw= 'not2' )
            {
            // InternalCPL.g:2453:2: (kw= '-' | kw= 'not' | kw= 'not2' )
            int alt60=3;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt60=1;
                }
                break;
            case 74:
                {
                alt60=2;
                }
                break;
            case 75:
                {
                alt60=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // InternalCPL.g:2454:3: kw= '-'
                    {
                    kw=(Token)match(input,73,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLUnaryOperatorNameAccess().getHyphenMinusKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCPL.g:2460:3: kw= 'not'
                    {
                    kw=(Token)match(input,74,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLUnaryOperatorNameAccess().getNotKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalCPL.g:2466:3: kw= 'not2'
                    {
                    kw=(Token)match(input,75,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLUnaryOperatorNameAccess().getNot2Keyword_2());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEssentialOCLUnaryOperatorName"


    // $ANTLR start "entryRuleEssentialOCLInfixOperatorName"
    // InternalCPL.g:2475:1: entryRuleEssentialOCLInfixOperatorName returns [String current=null] : iv_ruleEssentialOCLInfixOperatorName= ruleEssentialOCLInfixOperatorName EOF ;
    public final String entryRuleEssentialOCLInfixOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLInfixOperatorName = null;


        try {
            // InternalCPL.g:2475:69: (iv_ruleEssentialOCLInfixOperatorName= ruleEssentialOCLInfixOperatorName EOF )
            // InternalCPL.g:2476:2: iv_ruleEssentialOCLInfixOperatorName= ruleEssentialOCLInfixOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLInfixOperatorNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEssentialOCLInfixOperatorName=ruleEssentialOCLInfixOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLInfixOperatorName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEssentialOCLInfixOperatorName"


    // $ANTLR start "ruleEssentialOCLInfixOperatorName"
    // InternalCPL.g:2482:1: ruleEssentialOCLInfixOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'and2' | kw= 'implies' | kw= 'implies2' | kw= 'or' | kw= 'or2' | kw= 'xor' | kw= 'xor2' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLInfixOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCPL.g:2488:2: ( (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'and2' | kw= 'implies' | kw= 'implies2' | kw= 'or' | kw= 'or2' | kw= 'xor' | kw= 'xor2' ) )
            // InternalCPL.g:2489:2: (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'and2' | kw= 'implies' | kw= 'implies2' | kw= 'or' | kw= 'or2' | kw= 'xor' | kw= 'xor2' )
            {
            // InternalCPL.g:2489:2: (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= '<>' | kw= 'and' | kw= 'and2' | kw= 'implies' | kw= 'implies2' | kw= 'or' | kw= 'or2' | kw= 'xor' | kw= 'xor2' )
            int alt61=18;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt61=1;
                }
                break;
            case 77:
                {
                alt61=2;
                }
                break;
            case 78:
                {
                alt61=3;
                }
                break;
            case 73:
                {
                alt61=4;
                }
                break;
            case 33:
                {
                alt61=5;
                }
                break;
            case 34:
                {
                alt61=6;
                }
                break;
            case 38:
                {
                alt61=7;
                }
                break;
            case 79:
                {
                alt61=8;
                }
                break;
            case 35:
                {
                alt61=9;
                }
                break;
            case 36:
                {
                alt61=10;
                }
                break;
            case 28:
                {
                alt61=11;
                }
                break;
            case 80:
                {
                alt61=12;
                }
                break;
            case 81:
                {
                alt61=13;
                }
                break;
            case 82:
                {
                alt61=14;
                }
                break;
            case 27:
                {
                alt61=15;
                }
                break;
            case 83:
                {
                alt61=16;
                }
                break;
            case 84:
                {
                alt61=17;
                }
                break;
            case 85:
                {
                alt61=18;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // InternalCPL.g:2490:3: kw= '*'
                    {
                    kw=(Token)match(input,76,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getAsteriskKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCPL.g:2496:3: kw= '/'
                    {
                    kw=(Token)match(input,77,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getSolidusKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalCPL.g:2502:3: kw= '+'
                    {
                    kw=(Token)match(input,78,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getPlusSignKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalCPL.g:2508:3: kw= '-'
                    {
                    kw=(Token)match(input,73,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getHyphenMinusKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalCPL.g:2514:3: kw= '>'
                    {
                    kw=(Token)match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getGreaterThanSignKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalCPL.g:2520:3: kw= '<'
                    {
                    kw=(Token)match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getLessThanSignKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalCPL.g:2526:3: kw= '>='
                    {
                    kw=(Token)match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getGreaterThanSignEqualsSignKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalCPL.g:2532:3: kw= '<='
                    {
                    kw=(Token)match(input,79,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getLessThanSignEqualsSignKeyword_7());
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalCPL.g:2538:3: kw= '='
                    {
                    kw=(Token)match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getEqualsSignKeyword_8());
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalCPL.g:2544:3: kw= '<>'
                    {
                    kw=(Token)match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getLessThanSignGreaterThanSignKeyword_9());
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalCPL.g:2550:3: kw= 'and'
                    {
                    kw=(Token)match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getAndKeyword_10());
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalCPL.g:2556:3: kw= 'and2'
                    {
                    kw=(Token)match(input,80,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getAnd2Keyword_11());
                      		
                    }

                    }
                    break;
                case 13 :
                    // InternalCPL.g:2562:3: kw= 'implies'
                    {
                    kw=(Token)match(input,81,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getImpliesKeyword_12());
                      		
                    }

                    }
                    break;
                case 14 :
                    // InternalCPL.g:2568:3: kw= 'implies2'
                    {
                    kw=(Token)match(input,82,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getImplies2Keyword_13());
                      		
                    }

                    }
                    break;
                case 15 :
                    // InternalCPL.g:2574:3: kw= 'or'
                    {
                    kw=(Token)match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getOrKeyword_14());
                      		
                    }

                    }
                    break;
                case 16 :
                    // InternalCPL.g:2580:3: kw= 'or2'
                    {
                    kw=(Token)match(input,83,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getOr2Keyword_15());
                      		
                    }

                    }
                    break;
                case 17 :
                    // InternalCPL.g:2586:3: kw= 'xor'
                    {
                    kw=(Token)match(input,84,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getXorKeyword_16());
                      		
                    }

                    }
                    break;
                case 18 :
                    // InternalCPL.g:2592:3: kw= 'xor2'
                    {
                    kw=(Token)match(input,85,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getXor2Keyword_17());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEssentialOCLInfixOperatorName"


    // $ANTLR start "entryRuleEssentialOCLNavigationOperatorName"
    // InternalCPL.g:2601:1: entryRuleEssentialOCLNavigationOperatorName returns [String current=null] : iv_ruleEssentialOCLNavigationOperatorName= ruleEssentialOCLNavigationOperatorName EOF ;
    public final String entryRuleEssentialOCLNavigationOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLNavigationOperatorName = null;


        try {
            // InternalCPL.g:2601:74: (iv_ruleEssentialOCLNavigationOperatorName= ruleEssentialOCLNavigationOperatorName EOF )
            // InternalCPL.g:2602:2: iv_ruleEssentialOCLNavigationOperatorName= ruleEssentialOCLNavigationOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLNavigationOperatorNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEssentialOCLNavigationOperatorName=ruleEssentialOCLNavigationOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLNavigationOperatorName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEssentialOCLNavigationOperatorName"


    // $ANTLR start "ruleEssentialOCLNavigationOperatorName"
    // InternalCPL.g:2608:1: ruleEssentialOCLNavigationOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.' | kw= '->' | kw= '?.' | kw= '?->' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLNavigationOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCPL.g:2614:2: ( (kw= '.' | kw= '->' | kw= '?.' | kw= '?->' ) )
            // InternalCPL.g:2615:2: (kw= '.' | kw= '->' | kw= '?.' | kw= '?->' )
            {
            // InternalCPL.g:2615:2: (kw= '.' | kw= '->' | kw= '?.' | kw= '?->' )
            int alt62=4;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt62=1;
                }
                break;
            case 43:
                {
                alt62=2;
                }
                break;
            case 86:
                {
                alt62=3;
                }
                break;
            case 87:
                {
                alt62=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // InternalCPL.g:2616:3: kw= '.'
                    {
                    kw=(Token)match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLNavigationOperatorNameAccess().getFullStopKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCPL.g:2622:3: kw= '->'
                    {
                    kw=(Token)match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLNavigationOperatorNameAccess().getHyphenMinusGreaterThanSignKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalCPL.g:2628:3: kw= '?.'
                    {
                    kw=(Token)match(input,86,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLNavigationOperatorNameAccess().getQuestionMarkFullStopKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalCPL.g:2634:3: kw= '?->'
                    {
                    kw=(Token)match(input,87,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLNavigationOperatorNameAccess().getQuestionMarkHyphenMinusGreaterThanSignKeyword_3());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEssentialOCLNavigationOperatorName"


    // $ANTLR start "entryRuleBinaryOperatorName"
    // InternalCPL.g:2643:1: entryRuleBinaryOperatorName returns [String current=null] : iv_ruleBinaryOperatorName= ruleBinaryOperatorName EOF ;
    public final String entryRuleBinaryOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBinaryOperatorName = null;


        try {
            // InternalCPL.g:2643:58: (iv_ruleBinaryOperatorName= ruleBinaryOperatorName EOF )
            // InternalCPL.g:2644:2: iv_ruleBinaryOperatorName= ruleBinaryOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBinaryOperatorNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBinaryOperatorName=ruleBinaryOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBinaryOperatorName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinaryOperatorName"


    // $ANTLR start "ruleBinaryOperatorName"
    // InternalCPL.g:2650:1: ruleBinaryOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_InfixOperatorName_0= ruleInfixOperatorName | this_NavigationOperatorName_1= ruleNavigationOperatorName ) ;
    public final AntlrDatatypeRuleToken ruleBinaryOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_InfixOperatorName_0 = null;

        AntlrDatatypeRuleToken this_NavigationOperatorName_1 = null;



        	enterRule();

        try {
            // InternalCPL.g:2656:2: ( (this_InfixOperatorName_0= ruleInfixOperatorName | this_NavigationOperatorName_1= ruleNavigationOperatorName ) )
            // InternalCPL.g:2657:2: (this_InfixOperatorName_0= ruleInfixOperatorName | this_NavigationOperatorName_1= ruleNavigationOperatorName )
            {
            // InternalCPL.g:2657:2: (this_InfixOperatorName_0= ruleInfixOperatorName | this_NavigationOperatorName_1= ruleNavigationOperatorName )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( ((LA63_0>=27 && LA63_0<=28)||(LA63_0>=33 && LA63_0<=36)||LA63_0==38||LA63_0==73||(LA63_0>=76 && LA63_0<=85)) ) {
                alt63=1;
            }
            else if ( ((LA63_0>=42 && LA63_0<=43)||(LA63_0>=46 && LA63_0<=47)||(LA63_0>=86 && LA63_0<=87)) ) {
                alt63=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // InternalCPL.g:2658:3: this_InfixOperatorName_0= ruleInfixOperatorName
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBinaryOperatorNameAccess().getInfixOperatorNameParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_InfixOperatorName_0=ruleInfixOperatorName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_InfixOperatorName_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCPL.g:2669:3: this_NavigationOperatorName_1= ruleNavigationOperatorName
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBinaryOperatorNameAccess().getNavigationOperatorNameParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NavigationOperatorName_1=ruleNavigationOperatorName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_NavigationOperatorName_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryOperatorName"


    // $ANTLR start "entryRuleInfixOperatorName"
    // InternalCPL.g:2683:1: entryRuleInfixOperatorName returns [String current=null] : iv_ruleInfixOperatorName= ruleInfixOperatorName EOF ;
    public final String entryRuleInfixOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInfixOperatorName = null;


        try {
            // InternalCPL.g:2683:57: (iv_ruleInfixOperatorName= ruleInfixOperatorName EOF )
            // InternalCPL.g:2684:2: iv_ruleInfixOperatorName= ruleInfixOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInfixOperatorNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInfixOperatorName=ruleInfixOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInfixOperatorName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInfixOperatorName"


    // $ANTLR start "ruleInfixOperatorName"
    // InternalCPL.g:2690:1: ruleInfixOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLInfixOperatorName_0= ruleEssentialOCLInfixOperatorName ;
    public final AntlrDatatypeRuleToken ruleInfixOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLInfixOperatorName_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:2696:2: (this_EssentialOCLInfixOperatorName_0= ruleEssentialOCLInfixOperatorName )
            // InternalCPL.g:2697:2: this_EssentialOCLInfixOperatorName_0= ruleEssentialOCLInfixOperatorName
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getInfixOperatorNameAccess().getEssentialOCLInfixOperatorNameParserRuleCall());
              	
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_EssentialOCLInfixOperatorName_0=ruleEssentialOCLInfixOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_EssentialOCLInfixOperatorName_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInfixOperatorName"


    // $ANTLR start "entryRuleUnaryOperatorName"
    // InternalCPL.g:2710:1: entryRuleUnaryOperatorName returns [String current=null] : iv_ruleUnaryOperatorName= ruleUnaryOperatorName EOF ;
    public final String entryRuleUnaryOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryOperatorName = null;


        try {
            // InternalCPL.g:2710:57: (iv_ruleUnaryOperatorName= ruleUnaryOperatorName EOF )
            // InternalCPL.g:2711:2: iv_ruleUnaryOperatorName= ruleUnaryOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryOperatorNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleUnaryOperatorName=ruleUnaryOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryOperatorName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryOperatorName"


    // $ANTLR start "ruleUnaryOperatorName"
    // InternalCPL.g:2717:1: ruleUnaryOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLUnaryOperatorName_0= ruleEssentialOCLUnaryOperatorName ;
    public final AntlrDatatypeRuleToken ruleUnaryOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLUnaryOperatorName_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:2723:2: (this_EssentialOCLUnaryOperatorName_0= ruleEssentialOCLUnaryOperatorName )
            // InternalCPL.g:2724:2: this_EssentialOCLUnaryOperatorName_0= ruleEssentialOCLUnaryOperatorName
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getUnaryOperatorNameAccess().getEssentialOCLUnaryOperatorNameParserRuleCall());
              	
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_EssentialOCLUnaryOperatorName_0=ruleEssentialOCLUnaryOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_EssentialOCLUnaryOperatorName_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryOperatorName"


    // $ANTLR start "entryRuleEssentialOCLUnrestrictedName"
    // InternalCPL.g:2737:1: entryRuleEssentialOCLUnrestrictedName returns [String current=null] : iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF ;
    public final String entryRuleEssentialOCLUnrestrictedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLUnrestrictedName = null;


        try {
            // InternalCPL.g:2737:68: (iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF )
            // InternalCPL.g:2738:2: iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLUnrestrictedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEssentialOCLUnrestrictedName=ruleEssentialOCLUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLUnrestrictedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEssentialOCLUnrestrictedName"


    // $ANTLR start "ruleEssentialOCLUnrestrictedName"
    // InternalCPL.g:2744:1: ruleEssentialOCLUnrestrictedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Identifier_0= ruleIdentifier ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLUnrestrictedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Identifier_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:2750:2: (this_Identifier_0= ruleIdentifier )
            // InternalCPL.g:2751:2: this_Identifier_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getEssentialOCLUnrestrictedNameAccess().getIdentifierParserRuleCall());
              	
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_Identifier_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Identifier_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEssentialOCLUnrestrictedName"


    // $ANTLR start "entryRuleEssentialOCLUnreservedName"
    // InternalCPL.g:2764:1: entryRuleEssentialOCLUnreservedName returns [String current=null] : iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF ;
    public final String entryRuleEssentialOCLUnreservedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLUnreservedName = null;


        try {
            // InternalCPL.g:2764:66: (iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF )
            // InternalCPL.g:2765:2: iv_ruleEssentialOCLUnreservedName= ruleEssentialOCLUnreservedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLUnreservedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEssentialOCLUnreservedName=ruleEssentialOCLUnreservedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLUnreservedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEssentialOCLUnreservedName"


    // $ANTLR start "ruleEssentialOCLUnreservedName"
    // InternalCPL.g:2771:1: ruleEssentialOCLUnreservedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Map' | kw= 'Tuple' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLUnreservedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_UnrestrictedName_0 = null;

        AntlrDatatypeRuleToken this_CollectionTypeIdentifier_1 = null;

        AntlrDatatypeRuleToken this_PrimitiveTypeIdentifier_2 = null;



        	enterRule();

        try {
            // InternalCPL.g:2777:2: ( (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Map' | kw= 'Tuple' ) )
            // InternalCPL.g:2778:2: (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Map' | kw= 'Tuple' )
            {
            // InternalCPL.g:2778:2: (this_UnrestrictedName_0= ruleUnrestrictedName | this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier | this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier | kw= 'Map' | kw= 'Tuple' )
            int alt64=5;
            switch ( input.LA(1) ) {
            case RULE_SIMPLE_ID:
            case RULE_ESCAPED_ID:
            case 22:
            case 53:
            case 54:
                {
                alt64=1;
                }
                break;
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
                {
                alt64=2;
                }
                break;
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
                {
                alt64=3;
                }
                break;
            case 88:
                {
                alt64=4;
                }
                break;
            case 89:
                {
                alt64=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // InternalCPL.g:2779:3: this_UnrestrictedName_0= ruleUnrestrictedName
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEssentialOCLUnreservedNameAccess().getUnrestrictedNameParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_UnrestrictedName_0=ruleUnrestrictedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_UnrestrictedName_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCPL.g:2790:3: this_CollectionTypeIdentifier_1= ruleCollectionTypeIdentifier
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEssentialOCLUnreservedNameAccess().getCollectionTypeIdentifierParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_CollectionTypeIdentifier_1=ruleCollectionTypeIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_CollectionTypeIdentifier_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalCPL.g:2801:3: this_PrimitiveTypeIdentifier_2= rulePrimitiveTypeIdentifier
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEssentialOCLUnreservedNameAccess().getPrimitiveTypeIdentifierParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_PrimitiveTypeIdentifier_2=rulePrimitiveTypeIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_PrimitiveTypeIdentifier_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalCPL.g:2812:3: kw= 'Map'
                    {
                    kw=(Token)match(input,88,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLUnreservedNameAccess().getMapKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalCPL.g:2818:3: kw= 'Tuple'
                    {
                    kw=(Token)match(input,89,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLUnreservedNameAccess().getTupleKeyword_4());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEssentialOCLUnreservedName"


    // $ANTLR start "entryRuleUnreservedName"
    // InternalCPL.g:2827:1: entryRuleUnreservedName returns [String current=null] : iv_ruleUnreservedName= ruleUnreservedName EOF ;
    public final String entryRuleUnreservedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnreservedName = null;


        try {
            // InternalCPL.g:2827:54: (iv_ruleUnreservedName= ruleUnreservedName EOF )
            // InternalCPL.g:2828:2: iv_ruleUnreservedName= ruleUnreservedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnreservedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleUnreservedName=ruleUnreservedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnreservedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnreservedName"


    // $ANTLR start "ruleUnreservedName"
    // InternalCPL.g:2834:1: ruleUnreservedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName ;
    public final AntlrDatatypeRuleToken ruleUnreservedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLUnreservedName_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:2840:2: (this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName )
            // InternalCPL.g:2841:2: this_EssentialOCLUnreservedName_0= ruleEssentialOCLUnreservedName
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getUnreservedNameAccess().getEssentialOCLUnreservedNameParserRuleCall());
              	
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_EssentialOCLUnreservedName_0=ruleEssentialOCLUnreservedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_EssentialOCLUnreservedName_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnreservedName"


    // $ANTLR start "entryRuleURIPathNameCS"
    // InternalCPL.g:2854:1: entryRuleURIPathNameCS returns [EObject current=null] : iv_ruleURIPathNameCS= ruleURIPathNameCS EOF ;
    public final EObject entryRuleURIPathNameCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURIPathNameCS = null;


        try {
            // InternalCPL.g:2854:54: (iv_ruleURIPathNameCS= ruleURIPathNameCS EOF )
            // InternalCPL.g:2855:2: iv_ruleURIPathNameCS= ruleURIPathNameCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getURIPathNameCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleURIPathNameCS=ruleURIPathNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleURIPathNameCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleURIPathNameCS"


    // $ANTLR start "ruleURIPathNameCS"
    // InternalCPL.g:2861:1: ruleURIPathNameCS returns [EObject current=null] : ( ( (lv_ownedPathElements_0_0= ruleURIFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )* ) ;
    public final EObject ruleURIPathNameCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ownedPathElements_0_0 = null;

        EObject lv_ownedPathElements_2_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:2867:2: ( ( ( (lv_ownedPathElements_0_0= ruleURIFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )* ) )
            // InternalCPL.g:2868:2: ( ( (lv_ownedPathElements_0_0= ruleURIFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )* )
            {
            // InternalCPL.g:2868:2: ( ( (lv_ownedPathElements_0_0= ruleURIFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )* )
            // InternalCPL.g:2869:3: ( (lv_ownedPathElements_0_0= ruleURIFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )*
            {
            // InternalCPL.g:2869:3: ( (lv_ownedPathElements_0_0= ruleURIFirstPathElementCS ) )
            // InternalCPL.g:2870:4: (lv_ownedPathElements_0_0= ruleURIFirstPathElementCS )
            {
            // InternalCPL.g:2870:4: (lv_ownedPathElements_0_0= ruleURIFirstPathElementCS )
            // InternalCPL.g:2871:5: lv_ownedPathElements_0_0= ruleURIFirstPathElementCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getURIPathNameCSAccess().getOwnedPathElementsURIFirstPathElementCSParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_46);
            lv_ownedPathElements_0_0=ruleURIFirstPathElementCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getURIPathNameCSRule());
              					}
              					add(
              						current,
              						"ownedPathElements",
              						lv_ownedPathElements_0_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.URIFirstPathElementCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCPL.g:2888:3: (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==90) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalCPL.g:2889:4: otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) )
            	    {
            	    otherlv_1=(Token)match(input,90,FollowSets000.FOLLOW_47); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getURIPathNameCSAccess().getColonColonKeyword_1_0());
            	      			
            	    }
            	    // InternalCPL.g:2893:4: ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) )
            	    // InternalCPL.g:2894:5: (lv_ownedPathElements_2_0= ruleNextPathElementCS )
            	    {
            	    // InternalCPL.g:2894:5: (lv_ownedPathElements_2_0= ruleNextPathElementCS )
            	    // InternalCPL.g:2895:6: lv_ownedPathElements_2_0= ruleNextPathElementCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getURIPathNameCSAccess().getOwnedPathElementsNextPathElementCSParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_46);
            	    lv_ownedPathElements_2_0=ruleNextPathElementCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getURIPathNameCSRule());
            	      						}
            	      						add(
            	      							current,
            	      							"ownedPathElements",
            	      							lv_ownedPathElements_2_0,
            	      							"org.eclipse.ocl.xtext.base.Base.NextPathElementCS");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleURIPathNameCS"


    // $ANTLR start "entryRuleURIFirstPathElementCS"
    // InternalCPL.g:2917:1: entryRuleURIFirstPathElementCS returns [EObject current=null] : iv_ruleURIFirstPathElementCS= ruleURIFirstPathElementCS EOF ;
    public final EObject entryRuleURIFirstPathElementCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURIFirstPathElementCS = null;


        try {
            // InternalCPL.g:2917:62: (iv_ruleURIFirstPathElementCS= ruleURIFirstPathElementCS EOF )
            // InternalCPL.g:2918:2: iv_ruleURIFirstPathElementCS= ruleURIFirstPathElementCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getURIFirstPathElementCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleURIFirstPathElementCS=ruleURIFirstPathElementCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleURIFirstPathElementCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleURIFirstPathElementCS"


    // $ANTLR start "ruleURIFirstPathElementCS"
    // InternalCPL.g:2924:1: ruleURIFirstPathElementCS returns [EObject current=null] : ( ( ( ruleUnrestrictedName ) ) | ( () ( ( ruleURI ) ) ) ) ;
    public final EObject ruleURIFirstPathElementCS() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalCPL.g:2930:2: ( ( ( ( ruleUnrestrictedName ) ) | ( () ( ( ruleURI ) ) ) ) )
            // InternalCPL.g:2931:2: ( ( ( ruleUnrestrictedName ) ) | ( () ( ( ruleURI ) ) ) )
            {
            // InternalCPL.g:2931:2: ( ( ( ruleUnrestrictedName ) ) | ( () ( ( ruleURI ) ) ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( ((LA66_0>=RULE_SIMPLE_ID && LA66_0<=RULE_ESCAPED_ID)||LA66_0==22||(LA66_0>=53 && LA66_0<=54)) ) {
                alt66=1;
            }
            else if ( (LA66_0==RULE_SINGLE_QUOTED_STRING) ) {
                alt66=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // InternalCPL.g:2932:3: ( ( ruleUnrestrictedName ) )
                    {
                    // InternalCPL.g:2932:3: ( ( ruleUnrestrictedName ) )
                    // InternalCPL.g:2933:4: ( ruleUnrestrictedName )
                    {
                    // InternalCPL.g:2933:4: ( ruleUnrestrictedName )
                    // InternalCPL.g:2934:5: ruleUnrestrictedName
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getURIFirstPathElementCSRule());
                      					}
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getURIFirstPathElementCSAccess().getReferredElementNamedElementCrossReference_0_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleUnrestrictedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCPL.g:2952:3: ( () ( ( ruleURI ) ) )
                    {
                    // InternalCPL.g:2952:3: ( () ( ( ruleURI ) ) )
                    // InternalCPL.g:2953:4: () ( ( ruleURI ) )
                    {
                    // InternalCPL.g:2953:4: ()
                    // InternalCPL.g:2954:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getURIFirstPathElementCSAccess().getPathElementWithURICSAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalCPL.g:2963:4: ( ( ruleURI ) )
                    // InternalCPL.g:2964:5: ( ruleURI )
                    {
                    // InternalCPL.g:2964:5: ( ruleURI )
                    // InternalCPL.g:2965:6: ruleURI
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getURIFirstPathElementCSRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getURIFirstPathElementCSAccess().getReferredElementNamespaceCrossReference_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleURI();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleURIFirstPathElementCS"


    // $ANTLR start "entryRulePrimitiveTypeCS"
    // InternalCPL.g:2987:1: entryRulePrimitiveTypeCS returns [EObject current=null] : iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF ;
    public final EObject entryRulePrimitiveTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveTypeCS = null;


        try {
            // InternalCPL.g:2987:56: (iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF )
            // InternalCPL.g:2988:2: iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveTypeCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePrimitiveTypeCS=rulePrimitiveTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveTypeCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveTypeCS"


    // $ANTLR start "rulePrimitiveTypeCS"
    // InternalCPL.g:2994:1: rulePrimitiveTypeCS returns [EObject current=null] : ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) ) ;
    public final EObject rulePrimitiveTypeCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:3000:2: ( ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) ) )
            // InternalCPL.g:3001:2: ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) )
            {
            // InternalCPL.g:3001:2: ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) )
            // InternalCPL.g:3002:3: (lv_name_0_0= rulePrimitiveTypeIdentifier )
            {
            // InternalCPL.g:3002:3: (lv_name_0_0= rulePrimitiveTypeIdentifier )
            // InternalCPL.g:3003:4: lv_name_0_0= rulePrimitiveTypeIdentifier
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getPrimitiveTypeCSAccess().getNamePrimitiveTypeIdentifierParserRuleCall_0());
              			
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_name_0_0=rulePrimitiveTypeIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getPrimitiveTypeCSRule());
              				}
              				set(
              					current,
              					"name",
              					lv_name_0_0,
              					"org.eclipse.ocl.xtext.completeocl.CompleteOCL.PrimitiveTypeIdentifier");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveTypeCS"


    // $ANTLR start "entryRuleCollectionTypeIdentifier"
    // InternalCPL.g:3023:1: entryRuleCollectionTypeIdentifier returns [String current=null] : iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF ;
    public final String entryRuleCollectionTypeIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCollectionTypeIdentifier = null;


        try {
            // InternalCPL.g:3023:64: (iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF )
            // InternalCPL.g:3024:2: iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionTypeIdentifierRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCollectionTypeIdentifier=ruleCollectionTypeIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionTypeIdentifier.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCollectionTypeIdentifier"


    // $ANTLR start "ruleCollectionTypeIdentifier"
    // InternalCPL.g:3030:1: ruleCollectionTypeIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' ) ;
    public final AntlrDatatypeRuleToken ruleCollectionTypeIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCPL.g:3036:2: ( (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' ) )
            // InternalCPL.g:3037:2: (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' )
            {
            // InternalCPL.g:3037:2: (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' )
            int alt67=5;
            switch ( input.LA(1) ) {
            case 91:
                {
                alt67=1;
                }
                break;
            case 92:
                {
                alt67=2;
                }
                break;
            case 93:
                {
                alt67=3;
                }
                break;
            case 94:
                {
                alt67=4;
                }
                break;
            case 95:
                {
                alt67=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }

            switch (alt67) {
                case 1 :
                    // InternalCPL.g:3038:3: kw= 'Set'
                    {
                    kw=(Token)match(input,91,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getSetKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCPL.g:3044:3: kw= 'Bag'
                    {
                    kw=(Token)match(input,92,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getBagKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalCPL.g:3050:3: kw= 'Sequence'
                    {
                    kw=(Token)match(input,93,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getSequenceKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalCPL.g:3056:3: kw= 'Collection'
                    {
                    kw=(Token)match(input,94,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getCollectionKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalCPL.g:3062:3: kw= 'OrderedSet'
                    {
                    kw=(Token)match(input,95,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getOrderedSetKeyword_4());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCollectionTypeIdentifier"


    // $ANTLR start "entryRuleCollectionTypeCS"
    // InternalCPL.g:3071:1: entryRuleCollectionTypeCS returns [EObject current=null] : iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF ;
    public final EObject entryRuleCollectionTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionTypeCS = null;


        try {
            // InternalCPL.g:3071:57: (iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF )
            // InternalCPL.g:3072:2: iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionTypeCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCollectionTypeCS=ruleCollectionTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionTypeCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCollectionTypeCS"


    // $ANTLR start "ruleCollectionTypeCS"
    // InternalCPL.g:3078:1: ruleCollectionTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS ) ) ( (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS ) )? otherlv_4= ')' )? ) ;
    public final EObject ruleCollectionTypeCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;

        EObject lv_ownedCollectionMultiplicity_3_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:3084:2: ( ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS ) ) ( (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS ) )? otherlv_4= ')' )? ) )
            // InternalCPL.g:3085:2: ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS ) ) ( (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS ) )? otherlv_4= ')' )? )
            {
            // InternalCPL.g:3085:2: ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS ) ) ( (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS ) )? otherlv_4= ')' )? )
            // InternalCPL.g:3086:3: ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS ) ) ( (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS ) )? otherlv_4= ')' )?
            {
            // InternalCPL.g:3086:3: ( (lv_name_0_0= ruleCollectionTypeIdentifier ) )
            // InternalCPL.g:3087:4: (lv_name_0_0= ruleCollectionTypeIdentifier )
            {
            // InternalCPL.g:3087:4: (lv_name_0_0= ruleCollectionTypeIdentifier )
            // InternalCPL.g:3088:5: lv_name_0_0= ruleCollectionTypeIdentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getNameCollectionTypeIdentifierParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_48);
            lv_name_0_0=ruleCollectionTypeIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCollectionTypeCSRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.CollectionTypeIdentifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCPL.g:3105:3: (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS ) ) ( (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS ) )? otherlv_4= ')' )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==44) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalCPL.g:3106:4: otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS ) ) ( (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS ) )? otherlv_4= ')'
                    {
                    otherlv_1=(Token)match(input,44,FollowSets000.FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getCollectionTypeCSAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalCPL.g:3110:4: ( (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS ) )
                    // InternalCPL.g:3111:5: (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS )
                    {
                    // InternalCPL.g:3111:5: (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS )
                    // InternalCPL.g:3112:6: lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getOwnedTypeTypeExpWithoutMultiplicityCSParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_49);
                    lv_ownedType_2_0=ruleTypeExpWithoutMultiplicityCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCollectionTypeCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedType",
                      							lv_ownedType_2_0,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpWithoutMultiplicityCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalCPL.g:3129:4: ( (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS ) )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==105) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // InternalCPL.g:3130:5: (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS )
                            {
                            // InternalCPL.g:3130:5: (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS )
                            // InternalCPL.g:3131:6: lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getOwnedCollectionMultiplicityMultiplicityCSParserRuleCall_1_2_0());
                              					
                            }
                            pushFollow(FollowSets000.FOLLOW_31);
                            lv_ownedCollectionMultiplicity_3_0=ruleMultiplicityCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getCollectionTypeCSRule());
                              						}
                              						set(
                              							current,
                              							"ownedCollectionMultiplicity",
                              							lv_ownedCollectionMultiplicity_3_0,
                              							"org.eclipse.ocl.xtext.base.Base.MultiplicityCS");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getCollectionTypeCSAccess().getRightParenthesisKeyword_1_3());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCollectionTypeCS"


    // $ANTLR start "entryRuleMapTypeCS"
    // InternalCPL.g:3157:1: entryRuleMapTypeCS returns [EObject current=null] : iv_ruleMapTypeCS= ruleMapTypeCS EOF ;
    public final EObject entryRuleMapTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapTypeCS = null;


        try {
            // InternalCPL.g:3157:50: (iv_ruleMapTypeCS= ruleMapTypeCS EOF )
            // InternalCPL.g:3158:2: iv_ruleMapTypeCS= ruleMapTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapTypeCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMapTypeCS=ruleMapTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapTypeCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapTypeCS"


    // $ANTLR start "ruleMapTypeCS"
    // InternalCPL.g:3164:1: ruleMapTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= 'Map' ) ) (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )? ) ;
    public final EObject ruleMapTypeCS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedKeyType_2_0 = null;

        EObject lv_ownedValueType_4_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:3170:2: ( ( ( (lv_name_0_0= 'Map' ) ) (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )? ) )
            // InternalCPL.g:3171:2: ( ( (lv_name_0_0= 'Map' ) ) (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )? )
            {
            // InternalCPL.g:3171:2: ( ( (lv_name_0_0= 'Map' ) ) (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )? )
            // InternalCPL.g:3172:3: ( (lv_name_0_0= 'Map' ) ) (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )?
            {
            // InternalCPL.g:3172:3: ( (lv_name_0_0= 'Map' ) )
            // InternalCPL.g:3173:4: (lv_name_0_0= 'Map' )
            {
            // InternalCPL.g:3173:4: (lv_name_0_0= 'Map' )
            // InternalCPL.g:3174:5: lv_name_0_0= 'Map'
            {
            lv_name_0_0=(Token)match(input,88,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getMapTypeCSAccess().getNameMapKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMapTypeCSRule());
              					}
              					setWithLastConsumed(current, "name", lv_name_0_0, "Map");
              				
            }

            }


            }

            // InternalCPL.g:3186:3: (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==44) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalCPL.g:3187:4: otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,44,FollowSets000.FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getMapTypeCSAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalCPL.g:3191:4: ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) )
                    // InternalCPL.g:3192:5: (lv_ownedKeyType_2_0= ruleTypeExpCS )
                    {
                    // InternalCPL.g:3192:5: (lv_ownedKeyType_2_0= ruleTypeExpCS )
                    // InternalCPL.g:3193:6: lv_ownedKeyType_2_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMapTypeCSAccess().getOwnedKeyTypeTypeExpCSParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_50);
                    lv_ownedKeyType_2_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMapTypeCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedKeyType",
                      							lv_ownedKeyType_2_0,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,52,FollowSets000.FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getMapTypeCSAccess().getCommaKeyword_1_2());
                      			
                    }
                    // InternalCPL.g:3214:4: ( (lv_ownedValueType_4_0= ruleTypeExpCS ) )
                    // InternalCPL.g:3215:5: (lv_ownedValueType_4_0= ruleTypeExpCS )
                    {
                    // InternalCPL.g:3215:5: (lv_ownedValueType_4_0= ruleTypeExpCS )
                    // InternalCPL.g:3216:6: lv_ownedValueType_4_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMapTypeCSAccess().getOwnedValueTypeTypeExpCSParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_31);
                    lv_ownedValueType_4_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMapTypeCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedValueType",
                      							lv_ownedValueType_4_0,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getMapTypeCSAccess().getRightParenthesisKeyword_1_4());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapTypeCS"


    // $ANTLR start "entryRuleTupleTypeCS"
    // InternalCPL.g:3242:1: entryRuleTupleTypeCS returns [EObject current=null] : iv_ruleTupleTypeCS= ruleTupleTypeCS EOF ;
    public final EObject entryRuleTupleTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleTypeCS = null;


        try {
            // InternalCPL.g:3242:52: (iv_ruleTupleTypeCS= ruleTupleTypeCS EOF )
            // InternalCPL.g:3243:2: iv_ruleTupleTypeCS= ruleTupleTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleTypeCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTupleTypeCS=ruleTupleTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleTypeCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTupleTypeCS"


    // $ANTLR start "ruleTupleTypeCS"
    // InternalCPL.g:3249:1: ruleTupleTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? ) ;
    public final EObject ruleTupleTypeCS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedParts_2_0 = null;

        EObject lv_ownedParts_4_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:3255:2: ( ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? ) )
            // InternalCPL.g:3256:2: ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? )
            {
            // InternalCPL.g:3256:2: ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? )
            // InternalCPL.g:3257:3: ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )?
            {
            // InternalCPL.g:3257:3: ( (lv_name_0_0= 'Tuple' ) )
            // InternalCPL.g:3258:4: (lv_name_0_0= 'Tuple' )
            {
            // InternalCPL.g:3258:4: (lv_name_0_0= 'Tuple' )
            // InternalCPL.g:3259:5: lv_name_0_0= 'Tuple'
            {
            lv_name_0_0=(Token)match(input,89,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getTupleTypeCSAccess().getNameTupleKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTupleTypeCSRule());
              					}
              					setWithLastConsumed(current, "name", lv_name_0_0, "Tuple");
              				
            }

            }


            }

            // InternalCPL.g:3271:3: (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==44) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalCPL.g:3272:4: otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,44,FollowSets000.FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getTupleTypeCSAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalCPL.g:3276:4: ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( ((LA72_0>=RULE_SIMPLE_ID && LA72_0<=RULE_ESCAPED_ID)||LA72_0==22||(LA72_0>=53 && LA72_0<=54)) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // InternalCPL.g:3277:5: ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )*
                            {
                            // InternalCPL.g:3277:5: ( (lv_ownedParts_2_0= ruleTuplePartCS ) )
                            // InternalCPL.g:3278:6: (lv_ownedParts_2_0= ruleTuplePartCS )
                            {
                            // InternalCPL.g:3278:6: (lv_ownedParts_2_0= ruleTuplePartCS )
                            // InternalCPL.g:3279:7: lv_ownedParts_2_0= ruleTuplePartCS
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getTupleTypeCSAccess().getOwnedPartsTuplePartCSParserRuleCall_1_1_0_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_35);
                            lv_ownedParts_2_0=ruleTuplePartCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getTupleTypeCSRule());
                              							}
                              							add(
                              								current,
                              								"ownedParts",
                              								lv_ownedParts_2_0,
                              								"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TuplePartCS");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalCPL.g:3296:5: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )*
                            loop71:
                            do {
                                int alt71=2;
                                int LA71_0 = input.LA(1);

                                if ( (LA71_0==52) ) {
                                    alt71=1;
                                }


                                switch (alt71) {
                            	case 1 :
                            	    // InternalCPL.g:3297:6: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) )
                            	    {
                            	    otherlv_3=(Token)match(input,52,FollowSets000.FOLLOW_7); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_3, grammarAccess.getTupleTypeCSAccess().getCommaKeyword_1_1_1_0());
                            	      					
                            	    }
                            	    // InternalCPL.g:3301:6: ( (lv_ownedParts_4_0= ruleTuplePartCS ) )
                            	    // InternalCPL.g:3302:7: (lv_ownedParts_4_0= ruleTuplePartCS )
                            	    {
                            	    // InternalCPL.g:3302:7: (lv_ownedParts_4_0= ruleTuplePartCS )
                            	    // InternalCPL.g:3303:8: lv_ownedParts_4_0= ruleTuplePartCS
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getTupleTypeCSAccess().getOwnedPartsTuplePartCSParserRuleCall_1_1_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_35);
                            	    lv_ownedParts_4_0=ruleTuplePartCS();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getTupleTypeCSRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"ownedParts",
                            	      									lv_ownedParts_4_0,
                            	      									"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TuplePartCS");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop71;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getTupleTypeCSAccess().getRightParenthesisKeyword_1_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTupleTypeCS"


    // $ANTLR start "entryRuleTuplePartCS"
    // InternalCPL.g:3331:1: entryRuleTuplePartCS returns [EObject current=null] : iv_ruleTuplePartCS= ruleTuplePartCS EOF ;
    public final EObject entryRuleTuplePartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTuplePartCS = null;


        try {
            // InternalCPL.g:3331:52: (iv_ruleTuplePartCS= ruleTuplePartCS EOF )
            // InternalCPL.g:3332:2: iv_ruleTuplePartCS= ruleTuplePartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTuplePartCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTuplePartCS=ruleTuplePartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTuplePartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTuplePartCS"


    // $ANTLR start "ruleTuplePartCS"
    // InternalCPL.g:3338:1: ruleTuplePartCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ) ;
    public final EObject ruleTuplePartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:3344:2: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ) )
            // InternalCPL.g:3345:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )
            {
            // InternalCPL.g:3345:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )
            // InternalCPL.g:3346:3: ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
            {
            // InternalCPL.g:3346:3: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // InternalCPL.g:3347:4: (lv_name_0_0= ruleUnrestrictedName )
            {
            // InternalCPL.g:3347:4: (lv_name_0_0= ruleUnrestrictedName )
            // InternalCPL.g:3348:5: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTuplePartCSAccess().getNameUnrestrictedNameParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_14);
            lv_name_0_0=ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTuplePartCSRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.ocl.xtext.completeocl.CompleteOCL.UnrestrictedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTuplePartCSAccess().getColonKeyword_1());
              		
            }
            // InternalCPL.g:3369:3: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
            // InternalCPL.g:3370:4: (lv_ownedType_2_0= ruleTypeExpCS )
            {
            // InternalCPL.g:3370:4: (lv_ownedType_2_0= ruleTypeExpCS )
            // InternalCPL.g:3371:5: lv_ownedType_2_0= ruleTypeExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTuplePartCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_ownedType_2_0=ruleTypeExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTuplePartCSRule());
              					}
              					set(
              						current,
              						"ownedType",
              						lv_ownedType_2_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTuplePartCS"


    // $ANTLR start "entryRuleCollectionLiteralExpCS"
    // InternalCPL.g:3392:1: entryRuleCollectionLiteralExpCS returns [EObject current=null] : iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF ;
    public final EObject entryRuleCollectionLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLiteralExpCS = null;


        try {
            // InternalCPL.g:3392:63: (iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF )
            // InternalCPL.g:3393:2: iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCollectionLiteralExpCS=ruleCollectionLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCollectionLiteralExpCS"


    // $ANTLR start "ruleCollectionLiteralExpCS"
    // InternalCPL.g:3399:1: ruleCollectionLiteralExpCS returns [EObject current=null] : ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleCollectionLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedType_0_0 = null;

        EObject lv_ownedParts_2_0 = null;

        EObject lv_ownedParts_4_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:3405:2: ( ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' ) )
            // InternalCPL.g:3406:2: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' )
            {
            // InternalCPL.g:3406:2: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' )
            // InternalCPL.g:3407:3: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}'
            {
            // InternalCPL.g:3407:3: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) )
            // InternalCPL.g:3408:4: (lv_ownedType_0_0= ruleCollectionTypeCS )
            {
            // InternalCPL.g:3408:4: (lv_ownedType_0_0= ruleCollectionTypeCS )
            // InternalCPL.g:3409:5: lv_ownedType_0_0= ruleCollectionTypeCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedTypeCollectionTypeCSParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_4);
            lv_ownedType_0_0=ruleCollectionTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCollectionLiteralExpCSRule());
              					}
              					set(
              						current,
              						"ownedType",
              						lv_ownedType_0_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.CollectionTypeCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCollectionLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalCPL.g:3430:3: ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( ((LA75_0>=RULE_SIMPLE_ID && LA75_0<=RULE_SINGLE_QUOTED_STRING)||LA75_0==22||LA75_0==24||LA75_0==44||(LA75_0>=53 && LA75_0<=54)||(LA75_0>=63 && LA75_0<=76)||(LA75_0>=88 && LA75_0<=89)||(LA75_0>=91 && LA75_0<=95)||LA75_0==98||(LA75_0>=100 && LA75_0<=103)||LA75_0==110||(LA75_0>=115 && LA75_0<=116)) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalCPL.g:3431:4: ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )*
                    {
                    // InternalCPL.g:3431:4: ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) )
                    // InternalCPL.g:3432:5: (lv_ownedParts_2_0= ruleCollectionLiteralPartCS )
                    {
                    // InternalCPL.g:3432:5: (lv_ownedParts_2_0= ruleCollectionLiteralPartCS )
                    // InternalCPL.g:3433:6: lv_ownedParts_2_0= ruleCollectionLiteralPartCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedPartsCollectionLiteralPartCSParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_52);
                    lv_ownedParts_2_0=ruleCollectionLiteralPartCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCollectionLiteralExpCSRule());
                      						}
                      						add(
                      							current,
                      							"ownedParts",
                      							lv_ownedParts_2_0,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.CollectionLiteralPartCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalCPL.g:3450:4: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )*
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==52) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // InternalCPL.g:3451:5: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) )
                    	    {
                    	    otherlv_3=(Token)match(input,52,FollowSets000.FOLLOW_53); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getCollectionLiteralExpCSAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalCPL.g:3455:5: ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) )
                    	    // InternalCPL.g:3456:6: (lv_ownedParts_4_0= ruleCollectionLiteralPartCS )
                    	    {
                    	    // InternalCPL.g:3456:6: (lv_ownedParts_4_0= ruleCollectionLiteralPartCS )
                    	    // InternalCPL.g:3457:7: lv_ownedParts_4_0= ruleCollectionLiteralPartCS
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedPartsCollectionLiteralPartCSParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_52);
                    	    lv_ownedParts_4_0=ruleCollectionLiteralPartCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getCollectionLiteralExpCSRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"ownedParts",
                    	      								lv_ownedParts_4_0,
                    	      								"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.CollectionLiteralPartCS");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop74;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getCollectionLiteralExpCSAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCollectionLiteralExpCS"


    // $ANTLR start "entryRuleCollectionLiteralPartCS"
    // InternalCPL.g:3484:1: entryRuleCollectionLiteralPartCS returns [EObject current=null] : iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF ;
    public final EObject entryRuleCollectionLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLiteralPartCS = null;


        try {
            // InternalCPL.g:3484:64: (iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF )
            // InternalCPL.g:3485:2: iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionLiteralPartCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCollectionLiteralPartCS=ruleCollectionLiteralPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionLiteralPartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCollectionLiteralPartCS"


    // $ANTLR start "ruleCollectionLiteralPartCS"
    // InternalCPL.g:3491:1: ruleCollectionLiteralPartCS returns [EObject current=null] : ( ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? ) | ( (lv_ownedExpression_3_0= rulePatternExpCS ) ) ) ;
    public final EObject ruleCollectionLiteralPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ownedExpression_0_0 = null;

        EObject lv_ownedLastExpression_2_0 = null;

        EObject lv_ownedExpression_3_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:3497:2: ( ( ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? ) | ( (lv_ownedExpression_3_0= rulePatternExpCS ) ) ) )
            // InternalCPL.g:3498:2: ( ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? ) | ( (lv_ownedExpression_3_0= rulePatternExpCS ) ) )
            {
            // InternalCPL.g:3498:2: ( ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? ) | ( (lv_ownedExpression_3_0= rulePatternExpCS ) ) )
            int alt77=2;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_SINGLE_QUOTED_STRING:
            case 44:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 88:
            case 89:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 98:
            case 100:
            case 101:
            case 102:
            case 103:
            case 110:
            case 115:
            case 116:
                {
                alt77=1;
                }
                break;
            case RULE_SIMPLE_ID:
                {
                int LA77_2 = input.LA(2);

                if ( (LA77_2==EOF||LA77_2==19||LA77_2==21||(LA77_2>=27 && LA77_2<=28)||(LA77_2>=33 && LA77_2<=36)||LA77_2==38||(LA77_2>=42 && LA77_2<=44)||(LA77_2>=46 && LA77_2<=47)||LA77_2==52||LA77_2==73||(LA77_2>=76 && LA77_2<=87)||LA77_2==90||LA77_2==96||(LA77_2>=104 && LA77_2<=105)) ) {
                    alt77=1;
                }
                else if ( (LA77_2==24) ) {
                    alt77=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 77, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ESCAPED_ID:
                {
                int LA77_3 = input.LA(2);

                if ( (LA77_3==EOF||LA77_3==19||LA77_3==21||(LA77_3>=27 && LA77_3<=28)||(LA77_3>=33 && LA77_3<=36)||LA77_3==38||(LA77_3>=42 && LA77_3<=44)||(LA77_3>=46 && LA77_3<=47)||LA77_3==52||LA77_3==73||(LA77_3>=76 && LA77_3<=87)||LA77_3==90||LA77_3==96||(LA77_3>=104 && LA77_3<=105)) ) {
                    alt77=1;
                }
                else if ( (LA77_3==24) ) {
                    alt77=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 77, 3, input);

                    throw nvae;
                }
                }
                break;
            case 22:
                {
                int LA77_4 = input.LA(2);

                if ( (LA77_4==EOF||LA77_4==19||LA77_4==21||(LA77_4>=27 && LA77_4<=28)||(LA77_4>=33 && LA77_4<=36)||LA77_4==38||(LA77_4>=42 && LA77_4<=44)||(LA77_4>=46 && LA77_4<=47)||LA77_4==52||LA77_4==73||(LA77_4>=76 && LA77_4<=87)||LA77_4==90||LA77_4==96||(LA77_4>=104 && LA77_4<=105)) ) {
                    alt77=1;
                }
                else if ( (LA77_4==24) ) {
                    alt77=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 77, 4, input);

                    throw nvae;
                }
                }
                break;
            case 53:
                {
                int LA77_5 = input.LA(2);

                if ( (LA77_5==EOF||LA77_5==19||LA77_5==21||(LA77_5>=27 && LA77_5<=28)||(LA77_5>=33 && LA77_5<=36)||LA77_5==38||(LA77_5>=42 && LA77_5<=44)||(LA77_5>=46 && LA77_5<=47)||LA77_5==52||LA77_5==73||(LA77_5>=76 && LA77_5<=87)||LA77_5==90||LA77_5==96||(LA77_5>=104 && LA77_5<=105)) ) {
                    alt77=1;
                }
                else if ( (LA77_5==24) ) {
                    alt77=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 77, 5, input);

                    throw nvae;
                }
                }
                break;
            case 54:
                {
                int LA77_6 = input.LA(2);

                if ( (LA77_6==EOF||LA77_6==19||LA77_6==21||(LA77_6>=27 && LA77_6<=28)||(LA77_6>=33 && LA77_6<=36)||LA77_6==38||(LA77_6>=42 && LA77_6<=44)||(LA77_6>=46 && LA77_6<=47)||LA77_6==52||LA77_6==73||(LA77_6>=76 && LA77_6<=87)||LA77_6==90||LA77_6==96||(LA77_6>=104 && LA77_6<=105)) ) {
                    alt77=1;
                }
                else if ( (LA77_6==24) ) {
                    alt77=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 77, 6, input);

                    throw nvae;
                }
                }
                break;
            case 24:
                {
                alt77=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }

            switch (alt77) {
                case 1 :
                    // InternalCPL.g:3499:3: ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? )
                    {
                    // InternalCPL.g:3499:3: ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? )
                    // InternalCPL.g:3500:4: ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )?
                    {
                    // InternalCPL.g:3500:4: ( (lv_ownedExpression_0_0= ruleExpCS ) )
                    // InternalCPL.g:3501:5: (lv_ownedExpression_0_0= ruleExpCS )
                    {
                    // InternalCPL.g:3501:5: (lv_ownedExpression_0_0= ruleExpCS )
                    // InternalCPL.g:3502:6: lv_ownedExpression_0_0= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCollectionLiteralPartCSAccess().getOwnedExpressionExpCSParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_54);
                    lv_ownedExpression_0_0=ruleExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCollectionLiteralPartCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedExpression",
                      							lv_ownedExpression_0_0,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalCPL.g:3519:4: (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==96) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // InternalCPL.g:3520:5: otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) )
                            {
                            otherlv_1=(Token)match(input,96,FollowSets000.FOLLOW_55); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_1, grammarAccess.getCollectionLiteralPartCSAccess().getFullStopFullStopKeyword_0_1_0());
                              				
                            }
                            // InternalCPL.g:3524:5: ( (lv_ownedLastExpression_2_0= ruleExpCS ) )
                            // InternalCPL.g:3525:6: (lv_ownedLastExpression_2_0= ruleExpCS )
                            {
                            // InternalCPL.g:3525:6: (lv_ownedLastExpression_2_0= ruleExpCS )
                            // InternalCPL.g:3526:7: lv_ownedLastExpression_2_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getCollectionLiteralPartCSAccess().getOwnedLastExpressionExpCSParserRuleCall_0_1_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_ownedLastExpression_2_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getCollectionLiteralPartCSRule());
                              							}
                              							set(
                              								current,
                              								"ownedLastExpression",
                              								lv_ownedLastExpression_2_0,
                              								"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCPL.g:3546:3: ( (lv_ownedExpression_3_0= rulePatternExpCS ) )
                    {
                    // InternalCPL.g:3546:3: ( (lv_ownedExpression_3_0= rulePatternExpCS ) )
                    // InternalCPL.g:3547:4: (lv_ownedExpression_3_0= rulePatternExpCS )
                    {
                    // InternalCPL.g:3547:4: (lv_ownedExpression_3_0= rulePatternExpCS )
                    // InternalCPL.g:3548:5: lv_ownedExpression_3_0= rulePatternExpCS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCollectionLiteralPartCSAccess().getOwnedExpressionPatternExpCSParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_ownedExpression_3_0=rulePatternExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getCollectionLiteralPartCSRule());
                      					}
                      					set(
                      						current,
                      						"ownedExpression",
                      						lv_ownedExpression_3_0,
                      						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.PatternExpCS");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCollectionLiteralPartCS"


    // $ANTLR start "entryRuleCollectionPatternCS"
    // InternalCPL.g:3569:1: entryRuleCollectionPatternCS returns [EObject current=null] : iv_ruleCollectionPatternCS= ruleCollectionPatternCS EOF ;
    public final EObject entryRuleCollectionPatternCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionPatternCS = null;


        try {
            // InternalCPL.g:3569:60: (iv_ruleCollectionPatternCS= ruleCollectionPatternCS EOF )
            // InternalCPL.g:3570:2: iv_ruleCollectionPatternCS= ruleCollectionPatternCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionPatternCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCollectionPatternCS=ruleCollectionPatternCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionPatternCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCollectionPatternCS"


    // $ANTLR start "ruleCollectionPatternCS"
    // InternalCPL.g:3576:1: ruleCollectionPatternCS returns [EObject current=null] : ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleCollectionPatternCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_ownedType_0_0 = null;

        EObject lv_ownedParts_2_0 = null;

        EObject lv_ownedParts_4_0 = null;

        AntlrDatatypeRuleToken lv_restVariableName_6_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:3582:2: ( ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) ) )? otherlv_7= '}' ) )
            // InternalCPL.g:3583:2: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) ) )? otherlv_7= '}' )
            {
            // InternalCPL.g:3583:2: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) ) )? otherlv_7= '}' )
            // InternalCPL.g:3584:3: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) ) )? otherlv_7= '}'
            {
            // InternalCPL.g:3584:3: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) )
            // InternalCPL.g:3585:4: (lv_ownedType_0_0= ruleCollectionTypeCS )
            {
            // InternalCPL.g:3585:4: (lv_ownedType_0_0= ruleCollectionTypeCS )
            // InternalCPL.g:3586:5: lv_ownedType_0_0= ruleCollectionTypeCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCollectionPatternCSAccess().getOwnedTypeCollectionTypeCSParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_4);
            lv_ownedType_0_0=ruleCollectionTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCollectionPatternCSRule());
              					}
              					set(
              						current,
              						"ownedType",
              						lv_ownedType_0_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.CollectionTypeCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCollectionPatternCSAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalCPL.g:3607:3: ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( ((LA79_0>=RULE_SIMPLE_ID && LA79_0<=RULE_ESCAPED_ID)||LA79_0==22||LA79_0==24||(LA79_0>=53 && LA79_0<=54)) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalCPL.g:3608:4: ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) )
                    {
                    // InternalCPL.g:3608:4: ( (lv_ownedParts_2_0= rulePatternExpCS ) )
                    // InternalCPL.g:3609:5: (lv_ownedParts_2_0= rulePatternExpCS )
                    {
                    // InternalCPL.g:3609:5: (lv_ownedParts_2_0= rulePatternExpCS )
                    // InternalCPL.g:3610:6: lv_ownedParts_2_0= rulePatternExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCollectionPatternCSAccess().getOwnedPartsPatternExpCSParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_56);
                    lv_ownedParts_2_0=rulePatternExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCollectionPatternCSRule());
                      						}
                      						add(
                      							current,
                      							"ownedParts",
                      							lv_ownedParts_2_0,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.PatternExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalCPL.g:3627:4: (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==52) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // InternalCPL.g:3628:5: otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) )
                    	    {
                    	    otherlv_3=(Token)match(input,52,FollowSets000.FOLLOW_53); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getCollectionPatternCSAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalCPL.g:3632:5: ( (lv_ownedParts_4_0= rulePatternExpCS ) )
                    	    // InternalCPL.g:3633:6: (lv_ownedParts_4_0= rulePatternExpCS )
                    	    {
                    	    // InternalCPL.g:3633:6: (lv_ownedParts_4_0= rulePatternExpCS )
                    	    // InternalCPL.g:3634:7: lv_ownedParts_4_0= rulePatternExpCS
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getCollectionPatternCSAccess().getOwnedPartsPatternExpCSParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_56);
                    	    lv_ownedParts_4_0=rulePatternExpCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getCollectionPatternCSRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"ownedParts",
                    	      								lv_ownedParts_4_0,
                    	      								"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.PatternExpCS");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop78;
                        }
                    } while (true);

                    // InternalCPL.g:3652:4: (otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) ) )
                    // InternalCPL.g:3653:5: otherlv_5= '++' ( (lv_restVariableName_6_0= ruleIdentifier ) )
                    {
                    otherlv_5=(Token)match(input,97,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getCollectionPatternCSAccess().getPlusSignPlusSignKeyword_2_2_0());
                      				
                    }
                    // InternalCPL.g:3657:5: ( (lv_restVariableName_6_0= ruleIdentifier ) )
                    // InternalCPL.g:3658:6: (lv_restVariableName_6_0= ruleIdentifier )
                    {
                    // InternalCPL.g:3658:6: (lv_restVariableName_6_0= ruleIdentifier )
                    // InternalCPL.g:3659:7: lv_restVariableName_6_0= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getCollectionPatternCSAccess().getRestVariableNameIdentifierParserRuleCall_2_2_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_12);
                    lv_restVariableName_6_0=ruleIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getCollectionPatternCSRule());
                      							}
                      							set(
                      								current,
                      								"restVariableName",
                      								lv_restVariableName_6_0,
                      								"org.eclipse.ocl.xtext.base.Base.Identifier");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getCollectionPatternCSAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCollectionPatternCS"


    // $ANTLR start "entryRuleShadowPartCS"
    // InternalCPL.g:3686:1: entryRuleShadowPartCS returns [EObject current=null] : iv_ruleShadowPartCS= ruleShadowPartCS EOF ;
    public final EObject entryRuleShadowPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShadowPartCS = null;


        try {
            // InternalCPL.g:3686:53: (iv_ruleShadowPartCS= ruleShadowPartCS EOF )
            // InternalCPL.g:3687:2: iv_ruleShadowPartCS= ruleShadowPartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShadowPartCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleShadowPartCS=ruleShadowPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShadowPartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShadowPartCS"


    // $ANTLR start "ruleShadowPartCS"
    // InternalCPL.g:3693:1: ruleShadowPartCS returns [EObject current=null] : ( ( ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) ) ) | ( (lv_ownedInitExpression_3_0= ruleStringLiteralExpCS ) ) ) ;
    public final EObject ruleShadowPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ownedInitExpression_2_1 = null;

        EObject lv_ownedInitExpression_2_2 = null;

        EObject lv_ownedInitExpression_3_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:3699:2: ( ( ( ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) ) ) | ( (lv_ownedInitExpression_3_0= ruleStringLiteralExpCS ) ) ) )
            // InternalCPL.g:3700:2: ( ( ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) ) ) | ( (lv_ownedInitExpression_3_0= ruleStringLiteralExpCS ) ) )
            {
            // InternalCPL.g:3700:2: ( ( ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) ) ) | ( (lv_ownedInitExpression_3_0= ruleStringLiteralExpCS ) ) )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( ((LA81_0>=RULE_SIMPLE_ID && LA81_0<=RULE_ESCAPED_ID)||LA81_0==22||(LA81_0>=53 && LA81_0<=54)) ) {
                alt81=1;
            }
            else if ( (LA81_0==RULE_SINGLE_QUOTED_STRING) ) {
                alt81=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // InternalCPL.g:3701:3: ( ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) ) )
                    {
                    // InternalCPL.g:3701:3: ( ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) ) )
                    // InternalCPL.g:3702:4: ( ( ruleUnrestrictedName ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) )
                    {
                    // InternalCPL.g:3702:4: ( ( ruleUnrestrictedName ) )
                    // InternalCPL.g:3703:5: ( ruleUnrestrictedName )
                    {
                    // InternalCPL.g:3703:5: ( ruleUnrestrictedName )
                    // InternalCPL.g:3704:6: ruleUnrestrictedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getShadowPartCSRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getShadowPartCSAccess().getReferredPropertyPropertyCrossReference_0_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_37);
                    ruleUnrestrictedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,35,FollowSets000.FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getShadowPartCSAccess().getEqualsSignKeyword_0_1());
                      			
                    }
                    // InternalCPL.g:3725:4: ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) )
                    // InternalCPL.g:3726:5: ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) )
                    {
                    // InternalCPL.g:3726:5: ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) )
                    // InternalCPL.g:3727:6: (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS )
                    {
                    // InternalCPL.g:3727:6: (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS )
                    int alt80=2;
                    switch ( input.LA(1) ) {
                    case RULE_INT:
                    case RULE_SINGLE_QUOTED_STRING:
                    case 44:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                    case 69:
                    case 70:
                    case 71:
                    case 72:
                    case 73:
                    case 74:
                    case 75:
                    case 76:
                    case 88:
                    case 89:
                    case 91:
                    case 92:
                    case 93:
                    case 94:
                    case 95:
                    case 98:
                    case 100:
                    case 101:
                    case 102:
                    case 103:
                    case 110:
                    case 115:
                    case 116:
                        {
                        alt80=1;
                        }
                        break;
                    case RULE_SIMPLE_ID:
                        {
                        int LA80_2 = input.LA(2);

                        if ( (LA80_2==EOF||LA80_2==19||LA80_2==21||(LA80_2>=27 && LA80_2<=28)||(LA80_2>=33 && LA80_2<=36)||LA80_2==38||(LA80_2>=42 && LA80_2<=44)||(LA80_2>=46 && LA80_2<=47)||LA80_2==52||LA80_2==73||(LA80_2>=76 && LA80_2<=87)||LA80_2==90||(LA80_2>=104 && LA80_2<=105)) ) {
                            alt80=1;
                        }
                        else if ( (LA80_2==24) ) {
                            alt80=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 80, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_ESCAPED_ID:
                        {
                        int LA80_3 = input.LA(2);

                        if ( (LA80_3==24) ) {
                            alt80=2;
                        }
                        else if ( (LA80_3==EOF||LA80_3==19||LA80_3==21||(LA80_3>=27 && LA80_3<=28)||(LA80_3>=33 && LA80_3<=36)||LA80_3==38||(LA80_3>=42 && LA80_3<=44)||(LA80_3>=46 && LA80_3<=47)||LA80_3==52||LA80_3==73||(LA80_3>=76 && LA80_3<=87)||LA80_3==90||(LA80_3>=104 && LA80_3<=105)) ) {
                            alt80=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 80, 3, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 22:
                        {
                        int LA80_4 = input.LA(2);

                        if ( (LA80_4==24) ) {
                            alt80=2;
                        }
                        else if ( (LA80_4==EOF||LA80_4==19||LA80_4==21||(LA80_4>=27 && LA80_4<=28)||(LA80_4>=33 && LA80_4<=36)||LA80_4==38||(LA80_4>=42 && LA80_4<=44)||(LA80_4>=46 && LA80_4<=47)||LA80_4==52||LA80_4==73||(LA80_4>=76 && LA80_4<=87)||LA80_4==90||(LA80_4>=104 && LA80_4<=105)) ) {
                            alt80=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 80, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 53:
                        {
                        int LA80_5 = input.LA(2);

                        if ( (LA80_5==24) ) {
                            alt80=2;
                        }
                        else if ( (LA80_5==EOF||LA80_5==19||LA80_5==21||(LA80_5>=27 && LA80_5<=28)||(LA80_5>=33 && LA80_5<=36)||LA80_5==38||(LA80_5>=42 && LA80_5<=44)||(LA80_5>=46 && LA80_5<=47)||LA80_5==52||LA80_5==73||(LA80_5>=76 && LA80_5<=87)||LA80_5==90||(LA80_5>=104 && LA80_5<=105)) ) {
                            alt80=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 80, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 54:
                        {
                        int LA80_6 = input.LA(2);

                        if ( (LA80_6==24) ) {
                            alt80=2;
                        }
                        else if ( (LA80_6==EOF||LA80_6==19||LA80_6==21||(LA80_6>=27 && LA80_6<=28)||(LA80_6>=33 && LA80_6<=36)||LA80_6==38||(LA80_6>=42 && LA80_6<=44)||(LA80_6>=46 && LA80_6<=47)||LA80_6==52||LA80_6==73||(LA80_6>=76 && LA80_6<=87)||LA80_6==90||(LA80_6>=104 && LA80_6<=105)) ) {
                            alt80=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 80, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 24:
                        {
                        alt80=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 80, 0, input);

                        throw nvae;
                    }

                    switch (alt80) {
                        case 1 :
                            // InternalCPL.g:3728:7: lv_ownedInitExpression_2_1= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getShadowPartCSAccess().getOwnedInitExpressionExpCSParserRuleCall_0_2_0_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_ownedInitExpression_2_1=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getShadowPartCSRule());
                              							}
                              							set(
                              								current,
                              								"ownedInitExpression",
                              								lv_ownedInitExpression_2_1,
                              								"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalCPL.g:3744:7: lv_ownedInitExpression_2_2= rulePatternExpCS
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getShadowPartCSAccess().getOwnedInitExpressionPatternExpCSParserRuleCall_0_2_0_1());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_ownedInitExpression_2_2=rulePatternExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getShadowPartCSRule());
                              							}
                              							set(
                              								current,
                              								"ownedInitExpression",
                              								lv_ownedInitExpression_2_2,
                              								"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.PatternExpCS");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCPL.g:3764:3: ( (lv_ownedInitExpression_3_0= ruleStringLiteralExpCS ) )
                    {
                    // InternalCPL.g:3764:3: ( (lv_ownedInitExpression_3_0= ruleStringLiteralExpCS ) )
                    // InternalCPL.g:3765:4: (lv_ownedInitExpression_3_0= ruleStringLiteralExpCS )
                    {
                    // InternalCPL.g:3765:4: (lv_ownedInitExpression_3_0= ruleStringLiteralExpCS )
                    // InternalCPL.g:3766:5: lv_ownedInitExpression_3_0= ruleStringLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getShadowPartCSAccess().getOwnedInitExpressionStringLiteralExpCSParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_ownedInitExpression_3_0=ruleStringLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getShadowPartCSRule());
                      					}
                      					set(
                      						current,
                      						"ownedInitExpression",
                      						lv_ownedInitExpression_3_0,
                      						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.StringLiteralExpCS");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShadowPartCS"


    // $ANTLR start "entryRulePatternExpCS"
    // InternalCPL.g:3787:1: entryRulePatternExpCS returns [EObject current=null] : iv_rulePatternExpCS= rulePatternExpCS EOF ;
    public final EObject entryRulePatternExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternExpCS = null;


        try {
            // InternalCPL.g:3787:53: (iv_rulePatternExpCS= rulePatternExpCS EOF )
            // InternalCPL.g:3788:2: iv_rulePatternExpCS= rulePatternExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPatternExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePatternExpCS=rulePatternExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePatternExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePatternExpCS"


    // $ANTLR start "rulePatternExpCS"
    // InternalCPL.g:3794:1: rulePatternExpCS returns [EObject current=null] : ( ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )? otherlv_1= ':' ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) ) ) ;
    public final EObject rulePatternExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_patternVariableName_0_0 = null;

        EObject lv_ownedPatternType_2_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:3800:2: ( ( ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )? otherlv_1= ':' ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) ) ) )
            // InternalCPL.g:3801:2: ( ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )? otherlv_1= ':' ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) ) )
            {
            // InternalCPL.g:3801:2: ( ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )? otherlv_1= ':' ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) ) )
            // InternalCPL.g:3802:3: ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )? otherlv_1= ':' ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) )
            {
            // InternalCPL.g:3802:3: ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( ((LA82_0>=RULE_SIMPLE_ID && LA82_0<=RULE_ESCAPED_ID)||LA82_0==22||(LA82_0>=53 && LA82_0<=54)) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalCPL.g:3803:4: (lv_patternVariableName_0_0= ruleUnrestrictedName )
                    {
                    // InternalCPL.g:3803:4: (lv_patternVariableName_0_0= ruleUnrestrictedName )
                    // InternalCPL.g:3804:5: lv_patternVariableName_0_0= ruleUnrestrictedName
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getPatternExpCSAccess().getPatternVariableNameUnrestrictedNameParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_14);
                    lv_patternVariableName_0_0=ruleUnrestrictedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getPatternExpCSRule());
                      					}
                      					set(
                      						current,
                      						"patternVariableName",
                      						lv_patternVariableName_0_0,
                      						"org.eclipse.ocl.xtext.completeocl.CompleteOCL.UnrestrictedName");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPatternExpCSAccess().getColonKeyword_1());
              		
            }
            // InternalCPL.g:3825:3: ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) )
            // InternalCPL.g:3826:4: (lv_ownedPatternType_2_0= ruleTypeExpCS )
            {
            // InternalCPL.g:3826:4: (lv_ownedPatternType_2_0= ruleTypeExpCS )
            // InternalCPL.g:3827:5: lv_ownedPatternType_2_0= ruleTypeExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPatternExpCSAccess().getOwnedPatternTypeTypeExpCSParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_ownedPatternType_2_0=ruleTypeExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPatternExpCSRule());
              					}
              					set(
              						current,
              						"ownedPatternType",
              						lv_ownedPatternType_2_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePatternExpCS"


    // $ANTLR start "entryRuleLambdaLiteralExpCS"
    // InternalCPL.g:3848:1: entryRuleLambdaLiteralExpCS returns [EObject current=null] : iv_ruleLambdaLiteralExpCS= ruleLambdaLiteralExpCS EOF ;
    public final EObject entryRuleLambdaLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLambdaLiteralExpCS = null;


        try {
            // InternalCPL.g:3848:59: (iv_ruleLambdaLiteralExpCS= ruleLambdaLiteralExpCS EOF )
            // InternalCPL.g:3849:2: iv_ruleLambdaLiteralExpCS= ruleLambdaLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLambdaLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLambdaLiteralExpCS=ruleLambdaLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLambdaLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLambdaLiteralExpCS"


    // $ANTLR start "ruleLambdaLiteralExpCS"
    // InternalCPL.g:3855:1: ruleLambdaLiteralExpCS returns [EObject current=null] : (otherlv_0= 'Lambda' otherlv_1= '{' ( (lv_ownedExpressionCS_2_0= ruleExpCS ) ) otherlv_3= '}' ) ;
    public final EObject ruleLambdaLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ownedExpressionCS_2_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:3861:2: ( (otherlv_0= 'Lambda' otherlv_1= '{' ( (lv_ownedExpressionCS_2_0= ruleExpCS ) ) otherlv_3= '}' ) )
            // InternalCPL.g:3862:2: (otherlv_0= 'Lambda' otherlv_1= '{' ( (lv_ownedExpressionCS_2_0= ruleExpCS ) ) otherlv_3= '}' )
            {
            // InternalCPL.g:3862:2: (otherlv_0= 'Lambda' otherlv_1= '{' ( (lv_ownedExpressionCS_2_0= ruleExpCS ) ) otherlv_3= '}' )
            // InternalCPL.g:3863:3: otherlv_0= 'Lambda' otherlv_1= '{' ( (lv_ownedExpressionCS_2_0= ruleExpCS ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,98,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLambdaLiteralExpCSAccess().getLambdaKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getLambdaLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalCPL.g:3871:3: ( (lv_ownedExpressionCS_2_0= ruleExpCS ) )
            // InternalCPL.g:3872:4: (lv_ownedExpressionCS_2_0= ruleExpCS )
            {
            // InternalCPL.g:3872:4: (lv_ownedExpressionCS_2_0= ruleExpCS )
            // InternalCPL.g:3873:5: lv_ownedExpressionCS_2_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLambdaLiteralExpCSAccess().getOwnedExpressionCSExpCSParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_12);
            lv_ownedExpressionCS_2_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLambdaLiteralExpCSRule());
              					}
              					set(
              						current,
              						"ownedExpressionCS",
              						lv_ownedExpressionCS_2_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getLambdaLiteralExpCSAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLambdaLiteralExpCS"


    // $ANTLR start "entryRuleMapLiteralExpCS"
    // InternalCPL.g:3898:1: entryRuleMapLiteralExpCS returns [EObject current=null] : iv_ruleMapLiteralExpCS= ruleMapLiteralExpCS EOF ;
    public final EObject entryRuleMapLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapLiteralExpCS = null;


        try {
            // InternalCPL.g:3898:56: (iv_ruleMapLiteralExpCS= ruleMapLiteralExpCS EOF )
            // InternalCPL.g:3899:2: iv_ruleMapLiteralExpCS= ruleMapLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMapLiteralExpCS=ruleMapLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapLiteralExpCS"


    // $ANTLR start "ruleMapLiteralExpCS"
    // InternalCPL.g:3905:1: ruleMapLiteralExpCS returns [EObject current=null] : ( ( (lv_ownedType_0_0= ruleMapTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleMapLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedType_0_0 = null;

        EObject lv_ownedParts_2_0 = null;

        EObject lv_ownedParts_4_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:3911:2: ( ( ( (lv_ownedType_0_0= ruleMapTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )? otherlv_5= '}' ) )
            // InternalCPL.g:3912:2: ( ( (lv_ownedType_0_0= ruleMapTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )? otherlv_5= '}' )
            {
            // InternalCPL.g:3912:2: ( ( (lv_ownedType_0_0= ruleMapTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )? otherlv_5= '}' )
            // InternalCPL.g:3913:3: ( (lv_ownedType_0_0= ruleMapTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )? otherlv_5= '}'
            {
            // InternalCPL.g:3913:3: ( (lv_ownedType_0_0= ruleMapTypeCS ) )
            // InternalCPL.g:3914:4: (lv_ownedType_0_0= ruleMapTypeCS )
            {
            // InternalCPL.g:3914:4: (lv_ownedType_0_0= ruleMapTypeCS )
            // InternalCPL.g:3915:5: lv_ownedType_0_0= ruleMapTypeCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMapLiteralExpCSAccess().getOwnedTypeMapTypeCSParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_4);
            lv_ownedType_0_0=ruleMapTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMapLiteralExpCSRule());
              					}
              					set(
              						current,
              						"ownedType",
              						lv_ownedType_0_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.MapTypeCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMapLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalCPL.g:3936:3: ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( ((LA84_0>=RULE_SIMPLE_ID && LA84_0<=RULE_SINGLE_QUOTED_STRING)||LA84_0==22||LA84_0==44||(LA84_0>=53 && LA84_0<=54)||(LA84_0>=63 && LA84_0<=76)||(LA84_0>=88 && LA84_0<=89)||(LA84_0>=91 && LA84_0<=95)||LA84_0==98||(LA84_0>=100 && LA84_0<=103)||LA84_0==110||(LA84_0>=115 && LA84_0<=116)) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalCPL.g:3937:4: ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )*
                    {
                    // InternalCPL.g:3937:4: ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) )
                    // InternalCPL.g:3938:5: (lv_ownedParts_2_0= ruleMapLiteralPartCS )
                    {
                    // InternalCPL.g:3938:5: (lv_ownedParts_2_0= ruleMapLiteralPartCS )
                    // InternalCPL.g:3939:6: lv_ownedParts_2_0= ruleMapLiteralPartCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMapLiteralExpCSAccess().getOwnedPartsMapLiteralPartCSParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_52);
                    lv_ownedParts_2_0=ruleMapLiteralPartCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMapLiteralExpCSRule());
                      						}
                      						add(
                      							current,
                      							"ownedParts",
                      							lv_ownedParts_2_0,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.MapLiteralPartCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalCPL.g:3956:4: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )*
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( (LA83_0==52) ) {
                            alt83=1;
                        }


                        switch (alt83) {
                    	case 1 :
                    	    // InternalCPL.g:3957:5: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) )
                    	    {
                    	    otherlv_3=(Token)match(input,52,FollowSets000.FOLLOW_55); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getMapLiteralExpCSAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalCPL.g:3961:5: ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) )
                    	    // InternalCPL.g:3962:6: (lv_ownedParts_4_0= ruleMapLiteralPartCS )
                    	    {
                    	    // InternalCPL.g:3962:6: (lv_ownedParts_4_0= ruleMapLiteralPartCS )
                    	    // InternalCPL.g:3963:7: lv_ownedParts_4_0= ruleMapLiteralPartCS
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getMapLiteralExpCSAccess().getOwnedPartsMapLiteralPartCSParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_52);
                    	    lv_ownedParts_4_0=ruleMapLiteralPartCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getMapLiteralExpCSRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"ownedParts",
                    	      								lv_ownedParts_4_0,
                    	      								"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.MapLiteralPartCS");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop83;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getMapLiteralExpCSAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapLiteralExpCS"


    // $ANTLR start "entryRuleMapLiteralPartCS"
    // InternalCPL.g:3990:1: entryRuleMapLiteralPartCS returns [EObject current=null] : iv_ruleMapLiteralPartCS= ruleMapLiteralPartCS EOF ;
    public final EObject entryRuleMapLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapLiteralPartCS = null;


        try {
            // InternalCPL.g:3990:57: (iv_ruleMapLiteralPartCS= ruleMapLiteralPartCS EOF )
            // InternalCPL.g:3991:2: iv_ruleMapLiteralPartCS= ruleMapLiteralPartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapLiteralPartCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMapLiteralPartCS=ruleMapLiteralPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapLiteralPartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapLiteralPartCS"


    // $ANTLR start "ruleMapLiteralPartCS"
    // InternalCPL.g:3997:1: ruleMapLiteralPartCS returns [EObject current=null] : ( ( (lv_ownedKey_0_0= ruleExpCS ) ) otherlv_1= '<-' ( (lv_ownedValue_2_0= ruleExpCS ) ) ) ;
    public final EObject ruleMapLiteralPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ownedKey_0_0 = null;

        EObject lv_ownedValue_2_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:4003:2: ( ( ( (lv_ownedKey_0_0= ruleExpCS ) ) otherlv_1= '<-' ( (lv_ownedValue_2_0= ruleExpCS ) ) ) )
            // InternalCPL.g:4004:2: ( ( (lv_ownedKey_0_0= ruleExpCS ) ) otherlv_1= '<-' ( (lv_ownedValue_2_0= ruleExpCS ) ) )
            {
            // InternalCPL.g:4004:2: ( ( (lv_ownedKey_0_0= ruleExpCS ) ) otherlv_1= '<-' ( (lv_ownedValue_2_0= ruleExpCS ) ) )
            // InternalCPL.g:4005:3: ( (lv_ownedKey_0_0= ruleExpCS ) ) otherlv_1= '<-' ( (lv_ownedValue_2_0= ruleExpCS ) )
            {
            // InternalCPL.g:4005:3: ( (lv_ownedKey_0_0= ruleExpCS ) )
            // InternalCPL.g:4006:4: (lv_ownedKey_0_0= ruleExpCS )
            {
            // InternalCPL.g:4006:4: (lv_ownedKey_0_0= ruleExpCS )
            // InternalCPL.g:4007:5: lv_ownedKey_0_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMapLiteralPartCSAccess().getOwnedKeyExpCSParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_58);
            lv_ownedKey_0_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMapLiteralPartCSRule());
              					}
              					set(
              						current,
              						"ownedKey",
              						lv_ownedKey_0_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,99,FollowSets000.FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMapLiteralPartCSAccess().getLessThanSignHyphenMinusKeyword_1());
              		
            }
            // InternalCPL.g:4028:3: ( (lv_ownedValue_2_0= ruleExpCS ) )
            // InternalCPL.g:4029:4: (lv_ownedValue_2_0= ruleExpCS )
            {
            // InternalCPL.g:4029:4: (lv_ownedValue_2_0= ruleExpCS )
            // InternalCPL.g:4030:5: lv_ownedValue_2_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMapLiteralPartCSAccess().getOwnedValueExpCSParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_ownedValue_2_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMapLiteralPartCSRule());
              					}
              					set(
              						current,
              						"ownedValue",
              						lv_ownedValue_2_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapLiteralPartCS"


    // $ANTLR start "entryRulePrimitiveLiteralExpCS"
    // InternalCPL.g:4051:1: entryRulePrimitiveLiteralExpCS returns [EObject current=null] : iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF ;
    public final EObject entryRulePrimitiveLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveLiteralExpCS = null;


        try {
            // InternalCPL.g:4051:62: (iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF )
            // InternalCPL.g:4052:2: iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePrimitiveLiteralExpCS=rulePrimitiveLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveLiteralExpCS"


    // $ANTLR start "rulePrimitiveLiteralExpCS"
    // InternalCPL.g:4058:1: rulePrimitiveLiteralExpCS returns [EObject current=null] : (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS ) ;
    public final EObject rulePrimitiveLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLiteralExpCS_0 = null;

        EObject this_StringLiteralExpCS_1 = null;

        EObject this_BooleanLiteralExpCS_2 = null;

        EObject this_UnlimitedNaturalLiteralExpCS_3 = null;

        EObject this_InvalidLiteralExpCS_4 = null;

        EObject this_NullLiteralExpCS_5 = null;



        	enterRule();

        try {
            // InternalCPL.g:4064:2: ( (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS ) )
            // InternalCPL.g:4065:2: (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS )
            {
            // InternalCPL.g:4065:2: (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS )
            int alt85=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt85=1;
                }
                break;
            case RULE_SINGLE_QUOTED_STRING:
                {
                alt85=2;
                }
                break;
            case 100:
            case 101:
                {
                alt85=3;
                }
                break;
            case 76:
                {
                alt85=4;
                }
                break;
            case 102:
                {
                alt85=5;
                }
                break;
            case 103:
                {
                alt85=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }

            switch (alt85) {
                case 1 :
                    // InternalCPL.g:4066:3: this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getNumberLiteralExpCSParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NumberLiteralExpCS_0=ruleNumberLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NumberLiteralExpCS_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCPL.g:4078:3: this_StringLiteralExpCS_1= ruleStringLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getStringLiteralExpCSParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_StringLiteralExpCS_1=ruleStringLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StringLiteralExpCS_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalCPL.g:4090:3: this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getBooleanLiteralExpCSParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_BooleanLiteralExpCS_2=ruleBooleanLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BooleanLiteralExpCS_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalCPL.g:4102:3: this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getUnlimitedNaturalLiteralExpCSParserRuleCall_3());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_UnlimitedNaturalLiteralExpCS_3=ruleUnlimitedNaturalLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_UnlimitedNaturalLiteralExpCS_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalCPL.g:4114:3: this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getInvalidLiteralExpCSParserRuleCall_4());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_InvalidLiteralExpCS_4=ruleInvalidLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_InvalidLiteralExpCS_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalCPL.g:4126:3: this_NullLiteralExpCS_5= ruleNullLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getNullLiteralExpCSParserRuleCall_5());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NullLiteralExpCS_5=ruleNullLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NullLiteralExpCS_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveLiteralExpCS"


    // $ANTLR start "entryRuleTupleLiteralExpCS"
    // InternalCPL.g:4141:1: entryRuleTupleLiteralExpCS returns [EObject current=null] : iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF ;
    public final EObject entryRuleTupleLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteralExpCS = null;


        try {
            // InternalCPL.g:4141:58: (iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF )
            // InternalCPL.g:4142:2: iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTupleLiteralExpCS=ruleTupleLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTupleLiteralExpCS"


    // $ANTLR start "ruleTupleLiteralExpCS"
    // InternalCPL.g:4148:1: ruleTupleLiteralExpCS returns [EObject current=null] : (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleTupleLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedParts_2_0 = null;

        EObject lv_ownedParts_4_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:4154:2: ( (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' ) )
            // InternalCPL.g:4155:2: (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' )
            {
            // InternalCPL.g:4155:2: (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' )
            // InternalCPL.g:4156:3: otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,89,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTupleLiteralExpCSAccess().getTupleKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTupleLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalCPL.g:4164:3: ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) )
            // InternalCPL.g:4165:4: (lv_ownedParts_2_0= ruleTupleLiteralPartCS )
            {
            // InternalCPL.g:4165:4: (lv_ownedParts_2_0= ruleTupleLiteralPartCS )
            // InternalCPL.g:4166:5: lv_ownedParts_2_0= ruleTupleLiteralPartCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsTupleLiteralPartCSParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_52);
            lv_ownedParts_2_0=ruleTupleLiteralPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTupleLiteralExpCSRule());
              					}
              					add(
              						current,
              						"ownedParts",
              						lv_ownedParts_2_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TupleLiteralPartCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCPL.g:4183:3: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==52) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // InternalCPL.g:4184:4: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) )
            	    {
            	    otherlv_3=(Token)match(input,52,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getTupleLiteralExpCSAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalCPL.g:4188:4: ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) )
            	    // InternalCPL.g:4189:5: (lv_ownedParts_4_0= ruleTupleLiteralPartCS )
            	    {
            	    // InternalCPL.g:4189:5: (lv_ownedParts_4_0= ruleTupleLiteralPartCS )
            	    // InternalCPL.g:4190:6: lv_ownedParts_4_0= ruleTupleLiteralPartCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsTupleLiteralPartCSParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_52);
            	    lv_ownedParts_4_0=ruleTupleLiteralPartCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getTupleLiteralExpCSRule());
            	      						}
            	      						add(
            	      							current,
            	      							"ownedParts",
            	      							lv_ownedParts_4_0,
            	      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TupleLiteralPartCS");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop86;
                }
            } while (true);

            otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTupleLiteralExpCSAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTupleLiteralExpCS"


    // $ANTLR start "entryRuleTupleLiteralPartCS"
    // InternalCPL.g:4216:1: entryRuleTupleLiteralPartCS returns [EObject current=null] : iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF ;
    public final EObject entryRuleTupleLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteralPartCS = null;


        try {
            // InternalCPL.g:4216:59: (iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF )
            // InternalCPL.g:4217:2: iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleLiteralPartCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTupleLiteralPartCS=ruleTupleLiteralPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleLiteralPartCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTupleLiteralPartCS"


    // $ANTLR start "ruleTupleLiteralPartCS"
    // InternalCPL.g:4223:1: ruleTupleLiteralPartCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) ) ;
    public final EObject ruleTupleLiteralPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;

        EObject lv_ownedInitExpression_4_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:4229:2: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) ) )
            // InternalCPL.g:4230:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )
            {
            // InternalCPL.g:4230:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )
            // InternalCPL.g:4231:3: ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) )
            {
            // InternalCPL.g:4231:3: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // InternalCPL.g:4232:4: (lv_name_0_0= ruleUnrestrictedName )
            {
            // InternalCPL.g:4232:4: (lv_name_0_0= ruleUnrestrictedName )
            // InternalCPL.g:4233:5: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getNameUnrestrictedNameParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_59);
            lv_name_0_0=ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTupleLiteralPartCSRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.ocl.xtext.completeocl.CompleteOCL.UnrestrictedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCPL.g:4250:3: (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==24) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalCPL.g:4251:4: otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    {
                    otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getTupleLiteralPartCSAccess().getColonKeyword_1_0());
                      			
                    }
                    // InternalCPL.g:4255:4: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // InternalCPL.g:4256:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // InternalCPL.g:4256:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    // InternalCPL.g:4257:6: lv_ownedType_2_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_37);
                    lv_ownedType_2_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTupleLiteralPartCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedType",
                      							lv_ownedType_2_0,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,35,FollowSets000.FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTupleLiteralPartCSAccess().getEqualsSignKeyword_2());
              		
            }
            // InternalCPL.g:4279:3: ( (lv_ownedInitExpression_4_0= ruleExpCS ) )
            // InternalCPL.g:4280:4: (lv_ownedInitExpression_4_0= ruleExpCS )
            {
            // InternalCPL.g:4280:4: (lv_ownedInitExpression_4_0= ruleExpCS )
            // InternalCPL.g:4281:5: lv_ownedInitExpression_4_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getOwnedInitExpressionExpCSParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_ownedInitExpression_4_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTupleLiteralPartCSRule());
              					}
              					set(
              						current,
              						"ownedInitExpression",
              						lv_ownedInitExpression_4_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTupleLiteralPartCS"


    // $ANTLR start "entryRuleNumberLiteralExpCS"
    // InternalCPL.g:4302:1: entryRuleNumberLiteralExpCS returns [EObject current=null] : iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF ;
    public final EObject entryRuleNumberLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteralExpCS = null;


        try {
            // InternalCPL.g:4302:59: (iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF )
            // InternalCPL.g:4303:2: iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNumberLiteralExpCS=ruleNumberLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberLiteralExpCS"


    // $ANTLR start "ruleNumberLiteralExpCS"
    // InternalCPL.g:4309:1: ruleNumberLiteralExpCS returns [EObject current=null] : ( (lv_symbol_0_0= ruleNUMBER_LITERAL ) ) ;
    public final EObject ruleNumberLiteralExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_symbol_0_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:4315:2: ( ( (lv_symbol_0_0= ruleNUMBER_LITERAL ) ) )
            // InternalCPL.g:4316:2: ( (lv_symbol_0_0= ruleNUMBER_LITERAL ) )
            {
            // InternalCPL.g:4316:2: ( (lv_symbol_0_0= ruleNUMBER_LITERAL ) )
            // InternalCPL.g:4317:3: (lv_symbol_0_0= ruleNUMBER_LITERAL )
            {
            // InternalCPL.g:4317:3: (lv_symbol_0_0= ruleNUMBER_LITERAL )
            // InternalCPL.g:4318:4: lv_symbol_0_0= ruleNUMBER_LITERAL
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getNumberLiteralExpCSAccess().getSymbolNUMBER_LITERALParserRuleCall_0());
              			
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_symbol_0_0=ruleNUMBER_LITERAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getNumberLiteralExpCSRule());
              				}
              				set(
              					current,
              					"symbol",
              					lv_symbol_0_0,
              					"org.eclipse.ocl.xtext.base.Base.NUMBER_LITERAL");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberLiteralExpCS"


    // $ANTLR start "entryRuleStringLiteralExpCS"
    // InternalCPL.g:4338:1: entryRuleStringLiteralExpCS returns [EObject current=null] : iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF ;
    public final EObject entryRuleStringLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteralExpCS = null;


        try {
            // InternalCPL.g:4338:59: (iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF )
            // InternalCPL.g:4339:2: iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleStringLiteralExpCS=ruleStringLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringLiteralExpCS"


    // $ANTLR start "ruleStringLiteralExpCS"
    // InternalCPL.g:4345:1: ruleStringLiteralExpCS returns [EObject current=null] : ( (lv_segments_0_0= ruleStringLiteral ) )+ ;
    public final EObject ruleStringLiteralExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_segments_0_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:4351:2: ( ( (lv_segments_0_0= ruleStringLiteral ) )+ )
            // InternalCPL.g:4352:2: ( (lv_segments_0_0= ruleStringLiteral ) )+
            {
            // InternalCPL.g:4352:2: ( (lv_segments_0_0= ruleStringLiteral ) )+
            int cnt88=0;
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( (LA88_0==RULE_SINGLE_QUOTED_STRING) ) {
                    alt88=1;
                }


                switch (alt88) {
            	case 1 :
            	    // InternalCPL.g:4353:3: (lv_segments_0_0= ruleStringLiteral )
            	    {
            	    // InternalCPL.g:4353:3: (lv_segments_0_0= ruleStringLiteral )
            	    // InternalCPL.g:4354:4: lv_segments_0_0= ruleStringLiteral
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getStringLiteralExpCSAccess().getSegmentsStringLiteralParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FollowSets000.FOLLOW_60);
            	    lv_segments_0_0=ruleStringLiteral();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getStringLiteralExpCSRule());
            	      				}
            	      				add(
            	      					current,
            	      					"segments",
            	      					lv_segments_0_0,
            	      					"org.eclipse.ocl.xtext.base.Base.StringLiteral");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt88 >= 1 ) break loop88;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(88, input);
                        throw eee;
                }
                cnt88++;
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringLiteralExpCS"


    // $ANTLR start "entryRuleBooleanLiteralExpCS"
    // InternalCPL.g:4374:1: entryRuleBooleanLiteralExpCS returns [EObject current=null] : iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF ;
    public final EObject entryRuleBooleanLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteralExpCS = null;


        try {
            // InternalCPL.g:4374:60: (iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF )
            // InternalCPL.g:4375:2: iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBooleanLiteralExpCS=ruleBooleanLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanLiteralExpCS"


    // $ANTLR start "ruleBooleanLiteralExpCS"
    // InternalCPL.g:4381:1: ruleBooleanLiteralExpCS returns [EObject current=null] : ( ( (lv_symbol_0_0= 'true' ) ) | ( (lv_symbol_1_0= 'false' ) ) ) ;
    public final EObject ruleBooleanLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_0_0=null;
        Token lv_symbol_1_0=null;


        	enterRule();

        try {
            // InternalCPL.g:4387:2: ( ( ( (lv_symbol_0_0= 'true' ) ) | ( (lv_symbol_1_0= 'false' ) ) ) )
            // InternalCPL.g:4388:2: ( ( (lv_symbol_0_0= 'true' ) ) | ( (lv_symbol_1_0= 'false' ) ) )
            {
            // InternalCPL.g:4388:2: ( ( (lv_symbol_0_0= 'true' ) ) | ( (lv_symbol_1_0= 'false' ) ) )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==100) ) {
                alt89=1;
            }
            else if ( (LA89_0==101) ) {
                alt89=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }
            switch (alt89) {
                case 1 :
                    // InternalCPL.g:4389:3: ( (lv_symbol_0_0= 'true' ) )
                    {
                    // InternalCPL.g:4389:3: ( (lv_symbol_0_0= 'true' ) )
                    // InternalCPL.g:4390:4: (lv_symbol_0_0= 'true' )
                    {
                    // InternalCPL.g:4390:4: (lv_symbol_0_0= 'true' )
                    // InternalCPL.g:4391:5: lv_symbol_0_0= 'true'
                    {
                    lv_symbol_0_0=(Token)match(input,100,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_symbol_0_0, grammarAccess.getBooleanLiteralExpCSAccess().getSymbolTrueKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBooleanLiteralExpCSRule());
                      					}
                      					setWithLastConsumed(current, "symbol", lv_symbol_0_0, "true");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCPL.g:4404:3: ( (lv_symbol_1_0= 'false' ) )
                    {
                    // InternalCPL.g:4404:3: ( (lv_symbol_1_0= 'false' ) )
                    // InternalCPL.g:4405:4: (lv_symbol_1_0= 'false' )
                    {
                    // InternalCPL.g:4405:4: (lv_symbol_1_0= 'false' )
                    // InternalCPL.g:4406:5: lv_symbol_1_0= 'false'
                    {
                    lv_symbol_1_0=(Token)match(input,101,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_symbol_1_0, grammarAccess.getBooleanLiteralExpCSAccess().getSymbolFalseKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBooleanLiteralExpCSRule());
                      					}
                      					setWithLastConsumed(current, "symbol", lv_symbol_1_0, "false");
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanLiteralExpCS"


    // $ANTLR start "entryRuleUnlimitedNaturalLiteralExpCS"
    // InternalCPL.g:4422:1: entryRuleUnlimitedNaturalLiteralExpCS returns [EObject current=null] : iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF ;
    public final EObject entryRuleUnlimitedNaturalLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnlimitedNaturalLiteralExpCS = null;


        try {
            // InternalCPL.g:4422:69: (iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF )
            // InternalCPL.g:4423:2: iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnlimitedNaturalLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleUnlimitedNaturalLiteralExpCS=ruleUnlimitedNaturalLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnlimitedNaturalLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnlimitedNaturalLiteralExpCS"


    // $ANTLR start "ruleUnlimitedNaturalLiteralExpCS"
    // InternalCPL.g:4429:1: ruleUnlimitedNaturalLiteralExpCS returns [EObject current=null] : ( () otherlv_1= '*' ) ;
    public final EObject ruleUnlimitedNaturalLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalCPL.g:4435:2: ( ( () otherlv_1= '*' ) )
            // InternalCPL.g:4436:2: ( () otherlv_1= '*' )
            {
            // InternalCPL.g:4436:2: ( () otherlv_1= '*' )
            // InternalCPL.g:4437:3: () otherlv_1= '*'
            {
            // InternalCPL.g:4437:3: ()
            // InternalCPL.g:4438:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getUnlimitedNaturalLiteralExpCSAccess().getUnlimitedNaturalLiteralExpCSAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,76,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getUnlimitedNaturalLiteralExpCSAccess().getAsteriskKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnlimitedNaturalLiteralExpCS"


    // $ANTLR start "entryRuleInvalidLiteralExpCS"
    // InternalCPL.g:4455:1: entryRuleInvalidLiteralExpCS returns [EObject current=null] : iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF ;
    public final EObject entryRuleInvalidLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvalidLiteralExpCS = null;


        try {
            // InternalCPL.g:4455:60: (iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF )
            // InternalCPL.g:4456:2: iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInvalidLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInvalidLiteralExpCS=ruleInvalidLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInvalidLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInvalidLiteralExpCS"


    // $ANTLR start "ruleInvalidLiteralExpCS"
    // InternalCPL.g:4462:1: ruleInvalidLiteralExpCS returns [EObject current=null] : ( () otherlv_1= 'invalid' ) ;
    public final EObject ruleInvalidLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalCPL.g:4468:2: ( ( () otherlv_1= 'invalid' ) )
            // InternalCPL.g:4469:2: ( () otherlv_1= 'invalid' )
            {
            // InternalCPL.g:4469:2: ( () otherlv_1= 'invalid' )
            // InternalCPL.g:4470:3: () otherlv_1= 'invalid'
            {
            // InternalCPL.g:4470:3: ()
            // InternalCPL.g:4471:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getInvalidLiteralExpCSAccess().getInvalidLiteralExpCSAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,102,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getInvalidLiteralExpCSAccess().getInvalidKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInvalidLiteralExpCS"


    // $ANTLR start "entryRuleNullLiteralExpCS"
    // InternalCPL.g:4488:1: entryRuleNullLiteralExpCS returns [EObject current=null] : iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF ;
    public final EObject entryRuleNullLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteralExpCS = null;


        try {
            // InternalCPL.g:4488:57: (iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF )
            // InternalCPL.g:4489:2: iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNullLiteralExpCS=ruleNullLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNullLiteralExpCS"


    // $ANTLR start "ruleNullLiteralExpCS"
    // InternalCPL.g:4495:1: ruleNullLiteralExpCS returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalCPL.g:4501:2: ( ( () otherlv_1= 'null' ) )
            // InternalCPL.g:4502:2: ( () otherlv_1= 'null' )
            {
            // InternalCPL.g:4502:2: ( () otherlv_1= 'null' )
            // InternalCPL.g:4503:3: () otherlv_1= 'null'
            {
            // InternalCPL.g:4503:3: ()
            // InternalCPL.g:4504:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getNullLiteralExpCSAccess().getNullLiteralExpCSAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,103,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNullLiteralExpCSAccess().getNullKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNullLiteralExpCS"


    // $ANTLR start "entryRuleTypeLiteralCS"
    // InternalCPL.g:4521:1: entryRuleTypeLiteralCS returns [EObject current=null] : iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF ;
    public final EObject entryRuleTypeLiteralCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteralCS = null;


        try {
            // InternalCPL.g:4521:54: (iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF )
            // InternalCPL.g:4522:2: iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeLiteralCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypeLiteralCS=ruleTypeLiteralCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeLiteralCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeLiteralCS"


    // $ANTLR start "ruleTypeLiteralCS"
    // InternalCPL.g:4528:1: ruleTypeLiteralCS returns [EObject current=null] : (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_MapTypeCS_2= ruleMapTypeCS | this_TupleTypeCS_3= ruleTupleTypeCS ) ;
    public final EObject ruleTypeLiteralCS() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveTypeCS_0 = null;

        EObject this_CollectionTypeCS_1 = null;

        EObject this_MapTypeCS_2 = null;

        EObject this_TupleTypeCS_3 = null;



        	enterRule();

        try {
            // InternalCPL.g:4534:2: ( (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_MapTypeCS_2= ruleMapTypeCS | this_TupleTypeCS_3= ruleTupleTypeCS ) )
            // InternalCPL.g:4535:2: (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_MapTypeCS_2= ruleMapTypeCS | this_TupleTypeCS_3= ruleTupleTypeCS )
            {
            // InternalCPL.g:4535:2: (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_MapTypeCS_2= ruleMapTypeCS | this_TupleTypeCS_3= ruleTupleTypeCS )
            int alt90=4;
            switch ( input.LA(1) ) {
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
                {
                alt90=1;
                }
                break;
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
                {
                alt90=2;
                }
                break;
            case 88:
                {
                alt90=3;
                }
                break;
            case 89:
                {
                alt90=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }

            switch (alt90) {
                case 1 :
                    // InternalCPL.g:4536:3: this_PrimitiveTypeCS_0= rulePrimitiveTypeCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeLiteralCSAccess().getPrimitiveTypeCSParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_PrimitiveTypeCS_0=rulePrimitiveTypeCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PrimitiveTypeCS_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCPL.g:4548:3: this_CollectionTypeCS_1= ruleCollectionTypeCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeLiteralCSAccess().getCollectionTypeCSParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_CollectionTypeCS_1=ruleCollectionTypeCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CollectionTypeCS_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalCPL.g:4560:3: this_MapTypeCS_2= ruleMapTypeCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeLiteralCSAccess().getMapTypeCSParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_MapTypeCS_2=ruleMapTypeCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MapTypeCS_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalCPL.g:4572:3: this_TupleTypeCS_3= ruleTupleTypeCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeLiteralCSAccess().getTupleTypeCSParserRuleCall_3());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TupleTypeCS_3=ruleTupleTypeCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TupleTypeCS_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeLiteralCS"


    // $ANTLR start "entryRuleTypeLiteralWithMultiplicityCS"
    // InternalCPL.g:4587:1: entryRuleTypeLiteralWithMultiplicityCS returns [EObject current=null] : iv_ruleTypeLiteralWithMultiplicityCS= ruleTypeLiteralWithMultiplicityCS EOF ;
    public final EObject entryRuleTypeLiteralWithMultiplicityCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteralWithMultiplicityCS = null;


        try {
            // InternalCPL.g:4587:70: (iv_ruleTypeLiteralWithMultiplicityCS= ruleTypeLiteralWithMultiplicityCS EOF )
            // InternalCPL.g:4588:2: iv_ruleTypeLiteralWithMultiplicityCS= ruleTypeLiteralWithMultiplicityCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeLiteralWithMultiplicityCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypeLiteralWithMultiplicityCS=ruleTypeLiteralWithMultiplicityCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeLiteralWithMultiplicityCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeLiteralWithMultiplicityCS"


    // $ANTLR start "ruleTypeLiteralWithMultiplicityCS"
    // InternalCPL.g:4594:1: ruleTypeLiteralWithMultiplicityCS returns [EObject current=null] : (this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? ) ;
    public final EObject ruleTypeLiteralWithMultiplicityCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypeLiteralCS_0 = null;

        EObject lv_ownedMultiplicity_1_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:4600:2: ( (this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? ) )
            // InternalCPL.g:4601:2: (this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? )
            {
            // InternalCPL.g:4601:2: (this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? )
            // InternalCPL.g:4602:3: this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTypeLiteralWithMultiplicityCSAccess().getTypeLiteralCSParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_61);
            this_TypeLiteralCS_0=ruleTypeLiteralCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_TypeLiteralCS_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalCPL.g:4613:3: ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==105) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalCPL.g:4614:4: (lv_ownedMultiplicity_1_0= ruleMultiplicityCS )
                    {
                    // InternalCPL.g:4614:4: (lv_ownedMultiplicity_1_0= ruleMultiplicityCS )
                    // InternalCPL.g:4615:5: lv_ownedMultiplicity_1_0= ruleMultiplicityCS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTypeLiteralWithMultiplicityCSAccess().getOwnedMultiplicityMultiplicityCSParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_ownedMultiplicity_1_0=ruleMultiplicityCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTypeLiteralWithMultiplicityCSRule());
                      					}
                      					set(
                      						current,
                      						"ownedMultiplicity",
                      						lv_ownedMultiplicity_1_0,
                      						"org.eclipse.ocl.xtext.base.Base.MultiplicityCS");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeLiteralWithMultiplicityCS"


    // $ANTLR start "entryRuleTypeLiteralExpCS"
    // InternalCPL.g:4636:1: entryRuleTypeLiteralExpCS returns [EObject current=null] : iv_ruleTypeLiteralExpCS= ruleTypeLiteralExpCS EOF ;
    public final EObject entryRuleTypeLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteralExpCS = null;


        try {
            // InternalCPL.g:4636:57: (iv_ruleTypeLiteralExpCS= ruleTypeLiteralExpCS EOF )
            // InternalCPL.g:4637:2: iv_ruleTypeLiteralExpCS= ruleTypeLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeLiteralExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypeLiteralExpCS=ruleTypeLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeLiteralExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeLiteralExpCS"


    // $ANTLR start "ruleTypeLiteralExpCS"
    // InternalCPL.g:4643:1: ruleTypeLiteralExpCS returns [EObject current=null] : ( (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS ) ) ;
    public final EObject ruleTypeLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedType_0_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:4649:2: ( ( (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS ) ) )
            // InternalCPL.g:4650:2: ( (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS ) )
            {
            // InternalCPL.g:4650:2: ( (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS ) )
            // InternalCPL.g:4651:3: (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS )
            {
            // InternalCPL.g:4651:3: (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS )
            // InternalCPL.g:4652:4: lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getTypeLiteralExpCSAccess().getOwnedTypeTypeLiteralWithMultiplicityCSParserRuleCall_0());
              			
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_ownedType_0_0=ruleTypeLiteralWithMultiplicityCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getTypeLiteralExpCSRule());
              				}
              				set(
              					current,
              					"ownedType",
              					lv_ownedType_0_0,
              					"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeLiteralWithMultiplicityCS");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeLiteralExpCS"


    // $ANTLR start "entryRuleTypeNameExpCS"
    // InternalCPL.g:4672:1: entryRuleTypeNameExpCS returns [EObject current=null] : iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF ;
    public final EObject entryRuleTypeNameExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeNameExpCS = null;


        try {
            // InternalCPL.g:4672:54: (iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF )
            // InternalCPL.g:4673:2: iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeNameExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypeNameExpCS=ruleTypeNameExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeNameExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeNameExpCS"


    // $ANTLR start "ruleTypeNameExpCS"
    // InternalCPL.g:4679:1: ruleTypeNameExpCS returns [EObject current=null] : ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )? ) ;
    public final EObject ruleTypeNameExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedPathName_0_0 = null;

        EObject lv_ownedCurlyBracketedClause_1_0 = null;

        EObject lv_ownedPatternGuard_3_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:4685:2: ( ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )? ) )
            // InternalCPL.g:4686:2: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )? )
            {
            // InternalCPL.g:4686:2: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )? )
            // InternalCPL.g:4687:3: ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )?
            {
            // InternalCPL.g:4687:3: ( (lv_ownedPathName_0_0= rulePathNameCS ) )
            // InternalCPL.g:4688:4: (lv_ownedPathName_0_0= rulePathNameCS )
            {
            // InternalCPL.g:4688:4: (lv_ownedPathName_0_0= rulePathNameCS )
            // InternalCPL.g:4689:5: lv_ownedPathName_0_0= rulePathNameCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypeNameExpCSAccess().getOwnedPathNamePathNameCSParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_62);
            lv_ownedPathName_0_0=rulePathNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTypeNameExpCSRule());
              					}
              					set(
              						current,
              						"ownedPathName",
              						lv_ownedPathName_0_0,
              						"org.eclipse.ocl.xtext.base.Base.PathNameCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCPL.g:4706:3: ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==19) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalCPL.g:4707:4: ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )?
                    {
                    // InternalCPL.g:4707:4: ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) )
                    // InternalCPL.g:4708:5: (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS )
                    {
                    // InternalCPL.g:4708:5: (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS )
                    // InternalCPL.g:4709:6: lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTypeNameExpCSAccess().getOwnedCurlyBracketedClauseCurlyBracketedClauseCSParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_62);
                    lv_ownedCurlyBracketedClause_1_0=ruleCurlyBracketedClauseCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTypeNameExpCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedCurlyBracketedClause",
                      							lv_ownedCurlyBracketedClause_1_0,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.CurlyBracketedClauseCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalCPL.g:4726:4: (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )?
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==19) ) {
                        alt92=1;
                    }
                    switch (alt92) {
                        case 1 :
                            // InternalCPL.g:4727:5: otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}'
                            {
                            otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_55); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_2, grammarAccess.getTypeNameExpCSAccess().getLeftCurlyBracketKeyword_1_1_0());
                              				
                            }
                            // InternalCPL.g:4731:5: ( (lv_ownedPatternGuard_3_0= ruleExpCS ) )
                            // InternalCPL.g:4732:6: (lv_ownedPatternGuard_3_0= ruleExpCS )
                            {
                            // InternalCPL.g:4732:6: (lv_ownedPatternGuard_3_0= ruleExpCS )
                            // InternalCPL.g:4733:7: lv_ownedPatternGuard_3_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getTypeNameExpCSAccess().getOwnedPatternGuardExpCSParserRuleCall_1_1_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_12);
                            lv_ownedPatternGuard_3_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getTypeNameExpCSRule());
                              							}
                              							set(
                              								current,
                              								"ownedPatternGuard",
                              								lv_ownedPatternGuard_3_0,
                              								"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getTypeNameExpCSAccess().getRightCurlyBracketKeyword_1_1_2());
                              				
                            }

                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeNameExpCS"


    // $ANTLR start "entryRuleTypeExpWithoutMultiplicityCS"
    // InternalCPL.g:4760:1: entryRuleTypeExpWithoutMultiplicityCS returns [EObject current=null] : iv_ruleTypeExpWithoutMultiplicityCS= ruleTypeExpWithoutMultiplicityCS EOF ;
    public final EObject entryRuleTypeExpWithoutMultiplicityCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeExpWithoutMultiplicityCS = null;


        try {
            // InternalCPL.g:4760:69: (iv_ruleTypeExpWithoutMultiplicityCS= ruleTypeExpWithoutMultiplicityCS EOF )
            // InternalCPL.g:4761:2: iv_ruleTypeExpWithoutMultiplicityCS= ruleTypeExpWithoutMultiplicityCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeExpWithoutMultiplicityCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypeExpWithoutMultiplicityCS=ruleTypeExpWithoutMultiplicityCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeExpWithoutMultiplicityCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeExpWithoutMultiplicityCS"


    // $ANTLR start "ruleTypeExpWithoutMultiplicityCS"
    // InternalCPL.g:4767:1: ruleTypeExpWithoutMultiplicityCS returns [EObject current=null] : (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS ) ;
    public final EObject ruleTypeExpWithoutMultiplicityCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypeNameExpCS_0 = null;

        EObject this_TypeLiteralCS_1 = null;

        EObject this_CollectionPatternCS_2 = null;



        	enterRule();

        try {
            // InternalCPL.g:4773:2: ( (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS ) )
            // InternalCPL.g:4774:2: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS )
            {
            // InternalCPL.g:4774:2: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS )
            int alt94=3;
            alt94 = dfa94.predict(input);
            switch (alt94) {
                case 1 :
                    // InternalCPL.g:4775:3: this_TypeNameExpCS_0= ruleTypeNameExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeExpWithoutMultiplicityCSAccess().getTypeNameExpCSParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TypeNameExpCS_0=ruleTypeNameExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TypeNameExpCS_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCPL.g:4787:3: this_TypeLiteralCS_1= ruleTypeLiteralCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeExpWithoutMultiplicityCSAccess().getTypeLiteralCSParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TypeLiteralCS_1=ruleTypeLiteralCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TypeLiteralCS_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalCPL.g:4799:3: this_CollectionPatternCS_2= ruleCollectionPatternCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeExpWithoutMultiplicityCSAccess().getCollectionPatternCSParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_CollectionPatternCS_2=ruleCollectionPatternCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CollectionPatternCS_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeExpWithoutMultiplicityCS"


    // $ANTLR start "entryRuleTypeExpCS"
    // InternalCPL.g:4814:1: entryRuleTypeExpCS returns [EObject current=null] : iv_ruleTypeExpCS= ruleTypeExpCS EOF ;
    public final EObject entryRuleTypeExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeExpCS = null;


        try {
            // InternalCPL.g:4814:50: (iv_ruleTypeExpCS= ruleTypeExpCS EOF )
            // InternalCPL.g:4815:2: iv_ruleTypeExpCS= ruleTypeExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypeExpCS=ruleTypeExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeExpCS"


    // $ANTLR start "ruleTypeExpCS"
    // InternalCPL.g:4821:1: ruleTypeExpCS returns [EObject current=null] : (this_TypeExpWithoutMultiplicityCS_0= ruleTypeExpWithoutMultiplicityCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? ) ;
    public final EObject ruleTypeExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypeExpWithoutMultiplicityCS_0 = null;

        EObject lv_ownedMultiplicity_1_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:4827:2: ( (this_TypeExpWithoutMultiplicityCS_0= ruleTypeExpWithoutMultiplicityCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? ) )
            // InternalCPL.g:4828:2: (this_TypeExpWithoutMultiplicityCS_0= ruleTypeExpWithoutMultiplicityCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? )
            {
            // InternalCPL.g:4828:2: (this_TypeExpWithoutMultiplicityCS_0= ruleTypeExpWithoutMultiplicityCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? )
            // InternalCPL.g:4829:3: this_TypeExpWithoutMultiplicityCS_0= ruleTypeExpWithoutMultiplicityCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTypeExpCSAccess().getTypeExpWithoutMultiplicityCSParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_61);
            this_TypeExpWithoutMultiplicityCS_0=ruleTypeExpWithoutMultiplicityCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_TypeExpWithoutMultiplicityCS_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalCPL.g:4840:3: ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==105) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // InternalCPL.g:4841:4: (lv_ownedMultiplicity_1_0= ruleMultiplicityCS )
                    {
                    // InternalCPL.g:4841:4: (lv_ownedMultiplicity_1_0= ruleMultiplicityCS )
                    // InternalCPL.g:4842:5: lv_ownedMultiplicity_1_0= ruleMultiplicityCS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTypeExpCSAccess().getOwnedMultiplicityMultiplicityCSParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_ownedMultiplicity_1_0=ruleMultiplicityCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTypeExpCSRule());
                      					}
                      					set(
                      						current,
                      						"ownedMultiplicity",
                      						lv_ownedMultiplicity_1_0,
                      						"org.eclipse.ocl.xtext.base.Base.MultiplicityCS");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeExpCS"


    // $ANTLR start "entryRuleExpCS"
    // InternalCPL.g:4863:1: entryRuleExpCS returns [EObject current=null] : iv_ruleExpCS= ruleExpCS EOF ;
    public final EObject entryRuleExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpCS = null;


        try {
            // InternalCPL.g:4863:46: (iv_ruleExpCS= ruleExpCS EOF )
            // InternalCPL.g:4864:2: iv_ruleExpCS= ruleExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleExpCS=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpCS"


    // $ANTLR start "ruleExpCS"
    // InternalCPL.g:4870:1: ruleExpCS returns [EObject current=null] : ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) | this_PrefixedLetExpCS_4= rulePrefixedLetExpCS ) ;
    public final EObject ruleExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_PrefixedPrimaryExpCS_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_ownedRight_3_0 = null;

        EObject this_PrefixedLetExpCS_4 = null;



        	enterRule();

        try {
            // InternalCPL.g:4876:2: ( ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) | this_PrefixedLetExpCS_4= rulePrefixedLetExpCS ) )
            // InternalCPL.g:4877:2: ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) | this_PrefixedLetExpCS_4= rulePrefixedLetExpCS )
            {
            // InternalCPL.g:4877:2: ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) | this_PrefixedLetExpCS_4= rulePrefixedLetExpCS )
            int alt97=2;
            alt97 = dfa97.predict(input);
            switch (alt97) {
                case 1 :
                    // InternalCPL.g:4878:3: (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? )
                    {
                    // InternalCPL.g:4878:3: (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? )
                    // InternalCPL.g:4879:4: this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )?
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExpCSAccess().getPrefixedPrimaryExpCSParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_63);
                    this_PrefixedPrimaryExpCS_0=rulePrefixedPrimaryExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_PrefixedPrimaryExpCS_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalCPL.g:4890:4: ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )?
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( ((LA96_0>=27 && LA96_0<=28)||(LA96_0>=33 && LA96_0<=36)||LA96_0==38||(LA96_0>=42 && LA96_0<=43)||(LA96_0>=46 && LA96_0<=47)||LA96_0==73||(LA96_0>=76 && LA96_0<=87)) ) {
                        alt96=1;
                    }
                    switch (alt96) {
                        case 1 :
                            // InternalCPL.g:4891:5: () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) )
                            {
                            // InternalCPL.g:4891:5: ()
                            // InternalCPL.g:4892:6: 
                            {
                            if ( state.backtracking==0 ) {

                              						/* */
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						current = forceCreateModelElementAndSet(
                              							grammarAccess.getExpCSAccess().getInfixExpCSOwnedLeftAction_0_1_0(),
                              							current);
                              					
                            }

                            }

                            // InternalCPL.g:4901:5: ( (lv_name_2_0= ruleBinaryOperatorName ) )
                            // InternalCPL.g:4902:6: (lv_name_2_0= ruleBinaryOperatorName )
                            {
                            // InternalCPL.g:4902:6: (lv_name_2_0= ruleBinaryOperatorName )
                            // InternalCPL.g:4903:7: lv_name_2_0= ruleBinaryOperatorName
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getExpCSAccess().getNameBinaryOperatorNameParserRuleCall_0_1_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_55);
                            lv_name_2_0=ruleBinaryOperatorName();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getExpCSRule());
                              							}
                              							set(
                              								current,
                              								"name",
                              								lv_name_2_0,
                              								"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.BinaryOperatorName");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalCPL.g:4920:5: ( (lv_ownedRight_3_0= ruleExpCS ) )
                            // InternalCPL.g:4921:6: (lv_ownedRight_3_0= ruleExpCS )
                            {
                            // InternalCPL.g:4921:6: (lv_ownedRight_3_0= ruleExpCS )
                            // InternalCPL.g:4922:7: lv_ownedRight_3_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getExpCSAccess().getOwnedRightExpCSParserRuleCall_0_1_2_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_ownedRight_3_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getExpCSRule());
                              							}
                              							set(
                              								current,
                              								"ownedRight",
                              								lv_ownedRight_3_0,
                              								"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCPL.g:4942:3: this_PrefixedLetExpCS_4= rulePrefixedLetExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpCSAccess().getPrefixedLetExpCSParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_PrefixedLetExpCS_4=rulePrefixedLetExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PrefixedLetExpCS_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpCS"


    // $ANTLR start "entryRulePrefixedLetExpCS"
    // InternalCPL.g:4957:1: entryRulePrefixedLetExpCS returns [EObject current=null] : iv_rulePrefixedLetExpCS= rulePrefixedLetExpCS EOF ;
    public final EObject entryRulePrefixedLetExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixedLetExpCS = null;


        try {
            // InternalCPL.g:4957:57: (iv_rulePrefixedLetExpCS= rulePrefixedLetExpCS EOF )
            // InternalCPL.g:4958:2: iv_rulePrefixedLetExpCS= rulePrefixedLetExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrefixedLetExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePrefixedLetExpCS=rulePrefixedLetExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrefixedLetExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrefixedLetExpCS"


    // $ANTLR start "rulePrefixedLetExpCS"
    // InternalCPL.g:4964:1: rulePrefixedLetExpCS returns [EObject current=null] : ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) ) | this_LetExpCS_3= ruleLetExpCS ) ;
    public final EObject rulePrefixedLetExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_ownedRight_2_0 = null;

        EObject this_LetExpCS_3 = null;



        	enterRule();

        try {
            // InternalCPL.g:4970:2: ( ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) ) | this_LetExpCS_3= ruleLetExpCS ) )
            // InternalCPL.g:4971:2: ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) ) | this_LetExpCS_3= ruleLetExpCS )
            {
            // InternalCPL.g:4971:2: ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) ) | this_LetExpCS_3= ruleLetExpCS )
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( ((LA98_0>=73 && LA98_0<=75)) ) {
                alt98=1;
            }
            else if ( (LA98_0==115) ) {
                alt98=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }
            switch (alt98) {
                case 1 :
                    // InternalCPL.g:4972:3: ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) )
                    {
                    // InternalCPL.g:4972:3: ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) )
                    // InternalCPL.g:4973:4: () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) )
                    {
                    // InternalCPL.g:4973:4: ()
                    // InternalCPL.g:4974:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrefixedLetExpCSAccess().getPrefixExpCSAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalCPL.g:4983:4: ( (lv_name_1_0= ruleUnaryOperatorName ) )
                    // InternalCPL.g:4984:5: (lv_name_1_0= ruleUnaryOperatorName )
                    {
                    // InternalCPL.g:4984:5: (lv_name_1_0= ruleUnaryOperatorName )
                    // InternalCPL.g:4985:6: lv_name_1_0= ruleUnaryOperatorName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrefixedLetExpCSAccess().getNameUnaryOperatorNameParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_55);
                    lv_name_1_0=ruleUnaryOperatorName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrefixedLetExpCSRule());
                      						}
                      						set(
                      							current,
                      							"name",
                      							lv_name_1_0,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.UnaryOperatorName");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalCPL.g:5002:4: ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) )
                    // InternalCPL.g:5003:5: (lv_ownedRight_2_0= rulePrefixedLetExpCS )
                    {
                    // InternalCPL.g:5003:5: (lv_ownedRight_2_0= rulePrefixedLetExpCS )
                    // InternalCPL.g:5004:6: lv_ownedRight_2_0= rulePrefixedLetExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrefixedLetExpCSAccess().getOwnedRightPrefixedLetExpCSParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_ownedRight_2_0=rulePrefixedLetExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrefixedLetExpCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedRight",
                      							lv_ownedRight_2_0,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.PrefixedLetExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCPL.g:5023:3: this_LetExpCS_3= ruleLetExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrefixedLetExpCSAccess().getLetExpCSParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_LetExpCS_3=ruleLetExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LetExpCS_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrefixedLetExpCS"


    // $ANTLR start "entryRulePrefixedPrimaryExpCS"
    // InternalCPL.g:5038:1: entryRulePrefixedPrimaryExpCS returns [EObject current=null] : iv_rulePrefixedPrimaryExpCS= rulePrefixedPrimaryExpCS EOF ;
    public final EObject entryRulePrefixedPrimaryExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixedPrimaryExpCS = null;


        try {
            // InternalCPL.g:5038:61: (iv_rulePrefixedPrimaryExpCS= rulePrefixedPrimaryExpCS EOF )
            // InternalCPL.g:5039:2: iv_rulePrefixedPrimaryExpCS= rulePrefixedPrimaryExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrefixedPrimaryExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePrefixedPrimaryExpCS=rulePrefixedPrimaryExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrefixedPrimaryExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrefixedPrimaryExpCS"


    // $ANTLR start "rulePrefixedPrimaryExpCS"
    // InternalCPL.g:5045:1: rulePrefixedPrimaryExpCS returns [EObject current=null] : ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) ) | this_PrimaryExpCS_3= rulePrimaryExpCS ) ;
    public final EObject rulePrefixedPrimaryExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_ownedRight_2_0 = null;

        EObject this_PrimaryExpCS_3 = null;



        	enterRule();

        try {
            // InternalCPL.g:5051:2: ( ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) ) | this_PrimaryExpCS_3= rulePrimaryExpCS ) )
            // InternalCPL.g:5052:2: ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) ) | this_PrimaryExpCS_3= rulePrimaryExpCS )
            {
            // InternalCPL.g:5052:2: ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) ) | this_PrimaryExpCS_3= rulePrimaryExpCS )
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( ((LA99_0>=73 && LA99_0<=75)) ) {
                alt99=1;
            }
            else if ( ((LA99_0>=RULE_SIMPLE_ID && LA99_0<=RULE_SINGLE_QUOTED_STRING)||LA99_0==22||LA99_0==44||(LA99_0>=53 && LA99_0<=54)||(LA99_0>=63 && LA99_0<=72)||LA99_0==76||(LA99_0>=88 && LA99_0<=89)||(LA99_0>=91 && LA99_0<=95)||LA99_0==98||(LA99_0>=100 && LA99_0<=103)||LA99_0==110||LA99_0==116) ) {
                alt99=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }
            switch (alt99) {
                case 1 :
                    // InternalCPL.g:5053:3: ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) )
                    {
                    // InternalCPL.g:5053:3: ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) )
                    // InternalCPL.g:5054:4: () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) )
                    {
                    // InternalCPL.g:5054:4: ()
                    // InternalCPL.g:5055:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrefixedPrimaryExpCSAccess().getPrefixExpCSAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalCPL.g:5064:4: ( (lv_name_1_0= ruleUnaryOperatorName ) )
                    // InternalCPL.g:5065:5: (lv_name_1_0= ruleUnaryOperatorName )
                    {
                    // InternalCPL.g:5065:5: (lv_name_1_0= ruleUnaryOperatorName )
                    // InternalCPL.g:5066:6: lv_name_1_0= ruleUnaryOperatorName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrefixedPrimaryExpCSAccess().getNameUnaryOperatorNameParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_64);
                    lv_name_1_0=ruleUnaryOperatorName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrefixedPrimaryExpCSRule());
                      						}
                      						set(
                      							current,
                      							"name",
                      							lv_name_1_0,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.UnaryOperatorName");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalCPL.g:5083:4: ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) )
                    // InternalCPL.g:5084:5: (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS )
                    {
                    // InternalCPL.g:5084:5: (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS )
                    // InternalCPL.g:5085:6: lv_ownedRight_2_0= rulePrefixedPrimaryExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrefixedPrimaryExpCSAccess().getOwnedRightPrefixedPrimaryExpCSParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_ownedRight_2_0=rulePrefixedPrimaryExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrefixedPrimaryExpCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedRight",
                      							lv_ownedRight_2_0,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.PrefixedPrimaryExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCPL.g:5104:3: this_PrimaryExpCS_3= rulePrimaryExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrefixedPrimaryExpCSAccess().getPrimaryExpCSParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_PrimaryExpCS_3=rulePrimaryExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PrimaryExpCS_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrefixedPrimaryExpCS"


    // $ANTLR start "entryRulePrimaryExpCS"
    // InternalCPL.g:5119:1: entryRulePrimaryExpCS returns [EObject current=null] : iv_rulePrimaryExpCS= rulePrimaryExpCS EOF ;
    public final EObject entryRulePrimaryExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpCS = null;


        try {
            // InternalCPL.g:5119:53: (iv_rulePrimaryExpCS= rulePrimaryExpCS EOF )
            // InternalCPL.g:5120:2: iv_rulePrimaryExpCS= rulePrimaryExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePrimaryExpCS=rulePrimaryExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExpCS"


    // $ANTLR start "rulePrimaryExpCS"
    // InternalCPL.g:5126:1: rulePrimaryExpCS returns [EObject current=null] : (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_SelfExpCS_2= ruleSelfExpCS | this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS | this_MapLiteralExpCS_5= ruleMapLiteralExpCS | this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS | this_LambdaLiteralExpCS_7= ruleLambdaLiteralExpCS | this_TypeLiteralExpCS_8= ruleTypeLiteralExpCS | this_NameExpCS_9= ruleNameExpCS ) ;
    public final EObject rulePrimaryExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_NestedExpCS_0 = null;

        EObject this_IfExpCS_1 = null;

        EObject this_SelfExpCS_2 = null;

        EObject this_PrimitiveLiteralExpCS_3 = null;

        EObject this_TupleLiteralExpCS_4 = null;

        EObject this_MapLiteralExpCS_5 = null;

        EObject this_CollectionLiteralExpCS_6 = null;

        EObject this_LambdaLiteralExpCS_7 = null;

        EObject this_TypeLiteralExpCS_8 = null;

        EObject this_NameExpCS_9 = null;



        	enterRule();

        try {
            // InternalCPL.g:5132:2: ( (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_SelfExpCS_2= ruleSelfExpCS | this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS | this_MapLiteralExpCS_5= ruleMapLiteralExpCS | this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS | this_LambdaLiteralExpCS_7= ruleLambdaLiteralExpCS | this_TypeLiteralExpCS_8= ruleTypeLiteralExpCS | this_NameExpCS_9= ruleNameExpCS ) )
            // InternalCPL.g:5133:2: (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_SelfExpCS_2= ruleSelfExpCS | this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS | this_MapLiteralExpCS_5= ruleMapLiteralExpCS | this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS | this_LambdaLiteralExpCS_7= ruleLambdaLiteralExpCS | this_TypeLiteralExpCS_8= ruleTypeLiteralExpCS | this_NameExpCS_9= ruleNameExpCS )
            {
            // InternalCPL.g:5133:2: (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_SelfExpCS_2= ruleSelfExpCS | this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS | this_MapLiteralExpCS_5= ruleMapLiteralExpCS | this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS | this_LambdaLiteralExpCS_7= ruleLambdaLiteralExpCS | this_TypeLiteralExpCS_8= ruleTypeLiteralExpCS | this_NameExpCS_9= ruleNameExpCS )
            int alt100=10;
            alt100 = dfa100.predict(input);
            switch (alt100) {
                case 1 :
                    // InternalCPL.g:5134:3: this_NestedExpCS_0= ruleNestedExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getNestedExpCSParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NestedExpCS_0=ruleNestedExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NestedExpCS_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCPL.g:5146:3: this_IfExpCS_1= ruleIfExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getIfExpCSParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_IfExpCS_1=ruleIfExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IfExpCS_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalCPL.g:5158:3: this_SelfExpCS_2= ruleSelfExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getSelfExpCSParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_SelfExpCS_2=ruleSelfExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SelfExpCS_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalCPL.g:5170:3: this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getPrimitiveLiteralExpCSParserRuleCall_3());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_PrimitiveLiteralExpCS_3=rulePrimitiveLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PrimitiveLiteralExpCS_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalCPL.g:5182:3: this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getTupleLiteralExpCSParserRuleCall_4());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TupleLiteralExpCS_4=ruleTupleLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TupleLiteralExpCS_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalCPL.g:5194:3: this_MapLiteralExpCS_5= ruleMapLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getMapLiteralExpCSParserRuleCall_5());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_MapLiteralExpCS_5=ruleMapLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MapLiteralExpCS_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalCPL.g:5206:3: this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getCollectionLiteralExpCSParserRuleCall_6());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_CollectionLiteralExpCS_6=ruleCollectionLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CollectionLiteralExpCS_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalCPL.g:5218:3: this_LambdaLiteralExpCS_7= ruleLambdaLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getLambdaLiteralExpCSParserRuleCall_7());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_LambdaLiteralExpCS_7=ruleLambdaLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LambdaLiteralExpCS_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalCPL.g:5230:3: this_TypeLiteralExpCS_8= ruleTypeLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getTypeLiteralExpCSParserRuleCall_8());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TypeLiteralExpCS_8=ruleTypeLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TypeLiteralExpCS_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalCPL.g:5242:3: this_NameExpCS_9= ruleNameExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getNameExpCSParserRuleCall_9());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NameExpCS_9=ruleNameExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NameExpCS_9;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExpCS"


    // $ANTLR start "entryRuleNameExpCS"
    // InternalCPL.g:5257:1: entryRuleNameExpCS returns [EObject current=null] : iv_ruleNameExpCS= ruleNameExpCS EOF ;
    public final EObject entryRuleNameExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameExpCS = null;


        try {
            // InternalCPL.g:5257:50: (iv_ruleNameExpCS= ruleNameExpCS EOF )
            // InternalCPL.g:5258:2: iv_ruleNameExpCS= ruleNameExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNameExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNameExpCS=ruleNameExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNameExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNameExpCS"


    // $ANTLR start "ruleNameExpCS"
    // InternalCPL.g:5264:1: ruleNameExpCS returns [EObject current=null] : ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )* ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )? ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )? ( ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre' )? ) ;
    public final EObject ruleNameExpCS() throws RecognitionException {
        EObject current = null;

        Token lv_isPre_4_0=null;
        Token otherlv_5=null;
        EObject lv_ownedPathName_0_0 = null;

        EObject lv_ownedSquareBracketedClauses_1_0 = null;

        EObject lv_ownedRoundBracketedClause_2_0 = null;

        EObject lv_ownedCurlyBracketedClause_3_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:5270:2: ( ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )* ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )? ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )? ( ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre' )? ) )
            // InternalCPL.g:5271:2: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )* ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )? ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )? ( ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre' )? )
            {
            // InternalCPL.g:5271:2: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )* ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )? ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )? ( ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre' )? )
            // InternalCPL.g:5272:3: ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )* ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )? ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )? ( ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre' )?
            {
            // InternalCPL.g:5272:3: ( (lv_ownedPathName_0_0= rulePathNameCS ) )
            // InternalCPL.g:5273:4: (lv_ownedPathName_0_0= rulePathNameCS )
            {
            // InternalCPL.g:5273:4: (lv_ownedPathName_0_0= rulePathNameCS )
            // InternalCPL.g:5274:5: lv_ownedPathName_0_0= rulePathNameCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNameExpCSAccess().getOwnedPathNamePathNameCSParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_65);
            lv_ownedPathName_0_0=rulePathNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNameExpCSRule());
              					}
              					set(
              						current,
              						"ownedPathName",
              						lv_ownedPathName_0_0,
              						"org.eclipse.ocl.xtext.base.Base.PathNameCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCPL.g:5291:3: ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )*
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( (LA101_0==105) ) {
                    alt101=1;
                }


                switch (alt101) {
            	case 1 :
            	    // InternalCPL.g:5292:4: (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS )
            	    {
            	    // InternalCPL.g:5292:4: (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS )
            	    // InternalCPL.g:5293:5: lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getNameExpCSAccess().getOwnedSquareBracketedClausesSquareBracketedClauseCSParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_65);
            	    lv_ownedSquareBracketedClauses_1_0=ruleSquareBracketedClauseCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getNameExpCSRule());
            	      					}
            	      					add(
            	      						current,
            	      						"ownedSquareBracketedClauses",
            	      						lv_ownedSquareBracketedClauses_1_0,
            	      						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.SquareBracketedClauseCS");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop101;
                }
            } while (true);

            // InternalCPL.g:5310:3: ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==44) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalCPL.g:5311:4: (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS )
                    {
                    // InternalCPL.g:5311:4: (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS )
                    // InternalCPL.g:5312:5: lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getNameExpCSAccess().getOwnedRoundBracketedClauseRoundBracketedClauseCSParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_66);
                    lv_ownedRoundBracketedClause_2_0=ruleRoundBracketedClauseCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getNameExpCSRule());
                      					}
                      					set(
                      						current,
                      						"ownedRoundBracketedClause",
                      						lv_ownedRoundBracketedClause_2_0,
                      						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.RoundBracketedClauseCS");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCPL.g:5329:3: ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==19) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // InternalCPL.g:5330:4: (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS )
                    {
                    // InternalCPL.g:5330:4: (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS )
                    // InternalCPL.g:5331:5: lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getNameExpCSAccess().getOwnedCurlyBracketedClauseCurlyBracketedClauseCSParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_67);
                    lv_ownedCurlyBracketedClause_3_0=ruleCurlyBracketedClauseCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getNameExpCSRule());
                      					}
                      					set(
                      						current,
                      						"ownedCurlyBracketedClause",
                      						lv_ownedCurlyBracketedClause_3_0,
                      						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.CurlyBracketedClauseCS");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCPL.g:5348:3: ( ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre' )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==104) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // InternalCPL.g:5349:4: ( (lv_isPre_4_0= '@' ) ) otherlv_5= 'pre'
                    {
                    // InternalCPL.g:5349:4: ( (lv_isPre_4_0= '@' ) )
                    // InternalCPL.g:5350:5: (lv_isPre_4_0= '@' )
                    {
                    // InternalCPL.g:5350:5: (lv_isPre_4_0= '@' )
                    // InternalCPL.g:5351:6: lv_isPre_4_0= '@'
                    {
                    lv_isPre_4_0=(Token)match(input,104,FollowSets000.FOLLOW_68); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_isPre_4_0, grammarAccess.getNameExpCSAccess().getIsPreCommercialAtKeyword_4_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getNameExpCSRule());
                      						}
                      						setWithLastConsumed(current, "isPre", true, "@");
                      					
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,55,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getNameExpCSAccess().getPreKeyword_4_1());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNameExpCS"


    // $ANTLR start "entryRuleCurlyBracketedClauseCS"
    // InternalCPL.g:5372:1: entryRuleCurlyBracketedClauseCS returns [EObject current=null] : iv_ruleCurlyBracketedClauseCS= ruleCurlyBracketedClauseCS EOF ;
    public final EObject entryRuleCurlyBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCurlyBracketedClauseCS = null;


        try {
            // InternalCPL.g:5372:63: (iv_ruleCurlyBracketedClauseCS= ruleCurlyBracketedClauseCS EOF )
            // InternalCPL.g:5373:2: iv_ruleCurlyBracketedClauseCS= ruleCurlyBracketedClauseCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCurlyBracketedClauseCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCurlyBracketedClauseCS=ruleCurlyBracketedClauseCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCurlyBracketedClauseCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCurlyBracketedClauseCS"


    // $ANTLR start "ruleCurlyBracketedClauseCS"
    // InternalCPL.g:5379:1: ruleCurlyBracketedClauseCS returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleCurlyBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedParts_2_0 = null;

        EObject lv_ownedParts_4_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:5385:2: ( ( () otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? otherlv_5= '}' ) )
            // InternalCPL.g:5386:2: ( () otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? otherlv_5= '}' )
            {
            // InternalCPL.g:5386:2: ( () otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? otherlv_5= '}' )
            // InternalCPL.g:5387:3: () otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? otherlv_5= '}'
            {
            // InternalCPL.g:5387:3: ()
            // InternalCPL.g:5388:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getCurlyBracketedClauseCSAccess().getCurlyBracketedClauseCSAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_69); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCurlyBracketedClauseCSAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalCPL.g:5401:3: ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( ((LA106_0>=RULE_SIMPLE_ID && LA106_0<=RULE_ESCAPED_ID)||LA106_0==RULE_SINGLE_QUOTED_STRING||LA106_0==22||(LA106_0>=53 && LA106_0<=54)) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // InternalCPL.g:5402:4: ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )*
                    {
                    // InternalCPL.g:5402:4: ( (lv_ownedParts_2_0= ruleShadowPartCS ) )
                    // InternalCPL.g:5403:5: (lv_ownedParts_2_0= ruleShadowPartCS )
                    {
                    // InternalCPL.g:5403:5: (lv_ownedParts_2_0= ruleShadowPartCS )
                    // InternalCPL.g:5404:6: lv_ownedParts_2_0= ruleShadowPartCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCurlyBracketedClauseCSAccess().getOwnedPartsShadowPartCSParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_52);
                    lv_ownedParts_2_0=ruleShadowPartCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCurlyBracketedClauseCSRule());
                      						}
                      						add(
                      							current,
                      							"ownedParts",
                      							lv_ownedParts_2_0,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ShadowPartCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalCPL.g:5421:4: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )*
                    loop105:
                    do {
                        int alt105=2;
                        int LA105_0 = input.LA(1);

                        if ( (LA105_0==52) ) {
                            alt105=1;
                        }


                        switch (alt105) {
                    	case 1 :
                    	    // InternalCPL.g:5422:5: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) )
                    	    {
                    	    otherlv_3=(Token)match(input,52,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getCurlyBracketedClauseCSAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalCPL.g:5426:5: ( (lv_ownedParts_4_0= ruleShadowPartCS ) )
                    	    // InternalCPL.g:5427:6: (lv_ownedParts_4_0= ruleShadowPartCS )
                    	    {
                    	    // InternalCPL.g:5427:6: (lv_ownedParts_4_0= ruleShadowPartCS )
                    	    // InternalCPL.g:5428:7: lv_ownedParts_4_0= ruleShadowPartCS
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getCurlyBracketedClauseCSAccess().getOwnedPartsShadowPartCSParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_52);
                    	    lv_ownedParts_4_0=ruleShadowPartCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getCurlyBracketedClauseCSRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"ownedParts",
                    	      								lv_ownedParts_4_0,
                    	      								"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ShadowPartCS");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop105;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getCurlyBracketedClauseCSAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCurlyBracketedClauseCS"


    // $ANTLR start "entryRuleRoundBracketedClauseCS"
    // InternalCPL.g:5455:1: entryRuleRoundBracketedClauseCS returns [EObject current=null] : iv_ruleRoundBracketedClauseCS= ruleRoundBracketedClauseCS EOF ;
    public final EObject entryRuleRoundBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoundBracketedClauseCS = null;


        try {
            // InternalCPL.g:5455:63: (iv_ruleRoundBracketedClauseCS= ruleRoundBracketedClauseCS EOF )
            // InternalCPL.g:5456:2: iv_ruleRoundBracketedClauseCS= ruleRoundBracketedClauseCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRoundBracketedClauseCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRoundBracketedClauseCS=ruleRoundBracketedClauseCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRoundBracketedClauseCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoundBracketedClauseCS"


    // $ANTLR start "ruleRoundBracketedClauseCS"
    // InternalCPL.g:5462:1: ruleRoundBracketedClauseCS returns [EObject current=null] : ( () otherlv_1= '(' ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) ) )* )? otherlv_4= ')' ) ;
    public final EObject ruleRoundBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_ownedArguments_2_0 = null;

        EObject lv_ownedArguments_3_1 = null;

        EObject lv_ownedArguments_3_2 = null;

        EObject lv_ownedArguments_3_3 = null;



        	enterRule();

        try {
            // InternalCPL.g:5468:2: ( ( () otherlv_1= '(' ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) ) )* )? otherlv_4= ')' ) )
            // InternalCPL.g:5469:2: ( () otherlv_1= '(' ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) ) )* )? otherlv_4= ')' )
            {
            // InternalCPL.g:5469:2: ( () otherlv_1= '(' ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) ) )* )? otherlv_4= ')' )
            // InternalCPL.g:5470:3: () otherlv_1= '(' ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) ) )* )? otherlv_4= ')'
            {
            // InternalCPL.g:5470:3: ()
            // InternalCPL.g:5471:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRoundBracketedClauseCSAccess().getRoundBracketedClauseCSAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,44,FollowSets000.FOLLOW_70); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRoundBracketedClauseCSAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalCPL.g:5484:3: ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) ) )* )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( ((LA109_0>=RULE_SIMPLE_ID && LA109_0<=RULE_SINGLE_QUOTED_STRING)||LA109_0==22||LA109_0==24||LA109_0==44||(LA109_0>=53 && LA109_0<=54)||(LA109_0>=62 && LA109_0<=76)||(LA109_0>=88 && LA109_0<=89)||(LA109_0>=91 && LA109_0<=95)||LA109_0==98||(LA109_0>=100 && LA109_0<=103)||LA109_0==110||(LA109_0>=115 && LA109_0<=116)) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // InternalCPL.g:5485:4: ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) ) )*
                    {
                    // InternalCPL.g:5485:4: ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) )
                    // InternalCPL.g:5486:5: (lv_ownedArguments_2_0= ruleNavigatingArgCS )
                    {
                    // InternalCPL.g:5486:5: (lv_ownedArguments_2_0= ruleNavigatingArgCS )
                    // InternalCPL.g:5487:6: lv_ownedArguments_2_0= ruleNavigatingArgCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRoundBracketedClauseCSAccess().getOwnedArgumentsNavigatingArgCSParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_71);
                    lv_ownedArguments_2_0=ruleNavigatingArgCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRoundBracketedClauseCSRule());
                      						}
                      						add(
                      							current,
                      							"ownedArguments",
                      							lv_ownedArguments_2_0,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.NavigatingArgCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalCPL.g:5504:4: ( ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) ) )*
                    loop108:
                    do {
                        int alt108=2;
                        int LA108_0 = input.LA(1);

                        if ( (LA108_0==52||(LA108_0>=108 && LA108_0<=109)) ) {
                            alt108=1;
                        }


                        switch (alt108) {
                    	case 1 :
                    	    // InternalCPL.g:5505:5: ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) )
                    	    {
                    	    // InternalCPL.g:5505:5: ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) )
                    	    // InternalCPL.g:5506:6: (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS )
                    	    {
                    	    // InternalCPL.g:5506:6: (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS )
                    	    int alt107=3;
                    	    switch ( input.LA(1) ) {
                    	    case 52:
                    	        {
                    	        alt107=1;
                    	        }
                    	        break;
                    	    case 109:
                    	        {
                    	        alt107=2;
                    	        }
                    	        break;
                    	    case 108:
                    	        {
                    	        alt107=3;
                    	        }
                    	        break;
                    	    default:
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 107, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt107) {
                    	        case 1 :
                    	            // InternalCPL.g:5507:7: lv_ownedArguments_3_1= ruleNavigatingCommaArgCS
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              							newCompositeNode(grammarAccess.getRoundBracketedClauseCSAccess().getOwnedArgumentsNavigatingCommaArgCSParserRuleCall_2_1_0_0());
                    	              						
                    	            }
                    	            pushFollow(FollowSets000.FOLLOW_71);
                    	            lv_ownedArguments_3_1=ruleNavigatingCommaArgCS();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              							if (current==null) {
                    	              								current = createModelElementForParent(grammarAccess.getRoundBracketedClauseCSRule());
                    	              							}
                    	              							add(
                    	              								current,
                    	              								"ownedArguments",
                    	              								lv_ownedArguments_3_1,
                    	              								"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.NavigatingCommaArgCS");
                    	              							afterParserOrEnumRuleCall();
                    	              						
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalCPL.g:5523:7: lv_ownedArguments_3_2= ruleNavigatingSemiArgCS
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              							newCompositeNode(grammarAccess.getRoundBracketedClauseCSAccess().getOwnedArgumentsNavigatingSemiArgCSParserRuleCall_2_1_0_1());
                    	              						
                    	            }
                    	            pushFollow(FollowSets000.FOLLOW_71);
                    	            lv_ownedArguments_3_2=ruleNavigatingSemiArgCS();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              							if (current==null) {
                    	              								current = createModelElementForParent(grammarAccess.getRoundBracketedClauseCSRule());
                    	              							}
                    	              							add(
                    	              								current,
                    	              								"ownedArguments",
                    	              								lv_ownedArguments_3_2,
                    	              								"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.NavigatingSemiArgCS");
                    	              							afterParserOrEnumRuleCall();
                    	              						
                    	            }

                    	            }
                    	            break;
                    	        case 3 :
                    	            // InternalCPL.g:5539:7: lv_ownedArguments_3_3= ruleNavigatingBarArgCS
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              							newCompositeNode(grammarAccess.getRoundBracketedClauseCSAccess().getOwnedArgumentsNavigatingBarArgCSParserRuleCall_2_1_0_2());
                    	              						
                    	            }
                    	            pushFollow(FollowSets000.FOLLOW_71);
                    	            lv_ownedArguments_3_3=ruleNavigatingBarArgCS();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              							if (current==null) {
                    	              								current = createModelElementForParent(grammarAccess.getRoundBracketedClauseCSRule());
                    	              							}
                    	              							add(
                    	              								current,
                    	              								"ownedArguments",
                    	              								lv_ownedArguments_3_3,
                    	              								"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.NavigatingBarArgCS");
                    	              							afterParserOrEnumRuleCall();
                    	              						
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop108;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getRoundBracketedClauseCSAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoundBracketedClauseCS"


    // $ANTLR start "entryRuleSquareBracketedClauseCS"
    // InternalCPL.g:5566:1: entryRuleSquareBracketedClauseCS returns [EObject current=null] : iv_ruleSquareBracketedClauseCS= ruleSquareBracketedClauseCS EOF ;
    public final EObject entryRuleSquareBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSquareBracketedClauseCS = null;


        try {
            // InternalCPL.g:5566:64: (iv_ruleSquareBracketedClauseCS= ruleSquareBracketedClauseCS EOF )
            // InternalCPL.g:5567:2: iv_ruleSquareBracketedClauseCS= ruleSquareBracketedClauseCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSquareBracketedClauseCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSquareBracketedClauseCS=ruleSquareBracketedClauseCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSquareBracketedClauseCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSquareBracketedClauseCS"


    // $ANTLR start "ruleSquareBracketedClauseCS"
    // InternalCPL.g:5573:1: ruleSquareBracketedClauseCS returns [EObject current=null] : (otherlv_0= '[' ( (lv_ownedTerms_1_0= ruleExpCS ) ) (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleSquareBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedTerms_1_0 = null;

        EObject lv_ownedTerms_3_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:5579:2: ( (otherlv_0= '[' ( (lv_ownedTerms_1_0= ruleExpCS ) ) (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )* otherlv_4= ']' ) )
            // InternalCPL.g:5580:2: (otherlv_0= '[' ( (lv_ownedTerms_1_0= ruleExpCS ) ) (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )* otherlv_4= ']' )
            {
            // InternalCPL.g:5580:2: (otherlv_0= '[' ( (lv_ownedTerms_1_0= ruleExpCS ) ) (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )* otherlv_4= ']' )
            // InternalCPL.g:5581:3: otherlv_0= '[' ( (lv_ownedTerms_1_0= ruleExpCS ) ) (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,105,FollowSets000.FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSquareBracketedClauseCSAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalCPL.g:5585:3: ( (lv_ownedTerms_1_0= ruleExpCS ) )
            // InternalCPL.g:5586:4: (lv_ownedTerms_1_0= ruleExpCS )
            {
            // InternalCPL.g:5586:4: (lv_ownedTerms_1_0= ruleExpCS )
            // InternalCPL.g:5587:5: lv_ownedTerms_1_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSquareBracketedClauseCSAccess().getOwnedTermsExpCSParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_72);
            lv_ownedTerms_1_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSquareBracketedClauseCSRule());
              					}
              					add(
              						current,
              						"ownedTerms",
              						lv_ownedTerms_1_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCPL.g:5604:3: (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )*
            loop110:
            do {
                int alt110=2;
                int LA110_0 = input.LA(1);

                if ( (LA110_0==52) ) {
                    alt110=1;
                }


                switch (alt110) {
            	case 1 :
            	    // InternalCPL.g:5605:4: otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) )
            	    {
            	    otherlv_2=(Token)match(input,52,FollowSets000.FOLLOW_55); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getSquareBracketedClauseCSAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalCPL.g:5609:4: ( (lv_ownedTerms_3_0= ruleExpCS ) )
            	    // InternalCPL.g:5610:5: (lv_ownedTerms_3_0= ruleExpCS )
            	    {
            	    // InternalCPL.g:5610:5: (lv_ownedTerms_3_0= ruleExpCS )
            	    // InternalCPL.g:5611:6: lv_ownedTerms_3_0= ruleExpCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSquareBracketedClauseCSAccess().getOwnedTermsExpCSParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_72);
            	    lv_ownedTerms_3_0=ruleExpCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSquareBracketedClauseCSRule());
            	      						}
            	      						add(
            	      							current,
            	      							"ownedTerms",
            	      							lv_ownedTerms_3_0,
            	      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop110;
                }
            } while (true);

            otherlv_4=(Token)match(input,106,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getSquareBracketedClauseCSAccess().getRightSquareBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSquareBracketedClauseCS"


    // $ANTLR start "entryRuleNavigatingArgCS"
    // InternalCPL.g:5637:1: entryRuleNavigatingArgCS returns [EObject current=null] : iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF ;
    public final EObject entryRuleNavigatingArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingArgCS = null;


        try {
            // InternalCPL.g:5637:56: (iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF )
            // InternalCPL.g:5638:2: iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingArgCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNavigatingArgCS=ruleNavigatingArgCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingArgCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNavigatingArgCS"


    // $ANTLR start "ruleNavigatingArgCS"
    // InternalCPL.g:5644:1: ruleNavigatingArgCS returns [EObject current=null] : ( ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )? ) | (otherlv_17= ':' ( (lv_ownedType_18_0= ruleTypeExpCS ) ) ) ) ;
    public final EObject ruleNavigatingArgCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        EObject lv_ownedNameExpression_0_0 = null;

        EObject lv_ownedCoIterator_2_0 = null;

        EObject lv_ownedInitExpression_4_0 = null;

        EObject lv_ownedType_6_0 = null;

        EObject lv_ownedCoIterator_8_0 = null;

        EObject lv_ownedInitExpression_10_0 = null;

        EObject lv_ownedType_12_0 = null;

        EObject lv_ownedCoIterator_14_0 = null;

        EObject lv_ownedInitExpression_16_0 = null;

        EObject lv_ownedType_18_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:5650:2: ( ( ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )? ) | (otherlv_17= ':' ( (lv_ownedType_18_0= ruleTypeExpCS ) ) ) ) )
            // InternalCPL.g:5651:2: ( ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )? ) | (otherlv_17= ':' ( (lv_ownedType_18_0= ruleTypeExpCS ) ) ) )
            {
            // InternalCPL.g:5651:2: ( ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )? ) | (otherlv_17= ':' ( (lv_ownedType_18_0= ruleTypeExpCS ) ) ) )
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( ((LA117_0>=RULE_SIMPLE_ID && LA117_0<=RULE_SINGLE_QUOTED_STRING)||LA117_0==22||LA117_0==44||(LA117_0>=53 && LA117_0<=54)||(LA117_0>=62 && LA117_0<=76)||(LA117_0>=88 && LA117_0<=89)||(LA117_0>=91 && LA117_0<=95)||LA117_0==98||(LA117_0>=100 && LA117_0<=103)||LA117_0==110||(LA117_0>=115 && LA117_0<=116)) ) {
                alt117=1;
            }
            else if ( (LA117_0==24) ) {
                alt117=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 117, 0, input);

                throw nvae;
            }
            switch (alt117) {
                case 1 :
                    // InternalCPL.g:5652:3: ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )? )
                    {
                    // InternalCPL.g:5652:3: ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )? )
                    // InternalCPL.g:5653:4: ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( (otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )?
                    {
                    // InternalCPL.g:5653:4: ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) )
                    // InternalCPL.g:5654:5: (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS )
                    {
                    // InternalCPL.g:5654:5: (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS )
                    // InternalCPL.g:5655:6: lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedNameExpressionNavigatingArgExpCSParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_73);
                    lv_ownedNameExpression_0_0=ruleNavigatingArgExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedNameExpression",
                      							lv_ownedNameExpression_0_0,
                      							"org.eclipse.ocl.xtext.completeocl.CompleteOCL.NavigatingArgExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalCPL.g:5672:4: ( (otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )?
                    int alt116=4;
                    alt116 = dfa116.predict(input);
                    switch (alt116) {
                        case 1 :
                            // InternalCPL.g:5673:5: (otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? )
                            {
                            // InternalCPL.g:5673:5: (otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? )
                            // InternalCPL.g:5674:6: otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )?
                            {
                            otherlv_1=(Token)match(input,99,FollowSets000.FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_1, grammarAccess.getNavigatingArgCSAccess().getLessThanSignHyphenMinusKeyword_0_1_0_0());
                              					
                            }
                            // InternalCPL.g:5678:6: ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) )
                            // InternalCPL.g:5679:7: (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS )
                            {
                            // InternalCPL.g:5679:7: (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS )
                            // InternalCPL.g:5680:8: lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_0_1_0_1_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_74);
                            lv_ownedCoIterator_2_0=ruleCoIteratorVariableCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                              								}
                              								set(
                              									current,
                              									"ownedCoIterator",
                              									lv_ownedCoIterator_2_0,
                              									"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.CoIteratorVariableCS");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            // InternalCPL.g:5697:6: (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )?
                            int alt111=2;
                            int LA111_0 = input.LA(1);

                            if ( (LA111_0==35) ) {
                                alt111=1;
                            }
                            switch (alt111) {
                                case 1 :
                                    // InternalCPL.g:5698:7: otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) )
                                    {
                                    otherlv_3=(Token)match(input,35,FollowSets000.FOLLOW_55); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      							newLeafNode(otherlv_3, grammarAccess.getNavigatingArgCSAccess().getEqualsSignKeyword_0_1_0_2_0());
                                      						
                                    }
                                    // InternalCPL.g:5702:7: ( (lv_ownedInitExpression_4_0= ruleExpCS ) )
                                    // InternalCPL.g:5703:8: (lv_ownedInitExpression_4_0= ruleExpCS )
                                    {
                                    // InternalCPL.g:5703:8: (lv_ownedInitExpression_4_0= ruleExpCS )
                                    // InternalCPL.g:5704:9: lv_ownedInitExpression_4_0= ruleExpCS
                                    {
                                    if ( state.backtracking==0 ) {

                                      									newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_0_1_0_2_1_0());
                                      								
                                    }
                                    pushFollow(FollowSets000.FOLLOW_2);
                                    lv_ownedInitExpression_4_0=ruleExpCS();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									if (current==null) {
                                      										current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                                      									}
                                      									set(
                                      										current,
                                      										"ownedInitExpression",
                                      										lv_ownedInitExpression_4_0,
                                      										"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
                                      									afterParserOrEnumRuleCall();
                                      								
                                    }

                                    }


                                    }


                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalCPL.g:5724:5: (otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? )
                            {
                            // InternalCPL.g:5724:5: (otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? )
                            // InternalCPL.g:5725:6: otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )?
                            {
                            otherlv_5=(Token)match(input,24,FollowSets000.FOLLOW_38); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_5, grammarAccess.getNavigatingArgCSAccess().getColonKeyword_0_1_1_0());
                              					
                            }
                            // InternalCPL.g:5729:6: ( (lv_ownedType_6_0= ruleTypeExpCS ) )
                            // InternalCPL.g:5730:7: (lv_ownedType_6_0= ruleTypeExpCS )
                            {
                            // InternalCPL.g:5730:7: (lv_ownedType_6_0= ruleTypeExpCS )
                            // InternalCPL.g:5731:8: lv_ownedType_6_0= ruleTypeExpCS
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_0_1_1_1_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_75);
                            lv_ownedType_6_0=ruleTypeExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                              								}
                              								set(
                              									current,
                              									"ownedType",
                              									lv_ownedType_6_0,
                              									"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpCS");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            // InternalCPL.g:5748:6: (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )?
                            int alt112=2;
                            int LA112_0 = input.LA(1);

                            if ( (LA112_0==99) ) {
                                alt112=1;
                            }
                            switch (alt112) {
                                case 1 :
                                    // InternalCPL.g:5749:7: otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) )
                                    {
                                    otherlv_7=(Token)match(input,99,FollowSets000.FOLLOW_7); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      							newLeafNode(otherlv_7, grammarAccess.getNavigatingArgCSAccess().getLessThanSignHyphenMinusKeyword_0_1_1_2_0());
                                      						
                                    }
                                    // InternalCPL.g:5753:7: ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) )
                                    // InternalCPL.g:5754:8: (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS )
                                    {
                                    // InternalCPL.g:5754:8: (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS )
                                    // InternalCPL.g:5755:9: lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS
                                    {
                                    if ( state.backtracking==0 ) {

                                      									newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_0_1_1_2_1_0());
                                      								
                                    }
                                    pushFollow(FollowSets000.FOLLOW_74);
                                    lv_ownedCoIterator_8_0=ruleCoIteratorVariableCS();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									if (current==null) {
                                      										current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                                      									}
                                      									set(
                                      										current,
                                      										"ownedCoIterator",
                                      										lv_ownedCoIterator_8_0,
                                      										"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.CoIteratorVariableCS");
                                      									afterParserOrEnumRuleCall();
                                      								
                                    }

                                    }


                                    }


                                    }
                                    break;

                            }

                            // InternalCPL.g:5773:6: (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )?
                            int alt113=2;
                            int LA113_0 = input.LA(1);

                            if ( (LA113_0==35) ) {
                                alt113=1;
                            }
                            switch (alt113) {
                                case 1 :
                                    // InternalCPL.g:5774:7: otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) )
                                    {
                                    otherlv_9=(Token)match(input,35,FollowSets000.FOLLOW_55); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      							newLeafNode(otherlv_9, grammarAccess.getNavigatingArgCSAccess().getEqualsSignKeyword_0_1_1_3_0());
                                      						
                                    }
                                    // InternalCPL.g:5778:7: ( (lv_ownedInitExpression_10_0= ruleExpCS ) )
                                    // InternalCPL.g:5779:8: (lv_ownedInitExpression_10_0= ruleExpCS )
                                    {
                                    // InternalCPL.g:5779:8: (lv_ownedInitExpression_10_0= ruleExpCS )
                                    // InternalCPL.g:5780:9: lv_ownedInitExpression_10_0= ruleExpCS
                                    {
                                    if ( state.backtracking==0 ) {

                                      									newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_0_1_1_3_1_0());
                                      								
                                    }
                                    pushFollow(FollowSets000.FOLLOW_2);
                                    lv_ownedInitExpression_10_0=ruleExpCS();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									if (current==null) {
                                      										current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                                      									}
                                      									set(
                                      										current,
                                      										"ownedInitExpression",
                                      										lv_ownedInitExpression_10_0,
                                      										"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
                                      									afterParserOrEnumRuleCall();
                                      								
                                    }

                                    }


                                    }


                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalCPL.g:5800:5: ( (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) )
                            {
                            // InternalCPL.g:5800:5: ( (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) )
                            // InternalCPL.g:5801:6: (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) )
                            {
                            // InternalCPL.g:5801:6: (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )?
                            int alt114=2;
                            int LA114_0 = input.LA(1);

                            if ( (LA114_0==24) ) {
                                alt114=1;
                            }
                            switch (alt114) {
                                case 1 :
                                    // InternalCPL.g:5802:7: otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) )
                                    {
                                    otherlv_11=(Token)match(input,24,FollowSets000.FOLLOW_38); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      							newLeafNode(otherlv_11, grammarAccess.getNavigatingArgCSAccess().getColonKeyword_0_1_2_0_0());
                                      						
                                    }
                                    // InternalCPL.g:5806:7: ( (lv_ownedType_12_0= ruleTypeExpCS ) )
                                    // InternalCPL.g:5807:8: (lv_ownedType_12_0= ruleTypeExpCS )
                                    {
                                    // InternalCPL.g:5807:8: (lv_ownedType_12_0= ruleTypeExpCS )
                                    // InternalCPL.g:5808:9: lv_ownedType_12_0= ruleTypeExpCS
                                    {
                                    if ( state.backtracking==0 ) {

                                      									newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_0_1_2_0_1_0());
                                      								
                                    }
                                    pushFollow(FollowSets000.FOLLOW_76);
                                    lv_ownedType_12_0=ruleTypeExpCS();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									if (current==null) {
                                      										current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                                      									}
                                      									set(
                                      										current,
                                      										"ownedType",
                                      										lv_ownedType_12_0,
                                      										"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpCS");
                                      									afterParserOrEnumRuleCall();
                                      								
                                    }

                                    }


                                    }


                                    }
                                    break;

                            }

                            // InternalCPL.g:5826:6: (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )?
                            int alt115=2;
                            int LA115_0 = input.LA(1);

                            if ( (LA115_0==99) ) {
                                alt115=1;
                            }
                            switch (alt115) {
                                case 1 :
                                    // InternalCPL.g:5827:7: otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) )
                                    {
                                    otherlv_13=(Token)match(input,99,FollowSets000.FOLLOW_7); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      							newLeafNode(otherlv_13, grammarAccess.getNavigatingArgCSAccess().getLessThanSignHyphenMinusKeyword_0_1_2_1_0());
                                      						
                                    }
                                    // InternalCPL.g:5831:7: ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) )
                                    // InternalCPL.g:5832:8: (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS )
                                    {
                                    // InternalCPL.g:5832:8: (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS )
                                    // InternalCPL.g:5833:9: lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS
                                    {
                                    if ( state.backtracking==0 ) {

                                      									newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_0_1_2_1_1_0());
                                      								
                                    }
                                    pushFollow(FollowSets000.FOLLOW_77);
                                    lv_ownedCoIterator_14_0=ruleCoIteratorVariableCS();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									if (current==null) {
                                      										current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                                      									}
                                      									set(
                                      										current,
                                      										"ownedCoIterator",
                                      										lv_ownedCoIterator_14_0,
                                      										"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.CoIteratorVariableCS");
                                      									afterParserOrEnumRuleCall();
                                      								
                                    }

                                    }


                                    }


                                    }
                                    break;

                            }

                            otherlv_15=(Token)match(input,107,FollowSets000.FOLLOW_55); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_15, grammarAccess.getNavigatingArgCSAccess().getInKeyword_0_1_2_2());
                              					
                            }
                            // InternalCPL.g:5855:6: ( (lv_ownedInitExpression_16_0= ruleExpCS ) )
                            // InternalCPL.g:5856:7: (lv_ownedInitExpression_16_0= ruleExpCS )
                            {
                            // InternalCPL.g:5856:7: (lv_ownedInitExpression_16_0= ruleExpCS )
                            // InternalCPL.g:5857:8: lv_ownedInitExpression_16_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_0_1_2_3_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_ownedInitExpression_16_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                              								}
                              								set(
                              									current,
                              									"ownedInitExpression",
                              									lv_ownedInitExpression_16_0,
                              									"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCPL.g:5878:3: (otherlv_17= ':' ( (lv_ownedType_18_0= ruleTypeExpCS ) ) )
                    {
                    // InternalCPL.g:5878:3: (otherlv_17= ':' ( (lv_ownedType_18_0= ruleTypeExpCS ) ) )
                    // InternalCPL.g:5879:4: otherlv_17= ':' ( (lv_ownedType_18_0= ruleTypeExpCS ) )
                    {
                    otherlv_17=(Token)match(input,24,FollowSets000.FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getNavigatingArgCSAccess().getColonKeyword_1_0());
                      			
                    }
                    // InternalCPL.g:5883:4: ( (lv_ownedType_18_0= ruleTypeExpCS ) )
                    // InternalCPL.g:5884:5: (lv_ownedType_18_0= ruleTypeExpCS )
                    {
                    // InternalCPL.g:5884:5: (lv_ownedType_18_0= ruleTypeExpCS )
                    // InternalCPL.g:5885:6: lv_ownedType_18_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_ownedType_18_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedType",
                      							lv_ownedType_18_0,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNavigatingArgCS"


    // $ANTLR start "entryRuleNavigatingBarArgCS"
    // InternalCPL.g:5907:1: entryRuleNavigatingBarArgCS returns [EObject current=null] : iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF ;
    public final EObject entryRuleNavigatingBarArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingBarArgCS = null;


        try {
            // InternalCPL.g:5907:59: (iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF )
            // InternalCPL.g:5908:2: iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingBarArgCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNavigatingBarArgCS=ruleNavigatingBarArgCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingBarArgCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNavigatingBarArgCS"


    // $ANTLR start "ruleNavigatingBarArgCS"
    // InternalCPL.g:5914:1: ruleNavigatingBarArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= '|' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? ) ;
    public final EObject ruleNavigatingBarArgCS() throws RecognitionException {
        EObject current = null;

        Token lv_prefix_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedNameExpression_1_0 = null;

        EObject lv_ownedType_3_0 = null;

        EObject lv_ownedInitExpression_5_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:5920:2: ( ( ( (lv_prefix_0_0= '|' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? ) )
            // InternalCPL.g:5921:2: ( ( (lv_prefix_0_0= '|' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? )
            {
            // InternalCPL.g:5921:2: ( ( (lv_prefix_0_0= '|' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? )
            // InternalCPL.g:5922:3: ( (lv_prefix_0_0= '|' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )?
            {
            // InternalCPL.g:5922:3: ( (lv_prefix_0_0= '|' ) )
            // InternalCPL.g:5923:4: (lv_prefix_0_0= '|' )
            {
            // InternalCPL.g:5923:4: (lv_prefix_0_0= '|' )
            // InternalCPL.g:5924:5: lv_prefix_0_0= '|'
            {
            lv_prefix_0_0=(Token)match(input,108,FollowSets000.FOLLOW_78); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_prefix_0_0, grammarAccess.getNavigatingBarArgCSAccess().getPrefixVerticalLineKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getNavigatingBarArgCSRule());
              					}
              					setWithLastConsumed(current, "prefix", lv_prefix_0_0, "|");
              				
            }

            }


            }

            // InternalCPL.g:5936:3: ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) )
            // InternalCPL.g:5937:4: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            {
            // InternalCPL.g:5937:4: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            // InternalCPL.g:5938:5: lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNavigatingBarArgCSAccess().getOwnedNameExpressionNavigatingArgExpCSParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_79);
            lv_ownedNameExpression_1_0=ruleNavigatingArgExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNavigatingBarArgCSRule());
              					}
              					set(
              						current,
              						"ownedNameExpression",
              						lv_ownedNameExpression_1_0,
              						"org.eclipse.ocl.xtext.completeocl.CompleteOCL.NavigatingArgExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCPL.g:5955:3: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==24) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // InternalCPL.g:5956:4: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    {
                    otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getNavigatingBarArgCSAccess().getColonKeyword_2_0());
                      			
                    }
                    // InternalCPL.g:5960:4: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // InternalCPL.g:5961:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // InternalCPL.g:5961:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    // InternalCPL.g:5962:6: lv_ownedType_3_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNavigatingBarArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_74);
                    lv_ownedType_3_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNavigatingBarArgCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedType",
                      							lv_ownedType_3_0,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalCPL.g:5979:4: (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    int alt118=2;
                    int LA118_0 = input.LA(1);

                    if ( (LA118_0==35) ) {
                        alt118=1;
                    }
                    switch (alt118) {
                        case 1 :
                            // InternalCPL.g:5980:5: otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            {
                            otherlv_4=(Token)match(input,35,FollowSets000.FOLLOW_55); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getNavigatingBarArgCSAccess().getEqualsSignKeyword_2_2_0());
                              				
                            }
                            // InternalCPL.g:5984:5: ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            // InternalCPL.g:5985:6: (lv_ownedInitExpression_5_0= ruleExpCS )
                            {
                            // InternalCPL.g:5985:6: (lv_ownedInitExpression_5_0= ruleExpCS )
                            // InternalCPL.g:5986:7: lv_ownedInitExpression_5_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getNavigatingBarArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_2_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_ownedInitExpression_5_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getNavigatingBarArgCSRule());
                              							}
                              							set(
                              								current,
                              								"ownedInitExpression",
                              								lv_ownedInitExpression_5_0,
                              								"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNavigatingBarArgCS"


    // $ANTLR start "entryRuleNavigatingCommaArgCS"
    // InternalCPL.g:6009:1: entryRuleNavigatingCommaArgCS returns [EObject current=null] : iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF ;
    public final EObject entryRuleNavigatingCommaArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingCommaArgCS = null;


        try {
            // InternalCPL.g:6009:61: (iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF )
            // InternalCPL.g:6010:2: iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingCommaArgCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNavigatingCommaArgCS=ruleNavigatingCommaArgCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingCommaArgCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNavigatingCommaArgCS"


    // $ANTLR start "ruleNavigatingCommaArgCS"
    // InternalCPL.g:6016:1: ruleNavigatingCommaArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= ',' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( (otherlv_2= '<-' ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | (otherlv_6= ':' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? ) | ( (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? otherlv_16= 'in' ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) ) )? ) ;
    public final EObject ruleNavigatingCommaArgCS() throws RecognitionException {
        EObject current = null;

        Token lv_prefix_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        EObject lv_ownedNameExpression_1_0 = null;

        EObject lv_ownedCoIterator_3_0 = null;

        EObject lv_ownedInitExpression_5_0 = null;

        EObject lv_ownedType_7_0 = null;

        EObject lv_ownedCoIterator_9_0 = null;

        EObject lv_ownedInitExpression_11_0 = null;

        EObject lv_ownedType_13_0 = null;

        EObject lv_ownedCoIterator_15_0 = null;

        EObject lv_ownedInitExpression_17_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:6022:2: ( ( ( (lv_prefix_0_0= ',' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( (otherlv_2= '<-' ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | (otherlv_6= ':' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? ) | ( (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? otherlv_16= 'in' ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) ) )? ) )
            // InternalCPL.g:6023:2: ( ( (lv_prefix_0_0= ',' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( (otherlv_2= '<-' ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | (otherlv_6= ':' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? ) | ( (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? otherlv_16= 'in' ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) ) )? )
            {
            // InternalCPL.g:6023:2: ( ( (lv_prefix_0_0= ',' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( (otherlv_2= '<-' ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | (otherlv_6= ':' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? ) | ( (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? otherlv_16= 'in' ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) ) )? )
            // InternalCPL.g:6024:3: ( (lv_prefix_0_0= ',' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( (otherlv_2= '<-' ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | (otherlv_6= ':' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? ) | ( (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? otherlv_16= 'in' ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) ) )?
            {
            // InternalCPL.g:6024:3: ( (lv_prefix_0_0= ',' ) )
            // InternalCPL.g:6025:4: (lv_prefix_0_0= ',' )
            {
            // InternalCPL.g:6025:4: (lv_prefix_0_0= ',' )
            // InternalCPL.g:6026:5: lv_prefix_0_0= ','
            {
            lv_prefix_0_0=(Token)match(input,52,FollowSets000.FOLLOW_78); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_prefix_0_0, grammarAccess.getNavigatingCommaArgCSAccess().getPrefixCommaKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getNavigatingCommaArgCSRule());
              					}
              					setWithLastConsumed(current, "prefix", lv_prefix_0_0, ",");
              				
            }

            }


            }

            // InternalCPL.g:6038:3: ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) )
            // InternalCPL.g:6039:4: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            {
            // InternalCPL.g:6039:4: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            // InternalCPL.g:6040:5: lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedNameExpressionNavigatingArgExpCSParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_73);
            lv_ownedNameExpression_1_0=ruleNavigatingArgExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
              					}
              					set(
              						current,
              						"ownedNameExpression",
              						lv_ownedNameExpression_1_0,
              						"org.eclipse.ocl.xtext.completeocl.CompleteOCL.NavigatingArgExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCPL.g:6057:3: ( (otherlv_2= '<-' ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | (otherlv_6= ':' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? ) | ( (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? otherlv_16= 'in' ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) ) )?
            int alt125=4;
            alt125 = dfa125.predict(input);
            switch (alt125) {
                case 1 :
                    // InternalCPL.g:6058:4: (otherlv_2= '<-' ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )
                    {
                    // InternalCPL.g:6058:4: (otherlv_2= '<-' ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )
                    // InternalCPL.g:6059:5: otherlv_2= '<-' ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    {
                    otherlv_2=(Token)match(input,99,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getNavigatingCommaArgCSAccess().getLessThanSignHyphenMinusKeyword_2_0_0());
                      				
                    }
                    // InternalCPL.g:6063:5: ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) )
                    // InternalCPL.g:6064:6: (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS )
                    {
                    // InternalCPL.g:6064:6: (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS )
                    // InternalCPL.g:6065:7: lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_2_0_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_74);
                    lv_ownedCoIterator_3_0=ruleCoIteratorVariableCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
                      							}
                      							set(
                      								current,
                      								"ownedCoIterator",
                      								lv_ownedCoIterator_3_0,
                      								"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.CoIteratorVariableCS");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalCPL.g:6082:5: (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    int alt120=2;
                    int LA120_0 = input.LA(1);

                    if ( (LA120_0==35) ) {
                        alt120=1;
                    }
                    switch (alt120) {
                        case 1 :
                            // InternalCPL.g:6083:6: otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            {
                            otherlv_4=(Token)match(input,35,FollowSets000.FOLLOW_55); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_4, grammarAccess.getNavigatingCommaArgCSAccess().getEqualsSignKeyword_2_0_2_0());
                              					
                            }
                            // InternalCPL.g:6087:6: ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            // InternalCPL.g:6088:7: (lv_ownedInitExpression_5_0= ruleExpCS )
                            {
                            // InternalCPL.g:6088:7: (lv_ownedInitExpression_5_0= ruleExpCS )
                            // InternalCPL.g:6089:8: lv_ownedInitExpression_5_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_0_2_1_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_ownedInitExpression_5_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
                              								}
                              								set(
                              									current,
                              									"ownedInitExpression",
                              									lv_ownedInitExpression_5_0,
                              									"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCPL.g:6109:4: (otherlv_6= ':' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? )
                    {
                    // InternalCPL.g:6109:4: (otherlv_6= ':' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? )
                    // InternalCPL.g:6110:5: otherlv_6= ':' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )?
                    {
                    otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getNavigatingCommaArgCSAccess().getColonKeyword_2_1_0());
                      				
                    }
                    // InternalCPL.g:6114:5: ( (lv_ownedType_7_0= ruleTypeExpCS ) )
                    // InternalCPL.g:6115:6: (lv_ownedType_7_0= ruleTypeExpCS )
                    {
                    // InternalCPL.g:6115:6: (lv_ownedType_7_0= ruleTypeExpCS )
                    // InternalCPL.g:6116:7: lv_ownedType_7_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_75);
                    lv_ownedType_7_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
                      							}
                      							set(
                      								current,
                      								"ownedType",
                      								lv_ownedType_7_0,
                      								"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpCS");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalCPL.g:6133:5: (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )?
                    int alt121=2;
                    int LA121_0 = input.LA(1);

                    if ( (LA121_0==99) ) {
                        alt121=1;
                    }
                    switch (alt121) {
                        case 1 :
                            // InternalCPL.g:6134:6: otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) )
                            {
                            otherlv_8=(Token)match(input,99,FollowSets000.FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_8, grammarAccess.getNavigatingCommaArgCSAccess().getLessThanSignHyphenMinusKeyword_2_1_2_0());
                              					
                            }
                            // InternalCPL.g:6138:6: ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) )
                            // InternalCPL.g:6139:7: (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS )
                            {
                            // InternalCPL.g:6139:7: (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS )
                            // InternalCPL.g:6140:8: lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_2_1_2_1_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_74);
                            lv_ownedCoIterator_9_0=ruleCoIteratorVariableCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
                              								}
                              								set(
                              									current,
                              									"ownedCoIterator",
                              									lv_ownedCoIterator_9_0,
                              									"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.CoIteratorVariableCS");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalCPL.g:6158:5: (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )?
                    int alt122=2;
                    int LA122_0 = input.LA(1);

                    if ( (LA122_0==35) ) {
                        alt122=1;
                    }
                    switch (alt122) {
                        case 1 :
                            // InternalCPL.g:6159:6: otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) )
                            {
                            otherlv_10=(Token)match(input,35,FollowSets000.FOLLOW_55); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_10, grammarAccess.getNavigatingCommaArgCSAccess().getEqualsSignKeyword_2_1_3_0());
                              					
                            }
                            // InternalCPL.g:6163:6: ( (lv_ownedInitExpression_11_0= ruleExpCS ) )
                            // InternalCPL.g:6164:7: (lv_ownedInitExpression_11_0= ruleExpCS )
                            {
                            // InternalCPL.g:6164:7: (lv_ownedInitExpression_11_0= ruleExpCS )
                            // InternalCPL.g:6165:8: lv_ownedInitExpression_11_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_1_3_1_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_ownedInitExpression_11_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
                              								}
                              								set(
                              									current,
                              									"ownedInitExpression",
                              									lv_ownedInitExpression_11_0,
                              									"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalCPL.g:6185:4: ( (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? otherlv_16= 'in' ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) )
                    {
                    // InternalCPL.g:6185:4: ( (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? otherlv_16= 'in' ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) )
                    // InternalCPL.g:6186:5: (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? otherlv_16= 'in' ( (lv_ownedInitExpression_17_0= ruleExpCS ) )
                    {
                    // InternalCPL.g:6186:5: (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )?
                    int alt123=2;
                    int LA123_0 = input.LA(1);

                    if ( (LA123_0==24) ) {
                        alt123=1;
                    }
                    switch (alt123) {
                        case 1 :
                            // InternalCPL.g:6187:6: otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) )
                            {
                            otherlv_12=(Token)match(input,24,FollowSets000.FOLLOW_38); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_12, grammarAccess.getNavigatingCommaArgCSAccess().getColonKeyword_2_2_0_0());
                              					
                            }
                            // InternalCPL.g:6191:6: ( (lv_ownedType_13_0= ruleTypeExpCS ) )
                            // InternalCPL.g:6192:7: (lv_ownedType_13_0= ruleTypeExpCS )
                            {
                            // InternalCPL.g:6192:7: (lv_ownedType_13_0= ruleTypeExpCS )
                            // InternalCPL.g:6193:8: lv_ownedType_13_0= ruleTypeExpCS
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_2_0_1_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_76);
                            lv_ownedType_13_0=ruleTypeExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
                              								}
                              								set(
                              									current,
                              									"ownedType",
                              									lv_ownedType_13_0,
                              									"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpCS");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalCPL.g:6211:5: (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )?
                    int alt124=2;
                    int LA124_0 = input.LA(1);

                    if ( (LA124_0==99) ) {
                        alt124=1;
                    }
                    switch (alt124) {
                        case 1 :
                            // InternalCPL.g:6212:6: otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) )
                            {
                            otherlv_14=(Token)match(input,99,FollowSets000.FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_14, grammarAccess.getNavigatingCommaArgCSAccess().getLessThanSignHyphenMinusKeyword_2_2_1_0());
                              					
                            }
                            // InternalCPL.g:6216:6: ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) )
                            // InternalCPL.g:6217:7: (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS )
                            {
                            // InternalCPL.g:6217:7: (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS )
                            // InternalCPL.g:6218:8: lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_2_2_1_1_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_77);
                            lv_ownedCoIterator_15_0=ruleCoIteratorVariableCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
                              								}
                              								set(
                              									current,
                              									"ownedCoIterator",
                              									lv_ownedCoIterator_15_0,
                              									"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.CoIteratorVariableCS");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_16=(Token)match(input,107,FollowSets000.FOLLOW_55); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_16, grammarAccess.getNavigatingCommaArgCSAccess().getInKeyword_2_2_2());
                      				
                    }
                    // InternalCPL.g:6240:5: ( (lv_ownedInitExpression_17_0= ruleExpCS ) )
                    // InternalCPL.g:6241:6: (lv_ownedInitExpression_17_0= ruleExpCS )
                    {
                    // InternalCPL.g:6241:6: (lv_ownedInitExpression_17_0= ruleExpCS )
                    // InternalCPL.g:6242:7: lv_ownedInitExpression_17_0= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_2_3_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_ownedInitExpression_17_0=ruleExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
                      							}
                      							set(
                      								current,
                      								"ownedInitExpression",
                      								lv_ownedInitExpression_17_0,
                      								"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNavigatingCommaArgCS"


    // $ANTLR start "entryRuleNavigatingSemiArgCS"
    // InternalCPL.g:6265:1: entryRuleNavigatingSemiArgCS returns [EObject current=null] : iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF ;
    public final EObject entryRuleNavigatingSemiArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingSemiArgCS = null;


        try {
            // InternalCPL.g:6265:60: (iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF )
            // InternalCPL.g:6266:2: iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingSemiArgCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNavigatingSemiArgCS=ruleNavigatingSemiArgCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingSemiArgCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNavigatingSemiArgCS"


    // $ANTLR start "ruleNavigatingSemiArgCS"
    // InternalCPL.g:6272:1: ruleNavigatingSemiArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= ';' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? ) ;
    public final EObject ruleNavigatingSemiArgCS() throws RecognitionException {
        EObject current = null;

        Token lv_prefix_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedNameExpression_1_0 = null;

        EObject lv_ownedType_3_0 = null;

        EObject lv_ownedInitExpression_5_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:6278:2: ( ( ( (lv_prefix_0_0= ';' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? ) )
            // InternalCPL.g:6279:2: ( ( (lv_prefix_0_0= ';' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? )
            {
            // InternalCPL.g:6279:2: ( ( (lv_prefix_0_0= ';' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? )
            // InternalCPL.g:6280:3: ( (lv_prefix_0_0= ';' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )?
            {
            // InternalCPL.g:6280:3: ( (lv_prefix_0_0= ';' ) )
            // InternalCPL.g:6281:4: (lv_prefix_0_0= ';' )
            {
            // InternalCPL.g:6281:4: (lv_prefix_0_0= ';' )
            // InternalCPL.g:6282:5: lv_prefix_0_0= ';'
            {
            lv_prefix_0_0=(Token)match(input,109,FollowSets000.FOLLOW_78); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_prefix_0_0, grammarAccess.getNavigatingSemiArgCSAccess().getPrefixSemicolonKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getNavigatingSemiArgCSRule());
              					}
              					setWithLastConsumed(current, "prefix", lv_prefix_0_0, ";");
              				
            }

            }


            }

            // InternalCPL.g:6294:3: ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) )
            // InternalCPL.g:6295:4: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            {
            // InternalCPL.g:6295:4: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            // InternalCPL.g:6296:5: lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNavigatingSemiArgCSAccess().getOwnedNameExpressionNavigatingArgExpCSParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_79);
            lv_ownedNameExpression_1_0=ruleNavigatingArgExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNavigatingSemiArgCSRule());
              					}
              					set(
              						current,
              						"ownedNameExpression",
              						lv_ownedNameExpression_1_0,
              						"org.eclipse.ocl.xtext.completeocl.CompleteOCL.NavigatingArgExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCPL.g:6313:3: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==24) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // InternalCPL.g:6314:4: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    {
                    otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getNavigatingSemiArgCSAccess().getColonKeyword_2_0());
                      			
                    }
                    // InternalCPL.g:6318:4: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // InternalCPL.g:6319:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // InternalCPL.g:6319:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    // InternalCPL.g:6320:6: lv_ownedType_3_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNavigatingSemiArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_74);
                    lv_ownedType_3_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNavigatingSemiArgCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedType",
                      							lv_ownedType_3_0,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalCPL.g:6337:4: (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    int alt126=2;
                    int LA126_0 = input.LA(1);

                    if ( (LA126_0==35) ) {
                        alt126=1;
                    }
                    switch (alt126) {
                        case 1 :
                            // InternalCPL.g:6338:5: otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            {
                            otherlv_4=(Token)match(input,35,FollowSets000.FOLLOW_55); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getNavigatingSemiArgCSAccess().getEqualsSignKeyword_2_2_0());
                              				
                            }
                            // InternalCPL.g:6342:5: ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            // InternalCPL.g:6343:6: (lv_ownedInitExpression_5_0= ruleExpCS )
                            {
                            // InternalCPL.g:6343:6: (lv_ownedInitExpression_5_0= ruleExpCS )
                            // InternalCPL.g:6344:7: lv_ownedInitExpression_5_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getNavigatingSemiArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_2_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_ownedInitExpression_5_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getNavigatingSemiArgCSRule());
                              							}
                              							set(
                              								current,
                              								"ownedInitExpression",
                              								lv_ownedInitExpression_5_0,
                              								"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNavigatingSemiArgCS"


    // $ANTLR start "entryRuleCoIteratorVariableCS"
    // InternalCPL.g:6367:1: entryRuleCoIteratorVariableCS returns [EObject current=null] : iv_ruleCoIteratorVariableCS= ruleCoIteratorVariableCS EOF ;
    public final EObject entryRuleCoIteratorVariableCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoIteratorVariableCS = null;


        try {
            // InternalCPL.g:6367:61: (iv_ruleCoIteratorVariableCS= ruleCoIteratorVariableCS EOF )
            // InternalCPL.g:6368:2: iv_ruleCoIteratorVariableCS= ruleCoIteratorVariableCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCoIteratorVariableCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCoIteratorVariableCS=ruleCoIteratorVariableCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCoIteratorVariableCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCoIteratorVariableCS"


    // $ANTLR start "ruleCoIteratorVariableCS"
    // InternalCPL.g:6374:1: ruleCoIteratorVariableCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? ) ;
    public final EObject ruleCoIteratorVariableCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:6380:2: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? ) )
            // InternalCPL.g:6381:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? )
            {
            // InternalCPL.g:6381:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? )
            // InternalCPL.g:6382:3: ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )?
            {
            // InternalCPL.g:6382:3: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // InternalCPL.g:6383:4: (lv_name_0_0= ruleUnrestrictedName )
            {
            // InternalCPL.g:6383:4: (lv_name_0_0= ruleUnrestrictedName )
            // InternalCPL.g:6384:5: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCoIteratorVariableCSAccess().getNameUnrestrictedNameParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_79);
            lv_name_0_0=ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCoIteratorVariableCSRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.ocl.xtext.completeocl.CompleteOCL.UnrestrictedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCPL.g:6401:3: (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==24) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // InternalCPL.g:6402:4: otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    {
                    otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getCoIteratorVariableCSAccess().getColonKeyword_1_0());
                      			
                    }
                    // InternalCPL.g:6406:4: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // InternalCPL.g:6407:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // InternalCPL.g:6407:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    // InternalCPL.g:6408:6: lv_ownedType_2_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCoIteratorVariableCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_ownedType_2_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCoIteratorVariableCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedType",
                      							lv_ownedType_2_0,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCoIteratorVariableCS"


    // $ANTLR start "entryRuleIfExpCS"
    // InternalCPL.g:6430:1: entryRuleIfExpCS returns [EObject current=null] : iv_ruleIfExpCS= ruleIfExpCS EOF ;
    public final EObject entryRuleIfExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExpCS = null;


        try {
            // InternalCPL.g:6430:48: (iv_ruleIfExpCS= ruleIfExpCS EOF )
            // InternalCPL.g:6431:2: iv_ruleIfExpCS= ruleIfExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIfExpCS=ruleIfExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfExpCS"


    // $ANTLR start "ruleIfExpCS"
    // InternalCPL.g:6437:1: ruleIfExpCS returns [EObject current=null] : (otherlv_0= 'if' ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )* otherlv_5= 'else' ( (lv_ownedElseExpression_6_0= ruleExpCS ) ) otherlv_7= 'endif' ) ;
    public final EObject ruleIfExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_ownedCondition_1_1 = null;

        EObject lv_ownedCondition_1_2 = null;

        EObject lv_ownedThenExpression_3_0 = null;

        EObject lv_ownedIfThenExpressions_4_0 = null;

        EObject lv_ownedElseExpression_6_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:6443:2: ( (otherlv_0= 'if' ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )* otherlv_5= 'else' ( (lv_ownedElseExpression_6_0= ruleExpCS ) ) otherlv_7= 'endif' ) )
            // InternalCPL.g:6444:2: (otherlv_0= 'if' ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )* otherlv_5= 'else' ( (lv_ownedElseExpression_6_0= ruleExpCS ) ) otherlv_7= 'endif' )
            {
            // InternalCPL.g:6444:2: (otherlv_0= 'if' ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )* otherlv_5= 'else' ( (lv_ownedElseExpression_6_0= ruleExpCS ) ) otherlv_7= 'endif' )
            // InternalCPL.g:6445:3: otherlv_0= 'if' ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )* otherlv_5= 'else' ( (lv_ownedElseExpression_6_0= ruleExpCS ) ) otherlv_7= 'endif'
            {
            otherlv_0=(Token)match(input,110,FollowSets000.FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfExpCSAccess().getIfKeyword_0());
              		
            }
            // InternalCPL.g:6449:3: ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) )
            // InternalCPL.g:6450:4: ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) )
            {
            // InternalCPL.g:6450:4: ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) )
            // InternalCPL.g:6451:5: (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS )
            {
            // InternalCPL.g:6451:5: (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS )
            int alt129=2;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_SINGLE_QUOTED_STRING:
            case 44:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 88:
            case 89:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 98:
            case 100:
            case 101:
            case 102:
            case 103:
            case 110:
            case 115:
            case 116:
                {
                alt129=1;
                }
                break;
            case RULE_SIMPLE_ID:
                {
                int LA129_2 = input.LA(2);

                if ( (LA129_2==24) ) {
                    alt129=2;
                }
                else if ( (LA129_2==19||(LA129_2>=27 && LA129_2<=28)||(LA129_2>=33 && LA129_2<=36)||LA129_2==38||(LA129_2>=42 && LA129_2<=44)||(LA129_2>=46 && LA129_2<=47)||LA129_2==73||(LA129_2>=76 && LA129_2<=87)||LA129_2==90||(LA129_2>=104 && LA129_2<=105)||LA129_2==111) ) {
                    alt129=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 129, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ESCAPED_ID:
                {
                int LA129_3 = input.LA(2);

                if ( (LA129_3==24) ) {
                    alt129=2;
                }
                else if ( (LA129_3==19||(LA129_3>=27 && LA129_3<=28)||(LA129_3>=33 && LA129_3<=36)||LA129_3==38||(LA129_3>=42 && LA129_3<=44)||(LA129_3>=46 && LA129_3<=47)||LA129_3==73||(LA129_3>=76 && LA129_3<=87)||LA129_3==90||(LA129_3>=104 && LA129_3<=105)||LA129_3==111) ) {
                    alt129=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 129, 3, input);

                    throw nvae;
                }
                }
                break;
            case 22:
                {
                int LA129_4 = input.LA(2);

                if ( (LA129_4==24) ) {
                    alt129=2;
                }
                else if ( (LA129_4==19||(LA129_4>=27 && LA129_4<=28)||(LA129_4>=33 && LA129_4<=36)||LA129_4==38||(LA129_4>=42 && LA129_4<=44)||(LA129_4>=46 && LA129_4<=47)||LA129_4==73||(LA129_4>=76 && LA129_4<=87)||LA129_4==90||(LA129_4>=104 && LA129_4<=105)||LA129_4==111) ) {
                    alt129=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 129, 4, input);

                    throw nvae;
                }
                }
                break;
            case 53:
                {
                int LA129_5 = input.LA(2);

                if ( (LA129_5==24) ) {
                    alt129=2;
                }
                else if ( (LA129_5==19||(LA129_5>=27 && LA129_5<=28)||(LA129_5>=33 && LA129_5<=36)||LA129_5==38||(LA129_5>=42 && LA129_5<=44)||(LA129_5>=46 && LA129_5<=47)||LA129_5==73||(LA129_5>=76 && LA129_5<=87)||LA129_5==90||(LA129_5>=104 && LA129_5<=105)||LA129_5==111) ) {
                    alt129=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 129, 5, input);

                    throw nvae;
                }
                }
                break;
            case 54:
                {
                int LA129_6 = input.LA(2);

                if ( (LA129_6==24) ) {
                    alt129=2;
                }
                else if ( (LA129_6==19||(LA129_6>=27 && LA129_6<=28)||(LA129_6>=33 && LA129_6<=36)||LA129_6==38||(LA129_6>=42 && LA129_6<=44)||(LA129_6>=46 && LA129_6<=47)||LA129_6==73||(LA129_6>=76 && LA129_6<=87)||LA129_6==90||(LA129_6>=104 && LA129_6<=105)||LA129_6==111) ) {
                    alt129=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 129, 6, input);

                    throw nvae;
                }
                }
                break;
            case 24:
                {
                alt129=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 129, 0, input);

                throw nvae;
            }

            switch (alt129) {
                case 1 :
                    // InternalCPL.g:6452:6: lv_ownedCondition_1_1= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIfExpCSAccess().getOwnedConditionExpCSParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_80);
                    lv_ownedCondition_1_1=ruleExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getIfExpCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedCondition",
                      							lv_ownedCondition_1_1,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalCPL.g:6468:6: lv_ownedCondition_1_2= rulePatternExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIfExpCSAccess().getOwnedConditionPatternExpCSParserRuleCall_1_0_1());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_80);
                    lv_ownedCondition_1_2=rulePatternExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getIfExpCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedCondition",
                      							lv_ownedCondition_1_2,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.PatternExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,111,FollowSets000.FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getIfExpCSAccess().getThenKeyword_2());
              		
            }
            // InternalCPL.g:6490:3: ( (lv_ownedThenExpression_3_0= ruleExpCS ) )
            // InternalCPL.g:6491:4: (lv_ownedThenExpression_3_0= ruleExpCS )
            {
            // InternalCPL.g:6491:4: (lv_ownedThenExpression_3_0= ruleExpCS )
            // InternalCPL.g:6492:5: lv_ownedThenExpression_3_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfExpCSAccess().getOwnedThenExpressionExpCSParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_81);
            lv_ownedThenExpression_3_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfExpCSRule());
              					}
              					set(
              						current,
              						"ownedThenExpression",
              						lv_ownedThenExpression_3_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCPL.g:6509:3: ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )*
            loop130:
            do {
                int alt130=2;
                int LA130_0 = input.LA(1);

                if ( (LA130_0==114) ) {
                    alt130=1;
                }


                switch (alt130) {
            	case 1 :
            	    // InternalCPL.g:6510:4: (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS )
            	    {
            	    // InternalCPL.g:6510:4: (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS )
            	    // InternalCPL.g:6511:5: lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getIfExpCSAccess().getOwnedIfThenExpressionsElseIfThenExpCSParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_81);
            	    lv_ownedIfThenExpressions_4_0=ruleElseIfThenExpCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getIfExpCSRule());
            	      					}
            	      					add(
            	      						current,
            	      						"ownedIfThenExpressions",
            	      						lv_ownedIfThenExpressions_4_0,
            	      						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ElseIfThenExpCS");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop130;
                }
            } while (true);

            otherlv_5=(Token)match(input,112,FollowSets000.FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getIfExpCSAccess().getElseKeyword_5());
              		
            }
            // InternalCPL.g:6532:3: ( (lv_ownedElseExpression_6_0= ruleExpCS ) )
            // InternalCPL.g:6533:4: (lv_ownedElseExpression_6_0= ruleExpCS )
            {
            // InternalCPL.g:6533:4: (lv_ownedElseExpression_6_0= ruleExpCS )
            // InternalCPL.g:6534:5: lv_ownedElseExpression_6_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfExpCSAccess().getOwnedElseExpressionExpCSParserRuleCall_6_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_82);
            lv_ownedElseExpression_6_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfExpCSRule());
              					}
              					set(
              						current,
              						"ownedElseExpression",
              						lv_ownedElseExpression_6_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_7=(Token)match(input,113,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getIfExpCSAccess().getEndifKeyword_7());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfExpCS"


    // $ANTLR start "entryRuleElseIfThenExpCS"
    // InternalCPL.g:6559:1: entryRuleElseIfThenExpCS returns [EObject current=null] : iv_ruleElseIfThenExpCS= ruleElseIfThenExpCS EOF ;
    public final EObject entryRuleElseIfThenExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElseIfThenExpCS = null;


        try {
            // InternalCPL.g:6559:56: (iv_ruleElseIfThenExpCS= ruleElseIfThenExpCS EOF )
            // InternalCPL.g:6560:2: iv_ruleElseIfThenExpCS= ruleElseIfThenExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElseIfThenExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleElseIfThenExpCS=ruleElseIfThenExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElseIfThenExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElseIfThenExpCS"


    // $ANTLR start "ruleElseIfThenExpCS"
    // InternalCPL.g:6566:1: ruleElseIfThenExpCS returns [EObject current=null] : (otherlv_0= 'elseif' ( (lv_ownedCondition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ) ;
    public final EObject ruleElseIfThenExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_ownedCondition_1_0 = null;

        EObject lv_ownedThenExpression_3_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:6572:2: ( (otherlv_0= 'elseif' ( (lv_ownedCondition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ) )
            // InternalCPL.g:6573:2: (otherlv_0= 'elseif' ( (lv_ownedCondition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) )
            {
            // InternalCPL.g:6573:2: (otherlv_0= 'elseif' ( (lv_ownedCondition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) )
            // InternalCPL.g:6574:3: otherlv_0= 'elseif' ( (lv_ownedCondition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) )
            {
            otherlv_0=(Token)match(input,114,FollowSets000.FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getElseIfThenExpCSAccess().getElseifKeyword_0());
              		
            }
            // InternalCPL.g:6578:3: ( (lv_ownedCondition_1_0= ruleExpCS ) )
            // InternalCPL.g:6579:4: (lv_ownedCondition_1_0= ruleExpCS )
            {
            // InternalCPL.g:6579:4: (lv_ownedCondition_1_0= ruleExpCS )
            // InternalCPL.g:6580:5: lv_ownedCondition_1_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getElseIfThenExpCSAccess().getOwnedConditionExpCSParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_80);
            lv_ownedCondition_1_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getElseIfThenExpCSRule());
              					}
              					set(
              						current,
              						"ownedCondition",
              						lv_ownedCondition_1_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,111,FollowSets000.FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getElseIfThenExpCSAccess().getThenKeyword_2());
              		
            }
            // InternalCPL.g:6601:3: ( (lv_ownedThenExpression_3_0= ruleExpCS ) )
            // InternalCPL.g:6602:4: (lv_ownedThenExpression_3_0= ruleExpCS )
            {
            // InternalCPL.g:6602:4: (lv_ownedThenExpression_3_0= ruleExpCS )
            // InternalCPL.g:6603:5: lv_ownedThenExpression_3_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getElseIfThenExpCSAccess().getOwnedThenExpressionExpCSParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_ownedThenExpression_3_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getElseIfThenExpCSRule());
              					}
              					set(
              						current,
              						"ownedThenExpression",
              						lv_ownedThenExpression_3_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElseIfThenExpCS"


    // $ANTLR start "entryRuleLetExpCS"
    // InternalCPL.g:6624:1: entryRuleLetExpCS returns [EObject current=null] : iv_ruleLetExpCS= ruleLetExpCS EOF ;
    public final EObject entryRuleLetExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetExpCS = null;


        try {
            // InternalCPL.g:6624:49: (iv_ruleLetExpCS= ruleLetExpCS EOF )
            // InternalCPL.g:6625:2: iv_ruleLetExpCS= ruleLetExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLetExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLetExpCS=ruleLetExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLetExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLetExpCS"


    // $ANTLR start "ruleLetExpCS"
    // InternalCPL.g:6631:1: ruleLetExpCS returns [EObject current=null] : (otherlv_0= 'let' ( (lv_ownedVariables_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_ownedInExpression_5_0= ruleExpCS ) ) ) ;
    public final EObject ruleLetExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedVariables_1_0 = null;

        EObject lv_ownedVariables_3_0 = null;

        EObject lv_ownedInExpression_5_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:6637:2: ( (otherlv_0= 'let' ( (lv_ownedVariables_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_ownedInExpression_5_0= ruleExpCS ) ) ) )
            // InternalCPL.g:6638:2: (otherlv_0= 'let' ( (lv_ownedVariables_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_ownedInExpression_5_0= ruleExpCS ) ) )
            {
            // InternalCPL.g:6638:2: (otherlv_0= 'let' ( (lv_ownedVariables_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_ownedInExpression_5_0= ruleExpCS ) ) )
            // InternalCPL.g:6639:3: otherlv_0= 'let' ( (lv_ownedVariables_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_ownedInExpression_5_0= ruleExpCS ) )
            {
            otherlv_0=(Token)match(input,115,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLetExpCSAccess().getLetKeyword_0());
              		
            }
            // InternalCPL.g:6643:3: ( (lv_ownedVariables_1_0= ruleLetVariableCS ) )
            // InternalCPL.g:6644:4: (lv_ownedVariables_1_0= ruleLetVariableCS )
            {
            // InternalCPL.g:6644:4: (lv_ownedVariables_1_0= ruleLetVariableCS )
            // InternalCPL.g:6645:5: lv_ownedVariables_1_0= ruleLetVariableCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLetExpCSAccess().getOwnedVariablesLetVariableCSParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_83);
            lv_ownedVariables_1_0=ruleLetVariableCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLetExpCSRule());
              					}
              					add(
              						current,
              						"ownedVariables",
              						lv_ownedVariables_1_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.LetVariableCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCPL.g:6662:3: (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )*
            loop131:
            do {
                int alt131=2;
                int LA131_0 = input.LA(1);

                if ( (LA131_0==52) ) {
                    alt131=1;
                }


                switch (alt131) {
            	case 1 :
            	    // InternalCPL.g:6663:4: otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) )
            	    {
            	    otherlv_2=(Token)match(input,52,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getLetExpCSAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalCPL.g:6667:4: ( (lv_ownedVariables_3_0= ruleLetVariableCS ) )
            	    // InternalCPL.g:6668:5: (lv_ownedVariables_3_0= ruleLetVariableCS )
            	    {
            	    // InternalCPL.g:6668:5: (lv_ownedVariables_3_0= ruleLetVariableCS )
            	    // InternalCPL.g:6669:6: lv_ownedVariables_3_0= ruleLetVariableCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getLetExpCSAccess().getOwnedVariablesLetVariableCSParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_83);
            	    lv_ownedVariables_3_0=ruleLetVariableCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getLetExpCSRule());
            	      						}
            	      						add(
            	      							current,
            	      							"ownedVariables",
            	      							lv_ownedVariables_3_0,
            	      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.LetVariableCS");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop131;
                }
            } while (true);

            otherlv_4=(Token)match(input,107,FollowSets000.FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getLetExpCSAccess().getInKeyword_3());
              		
            }
            // InternalCPL.g:6691:3: ( (lv_ownedInExpression_5_0= ruleExpCS ) )
            // InternalCPL.g:6692:4: (lv_ownedInExpression_5_0= ruleExpCS )
            {
            // InternalCPL.g:6692:4: (lv_ownedInExpression_5_0= ruleExpCS )
            // InternalCPL.g:6693:5: lv_ownedInExpression_5_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLetExpCSAccess().getOwnedInExpressionExpCSParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_ownedInExpression_5_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLetExpCSRule());
              					}
              					set(
              						current,
              						"ownedInExpression",
              						lv_ownedInExpression_5_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLetExpCS"


    // $ANTLR start "entryRuleLetVariableCS"
    // InternalCPL.g:6714:1: entryRuleLetVariableCS returns [EObject current=null] : iv_ruleLetVariableCS= ruleLetVariableCS EOF ;
    public final EObject entryRuleLetVariableCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetVariableCS = null;


        try {
            // InternalCPL.g:6714:54: (iv_ruleLetVariableCS= ruleLetVariableCS EOF )
            // InternalCPL.g:6715:2: iv_ruleLetVariableCS= ruleLetVariableCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLetVariableCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLetVariableCS=ruleLetVariableCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLetVariableCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLetVariableCS"


    // $ANTLR start "ruleLetVariableCS"
    // InternalCPL.g:6721:1: ruleLetVariableCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )? (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) ) ;
    public final EObject ruleLetVariableCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedRoundBracketedClause_1_0 = null;

        EObject lv_ownedType_3_0 = null;

        EObject lv_ownedInitExpression_5_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:6727:2: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )? (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) ) )
            // InternalCPL.g:6728:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )? (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )
            {
            // InternalCPL.g:6728:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )? (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )
            // InternalCPL.g:6729:3: ( (lv_name_0_0= ruleUnrestrictedName ) ) ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )? (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
            {
            // InternalCPL.g:6729:3: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // InternalCPL.g:6730:4: (lv_name_0_0= ruleUnrestrictedName )
            {
            // InternalCPL.g:6730:4: (lv_name_0_0= ruleUnrestrictedName )
            // InternalCPL.g:6731:5: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLetVariableCSAccess().getNameUnrestrictedNameParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_84);
            lv_name_0_0=ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLetVariableCSRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.ocl.xtext.completeocl.CompleteOCL.UnrestrictedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCPL.g:6748:3: ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==44) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // InternalCPL.g:6749:4: (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS )
                    {
                    // InternalCPL.g:6749:4: (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS )
                    // InternalCPL.g:6750:5: lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getLetVariableCSAccess().getOwnedRoundBracketedClauseRoundBracketedClauseCSParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_59);
                    lv_ownedRoundBracketedClause_1_0=ruleRoundBracketedClauseCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getLetVariableCSRule());
                      					}
                      					set(
                      						current,
                      						"ownedRoundBracketedClause",
                      						lv_ownedRoundBracketedClause_1_0,
                      						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.RoundBracketedClauseCS");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCPL.g:6767:3: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==24) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // InternalCPL.g:6768:4: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    {
                    otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getLetVariableCSAccess().getColonKeyword_2_0());
                      			
                    }
                    // InternalCPL.g:6772:4: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // InternalCPL.g:6773:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // InternalCPL.g:6773:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    // InternalCPL.g:6774:6: lv_ownedType_3_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLetVariableCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_37);
                    lv_ownedType_3_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLetVariableCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedType",
                      							lv_ownedType_3_0,
                      							"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.TypeExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,35,FollowSets000.FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getLetVariableCSAccess().getEqualsSignKeyword_3());
              		
            }
            // InternalCPL.g:6796:3: ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
            // InternalCPL.g:6797:4: (lv_ownedInitExpression_5_0= ruleExpCS )
            {
            // InternalCPL.g:6797:4: (lv_ownedInitExpression_5_0= ruleExpCS )
            // InternalCPL.g:6798:5: lv_ownedInitExpression_5_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLetVariableCSAccess().getOwnedInitExpressionExpCSParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_ownedInitExpression_5_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLetVariableCSRule());
              					}
              					set(
              						current,
              						"ownedInitExpression",
              						lv_ownedInitExpression_5_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLetVariableCS"


    // $ANTLR start "entryRuleNestedExpCS"
    // InternalCPL.g:6819:1: entryRuleNestedExpCS returns [EObject current=null] : iv_ruleNestedExpCS= ruleNestedExpCS EOF ;
    public final EObject entryRuleNestedExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedExpCS = null;


        try {
            // InternalCPL.g:6819:52: (iv_ruleNestedExpCS= ruleNestedExpCS EOF )
            // InternalCPL.g:6820:2: iv_ruleNestedExpCS= ruleNestedExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNestedExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNestedExpCS=ruleNestedExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNestedExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNestedExpCS"


    // $ANTLR start "ruleNestedExpCS"
    // InternalCPL.g:6826:1: ruleNestedExpCS returns [EObject current=null] : (otherlv_0= '(' ( (lv_ownedExpression_1_0= ruleExpCS ) ) otherlv_2= ')' ) ;
    public final EObject ruleNestedExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_ownedExpression_1_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:6832:2: ( (otherlv_0= '(' ( (lv_ownedExpression_1_0= ruleExpCS ) ) otherlv_2= ')' ) )
            // InternalCPL.g:6833:2: (otherlv_0= '(' ( (lv_ownedExpression_1_0= ruleExpCS ) ) otherlv_2= ')' )
            {
            // InternalCPL.g:6833:2: (otherlv_0= '(' ( (lv_ownedExpression_1_0= ruleExpCS ) ) otherlv_2= ')' )
            // InternalCPL.g:6834:3: otherlv_0= '(' ( (lv_ownedExpression_1_0= ruleExpCS ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,44,FollowSets000.FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNestedExpCSAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalCPL.g:6838:3: ( (lv_ownedExpression_1_0= ruleExpCS ) )
            // InternalCPL.g:6839:4: (lv_ownedExpression_1_0= ruleExpCS )
            {
            // InternalCPL.g:6839:4: (lv_ownedExpression_1_0= ruleExpCS )
            // InternalCPL.g:6840:5: lv_ownedExpression_1_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNestedExpCSAccess().getOwnedExpressionExpCSParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_31);
            lv_ownedExpression_1_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNestedExpCSRule());
              					}
              					set(
              						current,
              						"ownedExpression",
              						lv_ownedExpression_1_0,
              						"org.eclipse.ocl.xtext.essentialocl.EssentialOCL.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getNestedExpCSAccess().getRightParenthesisKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNestedExpCS"


    // $ANTLR start "entryRuleSelfExpCS"
    // InternalCPL.g:6865:1: entryRuleSelfExpCS returns [EObject current=null] : iv_ruleSelfExpCS= ruleSelfExpCS EOF ;
    public final EObject entryRuleSelfExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelfExpCS = null;


        try {
            // InternalCPL.g:6865:50: (iv_ruleSelfExpCS= ruleSelfExpCS EOF )
            // InternalCPL.g:6866:2: iv_ruleSelfExpCS= ruleSelfExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelfExpCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSelfExpCS=ruleSelfExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelfExpCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelfExpCS"


    // $ANTLR start "ruleSelfExpCS"
    // InternalCPL.g:6872:1: ruleSelfExpCS returns [EObject current=null] : ( () otherlv_1= 'self' ) ;
    public final EObject ruleSelfExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalCPL.g:6878:2: ( ( () otherlv_1= 'self' ) )
            // InternalCPL.g:6879:2: ( () otherlv_1= 'self' )
            {
            // InternalCPL.g:6879:2: ( () otherlv_1= 'self' )
            // InternalCPL.g:6880:3: () otherlv_1= 'self'
            {
            // InternalCPL.g:6880:3: ()
            // InternalCPL.g:6881:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSelfExpCSAccess().getSelfExpCSAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,116,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSelfExpCSAccess().getSelfKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelfExpCS"


    // $ANTLR start "entryRuleMultiplicityBoundsCS"
    // InternalCPL.g:6898:1: entryRuleMultiplicityBoundsCS returns [EObject current=null] : iv_ruleMultiplicityBoundsCS= ruleMultiplicityBoundsCS EOF ;
    public final EObject entryRuleMultiplicityBoundsCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicityBoundsCS = null;


        try {
            // InternalCPL.g:6898:61: (iv_ruleMultiplicityBoundsCS= ruleMultiplicityBoundsCS EOF )
            // InternalCPL.g:6899:2: iv_ruleMultiplicityBoundsCS= ruleMultiplicityBoundsCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicityBoundsCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMultiplicityBoundsCS=ruleMultiplicityBoundsCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicityBoundsCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicityBoundsCS"


    // $ANTLR start "ruleMultiplicityBoundsCS"
    // InternalCPL.g:6905:1: ruleMultiplicityBoundsCS returns [EObject current=null] : ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? ) ;
    public final EObject ruleMultiplicityBoundsCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_lowerBound_0_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_2_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:6911:2: ( ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? ) )
            // InternalCPL.g:6912:2: ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? )
            {
            // InternalCPL.g:6912:2: ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? )
            // InternalCPL.g:6913:3: ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )?
            {
            // InternalCPL.g:6913:3: ( (lv_lowerBound_0_0= ruleLOWER ) )
            // InternalCPL.g:6914:4: (lv_lowerBound_0_0= ruleLOWER )
            {
            // InternalCPL.g:6914:4: (lv_lowerBound_0_0= ruleLOWER )
            // InternalCPL.g:6915:5: lv_lowerBound_0_0= ruleLOWER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMultiplicityBoundsCSAccess().getLowerBoundLOWERParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_54);
            lv_lowerBound_0_0=ruleLOWER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMultiplicityBoundsCSRule());
              					}
              					set(
              						current,
              						"lowerBound",
              						lv_lowerBound_0_0,
              						"org.eclipse.ocl.xtext.base.Base.LOWER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCPL.g:6932:3: (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==96) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // InternalCPL.g:6933:4: otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) )
                    {
                    otherlv_1=(Token)match(input,96,FollowSets000.FOLLOW_85); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getMultiplicityBoundsCSAccess().getFullStopFullStopKeyword_1_0());
                      			
                    }
                    // InternalCPL.g:6937:4: ( (lv_upperBound_2_0= ruleUPPER ) )
                    // InternalCPL.g:6938:5: (lv_upperBound_2_0= ruleUPPER )
                    {
                    // InternalCPL.g:6938:5: (lv_upperBound_2_0= ruleUPPER )
                    // InternalCPL.g:6939:6: lv_upperBound_2_0= ruleUPPER
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMultiplicityBoundsCSAccess().getUpperBoundUPPERParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_upperBound_2_0=ruleUPPER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMultiplicityBoundsCSRule());
                      						}
                      						set(
                      							current,
                      							"upperBound",
                      							lv_upperBound_2_0,
                      							"org.eclipse.ocl.xtext.base.Base.UPPER");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicityBoundsCS"


    // $ANTLR start "entryRuleMultiplicityCS"
    // InternalCPL.g:6961:1: entryRuleMultiplicityCS returns [EObject current=null] : iv_ruleMultiplicityCS= ruleMultiplicityCS EOF ;
    public final EObject entryRuleMultiplicityCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicityCS = null;


        try {
            // InternalCPL.g:6961:55: (iv_ruleMultiplicityCS= ruleMultiplicityCS EOF )
            // InternalCPL.g:6962:2: iv_ruleMultiplicityCS= ruleMultiplicityCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicityCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMultiplicityCS=ruleMultiplicityCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicityCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicityCS"


    // $ANTLR start "ruleMultiplicityCS"
    // InternalCPL.g:6968:1: ruleMultiplicityCS returns [EObject current=null] : (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) (otherlv_3= '|?' | ( (lv_isNullFree_4_0= '|1' ) ) )? otherlv_5= ']' ) ;
    public final EObject ruleMultiplicityCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token lv_isNullFree_4_0=null;
        Token otherlv_5=null;
        EObject this_MultiplicityBoundsCS_1 = null;

        EObject this_MultiplicityStringCS_2 = null;



        	enterRule();

        try {
            // InternalCPL.g:6974:2: ( (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) (otherlv_3= '|?' | ( (lv_isNullFree_4_0= '|1' ) ) )? otherlv_5= ']' ) )
            // InternalCPL.g:6975:2: (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) (otherlv_3= '|?' | ( (lv_isNullFree_4_0= '|1' ) ) )? otherlv_5= ']' )
            {
            // InternalCPL.g:6975:2: (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) (otherlv_3= '|?' | ( (lv_isNullFree_4_0= '|1' ) ) )? otherlv_5= ']' )
            // InternalCPL.g:6976:3: otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) (otherlv_3= '|?' | ( (lv_isNullFree_4_0= '|1' ) ) )? otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,105,FollowSets000.FOLLOW_86); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMultiplicityCSAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalCPL.g:6980:3: (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS )
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==RULE_INT) ) {
                alt135=1;
            }
            else if ( (LA135_0==62||LA135_0==76||LA135_0==78) ) {
                alt135=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 135, 0, input);

                throw nvae;
            }
            switch (alt135) {
                case 1 :
                    // InternalCPL.g:6981:4: this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getMultiplicityCSAccess().getMultiplicityBoundsCSParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_87);
                    this_MultiplicityBoundsCS_1=ruleMultiplicityBoundsCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_MultiplicityBoundsCS_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalCPL.g:6993:4: this_MultiplicityStringCS_2= ruleMultiplicityStringCS
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getMultiplicityCSAccess().getMultiplicityStringCSParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_87);
                    this_MultiplicityStringCS_2=ruleMultiplicityStringCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_MultiplicityStringCS_2;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalCPL.g:7005:3: (otherlv_3= '|?' | ( (lv_isNullFree_4_0= '|1' ) ) )?
            int alt136=3;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==117) ) {
                alt136=1;
            }
            else if ( (LA136_0==118) ) {
                alt136=2;
            }
            switch (alt136) {
                case 1 :
                    // InternalCPL.g:7006:4: otherlv_3= '|?'
                    {
                    otherlv_3=(Token)match(input,117,FollowSets000.FOLLOW_88); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getMultiplicityCSAccess().getVerticalLineQuestionMarkKeyword_2_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalCPL.g:7011:4: ( (lv_isNullFree_4_0= '|1' ) )
                    {
                    // InternalCPL.g:7011:4: ( (lv_isNullFree_4_0= '|1' ) )
                    // InternalCPL.g:7012:5: (lv_isNullFree_4_0= '|1' )
                    {
                    // InternalCPL.g:7012:5: (lv_isNullFree_4_0= '|1' )
                    // InternalCPL.g:7013:6: lv_isNullFree_4_0= '|1'
                    {
                    lv_isNullFree_4_0=(Token)match(input,118,FollowSets000.FOLLOW_88); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_isNullFree_4_0, grammarAccess.getMultiplicityCSAccess().getIsNullFree1Keyword_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMultiplicityCSRule());
                      						}
                      						setWithLastConsumed(current, "isNullFree", true, "|1");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,106,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getMultiplicityCSAccess().getRightSquareBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicityCS"


    // $ANTLR start "entryRuleMultiplicityStringCS"
    // InternalCPL.g:7034:1: entryRuleMultiplicityStringCS returns [EObject current=null] : iv_ruleMultiplicityStringCS= ruleMultiplicityStringCS EOF ;
    public final EObject entryRuleMultiplicityStringCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicityStringCS = null;


        try {
            // InternalCPL.g:7034:61: (iv_ruleMultiplicityStringCS= ruleMultiplicityStringCS EOF )
            // InternalCPL.g:7035:2: iv_ruleMultiplicityStringCS= ruleMultiplicityStringCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicityStringCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMultiplicityStringCS=ruleMultiplicityStringCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicityStringCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicityStringCS"


    // $ANTLR start "ruleMultiplicityStringCS"
    // InternalCPL.g:7041:1: ruleMultiplicityStringCS returns [EObject current=null] : ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) ) ;
    public final EObject ruleMultiplicityStringCS() throws RecognitionException {
        EObject current = null;

        Token lv_stringBounds_0_1=null;
        Token lv_stringBounds_0_2=null;
        Token lv_stringBounds_0_3=null;


        	enterRule();

        try {
            // InternalCPL.g:7047:2: ( ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) ) )
            // InternalCPL.g:7048:2: ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) )
            {
            // InternalCPL.g:7048:2: ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) )
            // InternalCPL.g:7049:3: ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) )
            {
            // InternalCPL.g:7049:3: ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) )
            // InternalCPL.g:7050:4: (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' )
            {
            // InternalCPL.g:7050:4: (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' )
            int alt137=3;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt137=1;
                }
                break;
            case 78:
                {
                alt137=2;
                }
                break;
            case 62:
                {
                alt137=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 137, 0, input);

                throw nvae;
            }

            switch (alt137) {
                case 1 :
                    // InternalCPL.g:7051:5: lv_stringBounds_0_1= '*'
                    {
                    lv_stringBounds_0_1=(Token)match(input,76,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_stringBounds_0_1, grammarAccess.getMultiplicityStringCSAccess().getStringBoundsAsteriskKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getMultiplicityStringCSRule());
                      					}
                      					setWithLastConsumed(current, "stringBounds", lv_stringBounds_0_1, null);
                      				
                    }

                    }
                    break;
                case 2 :
                    // InternalCPL.g:7062:5: lv_stringBounds_0_2= '+'
                    {
                    lv_stringBounds_0_2=(Token)match(input,78,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_stringBounds_0_2, grammarAccess.getMultiplicityStringCSAccess().getStringBoundsPlusSignKeyword_0_1());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getMultiplicityStringCSRule());
                      					}
                      					setWithLastConsumed(current, "stringBounds", lv_stringBounds_0_2, null);
                      				
                    }

                    }
                    break;
                case 3 :
                    // InternalCPL.g:7073:5: lv_stringBounds_0_3= '?'
                    {
                    lv_stringBounds_0_3=(Token)match(input,62,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_stringBounds_0_3, grammarAccess.getMultiplicityStringCSAccess().getStringBoundsQuestionMarkKeyword_0_2());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getMultiplicityStringCSRule());
                      					}
                      					setWithLastConsumed(current, "stringBounds", lv_stringBounds_0_3, null);
                      				
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicityStringCS"


    // $ANTLR start "entryRulePathNameCS"
    // InternalCPL.g:7089:1: entryRulePathNameCS returns [EObject current=null] : iv_rulePathNameCS= rulePathNameCS EOF ;
    public final EObject entryRulePathNameCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathNameCS = null;


        try {
            // InternalCPL.g:7089:51: (iv_rulePathNameCS= rulePathNameCS EOF )
            // InternalCPL.g:7090:2: iv_rulePathNameCS= rulePathNameCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPathNameCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePathNameCS=rulePathNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePathNameCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePathNameCS"


    // $ANTLR start "rulePathNameCS"
    // InternalCPL.g:7096:1: rulePathNameCS returns [EObject current=null] : ( ( (lv_ownedPathElements_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )* ) ;
    public final EObject rulePathNameCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ownedPathElements_0_0 = null;

        EObject lv_ownedPathElements_2_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:7102:2: ( ( ( (lv_ownedPathElements_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )* ) )
            // InternalCPL.g:7103:2: ( ( (lv_ownedPathElements_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )* )
            {
            // InternalCPL.g:7103:2: ( ( (lv_ownedPathElements_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )* )
            // InternalCPL.g:7104:3: ( (lv_ownedPathElements_0_0= ruleFirstPathElementCS ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )*
            {
            // InternalCPL.g:7104:3: ( (lv_ownedPathElements_0_0= ruleFirstPathElementCS ) )
            // InternalCPL.g:7105:4: (lv_ownedPathElements_0_0= ruleFirstPathElementCS )
            {
            // InternalCPL.g:7105:4: (lv_ownedPathElements_0_0= ruleFirstPathElementCS )
            // InternalCPL.g:7106:5: lv_ownedPathElements_0_0= ruleFirstPathElementCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPathNameCSAccess().getOwnedPathElementsFirstPathElementCSParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_46);
            lv_ownedPathElements_0_0=ruleFirstPathElementCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPathNameCSRule());
              					}
              					add(
              						current,
              						"ownedPathElements",
              						lv_ownedPathElements_0_0,
              						"org.eclipse.ocl.xtext.base.Base.FirstPathElementCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCPL.g:7123:3: (otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) ) )*
            loop138:
            do {
                int alt138=2;
                int LA138_0 = input.LA(1);

                if ( (LA138_0==90) ) {
                    alt138=1;
                }


                switch (alt138) {
            	case 1 :
            	    // InternalCPL.g:7124:4: otherlv_1= '::' ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) )
            	    {
            	    otherlv_1=(Token)match(input,90,FollowSets000.FOLLOW_47); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getPathNameCSAccess().getColonColonKeyword_1_0());
            	      			
            	    }
            	    // InternalCPL.g:7128:4: ( (lv_ownedPathElements_2_0= ruleNextPathElementCS ) )
            	    // InternalCPL.g:7129:5: (lv_ownedPathElements_2_0= ruleNextPathElementCS )
            	    {
            	    // InternalCPL.g:7129:5: (lv_ownedPathElements_2_0= ruleNextPathElementCS )
            	    // InternalCPL.g:7130:6: lv_ownedPathElements_2_0= ruleNextPathElementCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPathNameCSAccess().getOwnedPathElementsNextPathElementCSParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_46);
            	    lv_ownedPathElements_2_0=ruleNextPathElementCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getPathNameCSRule());
            	      						}
            	      						add(
            	      							current,
            	      							"ownedPathElements",
            	      							lv_ownedPathElements_2_0,
            	      							"org.eclipse.ocl.xtext.base.Base.NextPathElementCS");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop138;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePathNameCS"


    // $ANTLR start "entryRuleFirstPathElementCS"
    // InternalCPL.g:7152:1: entryRuleFirstPathElementCS returns [EObject current=null] : iv_ruleFirstPathElementCS= ruleFirstPathElementCS EOF ;
    public final EObject entryRuleFirstPathElementCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFirstPathElementCS = null;


        try {
            // InternalCPL.g:7152:59: (iv_ruleFirstPathElementCS= ruleFirstPathElementCS EOF )
            // InternalCPL.g:7153:2: iv_ruleFirstPathElementCS= ruleFirstPathElementCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFirstPathElementCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFirstPathElementCS=ruleFirstPathElementCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFirstPathElementCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFirstPathElementCS"


    // $ANTLR start "ruleFirstPathElementCS"
    // InternalCPL.g:7159:1: ruleFirstPathElementCS returns [EObject current=null] : ( ( ruleUnrestrictedName ) ) ;
    public final EObject ruleFirstPathElementCS() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalCPL.g:7165:2: ( ( ( ruleUnrestrictedName ) ) )
            // InternalCPL.g:7166:2: ( ( ruleUnrestrictedName ) )
            {
            // InternalCPL.g:7166:2: ( ( ruleUnrestrictedName ) )
            // InternalCPL.g:7167:3: ( ruleUnrestrictedName )
            {
            // InternalCPL.g:7167:3: ( ruleUnrestrictedName )
            // InternalCPL.g:7168:4: ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getFirstPathElementCSRule());
              				}
              			
            }
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getFirstPathElementCSAccess().getReferredElementNamedElementCrossReference_0());
              			
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFirstPathElementCS"


    // $ANTLR start "entryRuleNextPathElementCS"
    // InternalCPL.g:7188:1: entryRuleNextPathElementCS returns [EObject current=null] : iv_ruleNextPathElementCS= ruleNextPathElementCS EOF ;
    public final EObject entryRuleNextPathElementCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNextPathElementCS = null;


        try {
            // InternalCPL.g:7188:58: (iv_ruleNextPathElementCS= ruleNextPathElementCS EOF )
            // InternalCPL.g:7189:2: iv_ruleNextPathElementCS= ruleNextPathElementCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNextPathElementCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNextPathElementCS=ruleNextPathElementCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNextPathElementCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNextPathElementCS"


    // $ANTLR start "ruleNextPathElementCS"
    // InternalCPL.g:7195:1: ruleNextPathElementCS returns [EObject current=null] : ( ( ruleUnreservedName ) ) ;
    public final EObject ruleNextPathElementCS() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalCPL.g:7201:2: ( ( ( ruleUnreservedName ) ) )
            // InternalCPL.g:7202:2: ( ( ruleUnreservedName ) )
            {
            // InternalCPL.g:7202:2: ( ( ruleUnreservedName ) )
            // InternalCPL.g:7203:3: ( ruleUnreservedName )
            {
            // InternalCPL.g:7203:3: ( ruleUnreservedName )
            // InternalCPL.g:7204:4: ruleUnreservedName
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getNextPathElementCSRule());
              				}
              			
            }
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getNextPathElementCSAccess().getReferredElementNamedElementCrossReference_0());
              			
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleUnreservedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNextPathElementCS"


    // $ANTLR start "entryRuleTemplateBindingCS"
    // InternalCPL.g:7224:1: entryRuleTemplateBindingCS returns [EObject current=null] : iv_ruleTemplateBindingCS= ruleTemplateBindingCS EOF ;
    public final EObject entryRuleTemplateBindingCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateBindingCS = null;


        try {
            // InternalCPL.g:7224:58: (iv_ruleTemplateBindingCS= ruleTemplateBindingCS EOF )
            // InternalCPL.g:7225:2: iv_ruleTemplateBindingCS= ruleTemplateBindingCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemplateBindingCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTemplateBindingCS=ruleTemplateBindingCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemplateBindingCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemplateBindingCS"


    // $ANTLR start "ruleTemplateBindingCS"
    // InternalCPL.g:7231:1: ruleTemplateBindingCS returns [EObject current=null] : ( ( (lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS ) ) (otherlv_1= ',' ( (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS ) ) )* ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )? ) ;
    public final EObject ruleTemplateBindingCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ownedSubstitutions_0_0 = null;

        EObject lv_ownedSubstitutions_2_0 = null;

        EObject lv_ownedMultiplicity_3_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:7237:2: ( ( ( (lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS ) ) (otherlv_1= ',' ( (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS ) ) )* ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )? ) )
            // InternalCPL.g:7238:2: ( ( (lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS ) ) (otherlv_1= ',' ( (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS ) ) )* ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )? )
            {
            // InternalCPL.g:7238:2: ( ( (lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS ) ) (otherlv_1= ',' ( (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS ) ) )* ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )? )
            // InternalCPL.g:7239:3: ( (lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS ) ) (otherlv_1= ',' ( (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS ) ) )* ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )?
            {
            // InternalCPL.g:7239:3: ( (lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS ) )
            // InternalCPL.g:7240:4: (lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS )
            {
            // InternalCPL.g:7240:4: (lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS )
            // InternalCPL.g:7241:5: lv_ownedSubstitutions_0_0= ruleTemplateParameterSubstitutionCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTemplateBindingCSAccess().getOwnedSubstitutionsTemplateParameterSubstitutionCSParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_89);
            lv_ownedSubstitutions_0_0=ruleTemplateParameterSubstitutionCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTemplateBindingCSRule());
              					}
              					add(
              						current,
              						"ownedSubstitutions",
              						lv_ownedSubstitutions_0_0,
              						"org.eclipse.ocl.xtext.base.Base.TemplateParameterSubstitutionCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCPL.g:7258:3: (otherlv_1= ',' ( (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS ) ) )*
            loop139:
            do {
                int alt139=2;
                int LA139_0 = input.LA(1);

                if ( (LA139_0==52) ) {
                    alt139=1;
                }


                switch (alt139) {
            	case 1 :
            	    // InternalCPL.g:7259:4: otherlv_1= ',' ( (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS ) )
            	    {
            	    otherlv_1=(Token)match(input,52,FollowSets000.FOLLOW_90); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getTemplateBindingCSAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalCPL.g:7263:4: ( (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS ) )
            	    // InternalCPL.g:7264:5: (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS )
            	    {
            	    // InternalCPL.g:7264:5: (lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS )
            	    // InternalCPL.g:7265:6: lv_ownedSubstitutions_2_0= ruleTemplateParameterSubstitutionCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTemplateBindingCSAccess().getOwnedSubstitutionsTemplateParameterSubstitutionCSParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_89);
            	    lv_ownedSubstitutions_2_0=ruleTemplateParameterSubstitutionCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getTemplateBindingCSRule());
            	      						}
            	      						add(
            	      							current,
            	      							"ownedSubstitutions",
            	      							lv_ownedSubstitutions_2_0,
            	      							"org.eclipse.ocl.xtext.base.Base.TemplateParameterSubstitutionCS");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop139;
                }
            } while (true);

            // InternalCPL.g:7283:3: ( (lv_ownedMultiplicity_3_0= ruleMultiplicityCS ) )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==105) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // InternalCPL.g:7284:4: (lv_ownedMultiplicity_3_0= ruleMultiplicityCS )
                    {
                    // InternalCPL.g:7284:4: (lv_ownedMultiplicity_3_0= ruleMultiplicityCS )
                    // InternalCPL.g:7285:5: lv_ownedMultiplicity_3_0= ruleMultiplicityCS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTemplateBindingCSAccess().getOwnedMultiplicityMultiplicityCSParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_ownedMultiplicity_3_0=ruleMultiplicityCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTemplateBindingCSRule());
                      					}
                      					set(
                      						current,
                      						"ownedMultiplicity",
                      						lv_ownedMultiplicity_3_0,
                      						"org.eclipse.ocl.xtext.base.Base.MultiplicityCS");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemplateBindingCS"


    // $ANTLR start "entryRuleTemplateParameterSubstitutionCS"
    // InternalCPL.g:7306:1: entryRuleTemplateParameterSubstitutionCS returns [EObject current=null] : iv_ruleTemplateParameterSubstitutionCS= ruleTemplateParameterSubstitutionCS EOF ;
    public final EObject entryRuleTemplateParameterSubstitutionCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateParameterSubstitutionCS = null;


        try {
            // InternalCPL.g:7306:72: (iv_ruleTemplateParameterSubstitutionCS= ruleTemplateParameterSubstitutionCS EOF )
            // InternalCPL.g:7307:2: iv_ruleTemplateParameterSubstitutionCS= ruleTemplateParameterSubstitutionCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemplateParameterSubstitutionCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTemplateParameterSubstitutionCS=ruleTemplateParameterSubstitutionCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemplateParameterSubstitutionCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemplateParameterSubstitutionCS"


    // $ANTLR start "ruleTemplateParameterSubstitutionCS"
    // InternalCPL.g:7313:1: ruleTemplateParameterSubstitutionCS returns [EObject current=null] : ( (lv_ownedActualParameter_0_0= ruleTypeRefCS ) ) ;
    public final EObject ruleTemplateParameterSubstitutionCS() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedActualParameter_0_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:7319:2: ( ( (lv_ownedActualParameter_0_0= ruleTypeRefCS ) ) )
            // InternalCPL.g:7320:2: ( (lv_ownedActualParameter_0_0= ruleTypeRefCS ) )
            {
            // InternalCPL.g:7320:2: ( (lv_ownedActualParameter_0_0= ruleTypeRefCS ) )
            // InternalCPL.g:7321:3: (lv_ownedActualParameter_0_0= ruleTypeRefCS )
            {
            // InternalCPL.g:7321:3: (lv_ownedActualParameter_0_0= ruleTypeRefCS )
            // InternalCPL.g:7322:4: lv_ownedActualParameter_0_0= ruleTypeRefCS
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getTemplateParameterSubstitutionCSAccess().getOwnedActualParameterTypeRefCSParserRuleCall_0());
              			
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_ownedActualParameter_0_0=ruleTypeRefCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getTemplateParameterSubstitutionCSRule());
              				}
              				set(
              					current,
              					"ownedActualParameter",
              					lv_ownedActualParameter_0_0,
              					"org.eclipse.ocl.xtext.base.Base.TypeRefCS");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemplateParameterSubstitutionCS"


    // $ANTLR start "entryRuleTypeParameterCS"
    // InternalCPL.g:7342:1: entryRuleTypeParameterCS returns [EObject current=null] : iv_ruleTypeParameterCS= ruleTypeParameterCS EOF ;
    public final EObject entryRuleTypeParameterCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeParameterCS = null;


        try {
            // InternalCPL.g:7342:56: (iv_ruleTypeParameterCS= ruleTypeParameterCS EOF )
            // InternalCPL.g:7343:2: iv_ruleTypeParameterCS= ruleTypeParameterCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeParameterCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypeParameterCS=ruleTypeParameterCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeParameterCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeParameterCS"


    // $ANTLR start "ruleTypeParameterCS"
    // InternalCPL.g:7349:1: ruleTypeParameterCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )* )? ) ;
    public final EObject ruleTypeParameterCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedExtends_2_0 = null;

        EObject lv_ownedExtends_4_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:7355:2: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )* )? ) )
            // InternalCPL.g:7356:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )* )? )
            {
            // InternalCPL.g:7356:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )* )? )
            // InternalCPL.g:7357:3: ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )* )?
            {
            // InternalCPL.g:7357:3: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // InternalCPL.g:7358:4: (lv_name_0_0= ruleUnrestrictedName )
            {
            // InternalCPL.g:7358:4: (lv_name_0_0= ruleUnrestrictedName )
            // InternalCPL.g:7359:5: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypeParameterCSAccess().getNameUnrestrictedNameParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_91);
            lv_name_0_0=ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTypeParameterCSRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.ocl.xtext.completeocl.CompleteOCL.UnrestrictedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCPL.g:7376:3: (otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )* )?
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==119) ) {
                alt142=1;
            }
            switch (alt142) {
                case 1 :
                    // InternalCPL.g:7377:4: otherlv_1= 'extends' ( (lv_ownedExtends_2_0= ruleTypedRefCS ) ) (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )*
                    {
                    otherlv_1=(Token)match(input,119,FollowSets000.FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getTypeParameterCSAccess().getExtendsKeyword_1_0());
                      			
                    }
                    // InternalCPL.g:7381:4: ( (lv_ownedExtends_2_0= ruleTypedRefCS ) )
                    // InternalCPL.g:7382:5: (lv_ownedExtends_2_0= ruleTypedRefCS )
                    {
                    // InternalCPL.g:7382:5: (lv_ownedExtends_2_0= ruleTypedRefCS )
                    // InternalCPL.g:7383:6: lv_ownedExtends_2_0= ruleTypedRefCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTypeParameterCSAccess().getOwnedExtendsTypedRefCSParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_92);
                    lv_ownedExtends_2_0=ruleTypedRefCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTypeParameterCSRule());
                      						}
                      						add(
                      							current,
                      							"ownedExtends",
                      							lv_ownedExtends_2_0,
                      							"org.eclipse.ocl.xtext.completeocl.CompleteOCL.TypedRefCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalCPL.g:7400:4: (otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) ) )*
                    loop141:
                    do {
                        int alt141=2;
                        int LA141_0 = input.LA(1);

                        if ( (LA141_0==120) ) {
                            alt141=1;
                        }


                        switch (alt141) {
                    	case 1 :
                    	    // InternalCPL.g:7401:5: otherlv_3= '&&' ( (lv_ownedExtends_4_0= ruleTypedRefCS ) )
                    	    {
                    	    otherlv_3=(Token)match(input,120,FollowSets000.FOLLOW_38); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getTypeParameterCSAccess().getAmpersandAmpersandKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalCPL.g:7405:5: ( (lv_ownedExtends_4_0= ruleTypedRefCS ) )
                    	    // InternalCPL.g:7406:6: (lv_ownedExtends_4_0= ruleTypedRefCS )
                    	    {
                    	    // InternalCPL.g:7406:6: (lv_ownedExtends_4_0= ruleTypedRefCS )
                    	    // InternalCPL.g:7407:7: lv_ownedExtends_4_0= ruleTypedRefCS
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getTypeParameterCSAccess().getOwnedExtendsTypedRefCSParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_92);
                    	    lv_ownedExtends_4_0=ruleTypedRefCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getTypeParameterCSRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"ownedExtends",
                    	      								lv_ownedExtends_4_0,
                    	      								"org.eclipse.ocl.xtext.completeocl.CompleteOCL.TypedRefCS");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop141;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeParameterCS"


    // $ANTLR start "entryRuleTypeRefCS"
    // InternalCPL.g:7430:1: entryRuleTypeRefCS returns [EObject current=null] : iv_ruleTypeRefCS= ruleTypeRefCS EOF ;
    public final EObject entryRuleTypeRefCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeRefCS = null;


        try {
            // InternalCPL.g:7430:50: (iv_ruleTypeRefCS= ruleTypeRefCS EOF )
            // InternalCPL.g:7431:2: iv_ruleTypeRefCS= ruleTypeRefCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRefCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypeRefCS=ruleTypeRefCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeRefCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeRefCS"


    // $ANTLR start "ruleTypeRefCS"
    // InternalCPL.g:7437:1: ruleTypeRefCS returns [EObject current=null] : (this_TypedRefCS_0= ruleTypedRefCS | this_WildcardTypeRefCS_1= ruleWildcardTypeRefCS ) ;
    public final EObject ruleTypeRefCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypedRefCS_0 = null;

        EObject this_WildcardTypeRefCS_1 = null;



        	enterRule();

        try {
            // InternalCPL.g:7443:2: ( (this_TypedRefCS_0= ruleTypedRefCS | this_WildcardTypeRefCS_1= ruleWildcardTypeRefCS ) )
            // InternalCPL.g:7444:2: (this_TypedRefCS_0= ruleTypedRefCS | this_WildcardTypeRefCS_1= ruleWildcardTypeRefCS )
            {
            // InternalCPL.g:7444:2: (this_TypedRefCS_0= ruleTypedRefCS | this_WildcardTypeRefCS_1= ruleWildcardTypeRefCS )
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( ((LA143_0>=RULE_SIMPLE_ID && LA143_0<=RULE_ESCAPED_ID)||LA143_0==22||(LA143_0>=53 && LA143_0<=54)||(LA143_0>=63 && LA143_0<=72)||(LA143_0>=88 && LA143_0<=89)||(LA143_0>=91 && LA143_0<=95)) ) {
                alt143=1;
            }
            else if ( (LA143_0==62) ) {
                alt143=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 143, 0, input);

                throw nvae;
            }
            switch (alt143) {
                case 1 :
                    // InternalCPL.g:7445:3: this_TypedRefCS_0= ruleTypedRefCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeRefCSAccess().getTypedRefCSParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TypedRefCS_0=ruleTypedRefCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TypedRefCS_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCPL.g:7457:3: this_WildcardTypeRefCS_1= ruleWildcardTypeRefCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeRefCSAccess().getWildcardTypeRefCSParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_WildcardTypeRefCS_1=ruleWildcardTypeRefCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_WildcardTypeRefCS_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeRefCS"


    // $ANTLR start "entryRuleTypedTypeRefCS"
    // InternalCPL.g:7472:1: entryRuleTypedTypeRefCS returns [EObject current=null] : iv_ruleTypedTypeRefCS= ruleTypedTypeRefCS EOF ;
    public final EObject entryRuleTypedTypeRefCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedTypeRefCS = null;


        try {
            // InternalCPL.g:7472:55: (iv_ruleTypedTypeRefCS= ruleTypedTypeRefCS EOF )
            // InternalCPL.g:7473:2: iv_ruleTypedTypeRefCS= ruleTypedTypeRefCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedTypeRefCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypedTypeRefCS=ruleTypedTypeRefCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypedTypeRefCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypedTypeRefCS"


    // $ANTLR start "ruleTypedTypeRefCS"
    // InternalCPL.g:7479:1: ruleTypedTypeRefCS returns [EObject current=null] : ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) (otherlv_1= '(' ( (lv_ownedBinding_2_0= ruleTemplateBindingCS ) ) otherlv_3= ')' )? ) ;
    public final EObject ruleTypedTypeRefCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ownedPathName_0_0 = null;

        EObject lv_ownedBinding_2_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:7485:2: ( ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) (otherlv_1= '(' ( (lv_ownedBinding_2_0= ruleTemplateBindingCS ) ) otherlv_3= ')' )? ) )
            // InternalCPL.g:7486:2: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) (otherlv_1= '(' ( (lv_ownedBinding_2_0= ruleTemplateBindingCS ) ) otherlv_3= ')' )? )
            {
            // InternalCPL.g:7486:2: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) (otherlv_1= '(' ( (lv_ownedBinding_2_0= ruleTemplateBindingCS ) ) otherlv_3= ')' )? )
            // InternalCPL.g:7487:3: ( (lv_ownedPathName_0_0= rulePathNameCS ) ) (otherlv_1= '(' ( (lv_ownedBinding_2_0= ruleTemplateBindingCS ) ) otherlv_3= ')' )?
            {
            // InternalCPL.g:7487:3: ( (lv_ownedPathName_0_0= rulePathNameCS ) )
            // InternalCPL.g:7488:4: (lv_ownedPathName_0_0= rulePathNameCS )
            {
            // InternalCPL.g:7488:4: (lv_ownedPathName_0_0= rulePathNameCS )
            // InternalCPL.g:7489:5: lv_ownedPathName_0_0= rulePathNameCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypedTypeRefCSAccess().getOwnedPathNamePathNameCSParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_48);
            lv_ownedPathName_0_0=rulePathNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTypedTypeRefCSRule());
              					}
              					set(
              						current,
              						"ownedPathName",
              						lv_ownedPathName_0_0,
              						"org.eclipse.ocl.xtext.base.Base.PathNameCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCPL.g:7506:3: (otherlv_1= '(' ( (lv_ownedBinding_2_0= ruleTemplateBindingCS ) ) otherlv_3= ')' )?
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==44) ) {
                alt144=1;
            }
            switch (alt144) {
                case 1 :
                    // InternalCPL.g:7507:4: otherlv_1= '(' ( (lv_ownedBinding_2_0= ruleTemplateBindingCS ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,44,FollowSets000.FOLLOW_90); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getTypedTypeRefCSAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalCPL.g:7511:4: ( (lv_ownedBinding_2_0= ruleTemplateBindingCS ) )
                    // InternalCPL.g:7512:5: (lv_ownedBinding_2_0= ruleTemplateBindingCS )
                    {
                    // InternalCPL.g:7512:5: (lv_ownedBinding_2_0= ruleTemplateBindingCS )
                    // InternalCPL.g:7513:6: lv_ownedBinding_2_0= ruleTemplateBindingCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTypedTypeRefCSAccess().getOwnedBindingTemplateBindingCSParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_31);
                    lv_ownedBinding_2_0=ruleTemplateBindingCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTypedTypeRefCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedBinding",
                      							lv_ownedBinding_2_0,
                      							"org.eclipse.ocl.xtext.base.Base.TemplateBindingCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getTypedTypeRefCSAccess().getRightParenthesisKeyword_1_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypedTypeRefCS"


    // $ANTLR start "entryRuleWildcardTypeRefCS"
    // InternalCPL.g:7539:1: entryRuleWildcardTypeRefCS returns [EObject current=null] : iv_ruleWildcardTypeRefCS= ruleWildcardTypeRefCS EOF ;
    public final EObject entryRuleWildcardTypeRefCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWildcardTypeRefCS = null;


        try {
            // InternalCPL.g:7539:58: (iv_ruleWildcardTypeRefCS= ruleWildcardTypeRefCS EOF )
            // InternalCPL.g:7540:2: iv_ruleWildcardTypeRefCS= ruleWildcardTypeRefCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWildcardTypeRefCSRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleWildcardTypeRefCS=ruleWildcardTypeRefCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWildcardTypeRefCS; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWildcardTypeRefCS"


    // $ANTLR start "ruleWildcardTypeRefCS"
    // InternalCPL.g:7546:1: ruleWildcardTypeRefCS returns [EObject current=null] : ( () otherlv_1= '?' (otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) ) )? ) ;
    public final EObject ruleWildcardTypeRefCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_ownedExtends_3_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:7552:2: ( ( () otherlv_1= '?' (otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) ) )? ) )
            // InternalCPL.g:7553:2: ( () otherlv_1= '?' (otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) ) )? )
            {
            // InternalCPL.g:7553:2: ( () otherlv_1= '?' (otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) ) )? )
            // InternalCPL.g:7554:3: () otherlv_1= '?' (otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) ) )?
            {
            // InternalCPL.g:7554:3: ()
            // InternalCPL.g:7555:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getWildcardTypeRefCSAccess().getWildcardTypeRefCSAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,62,FollowSets000.FOLLOW_91); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getWildcardTypeRefCSAccess().getQuestionMarkKeyword_1());
              		
            }
            // InternalCPL.g:7568:3: (otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) ) )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==119) ) {
                alt145=1;
            }
            switch (alt145) {
                case 1 :
                    // InternalCPL.g:7569:4: otherlv_2= 'extends' ( (lv_ownedExtends_3_0= ruleTypedRefCS ) )
                    {
                    otherlv_2=(Token)match(input,119,FollowSets000.FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getWildcardTypeRefCSAccess().getExtendsKeyword_2_0());
                      			
                    }
                    // InternalCPL.g:7573:4: ( (lv_ownedExtends_3_0= ruleTypedRefCS ) )
                    // InternalCPL.g:7574:5: (lv_ownedExtends_3_0= ruleTypedRefCS )
                    {
                    // InternalCPL.g:7574:5: (lv_ownedExtends_3_0= ruleTypedRefCS )
                    // InternalCPL.g:7575:6: lv_ownedExtends_3_0= ruleTypedRefCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getWildcardTypeRefCSAccess().getOwnedExtendsTypedRefCSParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_ownedExtends_3_0=ruleTypedRefCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getWildcardTypeRefCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedExtends",
                      							lv_ownedExtends_3_0,
                      							"org.eclipse.ocl.xtext.completeocl.CompleteOCL.TypedRefCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWildcardTypeRefCS"


    // $ANTLR start "entryRuleID"
    // InternalCPL.g:7597:1: entryRuleID returns [String current=null] : iv_ruleID= ruleID EOF ;
    public final String entryRuleID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleID = null;


        try {
            // InternalCPL.g:7597:42: (iv_ruleID= ruleID EOF )
            // InternalCPL.g:7598:2: iv_ruleID= ruleID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleID=ruleID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleID.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleID"


    // $ANTLR start "ruleID"
    // InternalCPL.g:7604:1: ruleID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SIMPLE_ID_0= RULE_SIMPLE_ID | this_ESCAPED_ID_1= RULE_ESCAPED_ID ) ;
    public final AntlrDatatypeRuleToken ruleID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SIMPLE_ID_0=null;
        Token this_ESCAPED_ID_1=null;


        	enterRule();

        try {
            // InternalCPL.g:7610:2: ( (this_SIMPLE_ID_0= RULE_SIMPLE_ID | this_ESCAPED_ID_1= RULE_ESCAPED_ID ) )
            // InternalCPL.g:7611:2: (this_SIMPLE_ID_0= RULE_SIMPLE_ID | this_ESCAPED_ID_1= RULE_ESCAPED_ID )
            {
            // InternalCPL.g:7611:2: (this_SIMPLE_ID_0= RULE_SIMPLE_ID | this_ESCAPED_ID_1= RULE_ESCAPED_ID )
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==RULE_SIMPLE_ID) ) {
                alt146=1;
            }
            else if ( (LA146_0==RULE_ESCAPED_ID) ) {
                alt146=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 146, 0, input);

                throw nvae;
            }
            switch (alt146) {
                case 1 :
                    // InternalCPL.g:7612:3: this_SIMPLE_ID_0= RULE_SIMPLE_ID
                    {
                    this_SIMPLE_ID_0=(Token)match(input,RULE_SIMPLE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_SIMPLE_ID_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_SIMPLE_ID_0, grammarAccess.getIDAccess().getSIMPLE_IDTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCPL.g:7620:3: this_ESCAPED_ID_1= RULE_ESCAPED_ID
                    {
                    this_ESCAPED_ID_1=(Token)match(input,RULE_ESCAPED_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ESCAPED_ID_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ESCAPED_ID_1, grammarAccess.getIDAccess().getESCAPED_IDTerminalRuleCall_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleID"


    // $ANTLR start "entryRuleIdentifier"
    // InternalCPL.g:7631:1: entryRuleIdentifier returns [String current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final String entryRuleIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdentifier = null;


        try {
            // InternalCPL.g:7631:50: (iv_ruleIdentifier= ruleIdentifier EOF )
            // InternalCPL.g:7632:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentifierRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIdentifier=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdentifier.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdentifier"


    // $ANTLR start "ruleIdentifier"
    // InternalCPL.g:7638:1: ruleIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= ruleID ;
    public final AntlrDatatypeRuleToken ruleIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ID_0 = null;



        	enterRule();

        try {
            // InternalCPL.g:7644:2: (this_ID_0= ruleID )
            // InternalCPL.g:7645:2: this_ID_0= ruleID
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getIdentifierAccess().getIDParserRuleCall());
              	
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_ID_0=ruleID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIdentifier"


    // $ANTLR start "entryRuleLOWER"
    // InternalCPL.g:7658:1: entryRuleLOWER returns [String current=null] : iv_ruleLOWER= ruleLOWER EOF ;
    public final String entryRuleLOWER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLOWER = null;


        try {
            // InternalCPL.g:7658:45: (iv_ruleLOWER= ruleLOWER EOF )
            // InternalCPL.g:7659:2: iv_ruleLOWER= ruleLOWER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLOWERRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLOWER=ruleLOWER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLOWER.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLOWER"


    // $ANTLR start "ruleLOWER"
    // InternalCPL.g:7665:1: ruleLOWER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleLOWER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalCPL.g:7671:2: (this_INT_0= RULE_INT )
            // InternalCPL.g:7672:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_INT_0, grammarAccess.getLOWERAccess().getINTTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLOWER"


    // $ANTLR start "entryRuleNUMBER_LITERAL"
    // InternalCPL.g:7682:1: entryRuleNUMBER_LITERAL returns [String current=null] : iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF ;
    public final String entryRuleNUMBER_LITERAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER_LITERAL = null;


        try {
            // InternalCPL.g:7682:54: (iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF )
            // InternalCPL.g:7683:2: iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNUMBER_LITERALRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNUMBER_LITERAL=ruleNUMBER_LITERAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNUMBER_LITERAL.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNUMBER_LITERAL"


    // $ANTLR start "ruleNUMBER_LITERAL"
    // InternalCPL.g:7689:1: ruleNUMBER_LITERAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleNUMBER_LITERAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalCPL.g:7695:2: (this_INT_0= RULE_INT )
            // InternalCPL.g:7696:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_INT_0, grammarAccess.getNUMBER_LITERALAccess().getINTTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNUMBER_LITERAL"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalCPL.g:7706:1: entryRuleStringLiteral returns [String current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final String entryRuleStringLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringLiteral = null;


        try {
            // InternalCPL.g:7706:53: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalCPL.g:7707:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalCPL.g:7713:1: ruleStringLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING ;
    public final AntlrDatatypeRuleToken ruleStringLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SINGLE_QUOTED_STRING_0=null;


        	enterRule();

        try {
            // InternalCPL.g:7719:2: (this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING )
            // InternalCPL.g:7720:2: this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING
            {
            this_SINGLE_QUOTED_STRING_0=(Token)match(input,RULE_SINGLE_QUOTED_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_SINGLE_QUOTED_STRING_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_SINGLE_QUOTED_STRING_0, grammarAccess.getStringLiteralAccess().getSINGLE_QUOTED_STRINGTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleUPPER"
    // InternalCPL.g:7730:1: entryRuleUPPER returns [String current=null] : iv_ruleUPPER= ruleUPPER EOF ;
    public final String entryRuleUPPER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUPPER = null;


        try {
            // InternalCPL.g:7730:45: (iv_ruleUPPER= ruleUPPER EOF )
            // InternalCPL.g:7731:2: iv_ruleUPPER= ruleUPPER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUPPERRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleUPPER=ruleUPPER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUPPER.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUPPER"


    // $ANTLR start "ruleUPPER"
    // InternalCPL.g:7737:1: ruleUPPER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleUPPER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalCPL.g:7743:2: ( (this_INT_0= RULE_INT | kw= '*' ) )
            // InternalCPL.g:7744:2: (this_INT_0= RULE_INT | kw= '*' )
            {
            // InternalCPL.g:7744:2: (this_INT_0= RULE_INT | kw= '*' )
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==RULE_INT) ) {
                alt147=1;
            }
            else if ( (LA147_0==76) ) {
                alt147=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 147, 0, input);

                throw nvae;
            }
            switch (alt147) {
                case 1 :
                    // InternalCPL.g:7745:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_INT_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_INT_0, grammarAccess.getUPPERAccess().getINTTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalCPL.g:7753:3: kw= '*'
                    {
                    kw=(Token)match(input,76,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getUPPERAccess().getAsteriskKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUPPER"


    // $ANTLR start "entryRuleURI"
    // InternalCPL.g:7762:1: entryRuleURI returns [String current=null] : iv_ruleURI= ruleURI EOF ;
    public final String entryRuleURI() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleURI = null;


        try {
            // InternalCPL.g:7762:43: (iv_ruleURI= ruleURI EOF )
            // InternalCPL.g:7763:2: iv_ruleURI= ruleURI EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getURIRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleURI=ruleURI();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleURI.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleURI"


    // $ANTLR start "ruleURI"
    // InternalCPL.g:7769:1: ruleURI returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING ;
    public final AntlrDatatypeRuleToken ruleURI() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SINGLE_QUOTED_STRING_0=null;


        	enterRule();

        try {
            // InternalCPL.g:7775:2: (this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING )
            // InternalCPL.g:7776:2: this_SINGLE_QUOTED_STRING_0= RULE_SINGLE_QUOTED_STRING
            {
            this_SINGLE_QUOTED_STRING_0=(Token)match(input,RULE_SINGLE_QUOTED_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_SINGLE_QUOTED_STRING_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_SINGLE_QUOTED_STRING_0, grammarAccess.getURIAccess().getSINGLE_QUOTED_STRINGTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleURI"

    // $ANTLR start synpred13_InternalCPL
    public final void synpred13_InternalCPL_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_ownedElementA_0_0 = null;


        // InternalCPL.g:465:4: ( (lv_ownedElementA_0_0= ruleFQN ) )
        // InternalCPL.g:465:4: (lv_ownedElementA_0_0= ruleFQN )
        {
        // InternalCPL.g:465:4: (lv_ownedElementA_0_0= ruleFQN )
        // InternalCPL.g:466:5: lv_ownedElementA_0_0= ruleFQN
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getConditionCSAccess().getOwnedElementAFQNParserRuleCall_0_0());
          				
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_ownedElementA_0_0=ruleFQN();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalCPL

    // $ANTLR start synpred25_InternalCPL
    public final void synpred25_InternalCPL_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_UnrestrictedName_0 = null;


        // InternalCPL.g:578:4: (this_UnrestrictedName_0= ruleUnrestrictedName )
        // InternalCPL.g:578:4: this_UnrestrictedName_0= ruleUnrestrictedName
        {
        if ( state.backtracking==0 ) {

          				newCompositeNode(grammarAccess.getFQNAccess().getUnrestrictedNameParserRuleCall_0_0());
          			
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_UnrestrictedName_0=ruleUnrestrictedName();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_InternalCPL

    // $ANTLR start synpred27_InternalCPL
    public final void synpred27_InternalCPL_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_UnrestrictedName_4 = null;


        // InternalCPL.g:615:5: (this_UnrestrictedName_4= ruleUnrestrictedName )
        // InternalCPL.g:615:5: this_UnrestrictedName_4= ruleUnrestrictedName
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getFQNAccess().getUnrestrictedNameParserRuleCall_1_1_0());
          				
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_UnrestrictedName_4=ruleUnrestrictedName();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_InternalCPL

    // $ANTLR start synpred38_InternalCPL
    public final void synpred38_InternalCPL_fragment() throws RecognitionException {   
        EObject this_PropertyContextDeclCS_0 = null;


        // InternalCPL.g:920:3: (this_PropertyContextDeclCS_0= rulePropertyContextDeclCS )
        // InternalCPL.g:920:3: this_PropertyContextDeclCS_0= rulePropertyContextDeclCS
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_PropertyContextDeclCS_0=rulePropertyContextDeclCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred38_InternalCPL

    // $ANTLR start synpred39_InternalCPL
    public final void synpred39_InternalCPL_fragment() throws RecognitionException {   
        EObject this_ClassifierContextDeclCS_1 = null;


        // InternalCPL.g:932:3: (this_ClassifierContextDeclCS_1= ruleClassifierContextDeclCS )
        // InternalCPL.g:932:3: this_ClassifierContextDeclCS_1= ruleClassifierContextDeclCS
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_ClassifierContextDeclCS_1=ruleClassifierContextDeclCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_InternalCPL

    // $ANTLR start synpred153_InternalCPL
    public final void synpred153_InternalCPL_fragment() throws RecognitionException {   
        EObject this_TypeLiteralCS_1 = null;


        // InternalCPL.g:4787:3: (this_TypeLiteralCS_1= ruleTypeLiteralCS )
        // InternalCPL.g:4787:3: this_TypeLiteralCS_1= ruleTypeLiteralCS
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_TypeLiteralCS_1=ruleTypeLiteralCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred153_InternalCPL

    // $ANTLR start synpred156_InternalCPL
    public final void synpred156_InternalCPL_fragment() throws RecognitionException {   
        EObject this_PrefixedPrimaryExpCS_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_ownedRight_3_0 = null;


        // InternalCPL.g:4878:3: ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) )
        // InternalCPL.g:4878:3: (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? )
        {
        // InternalCPL.g:4878:3: (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? )
        // InternalCPL.g:4879:4: this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )?
        {
        if ( state.backtracking==0 ) {

          				/* */
          			
        }
        pushFollow(FollowSets000.FOLLOW_63);
        this_PrefixedPrimaryExpCS_0=rulePrefixedPrimaryExpCS();

        state._fsp--;
        if (state.failed) return ;
        // InternalCPL.g:4890:4: ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )?
        int alt171=2;
        int LA171_0 = input.LA(1);

        if ( ((LA171_0>=27 && LA171_0<=28)||(LA171_0>=33 && LA171_0<=36)||LA171_0==38||(LA171_0>=42 && LA171_0<=43)||(LA171_0>=46 && LA171_0<=47)||LA171_0==73||(LA171_0>=76 && LA171_0<=87)) ) {
            alt171=1;
        }
        switch (alt171) {
            case 1 :
                // InternalCPL.g:4891:5: () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) )
                {
                // InternalCPL.g:4891:5: ()
                // InternalCPL.g:4892:6: 
                {
                if ( state.backtracking==0 ) {

                  						/* */
                  					
                }

                }

                // InternalCPL.g:4901:5: ( (lv_name_2_0= ruleBinaryOperatorName ) )
                // InternalCPL.g:4902:6: (lv_name_2_0= ruleBinaryOperatorName )
                {
                // InternalCPL.g:4902:6: (lv_name_2_0= ruleBinaryOperatorName )
                // InternalCPL.g:4903:7: lv_name_2_0= ruleBinaryOperatorName
                {
                if ( state.backtracking==0 ) {

                  							newCompositeNode(grammarAccess.getExpCSAccess().getNameBinaryOperatorNameParserRuleCall_0_1_1_0());
                  						
                }
                pushFollow(FollowSets000.FOLLOW_55);
                lv_name_2_0=ruleBinaryOperatorName();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // InternalCPL.g:4920:5: ( (lv_ownedRight_3_0= ruleExpCS ) )
                // InternalCPL.g:4921:6: (lv_ownedRight_3_0= ruleExpCS )
                {
                // InternalCPL.g:4921:6: (lv_ownedRight_3_0= ruleExpCS )
                // InternalCPL.g:4922:7: lv_ownedRight_3_0= ruleExpCS
                {
                if ( state.backtracking==0 ) {

                  							newCompositeNode(grammarAccess.getExpCSAccess().getOwnedRightExpCSParserRuleCall_0_1_2_0());
                  						
                }
                pushFollow(FollowSets000.FOLLOW_2);
                lv_ownedRight_3_0=ruleExpCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred156_InternalCPL

    // $ANTLR start synpred163_InternalCPL
    public final void synpred163_InternalCPL_fragment() throws RecognitionException {   
        EObject this_TupleLiteralExpCS_4 = null;


        // InternalCPL.g:5182:3: (this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS )
        // InternalCPL.g:5182:3: this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_TupleLiteralExpCS_4=ruleTupleLiteralExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred163_InternalCPL

    // $ANTLR start synpred164_InternalCPL
    public final void synpred164_InternalCPL_fragment() throws RecognitionException {   
        EObject this_MapLiteralExpCS_5 = null;


        // InternalCPL.g:5194:3: (this_MapLiteralExpCS_5= ruleMapLiteralExpCS )
        // InternalCPL.g:5194:3: this_MapLiteralExpCS_5= ruleMapLiteralExpCS
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_MapLiteralExpCS_5=ruleMapLiteralExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred164_InternalCPL

    // $ANTLR start synpred165_InternalCPL
    public final void synpred165_InternalCPL_fragment() throws RecognitionException {   
        EObject this_CollectionLiteralExpCS_6 = null;


        // InternalCPL.g:5206:3: (this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS )
        // InternalCPL.g:5206:3: this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_CollectionLiteralExpCS_6=ruleCollectionLiteralExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred165_InternalCPL

    // $ANTLR start synpred167_InternalCPL
    public final void synpred167_InternalCPL_fragment() throws RecognitionException {   
        EObject this_TypeLiteralExpCS_8 = null;


        // InternalCPL.g:5230:3: (this_TypeLiteralExpCS_8= ruleTypeLiteralExpCS )
        // InternalCPL.g:5230:3: this_TypeLiteralExpCS_8= ruleTypeLiteralExpCS
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_TypeLiteralExpCS_8=ruleTypeLiteralExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred167_InternalCPL

    // $ANTLR start synpred180_InternalCPL
    public final void synpred180_InternalCPL_fragment() throws RecognitionException {   
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ownedCoIterator_2_0 = null;

        EObject lv_ownedInitExpression_4_0 = null;


        // InternalCPL.g:5673:5: ( (otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) )
        // InternalCPL.g:5673:5: (otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? )
        {
        // InternalCPL.g:5673:5: (otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? )
        // InternalCPL.g:5674:6: otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )?
        {
        otherlv_1=(Token)match(input,99,FollowSets000.FOLLOW_7); if (state.failed) return ;
        // InternalCPL.g:5678:6: ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) )
        // InternalCPL.g:5679:7: (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS )
        {
        // InternalCPL.g:5679:7: (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS )
        // InternalCPL.g:5680:8: lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_0_1_0_1_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_74);
        lv_ownedCoIterator_2_0=ruleCoIteratorVariableCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalCPL.g:5697:6: (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )?
        int alt176=2;
        int LA176_0 = input.LA(1);

        if ( (LA176_0==35) ) {
            alt176=1;
        }
        switch (alt176) {
            case 1 :
                // InternalCPL.g:5698:7: otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) )
                {
                otherlv_3=(Token)match(input,35,FollowSets000.FOLLOW_55); if (state.failed) return ;
                // InternalCPL.g:5702:7: ( (lv_ownedInitExpression_4_0= ruleExpCS ) )
                // InternalCPL.g:5703:8: (lv_ownedInitExpression_4_0= ruleExpCS )
                {
                // InternalCPL.g:5703:8: (lv_ownedInitExpression_4_0= ruleExpCS )
                // InternalCPL.g:5704:9: lv_ownedInitExpression_4_0= ruleExpCS
                {
                if ( state.backtracking==0 ) {

                  									newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_0_1_0_2_1_0());
                  								
                }
                pushFollow(FollowSets000.FOLLOW_2);
                lv_ownedInitExpression_4_0=ruleExpCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred180_InternalCPL

    // $ANTLR start synpred183_InternalCPL
    public final void synpred183_InternalCPL_fragment() throws RecognitionException {   
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_ownedType_6_0 = null;

        EObject lv_ownedCoIterator_8_0 = null;

        EObject lv_ownedInitExpression_10_0 = null;


        // InternalCPL.g:5724:5: ( (otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) )
        // InternalCPL.g:5724:5: (otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? )
        {
        // InternalCPL.g:5724:5: (otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? )
        // InternalCPL.g:5725:6: otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )?
        {
        otherlv_5=(Token)match(input,24,FollowSets000.FOLLOW_38); if (state.failed) return ;
        // InternalCPL.g:5729:6: ( (lv_ownedType_6_0= ruleTypeExpCS ) )
        // InternalCPL.g:5730:7: (lv_ownedType_6_0= ruleTypeExpCS )
        {
        // InternalCPL.g:5730:7: (lv_ownedType_6_0= ruleTypeExpCS )
        // InternalCPL.g:5731:8: lv_ownedType_6_0= ruleTypeExpCS
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_0_1_1_1_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_75);
        lv_ownedType_6_0=ruleTypeExpCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalCPL.g:5748:6: (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )?
        int alt177=2;
        int LA177_0 = input.LA(1);

        if ( (LA177_0==99) ) {
            alt177=1;
        }
        switch (alt177) {
            case 1 :
                // InternalCPL.g:5749:7: otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) )
                {
                otherlv_7=(Token)match(input,99,FollowSets000.FOLLOW_7); if (state.failed) return ;
                // InternalCPL.g:5753:7: ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) )
                // InternalCPL.g:5754:8: (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS )
                {
                // InternalCPL.g:5754:8: (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS )
                // InternalCPL.g:5755:9: lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS
                {
                if ( state.backtracking==0 ) {

                  									newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_0_1_1_2_1_0());
                  								
                }
                pushFollow(FollowSets000.FOLLOW_74);
                lv_ownedCoIterator_8_0=ruleCoIteratorVariableCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }

        // InternalCPL.g:5773:6: (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )?
        int alt178=2;
        int LA178_0 = input.LA(1);

        if ( (LA178_0==35) ) {
            alt178=1;
        }
        switch (alt178) {
            case 1 :
                // InternalCPL.g:5774:7: otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) )
                {
                otherlv_9=(Token)match(input,35,FollowSets000.FOLLOW_55); if (state.failed) return ;
                // InternalCPL.g:5778:7: ( (lv_ownedInitExpression_10_0= ruleExpCS ) )
                // InternalCPL.g:5779:8: (lv_ownedInitExpression_10_0= ruleExpCS )
                {
                // InternalCPL.g:5779:8: (lv_ownedInitExpression_10_0= ruleExpCS )
                // InternalCPL.g:5780:9: lv_ownedInitExpression_10_0= ruleExpCS
                {
                if ( state.backtracking==0 ) {

                  									newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_0_1_1_3_1_0());
                  								
                }
                pushFollow(FollowSets000.FOLLOW_2);
                lv_ownedInitExpression_10_0=ruleExpCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred183_InternalCPL

    // $ANTLR start synpred186_InternalCPL
    public final void synpred186_InternalCPL_fragment() throws RecognitionException {   
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_ownedType_12_0 = null;

        EObject lv_ownedCoIterator_14_0 = null;

        EObject lv_ownedInitExpression_16_0 = null;


        // InternalCPL.g:5800:5: ( ( (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )
        // InternalCPL.g:5800:5: ( (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) )
        {
        // InternalCPL.g:5800:5: ( (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) )
        // InternalCPL.g:5801:6: (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) )
        {
        // InternalCPL.g:5801:6: (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )?
        int alt179=2;
        int LA179_0 = input.LA(1);

        if ( (LA179_0==24) ) {
            alt179=1;
        }
        switch (alt179) {
            case 1 :
                // InternalCPL.g:5802:7: otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) )
                {
                otherlv_11=(Token)match(input,24,FollowSets000.FOLLOW_38); if (state.failed) return ;
                // InternalCPL.g:5806:7: ( (lv_ownedType_12_0= ruleTypeExpCS ) )
                // InternalCPL.g:5807:8: (lv_ownedType_12_0= ruleTypeExpCS )
                {
                // InternalCPL.g:5807:8: (lv_ownedType_12_0= ruleTypeExpCS )
                // InternalCPL.g:5808:9: lv_ownedType_12_0= ruleTypeExpCS
                {
                if ( state.backtracking==0 ) {

                  									newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_0_1_2_0_1_0());
                  								
                }
                pushFollow(FollowSets000.FOLLOW_76);
                lv_ownedType_12_0=ruleTypeExpCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }

        // InternalCPL.g:5826:6: (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )?
        int alt180=2;
        int LA180_0 = input.LA(1);

        if ( (LA180_0==99) ) {
            alt180=1;
        }
        switch (alt180) {
            case 1 :
                // InternalCPL.g:5827:7: otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) )
                {
                otherlv_13=(Token)match(input,99,FollowSets000.FOLLOW_7); if (state.failed) return ;
                // InternalCPL.g:5831:7: ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) )
                // InternalCPL.g:5832:8: (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS )
                {
                // InternalCPL.g:5832:8: (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS )
                // InternalCPL.g:5833:9: lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS
                {
                if ( state.backtracking==0 ) {

                  									newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_0_1_2_1_1_0());
                  								
                }
                pushFollow(FollowSets000.FOLLOW_77);
                lv_ownedCoIterator_14_0=ruleCoIteratorVariableCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }

        otherlv_15=(Token)match(input,107,FollowSets000.FOLLOW_55); if (state.failed) return ;
        // InternalCPL.g:5855:6: ( (lv_ownedInitExpression_16_0= ruleExpCS ) )
        // InternalCPL.g:5856:7: (lv_ownedInitExpression_16_0= ruleExpCS )
        {
        // InternalCPL.g:5856:7: (lv_ownedInitExpression_16_0= ruleExpCS )
        // InternalCPL.g:5857:8: lv_ownedInitExpression_16_0= ruleExpCS
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_0_1_2_3_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_ownedInitExpression_16_0=ruleExpCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred186_InternalCPL

    // $ANTLR start synpred191_InternalCPL
    public final void synpred191_InternalCPL_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedCoIterator_3_0 = null;

        EObject lv_ownedInitExpression_5_0 = null;


        // InternalCPL.g:6058:4: ( (otherlv_2= '<-' ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) )
        // InternalCPL.g:6058:4: (otherlv_2= '<-' ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )
        {
        // InternalCPL.g:6058:4: (otherlv_2= '<-' ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )
        // InternalCPL.g:6059:5: otherlv_2= '<-' ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
        {
        otherlv_2=(Token)match(input,99,FollowSets000.FOLLOW_7); if (state.failed) return ;
        // InternalCPL.g:6063:5: ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) )
        // InternalCPL.g:6064:6: (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS )
        {
        // InternalCPL.g:6064:6: (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS )
        // InternalCPL.g:6065:7: lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_2_0_1_0());
          						
        }
        pushFollow(FollowSets000.FOLLOW_74);
        lv_ownedCoIterator_3_0=ruleCoIteratorVariableCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalCPL.g:6082:5: (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
        int alt188=2;
        int LA188_0 = input.LA(1);

        if ( (LA188_0==35) ) {
            alt188=1;
        }
        switch (alt188) {
            case 1 :
                // InternalCPL.g:6083:6: otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                {
                otherlv_4=(Token)match(input,35,FollowSets000.FOLLOW_55); if (state.failed) return ;
                // InternalCPL.g:6087:6: ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                // InternalCPL.g:6088:7: (lv_ownedInitExpression_5_0= ruleExpCS )
                {
                // InternalCPL.g:6088:7: (lv_ownedInitExpression_5_0= ruleExpCS )
                // InternalCPL.g:6089:8: lv_ownedInitExpression_5_0= ruleExpCS
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_0_2_1_0());
                  							
                }
                pushFollow(FollowSets000.FOLLOW_2);
                lv_ownedInitExpression_5_0=ruleExpCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred191_InternalCPL

    // $ANTLR start synpred194_InternalCPL
    public final void synpred194_InternalCPL_fragment() throws RecognitionException {   
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_ownedType_7_0 = null;

        EObject lv_ownedCoIterator_9_0 = null;

        EObject lv_ownedInitExpression_11_0 = null;


        // InternalCPL.g:6109:4: ( (otherlv_6= ':' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? ) )
        // InternalCPL.g:6109:4: (otherlv_6= ':' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? )
        {
        // InternalCPL.g:6109:4: (otherlv_6= ':' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? )
        // InternalCPL.g:6110:5: otherlv_6= ':' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )?
        {
        otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_38); if (state.failed) return ;
        // InternalCPL.g:6114:5: ( (lv_ownedType_7_0= ruleTypeExpCS ) )
        // InternalCPL.g:6115:6: (lv_ownedType_7_0= ruleTypeExpCS )
        {
        // InternalCPL.g:6115:6: (lv_ownedType_7_0= ruleTypeExpCS )
        // InternalCPL.g:6116:7: lv_ownedType_7_0= ruleTypeExpCS
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_1_0());
          						
        }
        pushFollow(FollowSets000.FOLLOW_75);
        lv_ownedType_7_0=ruleTypeExpCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalCPL.g:6133:5: (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )?
        int alt189=2;
        int LA189_0 = input.LA(1);

        if ( (LA189_0==99) ) {
            alt189=1;
        }
        switch (alt189) {
            case 1 :
                // InternalCPL.g:6134:6: otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) )
                {
                otherlv_8=(Token)match(input,99,FollowSets000.FOLLOW_7); if (state.failed) return ;
                // InternalCPL.g:6138:6: ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) )
                // InternalCPL.g:6139:7: (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS )
                {
                // InternalCPL.g:6139:7: (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS )
                // InternalCPL.g:6140:8: lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_2_1_2_1_0());
                  							
                }
                pushFollow(FollowSets000.FOLLOW_74);
                lv_ownedCoIterator_9_0=ruleCoIteratorVariableCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }

        // InternalCPL.g:6158:5: (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )?
        int alt190=2;
        int LA190_0 = input.LA(1);

        if ( (LA190_0==35) ) {
            alt190=1;
        }
        switch (alt190) {
            case 1 :
                // InternalCPL.g:6159:6: otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) )
                {
                otherlv_10=(Token)match(input,35,FollowSets000.FOLLOW_55); if (state.failed) return ;
                // InternalCPL.g:6163:6: ( (lv_ownedInitExpression_11_0= ruleExpCS ) )
                // InternalCPL.g:6164:7: (lv_ownedInitExpression_11_0= ruleExpCS )
                {
                // InternalCPL.g:6164:7: (lv_ownedInitExpression_11_0= ruleExpCS )
                // InternalCPL.g:6165:8: lv_ownedInitExpression_11_0= ruleExpCS
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_1_3_1_0());
                  							
                }
                pushFollow(FollowSets000.FOLLOW_2);
                lv_ownedInitExpression_11_0=ruleExpCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred194_InternalCPL

    // $ANTLR start synpred197_InternalCPL
    public final void synpred197_InternalCPL_fragment() throws RecognitionException {   
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        EObject lv_ownedType_13_0 = null;

        EObject lv_ownedCoIterator_15_0 = null;

        EObject lv_ownedInitExpression_17_0 = null;


        // InternalCPL.g:6185:4: ( ( (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? otherlv_16= 'in' ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) ) )
        // InternalCPL.g:6185:4: ( (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? otherlv_16= 'in' ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) )
        {
        // InternalCPL.g:6185:4: ( (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? otherlv_16= 'in' ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) )
        // InternalCPL.g:6186:5: (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? otherlv_16= 'in' ( (lv_ownedInitExpression_17_0= ruleExpCS ) )
        {
        // InternalCPL.g:6186:5: (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )?
        int alt191=2;
        int LA191_0 = input.LA(1);

        if ( (LA191_0==24) ) {
            alt191=1;
        }
        switch (alt191) {
            case 1 :
                // InternalCPL.g:6187:6: otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) )
                {
                otherlv_12=(Token)match(input,24,FollowSets000.FOLLOW_38); if (state.failed) return ;
                // InternalCPL.g:6191:6: ( (lv_ownedType_13_0= ruleTypeExpCS ) )
                // InternalCPL.g:6192:7: (lv_ownedType_13_0= ruleTypeExpCS )
                {
                // InternalCPL.g:6192:7: (lv_ownedType_13_0= ruleTypeExpCS )
                // InternalCPL.g:6193:8: lv_ownedType_13_0= ruleTypeExpCS
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_2_0_1_0());
                  							
                }
                pushFollow(FollowSets000.FOLLOW_76);
                lv_ownedType_13_0=ruleTypeExpCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }

        // InternalCPL.g:6211:5: (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )?
        int alt192=2;
        int LA192_0 = input.LA(1);

        if ( (LA192_0==99) ) {
            alt192=1;
        }
        switch (alt192) {
            case 1 :
                // InternalCPL.g:6212:6: otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) )
                {
                otherlv_14=(Token)match(input,99,FollowSets000.FOLLOW_7); if (state.failed) return ;
                // InternalCPL.g:6216:6: ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) )
                // InternalCPL.g:6217:7: (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS )
                {
                // InternalCPL.g:6217:7: (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS )
                // InternalCPL.g:6218:8: lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_2_2_1_1_0());
                  							
                }
                pushFollow(FollowSets000.FOLLOW_77);
                lv_ownedCoIterator_15_0=ruleCoIteratorVariableCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }

        otherlv_16=(Token)match(input,107,FollowSets000.FOLLOW_55); if (state.failed) return ;
        // InternalCPL.g:6240:5: ( (lv_ownedInitExpression_17_0= ruleExpCS ) )
        // InternalCPL.g:6241:6: (lv_ownedInitExpression_17_0= ruleExpCS )
        {
        // InternalCPL.g:6241:6: (lv_ownedInitExpression_17_0= ruleExpCS )
        // InternalCPL.g:6242:7: lv_ownedInitExpression_17_0= ruleExpCS
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_2_3_0());
          						
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_ownedInitExpression_17_0=ruleExpCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred197_InternalCPL

    // Delegated rules

    public final boolean synpred197_InternalCPL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred197_InternalCPL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalCPL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalCPL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred156_InternalCPL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred156_InternalCPL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred167_InternalCPL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred167_InternalCPL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred165_InternalCPL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred165_InternalCPL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred191_InternalCPL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred191_InternalCPL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred180_InternalCPL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred180_InternalCPL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalCPL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalCPL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred183_InternalCPL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred183_InternalCPL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred194_InternalCPL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred194_InternalCPL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred163_InternalCPL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred163_InternalCPL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred153_InternalCPL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred153_InternalCPL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred186_InternalCPL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred186_InternalCPL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred164_InternalCPL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred164_InternalCPL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalCPL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalCPL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_InternalCPL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_InternalCPL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_InternalCPL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_InternalCPL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA27 dfa27 = new DFA27(this);
    protected DFA94 dfa94 = new DFA94(this);
    protected DFA97 dfa97 = new DFA97(this);
    protected DFA100 dfa100 = new DFA100(this);
    protected DFA116 dfa116 = new DFA116(this);
    protected DFA125 dfa125 = new DFA125(this);
    static final String dfa_1s = "\20\uffff";
    static final String dfa_2s = "\1\62\1\63\1\6\5\30\1\6\1\uffff\5\30\1\uffff";
    static final String dfa_3s = "\2\63\1\66\5\30\1\66\1\uffff\5\54\1\uffff";
    static final String dfa_4s = "\11\uffff\1\1\5\uffff\1\2";
    static final String dfa_5s = "\20\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\2",
            "\1\2",
            "\1\3\1\4\16\uffff\1\5\1\uffff\1\10\34\uffff\1\6\1\7",
            "\1\10",
            "\1\10",
            "\1\10",
            "\1\10",
            "\1\10",
            "\1\12\1\13\16\uffff\1\14\13\uffff\1\11\11\uffff\1\11\10\uffff\1\15\1\16",
            "",
            "\1\17\23\uffff\1\11",
            "\1\17\23\uffff\1\11",
            "\1\17\23\uffff\1\11",
            "\1\17\23\uffff\1\11",
            "\1\17\23\uffff\1\11",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "973:2: (this_DefOperationCS_0= ruleDefOperationCS | this_DefPropertyCS_1= ruleDefPropertyCS )";
        }
    }
    static final String dfa_7s = "\30\uffff";
    static final String dfa_8s = "\1\6\17\uffff\5\0\3\uffff";
    static final String dfa_9s = "\1\137\17\uffff\5\0\3\uffff";
    static final String dfa_10s = "\1\uffff\1\1\4\uffff\1\2\20\uffff\1\3";
    static final String dfa_11s = "\20\uffff\1\0\1\1\1\2\1\3\1\4\3\uffff}>";
    static final String[] dfa_12s = {
            "\2\1\16\uffff\1\1\36\uffff\2\1\10\uffff\12\6\17\uffff\2\6\1\uffff\1\20\1\21\1\22\1\23\1\24",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA94 extends DFA {

        public DFA94(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 94;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "4774:2: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA94_16 = input.LA(1);

                         
                        int index94_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred153_InternalCPL()) ) {s = 6;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index94_16);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA94_17 = input.LA(1);

                         
                        int index94_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred153_InternalCPL()) ) {s = 6;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index94_17);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA94_18 = input.LA(1);

                         
                        int index94_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred153_InternalCPL()) ) {s = 6;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index94_18);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA94_19 = input.LA(1);

                         
                        int index94_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred153_InternalCPL()) ) {s = 6;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index94_19);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA94_20 = input.LA(1);

                         
                        int index94_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred153_InternalCPL()) ) {s = 6;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index94_20);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 94, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_13s = "\46\uffff";
    static final String dfa_14s = "\1\6\3\0\42\uffff";
    static final String dfa_15s = "\1\164\3\0\42\uffff";
    static final String dfa_16s = "\4\uffff\1\1\40\uffff\1\2";
    static final String dfa_17s = "\1\uffff\1\0\1\1\1\2\42\uffff}>";
    static final String[] dfa_18s = {
            "\4\4\14\uffff\1\4\25\uffff\1\4\10\uffff\2\4\10\uffff\12\4\1\1\1\2\1\3\1\4\13\uffff\2\4\1\uffff\5\4\2\uffff\1\4\1\uffff\4\4\6\uffff\1\4\4\uffff\1\45\1\4",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA97 extends DFA {

        public DFA97(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 97;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "4877:2: ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_name_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) | this_PrefixedLetExpCS_4= rulePrefixedLetExpCS )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA97_1 = input.LA(1);

                         
                        int index97_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred156_InternalCPL()) ) {s = 4;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index97_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA97_2 = input.LA(1);

                         
                        int index97_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred156_InternalCPL()) ) {s = 4;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index97_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA97_3 = input.LA(1);

                         
                        int index97_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred156_InternalCPL()) ) {s = 4;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index97_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 97, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_19s = "\45\uffff";
    static final String dfa_20s = "\1\6\12\uffff\7\0\23\uffff";
    static final String dfa_21s = "\1\164\12\uffff\7\0\23\uffff";
    static final String dfa_22s = "\1\uffff\1\1\1\2\1\3\1\4\15\uffff\1\10\1\11\11\uffff\1\12\4\uffff\1\5\1\6\1\7";
    static final String dfa_23s = "\13\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\23\uffff}>";
    static final String[] dfa_24s = {
            "\2\35\2\4\14\uffff\1\35\25\uffff\1\1\10\uffff\2\35\10\uffff\12\23\3\uffff\1\4\13\uffff\1\14\1\13\1\uffff\1\15\1\16\1\17\1\20\1\21\2\uffff\1\22\1\uffff\4\4\6\uffff\1\2\5\uffff\1\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final char[] dfa_20 = DFA.unpackEncodedStringToUnsignedChars(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[][] dfa_24 = unpackEncodedStringArray(dfa_24s);

    class DFA100 extends DFA {

        public DFA100(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 100;
            this.eot = dfa_19;
            this.eof = dfa_19;
            this.min = dfa_20;
            this.max = dfa_21;
            this.accept = dfa_22;
            this.special = dfa_23;
            this.transition = dfa_24;
        }
        public String getDescription() {
            return "5133:2: (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_SelfExpCS_2= ruleSelfExpCS | this_PrimitiveLiteralExpCS_3= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_4= ruleTupleLiteralExpCS | this_MapLiteralExpCS_5= ruleMapLiteralExpCS | this_CollectionLiteralExpCS_6= ruleCollectionLiteralExpCS | this_LambdaLiteralExpCS_7= ruleLambdaLiteralExpCS | this_TypeLiteralExpCS_8= ruleTypeLiteralExpCS | this_NameExpCS_9= ruleNameExpCS )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA100_11 = input.LA(1);

                         
                        int index100_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred163_InternalCPL()) ) {s = 34;}

                        else if ( (synpred167_InternalCPL()) ) {s = 19;}

                         
                        input.seek(index100_11);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA100_12 = input.LA(1);

                         
                        int index100_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred164_InternalCPL()) ) {s = 35;}

                        else if ( (synpred167_InternalCPL()) ) {s = 19;}

                         
                        input.seek(index100_12);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA100_13 = input.LA(1);

                         
                        int index100_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred165_InternalCPL()) ) {s = 36;}

                        else if ( (synpred167_InternalCPL()) ) {s = 19;}

                         
                        input.seek(index100_13);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA100_14 = input.LA(1);

                         
                        int index100_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred165_InternalCPL()) ) {s = 36;}

                        else if ( (synpred167_InternalCPL()) ) {s = 19;}

                         
                        input.seek(index100_14);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA100_15 = input.LA(1);

                         
                        int index100_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred165_InternalCPL()) ) {s = 36;}

                        else if ( (synpred167_InternalCPL()) ) {s = 19;}

                         
                        input.seek(index100_15);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA100_16 = input.LA(1);

                         
                        int index100_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred165_InternalCPL()) ) {s = 36;}

                        else if ( (synpred167_InternalCPL()) ) {s = 19;}

                         
                        input.seek(index100_16);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA100_17 = input.LA(1);

                         
                        int index100_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred165_InternalCPL()) ) {s = 36;}

                        else if ( (synpred167_InternalCPL()) ) {s = 19;}

                         
                        input.seek(index100_17);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 100, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_25s = "\13\uffff";
    static final String dfa_26s = "\1\4\12\uffff";
    static final String dfa_27s = "\1\30\2\0\10\uffff";
    static final String dfa_28s = "\1\155\2\0\10\uffff";
    static final String dfa_29s = "\3\uffff\1\3\1\4\4\uffff\1\1\1\2";
    static final String dfa_30s = "\1\uffff\1\0\1\1\10\uffff}>";
    static final String[] dfa_31s = {
            "\1\2\24\uffff\1\4\6\uffff\1\4\56\uffff\1\1\7\uffff\1\3\2\4",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final char[] dfa_27 = DFA.unpackEncodedStringToUnsignedChars(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[][] dfa_31 = unpackEncodedStringArray(dfa_31s);

    class DFA116 extends DFA {

        public DFA116(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 116;
            this.eot = dfa_25;
            this.eof = dfa_26;
            this.min = dfa_27;
            this.max = dfa_28;
            this.accept = dfa_29;
            this.special = dfa_30;
            this.transition = dfa_31;
        }
        public String getDescription() {
            return "5672:4: ( (otherlv_1= '<-' ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) (otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | (otherlv_5= ':' ( (lv_ownedType_6_0= ruleTypeExpCS ) ) (otherlv_7= '<-' ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? (otherlv_9= '=' ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( (otherlv_11= ':' ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? (otherlv_13= '<-' ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? otherlv_15= 'in' ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA116_1 = input.LA(1);

                         
                        int index116_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred180_InternalCPL()) ) {s = 9;}

                        else if ( (synpred186_InternalCPL()) ) {s = 3;}

                         
                        input.seek(index116_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA116_2 = input.LA(1);

                         
                        int index116_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred183_InternalCPL()) ) {s = 10;}

                        else if ( (synpred186_InternalCPL()) ) {s = 3;}

                         
                        input.seek(index116_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 116, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA125 extends DFA {

        public DFA125(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 125;
            this.eot = dfa_25;
            this.eof = dfa_26;
            this.min = dfa_27;
            this.max = dfa_28;
            this.accept = dfa_29;
            this.special = dfa_30;
            this.transition = dfa_31;
        }
        public String getDescription() {
            return "6057:3: ( (otherlv_2= '<-' ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) (otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | (otherlv_6= ':' ( (lv_ownedType_7_0= ruleTypeExpCS ) ) (otherlv_8= '<-' ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? (otherlv_10= '=' ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? ) | ( (otherlv_12= ':' ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? (otherlv_14= '<-' ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? otherlv_16= 'in' ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA125_1 = input.LA(1);

                         
                        int index125_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred191_InternalCPL()) ) {s = 9;}

                        else if ( (synpred197_InternalCPL()) ) {s = 3;}

                         
                        input.seek(index125_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA125_2 = input.LA(1);

                         
                        int index125_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred194_InternalCPL()) ) {s = 10;}

                        else if ( (synpred197_InternalCPL()) ) {s = 3;}

                         
                        input.seek(index125_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 125, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000000C0L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000D00000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00600000004000C0L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0001000000200000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000024300000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000020200000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00600000004002C0L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x006003FF984000C0L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x006003FF986000C0L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040080000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x006003FF804000C0L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000C0000000002L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00003C0000000002L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00002C0000000002L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00601004004000C0L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000E000000000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00600000014000C0L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000E000000000002L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000100001000000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x80601004004003E0L,0x001840F4FB001FFFL});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00602000004000C0L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0010200000000000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x8060100C004000C0L,0x00000000FB0001FFL});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x80601004004000C0L,0x00000000FB0001FFL});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x80603004004000C0L,0x00000000FB0001FFL});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x83E01004004000C2L,0x00000000FB0001FFL});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0380000000000002L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0803000000000000L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0801000000000000L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x3000000000000002L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0010000200000000L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x80600000004000C0L,0x00000000FB0001FFL});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000100000000002L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000200000000000L,0x0000020000000000L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x80601004016003C0L,0x001840F4FB001FFFL});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0010000000200000L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x80601004014003C0L,0x001840F4FB001FFFL});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
        public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x80601004004003C0L,0x001840F4FB001FFFL});
        public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0010000000000000L,0x0000000200000000L});
        public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x80601004006003C0L,0x001840F4FB001FFFL});
        public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
        public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000801000000L});
        public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000202L});
        public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L});
        public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000CC5E18000002L,0x0000000000FFF200L});
        public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x80601004004003C0L,0x001040F4FB001FFFL});
        public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000100000080002L,0x0000030000000000L});
        public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000080002L,0x0000010000000000L});
        public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
        public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x00600000006002C0L});
        public static final BitSet FOLLOW_70 = new BitSet(new long[]{0xC0603004014003C0L,0x001840F4FB001FFFL});
        public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0010200000000000L,0x0000300000000000L});
        public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0010000000000000L,0x0000040000000000L});
        public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000001000002L,0x0000080800000000L});
        public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000800000002L});
        public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000800000002L,0x0000000800000000L});
        public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000080800000000L});
        public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
        public static final BitSet FOLLOW_78 = new BitSet(new long[]{0xC0601004004003C0L,0x001840F4FB001FFFL});
        public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
        public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0005000000000000L});
        public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
        public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0010000000000000L,0x0000080000000000L});
        public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000100801000000L});
        public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000100L,0x0000000000001000L});
        public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x4000000000000100L,0x0000000000005000L});
        public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000000L,0x0060040000000000L});
        public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
        public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0010000000000002L,0x0000020000000000L});
        public static final BitSet FOLLOW_90 = new BitSet(new long[]{0xC0601004004000C0L,0x00000000FB0001FFL});
        public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L});
        public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000000002L,0x0100000000000000L});
    }


}