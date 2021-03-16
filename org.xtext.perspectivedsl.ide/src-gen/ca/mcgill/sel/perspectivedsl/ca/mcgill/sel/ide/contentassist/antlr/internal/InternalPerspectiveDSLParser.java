package ca.mcgill.sel.perspectivedsl.ca.mcgill.sel.ide.contentassist.antlr.internal;

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
import ca.mcgill.sel.perspectivedsl.ca.mcgill.sel.services.PerspectiveDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPerspectiveDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'1'", "'0..1'", "'1..*'", "'0..*'", "'re_expose'", "'redefined'", "'create_mapping'", "'perspective'", "'{'", "'display'", "'name'", "';'", "'languages'", "':'", "'end'", "'actions'", "'mappings'", "'}'", "'default'", "'intraLanguageMappings'", "'existing'", "'language'", "'rootPackage'", "'packageClassName'", "'roleName'", "'mapping'", "'fromCardinality'", "'toCardinality'", "'fromElement'", "'from'", "'fromGetElement'", "'toELement'", "'toGetElement'", "'nested'", "'interLanguageMappingEnds'", "'elementName'", "'inter'", "'origin'", "'destination'", "'action'", "'Intra'", "'Language'", "'Mapping'", "'closure'", "'reuse'", "'increaseDepth'", "'changeModel'", "'hops'", "'hopElement'", "'fromGetHop'"
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

    	public void setGrammarAccess(PerspectiveDSLGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRulePerspectiveModel"
    // InternalPerspectiveDSL.g:53:1: entryRulePerspectiveModel : rulePerspectiveModel EOF ;
    public final void entryRulePerspectiveModel() throws RecognitionException {
        try {
            // InternalPerspectiveDSL.g:54:1: ( rulePerspectiveModel EOF )
            // InternalPerspectiveDSL.g:55:1: rulePerspectiveModel EOF
            {
             before(grammarAccess.getPerspectiveModelRule()); 
            pushFollow(FOLLOW_1);
            rulePerspectiveModel();

            state._fsp--;

             after(grammarAccess.getPerspectiveModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePerspectiveModel"


    // $ANTLR start "rulePerspectiveModel"
    // InternalPerspectiveDSL.g:62:1: rulePerspectiveModel : ( ( rule__PerspectiveModel__PerspectiveAssignment )* ) ;
    public final void rulePerspectiveModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:66:2: ( ( ( rule__PerspectiveModel__PerspectiveAssignment )* ) )
            // InternalPerspectiveDSL.g:67:2: ( ( rule__PerspectiveModel__PerspectiveAssignment )* )
            {
            // InternalPerspectiveDSL.g:67:2: ( ( rule__PerspectiveModel__PerspectiveAssignment )* )
            // InternalPerspectiveDSL.g:68:3: ( rule__PerspectiveModel__PerspectiveAssignment )*
            {
             before(grammarAccess.getPerspectiveModelAccess().getPerspectiveAssignment()); 
            // InternalPerspectiveDSL.g:69:3: ( rule__PerspectiveModel__PerspectiveAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPerspectiveDSL.g:69:4: rule__PerspectiveModel__PerspectiveAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__PerspectiveModel__PerspectiveAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getPerspectiveModelAccess().getPerspectiveAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePerspectiveModel"


    // $ANTLR start "entryRulePerspective"
    // InternalPerspectiveDSL.g:78:1: entryRulePerspective : rulePerspective EOF ;
    public final void entryRulePerspective() throws RecognitionException {
        try {
            // InternalPerspectiveDSL.g:79:1: ( rulePerspective EOF )
            // InternalPerspectiveDSL.g:80:1: rulePerspective EOF
            {
             before(grammarAccess.getPerspectiveRule()); 
            pushFollow(FOLLOW_1);
            rulePerspective();

            state._fsp--;

             after(grammarAccess.getPerspectiveRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePerspective"


    // $ANTLR start "rulePerspective"
    // InternalPerspectiveDSL.g:87:1: rulePerspective : ( ( rule__Perspective__Group__0 ) ) ;
    public final void rulePerspective() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:91:2: ( ( ( rule__Perspective__Group__0 ) ) )
            // InternalPerspectiveDSL.g:92:2: ( ( rule__Perspective__Group__0 ) )
            {
            // InternalPerspectiveDSL.g:92:2: ( ( rule__Perspective__Group__0 ) )
            // InternalPerspectiveDSL.g:93:3: ( rule__Perspective__Group__0 )
            {
             before(grammarAccess.getPerspectiveAccess().getGroup()); 
            // InternalPerspectiveDSL.g:94:3: ( rule__Perspective__Group__0 )
            // InternalPerspectiveDSL.g:94:4: rule__Perspective__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Perspective__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPerspectiveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePerspective"


    // $ANTLR start "entryRuleLanguage"
    // InternalPerspectiveDSL.g:103:1: entryRuleLanguage : ruleLanguage EOF ;
    public final void entryRuleLanguage() throws RecognitionException {
        try {
            // InternalPerspectiveDSL.g:104:1: ( ruleLanguage EOF )
            // InternalPerspectiveDSL.g:105:1: ruleLanguage EOF
            {
             before(grammarAccess.getLanguageRule()); 
            pushFollow(FOLLOW_1);
            ruleLanguage();

            state._fsp--;

             after(grammarAccess.getLanguageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLanguage"


    // $ANTLR start "ruleLanguage"
    // InternalPerspectiveDSL.g:112:1: ruleLanguage : ( ( rule__Language__Group__0 ) ) ;
    public final void ruleLanguage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:116:2: ( ( ( rule__Language__Group__0 ) ) )
            // InternalPerspectiveDSL.g:117:2: ( ( rule__Language__Group__0 ) )
            {
            // InternalPerspectiveDSL.g:117:2: ( ( rule__Language__Group__0 ) )
            // InternalPerspectiveDSL.g:118:3: ( rule__Language__Group__0 )
            {
             before(grammarAccess.getLanguageAccess().getGroup()); 
            // InternalPerspectiveDSL.g:119:3: ( rule__Language__Group__0 )
            // InternalPerspectiveDSL.g:119:4: rule__Language__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Language__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLanguageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLanguage"


    // $ANTLR start "entryRuleLanguageElementMapping"
    // InternalPerspectiveDSL.g:128:1: entryRuleLanguageElementMapping : ruleLanguageElementMapping EOF ;
    public final void entryRuleLanguageElementMapping() throws RecognitionException {
        try {
            // InternalPerspectiveDSL.g:129:1: ( ruleLanguageElementMapping EOF )
            // InternalPerspectiveDSL.g:130:1: ruleLanguageElementMapping EOF
            {
             before(grammarAccess.getLanguageElementMappingRule()); 
            pushFollow(FOLLOW_1);
            ruleLanguageElementMapping();

            state._fsp--;

             after(grammarAccess.getLanguageElementMappingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLanguageElementMapping"


    // $ANTLR start "ruleLanguageElementMapping"
    // InternalPerspectiveDSL.g:137:1: ruleLanguageElementMapping : ( ( rule__LanguageElementMapping__Group__0 ) ) ;
    public final void ruleLanguageElementMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:141:2: ( ( ( rule__LanguageElementMapping__Group__0 ) ) )
            // InternalPerspectiveDSL.g:142:2: ( ( rule__LanguageElementMapping__Group__0 ) )
            {
            // InternalPerspectiveDSL.g:142:2: ( ( rule__LanguageElementMapping__Group__0 ) )
            // InternalPerspectiveDSL.g:143:3: ( rule__LanguageElementMapping__Group__0 )
            {
             before(grammarAccess.getLanguageElementMappingAccess().getGroup()); 
            // InternalPerspectiveDSL.g:144:3: ( rule__LanguageElementMapping__Group__0 )
            // InternalPerspectiveDSL.g:144:4: rule__LanguageElementMapping__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LanguageElementMapping__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLanguageElementMappingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLanguageElementMapping"


    // $ANTLR start "entryRuleNestedMapping"
    // InternalPerspectiveDSL.g:153:1: entryRuleNestedMapping : ruleNestedMapping EOF ;
    public final void entryRuleNestedMapping() throws RecognitionException {
        try {
            // InternalPerspectiveDSL.g:154:1: ( ruleNestedMapping EOF )
            // InternalPerspectiveDSL.g:155:1: ruleNestedMapping EOF
            {
             before(grammarAccess.getNestedMappingRule()); 
            pushFollow(FOLLOW_1);
            ruleNestedMapping();

            state._fsp--;

             after(grammarAccess.getNestedMappingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNestedMapping"


    // $ANTLR start "ruleNestedMapping"
    // InternalPerspectiveDSL.g:162:1: ruleNestedMapping : ( ( rule__NestedMapping__Group__0 ) ) ;
    public final void ruleNestedMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:166:2: ( ( ( rule__NestedMapping__Group__0 ) ) )
            // InternalPerspectiveDSL.g:167:2: ( ( rule__NestedMapping__Group__0 ) )
            {
            // InternalPerspectiveDSL.g:167:2: ( ( rule__NestedMapping__Group__0 ) )
            // InternalPerspectiveDSL.g:168:3: ( rule__NestedMapping__Group__0 )
            {
             before(grammarAccess.getNestedMappingAccess().getGroup()); 
            // InternalPerspectiveDSL.g:169:3: ( rule__NestedMapping__Group__0 )
            // InternalPerspectiveDSL.g:169:4: rule__NestedMapping__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NestedMapping__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNestedMappingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNestedMapping"


    // $ANTLR start "entryRuleInterLanguageMappingEnd"
    // InternalPerspectiveDSL.g:178:1: entryRuleInterLanguageMappingEnd : ruleInterLanguageMappingEnd EOF ;
    public final void entryRuleInterLanguageMappingEnd() throws RecognitionException {
        try {
            // InternalPerspectiveDSL.g:179:1: ( ruleInterLanguageMappingEnd EOF )
            // InternalPerspectiveDSL.g:180:1: ruleInterLanguageMappingEnd EOF
            {
             before(grammarAccess.getInterLanguageMappingEndRule()); 
            pushFollow(FOLLOW_1);
            ruleInterLanguageMappingEnd();

            state._fsp--;

             after(grammarAccess.getInterLanguageMappingEndRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInterLanguageMappingEnd"


    // $ANTLR start "ruleInterLanguageMappingEnd"
    // InternalPerspectiveDSL.g:187:1: ruleInterLanguageMappingEnd : ( ( rule__InterLanguageMappingEnd__Group__0 ) ) ;
    public final void ruleInterLanguageMappingEnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:191:2: ( ( ( rule__InterLanguageMappingEnd__Group__0 ) ) )
            // InternalPerspectiveDSL.g:192:2: ( ( rule__InterLanguageMappingEnd__Group__0 ) )
            {
            // InternalPerspectiveDSL.g:192:2: ( ( rule__InterLanguageMappingEnd__Group__0 ) )
            // InternalPerspectiveDSL.g:193:3: ( rule__InterLanguageMappingEnd__Group__0 )
            {
             before(grammarAccess.getInterLanguageMappingEndAccess().getGroup()); 
            // InternalPerspectiveDSL.g:194:3: ( rule__InterLanguageMappingEnd__Group__0 )
            // InternalPerspectiveDSL.g:194:4: rule__InterLanguageMappingEnd__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InterLanguageMappingEnd__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInterLanguageMappingEndAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterLanguageMappingEnd"


    // $ANTLR start "entryRuleAction"
    // InternalPerspectiveDSL.g:203:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalPerspectiveDSL.g:204:1: ( ruleAction EOF )
            // InternalPerspectiveDSL.g:205:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalPerspectiveDSL.g:212:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:216:2: ( ( ( rule__Action__Group__0 ) ) )
            // InternalPerspectiveDSL.g:217:2: ( ( rule__Action__Group__0 ) )
            {
            // InternalPerspectiveDSL.g:217:2: ( ( rule__Action__Group__0 ) )
            // InternalPerspectiveDSL.g:218:3: ( rule__Action__Group__0 )
            {
             before(grammarAccess.getActionAccess().getGroup()); 
            // InternalPerspectiveDSL.g:219:3: ( rule__Action__Group__0 )
            // InternalPerspectiveDSL.g:219:4: rule__Action__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleIntraLanguageMapping"
    // InternalPerspectiveDSL.g:228:1: entryRuleIntraLanguageMapping : ruleIntraLanguageMapping EOF ;
    public final void entryRuleIntraLanguageMapping() throws RecognitionException {
        try {
            // InternalPerspectiveDSL.g:229:1: ( ruleIntraLanguageMapping EOF )
            // InternalPerspectiveDSL.g:230:1: ruleIntraLanguageMapping EOF
            {
             before(grammarAccess.getIntraLanguageMappingRule()); 
            pushFollow(FOLLOW_1);
            ruleIntraLanguageMapping();

            state._fsp--;

             after(grammarAccess.getIntraLanguageMappingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntraLanguageMapping"


    // $ANTLR start "ruleIntraLanguageMapping"
    // InternalPerspectiveDSL.g:237:1: ruleIntraLanguageMapping : ( ( rule__IntraLanguageMapping__Group__0 ) ) ;
    public final void ruleIntraLanguageMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:241:2: ( ( ( rule__IntraLanguageMapping__Group__0 ) ) )
            // InternalPerspectiveDSL.g:242:2: ( ( rule__IntraLanguageMapping__Group__0 ) )
            {
            // InternalPerspectiveDSL.g:242:2: ( ( rule__IntraLanguageMapping__Group__0 ) )
            // InternalPerspectiveDSL.g:243:3: ( rule__IntraLanguageMapping__Group__0 )
            {
             before(grammarAccess.getIntraLanguageMappingAccess().getGroup()); 
            // InternalPerspectiveDSL.g:244:3: ( rule__IntraLanguageMapping__Group__0 )
            // InternalPerspectiveDSL.g:244:4: rule__IntraLanguageMapping__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IntraLanguageMapping__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntraLanguageMappingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntraLanguageMapping"


    // $ANTLR start "entryRuleHop"
    // InternalPerspectiveDSL.g:253:1: entryRuleHop : ruleHop EOF ;
    public final void entryRuleHop() throws RecognitionException {
        try {
            // InternalPerspectiveDSL.g:254:1: ( ruleHop EOF )
            // InternalPerspectiveDSL.g:255:1: ruleHop EOF
            {
             before(grammarAccess.getHopRule()); 
            pushFollow(FOLLOW_1);
            ruleHop();

            state._fsp--;

             after(grammarAccess.getHopRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHop"


    // $ANTLR start "ruleHop"
    // InternalPerspectiveDSL.g:262:1: ruleHop : ( ( rule__Hop__Group__0 ) ) ;
    public final void ruleHop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:266:2: ( ( ( rule__Hop__Group__0 ) ) )
            // InternalPerspectiveDSL.g:267:2: ( ( rule__Hop__Group__0 ) )
            {
            // InternalPerspectiveDSL.g:267:2: ( ( rule__Hop__Group__0 ) )
            // InternalPerspectiveDSL.g:268:3: ( rule__Hop__Group__0 )
            {
             before(grammarAccess.getHopAccess().getGroup()); 
            // InternalPerspectiveDSL.g:269:3: ( rule__Hop__Group__0 )
            // InternalPerspectiveDSL.g:269:4: rule__Hop__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Hop__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHopAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHop"


    // $ANTLR start "ruleCardinality"
    // InternalPerspectiveDSL.g:278:1: ruleCardinality : ( ( rule__Cardinality__Alternatives ) ) ;
    public final void ruleCardinality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:282:1: ( ( ( rule__Cardinality__Alternatives ) ) )
            // InternalPerspectiveDSL.g:283:2: ( ( rule__Cardinality__Alternatives ) )
            {
            // InternalPerspectiveDSL.g:283:2: ( ( rule__Cardinality__Alternatives ) )
            // InternalPerspectiveDSL.g:284:3: ( rule__Cardinality__Alternatives )
            {
             before(grammarAccess.getCardinalityAccess().getAlternatives()); 
            // InternalPerspectiveDSL.g:285:3: ( rule__Cardinality__Alternatives )
            // InternalPerspectiveDSL.g:285:4: rule__Cardinality__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Cardinality__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCardinalityAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCardinality"


    // $ANTLR start "rulePerspectiveActionType"
    // InternalPerspectiveDSL.g:294:1: rulePerspectiveActionType : ( ( rule__PerspectiveActionType__Alternatives ) ) ;
    public final void rulePerspectiveActionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:298:1: ( ( ( rule__PerspectiveActionType__Alternatives ) ) )
            // InternalPerspectiveDSL.g:299:2: ( ( rule__PerspectiveActionType__Alternatives ) )
            {
            // InternalPerspectiveDSL.g:299:2: ( ( rule__PerspectiveActionType__Alternatives ) )
            // InternalPerspectiveDSL.g:300:3: ( rule__PerspectiveActionType__Alternatives )
            {
             before(grammarAccess.getPerspectiveActionTypeAccess().getAlternatives()); 
            // InternalPerspectiveDSL.g:301:3: ( rule__PerspectiveActionType__Alternatives )
            // InternalPerspectiveDSL.g:301:4: rule__PerspectiveActionType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PerspectiveActionType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPerspectiveActionTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePerspectiveActionType"


    // $ANTLR start "rule__Cardinality__Alternatives"
    // InternalPerspectiveDSL.g:309:1: rule__Cardinality__Alternatives : ( ( ( '1' ) ) | ( ( '0..1' ) ) | ( ( '1..*' ) ) | ( ( '0..*' ) ) );
    public final void rule__Cardinality__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:313:1: ( ( ( '1' ) ) | ( ( '0..1' ) ) | ( ( '1..*' ) ) | ( ( '0..*' ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalPerspectiveDSL.g:314:2: ( ( '1' ) )
                    {
                    // InternalPerspectiveDSL.g:314:2: ( ( '1' ) )
                    // InternalPerspectiveDSL.g:315:3: ( '1' )
                    {
                     before(grammarAccess.getCardinalityAccess().getCOMPULSORYEnumLiteralDeclaration_0()); 
                    // InternalPerspectiveDSL.g:316:3: ( '1' )
                    // InternalPerspectiveDSL.g:316:4: '1'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getCardinalityAccess().getCOMPULSORYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPerspectiveDSL.g:320:2: ( ( '0..1' ) )
                    {
                    // InternalPerspectiveDSL.g:320:2: ( ( '0..1' ) )
                    // InternalPerspectiveDSL.g:321:3: ( '0..1' )
                    {
                     before(grammarAccess.getCardinalityAccess().getOPTIONALEnumLiteralDeclaration_1()); 
                    // InternalPerspectiveDSL.g:322:3: ( '0..1' )
                    // InternalPerspectiveDSL.g:322:4: '0..1'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getCardinalityAccess().getOPTIONALEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPerspectiveDSL.g:326:2: ( ( '1..*' ) )
                    {
                    // InternalPerspectiveDSL.g:326:2: ( ( '1..*' ) )
                    // InternalPerspectiveDSL.g:327:3: ( '1..*' )
                    {
                     before(grammarAccess.getCardinalityAccess().getCOMPULSORY_MULTIPLEEnumLiteralDeclaration_2()); 
                    // InternalPerspectiveDSL.g:328:3: ( '1..*' )
                    // InternalPerspectiveDSL.g:328:4: '1..*'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getCardinalityAccess().getCOMPULSORY_MULTIPLEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPerspectiveDSL.g:332:2: ( ( '0..*' ) )
                    {
                    // InternalPerspectiveDSL.g:332:2: ( ( '0..*' ) )
                    // InternalPerspectiveDSL.g:333:3: ( '0..*' )
                    {
                     before(grammarAccess.getCardinalityAccess().getOPTIONAL_MULTIPLEEnumLiteralDeclaration_3()); 
                    // InternalPerspectiveDSL.g:334:3: ( '0..*' )
                    // InternalPerspectiveDSL.g:334:4: '0..*'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getCardinalityAccess().getOPTIONAL_MULTIPLEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Alternatives"


    // $ANTLR start "rule__PerspectiveActionType__Alternatives"
    // InternalPerspectiveDSL.g:342:1: rule__PerspectiveActionType__Alternatives : ( ( ( 're_expose' ) ) | ( ( 'redefined' ) ) | ( ( 'create_mapping' ) ) );
    public final void rule__PerspectiveActionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:346:1: ( ( ( 're_expose' ) ) | ( ( 'redefined' ) ) | ( ( 'create_mapping' ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                alt3=2;
                }
                break;
            case 17:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalPerspectiveDSL.g:347:2: ( ( 're_expose' ) )
                    {
                    // InternalPerspectiveDSL.g:347:2: ( ( 're_expose' ) )
                    // InternalPerspectiveDSL.g:348:3: ( 're_expose' )
                    {
                     before(grammarAccess.getPerspectiveActionTypeAccess().getREEXPOSEEnumLiteralDeclaration_0()); 
                    // InternalPerspectiveDSL.g:349:3: ( 're_expose' )
                    // InternalPerspectiveDSL.g:349:4: 're_expose'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getPerspectiveActionTypeAccess().getREEXPOSEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPerspectiveDSL.g:353:2: ( ( 'redefined' ) )
                    {
                    // InternalPerspectiveDSL.g:353:2: ( ( 'redefined' ) )
                    // InternalPerspectiveDSL.g:354:3: ( 'redefined' )
                    {
                     before(grammarAccess.getPerspectiveActionTypeAccess().getREDEFINEDEnumLiteralDeclaration_1()); 
                    // InternalPerspectiveDSL.g:355:3: ( 'redefined' )
                    // InternalPerspectiveDSL.g:355:4: 'redefined'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getPerspectiveActionTypeAccess().getREDEFINEDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPerspectiveDSL.g:359:2: ( ( 'create_mapping' ) )
                    {
                    // InternalPerspectiveDSL.g:359:2: ( ( 'create_mapping' ) )
                    // InternalPerspectiveDSL.g:360:3: ( 'create_mapping' )
                    {
                     before(grammarAccess.getPerspectiveActionTypeAccess().getCREATE_MAPPINGEnumLiteralDeclaration_2()); 
                    // InternalPerspectiveDSL.g:361:3: ( 'create_mapping' )
                    // InternalPerspectiveDSL.g:361:4: 'create_mapping'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getPerspectiveActionTypeAccess().getCREATE_MAPPINGEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerspectiveActionType__Alternatives"


    // $ANTLR start "rule__Perspective__Group__0"
    // InternalPerspectiveDSL.g:369:1: rule__Perspective__Group__0 : rule__Perspective__Group__0__Impl rule__Perspective__Group__1 ;
    public final void rule__Perspective__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:373:1: ( rule__Perspective__Group__0__Impl rule__Perspective__Group__1 )
            // InternalPerspectiveDSL.g:374:2: rule__Perspective__Group__0__Impl rule__Perspective__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Perspective__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Perspective__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group__0"


    // $ANTLR start "rule__Perspective__Group__0__Impl"
    // InternalPerspectiveDSL.g:381:1: rule__Perspective__Group__0__Impl : ( 'perspective' ) ;
    public final void rule__Perspective__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:385:1: ( ( 'perspective' ) )
            // InternalPerspectiveDSL.g:386:1: ( 'perspective' )
            {
            // InternalPerspectiveDSL.g:386:1: ( 'perspective' )
            // InternalPerspectiveDSL.g:387:2: 'perspective'
            {
             before(grammarAccess.getPerspectiveAccess().getPerspectiveKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPerspectiveAccess().getPerspectiveKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group__0__Impl"


    // $ANTLR start "rule__Perspective__Group__1"
    // InternalPerspectiveDSL.g:396:1: rule__Perspective__Group__1 : rule__Perspective__Group__1__Impl rule__Perspective__Group__2 ;
    public final void rule__Perspective__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:400:1: ( rule__Perspective__Group__1__Impl rule__Perspective__Group__2 )
            // InternalPerspectiveDSL.g:401:2: rule__Perspective__Group__1__Impl rule__Perspective__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Perspective__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Perspective__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group__1"


    // $ANTLR start "rule__Perspective__Group__1__Impl"
    // InternalPerspectiveDSL.g:408:1: rule__Perspective__Group__1__Impl : ( ( rule__Perspective__NameAssignment_1 ) ) ;
    public final void rule__Perspective__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:412:1: ( ( ( rule__Perspective__NameAssignment_1 ) ) )
            // InternalPerspectiveDSL.g:413:1: ( ( rule__Perspective__NameAssignment_1 ) )
            {
            // InternalPerspectiveDSL.g:413:1: ( ( rule__Perspective__NameAssignment_1 ) )
            // InternalPerspectiveDSL.g:414:2: ( rule__Perspective__NameAssignment_1 )
            {
             before(grammarAccess.getPerspectiveAccess().getNameAssignment_1()); 
            // InternalPerspectiveDSL.g:415:2: ( rule__Perspective__NameAssignment_1 )
            // InternalPerspectiveDSL.g:415:3: rule__Perspective__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Perspective__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPerspectiveAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group__1__Impl"


    // $ANTLR start "rule__Perspective__Group__2"
    // InternalPerspectiveDSL.g:423:1: rule__Perspective__Group__2 : rule__Perspective__Group__2__Impl rule__Perspective__Group__3 ;
    public final void rule__Perspective__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:427:1: ( rule__Perspective__Group__2__Impl rule__Perspective__Group__3 )
            // InternalPerspectiveDSL.g:428:2: rule__Perspective__Group__2__Impl rule__Perspective__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Perspective__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Perspective__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group__2"


    // $ANTLR start "rule__Perspective__Group__2__Impl"
    // InternalPerspectiveDSL.g:435:1: rule__Perspective__Group__2__Impl : ( '{' ) ;
    public final void rule__Perspective__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:439:1: ( ( '{' ) )
            // InternalPerspectiveDSL.g:440:1: ( '{' )
            {
            // InternalPerspectiveDSL.g:440:1: ( '{' )
            // InternalPerspectiveDSL.g:441:2: '{'
            {
             before(grammarAccess.getPerspectiveAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPerspectiveAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group__2__Impl"


    // $ANTLR start "rule__Perspective__Group__3"
    // InternalPerspectiveDSL.g:450:1: rule__Perspective__Group__3 : rule__Perspective__Group__3__Impl rule__Perspective__Group__4 ;
    public final void rule__Perspective__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:454:1: ( rule__Perspective__Group__3__Impl rule__Perspective__Group__4 )
            // InternalPerspectiveDSL.g:455:2: rule__Perspective__Group__3__Impl rule__Perspective__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Perspective__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Perspective__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group__3"


    // $ANTLR start "rule__Perspective__Group__3__Impl"
    // InternalPerspectiveDSL.g:462:1: rule__Perspective__Group__3__Impl : ( ( rule__Perspective__Group_3__0 )? ) ;
    public final void rule__Perspective__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:466:1: ( ( ( rule__Perspective__Group_3__0 )? ) )
            // InternalPerspectiveDSL.g:467:1: ( ( rule__Perspective__Group_3__0 )? )
            {
            // InternalPerspectiveDSL.g:467:1: ( ( rule__Perspective__Group_3__0 )? )
            // InternalPerspectiveDSL.g:468:2: ( rule__Perspective__Group_3__0 )?
            {
             before(grammarAccess.getPerspectiveAccess().getGroup_3()); 
            // InternalPerspectiveDSL.g:469:2: ( rule__Perspective__Group_3__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==29) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalPerspectiveDSL.g:469:3: rule__Perspective__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Perspective__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPerspectiveAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group__3__Impl"


    // $ANTLR start "rule__Perspective__Group__4"
    // InternalPerspectiveDSL.g:477:1: rule__Perspective__Group__4 : rule__Perspective__Group__4__Impl rule__Perspective__Group__5 ;
    public final void rule__Perspective__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:481:1: ( rule__Perspective__Group__4__Impl rule__Perspective__Group__5 )
            // InternalPerspectiveDSL.g:482:2: rule__Perspective__Group__4__Impl rule__Perspective__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Perspective__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Perspective__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group__4"


    // $ANTLR start "rule__Perspective__Group__4__Impl"
    // InternalPerspectiveDSL.g:489:1: rule__Perspective__Group__4__Impl : ( 'display' ) ;
    public final void rule__Perspective__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:493:1: ( ( 'display' ) )
            // InternalPerspectiveDSL.g:494:1: ( 'display' )
            {
            // InternalPerspectiveDSL.g:494:1: ( 'display' )
            // InternalPerspectiveDSL.g:495:2: 'display'
            {
             before(grammarAccess.getPerspectiveAccess().getDisplayKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPerspectiveAccess().getDisplayKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group__4__Impl"


    // $ANTLR start "rule__Perspective__Group__5"
    // InternalPerspectiveDSL.g:504:1: rule__Perspective__Group__5 : rule__Perspective__Group__5__Impl rule__Perspective__Group__6 ;
    public final void rule__Perspective__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:508:1: ( rule__Perspective__Group__5__Impl rule__Perspective__Group__6 )
            // InternalPerspectiveDSL.g:509:2: rule__Perspective__Group__5__Impl rule__Perspective__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Perspective__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Perspective__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group__5"


    // $ANTLR start "rule__Perspective__Group__5__Impl"
    // InternalPerspectiveDSL.g:516:1: rule__Perspective__Group__5__Impl : ( 'name' ) ;
    public final void rule__Perspective__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:520:1: ( ( 'name' ) )
            // InternalPerspectiveDSL.g:521:1: ( 'name' )
            {
            // InternalPerspectiveDSL.g:521:1: ( 'name' )
            // InternalPerspectiveDSL.g:522:2: 'name'
            {
             before(grammarAccess.getPerspectiveAccess().getNameKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPerspectiveAccess().getNameKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group__5__Impl"


    // $ANTLR start "rule__Perspective__Group__6"
    // InternalPerspectiveDSL.g:531:1: rule__Perspective__Group__6 : rule__Perspective__Group__6__Impl rule__Perspective__Group__7 ;
    public final void rule__Perspective__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:535:1: ( rule__Perspective__Group__6__Impl rule__Perspective__Group__7 )
            // InternalPerspectiveDSL.g:536:2: rule__Perspective__Group__6__Impl rule__Perspective__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Perspective__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Perspective__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group__6"


    // $ANTLR start "rule__Perspective__Group__6__Impl"
    // InternalPerspectiveDSL.g:543:1: rule__Perspective__Group__6__Impl : ( ( rule__Perspective__DisplayNameAssignment_6 ) ) ;
    public final void rule__Perspective__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:547:1: ( ( ( rule__Perspective__DisplayNameAssignment_6 ) ) )
            // InternalPerspectiveDSL.g:548:1: ( ( rule__Perspective__DisplayNameAssignment_6 ) )
            {
            // InternalPerspectiveDSL.g:548:1: ( ( rule__Perspective__DisplayNameAssignment_6 ) )
            // InternalPerspectiveDSL.g:549:2: ( rule__Perspective__DisplayNameAssignment_6 )
            {
             before(grammarAccess.getPerspectiveAccess().getDisplayNameAssignment_6()); 
            // InternalPerspectiveDSL.g:550:2: ( rule__Perspective__DisplayNameAssignment_6 )
            // InternalPerspectiveDSL.g:550:3: rule__Perspective__DisplayNameAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Perspective__DisplayNameAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPerspectiveAccess().getDisplayNameAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group__6__Impl"


    // $ANTLR start "rule__Perspective__Group__7"
    // InternalPerspectiveDSL.g:558:1: rule__Perspective__Group__7 : rule__Perspective__Group__7__Impl rule__Perspective__Group__8 ;
    public final void rule__Perspective__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:562:1: ( rule__Perspective__Group__7__Impl rule__Perspective__Group__8 )
            // InternalPerspectiveDSL.g:563:2: rule__Perspective__Group__7__Impl rule__Perspective__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__Perspective__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Perspective__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group__7"


    // $ANTLR start "rule__Perspective__Group__7__Impl"
    // InternalPerspectiveDSL.g:570:1: rule__Perspective__Group__7__Impl : ( ';' ) ;
    public final void rule__Perspective__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:574:1: ( ( ';' ) )
            // InternalPerspectiveDSL.g:575:1: ( ';' )
            {
            // InternalPerspectiveDSL.g:575:1: ( ';' )
            // InternalPerspectiveDSL.g:576:2: ';'
            {
             before(grammarAccess.getPerspectiveAccess().getSemicolonKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPerspectiveAccess().getSemicolonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group__7__Impl"


    // $ANTLR start "rule__Perspective__Group__8"
    // InternalPerspectiveDSL.g:585:1: rule__Perspective__Group__8 : rule__Perspective__Group__8__Impl rule__Perspective__Group__9 ;
    public final void rule__Perspective__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:589:1: ( rule__Perspective__Group__8__Impl rule__Perspective__Group__9 )
            // InternalPerspectiveDSL.g:590:2: rule__Perspective__Group__8__Impl rule__Perspective__Group__9
            {
            pushFollow(FOLLOW_11);
            rule__Perspective__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Perspective__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group__8"


    // $ANTLR start "rule__Perspective__Group__8__Impl"
    // InternalPerspectiveDSL.g:597:1: rule__Perspective__Group__8__Impl : ( 'languages' ) ;
    public final void rule__Perspective__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:601:1: ( ( 'languages' ) )
            // InternalPerspectiveDSL.g:602:1: ( 'languages' )
            {
            // InternalPerspectiveDSL.g:602:1: ( 'languages' )
            // InternalPerspectiveDSL.g:603:2: 'languages'
            {
             before(grammarAccess.getPerspectiveAccess().getLanguagesKeyword_8()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPerspectiveAccess().getLanguagesKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group__8__Impl"


    // $ANTLR start "rule__Perspective__Group__9"
    // InternalPerspectiveDSL.g:612:1: rule__Perspective__Group__9 : rule__Perspective__Group__9__Impl rule__Perspective__Group__10 ;
    public final void rule__Perspective__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:616:1: ( rule__Perspective__Group__9__Impl rule__Perspective__Group__10 )
            // InternalPerspectiveDSL.g:617:2: rule__Perspective__Group__9__Impl rule__Perspective__Group__10
            {
            pushFollow(FOLLOW_12);
            rule__Perspective__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Perspective__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group__9"


    // $ANTLR start "rule__Perspective__Group__9__Impl"
    // InternalPerspectiveDSL.g:624:1: rule__Perspective__Group__9__Impl : ( ':' ) ;
    public final void rule__Perspective__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:628:1: ( ( ':' ) )
            // InternalPerspectiveDSL.g:629:1: ( ':' )
            {
            // InternalPerspectiveDSL.g:629:1: ( ':' )
            // InternalPerspectiveDSL.g:630:2: ':'
            {
             before(grammarAccess.getPerspectiveAccess().getColonKeyword_9()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPerspectiveAccess().getColonKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group__9__Impl"


    // $ANTLR start "rule__Perspective__Group__10"
    // InternalPerspectiveDSL.g:639:1: rule__Perspective__Group__10 : rule__Perspective__Group__10__Impl rule__Perspective__Group__11 ;
    public final void rule__Perspective__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:643:1: ( rule__Perspective__Group__10__Impl rule__Perspective__Group__11 )
            // InternalPerspectiveDSL.g:644:2: rule__Perspective__Group__10__Impl rule__Perspective__Group__11
            {
            pushFollow(FOLLOW_12);
            rule__Perspective__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Perspective__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group__10"


    // $ANTLR start "rule__Perspective__Group__10__Impl"
    // InternalPerspectiveDSL.g:651:1: rule__Perspective__Group__10__Impl : ( ( rule__Perspective__LanguagesAssignment_10 )* ) ;
    public final void rule__Perspective__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:655:1: ( ( ( rule__Perspective__LanguagesAssignment_10 )* ) )
            // InternalPerspectiveDSL.g:656:1: ( ( rule__Perspective__LanguagesAssignment_10 )* )
            {
            // InternalPerspectiveDSL.g:656:1: ( ( rule__Perspective__LanguagesAssignment_10 )* )
            // InternalPerspectiveDSL.g:657:2: ( rule__Perspective__LanguagesAssignment_10 )*
            {
             before(grammarAccess.getPerspectiveAccess().getLanguagesAssignment_10()); 
            // InternalPerspectiveDSL.g:658:2: ( rule__Perspective__LanguagesAssignment_10 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==31) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPerspectiveDSL.g:658:3: rule__Perspective__LanguagesAssignment_10
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Perspective__LanguagesAssignment_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getPerspectiveAccess().getLanguagesAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group__10__Impl"


    // $ANTLR start "rule__Perspective__Group__11"
    // InternalPerspectiveDSL.g:666:1: rule__Perspective__Group__11 : rule__Perspective__Group__11__Impl rule__Perspective__Group__12 ;
    public final void rule__Perspective__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:670:1: ( rule__Perspective__Group__11__Impl rule__Perspective__Group__12 )
            // InternalPerspectiveDSL.g:671:2: rule__Perspective__Group__11__Impl rule__Perspective__Group__12
            {
            pushFollow(FOLLOW_14);
            rule__Perspective__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Perspective__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group__11"


    // $ANTLR start "rule__Perspective__Group__11__Impl"
    // InternalPerspectiveDSL.g:678:1: rule__Perspective__Group__11__Impl : ( 'end' ) ;
    public final void rule__Perspective__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:682:1: ( ( 'end' ) )
            // InternalPerspectiveDSL.g:683:1: ( 'end' )
            {
            // InternalPerspectiveDSL.g:683:1: ( 'end' )
            // InternalPerspectiveDSL.g:684:2: 'end'
            {
             before(grammarAccess.getPerspectiveAccess().getEndKeyword_11()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPerspectiveAccess().getEndKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group__11__Impl"


    // $ANTLR start "rule__Perspective__Group__12"
    // InternalPerspectiveDSL.g:693:1: rule__Perspective__Group__12 : rule__Perspective__Group__12__Impl rule__Perspective__Group__13 ;
    public final void rule__Perspective__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:697:1: ( rule__Perspective__Group__12__Impl rule__Perspective__Group__13 )
            // InternalPerspectiveDSL.g:698:2: rule__Perspective__Group__12__Impl rule__Perspective__Group__13
            {
            pushFollow(FOLLOW_11);
            rule__Perspective__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Perspective__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group__12"


    // $ANTLR start "rule__Perspective__Group__12__Impl"
    // InternalPerspectiveDSL.g:705:1: rule__Perspective__Group__12__Impl : ( 'actions' ) ;
    public final void rule__Perspective__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:709:1: ( ( 'actions' ) )
            // InternalPerspectiveDSL.g:710:1: ( 'actions' )
            {
            // InternalPerspectiveDSL.g:710:1: ( 'actions' )
            // InternalPerspectiveDSL.g:711:2: 'actions'
            {
             before(grammarAccess.getPerspectiveAccess().getActionsKeyword_12()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPerspectiveAccess().getActionsKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group__12__Impl"


    // $ANTLR start "rule__Perspective__Group__13"
    // InternalPerspectiveDSL.g:720:1: rule__Perspective__Group__13 : rule__Perspective__Group__13__Impl rule__Perspective__Group__14 ;
    public final void rule__Perspective__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:724:1: ( rule__Perspective__Group__13__Impl rule__Perspective__Group__14 )
            // InternalPerspectiveDSL.g:725:2: rule__Perspective__Group__13__Impl rule__Perspective__Group__14
            {
            pushFollow(FOLLOW_15);
            rule__Perspective__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Perspective__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group__13"


    // $ANTLR start "rule__Perspective__Group__13__Impl"
    // InternalPerspectiveDSL.g:732:1: rule__Perspective__Group__13__Impl : ( ':' ) ;
    public final void rule__Perspective__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:736:1: ( ( ':' ) )
            // InternalPerspectiveDSL.g:737:1: ( ':' )
            {
            // InternalPerspectiveDSL.g:737:1: ( ':' )
            // InternalPerspectiveDSL.g:738:2: ':'
            {
             before(grammarAccess.getPerspectiveAccess().getColonKeyword_13()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPerspectiveAccess().getColonKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group__13__Impl"


    // $ANTLR start "rule__Perspective__Group__14"
    // InternalPerspectiveDSL.g:747:1: rule__Perspective__Group__14 : rule__Perspective__Group__14__Impl rule__Perspective__Group__15 ;
    public final void rule__Perspective__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:751:1: ( rule__Perspective__Group__14__Impl rule__Perspective__Group__15 )
            // InternalPerspectiveDSL.g:752:2: rule__Perspective__Group__14__Impl rule__Perspective__Group__15
            {
            pushFollow(FOLLOW_15);
            rule__Perspective__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Perspective__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group__14"


    // $ANTLR start "rule__Perspective__Group__14__Impl"
    // InternalPerspectiveDSL.g:759:1: rule__Perspective__Group__14__Impl : ( ( rule__Perspective__ActionsAssignment_14 )* ) ;
    public final void rule__Perspective__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:763:1: ( ( ( rule__Perspective__ActionsAssignment_14 )* ) )
            // InternalPerspectiveDSL.g:764:1: ( ( rule__Perspective__ActionsAssignment_14 )* )
            {
            // InternalPerspectiveDSL.g:764:1: ( ( rule__Perspective__ActionsAssignment_14 )* )
            // InternalPerspectiveDSL.g:765:2: ( rule__Perspective__ActionsAssignment_14 )*
            {
             before(grammarAccess.getPerspectiveAccess().getActionsAssignment_14()); 
            // InternalPerspectiveDSL.g:766:2: ( rule__Perspective__ActionsAssignment_14 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==50) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalPerspectiveDSL.g:766:3: rule__Perspective__ActionsAssignment_14
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Perspective__ActionsAssignment_14();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getPerspectiveAccess().getActionsAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group__14__Impl"


    // $ANTLR start "rule__Perspective__Group__15"
    // InternalPerspectiveDSL.g:774:1: rule__Perspective__Group__15 : rule__Perspective__Group__15__Impl rule__Perspective__Group__16 ;
    public final void rule__Perspective__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:778:1: ( rule__Perspective__Group__15__Impl rule__Perspective__Group__16 )
            // InternalPerspectiveDSL.g:779:2: rule__Perspective__Group__15__Impl rule__Perspective__Group__16
            {
            pushFollow(FOLLOW_17);
            rule__Perspective__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Perspective__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group__15"


    // $ANTLR start "rule__Perspective__Group__15__Impl"
    // InternalPerspectiveDSL.g:786:1: rule__Perspective__Group__15__Impl : ( 'end' ) ;
    public final void rule__Perspective__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:790:1: ( ( 'end' ) )
            // InternalPerspectiveDSL.g:791:1: ( 'end' )
            {
            // InternalPerspectiveDSL.g:791:1: ( 'end' )
            // InternalPerspectiveDSL.g:792:2: 'end'
            {
             before(grammarAccess.getPerspectiveAccess().getEndKeyword_15()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPerspectiveAccess().getEndKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group__15__Impl"


    // $ANTLR start "rule__Perspective__Group__16"
    // InternalPerspectiveDSL.g:801:1: rule__Perspective__Group__16 : rule__Perspective__Group__16__Impl rule__Perspective__Group__17 ;
    public final void rule__Perspective__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:805:1: ( rule__Perspective__Group__16__Impl rule__Perspective__Group__17 )
            // InternalPerspectiveDSL.g:806:2: rule__Perspective__Group__16__Impl rule__Perspective__Group__17
            {
            pushFollow(FOLLOW_11);
            rule__Perspective__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Perspective__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group__16"


    // $ANTLR start "rule__Perspective__Group__16__Impl"
    // InternalPerspectiveDSL.g:813:1: rule__Perspective__Group__16__Impl : ( 'mappings' ) ;
    public final void rule__Perspective__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:817:1: ( ( 'mappings' ) )
            // InternalPerspectiveDSL.g:818:1: ( 'mappings' )
            {
            // InternalPerspectiveDSL.g:818:1: ( 'mappings' )
            // InternalPerspectiveDSL.g:819:2: 'mappings'
            {
             before(grammarAccess.getPerspectiveAccess().getMappingsKeyword_16()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPerspectiveAccess().getMappingsKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group__16__Impl"


    // $ANTLR start "rule__Perspective__Group__17"
    // InternalPerspectiveDSL.g:828:1: rule__Perspective__Group__17 : rule__Perspective__Group__17__Impl rule__Perspective__Group__18 ;
    public final void rule__Perspective__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:832:1: ( rule__Perspective__Group__17__Impl rule__Perspective__Group__18 )
            // InternalPerspectiveDSL.g:833:2: rule__Perspective__Group__17__Impl rule__Perspective__Group__18
            {
            pushFollow(FOLLOW_18);
            rule__Perspective__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Perspective__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group__17"


    // $ANTLR start "rule__Perspective__Group__17__Impl"
    // InternalPerspectiveDSL.g:840:1: rule__Perspective__Group__17__Impl : ( ':' ) ;
    public final void rule__Perspective__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:844:1: ( ( ':' ) )
            // InternalPerspectiveDSL.g:845:1: ( ':' )
            {
            // InternalPerspectiveDSL.g:845:1: ( ':' )
            // InternalPerspectiveDSL.g:846:2: ':'
            {
             before(grammarAccess.getPerspectiveAccess().getColonKeyword_17()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPerspectiveAccess().getColonKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group__17__Impl"


    // $ANTLR start "rule__Perspective__Group__18"
    // InternalPerspectiveDSL.g:855:1: rule__Perspective__Group__18 : rule__Perspective__Group__18__Impl rule__Perspective__Group__19 ;
    public final void rule__Perspective__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:859:1: ( rule__Perspective__Group__18__Impl rule__Perspective__Group__19 )
            // InternalPerspectiveDSL.g:860:2: rule__Perspective__Group__18__Impl rule__Perspective__Group__19
            {
            pushFollow(FOLLOW_18);
            rule__Perspective__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Perspective__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group__18"


    // $ANTLR start "rule__Perspective__Group__18__Impl"
    // InternalPerspectiveDSL.g:867:1: rule__Perspective__Group__18__Impl : ( ( rule__Perspective__MappingsAssignment_18 )* ) ;
    public final void rule__Perspective__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:871:1: ( ( ( rule__Perspective__MappingsAssignment_18 )* ) )
            // InternalPerspectiveDSL.g:872:1: ( ( rule__Perspective__MappingsAssignment_18 )* )
            {
            // InternalPerspectiveDSL.g:872:1: ( ( rule__Perspective__MappingsAssignment_18 )* )
            // InternalPerspectiveDSL.g:873:2: ( rule__Perspective__MappingsAssignment_18 )*
            {
             before(grammarAccess.getPerspectiveAccess().getMappingsAssignment_18()); 
            // InternalPerspectiveDSL.g:874:2: ( rule__Perspective__MappingsAssignment_18 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==36) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPerspectiveDSL.g:874:3: rule__Perspective__MappingsAssignment_18
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Perspective__MappingsAssignment_18();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getPerspectiveAccess().getMappingsAssignment_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group__18__Impl"


    // $ANTLR start "rule__Perspective__Group__19"
    // InternalPerspectiveDSL.g:882:1: rule__Perspective__Group__19 : rule__Perspective__Group__19__Impl rule__Perspective__Group__20 ;
    public final void rule__Perspective__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:886:1: ( rule__Perspective__Group__19__Impl rule__Perspective__Group__20 )
            // InternalPerspectiveDSL.g:887:2: rule__Perspective__Group__19__Impl rule__Perspective__Group__20
            {
            pushFollow(FOLLOW_20);
            rule__Perspective__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Perspective__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group__19"


    // $ANTLR start "rule__Perspective__Group__19__Impl"
    // InternalPerspectiveDSL.g:894:1: rule__Perspective__Group__19__Impl : ( 'end' ) ;
    public final void rule__Perspective__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:898:1: ( ( 'end' ) )
            // InternalPerspectiveDSL.g:899:1: ( 'end' )
            {
            // InternalPerspectiveDSL.g:899:1: ( 'end' )
            // InternalPerspectiveDSL.g:900:2: 'end'
            {
             before(grammarAccess.getPerspectiveAccess().getEndKeyword_19()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPerspectiveAccess().getEndKeyword_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group__19__Impl"


    // $ANTLR start "rule__Perspective__Group__20"
    // InternalPerspectiveDSL.g:909:1: rule__Perspective__Group__20 : rule__Perspective__Group__20__Impl rule__Perspective__Group__21 ;
    public final void rule__Perspective__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:913:1: ( rule__Perspective__Group__20__Impl rule__Perspective__Group__21 )
            // InternalPerspectiveDSL.g:914:2: rule__Perspective__Group__20__Impl rule__Perspective__Group__21
            {
            pushFollow(FOLLOW_20);
            rule__Perspective__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Perspective__Group__21();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group__20"


    // $ANTLR start "rule__Perspective__Group__20__Impl"
    // InternalPerspectiveDSL.g:921:1: rule__Perspective__Group__20__Impl : ( ( rule__Perspective__Group_20__0 )? ) ;
    public final void rule__Perspective__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:925:1: ( ( ( rule__Perspective__Group_20__0 )? ) )
            // InternalPerspectiveDSL.g:926:1: ( ( rule__Perspective__Group_20__0 )? )
            {
            // InternalPerspectiveDSL.g:926:1: ( ( rule__Perspective__Group_20__0 )? )
            // InternalPerspectiveDSL.g:927:2: ( rule__Perspective__Group_20__0 )?
            {
             before(grammarAccess.getPerspectiveAccess().getGroup_20()); 
            // InternalPerspectiveDSL.g:928:2: ( rule__Perspective__Group_20__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==30) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalPerspectiveDSL.g:928:3: rule__Perspective__Group_20__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Perspective__Group_20__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPerspectiveAccess().getGroup_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group__20__Impl"


    // $ANTLR start "rule__Perspective__Group__21"
    // InternalPerspectiveDSL.g:936:1: rule__Perspective__Group__21 : rule__Perspective__Group__21__Impl rule__Perspective__Group__22 ;
    public final void rule__Perspective__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:940:1: ( rule__Perspective__Group__21__Impl rule__Perspective__Group__22 )
            // InternalPerspectiveDSL.g:941:2: rule__Perspective__Group__21__Impl rule__Perspective__Group__22
            {
            pushFollow(FOLLOW_21);
            rule__Perspective__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Perspective__Group__22();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group__21"


    // $ANTLR start "rule__Perspective__Group__21__Impl"
    // InternalPerspectiveDSL.g:948:1: rule__Perspective__Group__21__Impl : ( 'end' ) ;
    public final void rule__Perspective__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:952:1: ( ( 'end' ) )
            // InternalPerspectiveDSL.g:953:1: ( 'end' )
            {
            // InternalPerspectiveDSL.g:953:1: ( 'end' )
            // InternalPerspectiveDSL.g:954:2: 'end'
            {
             before(grammarAccess.getPerspectiveAccess().getEndKeyword_21()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPerspectiveAccess().getEndKeyword_21()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group__21__Impl"


    // $ANTLR start "rule__Perspective__Group__22"
    // InternalPerspectiveDSL.g:963:1: rule__Perspective__Group__22 : rule__Perspective__Group__22__Impl ;
    public final void rule__Perspective__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:967:1: ( rule__Perspective__Group__22__Impl )
            // InternalPerspectiveDSL.g:968:2: rule__Perspective__Group__22__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Perspective__Group__22__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group__22"


    // $ANTLR start "rule__Perspective__Group__22__Impl"
    // InternalPerspectiveDSL.g:974:1: rule__Perspective__Group__22__Impl : ( '}' ) ;
    public final void rule__Perspective__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:978:1: ( ( '}' ) )
            // InternalPerspectiveDSL.g:979:1: ( '}' )
            {
            // InternalPerspectiveDSL.g:979:1: ( '}' )
            // InternalPerspectiveDSL.g:980:2: '}'
            {
             before(grammarAccess.getPerspectiveAccess().getRightCurlyBracketKeyword_22()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPerspectiveAccess().getRightCurlyBracketKeyword_22()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group__22__Impl"


    // $ANTLR start "rule__Perspective__Group_3__0"
    // InternalPerspectiveDSL.g:990:1: rule__Perspective__Group_3__0 : rule__Perspective__Group_3__0__Impl rule__Perspective__Group_3__1 ;
    public final void rule__Perspective__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:994:1: ( rule__Perspective__Group_3__0__Impl rule__Perspective__Group_3__1 )
            // InternalPerspectiveDSL.g:995:2: rule__Perspective__Group_3__0__Impl rule__Perspective__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Perspective__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Perspective__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group_3__0"


    // $ANTLR start "rule__Perspective__Group_3__0__Impl"
    // InternalPerspectiveDSL.g:1002:1: rule__Perspective__Group_3__0__Impl : ( 'default' ) ;
    public final void rule__Perspective__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1006:1: ( ( 'default' ) )
            // InternalPerspectiveDSL.g:1007:1: ( 'default' )
            {
            // InternalPerspectiveDSL.g:1007:1: ( 'default' )
            // InternalPerspectiveDSL.g:1008:2: 'default'
            {
             before(grammarAccess.getPerspectiveAccess().getDefaultKeyword_3_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getPerspectiveAccess().getDefaultKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group_3__0__Impl"


    // $ANTLR start "rule__Perspective__Group_3__1"
    // InternalPerspectiveDSL.g:1017:1: rule__Perspective__Group_3__1 : rule__Perspective__Group_3__1__Impl rule__Perspective__Group_3__2 ;
    public final void rule__Perspective__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1021:1: ( rule__Perspective__Group_3__1__Impl rule__Perspective__Group_3__2 )
            // InternalPerspectiveDSL.g:1022:2: rule__Perspective__Group_3__1__Impl rule__Perspective__Group_3__2
            {
            pushFollow(FOLLOW_9);
            rule__Perspective__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Perspective__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group_3__1"


    // $ANTLR start "rule__Perspective__Group_3__1__Impl"
    // InternalPerspectiveDSL.g:1029:1: rule__Perspective__Group_3__1__Impl : ( ( rule__Perspective__DefaultAssignment_3_1 ) ) ;
    public final void rule__Perspective__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1033:1: ( ( ( rule__Perspective__DefaultAssignment_3_1 ) ) )
            // InternalPerspectiveDSL.g:1034:1: ( ( rule__Perspective__DefaultAssignment_3_1 ) )
            {
            // InternalPerspectiveDSL.g:1034:1: ( ( rule__Perspective__DefaultAssignment_3_1 ) )
            // InternalPerspectiveDSL.g:1035:2: ( rule__Perspective__DefaultAssignment_3_1 )
            {
             before(grammarAccess.getPerspectiveAccess().getDefaultAssignment_3_1()); 
            // InternalPerspectiveDSL.g:1036:2: ( rule__Perspective__DefaultAssignment_3_1 )
            // InternalPerspectiveDSL.g:1036:3: rule__Perspective__DefaultAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Perspective__DefaultAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPerspectiveAccess().getDefaultAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group_3__1__Impl"


    // $ANTLR start "rule__Perspective__Group_3__2"
    // InternalPerspectiveDSL.g:1044:1: rule__Perspective__Group_3__2 : rule__Perspective__Group_3__2__Impl ;
    public final void rule__Perspective__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1048:1: ( rule__Perspective__Group_3__2__Impl )
            // InternalPerspectiveDSL.g:1049:2: rule__Perspective__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Perspective__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group_3__2"


    // $ANTLR start "rule__Perspective__Group_3__2__Impl"
    // InternalPerspectiveDSL.g:1055:1: rule__Perspective__Group_3__2__Impl : ( ';' ) ;
    public final void rule__Perspective__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1059:1: ( ( ';' ) )
            // InternalPerspectiveDSL.g:1060:1: ( ';' )
            {
            // InternalPerspectiveDSL.g:1060:1: ( ';' )
            // InternalPerspectiveDSL.g:1061:2: ';'
            {
             before(grammarAccess.getPerspectiveAccess().getSemicolonKeyword_3_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPerspectiveAccess().getSemicolonKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group_3__2__Impl"


    // $ANTLR start "rule__Perspective__Group_20__0"
    // InternalPerspectiveDSL.g:1071:1: rule__Perspective__Group_20__0 : rule__Perspective__Group_20__0__Impl rule__Perspective__Group_20__1 ;
    public final void rule__Perspective__Group_20__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1075:1: ( rule__Perspective__Group_20__0__Impl rule__Perspective__Group_20__1 )
            // InternalPerspectiveDSL.g:1076:2: rule__Perspective__Group_20__0__Impl rule__Perspective__Group_20__1
            {
            pushFollow(FOLLOW_11);
            rule__Perspective__Group_20__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Perspective__Group_20__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group_20__0"


    // $ANTLR start "rule__Perspective__Group_20__0__Impl"
    // InternalPerspectiveDSL.g:1083:1: rule__Perspective__Group_20__0__Impl : ( 'intraLanguageMappings' ) ;
    public final void rule__Perspective__Group_20__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1087:1: ( ( 'intraLanguageMappings' ) )
            // InternalPerspectiveDSL.g:1088:1: ( 'intraLanguageMappings' )
            {
            // InternalPerspectiveDSL.g:1088:1: ( 'intraLanguageMappings' )
            // InternalPerspectiveDSL.g:1089:2: 'intraLanguageMappings'
            {
             before(grammarAccess.getPerspectiveAccess().getIntraLanguageMappingsKeyword_20_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getPerspectiveAccess().getIntraLanguageMappingsKeyword_20_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group_20__0__Impl"


    // $ANTLR start "rule__Perspective__Group_20__1"
    // InternalPerspectiveDSL.g:1098:1: rule__Perspective__Group_20__1 : rule__Perspective__Group_20__1__Impl rule__Perspective__Group_20__2 ;
    public final void rule__Perspective__Group_20__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1102:1: ( rule__Perspective__Group_20__1__Impl rule__Perspective__Group_20__2 )
            // InternalPerspectiveDSL.g:1103:2: rule__Perspective__Group_20__1__Impl rule__Perspective__Group_20__2
            {
            pushFollow(FOLLOW_22);
            rule__Perspective__Group_20__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Perspective__Group_20__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group_20__1"


    // $ANTLR start "rule__Perspective__Group_20__1__Impl"
    // InternalPerspectiveDSL.g:1110:1: rule__Perspective__Group_20__1__Impl : ( ':' ) ;
    public final void rule__Perspective__Group_20__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1114:1: ( ( ':' ) )
            // InternalPerspectiveDSL.g:1115:1: ( ':' )
            {
            // InternalPerspectiveDSL.g:1115:1: ( ':' )
            // InternalPerspectiveDSL.g:1116:2: ':'
            {
             before(grammarAccess.getPerspectiveAccess().getColonKeyword_20_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPerspectiveAccess().getColonKeyword_20_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group_20__1__Impl"


    // $ANTLR start "rule__Perspective__Group_20__2"
    // InternalPerspectiveDSL.g:1125:1: rule__Perspective__Group_20__2 : rule__Perspective__Group_20__2__Impl ;
    public final void rule__Perspective__Group_20__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1129:1: ( rule__Perspective__Group_20__2__Impl )
            // InternalPerspectiveDSL.g:1130:2: rule__Perspective__Group_20__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Perspective__Group_20__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group_20__2"


    // $ANTLR start "rule__Perspective__Group_20__2__Impl"
    // InternalPerspectiveDSL.g:1136:1: rule__Perspective__Group_20__2__Impl : ( ( rule__Perspective__IntralanguagemappingsAssignment_20_2 )* ) ;
    public final void rule__Perspective__Group_20__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1140:1: ( ( ( rule__Perspective__IntralanguagemappingsAssignment_20_2 )* ) )
            // InternalPerspectiveDSL.g:1141:1: ( ( rule__Perspective__IntralanguagemappingsAssignment_20_2 )* )
            {
            // InternalPerspectiveDSL.g:1141:1: ( ( rule__Perspective__IntralanguagemappingsAssignment_20_2 )* )
            // InternalPerspectiveDSL.g:1142:2: ( rule__Perspective__IntralanguagemappingsAssignment_20_2 )*
            {
             before(grammarAccess.getPerspectiveAccess().getIntralanguagemappingsAssignment_20_2()); 
            // InternalPerspectiveDSL.g:1143:2: ( rule__Perspective__IntralanguagemappingsAssignment_20_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==51) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalPerspectiveDSL.g:1143:3: rule__Perspective__IntralanguagemappingsAssignment_20_2
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Perspective__IntralanguagemappingsAssignment_20_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getPerspectiveAccess().getIntralanguagemappingsAssignment_20_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__Group_20__2__Impl"


    // $ANTLR start "rule__Language__Group__0"
    // InternalPerspectiveDSL.g:1152:1: rule__Language__Group__0 : rule__Language__Group__0__Impl rule__Language__Group__1 ;
    public final void rule__Language__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1156:1: ( rule__Language__Group__0__Impl rule__Language__Group__1 )
            // InternalPerspectiveDSL.g:1157:2: rule__Language__Group__0__Impl rule__Language__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Language__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Language__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Language__Group__0"


    // $ANTLR start "rule__Language__Group__0__Impl"
    // InternalPerspectiveDSL.g:1164:1: rule__Language__Group__0__Impl : ( 'existing' ) ;
    public final void rule__Language__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1168:1: ( ( 'existing' ) )
            // InternalPerspectiveDSL.g:1169:1: ( 'existing' )
            {
            // InternalPerspectiveDSL.g:1169:1: ( 'existing' )
            // InternalPerspectiveDSL.g:1170:2: 'existing'
            {
             before(grammarAccess.getLanguageAccess().getExistingKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getLanguageAccess().getExistingKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Language__Group__0__Impl"


    // $ANTLR start "rule__Language__Group__1"
    // InternalPerspectiveDSL.g:1179:1: rule__Language__Group__1 : rule__Language__Group__1__Impl rule__Language__Group__2 ;
    public final void rule__Language__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1183:1: ( rule__Language__Group__1__Impl rule__Language__Group__2 )
            // InternalPerspectiveDSL.g:1184:2: rule__Language__Group__1__Impl rule__Language__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Language__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Language__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Language__Group__1"


    // $ANTLR start "rule__Language__Group__1__Impl"
    // InternalPerspectiveDSL.g:1191:1: rule__Language__Group__1__Impl : ( 'language' ) ;
    public final void rule__Language__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1195:1: ( ( 'language' ) )
            // InternalPerspectiveDSL.g:1196:1: ( 'language' )
            {
            // InternalPerspectiveDSL.g:1196:1: ( 'language' )
            // InternalPerspectiveDSL.g:1197:2: 'language'
            {
             before(grammarAccess.getLanguageAccess().getLanguageKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getLanguageAccess().getLanguageKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Language__Group__1__Impl"


    // $ANTLR start "rule__Language__Group__2"
    // InternalPerspectiveDSL.g:1206:1: rule__Language__Group__2 : rule__Language__Group__2__Impl rule__Language__Group__3 ;
    public final void rule__Language__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1210:1: ( rule__Language__Group__2__Impl rule__Language__Group__3 )
            // InternalPerspectiveDSL.g:1211:2: rule__Language__Group__2__Impl rule__Language__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Language__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Language__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Language__Group__2"


    // $ANTLR start "rule__Language__Group__2__Impl"
    // InternalPerspectiveDSL.g:1218:1: rule__Language__Group__2__Impl : ( ( rule__Language__NameAssignment_2 ) ) ;
    public final void rule__Language__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1222:1: ( ( ( rule__Language__NameAssignment_2 ) ) )
            // InternalPerspectiveDSL.g:1223:1: ( ( rule__Language__NameAssignment_2 ) )
            {
            // InternalPerspectiveDSL.g:1223:1: ( ( rule__Language__NameAssignment_2 ) )
            // InternalPerspectiveDSL.g:1224:2: ( rule__Language__NameAssignment_2 )
            {
             before(grammarAccess.getLanguageAccess().getNameAssignment_2()); 
            // InternalPerspectiveDSL.g:1225:2: ( rule__Language__NameAssignment_2 )
            // InternalPerspectiveDSL.g:1225:3: rule__Language__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Language__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLanguageAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Language__Group__2__Impl"


    // $ANTLR start "rule__Language__Group__3"
    // InternalPerspectiveDSL.g:1233:1: rule__Language__Group__3 : rule__Language__Group__3__Impl rule__Language__Group__4 ;
    public final void rule__Language__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1237:1: ( rule__Language__Group__3__Impl rule__Language__Group__4 )
            // InternalPerspectiveDSL.g:1238:2: rule__Language__Group__3__Impl rule__Language__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__Language__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Language__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Language__Group__3"


    // $ANTLR start "rule__Language__Group__3__Impl"
    // InternalPerspectiveDSL.g:1245:1: rule__Language__Group__3__Impl : ( '{' ) ;
    public final void rule__Language__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1249:1: ( ( '{' ) )
            // InternalPerspectiveDSL.g:1250:1: ( '{' )
            {
            // InternalPerspectiveDSL.g:1250:1: ( '{' )
            // InternalPerspectiveDSL.g:1251:2: '{'
            {
             before(grammarAccess.getLanguageAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getLanguageAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Language__Group__3__Impl"


    // $ANTLR start "rule__Language__Group__4"
    // InternalPerspectiveDSL.g:1260:1: rule__Language__Group__4 : rule__Language__Group__4__Impl rule__Language__Group__5 ;
    public final void rule__Language__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1264:1: ( rule__Language__Group__4__Impl rule__Language__Group__5 )
            // InternalPerspectiveDSL.g:1265:2: rule__Language__Group__4__Impl rule__Language__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Language__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Language__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Language__Group__4"


    // $ANTLR start "rule__Language__Group__4__Impl"
    // InternalPerspectiveDSL.g:1272:1: rule__Language__Group__4__Impl : ( 'rootPackage' ) ;
    public final void rule__Language__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1276:1: ( ( 'rootPackage' ) )
            // InternalPerspectiveDSL.g:1277:1: ( 'rootPackage' )
            {
            // InternalPerspectiveDSL.g:1277:1: ( 'rootPackage' )
            // InternalPerspectiveDSL.g:1278:2: 'rootPackage'
            {
             before(grammarAccess.getLanguageAccess().getRootPackageKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getLanguageAccess().getRootPackageKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Language__Group__4__Impl"


    // $ANTLR start "rule__Language__Group__5"
    // InternalPerspectiveDSL.g:1287:1: rule__Language__Group__5 : rule__Language__Group__5__Impl rule__Language__Group__6 ;
    public final void rule__Language__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1291:1: ( rule__Language__Group__5__Impl rule__Language__Group__6 )
            // InternalPerspectiveDSL.g:1292:2: rule__Language__Group__5__Impl rule__Language__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Language__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Language__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Language__Group__5"


    // $ANTLR start "rule__Language__Group__5__Impl"
    // InternalPerspectiveDSL.g:1299:1: rule__Language__Group__5__Impl : ( ( rule__Language__RootPackageAssignment_5 ) ) ;
    public final void rule__Language__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1303:1: ( ( ( rule__Language__RootPackageAssignment_5 ) ) )
            // InternalPerspectiveDSL.g:1304:1: ( ( rule__Language__RootPackageAssignment_5 ) )
            {
            // InternalPerspectiveDSL.g:1304:1: ( ( rule__Language__RootPackageAssignment_5 ) )
            // InternalPerspectiveDSL.g:1305:2: ( rule__Language__RootPackageAssignment_5 )
            {
             before(grammarAccess.getLanguageAccess().getRootPackageAssignment_5()); 
            // InternalPerspectiveDSL.g:1306:2: ( rule__Language__RootPackageAssignment_5 )
            // InternalPerspectiveDSL.g:1306:3: rule__Language__RootPackageAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Language__RootPackageAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getLanguageAccess().getRootPackageAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Language__Group__5__Impl"


    // $ANTLR start "rule__Language__Group__6"
    // InternalPerspectiveDSL.g:1314:1: rule__Language__Group__6 : rule__Language__Group__6__Impl rule__Language__Group__7 ;
    public final void rule__Language__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1318:1: ( rule__Language__Group__6__Impl rule__Language__Group__7 )
            // InternalPerspectiveDSL.g:1319:2: rule__Language__Group__6__Impl rule__Language__Group__7
            {
            pushFollow(FOLLOW_26);
            rule__Language__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Language__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Language__Group__6"


    // $ANTLR start "rule__Language__Group__6__Impl"
    // InternalPerspectiveDSL.g:1326:1: rule__Language__Group__6__Impl : ( ';' ) ;
    public final void rule__Language__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1330:1: ( ( ';' ) )
            // InternalPerspectiveDSL.g:1331:1: ( ';' )
            {
            // InternalPerspectiveDSL.g:1331:1: ( ';' )
            // InternalPerspectiveDSL.g:1332:2: ';'
            {
             before(grammarAccess.getLanguageAccess().getSemicolonKeyword_6()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getLanguageAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Language__Group__6__Impl"


    // $ANTLR start "rule__Language__Group__7"
    // InternalPerspectiveDSL.g:1341:1: rule__Language__Group__7 : rule__Language__Group__7__Impl rule__Language__Group__8 ;
    public final void rule__Language__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1345:1: ( rule__Language__Group__7__Impl rule__Language__Group__8 )
            // InternalPerspectiveDSL.g:1346:2: rule__Language__Group__7__Impl rule__Language__Group__8
            {
            pushFollow(FOLLOW_4);
            rule__Language__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Language__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Language__Group__7"


    // $ANTLR start "rule__Language__Group__7__Impl"
    // InternalPerspectiveDSL.g:1353:1: rule__Language__Group__7__Impl : ( 'packageClassName' ) ;
    public final void rule__Language__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1357:1: ( ( 'packageClassName' ) )
            // InternalPerspectiveDSL.g:1358:1: ( 'packageClassName' )
            {
            // InternalPerspectiveDSL.g:1358:1: ( 'packageClassName' )
            // InternalPerspectiveDSL.g:1359:2: 'packageClassName'
            {
             before(grammarAccess.getLanguageAccess().getPackageClassNameKeyword_7()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getLanguageAccess().getPackageClassNameKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Language__Group__7__Impl"


    // $ANTLR start "rule__Language__Group__8"
    // InternalPerspectiveDSL.g:1368:1: rule__Language__Group__8 : rule__Language__Group__8__Impl rule__Language__Group__9 ;
    public final void rule__Language__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1372:1: ( rule__Language__Group__8__Impl rule__Language__Group__9 )
            // InternalPerspectiveDSL.g:1373:2: rule__Language__Group__8__Impl rule__Language__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__Language__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Language__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Language__Group__8"


    // $ANTLR start "rule__Language__Group__8__Impl"
    // InternalPerspectiveDSL.g:1380:1: rule__Language__Group__8__Impl : ( ( rule__Language__PackageClassNameAssignment_8 ) ) ;
    public final void rule__Language__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1384:1: ( ( ( rule__Language__PackageClassNameAssignment_8 ) ) )
            // InternalPerspectiveDSL.g:1385:1: ( ( rule__Language__PackageClassNameAssignment_8 ) )
            {
            // InternalPerspectiveDSL.g:1385:1: ( ( rule__Language__PackageClassNameAssignment_8 ) )
            // InternalPerspectiveDSL.g:1386:2: ( rule__Language__PackageClassNameAssignment_8 )
            {
             before(grammarAccess.getLanguageAccess().getPackageClassNameAssignment_8()); 
            // InternalPerspectiveDSL.g:1387:2: ( rule__Language__PackageClassNameAssignment_8 )
            // InternalPerspectiveDSL.g:1387:3: rule__Language__PackageClassNameAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Language__PackageClassNameAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getLanguageAccess().getPackageClassNameAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Language__Group__8__Impl"


    // $ANTLR start "rule__Language__Group__9"
    // InternalPerspectiveDSL.g:1395:1: rule__Language__Group__9 : rule__Language__Group__9__Impl rule__Language__Group__10 ;
    public final void rule__Language__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1399:1: ( rule__Language__Group__9__Impl rule__Language__Group__10 )
            // InternalPerspectiveDSL.g:1400:2: rule__Language__Group__9__Impl rule__Language__Group__10
            {
            pushFollow(FOLLOW_27);
            rule__Language__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Language__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Language__Group__9"


    // $ANTLR start "rule__Language__Group__9__Impl"
    // InternalPerspectiveDSL.g:1407:1: rule__Language__Group__9__Impl : ( ';' ) ;
    public final void rule__Language__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1411:1: ( ( ';' ) )
            // InternalPerspectiveDSL.g:1412:1: ( ';' )
            {
            // InternalPerspectiveDSL.g:1412:1: ( ';' )
            // InternalPerspectiveDSL.g:1413:2: ';'
            {
             before(grammarAccess.getLanguageAccess().getSemicolonKeyword_9()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getLanguageAccess().getSemicolonKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Language__Group__9__Impl"


    // $ANTLR start "rule__Language__Group__10"
    // InternalPerspectiveDSL.g:1422:1: rule__Language__Group__10 : rule__Language__Group__10__Impl rule__Language__Group__11 ;
    public final void rule__Language__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1426:1: ( rule__Language__Group__10__Impl rule__Language__Group__11 )
            // InternalPerspectiveDSL.g:1427:2: rule__Language__Group__10__Impl rule__Language__Group__11
            {
            pushFollow(FOLLOW_4);
            rule__Language__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Language__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Language__Group__10"


    // $ANTLR start "rule__Language__Group__10__Impl"
    // InternalPerspectiveDSL.g:1434:1: rule__Language__Group__10__Impl : ( 'roleName' ) ;
    public final void rule__Language__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1438:1: ( ( 'roleName' ) )
            // InternalPerspectiveDSL.g:1439:1: ( 'roleName' )
            {
            // InternalPerspectiveDSL.g:1439:1: ( 'roleName' )
            // InternalPerspectiveDSL.g:1440:2: 'roleName'
            {
             before(grammarAccess.getLanguageAccess().getRoleNameKeyword_10()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getLanguageAccess().getRoleNameKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Language__Group__10__Impl"


    // $ANTLR start "rule__Language__Group__11"
    // InternalPerspectiveDSL.g:1449:1: rule__Language__Group__11 : rule__Language__Group__11__Impl rule__Language__Group__12 ;
    public final void rule__Language__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1453:1: ( rule__Language__Group__11__Impl rule__Language__Group__12 )
            // InternalPerspectiveDSL.g:1454:2: rule__Language__Group__11__Impl rule__Language__Group__12
            {
            pushFollow(FOLLOW_9);
            rule__Language__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Language__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Language__Group__11"


    // $ANTLR start "rule__Language__Group__11__Impl"
    // InternalPerspectiveDSL.g:1461:1: rule__Language__Group__11__Impl : ( ( rule__Language__RoleNameAssignment_11 ) ) ;
    public final void rule__Language__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1465:1: ( ( ( rule__Language__RoleNameAssignment_11 ) ) )
            // InternalPerspectiveDSL.g:1466:1: ( ( rule__Language__RoleNameAssignment_11 ) )
            {
            // InternalPerspectiveDSL.g:1466:1: ( ( rule__Language__RoleNameAssignment_11 ) )
            // InternalPerspectiveDSL.g:1467:2: ( rule__Language__RoleNameAssignment_11 )
            {
             before(grammarAccess.getLanguageAccess().getRoleNameAssignment_11()); 
            // InternalPerspectiveDSL.g:1468:2: ( rule__Language__RoleNameAssignment_11 )
            // InternalPerspectiveDSL.g:1468:3: rule__Language__RoleNameAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Language__RoleNameAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getLanguageAccess().getRoleNameAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Language__Group__11__Impl"


    // $ANTLR start "rule__Language__Group__12"
    // InternalPerspectiveDSL.g:1476:1: rule__Language__Group__12 : rule__Language__Group__12__Impl rule__Language__Group__13 ;
    public final void rule__Language__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1480:1: ( rule__Language__Group__12__Impl rule__Language__Group__13 )
            // InternalPerspectiveDSL.g:1481:2: rule__Language__Group__12__Impl rule__Language__Group__13
            {
            pushFollow(FOLLOW_21);
            rule__Language__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Language__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Language__Group__12"


    // $ANTLR start "rule__Language__Group__12__Impl"
    // InternalPerspectiveDSL.g:1488:1: rule__Language__Group__12__Impl : ( ';' ) ;
    public final void rule__Language__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1492:1: ( ( ';' ) )
            // InternalPerspectiveDSL.g:1493:1: ( ';' )
            {
            // InternalPerspectiveDSL.g:1493:1: ( ';' )
            // InternalPerspectiveDSL.g:1494:2: ';'
            {
             before(grammarAccess.getLanguageAccess().getSemicolonKeyword_12()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getLanguageAccess().getSemicolonKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Language__Group__12__Impl"


    // $ANTLR start "rule__Language__Group__13"
    // InternalPerspectiveDSL.g:1503:1: rule__Language__Group__13 : rule__Language__Group__13__Impl ;
    public final void rule__Language__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1507:1: ( rule__Language__Group__13__Impl )
            // InternalPerspectiveDSL.g:1508:2: rule__Language__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Language__Group__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Language__Group__13"


    // $ANTLR start "rule__Language__Group__13__Impl"
    // InternalPerspectiveDSL.g:1514:1: rule__Language__Group__13__Impl : ( '}' ) ;
    public final void rule__Language__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1518:1: ( ( '}' ) )
            // InternalPerspectiveDSL.g:1519:1: ( '}' )
            {
            // InternalPerspectiveDSL.g:1519:1: ( '}' )
            // InternalPerspectiveDSL.g:1520:2: '}'
            {
             before(grammarAccess.getLanguageAccess().getRightCurlyBracketKeyword_13()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getLanguageAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Language__Group__13__Impl"


    // $ANTLR start "rule__LanguageElementMapping__Group__0"
    // InternalPerspectiveDSL.g:1530:1: rule__LanguageElementMapping__Group__0 : rule__LanguageElementMapping__Group__0__Impl rule__LanguageElementMapping__Group__1 ;
    public final void rule__LanguageElementMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1534:1: ( rule__LanguageElementMapping__Group__0__Impl rule__LanguageElementMapping__Group__1 )
            // InternalPerspectiveDSL.g:1535:2: rule__LanguageElementMapping__Group__0__Impl rule__LanguageElementMapping__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__LanguageElementMapping__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageElementMapping__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group__0"


    // $ANTLR start "rule__LanguageElementMapping__Group__0__Impl"
    // InternalPerspectiveDSL.g:1542:1: rule__LanguageElementMapping__Group__0__Impl : ( 'mapping' ) ;
    public final void rule__LanguageElementMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1546:1: ( ( 'mapping' ) )
            // InternalPerspectiveDSL.g:1547:1: ( 'mapping' )
            {
            // InternalPerspectiveDSL.g:1547:1: ( 'mapping' )
            // InternalPerspectiveDSL.g:1548:2: 'mapping'
            {
             before(grammarAccess.getLanguageElementMappingAccess().getMappingKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getLanguageElementMappingAccess().getMappingKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group__0__Impl"


    // $ANTLR start "rule__LanguageElementMapping__Group__1"
    // InternalPerspectiveDSL.g:1557:1: rule__LanguageElementMapping__Group__1 : rule__LanguageElementMapping__Group__1__Impl rule__LanguageElementMapping__Group__2 ;
    public final void rule__LanguageElementMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1561:1: ( rule__LanguageElementMapping__Group__1__Impl rule__LanguageElementMapping__Group__2 )
            // InternalPerspectiveDSL.g:1562:2: rule__LanguageElementMapping__Group__1__Impl rule__LanguageElementMapping__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__LanguageElementMapping__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageElementMapping__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group__1"


    // $ANTLR start "rule__LanguageElementMapping__Group__1__Impl"
    // InternalPerspectiveDSL.g:1569:1: rule__LanguageElementMapping__Group__1__Impl : ( ( rule__LanguageElementMapping__NameAssignment_1 ) ) ;
    public final void rule__LanguageElementMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1573:1: ( ( ( rule__LanguageElementMapping__NameAssignment_1 ) ) )
            // InternalPerspectiveDSL.g:1574:1: ( ( rule__LanguageElementMapping__NameAssignment_1 ) )
            {
            // InternalPerspectiveDSL.g:1574:1: ( ( rule__LanguageElementMapping__NameAssignment_1 ) )
            // InternalPerspectiveDSL.g:1575:2: ( rule__LanguageElementMapping__NameAssignment_1 )
            {
             before(grammarAccess.getLanguageElementMappingAccess().getNameAssignment_1()); 
            // InternalPerspectiveDSL.g:1576:2: ( rule__LanguageElementMapping__NameAssignment_1 )
            // InternalPerspectiveDSL.g:1576:3: rule__LanguageElementMapping__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LanguageElementMapping__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLanguageElementMappingAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group__1__Impl"


    // $ANTLR start "rule__LanguageElementMapping__Group__2"
    // InternalPerspectiveDSL.g:1584:1: rule__LanguageElementMapping__Group__2 : rule__LanguageElementMapping__Group__2__Impl rule__LanguageElementMapping__Group__3 ;
    public final void rule__LanguageElementMapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1588:1: ( rule__LanguageElementMapping__Group__2__Impl rule__LanguageElementMapping__Group__3 )
            // InternalPerspectiveDSL.g:1589:2: rule__LanguageElementMapping__Group__2__Impl rule__LanguageElementMapping__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__LanguageElementMapping__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageElementMapping__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group__2"


    // $ANTLR start "rule__LanguageElementMapping__Group__2__Impl"
    // InternalPerspectiveDSL.g:1596:1: rule__LanguageElementMapping__Group__2__Impl : ( '{' ) ;
    public final void rule__LanguageElementMapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1600:1: ( ( '{' ) )
            // InternalPerspectiveDSL.g:1601:1: ( '{' )
            {
            // InternalPerspectiveDSL.g:1601:1: ( '{' )
            // InternalPerspectiveDSL.g:1602:2: '{'
            {
             before(grammarAccess.getLanguageElementMappingAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getLanguageElementMappingAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group__2__Impl"


    // $ANTLR start "rule__LanguageElementMapping__Group__3"
    // InternalPerspectiveDSL.g:1611:1: rule__LanguageElementMapping__Group__3 : rule__LanguageElementMapping__Group__3__Impl rule__LanguageElementMapping__Group__4 ;
    public final void rule__LanguageElementMapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1615:1: ( rule__LanguageElementMapping__Group__3__Impl rule__LanguageElementMapping__Group__4 )
            // InternalPerspectiveDSL.g:1616:2: rule__LanguageElementMapping__Group__3__Impl rule__LanguageElementMapping__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__LanguageElementMapping__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageElementMapping__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group__3"


    // $ANTLR start "rule__LanguageElementMapping__Group__3__Impl"
    // InternalPerspectiveDSL.g:1623:1: rule__LanguageElementMapping__Group__3__Impl : ( 'fromCardinality' ) ;
    public final void rule__LanguageElementMapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1627:1: ( ( 'fromCardinality' ) )
            // InternalPerspectiveDSL.g:1628:1: ( 'fromCardinality' )
            {
            // InternalPerspectiveDSL.g:1628:1: ( 'fromCardinality' )
            // InternalPerspectiveDSL.g:1629:2: 'fromCardinality'
            {
             before(grammarAccess.getLanguageElementMappingAccess().getFromCardinalityKeyword_3()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getLanguageElementMappingAccess().getFromCardinalityKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group__3__Impl"


    // $ANTLR start "rule__LanguageElementMapping__Group__4"
    // InternalPerspectiveDSL.g:1638:1: rule__LanguageElementMapping__Group__4 : rule__LanguageElementMapping__Group__4__Impl rule__LanguageElementMapping__Group__5 ;
    public final void rule__LanguageElementMapping__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1642:1: ( rule__LanguageElementMapping__Group__4__Impl rule__LanguageElementMapping__Group__5 )
            // InternalPerspectiveDSL.g:1643:2: rule__LanguageElementMapping__Group__4__Impl rule__LanguageElementMapping__Group__5
            {
            pushFollow(FOLLOW_29);
            rule__LanguageElementMapping__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageElementMapping__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group__4"


    // $ANTLR start "rule__LanguageElementMapping__Group__4__Impl"
    // InternalPerspectiveDSL.g:1650:1: rule__LanguageElementMapping__Group__4__Impl : ( ':' ) ;
    public final void rule__LanguageElementMapping__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1654:1: ( ( ':' ) )
            // InternalPerspectiveDSL.g:1655:1: ( ':' )
            {
            // InternalPerspectiveDSL.g:1655:1: ( ':' )
            // InternalPerspectiveDSL.g:1656:2: ':'
            {
             before(grammarAccess.getLanguageElementMappingAccess().getColonKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getLanguageElementMappingAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group__4__Impl"


    // $ANTLR start "rule__LanguageElementMapping__Group__5"
    // InternalPerspectiveDSL.g:1665:1: rule__LanguageElementMapping__Group__5 : rule__LanguageElementMapping__Group__5__Impl rule__LanguageElementMapping__Group__6 ;
    public final void rule__LanguageElementMapping__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1669:1: ( rule__LanguageElementMapping__Group__5__Impl rule__LanguageElementMapping__Group__6 )
            // InternalPerspectiveDSL.g:1670:2: rule__LanguageElementMapping__Group__5__Impl rule__LanguageElementMapping__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__LanguageElementMapping__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageElementMapping__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group__5"


    // $ANTLR start "rule__LanguageElementMapping__Group__5__Impl"
    // InternalPerspectiveDSL.g:1677:1: rule__LanguageElementMapping__Group__5__Impl : ( ( rule__LanguageElementMapping__FromCardinalityAssignment_5 ) ) ;
    public final void rule__LanguageElementMapping__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1681:1: ( ( ( rule__LanguageElementMapping__FromCardinalityAssignment_5 ) ) )
            // InternalPerspectiveDSL.g:1682:1: ( ( rule__LanguageElementMapping__FromCardinalityAssignment_5 ) )
            {
            // InternalPerspectiveDSL.g:1682:1: ( ( rule__LanguageElementMapping__FromCardinalityAssignment_5 ) )
            // InternalPerspectiveDSL.g:1683:2: ( rule__LanguageElementMapping__FromCardinalityAssignment_5 )
            {
             before(grammarAccess.getLanguageElementMappingAccess().getFromCardinalityAssignment_5()); 
            // InternalPerspectiveDSL.g:1684:2: ( rule__LanguageElementMapping__FromCardinalityAssignment_5 )
            // InternalPerspectiveDSL.g:1684:3: rule__LanguageElementMapping__FromCardinalityAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__LanguageElementMapping__FromCardinalityAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getLanguageElementMappingAccess().getFromCardinalityAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group__5__Impl"


    // $ANTLR start "rule__LanguageElementMapping__Group__6"
    // InternalPerspectiveDSL.g:1692:1: rule__LanguageElementMapping__Group__6 : rule__LanguageElementMapping__Group__6__Impl rule__LanguageElementMapping__Group__7 ;
    public final void rule__LanguageElementMapping__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1696:1: ( rule__LanguageElementMapping__Group__6__Impl rule__LanguageElementMapping__Group__7 )
            // InternalPerspectiveDSL.g:1697:2: rule__LanguageElementMapping__Group__6__Impl rule__LanguageElementMapping__Group__7
            {
            pushFollow(FOLLOW_30);
            rule__LanguageElementMapping__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageElementMapping__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group__6"


    // $ANTLR start "rule__LanguageElementMapping__Group__6__Impl"
    // InternalPerspectiveDSL.g:1704:1: rule__LanguageElementMapping__Group__6__Impl : ( ';' ) ;
    public final void rule__LanguageElementMapping__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1708:1: ( ( ';' ) )
            // InternalPerspectiveDSL.g:1709:1: ( ';' )
            {
            // InternalPerspectiveDSL.g:1709:1: ( ';' )
            // InternalPerspectiveDSL.g:1710:2: ';'
            {
             before(grammarAccess.getLanguageElementMappingAccess().getSemicolonKeyword_6()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getLanguageElementMappingAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group__6__Impl"


    // $ANTLR start "rule__LanguageElementMapping__Group__7"
    // InternalPerspectiveDSL.g:1719:1: rule__LanguageElementMapping__Group__7 : rule__LanguageElementMapping__Group__7__Impl rule__LanguageElementMapping__Group__8 ;
    public final void rule__LanguageElementMapping__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1723:1: ( rule__LanguageElementMapping__Group__7__Impl rule__LanguageElementMapping__Group__8 )
            // InternalPerspectiveDSL.g:1724:2: rule__LanguageElementMapping__Group__7__Impl rule__LanguageElementMapping__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__LanguageElementMapping__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageElementMapping__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group__7"


    // $ANTLR start "rule__LanguageElementMapping__Group__7__Impl"
    // InternalPerspectiveDSL.g:1731:1: rule__LanguageElementMapping__Group__7__Impl : ( 'toCardinality' ) ;
    public final void rule__LanguageElementMapping__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1735:1: ( ( 'toCardinality' ) )
            // InternalPerspectiveDSL.g:1736:1: ( 'toCardinality' )
            {
            // InternalPerspectiveDSL.g:1736:1: ( 'toCardinality' )
            // InternalPerspectiveDSL.g:1737:2: 'toCardinality'
            {
             before(grammarAccess.getLanguageElementMappingAccess().getToCardinalityKeyword_7()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getLanguageElementMappingAccess().getToCardinalityKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group__7__Impl"


    // $ANTLR start "rule__LanguageElementMapping__Group__8"
    // InternalPerspectiveDSL.g:1746:1: rule__LanguageElementMapping__Group__8 : rule__LanguageElementMapping__Group__8__Impl rule__LanguageElementMapping__Group__9 ;
    public final void rule__LanguageElementMapping__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1750:1: ( rule__LanguageElementMapping__Group__8__Impl rule__LanguageElementMapping__Group__9 )
            // InternalPerspectiveDSL.g:1751:2: rule__LanguageElementMapping__Group__8__Impl rule__LanguageElementMapping__Group__9
            {
            pushFollow(FOLLOW_29);
            rule__LanguageElementMapping__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageElementMapping__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group__8"


    // $ANTLR start "rule__LanguageElementMapping__Group__8__Impl"
    // InternalPerspectiveDSL.g:1758:1: rule__LanguageElementMapping__Group__8__Impl : ( ':' ) ;
    public final void rule__LanguageElementMapping__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1762:1: ( ( ':' ) )
            // InternalPerspectiveDSL.g:1763:1: ( ':' )
            {
            // InternalPerspectiveDSL.g:1763:1: ( ':' )
            // InternalPerspectiveDSL.g:1764:2: ':'
            {
             before(grammarAccess.getLanguageElementMappingAccess().getColonKeyword_8()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getLanguageElementMappingAccess().getColonKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group__8__Impl"


    // $ANTLR start "rule__LanguageElementMapping__Group__9"
    // InternalPerspectiveDSL.g:1773:1: rule__LanguageElementMapping__Group__9 : rule__LanguageElementMapping__Group__9__Impl rule__LanguageElementMapping__Group__10 ;
    public final void rule__LanguageElementMapping__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1777:1: ( rule__LanguageElementMapping__Group__9__Impl rule__LanguageElementMapping__Group__10 )
            // InternalPerspectiveDSL.g:1778:2: rule__LanguageElementMapping__Group__9__Impl rule__LanguageElementMapping__Group__10
            {
            pushFollow(FOLLOW_9);
            rule__LanguageElementMapping__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageElementMapping__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group__9"


    // $ANTLR start "rule__LanguageElementMapping__Group__9__Impl"
    // InternalPerspectiveDSL.g:1785:1: rule__LanguageElementMapping__Group__9__Impl : ( ( rule__LanguageElementMapping__ToCardinalityAssignment_9 ) ) ;
    public final void rule__LanguageElementMapping__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1789:1: ( ( ( rule__LanguageElementMapping__ToCardinalityAssignment_9 ) ) )
            // InternalPerspectiveDSL.g:1790:1: ( ( rule__LanguageElementMapping__ToCardinalityAssignment_9 ) )
            {
            // InternalPerspectiveDSL.g:1790:1: ( ( rule__LanguageElementMapping__ToCardinalityAssignment_9 ) )
            // InternalPerspectiveDSL.g:1791:2: ( rule__LanguageElementMapping__ToCardinalityAssignment_9 )
            {
             before(grammarAccess.getLanguageElementMappingAccess().getToCardinalityAssignment_9()); 
            // InternalPerspectiveDSL.g:1792:2: ( rule__LanguageElementMapping__ToCardinalityAssignment_9 )
            // InternalPerspectiveDSL.g:1792:3: rule__LanguageElementMapping__ToCardinalityAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__LanguageElementMapping__ToCardinalityAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getLanguageElementMappingAccess().getToCardinalityAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group__9__Impl"


    // $ANTLR start "rule__LanguageElementMapping__Group__10"
    // InternalPerspectiveDSL.g:1800:1: rule__LanguageElementMapping__Group__10 : rule__LanguageElementMapping__Group__10__Impl rule__LanguageElementMapping__Group__11 ;
    public final void rule__LanguageElementMapping__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1804:1: ( rule__LanguageElementMapping__Group__10__Impl rule__LanguageElementMapping__Group__11 )
            // InternalPerspectiveDSL.g:1805:2: rule__LanguageElementMapping__Group__10__Impl rule__LanguageElementMapping__Group__11
            {
            pushFollow(FOLLOW_31);
            rule__LanguageElementMapping__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageElementMapping__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group__10"


    // $ANTLR start "rule__LanguageElementMapping__Group__10__Impl"
    // InternalPerspectiveDSL.g:1812:1: rule__LanguageElementMapping__Group__10__Impl : ( ';' ) ;
    public final void rule__LanguageElementMapping__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1816:1: ( ( ';' ) )
            // InternalPerspectiveDSL.g:1817:1: ( ';' )
            {
            // InternalPerspectiveDSL.g:1817:1: ( ';' )
            // InternalPerspectiveDSL.g:1818:2: ';'
            {
             before(grammarAccess.getLanguageElementMappingAccess().getSemicolonKeyword_10()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getLanguageElementMappingAccess().getSemicolonKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group__10__Impl"


    // $ANTLR start "rule__LanguageElementMapping__Group__11"
    // InternalPerspectiveDSL.g:1827:1: rule__LanguageElementMapping__Group__11 : rule__LanguageElementMapping__Group__11__Impl rule__LanguageElementMapping__Group__12 ;
    public final void rule__LanguageElementMapping__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1831:1: ( rule__LanguageElementMapping__Group__11__Impl rule__LanguageElementMapping__Group__12 )
            // InternalPerspectiveDSL.g:1832:2: rule__LanguageElementMapping__Group__11__Impl rule__LanguageElementMapping__Group__12
            {
            pushFollow(FOLLOW_11);
            rule__LanguageElementMapping__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageElementMapping__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group__11"


    // $ANTLR start "rule__LanguageElementMapping__Group__11__Impl"
    // InternalPerspectiveDSL.g:1839:1: rule__LanguageElementMapping__Group__11__Impl : ( 'fromElement' ) ;
    public final void rule__LanguageElementMapping__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1843:1: ( ( 'fromElement' ) )
            // InternalPerspectiveDSL.g:1844:1: ( 'fromElement' )
            {
            // InternalPerspectiveDSL.g:1844:1: ( 'fromElement' )
            // InternalPerspectiveDSL.g:1845:2: 'fromElement'
            {
             before(grammarAccess.getLanguageElementMappingAccess().getFromElementKeyword_11()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getLanguageElementMappingAccess().getFromElementKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group__11__Impl"


    // $ANTLR start "rule__LanguageElementMapping__Group__12"
    // InternalPerspectiveDSL.g:1854:1: rule__LanguageElementMapping__Group__12 : rule__LanguageElementMapping__Group__12__Impl rule__LanguageElementMapping__Group__13 ;
    public final void rule__LanguageElementMapping__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1858:1: ( rule__LanguageElementMapping__Group__12__Impl rule__LanguageElementMapping__Group__13 )
            // InternalPerspectiveDSL.g:1859:2: rule__LanguageElementMapping__Group__12__Impl rule__LanguageElementMapping__Group__13
            {
            pushFollow(FOLLOW_4);
            rule__LanguageElementMapping__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageElementMapping__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group__12"


    // $ANTLR start "rule__LanguageElementMapping__Group__12__Impl"
    // InternalPerspectiveDSL.g:1866:1: rule__LanguageElementMapping__Group__12__Impl : ( ':' ) ;
    public final void rule__LanguageElementMapping__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1870:1: ( ( ':' ) )
            // InternalPerspectiveDSL.g:1871:1: ( ':' )
            {
            // InternalPerspectiveDSL.g:1871:1: ( ':' )
            // InternalPerspectiveDSL.g:1872:2: ':'
            {
             before(grammarAccess.getLanguageElementMappingAccess().getColonKeyword_12()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getLanguageElementMappingAccess().getColonKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group__12__Impl"


    // $ANTLR start "rule__LanguageElementMapping__Group__13"
    // InternalPerspectiveDSL.g:1881:1: rule__LanguageElementMapping__Group__13 : rule__LanguageElementMapping__Group__13__Impl rule__LanguageElementMapping__Group__14 ;
    public final void rule__LanguageElementMapping__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1885:1: ( rule__LanguageElementMapping__Group__13__Impl rule__LanguageElementMapping__Group__14 )
            // InternalPerspectiveDSL.g:1886:2: rule__LanguageElementMapping__Group__13__Impl rule__LanguageElementMapping__Group__14
            {
            pushFollow(FOLLOW_32);
            rule__LanguageElementMapping__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageElementMapping__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group__13"


    // $ANTLR start "rule__LanguageElementMapping__Group__13__Impl"
    // InternalPerspectiveDSL.g:1893:1: rule__LanguageElementMapping__Group__13__Impl : ( ( rule__LanguageElementMapping__FromElementAssignment_13 ) ) ;
    public final void rule__LanguageElementMapping__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1897:1: ( ( ( rule__LanguageElementMapping__FromElementAssignment_13 ) ) )
            // InternalPerspectiveDSL.g:1898:1: ( ( rule__LanguageElementMapping__FromElementAssignment_13 ) )
            {
            // InternalPerspectiveDSL.g:1898:1: ( ( rule__LanguageElementMapping__FromElementAssignment_13 ) )
            // InternalPerspectiveDSL.g:1899:2: ( rule__LanguageElementMapping__FromElementAssignment_13 )
            {
             before(grammarAccess.getLanguageElementMappingAccess().getFromElementAssignment_13()); 
            // InternalPerspectiveDSL.g:1900:2: ( rule__LanguageElementMapping__FromElementAssignment_13 )
            // InternalPerspectiveDSL.g:1900:3: rule__LanguageElementMapping__FromElementAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__LanguageElementMapping__FromElementAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getLanguageElementMappingAccess().getFromElementAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group__13__Impl"


    // $ANTLR start "rule__LanguageElementMapping__Group__14"
    // InternalPerspectiveDSL.g:1908:1: rule__LanguageElementMapping__Group__14 : rule__LanguageElementMapping__Group__14__Impl rule__LanguageElementMapping__Group__15 ;
    public final void rule__LanguageElementMapping__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1912:1: ( rule__LanguageElementMapping__Group__14__Impl rule__LanguageElementMapping__Group__15 )
            // InternalPerspectiveDSL.g:1913:2: rule__LanguageElementMapping__Group__14__Impl rule__LanguageElementMapping__Group__15
            {
            pushFollow(FOLLOW_4);
            rule__LanguageElementMapping__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageElementMapping__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group__14"


    // $ANTLR start "rule__LanguageElementMapping__Group__14__Impl"
    // InternalPerspectiveDSL.g:1920:1: rule__LanguageElementMapping__Group__14__Impl : ( 'from' ) ;
    public final void rule__LanguageElementMapping__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1924:1: ( ( 'from' ) )
            // InternalPerspectiveDSL.g:1925:1: ( 'from' )
            {
            // InternalPerspectiveDSL.g:1925:1: ( 'from' )
            // InternalPerspectiveDSL.g:1926:2: 'from'
            {
             before(grammarAccess.getLanguageElementMappingAccess().getFromKeyword_14()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getLanguageElementMappingAccess().getFromKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group__14__Impl"


    // $ANTLR start "rule__LanguageElementMapping__Group__15"
    // InternalPerspectiveDSL.g:1935:1: rule__LanguageElementMapping__Group__15 : rule__LanguageElementMapping__Group__15__Impl rule__LanguageElementMapping__Group__16 ;
    public final void rule__LanguageElementMapping__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1939:1: ( rule__LanguageElementMapping__Group__15__Impl rule__LanguageElementMapping__Group__16 )
            // InternalPerspectiveDSL.g:1940:2: rule__LanguageElementMapping__Group__15__Impl rule__LanguageElementMapping__Group__16
            {
            pushFollow(FOLLOW_33);
            rule__LanguageElementMapping__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageElementMapping__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group__15"


    // $ANTLR start "rule__LanguageElementMapping__Group__15__Impl"
    // InternalPerspectiveDSL.g:1947:1: rule__LanguageElementMapping__Group__15__Impl : ( ( rule__LanguageElementMapping__FromRoleNameAssignment_15 ) ) ;
    public final void rule__LanguageElementMapping__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1951:1: ( ( ( rule__LanguageElementMapping__FromRoleNameAssignment_15 ) ) )
            // InternalPerspectiveDSL.g:1952:1: ( ( rule__LanguageElementMapping__FromRoleNameAssignment_15 ) )
            {
            // InternalPerspectiveDSL.g:1952:1: ( ( rule__LanguageElementMapping__FromRoleNameAssignment_15 ) )
            // InternalPerspectiveDSL.g:1953:2: ( rule__LanguageElementMapping__FromRoleNameAssignment_15 )
            {
             before(grammarAccess.getLanguageElementMappingAccess().getFromRoleNameAssignment_15()); 
            // InternalPerspectiveDSL.g:1954:2: ( rule__LanguageElementMapping__FromRoleNameAssignment_15 )
            // InternalPerspectiveDSL.g:1954:3: rule__LanguageElementMapping__FromRoleNameAssignment_15
            {
            pushFollow(FOLLOW_2);
            rule__LanguageElementMapping__FromRoleNameAssignment_15();

            state._fsp--;


            }

             after(grammarAccess.getLanguageElementMappingAccess().getFromRoleNameAssignment_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group__15__Impl"


    // $ANTLR start "rule__LanguageElementMapping__Group__16"
    // InternalPerspectiveDSL.g:1962:1: rule__LanguageElementMapping__Group__16 : rule__LanguageElementMapping__Group__16__Impl rule__LanguageElementMapping__Group__17 ;
    public final void rule__LanguageElementMapping__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1966:1: ( rule__LanguageElementMapping__Group__16__Impl rule__LanguageElementMapping__Group__17 )
            // InternalPerspectiveDSL.g:1967:2: rule__LanguageElementMapping__Group__16__Impl rule__LanguageElementMapping__Group__17
            {
            pushFollow(FOLLOW_8);
            rule__LanguageElementMapping__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageElementMapping__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group__16"


    // $ANTLR start "rule__LanguageElementMapping__Group__16__Impl"
    // InternalPerspectiveDSL.g:1974:1: rule__LanguageElementMapping__Group__16__Impl : ( 'fromGetElement' ) ;
    public final void rule__LanguageElementMapping__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1978:1: ( ( 'fromGetElement' ) )
            // InternalPerspectiveDSL.g:1979:1: ( 'fromGetElement' )
            {
            // InternalPerspectiveDSL.g:1979:1: ( 'fromGetElement' )
            // InternalPerspectiveDSL.g:1980:2: 'fromGetElement'
            {
             before(grammarAccess.getLanguageElementMappingAccess().getFromGetElementKeyword_16()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getLanguageElementMappingAccess().getFromGetElementKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group__16__Impl"


    // $ANTLR start "rule__LanguageElementMapping__Group__17"
    // InternalPerspectiveDSL.g:1989:1: rule__LanguageElementMapping__Group__17 : rule__LanguageElementMapping__Group__17__Impl rule__LanguageElementMapping__Group__18 ;
    public final void rule__LanguageElementMapping__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:1993:1: ( rule__LanguageElementMapping__Group__17__Impl rule__LanguageElementMapping__Group__18 )
            // InternalPerspectiveDSL.g:1994:2: rule__LanguageElementMapping__Group__17__Impl rule__LanguageElementMapping__Group__18
            {
            pushFollow(FOLLOW_9);
            rule__LanguageElementMapping__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageElementMapping__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group__17"


    // $ANTLR start "rule__LanguageElementMapping__Group__17__Impl"
    // InternalPerspectiveDSL.g:2001:1: rule__LanguageElementMapping__Group__17__Impl : ( ( rule__LanguageElementMapping__FromGetElementAssignment_17 ) ) ;
    public final void rule__LanguageElementMapping__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2005:1: ( ( ( rule__LanguageElementMapping__FromGetElementAssignment_17 ) ) )
            // InternalPerspectiveDSL.g:2006:1: ( ( rule__LanguageElementMapping__FromGetElementAssignment_17 ) )
            {
            // InternalPerspectiveDSL.g:2006:1: ( ( rule__LanguageElementMapping__FromGetElementAssignment_17 ) )
            // InternalPerspectiveDSL.g:2007:2: ( rule__LanguageElementMapping__FromGetElementAssignment_17 )
            {
             before(grammarAccess.getLanguageElementMappingAccess().getFromGetElementAssignment_17()); 
            // InternalPerspectiveDSL.g:2008:2: ( rule__LanguageElementMapping__FromGetElementAssignment_17 )
            // InternalPerspectiveDSL.g:2008:3: rule__LanguageElementMapping__FromGetElementAssignment_17
            {
            pushFollow(FOLLOW_2);
            rule__LanguageElementMapping__FromGetElementAssignment_17();

            state._fsp--;


            }

             after(grammarAccess.getLanguageElementMappingAccess().getFromGetElementAssignment_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group__17__Impl"


    // $ANTLR start "rule__LanguageElementMapping__Group__18"
    // InternalPerspectiveDSL.g:2016:1: rule__LanguageElementMapping__Group__18 : rule__LanguageElementMapping__Group__18__Impl rule__LanguageElementMapping__Group__19 ;
    public final void rule__LanguageElementMapping__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2020:1: ( rule__LanguageElementMapping__Group__18__Impl rule__LanguageElementMapping__Group__19 )
            // InternalPerspectiveDSL.g:2021:2: rule__LanguageElementMapping__Group__18__Impl rule__LanguageElementMapping__Group__19
            {
            pushFollow(FOLLOW_34);
            rule__LanguageElementMapping__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageElementMapping__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group__18"


    // $ANTLR start "rule__LanguageElementMapping__Group__18__Impl"
    // InternalPerspectiveDSL.g:2028:1: rule__LanguageElementMapping__Group__18__Impl : ( ';' ) ;
    public final void rule__LanguageElementMapping__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2032:1: ( ( ';' ) )
            // InternalPerspectiveDSL.g:2033:1: ( ';' )
            {
            // InternalPerspectiveDSL.g:2033:1: ( ';' )
            // InternalPerspectiveDSL.g:2034:2: ';'
            {
             before(grammarAccess.getLanguageElementMappingAccess().getSemicolonKeyword_18()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getLanguageElementMappingAccess().getSemicolonKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group__18__Impl"


    // $ANTLR start "rule__LanguageElementMapping__Group__19"
    // InternalPerspectiveDSL.g:2043:1: rule__LanguageElementMapping__Group__19 : rule__LanguageElementMapping__Group__19__Impl rule__LanguageElementMapping__Group__20 ;
    public final void rule__LanguageElementMapping__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2047:1: ( rule__LanguageElementMapping__Group__19__Impl rule__LanguageElementMapping__Group__20 )
            // InternalPerspectiveDSL.g:2048:2: rule__LanguageElementMapping__Group__19__Impl rule__LanguageElementMapping__Group__20
            {
            pushFollow(FOLLOW_11);
            rule__LanguageElementMapping__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageElementMapping__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group__19"


    // $ANTLR start "rule__LanguageElementMapping__Group__19__Impl"
    // InternalPerspectiveDSL.g:2055:1: rule__LanguageElementMapping__Group__19__Impl : ( 'toELement' ) ;
    public final void rule__LanguageElementMapping__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2059:1: ( ( 'toELement' ) )
            // InternalPerspectiveDSL.g:2060:1: ( 'toELement' )
            {
            // InternalPerspectiveDSL.g:2060:1: ( 'toELement' )
            // InternalPerspectiveDSL.g:2061:2: 'toELement'
            {
             before(grammarAccess.getLanguageElementMappingAccess().getToELementKeyword_19()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getLanguageElementMappingAccess().getToELementKeyword_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group__19__Impl"


    // $ANTLR start "rule__LanguageElementMapping__Group__20"
    // InternalPerspectiveDSL.g:2070:1: rule__LanguageElementMapping__Group__20 : rule__LanguageElementMapping__Group__20__Impl rule__LanguageElementMapping__Group__21 ;
    public final void rule__LanguageElementMapping__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2074:1: ( rule__LanguageElementMapping__Group__20__Impl rule__LanguageElementMapping__Group__21 )
            // InternalPerspectiveDSL.g:2075:2: rule__LanguageElementMapping__Group__20__Impl rule__LanguageElementMapping__Group__21
            {
            pushFollow(FOLLOW_4);
            rule__LanguageElementMapping__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageElementMapping__Group__21();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group__20"


    // $ANTLR start "rule__LanguageElementMapping__Group__20__Impl"
    // InternalPerspectiveDSL.g:2082:1: rule__LanguageElementMapping__Group__20__Impl : ( ':' ) ;
    public final void rule__LanguageElementMapping__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2086:1: ( ( ':' ) )
            // InternalPerspectiveDSL.g:2087:1: ( ':' )
            {
            // InternalPerspectiveDSL.g:2087:1: ( ':' )
            // InternalPerspectiveDSL.g:2088:2: ':'
            {
             before(grammarAccess.getLanguageElementMappingAccess().getColonKeyword_20()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getLanguageElementMappingAccess().getColonKeyword_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group__20__Impl"


    // $ANTLR start "rule__LanguageElementMapping__Group__21"
    // InternalPerspectiveDSL.g:2097:1: rule__LanguageElementMapping__Group__21 : rule__LanguageElementMapping__Group__21__Impl rule__LanguageElementMapping__Group__22 ;
    public final void rule__LanguageElementMapping__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2101:1: ( rule__LanguageElementMapping__Group__21__Impl rule__LanguageElementMapping__Group__22 )
            // InternalPerspectiveDSL.g:2102:2: rule__LanguageElementMapping__Group__21__Impl rule__LanguageElementMapping__Group__22
            {
            pushFollow(FOLLOW_32);
            rule__LanguageElementMapping__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageElementMapping__Group__22();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group__21"


    // $ANTLR start "rule__LanguageElementMapping__Group__21__Impl"
    // InternalPerspectiveDSL.g:2109:1: rule__LanguageElementMapping__Group__21__Impl : ( ( rule__LanguageElementMapping__ToElementAssignment_21 ) ) ;
    public final void rule__LanguageElementMapping__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2113:1: ( ( ( rule__LanguageElementMapping__ToElementAssignment_21 ) ) )
            // InternalPerspectiveDSL.g:2114:1: ( ( rule__LanguageElementMapping__ToElementAssignment_21 ) )
            {
            // InternalPerspectiveDSL.g:2114:1: ( ( rule__LanguageElementMapping__ToElementAssignment_21 ) )
            // InternalPerspectiveDSL.g:2115:2: ( rule__LanguageElementMapping__ToElementAssignment_21 )
            {
             before(grammarAccess.getLanguageElementMappingAccess().getToElementAssignment_21()); 
            // InternalPerspectiveDSL.g:2116:2: ( rule__LanguageElementMapping__ToElementAssignment_21 )
            // InternalPerspectiveDSL.g:2116:3: rule__LanguageElementMapping__ToElementAssignment_21
            {
            pushFollow(FOLLOW_2);
            rule__LanguageElementMapping__ToElementAssignment_21();

            state._fsp--;


            }

             after(grammarAccess.getLanguageElementMappingAccess().getToElementAssignment_21()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group__21__Impl"


    // $ANTLR start "rule__LanguageElementMapping__Group__22"
    // InternalPerspectiveDSL.g:2124:1: rule__LanguageElementMapping__Group__22 : rule__LanguageElementMapping__Group__22__Impl rule__LanguageElementMapping__Group__23 ;
    public final void rule__LanguageElementMapping__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2128:1: ( rule__LanguageElementMapping__Group__22__Impl rule__LanguageElementMapping__Group__23 )
            // InternalPerspectiveDSL.g:2129:2: rule__LanguageElementMapping__Group__22__Impl rule__LanguageElementMapping__Group__23
            {
            pushFollow(FOLLOW_4);
            rule__LanguageElementMapping__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageElementMapping__Group__23();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group__22"


    // $ANTLR start "rule__LanguageElementMapping__Group__22__Impl"
    // InternalPerspectiveDSL.g:2136:1: rule__LanguageElementMapping__Group__22__Impl : ( 'from' ) ;
    public final void rule__LanguageElementMapping__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2140:1: ( ( 'from' ) )
            // InternalPerspectiveDSL.g:2141:1: ( 'from' )
            {
            // InternalPerspectiveDSL.g:2141:1: ( 'from' )
            // InternalPerspectiveDSL.g:2142:2: 'from'
            {
             before(grammarAccess.getLanguageElementMappingAccess().getFromKeyword_22()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getLanguageElementMappingAccess().getFromKeyword_22()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group__22__Impl"


    // $ANTLR start "rule__LanguageElementMapping__Group__23"
    // InternalPerspectiveDSL.g:2151:1: rule__LanguageElementMapping__Group__23 : rule__LanguageElementMapping__Group__23__Impl rule__LanguageElementMapping__Group__24 ;
    public final void rule__LanguageElementMapping__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2155:1: ( rule__LanguageElementMapping__Group__23__Impl rule__LanguageElementMapping__Group__24 )
            // InternalPerspectiveDSL.g:2156:2: rule__LanguageElementMapping__Group__23__Impl rule__LanguageElementMapping__Group__24
            {
            pushFollow(FOLLOW_35);
            rule__LanguageElementMapping__Group__23__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageElementMapping__Group__24();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group__23"


    // $ANTLR start "rule__LanguageElementMapping__Group__23__Impl"
    // InternalPerspectiveDSL.g:2163:1: rule__LanguageElementMapping__Group__23__Impl : ( ( rule__LanguageElementMapping__ToRoleNameAssignment_23 ) ) ;
    public final void rule__LanguageElementMapping__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2167:1: ( ( ( rule__LanguageElementMapping__ToRoleNameAssignment_23 ) ) )
            // InternalPerspectiveDSL.g:2168:1: ( ( rule__LanguageElementMapping__ToRoleNameAssignment_23 ) )
            {
            // InternalPerspectiveDSL.g:2168:1: ( ( rule__LanguageElementMapping__ToRoleNameAssignment_23 ) )
            // InternalPerspectiveDSL.g:2169:2: ( rule__LanguageElementMapping__ToRoleNameAssignment_23 )
            {
             before(grammarAccess.getLanguageElementMappingAccess().getToRoleNameAssignment_23()); 
            // InternalPerspectiveDSL.g:2170:2: ( rule__LanguageElementMapping__ToRoleNameAssignment_23 )
            // InternalPerspectiveDSL.g:2170:3: rule__LanguageElementMapping__ToRoleNameAssignment_23
            {
            pushFollow(FOLLOW_2);
            rule__LanguageElementMapping__ToRoleNameAssignment_23();

            state._fsp--;


            }

             after(grammarAccess.getLanguageElementMappingAccess().getToRoleNameAssignment_23()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group__23__Impl"


    // $ANTLR start "rule__LanguageElementMapping__Group__24"
    // InternalPerspectiveDSL.g:2178:1: rule__LanguageElementMapping__Group__24 : rule__LanguageElementMapping__Group__24__Impl rule__LanguageElementMapping__Group__25 ;
    public final void rule__LanguageElementMapping__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2182:1: ( rule__LanguageElementMapping__Group__24__Impl rule__LanguageElementMapping__Group__25 )
            // InternalPerspectiveDSL.g:2183:2: rule__LanguageElementMapping__Group__24__Impl rule__LanguageElementMapping__Group__25
            {
            pushFollow(FOLLOW_8);
            rule__LanguageElementMapping__Group__24__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageElementMapping__Group__25();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group__24"


    // $ANTLR start "rule__LanguageElementMapping__Group__24__Impl"
    // InternalPerspectiveDSL.g:2190:1: rule__LanguageElementMapping__Group__24__Impl : ( 'toGetElement' ) ;
    public final void rule__LanguageElementMapping__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2194:1: ( ( 'toGetElement' ) )
            // InternalPerspectiveDSL.g:2195:1: ( 'toGetElement' )
            {
            // InternalPerspectiveDSL.g:2195:1: ( 'toGetElement' )
            // InternalPerspectiveDSL.g:2196:2: 'toGetElement'
            {
             before(grammarAccess.getLanguageElementMappingAccess().getToGetElementKeyword_24()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getLanguageElementMappingAccess().getToGetElementKeyword_24()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group__24__Impl"


    // $ANTLR start "rule__LanguageElementMapping__Group__25"
    // InternalPerspectiveDSL.g:2205:1: rule__LanguageElementMapping__Group__25 : rule__LanguageElementMapping__Group__25__Impl rule__LanguageElementMapping__Group__26 ;
    public final void rule__LanguageElementMapping__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2209:1: ( rule__LanguageElementMapping__Group__25__Impl rule__LanguageElementMapping__Group__26 )
            // InternalPerspectiveDSL.g:2210:2: rule__LanguageElementMapping__Group__25__Impl rule__LanguageElementMapping__Group__26
            {
            pushFollow(FOLLOW_9);
            rule__LanguageElementMapping__Group__25__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageElementMapping__Group__26();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group__25"


    // $ANTLR start "rule__LanguageElementMapping__Group__25__Impl"
    // InternalPerspectiveDSL.g:2217:1: rule__LanguageElementMapping__Group__25__Impl : ( ( rule__LanguageElementMapping__ToGetElementAssignment_25 ) ) ;
    public final void rule__LanguageElementMapping__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2221:1: ( ( ( rule__LanguageElementMapping__ToGetElementAssignment_25 ) ) )
            // InternalPerspectiveDSL.g:2222:1: ( ( rule__LanguageElementMapping__ToGetElementAssignment_25 ) )
            {
            // InternalPerspectiveDSL.g:2222:1: ( ( rule__LanguageElementMapping__ToGetElementAssignment_25 ) )
            // InternalPerspectiveDSL.g:2223:2: ( rule__LanguageElementMapping__ToGetElementAssignment_25 )
            {
             before(grammarAccess.getLanguageElementMappingAccess().getToGetElementAssignment_25()); 
            // InternalPerspectiveDSL.g:2224:2: ( rule__LanguageElementMapping__ToGetElementAssignment_25 )
            // InternalPerspectiveDSL.g:2224:3: rule__LanguageElementMapping__ToGetElementAssignment_25
            {
            pushFollow(FOLLOW_2);
            rule__LanguageElementMapping__ToGetElementAssignment_25();

            state._fsp--;


            }

             after(grammarAccess.getLanguageElementMappingAccess().getToGetElementAssignment_25()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group__25__Impl"


    // $ANTLR start "rule__LanguageElementMapping__Group__26"
    // InternalPerspectiveDSL.g:2232:1: rule__LanguageElementMapping__Group__26 : rule__LanguageElementMapping__Group__26__Impl rule__LanguageElementMapping__Group__27 ;
    public final void rule__LanguageElementMapping__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2236:1: ( rule__LanguageElementMapping__Group__26__Impl rule__LanguageElementMapping__Group__27 )
            // InternalPerspectiveDSL.g:2237:2: rule__LanguageElementMapping__Group__26__Impl rule__LanguageElementMapping__Group__27
            {
            pushFollow(FOLLOW_36);
            rule__LanguageElementMapping__Group__26__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageElementMapping__Group__27();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group__26"


    // $ANTLR start "rule__LanguageElementMapping__Group__26__Impl"
    // InternalPerspectiveDSL.g:2244:1: rule__LanguageElementMapping__Group__26__Impl : ( ';' ) ;
    public final void rule__LanguageElementMapping__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2248:1: ( ( ';' ) )
            // InternalPerspectiveDSL.g:2249:1: ( ';' )
            {
            // InternalPerspectiveDSL.g:2249:1: ( ';' )
            // InternalPerspectiveDSL.g:2250:2: ';'
            {
             before(grammarAccess.getLanguageElementMappingAccess().getSemicolonKeyword_26()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getLanguageElementMappingAccess().getSemicolonKeyword_26()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group__26__Impl"


    // $ANTLR start "rule__LanguageElementMapping__Group__27"
    // InternalPerspectiveDSL.g:2259:1: rule__LanguageElementMapping__Group__27 : rule__LanguageElementMapping__Group__27__Impl rule__LanguageElementMapping__Group__28 ;
    public final void rule__LanguageElementMapping__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2263:1: ( rule__LanguageElementMapping__Group__27__Impl rule__LanguageElementMapping__Group__28 )
            // InternalPerspectiveDSL.g:2264:2: rule__LanguageElementMapping__Group__27__Impl rule__LanguageElementMapping__Group__28
            {
            pushFollow(FOLLOW_36);
            rule__LanguageElementMapping__Group__27__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageElementMapping__Group__28();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group__27"


    // $ANTLR start "rule__LanguageElementMapping__Group__27__Impl"
    // InternalPerspectiveDSL.g:2271:1: rule__LanguageElementMapping__Group__27__Impl : ( ( rule__LanguageElementMapping__Group_27__0 )? ) ;
    public final void rule__LanguageElementMapping__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2275:1: ( ( ( rule__LanguageElementMapping__Group_27__0 )? ) )
            // InternalPerspectiveDSL.g:2276:1: ( ( rule__LanguageElementMapping__Group_27__0 )? )
            {
            // InternalPerspectiveDSL.g:2276:1: ( ( rule__LanguageElementMapping__Group_27__0 )? )
            // InternalPerspectiveDSL.g:2277:2: ( rule__LanguageElementMapping__Group_27__0 )?
            {
             before(grammarAccess.getLanguageElementMappingAccess().getGroup_27()); 
            // InternalPerspectiveDSL.g:2278:2: ( rule__LanguageElementMapping__Group_27__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==44) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPerspectiveDSL.g:2278:3: rule__LanguageElementMapping__Group_27__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LanguageElementMapping__Group_27__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLanguageElementMappingAccess().getGroup_27()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group__27__Impl"


    // $ANTLR start "rule__LanguageElementMapping__Group__28"
    // InternalPerspectiveDSL.g:2286:1: rule__LanguageElementMapping__Group__28 : rule__LanguageElementMapping__Group__28__Impl rule__LanguageElementMapping__Group__29 ;
    public final void rule__LanguageElementMapping__Group__28() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2290:1: ( rule__LanguageElementMapping__Group__28__Impl rule__LanguageElementMapping__Group__29 )
            // InternalPerspectiveDSL.g:2291:2: rule__LanguageElementMapping__Group__28__Impl rule__LanguageElementMapping__Group__29
            {
            pushFollow(FOLLOW_36);
            rule__LanguageElementMapping__Group__28__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageElementMapping__Group__29();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group__28"


    // $ANTLR start "rule__LanguageElementMapping__Group__28__Impl"
    // InternalPerspectiveDSL.g:2298:1: rule__LanguageElementMapping__Group__28__Impl : ( ( rule__LanguageElementMapping__Group_28__0 )? ) ;
    public final void rule__LanguageElementMapping__Group__28__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2302:1: ( ( ( rule__LanguageElementMapping__Group_28__0 )? ) )
            // InternalPerspectiveDSL.g:2303:1: ( ( rule__LanguageElementMapping__Group_28__0 )? )
            {
            // InternalPerspectiveDSL.g:2303:1: ( ( rule__LanguageElementMapping__Group_28__0 )? )
            // InternalPerspectiveDSL.g:2304:2: ( rule__LanguageElementMapping__Group_28__0 )?
            {
             before(grammarAccess.getLanguageElementMappingAccess().getGroup_28()); 
            // InternalPerspectiveDSL.g:2305:2: ( rule__LanguageElementMapping__Group_28__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==45) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalPerspectiveDSL.g:2305:3: rule__LanguageElementMapping__Group_28__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LanguageElementMapping__Group_28__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLanguageElementMappingAccess().getGroup_28()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group__28__Impl"


    // $ANTLR start "rule__LanguageElementMapping__Group__29"
    // InternalPerspectiveDSL.g:2313:1: rule__LanguageElementMapping__Group__29 : rule__LanguageElementMapping__Group__29__Impl ;
    public final void rule__LanguageElementMapping__Group__29() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2317:1: ( rule__LanguageElementMapping__Group__29__Impl )
            // InternalPerspectiveDSL.g:2318:2: rule__LanguageElementMapping__Group__29__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LanguageElementMapping__Group__29__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group__29"


    // $ANTLR start "rule__LanguageElementMapping__Group__29__Impl"
    // InternalPerspectiveDSL.g:2324:1: rule__LanguageElementMapping__Group__29__Impl : ( '}' ) ;
    public final void rule__LanguageElementMapping__Group__29__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2328:1: ( ( '}' ) )
            // InternalPerspectiveDSL.g:2329:1: ( '}' )
            {
            // InternalPerspectiveDSL.g:2329:1: ( '}' )
            // InternalPerspectiveDSL.g:2330:2: '}'
            {
             before(grammarAccess.getLanguageElementMappingAccess().getRightCurlyBracketKeyword_29()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getLanguageElementMappingAccess().getRightCurlyBracketKeyword_29()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group__29__Impl"


    // $ANTLR start "rule__LanguageElementMapping__Group_27__0"
    // InternalPerspectiveDSL.g:2340:1: rule__LanguageElementMapping__Group_27__0 : rule__LanguageElementMapping__Group_27__0__Impl rule__LanguageElementMapping__Group_27__1 ;
    public final void rule__LanguageElementMapping__Group_27__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2344:1: ( rule__LanguageElementMapping__Group_27__0__Impl rule__LanguageElementMapping__Group_27__1 )
            // InternalPerspectiveDSL.g:2345:2: rule__LanguageElementMapping__Group_27__0__Impl rule__LanguageElementMapping__Group_27__1
            {
            pushFollow(FOLLOW_17);
            rule__LanguageElementMapping__Group_27__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageElementMapping__Group_27__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group_27__0"


    // $ANTLR start "rule__LanguageElementMapping__Group_27__0__Impl"
    // InternalPerspectiveDSL.g:2352:1: rule__LanguageElementMapping__Group_27__0__Impl : ( 'nested' ) ;
    public final void rule__LanguageElementMapping__Group_27__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2356:1: ( ( 'nested' ) )
            // InternalPerspectiveDSL.g:2357:1: ( 'nested' )
            {
            // InternalPerspectiveDSL.g:2357:1: ( 'nested' )
            // InternalPerspectiveDSL.g:2358:2: 'nested'
            {
             before(grammarAccess.getLanguageElementMappingAccess().getNestedKeyword_27_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getLanguageElementMappingAccess().getNestedKeyword_27_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group_27__0__Impl"


    // $ANTLR start "rule__LanguageElementMapping__Group_27__1"
    // InternalPerspectiveDSL.g:2367:1: rule__LanguageElementMapping__Group_27__1 : rule__LanguageElementMapping__Group_27__1__Impl rule__LanguageElementMapping__Group_27__2 ;
    public final void rule__LanguageElementMapping__Group_27__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2371:1: ( rule__LanguageElementMapping__Group_27__1__Impl rule__LanguageElementMapping__Group_27__2 )
            // InternalPerspectiveDSL.g:2372:2: rule__LanguageElementMapping__Group_27__1__Impl rule__LanguageElementMapping__Group_27__2
            {
            pushFollow(FOLLOW_11);
            rule__LanguageElementMapping__Group_27__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageElementMapping__Group_27__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group_27__1"


    // $ANTLR start "rule__LanguageElementMapping__Group_27__1__Impl"
    // InternalPerspectiveDSL.g:2379:1: rule__LanguageElementMapping__Group_27__1__Impl : ( 'mappings' ) ;
    public final void rule__LanguageElementMapping__Group_27__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2383:1: ( ( 'mappings' ) )
            // InternalPerspectiveDSL.g:2384:1: ( 'mappings' )
            {
            // InternalPerspectiveDSL.g:2384:1: ( 'mappings' )
            // InternalPerspectiveDSL.g:2385:2: 'mappings'
            {
             before(grammarAccess.getLanguageElementMappingAccess().getMappingsKeyword_27_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getLanguageElementMappingAccess().getMappingsKeyword_27_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group_27__1__Impl"


    // $ANTLR start "rule__LanguageElementMapping__Group_27__2"
    // InternalPerspectiveDSL.g:2394:1: rule__LanguageElementMapping__Group_27__2 : rule__LanguageElementMapping__Group_27__2__Impl rule__LanguageElementMapping__Group_27__3 ;
    public final void rule__LanguageElementMapping__Group_27__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2398:1: ( rule__LanguageElementMapping__Group_27__2__Impl rule__LanguageElementMapping__Group_27__3 )
            // InternalPerspectiveDSL.g:2399:2: rule__LanguageElementMapping__Group_27__2__Impl rule__LanguageElementMapping__Group_27__3
            {
            pushFollow(FOLLOW_37);
            rule__LanguageElementMapping__Group_27__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageElementMapping__Group_27__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group_27__2"


    // $ANTLR start "rule__LanguageElementMapping__Group_27__2__Impl"
    // InternalPerspectiveDSL.g:2406:1: rule__LanguageElementMapping__Group_27__2__Impl : ( ':' ) ;
    public final void rule__LanguageElementMapping__Group_27__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2410:1: ( ( ':' ) )
            // InternalPerspectiveDSL.g:2411:1: ( ':' )
            {
            // InternalPerspectiveDSL.g:2411:1: ( ':' )
            // InternalPerspectiveDSL.g:2412:2: ':'
            {
             before(grammarAccess.getLanguageElementMappingAccess().getColonKeyword_27_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getLanguageElementMappingAccess().getColonKeyword_27_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group_27__2__Impl"


    // $ANTLR start "rule__LanguageElementMapping__Group_27__3"
    // InternalPerspectiveDSL.g:2421:1: rule__LanguageElementMapping__Group_27__3 : rule__LanguageElementMapping__Group_27__3__Impl rule__LanguageElementMapping__Group_27__4 ;
    public final void rule__LanguageElementMapping__Group_27__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2425:1: ( rule__LanguageElementMapping__Group_27__3__Impl rule__LanguageElementMapping__Group_27__4 )
            // InternalPerspectiveDSL.g:2426:2: rule__LanguageElementMapping__Group_27__3__Impl rule__LanguageElementMapping__Group_27__4
            {
            pushFollow(FOLLOW_37);
            rule__LanguageElementMapping__Group_27__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageElementMapping__Group_27__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group_27__3"


    // $ANTLR start "rule__LanguageElementMapping__Group_27__3__Impl"
    // InternalPerspectiveDSL.g:2433:1: rule__LanguageElementMapping__Group_27__3__Impl : ( ( rule__LanguageElementMapping__NestedMappingsAssignment_27_3 )* ) ;
    public final void rule__LanguageElementMapping__Group_27__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2437:1: ( ( ( rule__LanguageElementMapping__NestedMappingsAssignment_27_3 )* ) )
            // InternalPerspectiveDSL.g:2438:1: ( ( rule__LanguageElementMapping__NestedMappingsAssignment_27_3 )* )
            {
            // InternalPerspectiveDSL.g:2438:1: ( ( rule__LanguageElementMapping__NestedMappingsAssignment_27_3 )* )
            // InternalPerspectiveDSL.g:2439:2: ( rule__LanguageElementMapping__NestedMappingsAssignment_27_3 )*
            {
             before(grammarAccess.getLanguageElementMappingAccess().getNestedMappingsAssignment_27_3()); 
            // InternalPerspectiveDSL.g:2440:2: ( rule__LanguageElementMapping__NestedMappingsAssignment_27_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==44) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalPerspectiveDSL.g:2440:3: rule__LanguageElementMapping__NestedMappingsAssignment_27_3
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__LanguageElementMapping__NestedMappingsAssignment_27_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getLanguageElementMappingAccess().getNestedMappingsAssignment_27_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group_27__3__Impl"


    // $ANTLR start "rule__LanguageElementMapping__Group_27__4"
    // InternalPerspectiveDSL.g:2448:1: rule__LanguageElementMapping__Group_27__4 : rule__LanguageElementMapping__Group_27__4__Impl ;
    public final void rule__LanguageElementMapping__Group_27__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2452:1: ( rule__LanguageElementMapping__Group_27__4__Impl )
            // InternalPerspectiveDSL.g:2453:2: rule__LanguageElementMapping__Group_27__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LanguageElementMapping__Group_27__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group_27__4"


    // $ANTLR start "rule__LanguageElementMapping__Group_27__4__Impl"
    // InternalPerspectiveDSL.g:2459:1: rule__LanguageElementMapping__Group_27__4__Impl : ( 'end' ) ;
    public final void rule__LanguageElementMapping__Group_27__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2463:1: ( ( 'end' ) )
            // InternalPerspectiveDSL.g:2464:1: ( 'end' )
            {
            // InternalPerspectiveDSL.g:2464:1: ( 'end' )
            // InternalPerspectiveDSL.g:2465:2: 'end'
            {
             before(grammarAccess.getLanguageElementMappingAccess().getEndKeyword_27_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getLanguageElementMappingAccess().getEndKeyword_27_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group_27__4__Impl"


    // $ANTLR start "rule__LanguageElementMapping__Group_28__0"
    // InternalPerspectiveDSL.g:2475:1: rule__LanguageElementMapping__Group_28__0 : rule__LanguageElementMapping__Group_28__0__Impl rule__LanguageElementMapping__Group_28__1 ;
    public final void rule__LanguageElementMapping__Group_28__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2479:1: ( rule__LanguageElementMapping__Group_28__0__Impl rule__LanguageElementMapping__Group_28__1 )
            // InternalPerspectiveDSL.g:2480:2: rule__LanguageElementMapping__Group_28__0__Impl rule__LanguageElementMapping__Group_28__1
            {
            pushFollow(FOLLOW_11);
            rule__LanguageElementMapping__Group_28__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageElementMapping__Group_28__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group_28__0"


    // $ANTLR start "rule__LanguageElementMapping__Group_28__0__Impl"
    // InternalPerspectiveDSL.g:2487:1: rule__LanguageElementMapping__Group_28__0__Impl : ( 'interLanguageMappingEnds' ) ;
    public final void rule__LanguageElementMapping__Group_28__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2491:1: ( ( 'interLanguageMappingEnds' ) )
            // InternalPerspectiveDSL.g:2492:1: ( 'interLanguageMappingEnds' )
            {
            // InternalPerspectiveDSL.g:2492:1: ( 'interLanguageMappingEnds' )
            // InternalPerspectiveDSL.g:2493:2: 'interLanguageMappingEnds'
            {
             before(grammarAccess.getLanguageElementMappingAccess().getInterLanguageMappingEndsKeyword_28_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getLanguageElementMappingAccess().getInterLanguageMappingEndsKeyword_28_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group_28__0__Impl"


    // $ANTLR start "rule__LanguageElementMapping__Group_28__1"
    // InternalPerspectiveDSL.g:2502:1: rule__LanguageElementMapping__Group_28__1 : rule__LanguageElementMapping__Group_28__1__Impl rule__LanguageElementMapping__Group_28__2 ;
    public final void rule__LanguageElementMapping__Group_28__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2506:1: ( rule__LanguageElementMapping__Group_28__1__Impl rule__LanguageElementMapping__Group_28__2 )
            // InternalPerspectiveDSL.g:2507:2: rule__LanguageElementMapping__Group_28__1__Impl rule__LanguageElementMapping__Group_28__2
            {
            pushFollow(FOLLOW_39);
            rule__LanguageElementMapping__Group_28__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageElementMapping__Group_28__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group_28__1"


    // $ANTLR start "rule__LanguageElementMapping__Group_28__1__Impl"
    // InternalPerspectiveDSL.g:2514:1: rule__LanguageElementMapping__Group_28__1__Impl : ( ':' ) ;
    public final void rule__LanguageElementMapping__Group_28__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2518:1: ( ( ':' ) )
            // InternalPerspectiveDSL.g:2519:1: ( ':' )
            {
            // InternalPerspectiveDSL.g:2519:1: ( ':' )
            // InternalPerspectiveDSL.g:2520:2: ':'
            {
             before(grammarAccess.getLanguageElementMappingAccess().getColonKeyword_28_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getLanguageElementMappingAccess().getColonKeyword_28_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group_28__1__Impl"


    // $ANTLR start "rule__LanguageElementMapping__Group_28__2"
    // InternalPerspectiveDSL.g:2529:1: rule__LanguageElementMapping__Group_28__2 : rule__LanguageElementMapping__Group_28__2__Impl rule__LanguageElementMapping__Group_28__3 ;
    public final void rule__LanguageElementMapping__Group_28__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2533:1: ( rule__LanguageElementMapping__Group_28__2__Impl rule__LanguageElementMapping__Group_28__3 )
            // InternalPerspectiveDSL.g:2534:2: rule__LanguageElementMapping__Group_28__2__Impl rule__LanguageElementMapping__Group_28__3
            {
            pushFollow(FOLLOW_39);
            rule__LanguageElementMapping__Group_28__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageElementMapping__Group_28__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group_28__2"


    // $ANTLR start "rule__LanguageElementMapping__Group_28__2__Impl"
    // InternalPerspectiveDSL.g:2541:1: rule__LanguageElementMapping__Group_28__2__Impl : ( ( rule__LanguageElementMapping__InterLanguageMappingEndsAssignment_28_2 )* ) ;
    public final void rule__LanguageElementMapping__Group_28__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2545:1: ( ( ( rule__LanguageElementMapping__InterLanguageMappingEndsAssignment_28_2 )* ) )
            // InternalPerspectiveDSL.g:2546:1: ( ( rule__LanguageElementMapping__InterLanguageMappingEndsAssignment_28_2 )* )
            {
            // InternalPerspectiveDSL.g:2546:1: ( ( rule__LanguageElementMapping__InterLanguageMappingEndsAssignment_28_2 )* )
            // InternalPerspectiveDSL.g:2547:2: ( rule__LanguageElementMapping__InterLanguageMappingEndsAssignment_28_2 )*
            {
             before(grammarAccess.getLanguageElementMappingAccess().getInterLanguageMappingEndsAssignment_28_2()); 
            // InternalPerspectiveDSL.g:2548:2: ( rule__LanguageElementMapping__InterLanguageMappingEndsAssignment_28_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==47) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalPerspectiveDSL.g:2548:3: rule__LanguageElementMapping__InterLanguageMappingEndsAssignment_28_2
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__LanguageElementMapping__InterLanguageMappingEndsAssignment_28_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getLanguageElementMappingAccess().getInterLanguageMappingEndsAssignment_28_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group_28__2__Impl"


    // $ANTLR start "rule__LanguageElementMapping__Group_28__3"
    // InternalPerspectiveDSL.g:2556:1: rule__LanguageElementMapping__Group_28__3 : rule__LanguageElementMapping__Group_28__3__Impl ;
    public final void rule__LanguageElementMapping__Group_28__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2560:1: ( rule__LanguageElementMapping__Group_28__3__Impl )
            // InternalPerspectiveDSL.g:2561:2: rule__LanguageElementMapping__Group_28__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LanguageElementMapping__Group_28__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group_28__3"


    // $ANTLR start "rule__LanguageElementMapping__Group_28__3__Impl"
    // InternalPerspectiveDSL.g:2567:1: rule__LanguageElementMapping__Group_28__3__Impl : ( 'end' ) ;
    public final void rule__LanguageElementMapping__Group_28__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2571:1: ( ( 'end' ) )
            // InternalPerspectiveDSL.g:2572:1: ( 'end' )
            {
            // InternalPerspectiveDSL.g:2572:1: ( 'end' )
            // InternalPerspectiveDSL.g:2573:2: 'end'
            {
             before(grammarAccess.getLanguageElementMappingAccess().getEndKeyword_28_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getLanguageElementMappingAccess().getEndKeyword_28_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__Group_28__3__Impl"


    // $ANTLR start "rule__NestedMapping__Group__0"
    // InternalPerspectiveDSL.g:2583:1: rule__NestedMapping__Group__0 : rule__NestedMapping__Group__0__Impl rule__NestedMapping__Group__1 ;
    public final void rule__NestedMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2587:1: ( rule__NestedMapping__Group__0__Impl rule__NestedMapping__Group__1 )
            // InternalPerspectiveDSL.g:2588:2: rule__NestedMapping__Group__0__Impl rule__NestedMapping__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__NestedMapping__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NestedMapping__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedMapping__Group__0"


    // $ANTLR start "rule__NestedMapping__Group__0__Impl"
    // InternalPerspectiveDSL.g:2595:1: rule__NestedMapping__Group__0__Impl : ( 'nested' ) ;
    public final void rule__NestedMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2599:1: ( ( 'nested' ) )
            // InternalPerspectiveDSL.g:2600:1: ( 'nested' )
            {
            // InternalPerspectiveDSL.g:2600:1: ( 'nested' )
            // InternalPerspectiveDSL.g:2601:2: 'nested'
            {
             before(grammarAccess.getNestedMappingAccess().getNestedKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getNestedMappingAccess().getNestedKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedMapping__Group__0__Impl"


    // $ANTLR start "rule__NestedMapping__Group__1"
    // InternalPerspectiveDSL.g:2610:1: rule__NestedMapping__Group__1 : rule__NestedMapping__Group__1__Impl rule__NestedMapping__Group__2 ;
    public final void rule__NestedMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2614:1: ( rule__NestedMapping__Group__1__Impl rule__NestedMapping__Group__2 )
            // InternalPerspectiveDSL.g:2615:2: rule__NestedMapping__Group__1__Impl rule__NestedMapping__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__NestedMapping__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NestedMapping__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedMapping__Group__1"


    // $ANTLR start "rule__NestedMapping__Group__1__Impl"
    // InternalPerspectiveDSL.g:2622:1: rule__NestedMapping__Group__1__Impl : ( 'mapping' ) ;
    public final void rule__NestedMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2626:1: ( ( 'mapping' ) )
            // InternalPerspectiveDSL.g:2627:1: ( 'mapping' )
            {
            // InternalPerspectiveDSL.g:2627:1: ( 'mapping' )
            // InternalPerspectiveDSL.g:2628:2: 'mapping'
            {
             before(grammarAccess.getNestedMappingAccess().getMappingKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getNestedMappingAccess().getMappingKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedMapping__Group__1__Impl"


    // $ANTLR start "rule__NestedMapping__Group__2"
    // InternalPerspectiveDSL.g:2637:1: rule__NestedMapping__Group__2 : rule__NestedMapping__Group__2__Impl rule__NestedMapping__Group__3 ;
    public final void rule__NestedMapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2641:1: ( rule__NestedMapping__Group__2__Impl rule__NestedMapping__Group__3 )
            // InternalPerspectiveDSL.g:2642:2: rule__NestedMapping__Group__2__Impl rule__NestedMapping__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__NestedMapping__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NestedMapping__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedMapping__Group__2"


    // $ANTLR start "rule__NestedMapping__Group__2__Impl"
    // InternalPerspectiveDSL.g:2649:1: rule__NestedMapping__Group__2__Impl : ( ( rule__NestedMapping__NameAssignment_2 ) ) ;
    public final void rule__NestedMapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2653:1: ( ( ( rule__NestedMapping__NameAssignment_2 ) ) )
            // InternalPerspectiveDSL.g:2654:1: ( ( rule__NestedMapping__NameAssignment_2 ) )
            {
            // InternalPerspectiveDSL.g:2654:1: ( ( rule__NestedMapping__NameAssignment_2 ) )
            // InternalPerspectiveDSL.g:2655:2: ( rule__NestedMapping__NameAssignment_2 )
            {
             before(grammarAccess.getNestedMappingAccess().getNameAssignment_2()); 
            // InternalPerspectiveDSL.g:2656:2: ( rule__NestedMapping__NameAssignment_2 )
            // InternalPerspectiveDSL.g:2656:3: rule__NestedMapping__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__NestedMapping__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNestedMappingAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedMapping__Group__2__Impl"


    // $ANTLR start "rule__NestedMapping__Group__3"
    // InternalPerspectiveDSL.g:2664:1: rule__NestedMapping__Group__3 : rule__NestedMapping__Group__3__Impl rule__NestedMapping__Group__4 ;
    public final void rule__NestedMapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2668:1: ( rule__NestedMapping__Group__3__Impl rule__NestedMapping__Group__4 )
            // InternalPerspectiveDSL.g:2669:2: rule__NestedMapping__Group__3__Impl rule__NestedMapping__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__NestedMapping__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NestedMapping__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedMapping__Group__3"


    // $ANTLR start "rule__NestedMapping__Group__3__Impl"
    // InternalPerspectiveDSL.g:2676:1: rule__NestedMapping__Group__3__Impl : ( ':' ) ;
    public final void rule__NestedMapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2680:1: ( ( ':' ) )
            // InternalPerspectiveDSL.g:2681:1: ( ':' )
            {
            // InternalPerspectiveDSL.g:2681:1: ( ':' )
            // InternalPerspectiveDSL.g:2682:2: ':'
            {
             before(grammarAccess.getNestedMappingAccess().getColonKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getNestedMappingAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedMapping__Group__3__Impl"


    // $ANTLR start "rule__NestedMapping__Group__4"
    // InternalPerspectiveDSL.g:2691:1: rule__NestedMapping__Group__4 : rule__NestedMapping__Group__4__Impl rule__NestedMapping__Group__5 ;
    public final void rule__NestedMapping__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2695:1: ( rule__NestedMapping__Group__4__Impl rule__NestedMapping__Group__5 )
            // InternalPerspectiveDSL.g:2696:2: rule__NestedMapping__Group__4__Impl rule__NestedMapping__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__NestedMapping__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NestedMapping__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedMapping__Group__4"


    // $ANTLR start "rule__NestedMapping__Group__4__Impl"
    // InternalPerspectiveDSL.g:2703:1: rule__NestedMapping__Group__4__Impl : ( 'fromElement' ) ;
    public final void rule__NestedMapping__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2707:1: ( ( 'fromElement' ) )
            // InternalPerspectiveDSL.g:2708:1: ( 'fromElement' )
            {
            // InternalPerspectiveDSL.g:2708:1: ( 'fromElement' )
            // InternalPerspectiveDSL.g:2709:2: 'fromElement'
            {
             before(grammarAccess.getNestedMappingAccess().getFromElementKeyword_4()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getNestedMappingAccess().getFromElementKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedMapping__Group__4__Impl"


    // $ANTLR start "rule__NestedMapping__Group__5"
    // InternalPerspectiveDSL.g:2718:1: rule__NestedMapping__Group__5 : rule__NestedMapping__Group__5__Impl rule__NestedMapping__Group__6 ;
    public final void rule__NestedMapping__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2722:1: ( rule__NestedMapping__Group__5__Impl rule__NestedMapping__Group__6 )
            // InternalPerspectiveDSL.g:2723:2: rule__NestedMapping__Group__5__Impl rule__NestedMapping__Group__6
            {
            pushFollow(FOLLOW_42);
            rule__NestedMapping__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NestedMapping__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedMapping__Group__5"


    // $ANTLR start "rule__NestedMapping__Group__5__Impl"
    // InternalPerspectiveDSL.g:2730:1: rule__NestedMapping__Group__5__Impl : ( ':' ) ;
    public final void rule__NestedMapping__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2734:1: ( ( ':' ) )
            // InternalPerspectiveDSL.g:2735:1: ( ':' )
            {
            // InternalPerspectiveDSL.g:2735:1: ( ':' )
            // InternalPerspectiveDSL.g:2736:2: ':'
            {
             before(grammarAccess.getNestedMappingAccess().getColonKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getNestedMappingAccess().getColonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedMapping__Group__5__Impl"


    // $ANTLR start "rule__NestedMapping__Group__6"
    // InternalPerspectiveDSL.g:2745:1: rule__NestedMapping__Group__6 : rule__NestedMapping__Group__6__Impl rule__NestedMapping__Group__7 ;
    public final void rule__NestedMapping__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2749:1: ( rule__NestedMapping__Group__6__Impl rule__NestedMapping__Group__7 )
            // InternalPerspectiveDSL.g:2750:2: rule__NestedMapping__Group__6__Impl rule__NestedMapping__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__NestedMapping__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NestedMapping__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedMapping__Group__6"


    // $ANTLR start "rule__NestedMapping__Group__6__Impl"
    // InternalPerspectiveDSL.g:2757:1: rule__NestedMapping__Group__6__Impl : ( 'elementName' ) ;
    public final void rule__NestedMapping__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2761:1: ( ( 'elementName' ) )
            // InternalPerspectiveDSL.g:2762:1: ( 'elementName' )
            {
            // InternalPerspectiveDSL.g:2762:1: ( 'elementName' )
            // InternalPerspectiveDSL.g:2763:2: 'elementName'
            {
             before(grammarAccess.getNestedMappingAccess().getElementNameKeyword_6()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getNestedMappingAccess().getElementNameKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedMapping__Group__6__Impl"


    // $ANTLR start "rule__NestedMapping__Group__7"
    // InternalPerspectiveDSL.g:2772:1: rule__NestedMapping__Group__7 : rule__NestedMapping__Group__7__Impl rule__NestedMapping__Group__8 ;
    public final void rule__NestedMapping__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2776:1: ( rule__NestedMapping__Group__7__Impl rule__NestedMapping__Group__8 )
            // InternalPerspectiveDSL.g:2777:2: rule__NestedMapping__Group__7__Impl rule__NestedMapping__Group__8
            {
            pushFollow(FOLLOW_32);
            rule__NestedMapping__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NestedMapping__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedMapping__Group__7"


    // $ANTLR start "rule__NestedMapping__Group__7__Impl"
    // InternalPerspectiveDSL.g:2784:1: rule__NestedMapping__Group__7__Impl : ( ( rule__NestedMapping__FromElementNameAssignment_7 ) ) ;
    public final void rule__NestedMapping__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2788:1: ( ( ( rule__NestedMapping__FromElementNameAssignment_7 ) ) )
            // InternalPerspectiveDSL.g:2789:1: ( ( rule__NestedMapping__FromElementNameAssignment_7 ) )
            {
            // InternalPerspectiveDSL.g:2789:1: ( ( rule__NestedMapping__FromElementNameAssignment_7 ) )
            // InternalPerspectiveDSL.g:2790:2: ( rule__NestedMapping__FromElementNameAssignment_7 )
            {
             before(grammarAccess.getNestedMappingAccess().getFromElementNameAssignment_7()); 
            // InternalPerspectiveDSL.g:2791:2: ( rule__NestedMapping__FromElementNameAssignment_7 )
            // InternalPerspectiveDSL.g:2791:3: rule__NestedMapping__FromElementNameAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__NestedMapping__FromElementNameAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getNestedMappingAccess().getFromElementNameAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedMapping__Group__7__Impl"


    // $ANTLR start "rule__NestedMapping__Group__8"
    // InternalPerspectiveDSL.g:2799:1: rule__NestedMapping__Group__8 : rule__NestedMapping__Group__8__Impl rule__NestedMapping__Group__9 ;
    public final void rule__NestedMapping__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2803:1: ( rule__NestedMapping__Group__8__Impl rule__NestedMapping__Group__9 )
            // InternalPerspectiveDSL.g:2804:2: rule__NestedMapping__Group__8__Impl rule__NestedMapping__Group__9
            {
            pushFollow(FOLLOW_4);
            rule__NestedMapping__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NestedMapping__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedMapping__Group__8"


    // $ANTLR start "rule__NestedMapping__Group__8__Impl"
    // InternalPerspectiveDSL.g:2811:1: rule__NestedMapping__Group__8__Impl : ( 'from' ) ;
    public final void rule__NestedMapping__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2815:1: ( ( 'from' ) )
            // InternalPerspectiveDSL.g:2816:1: ( 'from' )
            {
            // InternalPerspectiveDSL.g:2816:1: ( 'from' )
            // InternalPerspectiveDSL.g:2817:2: 'from'
            {
             before(grammarAccess.getNestedMappingAccess().getFromKeyword_8()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getNestedMappingAccess().getFromKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedMapping__Group__8__Impl"


    // $ANTLR start "rule__NestedMapping__Group__9"
    // InternalPerspectiveDSL.g:2826:1: rule__NestedMapping__Group__9 : rule__NestedMapping__Group__9__Impl rule__NestedMapping__Group__10 ;
    public final void rule__NestedMapping__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2830:1: ( rule__NestedMapping__Group__9__Impl rule__NestedMapping__Group__10 )
            // InternalPerspectiveDSL.g:2831:2: rule__NestedMapping__Group__9__Impl rule__NestedMapping__Group__10
            {
            pushFollow(FOLLOW_9);
            rule__NestedMapping__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NestedMapping__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedMapping__Group__9"


    // $ANTLR start "rule__NestedMapping__Group__9__Impl"
    // InternalPerspectiveDSL.g:2838:1: rule__NestedMapping__Group__9__Impl : ( ( rule__NestedMapping__FromRoleNameAssignment_9 ) ) ;
    public final void rule__NestedMapping__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2842:1: ( ( ( rule__NestedMapping__FromRoleNameAssignment_9 ) ) )
            // InternalPerspectiveDSL.g:2843:1: ( ( rule__NestedMapping__FromRoleNameAssignment_9 ) )
            {
            // InternalPerspectiveDSL.g:2843:1: ( ( rule__NestedMapping__FromRoleNameAssignment_9 ) )
            // InternalPerspectiveDSL.g:2844:2: ( rule__NestedMapping__FromRoleNameAssignment_9 )
            {
             before(grammarAccess.getNestedMappingAccess().getFromRoleNameAssignment_9()); 
            // InternalPerspectiveDSL.g:2845:2: ( rule__NestedMapping__FromRoleNameAssignment_9 )
            // InternalPerspectiveDSL.g:2845:3: rule__NestedMapping__FromRoleNameAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__NestedMapping__FromRoleNameAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getNestedMappingAccess().getFromRoleNameAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedMapping__Group__9__Impl"


    // $ANTLR start "rule__NestedMapping__Group__10"
    // InternalPerspectiveDSL.g:2853:1: rule__NestedMapping__Group__10 : rule__NestedMapping__Group__10__Impl rule__NestedMapping__Group__11 ;
    public final void rule__NestedMapping__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2857:1: ( rule__NestedMapping__Group__10__Impl rule__NestedMapping__Group__11 )
            // InternalPerspectiveDSL.g:2858:2: rule__NestedMapping__Group__10__Impl rule__NestedMapping__Group__11
            {
            pushFollow(FOLLOW_34);
            rule__NestedMapping__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NestedMapping__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedMapping__Group__10"


    // $ANTLR start "rule__NestedMapping__Group__10__Impl"
    // InternalPerspectiveDSL.g:2865:1: rule__NestedMapping__Group__10__Impl : ( ';' ) ;
    public final void rule__NestedMapping__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2869:1: ( ( ';' ) )
            // InternalPerspectiveDSL.g:2870:1: ( ';' )
            {
            // InternalPerspectiveDSL.g:2870:1: ( ';' )
            // InternalPerspectiveDSL.g:2871:2: ';'
            {
             before(grammarAccess.getNestedMappingAccess().getSemicolonKeyword_10()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getNestedMappingAccess().getSemicolonKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedMapping__Group__10__Impl"


    // $ANTLR start "rule__NestedMapping__Group__11"
    // InternalPerspectiveDSL.g:2880:1: rule__NestedMapping__Group__11 : rule__NestedMapping__Group__11__Impl rule__NestedMapping__Group__12 ;
    public final void rule__NestedMapping__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2884:1: ( rule__NestedMapping__Group__11__Impl rule__NestedMapping__Group__12 )
            // InternalPerspectiveDSL.g:2885:2: rule__NestedMapping__Group__11__Impl rule__NestedMapping__Group__12
            {
            pushFollow(FOLLOW_11);
            rule__NestedMapping__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NestedMapping__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedMapping__Group__11"


    // $ANTLR start "rule__NestedMapping__Group__11__Impl"
    // InternalPerspectiveDSL.g:2892:1: rule__NestedMapping__Group__11__Impl : ( 'toELement' ) ;
    public final void rule__NestedMapping__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2896:1: ( ( 'toELement' ) )
            // InternalPerspectiveDSL.g:2897:1: ( 'toELement' )
            {
            // InternalPerspectiveDSL.g:2897:1: ( 'toELement' )
            // InternalPerspectiveDSL.g:2898:2: 'toELement'
            {
             before(grammarAccess.getNestedMappingAccess().getToELementKeyword_11()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getNestedMappingAccess().getToELementKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedMapping__Group__11__Impl"


    // $ANTLR start "rule__NestedMapping__Group__12"
    // InternalPerspectiveDSL.g:2907:1: rule__NestedMapping__Group__12 : rule__NestedMapping__Group__12__Impl rule__NestedMapping__Group__13 ;
    public final void rule__NestedMapping__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2911:1: ( rule__NestedMapping__Group__12__Impl rule__NestedMapping__Group__13 )
            // InternalPerspectiveDSL.g:2912:2: rule__NestedMapping__Group__12__Impl rule__NestedMapping__Group__13
            {
            pushFollow(FOLLOW_42);
            rule__NestedMapping__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NestedMapping__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedMapping__Group__12"


    // $ANTLR start "rule__NestedMapping__Group__12__Impl"
    // InternalPerspectiveDSL.g:2919:1: rule__NestedMapping__Group__12__Impl : ( ':' ) ;
    public final void rule__NestedMapping__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2923:1: ( ( ':' ) )
            // InternalPerspectiveDSL.g:2924:1: ( ':' )
            {
            // InternalPerspectiveDSL.g:2924:1: ( ':' )
            // InternalPerspectiveDSL.g:2925:2: ':'
            {
             before(grammarAccess.getNestedMappingAccess().getColonKeyword_12()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getNestedMappingAccess().getColonKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedMapping__Group__12__Impl"


    // $ANTLR start "rule__NestedMapping__Group__13"
    // InternalPerspectiveDSL.g:2934:1: rule__NestedMapping__Group__13 : rule__NestedMapping__Group__13__Impl rule__NestedMapping__Group__14 ;
    public final void rule__NestedMapping__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2938:1: ( rule__NestedMapping__Group__13__Impl rule__NestedMapping__Group__14 )
            // InternalPerspectiveDSL.g:2939:2: rule__NestedMapping__Group__13__Impl rule__NestedMapping__Group__14
            {
            pushFollow(FOLLOW_8);
            rule__NestedMapping__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NestedMapping__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedMapping__Group__13"


    // $ANTLR start "rule__NestedMapping__Group__13__Impl"
    // InternalPerspectiveDSL.g:2946:1: rule__NestedMapping__Group__13__Impl : ( 'elementName' ) ;
    public final void rule__NestedMapping__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2950:1: ( ( 'elementName' ) )
            // InternalPerspectiveDSL.g:2951:1: ( 'elementName' )
            {
            // InternalPerspectiveDSL.g:2951:1: ( 'elementName' )
            // InternalPerspectiveDSL.g:2952:2: 'elementName'
            {
             before(grammarAccess.getNestedMappingAccess().getElementNameKeyword_13()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getNestedMappingAccess().getElementNameKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedMapping__Group__13__Impl"


    // $ANTLR start "rule__NestedMapping__Group__14"
    // InternalPerspectiveDSL.g:2961:1: rule__NestedMapping__Group__14 : rule__NestedMapping__Group__14__Impl rule__NestedMapping__Group__15 ;
    public final void rule__NestedMapping__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2965:1: ( rule__NestedMapping__Group__14__Impl rule__NestedMapping__Group__15 )
            // InternalPerspectiveDSL.g:2966:2: rule__NestedMapping__Group__14__Impl rule__NestedMapping__Group__15
            {
            pushFollow(FOLLOW_32);
            rule__NestedMapping__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NestedMapping__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedMapping__Group__14"


    // $ANTLR start "rule__NestedMapping__Group__14__Impl"
    // InternalPerspectiveDSL.g:2973:1: rule__NestedMapping__Group__14__Impl : ( ( rule__NestedMapping__ToElementNameAssignment_14 ) ) ;
    public final void rule__NestedMapping__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2977:1: ( ( ( rule__NestedMapping__ToElementNameAssignment_14 ) ) )
            // InternalPerspectiveDSL.g:2978:1: ( ( rule__NestedMapping__ToElementNameAssignment_14 ) )
            {
            // InternalPerspectiveDSL.g:2978:1: ( ( rule__NestedMapping__ToElementNameAssignment_14 ) )
            // InternalPerspectiveDSL.g:2979:2: ( rule__NestedMapping__ToElementNameAssignment_14 )
            {
             before(grammarAccess.getNestedMappingAccess().getToElementNameAssignment_14()); 
            // InternalPerspectiveDSL.g:2980:2: ( rule__NestedMapping__ToElementNameAssignment_14 )
            // InternalPerspectiveDSL.g:2980:3: rule__NestedMapping__ToElementNameAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__NestedMapping__ToElementNameAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getNestedMappingAccess().getToElementNameAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedMapping__Group__14__Impl"


    // $ANTLR start "rule__NestedMapping__Group__15"
    // InternalPerspectiveDSL.g:2988:1: rule__NestedMapping__Group__15 : rule__NestedMapping__Group__15__Impl rule__NestedMapping__Group__16 ;
    public final void rule__NestedMapping__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:2992:1: ( rule__NestedMapping__Group__15__Impl rule__NestedMapping__Group__16 )
            // InternalPerspectiveDSL.g:2993:2: rule__NestedMapping__Group__15__Impl rule__NestedMapping__Group__16
            {
            pushFollow(FOLLOW_4);
            rule__NestedMapping__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NestedMapping__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedMapping__Group__15"


    // $ANTLR start "rule__NestedMapping__Group__15__Impl"
    // InternalPerspectiveDSL.g:3000:1: rule__NestedMapping__Group__15__Impl : ( 'from' ) ;
    public final void rule__NestedMapping__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3004:1: ( ( 'from' ) )
            // InternalPerspectiveDSL.g:3005:1: ( 'from' )
            {
            // InternalPerspectiveDSL.g:3005:1: ( 'from' )
            // InternalPerspectiveDSL.g:3006:2: 'from'
            {
             before(grammarAccess.getNestedMappingAccess().getFromKeyword_15()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getNestedMappingAccess().getFromKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedMapping__Group__15__Impl"


    // $ANTLR start "rule__NestedMapping__Group__16"
    // InternalPerspectiveDSL.g:3015:1: rule__NestedMapping__Group__16 : rule__NestedMapping__Group__16__Impl rule__NestedMapping__Group__17 ;
    public final void rule__NestedMapping__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3019:1: ( rule__NestedMapping__Group__16__Impl rule__NestedMapping__Group__17 )
            // InternalPerspectiveDSL.g:3020:2: rule__NestedMapping__Group__16__Impl rule__NestedMapping__Group__17
            {
            pushFollow(FOLLOW_9);
            rule__NestedMapping__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NestedMapping__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedMapping__Group__16"


    // $ANTLR start "rule__NestedMapping__Group__16__Impl"
    // InternalPerspectiveDSL.g:3027:1: rule__NestedMapping__Group__16__Impl : ( ( rule__NestedMapping__ToRoleNameAssignment_16 ) ) ;
    public final void rule__NestedMapping__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3031:1: ( ( ( rule__NestedMapping__ToRoleNameAssignment_16 ) ) )
            // InternalPerspectiveDSL.g:3032:1: ( ( rule__NestedMapping__ToRoleNameAssignment_16 ) )
            {
            // InternalPerspectiveDSL.g:3032:1: ( ( rule__NestedMapping__ToRoleNameAssignment_16 ) )
            // InternalPerspectiveDSL.g:3033:2: ( rule__NestedMapping__ToRoleNameAssignment_16 )
            {
             before(grammarAccess.getNestedMappingAccess().getToRoleNameAssignment_16()); 
            // InternalPerspectiveDSL.g:3034:2: ( rule__NestedMapping__ToRoleNameAssignment_16 )
            // InternalPerspectiveDSL.g:3034:3: rule__NestedMapping__ToRoleNameAssignment_16
            {
            pushFollow(FOLLOW_2);
            rule__NestedMapping__ToRoleNameAssignment_16();

            state._fsp--;


            }

             after(grammarAccess.getNestedMappingAccess().getToRoleNameAssignment_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedMapping__Group__16__Impl"


    // $ANTLR start "rule__NestedMapping__Group__17"
    // InternalPerspectiveDSL.g:3042:1: rule__NestedMapping__Group__17 : rule__NestedMapping__Group__17__Impl rule__NestedMapping__Group__18 ;
    public final void rule__NestedMapping__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3046:1: ( rule__NestedMapping__Group__17__Impl rule__NestedMapping__Group__18 )
            // InternalPerspectiveDSL.g:3047:2: rule__NestedMapping__Group__17__Impl rule__NestedMapping__Group__18
            {
            pushFollow(FOLLOW_43);
            rule__NestedMapping__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NestedMapping__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedMapping__Group__17"


    // $ANTLR start "rule__NestedMapping__Group__17__Impl"
    // InternalPerspectiveDSL.g:3054:1: rule__NestedMapping__Group__17__Impl : ( ';' ) ;
    public final void rule__NestedMapping__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3058:1: ( ( ';' ) )
            // InternalPerspectiveDSL.g:3059:1: ( ';' )
            {
            // InternalPerspectiveDSL.g:3059:1: ( ';' )
            // InternalPerspectiveDSL.g:3060:2: ';'
            {
             before(grammarAccess.getNestedMappingAccess().getSemicolonKeyword_17()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getNestedMappingAccess().getSemicolonKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedMapping__Group__17__Impl"


    // $ANTLR start "rule__NestedMapping__Group__18"
    // InternalPerspectiveDSL.g:3069:1: rule__NestedMapping__Group__18 : rule__NestedMapping__Group__18__Impl ;
    public final void rule__NestedMapping__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3073:1: ( rule__NestedMapping__Group__18__Impl )
            // InternalPerspectiveDSL.g:3074:2: rule__NestedMapping__Group__18__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NestedMapping__Group__18__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedMapping__Group__18"


    // $ANTLR start "rule__NestedMapping__Group__18__Impl"
    // InternalPerspectiveDSL.g:3080:1: rule__NestedMapping__Group__18__Impl : ( 'end' ) ;
    public final void rule__NestedMapping__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3084:1: ( ( 'end' ) )
            // InternalPerspectiveDSL.g:3085:1: ( 'end' )
            {
            // InternalPerspectiveDSL.g:3085:1: ( 'end' )
            // InternalPerspectiveDSL.g:3086:2: 'end'
            {
             before(grammarAccess.getNestedMappingAccess().getEndKeyword_18()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getNestedMappingAccess().getEndKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedMapping__Group__18__Impl"


    // $ANTLR start "rule__InterLanguageMappingEnd__Group__0"
    // InternalPerspectiveDSL.g:3096:1: rule__InterLanguageMappingEnd__Group__0 : rule__InterLanguageMappingEnd__Group__0__Impl rule__InterLanguageMappingEnd__Group__1 ;
    public final void rule__InterLanguageMappingEnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3100:1: ( rule__InterLanguageMappingEnd__Group__0__Impl rule__InterLanguageMappingEnd__Group__1 )
            // InternalPerspectiveDSL.g:3101:2: rule__InterLanguageMappingEnd__Group__0__Impl rule__InterLanguageMappingEnd__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__InterLanguageMappingEnd__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterLanguageMappingEnd__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterLanguageMappingEnd__Group__0"


    // $ANTLR start "rule__InterLanguageMappingEnd__Group__0__Impl"
    // InternalPerspectiveDSL.g:3108:1: rule__InterLanguageMappingEnd__Group__0__Impl : ( 'inter' ) ;
    public final void rule__InterLanguageMappingEnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3112:1: ( ( 'inter' ) )
            // InternalPerspectiveDSL.g:3113:1: ( 'inter' )
            {
            // InternalPerspectiveDSL.g:3113:1: ( 'inter' )
            // InternalPerspectiveDSL.g:3114:2: 'inter'
            {
             before(grammarAccess.getInterLanguageMappingEndAccess().getInterKeyword_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getInterLanguageMappingEndAccess().getInterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterLanguageMappingEnd__Group__0__Impl"


    // $ANTLR start "rule__InterLanguageMappingEnd__Group__1"
    // InternalPerspectiveDSL.g:3123:1: rule__InterLanguageMappingEnd__Group__1 : rule__InterLanguageMappingEnd__Group__1__Impl rule__InterLanguageMappingEnd__Group__2 ;
    public final void rule__InterLanguageMappingEnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3127:1: ( rule__InterLanguageMappingEnd__Group__1__Impl rule__InterLanguageMappingEnd__Group__2 )
            // InternalPerspectiveDSL.g:3128:2: rule__InterLanguageMappingEnd__Group__1__Impl rule__InterLanguageMappingEnd__Group__2
            {
            pushFollow(FOLLOW_41);
            rule__InterLanguageMappingEnd__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterLanguageMappingEnd__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterLanguageMappingEnd__Group__1"


    // $ANTLR start "rule__InterLanguageMappingEnd__Group__1__Impl"
    // InternalPerspectiveDSL.g:3135:1: rule__InterLanguageMappingEnd__Group__1__Impl : ( 'language' ) ;
    public final void rule__InterLanguageMappingEnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3139:1: ( ( 'language' ) )
            // InternalPerspectiveDSL.g:3140:1: ( 'language' )
            {
            // InternalPerspectiveDSL.g:3140:1: ( 'language' )
            // InternalPerspectiveDSL.g:3141:2: 'language'
            {
             before(grammarAccess.getInterLanguageMappingEndAccess().getLanguageKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getInterLanguageMappingEndAccess().getLanguageKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterLanguageMappingEnd__Group__1__Impl"


    // $ANTLR start "rule__InterLanguageMappingEnd__Group__2"
    // InternalPerspectiveDSL.g:3150:1: rule__InterLanguageMappingEnd__Group__2 : rule__InterLanguageMappingEnd__Group__2__Impl rule__InterLanguageMappingEnd__Group__3 ;
    public final void rule__InterLanguageMappingEnd__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3154:1: ( rule__InterLanguageMappingEnd__Group__2__Impl rule__InterLanguageMappingEnd__Group__3 )
            // InternalPerspectiveDSL.g:3155:2: rule__InterLanguageMappingEnd__Group__2__Impl rule__InterLanguageMappingEnd__Group__3
            {
            pushFollow(FOLLOW_43);
            rule__InterLanguageMappingEnd__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterLanguageMappingEnd__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterLanguageMappingEnd__Group__2"


    // $ANTLR start "rule__InterLanguageMappingEnd__Group__2__Impl"
    // InternalPerspectiveDSL.g:3162:1: rule__InterLanguageMappingEnd__Group__2__Impl : ( 'mapping' ) ;
    public final void rule__InterLanguageMappingEnd__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3166:1: ( ( 'mapping' ) )
            // InternalPerspectiveDSL.g:3167:1: ( 'mapping' )
            {
            // InternalPerspectiveDSL.g:3167:1: ( 'mapping' )
            // InternalPerspectiveDSL.g:3168:2: 'mapping'
            {
             before(grammarAccess.getInterLanguageMappingEndAccess().getMappingKeyword_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getInterLanguageMappingEndAccess().getMappingKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterLanguageMappingEnd__Group__2__Impl"


    // $ANTLR start "rule__InterLanguageMappingEnd__Group__3"
    // InternalPerspectiveDSL.g:3177:1: rule__InterLanguageMappingEnd__Group__3 : rule__InterLanguageMappingEnd__Group__3__Impl rule__InterLanguageMappingEnd__Group__4 ;
    public final void rule__InterLanguageMappingEnd__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3181:1: ( rule__InterLanguageMappingEnd__Group__3__Impl rule__InterLanguageMappingEnd__Group__4 )
            // InternalPerspectiveDSL.g:3182:2: rule__InterLanguageMappingEnd__Group__3__Impl rule__InterLanguageMappingEnd__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__InterLanguageMappingEnd__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterLanguageMappingEnd__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterLanguageMappingEnd__Group__3"


    // $ANTLR start "rule__InterLanguageMappingEnd__Group__3__Impl"
    // InternalPerspectiveDSL.g:3189:1: rule__InterLanguageMappingEnd__Group__3__Impl : ( 'end' ) ;
    public final void rule__InterLanguageMappingEnd__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3193:1: ( ( 'end' ) )
            // InternalPerspectiveDSL.g:3194:1: ( 'end' )
            {
            // InternalPerspectiveDSL.g:3194:1: ( 'end' )
            // InternalPerspectiveDSL.g:3195:2: 'end'
            {
             before(grammarAccess.getInterLanguageMappingEndAccess().getEndKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getInterLanguageMappingEndAccess().getEndKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterLanguageMappingEnd__Group__3__Impl"


    // $ANTLR start "rule__InterLanguageMappingEnd__Group__4"
    // InternalPerspectiveDSL.g:3204:1: rule__InterLanguageMappingEnd__Group__4 : rule__InterLanguageMappingEnd__Group__4__Impl rule__InterLanguageMappingEnd__Group__5 ;
    public final void rule__InterLanguageMappingEnd__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3208:1: ( rule__InterLanguageMappingEnd__Group__4__Impl rule__InterLanguageMappingEnd__Group__5 )
            // InternalPerspectiveDSL.g:3209:2: rule__InterLanguageMappingEnd__Group__4__Impl rule__InterLanguageMappingEnd__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__InterLanguageMappingEnd__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterLanguageMappingEnd__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterLanguageMappingEnd__Group__4"


    // $ANTLR start "rule__InterLanguageMappingEnd__Group__4__Impl"
    // InternalPerspectiveDSL.g:3216:1: rule__InterLanguageMappingEnd__Group__4__Impl : ( ( rule__InterLanguageMappingEnd__NameAssignment_4 ) ) ;
    public final void rule__InterLanguageMappingEnd__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3220:1: ( ( ( rule__InterLanguageMappingEnd__NameAssignment_4 ) ) )
            // InternalPerspectiveDSL.g:3221:1: ( ( rule__InterLanguageMappingEnd__NameAssignment_4 ) )
            {
            // InternalPerspectiveDSL.g:3221:1: ( ( rule__InterLanguageMappingEnd__NameAssignment_4 ) )
            // InternalPerspectiveDSL.g:3222:2: ( rule__InterLanguageMappingEnd__NameAssignment_4 )
            {
             before(grammarAccess.getInterLanguageMappingEndAccess().getNameAssignment_4()); 
            // InternalPerspectiveDSL.g:3223:2: ( rule__InterLanguageMappingEnd__NameAssignment_4 )
            // InternalPerspectiveDSL.g:3223:3: rule__InterLanguageMappingEnd__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__InterLanguageMappingEnd__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getInterLanguageMappingEndAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterLanguageMappingEnd__Group__4__Impl"


    // $ANTLR start "rule__InterLanguageMappingEnd__Group__5"
    // InternalPerspectiveDSL.g:3231:1: rule__InterLanguageMappingEnd__Group__5 : rule__InterLanguageMappingEnd__Group__5__Impl rule__InterLanguageMappingEnd__Group__6 ;
    public final void rule__InterLanguageMappingEnd__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3235:1: ( rule__InterLanguageMappingEnd__Group__5__Impl rule__InterLanguageMappingEnd__Group__6 )
            // InternalPerspectiveDSL.g:3236:2: rule__InterLanguageMappingEnd__Group__5__Impl rule__InterLanguageMappingEnd__Group__6
            {
            pushFollow(FOLLOW_44);
            rule__InterLanguageMappingEnd__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterLanguageMappingEnd__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterLanguageMappingEnd__Group__5"


    // $ANTLR start "rule__InterLanguageMappingEnd__Group__5__Impl"
    // InternalPerspectiveDSL.g:3243:1: rule__InterLanguageMappingEnd__Group__5__Impl : ( '{' ) ;
    public final void rule__InterLanguageMappingEnd__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3247:1: ( ( '{' ) )
            // InternalPerspectiveDSL.g:3248:1: ( '{' )
            {
            // InternalPerspectiveDSL.g:3248:1: ( '{' )
            // InternalPerspectiveDSL.g:3249:2: '{'
            {
             before(grammarAccess.getInterLanguageMappingEndAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getInterLanguageMappingEndAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterLanguageMappingEnd__Group__5__Impl"


    // $ANTLR start "rule__InterLanguageMappingEnd__Group__6"
    // InternalPerspectiveDSL.g:3258:1: rule__InterLanguageMappingEnd__Group__6 : rule__InterLanguageMappingEnd__Group__6__Impl rule__InterLanguageMappingEnd__Group__7 ;
    public final void rule__InterLanguageMappingEnd__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3262:1: ( rule__InterLanguageMappingEnd__Group__6__Impl rule__InterLanguageMappingEnd__Group__7 )
            // InternalPerspectiveDSL.g:3263:2: rule__InterLanguageMappingEnd__Group__6__Impl rule__InterLanguageMappingEnd__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__InterLanguageMappingEnd__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterLanguageMappingEnd__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterLanguageMappingEnd__Group__6"


    // $ANTLR start "rule__InterLanguageMappingEnd__Group__6__Impl"
    // InternalPerspectiveDSL.g:3270:1: rule__InterLanguageMappingEnd__Group__6__Impl : ( 'origin' ) ;
    public final void rule__InterLanguageMappingEnd__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3274:1: ( ( 'origin' ) )
            // InternalPerspectiveDSL.g:3275:1: ( 'origin' )
            {
            // InternalPerspectiveDSL.g:3275:1: ( 'origin' )
            // InternalPerspectiveDSL.g:3276:2: 'origin'
            {
             before(grammarAccess.getInterLanguageMappingEndAccess().getOriginKeyword_6()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getInterLanguageMappingEndAccess().getOriginKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterLanguageMappingEnd__Group__6__Impl"


    // $ANTLR start "rule__InterLanguageMappingEnd__Group__7"
    // InternalPerspectiveDSL.g:3285:1: rule__InterLanguageMappingEnd__Group__7 : rule__InterLanguageMappingEnd__Group__7__Impl rule__InterLanguageMappingEnd__Group__8 ;
    public final void rule__InterLanguageMappingEnd__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3289:1: ( rule__InterLanguageMappingEnd__Group__7__Impl rule__InterLanguageMappingEnd__Group__8 )
            // InternalPerspectiveDSL.g:3290:2: rule__InterLanguageMappingEnd__Group__7__Impl rule__InterLanguageMappingEnd__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__InterLanguageMappingEnd__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterLanguageMappingEnd__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterLanguageMappingEnd__Group__7"


    // $ANTLR start "rule__InterLanguageMappingEnd__Group__7__Impl"
    // InternalPerspectiveDSL.g:3297:1: rule__InterLanguageMappingEnd__Group__7__Impl : ( ':' ) ;
    public final void rule__InterLanguageMappingEnd__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3301:1: ( ( ':' ) )
            // InternalPerspectiveDSL.g:3302:1: ( ':' )
            {
            // InternalPerspectiveDSL.g:3302:1: ( ':' )
            // InternalPerspectiveDSL.g:3303:2: ':'
            {
             before(grammarAccess.getInterLanguageMappingEndAccess().getColonKeyword_7()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getInterLanguageMappingEndAccess().getColonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterLanguageMappingEnd__Group__7__Impl"


    // $ANTLR start "rule__InterLanguageMappingEnd__Group__8"
    // InternalPerspectiveDSL.g:3312:1: rule__InterLanguageMappingEnd__Group__8 : rule__InterLanguageMappingEnd__Group__8__Impl rule__InterLanguageMappingEnd__Group__9 ;
    public final void rule__InterLanguageMappingEnd__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3316:1: ( rule__InterLanguageMappingEnd__Group__8__Impl rule__InterLanguageMappingEnd__Group__9 )
            // InternalPerspectiveDSL.g:3317:2: rule__InterLanguageMappingEnd__Group__8__Impl rule__InterLanguageMappingEnd__Group__9
            {
            pushFollow(FOLLOW_45);
            rule__InterLanguageMappingEnd__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterLanguageMappingEnd__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterLanguageMappingEnd__Group__8"


    // $ANTLR start "rule__InterLanguageMappingEnd__Group__8__Impl"
    // InternalPerspectiveDSL.g:3324:1: rule__InterLanguageMappingEnd__Group__8__Impl : ( ( rule__InterLanguageMappingEnd__OriginAssignment_8 ) ) ;
    public final void rule__InterLanguageMappingEnd__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3328:1: ( ( ( rule__InterLanguageMappingEnd__OriginAssignment_8 ) ) )
            // InternalPerspectiveDSL.g:3329:1: ( ( rule__InterLanguageMappingEnd__OriginAssignment_8 ) )
            {
            // InternalPerspectiveDSL.g:3329:1: ( ( rule__InterLanguageMappingEnd__OriginAssignment_8 ) )
            // InternalPerspectiveDSL.g:3330:2: ( rule__InterLanguageMappingEnd__OriginAssignment_8 )
            {
             before(grammarAccess.getInterLanguageMappingEndAccess().getOriginAssignment_8()); 
            // InternalPerspectiveDSL.g:3331:2: ( rule__InterLanguageMappingEnd__OriginAssignment_8 )
            // InternalPerspectiveDSL.g:3331:3: rule__InterLanguageMappingEnd__OriginAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__InterLanguageMappingEnd__OriginAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getInterLanguageMappingEndAccess().getOriginAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterLanguageMappingEnd__Group__8__Impl"


    // $ANTLR start "rule__InterLanguageMappingEnd__Group__9"
    // InternalPerspectiveDSL.g:3339:1: rule__InterLanguageMappingEnd__Group__9 : rule__InterLanguageMappingEnd__Group__9__Impl rule__InterLanguageMappingEnd__Group__10 ;
    public final void rule__InterLanguageMappingEnd__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3343:1: ( rule__InterLanguageMappingEnd__Group__9__Impl rule__InterLanguageMappingEnd__Group__10 )
            // InternalPerspectiveDSL.g:3344:2: rule__InterLanguageMappingEnd__Group__9__Impl rule__InterLanguageMappingEnd__Group__10
            {
            pushFollow(FOLLOW_11);
            rule__InterLanguageMappingEnd__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterLanguageMappingEnd__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterLanguageMappingEnd__Group__9"


    // $ANTLR start "rule__InterLanguageMappingEnd__Group__9__Impl"
    // InternalPerspectiveDSL.g:3351:1: rule__InterLanguageMappingEnd__Group__9__Impl : ( 'destination' ) ;
    public final void rule__InterLanguageMappingEnd__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3355:1: ( ( 'destination' ) )
            // InternalPerspectiveDSL.g:3356:1: ( 'destination' )
            {
            // InternalPerspectiveDSL.g:3356:1: ( 'destination' )
            // InternalPerspectiveDSL.g:3357:2: 'destination'
            {
             before(grammarAccess.getInterLanguageMappingEndAccess().getDestinationKeyword_9()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getInterLanguageMappingEndAccess().getDestinationKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterLanguageMappingEnd__Group__9__Impl"


    // $ANTLR start "rule__InterLanguageMappingEnd__Group__10"
    // InternalPerspectiveDSL.g:3366:1: rule__InterLanguageMappingEnd__Group__10 : rule__InterLanguageMappingEnd__Group__10__Impl rule__InterLanguageMappingEnd__Group__11 ;
    public final void rule__InterLanguageMappingEnd__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3370:1: ( rule__InterLanguageMappingEnd__Group__10__Impl rule__InterLanguageMappingEnd__Group__11 )
            // InternalPerspectiveDSL.g:3371:2: rule__InterLanguageMappingEnd__Group__10__Impl rule__InterLanguageMappingEnd__Group__11
            {
            pushFollow(FOLLOW_9);
            rule__InterLanguageMappingEnd__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterLanguageMappingEnd__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterLanguageMappingEnd__Group__10"


    // $ANTLR start "rule__InterLanguageMappingEnd__Group__10__Impl"
    // InternalPerspectiveDSL.g:3378:1: rule__InterLanguageMappingEnd__Group__10__Impl : ( ':' ) ;
    public final void rule__InterLanguageMappingEnd__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3382:1: ( ( ':' ) )
            // InternalPerspectiveDSL.g:3383:1: ( ':' )
            {
            // InternalPerspectiveDSL.g:3383:1: ( ':' )
            // InternalPerspectiveDSL.g:3384:2: ':'
            {
             before(grammarAccess.getInterLanguageMappingEndAccess().getColonKeyword_10()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getInterLanguageMappingEndAccess().getColonKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterLanguageMappingEnd__Group__10__Impl"


    // $ANTLR start "rule__InterLanguageMappingEnd__Group__11"
    // InternalPerspectiveDSL.g:3393:1: rule__InterLanguageMappingEnd__Group__11 : rule__InterLanguageMappingEnd__Group__11__Impl rule__InterLanguageMappingEnd__Group__12 ;
    public final void rule__InterLanguageMappingEnd__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3397:1: ( rule__InterLanguageMappingEnd__Group__11__Impl rule__InterLanguageMappingEnd__Group__12 )
            // InternalPerspectiveDSL.g:3398:2: rule__InterLanguageMappingEnd__Group__11__Impl rule__InterLanguageMappingEnd__Group__12
            {
            pushFollow(FOLLOW_21);
            rule__InterLanguageMappingEnd__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InterLanguageMappingEnd__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterLanguageMappingEnd__Group__11"


    // $ANTLR start "rule__InterLanguageMappingEnd__Group__11__Impl"
    // InternalPerspectiveDSL.g:3405:1: rule__InterLanguageMappingEnd__Group__11__Impl : ( ( rule__InterLanguageMappingEnd__DestinationAssignment_11 ) ) ;
    public final void rule__InterLanguageMappingEnd__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3409:1: ( ( ( rule__InterLanguageMappingEnd__DestinationAssignment_11 ) ) )
            // InternalPerspectiveDSL.g:3410:1: ( ( rule__InterLanguageMappingEnd__DestinationAssignment_11 ) )
            {
            // InternalPerspectiveDSL.g:3410:1: ( ( rule__InterLanguageMappingEnd__DestinationAssignment_11 ) )
            // InternalPerspectiveDSL.g:3411:2: ( rule__InterLanguageMappingEnd__DestinationAssignment_11 )
            {
             before(grammarAccess.getInterLanguageMappingEndAccess().getDestinationAssignment_11()); 
            // InternalPerspectiveDSL.g:3412:2: ( rule__InterLanguageMappingEnd__DestinationAssignment_11 )
            // InternalPerspectiveDSL.g:3412:3: rule__InterLanguageMappingEnd__DestinationAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__InterLanguageMappingEnd__DestinationAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getInterLanguageMappingEndAccess().getDestinationAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterLanguageMappingEnd__Group__11__Impl"


    // $ANTLR start "rule__InterLanguageMappingEnd__Group__12"
    // InternalPerspectiveDSL.g:3420:1: rule__InterLanguageMappingEnd__Group__12 : rule__InterLanguageMappingEnd__Group__12__Impl ;
    public final void rule__InterLanguageMappingEnd__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3424:1: ( rule__InterLanguageMappingEnd__Group__12__Impl )
            // InternalPerspectiveDSL.g:3425:2: rule__InterLanguageMappingEnd__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InterLanguageMappingEnd__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterLanguageMappingEnd__Group__12"


    // $ANTLR start "rule__InterLanguageMappingEnd__Group__12__Impl"
    // InternalPerspectiveDSL.g:3431:1: rule__InterLanguageMappingEnd__Group__12__Impl : ( '}' ) ;
    public final void rule__InterLanguageMappingEnd__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3435:1: ( ( '}' ) )
            // InternalPerspectiveDSL.g:3436:1: ( '}' )
            {
            // InternalPerspectiveDSL.g:3436:1: ( '}' )
            // InternalPerspectiveDSL.g:3437:2: '}'
            {
             before(grammarAccess.getInterLanguageMappingEndAccess().getRightCurlyBracketKeyword_12()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getInterLanguageMappingEndAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterLanguageMappingEnd__Group__12__Impl"


    // $ANTLR start "rule__Action__Group__0"
    // InternalPerspectiveDSL.g:3447:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3451:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // InternalPerspectiveDSL.g:3452:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FOLLOW_46);
            rule__Action__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__0"


    // $ANTLR start "rule__Action__Group__0__Impl"
    // InternalPerspectiveDSL.g:3459:1: rule__Action__Group__0__Impl : ( 'action' ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3463:1: ( ( 'action' ) )
            // InternalPerspectiveDSL.g:3464:1: ( 'action' )
            {
            // InternalPerspectiveDSL.g:3464:1: ( 'action' )
            // InternalPerspectiveDSL.g:3465:2: 'action'
            {
             before(grammarAccess.getActionAccess().getActionKeyword_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getActionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__0__Impl"


    // $ANTLR start "rule__Action__Group__1"
    // InternalPerspectiveDSL.g:3474:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3478:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // InternalPerspectiveDSL.g:3479:2: rule__Action__Group__1__Impl rule__Action__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Action__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__1"


    // $ANTLR start "rule__Action__Group__1__Impl"
    // InternalPerspectiveDSL.g:3486:1: rule__Action__Group__1__Impl : ( ( rule__Action__ActionTypeAssignment_1 ) ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3490:1: ( ( ( rule__Action__ActionTypeAssignment_1 ) ) )
            // InternalPerspectiveDSL.g:3491:1: ( ( rule__Action__ActionTypeAssignment_1 ) )
            {
            // InternalPerspectiveDSL.g:3491:1: ( ( rule__Action__ActionTypeAssignment_1 ) )
            // InternalPerspectiveDSL.g:3492:2: ( rule__Action__ActionTypeAssignment_1 )
            {
             before(grammarAccess.getActionAccess().getActionTypeAssignment_1()); 
            // InternalPerspectiveDSL.g:3493:2: ( rule__Action__ActionTypeAssignment_1 )
            // InternalPerspectiveDSL.g:3493:3: rule__Action__ActionTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Action__ActionTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getActionTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__1__Impl"


    // $ANTLR start "rule__Action__Group__2"
    // InternalPerspectiveDSL.g:3501:1: rule__Action__Group__2 : rule__Action__Group__2__Impl rule__Action__Group__3 ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3505:1: ( rule__Action__Group__2__Impl rule__Action__Group__3 )
            // InternalPerspectiveDSL.g:3506:2: rule__Action__Group__2__Impl rule__Action__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Action__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__2"


    // $ANTLR start "rule__Action__Group__2__Impl"
    // InternalPerspectiveDSL.g:3513:1: rule__Action__Group__2__Impl : ( ( rule__Action__RoleNameAssignment_2 ) ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3517:1: ( ( ( rule__Action__RoleNameAssignment_2 ) ) )
            // InternalPerspectiveDSL.g:3518:1: ( ( rule__Action__RoleNameAssignment_2 ) )
            {
            // InternalPerspectiveDSL.g:3518:1: ( ( rule__Action__RoleNameAssignment_2 ) )
            // InternalPerspectiveDSL.g:3519:2: ( rule__Action__RoleNameAssignment_2 )
            {
             before(grammarAccess.getActionAccess().getRoleNameAssignment_2()); 
            // InternalPerspectiveDSL.g:3520:2: ( rule__Action__RoleNameAssignment_2 )
            // InternalPerspectiveDSL.g:3520:3: rule__Action__RoleNameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Action__RoleNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getRoleNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__2__Impl"


    // $ANTLR start "rule__Action__Group__3"
    // InternalPerspectiveDSL.g:3528:1: rule__Action__Group__3 : rule__Action__Group__3__Impl rule__Action__Group__4 ;
    public final void rule__Action__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3532:1: ( rule__Action__Group__3__Impl rule__Action__Group__4 )
            // InternalPerspectiveDSL.g:3533:2: rule__Action__Group__3__Impl rule__Action__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Action__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__3"


    // $ANTLR start "rule__Action__Group__3__Impl"
    // InternalPerspectiveDSL.g:3540:1: rule__Action__Group__3__Impl : ( ( rule__Action__NameAssignment_3 ) ) ;
    public final void rule__Action__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3544:1: ( ( ( rule__Action__NameAssignment_3 ) ) )
            // InternalPerspectiveDSL.g:3545:1: ( ( rule__Action__NameAssignment_3 ) )
            {
            // InternalPerspectiveDSL.g:3545:1: ( ( rule__Action__NameAssignment_3 ) )
            // InternalPerspectiveDSL.g:3546:2: ( rule__Action__NameAssignment_3 )
            {
             before(grammarAccess.getActionAccess().getNameAssignment_3()); 
            // InternalPerspectiveDSL.g:3547:2: ( rule__Action__NameAssignment_3 )
            // InternalPerspectiveDSL.g:3547:3: rule__Action__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Action__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__3__Impl"


    // $ANTLR start "rule__Action__Group__4"
    // InternalPerspectiveDSL.g:3555:1: rule__Action__Group__4 : rule__Action__Group__4__Impl ;
    public final void rule__Action__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3559:1: ( rule__Action__Group__4__Impl )
            // InternalPerspectiveDSL.g:3560:2: rule__Action__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__4"


    // $ANTLR start "rule__Action__Group__4__Impl"
    // InternalPerspectiveDSL.g:3566:1: rule__Action__Group__4__Impl : ( ';' ) ;
    public final void rule__Action__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3570:1: ( ( ';' ) )
            // InternalPerspectiveDSL.g:3571:1: ( ';' )
            {
            // InternalPerspectiveDSL.g:3571:1: ( ';' )
            // InternalPerspectiveDSL.g:3572:2: ';'
            {
             before(grammarAccess.getActionAccess().getSemicolonKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__4__Impl"


    // $ANTLR start "rule__IntraLanguageMapping__Group__0"
    // InternalPerspectiveDSL.g:3582:1: rule__IntraLanguageMapping__Group__0 : rule__IntraLanguageMapping__Group__0__Impl rule__IntraLanguageMapping__Group__1 ;
    public final void rule__IntraLanguageMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3586:1: ( rule__IntraLanguageMapping__Group__0__Impl rule__IntraLanguageMapping__Group__1 )
            // InternalPerspectiveDSL.g:3587:2: rule__IntraLanguageMapping__Group__0__Impl rule__IntraLanguageMapping__Group__1
            {
            pushFollow(FOLLOW_47);
            rule__IntraLanguageMapping__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntraLanguageMapping__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__Group__0"


    // $ANTLR start "rule__IntraLanguageMapping__Group__0__Impl"
    // InternalPerspectiveDSL.g:3594:1: rule__IntraLanguageMapping__Group__0__Impl : ( 'Intra' ) ;
    public final void rule__IntraLanguageMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3598:1: ( ( 'Intra' ) )
            // InternalPerspectiveDSL.g:3599:1: ( 'Intra' )
            {
            // InternalPerspectiveDSL.g:3599:1: ( 'Intra' )
            // InternalPerspectiveDSL.g:3600:2: 'Intra'
            {
             before(grammarAccess.getIntraLanguageMappingAccess().getIntraKeyword_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getIntraLanguageMappingAccess().getIntraKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__Group__0__Impl"


    // $ANTLR start "rule__IntraLanguageMapping__Group__1"
    // InternalPerspectiveDSL.g:3609:1: rule__IntraLanguageMapping__Group__1 : rule__IntraLanguageMapping__Group__1__Impl rule__IntraLanguageMapping__Group__2 ;
    public final void rule__IntraLanguageMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3613:1: ( rule__IntraLanguageMapping__Group__1__Impl rule__IntraLanguageMapping__Group__2 )
            // InternalPerspectiveDSL.g:3614:2: rule__IntraLanguageMapping__Group__1__Impl rule__IntraLanguageMapping__Group__2
            {
            pushFollow(FOLLOW_48);
            rule__IntraLanguageMapping__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntraLanguageMapping__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__Group__1"


    // $ANTLR start "rule__IntraLanguageMapping__Group__1__Impl"
    // InternalPerspectiveDSL.g:3621:1: rule__IntraLanguageMapping__Group__1__Impl : ( 'Language' ) ;
    public final void rule__IntraLanguageMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3625:1: ( ( 'Language' ) )
            // InternalPerspectiveDSL.g:3626:1: ( 'Language' )
            {
            // InternalPerspectiveDSL.g:3626:1: ( 'Language' )
            // InternalPerspectiveDSL.g:3627:2: 'Language'
            {
             before(grammarAccess.getIntraLanguageMappingAccess().getLanguageKeyword_1()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getIntraLanguageMappingAccess().getLanguageKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__Group__1__Impl"


    // $ANTLR start "rule__IntraLanguageMapping__Group__2"
    // InternalPerspectiveDSL.g:3636:1: rule__IntraLanguageMapping__Group__2 : rule__IntraLanguageMapping__Group__2__Impl rule__IntraLanguageMapping__Group__3 ;
    public final void rule__IntraLanguageMapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3640:1: ( rule__IntraLanguageMapping__Group__2__Impl rule__IntraLanguageMapping__Group__3 )
            // InternalPerspectiveDSL.g:3641:2: rule__IntraLanguageMapping__Group__2__Impl rule__IntraLanguageMapping__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__IntraLanguageMapping__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntraLanguageMapping__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__Group__2"


    // $ANTLR start "rule__IntraLanguageMapping__Group__2__Impl"
    // InternalPerspectiveDSL.g:3648:1: rule__IntraLanguageMapping__Group__2__Impl : ( 'Mapping' ) ;
    public final void rule__IntraLanguageMapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3652:1: ( ( 'Mapping' ) )
            // InternalPerspectiveDSL.g:3653:1: ( 'Mapping' )
            {
            // InternalPerspectiveDSL.g:3653:1: ( 'Mapping' )
            // InternalPerspectiveDSL.g:3654:2: 'Mapping'
            {
             before(grammarAccess.getIntraLanguageMappingAccess().getMappingKeyword_2()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getIntraLanguageMappingAccess().getMappingKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__Group__2__Impl"


    // $ANTLR start "rule__IntraLanguageMapping__Group__3"
    // InternalPerspectiveDSL.g:3663:1: rule__IntraLanguageMapping__Group__3 : rule__IntraLanguageMapping__Group__3__Impl rule__IntraLanguageMapping__Group__4 ;
    public final void rule__IntraLanguageMapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3667:1: ( rule__IntraLanguageMapping__Group__3__Impl rule__IntraLanguageMapping__Group__4 )
            // InternalPerspectiveDSL.g:3668:2: rule__IntraLanguageMapping__Group__3__Impl rule__IntraLanguageMapping__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__IntraLanguageMapping__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntraLanguageMapping__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__Group__3"


    // $ANTLR start "rule__IntraLanguageMapping__Group__3__Impl"
    // InternalPerspectiveDSL.g:3675:1: rule__IntraLanguageMapping__Group__3__Impl : ( ( rule__IntraLanguageMapping__NameAssignment_3 ) ) ;
    public final void rule__IntraLanguageMapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3679:1: ( ( ( rule__IntraLanguageMapping__NameAssignment_3 ) ) )
            // InternalPerspectiveDSL.g:3680:1: ( ( rule__IntraLanguageMapping__NameAssignment_3 ) )
            {
            // InternalPerspectiveDSL.g:3680:1: ( ( rule__IntraLanguageMapping__NameAssignment_3 ) )
            // InternalPerspectiveDSL.g:3681:2: ( rule__IntraLanguageMapping__NameAssignment_3 )
            {
             before(grammarAccess.getIntraLanguageMappingAccess().getNameAssignment_3()); 
            // InternalPerspectiveDSL.g:3682:2: ( rule__IntraLanguageMapping__NameAssignment_3 )
            // InternalPerspectiveDSL.g:3682:3: rule__IntraLanguageMapping__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__IntraLanguageMapping__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIntraLanguageMappingAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__Group__3__Impl"


    // $ANTLR start "rule__IntraLanguageMapping__Group__4"
    // InternalPerspectiveDSL.g:3690:1: rule__IntraLanguageMapping__Group__4 : rule__IntraLanguageMapping__Group__4__Impl rule__IntraLanguageMapping__Group__5 ;
    public final void rule__IntraLanguageMapping__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3694:1: ( rule__IntraLanguageMapping__Group__4__Impl rule__IntraLanguageMapping__Group__5 )
            // InternalPerspectiveDSL.g:3695:2: rule__IntraLanguageMapping__Group__4__Impl rule__IntraLanguageMapping__Group__5
            {
            pushFollow(FOLLOW_49);
            rule__IntraLanguageMapping__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntraLanguageMapping__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__Group__4"


    // $ANTLR start "rule__IntraLanguageMapping__Group__4__Impl"
    // InternalPerspectiveDSL.g:3702:1: rule__IntraLanguageMapping__Group__4__Impl : ( '{' ) ;
    public final void rule__IntraLanguageMapping__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3706:1: ( ( '{' ) )
            // InternalPerspectiveDSL.g:3707:1: ( '{' )
            {
            // InternalPerspectiveDSL.g:3707:1: ( '{' )
            // InternalPerspectiveDSL.g:3708:2: '{'
            {
             before(grammarAccess.getIntraLanguageMappingAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getIntraLanguageMappingAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__Group__4__Impl"


    // $ANTLR start "rule__IntraLanguageMapping__Group__5"
    // InternalPerspectiveDSL.g:3717:1: rule__IntraLanguageMapping__Group__5 : rule__IntraLanguageMapping__Group__5__Impl rule__IntraLanguageMapping__Group__6 ;
    public final void rule__IntraLanguageMapping__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3721:1: ( rule__IntraLanguageMapping__Group__5__Impl rule__IntraLanguageMapping__Group__6 )
            // InternalPerspectiveDSL.g:3722:2: rule__IntraLanguageMapping__Group__5__Impl rule__IntraLanguageMapping__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__IntraLanguageMapping__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntraLanguageMapping__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__Group__5"


    // $ANTLR start "rule__IntraLanguageMapping__Group__5__Impl"
    // InternalPerspectiveDSL.g:3729:1: rule__IntraLanguageMapping__Group__5__Impl : ( 'closure' ) ;
    public final void rule__IntraLanguageMapping__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3733:1: ( ( 'closure' ) )
            // InternalPerspectiveDSL.g:3734:1: ( 'closure' )
            {
            // InternalPerspectiveDSL.g:3734:1: ( 'closure' )
            // InternalPerspectiveDSL.g:3735:2: 'closure'
            {
             before(grammarAccess.getIntraLanguageMappingAccess().getClosureKeyword_5()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getIntraLanguageMappingAccess().getClosureKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__Group__5__Impl"


    // $ANTLR start "rule__IntraLanguageMapping__Group__6"
    // InternalPerspectiveDSL.g:3744:1: rule__IntraLanguageMapping__Group__6 : rule__IntraLanguageMapping__Group__6__Impl rule__IntraLanguageMapping__Group__7 ;
    public final void rule__IntraLanguageMapping__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3748:1: ( rule__IntraLanguageMapping__Group__6__Impl rule__IntraLanguageMapping__Group__7 )
            // InternalPerspectiveDSL.g:3749:2: rule__IntraLanguageMapping__Group__6__Impl rule__IntraLanguageMapping__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__IntraLanguageMapping__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntraLanguageMapping__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__Group__6"


    // $ANTLR start "rule__IntraLanguageMapping__Group__6__Impl"
    // InternalPerspectiveDSL.g:3756:1: rule__IntraLanguageMapping__Group__6__Impl : ( ':' ) ;
    public final void rule__IntraLanguageMapping__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3760:1: ( ( ':' ) )
            // InternalPerspectiveDSL.g:3761:1: ( ':' )
            {
            // InternalPerspectiveDSL.g:3761:1: ( ':' )
            // InternalPerspectiveDSL.g:3762:2: ':'
            {
             before(grammarAccess.getIntraLanguageMappingAccess().getColonKeyword_6()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getIntraLanguageMappingAccess().getColonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__Group__6__Impl"


    // $ANTLR start "rule__IntraLanguageMapping__Group__7"
    // InternalPerspectiveDSL.g:3771:1: rule__IntraLanguageMapping__Group__7 : rule__IntraLanguageMapping__Group__7__Impl rule__IntraLanguageMapping__Group__8 ;
    public final void rule__IntraLanguageMapping__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3775:1: ( rule__IntraLanguageMapping__Group__7__Impl rule__IntraLanguageMapping__Group__8 )
            // InternalPerspectiveDSL.g:3776:2: rule__IntraLanguageMapping__Group__7__Impl rule__IntraLanguageMapping__Group__8
            {
            pushFollow(FOLLOW_50);
            rule__IntraLanguageMapping__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntraLanguageMapping__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__Group__7"


    // $ANTLR start "rule__IntraLanguageMapping__Group__7__Impl"
    // InternalPerspectiveDSL.g:3783:1: rule__IntraLanguageMapping__Group__7__Impl : ( ( rule__IntraLanguageMapping__ClosureAssignment_7 ) ) ;
    public final void rule__IntraLanguageMapping__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3787:1: ( ( ( rule__IntraLanguageMapping__ClosureAssignment_7 ) ) )
            // InternalPerspectiveDSL.g:3788:1: ( ( rule__IntraLanguageMapping__ClosureAssignment_7 ) )
            {
            // InternalPerspectiveDSL.g:3788:1: ( ( rule__IntraLanguageMapping__ClosureAssignment_7 ) )
            // InternalPerspectiveDSL.g:3789:2: ( rule__IntraLanguageMapping__ClosureAssignment_7 )
            {
             before(grammarAccess.getIntraLanguageMappingAccess().getClosureAssignment_7()); 
            // InternalPerspectiveDSL.g:3790:2: ( rule__IntraLanguageMapping__ClosureAssignment_7 )
            // InternalPerspectiveDSL.g:3790:3: rule__IntraLanguageMapping__ClosureAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__IntraLanguageMapping__ClosureAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getIntraLanguageMappingAccess().getClosureAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__Group__7__Impl"


    // $ANTLR start "rule__IntraLanguageMapping__Group__8"
    // InternalPerspectiveDSL.g:3798:1: rule__IntraLanguageMapping__Group__8 : rule__IntraLanguageMapping__Group__8__Impl rule__IntraLanguageMapping__Group__9 ;
    public final void rule__IntraLanguageMapping__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3802:1: ( rule__IntraLanguageMapping__Group__8__Impl rule__IntraLanguageMapping__Group__9 )
            // InternalPerspectiveDSL.g:3803:2: rule__IntraLanguageMapping__Group__8__Impl rule__IntraLanguageMapping__Group__9
            {
            pushFollow(FOLLOW_11);
            rule__IntraLanguageMapping__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntraLanguageMapping__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__Group__8"


    // $ANTLR start "rule__IntraLanguageMapping__Group__8__Impl"
    // InternalPerspectiveDSL.g:3810:1: rule__IntraLanguageMapping__Group__8__Impl : ( 'reuse' ) ;
    public final void rule__IntraLanguageMapping__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3814:1: ( ( 'reuse' ) )
            // InternalPerspectiveDSL.g:3815:1: ( 'reuse' )
            {
            // InternalPerspectiveDSL.g:3815:1: ( 'reuse' )
            // InternalPerspectiveDSL.g:3816:2: 'reuse'
            {
             before(grammarAccess.getIntraLanguageMappingAccess().getReuseKeyword_8()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getIntraLanguageMappingAccess().getReuseKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__Group__8__Impl"


    // $ANTLR start "rule__IntraLanguageMapping__Group__9"
    // InternalPerspectiveDSL.g:3825:1: rule__IntraLanguageMapping__Group__9 : rule__IntraLanguageMapping__Group__9__Impl rule__IntraLanguageMapping__Group__10 ;
    public final void rule__IntraLanguageMapping__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3829:1: ( rule__IntraLanguageMapping__Group__9__Impl rule__IntraLanguageMapping__Group__10 )
            // InternalPerspectiveDSL.g:3830:2: rule__IntraLanguageMapping__Group__9__Impl rule__IntraLanguageMapping__Group__10
            {
            pushFollow(FOLLOW_9);
            rule__IntraLanguageMapping__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntraLanguageMapping__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__Group__9"


    // $ANTLR start "rule__IntraLanguageMapping__Group__9__Impl"
    // InternalPerspectiveDSL.g:3837:1: rule__IntraLanguageMapping__Group__9__Impl : ( ':' ) ;
    public final void rule__IntraLanguageMapping__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3841:1: ( ( ':' ) )
            // InternalPerspectiveDSL.g:3842:1: ( ':' )
            {
            // InternalPerspectiveDSL.g:3842:1: ( ':' )
            // InternalPerspectiveDSL.g:3843:2: ':'
            {
             before(grammarAccess.getIntraLanguageMappingAccess().getColonKeyword_9()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getIntraLanguageMappingAccess().getColonKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__Group__9__Impl"


    // $ANTLR start "rule__IntraLanguageMapping__Group__10"
    // InternalPerspectiveDSL.g:3852:1: rule__IntraLanguageMapping__Group__10 : rule__IntraLanguageMapping__Group__10__Impl rule__IntraLanguageMapping__Group__11 ;
    public final void rule__IntraLanguageMapping__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3856:1: ( rule__IntraLanguageMapping__Group__10__Impl rule__IntraLanguageMapping__Group__11 )
            // InternalPerspectiveDSL.g:3857:2: rule__IntraLanguageMapping__Group__10__Impl rule__IntraLanguageMapping__Group__11
            {
            pushFollow(FOLLOW_51);
            rule__IntraLanguageMapping__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntraLanguageMapping__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__Group__10"


    // $ANTLR start "rule__IntraLanguageMapping__Group__10__Impl"
    // InternalPerspectiveDSL.g:3864:1: rule__IntraLanguageMapping__Group__10__Impl : ( ( rule__IntraLanguageMapping__ReuseAssignment_10 ) ) ;
    public final void rule__IntraLanguageMapping__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3868:1: ( ( ( rule__IntraLanguageMapping__ReuseAssignment_10 ) ) )
            // InternalPerspectiveDSL.g:3869:1: ( ( rule__IntraLanguageMapping__ReuseAssignment_10 ) )
            {
            // InternalPerspectiveDSL.g:3869:1: ( ( rule__IntraLanguageMapping__ReuseAssignment_10 ) )
            // InternalPerspectiveDSL.g:3870:2: ( rule__IntraLanguageMapping__ReuseAssignment_10 )
            {
             before(grammarAccess.getIntraLanguageMappingAccess().getReuseAssignment_10()); 
            // InternalPerspectiveDSL.g:3871:2: ( rule__IntraLanguageMapping__ReuseAssignment_10 )
            // InternalPerspectiveDSL.g:3871:3: rule__IntraLanguageMapping__ReuseAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__IntraLanguageMapping__ReuseAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getIntraLanguageMappingAccess().getReuseAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__Group__10__Impl"


    // $ANTLR start "rule__IntraLanguageMapping__Group__11"
    // InternalPerspectiveDSL.g:3879:1: rule__IntraLanguageMapping__Group__11 : rule__IntraLanguageMapping__Group__11__Impl rule__IntraLanguageMapping__Group__12 ;
    public final void rule__IntraLanguageMapping__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3883:1: ( rule__IntraLanguageMapping__Group__11__Impl rule__IntraLanguageMapping__Group__12 )
            // InternalPerspectiveDSL.g:3884:2: rule__IntraLanguageMapping__Group__11__Impl rule__IntraLanguageMapping__Group__12
            {
            pushFollow(FOLLOW_11);
            rule__IntraLanguageMapping__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntraLanguageMapping__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__Group__11"


    // $ANTLR start "rule__IntraLanguageMapping__Group__11__Impl"
    // InternalPerspectiveDSL.g:3891:1: rule__IntraLanguageMapping__Group__11__Impl : ( 'increaseDepth' ) ;
    public final void rule__IntraLanguageMapping__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3895:1: ( ( 'increaseDepth' ) )
            // InternalPerspectiveDSL.g:3896:1: ( 'increaseDepth' )
            {
            // InternalPerspectiveDSL.g:3896:1: ( 'increaseDepth' )
            // InternalPerspectiveDSL.g:3897:2: 'increaseDepth'
            {
             before(grammarAccess.getIntraLanguageMappingAccess().getIncreaseDepthKeyword_11()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getIntraLanguageMappingAccess().getIncreaseDepthKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__Group__11__Impl"


    // $ANTLR start "rule__IntraLanguageMapping__Group__12"
    // InternalPerspectiveDSL.g:3906:1: rule__IntraLanguageMapping__Group__12 : rule__IntraLanguageMapping__Group__12__Impl rule__IntraLanguageMapping__Group__13 ;
    public final void rule__IntraLanguageMapping__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3910:1: ( rule__IntraLanguageMapping__Group__12__Impl rule__IntraLanguageMapping__Group__13 )
            // InternalPerspectiveDSL.g:3911:2: rule__IntraLanguageMapping__Group__12__Impl rule__IntraLanguageMapping__Group__13
            {
            pushFollow(FOLLOW_9);
            rule__IntraLanguageMapping__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntraLanguageMapping__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__Group__12"


    // $ANTLR start "rule__IntraLanguageMapping__Group__12__Impl"
    // InternalPerspectiveDSL.g:3918:1: rule__IntraLanguageMapping__Group__12__Impl : ( ':' ) ;
    public final void rule__IntraLanguageMapping__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3922:1: ( ( ':' ) )
            // InternalPerspectiveDSL.g:3923:1: ( ':' )
            {
            // InternalPerspectiveDSL.g:3923:1: ( ':' )
            // InternalPerspectiveDSL.g:3924:2: ':'
            {
             before(grammarAccess.getIntraLanguageMappingAccess().getColonKeyword_12()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getIntraLanguageMappingAccess().getColonKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__Group__12__Impl"


    // $ANTLR start "rule__IntraLanguageMapping__Group__13"
    // InternalPerspectiveDSL.g:3933:1: rule__IntraLanguageMapping__Group__13 : rule__IntraLanguageMapping__Group__13__Impl rule__IntraLanguageMapping__Group__14 ;
    public final void rule__IntraLanguageMapping__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3937:1: ( rule__IntraLanguageMapping__Group__13__Impl rule__IntraLanguageMapping__Group__14 )
            // InternalPerspectiveDSL.g:3938:2: rule__IntraLanguageMapping__Group__13__Impl rule__IntraLanguageMapping__Group__14
            {
            pushFollow(FOLLOW_52);
            rule__IntraLanguageMapping__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntraLanguageMapping__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__Group__13"


    // $ANTLR start "rule__IntraLanguageMapping__Group__13__Impl"
    // InternalPerspectiveDSL.g:3945:1: rule__IntraLanguageMapping__Group__13__Impl : ( ( rule__IntraLanguageMapping__IncreaseDepthAssignment_13 ) ) ;
    public final void rule__IntraLanguageMapping__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3949:1: ( ( ( rule__IntraLanguageMapping__IncreaseDepthAssignment_13 ) ) )
            // InternalPerspectiveDSL.g:3950:1: ( ( rule__IntraLanguageMapping__IncreaseDepthAssignment_13 ) )
            {
            // InternalPerspectiveDSL.g:3950:1: ( ( rule__IntraLanguageMapping__IncreaseDepthAssignment_13 ) )
            // InternalPerspectiveDSL.g:3951:2: ( rule__IntraLanguageMapping__IncreaseDepthAssignment_13 )
            {
             before(grammarAccess.getIntraLanguageMappingAccess().getIncreaseDepthAssignment_13()); 
            // InternalPerspectiveDSL.g:3952:2: ( rule__IntraLanguageMapping__IncreaseDepthAssignment_13 )
            // InternalPerspectiveDSL.g:3952:3: rule__IntraLanguageMapping__IncreaseDepthAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__IntraLanguageMapping__IncreaseDepthAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getIntraLanguageMappingAccess().getIncreaseDepthAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__Group__13__Impl"


    // $ANTLR start "rule__IntraLanguageMapping__Group__14"
    // InternalPerspectiveDSL.g:3960:1: rule__IntraLanguageMapping__Group__14 : rule__IntraLanguageMapping__Group__14__Impl rule__IntraLanguageMapping__Group__15 ;
    public final void rule__IntraLanguageMapping__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3964:1: ( rule__IntraLanguageMapping__Group__14__Impl rule__IntraLanguageMapping__Group__15 )
            // InternalPerspectiveDSL.g:3965:2: rule__IntraLanguageMapping__Group__14__Impl rule__IntraLanguageMapping__Group__15
            {
            pushFollow(FOLLOW_11);
            rule__IntraLanguageMapping__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntraLanguageMapping__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__Group__14"


    // $ANTLR start "rule__IntraLanguageMapping__Group__14__Impl"
    // InternalPerspectiveDSL.g:3972:1: rule__IntraLanguageMapping__Group__14__Impl : ( 'changeModel' ) ;
    public final void rule__IntraLanguageMapping__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3976:1: ( ( 'changeModel' ) )
            // InternalPerspectiveDSL.g:3977:1: ( 'changeModel' )
            {
            // InternalPerspectiveDSL.g:3977:1: ( 'changeModel' )
            // InternalPerspectiveDSL.g:3978:2: 'changeModel'
            {
             before(grammarAccess.getIntraLanguageMappingAccess().getChangeModelKeyword_14()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getIntraLanguageMappingAccess().getChangeModelKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__Group__14__Impl"


    // $ANTLR start "rule__IntraLanguageMapping__Group__15"
    // InternalPerspectiveDSL.g:3987:1: rule__IntraLanguageMapping__Group__15 : rule__IntraLanguageMapping__Group__15__Impl rule__IntraLanguageMapping__Group__16 ;
    public final void rule__IntraLanguageMapping__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:3991:1: ( rule__IntraLanguageMapping__Group__15__Impl rule__IntraLanguageMapping__Group__16 )
            // InternalPerspectiveDSL.g:3992:2: rule__IntraLanguageMapping__Group__15__Impl rule__IntraLanguageMapping__Group__16
            {
            pushFollow(FOLLOW_9);
            rule__IntraLanguageMapping__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntraLanguageMapping__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__Group__15"


    // $ANTLR start "rule__IntraLanguageMapping__Group__15__Impl"
    // InternalPerspectiveDSL.g:3999:1: rule__IntraLanguageMapping__Group__15__Impl : ( ':' ) ;
    public final void rule__IntraLanguageMapping__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4003:1: ( ( ':' ) )
            // InternalPerspectiveDSL.g:4004:1: ( ':' )
            {
            // InternalPerspectiveDSL.g:4004:1: ( ':' )
            // InternalPerspectiveDSL.g:4005:2: ':'
            {
             before(grammarAccess.getIntraLanguageMappingAccess().getColonKeyword_15()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getIntraLanguageMappingAccess().getColonKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__Group__15__Impl"


    // $ANTLR start "rule__IntraLanguageMapping__Group__16"
    // InternalPerspectiveDSL.g:4014:1: rule__IntraLanguageMapping__Group__16 : rule__IntraLanguageMapping__Group__16__Impl rule__IntraLanguageMapping__Group__17 ;
    public final void rule__IntraLanguageMapping__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4018:1: ( rule__IntraLanguageMapping__Group__16__Impl rule__IntraLanguageMapping__Group__17 )
            // InternalPerspectiveDSL.g:4019:2: rule__IntraLanguageMapping__Group__16__Impl rule__IntraLanguageMapping__Group__17
            {
            pushFollow(FOLLOW_31);
            rule__IntraLanguageMapping__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntraLanguageMapping__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__Group__16"


    // $ANTLR start "rule__IntraLanguageMapping__Group__16__Impl"
    // InternalPerspectiveDSL.g:4026:1: rule__IntraLanguageMapping__Group__16__Impl : ( ( rule__IntraLanguageMapping__ChangeModelAssignment_16 ) ) ;
    public final void rule__IntraLanguageMapping__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4030:1: ( ( ( rule__IntraLanguageMapping__ChangeModelAssignment_16 ) ) )
            // InternalPerspectiveDSL.g:4031:1: ( ( rule__IntraLanguageMapping__ChangeModelAssignment_16 ) )
            {
            // InternalPerspectiveDSL.g:4031:1: ( ( rule__IntraLanguageMapping__ChangeModelAssignment_16 ) )
            // InternalPerspectiveDSL.g:4032:2: ( rule__IntraLanguageMapping__ChangeModelAssignment_16 )
            {
             before(grammarAccess.getIntraLanguageMappingAccess().getChangeModelAssignment_16()); 
            // InternalPerspectiveDSL.g:4033:2: ( rule__IntraLanguageMapping__ChangeModelAssignment_16 )
            // InternalPerspectiveDSL.g:4033:3: rule__IntraLanguageMapping__ChangeModelAssignment_16
            {
            pushFollow(FOLLOW_2);
            rule__IntraLanguageMapping__ChangeModelAssignment_16();

            state._fsp--;


            }

             after(grammarAccess.getIntraLanguageMappingAccess().getChangeModelAssignment_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__Group__16__Impl"


    // $ANTLR start "rule__IntraLanguageMapping__Group__17"
    // InternalPerspectiveDSL.g:4041:1: rule__IntraLanguageMapping__Group__17 : rule__IntraLanguageMapping__Group__17__Impl rule__IntraLanguageMapping__Group__18 ;
    public final void rule__IntraLanguageMapping__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4045:1: ( rule__IntraLanguageMapping__Group__17__Impl rule__IntraLanguageMapping__Group__18 )
            // InternalPerspectiveDSL.g:4046:2: rule__IntraLanguageMapping__Group__17__Impl rule__IntraLanguageMapping__Group__18
            {
            pushFollow(FOLLOW_11);
            rule__IntraLanguageMapping__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntraLanguageMapping__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__Group__17"


    // $ANTLR start "rule__IntraLanguageMapping__Group__17__Impl"
    // InternalPerspectiveDSL.g:4053:1: rule__IntraLanguageMapping__Group__17__Impl : ( 'fromElement' ) ;
    public final void rule__IntraLanguageMapping__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4057:1: ( ( 'fromElement' ) )
            // InternalPerspectiveDSL.g:4058:1: ( 'fromElement' )
            {
            // InternalPerspectiveDSL.g:4058:1: ( 'fromElement' )
            // InternalPerspectiveDSL.g:4059:2: 'fromElement'
            {
             before(grammarAccess.getIntraLanguageMappingAccess().getFromElementKeyword_17()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getIntraLanguageMappingAccess().getFromElementKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__Group__17__Impl"


    // $ANTLR start "rule__IntraLanguageMapping__Group__18"
    // InternalPerspectiveDSL.g:4068:1: rule__IntraLanguageMapping__Group__18 : rule__IntraLanguageMapping__Group__18__Impl rule__IntraLanguageMapping__Group__19 ;
    public final void rule__IntraLanguageMapping__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4072:1: ( rule__IntraLanguageMapping__Group__18__Impl rule__IntraLanguageMapping__Group__19 )
            // InternalPerspectiveDSL.g:4073:2: rule__IntraLanguageMapping__Group__18__Impl rule__IntraLanguageMapping__Group__19
            {
            pushFollow(FOLLOW_4);
            rule__IntraLanguageMapping__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntraLanguageMapping__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__Group__18"


    // $ANTLR start "rule__IntraLanguageMapping__Group__18__Impl"
    // InternalPerspectiveDSL.g:4080:1: rule__IntraLanguageMapping__Group__18__Impl : ( ':' ) ;
    public final void rule__IntraLanguageMapping__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4084:1: ( ( ':' ) )
            // InternalPerspectiveDSL.g:4085:1: ( ':' )
            {
            // InternalPerspectiveDSL.g:4085:1: ( ':' )
            // InternalPerspectiveDSL.g:4086:2: ':'
            {
             before(grammarAccess.getIntraLanguageMappingAccess().getColonKeyword_18()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getIntraLanguageMappingAccess().getColonKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__Group__18__Impl"


    // $ANTLR start "rule__IntraLanguageMapping__Group__19"
    // InternalPerspectiveDSL.g:4095:1: rule__IntraLanguageMapping__Group__19 : rule__IntraLanguageMapping__Group__19__Impl rule__IntraLanguageMapping__Group__20 ;
    public final void rule__IntraLanguageMapping__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4099:1: ( rule__IntraLanguageMapping__Group__19__Impl rule__IntraLanguageMapping__Group__20 )
            // InternalPerspectiveDSL.g:4100:2: rule__IntraLanguageMapping__Group__19__Impl rule__IntraLanguageMapping__Group__20
            {
            pushFollow(FOLLOW_33);
            rule__IntraLanguageMapping__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntraLanguageMapping__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__Group__19"


    // $ANTLR start "rule__IntraLanguageMapping__Group__19__Impl"
    // InternalPerspectiveDSL.g:4107:1: rule__IntraLanguageMapping__Group__19__Impl : ( ( rule__IntraLanguageMapping__FromElementAssignment_19 ) ) ;
    public final void rule__IntraLanguageMapping__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4111:1: ( ( ( rule__IntraLanguageMapping__FromElementAssignment_19 ) ) )
            // InternalPerspectiveDSL.g:4112:1: ( ( rule__IntraLanguageMapping__FromElementAssignment_19 ) )
            {
            // InternalPerspectiveDSL.g:4112:1: ( ( rule__IntraLanguageMapping__FromElementAssignment_19 ) )
            // InternalPerspectiveDSL.g:4113:2: ( rule__IntraLanguageMapping__FromElementAssignment_19 )
            {
             before(grammarAccess.getIntraLanguageMappingAccess().getFromElementAssignment_19()); 
            // InternalPerspectiveDSL.g:4114:2: ( rule__IntraLanguageMapping__FromElementAssignment_19 )
            // InternalPerspectiveDSL.g:4114:3: rule__IntraLanguageMapping__FromElementAssignment_19
            {
            pushFollow(FOLLOW_2);
            rule__IntraLanguageMapping__FromElementAssignment_19();

            state._fsp--;


            }

             after(grammarAccess.getIntraLanguageMappingAccess().getFromElementAssignment_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__Group__19__Impl"


    // $ANTLR start "rule__IntraLanguageMapping__Group__20"
    // InternalPerspectiveDSL.g:4122:1: rule__IntraLanguageMapping__Group__20 : rule__IntraLanguageMapping__Group__20__Impl rule__IntraLanguageMapping__Group__21 ;
    public final void rule__IntraLanguageMapping__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4126:1: ( rule__IntraLanguageMapping__Group__20__Impl rule__IntraLanguageMapping__Group__21 )
            // InternalPerspectiveDSL.g:4127:2: rule__IntraLanguageMapping__Group__20__Impl rule__IntraLanguageMapping__Group__21
            {
            pushFollow(FOLLOW_8);
            rule__IntraLanguageMapping__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntraLanguageMapping__Group__21();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__Group__20"


    // $ANTLR start "rule__IntraLanguageMapping__Group__20__Impl"
    // InternalPerspectiveDSL.g:4134:1: rule__IntraLanguageMapping__Group__20__Impl : ( 'fromGetElement' ) ;
    public final void rule__IntraLanguageMapping__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4138:1: ( ( 'fromGetElement' ) )
            // InternalPerspectiveDSL.g:4139:1: ( 'fromGetElement' )
            {
            // InternalPerspectiveDSL.g:4139:1: ( 'fromGetElement' )
            // InternalPerspectiveDSL.g:4140:2: 'fromGetElement'
            {
             before(grammarAccess.getIntraLanguageMappingAccess().getFromGetElementKeyword_20()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getIntraLanguageMappingAccess().getFromGetElementKeyword_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__Group__20__Impl"


    // $ANTLR start "rule__IntraLanguageMapping__Group__21"
    // InternalPerspectiveDSL.g:4149:1: rule__IntraLanguageMapping__Group__21 : rule__IntraLanguageMapping__Group__21__Impl rule__IntraLanguageMapping__Group__22 ;
    public final void rule__IntraLanguageMapping__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4153:1: ( rule__IntraLanguageMapping__Group__21__Impl rule__IntraLanguageMapping__Group__22 )
            // InternalPerspectiveDSL.g:4154:2: rule__IntraLanguageMapping__Group__21__Impl rule__IntraLanguageMapping__Group__22
            {
            pushFollow(FOLLOW_9);
            rule__IntraLanguageMapping__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntraLanguageMapping__Group__22();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__Group__21"


    // $ANTLR start "rule__IntraLanguageMapping__Group__21__Impl"
    // InternalPerspectiveDSL.g:4161:1: rule__IntraLanguageMapping__Group__21__Impl : ( ( rule__IntraLanguageMapping__FromGetElementAssignment_21 ) ) ;
    public final void rule__IntraLanguageMapping__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4165:1: ( ( ( rule__IntraLanguageMapping__FromGetElementAssignment_21 ) ) )
            // InternalPerspectiveDSL.g:4166:1: ( ( rule__IntraLanguageMapping__FromGetElementAssignment_21 ) )
            {
            // InternalPerspectiveDSL.g:4166:1: ( ( rule__IntraLanguageMapping__FromGetElementAssignment_21 ) )
            // InternalPerspectiveDSL.g:4167:2: ( rule__IntraLanguageMapping__FromGetElementAssignment_21 )
            {
             before(grammarAccess.getIntraLanguageMappingAccess().getFromGetElementAssignment_21()); 
            // InternalPerspectiveDSL.g:4168:2: ( rule__IntraLanguageMapping__FromGetElementAssignment_21 )
            // InternalPerspectiveDSL.g:4168:3: rule__IntraLanguageMapping__FromGetElementAssignment_21
            {
            pushFollow(FOLLOW_2);
            rule__IntraLanguageMapping__FromGetElementAssignment_21();

            state._fsp--;


            }

             after(grammarAccess.getIntraLanguageMappingAccess().getFromGetElementAssignment_21()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__Group__21__Impl"


    // $ANTLR start "rule__IntraLanguageMapping__Group__22"
    // InternalPerspectiveDSL.g:4176:1: rule__IntraLanguageMapping__Group__22 : rule__IntraLanguageMapping__Group__22__Impl rule__IntraLanguageMapping__Group__23 ;
    public final void rule__IntraLanguageMapping__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4180:1: ( rule__IntraLanguageMapping__Group__22__Impl rule__IntraLanguageMapping__Group__23 )
            // InternalPerspectiveDSL.g:4181:2: rule__IntraLanguageMapping__Group__22__Impl rule__IntraLanguageMapping__Group__23
            {
            pushFollow(FOLLOW_53);
            rule__IntraLanguageMapping__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntraLanguageMapping__Group__23();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__Group__22"


    // $ANTLR start "rule__IntraLanguageMapping__Group__22__Impl"
    // InternalPerspectiveDSL.g:4188:1: rule__IntraLanguageMapping__Group__22__Impl : ( ';' ) ;
    public final void rule__IntraLanguageMapping__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4192:1: ( ( ';' ) )
            // InternalPerspectiveDSL.g:4193:1: ( ';' )
            {
            // InternalPerspectiveDSL.g:4193:1: ( ';' )
            // InternalPerspectiveDSL.g:4194:2: ';'
            {
             before(grammarAccess.getIntraLanguageMappingAccess().getSemicolonKeyword_22()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getIntraLanguageMappingAccess().getSemicolonKeyword_22()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__Group__22__Impl"


    // $ANTLR start "rule__IntraLanguageMapping__Group__23"
    // InternalPerspectiveDSL.g:4203:1: rule__IntraLanguageMapping__Group__23 : rule__IntraLanguageMapping__Group__23__Impl rule__IntraLanguageMapping__Group__24 ;
    public final void rule__IntraLanguageMapping__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4207:1: ( rule__IntraLanguageMapping__Group__23__Impl rule__IntraLanguageMapping__Group__24 )
            // InternalPerspectiveDSL.g:4208:2: rule__IntraLanguageMapping__Group__23__Impl rule__IntraLanguageMapping__Group__24
            {
            pushFollow(FOLLOW_11);
            rule__IntraLanguageMapping__Group__23__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntraLanguageMapping__Group__24();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__Group__23"


    // $ANTLR start "rule__IntraLanguageMapping__Group__23__Impl"
    // InternalPerspectiveDSL.g:4215:1: rule__IntraLanguageMapping__Group__23__Impl : ( 'hops' ) ;
    public final void rule__IntraLanguageMapping__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4219:1: ( ( 'hops' ) )
            // InternalPerspectiveDSL.g:4220:1: ( 'hops' )
            {
            // InternalPerspectiveDSL.g:4220:1: ( 'hops' )
            // InternalPerspectiveDSL.g:4221:2: 'hops'
            {
             before(grammarAccess.getIntraLanguageMappingAccess().getHopsKeyword_23()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getIntraLanguageMappingAccess().getHopsKeyword_23()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__Group__23__Impl"


    // $ANTLR start "rule__IntraLanguageMapping__Group__24"
    // InternalPerspectiveDSL.g:4230:1: rule__IntraLanguageMapping__Group__24 : rule__IntraLanguageMapping__Group__24__Impl rule__IntraLanguageMapping__Group__25 ;
    public final void rule__IntraLanguageMapping__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4234:1: ( rule__IntraLanguageMapping__Group__24__Impl rule__IntraLanguageMapping__Group__25 )
            // InternalPerspectiveDSL.g:4235:2: rule__IntraLanguageMapping__Group__24__Impl rule__IntraLanguageMapping__Group__25
            {
            pushFollow(FOLLOW_54);
            rule__IntraLanguageMapping__Group__24__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntraLanguageMapping__Group__25();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__Group__24"


    // $ANTLR start "rule__IntraLanguageMapping__Group__24__Impl"
    // InternalPerspectiveDSL.g:4242:1: rule__IntraLanguageMapping__Group__24__Impl : ( ':' ) ;
    public final void rule__IntraLanguageMapping__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4246:1: ( ( ':' ) )
            // InternalPerspectiveDSL.g:4247:1: ( ':' )
            {
            // InternalPerspectiveDSL.g:4247:1: ( ':' )
            // InternalPerspectiveDSL.g:4248:2: ':'
            {
             before(grammarAccess.getIntraLanguageMappingAccess().getColonKeyword_24()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getIntraLanguageMappingAccess().getColonKeyword_24()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__Group__24__Impl"


    // $ANTLR start "rule__IntraLanguageMapping__Group__25"
    // InternalPerspectiveDSL.g:4257:1: rule__IntraLanguageMapping__Group__25 : rule__IntraLanguageMapping__Group__25__Impl rule__IntraLanguageMapping__Group__26 ;
    public final void rule__IntraLanguageMapping__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4261:1: ( rule__IntraLanguageMapping__Group__25__Impl rule__IntraLanguageMapping__Group__26 )
            // InternalPerspectiveDSL.g:4262:2: rule__IntraLanguageMapping__Group__25__Impl rule__IntraLanguageMapping__Group__26
            {
            pushFollow(FOLLOW_54);
            rule__IntraLanguageMapping__Group__25__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntraLanguageMapping__Group__26();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__Group__25"


    // $ANTLR start "rule__IntraLanguageMapping__Group__25__Impl"
    // InternalPerspectiveDSL.g:4269:1: rule__IntraLanguageMapping__Group__25__Impl : ( ( rule__IntraLanguageMapping__HopsAssignment_25 )* ) ;
    public final void rule__IntraLanguageMapping__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4273:1: ( ( ( rule__IntraLanguageMapping__HopsAssignment_25 )* ) )
            // InternalPerspectiveDSL.g:4274:1: ( ( rule__IntraLanguageMapping__HopsAssignment_25 )* )
            {
            // InternalPerspectiveDSL.g:4274:1: ( ( rule__IntraLanguageMapping__HopsAssignment_25 )* )
            // InternalPerspectiveDSL.g:4275:2: ( rule__IntraLanguageMapping__HopsAssignment_25 )*
            {
             before(grammarAccess.getIntraLanguageMappingAccess().getHopsAssignment_25()); 
            // InternalPerspectiveDSL.g:4276:2: ( rule__IntraLanguageMapping__HopsAssignment_25 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==59) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalPerspectiveDSL.g:4276:3: rule__IntraLanguageMapping__HopsAssignment_25
            	    {
            	    pushFollow(FOLLOW_55);
            	    rule__IntraLanguageMapping__HopsAssignment_25();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getIntraLanguageMappingAccess().getHopsAssignment_25()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__Group__25__Impl"


    // $ANTLR start "rule__IntraLanguageMapping__Group__26"
    // InternalPerspectiveDSL.g:4284:1: rule__IntraLanguageMapping__Group__26 : rule__IntraLanguageMapping__Group__26__Impl rule__IntraLanguageMapping__Group__27 ;
    public final void rule__IntraLanguageMapping__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4288:1: ( rule__IntraLanguageMapping__Group__26__Impl rule__IntraLanguageMapping__Group__27 )
            // InternalPerspectiveDSL.g:4289:2: rule__IntraLanguageMapping__Group__26__Impl rule__IntraLanguageMapping__Group__27
            {
            pushFollow(FOLLOW_21);
            rule__IntraLanguageMapping__Group__26__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntraLanguageMapping__Group__27();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__Group__26"


    // $ANTLR start "rule__IntraLanguageMapping__Group__26__Impl"
    // InternalPerspectiveDSL.g:4296:1: rule__IntraLanguageMapping__Group__26__Impl : ( 'end' ) ;
    public final void rule__IntraLanguageMapping__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4300:1: ( ( 'end' ) )
            // InternalPerspectiveDSL.g:4301:1: ( 'end' )
            {
            // InternalPerspectiveDSL.g:4301:1: ( 'end' )
            // InternalPerspectiveDSL.g:4302:2: 'end'
            {
             before(grammarAccess.getIntraLanguageMappingAccess().getEndKeyword_26()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getIntraLanguageMappingAccess().getEndKeyword_26()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__Group__26__Impl"


    // $ANTLR start "rule__IntraLanguageMapping__Group__27"
    // InternalPerspectiveDSL.g:4311:1: rule__IntraLanguageMapping__Group__27 : rule__IntraLanguageMapping__Group__27__Impl ;
    public final void rule__IntraLanguageMapping__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4315:1: ( rule__IntraLanguageMapping__Group__27__Impl )
            // InternalPerspectiveDSL.g:4316:2: rule__IntraLanguageMapping__Group__27__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntraLanguageMapping__Group__27__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__Group__27"


    // $ANTLR start "rule__IntraLanguageMapping__Group__27__Impl"
    // InternalPerspectiveDSL.g:4322:1: rule__IntraLanguageMapping__Group__27__Impl : ( '}' ) ;
    public final void rule__IntraLanguageMapping__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4326:1: ( ( '}' ) )
            // InternalPerspectiveDSL.g:4327:1: ( '}' )
            {
            // InternalPerspectiveDSL.g:4327:1: ( '}' )
            // InternalPerspectiveDSL.g:4328:2: '}'
            {
             before(grammarAccess.getIntraLanguageMappingAccess().getRightCurlyBracketKeyword_27()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getIntraLanguageMappingAccess().getRightCurlyBracketKeyword_27()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__Group__27__Impl"


    // $ANTLR start "rule__Hop__Group__0"
    // InternalPerspectiveDSL.g:4338:1: rule__Hop__Group__0 : rule__Hop__Group__0__Impl rule__Hop__Group__1 ;
    public final void rule__Hop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4342:1: ( rule__Hop__Group__0__Impl rule__Hop__Group__1 )
            // InternalPerspectiveDSL.g:4343:2: rule__Hop__Group__0__Impl rule__Hop__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Hop__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hop__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hop__Group__0"


    // $ANTLR start "rule__Hop__Group__0__Impl"
    // InternalPerspectiveDSL.g:4350:1: rule__Hop__Group__0__Impl : ( 'hopElement' ) ;
    public final void rule__Hop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4354:1: ( ( 'hopElement' ) )
            // InternalPerspectiveDSL.g:4355:1: ( 'hopElement' )
            {
            // InternalPerspectiveDSL.g:4355:1: ( 'hopElement' )
            // InternalPerspectiveDSL.g:4356:2: 'hopElement'
            {
             before(grammarAccess.getHopAccess().getHopElementKeyword_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getHopAccess().getHopElementKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hop__Group__0__Impl"


    // $ANTLR start "rule__Hop__Group__1"
    // InternalPerspectiveDSL.g:4365:1: rule__Hop__Group__1 : rule__Hop__Group__1__Impl rule__Hop__Group__2 ;
    public final void rule__Hop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4369:1: ( rule__Hop__Group__1__Impl rule__Hop__Group__2 )
            // InternalPerspectiveDSL.g:4370:2: rule__Hop__Group__1__Impl rule__Hop__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Hop__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hop__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hop__Group__1"


    // $ANTLR start "rule__Hop__Group__1__Impl"
    // InternalPerspectiveDSL.g:4377:1: rule__Hop__Group__1__Impl : ( ':' ) ;
    public final void rule__Hop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4381:1: ( ( ':' ) )
            // InternalPerspectiveDSL.g:4382:1: ( ':' )
            {
            // InternalPerspectiveDSL.g:4382:1: ( ':' )
            // InternalPerspectiveDSL.g:4383:2: ':'
            {
             before(grammarAccess.getHopAccess().getColonKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getHopAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hop__Group__1__Impl"


    // $ANTLR start "rule__Hop__Group__2"
    // InternalPerspectiveDSL.g:4392:1: rule__Hop__Group__2 : rule__Hop__Group__2__Impl rule__Hop__Group__3 ;
    public final void rule__Hop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4396:1: ( rule__Hop__Group__2__Impl rule__Hop__Group__3 )
            // InternalPerspectiveDSL.g:4397:2: rule__Hop__Group__2__Impl rule__Hop__Group__3
            {
            pushFollow(FOLLOW_56);
            rule__Hop__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hop__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hop__Group__2"


    // $ANTLR start "rule__Hop__Group__2__Impl"
    // InternalPerspectiveDSL.g:4404:1: rule__Hop__Group__2__Impl : ( ( rule__Hop__HopElementAssignment_2 ) ) ;
    public final void rule__Hop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4408:1: ( ( ( rule__Hop__HopElementAssignment_2 ) ) )
            // InternalPerspectiveDSL.g:4409:1: ( ( rule__Hop__HopElementAssignment_2 ) )
            {
            // InternalPerspectiveDSL.g:4409:1: ( ( rule__Hop__HopElementAssignment_2 ) )
            // InternalPerspectiveDSL.g:4410:2: ( rule__Hop__HopElementAssignment_2 )
            {
             before(grammarAccess.getHopAccess().getHopElementAssignment_2()); 
            // InternalPerspectiveDSL.g:4411:2: ( rule__Hop__HopElementAssignment_2 )
            // InternalPerspectiveDSL.g:4411:3: rule__Hop__HopElementAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Hop__HopElementAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getHopAccess().getHopElementAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hop__Group__2__Impl"


    // $ANTLR start "rule__Hop__Group__3"
    // InternalPerspectiveDSL.g:4419:1: rule__Hop__Group__3 : rule__Hop__Group__3__Impl rule__Hop__Group__4 ;
    public final void rule__Hop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4423:1: ( rule__Hop__Group__3__Impl rule__Hop__Group__4 )
            // InternalPerspectiveDSL.g:4424:2: rule__Hop__Group__3__Impl rule__Hop__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Hop__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hop__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hop__Group__3"


    // $ANTLR start "rule__Hop__Group__3__Impl"
    // InternalPerspectiveDSL.g:4431:1: rule__Hop__Group__3__Impl : ( 'fromGetHop' ) ;
    public final void rule__Hop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4435:1: ( ( 'fromGetHop' ) )
            // InternalPerspectiveDSL.g:4436:1: ( 'fromGetHop' )
            {
            // InternalPerspectiveDSL.g:4436:1: ( 'fromGetHop' )
            // InternalPerspectiveDSL.g:4437:2: 'fromGetHop'
            {
             before(grammarAccess.getHopAccess().getFromGetHopKeyword_3()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getHopAccess().getFromGetHopKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hop__Group__3__Impl"


    // $ANTLR start "rule__Hop__Group__4"
    // InternalPerspectiveDSL.g:4446:1: rule__Hop__Group__4 : rule__Hop__Group__4__Impl rule__Hop__Group__5 ;
    public final void rule__Hop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4450:1: ( rule__Hop__Group__4__Impl rule__Hop__Group__5 )
            // InternalPerspectiveDSL.g:4451:2: rule__Hop__Group__4__Impl rule__Hop__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Hop__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hop__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hop__Group__4"


    // $ANTLR start "rule__Hop__Group__4__Impl"
    // InternalPerspectiveDSL.g:4458:1: rule__Hop__Group__4__Impl : ( ( rule__Hop__FromGetHopAssignment_4 ) ) ;
    public final void rule__Hop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4462:1: ( ( ( rule__Hop__FromGetHopAssignment_4 ) ) )
            // InternalPerspectiveDSL.g:4463:1: ( ( rule__Hop__FromGetHopAssignment_4 ) )
            {
            // InternalPerspectiveDSL.g:4463:1: ( ( rule__Hop__FromGetHopAssignment_4 ) )
            // InternalPerspectiveDSL.g:4464:2: ( rule__Hop__FromGetHopAssignment_4 )
            {
             before(grammarAccess.getHopAccess().getFromGetHopAssignment_4()); 
            // InternalPerspectiveDSL.g:4465:2: ( rule__Hop__FromGetHopAssignment_4 )
            // InternalPerspectiveDSL.g:4465:3: rule__Hop__FromGetHopAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Hop__FromGetHopAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getHopAccess().getFromGetHopAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hop__Group__4__Impl"


    // $ANTLR start "rule__Hop__Group__5"
    // InternalPerspectiveDSL.g:4473:1: rule__Hop__Group__5 : rule__Hop__Group__5__Impl ;
    public final void rule__Hop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4477:1: ( rule__Hop__Group__5__Impl )
            // InternalPerspectiveDSL.g:4478:2: rule__Hop__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Hop__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hop__Group__5"


    // $ANTLR start "rule__Hop__Group__5__Impl"
    // InternalPerspectiveDSL.g:4484:1: rule__Hop__Group__5__Impl : ( ';' ) ;
    public final void rule__Hop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4488:1: ( ( ';' ) )
            // InternalPerspectiveDSL.g:4489:1: ( ';' )
            {
            // InternalPerspectiveDSL.g:4489:1: ( ';' )
            // InternalPerspectiveDSL.g:4490:2: ';'
            {
             before(grammarAccess.getHopAccess().getSemicolonKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getHopAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hop__Group__5__Impl"


    // $ANTLR start "rule__PerspectiveModel__PerspectiveAssignment"
    // InternalPerspectiveDSL.g:4500:1: rule__PerspectiveModel__PerspectiveAssignment : ( rulePerspective ) ;
    public final void rule__PerspectiveModel__PerspectiveAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4504:1: ( ( rulePerspective ) )
            // InternalPerspectiveDSL.g:4505:2: ( rulePerspective )
            {
            // InternalPerspectiveDSL.g:4505:2: ( rulePerspective )
            // InternalPerspectiveDSL.g:4506:3: rulePerspective
            {
             before(grammarAccess.getPerspectiveModelAccess().getPerspectivePerspectiveParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePerspective();

            state._fsp--;

             after(grammarAccess.getPerspectiveModelAccess().getPerspectivePerspectiveParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerspectiveModel__PerspectiveAssignment"


    // $ANTLR start "rule__Perspective__NameAssignment_1"
    // InternalPerspectiveDSL.g:4515:1: rule__Perspective__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Perspective__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4519:1: ( ( RULE_ID ) )
            // InternalPerspectiveDSL.g:4520:2: ( RULE_ID )
            {
            // InternalPerspectiveDSL.g:4520:2: ( RULE_ID )
            // InternalPerspectiveDSL.g:4521:3: RULE_ID
            {
             before(grammarAccess.getPerspectiveAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPerspectiveAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__NameAssignment_1"


    // $ANTLR start "rule__Perspective__DefaultAssignment_3_1"
    // InternalPerspectiveDSL.g:4530:1: rule__Perspective__DefaultAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__Perspective__DefaultAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4534:1: ( ( RULE_ID ) )
            // InternalPerspectiveDSL.g:4535:2: ( RULE_ID )
            {
            // InternalPerspectiveDSL.g:4535:2: ( RULE_ID )
            // InternalPerspectiveDSL.g:4536:3: RULE_ID
            {
             before(grammarAccess.getPerspectiveAccess().getDefaultIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPerspectiveAccess().getDefaultIDTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__DefaultAssignment_3_1"


    // $ANTLR start "rule__Perspective__DisplayNameAssignment_6"
    // InternalPerspectiveDSL.g:4545:1: rule__Perspective__DisplayNameAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Perspective__DisplayNameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4549:1: ( ( RULE_STRING ) )
            // InternalPerspectiveDSL.g:4550:2: ( RULE_STRING )
            {
            // InternalPerspectiveDSL.g:4550:2: ( RULE_STRING )
            // InternalPerspectiveDSL.g:4551:3: RULE_STRING
            {
             before(grammarAccess.getPerspectiveAccess().getDisplayNameSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPerspectiveAccess().getDisplayNameSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__DisplayNameAssignment_6"


    // $ANTLR start "rule__Perspective__LanguagesAssignment_10"
    // InternalPerspectiveDSL.g:4560:1: rule__Perspective__LanguagesAssignment_10 : ( ruleLanguage ) ;
    public final void rule__Perspective__LanguagesAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4564:1: ( ( ruleLanguage ) )
            // InternalPerspectiveDSL.g:4565:2: ( ruleLanguage )
            {
            // InternalPerspectiveDSL.g:4565:2: ( ruleLanguage )
            // InternalPerspectiveDSL.g:4566:3: ruleLanguage
            {
             before(grammarAccess.getPerspectiveAccess().getLanguagesLanguageParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleLanguage();

            state._fsp--;

             after(grammarAccess.getPerspectiveAccess().getLanguagesLanguageParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__LanguagesAssignment_10"


    // $ANTLR start "rule__Perspective__ActionsAssignment_14"
    // InternalPerspectiveDSL.g:4575:1: rule__Perspective__ActionsAssignment_14 : ( ruleAction ) ;
    public final void rule__Perspective__ActionsAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4579:1: ( ( ruleAction ) )
            // InternalPerspectiveDSL.g:4580:2: ( ruleAction )
            {
            // InternalPerspectiveDSL.g:4580:2: ( ruleAction )
            // InternalPerspectiveDSL.g:4581:3: ruleAction
            {
             before(grammarAccess.getPerspectiveAccess().getActionsActionParserRuleCall_14_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getPerspectiveAccess().getActionsActionParserRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__ActionsAssignment_14"


    // $ANTLR start "rule__Perspective__MappingsAssignment_18"
    // InternalPerspectiveDSL.g:4590:1: rule__Perspective__MappingsAssignment_18 : ( ruleLanguageElementMapping ) ;
    public final void rule__Perspective__MappingsAssignment_18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4594:1: ( ( ruleLanguageElementMapping ) )
            // InternalPerspectiveDSL.g:4595:2: ( ruleLanguageElementMapping )
            {
            // InternalPerspectiveDSL.g:4595:2: ( ruleLanguageElementMapping )
            // InternalPerspectiveDSL.g:4596:3: ruleLanguageElementMapping
            {
             before(grammarAccess.getPerspectiveAccess().getMappingsLanguageElementMappingParserRuleCall_18_0()); 
            pushFollow(FOLLOW_2);
            ruleLanguageElementMapping();

            state._fsp--;

             after(grammarAccess.getPerspectiveAccess().getMappingsLanguageElementMappingParserRuleCall_18_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__MappingsAssignment_18"


    // $ANTLR start "rule__Perspective__IntralanguagemappingsAssignment_20_2"
    // InternalPerspectiveDSL.g:4605:1: rule__Perspective__IntralanguagemappingsAssignment_20_2 : ( ruleIntraLanguageMapping ) ;
    public final void rule__Perspective__IntralanguagemappingsAssignment_20_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4609:1: ( ( ruleIntraLanguageMapping ) )
            // InternalPerspectiveDSL.g:4610:2: ( ruleIntraLanguageMapping )
            {
            // InternalPerspectiveDSL.g:4610:2: ( ruleIntraLanguageMapping )
            // InternalPerspectiveDSL.g:4611:3: ruleIntraLanguageMapping
            {
             before(grammarAccess.getPerspectiveAccess().getIntralanguagemappingsIntraLanguageMappingParserRuleCall_20_2_0()); 
            pushFollow(FOLLOW_2);
            ruleIntraLanguageMapping();

            state._fsp--;

             after(grammarAccess.getPerspectiveAccess().getIntralanguagemappingsIntraLanguageMappingParserRuleCall_20_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perspective__IntralanguagemappingsAssignment_20_2"


    // $ANTLR start "rule__Language__NameAssignment_2"
    // InternalPerspectiveDSL.g:4620:1: rule__Language__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Language__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4624:1: ( ( RULE_ID ) )
            // InternalPerspectiveDSL.g:4625:2: ( RULE_ID )
            {
            // InternalPerspectiveDSL.g:4625:2: ( RULE_ID )
            // InternalPerspectiveDSL.g:4626:3: RULE_ID
            {
             before(grammarAccess.getLanguageAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLanguageAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Language__NameAssignment_2"


    // $ANTLR start "rule__Language__RootPackageAssignment_5"
    // InternalPerspectiveDSL.g:4635:1: rule__Language__RootPackageAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Language__RootPackageAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4639:1: ( ( RULE_STRING ) )
            // InternalPerspectiveDSL.g:4640:2: ( RULE_STRING )
            {
            // InternalPerspectiveDSL.g:4640:2: ( RULE_STRING )
            // InternalPerspectiveDSL.g:4641:3: RULE_STRING
            {
             before(grammarAccess.getLanguageAccess().getRootPackageSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLanguageAccess().getRootPackageSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Language__RootPackageAssignment_5"


    // $ANTLR start "rule__Language__PackageClassNameAssignment_8"
    // InternalPerspectiveDSL.g:4650:1: rule__Language__PackageClassNameAssignment_8 : ( RULE_ID ) ;
    public final void rule__Language__PackageClassNameAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4654:1: ( ( RULE_ID ) )
            // InternalPerspectiveDSL.g:4655:2: ( RULE_ID )
            {
            // InternalPerspectiveDSL.g:4655:2: ( RULE_ID )
            // InternalPerspectiveDSL.g:4656:3: RULE_ID
            {
             before(grammarAccess.getLanguageAccess().getPackageClassNameIDTerminalRuleCall_8_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLanguageAccess().getPackageClassNameIDTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Language__PackageClassNameAssignment_8"


    // $ANTLR start "rule__Language__RoleNameAssignment_11"
    // InternalPerspectiveDSL.g:4665:1: rule__Language__RoleNameAssignment_11 : ( RULE_ID ) ;
    public final void rule__Language__RoleNameAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4669:1: ( ( RULE_ID ) )
            // InternalPerspectiveDSL.g:4670:2: ( RULE_ID )
            {
            // InternalPerspectiveDSL.g:4670:2: ( RULE_ID )
            // InternalPerspectiveDSL.g:4671:3: RULE_ID
            {
             before(grammarAccess.getLanguageAccess().getRoleNameIDTerminalRuleCall_11_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLanguageAccess().getRoleNameIDTerminalRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Language__RoleNameAssignment_11"


    // $ANTLR start "rule__LanguageElementMapping__NameAssignment_1"
    // InternalPerspectiveDSL.g:4680:1: rule__LanguageElementMapping__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__LanguageElementMapping__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4684:1: ( ( RULE_ID ) )
            // InternalPerspectiveDSL.g:4685:2: ( RULE_ID )
            {
            // InternalPerspectiveDSL.g:4685:2: ( RULE_ID )
            // InternalPerspectiveDSL.g:4686:3: RULE_ID
            {
             before(grammarAccess.getLanguageElementMappingAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLanguageElementMappingAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__NameAssignment_1"


    // $ANTLR start "rule__LanguageElementMapping__FromCardinalityAssignment_5"
    // InternalPerspectiveDSL.g:4695:1: rule__LanguageElementMapping__FromCardinalityAssignment_5 : ( ruleCardinality ) ;
    public final void rule__LanguageElementMapping__FromCardinalityAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4699:1: ( ( ruleCardinality ) )
            // InternalPerspectiveDSL.g:4700:2: ( ruleCardinality )
            {
            // InternalPerspectiveDSL.g:4700:2: ( ruleCardinality )
            // InternalPerspectiveDSL.g:4701:3: ruleCardinality
            {
             before(grammarAccess.getLanguageElementMappingAccess().getFromCardinalityCardinalityEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getLanguageElementMappingAccess().getFromCardinalityCardinalityEnumRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__FromCardinalityAssignment_5"


    // $ANTLR start "rule__LanguageElementMapping__ToCardinalityAssignment_9"
    // InternalPerspectiveDSL.g:4710:1: rule__LanguageElementMapping__ToCardinalityAssignment_9 : ( ruleCardinality ) ;
    public final void rule__LanguageElementMapping__ToCardinalityAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4714:1: ( ( ruleCardinality ) )
            // InternalPerspectiveDSL.g:4715:2: ( ruleCardinality )
            {
            // InternalPerspectiveDSL.g:4715:2: ( ruleCardinality )
            // InternalPerspectiveDSL.g:4716:3: ruleCardinality
            {
             before(grammarAccess.getLanguageElementMappingAccess().getToCardinalityCardinalityEnumRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getLanguageElementMappingAccess().getToCardinalityCardinalityEnumRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__ToCardinalityAssignment_9"


    // $ANTLR start "rule__LanguageElementMapping__FromElementAssignment_13"
    // InternalPerspectiveDSL.g:4725:1: rule__LanguageElementMapping__FromElementAssignment_13 : ( RULE_ID ) ;
    public final void rule__LanguageElementMapping__FromElementAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4729:1: ( ( RULE_ID ) )
            // InternalPerspectiveDSL.g:4730:2: ( RULE_ID )
            {
            // InternalPerspectiveDSL.g:4730:2: ( RULE_ID )
            // InternalPerspectiveDSL.g:4731:3: RULE_ID
            {
             before(grammarAccess.getLanguageElementMappingAccess().getFromElementIDTerminalRuleCall_13_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLanguageElementMappingAccess().getFromElementIDTerminalRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__FromElementAssignment_13"


    // $ANTLR start "rule__LanguageElementMapping__FromRoleNameAssignment_15"
    // InternalPerspectiveDSL.g:4740:1: rule__LanguageElementMapping__FromRoleNameAssignment_15 : ( RULE_ID ) ;
    public final void rule__LanguageElementMapping__FromRoleNameAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4744:1: ( ( RULE_ID ) )
            // InternalPerspectiveDSL.g:4745:2: ( RULE_ID )
            {
            // InternalPerspectiveDSL.g:4745:2: ( RULE_ID )
            // InternalPerspectiveDSL.g:4746:3: RULE_ID
            {
             before(grammarAccess.getLanguageElementMappingAccess().getFromRoleNameIDTerminalRuleCall_15_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLanguageElementMappingAccess().getFromRoleNameIDTerminalRuleCall_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__FromRoleNameAssignment_15"


    // $ANTLR start "rule__LanguageElementMapping__FromGetElementAssignment_17"
    // InternalPerspectiveDSL.g:4755:1: rule__LanguageElementMapping__FromGetElementAssignment_17 : ( RULE_STRING ) ;
    public final void rule__LanguageElementMapping__FromGetElementAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4759:1: ( ( RULE_STRING ) )
            // InternalPerspectiveDSL.g:4760:2: ( RULE_STRING )
            {
            // InternalPerspectiveDSL.g:4760:2: ( RULE_STRING )
            // InternalPerspectiveDSL.g:4761:3: RULE_STRING
            {
             before(grammarAccess.getLanguageElementMappingAccess().getFromGetElementSTRINGTerminalRuleCall_17_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLanguageElementMappingAccess().getFromGetElementSTRINGTerminalRuleCall_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__FromGetElementAssignment_17"


    // $ANTLR start "rule__LanguageElementMapping__ToElementAssignment_21"
    // InternalPerspectiveDSL.g:4770:1: rule__LanguageElementMapping__ToElementAssignment_21 : ( RULE_ID ) ;
    public final void rule__LanguageElementMapping__ToElementAssignment_21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4774:1: ( ( RULE_ID ) )
            // InternalPerspectiveDSL.g:4775:2: ( RULE_ID )
            {
            // InternalPerspectiveDSL.g:4775:2: ( RULE_ID )
            // InternalPerspectiveDSL.g:4776:3: RULE_ID
            {
             before(grammarAccess.getLanguageElementMappingAccess().getToElementIDTerminalRuleCall_21_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLanguageElementMappingAccess().getToElementIDTerminalRuleCall_21_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__ToElementAssignment_21"


    // $ANTLR start "rule__LanguageElementMapping__ToRoleNameAssignment_23"
    // InternalPerspectiveDSL.g:4785:1: rule__LanguageElementMapping__ToRoleNameAssignment_23 : ( RULE_ID ) ;
    public final void rule__LanguageElementMapping__ToRoleNameAssignment_23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4789:1: ( ( RULE_ID ) )
            // InternalPerspectiveDSL.g:4790:2: ( RULE_ID )
            {
            // InternalPerspectiveDSL.g:4790:2: ( RULE_ID )
            // InternalPerspectiveDSL.g:4791:3: RULE_ID
            {
             before(grammarAccess.getLanguageElementMappingAccess().getToRoleNameIDTerminalRuleCall_23_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLanguageElementMappingAccess().getToRoleNameIDTerminalRuleCall_23_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__ToRoleNameAssignment_23"


    // $ANTLR start "rule__LanguageElementMapping__ToGetElementAssignment_25"
    // InternalPerspectiveDSL.g:4800:1: rule__LanguageElementMapping__ToGetElementAssignment_25 : ( RULE_STRING ) ;
    public final void rule__LanguageElementMapping__ToGetElementAssignment_25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4804:1: ( ( RULE_STRING ) )
            // InternalPerspectiveDSL.g:4805:2: ( RULE_STRING )
            {
            // InternalPerspectiveDSL.g:4805:2: ( RULE_STRING )
            // InternalPerspectiveDSL.g:4806:3: RULE_STRING
            {
             before(grammarAccess.getLanguageElementMappingAccess().getToGetElementSTRINGTerminalRuleCall_25_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLanguageElementMappingAccess().getToGetElementSTRINGTerminalRuleCall_25_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__ToGetElementAssignment_25"


    // $ANTLR start "rule__LanguageElementMapping__NestedMappingsAssignment_27_3"
    // InternalPerspectiveDSL.g:4815:1: rule__LanguageElementMapping__NestedMappingsAssignment_27_3 : ( ruleNestedMapping ) ;
    public final void rule__LanguageElementMapping__NestedMappingsAssignment_27_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4819:1: ( ( ruleNestedMapping ) )
            // InternalPerspectiveDSL.g:4820:2: ( ruleNestedMapping )
            {
            // InternalPerspectiveDSL.g:4820:2: ( ruleNestedMapping )
            // InternalPerspectiveDSL.g:4821:3: ruleNestedMapping
            {
             before(grammarAccess.getLanguageElementMappingAccess().getNestedMappingsNestedMappingParserRuleCall_27_3_0()); 
            pushFollow(FOLLOW_2);
            ruleNestedMapping();

            state._fsp--;

             after(grammarAccess.getLanguageElementMappingAccess().getNestedMappingsNestedMappingParserRuleCall_27_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__NestedMappingsAssignment_27_3"


    // $ANTLR start "rule__LanguageElementMapping__InterLanguageMappingEndsAssignment_28_2"
    // InternalPerspectiveDSL.g:4830:1: rule__LanguageElementMapping__InterLanguageMappingEndsAssignment_28_2 : ( ruleInterLanguageMappingEnd ) ;
    public final void rule__LanguageElementMapping__InterLanguageMappingEndsAssignment_28_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4834:1: ( ( ruleInterLanguageMappingEnd ) )
            // InternalPerspectiveDSL.g:4835:2: ( ruleInterLanguageMappingEnd )
            {
            // InternalPerspectiveDSL.g:4835:2: ( ruleInterLanguageMappingEnd )
            // InternalPerspectiveDSL.g:4836:3: ruleInterLanguageMappingEnd
            {
             before(grammarAccess.getLanguageElementMappingAccess().getInterLanguageMappingEndsInterLanguageMappingEndParserRuleCall_28_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInterLanguageMappingEnd();

            state._fsp--;

             after(grammarAccess.getLanguageElementMappingAccess().getInterLanguageMappingEndsInterLanguageMappingEndParserRuleCall_28_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageElementMapping__InterLanguageMappingEndsAssignment_28_2"


    // $ANTLR start "rule__NestedMapping__NameAssignment_2"
    // InternalPerspectiveDSL.g:4845:1: rule__NestedMapping__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__NestedMapping__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4849:1: ( ( RULE_ID ) )
            // InternalPerspectiveDSL.g:4850:2: ( RULE_ID )
            {
            // InternalPerspectiveDSL.g:4850:2: ( RULE_ID )
            // InternalPerspectiveDSL.g:4851:3: RULE_ID
            {
             before(grammarAccess.getNestedMappingAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNestedMappingAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedMapping__NameAssignment_2"


    // $ANTLR start "rule__NestedMapping__FromElementNameAssignment_7"
    // InternalPerspectiveDSL.g:4860:1: rule__NestedMapping__FromElementNameAssignment_7 : ( RULE_STRING ) ;
    public final void rule__NestedMapping__FromElementNameAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4864:1: ( ( RULE_STRING ) )
            // InternalPerspectiveDSL.g:4865:2: ( RULE_STRING )
            {
            // InternalPerspectiveDSL.g:4865:2: ( RULE_STRING )
            // InternalPerspectiveDSL.g:4866:3: RULE_STRING
            {
             before(grammarAccess.getNestedMappingAccess().getFromElementNameSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNestedMappingAccess().getFromElementNameSTRINGTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedMapping__FromElementNameAssignment_7"


    // $ANTLR start "rule__NestedMapping__FromRoleNameAssignment_9"
    // InternalPerspectiveDSL.g:4875:1: rule__NestedMapping__FromRoleNameAssignment_9 : ( RULE_ID ) ;
    public final void rule__NestedMapping__FromRoleNameAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4879:1: ( ( RULE_ID ) )
            // InternalPerspectiveDSL.g:4880:2: ( RULE_ID )
            {
            // InternalPerspectiveDSL.g:4880:2: ( RULE_ID )
            // InternalPerspectiveDSL.g:4881:3: RULE_ID
            {
             before(grammarAccess.getNestedMappingAccess().getFromRoleNameIDTerminalRuleCall_9_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNestedMappingAccess().getFromRoleNameIDTerminalRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedMapping__FromRoleNameAssignment_9"


    // $ANTLR start "rule__NestedMapping__ToElementNameAssignment_14"
    // InternalPerspectiveDSL.g:4890:1: rule__NestedMapping__ToElementNameAssignment_14 : ( RULE_STRING ) ;
    public final void rule__NestedMapping__ToElementNameAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4894:1: ( ( RULE_STRING ) )
            // InternalPerspectiveDSL.g:4895:2: ( RULE_STRING )
            {
            // InternalPerspectiveDSL.g:4895:2: ( RULE_STRING )
            // InternalPerspectiveDSL.g:4896:3: RULE_STRING
            {
             before(grammarAccess.getNestedMappingAccess().getToElementNameSTRINGTerminalRuleCall_14_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNestedMappingAccess().getToElementNameSTRINGTerminalRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedMapping__ToElementNameAssignment_14"


    // $ANTLR start "rule__NestedMapping__ToRoleNameAssignment_16"
    // InternalPerspectiveDSL.g:4905:1: rule__NestedMapping__ToRoleNameAssignment_16 : ( RULE_ID ) ;
    public final void rule__NestedMapping__ToRoleNameAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4909:1: ( ( RULE_ID ) )
            // InternalPerspectiveDSL.g:4910:2: ( RULE_ID )
            {
            // InternalPerspectiveDSL.g:4910:2: ( RULE_ID )
            // InternalPerspectiveDSL.g:4911:3: RULE_ID
            {
             before(grammarAccess.getNestedMappingAccess().getToRoleNameIDTerminalRuleCall_16_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNestedMappingAccess().getToRoleNameIDTerminalRuleCall_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedMapping__ToRoleNameAssignment_16"


    // $ANTLR start "rule__InterLanguageMappingEnd__NameAssignment_4"
    // InternalPerspectiveDSL.g:4920:1: rule__InterLanguageMappingEnd__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__InterLanguageMappingEnd__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4924:1: ( ( RULE_ID ) )
            // InternalPerspectiveDSL.g:4925:2: ( RULE_ID )
            {
            // InternalPerspectiveDSL.g:4925:2: ( RULE_ID )
            // InternalPerspectiveDSL.g:4926:3: RULE_ID
            {
             before(grammarAccess.getInterLanguageMappingEndAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInterLanguageMappingEndAccess().getNameIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterLanguageMappingEnd__NameAssignment_4"


    // $ANTLR start "rule__InterLanguageMappingEnd__OriginAssignment_8"
    // InternalPerspectiveDSL.g:4935:1: rule__InterLanguageMappingEnd__OriginAssignment_8 : ( ( ';' ) ) ;
    public final void rule__InterLanguageMappingEnd__OriginAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4939:1: ( ( ( ';' ) ) )
            // InternalPerspectiveDSL.g:4940:2: ( ( ';' ) )
            {
            // InternalPerspectiveDSL.g:4940:2: ( ( ';' ) )
            // InternalPerspectiveDSL.g:4941:3: ( ';' )
            {
             before(grammarAccess.getInterLanguageMappingEndAccess().getOriginSemicolonKeyword_8_0()); 
            // InternalPerspectiveDSL.g:4942:3: ( ';' )
            // InternalPerspectiveDSL.g:4943:4: ';'
            {
             before(grammarAccess.getInterLanguageMappingEndAccess().getOriginSemicolonKeyword_8_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getInterLanguageMappingEndAccess().getOriginSemicolonKeyword_8_0()); 

            }

             after(grammarAccess.getInterLanguageMappingEndAccess().getOriginSemicolonKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterLanguageMappingEnd__OriginAssignment_8"


    // $ANTLR start "rule__InterLanguageMappingEnd__DestinationAssignment_11"
    // InternalPerspectiveDSL.g:4954:1: rule__InterLanguageMappingEnd__DestinationAssignment_11 : ( ( ';' ) ) ;
    public final void rule__InterLanguageMappingEnd__DestinationAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4958:1: ( ( ( ';' ) ) )
            // InternalPerspectiveDSL.g:4959:2: ( ( ';' ) )
            {
            // InternalPerspectiveDSL.g:4959:2: ( ( ';' ) )
            // InternalPerspectiveDSL.g:4960:3: ( ';' )
            {
             before(grammarAccess.getInterLanguageMappingEndAccess().getDestinationSemicolonKeyword_11_0()); 
            // InternalPerspectiveDSL.g:4961:3: ( ';' )
            // InternalPerspectiveDSL.g:4962:4: ';'
            {
             before(grammarAccess.getInterLanguageMappingEndAccess().getDestinationSemicolonKeyword_11_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getInterLanguageMappingEndAccess().getDestinationSemicolonKeyword_11_0()); 

            }

             after(grammarAccess.getInterLanguageMappingEndAccess().getDestinationSemicolonKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InterLanguageMappingEnd__DestinationAssignment_11"


    // $ANTLR start "rule__Action__ActionTypeAssignment_1"
    // InternalPerspectiveDSL.g:4973:1: rule__Action__ActionTypeAssignment_1 : ( rulePerspectiveActionType ) ;
    public final void rule__Action__ActionTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4977:1: ( ( rulePerspectiveActionType ) )
            // InternalPerspectiveDSL.g:4978:2: ( rulePerspectiveActionType )
            {
            // InternalPerspectiveDSL.g:4978:2: ( rulePerspectiveActionType )
            // InternalPerspectiveDSL.g:4979:3: rulePerspectiveActionType
            {
             before(grammarAccess.getActionAccess().getActionTypePerspectiveActionTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePerspectiveActionType();

            state._fsp--;

             after(grammarAccess.getActionAccess().getActionTypePerspectiveActionTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__ActionTypeAssignment_1"


    // $ANTLR start "rule__Action__RoleNameAssignment_2"
    // InternalPerspectiveDSL.g:4988:1: rule__Action__RoleNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Action__RoleNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:4992:1: ( ( RULE_ID ) )
            // InternalPerspectiveDSL.g:4993:2: ( RULE_ID )
            {
            // InternalPerspectiveDSL.g:4993:2: ( RULE_ID )
            // InternalPerspectiveDSL.g:4994:3: RULE_ID
            {
             before(grammarAccess.getActionAccess().getRoleNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getRoleNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__RoleNameAssignment_2"


    // $ANTLR start "rule__Action__NameAssignment_3"
    // InternalPerspectiveDSL.g:5003:1: rule__Action__NameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Action__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:5007:1: ( ( RULE_STRING ) )
            // InternalPerspectiveDSL.g:5008:2: ( RULE_STRING )
            {
            // InternalPerspectiveDSL.g:5008:2: ( RULE_STRING )
            // InternalPerspectiveDSL.g:5009:3: RULE_STRING
            {
             before(grammarAccess.getActionAccess().getNameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getNameSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__NameAssignment_3"


    // $ANTLR start "rule__IntraLanguageMapping__NameAssignment_3"
    // InternalPerspectiveDSL.g:5018:1: rule__IntraLanguageMapping__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__IntraLanguageMapping__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:5022:1: ( ( RULE_ID ) )
            // InternalPerspectiveDSL.g:5023:2: ( RULE_ID )
            {
            // InternalPerspectiveDSL.g:5023:2: ( RULE_ID )
            // InternalPerspectiveDSL.g:5024:3: RULE_ID
            {
             before(grammarAccess.getIntraLanguageMappingAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIntraLanguageMappingAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__NameAssignment_3"


    // $ANTLR start "rule__IntraLanguageMapping__ClosureAssignment_7"
    // InternalPerspectiveDSL.g:5033:1: rule__IntraLanguageMapping__ClosureAssignment_7 : ( ( ';' ) ) ;
    public final void rule__IntraLanguageMapping__ClosureAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:5037:1: ( ( ( ';' ) ) )
            // InternalPerspectiveDSL.g:5038:2: ( ( ';' ) )
            {
            // InternalPerspectiveDSL.g:5038:2: ( ( ';' ) )
            // InternalPerspectiveDSL.g:5039:3: ( ';' )
            {
             before(grammarAccess.getIntraLanguageMappingAccess().getClosureSemicolonKeyword_7_0()); 
            // InternalPerspectiveDSL.g:5040:3: ( ';' )
            // InternalPerspectiveDSL.g:5041:4: ';'
            {
             before(grammarAccess.getIntraLanguageMappingAccess().getClosureSemicolonKeyword_7_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getIntraLanguageMappingAccess().getClosureSemicolonKeyword_7_0()); 

            }

             after(grammarAccess.getIntraLanguageMappingAccess().getClosureSemicolonKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__ClosureAssignment_7"


    // $ANTLR start "rule__IntraLanguageMapping__ReuseAssignment_10"
    // InternalPerspectiveDSL.g:5052:1: rule__IntraLanguageMapping__ReuseAssignment_10 : ( ( ';' ) ) ;
    public final void rule__IntraLanguageMapping__ReuseAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:5056:1: ( ( ( ';' ) ) )
            // InternalPerspectiveDSL.g:5057:2: ( ( ';' ) )
            {
            // InternalPerspectiveDSL.g:5057:2: ( ( ';' ) )
            // InternalPerspectiveDSL.g:5058:3: ( ';' )
            {
             before(grammarAccess.getIntraLanguageMappingAccess().getReuseSemicolonKeyword_10_0()); 
            // InternalPerspectiveDSL.g:5059:3: ( ';' )
            // InternalPerspectiveDSL.g:5060:4: ';'
            {
             before(grammarAccess.getIntraLanguageMappingAccess().getReuseSemicolonKeyword_10_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getIntraLanguageMappingAccess().getReuseSemicolonKeyword_10_0()); 

            }

             after(grammarAccess.getIntraLanguageMappingAccess().getReuseSemicolonKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__ReuseAssignment_10"


    // $ANTLR start "rule__IntraLanguageMapping__IncreaseDepthAssignment_13"
    // InternalPerspectiveDSL.g:5071:1: rule__IntraLanguageMapping__IncreaseDepthAssignment_13 : ( ( ';' ) ) ;
    public final void rule__IntraLanguageMapping__IncreaseDepthAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:5075:1: ( ( ( ';' ) ) )
            // InternalPerspectiveDSL.g:5076:2: ( ( ';' ) )
            {
            // InternalPerspectiveDSL.g:5076:2: ( ( ';' ) )
            // InternalPerspectiveDSL.g:5077:3: ( ';' )
            {
             before(grammarAccess.getIntraLanguageMappingAccess().getIncreaseDepthSemicolonKeyword_13_0()); 
            // InternalPerspectiveDSL.g:5078:3: ( ';' )
            // InternalPerspectiveDSL.g:5079:4: ';'
            {
             before(grammarAccess.getIntraLanguageMappingAccess().getIncreaseDepthSemicolonKeyword_13_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getIntraLanguageMappingAccess().getIncreaseDepthSemicolonKeyword_13_0()); 

            }

             after(grammarAccess.getIntraLanguageMappingAccess().getIncreaseDepthSemicolonKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__IncreaseDepthAssignment_13"


    // $ANTLR start "rule__IntraLanguageMapping__ChangeModelAssignment_16"
    // InternalPerspectiveDSL.g:5090:1: rule__IntraLanguageMapping__ChangeModelAssignment_16 : ( ( ';' ) ) ;
    public final void rule__IntraLanguageMapping__ChangeModelAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:5094:1: ( ( ( ';' ) ) )
            // InternalPerspectiveDSL.g:5095:2: ( ( ';' ) )
            {
            // InternalPerspectiveDSL.g:5095:2: ( ( ';' ) )
            // InternalPerspectiveDSL.g:5096:3: ( ';' )
            {
             before(grammarAccess.getIntraLanguageMappingAccess().getChangeModelSemicolonKeyword_16_0()); 
            // InternalPerspectiveDSL.g:5097:3: ( ';' )
            // InternalPerspectiveDSL.g:5098:4: ';'
            {
             before(grammarAccess.getIntraLanguageMappingAccess().getChangeModelSemicolonKeyword_16_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getIntraLanguageMappingAccess().getChangeModelSemicolonKeyword_16_0()); 

            }

             after(grammarAccess.getIntraLanguageMappingAccess().getChangeModelSemicolonKeyword_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__ChangeModelAssignment_16"


    // $ANTLR start "rule__IntraLanguageMapping__FromElementAssignment_19"
    // InternalPerspectiveDSL.g:5109:1: rule__IntraLanguageMapping__FromElementAssignment_19 : ( RULE_ID ) ;
    public final void rule__IntraLanguageMapping__FromElementAssignment_19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:5113:1: ( ( RULE_ID ) )
            // InternalPerspectiveDSL.g:5114:2: ( RULE_ID )
            {
            // InternalPerspectiveDSL.g:5114:2: ( RULE_ID )
            // InternalPerspectiveDSL.g:5115:3: RULE_ID
            {
             before(grammarAccess.getIntraLanguageMappingAccess().getFromElementIDTerminalRuleCall_19_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIntraLanguageMappingAccess().getFromElementIDTerminalRuleCall_19_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__FromElementAssignment_19"


    // $ANTLR start "rule__IntraLanguageMapping__FromGetElementAssignment_21"
    // InternalPerspectiveDSL.g:5124:1: rule__IntraLanguageMapping__FromGetElementAssignment_21 : ( RULE_STRING ) ;
    public final void rule__IntraLanguageMapping__FromGetElementAssignment_21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:5128:1: ( ( RULE_STRING ) )
            // InternalPerspectiveDSL.g:5129:2: ( RULE_STRING )
            {
            // InternalPerspectiveDSL.g:5129:2: ( RULE_STRING )
            // InternalPerspectiveDSL.g:5130:3: RULE_STRING
            {
             before(grammarAccess.getIntraLanguageMappingAccess().getFromGetElementSTRINGTerminalRuleCall_21_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getIntraLanguageMappingAccess().getFromGetElementSTRINGTerminalRuleCall_21_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__FromGetElementAssignment_21"


    // $ANTLR start "rule__IntraLanguageMapping__HopsAssignment_25"
    // InternalPerspectiveDSL.g:5139:1: rule__IntraLanguageMapping__HopsAssignment_25 : ( ruleHop ) ;
    public final void rule__IntraLanguageMapping__HopsAssignment_25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:5143:1: ( ( ruleHop ) )
            // InternalPerspectiveDSL.g:5144:2: ( ruleHop )
            {
            // InternalPerspectiveDSL.g:5144:2: ( ruleHop )
            // InternalPerspectiveDSL.g:5145:3: ruleHop
            {
             before(grammarAccess.getIntraLanguageMappingAccess().getHopsHopParserRuleCall_25_0()); 
            pushFollow(FOLLOW_2);
            ruleHop();

            state._fsp--;

             after(grammarAccess.getIntraLanguageMappingAccess().getHopsHopParserRuleCall_25_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntraLanguageMapping__HopsAssignment_25"


    // $ANTLR start "rule__Hop__HopElementAssignment_2"
    // InternalPerspectiveDSL.g:5154:1: rule__Hop__HopElementAssignment_2 : ( RULE_ID ) ;
    public final void rule__Hop__HopElementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:5158:1: ( ( RULE_ID ) )
            // InternalPerspectiveDSL.g:5159:2: ( RULE_ID )
            {
            // InternalPerspectiveDSL.g:5159:2: ( RULE_ID )
            // InternalPerspectiveDSL.g:5160:3: RULE_ID
            {
             before(grammarAccess.getHopAccess().getHopElementIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getHopAccess().getHopElementIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hop__HopElementAssignment_2"


    // $ANTLR start "rule__Hop__FromGetHopAssignment_4"
    // InternalPerspectiveDSL.g:5169:1: rule__Hop__FromGetHopAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Hop__FromGetHopAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPerspectiveDSL.g:5173:1: ( ( RULE_STRING ) )
            // InternalPerspectiveDSL.g:5174:2: ( RULE_STRING )
            {
            // InternalPerspectiveDSL.g:5174:2: ( RULE_STRING )
            // InternalPerspectiveDSL.g:5175:3: RULE_STRING
            {
             before(grammarAccess.getHopAccess().getFromGetHopSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getHopAccess().getFromGetHopSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hop__FromGetHopAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000020100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000082000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0004000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000042000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000300010000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000100002000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000800002000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0800000002000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x1000000000000000L});

}