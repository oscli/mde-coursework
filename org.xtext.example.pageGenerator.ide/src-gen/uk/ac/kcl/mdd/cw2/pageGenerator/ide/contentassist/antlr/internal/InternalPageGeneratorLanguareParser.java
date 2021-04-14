package uk.ac.kcl.mdd.cw2.pageGenerator.ide.contentassist.antlr.internal;

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
import uk.ac.kcl.mdd.cw2.pageGenerator.services.PageGeneratorLanguareGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPageGeneratorLanguareParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "','", "'Head'", "'{'", "'}'", "'Title'", "'='", "';'", "'Description'", "'lable'", "'Body'", "'Heading'", "'<'", "'index'", "'>'", "'Font-colour'", "'Location'", "'Padding-left'", "'Padding-right'", "'Padding-top'", "'Padding-bottom'", "'Link'", "'target'", "'Font-size'", "'Picture'", "'size'", "'alternative-text'", "'Text'", "'Section'", "'Background-Colour'", "'Size'", "'Section-location'", "'Text-location'", "'*'", "'Custom'", "'colour'", "')'", "'Hightlight-word'", "'('"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
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
    public static final int RULE_STRING=4;
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


        public InternalPageGeneratorLanguareParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPageGeneratorLanguareParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPageGeneratorLanguareParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPageGeneratorLanguare.g"; }


    	private PageGeneratorLanguareGrammarAccess grammarAccess;

    	public void setGrammarAccess(PageGeneratorLanguareGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleWebPage"
    // InternalPageGeneratorLanguare.g:53:1: entryRuleWebPage : ruleWebPage EOF ;
    public final void entryRuleWebPage() throws RecognitionException {
        try {
            // InternalPageGeneratorLanguare.g:54:1: ( ruleWebPage EOF )
            // InternalPageGeneratorLanguare.g:55:1: ruleWebPage EOF
            {
             before(grammarAccess.getWebPageRule()); 
            pushFollow(FOLLOW_1);
            ruleWebPage();

            state._fsp--;

             after(grammarAccess.getWebPageRule()); 
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
    // $ANTLR end "entryRuleWebPage"


    // $ANTLR start "ruleWebPage"
    // InternalPageGeneratorLanguare.g:62:1: ruleWebPage : ( ( rule__WebPage__PageElementsAssignment )* ) ;
    public final void ruleWebPage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:66:2: ( ( ( rule__WebPage__PageElementsAssignment )* ) )
            // InternalPageGeneratorLanguare.g:67:2: ( ( rule__WebPage__PageElementsAssignment )* )
            {
            // InternalPageGeneratorLanguare.g:67:2: ( ( rule__WebPage__PageElementsAssignment )* )
            // InternalPageGeneratorLanguare.g:68:3: ( rule__WebPage__PageElementsAssignment )*
            {
             before(grammarAccess.getWebPageAccess().getPageElementsAssignment()); 
            // InternalPageGeneratorLanguare.g:69:3: ( rule__WebPage__PageElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13||LA1_0==21||LA1_0==36||LA1_0==45||LA1_0==48) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPageGeneratorLanguare.g:69:4: rule__WebPage__PageElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__WebPage__PageElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getWebPageAccess().getPageElementsAssignment()); 

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
    // $ANTLR end "ruleWebPage"


    // $ANTLR start "entryRulepageElement"
    // InternalPageGeneratorLanguare.g:78:1: entryRulepageElement : rulepageElement EOF ;
    public final void entryRulepageElement() throws RecognitionException {
        try {
            // InternalPageGeneratorLanguare.g:79:1: ( rulepageElement EOF )
            // InternalPageGeneratorLanguare.g:80:1: rulepageElement EOF
            {
             before(grammarAccess.getPageElementRule()); 
            pushFollow(FOLLOW_1);
            rulepageElement();

            state._fsp--;

             after(grammarAccess.getPageElementRule()); 
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
    // $ANTLR end "entryRulepageElement"


    // $ANTLR start "rulepageElement"
    // InternalPageGeneratorLanguare.g:87:1: rulepageElement : ( ( rule__PageElement__Alternatives ) ) ;
    public final void rulepageElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:91:2: ( ( ( rule__PageElement__Alternatives ) ) )
            // InternalPageGeneratorLanguare.g:92:2: ( ( rule__PageElement__Alternatives ) )
            {
            // InternalPageGeneratorLanguare.g:92:2: ( ( rule__PageElement__Alternatives ) )
            // InternalPageGeneratorLanguare.g:93:3: ( rule__PageElement__Alternatives )
            {
             before(grammarAccess.getPageElementAccess().getAlternatives()); 
            // InternalPageGeneratorLanguare.g:94:3: ( rule__PageElement__Alternatives )
            // InternalPageGeneratorLanguare.g:94:4: rule__PageElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PageElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPageElementAccess().getAlternatives()); 

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
    // $ANTLR end "rulepageElement"


    // $ANTLR start "entryRuleHead"
    // InternalPageGeneratorLanguare.g:103:1: entryRuleHead : ruleHead EOF ;
    public final void entryRuleHead() throws RecognitionException {
        try {
            // InternalPageGeneratorLanguare.g:104:1: ( ruleHead EOF )
            // InternalPageGeneratorLanguare.g:105:1: ruleHead EOF
            {
             before(grammarAccess.getHeadRule()); 
            pushFollow(FOLLOW_1);
            ruleHead();

            state._fsp--;

             after(grammarAccess.getHeadRule()); 
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
    // $ANTLR end "entryRuleHead"


    // $ANTLR start "ruleHead"
    // InternalPageGeneratorLanguare.g:112:1: ruleHead : ( ( rule__Head__Group__0 ) ) ;
    public final void ruleHead() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:116:2: ( ( ( rule__Head__Group__0 ) ) )
            // InternalPageGeneratorLanguare.g:117:2: ( ( rule__Head__Group__0 ) )
            {
            // InternalPageGeneratorLanguare.g:117:2: ( ( rule__Head__Group__0 ) )
            // InternalPageGeneratorLanguare.g:118:3: ( rule__Head__Group__0 )
            {
             before(grammarAccess.getHeadAccess().getGroup()); 
            // InternalPageGeneratorLanguare.g:119:3: ( rule__Head__Group__0 )
            // InternalPageGeneratorLanguare.g:119:4: rule__Head__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Head__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHeadAccess().getGroup()); 

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
    // $ANTLR end "ruleHead"


    // $ANTLR start "entryRuleheadElement"
    // InternalPageGeneratorLanguare.g:128:1: entryRuleheadElement : ruleheadElement EOF ;
    public final void entryRuleheadElement() throws RecognitionException {
        try {
            // InternalPageGeneratorLanguare.g:129:1: ( ruleheadElement EOF )
            // InternalPageGeneratorLanguare.g:130:1: ruleheadElement EOF
            {
             before(grammarAccess.getHeadElementRule()); 
            pushFollow(FOLLOW_1);
            ruleheadElement();

            state._fsp--;

             after(grammarAccess.getHeadElementRule()); 
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
    // $ANTLR end "entryRuleheadElement"


    // $ANTLR start "ruleheadElement"
    // InternalPageGeneratorLanguare.g:137:1: ruleheadElement : ( ( rule__HeadElement__Alternatives ) ) ;
    public final void ruleheadElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:141:2: ( ( ( rule__HeadElement__Alternatives ) ) )
            // InternalPageGeneratorLanguare.g:142:2: ( ( rule__HeadElement__Alternatives ) )
            {
            // InternalPageGeneratorLanguare.g:142:2: ( ( rule__HeadElement__Alternatives ) )
            // InternalPageGeneratorLanguare.g:143:3: ( rule__HeadElement__Alternatives )
            {
             before(grammarAccess.getHeadElementAccess().getAlternatives()); 
            // InternalPageGeneratorLanguare.g:144:3: ( rule__HeadElement__Alternatives )
            // InternalPageGeneratorLanguare.g:144:4: rule__HeadElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__HeadElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getHeadElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleheadElement"


    // $ANTLR start "entryRuleTitle"
    // InternalPageGeneratorLanguare.g:153:1: entryRuleTitle : ruleTitle EOF ;
    public final void entryRuleTitle() throws RecognitionException {
        try {
            // InternalPageGeneratorLanguare.g:154:1: ( ruleTitle EOF )
            // InternalPageGeneratorLanguare.g:155:1: ruleTitle EOF
            {
             before(grammarAccess.getTitleRule()); 
            pushFollow(FOLLOW_1);
            ruleTitle();

            state._fsp--;

             after(grammarAccess.getTitleRule()); 
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
    // $ANTLR end "entryRuleTitle"


    // $ANTLR start "ruleTitle"
    // InternalPageGeneratorLanguare.g:162:1: ruleTitle : ( ( rule__Title__Group__0 ) ) ;
    public final void ruleTitle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:166:2: ( ( ( rule__Title__Group__0 ) ) )
            // InternalPageGeneratorLanguare.g:167:2: ( ( rule__Title__Group__0 ) )
            {
            // InternalPageGeneratorLanguare.g:167:2: ( ( rule__Title__Group__0 ) )
            // InternalPageGeneratorLanguare.g:168:3: ( rule__Title__Group__0 )
            {
             before(grammarAccess.getTitleAccess().getGroup()); 
            // InternalPageGeneratorLanguare.g:169:3: ( rule__Title__Group__0 )
            // InternalPageGeneratorLanguare.g:169:4: rule__Title__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Title__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTitleAccess().getGroup()); 

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
    // $ANTLR end "ruleTitle"


    // $ANTLR start "entryRuleLabel"
    // InternalPageGeneratorLanguare.g:178:1: entryRuleLabel : ruleLabel EOF ;
    public final void entryRuleLabel() throws RecognitionException {
        try {
            // InternalPageGeneratorLanguare.g:179:1: ( ruleLabel EOF )
            // InternalPageGeneratorLanguare.g:180:1: ruleLabel EOF
            {
             before(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_1);
            ruleLabel();

            state._fsp--;

             after(grammarAccess.getLabelRule()); 
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
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // InternalPageGeneratorLanguare.g:187:1: ruleLabel : ( ( rule__Label__Group__0 ) ) ;
    public final void ruleLabel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:191:2: ( ( ( rule__Label__Group__0 ) ) )
            // InternalPageGeneratorLanguare.g:192:2: ( ( rule__Label__Group__0 ) )
            {
            // InternalPageGeneratorLanguare.g:192:2: ( ( rule__Label__Group__0 ) )
            // InternalPageGeneratorLanguare.g:193:3: ( rule__Label__Group__0 )
            {
             before(grammarAccess.getLabelAccess().getGroup()); 
            // InternalPageGeneratorLanguare.g:194:3: ( rule__Label__Group__0 )
            // InternalPageGeneratorLanguare.g:194:4: rule__Label__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Label__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLabelAccess().getGroup()); 

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
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleBody"
    // InternalPageGeneratorLanguare.g:203:1: entryRuleBody : ruleBody EOF ;
    public final void entryRuleBody() throws RecognitionException {
        try {
            // InternalPageGeneratorLanguare.g:204:1: ( ruleBody EOF )
            // InternalPageGeneratorLanguare.g:205:1: ruleBody EOF
            {
             before(grammarAccess.getBodyRule()); 
            pushFollow(FOLLOW_1);
            ruleBody();

            state._fsp--;

             after(grammarAccess.getBodyRule()); 
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
    // $ANTLR end "entryRuleBody"


    // $ANTLR start "ruleBody"
    // InternalPageGeneratorLanguare.g:212:1: ruleBody : ( ( rule__Body__Group__0 ) ) ;
    public final void ruleBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:216:2: ( ( ( rule__Body__Group__0 ) ) )
            // InternalPageGeneratorLanguare.g:217:2: ( ( rule__Body__Group__0 ) )
            {
            // InternalPageGeneratorLanguare.g:217:2: ( ( rule__Body__Group__0 ) )
            // InternalPageGeneratorLanguare.g:218:3: ( rule__Body__Group__0 )
            {
             before(grammarAccess.getBodyAccess().getGroup()); 
            // InternalPageGeneratorLanguare.g:219:3: ( rule__Body__Group__0 )
            // InternalPageGeneratorLanguare.g:219:4: rule__Body__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Body__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBodyAccess().getGroup()); 

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
    // $ANTLR end "ruleBody"


    // $ANTLR start "entryRulebodyElement"
    // InternalPageGeneratorLanguare.g:228:1: entryRulebodyElement : rulebodyElement EOF ;
    public final void entryRulebodyElement() throws RecognitionException {
        try {
            // InternalPageGeneratorLanguare.g:229:1: ( rulebodyElement EOF )
            // InternalPageGeneratorLanguare.g:230:1: rulebodyElement EOF
            {
             before(grammarAccess.getBodyElementRule()); 
            pushFollow(FOLLOW_1);
            rulebodyElement();

            state._fsp--;

             after(grammarAccess.getBodyElementRule()); 
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
    // $ANTLR end "entryRulebodyElement"


    // $ANTLR start "rulebodyElement"
    // InternalPageGeneratorLanguare.g:237:1: rulebodyElement : ( ( rule__BodyElement__Alternatives ) ) ;
    public final void rulebodyElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:241:2: ( ( ( rule__BodyElement__Alternatives ) ) )
            // InternalPageGeneratorLanguare.g:242:2: ( ( rule__BodyElement__Alternatives ) )
            {
            // InternalPageGeneratorLanguare.g:242:2: ( ( rule__BodyElement__Alternatives ) )
            // InternalPageGeneratorLanguare.g:243:3: ( rule__BodyElement__Alternatives )
            {
             before(grammarAccess.getBodyElementAccess().getAlternatives()); 
            // InternalPageGeneratorLanguare.g:244:3: ( rule__BodyElement__Alternatives )
            // InternalPageGeneratorLanguare.g:244:4: rule__BodyElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BodyElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBodyElementAccess().getAlternatives()); 

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
    // $ANTLR end "rulebodyElement"


    // $ANTLR start "entryRuleHeading"
    // InternalPageGeneratorLanguare.g:253:1: entryRuleHeading : ruleHeading EOF ;
    public final void entryRuleHeading() throws RecognitionException {
        try {
            // InternalPageGeneratorLanguare.g:254:1: ( ruleHeading EOF )
            // InternalPageGeneratorLanguare.g:255:1: ruleHeading EOF
            {
             before(grammarAccess.getHeadingRule()); 
            pushFollow(FOLLOW_1);
            ruleHeading();

            state._fsp--;

             after(grammarAccess.getHeadingRule()); 
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
    // $ANTLR end "entryRuleHeading"


    // $ANTLR start "ruleHeading"
    // InternalPageGeneratorLanguare.g:262:1: ruleHeading : ( ( rule__Heading__Group__0 ) ) ;
    public final void ruleHeading() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:266:2: ( ( ( rule__Heading__Group__0 ) ) )
            // InternalPageGeneratorLanguare.g:267:2: ( ( rule__Heading__Group__0 ) )
            {
            // InternalPageGeneratorLanguare.g:267:2: ( ( rule__Heading__Group__0 ) )
            // InternalPageGeneratorLanguare.g:268:3: ( rule__Heading__Group__0 )
            {
             before(grammarAccess.getHeadingAccess().getGroup()); 
            // InternalPageGeneratorLanguare.g:269:3: ( rule__Heading__Group__0 )
            // InternalPageGeneratorLanguare.g:269:4: rule__Heading__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Heading__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHeadingAccess().getGroup()); 

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
    // $ANTLR end "ruleHeading"


    // $ANTLR start "entryRuleLink"
    // InternalPageGeneratorLanguare.g:278:1: entryRuleLink : ruleLink EOF ;
    public final void entryRuleLink() throws RecognitionException {
        try {
            // InternalPageGeneratorLanguare.g:279:1: ( ruleLink EOF )
            // InternalPageGeneratorLanguare.g:280:1: ruleLink EOF
            {
             before(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_1);
            ruleLink();

            state._fsp--;

             after(grammarAccess.getLinkRule()); 
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
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // InternalPageGeneratorLanguare.g:287:1: ruleLink : ( ( rule__Link__Group__0 ) ) ;
    public final void ruleLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:291:2: ( ( ( rule__Link__Group__0 ) ) )
            // InternalPageGeneratorLanguare.g:292:2: ( ( rule__Link__Group__0 ) )
            {
            // InternalPageGeneratorLanguare.g:292:2: ( ( rule__Link__Group__0 ) )
            // InternalPageGeneratorLanguare.g:293:3: ( rule__Link__Group__0 )
            {
             before(grammarAccess.getLinkAccess().getGroup()); 
            // InternalPageGeneratorLanguare.g:294:3: ( rule__Link__Group__0 )
            // InternalPageGeneratorLanguare.g:294:4: rule__Link__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getGroup()); 

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
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRulePicture"
    // InternalPageGeneratorLanguare.g:303:1: entryRulePicture : rulePicture EOF ;
    public final void entryRulePicture() throws RecognitionException {
        try {
            // InternalPageGeneratorLanguare.g:304:1: ( rulePicture EOF )
            // InternalPageGeneratorLanguare.g:305:1: rulePicture EOF
            {
             before(grammarAccess.getPictureRule()); 
            pushFollow(FOLLOW_1);
            rulePicture();

            state._fsp--;

             after(grammarAccess.getPictureRule()); 
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
    // $ANTLR end "entryRulePicture"


    // $ANTLR start "rulePicture"
    // InternalPageGeneratorLanguare.g:312:1: rulePicture : ( ( rule__Picture__Group__0 ) ) ;
    public final void rulePicture() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:316:2: ( ( ( rule__Picture__Group__0 ) ) )
            // InternalPageGeneratorLanguare.g:317:2: ( ( rule__Picture__Group__0 ) )
            {
            // InternalPageGeneratorLanguare.g:317:2: ( ( rule__Picture__Group__0 ) )
            // InternalPageGeneratorLanguare.g:318:3: ( rule__Picture__Group__0 )
            {
             before(grammarAccess.getPictureAccess().getGroup()); 
            // InternalPageGeneratorLanguare.g:319:3: ( rule__Picture__Group__0 )
            // InternalPageGeneratorLanguare.g:319:4: rule__Picture__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Picture__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPictureAccess().getGroup()); 

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
    // $ANTLR end "rulePicture"


    // $ANTLR start "entryRuleText"
    // InternalPageGeneratorLanguare.g:328:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // InternalPageGeneratorLanguare.g:329:1: ( ruleText EOF )
            // InternalPageGeneratorLanguare.g:330:1: ruleText EOF
            {
             before(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_1);
            ruleText();

            state._fsp--;

             after(grammarAccess.getTextRule()); 
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
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // InternalPageGeneratorLanguare.g:337:1: ruleText : ( ( rule__Text__Group__0 ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:341:2: ( ( ( rule__Text__Group__0 ) ) )
            // InternalPageGeneratorLanguare.g:342:2: ( ( rule__Text__Group__0 ) )
            {
            // InternalPageGeneratorLanguare.g:342:2: ( ( rule__Text__Group__0 ) )
            // InternalPageGeneratorLanguare.g:343:3: ( rule__Text__Group__0 )
            {
             before(grammarAccess.getTextAccess().getGroup()); 
            // InternalPageGeneratorLanguare.g:344:3: ( rule__Text__Group__0 )
            // InternalPageGeneratorLanguare.g:344:4: rule__Text__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Text__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getGroup()); 

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
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleSection"
    // InternalPageGeneratorLanguare.g:353:1: entryRuleSection : ruleSection EOF ;
    public final void entryRuleSection() throws RecognitionException {
        try {
            // InternalPageGeneratorLanguare.g:354:1: ( ruleSection EOF )
            // InternalPageGeneratorLanguare.g:355:1: ruleSection EOF
            {
             before(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_1);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getSectionRule()); 
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
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // InternalPageGeneratorLanguare.g:362:1: ruleSection : ( ( rule__Section__Group__0 ) ) ;
    public final void ruleSection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:366:2: ( ( ( rule__Section__Group__0 ) ) )
            // InternalPageGeneratorLanguare.g:367:2: ( ( rule__Section__Group__0 ) )
            {
            // InternalPageGeneratorLanguare.g:367:2: ( ( rule__Section__Group__0 ) )
            // InternalPageGeneratorLanguare.g:368:3: ( rule__Section__Group__0 )
            {
             before(grammarAccess.getSectionAccess().getGroup()); 
            // InternalPageGeneratorLanguare.g:369:3: ( rule__Section__Group__0 )
            // InternalPageGeneratorLanguare.g:369:4: rule__Section__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getGroup()); 

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
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRulelocationexpression"
    // InternalPageGeneratorLanguare.g:378:1: entryRulelocationexpression : rulelocationexpression EOF ;
    public final void entryRulelocationexpression() throws RecognitionException {
        try {
            // InternalPageGeneratorLanguare.g:379:1: ( rulelocationexpression EOF )
            // InternalPageGeneratorLanguare.g:380:1: rulelocationexpression EOF
            {
             before(grammarAccess.getLocationexpressionRule()); 
            pushFollow(FOLLOW_1);
            rulelocationexpression();

            state._fsp--;

             after(grammarAccess.getLocationexpressionRule()); 
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
    // $ANTLR end "entryRulelocationexpression"


    // $ANTLR start "rulelocationexpression"
    // InternalPageGeneratorLanguare.g:387:1: rulelocationexpression : ( ( rule__Locationexpression__LocationAssignment ) ) ;
    public final void rulelocationexpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:391:2: ( ( ( rule__Locationexpression__LocationAssignment ) ) )
            // InternalPageGeneratorLanguare.g:392:2: ( ( rule__Locationexpression__LocationAssignment ) )
            {
            // InternalPageGeneratorLanguare.g:392:2: ( ( rule__Locationexpression__LocationAssignment ) )
            // InternalPageGeneratorLanguare.g:393:3: ( rule__Locationexpression__LocationAssignment )
            {
             before(grammarAccess.getLocationexpressionAccess().getLocationAssignment()); 
            // InternalPageGeneratorLanguare.g:394:3: ( rule__Locationexpression__LocationAssignment )
            // InternalPageGeneratorLanguare.g:394:4: rule__Locationexpression__LocationAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Locationexpression__LocationAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLocationexpressionAccess().getLocationAssignment()); 

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
    // $ANTLR end "rulelocationexpression"


    // $ANTLR start "entryRuleprimarySize"
    // InternalPageGeneratorLanguare.g:403:1: entryRuleprimarySize : ruleprimarySize EOF ;
    public final void entryRuleprimarySize() throws RecognitionException {
        try {
            // InternalPageGeneratorLanguare.g:404:1: ( ruleprimarySize EOF )
            // InternalPageGeneratorLanguare.g:405:1: ruleprimarySize EOF
            {
             before(grammarAccess.getPrimarySizeRule()); 
            pushFollow(FOLLOW_1);
            ruleprimarySize();

            state._fsp--;

             after(grammarAccess.getPrimarySizeRule()); 
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
    // $ANTLR end "entryRuleprimarySize"


    // $ANTLR start "ruleprimarySize"
    // InternalPageGeneratorLanguare.g:412:1: ruleprimarySize : ( ( rule__PrimarySize__Alternatives ) ) ;
    public final void ruleprimarySize() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:416:2: ( ( ( rule__PrimarySize__Alternatives ) ) )
            // InternalPageGeneratorLanguare.g:417:2: ( ( rule__PrimarySize__Alternatives ) )
            {
            // InternalPageGeneratorLanguare.g:417:2: ( ( rule__PrimarySize__Alternatives ) )
            // InternalPageGeneratorLanguare.g:418:3: ( rule__PrimarySize__Alternatives )
            {
             before(grammarAccess.getPrimarySizeAccess().getAlternatives()); 
            // InternalPageGeneratorLanguare.g:419:3: ( rule__PrimarySize__Alternatives )
            // InternalPageGeneratorLanguare.g:419:4: rule__PrimarySize__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimarySize__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimarySizeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleprimarySize"


    // $ANTLR start "entryRuleSizeDeclaration"
    // InternalPageGeneratorLanguare.g:428:1: entryRuleSizeDeclaration : ruleSizeDeclaration EOF ;
    public final void entryRuleSizeDeclaration() throws RecognitionException {
        try {
            // InternalPageGeneratorLanguare.g:429:1: ( ruleSizeDeclaration EOF )
            // InternalPageGeneratorLanguare.g:430:1: ruleSizeDeclaration EOF
            {
             before(grammarAccess.getSizeDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleSizeDeclaration();

            state._fsp--;

             after(grammarAccess.getSizeDeclarationRule()); 
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
    // $ANTLR end "entryRuleSizeDeclaration"


    // $ANTLR start "ruleSizeDeclaration"
    // InternalPageGeneratorLanguare.g:437:1: ruleSizeDeclaration : ( ( rule__SizeDeclaration__Group__0 ) ) ;
    public final void ruleSizeDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:441:2: ( ( ( rule__SizeDeclaration__Group__0 ) ) )
            // InternalPageGeneratorLanguare.g:442:2: ( ( rule__SizeDeclaration__Group__0 ) )
            {
            // InternalPageGeneratorLanguare.g:442:2: ( ( rule__SizeDeclaration__Group__0 ) )
            // InternalPageGeneratorLanguare.g:443:3: ( rule__SizeDeclaration__Group__0 )
            {
             before(grammarAccess.getSizeDeclarationAccess().getGroup()); 
            // InternalPageGeneratorLanguare.g:444:3: ( rule__SizeDeclaration__Group__0 )
            // InternalPageGeneratorLanguare.g:444:4: rule__SizeDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SizeDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSizeDeclarationAccess().getGroup()); 

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
    // $ANTLR end "ruleSizeDeclaration"


    // $ANTLR start "entryRulesizeValue"
    // InternalPageGeneratorLanguare.g:453:1: entryRulesizeValue : rulesizeValue EOF ;
    public final void entryRulesizeValue() throws RecognitionException {
        try {
            // InternalPageGeneratorLanguare.g:454:1: ( rulesizeValue EOF )
            // InternalPageGeneratorLanguare.g:455:1: rulesizeValue EOF
            {
             before(grammarAccess.getSizeValueRule()); 
            pushFollow(FOLLOW_1);
            rulesizeValue();

            state._fsp--;

             after(grammarAccess.getSizeValueRule()); 
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
    // $ANTLR end "entryRulesizeValue"


    // $ANTLR start "rulesizeValue"
    // InternalPageGeneratorLanguare.g:462:1: rulesizeValue : ( ( rule__SizeValue__Group__0 ) ) ;
    public final void rulesizeValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:466:2: ( ( ( rule__SizeValue__Group__0 ) ) )
            // InternalPageGeneratorLanguare.g:467:2: ( ( rule__SizeValue__Group__0 ) )
            {
            // InternalPageGeneratorLanguare.g:467:2: ( ( rule__SizeValue__Group__0 ) )
            // InternalPageGeneratorLanguare.g:468:3: ( rule__SizeValue__Group__0 )
            {
             before(grammarAccess.getSizeValueAccess().getGroup()); 
            // InternalPageGeneratorLanguare.g:469:3: ( rule__SizeValue__Group__0 )
            // InternalPageGeneratorLanguare.g:469:4: rule__SizeValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SizeValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSizeValueAccess().getGroup()); 

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
    // $ANTLR end "rulesizeValue"


    // $ANTLR start "entryRuleSizeExpression"
    // InternalPageGeneratorLanguare.g:478:1: entryRuleSizeExpression : ruleSizeExpression EOF ;
    public final void entryRuleSizeExpression() throws RecognitionException {
        try {
            // InternalPageGeneratorLanguare.g:479:1: ( ruleSizeExpression EOF )
            // InternalPageGeneratorLanguare.g:480:1: ruleSizeExpression EOF
            {
             before(grammarAccess.getSizeExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleSizeExpression();

            state._fsp--;

             after(grammarAccess.getSizeExpressionRule()); 
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
    // $ANTLR end "entryRuleSizeExpression"


    // $ANTLR start "ruleSizeExpression"
    // InternalPageGeneratorLanguare.g:487:1: ruleSizeExpression : ( ( rule__SizeExpression__SizeAssignment ) ) ;
    public final void ruleSizeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:491:2: ( ( ( rule__SizeExpression__SizeAssignment ) ) )
            // InternalPageGeneratorLanguare.g:492:2: ( ( rule__SizeExpression__SizeAssignment ) )
            {
            // InternalPageGeneratorLanguare.g:492:2: ( ( rule__SizeExpression__SizeAssignment ) )
            // InternalPageGeneratorLanguare.g:493:3: ( rule__SizeExpression__SizeAssignment )
            {
             before(grammarAccess.getSizeExpressionAccess().getSizeAssignment()); 
            // InternalPageGeneratorLanguare.g:494:3: ( rule__SizeExpression__SizeAssignment )
            // InternalPageGeneratorLanguare.g:494:4: rule__SizeExpression__SizeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__SizeExpression__SizeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSizeExpressionAccess().getSizeAssignment()); 

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
    // $ANTLR end "ruleSizeExpression"


    // $ANTLR start "entryRuleprimaryColour"
    // InternalPageGeneratorLanguare.g:503:1: entryRuleprimaryColour : ruleprimaryColour EOF ;
    public final void entryRuleprimaryColour() throws RecognitionException {
        try {
            // InternalPageGeneratorLanguare.g:504:1: ( ruleprimaryColour EOF )
            // InternalPageGeneratorLanguare.g:505:1: ruleprimaryColour EOF
            {
             before(grammarAccess.getPrimaryColourRule()); 
            pushFollow(FOLLOW_1);
            ruleprimaryColour();

            state._fsp--;

             after(grammarAccess.getPrimaryColourRule()); 
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
    // $ANTLR end "entryRuleprimaryColour"


    // $ANTLR start "ruleprimaryColour"
    // InternalPageGeneratorLanguare.g:512:1: ruleprimaryColour : ( ( rule__PrimaryColour__Alternatives ) ) ;
    public final void ruleprimaryColour() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:516:2: ( ( ( rule__PrimaryColour__Alternatives ) ) )
            // InternalPageGeneratorLanguare.g:517:2: ( ( rule__PrimaryColour__Alternatives ) )
            {
            // InternalPageGeneratorLanguare.g:517:2: ( ( rule__PrimaryColour__Alternatives ) )
            // InternalPageGeneratorLanguare.g:518:3: ( rule__PrimaryColour__Alternatives )
            {
             before(grammarAccess.getPrimaryColourAccess().getAlternatives()); 
            // InternalPageGeneratorLanguare.g:519:3: ( rule__PrimaryColour__Alternatives )
            // InternalPageGeneratorLanguare.g:519:4: rule__PrimaryColour__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryColour__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryColourAccess().getAlternatives()); 

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
    // $ANTLR end "ruleprimaryColour"


    // $ANTLR start "entryRulecolourValue"
    // InternalPageGeneratorLanguare.g:528:1: entryRulecolourValue : rulecolourValue EOF ;
    public final void entryRulecolourValue() throws RecognitionException {
        try {
            // InternalPageGeneratorLanguare.g:529:1: ( rulecolourValue EOF )
            // InternalPageGeneratorLanguare.g:530:1: rulecolourValue EOF
            {
             before(grammarAccess.getColourValueRule()); 
            pushFollow(FOLLOW_1);
            rulecolourValue();

            state._fsp--;

             after(grammarAccess.getColourValueRule()); 
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
    // $ANTLR end "entryRulecolourValue"


    // $ANTLR start "rulecolourValue"
    // InternalPageGeneratorLanguare.g:537:1: rulecolourValue : ( ( rule__ColourValue__ColourAssignment ) ) ;
    public final void rulecolourValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:541:2: ( ( ( rule__ColourValue__ColourAssignment ) ) )
            // InternalPageGeneratorLanguare.g:542:2: ( ( rule__ColourValue__ColourAssignment ) )
            {
            // InternalPageGeneratorLanguare.g:542:2: ( ( rule__ColourValue__ColourAssignment ) )
            // InternalPageGeneratorLanguare.g:543:3: ( rule__ColourValue__ColourAssignment )
            {
             before(grammarAccess.getColourValueAccess().getColourAssignment()); 
            // InternalPageGeneratorLanguare.g:544:3: ( rule__ColourValue__ColourAssignment )
            // InternalPageGeneratorLanguare.g:544:4: rule__ColourValue__ColourAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ColourValue__ColourAssignment();

            state._fsp--;


            }

             after(grammarAccess.getColourValueAccess().getColourAssignment()); 

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
    // $ANTLR end "rulecolourValue"


    // $ANTLR start "entryRuleColourRGB"
    // InternalPageGeneratorLanguare.g:553:1: entryRuleColourRGB : ruleColourRGB EOF ;
    public final void entryRuleColourRGB() throws RecognitionException {
        try {
            // InternalPageGeneratorLanguare.g:554:1: ( ruleColourRGB EOF )
            // InternalPageGeneratorLanguare.g:555:1: ruleColourRGB EOF
            {
             before(grammarAccess.getColourRGBRule()); 
            pushFollow(FOLLOW_1);
            ruleColourRGB();

            state._fsp--;

             after(grammarAccess.getColourRGBRule()); 
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
    // $ANTLR end "entryRuleColourRGB"


    // $ANTLR start "ruleColourRGB"
    // InternalPageGeneratorLanguare.g:562:1: ruleColourRGB : ( ( rule__ColourRGB__Group__0 ) ) ;
    public final void ruleColourRGB() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:566:2: ( ( ( rule__ColourRGB__Group__0 ) ) )
            // InternalPageGeneratorLanguare.g:567:2: ( ( rule__ColourRGB__Group__0 ) )
            {
            // InternalPageGeneratorLanguare.g:567:2: ( ( rule__ColourRGB__Group__0 ) )
            // InternalPageGeneratorLanguare.g:568:3: ( rule__ColourRGB__Group__0 )
            {
             before(grammarAccess.getColourRGBAccess().getGroup()); 
            // InternalPageGeneratorLanguare.g:569:3: ( rule__ColourRGB__Group__0 )
            // InternalPageGeneratorLanguare.g:569:4: rule__ColourRGB__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ColourRGB__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColourRGBAccess().getGroup()); 

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
    // $ANTLR end "ruleColourRGB"


    // $ANTLR start "entryRuleColourExpression"
    // InternalPageGeneratorLanguare.g:578:1: entryRuleColourExpression : ruleColourExpression EOF ;
    public final void entryRuleColourExpression() throws RecognitionException {
        try {
            // InternalPageGeneratorLanguare.g:579:1: ( ruleColourExpression EOF )
            // InternalPageGeneratorLanguare.g:580:1: ruleColourExpression EOF
            {
             before(grammarAccess.getColourExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleColourExpression();

            state._fsp--;

             after(grammarAccess.getColourExpressionRule()); 
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
    // $ANTLR end "entryRuleColourExpression"


    // $ANTLR start "ruleColourExpression"
    // InternalPageGeneratorLanguare.g:587:1: ruleColourExpression : ( ( rule__ColourExpression__ColourAssignment ) ) ;
    public final void ruleColourExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:591:2: ( ( ( rule__ColourExpression__ColourAssignment ) ) )
            // InternalPageGeneratorLanguare.g:592:2: ( ( rule__ColourExpression__ColourAssignment ) )
            {
            // InternalPageGeneratorLanguare.g:592:2: ( ( rule__ColourExpression__ColourAssignment ) )
            // InternalPageGeneratorLanguare.g:593:3: ( rule__ColourExpression__ColourAssignment )
            {
             before(grammarAccess.getColourExpressionAccess().getColourAssignment()); 
            // InternalPageGeneratorLanguare.g:594:3: ( rule__ColourExpression__ColourAssignment )
            // InternalPageGeneratorLanguare.g:594:4: rule__ColourExpression__ColourAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ColourExpression__ColourAssignment();

            state._fsp--;


            }

             after(grammarAccess.getColourExpressionAccess().getColourAssignment()); 

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
    // $ANTLR end "ruleColourExpression"


    // $ANTLR start "entryRuleContent"
    // InternalPageGeneratorLanguare.g:603:1: entryRuleContent : ruleContent EOF ;
    public final void entryRuleContent() throws RecognitionException {
        try {
            // InternalPageGeneratorLanguare.g:604:1: ( ruleContent EOF )
            // InternalPageGeneratorLanguare.g:605:1: ruleContent EOF
            {
             before(grammarAccess.getContentRule()); 
            pushFollow(FOLLOW_1);
            ruleContent();

            state._fsp--;

             after(grammarAccess.getContentRule()); 
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
    // $ANTLR end "entryRuleContent"


    // $ANTLR start "ruleContent"
    // InternalPageGeneratorLanguare.g:612:1: ruleContent : ( ( rule__Content__Group__0 ) ) ;
    public final void ruleContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:616:2: ( ( ( rule__Content__Group__0 ) ) )
            // InternalPageGeneratorLanguare.g:617:2: ( ( rule__Content__Group__0 ) )
            {
            // InternalPageGeneratorLanguare.g:617:2: ( ( rule__Content__Group__0 ) )
            // InternalPageGeneratorLanguare.g:618:3: ( rule__Content__Group__0 )
            {
             before(grammarAccess.getContentAccess().getGroup()); 
            // InternalPageGeneratorLanguare.g:619:3: ( rule__Content__Group__0 )
            // InternalPageGeneratorLanguare.g:619:4: rule__Content__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Content__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContentAccess().getGroup()); 

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
    // $ANTLR end "ruleContent"


    // $ANTLR start "entryRuleprimaryString"
    // InternalPageGeneratorLanguare.g:628:1: entryRuleprimaryString : ruleprimaryString EOF ;
    public final void entryRuleprimaryString() throws RecognitionException {
        try {
            // InternalPageGeneratorLanguare.g:629:1: ( ruleprimaryString EOF )
            // InternalPageGeneratorLanguare.g:630:1: ruleprimaryString EOF
            {
             before(grammarAccess.getPrimaryStringRule()); 
            pushFollow(FOLLOW_1);
            ruleprimaryString();

            state._fsp--;

             after(grammarAccess.getPrimaryStringRule()); 
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
    // $ANTLR end "entryRuleprimaryString"


    // $ANTLR start "ruleprimaryString"
    // InternalPageGeneratorLanguare.g:637:1: ruleprimaryString : ( ( rule__PrimaryString__Alternatives ) ) ;
    public final void ruleprimaryString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:641:2: ( ( ( rule__PrimaryString__Alternatives ) ) )
            // InternalPageGeneratorLanguare.g:642:2: ( ( rule__PrimaryString__Alternatives ) )
            {
            // InternalPageGeneratorLanguare.g:642:2: ( ( rule__PrimaryString__Alternatives ) )
            // InternalPageGeneratorLanguare.g:643:3: ( rule__PrimaryString__Alternatives )
            {
             before(grammarAccess.getPrimaryStringAccess().getAlternatives()); 
            // InternalPageGeneratorLanguare.g:644:3: ( rule__PrimaryString__Alternatives )
            // InternalPageGeneratorLanguare.g:644:4: rule__PrimaryString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryStringAccess().getAlternatives()); 

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
    // $ANTLR end "ruleprimaryString"


    // $ANTLR start "entryRulestringValue"
    // InternalPageGeneratorLanguare.g:653:1: entryRulestringValue : rulestringValue EOF ;
    public final void entryRulestringValue() throws RecognitionException {
        try {
            // InternalPageGeneratorLanguare.g:654:1: ( rulestringValue EOF )
            // InternalPageGeneratorLanguare.g:655:1: rulestringValue EOF
            {
             before(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_1);
            rulestringValue();

            state._fsp--;

             after(grammarAccess.getStringValueRule()); 
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
    // $ANTLR end "entryRulestringValue"


    // $ANTLR start "rulestringValue"
    // InternalPageGeneratorLanguare.g:662:1: rulestringValue : ( ( rule__StringValue__ValAssignment ) ) ;
    public final void rulestringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:666:2: ( ( ( rule__StringValue__ValAssignment ) ) )
            // InternalPageGeneratorLanguare.g:667:2: ( ( rule__StringValue__ValAssignment ) )
            {
            // InternalPageGeneratorLanguare.g:667:2: ( ( rule__StringValue__ValAssignment ) )
            // InternalPageGeneratorLanguare.g:668:3: ( rule__StringValue__ValAssignment )
            {
             before(grammarAccess.getStringValueAccess().getValAssignment()); 
            // InternalPageGeneratorLanguare.g:669:3: ( rule__StringValue__ValAssignment )
            // InternalPageGeneratorLanguare.g:669:4: rule__StringValue__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringValue__ValAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringValueAccess().getValAssignment()); 

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
    // $ANTLR end "rulestringValue"


    // $ANTLR start "entryRulestringReference"
    // InternalPageGeneratorLanguare.g:678:1: entryRulestringReference : rulestringReference EOF ;
    public final void entryRulestringReference() throws RecognitionException {
        try {
            // InternalPageGeneratorLanguare.g:679:1: ( rulestringReference EOF )
            // InternalPageGeneratorLanguare.g:680:1: rulestringReference EOF
            {
             before(grammarAccess.getStringReferenceRule()); 
            pushFollow(FOLLOW_1);
            rulestringReference();

            state._fsp--;

             after(grammarAccess.getStringReferenceRule()); 
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
    // $ANTLR end "entryRulestringReference"


    // $ANTLR start "rulestringReference"
    // InternalPageGeneratorLanguare.g:687:1: rulestringReference : ( ( rule__StringReference__StringreferenceAssignment ) ) ;
    public final void rulestringReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:691:2: ( ( ( rule__StringReference__StringreferenceAssignment ) ) )
            // InternalPageGeneratorLanguare.g:692:2: ( ( rule__StringReference__StringreferenceAssignment ) )
            {
            // InternalPageGeneratorLanguare.g:692:2: ( ( rule__StringReference__StringreferenceAssignment ) )
            // InternalPageGeneratorLanguare.g:693:3: ( rule__StringReference__StringreferenceAssignment )
            {
             before(grammarAccess.getStringReferenceAccess().getStringreferenceAssignment()); 
            // InternalPageGeneratorLanguare.g:694:3: ( rule__StringReference__StringreferenceAssignment )
            // InternalPageGeneratorLanguare.g:694:4: rule__StringReference__StringreferenceAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringReference__StringreferenceAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringReferenceAccess().getStringreferenceAssignment()); 

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
    // $ANTLR end "rulestringReference"


    // $ANTLR start "entryRulestringDeclaration"
    // InternalPageGeneratorLanguare.g:703:1: entryRulestringDeclaration : rulestringDeclaration EOF ;
    public final void entryRulestringDeclaration() throws RecognitionException {
        try {
            // InternalPageGeneratorLanguare.g:704:1: ( rulestringDeclaration EOF )
            // InternalPageGeneratorLanguare.g:705:1: rulestringDeclaration EOF
            {
             before(grammarAccess.getStringDeclarationRule()); 
            pushFollow(FOLLOW_1);
            rulestringDeclaration();

            state._fsp--;

             after(grammarAccess.getStringDeclarationRule()); 
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
    // $ANTLR end "entryRulestringDeclaration"


    // $ANTLR start "rulestringDeclaration"
    // InternalPageGeneratorLanguare.g:712:1: rulestringDeclaration : ( ( rule__StringDeclaration__Group__0 ) ) ;
    public final void rulestringDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:716:2: ( ( ( rule__StringDeclaration__Group__0 ) ) )
            // InternalPageGeneratorLanguare.g:717:2: ( ( rule__StringDeclaration__Group__0 ) )
            {
            // InternalPageGeneratorLanguare.g:717:2: ( ( rule__StringDeclaration__Group__0 ) )
            // InternalPageGeneratorLanguare.g:718:3: ( rule__StringDeclaration__Group__0 )
            {
             before(grammarAccess.getStringDeclarationAccess().getGroup()); 
            // InternalPageGeneratorLanguare.g:719:3: ( rule__StringDeclaration__Group__0 )
            // InternalPageGeneratorLanguare.g:719:4: rule__StringDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StringDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringDeclarationAccess().getGroup()); 

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
    // $ANTLR end "rulestringDeclaration"


    // $ANTLR start "rule__PageElement__Alternatives"
    // InternalPageGeneratorLanguare.g:727:1: rule__PageElement__Alternatives : ( ( ruleSizeDeclaration ) | ( ruleColourRGB ) | ( ruleBody ) | ( ruleHead ) | ( rulestringDeclaration ) );
    public final void rule__PageElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:731:1: ( ( ruleSizeDeclaration ) | ( ruleColourRGB ) | ( ruleBody ) | ( ruleHead ) | ( rulestringDeclaration ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt2=1;
                }
                break;
            case 45:
                {
                alt2=2;
                }
                break;
            case 21:
                {
                alt2=3;
                }
                break;
            case 13:
                {
                alt2=4;
                }
                break;
            case 48:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:732:2: ( ruleSizeDeclaration )
                    {
                    // InternalPageGeneratorLanguare.g:732:2: ( ruleSizeDeclaration )
                    // InternalPageGeneratorLanguare.g:733:3: ruleSizeDeclaration
                    {
                     before(grammarAccess.getPageElementAccess().getSizeDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSizeDeclaration();

                    state._fsp--;

                     after(grammarAccess.getPageElementAccess().getSizeDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPageGeneratorLanguare.g:738:2: ( ruleColourRGB )
                    {
                    // InternalPageGeneratorLanguare.g:738:2: ( ruleColourRGB )
                    // InternalPageGeneratorLanguare.g:739:3: ruleColourRGB
                    {
                     before(grammarAccess.getPageElementAccess().getColourRGBParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleColourRGB();

                    state._fsp--;

                     after(grammarAccess.getPageElementAccess().getColourRGBParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPageGeneratorLanguare.g:744:2: ( ruleBody )
                    {
                    // InternalPageGeneratorLanguare.g:744:2: ( ruleBody )
                    // InternalPageGeneratorLanguare.g:745:3: ruleBody
                    {
                     before(grammarAccess.getPageElementAccess().getBodyParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleBody();

                    state._fsp--;

                     after(grammarAccess.getPageElementAccess().getBodyParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPageGeneratorLanguare.g:750:2: ( ruleHead )
                    {
                    // InternalPageGeneratorLanguare.g:750:2: ( ruleHead )
                    // InternalPageGeneratorLanguare.g:751:3: ruleHead
                    {
                     before(grammarAccess.getPageElementAccess().getHeadParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleHead();

                    state._fsp--;

                     after(grammarAccess.getPageElementAccess().getHeadParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPageGeneratorLanguare.g:756:2: ( rulestringDeclaration )
                    {
                    // InternalPageGeneratorLanguare.g:756:2: ( rulestringDeclaration )
                    // InternalPageGeneratorLanguare.g:757:3: rulestringDeclaration
                    {
                     before(grammarAccess.getPageElementAccess().getStringDeclarationParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    rulestringDeclaration();

                    state._fsp--;

                     after(grammarAccess.getPageElementAccess().getStringDeclarationParserRuleCall_4()); 

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
    // $ANTLR end "rule__PageElement__Alternatives"


    // $ANTLR start "rule__HeadElement__Alternatives"
    // InternalPageGeneratorLanguare.g:766:1: rule__HeadElement__Alternatives : ( ( ruleTitle ) | ( ruleLabel ) );
    public final void rule__HeadElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:770:1: ( ( ruleTitle ) | ( ruleLabel ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            else if ( (LA3_0==19) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:771:2: ( ruleTitle )
                    {
                    // InternalPageGeneratorLanguare.g:771:2: ( ruleTitle )
                    // InternalPageGeneratorLanguare.g:772:3: ruleTitle
                    {
                     before(grammarAccess.getHeadElementAccess().getTitleParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTitle();

                    state._fsp--;

                     after(grammarAccess.getHeadElementAccess().getTitleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPageGeneratorLanguare.g:777:2: ( ruleLabel )
                    {
                    // InternalPageGeneratorLanguare.g:777:2: ( ruleLabel )
                    // InternalPageGeneratorLanguare.g:778:3: ruleLabel
                    {
                     before(grammarAccess.getHeadElementAccess().getLabelParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLabel();

                    state._fsp--;

                     after(grammarAccess.getHeadElementAccess().getLabelParserRuleCall_1()); 

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
    // $ANTLR end "rule__HeadElement__Alternatives"


    // $ANTLR start "rule__BodyElement__Alternatives"
    // InternalPageGeneratorLanguare.g:787:1: rule__BodyElement__Alternatives : ( ( ruleHeading ) | ( ruleLink ) | ( ruleText ) | ( rulePicture ) | ( ruleSection ) | ( ruleSizeDeclaration ) | ( ruleColourRGB ) | ( rulestringDeclaration ) );
    public final void rule__BodyElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:791:1: ( ( ruleHeading ) | ( ruleLink ) | ( ruleText ) | ( rulePicture ) | ( ruleSection ) | ( ruleSizeDeclaration ) | ( ruleColourRGB ) | ( rulestringDeclaration ) )
            int alt4=8;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt4=1;
                }
                break;
            case 32:
                {
                alt4=2;
                }
                break;
            case 38:
                {
                alt4=3;
                }
                break;
            case 35:
                {
                alt4=4;
                }
                break;
            case 39:
                {
                alt4=5;
                }
                break;
            case 36:
                {
                alt4=6;
                }
                break;
            case 45:
                {
                alt4=7;
                }
                break;
            case 48:
                {
                alt4=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:792:2: ( ruleHeading )
                    {
                    // InternalPageGeneratorLanguare.g:792:2: ( ruleHeading )
                    // InternalPageGeneratorLanguare.g:793:3: ruleHeading
                    {
                     before(grammarAccess.getBodyElementAccess().getHeadingParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleHeading();

                    state._fsp--;

                     after(grammarAccess.getBodyElementAccess().getHeadingParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPageGeneratorLanguare.g:798:2: ( ruleLink )
                    {
                    // InternalPageGeneratorLanguare.g:798:2: ( ruleLink )
                    // InternalPageGeneratorLanguare.g:799:3: ruleLink
                    {
                     before(grammarAccess.getBodyElementAccess().getLinkParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLink();

                    state._fsp--;

                     after(grammarAccess.getBodyElementAccess().getLinkParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPageGeneratorLanguare.g:804:2: ( ruleText )
                    {
                    // InternalPageGeneratorLanguare.g:804:2: ( ruleText )
                    // InternalPageGeneratorLanguare.g:805:3: ruleText
                    {
                     before(grammarAccess.getBodyElementAccess().getTextParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleText();

                    state._fsp--;

                     after(grammarAccess.getBodyElementAccess().getTextParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPageGeneratorLanguare.g:810:2: ( rulePicture )
                    {
                    // InternalPageGeneratorLanguare.g:810:2: ( rulePicture )
                    // InternalPageGeneratorLanguare.g:811:3: rulePicture
                    {
                     before(grammarAccess.getBodyElementAccess().getPictureParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    rulePicture();

                    state._fsp--;

                     after(grammarAccess.getBodyElementAccess().getPictureParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPageGeneratorLanguare.g:816:2: ( ruleSection )
                    {
                    // InternalPageGeneratorLanguare.g:816:2: ( ruleSection )
                    // InternalPageGeneratorLanguare.g:817:3: ruleSection
                    {
                     before(grammarAccess.getBodyElementAccess().getSectionParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleSection();

                    state._fsp--;

                     after(grammarAccess.getBodyElementAccess().getSectionParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalPageGeneratorLanguare.g:822:2: ( ruleSizeDeclaration )
                    {
                    // InternalPageGeneratorLanguare.g:822:2: ( ruleSizeDeclaration )
                    // InternalPageGeneratorLanguare.g:823:3: ruleSizeDeclaration
                    {
                     before(grammarAccess.getBodyElementAccess().getSizeDeclarationParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleSizeDeclaration();

                    state._fsp--;

                     after(grammarAccess.getBodyElementAccess().getSizeDeclarationParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalPageGeneratorLanguare.g:828:2: ( ruleColourRGB )
                    {
                    // InternalPageGeneratorLanguare.g:828:2: ( ruleColourRGB )
                    // InternalPageGeneratorLanguare.g:829:3: ruleColourRGB
                    {
                     before(grammarAccess.getBodyElementAccess().getColourRGBParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleColourRGB();

                    state._fsp--;

                     after(grammarAccess.getBodyElementAccess().getColourRGBParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalPageGeneratorLanguare.g:834:2: ( rulestringDeclaration )
                    {
                    // InternalPageGeneratorLanguare.g:834:2: ( rulestringDeclaration )
                    // InternalPageGeneratorLanguare.g:835:3: rulestringDeclaration
                    {
                     before(grammarAccess.getBodyElementAccess().getStringDeclarationParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    rulestringDeclaration();

                    state._fsp--;

                     after(grammarAccess.getBodyElementAccess().getStringDeclarationParserRuleCall_7()); 

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
    // $ANTLR end "rule__BodyElement__Alternatives"


    // $ANTLR start "rule__PrimarySize__Alternatives"
    // InternalPageGeneratorLanguare.g:844:1: rule__PrimarySize__Alternatives : ( ( ruleSizeExpression ) | ( rulesizeValue ) );
    public final void rule__PrimarySize__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:848:1: ( ( ruleSizeExpression ) | ( rulesizeValue ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_INT) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:849:2: ( ruleSizeExpression )
                    {
                    // InternalPageGeneratorLanguare.g:849:2: ( ruleSizeExpression )
                    // InternalPageGeneratorLanguare.g:850:3: ruleSizeExpression
                    {
                     before(grammarAccess.getPrimarySizeAccess().getSizeExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSizeExpression();

                    state._fsp--;

                     after(grammarAccess.getPrimarySizeAccess().getSizeExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPageGeneratorLanguare.g:855:2: ( rulesizeValue )
                    {
                    // InternalPageGeneratorLanguare.g:855:2: ( rulesizeValue )
                    // InternalPageGeneratorLanguare.g:856:3: rulesizeValue
                    {
                     before(grammarAccess.getPrimarySizeAccess().getSizeValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulesizeValue();

                    state._fsp--;

                     after(grammarAccess.getPrimarySizeAccess().getSizeValueParserRuleCall_1()); 

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
    // $ANTLR end "rule__PrimarySize__Alternatives"


    // $ANTLR start "rule__PrimaryColour__Alternatives"
    // InternalPageGeneratorLanguare.g:865:1: rule__PrimaryColour__Alternatives : ( ( ruleColourExpression ) | ( rulecolourValue ) );
    public final void rule__PrimaryColour__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:869:1: ( ( ruleColourExpression ) | ( rulecolourValue ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_STRING) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:870:2: ( ruleColourExpression )
                    {
                    // InternalPageGeneratorLanguare.g:870:2: ( ruleColourExpression )
                    // InternalPageGeneratorLanguare.g:871:3: ruleColourExpression
                    {
                     before(grammarAccess.getPrimaryColourAccess().getColourExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleColourExpression();

                    state._fsp--;

                     after(grammarAccess.getPrimaryColourAccess().getColourExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPageGeneratorLanguare.g:876:2: ( rulecolourValue )
                    {
                    // InternalPageGeneratorLanguare.g:876:2: ( rulecolourValue )
                    // InternalPageGeneratorLanguare.g:877:3: rulecolourValue
                    {
                     before(grammarAccess.getPrimaryColourAccess().getColourValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulecolourValue();

                    state._fsp--;

                     after(grammarAccess.getPrimaryColourAccess().getColourValueParserRuleCall_1()); 

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
    // $ANTLR end "rule__PrimaryColour__Alternatives"


    // $ANTLR start "rule__Content__SeparatorAlternatives_1_1_0"
    // InternalPageGeneratorLanguare.g:886:1: rule__Content__SeparatorAlternatives_1_1_0 : ( ( '+' ) | ( ',' ) );
    public final void rule__Content__SeparatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:890:1: ( ( '+' ) | ( ',' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==11) ) {
                alt7=1;
            }
            else if ( (LA7_0==12) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:891:2: ( '+' )
                    {
                    // InternalPageGeneratorLanguare.g:891:2: ( '+' )
                    // InternalPageGeneratorLanguare.g:892:3: '+'
                    {
                     before(grammarAccess.getContentAccess().getSeparatorPlusSignKeyword_1_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getContentAccess().getSeparatorPlusSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPageGeneratorLanguare.g:897:2: ( ',' )
                    {
                    // InternalPageGeneratorLanguare.g:897:2: ( ',' )
                    // InternalPageGeneratorLanguare.g:898:3: ','
                    {
                     before(grammarAccess.getContentAccess().getSeparatorCommaKeyword_1_1_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getContentAccess().getSeparatorCommaKeyword_1_1_0_1()); 

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
    // $ANTLR end "rule__Content__SeparatorAlternatives_1_1_0"


    // $ANTLR start "rule__PrimaryString__Alternatives"
    // InternalPageGeneratorLanguare.g:907:1: rule__PrimaryString__Alternatives : ( ( rulestringValue ) | ( rulestringReference ) );
    public final void rule__PrimaryString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:911:1: ( ( rulestringValue ) | ( rulestringReference ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:912:2: ( rulestringValue )
                    {
                    // InternalPageGeneratorLanguare.g:912:2: ( rulestringValue )
                    // InternalPageGeneratorLanguare.g:913:3: rulestringValue
                    {
                     before(grammarAccess.getPrimaryStringAccess().getStringValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulestringValue();

                    state._fsp--;

                     after(grammarAccess.getPrimaryStringAccess().getStringValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPageGeneratorLanguare.g:918:2: ( rulestringReference )
                    {
                    // InternalPageGeneratorLanguare.g:918:2: ( rulestringReference )
                    // InternalPageGeneratorLanguare.g:919:3: rulestringReference
                    {
                     before(grammarAccess.getPrimaryStringAccess().getStringReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulestringReference();

                    state._fsp--;

                     after(grammarAccess.getPrimaryStringAccess().getStringReferenceParserRuleCall_1()); 

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
    // $ANTLR end "rule__PrimaryString__Alternatives"


    // $ANTLR start "rule__Head__Group__0"
    // InternalPageGeneratorLanguare.g:928:1: rule__Head__Group__0 : rule__Head__Group__0__Impl rule__Head__Group__1 ;
    public final void rule__Head__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:932:1: ( rule__Head__Group__0__Impl rule__Head__Group__1 )
            // InternalPageGeneratorLanguare.g:933:2: rule__Head__Group__0__Impl rule__Head__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Head__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Head__Group__1();

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
    // $ANTLR end "rule__Head__Group__0"


    // $ANTLR start "rule__Head__Group__0__Impl"
    // InternalPageGeneratorLanguare.g:940:1: rule__Head__Group__0__Impl : ( () ) ;
    public final void rule__Head__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:944:1: ( ( () ) )
            // InternalPageGeneratorLanguare.g:945:1: ( () )
            {
            // InternalPageGeneratorLanguare.g:945:1: ( () )
            // InternalPageGeneratorLanguare.g:946:2: ()
            {
             before(grammarAccess.getHeadAccess().getHeadAction_0()); 
            // InternalPageGeneratorLanguare.g:947:2: ()
            // InternalPageGeneratorLanguare.g:947:3: 
            {
            }

             after(grammarAccess.getHeadAccess().getHeadAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Head__Group__0__Impl"


    // $ANTLR start "rule__Head__Group__1"
    // InternalPageGeneratorLanguare.g:955:1: rule__Head__Group__1 : rule__Head__Group__1__Impl rule__Head__Group__2 ;
    public final void rule__Head__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:959:1: ( rule__Head__Group__1__Impl rule__Head__Group__2 )
            // InternalPageGeneratorLanguare.g:960:2: rule__Head__Group__1__Impl rule__Head__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Head__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Head__Group__2();

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
    // $ANTLR end "rule__Head__Group__1"


    // $ANTLR start "rule__Head__Group__1__Impl"
    // InternalPageGeneratorLanguare.g:967:1: rule__Head__Group__1__Impl : ( 'Head' ) ;
    public final void rule__Head__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:971:1: ( ( 'Head' ) )
            // InternalPageGeneratorLanguare.g:972:1: ( 'Head' )
            {
            // InternalPageGeneratorLanguare.g:972:1: ( 'Head' )
            // InternalPageGeneratorLanguare.g:973:2: 'Head'
            {
             before(grammarAccess.getHeadAccess().getHeadKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getHeadAccess().getHeadKeyword_1()); 

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
    // $ANTLR end "rule__Head__Group__1__Impl"


    // $ANTLR start "rule__Head__Group__2"
    // InternalPageGeneratorLanguare.g:982:1: rule__Head__Group__2 : rule__Head__Group__2__Impl rule__Head__Group__3 ;
    public final void rule__Head__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:986:1: ( rule__Head__Group__2__Impl rule__Head__Group__3 )
            // InternalPageGeneratorLanguare.g:987:2: rule__Head__Group__2__Impl rule__Head__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Head__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Head__Group__3();

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
    // $ANTLR end "rule__Head__Group__2"


    // $ANTLR start "rule__Head__Group__2__Impl"
    // InternalPageGeneratorLanguare.g:994:1: rule__Head__Group__2__Impl : ( '{' ) ;
    public final void rule__Head__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:998:1: ( ( '{' ) )
            // InternalPageGeneratorLanguare.g:999:1: ( '{' )
            {
            // InternalPageGeneratorLanguare.g:999:1: ( '{' )
            // InternalPageGeneratorLanguare.g:1000:2: '{'
            {
             before(grammarAccess.getHeadAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getHeadAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Head__Group__2__Impl"


    // $ANTLR start "rule__Head__Group__3"
    // InternalPageGeneratorLanguare.g:1009:1: rule__Head__Group__3 : rule__Head__Group__3__Impl rule__Head__Group__4 ;
    public final void rule__Head__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1013:1: ( rule__Head__Group__3__Impl rule__Head__Group__4 )
            // InternalPageGeneratorLanguare.g:1014:2: rule__Head__Group__3__Impl rule__Head__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Head__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Head__Group__4();

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
    // $ANTLR end "rule__Head__Group__3"


    // $ANTLR start "rule__Head__Group__3__Impl"
    // InternalPageGeneratorLanguare.g:1021:1: rule__Head__Group__3__Impl : ( ( rule__Head__HeadElementsAssignment_3 )* ) ;
    public final void rule__Head__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1025:1: ( ( ( rule__Head__HeadElementsAssignment_3 )* ) )
            // InternalPageGeneratorLanguare.g:1026:1: ( ( rule__Head__HeadElementsAssignment_3 )* )
            {
            // InternalPageGeneratorLanguare.g:1026:1: ( ( rule__Head__HeadElementsAssignment_3 )* )
            // InternalPageGeneratorLanguare.g:1027:2: ( rule__Head__HeadElementsAssignment_3 )*
            {
             before(grammarAccess.getHeadAccess().getHeadElementsAssignment_3()); 
            // InternalPageGeneratorLanguare.g:1028:2: ( rule__Head__HeadElementsAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==16||LA9_0==19) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalPageGeneratorLanguare.g:1028:3: rule__Head__HeadElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Head__HeadElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getHeadAccess().getHeadElementsAssignment_3()); 

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
    // $ANTLR end "rule__Head__Group__3__Impl"


    // $ANTLR start "rule__Head__Group__4"
    // InternalPageGeneratorLanguare.g:1036:1: rule__Head__Group__4 : rule__Head__Group__4__Impl ;
    public final void rule__Head__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1040:1: ( rule__Head__Group__4__Impl )
            // InternalPageGeneratorLanguare.g:1041:2: rule__Head__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Head__Group__4__Impl();

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
    // $ANTLR end "rule__Head__Group__4"


    // $ANTLR start "rule__Head__Group__4__Impl"
    // InternalPageGeneratorLanguare.g:1047:1: rule__Head__Group__4__Impl : ( '}' ) ;
    public final void rule__Head__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1051:1: ( ( '}' ) )
            // InternalPageGeneratorLanguare.g:1052:1: ( '}' )
            {
            // InternalPageGeneratorLanguare.g:1052:1: ( '}' )
            // InternalPageGeneratorLanguare.g:1053:2: '}'
            {
             before(grammarAccess.getHeadAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getHeadAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Head__Group__4__Impl"


    // $ANTLR start "rule__Title__Group__0"
    // InternalPageGeneratorLanguare.g:1063:1: rule__Title__Group__0 : rule__Title__Group__0__Impl rule__Title__Group__1 ;
    public final void rule__Title__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1067:1: ( rule__Title__Group__0__Impl rule__Title__Group__1 )
            // InternalPageGeneratorLanguare.g:1068:2: rule__Title__Group__0__Impl rule__Title__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Title__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Title__Group__1();

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
    // $ANTLR end "rule__Title__Group__0"


    // $ANTLR start "rule__Title__Group__0__Impl"
    // InternalPageGeneratorLanguare.g:1075:1: rule__Title__Group__0__Impl : ( 'Title' ) ;
    public final void rule__Title__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1079:1: ( ( 'Title' ) )
            // InternalPageGeneratorLanguare.g:1080:1: ( 'Title' )
            {
            // InternalPageGeneratorLanguare.g:1080:1: ( 'Title' )
            // InternalPageGeneratorLanguare.g:1081:2: 'Title'
            {
             before(grammarAccess.getTitleAccess().getTitleKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTitleAccess().getTitleKeyword_0()); 

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
    // $ANTLR end "rule__Title__Group__0__Impl"


    // $ANTLR start "rule__Title__Group__1"
    // InternalPageGeneratorLanguare.g:1090:1: rule__Title__Group__1 : rule__Title__Group__1__Impl rule__Title__Group__2 ;
    public final void rule__Title__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1094:1: ( rule__Title__Group__1__Impl rule__Title__Group__2 )
            // InternalPageGeneratorLanguare.g:1095:2: rule__Title__Group__1__Impl rule__Title__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Title__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Title__Group__2();

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
    // $ANTLR end "rule__Title__Group__1"


    // $ANTLR start "rule__Title__Group__1__Impl"
    // InternalPageGeneratorLanguare.g:1102:1: rule__Title__Group__1__Impl : ( '=' ) ;
    public final void rule__Title__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1106:1: ( ( '=' ) )
            // InternalPageGeneratorLanguare.g:1107:1: ( '=' )
            {
            // InternalPageGeneratorLanguare.g:1107:1: ( '=' )
            // InternalPageGeneratorLanguare.g:1108:2: '='
            {
             before(grammarAccess.getTitleAccess().getEqualsSignKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTitleAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__Title__Group__1__Impl"


    // $ANTLR start "rule__Title__Group__2"
    // InternalPageGeneratorLanguare.g:1117:1: rule__Title__Group__2 : rule__Title__Group__2__Impl rule__Title__Group__3 ;
    public final void rule__Title__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1121:1: ( rule__Title__Group__2__Impl rule__Title__Group__3 )
            // InternalPageGeneratorLanguare.g:1122:2: rule__Title__Group__2__Impl rule__Title__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Title__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Title__Group__3();

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
    // $ANTLR end "rule__Title__Group__2"


    // $ANTLR start "rule__Title__Group__2__Impl"
    // InternalPageGeneratorLanguare.g:1129:1: rule__Title__Group__2__Impl : ( ( rule__Title__NameAssignment_2 ) ) ;
    public final void rule__Title__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1133:1: ( ( ( rule__Title__NameAssignment_2 ) ) )
            // InternalPageGeneratorLanguare.g:1134:1: ( ( rule__Title__NameAssignment_2 ) )
            {
            // InternalPageGeneratorLanguare.g:1134:1: ( ( rule__Title__NameAssignment_2 ) )
            // InternalPageGeneratorLanguare.g:1135:2: ( rule__Title__NameAssignment_2 )
            {
             before(grammarAccess.getTitleAccess().getNameAssignment_2()); 
            // InternalPageGeneratorLanguare.g:1136:2: ( rule__Title__NameAssignment_2 )
            // InternalPageGeneratorLanguare.g:1136:3: rule__Title__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Title__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTitleAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Title__Group__2__Impl"


    // $ANTLR start "rule__Title__Group__3"
    // InternalPageGeneratorLanguare.g:1144:1: rule__Title__Group__3 : rule__Title__Group__3__Impl ;
    public final void rule__Title__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1148:1: ( rule__Title__Group__3__Impl )
            // InternalPageGeneratorLanguare.g:1149:2: rule__Title__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Title__Group__3__Impl();

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
    // $ANTLR end "rule__Title__Group__3"


    // $ANTLR start "rule__Title__Group__3__Impl"
    // InternalPageGeneratorLanguare.g:1155:1: rule__Title__Group__3__Impl : ( ';' ) ;
    public final void rule__Title__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1159:1: ( ( ';' ) )
            // InternalPageGeneratorLanguare.g:1160:1: ( ';' )
            {
            // InternalPageGeneratorLanguare.g:1160:1: ( ';' )
            // InternalPageGeneratorLanguare.g:1161:2: ';'
            {
             before(grammarAccess.getTitleAccess().getSemicolonKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTitleAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__Title__Group__3__Impl"


    // $ANTLR start "rule__Label__Group__0"
    // InternalPageGeneratorLanguare.g:1171:1: rule__Label__Group__0 : rule__Label__Group__0__Impl rule__Label__Group__1 ;
    public final void rule__Label__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1175:1: ( rule__Label__Group__0__Impl rule__Label__Group__1 )
            // InternalPageGeneratorLanguare.g:1176:2: rule__Label__Group__0__Impl rule__Label__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Label__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Label__Group__1();

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
    // $ANTLR end "rule__Label__Group__0"


    // $ANTLR start "rule__Label__Group__0__Impl"
    // InternalPageGeneratorLanguare.g:1183:1: rule__Label__Group__0__Impl : ( 'Description' ) ;
    public final void rule__Label__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1187:1: ( ( 'Description' ) )
            // InternalPageGeneratorLanguare.g:1188:1: ( 'Description' )
            {
            // InternalPageGeneratorLanguare.g:1188:1: ( 'Description' )
            // InternalPageGeneratorLanguare.g:1189:2: 'Description'
            {
             before(grammarAccess.getLabelAccess().getDescriptionKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getLabelAccess().getDescriptionKeyword_0()); 

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
    // $ANTLR end "rule__Label__Group__0__Impl"


    // $ANTLR start "rule__Label__Group__1"
    // InternalPageGeneratorLanguare.g:1198:1: rule__Label__Group__1 : rule__Label__Group__1__Impl rule__Label__Group__2 ;
    public final void rule__Label__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1202:1: ( rule__Label__Group__1__Impl rule__Label__Group__2 )
            // InternalPageGeneratorLanguare.g:1203:2: rule__Label__Group__1__Impl rule__Label__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Label__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Label__Group__2();

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
    // $ANTLR end "rule__Label__Group__1"


    // $ANTLR start "rule__Label__Group__1__Impl"
    // InternalPageGeneratorLanguare.g:1210:1: rule__Label__Group__1__Impl : ( '=' ) ;
    public final void rule__Label__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1214:1: ( ( '=' ) )
            // InternalPageGeneratorLanguare.g:1215:1: ( '=' )
            {
            // InternalPageGeneratorLanguare.g:1215:1: ( '=' )
            // InternalPageGeneratorLanguare.g:1216:2: '='
            {
             before(grammarAccess.getLabelAccess().getEqualsSignKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLabelAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__Label__Group__1__Impl"


    // $ANTLR start "rule__Label__Group__2"
    // InternalPageGeneratorLanguare.g:1225:1: rule__Label__Group__2 : rule__Label__Group__2__Impl rule__Label__Group__3 ;
    public final void rule__Label__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1229:1: ( rule__Label__Group__2__Impl rule__Label__Group__3 )
            // InternalPageGeneratorLanguare.g:1230:2: rule__Label__Group__2__Impl rule__Label__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Label__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Label__Group__3();

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
    // $ANTLR end "rule__Label__Group__2"


    // $ANTLR start "rule__Label__Group__2__Impl"
    // InternalPageGeneratorLanguare.g:1237:1: rule__Label__Group__2__Impl : ( ( rule__Label__NameAssignment_2 ) ) ;
    public final void rule__Label__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1241:1: ( ( ( rule__Label__NameAssignment_2 ) ) )
            // InternalPageGeneratorLanguare.g:1242:1: ( ( rule__Label__NameAssignment_2 ) )
            {
            // InternalPageGeneratorLanguare.g:1242:1: ( ( rule__Label__NameAssignment_2 ) )
            // InternalPageGeneratorLanguare.g:1243:2: ( rule__Label__NameAssignment_2 )
            {
             before(grammarAccess.getLabelAccess().getNameAssignment_2()); 
            // InternalPageGeneratorLanguare.g:1244:2: ( rule__Label__NameAssignment_2 )
            // InternalPageGeneratorLanguare.g:1244:3: rule__Label__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Label__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLabelAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Label__Group__2__Impl"


    // $ANTLR start "rule__Label__Group__3"
    // InternalPageGeneratorLanguare.g:1252:1: rule__Label__Group__3 : rule__Label__Group__3__Impl rule__Label__Group__4 ;
    public final void rule__Label__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1256:1: ( rule__Label__Group__3__Impl rule__Label__Group__4 )
            // InternalPageGeneratorLanguare.g:1257:2: rule__Label__Group__3__Impl rule__Label__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Label__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Label__Group__4();

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
    // $ANTLR end "rule__Label__Group__3"


    // $ANTLR start "rule__Label__Group__3__Impl"
    // InternalPageGeneratorLanguare.g:1264:1: rule__Label__Group__3__Impl : ( ',' ) ;
    public final void rule__Label__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1268:1: ( ( ',' ) )
            // InternalPageGeneratorLanguare.g:1269:1: ( ',' )
            {
            // InternalPageGeneratorLanguare.g:1269:1: ( ',' )
            // InternalPageGeneratorLanguare.g:1270:2: ','
            {
             before(grammarAccess.getLabelAccess().getCommaKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getLabelAccess().getCommaKeyword_3()); 

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
    // $ANTLR end "rule__Label__Group__3__Impl"


    // $ANTLR start "rule__Label__Group__4"
    // InternalPageGeneratorLanguare.g:1279:1: rule__Label__Group__4 : rule__Label__Group__4__Impl rule__Label__Group__5 ;
    public final void rule__Label__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1283:1: ( rule__Label__Group__4__Impl rule__Label__Group__5 )
            // InternalPageGeneratorLanguare.g:1284:2: rule__Label__Group__4__Impl rule__Label__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Label__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Label__Group__5();

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
    // $ANTLR end "rule__Label__Group__4"


    // $ANTLR start "rule__Label__Group__4__Impl"
    // InternalPageGeneratorLanguare.g:1291:1: rule__Label__Group__4__Impl : ( 'lable' ) ;
    public final void rule__Label__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1295:1: ( ( 'lable' ) )
            // InternalPageGeneratorLanguare.g:1296:1: ( 'lable' )
            {
            // InternalPageGeneratorLanguare.g:1296:1: ( 'lable' )
            // InternalPageGeneratorLanguare.g:1297:2: 'lable'
            {
             before(grammarAccess.getLabelAccess().getLableKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getLabelAccess().getLableKeyword_4()); 

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
    // $ANTLR end "rule__Label__Group__4__Impl"


    // $ANTLR start "rule__Label__Group__5"
    // InternalPageGeneratorLanguare.g:1306:1: rule__Label__Group__5 : rule__Label__Group__5__Impl rule__Label__Group__6 ;
    public final void rule__Label__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1310:1: ( rule__Label__Group__5__Impl rule__Label__Group__6 )
            // InternalPageGeneratorLanguare.g:1311:2: rule__Label__Group__5__Impl rule__Label__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Label__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Label__Group__6();

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
    // $ANTLR end "rule__Label__Group__5"


    // $ANTLR start "rule__Label__Group__5__Impl"
    // InternalPageGeneratorLanguare.g:1318:1: rule__Label__Group__5__Impl : ( '=' ) ;
    public final void rule__Label__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1322:1: ( ( '=' ) )
            // InternalPageGeneratorLanguare.g:1323:1: ( '=' )
            {
            // InternalPageGeneratorLanguare.g:1323:1: ( '=' )
            // InternalPageGeneratorLanguare.g:1324:2: '='
            {
             before(grammarAccess.getLabelAccess().getEqualsSignKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLabelAccess().getEqualsSignKeyword_5()); 

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
    // $ANTLR end "rule__Label__Group__5__Impl"


    // $ANTLR start "rule__Label__Group__6"
    // InternalPageGeneratorLanguare.g:1333:1: rule__Label__Group__6 : rule__Label__Group__6__Impl rule__Label__Group__7 ;
    public final void rule__Label__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1337:1: ( rule__Label__Group__6__Impl rule__Label__Group__7 )
            // InternalPageGeneratorLanguare.g:1338:2: rule__Label__Group__6__Impl rule__Label__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__Label__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Label__Group__7();

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
    // $ANTLR end "rule__Label__Group__6"


    // $ANTLR start "rule__Label__Group__6__Impl"
    // InternalPageGeneratorLanguare.g:1345:1: rule__Label__Group__6__Impl : ( ( rule__Label__LabelAssignment_6 ) ) ;
    public final void rule__Label__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1349:1: ( ( ( rule__Label__LabelAssignment_6 ) ) )
            // InternalPageGeneratorLanguare.g:1350:1: ( ( rule__Label__LabelAssignment_6 ) )
            {
            // InternalPageGeneratorLanguare.g:1350:1: ( ( rule__Label__LabelAssignment_6 ) )
            // InternalPageGeneratorLanguare.g:1351:2: ( rule__Label__LabelAssignment_6 )
            {
             before(grammarAccess.getLabelAccess().getLabelAssignment_6()); 
            // InternalPageGeneratorLanguare.g:1352:2: ( rule__Label__LabelAssignment_6 )
            // InternalPageGeneratorLanguare.g:1352:3: rule__Label__LabelAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Label__LabelAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getLabelAccess().getLabelAssignment_6()); 

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
    // $ANTLR end "rule__Label__Group__6__Impl"


    // $ANTLR start "rule__Label__Group__7"
    // InternalPageGeneratorLanguare.g:1360:1: rule__Label__Group__7 : rule__Label__Group__7__Impl ;
    public final void rule__Label__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1364:1: ( rule__Label__Group__7__Impl )
            // InternalPageGeneratorLanguare.g:1365:2: rule__Label__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Label__Group__7__Impl();

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
    // $ANTLR end "rule__Label__Group__7"


    // $ANTLR start "rule__Label__Group__7__Impl"
    // InternalPageGeneratorLanguare.g:1371:1: rule__Label__Group__7__Impl : ( ';' ) ;
    public final void rule__Label__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1375:1: ( ( ';' ) )
            // InternalPageGeneratorLanguare.g:1376:1: ( ';' )
            {
            // InternalPageGeneratorLanguare.g:1376:1: ( ';' )
            // InternalPageGeneratorLanguare.g:1377:2: ';'
            {
             before(grammarAccess.getLabelAccess().getSemicolonKeyword_7()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLabelAccess().getSemicolonKeyword_7()); 

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
    // $ANTLR end "rule__Label__Group__7__Impl"


    // $ANTLR start "rule__Body__Group__0"
    // InternalPageGeneratorLanguare.g:1387:1: rule__Body__Group__0 : rule__Body__Group__0__Impl rule__Body__Group__1 ;
    public final void rule__Body__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1391:1: ( rule__Body__Group__0__Impl rule__Body__Group__1 )
            // InternalPageGeneratorLanguare.g:1392:2: rule__Body__Group__0__Impl rule__Body__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Body__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Body__Group__1();

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
    // $ANTLR end "rule__Body__Group__0"


    // $ANTLR start "rule__Body__Group__0__Impl"
    // InternalPageGeneratorLanguare.g:1399:1: rule__Body__Group__0__Impl : ( () ) ;
    public final void rule__Body__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1403:1: ( ( () ) )
            // InternalPageGeneratorLanguare.g:1404:1: ( () )
            {
            // InternalPageGeneratorLanguare.g:1404:1: ( () )
            // InternalPageGeneratorLanguare.g:1405:2: ()
            {
             before(grammarAccess.getBodyAccess().getBodyAction_0()); 
            // InternalPageGeneratorLanguare.g:1406:2: ()
            // InternalPageGeneratorLanguare.g:1406:3: 
            {
            }

             after(grammarAccess.getBodyAccess().getBodyAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group__0__Impl"


    // $ANTLR start "rule__Body__Group__1"
    // InternalPageGeneratorLanguare.g:1414:1: rule__Body__Group__1 : rule__Body__Group__1__Impl rule__Body__Group__2 ;
    public final void rule__Body__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1418:1: ( rule__Body__Group__1__Impl rule__Body__Group__2 )
            // InternalPageGeneratorLanguare.g:1419:2: rule__Body__Group__1__Impl rule__Body__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Body__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Body__Group__2();

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
    // $ANTLR end "rule__Body__Group__1"


    // $ANTLR start "rule__Body__Group__1__Impl"
    // InternalPageGeneratorLanguare.g:1426:1: rule__Body__Group__1__Impl : ( 'Body' ) ;
    public final void rule__Body__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1430:1: ( ( 'Body' ) )
            // InternalPageGeneratorLanguare.g:1431:1: ( 'Body' )
            {
            // InternalPageGeneratorLanguare.g:1431:1: ( 'Body' )
            // InternalPageGeneratorLanguare.g:1432:2: 'Body'
            {
             before(grammarAccess.getBodyAccess().getBodyKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getBodyAccess().getBodyKeyword_1()); 

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
    // $ANTLR end "rule__Body__Group__1__Impl"


    // $ANTLR start "rule__Body__Group__2"
    // InternalPageGeneratorLanguare.g:1441:1: rule__Body__Group__2 : rule__Body__Group__2__Impl rule__Body__Group__3 ;
    public final void rule__Body__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1445:1: ( rule__Body__Group__2__Impl rule__Body__Group__3 )
            // InternalPageGeneratorLanguare.g:1446:2: rule__Body__Group__2__Impl rule__Body__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Body__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Body__Group__3();

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
    // $ANTLR end "rule__Body__Group__2"


    // $ANTLR start "rule__Body__Group__2__Impl"
    // InternalPageGeneratorLanguare.g:1453:1: rule__Body__Group__2__Impl : ( '{' ) ;
    public final void rule__Body__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1457:1: ( ( '{' ) )
            // InternalPageGeneratorLanguare.g:1458:1: ( '{' )
            {
            // InternalPageGeneratorLanguare.g:1458:1: ( '{' )
            // InternalPageGeneratorLanguare.g:1459:2: '{'
            {
             before(grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Body__Group__2__Impl"


    // $ANTLR start "rule__Body__Group__3"
    // InternalPageGeneratorLanguare.g:1468:1: rule__Body__Group__3 : rule__Body__Group__3__Impl rule__Body__Group__4 ;
    public final void rule__Body__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1472:1: ( rule__Body__Group__3__Impl rule__Body__Group__4 )
            // InternalPageGeneratorLanguare.g:1473:2: rule__Body__Group__3__Impl rule__Body__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Body__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Body__Group__4();

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
    // $ANTLR end "rule__Body__Group__3"


    // $ANTLR start "rule__Body__Group__3__Impl"
    // InternalPageGeneratorLanguare.g:1480:1: rule__Body__Group__3__Impl : ( ( rule__Body__BodyElementsAssignment_3 )* ) ;
    public final void rule__Body__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1484:1: ( ( ( rule__Body__BodyElementsAssignment_3 )* ) )
            // InternalPageGeneratorLanguare.g:1485:1: ( ( rule__Body__BodyElementsAssignment_3 )* )
            {
            // InternalPageGeneratorLanguare.g:1485:1: ( ( rule__Body__BodyElementsAssignment_3 )* )
            // InternalPageGeneratorLanguare.g:1486:2: ( rule__Body__BodyElementsAssignment_3 )*
            {
             before(grammarAccess.getBodyAccess().getBodyElementsAssignment_3()); 
            // InternalPageGeneratorLanguare.g:1487:2: ( rule__Body__BodyElementsAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==22||LA10_0==32||(LA10_0>=35 && LA10_0<=36)||(LA10_0>=38 && LA10_0<=39)||LA10_0==45||LA10_0==48) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalPageGeneratorLanguare.g:1487:3: rule__Body__BodyElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Body__BodyElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getBodyAccess().getBodyElementsAssignment_3()); 

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
    // $ANTLR end "rule__Body__Group__3__Impl"


    // $ANTLR start "rule__Body__Group__4"
    // InternalPageGeneratorLanguare.g:1495:1: rule__Body__Group__4 : rule__Body__Group__4__Impl ;
    public final void rule__Body__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1499:1: ( rule__Body__Group__4__Impl )
            // InternalPageGeneratorLanguare.g:1500:2: rule__Body__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Body__Group__4__Impl();

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
    // $ANTLR end "rule__Body__Group__4"


    // $ANTLR start "rule__Body__Group__4__Impl"
    // InternalPageGeneratorLanguare.g:1506:1: rule__Body__Group__4__Impl : ( '}' ) ;
    public final void rule__Body__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1510:1: ( ( '}' ) )
            // InternalPageGeneratorLanguare.g:1511:1: ( '}' )
            {
            // InternalPageGeneratorLanguare.g:1511:1: ( '}' )
            // InternalPageGeneratorLanguare.g:1512:2: '}'
            {
             before(grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Body__Group__4__Impl"


    // $ANTLR start "rule__Heading__Group__0"
    // InternalPageGeneratorLanguare.g:1522:1: rule__Heading__Group__0 : rule__Heading__Group__0__Impl rule__Heading__Group__1 ;
    public final void rule__Heading__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1526:1: ( rule__Heading__Group__0__Impl rule__Heading__Group__1 )
            // InternalPageGeneratorLanguare.g:1527:2: rule__Heading__Group__0__Impl rule__Heading__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Heading__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Heading__Group__1();

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
    // $ANTLR end "rule__Heading__Group__0"


    // $ANTLR start "rule__Heading__Group__0__Impl"
    // InternalPageGeneratorLanguare.g:1534:1: rule__Heading__Group__0__Impl : ( 'Heading' ) ;
    public final void rule__Heading__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1538:1: ( ( 'Heading' ) )
            // InternalPageGeneratorLanguare.g:1539:1: ( 'Heading' )
            {
            // InternalPageGeneratorLanguare.g:1539:1: ( 'Heading' )
            // InternalPageGeneratorLanguare.g:1540:2: 'Heading'
            {
             before(grammarAccess.getHeadingAccess().getHeadingKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getHeadingAccess().getHeadingKeyword_0()); 

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
    // $ANTLR end "rule__Heading__Group__0__Impl"


    // $ANTLR start "rule__Heading__Group__1"
    // InternalPageGeneratorLanguare.g:1549:1: rule__Heading__Group__1 : rule__Heading__Group__1__Impl rule__Heading__Group__2 ;
    public final void rule__Heading__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1553:1: ( rule__Heading__Group__1__Impl rule__Heading__Group__2 )
            // InternalPageGeneratorLanguare.g:1554:2: rule__Heading__Group__1__Impl rule__Heading__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Heading__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Heading__Group__2();

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
    // $ANTLR end "rule__Heading__Group__1"


    // $ANTLR start "rule__Heading__Group__1__Impl"
    // InternalPageGeneratorLanguare.g:1561:1: rule__Heading__Group__1__Impl : ( ( rule__Heading__NameAssignment_1 ) ) ;
    public final void rule__Heading__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1565:1: ( ( ( rule__Heading__NameAssignment_1 ) ) )
            // InternalPageGeneratorLanguare.g:1566:1: ( ( rule__Heading__NameAssignment_1 ) )
            {
            // InternalPageGeneratorLanguare.g:1566:1: ( ( rule__Heading__NameAssignment_1 ) )
            // InternalPageGeneratorLanguare.g:1567:2: ( rule__Heading__NameAssignment_1 )
            {
             before(grammarAccess.getHeadingAccess().getNameAssignment_1()); 
            // InternalPageGeneratorLanguare.g:1568:2: ( rule__Heading__NameAssignment_1 )
            // InternalPageGeneratorLanguare.g:1568:3: rule__Heading__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Heading__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHeadingAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Heading__Group__1__Impl"


    // $ANTLR start "rule__Heading__Group__2"
    // InternalPageGeneratorLanguare.g:1576:1: rule__Heading__Group__2 : rule__Heading__Group__2__Impl rule__Heading__Group__3 ;
    public final void rule__Heading__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1580:1: ( rule__Heading__Group__2__Impl rule__Heading__Group__3 )
            // InternalPageGeneratorLanguare.g:1581:2: rule__Heading__Group__2__Impl rule__Heading__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Heading__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Heading__Group__3();

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
    // $ANTLR end "rule__Heading__Group__2"


    // $ANTLR start "rule__Heading__Group__2__Impl"
    // InternalPageGeneratorLanguare.g:1588:1: rule__Heading__Group__2__Impl : ( '<' ) ;
    public final void rule__Heading__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1592:1: ( ( '<' ) )
            // InternalPageGeneratorLanguare.g:1593:1: ( '<' )
            {
            // InternalPageGeneratorLanguare.g:1593:1: ( '<' )
            // InternalPageGeneratorLanguare.g:1594:2: '<'
            {
             before(grammarAccess.getHeadingAccess().getLessThanSignKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getHeadingAccess().getLessThanSignKeyword_2()); 

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
    // $ANTLR end "rule__Heading__Group__2__Impl"


    // $ANTLR start "rule__Heading__Group__3"
    // InternalPageGeneratorLanguare.g:1603:1: rule__Heading__Group__3 : rule__Heading__Group__3__Impl rule__Heading__Group__4 ;
    public final void rule__Heading__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1607:1: ( rule__Heading__Group__3__Impl rule__Heading__Group__4 )
            // InternalPageGeneratorLanguare.g:1608:2: rule__Heading__Group__3__Impl rule__Heading__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Heading__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Heading__Group__4();

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
    // $ANTLR end "rule__Heading__Group__3"


    // $ANTLR start "rule__Heading__Group__3__Impl"
    // InternalPageGeneratorLanguare.g:1615:1: rule__Heading__Group__3__Impl : ( 'index' ) ;
    public final void rule__Heading__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1619:1: ( ( 'index' ) )
            // InternalPageGeneratorLanguare.g:1620:1: ( 'index' )
            {
            // InternalPageGeneratorLanguare.g:1620:1: ( 'index' )
            // InternalPageGeneratorLanguare.g:1621:2: 'index'
            {
             before(grammarAccess.getHeadingAccess().getIndexKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getHeadingAccess().getIndexKeyword_3()); 

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
    // $ANTLR end "rule__Heading__Group__3__Impl"


    // $ANTLR start "rule__Heading__Group__4"
    // InternalPageGeneratorLanguare.g:1630:1: rule__Heading__Group__4 : rule__Heading__Group__4__Impl rule__Heading__Group__5 ;
    public final void rule__Heading__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1634:1: ( rule__Heading__Group__4__Impl rule__Heading__Group__5 )
            // InternalPageGeneratorLanguare.g:1635:2: rule__Heading__Group__4__Impl rule__Heading__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__Heading__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Heading__Group__5();

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
    // $ANTLR end "rule__Heading__Group__4"


    // $ANTLR start "rule__Heading__Group__4__Impl"
    // InternalPageGeneratorLanguare.g:1642:1: rule__Heading__Group__4__Impl : ( '=' ) ;
    public final void rule__Heading__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1646:1: ( ( '=' ) )
            // InternalPageGeneratorLanguare.g:1647:1: ( '=' )
            {
            // InternalPageGeneratorLanguare.g:1647:1: ( '=' )
            // InternalPageGeneratorLanguare.g:1648:2: '='
            {
             before(grammarAccess.getHeadingAccess().getEqualsSignKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getHeadingAccess().getEqualsSignKeyword_4()); 

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
    // $ANTLR end "rule__Heading__Group__4__Impl"


    // $ANTLR start "rule__Heading__Group__5"
    // InternalPageGeneratorLanguare.g:1657:1: rule__Heading__Group__5 : rule__Heading__Group__5__Impl rule__Heading__Group__6 ;
    public final void rule__Heading__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1661:1: ( rule__Heading__Group__5__Impl rule__Heading__Group__6 )
            // InternalPageGeneratorLanguare.g:1662:2: rule__Heading__Group__5__Impl rule__Heading__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__Heading__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Heading__Group__6();

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
    // $ANTLR end "rule__Heading__Group__5"


    // $ANTLR start "rule__Heading__Group__5__Impl"
    // InternalPageGeneratorLanguare.g:1669:1: rule__Heading__Group__5__Impl : ( ( rule__Heading__IndexAssignment_5 ) ) ;
    public final void rule__Heading__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1673:1: ( ( ( rule__Heading__IndexAssignment_5 ) ) )
            // InternalPageGeneratorLanguare.g:1674:1: ( ( rule__Heading__IndexAssignment_5 ) )
            {
            // InternalPageGeneratorLanguare.g:1674:1: ( ( rule__Heading__IndexAssignment_5 ) )
            // InternalPageGeneratorLanguare.g:1675:2: ( rule__Heading__IndexAssignment_5 )
            {
             before(grammarAccess.getHeadingAccess().getIndexAssignment_5()); 
            // InternalPageGeneratorLanguare.g:1676:2: ( rule__Heading__IndexAssignment_5 )
            // InternalPageGeneratorLanguare.g:1676:3: rule__Heading__IndexAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Heading__IndexAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getHeadingAccess().getIndexAssignment_5()); 

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
    // $ANTLR end "rule__Heading__Group__5__Impl"


    // $ANTLR start "rule__Heading__Group__6"
    // InternalPageGeneratorLanguare.g:1684:1: rule__Heading__Group__6 : rule__Heading__Group__6__Impl rule__Heading__Group__7 ;
    public final void rule__Heading__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1688:1: ( rule__Heading__Group__6__Impl rule__Heading__Group__7 )
            // InternalPageGeneratorLanguare.g:1689:2: rule__Heading__Group__6__Impl rule__Heading__Group__7
            {
            pushFollow(FOLLOW_20);
            rule__Heading__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Heading__Group__7();

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
    // $ANTLR end "rule__Heading__Group__6"


    // $ANTLR start "rule__Heading__Group__6__Impl"
    // InternalPageGeneratorLanguare.g:1696:1: rule__Heading__Group__6__Impl : ( ( ',' )? ) ;
    public final void rule__Heading__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1700:1: ( ( ( ',' )? ) )
            // InternalPageGeneratorLanguare.g:1701:1: ( ( ',' )? )
            {
            // InternalPageGeneratorLanguare.g:1701:1: ( ( ',' )? )
            // InternalPageGeneratorLanguare.g:1702:2: ( ',' )?
            {
             before(grammarAccess.getHeadingAccess().getCommaKeyword_6()); 
            // InternalPageGeneratorLanguare.g:1703:2: ( ',' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==12) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:1703:3: ','
                    {
                    match(input,12,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getHeadingAccess().getCommaKeyword_6()); 

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
    // $ANTLR end "rule__Heading__Group__6__Impl"


    // $ANTLR start "rule__Heading__Group__7"
    // InternalPageGeneratorLanguare.g:1711:1: rule__Heading__Group__7 : rule__Heading__Group__7__Impl rule__Heading__Group__8 ;
    public final void rule__Heading__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1715:1: ( rule__Heading__Group__7__Impl rule__Heading__Group__8 )
            // InternalPageGeneratorLanguare.g:1716:2: rule__Heading__Group__7__Impl rule__Heading__Group__8
            {
            pushFollow(FOLLOW_20);
            rule__Heading__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Heading__Group__8();

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
    // $ANTLR end "rule__Heading__Group__7"


    // $ANTLR start "rule__Heading__Group__7__Impl"
    // InternalPageGeneratorLanguare.g:1723:1: rule__Heading__Group__7__Impl : ( ( rule__Heading__Group_7__0 )? ) ;
    public final void rule__Heading__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1727:1: ( ( ( rule__Heading__Group_7__0 )? ) )
            // InternalPageGeneratorLanguare.g:1728:1: ( ( rule__Heading__Group_7__0 )? )
            {
            // InternalPageGeneratorLanguare.g:1728:1: ( ( rule__Heading__Group_7__0 )? )
            // InternalPageGeneratorLanguare.g:1729:2: ( rule__Heading__Group_7__0 )?
            {
             before(grammarAccess.getHeadingAccess().getGroup_7()); 
            // InternalPageGeneratorLanguare.g:1730:2: ( rule__Heading__Group_7__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:1730:3: rule__Heading__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Heading__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHeadingAccess().getGroup_7()); 

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
    // $ANTLR end "rule__Heading__Group__7__Impl"


    // $ANTLR start "rule__Heading__Group__8"
    // InternalPageGeneratorLanguare.g:1738:1: rule__Heading__Group__8 : rule__Heading__Group__8__Impl rule__Heading__Group__9 ;
    public final void rule__Heading__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1742:1: ( rule__Heading__Group__8__Impl rule__Heading__Group__9 )
            // InternalPageGeneratorLanguare.g:1743:2: rule__Heading__Group__8__Impl rule__Heading__Group__9
            {
            pushFollow(FOLLOW_20);
            rule__Heading__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Heading__Group__9();

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
    // $ANTLR end "rule__Heading__Group__8"


    // $ANTLR start "rule__Heading__Group__8__Impl"
    // InternalPageGeneratorLanguare.g:1750:1: rule__Heading__Group__8__Impl : ( ( rule__Heading__Group_8__0 )? ) ;
    public final void rule__Heading__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1754:1: ( ( ( rule__Heading__Group_8__0 )? ) )
            // InternalPageGeneratorLanguare.g:1755:1: ( ( rule__Heading__Group_8__0 )? )
            {
            // InternalPageGeneratorLanguare.g:1755:1: ( ( rule__Heading__Group_8__0 )? )
            // InternalPageGeneratorLanguare.g:1756:2: ( rule__Heading__Group_8__0 )?
            {
             before(grammarAccess.getHeadingAccess().getGroup_8()); 
            // InternalPageGeneratorLanguare.g:1757:2: ( rule__Heading__Group_8__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:1757:3: rule__Heading__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Heading__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHeadingAccess().getGroup_8()); 

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
    // $ANTLR end "rule__Heading__Group__8__Impl"


    // $ANTLR start "rule__Heading__Group__9"
    // InternalPageGeneratorLanguare.g:1765:1: rule__Heading__Group__9 : rule__Heading__Group__9__Impl rule__Heading__Group__10 ;
    public final void rule__Heading__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1769:1: ( rule__Heading__Group__9__Impl rule__Heading__Group__10 )
            // InternalPageGeneratorLanguare.g:1770:2: rule__Heading__Group__9__Impl rule__Heading__Group__10
            {
            pushFollow(FOLLOW_20);
            rule__Heading__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Heading__Group__10();

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
    // $ANTLR end "rule__Heading__Group__9"


    // $ANTLR start "rule__Heading__Group__9__Impl"
    // InternalPageGeneratorLanguare.g:1777:1: rule__Heading__Group__9__Impl : ( ( rule__Heading__Group_9__0 )? ) ;
    public final void rule__Heading__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1781:1: ( ( ( rule__Heading__Group_9__0 )? ) )
            // InternalPageGeneratorLanguare.g:1782:1: ( ( rule__Heading__Group_9__0 )? )
            {
            // InternalPageGeneratorLanguare.g:1782:1: ( ( rule__Heading__Group_9__0 )? )
            // InternalPageGeneratorLanguare.g:1783:2: ( rule__Heading__Group_9__0 )?
            {
             before(grammarAccess.getHeadingAccess().getGroup_9()); 
            // InternalPageGeneratorLanguare.g:1784:2: ( rule__Heading__Group_9__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:1784:3: rule__Heading__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Heading__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHeadingAccess().getGroup_9()); 

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
    // $ANTLR end "rule__Heading__Group__9__Impl"


    // $ANTLR start "rule__Heading__Group__10"
    // InternalPageGeneratorLanguare.g:1792:1: rule__Heading__Group__10 : rule__Heading__Group__10__Impl rule__Heading__Group__11 ;
    public final void rule__Heading__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1796:1: ( rule__Heading__Group__10__Impl rule__Heading__Group__11 )
            // InternalPageGeneratorLanguare.g:1797:2: rule__Heading__Group__10__Impl rule__Heading__Group__11
            {
            pushFollow(FOLLOW_20);
            rule__Heading__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Heading__Group__11();

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
    // $ANTLR end "rule__Heading__Group__10"


    // $ANTLR start "rule__Heading__Group__10__Impl"
    // InternalPageGeneratorLanguare.g:1804:1: rule__Heading__Group__10__Impl : ( ( rule__Heading__Group_10__0 )? ) ;
    public final void rule__Heading__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1808:1: ( ( ( rule__Heading__Group_10__0 )? ) )
            // InternalPageGeneratorLanguare.g:1809:1: ( ( rule__Heading__Group_10__0 )? )
            {
            // InternalPageGeneratorLanguare.g:1809:1: ( ( rule__Heading__Group_10__0 )? )
            // InternalPageGeneratorLanguare.g:1810:2: ( rule__Heading__Group_10__0 )?
            {
             before(grammarAccess.getHeadingAccess().getGroup_10()); 
            // InternalPageGeneratorLanguare.g:1811:2: ( rule__Heading__Group_10__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:1811:3: rule__Heading__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Heading__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHeadingAccess().getGroup_10()); 

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
    // $ANTLR end "rule__Heading__Group__10__Impl"


    // $ANTLR start "rule__Heading__Group__11"
    // InternalPageGeneratorLanguare.g:1819:1: rule__Heading__Group__11 : rule__Heading__Group__11__Impl rule__Heading__Group__12 ;
    public final void rule__Heading__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1823:1: ( rule__Heading__Group__11__Impl rule__Heading__Group__12 )
            // InternalPageGeneratorLanguare.g:1824:2: rule__Heading__Group__11__Impl rule__Heading__Group__12
            {
            pushFollow(FOLLOW_20);
            rule__Heading__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Heading__Group__12();

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
    // $ANTLR end "rule__Heading__Group__11"


    // $ANTLR start "rule__Heading__Group__11__Impl"
    // InternalPageGeneratorLanguare.g:1831:1: rule__Heading__Group__11__Impl : ( ( rule__Heading__Group_11__0 )? ) ;
    public final void rule__Heading__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1835:1: ( ( ( rule__Heading__Group_11__0 )? ) )
            // InternalPageGeneratorLanguare.g:1836:1: ( ( rule__Heading__Group_11__0 )? )
            {
            // InternalPageGeneratorLanguare.g:1836:1: ( ( rule__Heading__Group_11__0 )? )
            // InternalPageGeneratorLanguare.g:1837:2: ( rule__Heading__Group_11__0 )?
            {
             before(grammarAccess.getHeadingAccess().getGroup_11()); 
            // InternalPageGeneratorLanguare.g:1838:2: ( rule__Heading__Group_11__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:1838:3: rule__Heading__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Heading__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHeadingAccess().getGroup_11()); 

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
    // $ANTLR end "rule__Heading__Group__11__Impl"


    // $ANTLR start "rule__Heading__Group__12"
    // InternalPageGeneratorLanguare.g:1846:1: rule__Heading__Group__12 : rule__Heading__Group__12__Impl rule__Heading__Group__13 ;
    public final void rule__Heading__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1850:1: ( rule__Heading__Group__12__Impl rule__Heading__Group__13 )
            // InternalPageGeneratorLanguare.g:1851:2: rule__Heading__Group__12__Impl rule__Heading__Group__13
            {
            pushFollow(FOLLOW_20);
            rule__Heading__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Heading__Group__13();

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
    // $ANTLR end "rule__Heading__Group__12"


    // $ANTLR start "rule__Heading__Group__12__Impl"
    // InternalPageGeneratorLanguare.g:1858:1: rule__Heading__Group__12__Impl : ( ( rule__Heading__Group_12__0 )? ) ;
    public final void rule__Heading__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1862:1: ( ( ( rule__Heading__Group_12__0 )? ) )
            // InternalPageGeneratorLanguare.g:1863:1: ( ( rule__Heading__Group_12__0 )? )
            {
            // InternalPageGeneratorLanguare.g:1863:1: ( ( rule__Heading__Group_12__0 )? )
            // InternalPageGeneratorLanguare.g:1864:2: ( rule__Heading__Group_12__0 )?
            {
             before(grammarAccess.getHeadingAccess().getGroup_12()); 
            // InternalPageGeneratorLanguare.g:1865:2: ( rule__Heading__Group_12__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:1865:3: rule__Heading__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Heading__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHeadingAccess().getGroup_12()); 

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
    // $ANTLR end "rule__Heading__Group__12__Impl"


    // $ANTLR start "rule__Heading__Group__13"
    // InternalPageGeneratorLanguare.g:1873:1: rule__Heading__Group__13 : rule__Heading__Group__13__Impl rule__Heading__Group__14 ;
    public final void rule__Heading__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1877:1: ( rule__Heading__Group__13__Impl rule__Heading__Group__14 )
            // InternalPageGeneratorLanguare.g:1878:2: rule__Heading__Group__13__Impl rule__Heading__Group__14
            {
            pushFollow(FOLLOW_8);
            rule__Heading__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Heading__Group__14();

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
    // $ANTLR end "rule__Heading__Group__13"


    // $ANTLR start "rule__Heading__Group__13__Impl"
    // InternalPageGeneratorLanguare.g:1885:1: rule__Heading__Group__13__Impl : ( '>' ) ;
    public final void rule__Heading__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1889:1: ( ( '>' ) )
            // InternalPageGeneratorLanguare.g:1890:1: ( '>' )
            {
            // InternalPageGeneratorLanguare.g:1890:1: ( '>' )
            // InternalPageGeneratorLanguare.g:1891:2: '>'
            {
             before(grammarAccess.getHeadingAccess().getGreaterThanSignKeyword_13()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getHeadingAccess().getGreaterThanSignKeyword_13()); 

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
    // $ANTLR end "rule__Heading__Group__13__Impl"


    // $ANTLR start "rule__Heading__Group__14"
    // InternalPageGeneratorLanguare.g:1900:1: rule__Heading__Group__14 : rule__Heading__Group__14__Impl rule__Heading__Group__15 ;
    public final void rule__Heading__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1904:1: ( rule__Heading__Group__14__Impl rule__Heading__Group__15 )
            // InternalPageGeneratorLanguare.g:1905:2: rule__Heading__Group__14__Impl rule__Heading__Group__15
            {
            pushFollow(FOLLOW_9);
            rule__Heading__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Heading__Group__15();

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
    // $ANTLR end "rule__Heading__Group__14"


    // $ANTLR start "rule__Heading__Group__14__Impl"
    // InternalPageGeneratorLanguare.g:1912:1: rule__Heading__Group__14__Impl : ( '=' ) ;
    public final void rule__Heading__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1916:1: ( ( '=' ) )
            // InternalPageGeneratorLanguare.g:1917:1: ( '=' )
            {
            // InternalPageGeneratorLanguare.g:1917:1: ( '=' )
            // InternalPageGeneratorLanguare.g:1918:2: '='
            {
             before(grammarAccess.getHeadingAccess().getEqualsSignKeyword_14()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getHeadingAccess().getEqualsSignKeyword_14()); 

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
    // $ANTLR end "rule__Heading__Group__14__Impl"


    // $ANTLR start "rule__Heading__Group__15"
    // InternalPageGeneratorLanguare.g:1927:1: rule__Heading__Group__15 : rule__Heading__Group__15__Impl rule__Heading__Group__16 ;
    public final void rule__Heading__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1931:1: ( rule__Heading__Group__15__Impl rule__Heading__Group__16 )
            // InternalPageGeneratorLanguare.g:1932:2: rule__Heading__Group__15__Impl rule__Heading__Group__16
            {
            pushFollow(FOLLOW_10);
            rule__Heading__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Heading__Group__16();

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
    // $ANTLR end "rule__Heading__Group__15"


    // $ANTLR start "rule__Heading__Group__15__Impl"
    // InternalPageGeneratorLanguare.g:1939:1: rule__Heading__Group__15__Impl : ( ( rule__Heading__TitleAssignment_15 ) ) ;
    public final void rule__Heading__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1943:1: ( ( ( rule__Heading__TitleAssignment_15 ) ) )
            // InternalPageGeneratorLanguare.g:1944:1: ( ( rule__Heading__TitleAssignment_15 ) )
            {
            // InternalPageGeneratorLanguare.g:1944:1: ( ( rule__Heading__TitleAssignment_15 ) )
            // InternalPageGeneratorLanguare.g:1945:2: ( rule__Heading__TitleAssignment_15 )
            {
             before(grammarAccess.getHeadingAccess().getTitleAssignment_15()); 
            // InternalPageGeneratorLanguare.g:1946:2: ( rule__Heading__TitleAssignment_15 )
            // InternalPageGeneratorLanguare.g:1946:3: rule__Heading__TitleAssignment_15
            {
            pushFollow(FOLLOW_2);
            rule__Heading__TitleAssignment_15();

            state._fsp--;


            }

             after(grammarAccess.getHeadingAccess().getTitleAssignment_15()); 

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
    // $ANTLR end "rule__Heading__Group__15__Impl"


    // $ANTLR start "rule__Heading__Group__16"
    // InternalPageGeneratorLanguare.g:1954:1: rule__Heading__Group__16 : rule__Heading__Group__16__Impl ;
    public final void rule__Heading__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1958:1: ( rule__Heading__Group__16__Impl )
            // InternalPageGeneratorLanguare.g:1959:2: rule__Heading__Group__16__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Heading__Group__16__Impl();

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
    // $ANTLR end "rule__Heading__Group__16"


    // $ANTLR start "rule__Heading__Group__16__Impl"
    // InternalPageGeneratorLanguare.g:1965:1: rule__Heading__Group__16__Impl : ( ';' ) ;
    public final void rule__Heading__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1969:1: ( ( ';' ) )
            // InternalPageGeneratorLanguare.g:1970:1: ( ';' )
            {
            // InternalPageGeneratorLanguare.g:1970:1: ( ';' )
            // InternalPageGeneratorLanguare.g:1971:2: ';'
            {
             before(grammarAccess.getHeadingAccess().getSemicolonKeyword_16()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getHeadingAccess().getSemicolonKeyword_16()); 

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
    // $ANTLR end "rule__Heading__Group__16__Impl"


    // $ANTLR start "rule__Heading__Group_7__0"
    // InternalPageGeneratorLanguare.g:1981:1: rule__Heading__Group_7__0 : rule__Heading__Group_7__0__Impl rule__Heading__Group_7__1 ;
    public final void rule__Heading__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1985:1: ( rule__Heading__Group_7__0__Impl rule__Heading__Group_7__1 )
            // InternalPageGeneratorLanguare.g:1986:2: rule__Heading__Group_7__0__Impl rule__Heading__Group_7__1
            {
            pushFollow(FOLLOW_8);
            rule__Heading__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Heading__Group_7__1();

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
    // $ANTLR end "rule__Heading__Group_7__0"


    // $ANTLR start "rule__Heading__Group_7__0__Impl"
    // InternalPageGeneratorLanguare.g:1993:1: rule__Heading__Group_7__0__Impl : ( 'Font-colour' ) ;
    public final void rule__Heading__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:1997:1: ( ( 'Font-colour' ) )
            // InternalPageGeneratorLanguare.g:1998:1: ( 'Font-colour' )
            {
            // InternalPageGeneratorLanguare.g:1998:1: ( 'Font-colour' )
            // InternalPageGeneratorLanguare.g:1999:2: 'Font-colour'
            {
             before(grammarAccess.getHeadingAccess().getFontColourKeyword_7_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getHeadingAccess().getFontColourKeyword_7_0()); 

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
    // $ANTLR end "rule__Heading__Group_7__0__Impl"


    // $ANTLR start "rule__Heading__Group_7__1"
    // InternalPageGeneratorLanguare.g:2008:1: rule__Heading__Group_7__1 : rule__Heading__Group_7__1__Impl rule__Heading__Group_7__2 ;
    public final void rule__Heading__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2012:1: ( rule__Heading__Group_7__1__Impl rule__Heading__Group_7__2 )
            // InternalPageGeneratorLanguare.g:2013:2: rule__Heading__Group_7__1__Impl rule__Heading__Group_7__2
            {
            pushFollow(FOLLOW_21);
            rule__Heading__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Heading__Group_7__2();

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
    // $ANTLR end "rule__Heading__Group_7__1"


    // $ANTLR start "rule__Heading__Group_7__1__Impl"
    // InternalPageGeneratorLanguare.g:2020:1: rule__Heading__Group_7__1__Impl : ( '=' ) ;
    public final void rule__Heading__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2024:1: ( ( '=' ) )
            // InternalPageGeneratorLanguare.g:2025:1: ( '=' )
            {
            // InternalPageGeneratorLanguare.g:2025:1: ( '=' )
            // InternalPageGeneratorLanguare.g:2026:2: '='
            {
             before(grammarAccess.getHeadingAccess().getEqualsSignKeyword_7_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getHeadingAccess().getEqualsSignKeyword_7_1()); 

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
    // $ANTLR end "rule__Heading__Group_7__1__Impl"


    // $ANTLR start "rule__Heading__Group_7__2"
    // InternalPageGeneratorLanguare.g:2035:1: rule__Heading__Group_7__2 : rule__Heading__Group_7__2__Impl rule__Heading__Group_7__3 ;
    public final void rule__Heading__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2039:1: ( rule__Heading__Group_7__2__Impl rule__Heading__Group_7__3 )
            // InternalPageGeneratorLanguare.g:2040:2: rule__Heading__Group_7__2__Impl rule__Heading__Group_7__3
            {
            pushFollow(FOLLOW_11);
            rule__Heading__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Heading__Group_7__3();

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
    // $ANTLR end "rule__Heading__Group_7__2"


    // $ANTLR start "rule__Heading__Group_7__2__Impl"
    // InternalPageGeneratorLanguare.g:2047:1: rule__Heading__Group_7__2__Impl : ( ( rule__Heading__FontColorAssignment_7_2 ) ) ;
    public final void rule__Heading__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2051:1: ( ( ( rule__Heading__FontColorAssignment_7_2 ) ) )
            // InternalPageGeneratorLanguare.g:2052:1: ( ( rule__Heading__FontColorAssignment_7_2 ) )
            {
            // InternalPageGeneratorLanguare.g:2052:1: ( ( rule__Heading__FontColorAssignment_7_2 ) )
            // InternalPageGeneratorLanguare.g:2053:2: ( rule__Heading__FontColorAssignment_7_2 )
            {
             before(grammarAccess.getHeadingAccess().getFontColorAssignment_7_2()); 
            // InternalPageGeneratorLanguare.g:2054:2: ( rule__Heading__FontColorAssignment_7_2 )
            // InternalPageGeneratorLanguare.g:2054:3: rule__Heading__FontColorAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__Heading__FontColorAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getHeadingAccess().getFontColorAssignment_7_2()); 

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
    // $ANTLR end "rule__Heading__Group_7__2__Impl"


    // $ANTLR start "rule__Heading__Group_7__3"
    // InternalPageGeneratorLanguare.g:2062:1: rule__Heading__Group_7__3 : rule__Heading__Group_7__3__Impl ;
    public final void rule__Heading__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2066:1: ( rule__Heading__Group_7__3__Impl )
            // InternalPageGeneratorLanguare.g:2067:2: rule__Heading__Group_7__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Heading__Group_7__3__Impl();

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
    // $ANTLR end "rule__Heading__Group_7__3"


    // $ANTLR start "rule__Heading__Group_7__3__Impl"
    // InternalPageGeneratorLanguare.g:2073:1: rule__Heading__Group_7__3__Impl : ( ( ',' )? ) ;
    public final void rule__Heading__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2077:1: ( ( ( ',' )? ) )
            // InternalPageGeneratorLanguare.g:2078:1: ( ( ',' )? )
            {
            // InternalPageGeneratorLanguare.g:2078:1: ( ( ',' )? )
            // InternalPageGeneratorLanguare.g:2079:2: ( ',' )?
            {
             before(grammarAccess.getHeadingAccess().getCommaKeyword_7_3()); 
            // InternalPageGeneratorLanguare.g:2080:2: ( ',' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==12) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:2080:3: ','
                    {
                    match(input,12,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getHeadingAccess().getCommaKeyword_7_3()); 

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
    // $ANTLR end "rule__Heading__Group_7__3__Impl"


    // $ANTLR start "rule__Heading__Group_8__0"
    // InternalPageGeneratorLanguare.g:2089:1: rule__Heading__Group_8__0 : rule__Heading__Group_8__0__Impl rule__Heading__Group_8__1 ;
    public final void rule__Heading__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2093:1: ( rule__Heading__Group_8__0__Impl rule__Heading__Group_8__1 )
            // InternalPageGeneratorLanguare.g:2094:2: rule__Heading__Group_8__0__Impl rule__Heading__Group_8__1
            {
            pushFollow(FOLLOW_8);
            rule__Heading__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Heading__Group_8__1();

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
    // $ANTLR end "rule__Heading__Group_8__0"


    // $ANTLR start "rule__Heading__Group_8__0__Impl"
    // InternalPageGeneratorLanguare.g:2101:1: rule__Heading__Group_8__0__Impl : ( 'Location' ) ;
    public final void rule__Heading__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2105:1: ( ( 'Location' ) )
            // InternalPageGeneratorLanguare.g:2106:1: ( 'Location' )
            {
            // InternalPageGeneratorLanguare.g:2106:1: ( 'Location' )
            // InternalPageGeneratorLanguare.g:2107:2: 'Location'
            {
             before(grammarAccess.getHeadingAccess().getLocationKeyword_8_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getHeadingAccess().getLocationKeyword_8_0()); 

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
    // $ANTLR end "rule__Heading__Group_8__0__Impl"


    // $ANTLR start "rule__Heading__Group_8__1"
    // InternalPageGeneratorLanguare.g:2116:1: rule__Heading__Group_8__1 : rule__Heading__Group_8__1__Impl rule__Heading__Group_8__2 ;
    public final void rule__Heading__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2120:1: ( rule__Heading__Group_8__1__Impl rule__Heading__Group_8__2 )
            // InternalPageGeneratorLanguare.g:2121:2: rule__Heading__Group_8__1__Impl rule__Heading__Group_8__2
            {
            pushFollow(FOLLOW_9);
            rule__Heading__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Heading__Group_8__2();

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
    // $ANTLR end "rule__Heading__Group_8__1"


    // $ANTLR start "rule__Heading__Group_8__1__Impl"
    // InternalPageGeneratorLanguare.g:2128:1: rule__Heading__Group_8__1__Impl : ( '=' ) ;
    public final void rule__Heading__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2132:1: ( ( '=' ) )
            // InternalPageGeneratorLanguare.g:2133:1: ( '=' )
            {
            // InternalPageGeneratorLanguare.g:2133:1: ( '=' )
            // InternalPageGeneratorLanguare.g:2134:2: '='
            {
             before(grammarAccess.getHeadingAccess().getEqualsSignKeyword_8_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getHeadingAccess().getEqualsSignKeyword_8_1()); 

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
    // $ANTLR end "rule__Heading__Group_8__1__Impl"


    // $ANTLR start "rule__Heading__Group_8__2"
    // InternalPageGeneratorLanguare.g:2143:1: rule__Heading__Group_8__2 : rule__Heading__Group_8__2__Impl rule__Heading__Group_8__3 ;
    public final void rule__Heading__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2147:1: ( rule__Heading__Group_8__2__Impl rule__Heading__Group_8__3 )
            // InternalPageGeneratorLanguare.g:2148:2: rule__Heading__Group_8__2__Impl rule__Heading__Group_8__3
            {
            pushFollow(FOLLOW_11);
            rule__Heading__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Heading__Group_8__3();

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
    // $ANTLR end "rule__Heading__Group_8__2"


    // $ANTLR start "rule__Heading__Group_8__2__Impl"
    // InternalPageGeneratorLanguare.g:2155:1: rule__Heading__Group_8__2__Impl : ( ( rule__Heading__LocationAssignment_8_2 ) ) ;
    public final void rule__Heading__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2159:1: ( ( ( rule__Heading__LocationAssignment_8_2 ) ) )
            // InternalPageGeneratorLanguare.g:2160:1: ( ( rule__Heading__LocationAssignment_8_2 ) )
            {
            // InternalPageGeneratorLanguare.g:2160:1: ( ( rule__Heading__LocationAssignment_8_2 ) )
            // InternalPageGeneratorLanguare.g:2161:2: ( rule__Heading__LocationAssignment_8_2 )
            {
             before(grammarAccess.getHeadingAccess().getLocationAssignment_8_2()); 
            // InternalPageGeneratorLanguare.g:2162:2: ( rule__Heading__LocationAssignment_8_2 )
            // InternalPageGeneratorLanguare.g:2162:3: rule__Heading__LocationAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__Heading__LocationAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getHeadingAccess().getLocationAssignment_8_2()); 

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
    // $ANTLR end "rule__Heading__Group_8__2__Impl"


    // $ANTLR start "rule__Heading__Group_8__3"
    // InternalPageGeneratorLanguare.g:2170:1: rule__Heading__Group_8__3 : rule__Heading__Group_8__3__Impl ;
    public final void rule__Heading__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2174:1: ( rule__Heading__Group_8__3__Impl )
            // InternalPageGeneratorLanguare.g:2175:2: rule__Heading__Group_8__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Heading__Group_8__3__Impl();

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
    // $ANTLR end "rule__Heading__Group_8__3"


    // $ANTLR start "rule__Heading__Group_8__3__Impl"
    // InternalPageGeneratorLanguare.g:2181:1: rule__Heading__Group_8__3__Impl : ( ( ',' )? ) ;
    public final void rule__Heading__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2185:1: ( ( ( ',' )? ) )
            // InternalPageGeneratorLanguare.g:2186:1: ( ( ',' )? )
            {
            // InternalPageGeneratorLanguare.g:2186:1: ( ( ',' )? )
            // InternalPageGeneratorLanguare.g:2187:2: ( ',' )?
            {
             before(grammarAccess.getHeadingAccess().getCommaKeyword_8_3()); 
            // InternalPageGeneratorLanguare.g:2188:2: ( ',' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==12) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:2188:3: ','
                    {
                    match(input,12,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getHeadingAccess().getCommaKeyword_8_3()); 

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
    // $ANTLR end "rule__Heading__Group_8__3__Impl"


    // $ANTLR start "rule__Heading__Group_9__0"
    // InternalPageGeneratorLanguare.g:2197:1: rule__Heading__Group_9__0 : rule__Heading__Group_9__0__Impl rule__Heading__Group_9__1 ;
    public final void rule__Heading__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2201:1: ( rule__Heading__Group_9__0__Impl rule__Heading__Group_9__1 )
            // InternalPageGeneratorLanguare.g:2202:2: rule__Heading__Group_9__0__Impl rule__Heading__Group_9__1
            {
            pushFollow(FOLLOW_8);
            rule__Heading__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Heading__Group_9__1();

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
    // $ANTLR end "rule__Heading__Group_9__0"


    // $ANTLR start "rule__Heading__Group_9__0__Impl"
    // InternalPageGeneratorLanguare.g:2209:1: rule__Heading__Group_9__0__Impl : ( 'Padding-left' ) ;
    public final void rule__Heading__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2213:1: ( ( 'Padding-left' ) )
            // InternalPageGeneratorLanguare.g:2214:1: ( 'Padding-left' )
            {
            // InternalPageGeneratorLanguare.g:2214:1: ( 'Padding-left' )
            // InternalPageGeneratorLanguare.g:2215:2: 'Padding-left'
            {
             before(grammarAccess.getHeadingAccess().getPaddingLeftKeyword_9_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getHeadingAccess().getPaddingLeftKeyword_9_0()); 

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
    // $ANTLR end "rule__Heading__Group_9__0__Impl"


    // $ANTLR start "rule__Heading__Group_9__1"
    // InternalPageGeneratorLanguare.g:2224:1: rule__Heading__Group_9__1 : rule__Heading__Group_9__1__Impl rule__Heading__Group_9__2 ;
    public final void rule__Heading__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2228:1: ( rule__Heading__Group_9__1__Impl rule__Heading__Group_9__2 )
            // InternalPageGeneratorLanguare.g:2229:2: rule__Heading__Group_9__1__Impl rule__Heading__Group_9__2
            {
            pushFollow(FOLLOW_19);
            rule__Heading__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Heading__Group_9__2();

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
    // $ANTLR end "rule__Heading__Group_9__1"


    // $ANTLR start "rule__Heading__Group_9__1__Impl"
    // InternalPageGeneratorLanguare.g:2236:1: rule__Heading__Group_9__1__Impl : ( '=' ) ;
    public final void rule__Heading__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2240:1: ( ( '=' ) )
            // InternalPageGeneratorLanguare.g:2241:1: ( '=' )
            {
            // InternalPageGeneratorLanguare.g:2241:1: ( '=' )
            // InternalPageGeneratorLanguare.g:2242:2: '='
            {
             before(grammarAccess.getHeadingAccess().getEqualsSignKeyword_9_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getHeadingAccess().getEqualsSignKeyword_9_1()); 

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
    // $ANTLR end "rule__Heading__Group_9__1__Impl"


    // $ANTLR start "rule__Heading__Group_9__2"
    // InternalPageGeneratorLanguare.g:2251:1: rule__Heading__Group_9__2 : rule__Heading__Group_9__2__Impl rule__Heading__Group_9__3 ;
    public final void rule__Heading__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2255:1: ( rule__Heading__Group_9__2__Impl rule__Heading__Group_9__3 )
            // InternalPageGeneratorLanguare.g:2256:2: rule__Heading__Group_9__2__Impl rule__Heading__Group_9__3
            {
            pushFollow(FOLLOW_11);
            rule__Heading__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Heading__Group_9__3();

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
    // $ANTLR end "rule__Heading__Group_9__2"


    // $ANTLR start "rule__Heading__Group_9__2__Impl"
    // InternalPageGeneratorLanguare.g:2263:1: rule__Heading__Group_9__2__Impl : ( ( rule__Heading__LpaddingAssignment_9_2 ) ) ;
    public final void rule__Heading__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2267:1: ( ( ( rule__Heading__LpaddingAssignment_9_2 ) ) )
            // InternalPageGeneratorLanguare.g:2268:1: ( ( rule__Heading__LpaddingAssignment_9_2 ) )
            {
            // InternalPageGeneratorLanguare.g:2268:1: ( ( rule__Heading__LpaddingAssignment_9_2 ) )
            // InternalPageGeneratorLanguare.g:2269:2: ( rule__Heading__LpaddingAssignment_9_2 )
            {
             before(grammarAccess.getHeadingAccess().getLpaddingAssignment_9_2()); 
            // InternalPageGeneratorLanguare.g:2270:2: ( rule__Heading__LpaddingAssignment_9_2 )
            // InternalPageGeneratorLanguare.g:2270:3: rule__Heading__LpaddingAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__Heading__LpaddingAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getHeadingAccess().getLpaddingAssignment_9_2()); 

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
    // $ANTLR end "rule__Heading__Group_9__2__Impl"


    // $ANTLR start "rule__Heading__Group_9__3"
    // InternalPageGeneratorLanguare.g:2278:1: rule__Heading__Group_9__3 : rule__Heading__Group_9__3__Impl ;
    public final void rule__Heading__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2282:1: ( rule__Heading__Group_9__3__Impl )
            // InternalPageGeneratorLanguare.g:2283:2: rule__Heading__Group_9__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Heading__Group_9__3__Impl();

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
    // $ANTLR end "rule__Heading__Group_9__3"


    // $ANTLR start "rule__Heading__Group_9__3__Impl"
    // InternalPageGeneratorLanguare.g:2289:1: rule__Heading__Group_9__3__Impl : ( ( ',' )? ) ;
    public final void rule__Heading__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2293:1: ( ( ( ',' )? ) )
            // InternalPageGeneratorLanguare.g:2294:1: ( ( ',' )? )
            {
            // InternalPageGeneratorLanguare.g:2294:1: ( ( ',' )? )
            // InternalPageGeneratorLanguare.g:2295:2: ( ',' )?
            {
             before(grammarAccess.getHeadingAccess().getCommaKeyword_9_3()); 
            // InternalPageGeneratorLanguare.g:2296:2: ( ',' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==12) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:2296:3: ','
                    {
                    match(input,12,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getHeadingAccess().getCommaKeyword_9_3()); 

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
    // $ANTLR end "rule__Heading__Group_9__3__Impl"


    // $ANTLR start "rule__Heading__Group_10__0"
    // InternalPageGeneratorLanguare.g:2305:1: rule__Heading__Group_10__0 : rule__Heading__Group_10__0__Impl rule__Heading__Group_10__1 ;
    public final void rule__Heading__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2309:1: ( rule__Heading__Group_10__0__Impl rule__Heading__Group_10__1 )
            // InternalPageGeneratorLanguare.g:2310:2: rule__Heading__Group_10__0__Impl rule__Heading__Group_10__1
            {
            pushFollow(FOLLOW_8);
            rule__Heading__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Heading__Group_10__1();

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
    // $ANTLR end "rule__Heading__Group_10__0"


    // $ANTLR start "rule__Heading__Group_10__0__Impl"
    // InternalPageGeneratorLanguare.g:2317:1: rule__Heading__Group_10__0__Impl : ( 'Padding-right' ) ;
    public final void rule__Heading__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2321:1: ( ( 'Padding-right' ) )
            // InternalPageGeneratorLanguare.g:2322:1: ( 'Padding-right' )
            {
            // InternalPageGeneratorLanguare.g:2322:1: ( 'Padding-right' )
            // InternalPageGeneratorLanguare.g:2323:2: 'Padding-right'
            {
             before(grammarAccess.getHeadingAccess().getPaddingRightKeyword_10_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getHeadingAccess().getPaddingRightKeyword_10_0()); 

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
    // $ANTLR end "rule__Heading__Group_10__0__Impl"


    // $ANTLR start "rule__Heading__Group_10__1"
    // InternalPageGeneratorLanguare.g:2332:1: rule__Heading__Group_10__1 : rule__Heading__Group_10__1__Impl rule__Heading__Group_10__2 ;
    public final void rule__Heading__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2336:1: ( rule__Heading__Group_10__1__Impl rule__Heading__Group_10__2 )
            // InternalPageGeneratorLanguare.g:2337:2: rule__Heading__Group_10__1__Impl rule__Heading__Group_10__2
            {
            pushFollow(FOLLOW_19);
            rule__Heading__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Heading__Group_10__2();

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
    // $ANTLR end "rule__Heading__Group_10__1"


    // $ANTLR start "rule__Heading__Group_10__1__Impl"
    // InternalPageGeneratorLanguare.g:2344:1: rule__Heading__Group_10__1__Impl : ( '=' ) ;
    public final void rule__Heading__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2348:1: ( ( '=' ) )
            // InternalPageGeneratorLanguare.g:2349:1: ( '=' )
            {
            // InternalPageGeneratorLanguare.g:2349:1: ( '=' )
            // InternalPageGeneratorLanguare.g:2350:2: '='
            {
             before(grammarAccess.getHeadingAccess().getEqualsSignKeyword_10_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getHeadingAccess().getEqualsSignKeyword_10_1()); 

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
    // $ANTLR end "rule__Heading__Group_10__1__Impl"


    // $ANTLR start "rule__Heading__Group_10__2"
    // InternalPageGeneratorLanguare.g:2359:1: rule__Heading__Group_10__2 : rule__Heading__Group_10__2__Impl rule__Heading__Group_10__3 ;
    public final void rule__Heading__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2363:1: ( rule__Heading__Group_10__2__Impl rule__Heading__Group_10__3 )
            // InternalPageGeneratorLanguare.g:2364:2: rule__Heading__Group_10__2__Impl rule__Heading__Group_10__3
            {
            pushFollow(FOLLOW_11);
            rule__Heading__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Heading__Group_10__3();

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
    // $ANTLR end "rule__Heading__Group_10__2"


    // $ANTLR start "rule__Heading__Group_10__2__Impl"
    // InternalPageGeneratorLanguare.g:2371:1: rule__Heading__Group_10__2__Impl : ( ( rule__Heading__RpaddingAssignment_10_2 ) ) ;
    public final void rule__Heading__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2375:1: ( ( ( rule__Heading__RpaddingAssignment_10_2 ) ) )
            // InternalPageGeneratorLanguare.g:2376:1: ( ( rule__Heading__RpaddingAssignment_10_2 ) )
            {
            // InternalPageGeneratorLanguare.g:2376:1: ( ( rule__Heading__RpaddingAssignment_10_2 ) )
            // InternalPageGeneratorLanguare.g:2377:2: ( rule__Heading__RpaddingAssignment_10_2 )
            {
             before(grammarAccess.getHeadingAccess().getRpaddingAssignment_10_2()); 
            // InternalPageGeneratorLanguare.g:2378:2: ( rule__Heading__RpaddingAssignment_10_2 )
            // InternalPageGeneratorLanguare.g:2378:3: rule__Heading__RpaddingAssignment_10_2
            {
            pushFollow(FOLLOW_2);
            rule__Heading__RpaddingAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getHeadingAccess().getRpaddingAssignment_10_2()); 

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
    // $ANTLR end "rule__Heading__Group_10__2__Impl"


    // $ANTLR start "rule__Heading__Group_10__3"
    // InternalPageGeneratorLanguare.g:2386:1: rule__Heading__Group_10__3 : rule__Heading__Group_10__3__Impl ;
    public final void rule__Heading__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2390:1: ( rule__Heading__Group_10__3__Impl )
            // InternalPageGeneratorLanguare.g:2391:2: rule__Heading__Group_10__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Heading__Group_10__3__Impl();

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
    // $ANTLR end "rule__Heading__Group_10__3"


    // $ANTLR start "rule__Heading__Group_10__3__Impl"
    // InternalPageGeneratorLanguare.g:2397:1: rule__Heading__Group_10__3__Impl : ( ( ',' )? ) ;
    public final void rule__Heading__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2401:1: ( ( ( ',' )? ) )
            // InternalPageGeneratorLanguare.g:2402:1: ( ( ',' )? )
            {
            // InternalPageGeneratorLanguare.g:2402:1: ( ( ',' )? )
            // InternalPageGeneratorLanguare.g:2403:2: ( ',' )?
            {
             before(grammarAccess.getHeadingAccess().getCommaKeyword_10_3()); 
            // InternalPageGeneratorLanguare.g:2404:2: ( ',' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==12) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:2404:3: ','
                    {
                    match(input,12,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getHeadingAccess().getCommaKeyword_10_3()); 

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
    // $ANTLR end "rule__Heading__Group_10__3__Impl"


    // $ANTLR start "rule__Heading__Group_11__0"
    // InternalPageGeneratorLanguare.g:2413:1: rule__Heading__Group_11__0 : rule__Heading__Group_11__0__Impl rule__Heading__Group_11__1 ;
    public final void rule__Heading__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2417:1: ( rule__Heading__Group_11__0__Impl rule__Heading__Group_11__1 )
            // InternalPageGeneratorLanguare.g:2418:2: rule__Heading__Group_11__0__Impl rule__Heading__Group_11__1
            {
            pushFollow(FOLLOW_8);
            rule__Heading__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Heading__Group_11__1();

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
    // $ANTLR end "rule__Heading__Group_11__0"


    // $ANTLR start "rule__Heading__Group_11__0__Impl"
    // InternalPageGeneratorLanguare.g:2425:1: rule__Heading__Group_11__0__Impl : ( 'Padding-top' ) ;
    public final void rule__Heading__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2429:1: ( ( 'Padding-top' ) )
            // InternalPageGeneratorLanguare.g:2430:1: ( 'Padding-top' )
            {
            // InternalPageGeneratorLanguare.g:2430:1: ( 'Padding-top' )
            // InternalPageGeneratorLanguare.g:2431:2: 'Padding-top'
            {
             before(grammarAccess.getHeadingAccess().getPaddingTopKeyword_11_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getHeadingAccess().getPaddingTopKeyword_11_0()); 

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
    // $ANTLR end "rule__Heading__Group_11__0__Impl"


    // $ANTLR start "rule__Heading__Group_11__1"
    // InternalPageGeneratorLanguare.g:2440:1: rule__Heading__Group_11__1 : rule__Heading__Group_11__1__Impl rule__Heading__Group_11__2 ;
    public final void rule__Heading__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2444:1: ( rule__Heading__Group_11__1__Impl rule__Heading__Group_11__2 )
            // InternalPageGeneratorLanguare.g:2445:2: rule__Heading__Group_11__1__Impl rule__Heading__Group_11__2
            {
            pushFollow(FOLLOW_19);
            rule__Heading__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Heading__Group_11__2();

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
    // $ANTLR end "rule__Heading__Group_11__1"


    // $ANTLR start "rule__Heading__Group_11__1__Impl"
    // InternalPageGeneratorLanguare.g:2452:1: rule__Heading__Group_11__1__Impl : ( '=' ) ;
    public final void rule__Heading__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2456:1: ( ( '=' ) )
            // InternalPageGeneratorLanguare.g:2457:1: ( '=' )
            {
            // InternalPageGeneratorLanguare.g:2457:1: ( '=' )
            // InternalPageGeneratorLanguare.g:2458:2: '='
            {
             before(grammarAccess.getHeadingAccess().getEqualsSignKeyword_11_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getHeadingAccess().getEqualsSignKeyword_11_1()); 

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
    // $ANTLR end "rule__Heading__Group_11__1__Impl"


    // $ANTLR start "rule__Heading__Group_11__2"
    // InternalPageGeneratorLanguare.g:2467:1: rule__Heading__Group_11__2 : rule__Heading__Group_11__2__Impl rule__Heading__Group_11__3 ;
    public final void rule__Heading__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2471:1: ( rule__Heading__Group_11__2__Impl rule__Heading__Group_11__3 )
            // InternalPageGeneratorLanguare.g:2472:2: rule__Heading__Group_11__2__Impl rule__Heading__Group_11__3
            {
            pushFollow(FOLLOW_11);
            rule__Heading__Group_11__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Heading__Group_11__3();

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
    // $ANTLR end "rule__Heading__Group_11__2"


    // $ANTLR start "rule__Heading__Group_11__2__Impl"
    // InternalPageGeneratorLanguare.g:2479:1: rule__Heading__Group_11__2__Impl : ( ( rule__Heading__TpaddingAssignment_11_2 ) ) ;
    public final void rule__Heading__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2483:1: ( ( ( rule__Heading__TpaddingAssignment_11_2 ) ) )
            // InternalPageGeneratorLanguare.g:2484:1: ( ( rule__Heading__TpaddingAssignment_11_2 ) )
            {
            // InternalPageGeneratorLanguare.g:2484:1: ( ( rule__Heading__TpaddingAssignment_11_2 ) )
            // InternalPageGeneratorLanguare.g:2485:2: ( rule__Heading__TpaddingAssignment_11_2 )
            {
             before(grammarAccess.getHeadingAccess().getTpaddingAssignment_11_2()); 
            // InternalPageGeneratorLanguare.g:2486:2: ( rule__Heading__TpaddingAssignment_11_2 )
            // InternalPageGeneratorLanguare.g:2486:3: rule__Heading__TpaddingAssignment_11_2
            {
            pushFollow(FOLLOW_2);
            rule__Heading__TpaddingAssignment_11_2();

            state._fsp--;


            }

             after(grammarAccess.getHeadingAccess().getTpaddingAssignment_11_2()); 

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
    // $ANTLR end "rule__Heading__Group_11__2__Impl"


    // $ANTLR start "rule__Heading__Group_11__3"
    // InternalPageGeneratorLanguare.g:2494:1: rule__Heading__Group_11__3 : rule__Heading__Group_11__3__Impl ;
    public final void rule__Heading__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2498:1: ( rule__Heading__Group_11__3__Impl )
            // InternalPageGeneratorLanguare.g:2499:2: rule__Heading__Group_11__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Heading__Group_11__3__Impl();

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
    // $ANTLR end "rule__Heading__Group_11__3"


    // $ANTLR start "rule__Heading__Group_11__3__Impl"
    // InternalPageGeneratorLanguare.g:2505:1: rule__Heading__Group_11__3__Impl : ( ( ',' )? ) ;
    public final void rule__Heading__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2509:1: ( ( ( ',' )? ) )
            // InternalPageGeneratorLanguare.g:2510:1: ( ( ',' )? )
            {
            // InternalPageGeneratorLanguare.g:2510:1: ( ( ',' )? )
            // InternalPageGeneratorLanguare.g:2511:2: ( ',' )?
            {
             before(grammarAccess.getHeadingAccess().getCommaKeyword_11_3()); 
            // InternalPageGeneratorLanguare.g:2512:2: ( ',' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==12) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:2512:3: ','
                    {
                    match(input,12,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getHeadingAccess().getCommaKeyword_11_3()); 

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
    // $ANTLR end "rule__Heading__Group_11__3__Impl"


    // $ANTLR start "rule__Heading__Group_12__0"
    // InternalPageGeneratorLanguare.g:2521:1: rule__Heading__Group_12__0 : rule__Heading__Group_12__0__Impl rule__Heading__Group_12__1 ;
    public final void rule__Heading__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2525:1: ( rule__Heading__Group_12__0__Impl rule__Heading__Group_12__1 )
            // InternalPageGeneratorLanguare.g:2526:2: rule__Heading__Group_12__0__Impl rule__Heading__Group_12__1
            {
            pushFollow(FOLLOW_8);
            rule__Heading__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Heading__Group_12__1();

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
    // $ANTLR end "rule__Heading__Group_12__0"


    // $ANTLR start "rule__Heading__Group_12__0__Impl"
    // InternalPageGeneratorLanguare.g:2533:1: rule__Heading__Group_12__0__Impl : ( 'Padding-bottom' ) ;
    public final void rule__Heading__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2537:1: ( ( 'Padding-bottom' ) )
            // InternalPageGeneratorLanguare.g:2538:1: ( 'Padding-bottom' )
            {
            // InternalPageGeneratorLanguare.g:2538:1: ( 'Padding-bottom' )
            // InternalPageGeneratorLanguare.g:2539:2: 'Padding-bottom'
            {
             before(grammarAccess.getHeadingAccess().getPaddingBottomKeyword_12_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getHeadingAccess().getPaddingBottomKeyword_12_0()); 

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
    // $ANTLR end "rule__Heading__Group_12__0__Impl"


    // $ANTLR start "rule__Heading__Group_12__1"
    // InternalPageGeneratorLanguare.g:2548:1: rule__Heading__Group_12__1 : rule__Heading__Group_12__1__Impl rule__Heading__Group_12__2 ;
    public final void rule__Heading__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2552:1: ( rule__Heading__Group_12__1__Impl rule__Heading__Group_12__2 )
            // InternalPageGeneratorLanguare.g:2553:2: rule__Heading__Group_12__1__Impl rule__Heading__Group_12__2
            {
            pushFollow(FOLLOW_19);
            rule__Heading__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Heading__Group_12__2();

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
    // $ANTLR end "rule__Heading__Group_12__1"


    // $ANTLR start "rule__Heading__Group_12__1__Impl"
    // InternalPageGeneratorLanguare.g:2560:1: rule__Heading__Group_12__1__Impl : ( '=' ) ;
    public final void rule__Heading__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2564:1: ( ( '=' ) )
            // InternalPageGeneratorLanguare.g:2565:1: ( '=' )
            {
            // InternalPageGeneratorLanguare.g:2565:1: ( '=' )
            // InternalPageGeneratorLanguare.g:2566:2: '='
            {
             before(grammarAccess.getHeadingAccess().getEqualsSignKeyword_12_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getHeadingAccess().getEqualsSignKeyword_12_1()); 

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
    // $ANTLR end "rule__Heading__Group_12__1__Impl"


    // $ANTLR start "rule__Heading__Group_12__2"
    // InternalPageGeneratorLanguare.g:2575:1: rule__Heading__Group_12__2 : rule__Heading__Group_12__2__Impl rule__Heading__Group_12__3 ;
    public final void rule__Heading__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2579:1: ( rule__Heading__Group_12__2__Impl rule__Heading__Group_12__3 )
            // InternalPageGeneratorLanguare.g:2580:2: rule__Heading__Group_12__2__Impl rule__Heading__Group_12__3
            {
            pushFollow(FOLLOW_11);
            rule__Heading__Group_12__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Heading__Group_12__3();

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
    // $ANTLR end "rule__Heading__Group_12__2"


    // $ANTLR start "rule__Heading__Group_12__2__Impl"
    // InternalPageGeneratorLanguare.g:2587:1: rule__Heading__Group_12__2__Impl : ( ( rule__Heading__BpaddingAssignment_12_2 ) ) ;
    public final void rule__Heading__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2591:1: ( ( ( rule__Heading__BpaddingAssignment_12_2 ) ) )
            // InternalPageGeneratorLanguare.g:2592:1: ( ( rule__Heading__BpaddingAssignment_12_2 ) )
            {
            // InternalPageGeneratorLanguare.g:2592:1: ( ( rule__Heading__BpaddingAssignment_12_2 ) )
            // InternalPageGeneratorLanguare.g:2593:2: ( rule__Heading__BpaddingAssignment_12_2 )
            {
             before(grammarAccess.getHeadingAccess().getBpaddingAssignment_12_2()); 
            // InternalPageGeneratorLanguare.g:2594:2: ( rule__Heading__BpaddingAssignment_12_2 )
            // InternalPageGeneratorLanguare.g:2594:3: rule__Heading__BpaddingAssignment_12_2
            {
            pushFollow(FOLLOW_2);
            rule__Heading__BpaddingAssignment_12_2();

            state._fsp--;


            }

             after(grammarAccess.getHeadingAccess().getBpaddingAssignment_12_2()); 

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
    // $ANTLR end "rule__Heading__Group_12__2__Impl"


    // $ANTLR start "rule__Heading__Group_12__3"
    // InternalPageGeneratorLanguare.g:2602:1: rule__Heading__Group_12__3 : rule__Heading__Group_12__3__Impl ;
    public final void rule__Heading__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2606:1: ( rule__Heading__Group_12__3__Impl )
            // InternalPageGeneratorLanguare.g:2607:2: rule__Heading__Group_12__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Heading__Group_12__3__Impl();

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
    // $ANTLR end "rule__Heading__Group_12__3"


    // $ANTLR start "rule__Heading__Group_12__3__Impl"
    // InternalPageGeneratorLanguare.g:2613:1: rule__Heading__Group_12__3__Impl : ( ( ',' )? ) ;
    public final void rule__Heading__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2617:1: ( ( ( ',' )? ) )
            // InternalPageGeneratorLanguare.g:2618:1: ( ( ',' )? )
            {
            // InternalPageGeneratorLanguare.g:2618:1: ( ( ',' )? )
            // InternalPageGeneratorLanguare.g:2619:2: ( ',' )?
            {
             before(grammarAccess.getHeadingAccess().getCommaKeyword_12_3()); 
            // InternalPageGeneratorLanguare.g:2620:2: ( ',' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==12) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:2620:3: ','
                    {
                    match(input,12,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getHeadingAccess().getCommaKeyword_12_3()); 

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
    // $ANTLR end "rule__Heading__Group_12__3__Impl"


    // $ANTLR start "rule__Link__Group__0"
    // InternalPageGeneratorLanguare.g:2629:1: rule__Link__Group__0 : rule__Link__Group__0__Impl rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2633:1: ( rule__Link__Group__0__Impl rule__Link__Group__1 )
            // InternalPageGeneratorLanguare.g:2634:2: rule__Link__Group__0__Impl rule__Link__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Link__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__1();

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
    // $ANTLR end "rule__Link__Group__0"


    // $ANTLR start "rule__Link__Group__0__Impl"
    // InternalPageGeneratorLanguare.g:2641:1: rule__Link__Group__0__Impl : ( 'Link' ) ;
    public final void rule__Link__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2645:1: ( ( 'Link' ) )
            // InternalPageGeneratorLanguare.g:2646:1: ( 'Link' )
            {
            // InternalPageGeneratorLanguare.g:2646:1: ( 'Link' )
            // InternalPageGeneratorLanguare.g:2647:2: 'Link'
            {
             before(grammarAccess.getLinkAccess().getLinkKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getLinkKeyword_0()); 

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
    // $ANTLR end "rule__Link__Group__0__Impl"


    // $ANTLR start "rule__Link__Group__1"
    // InternalPageGeneratorLanguare.g:2656:1: rule__Link__Group__1 : rule__Link__Group__1__Impl rule__Link__Group__2 ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2660:1: ( rule__Link__Group__1__Impl rule__Link__Group__2 )
            // InternalPageGeneratorLanguare.g:2661:2: rule__Link__Group__1__Impl rule__Link__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Link__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__2();

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
    // $ANTLR end "rule__Link__Group__1"


    // $ANTLR start "rule__Link__Group__1__Impl"
    // InternalPageGeneratorLanguare.g:2668:1: rule__Link__Group__1__Impl : ( ( rule__Link__NameAssignment_1 ) ) ;
    public final void rule__Link__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2672:1: ( ( ( rule__Link__NameAssignment_1 ) ) )
            // InternalPageGeneratorLanguare.g:2673:1: ( ( rule__Link__NameAssignment_1 ) )
            {
            // InternalPageGeneratorLanguare.g:2673:1: ( ( rule__Link__NameAssignment_1 ) )
            // InternalPageGeneratorLanguare.g:2674:2: ( rule__Link__NameAssignment_1 )
            {
             before(grammarAccess.getLinkAccess().getNameAssignment_1()); 
            // InternalPageGeneratorLanguare.g:2675:2: ( rule__Link__NameAssignment_1 )
            // InternalPageGeneratorLanguare.g:2675:3: rule__Link__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Link__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Link__Group__1__Impl"


    // $ANTLR start "rule__Link__Group__2"
    // InternalPageGeneratorLanguare.g:2683:1: rule__Link__Group__2 : rule__Link__Group__2__Impl rule__Link__Group__3 ;
    public final void rule__Link__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2687:1: ( rule__Link__Group__2__Impl rule__Link__Group__3 )
            // InternalPageGeneratorLanguare.g:2688:2: rule__Link__Group__2__Impl rule__Link__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Link__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__3();

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
    // $ANTLR end "rule__Link__Group__2"


    // $ANTLR start "rule__Link__Group__2__Impl"
    // InternalPageGeneratorLanguare.g:2695:1: rule__Link__Group__2__Impl : ( '<' ) ;
    public final void rule__Link__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2699:1: ( ( '<' ) )
            // InternalPageGeneratorLanguare.g:2700:1: ( '<' )
            {
            // InternalPageGeneratorLanguare.g:2700:1: ( '<' )
            // InternalPageGeneratorLanguare.g:2701:2: '<'
            {
             before(grammarAccess.getLinkAccess().getLessThanSignKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getLessThanSignKeyword_2()); 

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
    // $ANTLR end "rule__Link__Group__2__Impl"


    // $ANTLR start "rule__Link__Group__3"
    // InternalPageGeneratorLanguare.g:2710:1: rule__Link__Group__3 : rule__Link__Group__3__Impl rule__Link__Group__4 ;
    public final void rule__Link__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2714:1: ( rule__Link__Group__3__Impl rule__Link__Group__4 )
            // InternalPageGeneratorLanguare.g:2715:2: rule__Link__Group__3__Impl rule__Link__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__Link__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__4();

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
    // $ANTLR end "rule__Link__Group__3"


    // $ANTLR start "rule__Link__Group__3__Impl"
    // InternalPageGeneratorLanguare.g:2722:1: rule__Link__Group__3__Impl : ( ( rule__Link__Group_3__0 )? ) ;
    public final void rule__Link__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2726:1: ( ( ( rule__Link__Group_3__0 )? ) )
            // InternalPageGeneratorLanguare.g:2727:1: ( ( rule__Link__Group_3__0 )? )
            {
            // InternalPageGeneratorLanguare.g:2727:1: ( ( rule__Link__Group_3__0 )? )
            // InternalPageGeneratorLanguare.g:2728:2: ( rule__Link__Group_3__0 )?
            {
             before(grammarAccess.getLinkAccess().getGroup_3()); 
            // InternalPageGeneratorLanguare.g:2729:2: ( rule__Link__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==33) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:2729:3: rule__Link__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Link__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLinkAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Link__Group__3__Impl"


    // $ANTLR start "rule__Link__Group__4"
    // InternalPageGeneratorLanguare.g:2737:1: rule__Link__Group__4 : rule__Link__Group__4__Impl rule__Link__Group__5 ;
    public final void rule__Link__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2741:1: ( rule__Link__Group__4__Impl rule__Link__Group__5 )
            // InternalPageGeneratorLanguare.g:2742:2: rule__Link__Group__4__Impl rule__Link__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__Link__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__5();

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
    // $ANTLR end "rule__Link__Group__4"


    // $ANTLR start "rule__Link__Group__4__Impl"
    // InternalPageGeneratorLanguare.g:2749:1: rule__Link__Group__4__Impl : ( ( rule__Link__Group_4__0 )? ) ;
    public final void rule__Link__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2753:1: ( ( ( rule__Link__Group_4__0 )? ) )
            // InternalPageGeneratorLanguare.g:2754:1: ( ( rule__Link__Group_4__0 )? )
            {
            // InternalPageGeneratorLanguare.g:2754:1: ( ( rule__Link__Group_4__0 )? )
            // InternalPageGeneratorLanguare.g:2755:2: ( rule__Link__Group_4__0 )?
            {
             before(grammarAccess.getLinkAccess().getGroup_4()); 
            // InternalPageGeneratorLanguare.g:2756:2: ( rule__Link__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==28) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:2756:3: rule__Link__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Link__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLinkAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Link__Group__4__Impl"


    // $ANTLR start "rule__Link__Group__5"
    // InternalPageGeneratorLanguare.g:2764:1: rule__Link__Group__5 : rule__Link__Group__5__Impl rule__Link__Group__6 ;
    public final void rule__Link__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2768:1: ( rule__Link__Group__5__Impl rule__Link__Group__6 )
            // InternalPageGeneratorLanguare.g:2769:2: rule__Link__Group__5__Impl rule__Link__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__Link__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__6();

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
    // $ANTLR end "rule__Link__Group__5"


    // $ANTLR start "rule__Link__Group__5__Impl"
    // InternalPageGeneratorLanguare.g:2776:1: rule__Link__Group__5__Impl : ( ( rule__Link__Group_5__0 )? ) ;
    public final void rule__Link__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2780:1: ( ( ( rule__Link__Group_5__0 )? ) )
            // InternalPageGeneratorLanguare.g:2781:1: ( ( rule__Link__Group_5__0 )? )
            {
            // InternalPageGeneratorLanguare.g:2781:1: ( ( rule__Link__Group_5__0 )? )
            // InternalPageGeneratorLanguare.g:2782:2: ( rule__Link__Group_5__0 )?
            {
             before(grammarAccess.getLinkAccess().getGroup_5()); 
            // InternalPageGeneratorLanguare.g:2783:2: ( rule__Link__Group_5__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==29) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:2783:3: rule__Link__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Link__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLinkAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Link__Group__5__Impl"


    // $ANTLR start "rule__Link__Group__6"
    // InternalPageGeneratorLanguare.g:2791:1: rule__Link__Group__6 : rule__Link__Group__6__Impl rule__Link__Group__7 ;
    public final void rule__Link__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2795:1: ( rule__Link__Group__6__Impl rule__Link__Group__7 )
            // InternalPageGeneratorLanguare.g:2796:2: rule__Link__Group__6__Impl rule__Link__Group__7
            {
            pushFollow(FOLLOW_22);
            rule__Link__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__7();

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
    // $ANTLR end "rule__Link__Group__6"


    // $ANTLR start "rule__Link__Group__6__Impl"
    // InternalPageGeneratorLanguare.g:2803:1: rule__Link__Group__6__Impl : ( ( rule__Link__Group_6__0 )? ) ;
    public final void rule__Link__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2807:1: ( ( ( rule__Link__Group_6__0 )? ) )
            // InternalPageGeneratorLanguare.g:2808:1: ( ( rule__Link__Group_6__0 )? )
            {
            // InternalPageGeneratorLanguare.g:2808:1: ( ( rule__Link__Group_6__0 )? )
            // InternalPageGeneratorLanguare.g:2809:2: ( rule__Link__Group_6__0 )?
            {
             before(grammarAccess.getLinkAccess().getGroup_6()); 
            // InternalPageGeneratorLanguare.g:2810:2: ( rule__Link__Group_6__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==30) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:2810:3: rule__Link__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Link__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLinkAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Link__Group__6__Impl"


    // $ANTLR start "rule__Link__Group__7"
    // InternalPageGeneratorLanguare.g:2818:1: rule__Link__Group__7 : rule__Link__Group__7__Impl rule__Link__Group__8 ;
    public final void rule__Link__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2822:1: ( rule__Link__Group__7__Impl rule__Link__Group__8 )
            // InternalPageGeneratorLanguare.g:2823:2: rule__Link__Group__7__Impl rule__Link__Group__8
            {
            pushFollow(FOLLOW_22);
            rule__Link__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__8();

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
    // $ANTLR end "rule__Link__Group__7"


    // $ANTLR start "rule__Link__Group__7__Impl"
    // InternalPageGeneratorLanguare.g:2830:1: rule__Link__Group__7__Impl : ( ( rule__Link__Group_7__0 )? ) ;
    public final void rule__Link__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2834:1: ( ( ( rule__Link__Group_7__0 )? ) )
            // InternalPageGeneratorLanguare.g:2835:1: ( ( rule__Link__Group_7__0 )? )
            {
            // InternalPageGeneratorLanguare.g:2835:1: ( ( rule__Link__Group_7__0 )? )
            // InternalPageGeneratorLanguare.g:2836:2: ( rule__Link__Group_7__0 )?
            {
             before(grammarAccess.getLinkAccess().getGroup_7()); 
            // InternalPageGeneratorLanguare.g:2837:2: ( rule__Link__Group_7__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:2837:3: rule__Link__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Link__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLinkAccess().getGroup_7()); 

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
    // $ANTLR end "rule__Link__Group__7__Impl"


    // $ANTLR start "rule__Link__Group__8"
    // InternalPageGeneratorLanguare.g:2845:1: rule__Link__Group__8 : rule__Link__Group__8__Impl rule__Link__Group__9 ;
    public final void rule__Link__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2849:1: ( rule__Link__Group__8__Impl rule__Link__Group__9 )
            // InternalPageGeneratorLanguare.g:2850:2: rule__Link__Group__8__Impl rule__Link__Group__9
            {
            pushFollow(FOLLOW_22);
            rule__Link__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__9();

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
    // $ANTLR end "rule__Link__Group__8"


    // $ANTLR start "rule__Link__Group__8__Impl"
    // InternalPageGeneratorLanguare.g:2857:1: rule__Link__Group__8__Impl : ( ( rule__Link__Group_8__0 )? ) ;
    public final void rule__Link__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2861:1: ( ( ( rule__Link__Group_8__0 )? ) )
            // InternalPageGeneratorLanguare.g:2862:1: ( ( rule__Link__Group_8__0 )? )
            {
            // InternalPageGeneratorLanguare.g:2862:1: ( ( rule__Link__Group_8__0 )? )
            // InternalPageGeneratorLanguare.g:2863:2: ( rule__Link__Group_8__0 )?
            {
             before(grammarAccess.getLinkAccess().getGroup_8()); 
            // InternalPageGeneratorLanguare.g:2864:2: ( rule__Link__Group_8__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==26) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:2864:3: rule__Link__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Link__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLinkAccess().getGroup_8()); 

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
    // $ANTLR end "rule__Link__Group__8__Impl"


    // $ANTLR start "rule__Link__Group__9"
    // InternalPageGeneratorLanguare.g:2872:1: rule__Link__Group__9 : rule__Link__Group__9__Impl rule__Link__Group__10 ;
    public final void rule__Link__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2876:1: ( rule__Link__Group__9__Impl rule__Link__Group__10 )
            // InternalPageGeneratorLanguare.g:2877:2: rule__Link__Group__9__Impl rule__Link__Group__10
            {
            pushFollow(FOLLOW_22);
            rule__Link__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__10();

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
    // $ANTLR end "rule__Link__Group__9"


    // $ANTLR start "rule__Link__Group__9__Impl"
    // InternalPageGeneratorLanguare.g:2884:1: rule__Link__Group__9__Impl : ( ( rule__Link__Group_9__0 )? ) ;
    public final void rule__Link__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2888:1: ( ( ( rule__Link__Group_9__0 )? ) )
            // InternalPageGeneratorLanguare.g:2889:1: ( ( rule__Link__Group_9__0 )? )
            {
            // InternalPageGeneratorLanguare.g:2889:1: ( ( rule__Link__Group_9__0 )? )
            // InternalPageGeneratorLanguare.g:2890:2: ( rule__Link__Group_9__0 )?
            {
             before(grammarAccess.getLinkAccess().getGroup_9()); 
            // InternalPageGeneratorLanguare.g:2891:2: ( rule__Link__Group_9__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==34) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:2891:3: rule__Link__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Link__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLinkAccess().getGroup_9()); 

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
    // $ANTLR end "rule__Link__Group__9__Impl"


    // $ANTLR start "rule__Link__Group__10"
    // InternalPageGeneratorLanguare.g:2899:1: rule__Link__Group__10 : rule__Link__Group__10__Impl rule__Link__Group__11 ;
    public final void rule__Link__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2903:1: ( rule__Link__Group__10__Impl rule__Link__Group__11 )
            // InternalPageGeneratorLanguare.g:2904:2: rule__Link__Group__10__Impl rule__Link__Group__11
            {
            pushFollow(FOLLOW_22);
            rule__Link__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__11();

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
    // $ANTLR end "rule__Link__Group__10"


    // $ANTLR start "rule__Link__Group__10__Impl"
    // InternalPageGeneratorLanguare.g:2911:1: rule__Link__Group__10__Impl : ( ( rule__Link__Group_10__0 )? ) ;
    public final void rule__Link__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2915:1: ( ( ( rule__Link__Group_10__0 )? ) )
            // InternalPageGeneratorLanguare.g:2916:1: ( ( rule__Link__Group_10__0 )? )
            {
            // InternalPageGeneratorLanguare.g:2916:1: ( ( rule__Link__Group_10__0 )? )
            // InternalPageGeneratorLanguare.g:2917:2: ( rule__Link__Group_10__0 )?
            {
             before(grammarAccess.getLinkAccess().getGroup_10()); 
            // InternalPageGeneratorLanguare.g:2918:2: ( rule__Link__Group_10__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==27) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:2918:3: rule__Link__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Link__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLinkAccess().getGroup_10()); 

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
    // $ANTLR end "rule__Link__Group__10__Impl"


    // $ANTLR start "rule__Link__Group__11"
    // InternalPageGeneratorLanguare.g:2926:1: rule__Link__Group__11 : rule__Link__Group__11__Impl rule__Link__Group__12 ;
    public final void rule__Link__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2930:1: ( rule__Link__Group__11__Impl rule__Link__Group__12 )
            // InternalPageGeneratorLanguare.g:2931:2: rule__Link__Group__11__Impl rule__Link__Group__12
            {
            pushFollow(FOLLOW_8);
            rule__Link__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__12();

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
    // $ANTLR end "rule__Link__Group__11"


    // $ANTLR start "rule__Link__Group__11__Impl"
    // InternalPageGeneratorLanguare.g:2938:1: rule__Link__Group__11__Impl : ( '>' ) ;
    public final void rule__Link__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2942:1: ( ( '>' ) )
            // InternalPageGeneratorLanguare.g:2943:1: ( '>' )
            {
            // InternalPageGeneratorLanguare.g:2943:1: ( '>' )
            // InternalPageGeneratorLanguare.g:2944:2: '>'
            {
             before(grammarAccess.getLinkAccess().getGreaterThanSignKeyword_11()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getGreaterThanSignKeyword_11()); 

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
    // $ANTLR end "rule__Link__Group__11__Impl"


    // $ANTLR start "rule__Link__Group__12"
    // InternalPageGeneratorLanguare.g:2953:1: rule__Link__Group__12 : rule__Link__Group__12__Impl rule__Link__Group__13 ;
    public final void rule__Link__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2957:1: ( rule__Link__Group__12__Impl rule__Link__Group__13 )
            // InternalPageGeneratorLanguare.g:2958:2: rule__Link__Group__12__Impl rule__Link__Group__13
            {
            pushFollow(FOLLOW_9);
            rule__Link__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__13();

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
    // $ANTLR end "rule__Link__Group__12"


    // $ANTLR start "rule__Link__Group__12__Impl"
    // InternalPageGeneratorLanguare.g:2965:1: rule__Link__Group__12__Impl : ( '=' ) ;
    public final void rule__Link__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2969:1: ( ( '=' ) )
            // InternalPageGeneratorLanguare.g:2970:1: ( '=' )
            {
            // InternalPageGeneratorLanguare.g:2970:1: ( '=' )
            // InternalPageGeneratorLanguare.g:2971:2: '='
            {
             before(grammarAccess.getLinkAccess().getEqualsSignKeyword_12()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getEqualsSignKeyword_12()); 

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
    // $ANTLR end "rule__Link__Group__12__Impl"


    // $ANTLR start "rule__Link__Group__13"
    // InternalPageGeneratorLanguare.g:2980:1: rule__Link__Group__13 : rule__Link__Group__13__Impl rule__Link__Group__14 ;
    public final void rule__Link__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2984:1: ( rule__Link__Group__13__Impl rule__Link__Group__14 )
            // InternalPageGeneratorLanguare.g:2985:2: rule__Link__Group__13__Impl rule__Link__Group__14
            {
            pushFollow(FOLLOW_10);
            rule__Link__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__14();

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
    // $ANTLR end "rule__Link__Group__13"


    // $ANTLR start "rule__Link__Group__13__Impl"
    // InternalPageGeneratorLanguare.g:2992:1: rule__Link__Group__13__Impl : ( ( rule__Link__UrlAssignment_13 ) ) ;
    public final void rule__Link__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:2996:1: ( ( ( rule__Link__UrlAssignment_13 ) ) )
            // InternalPageGeneratorLanguare.g:2997:1: ( ( rule__Link__UrlAssignment_13 ) )
            {
            // InternalPageGeneratorLanguare.g:2997:1: ( ( rule__Link__UrlAssignment_13 ) )
            // InternalPageGeneratorLanguare.g:2998:2: ( rule__Link__UrlAssignment_13 )
            {
             before(grammarAccess.getLinkAccess().getUrlAssignment_13()); 
            // InternalPageGeneratorLanguare.g:2999:2: ( rule__Link__UrlAssignment_13 )
            // InternalPageGeneratorLanguare.g:2999:3: rule__Link__UrlAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__Link__UrlAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getUrlAssignment_13()); 

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
    // $ANTLR end "rule__Link__Group__13__Impl"


    // $ANTLR start "rule__Link__Group__14"
    // InternalPageGeneratorLanguare.g:3007:1: rule__Link__Group__14 : rule__Link__Group__14__Impl ;
    public final void rule__Link__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3011:1: ( rule__Link__Group__14__Impl )
            // InternalPageGeneratorLanguare.g:3012:2: rule__Link__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group__14__Impl();

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
    // $ANTLR end "rule__Link__Group__14"


    // $ANTLR start "rule__Link__Group__14__Impl"
    // InternalPageGeneratorLanguare.g:3018:1: rule__Link__Group__14__Impl : ( ';' ) ;
    public final void rule__Link__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3022:1: ( ( ';' ) )
            // InternalPageGeneratorLanguare.g:3023:1: ( ';' )
            {
            // InternalPageGeneratorLanguare.g:3023:1: ( ';' )
            // InternalPageGeneratorLanguare.g:3024:2: ';'
            {
             before(grammarAccess.getLinkAccess().getSemicolonKeyword_14()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getSemicolonKeyword_14()); 

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
    // $ANTLR end "rule__Link__Group__14__Impl"


    // $ANTLR start "rule__Link__Group_3__0"
    // InternalPageGeneratorLanguare.g:3034:1: rule__Link__Group_3__0 : rule__Link__Group_3__0__Impl rule__Link__Group_3__1 ;
    public final void rule__Link__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3038:1: ( rule__Link__Group_3__0__Impl rule__Link__Group_3__1 )
            // InternalPageGeneratorLanguare.g:3039:2: rule__Link__Group_3__0__Impl rule__Link__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__Link__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_3__1();

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
    // $ANTLR end "rule__Link__Group_3__0"


    // $ANTLR start "rule__Link__Group_3__0__Impl"
    // InternalPageGeneratorLanguare.g:3046:1: rule__Link__Group_3__0__Impl : ( 'target' ) ;
    public final void rule__Link__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3050:1: ( ( 'target' ) )
            // InternalPageGeneratorLanguare.g:3051:1: ( 'target' )
            {
            // InternalPageGeneratorLanguare.g:3051:1: ( 'target' )
            // InternalPageGeneratorLanguare.g:3052:2: 'target'
            {
             before(grammarAccess.getLinkAccess().getTargetKeyword_3_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getTargetKeyword_3_0()); 

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
    // $ANTLR end "rule__Link__Group_3__0__Impl"


    // $ANTLR start "rule__Link__Group_3__1"
    // InternalPageGeneratorLanguare.g:3061:1: rule__Link__Group_3__1 : rule__Link__Group_3__1__Impl rule__Link__Group_3__2 ;
    public final void rule__Link__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3065:1: ( rule__Link__Group_3__1__Impl rule__Link__Group_3__2 )
            // InternalPageGeneratorLanguare.g:3066:2: rule__Link__Group_3__1__Impl rule__Link__Group_3__2
            {
            pushFollow(FOLLOW_9);
            rule__Link__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_3__2();

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
    // $ANTLR end "rule__Link__Group_3__1"


    // $ANTLR start "rule__Link__Group_3__1__Impl"
    // InternalPageGeneratorLanguare.g:3073:1: rule__Link__Group_3__1__Impl : ( '=' ) ;
    public final void rule__Link__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3077:1: ( ( '=' ) )
            // InternalPageGeneratorLanguare.g:3078:1: ( '=' )
            {
            // InternalPageGeneratorLanguare.g:3078:1: ( '=' )
            // InternalPageGeneratorLanguare.g:3079:2: '='
            {
             before(grammarAccess.getLinkAccess().getEqualsSignKeyword_3_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getEqualsSignKeyword_3_1()); 

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
    // $ANTLR end "rule__Link__Group_3__1__Impl"


    // $ANTLR start "rule__Link__Group_3__2"
    // InternalPageGeneratorLanguare.g:3088:1: rule__Link__Group_3__2 : rule__Link__Group_3__2__Impl rule__Link__Group_3__3 ;
    public final void rule__Link__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3092:1: ( rule__Link__Group_3__2__Impl rule__Link__Group_3__3 )
            // InternalPageGeneratorLanguare.g:3093:2: rule__Link__Group_3__2__Impl rule__Link__Group_3__3
            {
            pushFollow(FOLLOW_11);
            rule__Link__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_3__3();

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
    // $ANTLR end "rule__Link__Group_3__2"


    // $ANTLR start "rule__Link__Group_3__2__Impl"
    // InternalPageGeneratorLanguare.g:3100:1: rule__Link__Group_3__2__Impl : ( ( rule__Link__TargetAssignment_3_2 ) ) ;
    public final void rule__Link__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3104:1: ( ( ( rule__Link__TargetAssignment_3_2 ) ) )
            // InternalPageGeneratorLanguare.g:3105:1: ( ( rule__Link__TargetAssignment_3_2 ) )
            {
            // InternalPageGeneratorLanguare.g:3105:1: ( ( rule__Link__TargetAssignment_3_2 ) )
            // InternalPageGeneratorLanguare.g:3106:2: ( rule__Link__TargetAssignment_3_2 )
            {
             before(grammarAccess.getLinkAccess().getTargetAssignment_3_2()); 
            // InternalPageGeneratorLanguare.g:3107:2: ( rule__Link__TargetAssignment_3_2 )
            // InternalPageGeneratorLanguare.g:3107:3: rule__Link__TargetAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Link__TargetAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getTargetAssignment_3_2()); 

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
    // $ANTLR end "rule__Link__Group_3__2__Impl"


    // $ANTLR start "rule__Link__Group_3__3"
    // InternalPageGeneratorLanguare.g:3115:1: rule__Link__Group_3__3 : rule__Link__Group_3__3__Impl ;
    public final void rule__Link__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3119:1: ( rule__Link__Group_3__3__Impl )
            // InternalPageGeneratorLanguare.g:3120:2: rule__Link__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group_3__3__Impl();

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
    // $ANTLR end "rule__Link__Group_3__3"


    // $ANTLR start "rule__Link__Group_3__3__Impl"
    // InternalPageGeneratorLanguare.g:3126:1: rule__Link__Group_3__3__Impl : ( ( ',' )? ) ;
    public final void rule__Link__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3130:1: ( ( ( ',' )? ) )
            // InternalPageGeneratorLanguare.g:3131:1: ( ( ',' )? )
            {
            // InternalPageGeneratorLanguare.g:3131:1: ( ( ',' )? )
            // InternalPageGeneratorLanguare.g:3132:2: ( ',' )?
            {
             before(grammarAccess.getLinkAccess().getCommaKeyword_3_3()); 
            // InternalPageGeneratorLanguare.g:3133:2: ( ',' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==12) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:3133:3: ','
                    {
                    match(input,12,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getLinkAccess().getCommaKeyword_3_3()); 

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
    // $ANTLR end "rule__Link__Group_3__3__Impl"


    // $ANTLR start "rule__Link__Group_4__0"
    // InternalPageGeneratorLanguare.g:3142:1: rule__Link__Group_4__0 : rule__Link__Group_4__0__Impl rule__Link__Group_4__1 ;
    public final void rule__Link__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3146:1: ( rule__Link__Group_4__0__Impl rule__Link__Group_4__1 )
            // InternalPageGeneratorLanguare.g:3147:2: rule__Link__Group_4__0__Impl rule__Link__Group_4__1
            {
            pushFollow(FOLLOW_8);
            rule__Link__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_4__1();

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
    // $ANTLR end "rule__Link__Group_4__0"


    // $ANTLR start "rule__Link__Group_4__0__Impl"
    // InternalPageGeneratorLanguare.g:3154:1: rule__Link__Group_4__0__Impl : ( 'Padding-left' ) ;
    public final void rule__Link__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3158:1: ( ( 'Padding-left' ) )
            // InternalPageGeneratorLanguare.g:3159:1: ( 'Padding-left' )
            {
            // InternalPageGeneratorLanguare.g:3159:1: ( 'Padding-left' )
            // InternalPageGeneratorLanguare.g:3160:2: 'Padding-left'
            {
             before(grammarAccess.getLinkAccess().getPaddingLeftKeyword_4_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getPaddingLeftKeyword_4_0()); 

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
    // $ANTLR end "rule__Link__Group_4__0__Impl"


    // $ANTLR start "rule__Link__Group_4__1"
    // InternalPageGeneratorLanguare.g:3169:1: rule__Link__Group_4__1 : rule__Link__Group_4__1__Impl rule__Link__Group_4__2 ;
    public final void rule__Link__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3173:1: ( rule__Link__Group_4__1__Impl rule__Link__Group_4__2 )
            // InternalPageGeneratorLanguare.g:3174:2: rule__Link__Group_4__1__Impl rule__Link__Group_4__2
            {
            pushFollow(FOLLOW_19);
            rule__Link__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_4__2();

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
    // $ANTLR end "rule__Link__Group_4__1"


    // $ANTLR start "rule__Link__Group_4__1__Impl"
    // InternalPageGeneratorLanguare.g:3181:1: rule__Link__Group_4__1__Impl : ( '=' ) ;
    public final void rule__Link__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3185:1: ( ( '=' ) )
            // InternalPageGeneratorLanguare.g:3186:1: ( '=' )
            {
            // InternalPageGeneratorLanguare.g:3186:1: ( '=' )
            // InternalPageGeneratorLanguare.g:3187:2: '='
            {
             before(grammarAccess.getLinkAccess().getEqualsSignKeyword_4_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getEqualsSignKeyword_4_1()); 

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
    // $ANTLR end "rule__Link__Group_4__1__Impl"


    // $ANTLR start "rule__Link__Group_4__2"
    // InternalPageGeneratorLanguare.g:3196:1: rule__Link__Group_4__2 : rule__Link__Group_4__2__Impl rule__Link__Group_4__3 ;
    public final void rule__Link__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3200:1: ( rule__Link__Group_4__2__Impl rule__Link__Group_4__3 )
            // InternalPageGeneratorLanguare.g:3201:2: rule__Link__Group_4__2__Impl rule__Link__Group_4__3
            {
            pushFollow(FOLLOW_11);
            rule__Link__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_4__3();

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
    // $ANTLR end "rule__Link__Group_4__2"


    // $ANTLR start "rule__Link__Group_4__2__Impl"
    // InternalPageGeneratorLanguare.g:3208:1: rule__Link__Group_4__2__Impl : ( ( rule__Link__LpaddingAssignment_4_2 ) ) ;
    public final void rule__Link__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3212:1: ( ( ( rule__Link__LpaddingAssignment_4_2 ) ) )
            // InternalPageGeneratorLanguare.g:3213:1: ( ( rule__Link__LpaddingAssignment_4_2 ) )
            {
            // InternalPageGeneratorLanguare.g:3213:1: ( ( rule__Link__LpaddingAssignment_4_2 ) )
            // InternalPageGeneratorLanguare.g:3214:2: ( rule__Link__LpaddingAssignment_4_2 )
            {
             before(grammarAccess.getLinkAccess().getLpaddingAssignment_4_2()); 
            // InternalPageGeneratorLanguare.g:3215:2: ( rule__Link__LpaddingAssignment_4_2 )
            // InternalPageGeneratorLanguare.g:3215:3: rule__Link__LpaddingAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Link__LpaddingAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getLpaddingAssignment_4_2()); 

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
    // $ANTLR end "rule__Link__Group_4__2__Impl"


    // $ANTLR start "rule__Link__Group_4__3"
    // InternalPageGeneratorLanguare.g:3223:1: rule__Link__Group_4__3 : rule__Link__Group_4__3__Impl ;
    public final void rule__Link__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3227:1: ( rule__Link__Group_4__3__Impl )
            // InternalPageGeneratorLanguare.g:3228:2: rule__Link__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group_4__3__Impl();

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
    // $ANTLR end "rule__Link__Group_4__3"


    // $ANTLR start "rule__Link__Group_4__3__Impl"
    // InternalPageGeneratorLanguare.g:3234:1: rule__Link__Group_4__3__Impl : ( ( ',' )? ) ;
    public final void rule__Link__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3238:1: ( ( ( ',' )? ) )
            // InternalPageGeneratorLanguare.g:3239:1: ( ( ',' )? )
            {
            // InternalPageGeneratorLanguare.g:3239:1: ( ( ',' )? )
            // InternalPageGeneratorLanguare.g:3240:2: ( ',' )?
            {
             before(grammarAccess.getLinkAccess().getCommaKeyword_4_3()); 
            // InternalPageGeneratorLanguare.g:3241:2: ( ',' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==12) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:3241:3: ','
                    {
                    match(input,12,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getLinkAccess().getCommaKeyword_4_3()); 

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
    // $ANTLR end "rule__Link__Group_4__3__Impl"


    // $ANTLR start "rule__Link__Group_5__0"
    // InternalPageGeneratorLanguare.g:3250:1: rule__Link__Group_5__0 : rule__Link__Group_5__0__Impl rule__Link__Group_5__1 ;
    public final void rule__Link__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3254:1: ( rule__Link__Group_5__0__Impl rule__Link__Group_5__1 )
            // InternalPageGeneratorLanguare.g:3255:2: rule__Link__Group_5__0__Impl rule__Link__Group_5__1
            {
            pushFollow(FOLLOW_8);
            rule__Link__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_5__1();

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
    // $ANTLR end "rule__Link__Group_5__0"


    // $ANTLR start "rule__Link__Group_5__0__Impl"
    // InternalPageGeneratorLanguare.g:3262:1: rule__Link__Group_5__0__Impl : ( 'Padding-right' ) ;
    public final void rule__Link__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3266:1: ( ( 'Padding-right' ) )
            // InternalPageGeneratorLanguare.g:3267:1: ( 'Padding-right' )
            {
            // InternalPageGeneratorLanguare.g:3267:1: ( 'Padding-right' )
            // InternalPageGeneratorLanguare.g:3268:2: 'Padding-right'
            {
             before(grammarAccess.getLinkAccess().getPaddingRightKeyword_5_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getPaddingRightKeyword_5_0()); 

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
    // $ANTLR end "rule__Link__Group_5__0__Impl"


    // $ANTLR start "rule__Link__Group_5__1"
    // InternalPageGeneratorLanguare.g:3277:1: rule__Link__Group_5__1 : rule__Link__Group_5__1__Impl rule__Link__Group_5__2 ;
    public final void rule__Link__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3281:1: ( rule__Link__Group_5__1__Impl rule__Link__Group_5__2 )
            // InternalPageGeneratorLanguare.g:3282:2: rule__Link__Group_5__1__Impl rule__Link__Group_5__2
            {
            pushFollow(FOLLOW_19);
            rule__Link__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_5__2();

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
    // $ANTLR end "rule__Link__Group_5__1"


    // $ANTLR start "rule__Link__Group_5__1__Impl"
    // InternalPageGeneratorLanguare.g:3289:1: rule__Link__Group_5__1__Impl : ( '=' ) ;
    public final void rule__Link__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3293:1: ( ( '=' ) )
            // InternalPageGeneratorLanguare.g:3294:1: ( '=' )
            {
            // InternalPageGeneratorLanguare.g:3294:1: ( '=' )
            // InternalPageGeneratorLanguare.g:3295:2: '='
            {
             before(grammarAccess.getLinkAccess().getEqualsSignKeyword_5_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getEqualsSignKeyword_5_1()); 

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
    // $ANTLR end "rule__Link__Group_5__1__Impl"


    // $ANTLR start "rule__Link__Group_5__2"
    // InternalPageGeneratorLanguare.g:3304:1: rule__Link__Group_5__2 : rule__Link__Group_5__2__Impl rule__Link__Group_5__3 ;
    public final void rule__Link__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3308:1: ( rule__Link__Group_5__2__Impl rule__Link__Group_5__3 )
            // InternalPageGeneratorLanguare.g:3309:2: rule__Link__Group_5__2__Impl rule__Link__Group_5__3
            {
            pushFollow(FOLLOW_11);
            rule__Link__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_5__3();

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
    // $ANTLR end "rule__Link__Group_5__2"


    // $ANTLR start "rule__Link__Group_5__2__Impl"
    // InternalPageGeneratorLanguare.g:3316:1: rule__Link__Group_5__2__Impl : ( ( rule__Link__RpaddingAssignment_5_2 ) ) ;
    public final void rule__Link__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3320:1: ( ( ( rule__Link__RpaddingAssignment_5_2 ) ) )
            // InternalPageGeneratorLanguare.g:3321:1: ( ( rule__Link__RpaddingAssignment_5_2 ) )
            {
            // InternalPageGeneratorLanguare.g:3321:1: ( ( rule__Link__RpaddingAssignment_5_2 ) )
            // InternalPageGeneratorLanguare.g:3322:2: ( rule__Link__RpaddingAssignment_5_2 )
            {
             before(grammarAccess.getLinkAccess().getRpaddingAssignment_5_2()); 
            // InternalPageGeneratorLanguare.g:3323:2: ( rule__Link__RpaddingAssignment_5_2 )
            // InternalPageGeneratorLanguare.g:3323:3: rule__Link__RpaddingAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Link__RpaddingAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getRpaddingAssignment_5_2()); 

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
    // $ANTLR end "rule__Link__Group_5__2__Impl"


    // $ANTLR start "rule__Link__Group_5__3"
    // InternalPageGeneratorLanguare.g:3331:1: rule__Link__Group_5__3 : rule__Link__Group_5__3__Impl ;
    public final void rule__Link__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3335:1: ( rule__Link__Group_5__3__Impl )
            // InternalPageGeneratorLanguare.g:3336:2: rule__Link__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group_5__3__Impl();

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
    // $ANTLR end "rule__Link__Group_5__3"


    // $ANTLR start "rule__Link__Group_5__3__Impl"
    // InternalPageGeneratorLanguare.g:3342:1: rule__Link__Group_5__3__Impl : ( ( ',' )? ) ;
    public final void rule__Link__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3346:1: ( ( ( ',' )? ) )
            // InternalPageGeneratorLanguare.g:3347:1: ( ( ',' )? )
            {
            // InternalPageGeneratorLanguare.g:3347:1: ( ( ',' )? )
            // InternalPageGeneratorLanguare.g:3348:2: ( ',' )?
            {
             before(grammarAccess.getLinkAccess().getCommaKeyword_5_3()); 
            // InternalPageGeneratorLanguare.g:3349:2: ( ',' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==12) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:3349:3: ','
                    {
                    match(input,12,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getLinkAccess().getCommaKeyword_5_3()); 

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
    // $ANTLR end "rule__Link__Group_5__3__Impl"


    // $ANTLR start "rule__Link__Group_6__0"
    // InternalPageGeneratorLanguare.g:3358:1: rule__Link__Group_6__0 : rule__Link__Group_6__0__Impl rule__Link__Group_6__1 ;
    public final void rule__Link__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3362:1: ( rule__Link__Group_6__0__Impl rule__Link__Group_6__1 )
            // InternalPageGeneratorLanguare.g:3363:2: rule__Link__Group_6__0__Impl rule__Link__Group_6__1
            {
            pushFollow(FOLLOW_8);
            rule__Link__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_6__1();

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
    // $ANTLR end "rule__Link__Group_6__0"


    // $ANTLR start "rule__Link__Group_6__0__Impl"
    // InternalPageGeneratorLanguare.g:3370:1: rule__Link__Group_6__0__Impl : ( 'Padding-top' ) ;
    public final void rule__Link__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3374:1: ( ( 'Padding-top' ) )
            // InternalPageGeneratorLanguare.g:3375:1: ( 'Padding-top' )
            {
            // InternalPageGeneratorLanguare.g:3375:1: ( 'Padding-top' )
            // InternalPageGeneratorLanguare.g:3376:2: 'Padding-top'
            {
             before(grammarAccess.getLinkAccess().getPaddingTopKeyword_6_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getPaddingTopKeyword_6_0()); 

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
    // $ANTLR end "rule__Link__Group_6__0__Impl"


    // $ANTLR start "rule__Link__Group_6__1"
    // InternalPageGeneratorLanguare.g:3385:1: rule__Link__Group_6__1 : rule__Link__Group_6__1__Impl rule__Link__Group_6__2 ;
    public final void rule__Link__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3389:1: ( rule__Link__Group_6__1__Impl rule__Link__Group_6__2 )
            // InternalPageGeneratorLanguare.g:3390:2: rule__Link__Group_6__1__Impl rule__Link__Group_6__2
            {
            pushFollow(FOLLOW_19);
            rule__Link__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_6__2();

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
    // $ANTLR end "rule__Link__Group_6__1"


    // $ANTLR start "rule__Link__Group_6__1__Impl"
    // InternalPageGeneratorLanguare.g:3397:1: rule__Link__Group_6__1__Impl : ( '=' ) ;
    public final void rule__Link__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3401:1: ( ( '=' ) )
            // InternalPageGeneratorLanguare.g:3402:1: ( '=' )
            {
            // InternalPageGeneratorLanguare.g:3402:1: ( '=' )
            // InternalPageGeneratorLanguare.g:3403:2: '='
            {
             before(grammarAccess.getLinkAccess().getEqualsSignKeyword_6_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getEqualsSignKeyword_6_1()); 

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
    // $ANTLR end "rule__Link__Group_6__1__Impl"


    // $ANTLR start "rule__Link__Group_6__2"
    // InternalPageGeneratorLanguare.g:3412:1: rule__Link__Group_6__2 : rule__Link__Group_6__2__Impl rule__Link__Group_6__3 ;
    public final void rule__Link__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3416:1: ( rule__Link__Group_6__2__Impl rule__Link__Group_6__3 )
            // InternalPageGeneratorLanguare.g:3417:2: rule__Link__Group_6__2__Impl rule__Link__Group_6__3
            {
            pushFollow(FOLLOW_11);
            rule__Link__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_6__3();

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
    // $ANTLR end "rule__Link__Group_6__2"


    // $ANTLR start "rule__Link__Group_6__2__Impl"
    // InternalPageGeneratorLanguare.g:3424:1: rule__Link__Group_6__2__Impl : ( ( rule__Link__TpaddingAssignment_6_2 ) ) ;
    public final void rule__Link__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3428:1: ( ( ( rule__Link__TpaddingAssignment_6_2 ) ) )
            // InternalPageGeneratorLanguare.g:3429:1: ( ( rule__Link__TpaddingAssignment_6_2 ) )
            {
            // InternalPageGeneratorLanguare.g:3429:1: ( ( rule__Link__TpaddingAssignment_6_2 ) )
            // InternalPageGeneratorLanguare.g:3430:2: ( rule__Link__TpaddingAssignment_6_2 )
            {
             before(grammarAccess.getLinkAccess().getTpaddingAssignment_6_2()); 
            // InternalPageGeneratorLanguare.g:3431:2: ( rule__Link__TpaddingAssignment_6_2 )
            // InternalPageGeneratorLanguare.g:3431:3: rule__Link__TpaddingAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Link__TpaddingAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getTpaddingAssignment_6_2()); 

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
    // $ANTLR end "rule__Link__Group_6__2__Impl"


    // $ANTLR start "rule__Link__Group_6__3"
    // InternalPageGeneratorLanguare.g:3439:1: rule__Link__Group_6__3 : rule__Link__Group_6__3__Impl ;
    public final void rule__Link__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3443:1: ( rule__Link__Group_6__3__Impl )
            // InternalPageGeneratorLanguare.g:3444:2: rule__Link__Group_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group_6__3__Impl();

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
    // $ANTLR end "rule__Link__Group_6__3"


    // $ANTLR start "rule__Link__Group_6__3__Impl"
    // InternalPageGeneratorLanguare.g:3450:1: rule__Link__Group_6__3__Impl : ( ( ',' )? ) ;
    public final void rule__Link__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3454:1: ( ( ( ',' )? ) )
            // InternalPageGeneratorLanguare.g:3455:1: ( ( ',' )? )
            {
            // InternalPageGeneratorLanguare.g:3455:1: ( ( ',' )? )
            // InternalPageGeneratorLanguare.g:3456:2: ( ',' )?
            {
             before(grammarAccess.getLinkAccess().getCommaKeyword_6_3()); 
            // InternalPageGeneratorLanguare.g:3457:2: ( ',' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==12) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:3457:3: ','
                    {
                    match(input,12,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getLinkAccess().getCommaKeyword_6_3()); 

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
    // $ANTLR end "rule__Link__Group_6__3__Impl"


    // $ANTLR start "rule__Link__Group_7__0"
    // InternalPageGeneratorLanguare.g:3466:1: rule__Link__Group_7__0 : rule__Link__Group_7__0__Impl rule__Link__Group_7__1 ;
    public final void rule__Link__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3470:1: ( rule__Link__Group_7__0__Impl rule__Link__Group_7__1 )
            // InternalPageGeneratorLanguare.g:3471:2: rule__Link__Group_7__0__Impl rule__Link__Group_7__1
            {
            pushFollow(FOLLOW_8);
            rule__Link__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_7__1();

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
    // $ANTLR end "rule__Link__Group_7__0"


    // $ANTLR start "rule__Link__Group_7__0__Impl"
    // InternalPageGeneratorLanguare.g:3478:1: rule__Link__Group_7__0__Impl : ( 'Padding-bottom' ) ;
    public final void rule__Link__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3482:1: ( ( 'Padding-bottom' ) )
            // InternalPageGeneratorLanguare.g:3483:1: ( 'Padding-bottom' )
            {
            // InternalPageGeneratorLanguare.g:3483:1: ( 'Padding-bottom' )
            // InternalPageGeneratorLanguare.g:3484:2: 'Padding-bottom'
            {
             before(grammarAccess.getLinkAccess().getPaddingBottomKeyword_7_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getPaddingBottomKeyword_7_0()); 

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
    // $ANTLR end "rule__Link__Group_7__0__Impl"


    // $ANTLR start "rule__Link__Group_7__1"
    // InternalPageGeneratorLanguare.g:3493:1: rule__Link__Group_7__1 : rule__Link__Group_7__1__Impl rule__Link__Group_7__2 ;
    public final void rule__Link__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3497:1: ( rule__Link__Group_7__1__Impl rule__Link__Group_7__2 )
            // InternalPageGeneratorLanguare.g:3498:2: rule__Link__Group_7__1__Impl rule__Link__Group_7__2
            {
            pushFollow(FOLLOW_19);
            rule__Link__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_7__2();

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
    // $ANTLR end "rule__Link__Group_7__1"


    // $ANTLR start "rule__Link__Group_7__1__Impl"
    // InternalPageGeneratorLanguare.g:3505:1: rule__Link__Group_7__1__Impl : ( '=' ) ;
    public final void rule__Link__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3509:1: ( ( '=' ) )
            // InternalPageGeneratorLanguare.g:3510:1: ( '=' )
            {
            // InternalPageGeneratorLanguare.g:3510:1: ( '=' )
            // InternalPageGeneratorLanguare.g:3511:2: '='
            {
             before(grammarAccess.getLinkAccess().getEqualsSignKeyword_7_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getEqualsSignKeyword_7_1()); 

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
    // $ANTLR end "rule__Link__Group_7__1__Impl"


    // $ANTLR start "rule__Link__Group_7__2"
    // InternalPageGeneratorLanguare.g:3520:1: rule__Link__Group_7__2 : rule__Link__Group_7__2__Impl rule__Link__Group_7__3 ;
    public final void rule__Link__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3524:1: ( rule__Link__Group_7__2__Impl rule__Link__Group_7__3 )
            // InternalPageGeneratorLanguare.g:3525:2: rule__Link__Group_7__2__Impl rule__Link__Group_7__3
            {
            pushFollow(FOLLOW_11);
            rule__Link__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_7__3();

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
    // $ANTLR end "rule__Link__Group_7__2"


    // $ANTLR start "rule__Link__Group_7__2__Impl"
    // InternalPageGeneratorLanguare.g:3532:1: rule__Link__Group_7__2__Impl : ( ( rule__Link__BpaddingAssignment_7_2 ) ) ;
    public final void rule__Link__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3536:1: ( ( ( rule__Link__BpaddingAssignment_7_2 ) ) )
            // InternalPageGeneratorLanguare.g:3537:1: ( ( rule__Link__BpaddingAssignment_7_2 ) )
            {
            // InternalPageGeneratorLanguare.g:3537:1: ( ( rule__Link__BpaddingAssignment_7_2 ) )
            // InternalPageGeneratorLanguare.g:3538:2: ( rule__Link__BpaddingAssignment_7_2 )
            {
             before(grammarAccess.getLinkAccess().getBpaddingAssignment_7_2()); 
            // InternalPageGeneratorLanguare.g:3539:2: ( rule__Link__BpaddingAssignment_7_2 )
            // InternalPageGeneratorLanguare.g:3539:3: rule__Link__BpaddingAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__Link__BpaddingAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getBpaddingAssignment_7_2()); 

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
    // $ANTLR end "rule__Link__Group_7__2__Impl"


    // $ANTLR start "rule__Link__Group_7__3"
    // InternalPageGeneratorLanguare.g:3547:1: rule__Link__Group_7__3 : rule__Link__Group_7__3__Impl ;
    public final void rule__Link__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3551:1: ( rule__Link__Group_7__3__Impl )
            // InternalPageGeneratorLanguare.g:3552:2: rule__Link__Group_7__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group_7__3__Impl();

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
    // $ANTLR end "rule__Link__Group_7__3"


    // $ANTLR start "rule__Link__Group_7__3__Impl"
    // InternalPageGeneratorLanguare.g:3558:1: rule__Link__Group_7__3__Impl : ( ( ',' )? ) ;
    public final void rule__Link__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3562:1: ( ( ( ',' )? ) )
            // InternalPageGeneratorLanguare.g:3563:1: ( ( ',' )? )
            {
            // InternalPageGeneratorLanguare.g:3563:1: ( ( ',' )? )
            // InternalPageGeneratorLanguare.g:3564:2: ( ',' )?
            {
             before(grammarAccess.getLinkAccess().getCommaKeyword_7_3()); 
            // InternalPageGeneratorLanguare.g:3565:2: ( ',' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==12) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:3565:3: ','
                    {
                    match(input,12,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getLinkAccess().getCommaKeyword_7_3()); 

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
    // $ANTLR end "rule__Link__Group_7__3__Impl"


    // $ANTLR start "rule__Link__Group_8__0"
    // InternalPageGeneratorLanguare.g:3574:1: rule__Link__Group_8__0 : rule__Link__Group_8__0__Impl rule__Link__Group_8__1 ;
    public final void rule__Link__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3578:1: ( rule__Link__Group_8__0__Impl rule__Link__Group_8__1 )
            // InternalPageGeneratorLanguare.g:3579:2: rule__Link__Group_8__0__Impl rule__Link__Group_8__1
            {
            pushFollow(FOLLOW_8);
            rule__Link__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_8__1();

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
    // $ANTLR end "rule__Link__Group_8__0"


    // $ANTLR start "rule__Link__Group_8__0__Impl"
    // InternalPageGeneratorLanguare.g:3586:1: rule__Link__Group_8__0__Impl : ( 'Font-colour' ) ;
    public final void rule__Link__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3590:1: ( ( 'Font-colour' ) )
            // InternalPageGeneratorLanguare.g:3591:1: ( 'Font-colour' )
            {
            // InternalPageGeneratorLanguare.g:3591:1: ( 'Font-colour' )
            // InternalPageGeneratorLanguare.g:3592:2: 'Font-colour'
            {
             before(grammarAccess.getLinkAccess().getFontColourKeyword_8_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getFontColourKeyword_8_0()); 

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
    // $ANTLR end "rule__Link__Group_8__0__Impl"


    // $ANTLR start "rule__Link__Group_8__1"
    // InternalPageGeneratorLanguare.g:3601:1: rule__Link__Group_8__1 : rule__Link__Group_8__1__Impl rule__Link__Group_8__2 ;
    public final void rule__Link__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3605:1: ( rule__Link__Group_8__1__Impl rule__Link__Group_8__2 )
            // InternalPageGeneratorLanguare.g:3606:2: rule__Link__Group_8__1__Impl rule__Link__Group_8__2
            {
            pushFollow(FOLLOW_21);
            rule__Link__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_8__2();

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
    // $ANTLR end "rule__Link__Group_8__1"


    // $ANTLR start "rule__Link__Group_8__1__Impl"
    // InternalPageGeneratorLanguare.g:3613:1: rule__Link__Group_8__1__Impl : ( '=' ) ;
    public final void rule__Link__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3617:1: ( ( '=' ) )
            // InternalPageGeneratorLanguare.g:3618:1: ( '=' )
            {
            // InternalPageGeneratorLanguare.g:3618:1: ( '=' )
            // InternalPageGeneratorLanguare.g:3619:2: '='
            {
             before(grammarAccess.getLinkAccess().getEqualsSignKeyword_8_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getEqualsSignKeyword_8_1()); 

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
    // $ANTLR end "rule__Link__Group_8__1__Impl"


    // $ANTLR start "rule__Link__Group_8__2"
    // InternalPageGeneratorLanguare.g:3628:1: rule__Link__Group_8__2 : rule__Link__Group_8__2__Impl rule__Link__Group_8__3 ;
    public final void rule__Link__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3632:1: ( rule__Link__Group_8__2__Impl rule__Link__Group_8__3 )
            // InternalPageGeneratorLanguare.g:3633:2: rule__Link__Group_8__2__Impl rule__Link__Group_8__3
            {
            pushFollow(FOLLOW_11);
            rule__Link__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_8__3();

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
    // $ANTLR end "rule__Link__Group_8__2"


    // $ANTLR start "rule__Link__Group_8__2__Impl"
    // InternalPageGeneratorLanguare.g:3640:1: rule__Link__Group_8__2__Impl : ( ( rule__Link__FontColorAssignment_8_2 ) ) ;
    public final void rule__Link__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3644:1: ( ( ( rule__Link__FontColorAssignment_8_2 ) ) )
            // InternalPageGeneratorLanguare.g:3645:1: ( ( rule__Link__FontColorAssignment_8_2 ) )
            {
            // InternalPageGeneratorLanguare.g:3645:1: ( ( rule__Link__FontColorAssignment_8_2 ) )
            // InternalPageGeneratorLanguare.g:3646:2: ( rule__Link__FontColorAssignment_8_2 )
            {
             before(grammarAccess.getLinkAccess().getFontColorAssignment_8_2()); 
            // InternalPageGeneratorLanguare.g:3647:2: ( rule__Link__FontColorAssignment_8_2 )
            // InternalPageGeneratorLanguare.g:3647:3: rule__Link__FontColorAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__Link__FontColorAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getFontColorAssignment_8_2()); 

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
    // $ANTLR end "rule__Link__Group_8__2__Impl"


    // $ANTLR start "rule__Link__Group_8__3"
    // InternalPageGeneratorLanguare.g:3655:1: rule__Link__Group_8__3 : rule__Link__Group_8__3__Impl ;
    public final void rule__Link__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3659:1: ( rule__Link__Group_8__3__Impl )
            // InternalPageGeneratorLanguare.g:3660:2: rule__Link__Group_8__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group_8__3__Impl();

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
    // $ANTLR end "rule__Link__Group_8__3"


    // $ANTLR start "rule__Link__Group_8__3__Impl"
    // InternalPageGeneratorLanguare.g:3666:1: rule__Link__Group_8__3__Impl : ( ( ',' )? ) ;
    public final void rule__Link__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3670:1: ( ( ( ',' )? ) )
            // InternalPageGeneratorLanguare.g:3671:1: ( ( ',' )? )
            {
            // InternalPageGeneratorLanguare.g:3671:1: ( ( ',' )? )
            // InternalPageGeneratorLanguare.g:3672:2: ( ',' )?
            {
             before(grammarAccess.getLinkAccess().getCommaKeyword_8_3()); 
            // InternalPageGeneratorLanguare.g:3673:2: ( ',' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==12) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:3673:3: ','
                    {
                    match(input,12,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getLinkAccess().getCommaKeyword_8_3()); 

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
    // $ANTLR end "rule__Link__Group_8__3__Impl"


    // $ANTLR start "rule__Link__Group_9__0"
    // InternalPageGeneratorLanguare.g:3682:1: rule__Link__Group_9__0 : rule__Link__Group_9__0__Impl rule__Link__Group_9__1 ;
    public final void rule__Link__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3686:1: ( rule__Link__Group_9__0__Impl rule__Link__Group_9__1 )
            // InternalPageGeneratorLanguare.g:3687:2: rule__Link__Group_9__0__Impl rule__Link__Group_9__1
            {
            pushFollow(FOLLOW_8);
            rule__Link__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_9__1();

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
    // $ANTLR end "rule__Link__Group_9__0"


    // $ANTLR start "rule__Link__Group_9__0__Impl"
    // InternalPageGeneratorLanguare.g:3694:1: rule__Link__Group_9__0__Impl : ( 'Font-size' ) ;
    public final void rule__Link__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3698:1: ( ( 'Font-size' ) )
            // InternalPageGeneratorLanguare.g:3699:1: ( 'Font-size' )
            {
            // InternalPageGeneratorLanguare.g:3699:1: ( 'Font-size' )
            // InternalPageGeneratorLanguare.g:3700:2: 'Font-size'
            {
             before(grammarAccess.getLinkAccess().getFontSizeKeyword_9_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getFontSizeKeyword_9_0()); 

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
    // $ANTLR end "rule__Link__Group_9__0__Impl"


    // $ANTLR start "rule__Link__Group_9__1"
    // InternalPageGeneratorLanguare.g:3709:1: rule__Link__Group_9__1 : rule__Link__Group_9__1__Impl rule__Link__Group_9__2 ;
    public final void rule__Link__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3713:1: ( rule__Link__Group_9__1__Impl rule__Link__Group_9__2 )
            // InternalPageGeneratorLanguare.g:3714:2: rule__Link__Group_9__1__Impl rule__Link__Group_9__2
            {
            pushFollow(FOLLOW_19);
            rule__Link__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_9__2();

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
    // $ANTLR end "rule__Link__Group_9__1"


    // $ANTLR start "rule__Link__Group_9__1__Impl"
    // InternalPageGeneratorLanguare.g:3721:1: rule__Link__Group_9__1__Impl : ( '=' ) ;
    public final void rule__Link__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3725:1: ( ( '=' ) )
            // InternalPageGeneratorLanguare.g:3726:1: ( '=' )
            {
            // InternalPageGeneratorLanguare.g:3726:1: ( '=' )
            // InternalPageGeneratorLanguare.g:3727:2: '='
            {
             before(grammarAccess.getLinkAccess().getEqualsSignKeyword_9_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getEqualsSignKeyword_9_1()); 

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
    // $ANTLR end "rule__Link__Group_9__1__Impl"


    // $ANTLR start "rule__Link__Group_9__2"
    // InternalPageGeneratorLanguare.g:3736:1: rule__Link__Group_9__2 : rule__Link__Group_9__2__Impl rule__Link__Group_9__3 ;
    public final void rule__Link__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3740:1: ( rule__Link__Group_9__2__Impl rule__Link__Group_9__3 )
            // InternalPageGeneratorLanguare.g:3741:2: rule__Link__Group_9__2__Impl rule__Link__Group_9__3
            {
            pushFollow(FOLLOW_11);
            rule__Link__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_9__3();

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
    // $ANTLR end "rule__Link__Group_9__2"


    // $ANTLR start "rule__Link__Group_9__2__Impl"
    // InternalPageGeneratorLanguare.g:3748:1: rule__Link__Group_9__2__Impl : ( ( rule__Link__FontSizeAssignment_9_2 ) ) ;
    public final void rule__Link__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3752:1: ( ( ( rule__Link__FontSizeAssignment_9_2 ) ) )
            // InternalPageGeneratorLanguare.g:3753:1: ( ( rule__Link__FontSizeAssignment_9_2 ) )
            {
            // InternalPageGeneratorLanguare.g:3753:1: ( ( rule__Link__FontSizeAssignment_9_2 ) )
            // InternalPageGeneratorLanguare.g:3754:2: ( rule__Link__FontSizeAssignment_9_2 )
            {
             before(grammarAccess.getLinkAccess().getFontSizeAssignment_9_2()); 
            // InternalPageGeneratorLanguare.g:3755:2: ( rule__Link__FontSizeAssignment_9_2 )
            // InternalPageGeneratorLanguare.g:3755:3: rule__Link__FontSizeAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__Link__FontSizeAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getFontSizeAssignment_9_2()); 

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
    // $ANTLR end "rule__Link__Group_9__2__Impl"


    // $ANTLR start "rule__Link__Group_9__3"
    // InternalPageGeneratorLanguare.g:3763:1: rule__Link__Group_9__3 : rule__Link__Group_9__3__Impl ;
    public final void rule__Link__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3767:1: ( rule__Link__Group_9__3__Impl )
            // InternalPageGeneratorLanguare.g:3768:2: rule__Link__Group_9__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group_9__3__Impl();

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
    // $ANTLR end "rule__Link__Group_9__3"


    // $ANTLR start "rule__Link__Group_9__3__Impl"
    // InternalPageGeneratorLanguare.g:3774:1: rule__Link__Group_9__3__Impl : ( ( ',' )? ) ;
    public final void rule__Link__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3778:1: ( ( ( ',' )? ) )
            // InternalPageGeneratorLanguare.g:3779:1: ( ( ',' )? )
            {
            // InternalPageGeneratorLanguare.g:3779:1: ( ( ',' )? )
            // InternalPageGeneratorLanguare.g:3780:2: ( ',' )?
            {
             before(grammarAccess.getLinkAccess().getCommaKeyword_9_3()); 
            // InternalPageGeneratorLanguare.g:3781:2: ( ',' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==12) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:3781:3: ','
                    {
                    match(input,12,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getLinkAccess().getCommaKeyword_9_3()); 

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
    // $ANTLR end "rule__Link__Group_9__3__Impl"


    // $ANTLR start "rule__Link__Group_10__0"
    // InternalPageGeneratorLanguare.g:3790:1: rule__Link__Group_10__0 : rule__Link__Group_10__0__Impl rule__Link__Group_10__1 ;
    public final void rule__Link__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3794:1: ( rule__Link__Group_10__0__Impl rule__Link__Group_10__1 )
            // InternalPageGeneratorLanguare.g:3795:2: rule__Link__Group_10__0__Impl rule__Link__Group_10__1
            {
            pushFollow(FOLLOW_8);
            rule__Link__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_10__1();

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
    // $ANTLR end "rule__Link__Group_10__0"


    // $ANTLR start "rule__Link__Group_10__0__Impl"
    // InternalPageGeneratorLanguare.g:3802:1: rule__Link__Group_10__0__Impl : ( 'Location' ) ;
    public final void rule__Link__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3806:1: ( ( 'Location' ) )
            // InternalPageGeneratorLanguare.g:3807:1: ( 'Location' )
            {
            // InternalPageGeneratorLanguare.g:3807:1: ( 'Location' )
            // InternalPageGeneratorLanguare.g:3808:2: 'Location'
            {
             before(grammarAccess.getLinkAccess().getLocationKeyword_10_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getLocationKeyword_10_0()); 

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
    // $ANTLR end "rule__Link__Group_10__0__Impl"


    // $ANTLR start "rule__Link__Group_10__1"
    // InternalPageGeneratorLanguare.g:3817:1: rule__Link__Group_10__1 : rule__Link__Group_10__1__Impl rule__Link__Group_10__2 ;
    public final void rule__Link__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3821:1: ( rule__Link__Group_10__1__Impl rule__Link__Group_10__2 )
            // InternalPageGeneratorLanguare.g:3822:2: rule__Link__Group_10__1__Impl rule__Link__Group_10__2
            {
            pushFollow(FOLLOW_9);
            rule__Link__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_10__2();

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
    // $ANTLR end "rule__Link__Group_10__1"


    // $ANTLR start "rule__Link__Group_10__1__Impl"
    // InternalPageGeneratorLanguare.g:3829:1: rule__Link__Group_10__1__Impl : ( '=' ) ;
    public final void rule__Link__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3833:1: ( ( '=' ) )
            // InternalPageGeneratorLanguare.g:3834:1: ( '=' )
            {
            // InternalPageGeneratorLanguare.g:3834:1: ( '=' )
            // InternalPageGeneratorLanguare.g:3835:2: '='
            {
             before(grammarAccess.getLinkAccess().getEqualsSignKeyword_10_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getEqualsSignKeyword_10_1()); 

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
    // $ANTLR end "rule__Link__Group_10__1__Impl"


    // $ANTLR start "rule__Link__Group_10__2"
    // InternalPageGeneratorLanguare.g:3844:1: rule__Link__Group_10__2 : rule__Link__Group_10__2__Impl rule__Link__Group_10__3 ;
    public final void rule__Link__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3848:1: ( rule__Link__Group_10__2__Impl rule__Link__Group_10__3 )
            // InternalPageGeneratorLanguare.g:3849:2: rule__Link__Group_10__2__Impl rule__Link__Group_10__3
            {
            pushFollow(FOLLOW_11);
            rule__Link__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_10__3();

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
    // $ANTLR end "rule__Link__Group_10__2"


    // $ANTLR start "rule__Link__Group_10__2__Impl"
    // InternalPageGeneratorLanguare.g:3856:1: rule__Link__Group_10__2__Impl : ( ( rule__Link__LocationAssignment_10_2 ) ) ;
    public final void rule__Link__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3860:1: ( ( ( rule__Link__LocationAssignment_10_2 ) ) )
            // InternalPageGeneratorLanguare.g:3861:1: ( ( rule__Link__LocationAssignment_10_2 ) )
            {
            // InternalPageGeneratorLanguare.g:3861:1: ( ( rule__Link__LocationAssignment_10_2 ) )
            // InternalPageGeneratorLanguare.g:3862:2: ( rule__Link__LocationAssignment_10_2 )
            {
             before(grammarAccess.getLinkAccess().getLocationAssignment_10_2()); 
            // InternalPageGeneratorLanguare.g:3863:2: ( rule__Link__LocationAssignment_10_2 )
            // InternalPageGeneratorLanguare.g:3863:3: rule__Link__LocationAssignment_10_2
            {
            pushFollow(FOLLOW_2);
            rule__Link__LocationAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getLocationAssignment_10_2()); 

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
    // $ANTLR end "rule__Link__Group_10__2__Impl"


    // $ANTLR start "rule__Link__Group_10__3"
    // InternalPageGeneratorLanguare.g:3871:1: rule__Link__Group_10__3 : rule__Link__Group_10__3__Impl ;
    public final void rule__Link__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3875:1: ( rule__Link__Group_10__3__Impl )
            // InternalPageGeneratorLanguare.g:3876:2: rule__Link__Group_10__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group_10__3__Impl();

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
    // $ANTLR end "rule__Link__Group_10__3"


    // $ANTLR start "rule__Link__Group_10__3__Impl"
    // InternalPageGeneratorLanguare.g:3882:1: rule__Link__Group_10__3__Impl : ( ( ',' )? ) ;
    public final void rule__Link__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3886:1: ( ( ( ',' )? ) )
            // InternalPageGeneratorLanguare.g:3887:1: ( ( ',' )? )
            {
            // InternalPageGeneratorLanguare.g:3887:1: ( ( ',' )? )
            // InternalPageGeneratorLanguare.g:3888:2: ( ',' )?
            {
             before(grammarAccess.getLinkAccess().getCommaKeyword_10_3()); 
            // InternalPageGeneratorLanguare.g:3889:2: ( ',' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==12) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:3889:3: ','
                    {
                    match(input,12,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getLinkAccess().getCommaKeyword_10_3()); 

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
    // $ANTLR end "rule__Link__Group_10__3__Impl"


    // $ANTLR start "rule__Picture__Group__0"
    // InternalPageGeneratorLanguare.g:3898:1: rule__Picture__Group__0 : rule__Picture__Group__0__Impl rule__Picture__Group__1 ;
    public final void rule__Picture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3902:1: ( rule__Picture__Group__0__Impl rule__Picture__Group__1 )
            // InternalPageGeneratorLanguare.g:3903:2: rule__Picture__Group__0__Impl rule__Picture__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Picture__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Picture__Group__1();

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
    // $ANTLR end "rule__Picture__Group__0"


    // $ANTLR start "rule__Picture__Group__0__Impl"
    // InternalPageGeneratorLanguare.g:3910:1: rule__Picture__Group__0__Impl : ( 'Picture' ) ;
    public final void rule__Picture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3914:1: ( ( 'Picture' ) )
            // InternalPageGeneratorLanguare.g:3915:1: ( 'Picture' )
            {
            // InternalPageGeneratorLanguare.g:3915:1: ( 'Picture' )
            // InternalPageGeneratorLanguare.g:3916:2: 'Picture'
            {
             before(grammarAccess.getPictureAccess().getPictureKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getPictureAccess().getPictureKeyword_0()); 

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
    // $ANTLR end "rule__Picture__Group__0__Impl"


    // $ANTLR start "rule__Picture__Group__1"
    // InternalPageGeneratorLanguare.g:3925:1: rule__Picture__Group__1 : rule__Picture__Group__1__Impl rule__Picture__Group__2 ;
    public final void rule__Picture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3929:1: ( rule__Picture__Group__1__Impl rule__Picture__Group__2 )
            // InternalPageGeneratorLanguare.g:3930:2: rule__Picture__Group__1__Impl rule__Picture__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Picture__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Picture__Group__2();

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
    // $ANTLR end "rule__Picture__Group__1"


    // $ANTLR start "rule__Picture__Group__1__Impl"
    // InternalPageGeneratorLanguare.g:3937:1: rule__Picture__Group__1__Impl : ( ( rule__Picture__NameAssignment_1 ) ) ;
    public final void rule__Picture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3941:1: ( ( ( rule__Picture__NameAssignment_1 ) ) )
            // InternalPageGeneratorLanguare.g:3942:1: ( ( rule__Picture__NameAssignment_1 ) )
            {
            // InternalPageGeneratorLanguare.g:3942:1: ( ( rule__Picture__NameAssignment_1 ) )
            // InternalPageGeneratorLanguare.g:3943:2: ( rule__Picture__NameAssignment_1 )
            {
             before(grammarAccess.getPictureAccess().getNameAssignment_1()); 
            // InternalPageGeneratorLanguare.g:3944:2: ( rule__Picture__NameAssignment_1 )
            // InternalPageGeneratorLanguare.g:3944:3: rule__Picture__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Picture__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPictureAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Picture__Group__1__Impl"


    // $ANTLR start "rule__Picture__Group__2"
    // InternalPageGeneratorLanguare.g:3952:1: rule__Picture__Group__2 : rule__Picture__Group__2__Impl rule__Picture__Group__3 ;
    public final void rule__Picture__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3956:1: ( rule__Picture__Group__2__Impl rule__Picture__Group__3 )
            // InternalPageGeneratorLanguare.g:3957:2: rule__Picture__Group__2__Impl rule__Picture__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__Picture__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Picture__Group__3();

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
    // $ANTLR end "rule__Picture__Group__2"


    // $ANTLR start "rule__Picture__Group__2__Impl"
    // InternalPageGeneratorLanguare.g:3964:1: rule__Picture__Group__2__Impl : ( '<' ) ;
    public final void rule__Picture__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3968:1: ( ( '<' ) )
            // InternalPageGeneratorLanguare.g:3969:1: ( '<' )
            {
            // InternalPageGeneratorLanguare.g:3969:1: ( '<' )
            // InternalPageGeneratorLanguare.g:3970:2: '<'
            {
             before(grammarAccess.getPictureAccess().getLessThanSignKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPictureAccess().getLessThanSignKeyword_2()); 

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
    // $ANTLR end "rule__Picture__Group__2__Impl"


    // $ANTLR start "rule__Picture__Group__3"
    // InternalPageGeneratorLanguare.g:3979:1: rule__Picture__Group__3 : rule__Picture__Group__3__Impl rule__Picture__Group__4 ;
    public final void rule__Picture__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3983:1: ( rule__Picture__Group__3__Impl rule__Picture__Group__4 )
            // InternalPageGeneratorLanguare.g:3984:2: rule__Picture__Group__3__Impl rule__Picture__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__Picture__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Picture__Group__4();

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
    // $ANTLR end "rule__Picture__Group__3"


    // $ANTLR start "rule__Picture__Group__3__Impl"
    // InternalPageGeneratorLanguare.g:3991:1: rule__Picture__Group__3__Impl : ( ( rule__Picture__Group_3__0 )? ) ;
    public final void rule__Picture__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:3995:1: ( ( ( rule__Picture__Group_3__0 )? ) )
            // InternalPageGeneratorLanguare.g:3996:1: ( ( rule__Picture__Group_3__0 )? )
            {
            // InternalPageGeneratorLanguare.g:3996:1: ( ( rule__Picture__Group_3__0 )? )
            // InternalPageGeneratorLanguare.g:3997:2: ( rule__Picture__Group_3__0 )?
            {
             before(grammarAccess.getPictureAccess().getGroup_3()); 
            // InternalPageGeneratorLanguare.g:3998:2: ( rule__Picture__Group_3__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==36) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:3998:3: rule__Picture__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Picture__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPictureAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Picture__Group__3__Impl"


    // $ANTLR start "rule__Picture__Group__4"
    // InternalPageGeneratorLanguare.g:4006:1: rule__Picture__Group__4 : rule__Picture__Group__4__Impl rule__Picture__Group__5 ;
    public final void rule__Picture__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4010:1: ( rule__Picture__Group__4__Impl rule__Picture__Group__5 )
            // InternalPageGeneratorLanguare.g:4011:2: rule__Picture__Group__4__Impl rule__Picture__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__Picture__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Picture__Group__5();

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
    // $ANTLR end "rule__Picture__Group__4"


    // $ANTLR start "rule__Picture__Group__4__Impl"
    // InternalPageGeneratorLanguare.g:4018:1: rule__Picture__Group__4__Impl : ( ( rule__Picture__Group_4__0 )? ) ;
    public final void rule__Picture__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4022:1: ( ( ( rule__Picture__Group_4__0 )? ) )
            // InternalPageGeneratorLanguare.g:4023:1: ( ( rule__Picture__Group_4__0 )? )
            {
            // InternalPageGeneratorLanguare.g:4023:1: ( ( rule__Picture__Group_4__0 )? )
            // InternalPageGeneratorLanguare.g:4024:2: ( rule__Picture__Group_4__0 )?
            {
             before(grammarAccess.getPictureAccess().getGroup_4()); 
            // InternalPageGeneratorLanguare.g:4025:2: ( rule__Picture__Group_4__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==37) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:4025:3: rule__Picture__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Picture__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPictureAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Picture__Group__4__Impl"


    // $ANTLR start "rule__Picture__Group__5"
    // InternalPageGeneratorLanguare.g:4033:1: rule__Picture__Group__5 : rule__Picture__Group__5__Impl rule__Picture__Group__6 ;
    public final void rule__Picture__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4037:1: ( rule__Picture__Group__5__Impl rule__Picture__Group__6 )
            // InternalPageGeneratorLanguare.g:4038:2: rule__Picture__Group__5__Impl rule__Picture__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__Picture__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Picture__Group__6();

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
    // $ANTLR end "rule__Picture__Group__5"


    // $ANTLR start "rule__Picture__Group__5__Impl"
    // InternalPageGeneratorLanguare.g:4045:1: rule__Picture__Group__5__Impl : ( ( rule__Picture__Group_5__0 )? ) ;
    public final void rule__Picture__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4049:1: ( ( ( rule__Picture__Group_5__0 )? ) )
            // InternalPageGeneratorLanguare.g:4050:1: ( ( rule__Picture__Group_5__0 )? )
            {
            // InternalPageGeneratorLanguare.g:4050:1: ( ( rule__Picture__Group_5__0 )? )
            // InternalPageGeneratorLanguare.g:4051:2: ( rule__Picture__Group_5__0 )?
            {
             before(grammarAccess.getPictureAccess().getGroup_5()); 
            // InternalPageGeneratorLanguare.g:4052:2: ( rule__Picture__Group_5__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==27) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:4052:3: rule__Picture__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Picture__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPictureAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Picture__Group__5__Impl"


    // $ANTLR start "rule__Picture__Group__6"
    // InternalPageGeneratorLanguare.g:4060:1: rule__Picture__Group__6 : rule__Picture__Group__6__Impl rule__Picture__Group__7 ;
    public final void rule__Picture__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4064:1: ( rule__Picture__Group__6__Impl rule__Picture__Group__7 )
            // InternalPageGeneratorLanguare.g:4065:2: rule__Picture__Group__6__Impl rule__Picture__Group__7
            {
            pushFollow(FOLLOW_23);
            rule__Picture__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Picture__Group__7();

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
    // $ANTLR end "rule__Picture__Group__6"


    // $ANTLR start "rule__Picture__Group__6__Impl"
    // InternalPageGeneratorLanguare.g:4072:1: rule__Picture__Group__6__Impl : ( ( rule__Picture__Group_6__0 )? ) ;
    public final void rule__Picture__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4076:1: ( ( ( rule__Picture__Group_6__0 )? ) )
            // InternalPageGeneratorLanguare.g:4077:1: ( ( rule__Picture__Group_6__0 )? )
            {
            // InternalPageGeneratorLanguare.g:4077:1: ( ( rule__Picture__Group_6__0 )? )
            // InternalPageGeneratorLanguare.g:4078:2: ( rule__Picture__Group_6__0 )?
            {
             before(grammarAccess.getPictureAccess().getGroup_6()); 
            // InternalPageGeneratorLanguare.g:4079:2: ( rule__Picture__Group_6__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==28) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:4079:3: rule__Picture__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Picture__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPictureAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Picture__Group__6__Impl"


    // $ANTLR start "rule__Picture__Group__7"
    // InternalPageGeneratorLanguare.g:4087:1: rule__Picture__Group__7 : rule__Picture__Group__7__Impl rule__Picture__Group__8 ;
    public final void rule__Picture__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4091:1: ( rule__Picture__Group__7__Impl rule__Picture__Group__8 )
            // InternalPageGeneratorLanguare.g:4092:2: rule__Picture__Group__7__Impl rule__Picture__Group__8
            {
            pushFollow(FOLLOW_23);
            rule__Picture__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Picture__Group__8();

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
    // $ANTLR end "rule__Picture__Group__7"


    // $ANTLR start "rule__Picture__Group__7__Impl"
    // InternalPageGeneratorLanguare.g:4099:1: rule__Picture__Group__7__Impl : ( ( rule__Picture__Group_7__0 )? ) ;
    public final void rule__Picture__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4103:1: ( ( ( rule__Picture__Group_7__0 )? ) )
            // InternalPageGeneratorLanguare.g:4104:1: ( ( rule__Picture__Group_7__0 )? )
            {
            // InternalPageGeneratorLanguare.g:4104:1: ( ( rule__Picture__Group_7__0 )? )
            // InternalPageGeneratorLanguare.g:4105:2: ( rule__Picture__Group_7__0 )?
            {
             before(grammarAccess.getPictureAccess().getGroup_7()); 
            // InternalPageGeneratorLanguare.g:4106:2: ( rule__Picture__Group_7__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==29) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:4106:3: rule__Picture__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Picture__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPictureAccess().getGroup_7()); 

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
    // $ANTLR end "rule__Picture__Group__7__Impl"


    // $ANTLR start "rule__Picture__Group__8"
    // InternalPageGeneratorLanguare.g:4114:1: rule__Picture__Group__8 : rule__Picture__Group__8__Impl rule__Picture__Group__9 ;
    public final void rule__Picture__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4118:1: ( rule__Picture__Group__8__Impl rule__Picture__Group__9 )
            // InternalPageGeneratorLanguare.g:4119:2: rule__Picture__Group__8__Impl rule__Picture__Group__9
            {
            pushFollow(FOLLOW_23);
            rule__Picture__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Picture__Group__9();

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
    // $ANTLR end "rule__Picture__Group__8"


    // $ANTLR start "rule__Picture__Group__8__Impl"
    // InternalPageGeneratorLanguare.g:4126:1: rule__Picture__Group__8__Impl : ( ( rule__Picture__Group_8__0 )? ) ;
    public final void rule__Picture__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4130:1: ( ( ( rule__Picture__Group_8__0 )? ) )
            // InternalPageGeneratorLanguare.g:4131:1: ( ( rule__Picture__Group_8__0 )? )
            {
            // InternalPageGeneratorLanguare.g:4131:1: ( ( rule__Picture__Group_8__0 )? )
            // InternalPageGeneratorLanguare.g:4132:2: ( rule__Picture__Group_8__0 )?
            {
             before(grammarAccess.getPictureAccess().getGroup_8()); 
            // InternalPageGeneratorLanguare.g:4133:2: ( rule__Picture__Group_8__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==30) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:4133:3: rule__Picture__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Picture__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPictureAccess().getGroup_8()); 

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
    // $ANTLR end "rule__Picture__Group__8__Impl"


    // $ANTLR start "rule__Picture__Group__9"
    // InternalPageGeneratorLanguare.g:4141:1: rule__Picture__Group__9 : rule__Picture__Group__9__Impl rule__Picture__Group__10 ;
    public final void rule__Picture__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4145:1: ( rule__Picture__Group__9__Impl rule__Picture__Group__10 )
            // InternalPageGeneratorLanguare.g:4146:2: rule__Picture__Group__9__Impl rule__Picture__Group__10
            {
            pushFollow(FOLLOW_23);
            rule__Picture__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Picture__Group__10();

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
    // $ANTLR end "rule__Picture__Group__9"


    // $ANTLR start "rule__Picture__Group__9__Impl"
    // InternalPageGeneratorLanguare.g:4153:1: rule__Picture__Group__9__Impl : ( ( rule__Picture__Group_9__0 )? ) ;
    public final void rule__Picture__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4157:1: ( ( ( rule__Picture__Group_9__0 )? ) )
            // InternalPageGeneratorLanguare.g:4158:1: ( ( rule__Picture__Group_9__0 )? )
            {
            // InternalPageGeneratorLanguare.g:4158:1: ( ( rule__Picture__Group_9__0 )? )
            // InternalPageGeneratorLanguare.g:4159:2: ( rule__Picture__Group_9__0 )?
            {
             before(grammarAccess.getPictureAccess().getGroup_9()); 
            // InternalPageGeneratorLanguare.g:4160:2: ( rule__Picture__Group_9__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==31) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:4160:3: rule__Picture__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Picture__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPictureAccess().getGroup_9()); 

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
    // $ANTLR end "rule__Picture__Group__9__Impl"


    // $ANTLR start "rule__Picture__Group__10"
    // InternalPageGeneratorLanguare.g:4168:1: rule__Picture__Group__10 : rule__Picture__Group__10__Impl rule__Picture__Group__11 ;
    public final void rule__Picture__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4172:1: ( rule__Picture__Group__10__Impl rule__Picture__Group__11 )
            // InternalPageGeneratorLanguare.g:4173:2: rule__Picture__Group__10__Impl rule__Picture__Group__11
            {
            pushFollow(FOLLOW_8);
            rule__Picture__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Picture__Group__11();

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
    // $ANTLR end "rule__Picture__Group__10"


    // $ANTLR start "rule__Picture__Group__10__Impl"
    // InternalPageGeneratorLanguare.g:4180:1: rule__Picture__Group__10__Impl : ( '>' ) ;
    public final void rule__Picture__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4184:1: ( ( '>' ) )
            // InternalPageGeneratorLanguare.g:4185:1: ( '>' )
            {
            // InternalPageGeneratorLanguare.g:4185:1: ( '>' )
            // InternalPageGeneratorLanguare.g:4186:2: '>'
            {
             before(grammarAccess.getPictureAccess().getGreaterThanSignKeyword_10()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPictureAccess().getGreaterThanSignKeyword_10()); 

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
    // $ANTLR end "rule__Picture__Group__10__Impl"


    // $ANTLR start "rule__Picture__Group__11"
    // InternalPageGeneratorLanguare.g:4195:1: rule__Picture__Group__11 : rule__Picture__Group__11__Impl rule__Picture__Group__12 ;
    public final void rule__Picture__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4199:1: ( rule__Picture__Group__11__Impl rule__Picture__Group__12 )
            // InternalPageGeneratorLanguare.g:4200:2: rule__Picture__Group__11__Impl rule__Picture__Group__12
            {
            pushFollow(FOLLOW_9);
            rule__Picture__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Picture__Group__12();

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
    // $ANTLR end "rule__Picture__Group__11"


    // $ANTLR start "rule__Picture__Group__11__Impl"
    // InternalPageGeneratorLanguare.g:4207:1: rule__Picture__Group__11__Impl : ( '=' ) ;
    public final void rule__Picture__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4211:1: ( ( '=' ) )
            // InternalPageGeneratorLanguare.g:4212:1: ( '=' )
            {
            // InternalPageGeneratorLanguare.g:4212:1: ( '=' )
            // InternalPageGeneratorLanguare.g:4213:2: '='
            {
             before(grammarAccess.getPictureAccess().getEqualsSignKeyword_11()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPictureAccess().getEqualsSignKeyword_11()); 

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
    // $ANTLR end "rule__Picture__Group__11__Impl"


    // $ANTLR start "rule__Picture__Group__12"
    // InternalPageGeneratorLanguare.g:4222:1: rule__Picture__Group__12 : rule__Picture__Group__12__Impl rule__Picture__Group__13 ;
    public final void rule__Picture__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4226:1: ( rule__Picture__Group__12__Impl rule__Picture__Group__13 )
            // InternalPageGeneratorLanguare.g:4227:2: rule__Picture__Group__12__Impl rule__Picture__Group__13
            {
            pushFollow(FOLLOW_24);
            rule__Picture__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Picture__Group__13();

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
    // $ANTLR end "rule__Picture__Group__12"


    // $ANTLR start "rule__Picture__Group__12__Impl"
    // InternalPageGeneratorLanguare.g:4234:1: rule__Picture__Group__12__Impl : ( ( rule__Picture__PicUrlAssignment_12 ) ) ;
    public final void rule__Picture__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4238:1: ( ( ( rule__Picture__PicUrlAssignment_12 ) ) )
            // InternalPageGeneratorLanguare.g:4239:1: ( ( rule__Picture__PicUrlAssignment_12 ) )
            {
            // InternalPageGeneratorLanguare.g:4239:1: ( ( rule__Picture__PicUrlAssignment_12 ) )
            // InternalPageGeneratorLanguare.g:4240:2: ( rule__Picture__PicUrlAssignment_12 )
            {
             before(grammarAccess.getPictureAccess().getPicUrlAssignment_12()); 
            // InternalPageGeneratorLanguare.g:4241:2: ( rule__Picture__PicUrlAssignment_12 )
            // InternalPageGeneratorLanguare.g:4241:3: rule__Picture__PicUrlAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Picture__PicUrlAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getPictureAccess().getPicUrlAssignment_12()); 

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
    // $ANTLR end "rule__Picture__Group__12__Impl"


    // $ANTLR start "rule__Picture__Group__13"
    // InternalPageGeneratorLanguare.g:4249:1: rule__Picture__Group__13 : rule__Picture__Group__13__Impl rule__Picture__Group__14 ;
    public final void rule__Picture__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4253:1: ( rule__Picture__Group__13__Impl rule__Picture__Group__14 )
            // InternalPageGeneratorLanguare.g:4254:2: rule__Picture__Group__13__Impl rule__Picture__Group__14
            {
            pushFollow(FOLLOW_24);
            rule__Picture__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Picture__Group__14();

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
    // $ANTLR end "rule__Picture__Group__13"


    // $ANTLR start "rule__Picture__Group__13__Impl"
    // InternalPageGeneratorLanguare.g:4261:1: rule__Picture__Group__13__Impl : ( ( ',' )? ) ;
    public final void rule__Picture__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4265:1: ( ( ( ',' )? ) )
            // InternalPageGeneratorLanguare.g:4266:1: ( ( ',' )? )
            {
            // InternalPageGeneratorLanguare.g:4266:1: ( ( ',' )? )
            // InternalPageGeneratorLanguare.g:4267:2: ( ',' )?
            {
             before(grammarAccess.getPictureAccess().getCommaKeyword_13()); 
            // InternalPageGeneratorLanguare.g:4268:2: ( ',' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==12) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:4268:3: ','
                    {
                    match(input,12,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getPictureAccess().getCommaKeyword_13()); 

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
    // $ANTLR end "rule__Picture__Group__13__Impl"


    // $ANTLR start "rule__Picture__Group__14"
    // InternalPageGeneratorLanguare.g:4276:1: rule__Picture__Group__14 : rule__Picture__Group__14__Impl ;
    public final void rule__Picture__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4280:1: ( rule__Picture__Group__14__Impl )
            // InternalPageGeneratorLanguare.g:4281:2: rule__Picture__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Picture__Group__14__Impl();

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
    // $ANTLR end "rule__Picture__Group__14"


    // $ANTLR start "rule__Picture__Group__14__Impl"
    // InternalPageGeneratorLanguare.g:4287:1: rule__Picture__Group__14__Impl : ( ';' ) ;
    public final void rule__Picture__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4291:1: ( ( ';' ) )
            // InternalPageGeneratorLanguare.g:4292:1: ( ';' )
            {
            // InternalPageGeneratorLanguare.g:4292:1: ( ';' )
            // InternalPageGeneratorLanguare.g:4293:2: ';'
            {
             before(grammarAccess.getPictureAccess().getSemicolonKeyword_14()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPictureAccess().getSemicolonKeyword_14()); 

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
    // $ANTLR end "rule__Picture__Group__14__Impl"


    // $ANTLR start "rule__Picture__Group_3__0"
    // InternalPageGeneratorLanguare.g:4303:1: rule__Picture__Group_3__0 : rule__Picture__Group_3__0__Impl rule__Picture__Group_3__1 ;
    public final void rule__Picture__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4307:1: ( rule__Picture__Group_3__0__Impl rule__Picture__Group_3__1 )
            // InternalPageGeneratorLanguare.g:4308:2: rule__Picture__Group_3__0__Impl rule__Picture__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__Picture__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Picture__Group_3__1();

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
    // $ANTLR end "rule__Picture__Group_3__0"


    // $ANTLR start "rule__Picture__Group_3__0__Impl"
    // InternalPageGeneratorLanguare.g:4315:1: rule__Picture__Group_3__0__Impl : ( 'size' ) ;
    public final void rule__Picture__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4319:1: ( ( 'size' ) )
            // InternalPageGeneratorLanguare.g:4320:1: ( 'size' )
            {
            // InternalPageGeneratorLanguare.g:4320:1: ( 'size' )
            // InternalPageGeneratorLanguare.g:4321:2: 'size'
            {
             before(grammarAccess.getPictureAccess().getSizeKeyword_3_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getPictureAccess().getSizeKeyword_3_0()); 

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
    // $ANTLR end "rule__Picture__Group_3__0__Impl"


    // $ANTLR start "rule__Picture__Group_3__1"
    // InternalPageGeneratorLanguare.g:4330:1: rule__Picture__Group_3__1 : rule__Picture__Group_3__1__Impl rule__Picture__Group_3__2 ;
    public final void rule__Picture__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4334:1: ( rule__Picture__Group_3__1__Impl rule__Picture__Group_3__2 )
            // InternalPageGeneratorLanguare.g:4335:2: rule__Picture__Group_3__1__Impl rule__Picture__Group_3__2
            {
            pushFollow(FOLLOW_25);
            rule__Picture__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Picture__Group_3__2();

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
    // $ANTLR end "rule__Picture__Group_3__1"


    // $ANTLR start "rule__Picture__Group_3__1__Impl"
    // InternalPageGeneratorLanguare.g:4342:1: rule__Picture__Group_3__1__Impl : ( '=' ) ;
    public final void rule__Picture__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4346:1: ( ( '=' ) )
            // InternalPageGeneratorLanguare.g:4347:1: ( '=' )
            {
            // InternalPageGeneratorLanguare.g:4347:1: ( '=' )
            // InternalPageGeneratorLanguare.g:4348:2: '='
            {
             before(grammarAccess.getPictureAccess().getEqualsSignKeyword_3_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPictureAccess().getEqualsSignKeyword_3_1()); 

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
    // $ANTLR end "rule__Picture__Group_3__1__Impl"


    // $ANTLR start "rule__Picture__Group_3__2"
    // InternalPageGeneratorLanguare.g:4357:1: rule__Picture__Group_3__2 : rule__Picture__Group_3__2__Impl rule__Picture__Group_3__3 ;
    public final void rule__Picture__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4361:1: ( rule__Picture__Group_3__2__Impl rule__Picture__Group_3__3 )
            // InternalPageGeneratorLanguare.g:4362:2: rule__Picture__Group_3__2__Impl rule__Picture__Group_3__3
            {
            pushFollow(FOLLOW_11);
            rule__Picture__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Picture__Group_3__3();

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
    // $ANTLR end "rule__Picture__Group_3__2"


    // $ANTLR start "rule__Picture__Group_3__2__Impl"
    // InternalPageGeneratorLanguare.g:4369:1: rule__Picture__Group_3__2__Impl : ( ( rule__Picture__SizeAssignment_3_2 ) ) ;
    public final void rule__Picture__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4373:1: ( ( ( rule__Picture__SizeAssignment_3_2 ) ) )
            // InternalPageGeneratorLanguare.g:4374:1: ( ( rule__Picture__SizeAssignment_3_2 ) )
            {
            // InternalPageGeneratorLanguare.g:4374:1: ( ( rule__Picture__SizeAssignment_3_2 ) )
            // InternalPageGeneratorLanguare.g:4375:2: ( rule__Picture__SizeAssignment_3_2 )
            {
             before(grammarAccess.getPictureAccess().getSizeAssignment_3_2()); 
            // InternalPageGeneratorLanguare.g:4376:2: ( rule__Picture__SizeAssignment_3_2 )
            // InternalPageGeneratorLanguare.g:4376:3: rule__Picture__SizeAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Picture__SizeAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getPictureAccess().getSizeAssignment_3_2()); 

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
    // $ANTLR end "rule__Picture__Group_3__2__Impl"


    // $ANTLR start "rule__Picture__Group_3__3"
    // InternalPageGeneratorLanguare.g:4384:1: rule__Picture__Group_3__3 : rule__Picture__Group_3__3__Impl ;
    public final void rule__Picture__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4388:1: ( rule__Picture__Group_3__3__Impl )
            // InternalPageGeneratorLanguare.g:4389:2: rule__Picture__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Picture__Group_3__3__Impl();

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
    // $ANTLR end "rule__Picture__Group_3__3"


    // $ANTLR start "rule__Picture__Group_3__3__Impl"
    // InternalPageGeneratorLanguare.g:4395:1: rule__Picture__Group_3__3__Impl : ( ( ',' )? ) ;
    public final void rule__Picture__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4399:1: ( ( ( ',' )? ) )
            // InternalPageGeneratorLanguare.g:4400:1: ( ( ',' )? )
            {
            // InternalPageGeneratorLanguare.g:4400:1: ( ( ',' )? )
            // InternalPageGeneratorLanguare.g:4401:2: ( ',' )?
            {
             before(grammarAccess.getPictureAccess().getCommaKeyword_3_3()); 
            // InternalPageGeneratorLanguare.g:4402:2: ( ',' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==12) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:4402:3: ','
                    {
                    match(input,12,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getPictureAccess().getCommaKeyword_3_3()); 

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
    // $ANTLR end "rule__Picture__Group_3__3__Impl"


    // $ANTLR start "rule__Picture__Group_4__0"
    // InternalPageGeneratorLanguare.g:4411:1: rule__Picture__Group_4__0 : rule__Picture__Group_4__0__Impl rule__Picture__Group_4__1 ;
    public final void rule__Picture__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4415:1: ( rule__Picture__Group_4__0__Impl rule__Picture__Group_4__1 )
            // InternalPageGeneratorLanguare.g:4416:2: rule__Picture__Group_4__0__Impl rule__Picture__Group_4__1
            {
            pushFollow(FOLLOW_8);
            rule__Picture__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Picture__Group_4__1();

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
    // $ANTLR end "rule__Picture__Group_4__0"


    // $ANTLR start "rule__Picture__Group_4__0__Impl"
    // InternalPageGeneratorLanguare.g:4423:1: rule__Picture__Group_4__0__Impl : ( 'alternative-text' ) ;
    public final void rule__Picture__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4427:1: ( ( 'alternative-text' ) )
            // InternalPageGeneratorLanguare.g:4428:1: ( 'alternative-text' )
            {
            // InternalPageGeneratorLanguare.g:4428:1: ( 'alternative-text' )
            // InternalPageGeneratorLanguare.g:4429:2: 'alternative-text'
            {
             before(grammarAccess.getPictureAccess().getAlternativeTextKeyword_4_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getPictureAccess().getAlternativeTextKeyword_4_0()); 

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
    // $ANTLR end "rule__Picture__Group_4__0__Impl"


    // $ANTLR start "rule__Picture__Group_4__1"
    // InternalPageGeneratorLanguare.g:4438:1: rule__Picture__Group_4__1 : rule__Picture__Group_4__1__Impl rule__Picture__Group_4__2 ;
    public final void rule__Picture__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4442:1: ( rule__Picture__Group_4__1__Impl rule__Picture__Group_4__2 )
            // InternalPageGeneratorLanguare.g:4443:2: rule__Picture__Group_4__1__Impl rule__Picture__Group_4__2
            {
            pushFollow(FOLLOW_9);
            rule__Picture__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Picture__Group_4__2();

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
    // $ANTLR end "rule__Picture__Group_4__1"


    // $ANTLR start "rule__Picture__Group_4__1__Impl"
    // InternalPageGeneratorLanguare.g:4450:1: rule__Picture__Group_4__1__Impl : ( '=' ) ;
    public final void rule__Picture__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4454:1: ( ( '=' ) )
            // InternalPageGeneratorLanguare.g:4455:1: ( '=' )
            {
            // InternalPageGeneratorLanguare.g:4455:1: ( '=' )
            // InternalPageGeneratorLanguare.g:4456:2: '='
            {
             before(grammarAccess.getPictureAccess().getEqualsSignKeyword_4_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPictureAccess().getEqualsSignKeyword_4_1()); 

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
    // $ANTLR end "rule__Picture__Group_4__1__Impl"


    // $ANTLR start "rule__Picture__Group_4__2"
    // InternalPageGeneratorLanguare.g:4465:1: rule__Picture__Group_4__2 : rule__Picture__Group_4__2__Impl rule__Picture__Group_4__3 ;
    public final void rule__Picture__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4469:1: ( rule__Picture__Group_4__2__Impl rule__Picture__Group_4__3 )
            // InternalPageGeneratorLanguare.g:4470:2: rule__Picture__Group_4__2__Impl rule__Picture__Group_4__3
            {
            pushFollow(FOLLOW_11);
            rule__Picture__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Picture__Group_4__3();

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
    // $ANTLR end "rule__Picture__Group_4__2"


    // $ANTLR start "rule__Picture__Group_4__2__Impl"
    // InternalPageGeneratorLanguare.g:4477:1: rule__Picture__Group_4__2__Impl : ( ( rule__Picture__AltAssignment_4_2 ) ) ;
    public final void rule__Picture__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4481:1: ( ( ( rule__Picture__AltAssignment_4_2 ) ) )
            // InternalPageGeneratorLanguare.g:4482:1: ( ( rule__Picture__AltAssignment_4_2 ) )
            {
            // InternalPageGeneratorLanguare.g:4482:1: ( ( rule__Picture__AltAssignment_4_2 ) )
            // InternalPageGeneratorLanguare.g:4483:2: ( rule__Picture__AltAssignment_4_2 )
            {
             before(grammarAccess.getPictureAccess().getAltAssignment_4_2()); 
            // InternalPageGeneratorLanguare.g:4484:2: ( rule__Picture__AltAssignment_4_2 )
            // InternalPageGeneratorLanguare.g:4484:3: rule__Picture__AltAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Picture__AltAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getPictureAccess().getAltAssignment_4_2()); 

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
    // $ANTLR end "rule__Picture__Group_4__2__Impl"


    // $ANTLR start "rule__Picture__Group_4__3"
    // InternalPageGeneratorLanguare.g:4492:1: rule__Picture__Group_4__3 : rule__Picture__Group_4__3__Impl ;
    public final void rule__Picture__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4496:1: ( rule__Picture__Group_4__3__Impl )
            // InternalPageGeneratorLanguare.g:4497:2: rule__Picture__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Picture__Group_4__3__Impl();

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
    // $ANTLR end "rule__Picture__Group_4__3"


    // $ANTLR start "rule__Picture__Group_4__3__Impl"
    // InternalPageGeneratorLanguare.g:4503:1: rule__Picture__Group_4__3__Impl : ( ( ',' )? ) ;
    public final void rule__Picture__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4507:1: ( ( ( ',' )? ) )
            // InternalPageGeneratorLanguare.g:4508:1: ( ( ',' )? )
            {
            // InternalPageGeneratorLanguare.g:4508:1: ( ( ',' )? )
            // InternalPageGeneratorLanguare.g:4509:2: ( ',' )?
            {
             before(grammarAccess.getPictureAccess().getCommaKeyword_4_3()); 
            // InternalPageGeneratorLanguare.g:4510:2: ( ',' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==12) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:4510:3: ','
                    {
                    match(input,12,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getPictureAccess().getCommaKeyword_4_3()); 

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
    // $ANTLR end "rule__Picture__Group_4__3__Impl"


    // $ANTLR start "rule__Picture__Group_5__0"
    // InternalPageGeneratorLanguare.g:4519:1: rule__Picture__Group_5__0 : rule__Picture__Group_5__0__Impl rule__Picture__Group_5__1 ;
    public final void rule__Picture__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4523:1: ( rule__Picture__Group_5__0__Impl rule__Picture__Group_5__1 )
            // InternalPageGeneratorLanguare.g:4524:2: rule__Picture__Group_5__0__Impl rule__Picture__Group_5__1
            {
            pushFollow(FOLLOW_8);
            rule__Picture__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Picture__Group_5__1();

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
    // $ANTLR end "rule__Picture__Group_5__0"


    // $ANTLR start "rule__Picture__Group_5__0__Impl"
    // InternalPageGeneratorLanguare.g:4531:1: rule__Picture__Group_5__0__Impl : ( 'Location' ) ;
    public final void rule__Picture__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4535:1: ( ( 'Location' ) )
            // InternalPageGeneratorLanguare.g:4536:1: ( 'Location' )
            {
            // InternalPageGeneratorLanguare.g:4536:1: ( 'Location' )
            // InternalPageGeneratorLanguare.g:4537:2: 'Location'
            {
             before(grammarAccess.getPictureAccess().getLocationKeyword_5_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPictureAccess().getLocationKeyword_5_0()); 

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
    // $ANTLR end "rule__Picture__Group_5__0__Impl"


    // $ANTLR start "rule__Picture__Group_5__1"
    // InternalPageGeneratorLanguare.g:4546:1: rule__Picture__Group_5__1 : rule__Picture__Group_5__1__Impl rule__Picture__Group_5__2 ;
    public final void rule__Picture__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4550:1: ( rule__Picture__Group_5__1__Impl rule__Picture__Group_5__2 )
            // InternalPageGeneratorLanguare.g:4551:2: rule__Picture__Group_5__1__Impl rule__Picture__Group_5__2
            {
            pushFollow(FOLLOW_9);
            rule__Picture__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Picture__Group_5__2();

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
    // $ANTLR end "rule__Picture__Group_5__1"


    // $ANTLR start "rule__Picture__Group_5__1__Impl"
    // InternalPageGeneratorLanguare.g:4558:1: rule__Picture__Group_5__1__Impl : ( '=' ) ;
    public final void rule__Picture__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4562:1: ( ( '=' ) )
            // InternalPageGeneratorLanguare.g:4563:1: ( '=' )
            {
            // InternalPageGeneratorLanguare.g:4563:1: ( '=' )
            // InternalPageGeneratorLanguare.g:4564:2: '='
            {
             before(grammarAccess.getPictureAccess().getEqualsSignKeyword_5_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPictureAccess().getEqualsSignKeyword_5_1()); 

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
    // $ANTLR end "rule__Picture__Group_5__1__Impl"


    // $ANTLR start "rule__Picture__Group_5__2"
    // InternalPageGeneratorLanguare.g:4573:1: rule__Picture__Group_5__2 : rule__Picture__Group_5__2__Impl rule__Picture__Group_5__3 ;
    public final void rule__Picture__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4577:1: ( rule__Picture__Group_5__2__Impl rule__Picture__Group_5__3 )
            // InternalPageGeneratorLanguare.g:4578:2: rule__Picture__Group_5__2__Impl rule__Picture__Group_5__3
            {
            pushFollow(FOLLOW_11);
            rule__Picture__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Picture__Group_5__3();

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
    // $ANTLR end "rule__Picture__Group_5__2"


    // $ANTLR start "rule__Picture__Group_5__2__Impl"
    // InternalPageGeneratorLanguare.g:4585:1: rule__Picture__Group_5__2__Impl : ( ( rule__Picture__LocationAssignment_5_2 ) ) ;
    public final void rule__Picture__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4589:1: ( ( ( rule__Picture__LocationAssignment_5_2 ) ) )
            // InternalPageGeneratorLanguare.g:4590:1: ( ( rule__Picture__LocationAssignment_5_2 ) )
            {
            // InternalPageGeneratorLanguare.g:4590:1: ( ( rule__Picture__LocationAssignment_5_2 ) )
            // InternalPageGeneratorLanguare.g:4591:2: ( rule__Picture__LocationAssignment_5_2 )
            {
             before(grammarAccess.getPictureAccess().getLocationAssignment_5_2()); 
            // InternalPageGeneratorLanguare.g:4592:2: ( rule__Picture__LocationAssignment_5_2 )
            // InternalPageGeneratorLanguare.g:4592:3: rule__Picture__LocationAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Picture__LocationAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getPictureAccess().getLocationAssignment_5_2()); 

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
    // $ANTLR end "rule__Picture__Group_5__2__Impl"


    // $ANTLR start "rule__Picture__Group_5__3"
    // InternalPageGeneratorLanguare.g:4600:1: rule__Picture__Group_5__3 : rule__Picture__Group_5__3__Impl ;
    public final void rule__Picture__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4604:1: ( rule__Picture__Group_5__3__Impl )
            // InternalPageGeneratorLanguare.g:4605:2: rule__Picture__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Picture__Group_5__3__Impl();

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
    // $ANTLR end "rule__Picture__Group_5__3"


    // $ANTLR start "rule__Picture__Group_5__3__Impl"
    // InternalPageGeneratorLanguare.g:4611:1: rule__Picture__Group_5__3__Impl : ( ( ',' )? ) ;
    public final void rule__Picture__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4615:1: ( ( ( ',' )? ) )
            // InternalPageGeneratorLanguare.g:4616:1: ( ( ',' )? )
            {
            // InternalPageGeneratorLanguare.g:4616:1: ( ( ',' )? )
            // InternalPageGeneratorLanguare.g:4617:2: ( ',' )?
            {
             before(grammarAccess.getPictureAccess().getCommaKeyword_5_3()); 
            // InternalPageGeneratorLanguare.g:4618:2: ( ',' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==12) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:4618:3: ','
                    {
                    match(input,12,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getPictureAccess().getCommaKeyword_5_3()); 

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
    // $ANTLR end "rule__Picture__Group_5__3__Impl"


    // $ANTLR start "rule__Picture__Group_6__0"
    // InternalPageGeneratorLanguare.g:4627:1: rule__Picture__Group_6__0 : rule__Picture__Group_6__0__Impl rule__Picture__Group_6__1 ;
    public final void rule__Picture__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4631:1: ( rule__Picture__Group_6__0__Impl rule__Picture__Group_6__1 )
            // InternalPageGeneratorLanguare.g:4632:2: rule__Picture__Group_6__0__Impl rule__Picture__Group_6__1
            {
            pushFollow(FOLLOW_8);
            rule__Picture__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Picture__Group_6__1();

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
    // $ANTLR end "rule__Picture__Group_6__0"


    // $ANTLR start "rule__Picture__Group_6__0__Impl"
    // InternalPageGeneratorLanguare.g:4639:1: rule__Picture__Group_6__0__Impl : ( 'Padding-left' ) ;
    public final void rule__Picture__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4643:1: ( ( 'Padding-left' ) )
            // InternalPageGeneratorLanguare.g:4644:1: ( 'Padding-left' )
            {
            // InternalPageGeneratorLanguare.g:4644:1: ( 'Padding-left' )
            // InternalPageGeneratorLanguare.g:4645:2: 'Padding-left'
            {
             before(grammarAccess.getPictureAccess().getPaddingLeftKeyword_6_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPictureAccess().getPaddingLeftKeyword_6_0()); 

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
    // $ANTLR end "rule__Picture__Group_6__0__Impl"


    // $ANTLR start "rule__Picture__Group_6__1"
    // InternalPageGeneratorLanguare.g:4654:1: rule__Picture__Group_6__1 : rule__Picture__Group_6__1__Impl rule__Picture__Group_6__2 ;
    public final void rule__Picture__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4658:1: ( rule__Picture__Group_6__1__Impl rule__Picture__Group_6__2 )
            // InternalPageGeneratorLanguare.g:4659:2: rule__Picture__Group_6__1__Impl rule__Picture__Group_6__2
            {
            pushFollow(FOLLOW_19);
            rule__Picture__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Picture__Group_6__2();

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
    // $ANTLR end "rule__Picture__Group_6__1"


    // $ANTLR start "rule__Picture__Group_6__1__Impl"
    // InternalPageGeneratorLanguare.g:4666:1: rule__Picture__Group_6__1__Impl : ( '=' ) ;
    public final void rule__Picture__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4670:1: ( ( '=' ) )
            // InternalPageGeneratorLanguare.g:4671:1: ( '=' )
            {
            // InternalPageGeneratorLanguare.g:4671:1: ( '=' )
            // InternalPageGeneratorLanguare.g:4672:2: '='
            {
             before(grammarAccess.getPictureAccess().getEqualsSignKeyword_6_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPictureAccess().getEqualsSignKeyword_6_1()); 

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
    // $ANTLR end "rule__Picture__Group_6__1__Impl"


    // $ANTLR start "rule__Picture__Group_6__2"
    // InternalPageGeneratorLanguare.g:4681:1: rule__Picture__Group_6__2 : rule__Picture__Group_6__2__Impl rule__Picture__Group_6__3 ;
    public final void rule__Picture__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4685:1: ( rule__Picture__Group_6__2__Impl rule__Picture__Group_6__3 )
            // InternalPageGeneratorLanguare.g:4686:2: rule__Picture__Group_6__2__Impl rule__Picture__Group_6__3
            {
            pushFollow(FOLLOW_11);
            rule__Picture__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Picture__Group_6__3();

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
    // $ANTLR end "rule__Picture__Group_6__2"


    // $ANTLR start "rule__Picture__Group_6__2__Impl"
    // InternalPageGeneratorLanguare.g:4693:1: rule__Picture__Group_6__2__Impl : ( ( rule__Picture__LpaddingAssignment_6_2 ) ) ;
    public final void rule__Picture__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4697:1: ( ( ( rule__Picture__LpaddingAssignment_6_2 ) ) )
            // InternalPageGeneratorLanguare.g:4698:1: ( ( rule__Picture__LpaddingAssignment_6_2 ) )
            {
            // InternalPageGeneratorLanguare.g:4698:1: ( ( rule__Picture__LpaddingAssignment_6_2 ) )
            // InternalPageGeneratorLanguare.g:4699:2: ( rule__Picture__LpaddingAssignment_6_2 )
            {
             before(grammarAccess.getPictureAccess().getLpaddingAssignment_6_2()); 
            // InternalPageGeneratorLanguare.g:4700:2: ( rule__Picture__LpaddingAssignment_6_2 )
            // InternalPageGeneratorLanguare.g:4700:3: rule__Picture__LpaddingAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Picture__LpaddingAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getPictureAccess().getLpaddingAssignment_6_2()); 

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
    // $ANTLR end "rule__Picture__Group_6__2__Impl"


    // $ANTLR start "rule__Picture__Group_6__3"
    // InternalPageGeneratorLanguare.g:4708:1: rule__Picture__Group_6__3 : rule__Picture__Group_6__3__Impl ;
    public final void rule__Picture__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4712:1: ( rule__Picture__Group_6__3__Impl )
            // InternalPageGeneratorLanguare.g:4713:2: rule__Picture__Group_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Picture__Group_6__3__Impl();

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
    // $ANTLR end "rule__Picture__Group_6__3"


    // $ANTLR start "rule__Picture__Group_6__3__Impl"
    // InternalPageGeneratorLanguare.g:4719:1: rule__Picture__Group_6__3__Impl : ( ( ',' )? ) ;
    public final void rule__Picture__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4723:1: ( ( ( ',' )? ) )
            // InternalPageGeneratorLanguare.g:4724:1: ( ( ',' )? )
            {
            // InternalPageGeneratorLanguare.g:4724:1: ( ( ',' )? )
            // InternalPageGeneratorLanguare.g:4725:2: ( ',' )?
            {
             before(grammarAccess.getPictureAccess().getCommaKeyword_6_3()); 
            // InternalPageGeneratorLanguare.g:4726:2: ( ',' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==12) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:4726:3: ','
                    {
                    match(input,12,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getPictureAccess().getCommaKeyword_6_3()); 

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
    // $ANTLR end "rule__Picture__Group_6__3__Impl"


    // $ANTLR start "rule__Picture__Group_7__0"
    // InternalPageGeneratorLanguare.g:4735:1: rule__Picture__Group_7__0 : rule__Picture__Group_7__0__Impl rule__Picture__Group_7__1 ;
    public final void rule__Picture__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4739:1: ( rule__Picture__Group_7__0__Impl rule__Picture__Group_7__1 )
            // InternalPageGeneratorLanguare.g:4740:2: rule__Picture__Group_7__0__Impl rule__Picture__Group_7__1
            {
            pushFollow(FOLLOW_8);
            rule__Picture__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Picture__Group_7__1();

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
    // $ANTLR end "rule__Picture__Group_7__0"


    // $ANTLR start "rule__Picture__Group_7__0__Impl"
    // InternalPageGeneratorLanguare.g:4747:1: rule__Picture__Group_7__0__Impl : ( 'Padding-right' ) ;
    public final void rule__Picture__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4751:1: ( ( 'Padding-right' ) )
            // InternalPageGeneratorLanguare.g:4752:1: ( 'Padding-right' )
            {
            // InternalPageGeneratorLanguare.g:4752:1: ( 'Padding-right' )
            // InternalPageGeneratorLanguare.g:4753:2: 'Padding-right'
            {
             before(grammarAccess.getPictureAccess().getPaddingRightKeyword_7_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getPictureAccess().getPaddingRightKeyword_7_0()); 

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
    // $ANTLR end "rule__Picture__Group_7__0__Impl"


    // $ANTLR start "rule__Picture__Group_7__1"
    // InternalPageGeneratorLanguare.g:4762:1: rule__Picture__Group_7__1 : rule__Picture__Group_7__1__Impl rule__Picture__Group_7__2 ;
    public final void rule__Picture__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4766:1: ( rule__Picture__Group_7__1__Impl rule__Picture__Group_7__2 )
            // InternalPageGeneratorLanguare.g:4767:2: rule__Picture__Group_7__1__Impl rule__Picture__Group_7__2
            {
            pushFollow(FOLLOW_19);
            rule__Picture__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Picture__Group_7__2();

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
    // $ANTLR end "rule__Picture__Group_7__1"


    // $ANTLR start "rule__Picture__Group_7__1__Impl"
    // InternalPageGeneratorLanguare.g:4774:1: rule__Picture__Group_7__1__Impl : ( '=' ) ;
    public final void rule__Picture__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4778:1: ( ( '=' ) )
            // InternalPageGeneratorLanguare.g:4779:1: ( '=' )
            {
            // InternalPageGeneratorLanguare.g:4779:1: ( '=' )
            // InternalPageGeneratorLanguare.g:4780:2: '='
            {
             before(grammarAccess.getPictureAccess().getEqualsSignKeyword_7_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPictureAccess().getEqualsSignKeyword_7_1()); 

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
    // $ANTLR end "rule__Picture__Group_7__1__Impl"


    // $ANTLR start "rule__Picture__Group_7__2"
    // InternalPageGeneratorLanguare.g:4789:1: rule__Picture__Group_7__2 : rule__Picture__Group_7__2__Impl rule__Picture__Group_7__3 ;
    public final void rule__Picture__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4793:1: ( rule__Picture__Group_7__2__Impl rule__Picture__Group_7__3 )
            // InternalPageGeneratorLanguare.g:4794:2: rule__Picture__Group_7__2__Impl rule__Picture__Group_7__3
            {
            pushFollow(FOLLOW_11);
            rule__Picture__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Picture__Group_7__3();

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
    // $ANTLR end "rule__Picture__Group_7__2"


    // $ANTLR start "rule__Picture__Group_7__2__Impl"
    // InternalPageGeneratorLanguare.g:4801:1: rule__Picture__Group_7__2__Impl : ( ( rule__Picture__RpaddingAssignment_7_2 ) ) ;
    public final void rule__Picture__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4805:1: ( ( ( rule__Picture__RpaddingAssignment_7_2 ) ) )
            // InternalPageGeneratorLanguare.g:4806:1: ( ( rule__Picture__RpaddingAssignment_7_2 ) )
            {
            // InternalPageGeneratorLanguare.g:4806:1: ( ( rule__Picture__RpaddingAssignment_7_2 ) )
            // InternalPageGeneratorLanguare.g:4807:2: ( rule__Picture__RpaddingAssignment_7_2 )
            {
             before(grammarAccess.getPictureAccess().getRpaddingAssignment_7_2()); 
            // InternalPageGeneratorLanguare.g:4808:2: ( rule__Picture__RpaddingAssignment_7_2 )
            // InternalPageGeneratorLanguare.g:4808:3: rule__Picture__RpaddingAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__Picture__RpaddingAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getPictureAccess().getRpaddingAssignment_7_2()); 

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
    // $ANTLR end "rule__Picture__Group_7__2__Impl"


    // $ANTLR start "rule__Picture__Group_7__3"
    // InternalPageGeneratorLanguare.g:4816:1: rule__Picture__Group_7__3 : rule__Picture__Group_7__3__Impl ;
    public final void rule__Picture__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4820:1: ( rule__Picture__Group_7__3__Impl )
            // InternalPageGeneratorLanguare.g:4821:2: rule__Picture__Group_7__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Picture__Group_7__3__Impl();

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
    // $ANTLR end "rule__Picture__Group_7__3"


    // $ANTLR start "rule__Picture__Group_7__3__Impl"
    // InternalPageGeneratorLanguare.g:4827:1: rule__Picture__Group_7__3__Impl : ( ( ',' )? ) ;
    public final void rule__Picture__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4831:1: ( ( ( ',' )? ) )
            // InternalPageGeneratorLanguare.g:4832:1: ( ( ',' )? )
            {
            // InternalPageGeneratorLanguare.g:4832:1: ( ( ',' )? )
            // InternalPageGeneratorLanguare.g:4833:2: ( ',' )?
            {
             before(grammarAccess.getPictureAccess().getCommaKeyword_7_3()); 
            // InternalPageGeneratorLanguare.g:4834:2: ( ',' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==12) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:4834:3: ','
                    {
                    match(input,12,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getPictureAccess().getCommaKeyword_7_3()); 

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
    // $ANTLR end "rule__Picture__Group_7__3__Impl"


    // $ANTLR start "rule__Picture__Group_8__0"
    // InternalPageGeneratorLanguare.g:4843:1: rule__Picture__Group_8__0 : rule__Picture__Group_8__0__Impl rule__Picture__Group_8__1 ;
    public final void rule__Picture__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4847:1: ( rule__Picture__Group_8__0__Impl rule__Picture__Group_8__1 )
            // InternalPageGeneratorLanguare.g:4848:2: rule__Picture__Group_8__0__Impl rule__Picture__Group_8__1
            {
            pushFollow(FOLLOW_8);
            rule__Picture__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Picture__Group_8__1();

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
    // $ANTLR end "rule__Picture__Group_8__0"


    // $ANTLR start "rule__Picture__Group_8__0__Impl"
    // InternalPageGeneratorLanguare.g:4855:1: rule__Picture__Group_8__0__Impl : ( 'Padding-top' ) ;
    public final void rule__Picture__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4859:1: ( ( 'Padding-top' ) )
            // InternalPageGeneratorLanguare.g:4860:1: ( 'Padding-top' )
            {
            // InternalPageGeneratorLanguare.g:4860:1: ( 'Padding-top' )
            // InternalPageGeneratorLanguare.g:4861:2: 'Padding-top'
            {
             before(grammarAccess.getPictureAccess().getPaddingTopKeyword_8_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getPictureAccess().getPaddingTopKeyword_8_0()); 

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
    // $ANTLR end "rule__Picture__Group_8__0__Impl"


    // $ANTLR start "rule__Picture__Group_8__1"
    // InternalPageGeneratorLanguare.g:4870:1: rule__Picture__Group_8__1 : rule__Picture__Group_8__1__Impl rule__Picture__Group_8__2 ;
    public final void rule__Picture__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4874:1: ( rule__Picture__Group_8__1__Impl rule__Picture__Group_8__2 )
            // InternalPageGeneratorLanguare.g:4875:2: rule__Picture__Group_8__1__Impl rule__Picture__Group_8__2
            {
            pushFollow(FOLLOW_19);
            rule__Picture__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Picture__Group_8__2();

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
    // $ANTLR end "rule__Picture__Group_8__1"


    // $ANTLR start "rule__Picture__Group_8__1__Impl"
    // InternalPageGeneratorLanguare.g:4882:1: rule__Picture__Group_8__1__Impl : ( '=' ) ;
    public final void rule__Picture__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4886:1: ( ( '=' ) )
            // InternalPageGeneratorLanguare.g:4887:1: ( '=' )
            {
            // InternalPageGeneratorLanguare.g:4887:1: ( '=' )
            // InternalPageGeneratorLanguare.g:4888:2: '='
            {
             before(grammarAccess.getPictureAccess().getEqualsSignKeyword_8_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPictureAccess().getEqualsSignKeyword_8_1()); 

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
    // $ANTLR end "rule__Picture__Group_8__1__Impl"


    // $ANTLR start "rule__Picture__Group_8__2"
    // InternalPageGeneratorLanguare.g:4897:1: rule__Picture__Group_8__2 : rule__Picture__Group_8__2__Impl rule__Picture__Group_8__3 ;
    public final void rule__Picture__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4901:1: ( rule__Picture__Group_8__2__Impl rule__Picture__Group_8__3 )
            // InternalPageGeneratorLanguare.g:4902:2: rule__Picture__Group_8__2__Impl rule__Picture__Group_8__3
            {
            pushFollow(FOLLOW_11);
            rule__Picture__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Picture__Group_8__3();

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
    // $ANTLR end "rule__Picture__Group_8__2"


    // $ANTLR start "rule__Picture__Group_8__2__Impl"
    // InternalPageGeneratorLanguare.g:4909:1: rule__Picture__Group_8__2__Impl : ( ( rule__Picture__TpaddingAssignment_8_2 ) ) ;
    public final void rule__Picture__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4913:1: ( ( ( rule__Picture__TpaddingAssignment_8_2 ) ) )
            // InternalPageGeneratorLanguare.g:4914:1: ( ( rule__Picture__TpaddingAssignment_8_2 ) )
            {
            // InternalPageGeneratorLanguare.g:4914:1: ( ( rule__Picture__TpaddingAssignment_8_2 ) )
            // InternalPageGeneratorLanguare.g:4915:2: ( rule__Picture__TpaddingAssignment_8_2 )
            {
             before(grammarAccess.getPictureAccess().getTpaddingAssignment_8_2()); 
            // InternalPageGeneratorLanguare.g:4916:2: ( rule__Picture__TpaddingAssignment_8_2 )
            // InternalPageGeneratorLanguare.g:4916:3: rule__Picture__TpaddingAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__Picture__TpaddingAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getPictureAccess().getTpaddingAssignment_8_2()); 

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
    // $ANTLR end "rule__Picture__Group_8__2__Impl"


    // $ANTLR start "rule__Picture__Group_8__3"
    // InternalPageGeneratorLanguare.g:4924:1: rule__Picture__Group_8__3 : rule__Picture__Group_8__3__Impl ;
    public final void rule__Picture__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4928:1: ( rule__Picture__Group_8__3__Impl )
            // InternalPageGeneratorLanguare.g:4929:2: rule__Picture__Group_8__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Picture__Group_8__3__Impl();

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
    // $ANTLR end "rule__Picture__Group_8__3"


    // $ANTLR start "rule__Picture__Group_8__3__Impl"
    // InternalPageGeneratorLanguare.g:4935:1: rule__Picture__Group_8__3__Impl : ( ( ',' )? ) ;
    public final void rule__Picture__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4939:1: ( ( ( ',' )? ) )
            // InternalPageGeneratorLanguare.g:4940:1: ( ( ',' )? )
            {
            // InternalPageGeneratorLanguare.g:4940:1: ( ( ',' )? )
            // InternalPageGeneratorLanguare.g:4941:2: ( ',' )?
            {
             before(grammarAccess.getPictureAccess().getCommaKeyword_8_3()); 
            // InternalPageGeneratorLanguare.g:4942:2: ( ',' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==12) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:4942:3: ','
                    {
                    match(input,12,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getPictureAccess().getCommaKeyword_8_3()); 

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
    // $ANTLR end "rule__Picture__Group_8__3__Impl"


    // $ANTLR start "rule__Picture__Group_9__0"
    // InternalPageGeneratorLanguare.g:4951:1: rule__Picture__Group_9__0 : rule__Picture__Group_9__0__Impl rule__Picture__Group_9__1 ;
    public final void rule__Picture__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4955:1: ( rule__Picture__Group_9__0__Impl rule__Picture__Group_9__1 )
            // InternalPageGeneratorLanguare.g:4956:2: rule__Picture__Group_9__0__Impl rule__Picture__Group_9__1
            {
            pushFollow(FOLLOW_8);
            rule__Picture__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Picture__Group_9__1();

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
    // $ANTLR end "rule__Picture__Group_9__0"


    // $ANTLR start "rule__Picture__Group_9__0__Impl"
    // InternalPageGeneratorLanguare.g:4963:1: rule__Picture__Group_9__0__Impl : ( 'Padding-bottom' ) ;
    public final void rule__Picture__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4967:1: ( ( 'Padding-bottom' ) )
            // InternalPageGeneratorLanguare.g:4968:1: ( 'Padding-bottom' )
            {
            // InternalPageGeneratorLanguare.g:4968:1: ( 'Padding-bottom' )
            // InternalPageGeneratorLanguare.g:4969:2: 'Padding-bottom'
            {
             before(grammarAccess.getPictureAccess().getPaddingBottomKeyword_9_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getPictureAccess().getPaddingBottomKeyword_9_0()); 

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
    // $ANTLR end "rule__Picture__Group_9__0__Impl"


    // $ANTLR start "rule__Picture__Group_9__1"
    // InternalPageGeneratorLanguare.g:4978:1: rule__Picture__Group_9__1 : rule__Picture__Group_9__1__Impl rule__Picture__Group_9__2 ;
    public final void rule__Picture__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4982:1: ( rule__Picture__Group_9__1__Impl rule__Picture__Group_9__2 )
            // InternalPageGeneratorLanguare.g:4983:2: rule__Picture__Group_9__1__Impl rule__Picture__Group_9__2
            {
            pushFollow(FOLLOW_19);
            rule__Picture__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Picture__Group_9__2();

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
    // $ANTLR end "rule__Picture__Group_9__1"


    // $ANTLR start "rule__Picture__Group_9__1__Impl"
    // InternalPageGeneratorLanguare.g:4990:1: rule__Picture__Group_9__1__Impl : ( '=' ) ;
    public final void rule__Picture__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:4994:1: ( ( '=' ) )
            // InternalPageGeneratorLanguare.g:4995:1: ( '=' )
            {
            // InternalPageGeneratorLanguare.g:4995:1: ( '=' )
            // InternalPageGeneratorLanguare.g:4996:2: '='
            {
             before(grammarAccess.getPictureAccess().getEqualsSignKeyword_9_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPictureAccess().getEqualsSignKeyword_9_1()); 

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
    // $ANTLR end "rule__Picture__Group_9__1__Impl"


    // $ANTLR start "rule__Picture__Group_9__2"
    // InternalPageGeneratorLanguare.g:5005:1: rule__Picture__Group_9__2 : rule__Picture__Group_9__2__Impl rule__Picture__Group_9__3 ;
    public final void rule__Picture__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5009:1: ( rule__Picture__Group_9__2__Impl rule__Picture__Group_9__3 )
            // InternalPageGeneratorLanguare.g:5010:2: rule__Picture__Group_9__2__Impl rule__Picture__Group_9__3
            {
            pushFollow(FOLLOW_11);
            rule__Picture__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Picture__Group_9__3();

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
    // $ANTLR end "rule__Picture__Group_9__2"


    // $ANTLR start "rule__Picture__Group_9__2__Impl"
    // InternalPageGeneratorLanguare.g:5017:1: rule__Picture__Group_9__2__Impl : ( ( rule__Picture__BpaddingAssignment_9_2 ) ) ;
    public final void rule__Picture__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5021:1: ( ( ( rule__Picture__BpaddingAssignment_9_2 ) ) )
            // InternalPageGeneratorLanguare.g:5022:1: ( ( rule__Picture__BpaddingAssignment_9_2 ) )
            {
            // InternalPageGeneratorLanguare.g:5022:1: ( ( rule__Picture__BpaddingAssignment_9_2 ) )
            // InternalPageGeneratorLanguare.g:5023:2: ( rule__Picture__BpaddingAssignment_9_2 )
            {
             before(grammarAccess.getPictureAccess().getBpaddingAssignment_9_2()); 
            // InternalPageGeneratorLanguare.g:5024:2: ( rule__Picture__BpaddingAssignment_9_2 )
            // InternalPageGeneratorLanguare.g:5024:3: rule__Picture__BpaddingAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__Picture__BpaddingAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getPictureAccess().getBpaddingAssignment_9_2()); 

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
    // $ANTLR end "rule__Picture__Group_9__2__Impl"


    // $ANTLR start "rule__Picture__Group_9__3"
    // InternalPageGeneratorLanguare.g:5032:1: rule__Picture__Group_9__3 : rule__Picture__Group_9__3__Impl ;
    public final void rule__Picture__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5036:1: ( rule__Picture__Group_9__3__Impl )
            // InternalPageGeneratorLanguare.g:5037:2: rule__Picture__Group_9__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Picture__Group_9__3__Impl();

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
    // $ANTLR end "rule__Picture__Group_9__3"


    // $ANTLR start "rule__Picture__Group_9__3__Impl"
    // InternalPageGeneratorLanguare.g:5043:1: rule__Picture__Group_9__3__Impl : ( ( ',' )? ) ;
    public final void rule__Picture__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5047:1: ( ( ( ',' )? ) )
            // InternalPageGeneratorLanguare.g:5048:1: ( ( ',' )? )
            {
            // InternalPageGeneratorLanguare.g:5048:1: ( ( ',' )? )
            // InternalPageGeneratorLanguare.g:5049:2: ( ',' )?
            {
             before(grammarAccess.getPictureAccess().getCommaKeyword_9_3()); 
            // InternalPageGeneratorLanguare.g:5050:2: ( ',' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==12) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:5050:3: ','
                    {
                    match(input,12,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getPictureAccess().getCommaKeyword_9_3()); 

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
    // $ANTLR end "rule__Picture__Group_9__3__Impl"


    // $ANTLR start "rule__Text__Group__0"
    // InternalPageGeneratorLanguare.g:5059:1: rule__Text__Group__0 : rule__Text__Group__0__Impl rule__Text__Group__1 ;
    public final void rule__Text__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5063:1: ( rule__Text__Group__0__Impl rule__Text__Group__1 )
            // InternalPageGeneratorLanguare.g:5064:2: rule__Text__Group__0__Impl rule__Text__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Text__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group__1();

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
    // $ANTLR end "rule__Text__Group__0"


    // $ANTLR start "rule__Text__Group__0__Impl"
    // InternalPageGeneratorLanguare.g:5071:1: rule__Text__Group__0__Impl : ( 'Text' ) ;
    public final void rule__Text__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5075:1: ( ( 'Text' ) )
            // InternalPageGeneratorLanguare.g:5076:1: ( 'Text' )
            {
            // InternalPageGeneratorLanguare.g:5076:1: ( 'Text' )
            // InternalPageGeneratorLanguare.g:5077:2: 'Text'
            {
             before(grammarAccess.getTextAccess().getTextKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getTextKeyword_0()); 

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
    // $ANTLR end "rule__Text__Group__0__Impl"


    // $ANTLR start "rule__Text__Group__1"
    // InternalPageGeneratorLanguare.g:5086:1: rule__Text__Group__1 : rule__Text__Group__1__Impl rule__Text__Group__2 ;
    public final void rule__Text__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5090:1: ( rule__Text__Group__1__Impl rule__Text__Group__2 )
            // InternalPageGeneratorLanguare.g:5091:2: rule__Text__Group__1__Impl rule__Text__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Text__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group__2();

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
    // $ANTLR end "rule__Text__Group__1"


    // $ANTLR start "rule__Text__Group__1__Impl"
    // InternalPageGeneratorLanguare.g:5098:1: rule__Text__Group__1__Impl : ( ( rule__Text__NameAssignment_1 ) ) ;
    public final void rule__Text__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5102:1: ( ( ( rule__Text__NameAssignment_1 ) ) )
            // InternalPageGeneratorLanguare.g:5103:1: ( ( rule__Text__NameAssignment_1 ) )
            {
            // InternalPageGeneratorLanguare.g:5103:1: ( ( rule__Text__NameAssignment_1 ) )
            // InternalPageGeneratorLanguare.g:5104:2: ( rule__Text__NameAssignment_1 )
            {
             before(grammarAccess.getTextAccess().getNameAssignment_1()); 
            // InternalPageGeneratorLanguare.g:5105:2: ( rule__Text__NameAssignment_1 )
            // InternalPageGeneratorLanguare.g:5105:3: rule__Text__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Text__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Text__Group__1__Impl"


    // $ANTLR start "rule__Text__Group__2"
    // InternalPageGeneratorLanguare.g:5113:1: rule__Text__Group__2 : rule__Text__Group__2__Impl rule__Text__Group__3 ;
    public final void rule__Text__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5117:1: ( rule__Text__Group__2__Impl rule__Text__Group__3 )
            // InternalPageGeneratorLanguare.g:5118:2: rule__Text__Group__2__Impl rule__Text__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__Text__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group__3();

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
    // $ANTLR end "rule__Text__Group__2"


    // $ANTLR start "rule__Text__Group__2__Impl"
    // InternalPageGeneratorLanguare.g:5125:1: rule__Text__Group__2__Impl : ( '<' ) ;
    public final void rule__Text__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5129:1: ( ( '<' ) )
            // InternalPageGeneratorLanguare.g:5130:1: ( '<' )
            {
            // InternalPageGeneratorLanguare.g:5130:1: ( '<' )
            // InternalPageGeneratorLanguare.g:5131:2: '<'
            {
             before(grammarAccess.getTextAccess().getLessThanSignKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getLessThanSignKeyword_2()); 

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
    // $ANTLR end "rule__Text__Group__2__Impl"


    // $ANTLR start "rule__Text__Group__3"
    // InternalPageGeneratorLanguare.g:5140:1: rule__Text__Group__3 : rule__Text__Group__3__Impl rule__Text__Group__4 ;
    public final void rule__Text__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5144:1: ( rule__Text__Group__3__Impl rule__Text__Group__4 )
            // InternalPageGeneratorLanguare.g:5145:2: rule__Text__Group__3__Impl rule__Text__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__Text__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group__4();

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
    // $ANTLR end "rule__Text__Group__3"


    // $ANTLR start "rule__Text__Group__3__Impl"
    // InternalPageGeneratorLanguare.g:5152:1: rule__Text__Group__3__Impl : ( ( rule__Text__Group_3__0 )? ) ;
    public final void rule__Text__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5156:1: ( ( ( rule__Text__Group_3__0 )? ) )
            // InternalPageGeneratorLanguare.g:5157:1: ( ( rule__Text__Group_3__0 )? )
            {
            // InternalPageGeneratorLanguare.g:5157:1: ( ( rule__Text__Group_3__0 )? )
            // InternalPageGeneratorLanguare.g:5158:2: ( rule__Text__Group_3__0 )?
            {
             before(grammarAccess.getTextAccess().getGroup_3()); 
            // InternalPageGeneratorLanguare.g:5159:2: ( rule__Text__Group_3__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==26) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:5159:3: rule__Text__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Text__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Text__Group__3__Impl"


    // $ANTLR start "rule__Text__Group__4"
    // InternalPageGeneratorLanguare.g:5167:1: rule__Text__Group__4 : rule__Text__Group__4__Impl rule__Text__Group__5 ;
    public final void rule__Text__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5171:1: ( rule__Text__Group__4__Impl rule__Text__Group__5 )
            // InternalPageGeneratorLanguare.g:5172:2: rule__Text__Group__4__Impl rule__Text__Group__5
            {
            pushFollow(FOLLOW_26);
            rule__Text__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group__5();

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
    // $ANTLR end "rule__Text__Group__4"


    // $ANTLR start "rule__Text__Group__4__Impl"
    // InternalPageGeneratorLanguare.g:5179:1: rule__Text__Group__4__Impl : ( ( rule__Text__Group_4__0 )? ) ;
    public final void rule__Text__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5183:1: ( ( ( rule__Text__Group_4__0 )? ) )
            // InternalPageGeneratorLanguare.g:5184:1: ( ( rule__Text__Group_4__0 )? )
            {
            // InternalPageGeneratorLanguare.g:5184:1: ( ( rule__Text__Group_4__0 )? )
            // InternalPageGeneratorLanguare.g:5185:2: ( rule__Text__Group_4__0 )?
            {
             before(grammarAccess.getTextAccess().getGroup_4()); 
            // InternalPageGeneratorLanguare.g:5186:2: ( rule__Text__Group_4__0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==34) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:5186:3: rule__Text__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Text__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Text__Group__4__Impl"


    // $ANTLR start "rule__Text__Group__5"
    // InternalPageGeneratorLanguare.g:5194:1: rule__Text__Group__5 : rule__Text__Group__5__Impl rule__Text__Group__6 ;
    public final void rule__Text__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5198:1: ( rule__Text__Group__5__Impl rule__Text__Group__6 )
            // InternalPageGeneratorLanguare.g:5199:2: rule__Text__Group__5__Impl rule__Text__Group__6
            {
            pushFollow(FOLLOW_26);
            rule__Text__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group__6();

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
    // $ANTLR end "rule__Text__Group__5"


    // $ANTLR start "rule__Text__Group__5__Impl"
    // InternalPageGeneratorLanguare.g:5206:1: rule__Text__Group__5__Impl : ( ( rule__Text__Group_5__0 )? ) ;
    public final void rule__Text__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5210:1: ( ( ( rule__Text__Group_5__0 )? ) )
            // InternalPageGeneratorLanguare.g:5211:1: ( ( rule__Text__Group_5__0 )? )
            {
            // InternalPageGeneratorLanguare.g:5211:1: ( ( rule__Text__Group_5__0 )? )
            // InternalPageGeneratorLanguare.g:5212:2: ( rule__Text__Group_5__0 )?
            {
             before(grammarAccess.getTextAccess().getGroup_5()); 
            // InternalPageGeneratorLanguare.g:5213:2: ( rule__Text__Group_5__0 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==27) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:5213:3: rule__Text__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Text__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Text__Group__5__Impl"


    // $ANTLR start "rule__Text__Group__6"
    // InternalPageGeneratorLanguare.g:5221:1: rule__Text__Group__6 : rule__Text__Group__6__Impl rule__Text__Group__7 ;
    public final void rule__Text__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5225:1: ( rule__Text__Group__6__Impl rule__Text__Group__7 )
            // InternalPageGeneratorLanguare.g:5226:2: rule__Text__Group__6__Impl rule__Text__Group__7
            {
            pushFollow(FOLLOW_26);
            rule__Text__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group__7();

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
    // $ANTLR end "rule__Text__Group__6"


    // $ANTLR start "rule__Text__Group__6__Impl"
    // InternalPageGeneratorLanguare.g:5233:1: rule__Text__Group__6__Impl : ( ( rule__Text__Group_6__0 )? ) ;
    public final void rule__Text__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5237:1: ( ( ( rule__Text__Group_6__0 )? ) )
            // InternalPageGeneratorLanguare.g:5238:1: ( ( rule__Text__Group_6__0 )? )
            {
            // InternalPageGeneratorLanguare.g:5238:1: ( ( rule__Text__Group_6__0 )? )
            // InternalPageGeneratorLanguare.g:5239:2: ( rule__Text__Group_6__0 )?
            {
             before(grammarAccess.getTextAccess().getGroup_6()); 
            // InternalPageGeneratorLanguare.g:5240:2: ( rule__Text__Group_6__0 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==28) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:5240:3: rule__Text__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Text__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Text__Group__6__Impl"


    // $ANTLR start "rule__Text__Group__7"
    // InternalPageGeneratorLanguare.g:5248:1: rule__Text__Group__7 : rule__Text__Group__7__Impl rule__Text__Group__8 ;
    public final void rule__Text__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5252:1: ( rule__Text__Group__7__Impl rule__Text__Group__8 )
            // InternalPageGeneratorLanguare.g:5253:2: rule__Text__Group__7__Impl rule__Text__Group__8
            {
            pushFollow(FOLLOW_26);
            rule__Text__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group__8();

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
    // $ANTLR end "rule__Text__Group__7"


    // $ANTLR start "rule__Text__Group__7__Impl"
    // InternalPageGeneratorLanguare.g:5260:1: rule__Text__Group__7__Impl : ( ( rule__Text__Group_7__0 )? ) ;
    public final void rule__Text__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5264:1: ( ( ( rule__Text__Group_7__0 )? ) )
            // InternalPageGeneratorLanguare.g:5265:1: ( ( rule__Text__Group_7__0 )? )
            {
            // InternalPageGeneratorLanguare.g:5265:1: ( ( rule__Text__Group_7__0 )? )
            // InternalPageGeneratorLanguare.g:5266:2: ( rule__Text__Group_7__0 )?
            {
             before(grammarAccess.getTextAccess().getGroup_7()); 
            // InternalPageGeneratorLanguare.g:5267:2: ( rule__Text__Group_7__0 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==29) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:5267:3: rule__Text__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Text__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextAccess().getGroup_7()); 

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
    // $ANTLR end "rule__Text__Group__7__Impl"


    // $ANTLR start "rule__Text__Group__8"
    // InternalPageGeneratorLanguare.g:5275:1: rule__Text__Group__8 : rule__Text__Group__8__Impl rule__Text__Group__9 ;
    public final void rule__Text__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5279:1: ( rule__Text__Group__8__Impl rule__Text__Group__9 )
            // InternalPageGeneratorLanguare.g:5280:2: rule__Text__Group__8__Impl rule__Text__Group__9
            {
            pushFollow(FOLLOW_26);
            rule__Text__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group__9();

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
    // $ANTLR end "rule__Text__Group__8"


    // $ANTLR start "rule__Text__Group__8__Impl"
    // InternalPageGeneratorLanguare.g:5287:1: rule__Text__Group__8__Impl : ( ( rule__Text__Group_8__0 )? ) ;
    public final void rule__Text__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5291:1: ( ( ( rule__Text__Group_8__0 )? ) )
            // InternalPageGeneratorLanguare.g:5292:1: ( ( rule__Text__Group_8__0 )? )
            {
            // InternalPageGeneratorLanguare.g:5292:1: ( ( rule__Text__Group_8__0 )? )
            // InternalPageGeneratorLanguare.g:5293:2: ( rule__Text__Group_8__0 )?
            {
             before(grammarAccess.getTextAccess().getGroup_8()); 
            // InternalPageGeneratorLanguare.g:5294:2: ( rule__Text__Group_8__0 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==30) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:5294:3: rule__Text__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Text__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextAccess().getGroup_8()); 

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
    // $ANTLR end "rule__Text__Group__8__Impl"


    // $ANTLR start "rule__Text__Group__9"
    // InternalPageGeneratorLanguare.g:5302:1: rule__Text__Group__9 : rule__Text__Group__9__Impl rule__Text__Group__10 ;
    public final void rule__Text__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5306:1: ( rule__Text__Group__9__Impl rule__Text__Group__10 )
            // InternalPageGeneratorLanguare.g:5307:2: rule__Text__Group__9__Impl rule__Text__Group__10
            {
            pushFollow(FOLLOW_26);
            rule__Text__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group__10();

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
    // $ANTLR end "rule__Text__Group__9"


    // $ANTLR start "rule__Text__Group__9__Impl"
    // InternalPageGeneratorLanguare.g:5314:1: rule__Text__Group__9__Impl : ( ( rule__Text__Group_9__0 )? ) ;
    public final void rule__Text__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5318:1: ( ( ( rule__Text__Group_9__0 )? ) )
            // InternalPageGeneratorLanguare.g:5319:1: ( ( rule__Text__Group_9__0 )? )
            {
            // InternalPageGeneratorLanguare.g:5319:1: ( ( rule__Text__Group_9__0 )? )
            // InternalPageGeneratorLanguare.g:5320:2: ( rule__Text__Group_9__0 )?
            {
             before(grammarAccess.getTextAccess().getGroup_9()); 
            // InternalPageGeneratorLanguare.g:5321:2: ( rule__Text__Group_9__0 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==31) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:5321:3: rule__Text__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Text__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextAccess().getGroup_9()); 

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
    // $ANTLR end "rule__Text__Group__9__Impl"


    // $ANTLR start "rule__Text__Group__10"
    // InternalPageGeneratorLanguare.g:5329:1: rule__Text__Group__10 : rule__Text__Group__10__Impl rule__Text__Group__11 ;
    public final void rule__Text__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5333:1: ( rule__Text__Group__10__Impl rule__Text__Group__11 )
            // InternalPageGeneratorLanguare.g:5334:2: rule__Text__Group__10__Impl rule__Text__Group__11
            {
            pushFollow(FOLLOW_8);
            rule__Text__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group__11();

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
    // $ANTLR end "rule__Text__Group__10"


    // $ANTLR start "rule__Text__Group__10__Impl"
    // InternalPageGeneratorLanguare.g:5341:1: rule__Text__Group__10__Impl : ( '>' ) ;
    public final void rule__Text__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5345:1: ( ( '>' ) )
            // InternalPageGeneratorLanguare.g:5346:1: ( '>' )
            {
            // InternalPageGeneratorLanguare.g:5346:1: ( '>' )
            // InternalPageGeneratorLanguare.g:5347:2: '>'
            {
             before(grammarAccess.getTextAccess().getGreaterThanSignKeyword_10()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getGreaterThanSignKeyword_10()); 

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
    // $ANTLR end "rule__Text__Group__10__Impl"


    // $ANTLR start "rule__Text__Group__11"
    // InternalPageGeneratorLanguare.g:5356:1: rule__Text__Group__11 : rule__Text__Group__11__Impl rule__Text__Group__12 ;
    public final void rule__Text__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5360:1: ( rule__Text__Group__11__Impl rule__Text__Group__12 )
            // InternalPageGeneratorLanguare.g:5361:2: rule__Text__Group__11__Impl rule__Text__Group__12
            {
            pushFollow(FOLLOW_21);
            rule__Text__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group__12();

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
    // $ANTLR end "rule__Text__Group__11"


    // $ANTLR start "rule__Text__Group__11__Impl"
    // InternalPageGeneratorLanguare.g:5368:1: rule__Text__Group__11__Impl : ( '=' ) ;
    public final void rule__Text__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5372:1: ( ( '=' ) )
            // InternalPageGeneratorLanguare.g:5373:1: ( '=' )
            {
            // InternalPageGeneratorLanguare.g:5373:1: ( '=' )
            // InternalPageGeneratorLanguare.g:5374:2: '='
            {
             before(grammarAccess.getTextAccess().getEqualsSignKeyword_11()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getEqualsSignKeyword_11()); 

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
    // $ANTLR end "rule__Text__Group__11__Impl"


    // $ANTLR start "rule__Text__Group__12"
    // InternalPageGeneratorLanguare.g:5383:1: rule__Text__Group__12 : rule__Text__Group__12__Impl rule__Text__Group__13 ;
    public final void rule__Text__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5387:1: ( rule__Text__Group__12__Impl rule__Text__Group__13 )
            // InternalPageGeneratorLanguare.g:5388:2: rule__Text__Group__12__Impl rule__Text__Group__13
            {
            pushFollow(FOLLOW_10);
            rule__Text__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group__13();

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
    // $ANTLR end "rule__Text__Group__12"


    // $ANTLR start "rule__Text__Group__12__Impl"
    // InternalPageGeneratorLanguare.g:5395:1: rule__Text__Group__12__Impl : ( ( rule__Text__ContentAssignment_12 ) ) ;
    public final void rule__Text__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5399:1: ( ( ( rule__Text__ContentAssignment_12 ) ) )
            // InternalPageGeneratorLanguare.g:5400:1: ( ( rule__Text__ContentAssignment_12 ) )
            {
            // InternalPageGeneratorLanguare.g:5400:1: ( ( rule__Text__ContentAssignment_12 ) )
            // InternalPageGeneratorLanguare.g:5401:2: ( rule__Text__ContentAssignment_12 )
            {
             before(grammarAccess.getTextAccess().getContentAssignment_12()); 
            // InternalPageGeneratorLanguare.g:5402:2: ( rule__Text__ContentAssignment_12 )
            // InternalPageGeneratorLanguare.g:5402:3: rule__Text__ContentAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Text__ContentAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getContentAssignment_12()); 

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
    // $ANTLR end "rule__Text__Group__12__Impl"


    // $ANTLR start "rule__Text__Group__13"
    // InternalPageGeneratorLanguare.g:5410:1: rule__Text__Group__13 : rule__Text__Group__13__Impl ;
    public final void rule__Text__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5414:1: ( rule__Text__Group__13__Impl )
            // InternalPageGeneratorLanguare.g:5415:2: rule__Text__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Text__Group__13__Impl();

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
    // $ANTLR end "rule__Text__Group__13"


    // $ANTLR start "rule__Text__Group__13__Impl"
    // InternalPageGeneratorLanguare.g:5421:1: rule__Text__Group__13__Impl : ( ';' ) ;
    public final void rule__Text__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5425:1: ( ( ';' ) )
            // InternalPageGeneratorLanguare.g:5426:1: ( ';' )
            {
            // InternalPageGeneratorLanguare.g:5426:1: ( ';' )
            // InternalPageGeneratorLanguare.g:5427:2: ';'
            {
             before(grammarAccess.getTextAccess().getSemicolonKeyword_13()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getSemicolonKeyword_13()); 

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
    // $ANTLR end "rule__Text__Group__13__Impl"


    // $ANTLR start "rule__Text__Group_3__0"
    // InternalPageGeneratorLanguare.g:5437:1: rule__Text__Group_3__0 : rule__Text__Group_3__0__Impl rule__Text__Group_3__1 ;
    public final void rule__Text__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5441:1: ( rule__Text__Group_3__0__Impl rule__Text__Group_3__1 )
            // InternalPageGeneratorLanguare.g:5442:2: rule__Text__Group_3__0__Impl rule__Text__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__Text__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group_3__1();

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
    // $ANTLR end "rule__Text__Group_3__0"


    // $ANTLR start "rule__Text__Group_3__0__Impl"
    // InternalPageGeneratorLanguare.g:5449:1: rule__Text__Group_3__0__Impl : ( 'Font-colour' ) ;
    public final void rule__Text__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5453:1: ( ( 'Font-colour' ) )
            // InternalPageGeneratorLanguare.g:5454:1: ( 'Font-colour' )
            {
            // InternalPageGeneratorLanguare.g:5454:1: ( 'Font-colour' )
            // InternalPageGeneratorLanguare.g:5455:2: 'Font-colour'
            {
             before(grammarAccess.getTextAccess().getFontColourKeyword_3_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getFontColourKeyword_3_0()); 

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
    // $ANTLR end "rule__Text__Group_3__0__Impl"


    // $ANTLR start "rule__Text__Group_3__1"
    // InternalPageGeneratorLanguare.g:5464:1: rule__Text__Group_3__1 : rule__Text__Group_3__1__Impl rule__Text__Group_3__2 ;
    public final void rule__Text__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5468:1: ( rule__Text__Group_3__1__Impl rule__Text__Group_3__2 )
            // InternalPageGeneratorLanguare.g:5469:2: rule__Text__Group_3__1__Impl rule__Text__Group_3__2
            {
            pushFollow(FOLLOW_21);
            rule__Text__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group_3__2();

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
    // $ANTLR end "rule__Text__Group_3__1"


    // $ANTLR start "rule__Text__Group_3__1__Impl"
    // InternalPageGeneratorLanguare.g:5476:1: rule__Text__Group_3__1__Impl : ( '=' ) ;
    public final void rule__Text__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5480:1: ( ( '=' ) )
            // InternalPageGeneratorLanguare.g:5481:1: ( '=' )
            {
            // InternalPageGeneratorLanguare.g:5481:1: ( '=' )
            // InternalPageGeneratorLanguare.g:5482:2: '='
            {
             before(grammarAccess.getTextAccess().getEqualsSignKeyword_3_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getEqualsSignKeyword_3_1()); 

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
    // $ANTLR end "rule__Text__Group_3__1__Impl"


    // $ANTLR start "rule__Text__Group_3__2"
    // InternalPageGeneratorLanguare.g:5491:1: rule__Text__Group_3__2 : rule__Text__Group_3__2__Impl rule__Text__Group_3__3 ;
    public final void rule__Text__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5495:1: ( rule__Text__Group_3__2__Impl rule__Text__Group_3__3 )
            // InternalPageGeneratorLanguare.g:5496:2: rule__Text__Group_3__2__Impl rule__Text__Group_3__3
            {
            pushFollow(FOLLOW_11);
            rule__Text__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group_3__3();

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
    // $ANTLR end "rule__Text__Group_3__2"


    // $ANTLR start "rule__Text__Group_3__2__Impl"
    // InternalPageGeneratorLanguare.g:5503:1: rule__Text__Group_3__2__Impl : ( ( rule__Text__FontColorAssignment_3_2 ) ) ;
    public final void rule__Text__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5507:1: ( ( ( rule__Text__FontColorAssignment_3_2 ) ) )
            // InternalPageGeneratorLanguare.g:5508:1: ( ( rule__Text__FontColorAssignment_3_2 ) )
            {
            // InternalPageGeneratorLanguare.g:5508:1: ( ( rule__Text__FontColorAssignment_3_2 ) )
            // InternalPageGeneratorLanguare.g:5509:2: ( rule__Text__FontColorAssignment_3_2 )
            {
             before(grammarAccess.getTextAccess().getFontColorAssignment_3_2()); 
            // InternalPageGeneratorLanguare.g:5510:2: ( rule__Text__FontColorAssignment_3_2 )
            // InternalPageGeneratorLanguare.g:5510:3: rule__Text__FontColorAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Text__FontColorAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getFontColorAssignment_3_2()); 

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
    // $ANTLR end "rule__Text__Group_3__2__Impl"


    // $ANTLR start "rule__Text__Group_3__3"
    // InternalPageGeneratorLanguare.g:5518:1: rule__Text__Group_3__3 : rule__Text__Group_3__3__Impl ;
    public final void rule__Text__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5522:1: ( rule__Text__Group_3__3__Impl )
            // InternalPageGeneratorLanguare.g:5523:2: rule__Text__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Text__Group_3__3__Impl();

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
    // $ANTLR end "rule__Text__Group_3__3"


    // $ANTLR start "rule__Text__Group_3__3__Impl"
    // InternalPageGeneratorLanguare.g:5529:1: rule__Text__Group_3__3__Impl : ( ( ',' )? ) ;
    public final void rule__Text__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5533:1: ( ( ( ',' )? ) )
            // InternalPageGeneratorLanguare.g:5534:1: ( ( ',' )? )
            {
            // InternalPageGeneratorLanguare.g:5534:1: ( ( ',' )? )
            // InternalPageGeneratorLanguare.g:5535:2: ( ',' )?
            {
             before(grammarAccess.getTextAccess().getCommaKeyword_3_3()); 
            // InternalPageGeneratorLanguare.g:5536:2: ( ',' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==12) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:5536:3: ','
                    {
                    match(input,12,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getTextAccess().getCommaKeyword_3_3()); 

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
    // $ANTLR end "rule__Text__Group_3__3__Impl"


    // $ANTLR start "rule__Text__Group_4__0"
    // InternalPageGeneratorLanguare.g:5545:1: rule__Text__Group_4__0 : rule__Text__Group_4__0__Impl rule__Text__Group_4__1 ;
    public final void rule__Text__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5549:1: ( rule__Text__Group_4__0__Impl rule__Text__Group_4__1 )
            // InternalPageGeneratorLanguare.g:5550:2: rule__Text__Group_4__0__Impl rule__Text__Group_4__1
            {
            pushFollow(FOLLOW_8);
            rule__Text__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group_4__1();

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
    // $ANTLR end "rule__Text__Group_4__0"


    // $ANTLR start "rule__Text__Group_4__0__Impl"
    // InternalPageGeneratorLanguare.g:5557:1: rule__Text__Group_4__0__Impl : ( 'Font-size' ) ;
    public final void rule__Text__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5561:1: ( ( 'Font-size' ) )
            // InternalPageGeneratorLanguare.g:5562:1: ( 'Font-size' )
            {
            // InternalPageGeneratorLanguare.g:5562:1: ( 'Font-size' )
            // InternalPageGeneratorLanguare.g:5563:2: 'Font-size'
            {
             before(grammarAccess.getTextAccess().getFontSizeKeyword_4_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getFontSizeKeyword_4_0()); 

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
    // $ANTLR end "rule__Text__Group_4__0__Impl"


    // $ANTLR start "rule__Text__Group_4__1"
    // InternalPageGeneratorLanguare.g:5572:1: rule__Text__Group_4__1 : rule__Text__Group_4__1__Impl rule__Text__Group_4__2 ;
    public final void rule__Text__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5576:1: ( rule__Text__Group_4__1__Impl rule__Text__Group_4__2 )
            // InternalPageGeneratorLanguare.g:5577:2: rule__Text__Group_4__1__Impl rule__Text__Group_4__2
            {
            pushFollow(FOLLOW_19);
            rule__Text__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group_4__2();

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
    // $ANTLR end "rule__Text__Group_4__1"


    // $ANTLR start "rule__Text__Group_4__1__Impl"
    // InternalPageGeneratorLanguare.g:5584:1: rule__Text__Group_4__1__Impl : ( '=' ) ;
    public final void rule__Text__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5588:1: ( ( '=' ) )
            // InternalPageGeneratorLanguare.g:5589:1: ( '=' )
            {
            // InternalPageGeneratorLanguare.g:5589:1: ( '=' )
            // InternalPageGeneratorLanguare.g:5590:2: '='
            {
             before(grammarAccess.getTextAccess().getEqualsSignKeyword_4_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getEqualsSignKeyword_4_1()); 

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
    // $ANTLR end "rule__Text__Group_4__1__Impl"


    // $ANTLR start "rule__Text__Group_4__2"
    // InternalPageGeneratorLanguare.g:5599:1: rule__Text__Group_4__2 : rule__Text__Group_4__2__Impl rule__Text__Group_4__3 ;
    public final void rule__Text__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5603:1: ( rule__Text__Group_4__2__Impl rule__Text__Group_4__3 )
            // InternalPageGeneratorLanguare.g:5604:2: rule__Text__Group_4__2__Impl rule__Text__Group_4__3
            {
            pushFollow(FOLLOW_11);
            rule__Text__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group_4__3();

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
    // $ANTLR end "rule__Text__Group_4__2"


    // $ANTLR start "rule__Text__Group_4__2__Impl"
    // InternalPageGeneratorLanguare.g:5611:1: rule__Text__Group_4__2__Impl : ( ( rule__Text__FontSizeAssignment_4_2 ) ) ;
    public final void rule__Text__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5615:1: ( ( ( rule__Text__FontSizeAssignment_4_2 ) ) )
            // InternalPageGeneratorLanguare.g:5616:1: ( ( rule__Text__FontSizeAssignment_4_2 ) )
            {
            // InternalPageGeneratorLanguare.g:5616:1: ( ( rule__Text__FontSizeAssignment_4_2 ) )
            // InternalPageGeneratorLanguare.g:5617:2: ( rule__Text__FontSizeAssignment_4_2 )
            {
             before(grammarAccess.getTextAccess().getFontSizeAssignment_4_2()); 
            // InternalPageGeneratorLanguare.g:5618:2: ( rule__Text__FontSizeAssignment_4_2 )
            // InternalPageGeneratorLanguare.g:5618:3: rule__Text__FontSizeAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Text__FontSizeAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getFontSizeAssignment_4_2()); 

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
    // $ANTLR end "rule__Text__Group_4__2__Impl"


    // $ANTLR start "rule__Text__Group_4__3"
    // InternalPageGeneratorLanguare.g:5626:1: rule__Text__Group_4__3 : rule__Text__Group_4__3__Impl ;
    public final void rule__Text__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5630:1: ( rule__Text__Group_4__3__Impl )
            // InternalPageGeneratorLanguare.g:5631:2: rule__Text__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Text__Group_4__3__Impl();

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
    // $ANTLR end "rule__Text__Group_4__3"


    // $ANTLR start "rule__Text__Group_4__3__Impl"
    // InternalPageGeneratorLanguare.g:5637:1: rule__Text__Group_4__3__Impl : ( ( ',' )? ) ;
    public final void rule__Text__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5641:1: ( ( ( ',' )? ) )
            // InternalPageGeneratorLanguare.g:5642:1: ( ( ',' )? )
            {
            // InternalPageGeneratorLanguare.g:5642:1: ( ( ',' )? )
            // InternalPageGeneratorLanguare.g:5643:2: ( ',' )?
            {
             before(grammarAccess.getTextAccess().getCommaKeyword_4_3()); 
            // InternalPageGeneratorLanguare.g:5644:2: ( ',' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==12) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:5644:3: ','
                    {
                    match(input,12,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getTextAccess().getCommaKeyword_4_3()); 

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
    // $ANTLR end "rule__Text__Group_4__3__Impl"


    // $ANTLR start "rule__Text__Group_5__0"
    // InternalPageGeneratorLanguare.g:5653:1: rule__Text__Group_5__0 : rule__Text__Group_5__0__Impl rule__Text__Group_5__1 ;
    public final void rule__Text__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5657:1: ( rule__Text__Group_5__0__Impl rule__Text__Group_5__1 )
            // InternalPageGeneratorLanguare.g:5658:2: rule__Text__Group_5__0__Impl rule__Text__Group_5__1
            {
            pushFollow(FOLLOW_8);
            rule__Text__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group_5__1();

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
    // $ANTLR end "rule__Text__Group_5__0"


    // $ANTLR start "rule__Text__Group_5__0__Impl"
    // InternalPageGeneratorLanguare.g:5665:1: rule__Text__Group_5__0__Impl : ( 'Location' ) ;
    public final void rule__Text__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5669:1: ( ( 'Location' ) )
            // InternalPageGeneratorLanguare.g:5670:1: ( 'Location' )
            {
            // InternalPageGeneratorLanguare.g:5670:1: ( 'Location' )
            // InternalPageGeneratorLanguare.g:5671:2: 'Location'
            {
             before(grammarAccess.getTextAccess().getLocationKeyword_5_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getLocationKeyword_5_0()); 

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
    // $ANTLR end "rule__Text__Group_5__0__Impl"


    // $ANTLR start "rule__Text__Group_5__1"
    // InternalPageGeneratorLanguare.g:5680:1: rule__Text__Group_5__1 : rule__Text__Group_5__1__Impl rule__Text__Group_5__2 ;
    public final void rule__Text__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5684:1: ( rule__Text__Group_5__1__Impl rule__Text__Group_5__2 )
            // InternalPageGeneratorLanguare.g:5685:2: rule__Text__Group_5__1__Impl rule__Text__Group_5__2
            {
            pushFollow(FOLLOW_9);
            rule__Text__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group_5__2();

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
    // $ANTLR end "rule__Text__Group_5__1"


    // $ANTLR start "rule__Text__Group_5__1__Impl"
    // InternalPageGeneratorLanguare.g:5692:1: rule__Text__Group_5__1__Impl : ( '=' ) ;
    public final void rule__Text__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5696:1: ( ( '=' ) )
            // InternalPageGeneratorLanguare.g:5697:1: ( '=' )
            {
            // InternalPageGeneratorLanguare.g:5697:1: ( '=' )
            // InternalPageGeneratorLanguare.g:5698:2: '='
            {
             before(grammarAccess.getTextAccess().getEqualsSignKeyword_5_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getEqualsSignKeyword_5_1()); 

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
    // $ANTLR end "rule__Text__Group_5__1__Impl"


    // $ANTLR start "rule__Text__Group_5__2"
    // InternalPageGeneratorLanguare.g:5707:1: rule__Text__Group_5__2 : rule__Text__Group_5__2__Impl rule__Text__Group_5__3 ;
    public final void rule__Text__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5711:1: ( rule__Text__Group_5__2__Impl rule__Text__Group_5__3 )
            // InternalPageGeneratorLanguare.g:5712:2: rule__Text__Group_5__2__Impl rule__Text__Group_5__3
            {
            pushFollow(FOLLOW_11);
            rule__Text__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group_5__3();

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
    // $ANTLR end "rule__Text__Group_5__2"


    // $ANTLR start "rule__Text__Group_5__2__Impl"
    // InternalPageGeneratorLanguare.g:5719:1: rule__Text__Group_5__2__Impl : ( ( rule__Text__LocationAssignment_5_2 ) ) ;
    public final void rule__Text__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5723:1: ( ( ( rule__Text__LocationAssignment_5_2 ) ) )
            // InternalPageGeneratorLanguare.g:5724:1: ( ( rule__Text__LocationAssignment_5_2 ) )
            {
            // InternalPageGeneratorLanguare.g:5724:1: ( ( rule__Text__LocationAssignment_5_2 ) )
            // InternalPageGeneratorLanguare.g:5725:2: ( rule__Text__LocationAssignment_5_2 )
            {
             before(grammarAccess.getTextAccess().getLocationAssignment_5_2()); 
            // InternalPageGeneratorLanguare.g:5726:2: ( rule__Text__LocationAssignment_5_2 )
            // InternalPageGeneratorLanguare.g:5726:3: rule__Text__LocationAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Text__LocationAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getLocationAssignment_5_2()); 

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
    // $ANTLR end "rule__Text__Group_5__2__Impl"


    // $ANTLR start "rule__Text__Group_5__3"
    // InternalPageGeneratorLanguare.g:5734:1: rule__Text__Group_5__3 : rule__Text__Group_5__3__Impl ;
    public final void rule__Text__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5738:1: ( rule__Text__Group_5__3__Impl )
            // InternalPageGeneratorLanguare.g:5739:2: rule__Text__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Text__Group_5__3__Impl();

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
    // $ANTLR end "rule__Text__Group_5__3"


    // $ANTLR start "rule__Text__Group_5__3__Impl"
    // InternalPageGeneratorLanguare.g:5745:1: rule__Text__Group_5__3__Impl : ( ( ',' )? ) ;
    public final void rule__Text__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5749:1: ( ( ( ',' )? ) )
            // InternalPageGeneratorLanguare.g:5750:1: ( ( ',' )? )
            {
            // InternalPageGeneratorLanguare.g:5750:1: ( ( ',' )? )
            // InternalPageGeneratorLanguare.g:5751:2: ( ',' )?
            {
             before(grammarAccess.getTextAccess().getCommaKeyword_5_3()); 
            // InternalPageGeneratorLanguare.g:5752:2: ( ',' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==12) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:5752:3: ','
                    {
                    match(input,12,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getTextAccess().getCommaKeyword_5_3()); 

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
    // $ANTLR end "rule__Text__Group_5__3__Impl"


    // $ANTLR start "rule__Text__Group_6__0"
    // InternalPageGeneratorLanguare.g:5761:1: rule__Text__Group_6__0 : rule__Text__Group_6__0__Impl rule__Text__Group_6__1 ;
    public final void rule__Text__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5765:1: ( rule__Text__Group_6__0__Impl rule__Text__Group_6__1 )
            // InternalPageGeneratorLanguare.g:5766:2: rule__Text__Group_6__0__Impl rule__Text__Group_6__1
            {
            pushFollow(FOLLOW_8);
            rule__Text__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group_6__1();

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
    // $ANTLR end "rule__Text__Group_6__0"


    // $ANTLR start "rule__Text__Group_6__0__Impl"
    // InternalPageGeneratorLanguare.g:5773:1: rule__Text__Group_6__0__Impl : ( 'Padding-left' ) ;
    public final void rule__Text__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5777:1: ( ( 'Padding-left' ) )
            // InternalPageGeneratorLanguare.g:5778:1: ( 'Padding-left' )
            {
            // InternalPageGeneratorLanguare.g:5778:1: ( 'Padding-left' )
            // InternalPageGeneratorLanguare.g:5779:2: 'Padding-left'
            {
             before(grammarAccess.getTextAccess().getPaddingLeftKeyword_6_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getPaddingLeftKeyword_6_0()); 

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
    // $ANTLR end "rule__Text__Group_6__0__Impl"


    // $ANTLR start "rule__Text__Group_6__1"
    // InternalPageGeneratorLanguare.g:5788:1: rule__Text__Group_6__1 : rule__Text__Group_6__1__Impl rule__Text__Group_6__2 ;
    public final void rule__Text__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5792:1: ( rule__Text__Group_6__1__Impl rule__Text__Group_6__2 )
            // InternalPageGeneratorLanguare.g:5793:2: rule__Text__Group_6__1__Impl rule__Text__Group_6__2
            {
            pushFollow(FOLLOW_19);
            rule__Text__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group_6__2();

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
    // $ANTLR end "rule__Text__Group_6__1"


    // $ANTLR start "rule__Text__Group_6__1__Impl"
    // InternalPageGeneratorLanguare.g:5800:1: rule__Text__Group_6__1__Impl : ( '=' ) ;
    public final void rule__Text__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5804:1: ( ( '=' ) )
            // InternalPageGeneratorLanguare.g:5805:1: ( '=' )
            {
            // InternalPageGeneratorLanguare.g:5805:1: ( '=' )
            // InternalPageGeneratorLanguare.g:5806:2: '='
            {
             before(grammarAccess.getTextAccess().getEqualsSignKeyword_6_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getEqualsSignKeyword_6_1()); 

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
    // $ANTLR end "rule__Text__Group_6__1__Impl"


    // $ANTLR start "rule__Text__Group_6__2"
    // InternalPageGeneratorLanguare.g:5815:1: rule__Text__Group_6__2 : rule__Text__Group_6__2__Impl rule__Text__Group_6__3 ;
    public final void rule__Text__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5819:1: ( rule__Text__Group_6__2__Impl rule__Text__Group_6__3 )
            // InternalPageGeneratorLanguare.g:5820:2: rule__Text__Group_6__2__Impl rule__Text__Group_6__3
            {
            pushFollow(FOLLOW_11);
            rule__Text__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group_6__3();

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
    // $ANTLR end "rule__Text__Group_6__2"


    // $ANTLR start "rule__Text__Group_6__2__Impl"
    // InternalPageGeneratorLanguare.g:5827:1: rule__Text__Group_6__2__Impl : ( ( rule__Text__LpaddingAssignment_6_2 ) ) ;
    public final void rule__Text__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5831:1: ( ( ( rule__Text__LpaddingAssignment_6_2 ) ) )
            // InternalPageGeneratorLanguare.g:5832:1: ( ( rule__Text__LpaddingAssignment_6_2 ) )
            {
            // InternalPageGeneratorLanguare.g:5832:1: ( ( rule__Text__LpaddingAssignment_6_2 ) )
            // InternalPageGeneratorLanguare.g:5833:2: ( rule__Text__LpaddingAssignment_6_2 )
            {
             before(grammarAccess.getTextAccess().getLpaddingAssignment_6_2()); 
            // InternalPageGeneratorLanguare.g:5834:2: ( rule__Text__LpaddingAssignment_6_2 )
            // InternalPageGeneratorLanguare.g:5834:3: rule__Text__LpaddingAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Text__LpaddingAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getLpaddingAssignment_6_2()); 

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
    // $ANTLR end "rule__Text__Group_6__2__Impl"


    // $ANTLR start "rule__Text__Group_6__3"
    // InternalPageGeneratorLanguare.g:5842:1: rule__Text__Group_6__3 : rule__Text__Group_6__3__Impl ;
    public final void rule__Text__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5846:1: ( rule__Text__Group_6__3__Impl )
            // InternalPageGeneratorLanguare.g:5847:2: rule__Text__Group_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Text__Group_6__3__Impl();

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
    // $ANTLR end "rule__Text__Group_6__3"


    // $ANTLR start "rule__Text__Group_6__3__Impl"
    // InternalPageGeneratorLanguare.g:5853:1: rule__Text__Group_6__3__Impl : ( ( ',' )? ) ;
    public final void rule__Text__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5857:1: ( ( ( ',' )? ) )
            // InternalPageGeneratorLanguare.g:5858:1: ( ( ',' )? )
            {
            // InternalPageGeneratorLanguare.g:5858:1: ( ( ',' )? )
            // InternalPageGeneratorLanguare.g:5859:2: ( ',' )?
            {
             before(grammarAccess.getTextAccess().getCommaKeyword_6_3()); 
            // InternalPageGeneratorLanguare.g:5860:2: ( ',' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==12) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:5860:3: ','
                    {
                    match(input,12,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getTextAccess().getCommaKeyword_6_3()); 

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
    // $ANTLR end "rule__Text__Group_6__3__Impl"


    // $ANTLR start "rule__Text__Group_7__0"
    // InternalPageGeneratorLanguare.g:5869:1: rule__Text__Group_7__0 : rule__Text__Group_7__0__Impl rule__Text__Group_7__1 ;
    public final void rule__Text__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5873:1: ( rule__Text__Group_7__0__Impl rule__Text__Group_7__1 )
            // InternalPageGeneratorLanguare.g:5874:2: rule__Text__Group_7__0__Impl rule__Text__Group_7__1
            {
            pushFollow(FOLLOW_8);
            rule__Text__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group_7__1();

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
    // $ANTLR end "rule__Text__Group_7__0"


    // $ANTLR start "rule__Text__Group_7__0__Impl"
    // InternalPageGeneratorLanguare.g:5881:1: rule__Text__Group_7__0__Impl : ( 'Padding-right' ) ;
    public final void rule__Text__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5885:1: ( ( 'Padding-right' ) )
            // InternalPageGeneratorLanguare.g:5886:1: ( 'Padding-right' )
            {
            // InternalPageGeneratorLanguare.g:5886:1: ( 'Padding-right' )
            // InternalPageGeneratorLanguare.g:5887:2: 'Padding-right'
            {
             before(grammarAccess.getTextAccess().getPaddingRightKeyword_7_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getPaddingRightKeyword_7_0()); 

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
    // $ANTLR end "rule__Text__Group_7__0__Impl"


    // $ANTLR start "rule__Text__Group_7__1"
    // InternalPageGeneratorLanguare.g:5896:1: rule__Text__Group_7__1 : rule__Text__Group_7__1__Impl rule__Text__Group_7__2 ;
    public final void rule__Text__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5900:1: ( rule__Text__Group_7__1__Impl rule__Text__Group_7__2 )
            // InternalPageGeneratorLanguare.g:5901:2: rule__Text__Group_7__1__Impl rule__Text__Group_7__2
            {
            pushFollow(FOLLOW_19);
            rule__Text__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group_7__2();

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
    // $ANTLR end "rule__Text__Group_7__1"


    // $ANTLR start "rule__Text__Group_7__1__Impl"
    // InternalPageGeneratorLanguare.g:5908:1: rule__Text__Group_7__1__Impl : ( '=' ) ;
    public final void rule__Text__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5912:1: ( ( '=' ) )
            // InternalPageGeneratorLanguare.g:5913:1: ( '=' )
            {
            // InternalPageGeneratorLanguare.g:5913:1: ( '=' )
            // InternalPageGeneratorLanguare.g:5914:2: '='
            {
             before(grammarAccess.getTextAccess().getEqualsSignKeyword_7_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getEqualsSignKeyword_7_1()); 

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
    // $ANTLR end "rule__Text__Group_7__1__Impl"


    // $ANTLR start "rule__Text__Group_7__2"
    // InternalPageGeneratorLanguare.g:5923:1: rule__Text__Group_7__2 : rule__Text__Group_7__2__Impl rule__Text__Group_7__3 ;
    public final void rule__Text__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5927:1: ( rule__Text__Group_7__2__Impl rule__Text__Group_7__3 )
            // InternalPageGeneratorLanguare.g:5928:2: rule__Text__Group_7__2__Impl rule__Text__Group_7__3
            {
            pushFollow(FOLLOW_11);
            rule__Text__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group_7__3();

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
    // $ANTLR end "rule__Text__Group_7__2"


    // $ANTLR start "rule__Text__Group_7__2__Impl"
    // InternalPageGeneratorLanguare.g:5935:1: rule__Text__Group_7__2__Impl : ( ( rule__Text__RpaddingAssignment_7_2 ) ) ;
    public final void rule__Text__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5939:1: ( ( ( rule__Text__RpaddingAssignment_7_2 ) ) )
            // InternalPageGeneratorLanguare.g:5940:1: ( ( rule__Text__RpaddingAssignment_7_2 ) )
            {
            // InternalPageGeneratorLanguare.g:5940:1: ( ( rule__Text__RpaddingAssignment_7_2 ) )
            // InternalPageGeneratorLanguare.g:5941:2: ( rule__Text__RpaddingAssignment_7_2 )
            {
             before(grammarAccess.getTextAccess().getRpaddingAssignment_7_2()); 
            // InternalPageGeneratorLanguare.g:5942:2: ( rule__Text__RpaddingAssignment_7_2 )
            // InternalPageGeneratorLanguare.g:5942:3: rule__Text__RpaddingAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__Text__RpaddingAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getRpaddingAssignment_7_2()); 

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
    // $ANTLR end "rule__Text__Group_7__2__Impl"


    // $ANTLR start "rule__Text__Group_7__3"
    // InternalPageGeneratorLanguare.g:5950:1: rule__Text__Group_7__3 : rule__Text__Group_7__3__Impl ;
    public final void rule__Text__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5954:1: ( rule__Text__Group_7__3__Impl )
            // InternalPageGeneratorLanguare.g:5955:2: rule__Text__Group_7__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Text__Group_7__3__Impl();

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
    // $ANTLR end "rule__Text__Group_7__3"


    // $ANTLR start "rule__Text__Group_7__3__Impl"
    // InternalPageGeneratorLanguare.g:5961:1: rule__Text__Group_7__3__Impl : ( ( ',' )? ) ;
    public final void rule__Text__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5965:1: ( ( ( ',' )? ) )
            // InternalPageGeneratorLanguare.g:5966:1: ( ( ',' )? )
            {
            // InternalPageGeneratorLanguare.g:5966:1: ( ( ',' )? )
            // InternalPageGeneratorLanguare.g:5967:2: ( ',' )?
            {
             before(grammarAccess.getTextAccess().getCommaKeyword_7_3()); 
            // InternalPageGeneratorLanguare.g:5968:2: ( ',' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==12) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:5968:3: ','
                    {
                    match(input,12,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getTextAccess().getCommaKeyword_7_3()); 

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
    // $ANTLR end "rule__Text__Group_7__3__Impl"


    // $ANTLR start "rule__Text__Group_8__0"
    // InternalPageGeneratorLanguare.g:5977:1: rule__Text__Group_8__0 : rule__Text__Group_8__0__Impl rule__Text__Group_8__1 ;
    public final void rule__Text__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5981:1: ( rule__Text__Group_8__0__Impl rule__Text__Group_8__1 )
            // InternalPageGeneratorLanguare.g:5982:2: rule__Text__Group_8__0__Impl rule__Text__Group_8__1
            {
            pushFollow(FOLLOW_8);
            rule__Text__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group_8__1();

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
    // $ANTLR end "rule__Text__Group_8__0"


    // $ANTLR start "rule__Text__Group_8__0__Impl"
    // InternalPageGeneratorLanguare.g:5989:1: rule__Text__Group_8__0__Impl : ( 'Padding-top' ) ;
    public final void rule__Text__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:5993:1: ( ( 'Padding-top' ) )
            // InternalPageGeneratorLanguare.g:5994:1: ( 'Padding-top' )
            {
            // InternalPageGeneratorLanguare.g:5994:1: ( 'Padding-top' )
            // InternalPageGeneratorLanguare.g:5995:2: 'Padding-top'
            {
             before(grammarAccess.getTextAccess().getPaddingTopKeyword_8_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getPaddingTopKeyword_8_0()); 

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
    // $ANTLR end "rule__Text__Group_8__0__Impl"


    // $ANTLR start "rule__Text__Group_8__1"
    // InternalPageGeneratorLanguare.g:6004:1: rule__Text__Group_8__1 : rule__Text__Group_8__1__Impl rule__Text__Group_8__2 ;
    public final void rule__Text__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6008:1: ( rule__Text__Group_8__1__Impl rule__Text__Group_8__2 )
            // InternalPageGeneratorLanguare.g:6009:2: rule__Text__Group_8__1__Impl rule__Text__Group_8__2
            {
            pushFollow(FOLLOW_19);
            rule__Text__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group_8__2();

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
    // $ANTLR end "rule__Text__Group_8__1"


    // $ANTLR start "rule__Text__Group_8__1__Impl"
    // InternalPageGeneratorLanguare.g:6016:1: rule__Text__Group_8__1__Impl : ( '=' ) ;
    public final void rule__Text__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6020:1: ( ( '=' ) )
            // InternalPageGeneratorLanguare.g:6021:1: ( '=' )
            {
            // InternalPageGeneratorLanguare.g:6021:1: ( '=' )
            // InternalPageGeneratorLanguare.g:6022:2: '='
            {
             before(grammarAccess.getTextAccess().getEqualsSignKeyword_8_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getEqualsSignKeyword_8_1()); 

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
    // $ANTLR end "rule__Text__Group_8__1__Impl"


    // $ANTLR start "rule__Text__Group_8__2"
    // InternalPageGeneratorLanguare.g:6031:1: rule__Text__Group_8__2 : rule__Text__Group_8__2__Impl rule__Text__Group_8__3 ;
    public final void rule__Text__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6035:1: ( rule__Text__Group_8__2__Impl rule__Text__Group_8__3 )
            // InternalPageGeneratorLanguare.g:6036:2: rule__Text__Group_8__2__Impl rule__Text__Group_8__3
            {
            pushFollow(FOLLOW_11);
            rule__Text__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group_8__3();

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
    // $ANTLR end "rule__Text__Group_8__2"


    // $ANTLR start "rule__Text__Group_8__2__Impl"
    // InternalPageGeneratorLanguare.g:6043:1: rule__Text__Group_8__2__Impl : ( ( rule__Text__TpaddingAssignment_8_2 ) ) ;
    public final void rule__Text__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6047:1: ( ( ( rule__Text__TpaddingAssignment_8_2 ) ) )
            // InternalPageGeneratorLanguare.g:6048:1: ( ( rule__Text__TpaddingAssignment_8_2 ) )
            {
            // InternalPageGeneratorLanguare.g:6048:1: ( ( rule__Text__TpaddingAssignment_8_2 ) )
            // InternalPageGeneratorLanguare.g:6049:2: ( rule__Text__TpaddingAssignment_8_2 )
            {
             before(grammarAccess.getTextAccess().getTpaddingAssignment_8_2()); 
            // InternalPageGeneratorLanguare.g:6050:2: ( rule__Text__TpaddingAssignment_8_2 )
            // InternalPageGeneratorLanguare.g:6050:3: rule__Text__TpaddingAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__Text__TpaddingAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getTpaddingAssignment_8_2()); 

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
    // $ANTLR end "rule__Text__Group_8__2__Impl"


    // $ANTLR start "rule__Text__Group_8__3"
    // InternalPageGeneratorLanguare.g:6058:1: rule__Text__Group_8__3 : rule__Text__Group_8__3__Impl ;
    public final void rule__Text__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6062:1: ( rule__Text__Group_8__3__Impl )
            // InternalPageGeneratorLanguare.g:6063:2: rule__Text__Group_8__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Text__Group_8__3__Impl();

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
    // $ANTLR end "rule__Text__Group_8__3"


    // $ANTLR start "rule__Text__Group_8__3__Impl"
    // InternalPageGeneratorLanguare.g:6069:1: rule__Text__Group_8__3__Impl : ( ( ',' )? ) ;
    public final void rule__Text__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6073:1: ( ( ( ',' )? ) )
            // InternalPageGeneratorLanguare.g:6074:1: ( ( ',' )? )
            {
            // InternalPageGeneratorLanguare.g:6074:1: ( ( ',' )? )
            // InternalPageGeneratorLanguare.g:6075:2: ( ',' )?
            {
             before(grammarAccess.getTextAccess().getCommaKeyword_8_3()); 
            // InternalPageGeneratorLanguare.g:6076:2: ( ',' )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==12) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:6076:3: ','
                    {
                    match(input,12,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getTextAccess().getCommaKeyword_8_3()); 

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
    // $ANTLR end "rule__Text__Group_8__3__Impl"


    // $ANTLR start "rule__Text__Group_9__0"
    // InternalPageGeneratorLanguare.g:6085:1: rule__Text__Group_9__0 : rule__Text__Group_9__0__Impl rule__Text__Group_9__1 ;
    public final void rule__Text__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6089:1: ( rule__Text__Group_9__0__Impl rule__Text__Group_9__1 )
            // InternalPageGeneratorLanguare.g:6090:2: rule__Text__Group_9__0__Impl rule__Text__Group_9__1
            {
            pushFollow(FOLLOW_8);
            rule__Text__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group_9__1();

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
    // $ANTLR end "rule__Text__Group_9__0"


    // $ANTLR start "rule__Text__Group_9__0__Impl"
    // InternalPageGeneratorLanguare.g:6097:1: rule__Text__Group_9__0__Impl : ( 'Padding-bottom' ) ;
    public final void rule__Text__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6101:1: ( ( 'Padding-bottom' ) )
            // InternalPageGeneratorLanguare.g:6102:1: ( 'Padding-bottom' )
            {
            // InternalPageGeneratorLanguare.g:6102:1: ( 'Padding-bottom' )
            // InternalPageGeneratorLanguare.g:6103:2: 'Padding-bottom'
            {
             before(grammarAccess.getTextAccess().getPaddingBottomKeyword_9_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getPaddingBottomKeyword_9_0()); 

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
    // $ANTLR end "rule__Text__Group_9__0__Impl"


    // $ANTLR start "rule__Text__Group_9__1"
    // InternalPageGeneratorLanguare.g:6112:1: rule__Text__Group_9__1 : rule__Text__Group_9__1__Impl rule__Text__Group_9__2 ;
    public final void rule__Text__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6116:1: ( rule__Text__Group_9__1__Impl rule__Text__Group_9__2 )
            // InternalPageGeneratorLanguare.g:6117:2: rule__Text__Group_9__1__Impl rule__Text__Group_9__2
            {
            pushFollow(FOLLOW_19);
            rule__Text__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group_9__2();

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
    // $ANTLR end "rule__Text__Group_9__1"


    // $ANTLR start "rule__Text__Group_9__1__Impl"
    // InternalPageGeneratorLanguare.g:6124:1: rule__Text__Group_9__1__Impl : ( '=' ) ;
    public final void rule__Text__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6128:1: ( ( '=' ) )
            // InternalPageGeneratorLanguare.g:6129:1: ( '=' )
            {
            // InternalPageGeneratorLanguare.g:6129:1: ( '=' )
            // InternalPageGeneratorLanguare.g:6130:2: '='
            {
             before(grammarAccess.getTextAccess().getEqualsSignKeyword_9_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getEqualsSignKeyword_9_1()); 

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
    // $ANTLR end "rule__Text__Group_9__1__Impl"


    // $ANTLR start "rule__Text__Group_9__2"
    // InternalPageGeneratorLanguare.g:6139:1: rule__Text__Group_9__2 : rule__Text__Group_9__2__Impl rule__Text__Group_9__3 ;
    public final void rule__Text__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6143:1: ( rule__Text__Group_9__2__Impl rule__Text__Group_9__3 )
            // InternalPageGeneratorLanguare.g:6144:2: rule__Text__Group_9__2__Impl rule__Text__Group_9__3
            {
            pushFollow(FOLLOW_11);
            rule__Text__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group_9__3();

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
    // $ANTLR end "rule__Text__Group_9__2"


    // $ANTLR start "rule__Text__Group_9__2__Impl"
    // InternalPageGeneratorLanguare.g:6151:1: rule__Text__Group_9__2__Impl : ( ( rule__Text__BpaddingAssignment_9_2 ) ) ;
    public final void rule__Text__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6155:1: ( ( ( rule__Text__BpaddingAssignment_9_2 ) ) )
            // InternalPageGeneratorLanguare.g:6156:1: ( ( rule__Text__BpaddingAssignment_9_2 ) )
            {
            // InternalPageGeneratorLanguare.g:6156:1: ( ( rule__Text__BpaddingAssignment_9_2 ) )
            // InternalPageGeneratorLanguare.g:6157:2: ( rule__Text__BpaddingAssignment_9_2 )
            {
             before(grammarAccess.getTextAccess().getBpaddingAssignment_9_2()); 
            // InternalPageGeneratorLanguare.g:6158:2: ( rule__Text__BpaddingAssignment_9_2 )
            // InternalPageGeneratorLanguare.g:6158:3: rule__Text__BpaddingAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__Text__BpaddingAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getBpaddingAssignment_9_2()); 

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
    // $ANTLR end "rule__Text__Group_9__2__Impl"


    // $ANTLR start "rule__Text__Group_9__3"
    // InternalPageGeneratorLanguare.g:6166:1: rule__Text__Group_9__3 : rule__Text__Group_9__3__Impl ;
    public final void rule__Text__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6170:1: ( rule__Text__Group_9__3__Impl )
            // InternalPageGeneratorLanguare.g:6171:2: rule__Text__Group_9__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Text__Group_9__3__Impl();

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
    // $ANTLR end "rule__Text__Group_9__3"


    // $ANTLR start "rule__Text__Group_9__3__Impl"
    // InternalPageGeneratorLanguare.g:6177:1: rule__Text__Group_9__3__Impl : ( ( ',' )? ) ;
    public final void rule__Text__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6181:1: ( ( ( ',' )? ) )
            // InternalPageGeneratorLanguare.g:6182:1: ( ( ',' )? )
            {
            // InternalPageGeneratorLanguare.g:6182:1: ( ( ',' )? )
            // InternalPageGeneratorLanguare.g:6183:2: ( ',' )?
            {
             before(grammarAccess.getTextAccess().getCommaKeyword_9_3()); 
            // InternalPageGeneratorLanguare.g:6184:2: ( ',' )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==12) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:6184:3: ','
                    {
                    match(input,12,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getTextAccess().getCommaKeyword_9_3()); 

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
    // $ANTLR end "rule__Text__Group_9__3__Impl"


    // $ANTLR start "rule__Section__Group__0"
    // InternalPageGeneratorLanguare.g:6193:1: rule__Section__Group__0 : rule__Section__Group__0__Impl rule__Section__Group__1 ;
    public final void rule__Section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6197:1: ( rule__Section__Group__0__Impl rule__Section__Group__1 )
            // InternalPageGeneratorLanguare.g:6198:2: rule__Section__Group__0__Impl rule__Section__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Section__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__1();

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
    // $ANTLR end "rule__Section__Group__0"


    // $ANTLR start "rule__Section__Group__0__Impl"
    // InternalPageGeneratorLanguare.g:6205:1: rule__Section__Group__0__Impl : ( 'Section' ) ;
    public final void rule__Section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6209:1: ( ( 'Section' ) )
            // InternalPageGeneratorLanguare.g:6210:1: ( 'Section' )
            {
            // InternalPageGeneratorLanguare.g:6210:1: ( 'Section' )
            // InternalPageGeneratorLanguare.g:6211:2: 'Section'
            {
             before(grammarAccess.getSectionAccess().getSectionKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getSectionKeyword_0()); 

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
    // $ANTLR end "rule__Section__Group__0__Impl"


    // $ANTLR start "rule__Section__Group__1"
    // InternalPageGeneratorLanguare.g:6220:1: rule__Section__Group__1 : rule__Section__Group__1__Impl rule__Section__Group__2 ;
    public final void rule__Section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6224:1: ( rule__Section__Group__1__Impl rule__Section__Group__2 )
            // InternalPageGeneratorLanguare.g:6225:2: rule__Section__Group__1__Impl rule__Section__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Section__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__2();

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
    // $ANTLR end "rule__Section__Group__1"


    // $ANTLR start "rule__Section__Group__1__Impl"
    // InternalPageGeneratorLanguare.g:6232:1: rule__Section__Group__1__Impl : ( ( rule__Section__NameAssignment_1 ) ) ;
    public final void rule__Section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6236:1: ( ( ( rule__Section__NameAssignment_1 ) ) )
            // InternalPageGeneratorLanguare.g:6237:1: ( ( rule__Section__NameAssignment_1 ) )
            {
            // InternalPageGeneratorLanguare.g:6237:1: ( ( rule__Section__NameAssignment_1 ) )
            // InternalPageGeneratorLanguare.g:6238:2: ( rule__Section__NameAssignment_1 )
            {
             before(grammarAccess.getSectionAccess().getNameAssignment_1()); 
            // InternalPageGeneratorLanguare.g:6239:2: ( rule__Section__NameAssignment_1 )
            // InternalPageGeneratorLanguare.g:6239:3: rule__Section__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Section__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Section__Group__1__Impl"


    // $ANTLR start "rule__Section__Group__2"
    // InternalPageGeneratorLanguare.g:6247:1: rule__Section__Group__2 : rule__Section__Group__2__Impl rule__Section__Group__3 ;
    public final void rule__Section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6251:1: ( rule__Section__Group__2__Impl rule__Section__Group__3 )
            // InternalPageGeneratorLanguare.g:6252:2: rule__Section__Group__2__Impl rule__Section__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__Section__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__3();

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
    // $ANTLR end "rule__Section__Group__2"


    // $ANTLR start "rule__Section__Group__2__Impl"
    // InternalPageGeneratorLanguare.g:6259:1: rule__Section__Group__2__Impl : ( '<' ) ;
    public final void rule__Section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6263:1: ( ( '<' ) )
            // InternalPageGeneratorLanguare.g:6264:1: ( '<' )
            {
            // InternalPageGeneratorLanguare.g:6264:1: ( '<' )
            // InternalPageGeneratorLanguare.g:6265:2: '<'
            {
             before(grammarAccess.getSectionAccess().getLessThanSignKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getLessThanSignKeyword_2()); 

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
    // $ANTLR end "rule__Section__Group__2__Impl"


    // $ANTLR start "rule__Section__Group__3"
    // InternalPageGeneratorLanguare.g:6274:1: rule__Section__Group__3 : rule__Section__Group__3__Impl rule__Section__Group__4 ;
    public final void rule__Section__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6278:1: ( rule__Section__Group__3__Impl rule__Section__Group__4 )
            // InternalPageGeneratorLanguare.g:6279:2: rule__Section__Group__3__Impl rule__Section__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__Section__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__4();

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
    // $ANTLR end "rule__Section__Group__3"


    // $ANTLR start "rule__Section__Group__3__Impl"
    // InternalPageGeneratorLanguare.g:6286:1: rule__Section__Group__3__Impl : ( ( rule__Section__Group_3__0 )? ) ;
    public final void rule__Section__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6290:1: ( ( ( rule__Section__Group_3__0 )? ) )
            // InternalPageGeneratorLanguare.g:6291:1: ( ( rule__Section__Group_3__0 )? )
            {
            // InternalPageGeneratorLanguare.g:6291:1: ( ( rule__Section__Group_3__0 )? )
            // InternalPageGeneratorLanguare.g:6292:2: ( rule__Section__Group_3__0 )?
            {
             before(grammarAccess.getSectionAccess().getGroup_3()); 
            // InternalPageGeneratorLanguare.g:6293:2: ( rule__Section__Group_3__0 )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==40) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:6293:3: rule__Section__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Section__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSectionAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Section__Group__3__Impl"


    // $ANTLR start "rule__Section__Group__4"
    // InternalPageGeneratorLanguare.g:6301:1: rule__Section__Group__4 : rule__Section__Group__4__Impl rule__Section__Group__5 ;
    public final void rule__Section__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6305:1: ( rule__Section__Group__4__Impl rule__Section__Group__5 )
            // InternalPageGeneratorLanguare.g:6306:2: rule__Section__Group__4__Impl rule__Section__Group__5
            {
            pushFollow(FOLLOW_27);
            rule__Section__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__5();

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
    // $ANTLR end "rule__Section__Group__4"


    // $ANTLR start "rule__Section__Group__4__Impl"
    // InternalPageGeneratorLanguare.g:6313:1: rule__Section__Group__4__Impl : ( ( rule__Section__Group_4__0 )? ) ;
    public final void rule__Section__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6317:1: ( ( ( rule__Section__Group_4__0 )? ) )
            // InternalPageGeneratorLanguare.g:6318:1: ( ( rule__Section__Group_4__0 )? )
            {
            // InternalPageGeneratorLanguare.g:6318:1: ( ( rule__Section__Group_4__0 )? )
            // InternalPageGeneratorLanguare.g:6319:2: ( rule__Section__Group_4__0 )?
            {
             before(grammarAccess.getSectionAccess().getGroup_4()); 
            // InternalPageGeneratorLanguare.g:6320:2: ( rule__Section__Group_4__0 )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==41) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:6320:3: rule__Section__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Section__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSectionAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Section__Group__4__Impl"


    // $ANTLR start "rule__Section__Group__5"
    // InternalPageGeneratorLanguare.g:6328:1: rule__Section__Group__5 : rule__Section__Group__5__Impl rule__Section__Group__6 ;
    public final void rule__Section__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6332:1: ( rule__Section__Group__5__Impl rule__Section__Group__6 )
            // InternalPageGeneratorLanguare.g:6333:2: rule__Section__Group__5__Impl rule__Section__Group__6
            {
            pushFollow(FOLLOW_27);
            rule__Section__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__6();

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
    // $ANTLR end "rule__Section__Group__5"


    // $ANTLR start "rule__Section__Group__5__Impl"
    // InternalPageGeneratorLanguare.g:6340:1: rule__Section__Group__5__Impl : ( ( rule__Section__Group_5__0 )? ) ;
    public final void rule__Section__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6344:1: ( ( ( rule__Section__Group_5__0 )? ) )
            // InternalPageGeneratorLanguare.g:6345:1: ( ( rule__Section__Group_5__0 )? )
            {
            // InternalPageGeneratorLanguare.g:6345:1: ( ( rule__Section__Group_5__0 )? )
            // InternalPageGeneratorLanguare.g:6346:2: ( rule__Section__Group_5__0 )?
            {
             before(grammarAccess.getSectionAccess().getGroup_5()); 
            // InternalPageGeneratorLanguare.g:6347:2: ( rule__Section__Group_5__0 )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==42) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:6347:3: rule__Section__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Section__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSectionAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Section__Group__5__Impl"


    // $ANTLR start "rule__Section__Group__6"
    // InternalPageGeneratorLanguare.g:6355:1: rule__Section__Group__6 : rule__Section__Group__6__Impl rule__Section__Group__7 ;
    public final void rule__Section__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6359:1: ( rule__Section__Group__6__Impl rule__Section__Group__7 )
            // InternalPageGeneratorLanguare.g:6360:2: rule__Section__Group__6__Impl rule__Section__Group__7
            {
            pushFollow(FOLLOW_27);
            rule__Section__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__7();

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
    // $ANTLR end "rule__Section__Group__6"


    // $ANTLR start "rule__Section__Group__6__Impl"
    // InternalPageGeneratorLanguare.g:6367:1: rule__Section__Group__6__Impl : ( ( rule__Section__Group_6__0 )? ) ;
    public final void rule__Section__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6371:1: ( ( ( rule__Section__Group_6__0 )? ) )
            // InternalPageGeneratorLanguare.g:6372:1: ( ( rule__Section__Group_6__0 )? )
            {
            // InternalPageGeneratorLanguare.g:6372:1: ( ( rule__Section__Group_6__0 )? )
            // InternalPageGeneratorLanguare.g:6373:2: ( rule__Section__Group_6__0 )?
            {
             before(grammarAccess.getSectionAccess().getGroup_6()); 
            // InternalPageGeneratorLanguare.g:6374:2: ( rule__Section__Group_6__0 )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==43) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:6374:3: rule__Section__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Section__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSectionAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Section__Group__6__Impl"


    // $ANTLR start "rule__Section__Group__7"
    // InternalPageGeneratorLanguare.g:6382:1: rule__Section__Group__7 : rule__Section__Group__7__Impl rule__Section__Group__8 ;
    public final void rule__Section__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6386:1: ( rule__Section__Group__7__Impl rule__Section__Group__8 )
            // InternalPageGeneratorLanguare.g:6387:2: rule__Section__Group__7__Impl rule__Section__Group__8
            {
            pushFollow(FOLLOW_27);
            rule__Section__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__8();

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
    // $ANTLR end "rule__Section__Group__7"


    // $ANTLR start "rule__Section__Group__7__Impl"
    // InternalPageGeneratorLanguare.g:6394:1: rule__Section__Group__7__Impl : ( ( rule__Section__Group_7__0 )? ) ;
    public final void rule__Section__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6398:1: ( ( ( rule__Section__Group_7__0 )? ) )
            // InternalPageGeneratorLanguare.g:6399:1: ( ( rule__Section__Group_7__0 )? )
            {
            // InternalPageGeneratorLanguare.g:6399:1: ( ( rule__Section__Group_7__0 )? )
            // InternalPageGeneratorLanguare.g:6400:2: ( rule__Section__Group_7__0 )?
            {
             before(grammarAccess.getSectionAccess().getGroup_7()); 
            // InternalPageGeneratorLanguare.g:6401:2: ( rule__Section__Group_7__0 )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==28) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:6401:3: rule__Section__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Section__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSectionAccess().getGroup_7()); 

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
    // $ANTLR end "rule__Section__Group__7__Impl"


    // $ANTLR start "rule__Section__Group__8"
    // InternalPageGeneratorLanguare.g:6409:1: rule__Section__Group__8 : rule__Section__Group__8__Impl rule__Section__Group__9 ;
    public final void rule__Section__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6413:1: ( rule__Section__Group__8__Impl rule__Section__Group__9 )
            // InternalPageGeneratorLanguare.g:6414:2: rule__Section__Group__8__Impl rule__Section__Group__9
            {
            pushFollow(FOLLOW_27);
            rule__Section__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__9();

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
    // $ANTLR end "rule__Section__Group__8"


    // $ANTLR start "rule__Section__Group__8__Impl"
    // InternalPageGeneratorLanguare.g:6421:1: rule__Section__Group__8__Impl : ( ( rule__Section__Group_8__0 )? ) ;
    public final void rule__Section__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6425:1: ( ( ( rule__Section__Group_8__0 )? ) )
            // InternalPageGeneratorLanguare.g:6426:1: ( ( rule__Section__Group_8__0 )? )
            {
            // InternalPageGeneratorLanguare.g:6426:1: ( ( rule__Section__Group_8__0 )? )
            // InternalPageGeneratorLanguare.g:6427:2: ( rule__Section__Group_8__0 )?
            {
             before(grammarAccess.getSectionAccess().getGroup_8()); 
            // InternalPageGeneratorLanguare.g:6428:2: ( rule__Section__Group_8__0 )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==29) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:6428:3: rule__Section__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Section__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSectionAccess().getGroup_8()); 

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
    // $ANTLR end "rule__Section__Group__8__Impl"


    // $ANTLR start "rule__Section__Group__9"
    // InternalPageGeneratorLanguare.g:6436:1: rule__Section__Group__9 : rule__Section__Group__9__Impl rule__Section__Group__10 ;
    public final void rule__Section__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6440:1: ( rule__Section__Group__9__Impl rule__Section__Group__10 )
            // InternalPageGeneratorLanguare.g:6441:2: rule__Section__Group__9__Impl rule__Section__Group__10
            {
            pushFollow(FOLLOW_27);
            rule__Section__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__10();

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
    // $ANTLR end "rule__Section__Group__9"


    // $ANTLR start "rule__Section__Group__9__Impl"
    // InternalPageGeneratorLanguare.g:6448:1: rule__Section__Group__9__Impl : ( ( rule__Section__Group_9__0 )? ) ;
    public final void rule__Section__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6452:1: ( ( ( rule__Section__Group_9__0 )? ) )
            // InternalPageGeneratorLanguare.g:6453:1: ( ( rule__Section__Group_9__0 )? )
            {
            // InternalPageGeneratorLanguare.g:6453:1: ( ( rule__Section__Group_9__0 )? )
            // InternalPageGeneratorLanguare.g:6454:2: ( rule__Section__Group_9__0 )?
            {
             before(grammarAccess.getSectionAccess().getGroup_9()); 
            // InternalPageGeneratorLanguare.g:6455:2: ( rule__Section__Group_9__0 )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==30) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:6455:3: rule__Section__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Section__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSectionAccess().getGroup_9()); 

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
    // $ANTLR end "rule__Section__Group__9__Impl"


    // $ANTLR start "rule__Section__Group__10"
    // InternalPageGeneratorLanguare.g:6463:1: rule__Section__Group__10 : rule__Section__Group__10__Impl rule__Section__Group__11 ;
    public final void rule__Section__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6467:1: ( rule__Section__Group__10__Impl rule__Section__Group__11 )
            // InternalPageGeneratorLanguare.g:6468:2: rule__Section__Group__10__Impl rule__Section__Group__11
            {
            pushFollow(FOLLOW_27);
            rule__Section__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__11();

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
    // $ANTLR end "rule__Section__Group__10"


    // $ANTLR start "rule__Section__Group__10__Impl"
    // InternalPageGeneratorLanguare.g:6475:1: rule__Section__Group__10__Impl : ( ( rule__Section__Group_10__0 )? ) ;
    public final void rule__Section__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6479:1: ( ( ( rule__Section__Group_10__0 )? ) )
            // InternalPageGeneratorLanguare.g:6480:1: ( ( rule__Section__Group_10__0 )? )
            {
            // InternalPageGeneratorLanguare.g:6480:1: ( ( rule__Section__Group_10__0 )? )
            // InternalPageGeneratorLanguare.g:6481:2: ( rule__Section__Group_10__0 )?
            {
             before(grammarAccess.getSectionAccess().getGroup_10()); 
            // InternalPageGeneratorLanguare.g:6482:2: ( rule__Section__Group_10__0 )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==31) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:6482:3: rule__Section__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Section__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSectionAccess().getGroup_10()); 

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
    // $ANTLR end "rule__Section__Group__10__Impl"


    // $ANTLR start "rule__Section__Group__11"
    // InternalPageGeneratorLanguare.g:6490:1: rule__Section__Group__11 : rule__Section__Group__11__Impl rule__Section__Group__12 ;
    public final void rule__Section__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6494:1: ( rule__Section__Group__11__Impl rule__Section__Group__12 )
            // InternalPageGeneratorLanguare.g:6495:2: rule__Section__Group__11__Impl rule__Section__Group__12
            {
            pushFollow(FOLLOW_5);
            rule__Section__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__12();

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
    // $ANTLR end "rule__Section__Group__11"


    // $ANTLR start "rule__Section__Group__11__Impl"
    // InternalPageGeneratorLanguare.g:6502:1: rule__Section__Group__11__Impl : ( '>' ) ;
    public final void rule__Section__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6506:1: ( ( '>' ) )
            // InternalPageGeneratorLanguare.g:6507:1: ( '>' )
            {
            // InternalPageGeneratorLanguare.g:6507:1: ( '>' )
            // InternalPageGeneratorLanguare.g:6508:2: '>'
            {
             before(grammarAccess.getSectionAccess().getGreaterThanSignKeyword_11()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getGreaterThanSignKeyword_11()); 

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
    // $ANTLR end "rule__Section__Group__11__Impl"


    // $ANTLR start "rule__Section__Group__12"
    // InternalPageGeneratorLanguare.g:6517:1: rule__Section__Group__12 : rule__Section__Group__12__Impl rule__Section__Group__13 ;
    public final void rule__Section__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6521:1: ( rule__Section__Group__12__Impl rule__Section__Group__13 )
            // InternalPageGeneratorLanguare.g:6522:2: rule__Section__Group__12__Impl rule__Section__Group__13
            {
            pushFollow(FOLLOW_28);
            rule__Section__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__13();

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
    // $ANTLR end "rule__Section__Group__12"


    // $ANTLR start "rule__Section__Group__12__Impl"
    // InternalPageGeneratorLanguare.g:6529:1: rule__Section__Group__12__Impl : ( '{' ) ;
    public final void rule__Section__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6533:1: ( ( '{' ) )
            // InternalPageGeneratorLanguare.g:6534:1: ( '{' )
            {
            // InternalPageGeneratorLanguare.g:6534:1: ( '{' )
            // InternalPageGeneratorLanguare.g:6535:2: '{'
            {
             before(grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_12()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_12()); 

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
    // $ANTLR end "rule__Section__Group__12__Impl"


    // $ANTLR start "rule__Section__Group__13"
    // InternalPageGeneratorLanguare.g:6544:1: rule__Section__Group__13 : rule__Section__Group__13__Impl rule__Section__Group__14 ;
    public final void rule__Section__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6548:1: ( rule__Section__Group__13__Impl rule__Section__Group__14 )
            // InternalPageGeneratorLanguare.g:6549:2: rule__Section__Group__13__Impl rule__Section__Group__14
            {
            pushFollow(FOLLOW_29);
            rule__Section__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__14();

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
    // $ANTLR end "rule__Section__Group__13"


    // $ANTLR start "rule__Section__Group__13__Impl"
    // InternalPageGeneratorLanguare.g:6556:1: rule__Section__Group__13__Impl : ( ( ( rule__Section__BodyElementsAssignment_13 ) ) ( ( rule__Section__BodyElementsAssignment_13 )* ) ) ;
    public final void rule__Section__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6560:1: ( ( ( ( rule__Section__BodyElementsAssignment_13 ) ) ( ( rule__Section__BodyElementsAssignment_13 )* ) ) )
            // InternalPageGeneratorLanguare.g:6561:1: ( ( ( rule__Section__BodyElementsAssignment_13 ) ) ( ( rule__Section__BodyElementsAssignment_13 )* ) )
            {
            // InternalPageGeneratorLanguare.g:6561:1: ( ( ( rule__Section__BodyElementsAssignment_13 ) ) ( ( rule__Section__BodyElementsAssignment_13 )* ) )
            // InternalPageGeneratorLanguare.g:6562:2: ( ( rule__Section__BodyElementsAssignment_13 ) ) ( ( rule__Section__BodyElementsAssignment_13 )* )
            {
            // InternalPageGeneratorLanguare.g:6562:2: ( ( rule__Section__BodyElementsAssignment_13 ) )
            // InternalPageGeneratorLanguare.g:6563:3: ( rule__Section__BodyElementsAssignment_13 )
            {
             before(grammarAccess.getSectionAccess().getBodyElementsAssignment_13()); 
            // InternalPageGeneratorLanguare.g:6564:3: ( rule__Section__BodyElementsAssignment_13 )
            // InternalPageGeneratorLanguare.g:6564:4: rule__Section__BodyElementsAssignment_13
            {
            pushFollow(FOLLOW_15);
            rule__Section__BodyElementsAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getBodyElementsAssignment_13()); 

            }

            // InternalPageGeneratorLanguare.g:6567:2: ( ( rule__Section__BodyElementsAssignment_13 )* )
            // InternalPageGeneratorLanguare.g:6568:3: ( rule__Section__BodyElementsAssignment_13 )*
            {
             before(grammarAccess.getSectionAccess().getBodyElementsAssignment_13()); 
            // InternalPageGeneratorLanguare.g:6569:3: ( rule__Section__BodyElementsAssignment_13 )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==22||LA77_0==32||(LA77_0>=35 && LA77_0<=36)||(LA77_0>=38 && LA77_0<=39)||LA77_0==45||LA77_0==48) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // InternalPageGeneratorLanguare.g:6569:4: rule__Section__BodyElementsAssignment_13
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Section__BodyElementsAssignment_13();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);

             after(grammarAccess.getSectionAccess().getBodyElementsAssignment_13()); 

            }


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
    // $ANTLR end "rule__Section__Group__13__Impl"


    // $ANTLR start "rule__Section__Group__14"
    // InternalPageGeneratorLanguare.g:6578:1: rule__Section__Group__14 : rule__Section__Group__14__Impl ;
    public final void rule__Section__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6582:1: ( rule__Section__Group__14__Impl )
            // InternalPageGeneratorLanguare.g:6583:2: rule__Section__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group__14__Impl();

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
    // $ANTLR end "rule__Section__Group__14"


    // $ANTLR start "rule__Section__Group__14__Impl"
    // InternalPageGeneratorLanguare.g:6589:1: rule__Section__Group__14__Impl : ( '}' ) ;
    public final void rule__Section__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6593:1: ( ( '}' ) )
            // InternalPageGeneratorLanguare.g:6594:1: ( '}' )
            {
            // InternalPageGeneratorLanguare.g:6594:1: ( '}' )
            // InternalPageGeneratorLanguare.g:6595:2: '}'
            {
             before(grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_14()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_14()); 

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
    // $ANTLR end "rule__Section__Group__14__Impl"


    // $ANTLR start "rule__Section__Group_3__0"
    // InternalPageGeneratorLanguare.g:6605:1: rule__Section__Group_3__0 : rule__Section__Group_3__0__Impl rule__Section__Group_3__1 ;
    public final void rule__Section__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6609:1: ( rule__Section__Group_3__0__Impl rule__Section__Group_3__1 )
            // InternalPageGeneratorLanguare.g:6610:2: rule__Section__Group_3__0__Impl rule__Section__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__Section__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group_3__1();

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
    // $ANTLR end "rule__Section__Group_3__0"


    // $ANTLR start "rule__Section__Group_3__0__Impl"
    // InternalPageGeneratorLanguare.g:6617:1: rule__Section__Group_3__0__Impl : ( 'Background-Colour' ) ;
    public final void rule__Section__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6621:1: ( ( 'Background-Colour' ) )
            // InternalPageGeneratorLanguare.g:6622:1: ( 'Background-Colour' )
            {
            // InternalPageGeneratorLanguare.g:6622:1: ( 'Background-Colour' )
            // InternalPageGeneratorLanguare.g:6623:2: 'Background-Colour'
            {
             before(grammarAccess.getSectionAccess().getBackgroundColourKeyword_3_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getBackgroundColourKeyword_3_0()); 

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
    // $ANTLR end "rule__Section__Group_3__0__Impl"


    // $ANTLR start "rule__Section__Group_3__1"
    // InternalPageGeneratorLanguare.g:6632:1: rule__Section__Group_3__1 : rule__Section__Group_3__1__Impl rule__Section__Group_3__2 ;
    public final void rule__Section__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6636:1: ( rule__Section__Group_3__1__Impl rule__Section__Group_3__2 )
            // InternalPageGeneratorLanguare.g:6637:2: rule__Section__Group_3__1__Impl rule__Section__Group_3__2
            {
            pushFollow(FOLLOW_21);
            rule__Section__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group_3__2();

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
    // $ANTLR end "rule__Section__Group_3__1"


    // $ANTLR start "rule__Section__Group_3__1__Impl"
    // InternalPageGeneratorLanguare.g:6644:1: rule__Section__Group_3__1__Impl : ( '=' ) ;
    public final void rule__Section__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6648:1: ( ( '=' ) )
            // InternalPageGeneratorLanguare.g:6649:1: ( '=' )
            {
            // InternalPageGeneratorLanguare.g:6649:1: ( '=' )
            // InternalPageGeneratorLanguare.g:6650:2: '='
            {
             before(grammarAccess.getSectionAccess().getEqualsSignKeyword_3_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getEqualsSignKeyword_3_1()); 

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
    // $ANTLR end "rule__Section__Group_3__1__Impl"


    // $ANTLR start "rule__Section__Group_3__2"
    // InternalPageGeneratorLanguare.g:6659:1: rule__Section__Group_3__2 : rule__Section__Group_3__2__Impl rule__Section__Group_3__3 ;
    public final void rule__Section__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6663:1: ( rule__Section__Group_3__2__Impl rule__Section__Group_3__3 )
            // InternalPageGeneratorLanguare.g:6664:2: rule__Section__Group_3__2__Impl rule__Section__Group_3__3
            {
            pushFollow(FOLLOW_11);
            rule__Section__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group_3__3();

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
    // $ANTLR end "rule__Section__Group_3__2"


    // $ANTLR start "rule__Section__Group_3__2__Impl"
    // InternalPageGeneratorLanguare.g:6671:1: rule__Section__Group_3__2__Impl : ( ( rule__Section__BgColorAssignment_3_2 ) ) ;
    public final void rule__Section__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6675:1: ( ( ( rule__Section__BgColorAssignment_3_2 ) ) )
            // InternalPageGeneratorLanguare.g:6676:1: ( ( rule__Section__BgColorAssignment_3_2 ) )
            {
            // InternalPageGeneratorLanguare.g:6676:1: ( ( rule__Section__BgColorAssignment_3_2 ) )
            // InternalPageGeneratorLanguare.g:6677:2: ( rule__Section__BgColorAssignment_3_2 )
            {
             before(grammarAccess.getSectionAccess().getBgColorAssignment_3_2()); 
            // InternalPageGeneratorLanguare.g:6678:2: ( rule__Section__BgColorAssignment_3_2 )
            // InternalPageGeneratorLanguare.g:6678:3: rule__Section__BgColorAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Section__BgColorAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getBgColorAssignment_3_2()); 

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
    // $ANTLR end "rule__Section__Group_3__2__Impl"


    // $ANTLR start "rule__Section__Group_3__3"
    // InternalPageGeneratorLanguare.g:6686:1: rule__Section__Group_3__3 : rule__Section__Group_3__3__Impl ;
    public final void rule__Section__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6690:1: ( rule__Section__Group_3__3__Impl )
            // InternalPageGeneratorLanguare.g:6691:2: rule__Section__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group_3__3__Impl();

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
    // $ANTLR end "rule__Section__Group_3__3"


    // $ANTLR start "rule__Section__Group_3__3__Impl"
    // InternalPageGeneratorLanguare.g:6697:1: rule__Section__Group_3__3__Impl : ( ( ',' )? ) ;
    public final void rule__Section__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6701:1: ( ( ( ',' )? ) )
            // InternalPageGeneratorLanguare.g:6702:1: ( ( ',' )? )
            {
            // InternalPageGeneratorLanguare.g:6702:1: ( ( ',' )? )
            // InternalPageGeneratorLanguare.g:6703:2: ( ',' )?
            {
             before(grammarAccess.getSectionAccess().getCommaKeyword_3_3()); 
            // InternalPageGeneratorLanguare.g:6704:2: ( ',' )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==12) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:6704:3: ','
                    {
                    match(input,12,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getSectionAccess().getCommaKeyword_3_3()); 

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
    // $ANTLR end "rule__Section__Group_3__3__Impl"


    // $ANTLR start "rule__Section__Group_4__0"
    // InternalPageGeneratorLanguare.g:6713:1: rule__Section__Group_4__0 : rule__Section__Group_4__0__Impl rule__Section__Group_4__1 ;
    public final void rule__Section__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6717:1: ( rule__Section__Group_4__0__Impl rule__Section__Group_4__1 )
            // InternalPageGeneratorLanguare.g:6718:2: rule__Section__Group_4__0__Impl rule__Section__Group_4__1
            {
            pushFollow(FOLLOW_8);
            rule__Section__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group_4__1();

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
    // $ANTLR end "rule__Section__Group_4__0"


    // $ANTLR start "rule__Section__Group_4__0__Impl"
    // InternalPageGeneratorLanguare.g:6725:1: rule__Section__Group_4__0__Impl : ( 'Size' ) ;
    public final void rule__Section__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6729:1: ( ( 'Size' ) )
            // InternalPageGeneratorLanguare.g:6730:1: ( 'Size' )
            {
            // InternalPageGeneratorLanguare.g:6730:1: ( 'Size' )
            // InternalPageGeneratorLanguare.g:6731:2: 'Size'
            {
             before(grammarAccess.getSectionAccess().getSizeKeyword_4_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getSizeKeyword_4_0()); 

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
    // $ANTLR end "rule__Section__Group_4__0__Impl"


    // $ANTLR start "rule__Section__Group_4__1"
    // InternalPageGeneratorLanguare.g:6740:1: rule__Section__Group_4__1 : rule__Section__Group_4__1__Impl rule__Section__Group_4__2 ;
    public final void rule__Section__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6744:1: ( rule__Section__Group_4__1__Impl rule__Section__Group_4__2 )
            // InternalPageGeneratorLanguare.g:6745:2: rule__Section__Group_4__1__Impl rule__Section__Group_4__2
            {
            pushFollow(FOLLOW_25);
            rule__Section__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group_4__2();

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
    // $ANTLR end "rule__Section__Group_4__1"


    // $ANTLR start "rule__Section__Group_4__1__Impl"
    // InternalPageGeneratorLanguare.g:6752:1: rule__Section__Group_4__1__Impl : ( '=' ) ;
    public final void rule__Section__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6756:1: ( ( '=' ) )
            // InternalPageGeneratorLanguare.g:6757:1: ( '=' )
            {
            // InternalPageGeneratorLanguare.g:6757:1: ( '=' )
            // InternalPageGeneratorLanguare.g:6758:2: '='
            {
             before(grammarAccess.getSectionAccess().getEqualsSignKeyword_4_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getEqualsSignKeyword_4_1()); 

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
    // $ANTLR end "rule__Section__Group_4__1__Impl"


    // $ANTLR start "rule__Section__Group_4__2"
    // InternalPageGeneratorLanguare.g:6767:1: rule__Section__Group_4__2 : rule__Section__Group_4__2__Impl rule__Section__Group_4__3 ;
    public final void rule__Section__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6771:1: ( rule__Section__Group_4__2__Impl rule__Section__Group_4__3 )
            // InternalPageGeneratorLanguare.g:6772:2: rule__Section__Group_4__2__Impl rule__Section__Group_4__3
            {
            pushFollow(FOLLOW_11);
            rule__Section__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group_4__3();

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
    // $ANTLR end "rule__Section__Group_4__2"


    // $ANTLR start "rule__Section__Group_4__2__Impl"
    // InternalPageGeneratorLanguare.g:6779:1: rule__Section__Group_4__2__Impl : ( ( rule__Section__SizeAssignment_4_2 ) ) ;
    public final void rule__Section__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6783:1: ( ( ( rule__Section__SizeAssignment_4_2 ) ) )
            // InternalPageGeneratorLanguare.g:6784:1: ( ( rule__Section__SizeAssignment_4_2 ) )
            {
            // InternalPageGeneratorLanguare.g:6784:1: ( ( rule__Section__SizeAssignment_4_2 ) )
            // InternalPageGeneratorLanguare.g:6785:2: ( rule__Section__SizeAssignment_4_2 )
            {
             before(grammarAccess.getSectionAccess().getSizeAssignment_4_2()); 
            // InternalPageGeneratorLanguare.g:6786:2: ( rule__Section__SizeAssignment_4_2 )
            // InternalPageGeneratorLanguare.g:6786:3: rule__Section__SizeAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Section__SizeAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getSizeAssignment_4_2()); 

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
    // $ANTLR end "rule__Section__Group_4__2__Impl"


    // $ANTLR start "rule__Section__Group_4__3"
    // InternalPageGeneratorLanguare.g:6794:1: rule__Section__Group_4__3 : rule__Section__Group_4__3__Impl ;
    public final void rule__Section__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6798:1: ( rule__Section__Group_4__3__Impl )
            // InternalPageGeneratorLanguare.g:6799:2: rule__Section__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group_4__3__Impl();

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
    // $ANTLR end "rule__Section__Group_4__3"


    // $ANTLR start "rule__Section__Group_4__3__Impl"
    // InternalPageGeneratorLanguare.g:6805:1: rule__Section__Group_4__3__Impl : ( ( ',' )? ) ;
    public final void rule__Section__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6809:1: ( ( ( ',' )? ) )
            // InternalPageGeneratorLanguare.g:6810:1: ( ( ',' )? )
            {
            // InternalPageGeneratorLanguare.g:6810:1: ( ( ',' )? )
            // InternalPageGeneratorLanguare.g:6811:2: ( ',' )?
            {
             before(grammarAccess.getSectionAccess().getCommaKeyword_4_3()); 
            // InternalPageGeneratorLanguare.g:6812:2: ( ',' )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==12) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:6812:3: ','
                    {
                    match(input,12,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getSectionAccess().getCommaKeyword_4_3()); 

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
    // $ANTLR end "rule__Section__Group_4__3__Impl"


    // $ANTLR start "rule__Section__Group_5__0"
    // InternalPageGeneratorLanguare.g:6821:1: rule__Section__Group_5__0 : rule__Section__Group_5__0__Impl rule__Section__Group_5__1 ;
    public final void rule__Section__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6825:1: ( rule__Section__Group_5__0__Impl rule__Section__Group_5__1 )
            // InternalPageGeneratorLanguare.g:6826:2: rule__Section__Group_5__0__Impl rule__Section__Group_5__1
            {
            pushFollow(FOLLOW_8);
            rule__Section__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group_5__1();

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
    // $ANTLR end "rule__Section__Group_5__0"


    // $ANTLR start "rule__Section__Group_5__0__Impl"
    // InternalPageGeneratorLanguare.g:6833:1: rule__Section__Group_5__0__Impl : ( 'Section-location' ) ;
    public final void rule__Section__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6837:1: ( ( 'Section-location' ) )
            // InternalPageGeneratorLanguare.g:6838:1: ( 'Section-location' )
            {
            // InternalPageGeneratorLanguare.g:6838:1: ( 'Section-location' )
            // InternalPageGeneratorLanguare.g:6839:2: 'Section-location'
            {
             before(grammarAccess.getSectionAccess().getSectionLocationKeyword_5_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getSectionLocationKeyword_5_0()); 

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
    // $ANTLR end "rule__Section__Group_5__0__Impl"


    // $ANTLR start "rule__Section__Group_5__1"
    // InternalPageGeneratorLanguare.g:6848:1: rule__Section__Group_5__1 : rule__Section__Group_5__1__Impl rule__Section__Group_5__2 ;
    public final void rule__Section__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6852:1: ( rule__Section__Group_5__1__Impl rule__Section__Group_5__2 )
            // InternalPageGeneratorLanguare.g:6853:2: rule__Section__Group_5__1__Impl rule__Section__Group_5__2
            {
            pushFollow(FOLLOW_9);
            rule__Section__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group_5__2();

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
    // $ANTLR end "rule__Section__Group_5__1"


    // $ANTLR start "rule__Section__Group_5__1__Impl"
    // InternalPageGeneratorLanguare.g:6860:1: rule__Section__Group_5__1__Impl : ( '=' ) ;
    public final void rule__Section__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6864:1: ( ( '=' ) )
            // InternalPageGeneratorLanguare.g:6865:1: ( '=' )
            {
            // InternalPageGeneratorLanguare.g:6865:1: ( '=' )
            // InternalPageGeneratorLanguare.g:6866:2: '='
            {
             before(grammarAccess.getSectionAccess().getEqualsSignKeyword_5_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getEqualsSignKeyword_5_1()); 

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
    // $ANTLR end "rule__Section__Group_5__1__Impl"


    // $ANTLR start "rule__Section__Group_5__2"
    // InternalPageGeneratorLanguare.g:6875:1: rule__Section__Group_5__2 : rule__Section__Group_5__2__Impl rule__Section__Group_5__3 ;
    public final void rule__Section__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6879:1: ( rule__Section__Group_5__2__Impl rule__Section__Group_5__3 )
            // InternalPageGeneratorLanguare.g:6880:2: rule__Section__Group_5__2__Impl rule__Section__Group_5__3
            {
            pushFollow(FOLLOW_11);
            rule__Section__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group_5__3();

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
    // $ANTLR end "rule__Section__Group_5__2"


    // $ANTLR start "rule__Section__Group_5__2__Impl"
    // InternalPageGeneratorLanguare.g:6887:1: rule__Section__Group_5__2__Impl : ( ( rule__Section__LocationAssignment_5_2 ) ) ;
    public final void rule__Section__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6891:1: ( ( ( rule__Section__LocationAssignment_5_2 ) ) )
            // InternalPageGeneratorLanguare.g:6892:1: ( ( rule__Section__LocationAssignment_5_2 ) )
            {
            // InternalPageGeneratorLanguare.g:6892:1: ( ( rule__Section__LocationAssignment_5_2 ) )
            // InternalPageGeneratorLanguare.g:6893:2: ( rule__Section__LocationAssignment_5_2 )
            {
             before(grammarAccess.getSectionAccess().getLocationAssignment_5_2()); 
            // InternalPageGeneratorLanguare.g:6894:2: ( rule__Section__LocationAssignment_5_2 )
            // InternalPageGeneratorLanguare.g:6894:3: rule__Section__LocationAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Section__LocationAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getLocationAssignment_5_2()); 

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
    // $ANTLR end "rule__Section__Group_5__2__Impl"


    // $ANTLR start "rule__Section__Group_5__3"
    // InternalPageGeneratorLanguare.g:6902:1: rule__Section__Group_5__3 : rule__Section__Group_5__3__Impl ;
    public final void rule__Section__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6906:1: ( rule__Section__Group_5__3__Impl )
            // InternalPageGeneratorLanguare.g:6907:2: rule__Section__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group_5__3__Impl();

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
    // $ANTLR end "rule__Section__Group_5__3"


    // $ANTLR start "rule__Section__Group_5__3__Impl"
    // InternalPageGeneratorLanguare.g:6913:1: rule__Section__Group_5__3__Impl : ( ( ',' )? ) ;
    public final void rule__Section__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6917:1: ( ( ( ',' )? ) )
            // InternalPageGeneratorLanguare.g:6918:1: ( ( ',' )? )
            {
            // InternalPageGeneratorLanguare.g:6918:1: ( ( ',' )? )
            // InternalPageGeneratorLanguare.g:6919:2: ( ',' )?
            {
             before(grammarAccess.getSectionAccess().getCommaKeyword_5_3()); 
            // InternalPageGeneratorLanguare.g:6920:2: ( ',' )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==12) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:6920:3: ','
                    {
                    match(input,12,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getSectionAccess().getCommaKeyword_5_3()); 

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
    // $ANTLR end "rule__Section__Group_5__3__Impl"


    // $ANTLR start "rule__Section__Group_6__0"
    // InternalPageGeneratorLanguare.g:6929:1: rule__Section__Group_6__0 : rule__Section__Group_6__0__Impl rule__Section__Group_6__1 ;
    public final void rule__Section__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6933:1: ( rule__Section__Group_6__0__Impl rule__Section__Group_6__1 )
            // InternalPageGeneratorLanguare.g:6934:2: rule__Section__Group_6__0__Impl rule__Section__Group_6__1
            {
            pushFollow(FOLLOW_8);
            rule__Section__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group_6__1();

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
    // $ANTLR end "rule__Section__Group_6__0"


    // $ANTLR start "rule__Section__Group_6__0__Impl"
    // InternalPageGeneratorLanguare.g:6941:1: rule__Section__Group_6__0__Impl : ( 'Text-location' ) ;
    public final void rule__Section__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6945:1: ( ( 'Text-location' ) )
            // InternalPageGeneratorLanguare.g:6946:1: ( 'Text-location' )
            {
            // InternalPageGeneratorLanguare.g:6946:1: ( 'Text-location' )
            // InternalPageGeneratorLanguare.g:6947:2: 'Text-location'
            {
             before(grammarAccess.getSectionAccess().getTextLocationKeyword_6_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getTextLocationKeyword_6_0()); 

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
    // $ANTLR end "rule__Section__Group_6__0__Impl"


    // $ANTLR start "rule__Section__Group_6__1"
    // InternalPageGeneratorLanguare.g:6956:1: rule__Section__Group_6__1 : rule__Section__Group_6__1__Impl rule__Section__Group_6__2 ;
    public final void rule__Section__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6960:1: ( rule__Section__Group_6__1__Impl rule__Section__Group_6__2 )
            // InternalPageGeneratorLanguare.g:6961:2: rule__Section__Group_6__1__Impl rule__Section__Group_6__2
            {
            pushFollow(FOLLOW_9);
            rule__Section__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group_6__2();

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
    // $ANTLR end "rule__Section__Group_6__1"


    // $ANTLR start "rule__Section__Group_6__1__Impl"
    // InternalPageGeneratorLanguare.g:6968:1: rule__Section__Group_6__1__Impl : ( '=' ) ;
    public final void rule__Section__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6972:1: ( ( '=' ) )
            // InternalPageGeneratorLanguare.g:6973:1: ( '=' )
            {
            // InternalPageGeneratorLanguare.g:6973:1: ( '=' )
            // InternalPageGeneratorLanguare.g:6974:2: '='
            {
             before(grammarAccess.getSectionAccess().getEqualsSignKeyword_6_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getEqualsSignKeyword_6_1()); 

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
    // $ANTLR end "rule__Section__Group_6__1__Impl"


    // $ANTLR start "rule__Section__Group_6__2"
    // InternalPageGeneratorLanguare.g:6983:1: rule__Section__Group_6__2 : rule__Section__Group_6__2__Impl rule__Section__Group_6__3 ;
    public final void rule__Section__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6987:1: ( rule__Section__Group_6__2__Impl rule__Section__Group_6__3 )
            // InternalPageGeneratorLanguare.g:6988:2: rule__Section__Group_6__2__Impl rule__Section__Group_6__3
            {
            pushFollow(FOLLOW_11);
            rule__Section__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group_6__3();

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
    // $ANTLR end "rule__Section__Group_6__2"


    // $ANTLR start "rule__Section__Group_6__2__Impl"
    // InternalPageGeneratorLanguare.g:6995:1: rule__Section__Group_6__2__Impl : ( ( rule__Section__TextLocationAssignment_6_2 ) ) ;
    public final void rule__Section__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:6999:1: ( ( ( rule__Section__TextLocationAssignment_6_2 ) ) )
            // InternalPageGeneratorLanguare.g:7000:1: ( ( rule__Section__TextLocationAssignment_6_2 ) )
            {
            // InternalPageGeneratorLanguare.g:7000:1: ( ( rule__Section__TextLocationAssignment_6_2 ) )
            // InternalPageGeneratorLanguare.g:7001:2: ( rule__Section__TextLocationAssignment_6_2 )
            {
             before(grammarAccess.getSectionAccess().getTextLocationAssignment_6_2()); 
            // InternalPageGeneratorLanguare.g:7002:2: ( rule__Section__TextLocationAssignment_6_2 )
            // InternalPageGeneratorLanguare.g:7002:3: rule__Section__TextLocationAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Section__TextLocationAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getTextLocationAssignment_6_2()); 

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
    // $ANTLR end "rule__Section__Group_6__2__Impl"


    // $ANTLR start "rule__Section__Group_6__3"
    // InternalPageGeneratorLanguare.g:7010:1: rule__Section__Group_6__3 : rule__Section__Group_6__3__Impl ;
    public final void rule__Section__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7014:1: ( rule__Section__Group_6__3__Impl )
            // InternalPageGeneratorLanguare.g:7015:2: rule__Section__Group_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group_6__3__Impl();

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
    // $ANTLR end "rule__Section__Group_6__3"


    // $ANTLR start "rule__Section__Group_6__3__Impl"
    // InternalPageGeneratorLanguare.g:7021:1: rule__Section__Group_6__3__Impl : ( ( ',' )? ) ;
    public final void rule__Section__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7025:1: ( ( ( ',' )? ) )
            // InternalPageGeneratorLanguare.g:7026:1: ( ( ',' )? )
            {
            // InternalPageGeneratorLanguare.g:7026:1: ( ( ',' )? )
            // InternalPageGeneratorLanguare.g:7027:2: ( ',' )?
            {
             before(grammarAccess.getSectionAccess().getCommaKeyword_6_3()); 
            // InternalPageGeneratorLanguare.g:7028:2: ( ',' )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==12) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:7028:3: ','
                    {
                    match(input,12,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getSectionAccess().getCommaKeyword_6_3()); 

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
    // $ANTLR end "rule__Section__Group_6__3__Impl"


    // $ANTLR start "rule__Section__Group_7__0"
    // InternalPageGeneratorLanguare.g:7037:1: rule__Section__Group_7__0 : rule__Section__Group_7__0__Impl rule__Section__Group_7__1 ;
    public final void rule__Section__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7041:1: ( rule__Section__Group_7__0__Impl rule__Section__Group_7__1 )
            // InternalPageGeneratorLanguare.g:7042:2: rule__Section__Group_7__0__Impl rule__Section__Group_7__1
            {
            pushFollow(FOLLOW_8);
            rule__Section__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group_7__1();

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
    // $ANTLR end "rule__Section__Group_7__0"


    // $ANTLR start "rule__Section__Group_7__0__Impl"
    // InternalPageGeneratorLanguare.g:7049:1: rule__Section__Group_7__0__Impl : ( 'Padding-left' ) ;
    public final void rule__Section__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7053:1: ( ( 'Padding-left' ) )
            // InternalPageGeneratorLanguare.g:7054:1: ( 'Padding-left' )
            {
            // InternalPageGeneratorLanguare.g:7054:1: ( 'Padding-left' )
            // InternalPageGeneratorLanguare.g:7055:2: 'Padding-left'
            {
             before(grammarAccess.getSectionAccess().getPaddingLeftKeyword_7_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getPaddingLeftKeyword_7_0()); 

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
    // $ANTLR end "rule__Section__Group_7__0__Impl"


    // $ANTLR start "rule__Section__Group_7__1"
    // InternalPageGeneratorLanguare.g:7064:1: rule__Section__Group_7__1 : rule__Section__Group_7__1__Impl rule__Section__Group_7__2 ;
    public final void rule__Section__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7068:1: ( rule__Section__Group_7__1__Impl rule__Section__Group_7__2 )
            // InternalPageGeneratorLanguare.g:7069:2: rule__Section__Group_7__1__Impl rule__Section__Group_7__2
            {
            pushFollow(FOLLOW_19);
            rule__Section__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group_7__2();

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
    // $ANTLR end "rule__Section__Group_7__1"


    // $ANTLR start "rule__Section__Group_7__1__Impl"
    // InternalPageGeneratorLanguare.g:7076:1: rule__Section__Group_7__1__Impl : ( '=' ) ;
    public final void rule__Section__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7080:1: ( ( '=' ) )
            // InternalPageGeneratorLanguare.g:7081:1: ( '=' )
            {
            // InternalPageGeneratorLanguare.g:7081:1: ( '=' )
            // InternalPageGeneratorLanguare.g:7082:2: '='
            {
             before(grammarAccess.getSectionAccess().getEqualsSignKeyword_7_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getEqualsSignKeyword_7_1()); 

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
    // $ANTLR end "rule__Section__Group_7__1__Impl"


    // $ANTLR start "rule__Section__Group_7__2"
    // InternalPageGeneratorLanguare.g:7091:1: rule__Section__Group_7__2 : rule__Section__Group_7__2__Impl rule__Section__Group_7__3 ;
    public final void rule__Section__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7095:1: ( rule__Section__Group_7__2__Impl rule__Section__Group_7__3 )
            // InternalPageGeneratorLanguare.g:7096:2: rule__Section__Group_7__2__Impl rule__Section__Group_7__3
            {
            pushFollow(FOLLOW_11);
            rule__Section__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group_7__3();

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
    // $ANTLR end "rule__Section__Group_7__2"


    // $ANTLR start "rule__Section__Group_7__2__Impl"
    // InternalPageGeneratorLanguare.g:7103:1: rule__Section__Group_7__2__Impl : ( ( rule__Section__LpaddingAssignment_7_2 ) ) ;
    public final void rule__Section__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7107:1: ( ( ( rule__Section__LpaddingAssignment_7_2 ) ) )
            // InternalPageGeneratorLanguare.g:7108:1: ( ( rule__Section__LpaddingAssignment_7_2 ) )
            {
            // InternalPageGeneratorLanguare.g:7108:1: ( ( rule__Section__LpaddingAssignment_7_2 ) )
            // InternalPageGeneratorLanguare.g:7109:2: ( rule__Section__LpaddingAssignment_7_2 )
            {
             before(grammarAccess.getSectionAccess().getLpaddingAssignment_7_2()); 
            // InternalPageGeneratorLanguare.g:7110:2: ( rule__Section__LpaddingAssignment_7_2 )
            // InternalPageGeneratorLanguare.g:7110:3: rule__Section__LpaddingAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__Section__LpaddingAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getLpaddingAssignment_7_2()); 

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
    // $ANTLR end "rule__Section__Group_7__2__Impl"


    // $ANTLR start "rule__Section__Group_7__3"
    // InternalPageGeneratorLanguare.g:7118:1: rule__Section__Group_7__3 : rule__Section__Group_7__3__Impl ;
    public final void rule__Section__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7122:1: ( rule__Section__Group_7__3__Impl )
            // InternalPageGeneratorLanguare.g:7123:2: rule__Section__Group_7__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group_7__3__Impl();

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
    // $ANTLR end "rule__Section__Group_7__3"


    // $ANTLR start "rule__Section__Group_7__3__Impl"
    // InternalPageGeneratorLanguare.g:7129:1: rule__Section__Group_7__3__Impl : ( ( ',' )? ) ;
    public final void rule__Section__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7133:1: ( ( ( ',' )? ) )
            // InternalPageGeneratorLanguare.g:7134:1: ( ( ',' )? )
            {
            // InternalPageGeneratorLanguare.g:7134:1: ( ( ',' )? )
            // InternalPageGeneratorLanguare.g:7135:2: ( ',' )?
            {
             before(grammarAccess.getSectionAccess().getCommaKeyword_7_3()); 
            // InternalPageGeneratorLanguare.g:7136:2: ( ',' )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==12) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:7136:3: ','
                    {
                    match(input,12,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getSectionAccess().getCommaKeyword_7_3()); 

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
    // $ANTLR end "rule__Section__Group_7__3__Impl"


    // $ANTLR start "rule__Section__Group_8__0"
    // InternalPageGeneratorLanguare.g:7145:1: rule__Section__Group_8__0 : rule__Section__Group_8__0__Impl rule__Section__Group_8__1 ;
    public final void rule__Section__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7149:1: ( rule__Section__Group_8__0__Impl rule__Section__Group_8__1 )
            // InternalPageGeneratorLanguare.g:7150:2: rule__Section__Group_8__0__Impl rule__Section__Group_8__1
            {
            pushFollow(FOLLOW_8);
            rule__Section__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group_8__1();

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
    // $ANTLR end "rule__Section__Group_8__0"


    // $ANTLR start "rule__Section__Group_8__0__Impl"
    // InternalPageGeneratorLanguare.g:7157:1: rule__Section__Group_8__0__Impl : ( 'Padding-right' ) ;
    public final void rule__Section__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7161:1: ( ( 'Padding-right' ) )
            // InternalPageGeneratorLanguare.g:7162:1: ( 'Padding-right' )
            {
            // InternalPageGeneratorLanguare.g:7162:1: ( 'Padding-right' )
            // InternalPageGeneratorLanguare.g:7163:2: 'Padding-right'
            {
             before(grammarAccess.getSectionAccess().getPaddingRightKeyword_8_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getPaddingRightKeyword_8_0()); 

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
    // $ANTLR end "rule__Section__Group_8__0__Impl"


    // $ANTLR start "rule__Section__Group_8__1"
    // InternalPageGeneratorLanguare.g:7172:1: rule__Section__Group_8__1 : rule__Section__Group_8__1__Impl rule__Section__Group_8__2 ;
    public final void rule__Section__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7176:1: ( rule__Section__Group_8__1__Impl rule__Section__Group_8__2 )
            // InternalPageGeneratorLanguare.g:7177:2: rule__Section__Group_8__1__Impl rule__Section__Group_8__2
            {
            pushFollow(FOLLOW_19);
            rule__Section__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group_8__2();

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
    // $ANTLR end "rule__Section__Group_8__1"


    // $ANTLR start "rule__Section__Group_8__1__Impl"
    // InternalPageGeneratorLanguare.g:7184:1: rule__Section__Group_8__1__Impl : ( '=' ) ;
    public final void rule__Section__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7188:1: ( ( '=' ) )
            // InternalPageGeneratorLanguare.g:7189:1: ( '=' )
            {
            // InternalPageGeneratorLanguare.g:7189:1: ( '=' )
            // InternalPageGeneratorLanguare.g:7190:2: '='
            {
             before(grammarAccess.getSectionAccess().getEqualsSignKeyword_8_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getEqualsSignKeyword_8_1()); 

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
    // $ANTLR end "rule__Section__Group_8__1__Impl"


    // $ANTLR start "rule__Section__Group_8__2"
    // InternalPageGeneratorLanguare.g:7199:1: rule__Section__Group_8__2 : rule__Section__Group_8__2__Impl rule__Section__Group_8__3 ;
    public final void rule__Section__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7203:1: ( rule__Section__Group_8__2__Impl rule__Section__Group_8__3 )
            // InternalPageGeneratorLanguare.g:7204:2: rule__Section__Group_8__2__Impl rule__Section__Group_8__3
            {
            pushFollow(FOLLOW_11);
            rule__Section__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group_8__3();

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
    // $ANTLR end "rule__Section__Group_8__2"


    // $ANTLR start "rule__Section__Group_8__2__Impl"
    // InternalPageGeneratorLanguare.g:7211:1: rule__Section__Group_8__2__Impl : ( ( rule__Section__RpaddingAssignment_8_2 ) ) ;
    public final void rule__Section__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7215:1: ( ( ( rule__Section__RpaddingAssignment_8_2 ) ) )
            // InternalPageGeneratorLanguare.g:7216:1: ( ( rule__Section__RpaddingAssignment_8_2 ) )
            {
            // InternalPageGeneratorLanguare.g:7216:1: ( ( rule__Section__RpaddingAssignment_8_2 ) )
            // InternalPageGeneratorLanguare.g:7217:2: ( rule__Section__RpaddingAssignment_8_2 )
            {
             before(grammarAccess.getSectionAccess().getRpaddingAssignment_8_2()); 
            // InternalPageGeneratorLanguare.g:7218:2: ( rule__Section__RpaddingAssignment_8_2 )
            // InternalPageGeneratorLanguare.g:7218:3: rule__Section__RpaddingAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__Section__RpaddingAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getRpaddingAssignment_8_2()); 

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
    // $ANTLR end "rule__Section__Group_8__2__Impl"


    // $ANTLR start "rule__Section__Group_8__3"
    // InternalPageGeneratorLanguare.g:7226:1: rule__Section__Group_8__3 : rule__Section__Group_8__3__Impl ;
    public final void rule__Section__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7230:1: ( rule__Section__Group_8__3__Impl )
            // InternalPageGeneratorLanguare.g:7231:2: rule__Section__Group_8__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group_8__3__Impl();

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
    // $ANTLR end "rule__Section__Group_8__3"


    // $ANTLR start "rule__Section__Group_8__3__Impl"
    // InternalPageGeneratorLanguare.g:7237:1: rule__Section__Group_8__3__Impl : ( ( ',' )? ) ;
    public final void rule__Section__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7241:1: ( ( ( ',' )? ) )
            // InternalPageGeneratorLanguare.g:7242:1: ( ( ',' )? )
            {
            // InternalPageGeneratorLanguare.g:7242:1: ( ( ',' )? )
            // InternalPageGeneratorLanguare.g:7243:2: ( ',' )?
            {
             before(grammarAccess.getSectionAccess().getCommaKeyword_8_3()); 
            // InternalPageGeneratorLanguare.g:7244:2: ( ',' )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==12) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:7244:3: ','
                    {
                    match(input,12,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getSectionAccess().getCommaKeyword_8_3()); 

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
    // $ANTLR end "rule__Section__Group_8__3__Impl"


    // $ANTLR start "rule__Section__Group_9__0"
    // InternalPageGeneratorLanguare.g:7253:1: rule__Section__Group_9__0 : rule__Section__Group_9__0__Impl rule__Section__Group_9__1 ;
    public final void rule__Section__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7257:1: ( rule__Section__Group_9__0__Impl rule__Section__Group_9__1 )
            // InternalPageGeneratorLanguare.g:7258:2: rule__Section__Group_9__0__Impl rule__Section__Group_9__1
            {
            pushFollow(FOLLOW_8);
            rule__Section__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group_9__1();

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
    // $ANTLR end "rule__Section__Group_9__0"


    // $ANTLR start "rule__Section__Group_9__0__Impl"
    // InternalPageGeneratorLanguare.g:7265:1: rule__Section__Group_9__0__Impl : ( 'Padding-top' ) ;
    public final void rule__Section__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7269:1: ( ( 'Padding-top' ) )
            // InternalPageGeneratorLanguare.g:7270:1: ( 'Padding-top' )
            {
            // InternalPageGeneratorLanguare.g:7270:1: ( 'Padding-top' )
            // InternalPageGeneratorLanguare.g:7271:2: 'Padding-top'
            {
             before(grammarAccess.getSectionAccess().getPaddingTopKeyword_9_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getPaddingTopKeyword_9_0()); 

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
    // $ANTLR end "rule__Section__Group_9__0__Impl"


    // $ANTLR start "rule__Section__Group_9__1"
    // InternalPageGeneratorLanguare.g:7280:1: rule__Section__Group_9__1 : rule__Section__Group_9__1__Impl rule__Section__Group_9__2 ;
    public final void rule__Section__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7284:1: ( rule__Section__Group_9__1__Impl rule__Section__Group_9__2 )
            // InternalPageGeneratorLanguare.g:7285:2: rule__Section__Group_9__1__Impl rule__Section__Group_9__2
            {
            pushFollow(FOLLOW_19);
            rule__Section__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group_9__2();

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
    // $ANTLR end "rule__Section__Group_9__1"


    // $ANTLR start "rule__Section__Group_9__1__Impl"
    // InternalPageGeneratorLanguare.g:7292:1: rule__Section__Group_9__1__Impl : ( '=' ) ;
    public final void rule__Section__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7296:1: ( ( '=' ) )
            // InternalPageGeneratorLanguare.g:7297:1: ( '=' )
            {
            // InternalPageGeneratorLanguare.g:7297:1: ( '=' )
            // InternalPageGeneratorLanguare.g:7298:2: '='
            {
             before(grammarAccess.getSectionAccess().getEqualsSignKeyword_9_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getEqualsSignKeyword_9_1()); 

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
    // $ANTLR end "rule__Section__Group_9__1__Impl"


    // $ANTLR start "rule__Section__Group_9__2"
    // InternalPageGeneratorLanguare.g:7307:1: rule__Section__Group_9__2 : rule__Section__Group_9__2__Impl rule__Section__Group_9__3 ;
    public final void rule__Section__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7311:1: ( rule__Section__Group_9__2__Impl rule__Section__Group_9__3 )
            // InternalPageGeneratorLanguare.g:7312:2: rule__Section__Group_9__2__Impl rule__Section__Group_9__3
            {
            pushFollow(FOLLOW_11);
            rule__Section__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group_9__3();

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
    // $ANTLR end "rule__Section__Group_9__2"


    // $ANTLR start "rule__Section__Group_9__2__Impl"
    // InternalPageGeneratorLanguare.g:7319:1: rule__Section__Group_9__2__Impl : ( ( rule__Section__TpaddingAssignment_9_2 ) ) ;
    public final void rule__Section__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7323:1: ( ( ( rule__Section__TpaddingAssignment_9_2 ) ) )
            // InternalPageGeneratorLanguare.g:7324:1: ( ( rule__Section__TpaddingAssignment_9_2 ) )
            {
            // InternalPageGeneratorLanguare.g:7324:1: ( ( rule__Section__TpaddingAssignment_9_2 ) )
            // InternalPageGeneratorLanguare.g:7325:2: ( rule__Section__TpaddingAssignment_9_2 )
            {
             before(grammarAccess.getSectionAccess().getTpaddingAssignment_9_2()); 
            // InternalPageGeneratorLanguare.g:7326:2: ( rule__Section__TpaddingAssignment_9_2 )
            // InternalPageGeneratorLanguare.g:7326:3: rule__Section__TpaddingAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__Section__TpaddingAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getTpaddingAssignment_9_2()); 

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
    // $ANTLR end "rule__Section__Group_9__2__Impl"


    // $ANTLR start "rule__Section__Group_9__3"
    // InternalPageGeneratorLanguare.g:7334:1: rule__Section__Group_9__3 : rule__Section__Group_9__3__Impl ;
    public final void rule__Section__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7338:1: ( rule__Section__Group_9__3__Impl )
            // InternalPageGeneratorLanguare.g:7339:2: rule__Section__Group_9__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group_9__3__Impl();

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
    // $ANTLR end "rule__Section__Group_9__3"


    // $ANTLR start "rule__Section__Group_9__3__Impl"
    // InternalPageGeneratorLanguare.g:7345:1: rule__Section__Group_9__3__Impl : ( ( ',' )? ) ;
    public final void rule__Section__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7349:1: ( ( ( ',' )? ) )
            // InternalPageGeneratorLanguare.g:7350:1: ( ( ',' )? )
            {
            // InternalPageGeneratorLanguare.g:7350:1: ( ( ',' )? )
            // InternalPageGeneratorLanguare.g:7351:2: ( ',' )?
            {
             before(grammarAccess.getSectionAccess().getCommaKeyword_9_3()); 
            // InternalPageGeneratorLanguare.g:7352:2: ( ',' )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==12) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:7352:3: ','
                    {
                    match(input,12,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getSectionAccess().getCommaKeyword_9_3()); 

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
    // $ANTLR end "rule__Section__Group_9__3__Impl"


    // $ANTLR start "rule__Section__Group_10__0"
    // InternalPageGeneratorLanguare.g:7361:1: rule__Section__Group_10__0 : rule__Section__Group_10__0__Impl rule__Section__Group_10__1 ;
    public final void rule__Section__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7365:1: ( rule__Section__Group_10__0__Impl rule__Section__Group_10__1 )
            // InternalPageGeneratorLanguare.g:7366:2: rule__Section__Group_10__0__Impl rule__Section__Group_10__1
            {
            pushFollow(FOLLOW_8);
            rule__Section__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group_10__1();

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
    // $ANTLR end "rule__Section__Group_10__0"


    // $ANTLR start "rule__Section__Group_10__0__Impl"
    // InternalPageGeneratorLanguare.g:7373:1: rule__Section__Group_10__0__Impl : ( 'Padding-bottom' ) ;
    public final void rule__Section__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7377:1: ( ( 'Padding-bottom' ) )
            // InternalPageGeneratorLanguare.g:7378:1: ( 'Padding-bottom' )
            {
            // InternalPageGeneratorLanguare.g:7378:1: ( 'Padding-bottom' )
            // InternalPageGeneratorLanguare.g:7379:2: 'Padding-bottom'
            {
             before(grammarAccess.getSectionAccess().getPaddingBottomKeyword_10_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getPaddingBottomKeyword_10_0()); 

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
    // $ANTLR end "rule__Section__Group_10__0__Impl"


    // $ANTLR start "rule__Section__Group_10__1"
    // InternalPageGeneratorLanguare.g:7388:1: rule__Section__Group_10__1 : rule__Section__Group_10__1__Impl rule__Section__Group_10__2 ;
    public final void rule__Section__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7392:1: ( rule__Section__Group_10__1__Impl rule__Section__Group_10__2 )
            // InternalPageGeneratorLanguare.g:7393:2: rule__Section__Group_10__1__Impl rule__Section__Group_10__2
            {
            pushFollow(FOLLOW_19);
            rule__Section__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group_10__2();

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
    // $ANTLR end "rule__Section__Group_10__1"


    // $ANTLR start "rule__Section__Group_10__1__Impl"
    // InternalPageGeneratorLanguare.g:7400:1: rule__Section__Group_10__1__Impl : ( '=' ) ;
    public final void rule__Section__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7404:1: ( ( '=' ) )
            // InternalPageGeneratorLanguare.g:7405:1: ( '=' )
            {
            // InternalPageGeneratorLanguare.g:7405:1: ( '=' )
            // InternalPageGeneratorLanguare.g:7406:2: '='
            {
             before(grammarAccess.getSectionAccess().getEqualsSignKeyword_10_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getEqualsSignKeyword_10_1()); 

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
    // $ANTLR end "rule__Section__Group_10__1__Impl"


    // $ANTLR start "rule__Section__Group_10__2"
    // InternalPageGeneratorLanguare.g:7415:1: rule__Section__Group_10__2 : rule__Section__Group_10__2__Impl rule__Section__Group_10__3 ;
    public final void rule__Section__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7419:1: ( rule__Section__Group_10__2__Impl rule__Section__Group_10__3 )
            // InternalPageGeneratorLanguare.g:7420:2: rule__Section__Group_10__2__Impl rule__Section__Group_10__3
            {
            pushFollow(FOLLOW_11);
            rule__Section__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group_10__3();

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
    // $ANTLR end "rule__Section__Group_10__2"


    // $ANTLR start "rule__Section__Group_10__2__Impl"
    // InternalPageGeneratorLanguare.g:7427:1: rule__Section__Group_10__2__Impl : ( ( rule__Section__BpaddingAssignment_10_2 ) ) ;
    public final void rule__Section__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7431:1: ( ( ( rule__Section__BpaddingAssignment_10_2 ) ) )
            // InternalPageGeneratorLanguare.g:7432:1: ( ( rule__Section__BpaddingAssignment_10_2 ) )
            {
            // InternalPageGeneratorLanguare.g:7432:1: ( ( rule__Section__BpaddingAssignment_10_2 ) )
            // InternalPageGeneratorLanguare.g:7433:2: ( rule__Section__BpaddingAssignment_10_2 )
            {
             before(grammarAccess.getSectionAccess().getBpaddingAssignment_10_2()); 
            // InternalPageGeneratorLanguare.g:7434:2: ( rule__Section__BpaddingAssignment_10_2 )
            // InternalPageGeneratorLanguare.g:7434:3: rule__Section__BpaddingAssignment_10_2
            {
            pushFollow(FOLLOW_2);
            rule__Section__BpaddingAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getBpaddingAssignment_10_2()); 

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
    // $ANTLR end "rule__Section__Group_10__2__Impl"


    // $ANTLR start "rule__Section__Group_10__3"
    // InternalPageGeneratorLanguare.g:7442:1: rule__Section__Group_10__3 : rule__Section__Group_10__3__Impl ;
    public final void rule__Section__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7446:1: ( rule__Section__Group_10__3__Impl )
            // InternalPageGeneratorLanguare.g:7447:2: rule__Section__Group_10__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group_10__3__Impl();

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
    // $ANTLR end "rule__Section__Group_10__3"


    // $ANTLR start "rule__Section__Group_10__3__Impl"
    // InternalPageGeneratorLanguare.g:7453:1: rule__Section__Group_10__3__Impl : ( ( ',' )? ) ;
    public final void rule__Section__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7457:1: ( ( ( ',' )? ) )
            // InternalPageGeneratorLanguare.g:7458:1: ( ( ',' )? )
            {
            // InternalPageGeneratorLanguare.g:7458:1: ( ( ',' )? )
            // InternalPageGeneratorLanguare.g:7459:2: ( ',' )?
            {
             before(grammarAccess.getSectionAccess().getCommaKeyword_10_3()); 
            // InternalPageGeneratorLanguare.g:7460:2: ( ',' )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==12) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:7460:3: ','
                    {
                    match(input,12,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getSectionAccess().getCommaKeyword_10_3()); 

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
    // $ANTLR end "rule__Section__Group_10__3__Impl"


    // $ANTLR start "rule__SizeDeclaration__Group__0"
    // InternalPageGeneratorLanguare.g:7469:1: rule__SizeDeclaration__Group__0 : rule__SizeDeclaration__Group__0__Impl rule__SizeDeclaration__Group__1 ;
    public final void rule__SizeDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7473:1: ( rule__SizeDeclaration__Group__0__Impl rule__SizeDeclaration__Group__1 )
            // InternalPageGeneratorLanguare.g:7474:2: rule__SizeDeclaration__Group__0__Impl rule__SizeDeclaration__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__SizeDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SizeDeclaration__Group__1();

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
    // $ANTLR end "rule__SizeDeclaration__Group__0"


    // $ANTLR start "rule__SizeDeclaration__Group__0__Impl"
    // InternalPageGeneratorLanguare.g:7481:1: rule__SizeDeclaration__Group__0__Impl : ( 'size' ) ;
    public final void rule__SizeDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7485:1: ( ( 'size' ) )
            // InternalPageGeneratorLanguare.g:7486:1: ( 'size' )
            {
            // InternalPageGeneratorLanguare.g:7486:1: ( 'size' )
            // InternalPageGeneratorLanguare.g:7487:2: 'size'
            {
             before(grammarAccess.getSizeDeclarationAccess().getSizeKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSizeDeclarationAccess().getSizeKeyword_0()); 

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
    // $ANTLR end "rule__SizeDeclaration__Group__0__Impl"


    // $ANTLR start "rule__SizeDeclaration__Group__1"
    // InternalPageGeneratorLanguare.g:7496:1: rule__SizeDeclaration__Group__1 : rule__SizeDeclaration__Group__1__Impl rule__SizeDeclaration__Group__2 ;
    public final void rule__SizeDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7500:1: ( rule__SizeDeclaration__Group__1__Impl rule__SizeDeclaration__Group__2 )
            // InternalPageGeneratorLanguare.g:7501:2: rule__SizeDeclaration__Group__1__Impl rule__SizeDeclaration__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__SizeDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SizeDeclaration__Group__2();

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
    // $ANTLR end "rule__SizeDeclaration__Group__1"


    // $ANTLR start "rule__SizeDeclaration__Group__1__Impl"
    // InternalPageGeneratorLanguare.g:7508:1: rule__SizeDeclaration__Group__1__Impl : ( ( rule__SizeDeclaration__NameAssignment_1 ) ) ;
    public final void rule__SizeDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7512:1: ( ( ( rule__SizeDeclaration__NameAssignment_1 ) ) )
            // InternalPageGeneratorLanguare.g:7513:1: ( ( rule__SizeDeclaration__NameAssignment_1 ) )
            {
            // InternalPageGeneratorLanguare.g:7513:1: ( ( rule__SizeDeclaration__NameAssignment_1 ) )
            // InternalPageGeneratorLanguare.g:7514:2: ( rule__SizeDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getSizeDeclarationAccess().getNameAssignment_1()); 
            // InternalPageGeneratorLanguare.g:7515:2: ( rule__SizeDeclaration__NameAssignment_1 )
            // InternalPageGeneratorLanguare.g:7515:3: rule__SizeDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SizeDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSizeDeclarationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__SizeDeclaration__Group__1__Impl"


    // $ANTLR start "rule__SizeDeclaration__Group__2"
    // InternalPageGeneratorLanguare.g:7523:1: rule__SizeDeclaration__Group__2 : rule__SizeDeclaration__Group__2__Impl rule__SizeDeclaration__Group__3 ;
    public final void rule__SizeDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7527:1: ( rule__SizeDeclaration__Group__2__Impl rule__SizeDeclaration__Group__3 )
            // InternalPageGeneratorLanguare.g:7528:2: rule__SizeDeclaration__Group__2__Impl rule__SizeDeclaration__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__SizeDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SizeDeclaration__Group__3();

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
    // $ANTLR end "rule__SizeDeclaration__Group__2"


    // $ANTLR start "rule__SizeDeclaration__Group__2__Impl"
    // InternalPageGeneratorLanguare.g:7535:1: rule__SizeDeclaration__Group__2__Impl : ( '=' ) ;
    public final void rule__SizeDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7539:1: ( ( '=' ) )
            // InternalPageGeneratorLanguare.g:7540:1: ( '=' )
            {
            // InternalPageGeneratorLanguare.g:7540:1: ( '=' )
            // InternalPageGeneratorLanguare.g:7541:2: '='
            {
             before(grammarAccess.getSizeDeclarationAccess().getEqualsSignKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSizeDeclarationAccess().getEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__SizeDeclaration__Group__2__Impl"


    // $ANTLR start "rule__SizeDeclaration__Group__3"
    // InternalPageGeneratorLanguare.g:7550:1: rule__SizeDeclaration__Group__3 : rule__SizeDeclaration__Group__3__Impl rule__SizeDeclaration__Group__4 ;
    public final void rule__SizeDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7554:1: ( rule__SizeDeclaration__Group__3__Impl rule__SizeDeclaration__Group__4 )
            // InternalPageGeneratorLanguare.g:7555:2: rule__SizeDeclaration__Group__3__Impl rule__SizeDeclaration__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__SizeDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SizeDeclaration__Group__4();

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
    // $ANTLR end "rule__SizeDeclaration__Group__3"


    // $ANTLR start "rule__SizeDeclaration__Group__3__Impl"
    // InternalPageGeneratorLanguare.g:7562:1: rule__SizeDeclaration__Group__3__Impl : ( ( rule__SizeDeclaration__WidthAssignment_3 ) ) ;
    public final void rule__SizeDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7566:1: ( ( ( rule__SizeDeclaration__WidthAssignment_3 ) ) )
            // InternalPageGeneratorLanguare.g:7567:1: ( ( rule__SizeDeclaration__WidthAssignment_3 ) )
            {
            // InternalPageGeneratorLanguare.g:7567:1: ( ( rule__SizeDeclaration__WidthAssignment_3 ) )
            // InternalPageGeneratorLanguare.g:7568:2: ( rule__SizeDeclaration__WidthAssignment_3 )
            {
             before(grammarAccess.getSizeDeclarationAccess().getWidthAssignment_3()); 
            // InternalPageGeneratorLanguare.g:7569:2: ( rule__SizeDeclaration__WidthAssignment_3 )
            // InternalPageGeneratorLanguare.g:7569:3: rule__SizeDeclaration__WidthAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SizeDeclaration__WidthAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSizeDeclarationAccess().getWidthAssignment_3()); 

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
    // $ANTLR end "rule__SizeDeclaration__Group__3__Impl"


    // $ANTLR start "rule__SizeDeclaration__Group__4"
    // InternalPageGeneratorLanguare.g:7577:1: rule__SizeDeclaration__Group__4 : rule__SizeDeclaration__Group__4__Impl rule__SizeDeclaration__Group__5 ;
    public final void rule__SizeDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7581:1: ( rule__SizeDeclaration__Group__4__Impl rule__SizeDeclaration__Group__5 )
            // InternalPageGeneratorLanguare.g:7582:2: rule__SizeDeclaration__Group__4__Impl rule__SizeDeclaration__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__SizeDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SizeDeclaration__Group__5();

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
    // $ANTLR end "rule__SizeDeclaration__Group__4"


    // $ANTLR start "rule__SizeDeclaration__Group__4__Impl"
    // InternalPageGeneratorLanguare.g:7589:1: rule__SizeDeclaration__Group__4__Impl : ( '*' ) ;
    public final void rule__SizeDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7593:1: ( ( '*' ) )
            // InternalPageGeneratorLanguare.g:7594:1: ( '*' )
            {
            // InternalPageGeneratorLanguare.g:7594:1: ( '*' )
            // InternalPageGeneratorLanguare.g:7595:2: '*'
            {
             before(grammarAccess.getSizeDeclarationAccess().getAsteriskKeyword_4()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getSizeDeclarationAccess().getAsteriskKeyword_4()); 

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
    // $ANTLR end "rule__SizeDeclaration__Group__4__Impl"


    // $ANTLR start "rule__SizeDeclaration__Group__5"
    // InternalPageGeneratorLanguare.g:7604:1: rule__SizeDeclaration__Group__5 : rule__SizeDeclaration__Group__5__Impl rule__SizeDeclaration__Group__6 ;
    public final void rule__SizeDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7608:1: ( rule__SizeDeclaration__Group__5__Impl rule__SizeDeclaration__Group__6 )
            // InternalPageGeneratorLanguare.g:7609:2: rule__SizeDeclaration__Group__5__Impl rule__SizeDeclaration__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__SizeDeclaration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SizeDeclaration__Group__6();

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
    // $ANTLR end "rule__SizeDeclaration__Group__5"


    // $ANTLR start "rule__SizeDeclaration__Group__5__Impl"
    // InternalPageGeneratorLanguare.g:7616:1: rule__SizeDeclaration__Group__5__Impl : ( ( rule__SizeDeclaration__HeightAssignment_5 ) ) ;
    public final void rule__SizeDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7620:1: ( ( ( rule__SizeDeclaration__HeightAssignment_5 ) ) )
            // InternalPageGeneratorLanguare.g:7621:1: ( ( rule__SizeDeclaration__HeightAssignment_5 ) )
            {
            // InternalPageGeneratorLanguare.g:7621:1: ( ( rule__SizeDeclaration__HeightAssignment_5 ) )
            // InternalPageGeneratorLanguare.g:7622:2: ( rule__SizeDeclaration__HeightAssignment_5 )
            {
             before(grammarAccess.getSizeDeclarationAccess().getHeightAssignment_5()); 
            // InternalPageGeneratorLanguare.g:7623:2: ( rule__SizeDeclaration__HeightAssignment_5 )
            // InternalPageGeneratorLanguare.g:7623:3: rule__SizeDeclaration__HeightAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__SizeDeclaration__HeightAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSizeDeclarationAccess().getHeightAssignment_5()); 

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
    // $ANTLR end "rule__SizeDeclaration__Group__5__Impl"


    // $ANTLR start "rule__SizeDeclaration__Group__6"
    // InternalPageGeneratorLanguare.g:7631:1: rule__SizeDeclaration__Group__6 : rule__SizeDeclaration__Group__6__Impl ;
    public final void rule__SizeDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7635:1: ( rule__SizeDeclaration__Group__6__Impl )
            // InternalPageGeneratorLanguare.g:7636:2: rule__SizeDeclaration__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SizeDeclaration__Group__6__Impl();

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
    // $ANTLR end "rule__SizeDeclaration__Group__6"


    // $ANTLR start "rule__SizeDeclaration__Group__6__Impl"
    // InternalPageGeneratorLanguare.g:7642:1: rule__SizeDeclaration__Group__6__Impl : ( ';' ) ;
    public final void rule__SizeDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7646:1: ( ( ';' ) )
            // InternalPageGeneratorLanguare.g:7647:1: ( ';' )
            {
            // InternalPageGeneratorLanguare.g:7647:1: ( ';' )
            // InternalPageGeneratorLanguare.g:7648:2: ';'
            {
             before(grammarAccess.getSizeDeclarationAccess().getSemicolonKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSizeDeclarationAccess().getSemicolonKeyword_6()); 

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
    // $ANTLR end "rule__SizeDeclaration__Group__6__Impl"


    // $ANTLR start "rule__SizeValue__Group__0"
    // InternalPageGeneratorLanguare.g:7658:1: rule__SizeValue__Group__0 : rule__SizeValue__Group__0__Impl rule__SizeValue__Group__1 ;
    public final void rule__SizeValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7662:1: ( rule__SizeValue__Group__0__Impl rule__SizeValue__Group__1 )
            // InternalPageGeneratorLanguare.g:7663:2: rule__SizeValue__Group__0__Impl rule__SizeValue__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__SizeValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SizeValue__Group__1();

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
    // $ANTLR end "rule__SizeValue__Group__0"


    // $ANTLR start "rule__SizeValue__Group__0__Impl"
    // InternalPageGeneratorLanguare.g:7670:1: rule__SizeValue__Group__0__Impl : ( ( rule__SizeValue__WidthAssignment_0 ) ) ;
    public final void rule__SizeValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7674:1: ( ( ( rule__SizeValue__WidthAssignment_0 ) ) )
            // InternalPageGeneratorLanguare.g:7675:1: ( ( rule__SizeValue__WidthAssignment_0 ) )
            {
            // InternalPageGeneratorLanguare.g:7675:1: ( ( rule__SizeValue__WidthAssignment_0 ) )
            // InternalPageGeneratorLanguare.g:7676:2: ( rule__SizeValue__WidthAssignment_0 )
            {
             before(grammarAccess.getSizeValueAccess().getWidthAssignment_0()); 
            // InternalPageGeneratorLanguare.g:7677:2: ( rule__SizeValue__WidthAssignment_0 )
            // InternalPageGeneratorLanguare.g:7677:3: rule__SizeValue__WidthAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SizeValue__WidthAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSizeValueAccess().getWidthAssignment_0()); 

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
    // $ANTLR end "rule__SizeValue__Group__0__Impl"


    // $ANTLR start "rule__SizeValue__Group__1"
    // InternalPageGeneratorLanguare.g:7685:1: rule__SizeValue__Group__1 : rule__SizeValue__Group__1__Impl rule__SizeValue__Group__2 ;
    public final void rule__SizeValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7689:1: ( rule__SizeValue__Group__1__Impl rule__SizeValue__Group__2 )
            // InternalPageGeneratorLanguare.g:7690:2: rule__SizeValue__Group__1__Impl rule__SizeValue__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__SizeValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SizeValue__Group__2();

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
    // $ANTLR end "rule__SizeValue__Group__1"


    // $ANTLR start "rule__SizeValue__Group__1__Impl"
    // InternalPageGeneratorLanguare.g:7697:1: rule__SizeValue__Group__1__Impl : ( '*' ) ;
    public final void rule__SizeValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7701:1: ( ( '*' ) )
            // InternalPageGeneratorLanguare.g:7702:1: ( '*' )
            {
            // InternalPageGeneratorLanguare.g:7702:1: ( '*' )
            // InternalPageGeneratorLanguare.g:7703:2: '*'
            {
             before(grammarAccess.getSizeValueAccess().getAsteriskKeyword_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getSizeValueAccess().getAsteriskKeyword_1()); 

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
    // $ANTLR end "rule__SizeValue__Group__1__Impl"


    // $ANTLR start "rule__SizeValue__Group__2"
    // InternalPageGeneratorLanguare.g:7712:1: rule__SizeValue__Group__2 : rule__SizeValue__Group__2__Impl ;
    public final void rule__SizeValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7716:1: ( rule__SizeValue__Group__2__Impl )
            // InternalPageGeneratorLanguare.g:7717:2: rule__SizeValue__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SizeValue__Group__2__Impl();

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
    // $ANTLR end "rule__SizeValue__Group__2"


    // $ANTLR start "rule__SizeValue__Group__2__Impl"
    // InternalPageGeneratorLanguare.g:7723:1: rule__SizeValue__Group__2__Impl : ( ( rule__SizeValue__HeightAssignment_2 ) ) ;
    public final void rule__SizeValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7727:1: ( ( ( rule__SizeValue__HeightAssignment_2 ) ) )
            // InternalPageGeneratorLanguare.g:7728:1: ( ( rule__SizeValue__HeightAssignment_2 ) )
            {
            // InternalPageGeneratorLanguare.g:7728:1: ( ( rule__SizeValue__HeightAssignment_2 ) )
            // InternalPageGeneratorLanguare.g:7729:2: ( rule__SizeValue__HeightAssignment_2 )
            {
             before(grammarAccess.getSizeValueAccess().getHeightAssignment_2()); 
            // InternalPageGeneratorLanguare.g:7730:2: ( rule__SizeValue__HeightAssignment_2 )
            // InternalPageGeneratorLanguare.g:7730:3: rule__SizeValue__HeightAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SizeValue__HeightAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSizeValueAccess().getHeightAssignment_2()); 

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
    // $ANTLR end "rule__SizeValue__Group__2__Impl"


    // $ANTLR start "rule__ColourRGB__Group__0"
    // InternalPageGeneratorLanguare.g:7739:1: rule__ColourRGB__Group__0 : rule__ColourRGB__Group__0__Impl rule__ColourRGB__Group__1 ;
    public final void rule__ColourRGB__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7743:1: ( rule__ColourRGB__Group__0__Impl rule__ColourRGB__Group__1 )
            // InternalPageGeneratorLanguare.g:7744:2: rule__ColourRGB__Group__0__Impl rule__ColourRGB__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__ColourRGB__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColourRGB__Group__1();

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
    // $ANTLR end "rule__ColourRGB__Group__0"


    // $ANTLR start "rule__ColourRGB__Group__0__Impl"
    // InternalPageGeneratorLanguare.g:7751:1: rule__ColourRGB__Group__0__Impl : ( 'Custom' ) ;
    public final void rule__ColourRGB__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7755:1: ( ( 'Custom' ) )
            // InternalPageGeneratorLanguare.g:7756:1: ( 'Custom' )
            {
            // InternalPageGeneratorLanguare.g:7756:1: ( 'Custom' )
            // InternalPageGeneratorLanguare.g:7757:2: 'Custom'
            {
             before(grammarAccess.getColourRGBAccess().getCustomKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getColourRGBAccess().getCustomKeyword_0()); 

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
    // $ANTLR end "rule__ColourRGB__Group__0__Impl"


    // $ANTLR start "rule__ColourRGB__Group__1"
    // InternalPageGeneratorLanguare.g:7766:1: rule__ColourRGB__Group__1 : rule__ColourRGB__Group__1__Impl rule__ColourRGB__Group__2 ;
    public final void rule__ColourRGB__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7770:1: ( rule__ColourRGB__Group__1__Impl rule__ColourRGB__Group__2 )
            // InternalPageGeneratorLanguare.g:7771:2: rule__ColourRGB__Group__1__Impl rule__ColourRGB__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__ColourRGB__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColourRGB__Group__2();

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
    // $ANTLR end "rule__ColourRGB__Group__1"


    // $ANTLR start "rule__ColourRGB__Group__1__Impl"
    // InternalPageGeneratorLanguare.g:7778:1: rule__ColourRGB__Group__1__Impl : ( 'colour' ) ;
    public final void rule__ColourRGB__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7782:1: ( ( 'colour' ) )
            // InternalPageGeneratorLanguare.g:7783:1: ( 'colour' )
            {
            // InternalPageGeneratorLanguare.g:7783:1: ( 'colour' )
            // InternalPageGeneratorLanguare.g:7784:2: 'colour'
            {
             before(grammarAccess.getColourRGBAccess().getColourKeyword_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getColourRGBAccess().getColourKeyword_1()); 

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
    // $ANTLR end "rule__ColourRGB__Group__1__Impl"


    // $ANTLR start "rule__ColourRGB__Group__2"
    // InternalPageGeneratorLanguare.g:7793:1: rule__ColourRGB__Group__2 : rule__ColourRGB__Group__2__Impl rule__ColourRGB__Group__3 ;
    public final void rule__ColourRGB__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7797:1: ( rule__ColourRGB__Group__2__Impl rule__ColourRGB__Group__3 )
            // InternalPageGeneratorLanguare.g:7798:2: rule__ColourRGB__Group__2__Impl rule__ColourRGB__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__ColourRGB__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColourRGB__Group__3();

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
    // $ANTLR end "rule__ColourRGB__Group__2"


    // $ANTLR start "rule__ColourRGB__Group__2__Impl"
    // InternalPageGeneratorLanguare.g:7805:1: rule__ColourRGB__Group__2__Impl : ( ( rule__ColourRGB__NameAssignment_2 ) ) ;
    public final void rule__ColourRGB__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7809:1: ( ( ( rule__ColourRGB__NameAssignment_2 ) ) )
            // InternalPageGeneratorLanguare.g:7810:1: ( ( rule__ColourRGB__NameAssignment_2 ) )
            {
            // InternalPageGeneratorLanguare.g:7810:1: ( ( rule__ColourRGB__NameAssignment_2 ) )
            // InternalPageGeneratorLanguare.g:7811:2: ( rule__ColourRGB__NameAssignment_2 )
            {
             before(grammarAccess.getColourRGBAccess().getNameAssignment_2()); 
            // InternalPageGeneratorLanguare.g:7812:2: ( rule__ColourRGB__NameAssignment_2 )
            // InternalPageGeneratorLanguare.g:7812:3: rule__ColourRGB__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ColourRGB__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getColourRGBAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__ColourRGB__Group__2__Impl"


    // $ANTLR start "rule__ColourRGB__Group__3"
    // InternalPageGeneratorLanguare.g:7820:1: rule__ColourRGB__Group__3 : rule__ColourRGB__Group__3__Impl rule__ColourRGB__Group__4 ;
    public final void rule__ColourRGB__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7824:1: ( rule__ColourRGB__Group__3__Impl rule__ColourRGB__Group__4 )
            // InternalPageGeneratorLanguare.g:7825:2: rule__ColourRGB__Group__3__Impl rule__ColourRGB__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__ColourRGB__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColourRGB__Group__4();

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
    // $ANTLR end "rule__ColourRGB__Group__3"


    // $ANTLR start "rule__ColourRGB__Group__3__Impl"
    // InternalPageGeneratorLanguare.g:7832:1: rule__ColourRGB__Group__3__Impl : ( '=' ) ;
    public final void rule__ColourRGB__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7836:1: ( ( '=' ) )
            // InternalPageGeneratorLanguare.g:7837:1: ( '=' )
            {
            // InternalPageGeneratorLanguare.g:7837:1: ( '=' )
            // InternalPageGeneratorLanguare.g:7838:2: '='
            {
             before(grammarAccess.getColourRGBAccess().getEqualsSignKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getColourRGBAccess().getEqualsSignKeyword_3()); 

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
    // $ANTLR end "rule__ColourRGB__Group__3__Impl"


    // $ANTLR start "rule__ColourRGB__Group__4"
    // InternalPageGeneratorLanguare.g:7847:1: rule__ColourRGB__Group__4 : rule__ColourRGB__Group__4__Impl rule__ColourRGB__Group__5 ;
    public final void rule__ColourRGB__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7851:1: ( rule__ColourRGB__Group__4__Impl rule__ColourRGB__Group__5 )
            // InternalPageGeneratorLanguare.g:7852:2: rule__ColourRGB__Group__4__Impl rule__ColourRGB__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__ColourRGB__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColourRGB__Group__5();

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
    // $ANTLR end "rule__ColourRGB__Group__4"


    // $ANTLR start "rule__ColourRGB__Group__4__Impl"
    // InternalPageGeneratorLanguare.g:7859:1: rule__ColourRGB__Group__4__Impl : ( ( rule__ColourRGB__RgbAssignment_4 ) ) ;
    public final void rule__ColourRGB__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7863:1: ( ( ( rule__ColourRGB__RgbAssignment_4 ) ) )
            // InternalPageGeneratorLanguare.g:7864:1: ( ( rule__ColourRGB__RgbAssignment_4 ) )
            {
            // InternalPageGeneratorLanguare.g:7864:1: ( ( rule__ColourRGB__RgbAssignment_4 ) )
            // InternalPageGeneratorLanguare.g:7865:2: ( rule__ColourRGB__RgbAssignment_4 )
            {
             before(grammarAccess.getColourRGBAccess().getRgbAssignment_4()); 
            // InternalPageGeneratorLanguare.g:7866:2: ( rule__ColourRGB__RgbAssignment_4 )
            // InternalPageGeneratorLanguare.g:7866:3: rule__ColourRGB__RgbAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ColourRGB__RgbAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getColourRGBAccess().getRgbAssignment_4()); 

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
    // $ANTLR end "rule__ColourRGB__Group__4__Impl"


    // $ANTLR start "rule__ColourRGB__Group__5"
    // InternalPageGeneratorLanguare.g:7874:1: rule__ColourRGB__Group__5 : rule__ColourRGB__Group__5__Impl rule__ColourRGB__Group__6 ;
    public final void rule__ColourRGB__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7878:1: ( rule__ColourRGB__Group__5__Impl rule__ColourRGB__Group__6 )
            // InternalPageGeneratorLanguare.g:7879:2: rule__ColourRGB__Group__5__Impl rule__ColourRGB__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__ColourRGB__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColourRGB__Group__6();

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
    // $ANTLR end "rule__ColourRGB__Group__5"


    // $ANTLR start "rule__ColourRGB__Group__5__Impl"
    // InternalPageGeneratorLanguare.g:7886:1: rule__ColourRGB__Group__5__Impl : ( ( rule__ColourRGB__RedAssignment_5 ) ) ;
    public final void rule__ColourRGB__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7890:1: ( ( ( rule__ColourRGB__RedAssignment_5 ) ) )
            // InternalPageGeneratorLanguare.g:7891:1: ( ( rule__ColourRGB__RedAssignment_5 ) )
            {
            // InternalPageGeneratorLanguare.g:7891:1: ( ( rule__ColourRGB__RedAssignment_5 ) )
            // InternalPageGeneratorLanguare.g:7892:2: ( rule__ColourRGB__RedAssignment_5 )
            {
             before(grammarAccess.getColourRGBAccess().getRedAssignment_5()); 
            // InternalPageGeneratorLanguare.g:7893:2: ( rule__ColourRGB__RedAssignment_5 )
            // InternalPageGeneratorLanguare.g:7893:3: rule__ColourRGB__RedAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ColourRGB__RedAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getColourRGBAccess().getRedAssignment_5()); 

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
    // $ANTLR end "rule__ColourRGB__Group__5__Impl"


    // $ANTLR start "rule__ColourRGB__Group__6"
    // InternalPageGeneratorLanguare.g:7901:1: rule__ColourRGB__Group__6 : rule__ColourRGB__Group__6__Impl rule__ColourRGB__Group__7 ;
    public final void rule__ColourRGB__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7905:1: ( rule__ColourRGB__Group__6__Impl rule__ColourRGB__Group__7 )
            // InternalPageGeneratorLanguare.g:7906:2: rule__ColourRGB__Group__6__Impl rule__ColourRGB__Group__7
            {
            pushFollow(FOLLOW_19);
            rule__ColourRGB__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColourRGB__Group__7();

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
    // $ANTLR end "rule__ColourRGB__Group__6"


    // $ANTLR start "rule__ColourRGB__Group__6__Impl"
    // InternalPageGeneratorLanguare.g:7913:1: rule__ColourRGB__Group__6__Impl : ( ',' ) ;
    public final void rule__ColourRGB__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7917:1: ( ( ',' ) )
            // InternalPageGeneratorLanguare.g:7918:1: ( ',' )
            {
            // InternalPageGeneratorLanguare.g:7918:1: ( ',' )
            // InternalPageGeneratorLanguare.g:7919:2: ','
            {
             before(grammarAccess.getColourRGBAccess().getCommaKeyword_6()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getColourRGBAccess().getCommaKeyword_6()); 

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
    // $ANTLR end "rule__ColourRGB__Group__6__Impl"


    // $ANTLR start "rule__ColourRGB__Group__7"
    // InternalPageGeneratorLanguare.g:7928:1: rule__ColourRGB__Group__7 : rule__ColourRGB__Group__7__Impl rule__ColourRGB__Group__8 ;
    public final void rule__ColourRGB__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7932:1: ( rule__ColourRGB__Group__7__Impl rule__ColourRGB__Group__8 )
            // InternalPageGeneratorLanguare.g:7933:2: rule__ColourRGB__Group__7__Impl rule__ColourRGB__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__ColourRGB__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColourRGB__Group__8();

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
    // $ANTLR end "rule__ColourRGB__Group__7"


    // $ANTLR start "rule__ColourRGB__Group__7__Impl"
    // InternalPageGeneratorLanguare.g:7940:1: rule__ColourRGB__Group__7__Impl : ( ( rule__ColourRGB__GreenAssignment_7 ) ) ;
    public final void rule__ColourRGB__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7944:1: ( ( ( rule__ColourRGB__GreenAssignment_7 ) ) )
            // InternalPageGeneratorLanguare.g:7945:1: ( ( rule__ColourRGB__GreenAssignment_7 ) )
            {
            // InternalPageGeneratorLanguare.g:7945:1: ( ( rule__ColourRGB__GreenAssignment_7 ) )
            // InternalPageGeneratorLanguare.g:7946:2: ( rule__ColourRGB__GreenAssignment_7 )
            {
             before(grammarAccess.getColourRGBAccess().getGreenAssignment_7()); 
            // InternalPageGeneratorLanguare.g:7947:2: ( rule__ColourRGB__GreenAssignment_7 )
            // InternalPageGeneratorLanguare.g:7947:3: rule__ColourRGB__GreenAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__ColourRGB__GreenAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getColourRGBAccess().getGreenAssignment_7()); 

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
    // $ANTLR end "rule__ColourRGB__Group__7__Impl"


    // $ANTLR start "rule__ColourRGB__Group__8"
    // InternalPageGeneratorLanguare.g:7955:1: rule__ColourRGB__Group__8 : rule__ColourRGB__Group__8__Impl rule__ColourRGB__Group__9 ;
    public final void rule__ColourRGB__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7959:1: ( rule__ColourRGB__Group__8__Impl rule__ColourRGB__Group__9 )
            // InternalPageGeneratorLanguare.g:7960:2: rule__ColourRGB__Group__8__Impl rule__ColourRGB__Group__9
            {
            pushFollow(FOLLOW_19);
            rule__ColourRGB__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColourRGB__Group__9();

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
    // $ANTLR end "rule__ColourRGB__Group__8"


    // $ANTLR start "rule__ColourRGB__Group__8__Impl"
    // InternalPageGeneratorLanguare.g:7967:1: rule__ColourRGB__Group__8__Impl : ( ',' ) ;
    public final void rule__ColourRGB__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7971:1: ( ( ',' ) )
            // InternalPageGeneratorLanguare.g:7972:1: ( ',' )
            {
            // InternalPageGeneratorLanguare.g:7972:1: ( ',' )
            // InternalPageGeneratorLanguare.g:7973:2: ','
            {
             before(grammarAccess.getColourRGBAccess().getCommaKeyword_8()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getColourRGBAccess().getCommaKeyword_8()); 

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
    // $ANTLR end "rule__ColourRGB__Group__8__Impl"


    // $ANTLR start "rule__ColourRGB__Group__9"
    // InternalPageGeneratorLanguare.g:7982:1: rule__ColourRGB__Group__9 : rule__ColourRGB__Group__9__Impl rule__ColourRGB__Group__10 ;
    public final void rule__ColourRGB__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7986:1: ( rule__ColourRGB__Group__9__Impl rule__ColourRGB__Group__10 )
            // InternalPageGeneratorLanguare.g:7987:2: rule__ColourRGB__Group__9__Impl rule__ColourRGB__Group__10
            {
            pushFollow(FOLLOW_33);
            rule__ColourRGB__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColourRGB__Group__10();

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
    // $ANTLR end "rule__ColourRGB__Group__9"


    // $ANTLR start "rule__ColourRGB__Group__9__Impl"
    // InternalPageGeneratorLanguare.g:7994:1: rule__ColourRGB__Group__9__Impl : ( ( rule__ColourRGB__BlueAssignment_9 ) ) ;
    public final void rule__ColourRGB__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:7998:1: ( ( ( rule__ColourRGB__BlueAssignment_9 ) ) )
            // InternalPageGeneratorLanguare.g:7999:1: ( ( rule__ColourRGB__BlueAssignment_9 ) )
            {
            // InternalPageGeneratorLanguare.g:7999:1: ( ( rule__ColourRGB__BlueAssignment_9 ) )
            // InternalPageGeneratorLanguare.g:8000:2: ( rule__ColourRGB__BlueAssignment_9 )
            {
             before(grammarAccess.getColourRGBAccess().getBlueAssignment_9()); 
            // InternalPageGeneratorLanguare.g:8001:2: ( rule__ColourRGB__BlueAssignment_9 )
            // InternalPageGeneratorLanguare.g:8001:3: rule__ColourRGB__BlueAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__ColourRGB__BlueAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getColourRGBAccess().getBlueAssignment_9()); 

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
    // $ANTLR end "rule__ColourRGB__Group__9__Impl"


    // $ANTLR start "rule__ColourRGB__Group__10"
    // InternalPageGeneratorLanguare.g:8009:1: rule__ColourRGB__Group__10 : rule__ColourRGB__Group__10__Impl rule__ColourRGB__Group__11 ;
    public final void rule__ColourRGB__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8013:1: ( rule__ColourRGB__Group__10__Impl rule__ColourRGB__Group__11 )
            // InternalPageGeneratorLanguare.g:8014:2: rule__ColourRGB__Group__10__Impl rule__ColourRGB__Group__11
            {
            pushFollow(FOLLOW_10);
            rule__ColourRGB__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColourRGB__Group__11();

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
    // $ANTLR end "rule__ColourRGB__Group__10"


    // $ANTLR start "rule__ColourRGB__Group__10__Impl"
    // InternalPageGeneratorLanguare.g:8021:1: rule__ColourRGB__Group__10__Impl : ( ')' ) ;
    public final void rule__ColourRGB__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8025:1: ( ( ')' ) )
            // InternalPageGeneratorLanguare.g:8026:1: ( ')' )
            {
            // InternalPageGeneratorLanguare.g:8026:1: ( ')' )
            // InternalPageGeneratorLanguare.g:8027:2: ')'
            {
             before(grammarAccess.getColourRGBAccess().getRightParenthesisKeyword_10()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getColourRGBAccess().getRightParenthesisKeyword_10()); 

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
    // $ANTLR end "rule__ColourRGB__Group__10__Impl"


    // $ANTLR start "rule__ColourRGB__Group__11"
    // InternalPageGeneratorLanguare.g:8036:1: rule__ColourRGB__Group__11 : rule__ColourRGB__Group__11__Impl ;
    public final void rule__ColourRGB__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8040:1: ( rule__ColourRGB__Group__11__Impl )
            // InternalPageGeneratorLanguare.g:8041:2: rule__ColourRGB__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColourRGB__Group__11__Impl();

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
    // $ANTLR end "rule__ColourRGB__Group__11"


    // $ANTLR start "rule__ColourRGB__Group__11__Impl"
    // InternalPageGeneratorLanguare.g:8047:1: rule__ColourRGB__Group__11__Impl : ( ';' ) ;
    public final void rule__ColourRGB__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8051:1: ( ( ';' ) )
            // InternalPageGeneratorLanguare.g:8052:1: ( ';' )
            {
            // InternalPageGeneratorLanguare.g:8052:1: ( ';' )
            // InternalPageGeneratorLanguare.g:8053:2: ';'
            {
             before(grammarAccess.getColourRGBAccess().getSemicolonKeyword_11()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getColourRGBAccess().getSemicolonKeyword_11()); 

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
    // $ANTLR end "rule__ColourRGB__Group__11__Impl"


    // $ANTLR start "rule__Content__Group__0"
    // InternalPageGeneratorLanguare.g:8063:1: rule__Content__Group__0 : rule__Content__Group__0__Impl rule__Content__Group__1 ;
    public final void rule__Content__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8067:1: ( rule__Content__Group__0__Impl rule__Content__Group__1 )
            // InternalPageGeneratorLanguare.g:8068:2: rule__Content__Group__0__Impl rule__Content__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__Content__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Content__Group__1();

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
    // $ANTLR end "rule__Content__Group__0"


    // $ANTLR start "rule__Content__Group__0__Impl"
    // InternalPageGeneratorLanguare.g:8075:1: rule__Content__Group__0__Impl : ( ruleprimaryString ) ;
    public final void rule__Content__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8079:1: ( ( ruleprimaryString ) )
            // InternalPageGeneratorLanguare.g:8080:1: ( ruleprimaryString )
            {
            // InternalPageGeneratorLanguare.g:8080:1: ( ruleprimaryString )
            // InternalPageGeneratorLanguare.g:8081:2: ruleprimaryString
            {
             before(grammarAccess.getContentAccess().getPrimaryStringParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleprimaryString();

            state._fsp--;

             after(grammarAccess.getContentAccess().getPrimaryStringParserRuleCall_0()); 

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
    // $ANTLR end "rule__Content__Group__0__Impl"


    // $ANTLR start "rule__Content__Group__1"
    // InternalPageGeneratorLanguare.g:8090:1: rule__Content__Group__1 : rule__Content__Group__1__Impl ;
    public final void rule__Content__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8094:1: ( rule__Content__Group__1__Impl )
            // InternalPageGeneratorLanguare.g:8095:2: rule__Content__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Content__Group__1__Impl();

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
    // $ANTLR end "rule__Content__Group__1"


    // $ANTLR start "rule__Content__Group__1__Impl"
    // InternalPageGeneratorLanguare.g:8101:1: rule__Content__Group__1__Impl : ( ( rule__Content__Group_1__0 )* ) ;
    public final void rule__Content__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8105:1: ( ( ( rule__Content__Group_1__0 )* ) )
            // InternalPageGeneratorLanguare.g:8106:1: ( ( rule__Content__Group_1__0 )* )
            {
            // InternalPageGeneratorLanguare.g:8106:1: ( ( rule__Content__Group_1__0 )* )
            // InternalPageGeneratorLanguare.g:8107:2: ( rule__Content__Group_1__0 )*
            {
             before(grammarAccess.getContentAccess().getGroup_1()); 
            // InternalPageGeneratorLanguare.g:8108:2: ( rule__Content__Group_1__0 )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( ((LA86_0>=11 && LA86_0<=12)) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // InternalPageGeneratorLanguare.g:8108:3: rule__Content__Group_1__0
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__Content__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop86;
                }
            } while (true);

             after(grammarAccess.getContentAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Content__Group__1__Impl"


    // $ANTLR start "rule__Content__Group_1__0"
    // InternalPageGeneratorLanguare.g:8117:1: rule__Content__Group_1__0 : rule__Content__Group_1__0__Impl rule__Content__Group_1__1 ;
    public final void rule__Content__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8121:1: ( rule__Content__Group_1__0__Impl rule__Content__Group_1__1 )
            // InternalPageGeneratorLanguare.g:8122:2: rule__Content__Group_1__0__Impl rule__Content__Group_1__1
            {
            pushFollow(FOLLOW_34);
            rule__Content__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Content__Group_1__1();

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
    // $ANTLR end "rule__Content__Group_1__0"


    // $ANTLR start "rule__Content__Group_1__0__Impl"
    // InternalPageGeneratorLanguare.g:8129:1: rule__Content__Group_1__0__Impl : ( () ) ;
    public final void rule__Content__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8133:1: ( ( () ) )
            // InternalPageGeneratorLanguare.g:8134:1: ( () )
            {
            // InternalPageGeneratorLanguare.g:8134:1: ( () )
            // InternalPageGeneratorLanguare.g:8135:2: ()
            {
             before(grammarAccess.getContentAccess().getContentLeftAction_1_0()); 
            // InternalPageGeneratorLanguare.g:8136:2: ()
            // InternalPageGeneratorLanguare.g:8136:3: 
            {
            }

             after(grammarAccess.getContentAccess().getContentLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group_1__0__Impl"


    // $ANTLR start "rule__Content__Group_1__1"
    // InternalPageGeneratorLanguare.g:8144:1: rule__Content__Group_1__1 : rule__Content__Group_1__1__Impl rule__Content__Group_1__2 ;
    public final void rule__Content__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8148:1: ( rule__Content__Group_1__1__Impl rule__Content__Group_1__2 )
            // InternalPageGeneratorLanguare.g:8149:2: rule__Content__Group_1__1__Impl rule__Content__Group_1__2
            {
            pushFollow(FOLLOW_21);
            rule__Content__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Content__Group_1__2();

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
    // $ANTLR end "rule__Content__Group_1__1"


    // $ANTLR start "rule__Content__Group_1__1__Impl"
    // InternalPageGeneratorLanguare.g:8156:1: rule__Content__Group_1__1__Impl : ( ( rule__Content__SeparatorAssignment_1_1 ) ) ;
    public final void rule__Content__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8160:1: ( ( ( rule__Content__SeparatorAssignment_1_1 ) ) )
            // InternalPageGeneratorLanguare.g:8161:1: ( ( rule__Content__SeparatorAssignment_1_1 ) )
            {
            // InternalPageGeneratorLanguare.g:8161:1: ( ( rule__Content__SeparatorAssignment_1_1 ) )
            // InternalPageGeneratorLanguare.g:8162:2: ( rule__Content__SeparatorAssignment_1_1 )
            {
             before(grammarAccess.getContentAccess().getSeparatorAssignment_1_1()); 
            // InternalPageGeneratorLanguare.g:8163:2: ( rule__Content__SeparatorAssignment_1_1 )
            // InternalPageGeneratorLanguare.g:8163:3: rule__Content__SeparatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Content__SeparatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getContentAccess().getSeparatorAssignment_1_1()); 

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
    // $ANTLR end "rule__Content__Group_1__1__Impl"


    // $ANTLR start "rule__Content__Group_1__2"
    // InternalPageGeneratorLanguare.g:8171:1: rule__Content__Group_1__2 : rule__Content__Group_1__2__Impl ;
    public final void rule__Content__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8175:1: ( rule__Content__Group_1__2__Impl )
            // InternalPageGeneratorLanguare.g:8176:2: rule__Content__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Content__Group_1__2__Impl();

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
    // $ANTLR end "rule__Content__Group_1__2"


    // $ANTLR start "rule__Content__Group_1__2__Impl"
    // InternalPageGeneratorLanguare.g:8182:1: rule__Content__Group_1__2__Impl : ( ( rule__Content__RightAssignment_1_2 ) ) ;
    public final void rule__Content__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8186:1: ( ( ( rule__Content__RightAssignment_1_2 ) ) )
            // InternalPageGeneratorLanguare.g:8187:1: ( ( rule__Content__RightAssignment_1_2 ) )
            {
            // InternalPageGeneratorLanguare.g:8187:1: ( ( rule__Content__RightAssignment_1_2 ) )
            // InternalPageGeneratorLanguare.g:8188:2: ( rule__Content__RightAssignment_1_2 )
            {
             before(grammarAccess.getContentAccess().getRightAssignment_1_2()); 
            // InternalPageGeneratorLanguare.g:8189:2: ( rule__Content__RightAssignment_1_2 )
            // InternalPageGeneratorLanguare.g:8189:3: rule__Content__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Content__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getContentAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__Content__Group_1__2__Impl"


    // $ANTLR start "rule__StringDeclaration__Group__0"
    // InternalPageGeneratorLanguare.g:8198:1: rule__StringDeclaration__Group__0 : rule__StringDeclaration__Group__0__Impl rule__StringDeclaration__Group__1 ;
    public final void rule__StringDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8202:1: ( rule__StringDeclaration__Group__0__Impl rule__StringDeclaration__Group__1 )
            // InternalPageGeneratorLanguare.g:8203:2: rule__StringDeclaration__Group__0__Impl rule__StringDeclaration__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__StringDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringDeclaration__Group__1();

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
    // $ANTLR end "rule__StringDeclaration__Group__0"


    // $ANTLR start "rule__StringDeclaration__Group__0__Impl"
    // InternalPageGeneratorLanguare.g:8210:1: rule__StringDeclaration__Group__0__Impl : ( 'Hightlight-word' ) ;
    public final void rule__StringDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8214:1: ( ( 'Hightlight-word' ) )
            // InternalPageGeneratorLanguare.g:8215:1: ( 'Hightlight-word' )
            {
            // InternalPageGeneratorLanguare.g:8215:1: ( 'Hightlight-word' )
            // InternalPageGeneratorLanguare.g:8216:2: 'Hightlight-word'
            {
             before(grammarAccess.getStringDeclarationAccess().getHightlightWordKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getStringDeclarationAccess().getHightlightWordKeyword_0()); 

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
    // $ANTLR end "rule__StringDeclaration__Group__0__Impl"


    // $ANTLR start "rule__StringDeclaration__Group__1"
    // InternalPageGeneratorLanguare.g:8225:1: rule__StringDeclaration__Group__1 : rule__StringDeclaration__Group__1__Impl rule__StringDeclaration__Group__2 ;
    public final void rule__StringDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8229:1: ( rule__StringDeclaration__Group__1__Impl rule__StringDeclaration__Group__2 )
            // InternalPageGeneratorLanguare.g:8230:2: rule__StringDeclaration__Group__1__Impl rule__StringDeclaration__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__StringDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringDeclaration__Group__2();

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
    // $ANTLR end "rule__StringDeclaration__Group__1"


    // $ANTLR start "rule__StringDeclaration__Group__1__Impl"
    // InternalPageGeneratorLanguare.g:8237:1: rule__StringDeclaration__Group__1__Impl : ( ( rule__StringDeclaration__NameAssignment_1 ) ) ;
    public final void rule__StringDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8241:1: ( ( ( rule__StringDeclaration__NameAssignment_1 ) ) )
            // InternalPageGeneratorLanguare.g:8242:1: ( ( rule__StringDeclaration__NameAssignment_1 ) )
            {
            // InternalPageGeneratorLanguare.g:8242:1: ( ( rule__StringDeclaration__NameAssignment_1 ) )
            // InternalPageGeneratorLanguare.g:8243:2: ( rule__StringDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getStringDeclarationAccess().getNameAssignment_1()); 
            // InternalPageGeneratorLanguare.g:8244:2: ( rule__StringDeclaration__NameAssignment_1 )
            // InternalPageGeneratorLanguare.g:8244:3: rule__StringDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StringDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStringDeclarationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__StringDeclaration__Group__1__Impl"


    // $ANTLR start "rule__StringDeclaration__Group__2"
    // InternalPageGeneratorLanguare.g:8252:1: rule__StringDeclaration__Group__2 : rule__StringDeclaration__Group__2__Impl rule__StringDeclaration__Group__3 ;
    public final void rule__StringDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8256:1: ( rule__StringDeclaration__Group__2__Impl rule__StringDeclaration__Group__3 )
            // InternalPageGeneratorLanguare.g:8257:2: rule__StringDeclaration__Group__2__Impl rule__StringDeclaration__Group__3
            {
            pushFollow(FOLLOW_36);
            rule__StringDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringDeclaration__Group__3();

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
    // $ANTLR end "rule__StringDeclaration__Group__2"


    // $ANTLR start "rule__StringDeclaration__Group__2__Impl"
    // InternalPageGeneratorLanguare.g:8264:1: rule__StringDeclaration__Group__2__Impl : ( '<' ) ;
    public final void rule__StringDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8268:1: ( ( '<' ) )
            // InternalPageGeneratorLanguare.g:8269:1: ( '<' )
            {
            // InternalPageGeneratorLanguare.g:8269:1: ( '<' )
            // InternalPageGeneratorLanguare.g:8270:2: '<'
            {
             before(grammarAccess.getStringDeclarationAccess().getLessThanSignKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getStringDeclarationAccess().getLessThanSignKeyword_2()); 

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
    // $ANTLR end "rule__StringDeclaration__Group__2__Impl"


    // $ANTLR start "rule__StringDeclaration__Group__3"
    // InternalPageGeneratorLanguare.g:8279:1: rule__StringDeclaration__Group__3 : rule__StringDeclaration__Group__3__Impl rule__StringDeclaration__Group__4 ;
    public final void rule__StringDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8283:1: ( rule__StringDeclaration__Group__3__Impl rule__StringDeclaration__Group__4 )
            // InternalPageGeneratorLanguare.g:8284:2: rule__StringDeclaration__Group__3__Impl rule__StringDeclaration__Group__4
            {
            pushFollow(FOLLOW_36);
            rule__StringDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringDeclaration__Group__4();

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
    // $ANTLR end "rule__StringDeclaration__Group__3"


    // $ANTLR start "rule__StringDeclaration__Group__3__Impl"
    // InternalPageGeneratorLanguare.g:8291:1: rule__StringDeclaration__Group__3__Impl : ( ( rule__StringDeclaration__Group_3__0 )? ) ;
    public final void rule__StringDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8295:1: ( ( ( rule__StringDeclaration__Group_3__0 )? ) )
            // InternalPageGeneratorLanguare.g:8296:1: ( ( rule__StringDeclaration__Group_3__0 )? )
            {
            // InternalPageGeneratorLanguare.g:8296:1: ( ( rule__StringDeclaration__Group_3__0 )? )
            // InternalPageGeneratorLanguare.g:8297:2: ( rule__StringDeclaration__Group_3__0 )?
            {
             before(grammarAccess.getStringDeclarationAccess().getGroup_3()); 
            // InternalPageGeneratorLanguare.g:8298:2: ( rule__StringDeclaration__Group_3__0 )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==26) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:8298:3: rule__StringDeclaration__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringDeclaration__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringDeclarationAccess().getGroup_3()); 

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
    // $ANTLR end "rule__StringDeclaration__Group__3__Impl"


    // $ANTLR start "rule__StringDeclaration__Group__4"
    // InternalPageGeneratorLanguare.g:8306:1: rule__StringDeclaration__Group__4 : rule__StringDeclaration__Group__4__Impl rule__StringDeclaration__Group__5 ;
    public final void rule__StringDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8310:1: ( rule__StringDeclaration__Group__4__Impl rule__StringDeclaration__Group__5 )
            // InternalPageGeneratorLanguare.g:8311:2: rule__StringDeclaration__Group__4__Impl rule__StringDeclaration__Group__5
            {
            pushFollow(FOLLOW_36);
            rule__StringDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringDeclaration__Group__5();

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
    // $ANTLR end "rule__StringDeclaration__Group__4"


    // $ANTLR start "rule__StringDeclaration__Group__4__Impl"
    // InternalPageGeneratorLanguare.g:8318:1: rule__StringDeclaration__Group__4__Impl : ( ( rule__StringDeclaration__Group_4__0 )? ) ;
    public final void rule__StringDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8322:1: ( ( ( rule__StringDeclaration__Group_4__0 )? ) )
            // InternalPageGeneratorLanguare.g:8323:1: ( ( rule__StringDeclaration__Group_4__0 )? )
            {
            // InternalPageGeneratorLanguare.g:8323:1: ( ( rule__StringDeclaration__Group_4__0 )? )
            // InternalPageGeneratorLanguare.g:8324:2: ( rule__StringDeclaration__Group_4__0 )?
            {
             before(grammarAccess.getStringDeclarationAccess().getGroup_4()); 
            // InternalPageGeneratorLanguare.g:8325:2: ( rule__StringDeclaration__Group_4__0 )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==34) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:8325:3: rule__StringDeclaration__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringDeclaration__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringDeclarationAccess().getGroup_4()); 

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
    // $ANTLR end "rule__StringDeclaration__Group__4__Impl"


    // $ANTLR start "rule__StringDeclaration__Group__5"
    // InternalPageGeneratorLanguare.g:8333:1: rule__StringDeclaration__Group__5 : rule__StringDeclaration__Group__5__Impl rule__StringDeclaration__Group__6 ;
    public final void rule__StringDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8337:1: ( rule__StringDeclaration__Group__5__Impl rule__StringDeclaration__Group__6 )
            // InternalPageGeneratorLanguare.g:8338:2: rule__StringDeclaration__Group__5__Impl rule__StringDeclaration__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__StringDeclaration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringDeclaration__Group__6();

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
    // $ANTLR end "rule__StringDeclaration__Group__5"


    // $ANTLR start "rule__StringDeclaration__Group__5__Impl"
    // InternalPageGeneratorLanguare.g:8345:1: rule__StringDeclaration__Group__5__Impl : ( '>' ) ;
    public final void rule__StringDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8349:1: ( ( '>' ) )
            // InternalPageGeneratorLanguare.g:8350:1: ( '>' )
            {
            // InternalPageGeneratorLanguare.g:8350:1: ( '>' )
            // InternalPageGeneratorLanguare.g:8351:2: '>'
            {
             before(grammarAccess.getStringDeclarationAccess().getGreaterThanSignKeyword_5()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getStringDeclarationAccess().getGreaterThanSignKeyword_5()); 

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
    // $ANTLR end "rule__StringDeclaration__Group__5__Impl"


    // $ANTLR start "rule__StringDeclaration__Group__6"
    // InternalPageGeneratorLanguare.g:8360:1: rule__StringDeclaration__Group__6 : rule__StringDeclaration__Group__6__Impl rule__StringDeclaration__Group__7 ;
    public final void rule__StringDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8364:1: ( rule__StringDeclaration__Group__6__Impl rule__StringDeclaration__Group__7 )
            // InternalPageGeneratorLanguare.g:8365:2: rule__StringDeclaration__Group__6__Impl rule__StringDeclaration__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__StringDeclaration__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringDeclaration__Group__7();

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
    // $ANTLR end "rule__StringDeclaration__Group__6"


    // $ANTLR start "rule__StringDeclaration__Group__6__Impl"
    // InternalPageGeneratorLanguare.g:8372:1: rule__StringDeclaration__Group__6__Impl : ( '=' ) ;
    public final void rule__StringDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8376:1: ( ( '=' ) )
            // InternalPageGeneratorLanguare.g:8377:1: ( '=' )
            {
            // InternalPageGeneratorLanguare.g:8377:1: ( '=' )
            // InternalPageGeneratorLanguare.g:8378:2: '='
            {
             before(grammarAccess.getStringDeclarationAccess().getEqualsSignKeyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getStringDeclarationAccess().getEqualsSignKeyword_6()); 

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
    // $ANTLR end "rule__StringDeclaration__Group__6__Impl"


    // $ANTLR start "rule__StringDeclaration__Group__7"
    // InternalPageGeneratorLanguare.g:8387:1: rule__StringDeclaration__Group__7 : rule__StringDeclaration__Group__7__Impl rule__StringDeclaration__Group__8 ;
    public final void rule__StringDeclaration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8391:1: ( rule__StringDeclaration__Group__7__Impl rule__StringDeclaration__Group__8 )
            // InternalPageGeneratorLanguare.g:8392:2: rule__StringDeclaration__Group__7__Impl rule__StringDeclaration__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__StringDeclaration__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringDeclaration__Group__8();

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
    // $ANTLR end "rule__StringDeclaration__Group__7"


    // $ANTLR start "rule__StringDeclaration__Group__7__Impl"
    // InternalPageGeneratorLanguare.g:8399:1: rule__StringDeclaration__Group__7__Impl : ( ( rule__StringDeclaration__WordAssignment_7 ) ) ;
    public final void rule__StringDeclaration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8403:1: ( ( ( rule__StringDeclaration__WordAssignment_7 ) ) )
            // InternalPageGeneratorLanguare.g:8404:1: ( ( rule__StringDeclaration__WordAssignment_7 ) )
            {
            // InternalPageGeneratorLanguare.g:8404:1: ( ( rule__StringDeclaration__WordAssignment_7 ) )
            // InternalPageGeneratorLanguare.g:8405:2: ( rule__StringDeclaration__WordAssignment_7 )
            {
             before(grammarAccess.getStringDeclarationAccess().getWordAssignment_7()); 
            // InternalPageGeneratorLanguare.g:8406:2: ( rule__StringDeclaration__WordAssignment_7 )
            // InternalPageGeneratorLanguare.g:8406:3: rule__StringDeclaration__WordAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__StringDeclaration__WordAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getStringDeclarationAccess().getWordAssignment_7()); 

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
    // $ANTLR end "rule__StringDeclaration__Group__7__Impl"


    // $ANTLR start "rule__StringDeclaration__Group__8"
    // InternalPageGeneratorLanguare.g:8414:1: rule__StringDeclaration__Group__8 : rule__StringDeclaration__Group__8__Impl ;
    public final void rule__StringDeclaration__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8418:1: ( rule__StringDeclaration__Group__8__Impl )
            // InternalPageGeneratorLanguare.g:8419:2: rule__StringDeclaration__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringDeclaration__Group__8__Impl();

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
    // $ANTLR end "rule__StringDeclaration__Group__8"


    // $ANTLR start "rule__StringDeclaration__Group__8__Impl"
    // InternalPageGeneratorLanguare.g:8425:1: rule__StringDeclaration__Group__8__Impl : ( ';' ) ;
    public final void rule__StringDeclaration__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8429:1: ( ( ';' ) )
            // InternalPageGeneratorLanguare.g:8430:1: ( ';' )
            {
            // InternalPageGeneratorLanguare.g:8430:1: ( ';' )
            // InternalPageGeneratorLanguare.g:8431:2: ';'
            {
             before(grammarAccess.getStringDeclarationAccess().getSemicolonKeyword_8()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getStringDeclarationAccess().getSemicolonKeyword_8()); 

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
    // $ANTLR end "rule__StringDeclaration__Group__8__Impl"


    // $ANTLR start "rule__StringDeclaration__Group_3__0"
    // InternalPageGeneratorLanguare.g:8441:1: rule__StringDeclaration__Group_3__0 : rule__StringDeclaration__Group_3__0__Impl rule__StringDeclaration__Group_3__1 ;
    public final void rule__StringDeclaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8445:1: ( rule__StringDeclaration__Group_3__0__Impl rule__StringDeclaration__Group_3__1 )
            // InternalPageGeneratorLanguare.g:8446:2: rule__StringDeclaration__Group_3__0__Impl rule__StringDeclaration__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__StringDeclaration__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringDeclaration__Group_3__1();

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
    // $ANTLR end "rule__StringDeclaration__Group_3__0"


    // $ANTLR start "rule__StringDeclaration__Group_3__0__Impl"
    // InternalPageGeneratorLanguare.g:8453:1: rule__StringDeclaration__Group_3__0__Impl : ( 'Font-colour' ) ;
    public final void rule__StringDeclaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8457:1: ( ( 'Font-colour' ) )
            // InternalPageGeneratorLanguare.g:8458:1: ( 'Font-colour' )
            {
            // InternalPageGeneratorLanguare.g:8458:1: ( 'Font-colour' )
            // InternalPageGeneratorLanguare.g:8459:2: 'Font-colour'
            {
             before(grammarAccess.getStringDeclarationAccess().getFontColourKeyword_3_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getStringDeclarationAccess().getFontColourKeyword_3_0()); 

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
    // $ANTLR end "rule__StringDeclaration__Group_3__0__Impl"


    // $ANTLR start "rule__StringDeclaration__Group_3__1"
    // InternalPageGeneratorLanguare.g:8468:1: rule__StringDeclaration__Group_3__1 : rule__StringDeclaration__Group_3__1__Impl rule__StringDeclaration__Group_3__2 ;
    public final void rule__StringDeclaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8472:1: ( rule__StringDeclaration__Group_3__1__Impl rule__StringDeclaration__Group_3__2 )
            // InternalPageGeneratorLanguare.g:8473:2: rule__StringDeclaration__Group_3__1__Impl rule__StringDeclaration__Group_3__2
            {
            pushFollow(FOLLOW_21);
            rule__StringDeclaration__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringDeclaration__Group_3__2();

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
    // $ANTLR end "rule__StringDeclaration__Group_3__1"


    // $ANTLR start "rule__StringDeclaration__Group_3__1__Impl"
    // InternalPageGeneratorLanguare.g:8480:1: rule__StringDeclaration__Group_3__1__Impl : ( '=' ) ;
    public final void rule__StringDeclaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8484:1: ( ( '=' ) )
            // InternalPageGeneratorLanguare.g:8485:1: ( '=' )
            {
            // InternalPageGeneratorLanguare.g:8485:1: ( '=' )
            // InternalPageGeneratorLanguare.g:8486:2: '='
            {
             before(grammarAccess.getStringDeclarationAccess().getEqualsSignKeyword_3_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getStringDeclarationAccess().getEqualsSignKeyword_3_1()); 

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
    // $ANTLR end "rule__StringDeclaration__Group_3__1__Impl"


    // $ANTLR start "rule__StringDeclaration__Group_3__2"
    // InternalPageGeneratorLanguare.g:8495:1: rule__StringDeclaration__Group_3__2 : rule__StringDeclaration__Group_3__2__Impl rule__StringDeclaration__Group_3__3 ;
    public final void rule__StringDeclaration__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8499:1: ( rule__StringDeclaration__Group_3__2__Impl rule__StringDeclaration__Group_3__3 )
            // InternalPageGeneratorLanguare.g:8500:2: rule__StringDeclaration__Group_3__2__Impl rule__StringDeclaration__Group_3__3
            {
            pushFollow(FOLLOW_11);
            rule__StringDeclaration__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringDeclaration__Group_3__3();

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
    // $ANTLR end "rule__StringDeclaration__Group_3__2"


    // $ANTLR start "rule__StringDeclaration__Group_3__2__Impl"
    // InternalPageGeneratorLanguare.g:8507:1: rule__StringDeclaration__Group_3__2__Impl : ( ( rule__StringDeclaration__FontColorAssignment_3_2 ) ) ;
    public final void rule__StringDeclaration__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8511:1: ( ( ( rule__StringDeclaration__FontColorAssignment_3_2 ) ) )
            // InternalPageGeneratorLanguare.g:8512:1: ( ( rule__StringDeclaration__FontColorAssignment_3_2 ) )
            {
            // InternalPageGeneratorLanguare.g:8512:1: ( ( rule__StringDeclaration__FontColorAssignment_3_2 ) )
            // InternalPageGeneratorLanguare.g:8513:2: ( rule__StringDeclaration__FontColorAssignment_3_2 )
            {
             before(grammarAccess.getStringDeclarationAccess().getFontColorAssignment_3_2()); 
            // InternalPageGeneratorLanguare.g:8514:2: ( rule__StringDeclaration__FontColorAssignment_3_2 )
            // InternalPageGeneratorLanguare.g:8514:3: rule__StringDeclaration__FontColorAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__StringDeclaration__FontColorAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getStringDeclarationAccess().getFontColorAssignment_3_2()); 

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
    // $ANTLR end "rule__StringDeclaration__Group_3__2__Impl"


    // $ANTLR start "rule__StringDeclaration__Group_3__3"
    // InternalPageGeneratorLanguare.g:8522:1: rule__StringDeclaration__Group_3__3 : rule__StringDeclaration__Group_3__3__Impl ;
    public final void rule__StringDeclaration__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8526:1: ( rule__StringDeclaration__Group_3__3__Impl )
            // InternalPageGeneratorLanguare.g:8527:2: rule__StringDeclaration__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringDeclaration__Group_3__3__Impl();

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
    // $ANTLR end "rule__StringDeclaration__Group_3__3"


    // $ANTLR start "rule__StringDeclaration__Group_3__3__Impl"
    // InternalPageGeneratorLanguare.g:8533:1: rule__StringDeclaration__Group_3__3__Impl : ( ( ',' )? ) ;
    public final void rule__StringDeclaration__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8537:1: ( ( ( ',' )? ) )
            // InternalPageGeneratorLanguare.g:8538:1: ( ( ',' )? )
            {
            // InternalPageGeneratorLanguare.g:8538:1: ( ( ',' )? )
            // InternalPageGeneratorLanguare.g:8539:2: ( ',' )?
            {
             before(grammarAccess.getStringDeclarationAccess().getCommaKeyword_3_3()); 
            // InternalPageGeneratorLanguare.g:8540:2: ( ',' )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==12) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:8540:3: ','
                    {
                    match(input,12,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getStringDeclarationAccess().getCommaKeyword_3_3()); 

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
    // $ANTLR end "rule__StringDeclaration__Group_3__3__Impl"


    // $ANTLR start "rule__StringDeclaration__Group_4__0"
    // InternalPageGeneratorLanguare.g:8549:1: rule__StringDeclaration__Group_4__0 : rule__StringDeclaration__Group_4__0__Impl rule__StringDeclaration__Group_4__1 ;
    public final void rule__StringDeclaration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8553:1: ( rule__StringDeclaration__Group_4__0__Impl rule__StringDeclaration__Group_4__1 )
            // InternalPageGeneratorLanguare.g:8554:2: rule__StringDeclaration__Group_4__0__Impl rule__StringDeclaration__Group_4__1
            {
            pushFollow(FOLLOW_8);
            rule__StringDeclaration__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringDeclaration__Group_4__1();

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
    // $ANTLR end "rule__StringDeclaration__Group_4__0"


    // $ANTLR start "rule__StringDeclaration__Group_4__0__Impl"
    // InternalPageGeneratorLanguare.g:8561:1: rule__StringDeclaration__Group_4__0__Impl : ( 'Font-size' ) ;
    public final void rule__StringDeclaration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8565:1: ( ( 'Font-size' ) )
            // InternalPageGeneratorLanguare.g:8566:1: ( 'Font-size' )
            {
            // InternalPageGeneratorLanguare.g:8566:1: ( 'Font-size' )
            // InternalPageGeneratorLanguare.g:8567:2: 'Font-size'
            {
             before(grammarAccess.getStringDeclarationAccess().getFontSizeKeyword_4_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getStringDeclarationAccess().getFontSizeKeyword_4_0()); 

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
    // $ANTLR end "rule__StringDeclaration__Group_4__0__Impl"


    // $ANTLR start "rule__StringDeclaration__Group_4__1"
    // InternalPageGeneratorLanguare.g:8576:1: rule__StringDeclaration__Group_4__1 : rule__StringDeclaration__Group_4__1__Impl rule__StringDeclaration__Group_4__2 ;
    public final void rule__StringDeclaration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8580:1: ( rule__StringDeclaration__Group_4__1__Impl rule__StringDeclaration__Group_4__2 )
            // InternalPageGeneratorLanguare.g:8581:2: rule__StringDeclaration__Group_4__1__Impl rule__StringDeclaration__Group_4__2
            {
            pushFollow(FOLLOW_19);
            rule__StringDeclaration__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringDeclaration__Group_4__2();

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
    // $ANTLR end "rule__StringDeclaration__Group_4__1"


    // $ANTLR start "rule__StringDeclaration__Group_4__1__Impl"
    // InternalPageGeneratorLanguare.g:8588:1: rule__StringDeclaration__Group_4__1__Impl : ( '=' ) ;
    public final void rule__StringDeclaration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8592:1: ( ( '=' ) )
            // InternalPageGeneratorLanguare.g:8593:1: ( '=' )
            {
            // InternalPageGeneratorLanguare.g:8593:1: ( '=' )
            // InternalPageGeneratorLanguare.g:8594:2: '='
            {
             before(grammarAccess.getStringDeclarationAccess().getEqualsSignKeyword_4_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getStringDeclarationAccess().getEqualsSignKeyword_4_1()); 

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
    // $ANTLR end "rule__StringDeclaration__Group_4__1__Impl"


    // $ANTLR start "rule__StringDeclaration__Group_4__2"
    // InternalPageGeneratorLanguare.g:8603:1: rule__StringDeclaration__Group_4__2 : rule__StringDeclaration__Group_4__2__Impl rule__StringDeclaration__Group_4__3 ;
    public final void rule__StringDeclaration__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8607:1: ( rule__StringDeclaration__Group_4__2__Impl rule__StringDeclaration__Group_4__3 )
            // InternalPageGeneratorLanguare.g:8608:2: rule__StringDeclaration__Group_4__2__Impl rule__StringDeclaration__Group_4__3
            {
            pushFollow(FOLLOW_11);
            rule__StringDeclaration__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringDeclaration__Group_4__3();

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
    // $ANTLR end "rule__StringDeclaration__Group_4__2"


    // $ANTLR start "rule__StringDeclaration__Group_4__2__Impl"
    // InternalPageGeneratorLanguare.g:8615:1: rule__StringDeclaration__Group_4__2__Impl : ( ( rule__StringDeclaration__FontSizeAssignment_4_2 ) ) ;
    public final void rule__StringDeclaration__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8619:1: ( ( ( rule__StringDeclaration__FontSizeAssignment_4_2 ) ) )
            // InternalPageGeneratorLanguare.g:8620:1: ( ( rule__StringDeclaration__FontSizeAssignment_4_2 ) )
            {
            // InternalPageGeneratorLanguare.g:8620:1: ( ( rule__StringDeclaration__FontSizeAssignment_4_2 ) )
            // InternalPageGeneratorLanguare.g:8621:2: ( rule__StringDeclaration__FontSizeAssignment_4_2 )
            {
             before(grammarAccess.getStringDeclarationAccess().getFontSizeAssignment_4_2()); 
            // InternalPageGeneratorLanguare.g:8622:2: ( rule__StringDeclaration__FontSizeAssignment_4_2 )
            // InternalPageGeneratorLanguare.g:8622:3: rule__StringDeclaration__FontSizeAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__StringDeclaration__FontSizeAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getStringDeclarationAccess().getFontSizeAssignment_4_2()); 

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
    // $ANTLR end "rule__StringDeclaration__Group_4__2__Impl"


    // $ANTLR start "rule__StringDeclaration__Group_4__3"
    // InternalPageGeneratorLanguare.g:8630:1: rule__StringDeclaration__Group_4__3 : rule__StringDeclaration__Group_4__3__Impl ;
    public final void rule__StringDeclaration__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8634:1: ( rule__StringDeclaration__Group_4__3__Impl )
            // InternalPageGeneratorLanguare.g:8635:2: rule__StringDeclaration__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringDeclaration__Group_4__3__Impl();

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
    // $ANTLR end "rule__StringDeclaration__Group_4__3"


    // $ANTLR start "rule__StringDeclaration__Group_4__3__Impl"
    // InternalPageGeneratorLanguare.g:8641:1: rule__StringDeclaration__Group_4__3__Impl : ( ( ',' )? ) ;
    public final void rule__StringDeclaration__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8645:1: ( ( ( ',' )? ) )
            // InternalPageGeneratorLanguare.g:8646:1: ( ( ',' )? )
            {
            // InternalPageGeneratorLanguare.g:8646:1: ( ( ',' )? )
            // InternalPageGeneratorLanguare.g:8647:2: ( ',' )?
            {
             before(grammarAccess.getStringDeclarationAccess().getCommaKeyword_4_3()); 
            // InternalPageGeneratorLanguare.g:8648:2: ( ',' )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==12) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:8648:3: ','
                    {
                    match(input,12,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getStringDeclarationAccess().getCommaKeyword_4_3()); 

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
    // $ANTLR end "rule__StringDeclaration__Group_4__3__Impl"


    // $ANTLR start "rule__WebPage__PageElementsAssignment"
    // InternalPageGeneratorLanguare.g:8657:1: rule__WebPage__PageElementsAssignment : ( rulepageElement ) ;
    public final void rule__WebPage__PageElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8661:1: ( ( rulepageElement ) )
            // InternalPageGeneratorLanguare.g:8662:2: ( rulepageElement )
            {
            // InternalPageGeneratorLanguare.g:8662:2: ( rulepageElement )
            // InternalPageGeneratorLanguare.g:8663:3: rulepageElement
            {
             before(grammarAccess.getWebPageAccess().getPageElementsPageElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulepageElement();

            state._fsp--;

             after(grammarAccess.getWebPageAccess().getPageElementsPageElementParserRuleCall_0()); 

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
    // $ANTLR end "rule__WebPage__PageElementsAssignment"


    // $ANTLR start "rule__Head__HeadElementsAssignment_3"
    // InternalPageGeneratorLanguare.g:8672:1: rule__Head__HeadElementsAssignment_3 : ( ruleheadElement ) ;
    public final void rule__Head__HeadElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8676:1: ( ( ruleheadElement ) )
            // InternalPageGeneratorLanguare.g:8677:2: ( ruleheadElement )
            {
            // InternalPageGeneratorLanguare.g:8677:2: ( ruleheadElement )
            // InternalPageGeneratorLanguare.g:8678:3: ruleheadElement
            {
             before(grammarAccess.getHeadAccess().getHeadElementsHeadElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleheadElement();

            state._fsp--;

             after(grammarAccess.getHeadAccess().getHeadElementsHeadElementParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Head__HeadElementsAssignment_3"


    // $ANTLR start "rule__Title__NameAssignment_2"
    // InternalPageGeneratorLanguare.g:8687:1: rule__Title__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Title__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8691:1: ( ( RULE_STRING ) )
            // InternalPageGeneratorLanguare.g:8692:2: ( RULE_STRING )
            {
            // InternalPageGeneratorLanguare.g:8692:2: ( RULE_STRING )
            // InternalPageGeneratorLanguare.g:8693:3: RULE_STRING
            {
             before(grammarAccess.getTitleAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTitleAccess().getNameSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Title__NameAssignment_2"


    // $ANTLR start "rule__Label__NameAssignment_2"
    // InternalPageGeneratorLanguare.g:8702:1: rule__Label__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Label__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8706:1: ( ( RULE_STRING ) )
            // InternalPageGeneratorLanguare.g:8707:2: ( RULE_STRING )
            {
            // InternalPageGeneratorLanguare.g:8707:2: ( RULE_STRING )
            // InternalPageGeneratorLanguare.g:8708:3: RULE_STRING
            {
             before(grammarAccess.getLabelAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLabelAccess().getNameSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Label__NameAssignment_2"


    // $ANTLR start "rule__Label__LabelAssignment_6"
    // InternalPageGeneratorLanguare.g:8717:1: rule__Label__LabelAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Label__LabelAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8721:1: ( ( RULE_STRING ) )
            // InternalPageGeneratorLanguare.g:8722:2: ( RULE_STRING )
            {
            // InternalPageGeneratorLanguare.g:8722:2: ( RULE_STRING )
            // InternalPageGeneratorLanguare.g:8723:3: RULE_STRING
            {
             before(grammarAccess.getLabelAccess().getLabelSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLabelAccess().getLabelSTRINGTerminalRuleCall_6_0()); 

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
    // $ANTLR end "rule__Label__LabelAssignment_6"


    // $ANTLR start "rule__Body__BodyElementsAssignment_3"
    // InternalPageGeneratorLanguare.g:8732:1: rule__Body__BodyElementsAssignment_3 : ( rulebodyElement ) ;
    public final void rule__Body__BodyElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8736:1: ( ( rulebodyElement ) )
            // InternalPageGeneratorLanguare.g:8737:2: ( rulebodyElement )
            {
            // InternalPageGeneratorLanguare.g:8737:2: ( rulebodyElement )
            // InternalPageGeneratorLanguare.g:8738:3: rulebodyElement
            {
             before(grammarAccess.getBodyAccess().getBodyElementsBodyElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulebodyElement();

            state._fsp--;

             after(grammarAccess.getBodyAccess().getBodyElementsBodyElementParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Body__BodyElementsAssignment_3"


    // $ANTLR start "rule__Heading__NameAssignment_1"
    // InternalPageGeneratorLanguare.g:8747:1: rule__Heading__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Heading__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8751:1: ( ( RULE_ID ) )
            // InternalPageGeneratorLanguare.g:8752:2: ( RULE_ID )
            {
            // InternalPageGeneratorLanguare.g:8752:2: ( RULE_ID )
            // InternalPageGeneratorLanguare.g:8753:3: RULE_ID
            {
             before(grammarAccess.getHeadingAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getHeadingAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Heading__NameAssignment_1"


    // $ANTLR start "rule__Heading__IndexAssignment_5"
    // InternalPageGeneratorLanguare.g:8762:1: rule__Heading__IndexAssignment_5 : ( RULE_INT ) ;
    public final void rule__Heading__IndexAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8766:1: ( ( RULE_INT ) )
            // InternalPageGeneratorLanguare.g:8767:2: ( RULE_INT )
            {
            // InternalPageGeneratorLanguare.g:8767:2: ( RULE_INT )
            // InternalPageGeneratorLanguare.g:8768:3: RULE_INT
            {
             before(grammarAccess.getHeadingAccess().getIndexINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getHeadingAccess().getIndexINTTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Heading__IndexAssignment_5"


    // $ANTLR start "rule__Heading__FontColorAssignment_7_2"
    // InternalPageGeneratorLanguare.g:8777:1: rule__Heading__FontColorAssignment_7_2 : ( ruleprimaryColour ) ;
    public final void rule__Heading__FontColorAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8781:1: ( ( ruleprimaryColour ) )
            // InternalPageGeneratorLanguare.g:8782:2: ( ruleprimaryColour )
            {
            // InternalPageGeneratorLanguare.g:8782:2: ( ruleprimaryColour )
            // InternalPageGeneratorLanguare.g:8783:3: ruleprimaryColour
            {
             before(grammarAccess.getHeadingAccess().getFontColorPrimaryColourParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleprimaryColour();

            state._fsp--;

             after(grammarAccess.getHeadingAccess().getFontColorPrimaryColourParserRuleCall_7_2_0()); 

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
    // $ANTLR end "rule__Heading__FontColorAssignment_7_2"


    // $ANTLR start "rule__Heading__LocationAssignment_8_2"
    // InternalPageGeneratorLanguare.g:8792:1: rule__Heading__LocationAssignment_8_2 : ( rulelocationexpression ) ;
    public final void rule__Heading__LocationAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8796:1: ( ( rulelocationexpression ) )
            // InternalPageGeneratorLanguare.g:8797:2: ( rulelocationexpression )
            {
            // InternalPageGeneratorLanguare.g:8797:2: ( rulelocationexpression )
            // InternalPageGeneratorLanguare.g:8798:3: rulelocationexpression
            {
             before(grammarAccess.getHeadingAccess().getLocationLocationexpressionParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_2);
            rulelocationexpression();

            state._fsp--;

             after(grammarAccess.getHeadingAccess().getLocationLocationexpressionParserRuleCall_8_2_0()); 

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
    // $ANTLR end "rule__Heading__LocationAssignment_8_2"


    // $ANTLR start "rule__Heading__LpaddingAssignment_9_2"
    // InternalPageGeneratorLanguare.g:8807:1: rule__Heading__LpaddingAssignment_9_2 : ( RULE_INT ) ;
    public final void rule__Heading__LpaddingAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8811:1: ( ( RULE_INT ) )
            // InternalPageGeneratorLanguare.g:8812:2: ( RULE_INT )
            {
            // InternalPageGeneratorLanguare.g:8812:2: ( RULE_INT )
            // InternalPageGeneratorLanguare.g:8813:3: RULE_INT
            {
             before(grammarAccess.getHeadingAccess().getLpaddingINTTerminalRuleCall_9_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getHeadingAccess().getLpaddingINTTerminalRuleCall_9_2_0()); 

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
    // $ANTLR end "rule__Heading__LpaddingAssignment_9_2"


    // $ANTLR start "rule__Heading__RpaddingAssignment_10_2"
    // InternalPageGeneratorLanguare.g:8822:1: rule__Heading__RpaddingAssignment_10_2 : ( RULE_INT ) ;
    public final void rule__Heading__RpaddingAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8826:1: ( ( RULE_INT ) )
            // InternalPageGeneratorLanguare.g:8827:2: ( RULE_INT )
            {
            // InternalPageGeneratorLanguare.g:8827:2: ( RULE_INT )
            // InternalPageGeneratorLanguare.g:8828:3: RULE_INT
            {
             before(grammarAccess.getHeadingAccess().getRpaddingINTTerminalRuleCall_10_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getHeadingAccess().getRpaddingINTTerminalRuleCall_10_2_0()); 

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
    // $ANTLR end "rule__Heading__RpaddingAssignment_10_2"


    // $ANTLR start "rule__Heading__TpaddingAssignment_11_2"
    // InternalPageGeneratorLanguare.g:8837:1: rule__Heading__TpaddingAssignment_11_2 : ( RULE_INT ) ;
    public final void rule__Heading__TpaddingAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8841:1: ( ( RULE_INT ) )
            // InternalPageGeneratorLanguare.g:8842:2: ( RULE_INT )
            {
            // InternalPageGeneratorLanguare.g:8842:2: ( RULE_INT )
            // InternalPageGeneratorLanguare.g:8843:3: RULE_INT
            {
             before(grammarAccess.getHeadingAccess().getTpaddingINTTerminalRuleCall_11_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getHeadingAccess().getTpaddingINTTerminalRuleCall_11_2_0()); 

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
    // $ANTLR end "rule__Heading__TpaddingAssignment_11_2"


    // $ANTLR start "rule__Heading__BpaddingAssignment_12_2"
    // InternalPageGeneratorLanguare.g:8852:1: rule__Heading__BpaddingAssignment_12_2 : ( RULE_INT ) ;
    public final void rule__Heading__BpaddingAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8856:1: ( ( RULE_INT ) )
            // InternalPageGeneratorLanguare.g:8857:2: ( RULE_INT )
            {
            // InternalPageGeneratorLanguare.g:8857:2: ( RULE_INT )
            // InternalPageGeneratorLanguare.g:8858:3: RULE_INT
            {
             before(grammarAccess.getHeadingAccess().getBpaddingINTTerminalRuleCall_12_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getHeadingAccess().getBpaddingINTTerminalRuleCall_12_2_0()); 

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
    // $ANTLR end "rule__Heading__BpaddingAssignment_12_2"


    // $ANTLR start "rule__Heading__TitleAssignment_15"
    // InternalPageGeneratorLanguare.g:8867:1: rule__Heading__TitleAssignment_15 : ( RULE_STRING ) ;
    public final void rule__Heading__TitleAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8871:1: ( ( RULE_STRING ) )
            // InternalPageGeneratorLanguare.g:8872:2: ( RULE_STRING )
            {
            // InternalPageGeneratorLanguare.g:8872:2: ( RULE_STRING )
            // InternalPageGeneratorLanguare.g:8873:3: RULE_STRING
            {
             before(grammarAccess.getHeadingAccess().getTitleSTRINGTerminalRuleCall_15_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getHeadingAccess().getTitleSTRINGTerminalRuleCall_15_0()); 

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
    // $ANTLR end "rule__Heading__TitleAssignment_15"


    // $ANTLR start "rule__Link__NameAssignment_1"
    // InternalPageGeneratorLanguare.g:8882:1: rule__Link__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Link__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8886:1: ( ( RULE_ID ) )
            // InternalPageGeneratorLanguare.g:8887:2: ( RULE_ID )
            {
            // InternalPageGeneratorLanguare.g:8887:2: ( RULE_ID )
            // InternalPageGeneratorLanguare.g:8888:3: RULE_ID
            {
             before(grammarAccess.getLinkAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Link__NameAssignment_1"


    // $ANTLR start "rule__Link__TargetAssignment_3_2"
    // InternalPageGeneratorLanguare.g:8897:1: rule__Link__TargetAssignment_3_2 : ( RULE_STRING ) ;
    public final void rule__Link__TargetAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8901:1: ( ( RULE_STRING ) )
            // InternalPageGeneratorLanguare.g:8902:2: ( RULE_STRING )
            {
            // InternalPageGeneratorLanguare.g:8902:2: ( RULE_STRING )
            // InternalPageGeneratorLanguare.g:8903:3: RULE_STRING
            {
             before(grammarAccess.getLinkAccess().getTargetSTRINGTerminalRuleCall_3_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getTargetSTRINGTerminalRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__Link__TargetAssignment_3_2"


    // $ANTLR start "rule__Link__LpaddingAssignment_4_2"
    // InternalPageGeneratorLanguare.g:8912:1: rule__Link__LpaddingAssignment_4_2 : ( RULE_INT ) ;
    public final void rule__Link__LpaddingAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8916:1: ( ( RULE_INT ) )
            // InternalPageGeneratorLanguare.g:8917:2: ( RULE_INT )
            {
            // InternalPageGeneratorLanguare.g:8917:2: ( RULE_INT )
            // InternalPageGeneratorLanguare.g:8918:3: RULE_INT
            {
             before(grammarAccess.getLinkAccess().getLpaddingINTTerminalRuleCall_4_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getLpaddingINTTerminalRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__Link__LpaddingAssignment_4_2"


    // $ANTLR start "rule__Link__RpaddingAssignment_5_2"
    // InternalPageGeneratorLanguare.g:8927:1: rule__Link__RpaddingAssignment_5_2 : ( RULE_INT ) ;
    public final void rule__Link__RpaddingAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8931:1: ( ( RULE_INT ) )
            // InternalPageGeneratorLanguare.g:8932:2: ( RULE_INT )
            {
            // InternalPageGeneratorLanguare.g:8932:2: ( RULE_INT )
            // InternalPageGeneratorLanguare.g:8933:3: RULE_INT
            {
             before(grammarAccess.getLinkAccess().getRpaddingINTTerminalRuleCall_5_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getRpaddingINTTerminalRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__Link__RpaddingAssignment_5_2"


    // $ANTLR start "rule__Link__TpaddingAssignment_6_2"
    // InternalPageGeneratorLanguare.g:8942:1: rule__Link__TpaddingAssignment_6_2 : ( RULE_INT ) ;
    public final void rule__Link__TpaddingAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8946:1: ( ( RULE_INT ) )
            // InternalPageGeneratorLanguare.g:8947:2: ( RULE_INT )
            {
            // InternalPageGeneratorLanguare.g:8947:2: ( RULE_INT )
            // InternalPageGeneratorLanguare.g:8948:3: RULE_INT
            {
             before(grammarAccess.getLinkAccess().getTpaddingINTTerminalRuleCall_6_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getTpaddingINTTerminalRuleCall_6_2_0()); 

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
    // $ANTLR end "rule__Link__TpaddingAssignment_6_2"


    // $ANTLR start "rule__Link__BpaddingAssignment_7_2"
    // InternalPageGeneratorLanguare.g:8957:1: rule__Link__BpaddingAssignment_7_2 : ( RULE_INT ) ;
    public final void rule__Link__BpaddingAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8961:1: ( ( RULE_INT ) )
            // InternalPageGeneratorLanguare.g:8962:2: ( RULE_INT )
            {
            // InternalPageGeneratorLanguare.g:8962:2: ( RULE_INT )
            // InternalPageGeneratorLanguare.g:8963:3: RULE_INT
            {
             before(grammarAccess.getLinkAccess().getBpaddingINTTerminalRuleCall_7_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getBpaddingINTTerminalRuleCall_7_2_0()); 

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
    // $ANTLR end "rule__Link__BpaddingAssignment_7_2"


    // $ANTLR start "rule__Link__FontColorAssignment_8_2"
    // InternalPageGeneratorLanguare.g:8972:1: rule__Link__FontColorAssignment_8_2 : ( ruleprimaryColour ) ;
    public final void rule__Link__FontColorAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8976:1: ( ( ruleprimaryColour ) )
            // InternalPageGeneratorLanguare.g:8977:2: ( ruleprimaryColour )
            {
            // InternalPageGeneratorLanguare.g:8977:2: ( ruleprimaryColour )
            // InternalPageGeneratorLanguare.g:8978:3: ruleprimaryColour
            {
             before(grammarAccess.getLinkAccess().getFontColorPrimaryColourParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_2);
            ruleprimaryColour();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getFontColorPrimaryColourParserRuleCall_8_2_0()); 

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
    // $ANTLR end "rule__Link__FontColorAssignment_8_2"


    // $ANTLR start "rule__Link__FontSizeAssignment_9_2"
    // InternalPageGeneratorLanguare.g:8987:1: rule__Link__FontSizeAssignment_9_2 : ( RULE_INT ) ;
    public final void rule__Link__FontSizeAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:8991:1: ( ( RULE_INT ) )
            // InternalPageGeneratorLanguare.g:8992:2: ( RULE_INT )
            {
            // InternalPageGeneratorLanguare.g:8992:2: ( RULE_INT )
            // InternalPageGeneratorLanguare.g:8993:3: RULE_INT
            {
             before(grammarAccess.getLinkAccess().getFontSizeINTTerminalRuleCall_9_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getFontSizeINTTerminalRuleCall_9_2_0()); 

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
    // $ANTLR end "rule__Link__FontSizeAssignment_9_2"


    // $ANTLR start "rule__Link__LocationAssignment_10_2"
    // InternalPageGeneratorLanguare.g:9002:1: rule__Link__LocationAssignment_10_2 : ( rulelocationexpression ) ;
    public final void rule__Link__LocationAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:9006:1: ( ( rulelocationexpression ) )
            // InternalPageGeneratorLanguare.g:9007:2: ( rulelocationexpression )
            {
            // InternalPageGeneratorLanguare.g:9007:2: ( rulelocationexpression )
            // InternalPageGeneratorLanguare.g:9008:3: rulelocationexpression
            {
             before(grammarAccess.getLinkAccess().getLocationLocationexpressionParserRuleCall_10_2_0()); 
            pushFollow(FOLLOW_2);
            rulelocationexpression();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getLocationLocationexpressionParserRuleCall_10_2_0()); 

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
    // $ANTLR end "rule__Link__LocationAssignment_10_2"


    // $ANTLR start "rule__Link__UrlAssignment_13"
    // InternalPageGeneratorLanguare.g:9017:1: rule__Link__UrlAssignment_13 : ( RULE_STRING ) ;
    public final void rule__Link__UrlAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:9021:1: ( ( RULE_STRING ) )
            // InternalPageGeneratorLanguare.g:9022:2: ( RULE_STRING )
            {
            // InternalPageGeneratorLanguare.g:9022:2: ( RULE_STRING )
            // InternalPageGeneratorLanguare.g:9023:3: RULE_STRING
            {
             before(grammarAccess.getLinkAccess().getUrlSTRINGTerminalRuleCall_13_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getUrlSTRINGTerminalRuleCall_13_0()); 

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
    // $ANTLR end "rule__Link__UrlAssignment_13"


    // $ANTLR start "rule__Picture__NameAssignment_1"
    // InternalPageGeneratorLanguare.g:9032:1: rule__Picture__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Picture__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:9036:1: ( ( RULE_ID ) )
            // InternalPageGeneratorLanguare.g:9037:2: ( RULE_ID )
            {
            // InternalPageGeneratorLanguare.g:9037:2: ( RULE_ID )
            // InternalPageGeneratorLanguare.g:9038:3: RULE_ID
            {
             before(grammarAccess.getPictureAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPictureAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Picture__NameAssignment_1"


    // $ANTLR start "rule__Picture__SizeAssignment_3_2"
    // InternalPageGeneratorLanguare.g:9047:1: rule__Picture__SizeAssignment_3_2 : ( ruleprimarySize ) ;
    public final void rule__Picture__SizeAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:9051:1: ( ( ruleprimarySize ) )
            // InternalPageGeneratorLanguare.g:9052:2: ( ruleprimarySize )
            {
            // InternalPageGeneratorLanguare.g:9052:2: ( ruleprimarySize )
            // InternalPageGeneratorLanguare.g:9053:3: ruleprimarySize
            {
             before(grammarAccess.getPictureAccess().getSizePrimarySizeParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleprimarySize();

            state._fsp--;

             after(grammarAccess.getPictureAccess().getSizePrimarySizeParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__Picture__SizeAssignment_3_2"


    // $ANTLR start "rule__Picture__AltAssignment_4_2"
    // InternalPageGeneratorLanguare.g:9062:1: rule__Picture__AltAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__Picture__AltAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:9066:1: ( ( RULE_STRING ) )
            // InternalPageGeneratorLanguare.g:9067:2: ( RULE_STRING )
            {
            // InternalPageGeneratorLanguare.g:9067:2: ( RULE_STRING )
            // InternalPageGeneratorLanguare.g:9068:3: RULE_STRING
            {
             before(grammarAccess.getPictureAccess().getAltSTRINGTerminalRuleCall_4_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPictureAccess().getAltSTRINGTerminalRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__Picture__AltAssignment_4_2"


    // $ANTLR start "rule__Picture__LocationAssignment_5_2"
    // InternalPageGeneratorLanguare.g:9077:1: rule__Picture__LocationAssignment_5_2 : ( rulelocationexpression ) ;
    public final void rule__Picture__LocationAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:9081:1: ( ( rulelocationexpression ) )
            // InternalPageGeneratorLanguare.g:9082:2: ( rulelocationexpression )
            {
            // InternalPageGeneratorLanguare.g:9082:2: ( rulelocationexpression )
            // InternalPageGeneratorLanguare.g:9083:3: rulelocationexpression
            {
             before(grammarAccess.getPictureAccess().getLocationLocationexpressionParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            rulelocationexpression();

            state._fsp--;

             after(grammarAccess.getPictureAccess().getLocationLocationexpressionParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__Picture__LocationAssignment_5_2"


    // $ANTLR start "rule__Picture__LpaddingAssignment_6_2"
    // InternalPageGeneratorLanguare.g:9092:1: rule__Picture__LpaddingAssignment_6_2 : ( RULE_INT ) ;
    public final void rule__Picture__LpaddingAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:9096:1: ( ( RULE_INT ) )
            // InternalPageGeneratorLanguare.g:9097:2: ( RULE_INT )
            {
            // InternalPageGeneratorLanguare.g:9097:2: ( RULE_INT )
            // InternalPageGeneratorLanguare.g:9098:3: RULE_INT
            {
             before(grammarAccess.getPictureAccess().getLpaddingINTTerminalRuleCall_6_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPictureAccess().getLpaddingINTTerminalRuleCall_6_2_0()); 

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
    // $ANTLR end "rule__Picture__LpaddingAssignment_6_2"


    // $ANTLR start "rule__Picture__RpaddingAssignment_7_2"
    // InternalPageGeneratorLanguare.g:9107:1: rule__Picture__RpaddingAssignment_7_2 : ( RULE_INT ) ;
    public final void rule__Picture__RpaddingAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:9111:1: ( ( RULE_INT ) )
            // InternalPageGeneratorLanguare.g:9112:2: ( RULE_INT )
            {
            // InternalPageGeneratorLanguare.g:9112:2: ( RULE_INT )
            // InternalPageGeneratorLanguare.g:9113:3: RULE_INT
            {
             before(grammarAccess.getPictureAccess().getRpaddingINTTerminalRuleCall_7_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPictureAccess().getRpaddingINTTerminalRuleCall_7_2_0()); 

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
    // $ANTLR end "rule__Picture__RpaddingAssignment_7_2"


    // $ANTLR start "rule__Picture__TpaddingAssignment_8_2"
    // InternalPageGeneratorLanguare.g:9122:1: rule__Picture__TpaddingAssignment_8_2 : ( RULE_INT ) ;
    public final void rule__Picture__TpaddingAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:9126:1: ( ( RULE_INT ) )
            // InternalPageGeneratorLanguare.g:9127:2: ( RULE_INT )
            {
            // InternalPageGeneratorLanguare.g:9127:2: ( RULE_INT )
            // InternalPageGeneratorLanguare.g:9128:3: RULE_INT
            {
             before(grammarAccess.getPictureAccess().getTpaddingINTTerminalRuleCall_8_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPictureAccess().getTpaddingINTTerminalRuleCall_8_2_0()); 

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
    // $ANTLR end "rule__Picture__TpaddingAssignment_8_2"


    // $ANTLR start "rule__Picture__BpaddingAssignment_9_2"
    // InternalPageGeneratorLanguare.g:9137:1: rule__Picture__BpaddingAssignment_9_2 : ( RULE_INT ) ;
    public final void rule__Picture__BpaddingAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:9141:1: ( ( RULE_INT ) )
            // InternalPageGeneratorLanguare.g:9142:2: ( RULE_INT )
            {
            // InternalPageGeneratorLanguare.g:9142:2: ( RULE_INT )
            // InternalPageGeneratorLanguare.g:9143:3: RULE_INT
            {
             before(grammarAccess.getPictureAccess().getBpaddingINTTerminalRuleCall_9_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPictureAccess().getBpaddingINTTerminalRuleCall_9_2_0()); 

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
    // $ANTLR end "rule__Picture__BpaddingAssignment_9_2"


    // $ANTLR start "rule__Picture__PicUrlAssignment_12"
    // InternalPageGeneratorLanguare.g:9152:1: rule__Picture__PicUrlAssignment_12 : ( RULE_STRING ) ;
    public final void rule__Picture__PicUrlAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:9156:1: ( ( RULE_STRING ) )
            // InternalPageGeneratorLanguare.g:9157:2: ( RULE_STRING )
            {
            // InternalPageGeneratorLanguare.g:9157:2: ( RULE_STRING )
            // InternalPageGeneratorLanguare.g:9158:3: RULE_STRING
            {
             before(grammarAccess.getPictureAccess().getPicUrlSTRINGTerminalRuleCall_12_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPictureAccess().getPicUrlSTRINGTerminalRuleCall_12_0()); 

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
    // $ANTLR end "rule__Picture__PicUrlAssignment_12"


    // $ANTLR start "rule__Text__NameAssignment_1"
    // InternalPageGeneratorLanguare.g:9167:1: rule__Text__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Text__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:9171:1: ( ( RULE_ID ) )
            // InternalPageGeneratorLanguare.g:9172:2: ( RULE_ID )
            {
            // InternalPageGeneratorLanguare.g:9172:2: ( RULE_ID )
            // InternalPageGeneratorLanguare.g:9173:3: RULE_ID
            {
             before(grammarAccess.getTextAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Text__NameAssignment_1"


    // $ANTLR start "rule__Text__FontColorAssignment_3_2"
    // InternalPageGeneratorLanguare.g:9182:1: rule__Text__FontColorAssignment_3_2 : ( ruleprimaryColour ) ;
    public final void rule__Text__FontColorAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:9186:1: ( ( ruleprimaryColour ) )
            // InternalPageGeneratorLanguare.g:9187:2: ( ruleprimaryColour )
            {
            // InternalPageGeneratorLanguare.g:9187:2: ( ruleprimaryColour )
            // InternalPageGeneratorLanguare.g:9188:3: ruleprimaryColour
            {
             before(grammarAccess.getTextAccess().getFontColorPrimaryColourParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleprimaryColour();

            state._fsp--;

             after(grammarAccess.getTextAccess().getFontColorPrimaryColourParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__Text__FontColorAssignment_3_2"


    // $ANTLR start "rule__Text__FontSizeAssignment_4_2"
    // InternalPageGeneratorLanguare.g:9197:1: rule__Text__FontSizeAssignment_4_2 : ( RULE_INT ) ;
    public final void rule__Text__FontSizeAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:9201:1: ( ( RULE_INT ) )
            // InternalPageGeneratorLanguare.g:9202:2: ( RULE_INT )
            {
            // InternalPageGeneratorLanguare.g:9202:2: ( RULE_INT )
            // InternalPageGeneratorLanguare.g:9203:3: RULE_INT
            {
             before(grammarAccess.getTextAccess().getFontSizeINTTerminalRuleCall_4_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getFontSizeINTTerminalRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__Text__FontSizeAssignment_4_2"


    // $ANTLR start "rule__Text__LocationAssignment_5_2"
    // InternalPageGeneratorLanguare.g:9212:1: rule__Text__LocationAssignment_5_2 : ( rulelocationexpression ) ;
    public final void rule__Text__LocationAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:9216:1: ( ( rulelocationexpression ) )
            // InternalPageGeneratorLanguare.g:9217:2: ( rulelocationexpression )
            {
            // InternalPageGeneratorLanguare.g:9217:2: ( rulelocationexpression )
            // InternalPageGeneratorLanguare.g:9218:3: rulelocationexpression
            {
             before(grammarAccess.getTextAccess().getLocationLocationexpressionParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            rulelocationexpression();

            state._fsp--;

             after(grammarAccess.getTextAccess().getLocationLocationexpressionParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__Text__LocationAssignment_5_2"


    // $ANTLR start "rule__Text__LpaddingAssignment_6_2"
    // InternalPageGeneratorLanguare.g:9227:1: rule__Text__LpaddingAssignment_6_2 : ( RULE_INT ) ;
    public final void rule__Text__LpaddingAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:9231:1: ( ( RULE_INT ) )
            // InternalPageGeneratorLanguare.g:9232:2: ( RULE_INT )
            {
            // InternalPageGeneratorLanguare.g:9232:2: ( RULE_INT )
            // InternalPageGeneratorLanguare.g:9233:3: RULE_INT
            {
             before(grammarAccess.getTextAccess().getLpaddingINTTerminalRuleCall_6_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getLpaddingINTTerminalRuleCall_6_2_0()); 

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
    // $ANTLR end "rule__Text__LpaddingAssignment_6_2"


    // $ANTLR start "rule__Text__RpaddingAssignment_7_2"
    // InternalPageGeneratorLanguare.g:9242:1: rule__Text__RpaddingAssignment_7_2 : ( RULE_INT ) ;
    public final void rule__Text__RpaddingAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:9246:1: ( ( RULE_INT ) )
            // InternalPageGeneratorLanguare.g:9247:2: ( RULE_INT )
            {
            // InternalPageGeneratorLanguare.g:9247:2: ( RULE_INT )
            // InternalPageGeneratorLanguare.g:9248:3: RULE_INT
            {
             before(grammarAccess.getTextAccess().getRpaddingINTTerminalRuleCall_7_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getRpaddingINTTerminalRuleCall_7_2_0()); 

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
    // $ANTLR end "rule__Text__RpaddingAssignment_7_2"


    // $ANTLR start "rule__Text__TpaddingAssignment_8_2"
    // InternalPageGeneratorLanguare.g:9257:1: rule__Text__TpaddingAssignment_8_2 : ( RULE_INT ) ;
    public final void rule__Text__TpaddingAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:9261:1: ( ( RULE_INT ) )
            // InternalPageGeneratorLanguare.g:9262:2: ( RULE_INT )
            {
            // InternalPageGeneratorLanguare.g:9262:2: ( RULE_INT )
            // InternalPageGeneratorLanguare.g:9263:3: RULE_INT
            {
             before(grammarAccess.getTextAccess().getTpaddingINTTerminalRuleCall_8_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getTpaddingINTTerminalRuleCall_8_2_0()); 

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
    // $ANTLR end "rule__Text__TpaddingAssignment_8_2"


    // $ANTLR start "rule__Text__BpaddingAssignment_9_2"
    // InternalPageGeneratorLanguare.g:9272:1: rule__Text__BpaddingAssignment_9_2 : ( RULE_INT ) ;
    public final void rule__Text__BpaddingAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:9276:1: ( ( RULE_INT ) )
            // InternalPageGeneratorLanguare.g:9277:2: ( RULE_INT )
            {
            // InternalPageGeneratorLanguare.g:9277:2: ( RULE_INT )
            // InternalPageGeneratorLanguare.g:9278:3: RULE_INT
            {
             before(grammarAccess.getTextAccess().getBpaddingINTTerminalRuleCall_9_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getBpaddingINTTerminalRuleCall_9_2_0()); 

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
    // $ANTLR end "rule__Text__BpaddingAssignment_9_2"


    // $ANTLR start "rule__Text__ContentAssignment_12"
    // InternalPageGeneratorLanguare.g:9287:1: rule__Text__ContentAssignment_12 : ( ruleContent ) ;
    public final void rule__Text__ContentAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:9291:1: ( ( ruleContent ) )
            // InternalPageGeneratorLanguare.g:9292:2: ( ruleContent )
            {
            // InternalPageGeneratorLanguare.g:9292:2: ( ruleContent )
            // InternalPageGeneratorLanguare.g:9293:3: ruleContent
            {
             before(grammarAccess.getTextAccess().getContentContentParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleContent();

            state._fsp--;

             after(grammarAccess.getTextAccess().getContentContentParserRuleCall_12_0()); 

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
    // $ANTLR end "rule__Text__ContentAssignment_12"


    // $ANTLR start "rule__Section__NameAssignment_1"
    // InternalPageGeneratorLanguare.g:9302:1: rule__Section__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Section__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:9306:1: ( ( RULE_ID ) )
            // InternalPageGeneratorLanguare.g:9307:2: ( RULE_ID )
            {
            // InternalPageGeneratorLanguare.g:9307:2: ( RULE_ID )
            // InternalPageGeneratorLanguare.g:9308:3: RULE_ID
            {
             before(grammarAccess.getSectionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Section__NameAssignment_1"


    // $ANTLR start "rule__Section__BgColorAssignment_3_2"
    // InternalPageGeneratorLanguare.g:9317:1: rule__Section__BgColorAssignment_3_2 : ( ruleprimaryColour ) ;
    public final void rule__Section__BgColorAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:9321:1: ( ( ruleprimaryColour ) )
            // InternalPageGeneratorLanguare.g:9322:2: ( ruleprimaryColour )
            {
            // InternalPageGeneratorLanguare.g:9322:2: ( ruleprimaryColour )
            // InternalPageGeneratorLanguare.g:9323:3: ruleprimaryColour
            {
             before(grammarAccess.getSectionAccess().getBgColorPrimaryColourParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleprimaryColour();

            state._fsp--;

             after(grammarAccess.getSectionAccess().getBgColorPrimaryColourParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__Section__BgColorAssignment_3_2"


    // $ANTLR start "rule__Section__SizeAssignment_4_2"
    // InternalPageGeneratorLanguare.g:9332:1: rule__Section__SizeAssignment_4_2 : ( ruleprimarySize ) ;
    public final void rule__Section__SizeAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:9336:1: ( ( ruleprimarySize ) )
            // InternalPageGeneratorLanguare.g:9337:2: ( ruleprimarySize )
            {
            // InternalPageGeneratorLanguare.g:9337:2: ( ruleprimarySize )
            // InternalPageGeneratorLanguare.g:9338:3: ruleprimarySize
            {
             before(grammarAccess.getSectionAccess().getSizePrimarySizeParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleprimarySize();

            state._fsp--;

             after(grammarAccess.getSectionAccess().getSizePrimarySizeParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__Section__SizeAssignment_4_2"


    // $ANTLR start "rule__Section__LocationAssignment_5_2"
    // InternalPageGeneratorLanguare.g:9347:1: rule__Section__LocationAssignment_5_2 : ( rulelocationexpression ) ;
    public final void rule__Section__LocationAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:9351:1: ( ( rulelocationexpression ) )
            // InternalPageGeneratorLanguare.g:9352:2: ( rulelocationexpression )
            {
            // InternalPageGeneratorLanguare.g:9352:2: ( rulelocationexpression )
            // InternalPageGeneratorLanguare.g:9353:3: rulelocationexpression
            {
             before(grammarAccess.getSectionAccess().getLocationLocationexpressionParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            rulelocationexpression();

            state._fsp--;

             after(grammarAccess.getSectionAccess().getLocationLocationexpressionParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__Section__LocationAssignment_5_2"


    // $ANTLR start "rule__Section__TextLocationAssignment_6_2"
    // InternalPageGeneratorLanguare.g:9362:1: rule__Section__TextLocationAssignment_6_2 : ( rulelocationexpression ) ;
    public final void rule__Section__TextLocationAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:9366:1: ( ( rulelocationexpression ) )
            // InternalPageGeneratorLanguare.g:9367:2: ( rulelocationexpression )
            {
            // InternalPageGeneratorLanguare.g:9367:2: ( rulelocationexpression )
            // InternalPageGeneratorLanguare.g:9368:3: rulelocationexpression
            {
             before(grammarAccess.getSectionAccess().getTextLocationLocationexpressionParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            rulelocationexpression();

            state._fsp--;

             after(grammarAccess.getSectionAccess().getTextLocationLocationexpressionParserRuleCall_6_2_0()); 

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
    // $ANTLR end "rule__Section__TextLocationAssignment_6_2"


    // $ANTLR start "rule__Section__LpaddingAssignment_7_2"
    // InternalPageGeneratorLanguare.g:9377:1: rule__Section__LpaddingAssignment_7_2 : ( RULE_INT ) ;
    public final void rule__Section__LpaddingAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:9381:1: ( ( RULE_INT ) )
            // InternalPageGeneratorLanguare.g:9382:2: ( RULE_INT )
            {
            // InternalPageGeneratorLanguare.g:9382:2: ( RULE_INT )
            // InternalPageGeneratorLanguare.g:9383:3: RULE_INT
            {
             before(grammarAccess.getSectionAccess().getLpaddingINTTerminalRuleCall_7_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getLpaddingINTTerminalRuleCall_7_2_0()); 

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
    // $ANTLR end "rule__Section__LpaddingAssignment_7_2"


    // $ANTLR start "rule__Section__RpaddingAssignment_8_2"
    // InternalPageGeneratorLanguare.g:9392:1: rule__Section__RpaddingAssignment_8_2 : ( RULE_INT ) ;
    public final void rule__Section__RpaddingAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:9396:1: ( ( RULE_INT ) )
            // InternalPageGeneratorLanguare.g:9397:2: ( RULE_INT )
            {
            // InternalPageGeneratorLanguare.g:9397:2: ( RULE_INT )
            // InternalPageGeneratorLanguare.g:9398:3: RULE_INT
            {
             before(grammarAccess.getSectionAccess().getRpaddingINTTerminalRuleCall_8_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getRpaddingINTTerminalRuleCall_8_2_0()); 

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
    // $ANTLR end "rule__Section__RpaddingAssignment_8_2"


    // $ANTLR start "rule__Section__TpaddingAssignment_9_2"
    // InternalPageGeneratorLanguare.g:9407:1: rule__Section__TpaddingAssignment_9_2 : ( RULE_INT ) ;
    public final void rule__Section__TpaddingAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:9411:1: ( ( RULE_INT ) )
            // InternalPageGeneratorLanguare.g:9412:2: ( RULE_INT )
            {
            // InternalPageGeneratorLanguare.g:9412:2: ( RULE_INT )
            // InternalPageGeneratorLanguare.g:9413:3: RULE_INT
            {
             before(grammarAccess.getSectionAccess().getTpaddingINTTerminalRuleCall_9_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getTpaddingINTTerminalRuleCall_9_2_0()); 

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
    // $ANTLR end "rule__Section__TpaddingAssignment_9_2"


    // $ANTLR start "rule__Section__BpaddingAssignment_10_2"
    // InternalPageGeneratorLanguare.g:9422:1: rule__Section__BpaddingAssignment_10_2 : ( RULE_INT ) ;
    public final void rule__Section__BpaddingAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:9426:1: ( ( RULE_INT ) )
            // InternalPageGeneratorLanguare.g:9427:2: ( RULE_INT )
            {
            // InternalPageGeneratorLanguare.g:9427:2: ( RULE_INT )
            // InternalPageGeneratorLanguare.g:9428:3: RULE_INT
            {
             before(grammarAccess.getSectionAccess().getBpaddingINTTerminalRuleCall_10_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getBpaddingINTTerminalRuleCall_10_2_0()); 

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
    // $ANTLR end "rule__Section__BpaddingAssignment_10_2"


    // $ANTLR start "rule__Section__BodyElementsAssignment_13"
    // InternalPageGeneratorLanguare.g:9437:1: rule__Section__BodyElementsAssignment_13 : ( rulebodyElement ) ;
    public final void rule__Section__BodyElementsAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:9441:1: ( ( rulebodyElement ) )
            // InternalPageGeneratorLanguare.g:9442:2: ( rulebodyElement )
            {
            // InternalPageGeneratorLanguare.g:9442:2: ( rulebodyElement )
            // InternalPageGeneratorLanguare.g:9443:3: rulebodyElement
            {
             before(grammarAccess.getSectionAccess().getBodyElementsBodyElementParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            rulebodyElement();

            state._fsp--;

             after(grammarAccess.getSectionAccess().getBodyElementsBodyElementParserRuleCall_13_0()); 

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
    // $ANTLR end "rule__Section__BodyElementsAssignment_13"


    // $ANTLR start "rule__Locationexpression__LocationAssignment"
    // InternalPageGeneratorLanguare.g:9452:1: rule__Locationexpression__LocationAssignment : ( RULE_STRING ) ;
    public final void rule__Locationexpression__LocationAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:9456:1: ( ( RULE_STRING ) )
            // InternalPageGeneratorLanguare.g:9457:2: ( RULE_STRING )
            {
            // InternalPageGeneratorLanguare.g:9457:2: ( RULE_STRING )
            // InternalPageGeneratorLanguare.g:9458:3: RULE_STRING
            {
             before(grammarAccess.getLocationexpressionAccess().getLocationSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLocationexpressionAccess().getLocationSTRINGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Locationexpression__LocationAssignment"


    // $ANTLR start "rule__SizeDeclaration__NameAssignment_1"
    // InternalPageGeneratorLanguare.g:9467:1: rule__SizeDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SizeDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:9471:1: ( ( RULE_ID ) )
            // InternalPageGeneratorLanguare.g:9472:2: ( RULE_ID )
            {
            // InternalPageGeneratorLanguare.g:9472:2: ( RULE_ID )
            // InternalPageGeneratorLanguare.g:9473:3: RULE_ID
            {
             before(grammarAccess.getSizeDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSizeDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__SizeDeclaration__NameAssignment_1"


    // $ANTLR start "rule__SizeDeclaration__WidthAssignment_3"
    // InternalPageGeneratorLanguare.g:9482:1: rule__SizeDeclaration__WidthAssignment_3 : ( RULE_INT ) ;
    public final void rule__SizeDeclaration__WidthAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:9486:1: ( ( RULE_INT ) )
            // InternalPageGeneratorLanguare.g:9487:2: ( RULE_INT )
            {
            // InternalPageGeneratorLanguare.g:9487:2: ( RULE_INT )
            // InternalPageGeneratorLanguare.g:9488:3: RULE_INT
            {
             before(grammarAccess.getSizeDeclarationAccess().getWidthINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSizeDeclarationAccess().getWidthINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__SizeDeclaration__WidthAssignment_3"


    // $ANTLR start "rule__SizeDeclaration__HeightAssignment_5"
    // InternalPageGeneratorLanguare.g:9497:1: rule__SizeDeclaration__HeightAssignment_5 : ( RULE_INT ) ;
    public final void rule__SizeDeclaration__HeightAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:9501:1: ( ( RULE_INT ) )
            // InternalPageGeneratorLanguare.g:9502:2: ( RULE_INT )
            {
            // InternalPageGeneratorLanguare.g:9502:2: ( RULE_INT )
            // InternalPageGeneratorLanguare.g:9503:3: RULE_INT
            {
             before(grammarAccess.getSizeDeclarationAccess().getHeightINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSizeDeclarationAccess().getHeightINTTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__SizeDeclaration__HeightAssignment_5"


    // $ANTLR start "rule__SizeValue__WidthAssignment_0"
    // InternalPageGeneratorLanguare.g:9512:1: rule__SizeValue__WidthAssignment_0 : ( RULE_INT ) ;
    public final void rule__SizeValue__WidthAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:9516:1: ( ( RULE_INT ) )
            // InternalPageGeneratorLanguare.g:9517:2: ( RULE_INT )
            {
            // InternalPageGeneratorLanguare.g:9517:2: ( RULE_INT )
            // InternalPageGeneratorLanguare.g:9518:3: RULE_INT
            {
             before(grammarAccess.getSizeValueAccess().getWidthINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSizeValueAccess().getWidthINTTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__SizeValue__WidthAssignment_0"


    // $ANTLR start "rule__SizeValue__HeightAssignment_2"
    // InternalPageGeneratorLanguare.g:9527:1: rule__SizeValue__HeightAssignment_2 : ( RULE_INT ) ;
    public final void rule__SizeValue__HeightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:9531:1: ( ( RULE_INT ) )
            // InternalPageGeneratorLanguare.g:9532:2: ( RULE_INT )
            {
            // InternalPageGeneratorLanguare.g:9532:2: ( RULE_INT )
            // InternalPageGeneratorLanguare.g:9533:3: RULE_INT
            {
             before(grammarAccess.getSizeValueAccess().getHeightINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSizeValueAccess().getHeightINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__SizeValue__HeightAssignment_2"


    // $ANTLR start "rule__SizeExpression__SizeAssignment"
    // InternalPageGeneratorLanguare.g:9542:1: rule__SizeExpression__SizeAssignment : ( ( RULE_ID ) ) ;
    public final void rule__SizeExpression__SizeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:9546:1: ( ( ( RULE_ID ) ) )
            // InternalPageGeneratorLanguare.g:9547:2: ( ( RULE_ID ) )
            {
            // InternalPageGeneratorLanguare.g:9547:2: ( ( RULE_ID ) )
            // InternalPageGeneratorLanguare.g:9548:3: ( RULE_ID )
            {
             before(grammarAccess.getSizeExpressionAccess().getSizeSizeDeclarationCrossReference_0()); 
            // InternalPageGeneratorLanguare.g:9549:3: ( RULE_ID )
            // InternalPageGeneratorLanguare.g:9550:4: RULE_ID
            {
             before(grammarAccess.getSizeExpressionAccess().getSizeSizeDeclarationIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSizeExpressionAccess().getSizeSizeDeclarationIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getSizeExpressionAccess().getSizeSizeDeclarationCrossReference_0()); 

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
    // $ANTLR end "rule__SizeExpression__SizeAssignment"


    // $ANTLR start "rule__ColourValue__ColourAssignment"
    // InternalPageGeneratorLanguare.g:9561:1: rule__ColourValue__ColourAssignment : ( RULE_STRING ) ;
    public final void rule__ColourValue__ColourAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:9565:1: ( ( RULE_STRING ) )
            // InternalPageGeneratorLanguare.g:9566:2: ( RULE_STRING )
            {
            // InternalPageGeneratorLanguare.g:9566:2: ( RULE_STRING )
            // InternalPageGeneratorLanguare.g:9567:3: RULE_STRING
            {
             before(grammarAccess.getColourValueAccess().getColourSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getColourValueAccess().getColourSTRINGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__ColourValue__ColourAssignment"


    // $ANTLR start "rule__ColourRGB__NameAssignment_2"
    // InternalPageGeneratorLanguare.g:9576:1: rule__ColourRGB__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ColourRGB__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:9580:1: ( ( RULE_ID ) )
            // InternalPageGeneratorLanguare.g:9581:2: ( RULE_ID )
            {
            // InternalPageGeneratorLanguare.g:9581:2: ( RULE_ID )
            // InternalPageGeneratorLanguare.g:9582:3: RULE_ID
            {
             before(grammarAccess.getColourRGBAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getColourRGBAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__ColourRGB__NameAssignment_2"


    // $ANTLR start "rule__ColourRGB__RgbAssignment_4"
    // InternalPageGeneratorLanguare.g:9591:1: rule__ColourRGB__RgbAssignment_4 : ( ( '(' ) ) ;
    public final void rule__ColourRGB__RgbAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:9595:1: ( ( ( '(' ) ) )
            // InternalPageGeneratorLanguare.g:9596:2: ( ( '(' ) )
            {
            // InternalPageGeneratorLanguare.g:9596:2: ( ( '(' ) )
            // InternalPageGeneratorLanguare.g:9597:3: ( '(' )
            {
             before(grammarAccess.getColourRGBAccess().getRgbLeftParenthesisKeyword_4_0()); 
            // InternalPageGeneratorLanguare.g:9598:3: ( '(' )
            // InternalPageGeneratorLanguare.g:9599:4: '('
            {
             before(grammarAccess.getColourRGBAccess().getRgbLeftParenthesisKeyword_4_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getColourRGBAccess().getRgbLeftParenthesisKeyword_4_0()); 

            }

             after(grammarAccess.getColourRGBAccess().getRgbLeftParenthesisKeyword_4_0()); 

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
    // $ANTLR end "rule__ColourRGB__RgbAssignment_4"


    // $ANTLR start "rule__ColourRGB__RedAssignment_5"
    // InternalPageGeneratorLanguare.g:9610:1: rule__ColourRGB__RedAssignment_5 : ( RULE_INT ) ;
    public final void rule__ColourRGB__RedAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:9614:1: ( ( RULE_INT ) )
            // InternalPageGeneratorLanguare.g:9615:2: ( RULE_INT )
            {
            // InternalPageGeneratorLanguare.g:9615:2: ( RULE_INT )
            // InternalPageGeneratorLanguare.g:9616:3: RULE_INT
            {
             before(grammarAccess.getColourRGBAccess().getRedINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getColourRGBAccess().getRedINTTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__ColourRGB__RedAssignment_5"


    // $ANTLR start "rule__ColourRGB__GreenAssignment_7"
    // InternalPageGeneratorLanguare.g:9625:1: rule__ColourRGB__GreenAssignment_7 : ( RULE_INT ) ;
    public final void rule__ColourRGB__GreenAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:9629:1: ( ( RULE_INT ) )
            // InternalPageGeneratorLanguare.g:9630:2: ( RULE_INT )
            {
            // InternalPageGeneratorLanguare.g:9630:2: ( RULE_INT )
            // InternalPageGeneratorLanguare.g:9631:3: RULE_INT
            {
             before(grammarAccess.getColourRGBAccess().getGreenINTTerminalRuleCall_7_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getColourRGBAccess().getGreenINTTerminalRuleCall_7_0()); 

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
    // $ANTLR end "rule__ColourRGB__GreenAssignment_7"


    // $ANTLR start "rule__ColourRGB__BlueAssignment_9"
    // InternalPageGeneratorLanguare.g:9640:1: rule__ColourRGB__BlueAssignment_9 : ( RULE_INT ) ;
    public final void rule__ColourRGB__BlueAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:9644:1: ( ( RULE_INT ) )
            // InternalPageGeneratorLanguare.g:9645:2: ( RULE_INT )
            {
            // InternalPageGeneratorLanguare.g:9645:2: ( RULE_INT )
            // InternalPageGeneratorLanguare.g:9646:3: RULE_INT
            {
             before(grammarAccess.getColourRGBAccess().getBlueINTTerminalRuleCall_9_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getColourRGBAccess().getBlueINTTerminalRuleCall_9_0()); 

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
    // $ANTLR end "rule__ColourRGB__BlueAssignment_9"


    // $ANTLR start "rule__ColourExpression__ColourAssignment"
    // InternalPageGeneratorLanguare.g:9655:1: rule__ColourExpression__ColourAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ColourExpression__ColourAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:9659:1: ( ( ( RULE_ID ) ) )
            // InternalPageGeneratorLanguare.g:9660:2: ( ( RULE_ID ) )
            {
            // InternalPageGeneratorLanguare.g:9660:2: ( ( RULE_ID ) )
            // InternalPageGeneratorLanguare.g:9661:3: ( RULE_ID )
            {
             before(grammarAccess.getColourExpressionAccess().getColourColourRGBCrossReference_0()); 
            // InternalPageGeneratorLanguare.g:9662:3: ( RULE_ID )
            // InternalPageGeneratorLanguare.g:9663:4: RULE_ID
            {
             before(grammarAccess.getColourExpressionAccess().getColourColourRGBIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getColourExpressionAccess().getColourColourRGBIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getColourExpressionAccess().getColourColourRGBCrossReference_0()); 

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
    // $ANTLR end "rule__ColourExpression__ColourAssignment"


    // $ANTLR start "rule__Content__SeparatorAssignment_1_1"
    // InternalPageGeneratorLanguare.g:9674:1: rule__Content__SeparatorAssignment_1_1 : ( ( rule__Content__SeparatorAlternatives_1_1_0 ) ) ;
    public final void rule__Content__SeparatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:9678:1: ( ( ( rule__Content__SeparatorAlternatives_1_1_0 ) ) )
            // InternalPageGeneratorLanguare.g:9679:2: ( ( rule__Content__SeparatorAlternatives_1_1_0 ) )
            {
            // InternalPageGeneratorLanguare.g:9679:2: ( ( rule__Content__SeparatorAlternatives_1_1_0 ) )
            // InternalPageGeneratorLanguare.g:9680:3: ( rule__Content__SeparatorAlternatives_1_1_0 )
            {
             before(grammarAccess.getContentAccess().getSeparatorAlternatives_1_1_0()); 
            // InternalPageGeneratorLanguare.g:9681:3: ( rule__Content__SeparatorAlternatives_1_1_0 )
            // InternalPageGeneratorLanguare.g:9681:4: rule__Content__SeparatorAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Content__SeparatorAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getContentAccess().getSeparatorAlternatives_1_1_0()); 

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
    // $ANTLR end "rule__Content__SeparatorAssignment_1_1"


    // $ANTLR start "rule__Content__RightAssignment_1_2"
    // InternalPageGeneratorLanguare.g:9689:1: rule__Content__RightAssignment_1_2 : ( ruleprimaryString ) ;
    public final void rule__Content__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:9693:1: ( ( ruleprimaryString ) )
            // InternalPageGeneratorLanguare.g:9694:2: ( ruleprimaryString )
            {
            // InternalPageGeneratorLanguare.g:9694:2: ( ruleprimaryString )
            // InternalPageGeneratorLanguare.g:9695:3: ruleprimaryString
            {
             before(grammarAccess.getContentAccess().getRightPrimaryStringParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleprimaryString();

            state._fsp--;

             after(grammarAccess.getContentAccess().getRightPrimaryStringParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Content__RightAssignment_1_2"


    // $ANTLR start "rule__StringValue__ValAssignment"
    // InternalPageGeneratorLanguare.g:9704:1: rule__StringValue__ValAssignment : ( RULE_STRING ) ;
    public final void rule__StringValue__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:9708:1: ( ( RULE_STRING ) )
            // InternalPageGeneratorLanguare.g:9709:2: ( RULE_STRING )
            {
            // InternalPageGeneratorLanguare.g:9709:2: ( RULE_STRING )
            // InternalPageGeneratorLanguare.g:9710:3: RULE_STRING
            {
             before(grammarAccess.getStringValueAccess().getValSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringValueAccess().getValSTRINGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__StringValue__ValAssignment"


    // $ANTLR start "rule__StringReference__StringreferenceAssignment"
    // InternalPageGeneratorLanguare.g:9719:1: rule__StringReference__StringreferenceAssignment : ( ( RULE_ID ) ) ;
    public final void rule__StringReference__StringreferenceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:9723:1: ( ( ( RULE_ID ) ) )
            // InternalPageGeneratorLanguare.g:9724:2: ( ( RULE_ID ) )
            {
            // InternalPageGeneratorLanguare.g:9724:2: ( ( RULE_ID ) )
            // InternalPageGeneratorLanguare.g:9725:3: ( RULE_ID )
            {
             before(grammarAccess.getStringReferenceAccess().getStringreferenceStringDeclarationCrossReference_0()); 
            // InternalPageGeneratorLanguare.g:9726:3: ( RULE_ID )
            // InternalPageGeneratorLanguare.g:9727:4: RULE_ID
            {
             before(grammarAccess.getStringReferenceAccess().getStringreferenceStringDeclarationIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStringReferenceAccess().getStringreferenceStringDeclarationIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getStringReferenceAccess().getStringreferenceStringDeclarationCrossReference_0()); 

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
    // $ANTLR end "rule__StringReference__StringreferenceAssignment"


    // $ANTLR start "rule__StringDeclaration__NameAssignment_1"
    // InternalPageGeneratorLanguare.g:9738:1: rule__StringDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__StringDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:9742:1: ( ( RULE_ID ) )
            // InternalPageGeneratorLanguare.g:9743:2: ( RULE_ID )
            {
            // InternalPageGeneratorLanguare.g:9743:2: ( RULE_ID )
            // InternalPageGeneratorLanguare.g:9744:3: RULE_ID
            {
             before(grammarAccess.getStringDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStringDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__StringDeclaration__NameAssignment_1"


    // $ANTLR start "rule__StringDeclaration__FontColorAssignment_3_2"
    // InternalPageGeneratorLanguare.g:9753:1: rule__StringDeclaration__FontColorAssignment_3_2 : ( ruleprimaryColour ) ;
    public final void rule__StringDeclaration__FontColorAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:9757:1: ( ( ruleprimaryColour ) )
            // InternalPageGeneratorLanguare.g:9758:2: ( ruleprimaryColour )
            {
            // InternalPageGeneratorLanguare.g:9758:2: ( ruleprimaryColour )
            // InternalPageGeneratorLanguare.g:9759:3: ruleprimaryColour
            {
             before(grammarAccess.getStringDeclarationAccess().getFontColorPrimaryColourParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleprimaryColour();

            state._fsp--;

             after(grammarAccess.getStringDeclarationAccess().getFontColorPrimaryColourParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__StringDeclaration__FontColorAssignment_3_2"


    // $ANTLR start "rule__StringDeclaration__FontSizeAssignment_4_2"
    // InternalPageGeneratorLanguare.g:9768:1: rule__StringDeclaration__FontSizeAssignment_4_2 : ( RULE_INT ) ;
    public final void rule__StringDeclaration__FontSizeAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:9772:1: ( ( RULE_INT ) )
            // InternalPageGeneratorLanguare.g:9773:2: ( RULE_INT )
            {
            // InternalPageGeneratorLanguare.g:9773:2: ( RULE_INT )
            // InternalPageGeneratorLanguare.g:9774:3: RULE_INT
            {
             before(grammarAccess.getStringDeclarationAccess().getFontSizeINTTerminalRuleCall_4_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getStringDeclarationAccess().getFontSizeINTTerminalRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__StringDeclaration__FontSizeAssignment_4_2"


    // $ANTLR start "rule__StringDeclaration__WordAssignment_7"
    // InternalPageGeneratorLanguare.g:9783:1: rule__StringDeclaration__WordAssignment_7 : ( RULE_STRING ) ;
    public final void rule__StringDeclaration__WordAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPageGeneratorLanguare.g:9787:1: ( ( RULE_STRING ) )
            // InternalPageGeneratorLanguare.g:9788:2: ( RULE_STRING )
            {
            // InternalPageGeneratorLanguare.g:9788:2: ( RULE_STRING )
            // InternalPageGeneratorLanguare.g:9789:3: RULE_STRING
            {
             before(grammarAccess.getStringDeclarationAccess().getWordSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringDeclarationAccess().getWordSTRINGTerminalRuleCall_7_0()); 

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
    // $ANTLR end "rule__StringDeclaration__WordAssignment_7"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0001201000202002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000098000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000090002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000120D90060A000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000120D900602002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000FE001000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000006FE000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000030FA000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000041000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000004FE000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000F00F2000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000120D900602000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000406000000L});

}