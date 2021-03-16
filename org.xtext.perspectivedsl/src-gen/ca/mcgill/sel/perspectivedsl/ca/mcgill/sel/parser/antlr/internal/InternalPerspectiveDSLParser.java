package ca.mcgill.sel.perspectivedsl.ca.mcgill.sel.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ca.mcgill.sel.perspectivedsl.ca.mcgill.sel.services.PerspectiveDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPerspectiveDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'perspective'", "'{'", "'default'", "';'", "'display'", "'name'", "'languages'", "':'", "'end'", "'actions'", "'mappings'", "'intraLanguageMappings'", "'}'", "'existing'", "'language'", "'rootPackage'", "'packageClassName'", "'roleName'", "'mapping'", "'fromCardinality'", "'toCardinality'", "'fromElement'", "'from'", "'fromGetElement'", "'toELement'", "'toGetElement'", "'nested'", "'interLanguageMappingEnds'", "'elementName'", "'inter'", "'origin'", "'destination'", "'action'", "'Intra'", "'Language'", "'Mapping'", "'closure'", "'reuse'", "'increaseDepth'", "'changeModel'", "'hops'", "'hopElement'", "'fromGetHop'", "'1'", "'0..1'", "'1..*'", "'0..*'", "'re_expose'", "'redefined'", "'create_mapping'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalPerspectiveDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPerspectiveDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPerspectiveDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPerspectiveDSL.g"; }



     	private PerspectiveDSLGrammarAccess grammarAccess;

        public InternalPerspectiveDSLParser(TokenStream input, PerspectiveDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "PerspectiveModel";
       	}

       	@Override
       	protected PerspectiveDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePerspectiveModel"
    // InternalPerspectiveDSL.g:65:1: entryRulePerspectiveModel returns [EObject current=null] : iv_rulePerspectiveModel= rulePerspectiveModel EOF ;
    public final EObject entryRulePerspectiveModel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerspectiveModel = null;


        try {
            // InternalPerspectiveDSL.g:65:57: (iv_rulePerspectiveModel= rulePerspectiveModel EOF )
            // InternalPerspectiveDSL.g:66:2: iv_rulePerspectiveModel= rulePerspectiveModel EOF
            {
             newCompositeNode(grammarAccess.getPerspectiveModelRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePerspectiveModel=rulePerspectiveModel();

            state._fsp--;

             current =iv_rulePerspectiveModel; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePerspectiveModel"


    // $ANTLR start "rulePerspectiveModel"
    // InternalPerspectiveDSL.g:72:1: rulePerspectiveModel returns [EObject current=null] : ( (lv_perspective_0_0= rulePerspective ) )* ;
    public final EObject rulePerspectiveModel() throws RecognitionException {
        EObject current = null;

        EObject lv_perspective_0_0 = null;



        	enterRule();

        try {
            // InternalPerspectiveDSL.g:78:2: ( ( (lv_perspective_0_0= rulePerspective ) )* )
            // InternalPerspectiveDSL.g:79:2: ( (lv_perspective_0_0= rulePerspective ) )*
            {
            // InternalPerspectiveDSL.g:79:2: ( (lv_perspective_0_0= rulePerspective ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPerspectiveDSL.g:80:3: (lv_perspective_0_0= rulePerspective )
            	    {
            	    // InternalPerspectiveDSL.g:80:3: (lv_perspective_0_0= rulePerspective )
            	    // InternalPerspectiveDSL.g:81:4: lv_perspective_0_0= rulePerspective
            	    {

            	    				newCompositeNode(grammarAccess.getPerspectiveModelAccess().getPerspectivePerspectiveParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_perspective_0_0=rulePerspective();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getPerspectiveModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"perspective",
            	    					lv_perspective_0_0,
            	    					"ca.mcgill.sel.perspectivedsl.ca.mcgill.sel.PerspectiveDSL.Perspective");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePerspectiveModel"


    // $ANTLR start "entryRulePerspective"
    // InternalPerspectiveDSL.g:101:1: entryRulePerspective returns [EObject current=null] : iv_rulePerspective= rulePerspective EOF ;
    public final EObject entryRulePerspective() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerspective = null;


        try {
            // InternalPerspectiveDSL.g:101:52: (iv_rulePerspective= rulePerspective EOF )
            // InternalPerspectiveDSL.g:102:2: iv_rulePerspective= rulePerspective EOF
            {
             newCompositeNode(grammarAccess.getPerspectiveRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePerspective=rulePerspective();

            state._fsp--;

             current =iv_rulePerspective; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePerspective"


    // $ANTLR start "rulePerspective"
    // InternalPerspectiveDSL.g:108:1: rulePerspective returns [EObject current=null] : (otherlv_0= 'perspective' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= RULE_ID ) ) otherlv_5= ';' )? otherlv_6= 'display' otherlv_7= 'name' ( (lv_displayName_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'languages' otherlv_11= ':' ( (lv_languages_12_0= ruleLanguage ) )* otherlv_13= 'end' otherlv_14= 'actions' otherlv_15= ':' ( (lv_actions_16_0= ruleAction ) )* otherlv_17= 'end' otherlv_18= 'mappings' otherlv_19= ':' ( (lv_mappings_20_0= ruleLanguageElementMapping ) )* otherlv_21= 'end' (otherlv_22= 'intraLanguageMappings' otherlv_23= ':' ( (lv_intralanguagemappings_24_0= ruleIntraLanguageMapping ) )* )? otherlv_25= 'end' otherlv_26= '}' ) ;
    public final EObject rulePerspective() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_default_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_displayName_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        EObject lv_languages_12_0 = null;

        EObject lv_actions_16_0 = null;

        EObject lv_mappings_20_0 = null;

        EObject lv_intralanguagemappings_24_0 = null;



        	enterRule();

        try {
            // InternalPerspectiveDSL.g:114:2: ( (otherlv_0= 'perspective' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= RULE_ID ) ) otherlv_5= ';' )? otherlv_6= 'display' otherlv_7= 'name' ( (lv_displayName_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'languages' otherlv_11= ':' ( (lv_languages_12_0= ruleLanguage ) )* otherlv_13= 'end' otherlv_14= 'actions' otherlv_15= ':' ( (lv_actions_16_0= ruleAction ) )* otherlv_17= 'end' otherlv_18= 'mappings' otherlv_19= ':' ( (lv_mappings_20_0= ruleLanguageElementMapping ) )* otherlv_21= 'end' (otherlv_22= 'intraLanguageMappings' otherlv_23= ':' ( (lv_intralanguagemappings_24_0= ruleIntraLanguageMapping ) )* )? otherlv_25= 'end' otherlv_26= '}' ) )
            // InternalPerspectiveDSL.g:115:2: (otherlv_0= 'perspective' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= RULE_ID ) ) otherlv_5= ';' )? otherlv_6= 'display' otherlv_7= 'name' ( (lv_displayName_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'languages' otherlv_11= ':' ( (lv_languages_12_0= ruleLanguage ) )* otherlv_13= 'end' otherlv_14= 'actions' otherlv_15= ':' ( (lv_actions_16_0= ruleAction ) )* otherlv_17= 'end' otherlv_18= 'mappings' otherlv_19= ':' ( (lv_mappings_20_0= ruleLanguageElementMapping ) )* otherlv_21= 'end' (otherlv_22= 'intraLanguageMappings' otherlv_23= ':' ( (lv_intralanguagemappings_24_0= ruleIntraLanguageMapping ) )* )? otherlv_25= 'end' otherlv_26= '}' )
            {
            // InternalPerspectiveDSL.g:115:2: (otherlv_0= 'perspective' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= RULE_ID ) ) otherlv_5= ';' )? otherlv_6= 'display' otherlv_7= 'name' ( (lv_displayName_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'languages' otherlv_11= ':' ( (lv_languages_12_0= ruleLanguage ) )* otherlv_13= 'end' otherlv_14= 'actions' otherlv_15= ':' ( (lv_actions_16_0= ruleAction ) )* otherlv_17= 'end' otherlv_18= 'mappings' otherlv_19= ':' ( (lv_mappings_20_0= ruleLanguageElementMapping ) )* otherlv_21= 'end' (otherlv_22= 'intraLanguageMappings' otherlv_23= ':' ( (lv_intralanguagemappings_24_0= ruleIntraLanguageMapping ) )* )? otherlv_25= 'end' otherlv_26= '}' )
            // InternalPerspectiveDSL.g:116:3: otherlv_0= 'perspective' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= RULE_ID ) ) otherlv_5= ';' )? otherlv_6= 'display' otherlv_7= 'name' ( (lv_displayName_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'languages' otherlv_11= ':' ( (lv_languages_12_0= ruleLanguage ) )* otherlv_13= 'end' otherlv_14= 'actions' otherlv_15= ':' ( (lv_actions_16_0= ruleAction ) )* otherlv_17= 'end' otherlv_18= 'mappings' otherlv_19= ':' ( (lv_mappings_20_0= ruleLanguageElementMapping ) )* otherlv_21= 'end' (otherlv_22= 'intraLanguageMappings' otherlv_23= ':' ( (lv_intralanguagemappings_24_0= ruleIntraLanguageMapping ) )* )? otherlv_25= 'end' otherlv_26= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPerspectiveAccess().getPerspectiveKeyword_0());
            		
            // InternalPerspectiveDSL.g:120:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPerspectiveDSL.g:121:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPerspectiveDSL.g:121:4: (lv_name_1_0= RULE_ID )
            // InternalPerspectiveDSL.g:122:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPerspectiveAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPerspectiveRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getPerspectiveAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPerspectiveDSL.g:142:3: (otherlv_3= 'default' ( (lv_default_4_0= RULE_ID ) ) otherlv_5= ';' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalPerspectiveDSL.g:143:4: otherlv_3= 'default' ( (lv_default_4_0= RULE_ID ) ) otherlv_5= ';'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getPerspectiveAccess().getDefaultKeyword_3_0());
                    			
                    // InternalPerspectiveDSL.g:147:4: ( (lv_default_4_0= RULE_ID ) )
                    // InternalPerspectiveDSL.g:148:5: (lv_default_4_0= RULE_ID )
                    {
                    // InternalPerspectiveDSL.g:148:5: (lv_default_4_0= RULE_ID )
                    // InternalPerspectiveDSL.g:149:6: lv_default_4_0= RULE_ID
                    {
                    lv_default_4_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(lv_default_4_0, grammarAccess.getPerspectiveAccess().getDefaultIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPerspectiveRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"default",
                    							lv_default_4_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getPerspectiveAccess().getSemicolonKeyword_3_2());
                    			

                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getPerspectiveAccess().getDisplayKeyword_4());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getPerspectiveAccess().getNameKeyword_5());
            		
            // InternalPerspectiveDSL.g:178:3: ( (lv_displayName_8_0= RULE_STRING ) )
            // InternalPerspectiveDSL.g:179:4: (lv_displayName_8_0= RULE_STRING )
            {
            // InternalPerspectiveDSL.g:179:4: (lv_displayName_8_0= RULE_STRING )
            // InternalPerspectiveDSL.g:180:5: lv_displayName_8_0= RULE_STRING
            {
            lv_displayName_8_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_displayName_8_0, grammarAccess.getPerspectiveAccess().getDisplayNameSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPerspectiveRule());
            					}
            					setWithLastConsumed(
            						current,
            						"displayName",
            						lv_displayName_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,14,FOLLOW_11); 

            			newLeafNode(otherlv_9, grammarAccess.getPerspectiveAccess().getSemicolonKeyword_7());
            		
            otherlv_10=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_10, grammarAccess.getPerspectiveAccess().getLanguagesKeyword_8());
            		
            otherlv_11=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_11, grammarAccess.getPerspectiveAccess().getColonKeyword_9());
            		
            // InternalPerspectiveDSL.g:208:3: ( (lv_languages_12_0= ruleLanguage ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==24) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPerspectiveDSL.g:209:4: (lv_languages_12_0= ruleLanguage )
            	    {
            	    // InternalPerspectiveDSL.g:209:4: (lv_languages_12_0= ruleLanguage )
            	    // InternalPerspectiveDSL.g:210:5: lv_languages_12_0= ruleLanguage
            	    {

            	    					newCompositeNode(grammarAccess.getPerspectiveAccess().getLanguagesLanguageParserRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_languages_12_0=ruleLanguage();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPerspectiveRule());
            	    					}
            	    					add(
            	    						current,
            	    						"languages",
            	    						lv_languages_12_0,
            	    						"ca.mcgill.sel.perspectivedsl.ca.mcgill.sel.PerspectiveDSL.Language");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_13=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_13, grammarAccess.getPerspectiveAccess().getEndKeyword_11());
            		
            otherlv_14=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_14, grammarAccess.getPerspectiveAccess().getActionsKeyword_12());
            		
            otherlv_15=(Token)match(input,18,FOLLOW_15); 

            			newLeafNode(otherlv_15, grammarAccess.getPerspectiveAccess().getColonKeyword_13());
            		
            // InternalPerspectiveDSL.g:239:3: ( (lv_actions_16_0= ruleAction ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==43) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPerspectiveDSL.g:240:4: (lv_actions_16_0= ruleAction )
            	    {
            	    // InternalPerspectiveDSL.g:240:4: (lv_actions_16_0= ruleAction )
            	    // InternalPerspectiveDSL.g:241:5: lv_actions_16_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getPerspectiveAccess().getActionsActionParserRuleCall_14_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_actions_16_0=ruleAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPerspectiveRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actions",
            	    						lv_actions_16_0,
            	    						"ca.mcgill.sel.perspectivedsl.ca.mcgill.sel.PerspectiveDSL.Action");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_17=(Token)match(input,19,FOLLOW_16); 

            			newLeafNode(otherlv_17, grammarAccess.getPerspectiveAccess().getEndKeyword_15());
            		
            otherlv_18=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_18, grammarAccess.getPerspectiveAccess().getMappingsKeyword_16());
            		
            otherlv_19=(Token)match(input,18,FOLLOW_17); 

            			newLeafNode(otherlv_19, grammarAccess.getPerspectiveAccess().getColonKeyword_17());
            		
            // InternalPerspectiveDSL.g:270:3: ( (lv_mappings_20_0= ruleLanguageElementMapping ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==29) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPerspectiveDSL.g:271:4: (lv_mappings_20_0= ruleLanguageElementMapping )
            	    {
            	    // InternalPerspectiveDSL.g:271:4: (lv_mappings_20_0= ruleLanguageElementMapping )
            	    // InternalPerspectiveDSL.g:272:5: lv_mappings_20_0= ruleLanguageElementMapping
            	    {

            	    					newCompositeNode(grammarAccess.getPerspectiveAccess().getMappingsLanguageElementMappingParserRuleCall_18_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_mappings_20_0=ruleLanguageElementMapping();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPerspectiveRule());
            	    					}
            	    					add(
            	    						current,
            	    						"mappings",
            	    						lv_mappings_20_0,
            	    						"ca.mcgill.sel.perspectivedsl.ca.mcgill.sel.PerspectiveDSL.LanguageElementMapping");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_21=(Token)match(input,19,FOLLOW_18); 

            			newLeafNode(otherlv_21, grammarAccess.getPerspectiveAccess().getEndKeyword_19());
            		
            // InternalPerspectiveDSL.g:293:3: (otherlv_22= 'intraLanguageMappings' otherlv_23= ':' ( (lv_intralanguagemappings_24_0= ruleIntraLanguageMapping ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalPerspectiveDSL.g:294:4: otherlv_22= 'intraLanguageMappings' otherlv_23= ':' ( (lv_intralanguagemappings_24_0= ruleIntraLanguageMapping ) )*
                    {
                    otherlv_22=(Token)match(input,22,FOLLOW_12); 

                    				newLeafNode(otherlv_22, grammarAccess.getPerspectiveAccess().getIntraLanguageMappingsKeyword_20_0());
                    			
                    otherlv_23=(Token)match(input,18,FOLLOW_19); 

                    				newLeafNode(otherlv_23, grammarAccess.getPerspectiveAccess().getColonKeyword_20_1());
                    			
                    // InternalPerspectiveDSL.g:302:4: ( (lv_intralanguagemappings_24_0= ruleIntraLanguageMapping ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==44) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalPerspectiveDSL.g:303:5: (lv_intralanguagemappings_24_0= ruleIntraLanguageMapping )
                    	    {
                    	    // InternalPerspectiveDSL.g:303:5: (lv_intralanguagemappings_24_0= ruleIntraLanguageMapping )
                    	    // InternalPerspectiveDSL.g:304:6: lv_intralanguagemappings_24_0= ruleIntraLanguageMapping
                    	    {

                    	    						newCompositeNode(grammarAccess.getPerspectiveAccess().getIntralanguagemappingsIntraLanguageMappingParserRuleCall_20_2_0());
                    	    					
                    	    pushFollow(FOLLOW_19);
                    	    lv_intralanguagemappings_24_0=ruleIntraLanguageMapping();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getPerspectiveRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"intralanguagemappings",
                    	    							lv_intralanguagemappings_24_0,
                    	    							"ca.mcgill.sel.perspectivedsl.ca.mcgill.sel.PerspectiveDSL.IntraLanguageMapping");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_25=(Token)match(input,19,FOLLOW_20); 

            			newLeafNode(otherlv_25, grammarAccess.getPerspectiveAccess().getEndKeyword_21());
            		
            otherlv_26=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_26, grammarAccess.getPerspectiveAccess().getRightCurlyBracketKeyword_22());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePerspective"


    // $ANTLR start "entryRuleLanguage"
    // InternalPerspectiveDSL.g:334:1: entryRuleLanguage returns [EObject current=null] : iv_ruleLanguage= ruleLanguage EOF ;
    public final EObject entryRuleLanguage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLanguage = null;


        try {
            // InternalPerspectiveDSL.g:334:49: (iv_ruleLanguage= ruleLanguage EOF )
            // InternalPerspectiveDSL.g:335:2: iv_ruleLanguage= ruleLanguage EOF
            {
             newCompositeNode(grammarAccess.getLanguageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLanguage=ruleLanguage();

            state._fsp--;

             current =iv_ruleLanguage; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLanguage"


    // $ANTLR start "ruleLanguage"
    // InternalPerspectiveDSL.g:341:1: ruleLanguage returns [EObject current=null] : (otherlv_0= 'existing' otherlv_1= 'language' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'rootPackage' ( (lv_rootPackage_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= 'packageClassName' ( (lv_packageClassName_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'roleName' ( (lv_roleName_11_0= RULE_ID ) ) otherlv_12= ';' otherlv_13= '}' ) ;
    public final EObject ruleLanguage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_rootPackage_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_packageClassName_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_roleName_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;


        	enterRule();

        try {
            // InternalPerspectiveDSL.g:347:2: ( (otherlv_0= 'existing' otherlv_1= 'language' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'rootPackage' ( (lv_rootPackage_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= 'packageClassName' ( (lv_packageClassName_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'roleName' ( (lv_roleName_11_0= RULE_ID ) ) otherlv_12= ';' otherlv_13= '}' ) )
            // InternalPerspectiveDSL.g:348:2: (otherlv_0= 'existing' otherlv_1= 'language' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'rootPackage' ( (lv_rootPackage_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= 'packageClassName' ( (lv_packageClassName_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'roleName' ( (lv_roleName_11_0= RULE_ID ) ) otherlv_12= ';' otherlv_13= '}' )
            {
            // InternalPerspectiveDSL.g:348:2: (otherlv_0= 'existing' otherlv_1= 'language' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'rootPackage' ( (lv_rootPackage_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= 'packageClassName' ( (lv_packageClassName_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'roleName' ( (lv_roleName_11_0= RULE_ID ) ) otherlv_12= ';' otherlv_13= '}' )
            // InternalPerspectiveDSL.g:349:3: otherlv_0= 'existing' otherlv_1= 'language' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'rootPackage' ( (lv_rootPackage_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= 'packageClassName' ( (lv_packageClassName_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'roleName' ( (lv_roleName_11_0= RULE_ID ) ) otherlv_12= ';' otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getLanguageAccess().getExistingKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getLanguageAccess().getLanguageKeyword_1());
            		
            // InternalPerspectiveDSL.g:357:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalPerspectiveDSL.g:358:4: (lv_name_2_0= RULE_ID )
            {
            // InternalPerspectiveDSL.g:358:4: (lv_name_2_0= RULE_ID )
            // InternalPerspectiveDSL.g:359:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getLanguageAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLanguageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getLanguageAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,26,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getLanguageAccess().getRootPackageKeyword_4());
            		
            // InternalPerspectiveDSL.g:383:3: ( (lv_rootPackage_5_0= RULE_STRING ) )
            // InternalPerspectiveDSL.g:384:4: (lv_rootPackage_5_0= RULE_STRING )
            {
            // InternalPerspectiveDSL.g:384:4: (lv_rootPackage_5_0= RULE_STRING )
            // InternalPerspectiveDSL.g:385:5: lv_rootPackage_5_0= RULE_STRING
            {
            lv_rootPackage_5_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_rootPackage_5_0, grammarAccess.getLanguageAccess().getRootPackageSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLanguageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rootPackage",
            						lv_rootPackage_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_23); 

            			newLeafNode(otherlv_6, grammarAccess.getLanguageAccess().getSemicolonKeyword_6());
            		
            otherlv_7=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getLanguageAccess().getPackageClassNameKeyword_7());
            		
            // InternalPerspectiveDSL.g:409:3: ( (lv_packageClassName_8_0= RULE_ID ) )
            // InternalPerspectiveDSL.g:410:4: (lv_packageClassName_8_0= RULE_ID )
            {
            // InternalPerspectiveDSL.g:410:4: (lv_packageClassName_8_0= RULE_ID )
            // InternalPerspectiveDSL.g:411:5: lv_packageClassName_8_0= RULE_ID
            {
            lv_packageClassName_8_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_packageClassName_8_0, grammarAccess.getLanguageAccess().getPackageClassNameIDTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLanguageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"packageClassName",
            						lv_packageClassName_8_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_9=(Token)match(input,14,FOLLOW_24); 

            			newLeafNode(otherlv_9, grammarAccess.getLanguageAccess().getSemicolonKeyword_9());
            		
            otherlv_10=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getLanguageAccess().getRoleNameKeyword_10());
            		
            // InternalPerspectiveDSL.g:435:3: ( (lv_roleName_11_0= RULE_ID ) )
            // InternalPerspectiveDSL.g:436:4: (lv_roleName_11_0= RULE_ID )
            {
            // InternalPerspectiveDSL.g:436:4: (lv_roleName_11_0= RULE_ID )
            // InternalPerspectiveDSL.g:437:5: lv_roleName_11_0= RULE_ID
            {
            lv_roleName_11_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_roleName_11_0, grammarAccess.getLanguageAccess().getRoleNameIDTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLanguageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"roleName",
            						lv_roleName_11_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_12=(Token)match(input,14,FOLLOW_20); 

            			newLeafNode(otherlv_12, grammarAccess.getLanguageAccess().getSemicolonKeyword_12());
            		
            otherlv_13=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getLanguageAccess().getRightCurlyBracketKeyword_13());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLanguage"


    // $ANTLR start "entryRuleLanguageElementMapping"
    // InternalPerspectiveDSL.g:465:1: entryRuleLanguageElementMapping returns [EObject current=null] : iv_ruleLanguageElementMapping= ruleLanguageElementMapping EOF ;
    public final EObject entryRuleLanguageElementMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLanguageElementMapping = null;


        try {
            // InternalPerspectiveDSL.g:465:63: (iv_ruleLanguageElementMapping= ruleLanguageElementMapping EOF )
            // InternalPerspectiveDSL.g:466:2: iv_ruleLanguageElementMapping= ruleLanguageElementMapping EOF
            {
             newCompositeNode(grammarAccess.getLanguageElementMappingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLanguageElementMapping=ruleLanguageElementMapping();

            state._fsp--;

             current =iv_ruleLanguageElementMapping; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLanguageElementMapping"


    // $ANTLR start "ruleLanguageElementMapping"
    // InternalPerspectiveDSL.g:472:1: ruleLanguageElementMapping returns [EObject current=null] : (otherlv_0= 'mapping' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'fromCardinality' otherlv_4= ':' ( (lv_fromCardinality_5_0= ruleCardinality ) ) otherlv_6= ';' otherlv_7= 'toCardinality' otherlv_8= ':' ( (lv_toCardinality_9_0= ruleCardinality ) ) otherlv_10= ';' otherlv_11= 'fromElement' otherlv_12= ':' ( (lv_fromElement_13_0= RULE_ID ) ) otherlv_14= 'from' ( (lv_fromRoleName_15_0= RULE_ID ) ) otherlv_16= 'fromGetElement' ( (lv_fromGetElement_17_0= RULE_STRING ) ) otherlv_18= ';' otherlv_19= 'toELement' otherlv_20= ':' ( (lv_toElement_21_0= RULE_ID ) ) otherlv_22= 'from' ( (lv_toRoleName_23_0= RULE_ID ) ) otherlv_24= 'toGetElement' ( (lv_toGetElement_25_0= RULE_STRING ) ) otherlv_26= ';' (otherlv_27= 'nested' otherlv_28= 'mappings' otherlv_29= ':' ( (lv_nestedMappings_30_0= ruleNestedMapping ) )* otherlv_31= 'end' )? (otherlv_32= 'interLanguageMappingEnds' otherlv_33= ':' ( (lv_interLanguageMappingEnds_34_0= ruleInterLanguageMappingEnd ) )* otherlv_35= 'end' )? otherlv_36= '}' ) ;
    public final EObject ruleLanguageElementMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_fromElement_13_0=null;
        Token otherlv_14=null;
        Token lv_fromRoleName_15_0=null;
        Token otherlv_16=null;
        Token lv_fromGetElement_17_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token lv_toElement_21_0=null;
        Token otherlv_22=null;
        Token lv_toRoleName_23_0=null;
        Token otherlv_24=null;
        Token lv_toGetElement_25_0=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Enumerator lv_fromCardinality_5_0 = null;

        Enumerator lv_toCardinality_9_0 = null;

        EObject lv_nestedMappings_30_0 = null;

        EObject lv_interLanguageMappingEnds_34_0 = null;



        	enterRule();

        try {
            // InternalPerspectiveDSL.g:478:2: ( (otherlv_0= 'mapping' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'fromCardinality' otherlv_4= ':' ( (lv_fromCardinality_5_0= ruleCardinality ) ) otherlv_6= ';' otherlv_7= 'toCardinality' otherlv_8= ':' ( (lv_toCardinality_9_0= ruleCardinality ) ) otherlv_10= ';' otherlv_11= 'fromElement' otherlv_12= ':' ( (lv_fromElement_13_0= RULE_ID ) ) otherlv_14= 'from' ( (lv_fromRoleName_15_0= RULE_ID ) ) otherlv_16= 'fromGetElement' ( (lv_fromGetElement_17_0= RULE_STRING ) ) otherlv_18= ';' otherlv_19= 'toELement' otherlv_20= ':' ( (lv_toElement_21_0= RULE_ID ) ) otherlv_22= 'from' ( (lv_toRoleName_23_0= RULE_ID ) ) otherlv_24= 'toGetElement' ( (lv_toGetElement_25_0= RULE_STRING ) ) otherlv_26= ';' (otherlv_27= 'nested' otherlv_28= 'mappings' otherlv_29= ':' ( (lv_nestedMappings_30_0= ruleNestedMapping ) )* otherlv_31= 'end' )? (otherlv_32= 'interLanguageMappingEnds' otherlv_33= ':' ( (lv_interLanguageMappingEnds_34_0= ruleInterLanguageMappingEnd ) )* otherlv_35= 'end' )? otherlv_36= '}' ) )
            // InternalPerspectiveDSL.g:479:2: (otherlv_0= 'mapping' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'fromCardinality' otherlv_4= ':' ( (lv_fromCardinality_5_0= ruleCardinality ) ) otherlv_6= ';' otherlv_7= 'toCardinality' otherlv_8= ':' ( (lv_toCardinality_9_0= ruleCardinality ) ) otherlv_10= ';' otherlv_11= 'fromElement' otherlv_12= ':' ( (lv_fromElement_13_0= RULE_ID ) ) otherlv_14= 'from' ( (lv_fromRoleName_15_0= RULE_ID ) ) otherlv_16= 'fromGetElement' ( (lv_fromGetElement_17_0= RULE_STRING ) ) otherlv_18= ';' otherlv_19= 'toELement' otherlv_20= ':' ( (lv_toElement_21_0= RULE_ID ) ) otherlv_22= 'from' ( (lv_toRoleName_23_0= RULE_ID ) ) otherlv_24= 'toGetElement' ( (lv_toGetElement_25_0= RULE_STRING ) ) otherlv_26= ';' (otherlv_27= 'nested' otherlv_28= 'mappings' otherlv_29= ':' ( (lv_nestedMappings_30_0= ruleNestedMapping ) )* otherlv_31= 'end' )? (otherlv_32= 'interLanguageMappingEnds' otherlv_33= ':' ( (lv_interLanguageMappingEnds_34_0= ruleInterLanguageMappingEnd ) )* otherlv_35= 'end' )? otherlv_36= '}' )
            {
            // InternalPerspectiveDSL.g:479:2: (otherlv_0= 'mapping' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'fromCardinality' otherlv_4= ':' ( (lv_fromCardinality_5_0= ruleCardinality ) ) otherlv_6= ';' otherlv_7= 'toCardinality' otherlv_8= ':' ( (lv_toCardinality_9_0= ruleCardinality ) ) otherlv_10= ';' otherlv_11= 'fromElement' otherlv_12= ':' ( (lv_fromElement_13_0= RULE_ID ) ) otherlv_14= 'from' ( (lv_fromRoleName_15_0= RULE_ID ) ) otherlv_16= 'fromGetElement' ( (lv_fromGetElement_17_0= RULE_STRING ) ) otherlv_18= ';' otherlv_19= 'toELement' otherlv_20= ':' ( (lv_toElement_21_0= RULE_ID ) ) otherlv_22= 'from' ( (lv_toRoleName_23_0= RULE_ID ) ) otherlv_24= 'toGetElement' ( (lv_toGetElement_25_0= RULE_STRING ) ) otherlv_26= ';' (otherlv_27= 'nested' otherlv_28= 'mappings' otherlv_29= ':' ( (lv_nestedMappings_30_0= ruleNestedMapping ) )* otherlv_31= 'end' )? (otherlv_32= 'interLanguageMappingEnds' otherlv_33= ':' ( (lv_interLanguageMappingEnds_34_0= ruleInterLanguageMappingEnd ) )* otherlv_35= 'end' )? otherlv_36= '}' )
            // InternalPerspectiveDSL.g:480:3: otherlv_0= 'mapping' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'fromCardinality' otherlv_4= ':' ( (lv_fromCardinality_5_0= ruleCardinality ) ) otherlv_6= ';' otherlv_7= 'toCardinality' otherlv_8= ':' ( (lv_toCardinality_9_0= ruleCardinality ) ) otherlv_10= ';' otherlv_11= 'fromElement' otherlv_12= ':' ( (lv_fromElement_13_0= RULE_ID ) ) otherlv_14= 'from' ( (lv_fromRoleName_15_0= RULE_ID ) ) otherlv_16= 'fromGetElement' ( (lv_fromGetElement_17_0= RULE_STRING ) ) otherlv_18= ';' otherlv_19= 'toELement' otherlv_20= ':' ( (lv_toElement_21_0= RULE_ID ) ) otherlv_22= 'from' ( (lv_toRoleName_23_0= RULE_ID ) ) otherlv_24= 'toGetElement' ( (lv_toGetElement_25_0= RULE_STRING ) ) otherlv_26= ';' (otherlv_27= 'nested' otherlv_28= 'mappings' otherlv_29= ':' ( (lv_nestedMappings_30_0= ruleNestedMapping ) )* otherlv_31= 'end' )? (otherlv_32= 'interLanguageMappingEnds' otherlv_33= ':' ( (lv_interLanguageMappingEnds_34_0= ruleInterLanguageMappingEnd ) )* otherlv_35= 'end' )? otherlv_36= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLanguageElementMappingAccess().getMappingKeyword_0());
            		
            // InternalPerspectiveDSL.g:484:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPerspectiveDSL.g:485:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPerspectiveDSL.g:485:4: (lv_name_1_0= RULE_ID )
            // InternalPerspectiveDSL.g:486:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLanguageElementMappingAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLanguageElementMappingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getLanguageElementMappingAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,30,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getLanguageElementMappingAccess().getFromCardinalityKeyword_3());
            		
            otherlv_4=(Token)match(input,18,FOLLOW_26); 

            			newLeafNode(otherlv_4, grammarAccess.getLanguageElementMappingAccess().getColonKeyword_4());
            		
            // InternalPerspectiveDSL.g:514:3: ( (lv_fromCardinality_5_0= ruleCardinality ) )
            // InternalPerspectiveDSL.g:515:4: (lv_fromCardinality_5_0= ruleCardinality )
            {
            // InternalPerspectiveDSL.g:515:4: (lv_fromCardinality_5_0= ruleCardinality )
            // InternalPerspectiveDSL.g:516:5: lv_fromCardinality_5_0= ruleCardinality
            {

            					newCompositeNode(grammarAccess.getLanguageElementMappingAccess().getFromCardinalityCardinalityEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_fromCardinality_5_0=ruleCardinality();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLanguageElementMappingRule());
            					}
            					set(
            						current,
            						"fromCardinality",
            						lv_fromCardinality_5_0,
            						"ca.mcgill.sel.perspectivedsl.ca.mcgill.sel.PerspectiveDSL.Cardinality");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_27); 

            			newLeafNode(otherlv_6, grammarAccess.getLanguageElementMappingAccess().getSemicolonKeyword_6());
            		
            otherlv_7=(Token)match(input,31,FOLLOW_12); 

            			newLeafNode(otherlv_7, grammarAccess.getLanguageElementMappingAccess().getToCardinalityKeyword_7());
            		
            otherlv_8=(Token)match(input,18,FOLLOW_26); 

            			newLeafNode(otherlv_8, grammarAccess.getLanguageElementMappingAccess().getColonKeyword_8());
            		
            // InternalPerspectiveDSL.g:545:3: ( (lv_toCardinality_9_0= ruleCardinality ) )
            // InternalPerspectiveDSL.g:546:4: (lv_toCardinality_9_0= ruleCardinality )
            {
            // InternalPerspectiveDSL.g:546:4: (lv_toCardinality_9_0= ruleCardinality )
            // InternalPerspectiveDSL.g:547:5: lv_toCardinality_9_0= ruleCardinality
            {

            					newCompositeNode(grammarAccess.getLanguageElementMappingAccess().getToCardinalityCardinalityEnumRuleCall_9_0());
            				
            pushFollow(FOLLOW_7);
            lv_toCardinality_9_0=ruleCardinality();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLanguageElementMappingRule());
            					}
            					set(
            						current,
            						"toCardinality",
            						lv_toCardinality_9_0,
            						"ca.mcgill.sel.perspectivedsl.ca.mcgill.sel.PerspectiveDSL.Cardinality");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,14,FOLLOW_28); 

            			newLeafNode(otherlv_10, grammarAccess.getLanguageElementMappingAccess().getSemicolonKeyword_10());
            		
            otherlv_11=(Token)match(input,32,FOLLOW_12); 

            			newLeafNode(otherlv_11, grammarAccess.getLanguageElementMappingAccess().getFromElementKeyword_11());
            		
            otherlv_12=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_12, grammarAccess.getLanguageElementMappingAccess().getColonKeyword_12());
            		
            // InternalPerspectiveDSL.g:576:3: ( (lv_fromElement_13_0= RULE_ID ) )
            // InternalPerspectiveDSL.g:577:4: (lv_fromElement_13_0= RULE_ID )
            {
            // InternalPerspectiveDSL.g:577:4: (lv_fromElement_13_0= RULE_ID )
            // InternalPerspectiveDSL.g:578:5: lv_fromElement_13_0= RULE_ID
            {
            lv_fromElement_13_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(lv_fromElement_13_0, grammarAccess.getLanguageElementMappingAccess().getFromElementIDTerminalRuleCall_13_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLanguageElementMappingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"fromElement",
            						lv_fromElement_13_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_14=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_14, grammarAccess.getLanguageElementMappingAccess().getFromKeyword_14());
            		
            // InternalPerspectiveDSL.g:598:3: ( (lv_fromRoleName_15_0= RULE_ID ) )
            // InternalPerspectiveDSL.g:599:4: (lv_fromRoleName_15_0= RULE_ID )
            {
            // InternalPerspectiveDSL.g:599:4: (lv_fromRoleName_15_0= RULE_ID )
            // InternalPerspectiveDSL.g:600:5: lv_fromRoleName_15_0= RULE_ID
            {
            lv_fromRoleName_15_0=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(lv_fromRoleName_15_0, grammarAccess.getLanguageElementMappingAccess().getFromRoleNameIDTerminalRuleCall_15_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLanguageElementMappingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"fromRoleName",
            						lv_fromRoleName_15_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_16=(Token)match(input,34,FOLLOW_10); 

            			newLeafNode(otherlv_16, grammarAccess.getLanguageElementMappingAccess().getFromGetElementKeyword_16());
            		
            // InternalPerspectiveDSL.g:620:3: ( (lv_fromGetElement_17_0= RULE_STRING ) )
            // InternalPerspectiveDSL.g:621:4: (lv_fromGetElement_17_0= RULE_STRING )
            {
            // InternalPerspectiveDSL.g:621:4: (lv_fromGetElement_17_0= RULE_STRING )
            // InternalPerspectiveDSL.g:622:5: lv_fromGetElement_17_0= RULE_STRING
            {
            lv_fromGetElement_17_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_fromGetElement_17_0, grammarAccess.getLanguageElementMappingAccess().getFromGetElementSTRINGTerminalRuleCall_17_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLanguageElementMappingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"fromGetElement",
            						lv_fromGetElement_17_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_18=(Token)match(input,14,FOLLOW_31); 

            			newLeafNode(otherlv_18, grammarAccess.getLanguageElementMappingAccess().getSemicolonKeyword_18());
            		
            otherlv_19=(Token)match(input,35,FOLLOW_12); 

            			newLeafNode(otherlv_19, grammarAccess.getLanguageElementMappingAccess().getToELementKeyword_19());
            		
            otherlv_20=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_20, grammarAccess.getLanguageElementMappingAccess().getColonKeyword_20());
            		
            // InternalPerspectiveDSL.g:650:3: ( (lv_toElement_21_0= RULE_ID ) )
            // InternalPerspectiveDSL.g:651:4: (lv_toElement_21_0= RULE_ID )
            {
            // InternalPerspectiveDSL.g:651:4: (lv_toElement_21_0= RULE_ID )
            // InternalPerspectiveDSL.g:652:5: lv_toElement_21_0= RULE_ID
            {
            lv_toElement_21_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(lv_toElement_21_0, grammarAccess.getLanguageElementMappingAccess().getToElementIDTerminalRuleCall_21_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLanguageElementMappingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"toElement",
            						lv_toElement_21_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_22=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_22, grammarAccess.getLanguageElementMappingAccess().getFromKeyword_22());
            		
            // InternalPerspectiveDSL.g:672:3: ( (lv_toRoleName_23_0= RULE_ID ) )
            // InternalPerspectiveDSL.g:673:4: (lv_toRoleName_23_0= RULE_ID )
            {
            // InternalPerspectiveDSL.g:673:4: (lv_toRoleName_23_0= RULE_ID )
            // InternalPerspectiveDSL.g:674:5: lv_toRoleName_23_0= RULE_ID
            {
            lv_toRoleName_23_0=(Token)match(input,RULE_ID,FOLLOW_32); 

            					newLeafNode(lv_toRoleName_23_0, grammarAccess.getLanguageElementMappingAccess().getToRoleNameIDTerminalRuleCall_23_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLanguageElementMappingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"toRoleName",
            						lv_toRoleName_23_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_24=(Token)match(input,36,FOLLOW_10); 

            			newLeafNode(otherlv_24, grammarAccess.getLanguageElementMappingAccess().getToGetElementKeyword_24());
            		
            // InternalPerspectiveDSL.g:694:3: ( (lv_toGetElement_25_0= RULE_STRING ) )
            // InternalPerspectiveDSL.g:695:4: (lv_toGetElement_25_0= RULE_STRING )
            {
            // InternalPerspectiveDSL.g:695:4: (lv_toGetElement_25_0= RULE_STRING )
            // InternalPerspectiveDSL.g:696:5: lv_toGetElement_25_0= RULE_STRING
            {
            lv_toGetElement_25_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_toGetElement_25_0, grammarAccess.getLanguageElementMappingAccess().getToGetElementSTRINGTerminalRuleCall_25_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLanguageElementMappingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"toGetElement",
            						lv_toGetElement_25_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_26=(Token)match(input,14,FOLLOW_33); 

            			newLeafNode(otherlv_26, grammarAccess.getLanguageElementMappingAccess().getSemicolonKeyword_26());
            		
            // InternalPerspectiveDSL.g:716:3: (otherlv_27= 'nested' otherlv_28= 'mappings' otherlv_29= ':' ( (lv_nestedMappings_30_0= ruleNestedMapping ) )* otherlv_31= 'end' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==37) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalPerspectiveDSL.g:717:4: otherlv_27= 'nested' otherlv_28= 'mappings' otherlv_29= ':' ( (lv_nestedMappings_30_0= ruleNestedMapping ) )* otherlv_31= 'end'
                    {
                    otherlv_27=(Token)match(input,37,FOLLOW_16); 

                    				newLeafNode(otherlv_27, grammarAccess.getLanguageElementMappingAccess().getNestedKeyword_27_0());
                    			
                    otherlv_28=(Token)match(input,21,FOLLOW_12); 

                    				newLeafNode(otherlv_28, grammarAccess.getLanguageElementMappingAccess().getMappingsKeyword_27_1());
                    			
                    otherlv_29=(Token)match(input,18,FOLLOW_34); 

                    				newLeafNode(otherlv_29, grammarAccess.getLanguageElementMappingAccess().getColonKeyword_27_2());
                    			
                    // InternalPerspectiveDSL.g:729:4: ( (lv_nestedMappings_30_0= ruleNestedMapping ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==37) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalPerspectiveDSL.g:730:5: (lv_nestedMappings_30_0= ruleNestedMapping )
                    	    {
                    	    // InternalPerspectiveDSL.g:730:5: (lv_nestedMappings_30_0= ruleNestedMapping )
                    	    // InternalPerspectiveDSL.g:731:6: lv_nestedMappings_30_0= ruleNestedMapping
                    	    {

                    	    						newCompositeNode(grammarAccess.getLanguageElementMappingAccess().getNestedMappingsNestedMappingParserRuleCall_27_3_0());
                    	    					
                    	    pushFollow(FOLLOW_34);
                    	    lv_nestedMappings_30_0=ruleNestedMapping();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getLanguageElementMappingRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"nestedMappings",
                    	    							lv_nestedMappings_30_0,
                    	    							"ca.mcgill.sel.perspectivedsl.ca.mcgill.sel.PerspectiveDSL.NestedMapping");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_31=(Token)match(input,19,FOLLOW_35); 

                    				newLeafNode(otherlv_31, grammarAccess.getLanguageElementMappingAccess().getEndKeyword_27_4());
                    			

                    }
                    break;

            }

            // InternalPerspectiveDSL.g:753:3: (otherlv_32= 'interLanguageMappingEnds' otherlv_33= ':' ( (lv_interLanguageMappingEnds_34_0= ruleInterLanguageMappingEnd ) )* otherlv_35= 'end' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==38) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalPerspectiveDSL.g:754:4: otherlv_32= 'interLanguageMappingEnds' otherlv_33= ':' ( (lv_interLanguageMappingEnds_34_0= ruleInterLanguageMappingEnd ) )* otherlv_35= 'end'
                    {
                    otherlv_32=(Token)match(input,38,FOLLOW_12); 

                    				newLeafNode(otherlv_32, grammarAccess.getLanguageElementMappingAccess().getInterLanguageMappingEndsKeyword_28_0());
                    			
                    otherlv_33=(Token)match(input,18,FOLLOW_36); 

                    				newLeafNode(otherlv_33, grammarAccess.getLanguageElementMappingAccess().getColonKeyword_28_1());
                    			
                    // InternalPerspectiveDSL.g:762:4: ( (lv_interLanguageMappingEnds_34_0= ruleInterLanguageMappingEnd ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==40) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalPerspectiveDSL.g:763:5: (lv_interLanguageMappingEnds_34_0= ruleInterLanguageMappingEnd )
                    	    {
                    	    // InternalPerspectiveDSL.g:763:5: (lv_interLanguageMappingEnds_34_0= ruleInterLanguageMappingEnd )
                    	    // InternalPerspectiveDSL.g:764:6: lv_interLanguageMappingEnds_34_0= ruleInterLanguageMappingEnd
                    	    {

                    	    						newCompositeNode(grammarAccess.getLanguageElementMappingAccess().getInterLanguageMappingEndsInterLanguageMappingEndParserRuleCall_28_2_0());
                    	    					
                    	    pushFollow(FOLLOW_36);
                    	    lv_interLanguageMappingEnds_34_0=ruleInterLanguageMappingEnd();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getLanguageElementMappingRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"interLanguageMappingEnds",
                    	    							lv_interLanguageMappingEnds_34_0,
                    	    							"ca.mcgill.sel.perspectivedsl.ca.mcgill.sel.PerspectiveDSL.InterLanguageMappingEnd");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_35=(Token)match(input,19,FOLLOW_20); 

                    				newLeafNode(otherlv_35, grammarAccess.getLanguageElementMappingAccess().getEndKeyword_28_3());
                    			

                    }
                    break;

            }

            otherlv_36=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_36, grammarAccess.getLanguageElementMappingAccess().getRightCurlyBracketKeyword_29());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLanguageElementMapping"


    // $ANTLR start "entryRuleNestedMapping"
    // InternalPerspectiveDSL.g:794:1: entryRuleNestedMapping returns [EObject current=null] : iv_ruleNestedMapping= ruleNestedMapping EOF ;
    public final EObject entryRuleNestedMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedMapping = null;


        try {
            // InternalPerspectiveDSL.g:794:54: (iv_ruleNestedMapping= ruleNestedMapping EOF )
            // InternalPerspectiveDSL.g:795:2: iv_ruleNestedMapping= ruleNestedMapping EOF
            {
             newCompositeNode(grammarAccess.getNestedMappingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNestedMapping=ruleNestedMapping();

            state._fsp--;

             current =iv_ruleNestedMapping; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNestedMapping"


    // $ANTLR start "ruleNestedMapping"
    // InternalPerspectiveDSL.g:801:1: ruleNestedMapping returns [EObject current=null] : (otherlv_0= 'nested' otherlv_1= 'mapping' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'fromElement' otherlv_5= ':' otherlv_6= 'elementName' ( (lv_fromElementName_7_0= RULE_STRING ) ) otherlv_8= 'from' ( (lv_fromRoleName_9_0= RULE_ID ) ) otherlv_10= ';' otherlv_11= 'toELement' otherlv_12= ':' otherlv_13= 'elementName' ( (lv_toElementName_14_0= RULE_STRING ) ) otherlv_15= 'from' ( (lv_toRoleName_16_0= RULE_ID ) ) otherlv_17= ';' otherlv_18= 'end' ) ;
    public final EObject ruleNestedMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_fromElementName_7_0=null;
        Token otherlv_8=null;
        Token lv_fromRoleName_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_toElementName_14_0=null;
        Token otherlv_15=null;
        Token lv_toRoleName_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;


        	enterRule();

        try {
            // InternalPerspectiveDSL.g:807:2: ( (otherlv_0= 'nested' otherlv_1= 'mapping' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'fromElement' otherlv_5= ':' otherlv_6= 'elementName' ( (lv_fromElementName_7_0= RULE_STRING ) ) otherlv_8= 'from' ( (lv_fromRoleName_9_0= RULE_ID ) ) otherlv_10= ';' otherlv_11= 'toELement' otherlv_12= ':' otherlv_13= 'elementName' ( (lv_toElementName_14_0= RULE_STRING ) ) otherlv_15= 'from' ( (lv_toRoleName_16_0= RULE_ID ) ) otherlv_17= ';' otherlv_18= 'end' ) )
            // InternalPerspectiveDSL.g:808:2: (otherlv_0= 'nested' otherlv_1= 'mapping' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'fromElement' otherlv_5= ':' otherlv_6= 'elementName' ( (lv_fromElementName_7_0= RULE_STRING ) ) otherlv_8= 'from' ( (lv_fromRoleName_9_0= RULE_ID ) ) otherlv_10= ';' otherlv_11= 'toELement' otherlv_12= ':' otherlv_13= 'elementName' ( (lv_toElementName_14_0= RULE_STRING ) ) otherlv_15= 'from' ( (lv_toRoleName_16_0= RULE_ID ) ) otherlv_17= ';' otherlv_18= 'end' )
            {
            // InternalPerspectiveDSL.g:808:2: (otherlv_0= 'nested' otherlv_1= 'mapping' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'fromElement' otherlv_5= ':' otherlv_6= 'elementName' ( (lv_fromElementName_7_0= RULE_STRING ) ) otherlv_8= 'from' ( (lv_fromRoleName_9_0= RULE_ID ) ) otherlv_10= ';' otherlv_11= 'toELement' otherlv_12= ':' otherlv_13= 'elementName' ( (lv_toElementName_14_0= RULE_STRING ) ) otherlv_15= 'from' ( (lv_toRoleName_16_0= RULE_ID ) ) otherlv_17= ';' otherlv_18= 'end' )
            // InternalPerspectiveDSL.g:809:3: otherlv_0= 'nested' otherlv_1= 'mapping' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' otherlv_4= 'fromElement' otherlv_5= ':' otherlv_6= 'elementName' ( (lv_fromElementName_7_0= RULE_STRING ) ) otherlv_8= 'from' ( (lv_fromRoleName_9_0= RULE_ID ) ) otherlv_10= ';' otherlv_11= 'toELement' otherlv_12= ':' otherlv_13= 'elementName' ( (lv_toElementName_14_0= RULE_STRING ) ) otherlv_15= 'from' ( (lv_toRoleName_16_0= RULE_ID ) ) otherlv_17= ';' otherlv_18= 'end'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37); 

            			newLeafNode(otherlv_0, grammarAccess.getNestedMappingAccess().getNestedKeyword_0());
            		
            otherlv_1=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getNestedMappingAccess().getMappingKeyword_1());
            		
            // InternalPerspectiveDSL.g:817:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalPerspectiveDSL.g:818:4: (lv_name_2_0= RULE_ID )
            {
            // InternalPerspectiveDSL.g:818:4: (lv_name_2_0= RULE_ID )
            // InternalPerspectiveDSL.g:819:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_2_0, grammarAccess.getNestedMappingAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNestedMappingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_28); 

            			newLeafNode(otherlv_3, grammarAccess.getNestedMappingAccess().getColonKeyword_3());
            		
            otherlv_4=(Token)match(input,32,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getNestedMappingAccess().getFromElementKeyword_4());
            		
            otherlv_5=(Token)match(input,18,FOLLOW_38); 

            			newLeafNode(otherlv_5, grammarAccess.getNestedMappingAccess().getColonKeyword_5());
            		
            otherlv_6=(Token)match(input,39,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getNestedMappingAccess().getElementNameKeyword_6());
            		
            // InternalPerspectiveDSL.g:851:3: ( (lv_fromElementName_7_0= RULE_STRING ) )
            // InternalPerspectiveDSL.g:852:4: (lv_fromElementName_7_0= RULE_STRING )
            {
            // InternalPerspectiveDSL.g:852:4: (lv_fromElementName_7_0= RULE_STRING )
            // InternalPerspectiveDSL.g:853:5: lv_fromElementName_7_0= RULE_STRING
            {
            lv_fromElementName_7_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

            					newLeafNode(lv_fromElementName_7_0, grammarAccess.getNestedMappingAccess().getFromElementNameSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNestedMappingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"fromElementName",
            						lv_fromElementName_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_8, grammarAccess.getNestedMappingAccess().getFromKeyword_8());
            		
            // InternalPerspectiveDSL.g:873:3: ( (lv_fromRoleName_9_0= RULE_ID ) )
            // InternalPerspectiveDSL.g:874:4: (lv_fromRoleName_9_0= RULE_ID )
            {
            // InternalPerspectiveDSL.g:874:4: (lv_fromRoleName_9_0= RULE_ID )
            // InternalPerspectiveDSL.g:875:5: lv_fromRoleName_9_0= RULE_ID
            {
            lv_fromRoleName_9_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_fromRoleName_9_0, grammarAccess.getNestedMappingAccess().getFromRoleNameIDTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNestedMappingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"fromRoleName",
            						lv_fromRoleName_9_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_10=(Token)match(input,14,FOLLOW_31); 

            			newLeafNode(otherlv_10, grammarAccess.getNestedMappingAccess().getSemicolonKeyword_10());
            		
            otherlv_11=(Token)match(input,35,FOLLOW_12); 

            			newLeafNode(otherlv_11, grammarAccess.getNestedMappingAccess().getToELementKeyword_11());
            		
            otherlv_12=(Token)match(input,18,FOLLOW_38); 

            			newLeafNode(otherlv_12, grammarAccess.getNestedMappingAccess().getColonKeyword_12());
            		
            otherlv_13=(Token)match(input,39,FOLLOW_10); 

            			newLeafNode(otherlv_13, grammarAccess.getNestedMappingAccess().getElementNameKeyword_13());
            		
            // InternalPerspectiveDSL.g:907:3: ( (lv_toElementName_14_0= RULE_STRING ) )
            // InternalPerspectiveDSL.g:908:4: (lv_toElementName_14_0= RULE_STRING )
            {
            // InternalPerspectiveDSL.g:908:4: (lv_toElementName_14_0= RULE_STRING )
            // InternalPerspectiveDSL.g:909:5: lv_toElementName_14_0= RULE_STRING
            {
            lv_toElementName_14_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

            					newLeafNode(lv_toElementName_14_0, grammarAccess.getNestedMappingAccess().getToElementNameSTRINGTerminalRuleCall_14_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNestedMappingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"toElementName",
            						lv_toElementName_14_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_15=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_15, grammarAccess.getNestedMappingAccess().getFromKeyword_15());
            		
            // InternalPerspectiveDSL.g:929:3: ( (lv_toRoleName_16_0= RULE_ID ) )
            // InternalPerspectiveDSL.g:930:4: (lv_toRoleName_16_0= RULE_ID )
            {
            // InternalPerspectiveDSL.g:930:4: (lv_toRoleName_16_0= RULE_ID )
            // InternalPerspectiveDSL.g:931:5: lv_toRoleName_16_0= RULE_ID
            {
            lv_toRoleName_16_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_toRoleName_16_0, grammarAccess.getNestedMappingAccess().getToRoleNameIDTerminalRuleCall_16_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNestedMappingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"toRoleName",
            						lv_toRoleName_16_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_17=(Token)match(input,14,FOLLOW_39); 

            			newLeafNode(otherlv_17, grammarAccess.getNestedMappingAccess().getSemicolonKeyword_17());
            		
            otherlv_18=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getNestedMappingAccess().getEndKeyword_18());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNestedMapping"


    // $ANTLR start "entryRuleInterLanguageMappingEnd"
    // InternalPerspectiveDSL.g:959:1: entryRuleInterLanguageMappingEnd returns [EObject current=null] : iv_ruleInterLanguageMappingEnd= ruleInterLanguageMappingEnd EOF ;
    public final EObject entryRuleInterLanguageMappingEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterLanguageMappingEnd = null;


        try {
            // InternalPerspectiveDSL.g:959:64: (iv_ruleInterLanguageMappingEnd= ruleInterLanguageMappingEnd EOF )
            // InternalPerspectiveDSL.g:960:2: iv_ruleInterLanguageMappingEnd= ruleInterLanguageMappingEnd EOF
            {
             newCompositeNode(grammarAccess.getInterLanguageMappingEndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterLanguageMappingEnd=ruleInterLanguageMappingEnd();

            state._fsp--;

             current =iv_ruleInterLanguageMappingEnd; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInterLanguageMappingEnd"


    // $ANTLR start "ruleInterLanguageMappingEnd"
    // InternalPerspectiveDSL.g:966:1: ruleInterLanguageMappingEnd returns [EObject current=null] : (otherlv_0= 'inter' otherlv_1= 'language' otherlv_2= 'mapping' otherlv_3= 'end' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' otherlv_6= 'origin' otherlv_7= ':' ( (lv_origin_8_0= ';' ) ) otherlv_9= 'destination' otherlv_10= ':' ( (lv_destination_11_0= ';' ) ) otherlv_12= '}' ) ;
    public final EObject ruleInterLanguageMappingEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_origin_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_destination_11_0=null;
        Token otherlv_12=null;


        	enterRule();

        try {
            // InternalPerspectiveDSL.g:972:2: ( (otherlv_0= 'inter' otherlv_1= 'language' otherlv_2= 'mapping' otherlv_3= 'end' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' otherlv_6= 'origin' otherlv_7= ':' ( (lv_origin_8_0= ';' ) ) otherlv_9= 'destination' otherlv_10= ':' ( (lv_destination_11_0= ';' ) ) otherlv_12= '}' ) )
            // InternalPerspectiveDSL.g:973:2: (otherlv_0= 'inter' otherlv_1= 'language' otherlv_2= 'mapping' otherlv_3= 'end' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' otherlv_6= 'origin' otherlv_7= ':' ( (lv_origin_8_0= ';' ) ) otherlv_9= 'destination' otherlv_10= ':' ( (lv_destination_11_0= ';' ) ) otherlv_12= '}' )
            {
            // InternalPerspectiveDSL.g:973:2: (otherlv_0= 'inter' otherlv_1= 'language' otherlv_2= 'mapping' otherlv_3= 'end' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' otherlv_6= 'origin' otherlv_7= ':' ( (lv_origin_8_0= ';' ) ) otherlv_9= 'destination' otherlv_10= ':' ( (lv_destination_11_0= ';' ) ) otherlv_12= '}' )
            // InternalPerspectiveDSL.g:974:3: otherlv_0= 'inter' otherlv_1= 'language' otherlv_2= 'mapping' otherlv_3= 'end' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' otherlv_6= 'origin' otherlv_7= ':' ( (lv_origin_8_0= ';' ) ) otherlv_9= 'destination' otherlv_10= ':' ( (lv_destination_11_0= ';' ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getInterLanguageMappingEndAccess().getInterKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getInterLanguageMappingEndAccess().getLanguageKeyword_1());
            		
            otherlv_2=(Token)match(input,29,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getInterLanguageMappingEndAccess().getMappingKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getInterLanguageMappingEndAccess().getEndKeyword_3());
            		
            // InternalPerspectiveDSL.g:990:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalPerspectiveDSL.g:991:4: (lv_name_4_0= RULE_ID )
            {
            // InternalPerspectiveDSL.g:991:4: (lv_name_4_0= RULE_ID )
            // InternalPerspectiveDSL.g:992:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_4_0, grammarAccess.getInterLanguageMappingEndAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInterLanguageMappingEndRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,12,FOLLOW_40); 

            			newLeafNode(otherlv_5, grammarAccess.getInterLanguageMappingEndAccess().getLeftCurlyBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,41,FOLLOW_12); 

            			newLeafNode(otherlv_6, grammarAccess.getInterLanguageMappingEndAccess().getOriginKeyword_6());
            		
            otherlv_7=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getInterLanguageMappingEndAccess().getColonKeyword_7());
            		
            // InternalPerspectiveDSL.g:1020:3: ( (lv_origin_8_0= ';' ) )
            // InternalPerspectiveDSL.g:1021:4: (lv_origin_8_0= ';' )
            {
            // InternalPerspectiveDSL.g:1021:4: (lv_origin_8_0= ';' )
            // InternalPerspectiveDSL.g:1022:5: lv_origin_8_0= ';'
            {
            lv_origin_8_0=(Token)match(input,14,FOLLOW_41); 

            					newLeafNode(lv_origin_8_0, grammarAccess.getInterLanguageMappingEndAccess().getOriginSemicolonKeyword_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInterLanguageMappingEndRule());
            					}
            					setWithLastConsumed(current, "origin", lv_origin_8_0 != null, ";");
            				

            }


            }

            otherlv_9=(Token)match(input,42,FOLLOW_12); 

            			newLeafNode(otherlv_9, grammarAccess.getInterLanguageMappingEndAccess().getDestinationKeyword_9());
            		
            otherlv_10=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_10, grammarAccess.getInterLanguageMappingEndAccess().getColonKeyword_10());
            		
            // InternalPerspectiveDSL.g:1042:3: ( (lv_destination_11_0= ';' ) )
            // InternalPerspectiveDSL.g:1043:4: (lv_destination_11_0= ';' )
            {
            // InternalPerspectiveDSL.g:1043:4: (lv_destination_11_0= ';' )
            // InternalPerspectiveDSL.g:1044:5: lv_destination_11_0= ';'
            {
            lv_destination_11_0=(Token)match(input,14,FOLLOW_20); 

            					newLeafNode(lv_destination_11_0, grammarAccess.getInterLanguageMappingEndAccess().getDestinationSemicolonKeyword_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInterLanguageMappingEndRule());
            					}
            					setWithLastConsumed(current, "destination", lv_destination_11_0 != null, ";");
            				

            }


            }

            otherlv_12=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getInterLanguageMappingEndAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterLanguageMappingEnd"


    // $ANTLR start "entryRuleAction"
    // InternalPerspectiveDSL.g:1064:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalPerspectiveDSL.g:1064:47: (iv_ruleAction= ruleAction EOF )
            // InternalPerspectiveDSL.g:1065:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalPerspectiveDSL.g:1071:1: ruleAction returns [EObject current=null] : (otherlv_0= 'action' ( (lv_actionType_1_0= rulePerspectiveActionType ) ) ( (lv_roleName_2_0= RULE_ID ) ) ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ';' ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_roleName_2_0=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Enumerator lv_actionType_1_0 = null;



        	enterRule();

        try {
            // InternalPerspectiveDSL.g:1077:2: ( (otherlv_0= 'action' ( (lv_actionType_1_0= rulePerspectiveActionType ) ) ( (lv_roleName_2_0= RULE_ID ) ) ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ';' ) )
            // InternalPerspectiveDSL.g:1078:2: (otherlv_0= 'action' ( (lv_actionType_1_0= rulePerspectiveActionType ) ) ( (lv_roleName_2_0= RULE_ID ) ) ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ';' )
            {
            // InternalPerspectiveDSL.g:1078:2: (otherlv_0= 'action' ( (lv_actionType_1_0= rulePerspectiveActionType ) ) ( (lv_roleName_2_0= RULE_ID ) ) ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ';' )
            // InternalPerspectiveDSL.g:1079:3: otherlv_0= 'action' ( (lv_actionType_1_0= rulePerspectiveActionType ) ) ( (lv_roleName_2_0= RULE_ID ) ) ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_42); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActionKeyword_0());
            		
            // InternalPerspectiveDSL.g:1083:3: ( (lv_actionType_1_0= rulePerspectiveActionType ) )
            // InternalPerspectiveDSL.g:1084:4: (lv_actionType_1_0= rulePerspectiveActionType )
            {
            // InternalPerspectiveDSL.g:1084:4: (lv_actionType_1_0= rulePerspectiveActionType )
            // InternalPerspectiveDSL.g:1085:5: lv_actionType_1_0= rulePerspectiveActionType
            {

            					newCompositeNode(grammarAccess.getActionAccess().getActionTypePerspectiveActionTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_actionType_1_0=rulePerspectiveActionType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionRule());
            					}
            					set(
            						current,
            						"actionType",
            						lv_actionType_1_0,
            						"ca.mcgill.sel.perspectivedsl.ca.mcgill.sel.PerspectiveDSL.PerspectiveActionType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPerspectiveDSL.g:1102:3: ( (lv_roleName_2_0= RULE_ID ) )
            // InternalPerspectiveDSL.g:1103:4: (lv_roleName_2_0= RULE_ID )
            {
            // InternalPerspectiveDSL.g:1103:4: (lv_roleName_2_0= RULE_ID )
            // InternalPerspectiveDSL.g:1104:5: lv_roleName_2_0= RULE_ID
            {
            lv_roleName_2_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_roleName_2_0, grammarAccess.getActionAccess().getRoleNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"roleName",
            						lv_roleName_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalPerspectiveDSL.g:1120:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalPerspectiveDSL.g:1121:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalPerspectiveDSL.g:1121:4: (lv_name_3_0= RULE_STRING )
            // InternalPerspectiveDSL.g:1122:5: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_name_3_0, grammarAccess.getActionAccess().getNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getActionAccess().getSemicolonKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleIntraLanguageMapping"
    // InternalPerspectiveDSL.g:1146:1: entryRuleIntraLanguageMapping returns [EObject current=null] : iv_ruleIntraLanguageMapping= ruleIntraLanguageMapping EOF ;
    public final EObject entryRuleIntraLanguageMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntraLanguageMapping = null;


        try {
            // InternalPerspectiveDSL.g:1146:61: (iv_ruleIntraLanguageMapping= ruleIntraLanguageMapping EOF )
            // InternalPerspectiveDSL.g:1147:2: iv_ruleIntraLanguageMapping= ruleIntraLanguageMapping EOF
            {
             newCompositeNode(grammarAccess.getIntraLanguageMappingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntraLanguageMapping=ruleIntraLanguageMapping();

            state._fsp--;

             current =iv_ruleIntraLanguageMapping; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIntraLanguageMapping"


    // $ANTLR start "ruleIntraLanguageMapping"
    // InternalPerspectiveDSL.g:1153:1: ruleIntraLanguageMapping returns [EObject current=null] : (otherlv_0= 'Intra' otherlv_1= 'Language' otherlv_2= 'Mapping' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'closure' otherlv_6= ':' ( (lv_closure_7_0= ';' ) ) otherlv_8= 'reuse' otherlv_9= ':' ( (lv_reuse_10_0= ';' ) ) otherlv_11= 'increaseDepth' otherlv_12= ':' ( (lv_increaseDepth_13_0= ';' ) ) otherlv_14= 'changeModel' otherlv_15= ':' ( (lv_changeModel_16_0= ';' ) ) otherlv_17= 'fromElement' otherlv_18= ':' ( (lv_fromElement_19_0= RULE_ID ) ) otherlv_20= 'fromGetElement' ( (lv_fromGetElement_21_0= RULE_STRING ) ) otherlv_22= ';' otherlv_23= 'hops' otherlv_24= ':' ( (lv_hops_25_0= ruleHop ) )* otherlv_26= 'end' otherlv_27= '}' ) ;
    public final EObject ruleIntraLanguageMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_closure_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_reuse_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_increaseDepth_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_changeModel_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_fromElement_19_0=null;
        Token otherlv_20=null;
        Token lv_fromGetElement_21_0=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        EObject lv_hops_25_0 = null;



        	enterRule();

        try {
            // InternalPerspectiveDSL.g:1159:2: ( (otherlv_0= 'Intra' otherlv_1= 'Language' otherlv_2= 'Mapping' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'closure' otherlv_6= ':' ( (lv_closure_7_0= ';' ) ) otherlv_8= 'reuse' otherlv_9= ':' ( (lv_reuse_10_0= ';' ) ) otherlv_11= 'increaseDepth' otherlv_12= ':' ( (lv_increaseDepth_13_0= ';' ) ) otherlv_14= 'changeModel' otherlv_15= ':' ( (lv_changeModel_16_0= ';' ) ) otherlv_17= 'fromElement' otherlv_18= ':' ( (lv_fromElement_19_0= RULE_ID ) ) otherlv_20= 'fromGetElement' ( (lv_fromGetElement_21_0= RULE_STRING ) ) otherlv_22= ';' otherlv_23= 'hops' otherlv_24= ':' ( (lv_hops_25_0= ruleHop ) )* otherlv_26= 'end' otherlv_27= '}' ) )
            // InternalPerspectiveDSL.g:1160:2: (otherlv_0= 'Intra' otherlv_1= 'Language' otherlv_2= 'Mapping' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'closure' otherlv_6= ':' ( (lv_closure_7_0= ';' ) ) otherlv_8= 'reuse' otherlv_9= ':' ( (lv_reuse_10_0= ';' ) ) otherlv_11= 'increaseDepth' otherlv_12= ':' ( (lv_increaseDepth_13_0= ';' ) ) otherlv_14= 'changeModel' otherlv_15= ':' ( (lv_changeModel_16_0= ';' ) ) otherlv_17= 'fromElement' otherlv_18= ':' ( (lv_fromElement_19_0= RULE_ID ) ) otherlv_20= 'fromGetElement' ( (lv_fromGetElement_21_0= RULE_STRING ) ) otherlv_22= ';' otherlv_23= 'hops' otherlv_24= ':' ( (lv_hops_25_0= ruleHop ) )* otherlv_26= 'end' otherlv_27= '}' )
            {
            // InternalPerspectiveDSL.g:1160:2: (otherlv_0= 'Intra' otherlv_1= 'Language' otherlv_2= 'Mapping' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'closure' otherlv_6= ':' ( (lv_closure_7_0= ';' ) ) otherlv_8= 'reuse' otherlv_9= ':' ( (lv_reuse_10_0= ';' ) ) otherlv_11= 'increaseDepth' otherlv_12= ':' ( (lv_increaseDepth_13_0= ';' ) ) otherlv_14= 'changeModel' otherlv_15= ':' ( (lv_changeModel_16_0= ';' ) ) otherlv_17= 'fromElement' otherlv_18= ':' ( (lv_fromElement_19_0= RULE_ID ) ) otherlv_20= 'fromGetElement' ( (lv_fromGetElement_21_0= RULE_STRING ) ) otherlv_22= ';' otherlv_23= 'hops' otherlv_24= ':' ( (lv_hops_25_0= ruleHop ) )* otherlv_26= 'end' otherlv_27= '}' )
            // InternalPerspectiveDSL.g:1161:3: otherlv_0= 'Intra' otherlv_1= 'Language' otherlv_2= 'Mapping' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'closure' otherlv_6= ':' ( (lv_closure_7_0= ';' ) ) otherlv_8= 'reuse' otherlv_9= ':' ( (lv_reuse_10_0= ';' ) ) otherlv_11= 'increaseDepth' otherlv_12= ':' ( (lv_increaseDepth_13_0= ';' ) ) otherlv_14= 'changeModel' otherlv_15= ':' ( (lv_changeModel_16_0= ';' ) ) otherlv_17= 'fromElement' otherlv_18= ':' ( (lv_fromElement_19_0= RULE_ID ) ) otherlv_20= 'fromGetElement' ( (lv_fromGetElement_21_0= RULE_STRING ) ) otherlv_22= ';' otherlv_23= 'hops' otherlv_24= ':' ( (lv_hops_25_0= ruleHop ) )* otherlv_26= 'end' otherlv_27= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_43); 

            			newLeafNode(otherlv_0, grammarAccess.getIntraLanguageMappingAccess().getIntraKeyword_0());
            		
            otherlv_1=(Token)match(input,45,FOLLOW_44); 

            			newLeafNode(otherlv_1, grammarAccess.getIntraLanguageMappingAccess().getLanguageKeyword_1());
            		
            otherlv_2=(Token)match(input,46,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getIntraLanguageMappingAccess().getMappingKeyword_2());
            		
            // InternalPerspectiveDSL.g:1173:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalPerspectiveDSL.g:1174:4: (lv_name_3_0= RULE_ID )
            {
            // InternalPerspectiveDSL.g:1174:4: (lv_name_3_0= RULE_ID )
            // InternalPerspectiveDSL.g:1175:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_3_0, grammarAccess.getIntraLanguageMappingAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntraLanguageMappingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_45); 

            			newLeafNode(otherlv_4, grammarAccess.getIntraLanguageMappingAccess().getLeftCurlyBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,47,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getIntraLanguageMappingAccess().getClosureKeyword_5());
            		
            otherlv_6=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getIntraLanguageMappingAccess().getColonKeyword_6());
            		
            // InternalPerspectiveDSL.g:1203:3: ( (lv_closure_7_0= ';' ) )
            // InternalPerspectiveDSL.g:1204:4: (lv_closure_7_0= ';' )
            {
            // InternalPerspectiveDSL.g:1204:4: (lv_closure_7_0= ';' )
            // InternalPerspectiveDSL.g:1205:5: lv_closure_7_0= ';'
            {
            lv_closure_7_0=(Token)match(input,14,FOLLOW_46); 

            					newLeafNode(lv_closure_7_0, grammarAccess.getIntraLanguageMappingAccess().getClosureSemicolonKeyword_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntraLanguageMappingRule());
            					}
            					setWithLastConsumed(current, "closure", lv_closure_7_0 != null, ";");
            				

            }


            }

            otherlv_8=(Token)match(input,48,FOLLOW_12); 

            			newLeafNode(otherlv_8, grammarAccess.getIntraLanguageMappingAccess().getReuseKeyword_8());
            		
            otherlv_9=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getIntraLanguageMappingAccess().getColonKeyword_9());
            		
            // InternalPerspectiveDSL.g:1225:3: ( (lv_reuse_10_0= ';' ) )
            // InternalPerspectiveDSL.g:1226:4: (lv_reuse_10_0= ';' )
            {
            // InternalPerspectiveDSL.g:1226:4: (lv_reuse_10_0= ';' )
            // InternalPerspectiveDSL.g:1227:5: lv_reuse_10_0= ';'
            {
            lv_reuse_10_0=(Token)match(input,14,FOLLOW_47); 

            					newLeafNode(lv_reuse_10_0, grammarAccess.getIntraLanguageMappingAccess().getReuseSemicolonKeyword_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntraLanguageMappingRule());
            					}
            					setWithLastConsumed(current, "reuse", lv_reuse_10_0 != null, ";");
            				

            }


            }

            otherlv_11=(Token)match(input,49,FOLLOW_12); 

            			newLeafNode(otherlv_11, grammarAccess.getIntraLanguageMappingAccess().getIncreaseDepthKeyword_11());
            		
            otherlv_12=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_12, grammarAccess.getIntraLanguageMappingAccess().getColonKeyword_12());
            		
            // InternalPerspectiveDSL.g:1247:3: ( (lv_increaseDepth_13_0= ';' ) )
            // InternalPerspectiveDSL.g:1248:4: (lv_increaseDepth_13_0= ';' )
            {
            // InternalPerspectiveDSL.g:1248:4: (lv_increaseDepth_13_0= ';' )
            // InternalPerspectiveDSL.g:1249:5: lv_increaseDepth_13_0= ';'
            {
            lv_increaseDepth_13_0=(Token)match(input,14,FOLLOW_48); 

            					newLeafNode(lv_increaseDepth_13_0, grammarAccess.getIntraLanguageMappingAccess().getIncreaseDepthSemicolonKeyword_13_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntraLanguageMappingRule());
            					}
            					setWithLastConsumed(current, "increaseDepth", lv_increaseDepth_13_0 != null, ";");
            				

            }


            }

            otherlv_14=(Token)match(input,50,FOLLOW_12); 

            			newLeafNode(otherlv_14, grammarAccess.getIntraLanguageMappingAccess().getChangeModelKeyword_14());
            		
            otherlv_15=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_15, grammarAccess.getIntraLanguageMappingAccess().getColonKeyword_15());
            		
            // InternalPerspectiveDSL.g:1269:3: ( (lv_changeModel_16_0= ';' ) )
            // InternalPerspectiveDSL.g:1270:4: (lv_changeModel_16_0= ';' )
            {
            // InternalPerspectiveDSL.g:1270:4: (lv_changeModel_16_0= ';' )
            // InternalPerspectiveDSL.g:1271:5: lv_changeModel_16_0= ';'
            {
            lv_changeModel_16_0=(Token)match(input,14,FOLLOW_28); 

            					newLeafNode(lv_changeModel_16_0, grammarAccess.getIntraLanguageMappingAccess().getChangeModelSemicolonKeyword_16_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntraLanguageMappingRule());
            					}
            					setWithLastConsumed(current, "changeModel", lv_changeModel_16_0 != null, ";");
            				

            }


            }

            otherlv_17=(Token)match(input,32,FOLLOW_12); 

            			newLeafNode(otherlv_17, grammarAccess.getIntraLanguageMappingAccess().getFromElementKeyword_17());
            		
            otherlv_18=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_18, grammarAccess.getIntraLanguageMappingAccess().getColonKeyword_18());
            		
            // InternalPerspectiveDSL.g:1291:3: ( (lv_fromElement_19_0= RULE_ID ) )
            // InternalPerspectiveDSL.g:1292:4: (lv_fromElement_19_0= RULE_ID )
            {
            // InternalPerspectiveDSL.g:1292:4: (lv_fromElement_19_0= RULE_ID )
            // InternalPerspectiveDSL.g:1293:5: lv_fromElement_19_0= RULE_ID
            {
            lv_fromElement_19_0=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(lv_fromElement_19_0, grammarAccess.getIntraLanguageMappingAccess().getFromElementIDTerminalRuleCall_19_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntraLanguageMappingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"fromElement",
            						lv_fromElement_19_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_20=(Token)match(input,34,FOLLOW_10); 

            			newLeafNode(otherlv_20, grammarAccess.getIntraLanguageMappingAccess().getFromGetElementKeyword_20());
            		
            // InternalPerspectiveDSL.g:1313:3: ( (lv_fromGetElement_21_0= RULE_STRING ) )
            // InternalPerspectiveDSL.g:1314:4: (lv_fromGetElement_21_0= RULE_STRING )
            {
            // InternalPerspectiveDSL.g:1314:4: (lv_fromGetElement_21_0= RULE_STRING )
            // InternalPerspectiveDSL.g:1315:5: lv_fromGetElement_21_0= RULE_STRING
            {
            lv_fromGetElement_21_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_fromGetElement_21_0, grammarAccess.getIntraLanguageMappingAccess().getFromGetElementSTRINGTerminalRuleCall_21_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntraLanguageMappingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"fromGetElement",
            						lv_fromGetElement_21_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_22=(Token)match(input,14,FOLLOW_49); 

            			newLeafNode(otherlv_22, grammarAccess.getIntraLanguageMappingAccess().getSemicolonKeyword_22());
            		
            otherlv_23=(Token)match(input,51,FOLLOW_12); 

            			newLeafNode(otherlv_23, grammarAccess.getIntraLanguageMappingAccess().getHopsKeyword_23());
            		
            otherlv_24=(Token)match(input,18,FOLLOW_50); 

            			newLeafNode(otherlv_24, grammarAccess.getIntraLanguageMappingAccess().getColonKeyword_24());
            		
            // InternalPerspectiveDSL.g:1343:3: ( (lv_hops_25_0= ruleHop ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==52) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalPerspectiveDSL.g:1344:4: (lv_hops_25_0= ruleHop )
            	    {
            	    // InternalPerspectiveDSL.g:1344:4: (lv_hops_25_0= ruleHop )
            	    // InternalPerspectiveDSL.g:1345:5: lv_hops_25_0= ruleHop
            	    {

            	    					newCompositeNode(grammarAccess.getIntraLanguageMappingAccess().getHopsHopParserRuleCall_25_0());
            	    				
            	    pushFollow(FOLLOW_50);
            	    lv_hops_25_0=ruleHop();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIntraLanguageMappingRule());
            	    					}
            	    					add(
            	    						current,
            	    						"hops",
            	    						lv_hops_25_0,
            	    						"ca.mcgill.sel.perspectivedsl.ca.mcgill.sel.PerspectiveDSL.Hop");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_26=(Token)match(input,19,FOLLOW_20); 

            			newLeafNode(otherlv_26, grammarAccess.getIntraLanguageMappingAccess().getEndKeyword_26());
            		
            otherlv_27=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_27, grammarAccess.getIntraLanguageMappingAccess().getRightCurlyBracketKeyword_27());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntraLanguageMapping"


    // $ANTLR start "entryRuleHop"
    // InternalPerspectiveDSL.g:1374:1: entryRuleHop returns [EObject current=null] : iv_ruleHop= ruleHop EOF ;
    public final EObject entryRuleHop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHop = null;


        try {
            // InternalPerspectiveDSL.g:1374:44: (iv_ruleHop= ruleHop EOF )
            // InternalPerspectiveDSL.g:1375:2: iv_ruleHop= ruleHop EOF
            {
             newCompositeNode(grammarAccess.getHopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHop=ruleHop();

            state._fsp--;

             current =iv_ruleHop; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleHop"


    // $ANTLR start "ruleHop"
    // InternalPerspectiveDSL.g:1381:1: ruleHop returns [EObject current=null] : (otherlv_0= 'hopElement' otherlv_1= ':' ( (lv_hopElement_2_0= RULE_ID ) ) otherlv_3= 'fromGetHop' ( (lv_fromGetHop_4_0= RULE_STRING ) ) otherlv_5= ';' ) ;
    public final EObject ruleHop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_hopElement_2_0=null;
        Token otherlv_3=null;
        Token lv_fromGetHop_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalPerspectiveDSL.g:1387:2: ( (otherlv_0= 'hopElement' otherlv_1= ':' ( (lv_hopElement_2_0= RULE_ID ) ) otherlv_3= 'fromGetHop' ( (lv_fromGetHop_4_0= RULE_STRING ) ) otherlv_5= ';' ) )
            // InternalPerspectiveDSL.g:1388:2: (otherlv_0= 'hopElement' otherlv_1= ':' ( (lv_hopElement_2_0= RULE_ID ) ) otherlv_3= 'fromGetHop' ( (lv_fromGetHop_4_0= RULE_STRING ) ) otherlv_5= ';' )
            {
            // InternalPerspectiveDSL.g:1388:2: (otherlv_0= 'hopElement' otherlv_1= ':' ( (lv_hopElement_2_0= RULE_ID ) ) otherlv_3= 'fromGetHop' ( (lv_fromGetHop_4_0= RULE_STRING ) ) otherlv_5= ';' )
            // InternalPerspectiveDSL.g:1389:3: otherlv_0= 'hopElement' otherlv_1= ':' ( (lv_hopElement_2_0= RULE_ID ) ) otherlv_3= 'fromGetHop' ( (lv_fromGetHop_4_0= RULE_STRING ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getHopAccess().getHopElementKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getHopAccess().getColonKeyword_1());
            		
            // InternalPerspectiveDSL.g:1397:3: ( (lv_hopElement_2_0= RULE_ID ) )
            // InternalPerspectiveDSL.g:1398:4: (lv_hopElement_2_0= RULE_ID )
            {
            // InternalPerspectiveDSL.g:1398:4: (lv_hopElement_2_0= RULE_ID )
            // InternalPerspectiveDSL.g:1399:5: lv_hopElement_2_0= RULE_ID
            {
            lv_hopElement_2_0=(Token)match(input,RULE_ID,FOLLOW_51); 

            					newLeafNode(lv_hopElement_2_0, grammarAccess.getHopAccess().getHopElementIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHopRule());
            					}
            					setWithLastConsumed(
            						current,
            						"hopElement",
            						lv_hopElement_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,53,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getHopAccess().getFromGetHopKeyword_3());
            		
            // InternalPerspectiveDSL.g:1419:3: ( (lv_fromGetHop_4_0= RULE_STRING ) )
            // InternalPerspectiveDSL.g:1420:4: (lv_fromGetHop_4_0= RULE_STRING )
            {
            // InternalPerspectiveDSL.g:1420:4: (lv_fromGetHop_4_0= RULE_STRING )
            // InternalPerspectiveDSL.g:1421:5: lv_fromGetHop_4_0= RULE_STRING
            {
            lv_fromGetHop_4_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_fromGetHop_4_0, grammarAccess.getHopAccess().getFromGetHopSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHopRule());
            					}
            					setWithLastConsumed(
            						current,
            						"fromGetHop",
            						lv_fromGetHop_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getHopAccess().getSemicolonKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHop"


    // $ANTLR start "ruleCardinality"
    // InternalPerspectiveDSL.g:1445:1: ruleCardinality returns [Enumerator current=null] : ( (enumLiteral_0= '1' ) | (enumLiteral_1= '0..1' ) | (enumLiteral_2= '1..*' ) | (enumLiteral_3= '0..*' ) ) ;
    public final Enumerator ruleCardinality() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalPerspectiveDSL.g:1451:2: ( ( (enumLiteral_0= '1' ) | (enumLiteral_1= '0..1' ) | (enumLiteral_2= '1..*' ) | (enumLiteral_3= '0..*' ) ) )
            // InternalPerspectiveDSL.g:1452:2: ( (enumLiteral_0= '1' ) | (enumLiteral_1= '0..1' ) | (enumLiteral_2= '1..*' ) | (enumLiteral_3= '0..*' ) )
            {
            // InternalPerspectiveDSL.g:1452:2: ( (enumLiteral_0= '1' ) | (enumLiteral_1= '0..1' ) | (enumLiteral_2= '1..*' ) | (enumLiteral_3= '0..*' ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt13=1;
                }
                break;
            case 55:
                {
                alt13=2;
                }
                break;
            case 56:
                {
                alt13=3;
                }
                break;
            case 57:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalPerspectiveDSL.g:1453:3: (enumLiteral_0= '1' )
                    {
                    // InternalPerspectiveDSL.g:1453:3: (enumLiteral_0= '1' )
                    // InternalPerspectiveDSL.g:1454:4: enumLiteral_0= '1'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getCardinalityAccess().getCOMPULSORYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCardinalityAccess().getCOMPULSORYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPerspectiveDSL.g:1461:3: (enumLiteral_1= '0..1' )
                    {
                    // InternalPerspectiveDSL.g:1461:3: (enumLiteral_1= '0..1' )
                    // InternalPerspectiveDSL.g:1462:4: enumLiteral_1= '0..1'
                    {
                    enumLiteral_1=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getCardinalityAccess().getOPTIONALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCardinalityAccess().getOPTIONALEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPerspectiveDSL.g:1469:3: (enumLiteral_2= '1..*' )
                    {
                    // InternalPerspectiveDSL.g:1469:3: (enumLiteral_2= '1..*' )
                    // InternalPerspectiveDSL.g:1470:4: enumLiteral_2= '1..*'
                    {
                    enumLiteral_2=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getCardinalityAccess().getCOMPULSORY_MULTIPLEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCardinalityAccess().getCOMPULSORY_MULTIPLEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalPerspectiveDSL.g:1477:3: (enumLiteral_3= '0..*' )
                    {
                    // InternalPerspectiveDSL.g:1477:3: (enumLiteral_3= '0..*' )
                    // InternalPerspectiveDSL.g:1478:4: enumLiteral_3= '0..*'
                    {
                    enumLiteral_3=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getCardinalityAccess().getOPTIONAL_MULTIPLEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getCardinalityAccess().getOPTIONAL_MULTIPLEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCardinality"


    // $ANTLR start "rulePerspectiveActionType"
    // InternalPerspectiveDSL.g:1488:1: rulePerspectiveActionType returns [Enumerator current=null] : ( (enumLiteral_0= 're_expose' ) | (enumLiteral_1= 'redefined' ) | (enumLiteral_2= 'create_mapping' ) ) ;
    public final Enumerator rulePerspectiveActionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalPerspectiveDSL.g:1494:2: ( ( (enumLiteral_0= 're_expose' ) | (enumLiteral_1= 'redefined' ) | (enumLiteral_2= 'create_mapping' ) ) )
            // InternalPerspectiveDSL.g:1495:2: ( (enumLiteral_0= 're_expose' ) | (enumLiteral_1= 'redefined' ) | (enumLiteral_2= 'create_mapping' ) )
            {
            // InternalPerspectiveDSL.g:1495:2: ( (enumLiteral_0= 're_expose' ) | (enumLiteral_1= 'redefined' ) | (enumLiteral_2= 'create_mapping' ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt14=1;
                }
                break;
            case 59:
                {
                alt14=2;
                }
                break;
            case 60:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalPerspectiveDSL.g:1496:3: (enumLiteral_0= 're_expose' )
                    {
                    // InternalPerspectiveDSL.g:1496:3: (enumLiteral_0= 're_expose' )
                    // InternalPerspectiveDSL.g:1497:4: enumLiteral_0= 're_expose'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getPerspectiveActionTypeAccess().getREEXPOSEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPerspectiveActionTypeAccess().getREEXPOSEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPerspectiveDSL.g:1504:3: (enumLiteral_1= 'redefined' )
                    {
                    // InternalPerspectiveDSL.g:1504:3: (enumLiteral_1= 'redefined' )
                    // InternalPerspectiveDSL.g:1505:4: enumLiteral_1= 'redefined'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getPerspectiveActionTypeAccess().getREDEFINEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPerspectiveActionTypeAccess().getREDEFINEDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPerspectiveDSL.g:1512:3: (enumLiteral_2= 'create_mapping' )
                    {
                    // InternalPerspectiveDSL.g:1512:3: (enumLiteral_2= 'create_mapping' )
                    // InternalPerspectiveDSL.g:1513:4: enumLiteral_2= 'create_mapping'
                    {
                    enumLiteral_2=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getPerspectiveActionTypeAccess().getCREATE_MAPPINGEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPerspectiveActionTypeAccess().getCREATE_MAPPINGEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePerspectiveActionType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000080000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000100000080000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x03C0000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000006000800000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000002000080000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000004000800000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x1C00000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0010000000080000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0020000000000000L});

}