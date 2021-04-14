package uk.ac.kcl.mdd.cw2.pageGenerator.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uk.ac.kcl.mdd.cw2.pageGenerator.services.PageGeneratorLanguareGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPageGeneratorLanguareParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Head'", "'{'", "'}'", "'Title'", "'='", "';'", "'Description'", "','", "'lable'", "'Body'", "'Heading'", "'<'", "'index'", "'Font-colour'", "'Location'", "'Padding-left'", "'Padding-right'", "'Padding-top'", "'Padding-bottom'", "'>'", "'Link'", "'target'", "'Font-size'", "'Picture'", "'size'", "'alternative-text'", "'Text'", "'Section'", "'Background-Colour'", "'Size'", "'Section-location'", "'Text-location'", "'*'", "'Custom'", "'colour'", "'('", "')'", "'+'", "'Hightlight-word'"
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

        public InternalPageGeneratorLanguareParser(TokenStream input, PageGeneratorLanguareGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "WebPage";
       	}

       	@Override
       	protected PageGeneratorLanguareGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleWebPage"
    // InternalPageGeneratorLanguare.g:64:1: entryRuleWebPage returns [EObject current=null] : iv_ruleWebPage= ruleWebPage EOF ;
    public final EObject entryRuleWebPage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWebPage = null;


        try {
            // InternalPageGeneratorLanguare.g:64:48: (iv_ruleWebPage= ruleWebPage EOF )
            // InternalPageGeneratorLanguare.g:65:2: iv_ruleWebPage= ruleWebPage EOF
            {
             newCompositeNode(grammarAccess.getWebPageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWebPage=ruleWebPage();

            state._fsp--;

             current =iv_ruleWebPage; 
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
    // $ANTLR end "entryRuleWebPage"


    // $ANTLR start "ruleWebPage"
    // InternalPageGeneratorLanguare.g:71:1: ruleWebPage returns [EObject current=null] : ( (lv_pageElements_0_0= rulepageElement ) )* ;
    public final EObject ruleWebPage() throws RecognitionException {
        EObject current = null;

        EObject lv_pageElements_0_0 = null;



        	enterRule();

        try {
            // InternalPageGeneratorLanguare.g:77:2: ( ( (lv_pageElements_0_0= rulepageElement ) )* )
            // InternalPageGeneratorLanguare.g:78:2: ( (lv_pageElements_0_0= rulepageElement ) )*
            {
            // InternalPageGeneratorLanguare.g:78:2: ( (lv_pageElements_0_0= rulepageElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==20||LA1_0==35||LA1_0==44||LA1_0==49) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPageGeneratorLanguare.g:79:3: (lv_pageElements_0_0= rulepageElement )
            	    {
            	    // InternalPageGeneratorLanguare.g:79:3: (lv_pageElements_0_0= rulepageElement )
            	    // InternalPageGeneratorLanguare.g:80:4: lv_pageElements_0_0= rulepageElement
            	    {

            	    				newCompositeNode(grammarAccess.getWebPageAccess().getPageElementsPageElementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_pageElements_0_0=rulepageElement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getWebPageRule());
            	    				}
            	    				add(
            	    					current,
            	    					"pageElements",
            	    					lv_pageElements_0_0,
            	    					"uk.ac.kcl.mdd.cw2.pageGenerator.PageGeneratorLanguare.pageElement");
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
    // $ANTLR end "ruleWebPage"


    // $ANTLR start "entryRulepageElement"
    // InternalPageGeneratorLanguare.g:100:1: entryRulepageElement returns [EObject current=null] : iv_rulepageElement= rulepageElement EOF ;
    public final EObject entryRulepageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepageElement = null;


        try {
            // InternalPageGeneratorLanguare.g:100:52: (iv_rulepageElement= rulepageElement EOF )
            // InternalPageGeneratorLanguare.g:101:2: iv_rulepageElement= rulepageElement EOF
            {
             newCompositeNode(grammarAccess.getPageElementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulepageElement=rulepageElement();

            state._fsp--;

             current =iv_rulepageElement; 
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
    // $ANTLR end "entryRulepageElement"


    // $ANTLR start "rulepageElement"
    // InternalPageGeneratorLanguare.g:107:1: rulepageElement returns [EObject current=null] : (this_SizeDeclaration_0= ruleSizeDeclaration | this_ColourRGB_1= ruleColourRGB | this_Body_2= ruleBody | this_Head_3= ruleHead | this_stringDeclaration_4= rulestringDeclaration ) ;
    public final EObject rulepageElement() throws RecognitionException {
        EObject current = null;

        EObject this_SizeDeclaration_0 = null;

        EObject this_ColourRGB_1 = null;

        EObject this_Body_2 = null;

        EObject this_Head_3 = null;

        EObject this_stringDeclaration_4 = null;



        	enterRule();

        try {
            // InternalPageGeneratorLanguare.g:113:2: ( (this_SizeDeclaration_0= ruleSizeDeclaration | this_ColourRGB_1= ruleColourRGB | this_Body_2= ruleBody | this_Head_3= ruleHead | this_stringDeclaration_4= rulestringDeclaration ) )
            // InternalPageGeneratorLanguare.g:114:2: (this_SizeDeclaration_0= ruleSizeDeclaration | this_ColourRGB_1= ruleColourRGB | this_Body_2= ruleBody | this_Head_3= ruleHead | this_stringDeclaration_4= rulestringDeclaration )
            {
            // InternalPageGeneratorLanguare.g:114:2: (this_SizeDeclaration_0= ruleSizeDeclaration | this_ColourRGB_1= ruleColourRGB | this_Body_2= ruleBody | this_Head_3= ruleHead | this_stringDeclaration_4= rulestringDeclaration )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt2=1;
                }
                break;
            case 44:
                {
                alt2=2;
                }
                break;
            case 20:
                {
                alt2=3;
                }
                break;
            case 11:
                {
                alt2=4;
                }
                break;
            case 49:
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
                    // InternalPageGeneratorLanguare.g:115:3: this_SizeDeclaration_0= ruleSizeDeclaration
                    {

                    			newCompositeNode(grammarAccess.getPageElementAccess().getSizeDeclarationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SizeDeclaration_0=ruleSizeDeclaration();

                    state._fsp--;


                    			current = this_SizeDeclaration_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPageGeneratorLanguare.g:124:3: this_ColourRGB_1= ruleColourRGB
                    {

                    			newCompositeNode(grammarAccess.getPageElementAccess().getColourRGBParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ColourRGB_1=ruleColourRGB();

                    state._fsp--;


                    			current = this_ColourRGB_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPageGeneratorLanguare.g:133:3: this_Body_2= ruleBody
                    {

                    			newCompositeNode(grammarAccess.getPageElementAccess().getBodyParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Body_2=ruleBody();

                    state._fsp--;


                    			current = this_Body_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalPageGeneratorLanguare.g:142:3: this_Head_3= ruleHead
                    {

                    			newCompositeNode(grammarAccess.getPageElementAccess().getHeadParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Head_3=ruleHead();

                    state._fsp--;


                    			current = this_Head_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalPageGeneratorLanguare.g:151:3: this_stringDeclaration_4= rulestringDeclaration
                    {

                    			newCompositeNode(grammarAccess.getPageElementAccess().getStringDeclarationParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_stringDeclaration_4=rulestringDeclaration();

                    state._fsp--;


                    			current = this_stringDeclaration_4;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "rulepageElement"


    // $ANTLR start "entryRuleHead"
    // InternalPageGeneratorLanguare.g:163:1: entryRuleHead returns [EObject current=null] : iv_ruleHead= ruleHead EOF ;
    public final EObject entryRuleHead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHead = null;


        try {
            // InternalPageGeneratorLanguare.g:163:45: (iv_ruleHead= ruleHead EOF )
            // InternalPageGeneratorLanguare.g:164:2: iv_ruleHead= ruleHead EOF
            {
             newCompositeNode(grammarAccess.getHeadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHead=ruleHead();

            state._fsp--;

             current =iv_ruleHead; 
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
    // $ANTLR end "entryRuleHead"


    // $ANTLR start "ruleHead"
    // InternalPageGeneratorLanguare.g:170:1: ruleHead returns [EObject current=null] : ( () otherlv_1= 'Head' otherlv_2= '{' ( (lv_headElements_3_0= ruleheadElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleHead() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_headElements_3_0 = null;



        	enterRule();

        try {
            // InternalPageGeneratorLanguare.g:176:2: ( ( () otherlv_1= 'Head' otherlv_2= '{' ( (lv_headElements_3_0= ruleheadElement ) )* otherlv_4= '}' ) )
            // InternalPageGeneratorLanguare.g:177:2: ( () otherlv_1= 'Head' otherlv_2= '{' ( (lv_headElements_3_0= ruleheadElement ) )* otherlv_4= '}' )
            {
            // InternalPageGeneratorLanguare.g:177:2: ( () otherlv_1= 'Head' otherlv_2= '{' ( (lv_headElements_3_0= ruleheadElement ) )* otherlv_4= '}' )
            // InternalPageGeneratorLanguare.g:178:3: () otherlv_1= 'Head' otherlv_2= '{' ( (lv_headElements_3_0= ruleheadElement ) )* otherlv_4= '}'
            {
            // InternalPageGeneratorLanguare.g:178:3: ()
            // InternalPageGeneratorLanguare.g:179:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHeadAccess().getHeadAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getHeadAccess().getHeadKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getHeadAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPageGeneratorLanguare.g:193:3: ( (lv_headElements_3_0= ruleheadElement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14||LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPageGeneratorLanguare.g:194:4: (lv_headElements_3_0= ruleheadElement )
            	    {
            	    // InternalPageGeneratorLanguare.g:194:4: (lv_headElements_3_0= ruleheadElement )
            	    // InternalPageGeneratorLanguare.g:195:5: lv_headElements_3_0= ruleheadElement
            	    {

            	    					newCompositeNode(grammarAccess.getHeadAccess().getHeadElementsHeadElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_headElements_3_0=ruleheadElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getHeadRule());
            	    					}
            	    					add(
            	    						current,
            	    						"headElements",
            	    						lv_headElements_3_0,
            	    						"uk.ac.kcl.mdd.cw2.pageGenerator.PageGeneratorLanguare.headElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getHeadAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleHead"


    // $ANTLR start "entryRuleheadElement"
    // InternalPageGeneratorLanguare.g:220:1: entryRuleheadElement returns [EObject current=null] : iv_ruleheadElement= ruleheadElement EOF ;
    public final EObject entryRuleheadElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleheadElement = null;


        try {
            // InternalPageGeneratorLanguare.g:220:52: (iv_ruleheadElement= ruleheadElement EOF )
            // InternalPageGeneratorLanguare.g:221:2: iv_ruleheadElement= ruleheadElement EOF
            {
             newCompositeNode(grammarAccess.getHeadElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleheadElement=ruleheadElement();

            state._fsp--;

             current =iv_ruleheadElement; 
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
    // $ANTLR end "entryRuleheadElement"


    // $ANTLR start "ruleheadElement"
    // InternalPageGeneratorLanguare.g:227:1: ruleheadElement returns [EObject current=null] : (this_Title_0= ruleTitle | this_Label_1= ruleLabel ) ;
    public final EObject ruleheadElement() throws RecognitionException {
        EObject current = null;

        EObject this_Title_0 = null;

        EObject this_Label_1 = null;



        	enterRule();

        try {
            // InternalPageGeneratorLanguare.g:233:2: ( (this_Title_0= ruleTitle | this_Label_1= ruleLabel ) )
            // InternalPageGeneratorLanguare.g:234:2: (this_Title_0= ruleTitle | this_Label_1= ruleLabel )
            {
            // InternalPageGeneratorLanguare.g:234:2: (this_Title_0= ruleTitle | this_Label_1= ruleLabel )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            else if ( (LA4_0==17) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:235:3: this_Title_0= ruleTitle
                    {

                    			newCompositeNode(grammarAccess.getHeadElementAccess().getTitleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Title_0=ruleTitle();

                    state._fsp--;


                    			current = this_Title_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPageGeneratorLanguare.g:244:3: this_Label_1= ruleLabel
                    {

                    			newCompositeNode(grammarAccess.getHeadElementAccess().getLabelParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Label_1=ruleLabel();

                    state._fsp--;


                    			current = this_Label_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleheadElement"


    // $ANTLR start "entryRuleTitle"
    // InternalPageGeneratorLanguare.g:256:1: entryRuleTitle returns [EObject current=null] : iv_ruleTitle= ruleTitle EOF ;
    public final EObject entryRuleTitle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTitle = null;


        try {
            // InternalPageGeneratorLanguare.g:256:46: (iv_ruleTitle= ruleTitle EOF )
            // InternalPageGeneratorLanguare.g:257:2: iv_ruleTitle= ruleTitle EOF
            {
             newCompositeNode(grammarAccess.getTitleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTitle=ruleTitle();

            state._fsp--;

             current =iv_ruleTitle; 
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
    // $ANTLR end "entryRuleTitle"


    // $ANTLR start "ruleTitle"
    // InternalPageGeneratorLanguare.g:263:1: ruleTitle returns [EObject current=null] : (otherlv_0= 'Title' otherlv_1= '=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ';' ) ;
    public final EObject ruleTitle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalPageGeneratorLanguare.g:269:2: ( (otherlv_0= 'Title' otherlv_1= '=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ';' ) )
            // InternalPageGeneratorLanguare.g:270:2: (otherlv_0= 'Title' otherlv_1= '=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ';' )
            {
            // InternalPageGeneratorLanguare.g:270:2: (otherlv_0= 'Title' otherlv_1= '=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ';' )
            // InternalPageGeneratorLanguare.g:271:3: otherlv_0= 'Title' otherlv_1= '=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getTitleAccess().getTitleKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getTitleAccess().getEqualsSignKeyword_1());
            		
            // InternalPageGeneratorLanguare.g:279:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalPageGeneratorLanguare.g:280:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalPageGeneratorLanguare.g:280:4: (lv_name_2_0= RULE_STRING )
            // InternalPageGeneratorLanguare.g:281:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_name_2_0, grammarAccess.getTitleAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTitleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getTitleAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleTitle"


    // $ANTLR start "entryRuleLabel"
    // InternalPageGeneratorLanguare.g:305:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // InternalPageGeneratorLanguare.g:305:46: (iv_ruleLabel= ruleLabel EOF )
            // InternalPageGeneratorLanguare.g:306:2: iv_ruleLabel= ruleLabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLabel=ruleLabel();

            state._fsp--;

             current =iv_ruleLabel; 
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
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // InternalPageGeneratorLanguare.g:312:1: ruleLabel returns [EObject current=null] : (otherlv_0= 'Description' otherlv_1= '=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'lable' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_label_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalPageGeneratorLanguare.g:318:2: ( (otherlv_0= 'Description' otherlv_1= '=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'lable' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            // InternalPageGeneratorLanguare.g:319:2: (otherlv_0= 'Description' otherlv_1= '=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'lable' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            {
            // InternalPageGeneratorLanguare.g:319:2: (otherlv_0= 'Description' otherlv_1= '=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'lable' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            // InternalPageGeneratorLanguare.g:320:3: otherlv_0= 'Description' otherlv_1= '=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= 'lable' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getLabelAccess().getDescriptionKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getLabelAccess().getEqualsSignKeyword_1());
            		
            // InternalPageGeneratorLanguare.g:328:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalPageGeneratorLanguare.g:329:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalPageGeneratorLanguare.g:329:4: (lv_name_2_0= RULE_STRING )
            // InternalPageGeneratorLanguare.g:330:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_name_2_0, grammarAccess.getLabelAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLabelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getLabelAccess().getCommaKeyword_3());
            		
            otherlv_4=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getLabelAccess().getLableKeyword_4());
            		
            otherlv_5=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getLabelAccess().getEqualsSignKeyword_5());
            		
            // InternalPageGeneratorLanguare.g:358:3: ( (lv_label_6_0= RULE_STRING ) )
            // InternalPageGeneratorLanguare.g:359:4: (lv_label_6_0= RULE_STRING )
            {
            // InternalPageGeneratorLanguare.g:359:4: (lv_label_6_0= RULE_STRING )
            // InternalPageGeneratorLanguare.g:360:5: lv_label_6_0= RULE_STRING
            {
            lv_label_6_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_label_6_0, grammarAccess.getLabelAccess().getLabelSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLabelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"label",
            						lv_label_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getLabelAccess().getSemicolonKeyword_7());
            		

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
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleBody"
    // InternalPageGeneratorLanguare.g:384:1: entryRuleBody returns [EObject current=null] : iv_ruleBody= ruleBody EOF ;
    public final EObject entryRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBody = null;


        try {
            // InternalPageGeneratorLanguare.g:384:45: (iv_ruleBody= ruleBody EOF )
            // InternalPageGeneratorLanguare.g:385:2: iv_ruleBody= ruleBody EOF
            {
             newCompositeNode(grammarAccess.getBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBody=ruleBody();

            state._fsp--;

             current =iv_ruleBody; 
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
    // $ANTLR end "entryRuleBody"


    // $ANTLR start "ruleBody"
    // InternalPageGeneratorLanguare.g:391:1: ruleBody returns [EObject current=null] : ( () otherlv_1= 'Body' otherlv_2= '{' ( (lv_bodyElements_3_0= rulebodyElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_bodyElements_3_0 = null;



        	enterRule();

        try {
            // InternalPageGeneratorLanguare.g:397:2: ( ( () otherlv_1= 'Body' otherlv_2= '{' ( (lv_bodyElements_3_0= rulebodyElement ) )* otherlv_4= '}' ) )
            // InternalPageGeneratorLanguare.g:398:2: ( () otherlv_1= 'Body' otherlv_2= '{' ( (lv_bodyElements_3_0= rulebodyElement ) )* otherlv_4= '}' )
            {
            // InternalPageGeneratorLanguare.g:398:2: ( () otherlv_1= 'Body' otherlv_2= '{' ( (lv_bodyElements_3_0= rulebodyElement ) )* otherlv_4= '}' )
            // InternalPageGeneratorLanguare.g:399:3: () otherlv_1= 'Body' otherlv_2= '{' ( (lv_bodyElements_3_0= rulebodyElement ) )* otherlv_4= '}'
            {
            // InternalPageGeneratorLanguare.g:399:3: ()
            // InternalPageGeneratorLanguare.g:400:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBodyAccess().getBodyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getBodyAccess().getBodyKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPageGeneratorLanguare.g:414:3: ( (lv_bodyElements_3_0= rulebodyElement ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==21||LA5_0==31||(LA5_0>=34 && LA5_0<=35)||(LA5_0>=37 && LA5_0<=38)||LA5_0==44||LA5_0==49) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPageGeneratorLanguare.g:415:4: (lv_bodyElements_3_0= rulebodyElement )
            	    {
            	    // InternalPageGeneratorLanguare.g:415:4: (lv_bodyElements_3_0= rulebodyElement )
            	    // InternalPageGeneratorLanguare.g:416:5: lv_bodyElements_3_0= rulebodyElement
            	    {

            	    					newCompositeNode(grammarAccess.getBodyAccess().getBodyElementsBodyElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_bodyElements_3_0=rulebodyElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBodyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"bodyElements",
            	    						lv_bodyElements_3_0,
            	    						"uk.ac.kcl.mdd.cw2.pageGenerator.PageGeneratorLanguare.bodyElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleBody"


    // $ANTLR start "entryRulebodyElement"
    // InternalPageGeneratorLanguare.g:441:1: entryRulebodyElement returns [EObject current=null] : iv_rulebodyElement= rulebodyElement EOF ;
    public final EObject entryRulebodyElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebodyElement = null;


        try {
            // InternalPageGeneratorLanguare.g:441:52: (iv_rulebodyElement= rulebodyElement EOF )
            // InternalPageGeneratorLanguare.g:442:2: iv_rulebodyElement= rulebodyElement EOF
            {
             newCompositeNode(grammarAccess.getBodyElementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulebodyElement=rulebodyElement();

            state._fsp--;

             current =iv_rulebodyElement; 
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
    // $ANTLR end "entryRulebodyElement"


    // $ANTLR start "rulebodyElement"
    // InternalPageGeneratorLanguare.g:448:1: rulebodyElement returns [EObject current=null] : (this_Heading_0= ruleHeading | this_Link_1= ruleLink | this_Text_2= ruleText | this_Picture_3= rulePicture | this_Section_4= ruleSection | this_SizeDeclaration_5= ruleSizeDeclaration | this_ColourRGB_6= ruleColourRGB | this_stringDeclaration_7= rulestringDeclaration ) ;
    public final EObject rulebodyElement() throws RecognitionException {
        EObject current = null;

        EObject this_Heading_0 = null;

        EObject this_Link_1 = null;

        EObject this_Text_2 = null;

        EObject this_Picture_3 = null;

        EObject this_Section_4 = null;

        EObject this_SizeDeclaration_5 = null;

        EObject this_ColourRGB_6 = null;

        EObject this_stringDeclaration_7 = null;



        	enterRule();

        try {
            // InternalPageGeneratorLanguare.g:454:2: ( (this_Heading_0= ruleHeading | this_Link_1= ruleLink | this_Text_2= ruleText | this_Picture_3= rulePicture | this_Section_4= ruleSection | this_SizeDeclaration_5= ruleSizeDeclaration | this_ColourRGB_6= ruleColourRGB | this_stringDeclaration_7= rulestringDeclaration ) )
            // InternalPageGeneratorLanguare.g:455:2: (this_Heading_0= ruleHeading | this_Link_1= ruleLink | this_Text_2= ruleText | this_Picture_3= rulePicture | this_Section_4= ruleSection | this_SizeDeclaration_5= ruleSizeDeclaration | this_ColourRGB_6= ruleColourRGB | this_stringDeclaration_7= rulestringDeclaration )
            {
            // InternalPageGeneratorLanguare.g:455:2: (this_Heading_0= ruleHeading | this_Link_1= ruleLink | this_Text_2= ruleText | this_Picture_3= rulePicture | this_Section_4= ruleSection | this_SizeDeclaration_5= ruleSizeDeclaration | this_ColourRGB_6= ruleColourRGB | this_stringDeclaration_7= rulestringDeclaration )
            int alt6=8;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt6=1;
                }
                break;
            case 31:
                {
                alt6=2;
                }
                break;
            case 37:
                {
                alt6=3;
                }
                break;
            case 34:
                {
                alt6=4;
                }
                break;
            case 38:
                {
                alt6=5;
                }
                break;
            case 35:
                {
                alt6=6;
                }
                break;
            case 44:
                {
                alt6=7;
                }
                break;
            case 49:
                {
                alt6=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:456:3: this_Heading_0= ruleHeading
                    {

                    			newCompositeNode(grammarAccess.getBodyElementAccess().getHeadingParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Heading_0=ruleHeading();

                    state._fsp--;


                    			current = this_Heading_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPageGeneratorLanguare.g:465:3: this_Link_1= ruleLink
                    {

                    			newCompositeNode(grammarAccess.getBodyElementAccess().getLinkParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Link_1=ruleLink();

                    state._fsp--;


                    			current = this_Link_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPageGeneratorLanguare.g:474:3: this_Text_2= ruleText
                    {

                    			newCompositeNode(grammarAccess.getBodyElementAccess().getTextParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Text_2=ruleText();

                    state._fsp--;


                    			current = this_Text_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalPageGeneratorLanguare.g:483:3: this_Picture_3= rulePicture
                    {

                    			newCompositeNode(grammarAccess.getBodyElementAccess().getPictureParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Picture_3=rulePicture();

                    state._fsp--;


                    			current = this_Picture_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalPageGeneratorLanguare.g:492:3: this_Section_4= ruleSection
                    {

                    			newCompositeNode(grammarAccess.getBodyElementAccess().getSectionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Section_4=ruleSection();

                    state._fsp--;


                    			current = this_Section_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalPageGeneratorLanguare.g:501:3: this_SizeDeclaration_5= ruleSizeDeclaration
                    {

                    			newCompositeNode(grammarAccess.getBodyElementAccess().getSizeDeclarationParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_SizeDeclaration_5=ruleSizeDeclaration();

                    state._fsp--;


                    			current = this_SizeDeclaration_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalPageGeneratorLanguare.g:510:3: this_ColourRGB_6= ruleColourRGB
                    {

                    			newCompositeNode(grammarAccess.getBodyElementAccess().getColourRGBParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_ColourRGB_6=ruleColourRGB();

                    state._fsp--;


                    			current = this_ColourRGB_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalPageGeneratorLanguare.g:519:3: this_stringDeclaration_7= rulestringDeclaration
                    {

                    			newCompositeNode(grammarAccess.getBodyElementAccess().getStringDeclarationParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_stringDeclaration_7=rulestringDeclaration();

                    state._fsp--;


                    			current = this_stringDeclaration_7;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "rulebodyElement"


    // $ANTLR start "entryRuleHeading"
    // InternalPageGeneratorLanguare.g:531:1: entryRuleHeading returns [EObject current=null] : iv_ruleHeading= ruleHeading EOF ;
    public final EObject entryRuleHeading() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeading = null;


        try {
            // InternalPageGeneratorLanguare.g:531:48: (iv_ruleHeading= ruleHeading EOF )
            // InternalPageGeneratorLanguare.g:532:2: iv_ruleHeading= ruleHeading EOF
            {
             newCompositeNode(grammarAccess.getHeadingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHeading=ruleHeading();

            state._fsp--;

             current =iv_ruleHeading; 
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
    // $ANTLR end "entryRuleHeading"


    // $ANTLR start "ruleHeading"
    // InternalPageGeneratorLanguare.g:538:1: ruleHeading returns [EObject current=null] : (otherlv_0= 'Heading' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '<' otherlv_3= 'index' otherlv_4= '=' ( (lv_index_5_0= RULE_INT ) ) (otherlv_6= ',' )? (otherlv_7= 'Font-colour' otherlv_8= '=' ( (lv_fontColor_9_0= ruleprimaryColour ) ) (otherlv_10= ',' )? )? (otherlv_11= 'Location' otherlv_12= '=' ( (lv_location_13_0= rulelocationexpression ) ) (otherlv_14= ',' )? )? (otherlv_15= 'Padding-left' otherlv_16= '=' ( (lv_Lpadding_17_0= RULE_INT ) ) (otherlv_18= ',' )? )? (otherlv_19= 'Padding-right' otherlv_20= '=' ( (lv_Rpadding_21_0= RULE_INT ) ) (otherlv_22= ',' )? )? (otherlv_23= 'Padding-top' otherlv_24= '=' ( (lv_Tpadding_25_0= RULE_INT ) ) (otherlv_26= ',' )? )? (otherlv_27= 'Padding-bottom' otherlv_28= '=' ( (lv_Bpadding_29_0= RULE_INT ) ) (otherlv_30= ',' )? )? otherlv_31= '>' otherlv_32= '=' ( (lv_title_33_0= RULE_STRING ) ) otherlv_34= ';' ) ;
    public final EObject ruleHeading() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_index_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_Lpadding_17_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token lv_Rpadding_21_0=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token lv_Tpadding_25_0=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token lv_Bpadding_29_0=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token lv_title_33_0=null;
        Token otherlv_34=null;
        EObject lv_fontColor_9_0 = null;

        EObject lv_location_13_0 = null;



        	enterRule();

        try {
            // InternalPageGeneratorLanguare.g:544:2: ( (otherlv_0= 'Heading' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '<' otherlv_3= 'index' otherlv_4= '=' ( (lv_index_5_0= RULE_INT ) ) (otherlv_6= ',' )? (otherlv_7= 'Font-colour' otherlv_8= '=' ( (lv_fontColor_9_0= ruleprimaryColour ) ) (otherlv_10= ',' )? )? (otherlv_11= 'Location' otherlv_12= '=' ( (lv_location_13_0= rulelocationexpression ) ) (otherlv_14= ',' )? )? (otherlv_15= 'Padding-left' otherlv_16= '=' ( (lv_Lpadding_17_0= RULE_INT ) ) (otherlv_18= ',' )? )? (otherlv_19= 'Padding-right' otherlv_20= '=' ( (lv_Rpadding_21_0= RULE_INT ) ) (otherlv_22= ',' )? )? (otherlv_23= 'Padding-top' otherlv_24= '=' ( (lv_Tpadding_25_0= RULE_INT ) ) (otherlv_26= ',' )? )? (otherlv_27= 'Padding-bottom' otherlv_28= '=' ( (lv_Bpadding_29_0= RULE_INT ) ) (otherlv_30= ',' )? )? otherlv_31= '>' otherlv_32= '=' ( (lv_title_33_0= RULE_STRING ) ) otherlv_34= ';' ) )
            // InternalPageGeneratorLanguare.g:545:2: (otherlv_0= 'Heading' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '<' otherlv_3= 'index' otherlv_4= '=' ( (lv_index_5_0= RULE_INT ) ) (otherlv_6= ',' )? (otherlv_7= 'Font-colour' otherlv_8= '=' ( (lv_fontColor_9_0= ruleprimaryColour ) ) (otherlv_10= ',' )? )? (otherlv_11= 'Location' otherlv_12= '=' ( (lv_location_13_0= rulelocationexpression ) ) (otherlv_14= ',' )? )? (otherlv_15= 'Padding-left' otherlv_16= '=' ( (lv_Lpadding_17_0= RULE_INT ) ) (otherlv_18= ',' )? )? (otherlv_19= 'Padding-right' otherlv_20= '=' ( (lv_Rpadding_21_0= RULE_INT ) ) (otherlv_22= ',' )? )? (otherlv_23= 'Padding-top' otherlv_24= '=' ( (lv_Tpadding_25_0= RULE_INT ) ) (otherlv_26= ',' )? )? (otherlv_27= 'Padding-bottom' otherlv_28= '=' ( (lv_Bpadding_29_0= RULE_INT ) ) (otherlv_30= ',' )? )? otherlv_31= '>' otherlv_32= '=' ( (lv_title_33_0= RULE_STRING ) ) otherlv_34= ';' )
            {
            // InternalPageGeneratorLanguare.g:545:2: (otherlv_0= 'Heading' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '<' otherlv_3= 'index' otherlv_4= '=' ( (lv_index_5_0= RULE_INT ) ) (otherlv_6= ',' )? (otherlv_7= 'Font-colour' otherlv_8= '=' ( (lv_fontColor_9_0= ruleprimaryColour ) ) (otherlv_10= ',' )? )? (otherlv_11= 'Location' otherlv_12= '=' ( (lv_location_13_0= rulelocationexpression ) ) (otherlv_14= ',' )? )? (otherlv_15= 'Padding-left' otherlv_16= '=' ( (lv_Lpadding_17_0= RULE_INT ) ) (otherlv_18= ',' )? )? (otherlv_19= 'Padding-right' otherlv_20= '=' ( (lv_Rpadding_21_0= RULE_INT ) ) (otherlv_22= ',' )? )? (otherlv_23= 'Padding-top' otherlv_24= '=' ( (lv_Tpadding_25_0= RULE_INT ) ) (otherlv_26= ',' )? )? (otherlv_27= 'Padding-bottom' otherlv_28= '=' ( (lv_Bpadding_29_0= RULE_INT ) ) (otherlv_30= ',' )? )? otherlv_31= '>' otherlv_32= '=' ( (lv_title_33_0= RULE_STRING ) ) otherlv_34= ';' )
            // InternalPageGeneratorLanguare.g:546:3: otherlv_0= 'Heading' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '<' otherlv_3= 'index' otherlv_4= '=' ( (lv_index_5_0= RULE_INT ) ) (otherlv_6= ',' )? (otherlv_7= 'Font-colour' otherlv_8= '=' ( (lv_fontColor_9_0= ruleprimaryColour ) ) (otherlv_10= ',' )? )? (otherlv_11= 'Location' otherlv_12= '=' ( (lv_location_13_0= rulelocationexpression ) ) (otherlv_14= ',' )? )? (otherlv_15= 'Padding-left' otherlv_16= '=' ( (lv_Lpadding_17_0= RULE_INT ) ) (otherlv_18= ',' )? )? (otherlv_19= 'Padding-right' otherlv_20= '=' ( (lv_Rpadding_21_0= RULE_INT ) ) (otherlv_22= ',' )? )? (otherlv_23= 'Padding-top' otherlv_24= '=' ( (lv_Tpadding_25_0= RULE_INT ) ) (otherlv_26= ',' )? )? (otherlv_27= 'Padding-bottom' otherlv_28= '=' ( (lv_Bpadding_29_0= RULE_INT ) ) (otherlv_30= ',' )? )? otherlv_31= '>' otherlv_32= '=' ( (lv_title_33_0= RULE_STRING ) ) otherlv_34= ';'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getHeadingAccess().getHeadingKeyword_0());
            		
            // InternalPageGeneratorLanguare.g:550:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPageGeneratorLanguare.g:551:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPageGeneratorLanguare.g:551:4: (lv_name_1_0= RULE_ID )
            // InternalPageGeneratorLanguare.g:552:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getHeadingAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHeadingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getHeadingAccess().getLessThanSignKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getHeadingAccess().getIndexKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getHeadingAccess().getEqualsSignKeyword_4());
            		
            // InternalPageGeneratorLanguare.g:580:3: ( (lv_index_5_0= RULE_INT ) )
            // InternalPageGeneratorLanguare.g:581:4: (lv_index_5_0= RULE_INT )
            {
            // InternalPageGeneratorLanguare.g:581:4: (lv_index_5_0= RULE_INT )
            // InternalPageGeneratorLanguare.g:582:5: lv_index_5_0= RULE_INT
            {
            lv_index_5_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            					newLeafNode(lv_index_5_0, grammarAccess.getHeadingAccess().getIndexINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHeadingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"index",
            						lv_index_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalPageGeneratorLanguare.g:598:3: (otherlv_6= ',' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:599:4: otherlv_6= ','
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_17); 

                    				newLeafNode(otherlv_6, grammarAccess.getHeadingAccess().getCommaKeyword_6());
                    			

                    }
                    break;

            }

            // InternalPageGeneratorLanguare.g:604:3: (otherlv_7= 'Font-colour' otherlv_8= '=' ( (lv_fontColor_9_0= ruleprimaryColour ) ) (otherlv_10= ',' )? )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:605:4: otherlv_7= 'Font-colour' otherlv_8= '=' ( (lv_fontColor_9_0= ruleprimaryColour ) ) (otherlv_10= ',' )?
                    {
                    otherlv_7=(Token)match(input,24,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getHeadingAccess().getFontColourKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,15,FOLLOW_18); 

                    				newLeafNode(otherlv_8, grammarAccess.getHeadingAccess().getEqualsSignKeyword_7_1());
                    			
                    // InternalPageGeneratorLanguare.g:613:4: ( (lv_fontColor_9_0= ruleprimaryColour ) )
                    // InternalPageGeneratorLanguare.g:614:5: (lv_fontColor_9_0= ruleprimaryColour )
                    {
                    // InternalPageGeneratorLanguare.g:614:5: (lv_fontColor_9_0= ruleprimaryColour )
                    // InternalPageGeneratorLanguare.g:615:6: lv_fontColor_9_0= ruleprimaryColour
                    {

                    						newCompositeNode(grammarAccess.getHeadingAccess().getFontColorPrimaryColourParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_fontColor_9_0=ruleprimaryColour();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHeadingRule());
                    						}
                    						set(
                    							current,
                    							"fontColor",
                    							lv_fontColor_9_0,
                    							"uk.ac.kcl.mdd.cw2.pageGenerator.PageGeneratorLanguare.primaryColour");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPageGeneratorLanguare.g:632:4: (otherlv_10= ',' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==18) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalPageGeneratorLanguare.g:633:5: otherlv_10= ','
                            {
                            otherlv_10=(Token)match(input,18,FOLLOW_20); 

                            					newLeafNode(otherlv_10, grammarAccess.getHeadingAccess().getCommaKeyword_7_3());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalPageGeneratorLanguare.g:639:3: (otherlv_11= 'Location' otherlv_12= '=' ( (lv_location_13_0= rulelocationexpression ) ) (otherlv_14= ',' )? )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:640:4: otherlv_11= 'Location' otherlv_12= '=' ( (lv_location_13_0= rulelocationexpression ) ) (otherlv_14= ',' )?
                    {
                    otherlv_11=(Token)match(input,25,FOLLOW_6); 

                    				newLeafNode(otherlv_11, grammarAccess.getHeadingAccess().getLocationKeyword_8_0());
                    			
                    otherlv_12=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_12, grammarAccess.getHeadingAccess().getEqualsSignKeyword_8_1());
                    			
                    // InternalPageGeneratorLanguare.g:648:4: ( (lv_location_13_0= rulelocationexpression ) )
                    // InternalPageGeneratorLanguare.g:649:5: (lv_location_13_0= rulelocationexpression )
                    {
                    // InternalPageGeneratorLanguare.g:649:5: (lv_location_13_0= rulelocationexpression )
                    // InternalPageGeneratorLanguare.g:650:6: lv_location_13_0= rulelocationexpression
                    {

                    						newCompositeNode(grammarAccess.getHeadingAccess().getLocationLocationexpressionParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_location_13_0=rulelocationexpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHeadingRule());
                    						}
                    						set(
                    							current,
                    							"location",
                    							lv_location_13_0,
                    							"uk.ac.kcl.mdd.cw2.pageGenerator.PageGeneratorLanguare.locationexpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPageGeneratorLanguare.g:667:4: (otherlv_14= ',' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==18) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalPageGeneratorLanguare.g:668:5: otherlv_14= ','
                            {
                            otherlv_14=(Token)match(input,18,FOLLOW_22); 

                            					newLeafNode(otherlv_14, grammarAccess.getHeadingAccess().getCommaKeyword_8_3());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalPageGeneratorLanguare.g:674:3: (otherlv_15= 'Padding-left' otherlv_16= '=' ( (lv_Lpadding_17_0= RULE_INT ) ) (otherlv_18= ',' )? )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:675:4: otherlv_15= 'Padding-left' otherlv_16= '=' ( (lv_Lpadding_17_0= RULE_INT ) ) (otherlv_18= ',' )?
                    {
                    otherlv_15=(Token)match(input,26,FOLLOW_6); 

                    				newLeafNode(otherlv_15, grammarAccess.getHeadingAccess().getPaddingLeftKeyword_9_0());
                    			
                    otherlv_16=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_16, grammarAccess.getHeadingAccess().getEqualsSignKeyword_9_1());
                    			
                    // InternalPageGeneratorLanguare.g:683:4: ( (lv_Lpadding_17_0= RULE_INT ) )
                    // InternalPageGeneratorLanguare.g:684:5: (lv_Lpadding_17_0= RULE_INT )
                    {
                    // InternalPageGeneratorLanguare.g:684:5: (lv_Lpadding_17_0= RULE_INT )
                    // InternalPageGeneratorLanguare.g:685:6: lv_Lpadding_17_0= RULE_INT
                    {
                    lv_Lpadding_17_0=(Token)match(input,RULE_INT,FOLLOW_23); 

                    						newLeafNode(lv_Lpadding_17_0, grammarAccess.getHeadingAccess().getLpaddingINTTerminalRuleCall_9_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getHeadingRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"Lpadding",
                    							lv_Lpadding_17_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalPageGeneratorLanguare.g:701:4: (otherlv_18= ',' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==18) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalPageGeneratorLanguare.g:702:5: otherlv_18= ','
                            {
                            otherlv_18=(Token)match(input,18,FOLLOW_24); 

                            					newLeafNode(otherlv_18, grammarAccess.getHeadingAccess().getCommaKeyword_9_3());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalPageGeneratorLanguare.g:708:3: (otherlv_19= 'Padding-right' otherlv_20= '=' ( (lv_Rpadding_21_0= RULE_INT ) ) (otherlv_22= ',' )? )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:709:4: otherlv_19= 'Padding-right' otherlv_20= '=' ( (lv_Rpadding_21_0= RULE_INT ) ) (otherlv_22= ',' )?
                    {
                    otherlv_19=(Token)match(input,27,FOLLOW_6); 

                    				newLeafNode(otherlv_19, grammarAccess.getHeadingAccess().getPaddingRightKeyword_10_0());
                    			
                    otherlv_20=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_20, grammarAccess.getHeadingAccess().getEqualsSignKeyword_10_1());
                    			
                    // InternalPageGeneratorLanguare.g:717:4: ( (lv_Rpadding_21_0= RULE_INT ) )
                    // InternalPageGeneratorLanguare.g:718:5: (lv_Rpadding_21_0= RULE_INT )
                    {
                    // InternalPageGeneratorLanguare.g:718:5: (lv_Rpadding_21_0= RULE_INT )
                    // InternalPageGeneratorLanguare.g:719:6: lv_Rpadding_21_0= RULE_INT
                    {
                    lv_Rpadding_21_0=(Token)match(input,RULE_INT,FOLLOW_25); 

                    						newLeafNode(lv_Rpadding_21_0, grammarAccess.getHeadingAccess().getRpaddingINTTerminalRuleCall_10_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getHeadingRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"Rpadding",
                    							lv_Rpadding_21_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalPageGeneratorLanguare.g:735:4: (otherlv_22= ',' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==18) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalPageGeneratorLanguare.g:736:5: otherlv_22= ','
                            {
                            otherlv_22=(Token)match(input,18,FOLLOW_26); 

                            					newLeafNode(otherlv_22, grammarAccess.getHeadingAccess().getCommaKeyword_10_3());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalPageGeneratorLanguare.g:742:3: (otherlv_23= 'Padding-top' otherlv_24= '=' ( (lv_Tpadding_25_0= RULE_INT ) ) (otherlv_26= ',' )? )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:743:4: otherlv_23= 'Padding-top' otherlv_24= '=' ( (lv_Tpadding_25_0= RULE_INT ) ) (otherlv_26= ',' )?
                    {
                    otherlv_23=(Token)match(input,28,FOLLOW_6); 

                    				newLeafNode(otherlv_23, grammarAccess.getHeadingAccess().getPaddingTopKeyword_11_0());
                    			
                    otherlv_24=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_24, grammarAccess.getHeadingAccess().getEqualsSignKeyword_11_1());
                    			
                    // InternalPageGeneratorLanguare.g:751:4: ( (lv_Tpadding_25_0= RULE_INT ) )
                    // InternalPageGeneratorLanguare.g:752:5: (lv_Tpadding_25_0= RULE_INT )
                    {
                    // InternalPageGeneratorLanguare.g:752:5: (lv_Tpadding_25_0= RULE_INT )
                    // InternalPageGeneratorLanguare.g:753:6: lv_Tpadding_25_0= RULE_INT
                    {
                    lv_Tpadding_25_0=(Token)match(input,RULE_INT,FOLLOW_27); 

                    						newLeafNode(lv_Tpadding_25_0, grammarAccess.getHeadingAccess().getTpaddingINTTerminalRuleCall_11_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getHeadingRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"Tpadding",
                    							lv_Tpadding_25_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalPageGeneratorLanguare.g:769:4: (otherlv_26= ',' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==18) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalPageGeneratorLanguare.g:770:5: otherlv_26= ','
                            {
                            otherlv_26=(Token)match(input,18,FOLLOW_28); 

                            					newLeafNode(otherlv_26, grammarAccess.getHeadingAccess().getCommaKeyword_11_3());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalPageGeneratorLanguare.g:776:3: (otherlv_27= 'Padding-bottom' otherlv_28= '=' ( (lv_Bpadding_29_0= RULE_INT ) ) (otherlv_30= ',' )? )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:777:4: otherlv_27= 'Padding-bottom' otherlv_28= '=' ( (lv_Bpadding_29_0= RULE_INT ) ) (otherlv_30= ',' )?
                    {
                    otherlv_27=(Token)match(input,29,FOLLOW_6); 

                    				newLeafNode(otherlv_27, grammarAccess.getHeadingAccess().getPaddingBottomKeyword_12_0());
                    			
                    otherlv_28=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_28, grammarAccess.getHeadingAccess().getEqualsSignKeyword_12_1());
                    			
                    // InternalPageGeneratorLanguare.g:785:4: ( (lv_Bpadding_29_0= RULE_INT ) )
                    // InternalPageGeneratorLanguare.g:786:5: (lv_Bpadding_29_0= RULE_INT )
                    {
                    // InternalPageGeneratorLanguare.g:786:5: (lv_Bpadding_29_0= RULE_INT )
                    // InternalPageGeneratorLanguare.g:787:6: lv_Bpadding_29_0= RULE_INT
                    {
                    lv_Bpadding_29_0=(Token)match(input,RULE_INT,FOLLOW_29); 

                    						newLeafNode(lv_Bpadding_29_0, grammarAccess.getHeadingAccess().getBpaddingINTTerminalRuleCall_12_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getHeadingRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"Bpadding",
                    							lv_Bpadding_29_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalPageGeneratorLanguare.g:803:4: (otherlv_30= ',' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==18) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalPageGeneratorLanguare.g:804:5: otherlv_30= ','
                            {
                            otherlv_30=(Token)match(input,18,FOLLOW_30); 

                            					newLeafNode(otherlv_30, grammarAccess.getHeadingAccess().getCommaKeyword_12_3());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_31=(Token)match(input,30,FOLLOW_6); 

            			newLeafNode(otherlv_31, grammarAccess.getHeadingAccess().getGreaterThanSignKeyword_13());
            		
            otherlv_32=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_32, grammarAccess.getHeadingAccess().getEqualsSignKeyword_14());
            		
            // InternalPageGeneratorLanguare.g:818:3: ( (lv_title_33_0= RULE_STRING ) )
            // InternalPageGeneratorLanguare.g:819:4: (lv_title_33_0= RULE_STRING )
            {
            // InternalPageGeneratorLanguare.g:819:4: (lv_title_33_0= RULE_STRING )
            // InternalPageGeneratorLanguare.g:820:5: lv_title_33_0= RULE_STRING
            {
            lv_title_33_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_title_33_0, grammarAccess.getHeadingAccess().getTitleSTRINGTerminalRuleCall_15_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHeadingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"title",
            						lv_title_33_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_34=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_34, grammarAccess.getHeadingAccess().getSemicolonKeyword_16());
            		

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
    // $ANTLR end "ruleHeading"


    // $ANTLR start "entryRuleLink"
    // InternalPageGeneratorLanguare.g:844:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalPageGeneratorLanguare.g:844:45: (iv_ruleLink= ruleLink EOF )
            // InternalPageGeneratorLanguare.g:845:2: iv_ruleLink= ruleLink EOF
            {
             newCompositeNode(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLink=ruleLink();

            state._fsp--;

             current =iv_ruleLink; 
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
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // InternalPageGeneratorLanguare.g:851:1: ruleLink returns [EObject current=null] : (otherlv_0= 'Link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '<' (otherlv_3= 'target' otherlv_4= '=' ( (lv_target_5_0= RULE_STRING ) ) (otherlv_6= ',' )? )? (otherlv_7= 'Padding-left' otherlv_8= '=' ( (lv_Lpadding_9_0= RULE_INT ) ) (otherlv_10= ',' )? )? (otherlv_11= 'Padding-right' otherlv_12= '=' ( (lv_Rpadding_13_0= RULE_INT ) ) (otherlv_14= ',' )? )? (otherlv_15= 'Padding-top' otherlv_16= '=' ( (lv_Tpadding_17_0= RULE_INT ) ) (otherlv_18= ',' )? )? (otherlv_19= 'Padding-bottom' otherlv_20= '=' ( (lv_Bpadding_21_0= RULE_INT ) ) (otherlv_22= ',' )? )? (otherlv_23= 'Font-colour' otherlv_24= '=' ( (lv_fontColor_25_0= ruleprimaryColour ) ) (otherlv_26= ',' )? )? (otherlv_27= 'Font-size' otherlv_28= '=' ( (lv_fontSize_29_0= RULE_INT ) ) (otherlv_30= ',' )? )? (otherlv_31= 'Location' otherlv_32= '=' ( (lv_location_33_0= rulelocationexpression ) ) (otherlv_34= ',' )? )? otherlv_35= '>' otherlv_36= '=' ( (lv_url_37_0= RULE_STRING ) ) otherlv_38= ';' ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_target_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_Lpadding_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_Rpadding_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_Tpadding_17_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token lv_Bpadding_21_0=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token lv_fontSize_29_0=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token lv_url_37_0=null;
        Token otherlv_38=null;
        EObject lv_fontColor_25_0 = null;

        EObject lv_location_33_0 = null;



        	enterRule();

        try {
            // InternalPageGeneratorLanguare.g:857:2: ( (otherlv_0= 'Link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '<' (otherlv_3= 'target' otherlv_4= '=' ( (lv_target_5_0= RULE_STRING ) ) (otherlv_6= ',' )? )? (otherlv_7= 'Padding-left' otherlv_8= '=' ( (lv_Lpadding_9_0= RULE_INT ) ) (otherlv_10= ',' )? )? (otherlv_11= 'Padding-right' otherlv_12= '=' ( (lv_Rpadding_13_0= RULE_INT ) ) (otherlv_14= ',' )? )? (otherlv_15= 'Padding-top' otherlv_16= '=' ( (lv_Tpadding_17_0= RULE_INT ) ) (otherlv_18= ',' )? )? (otherlv_19= 'Padding-bottom' otherlv_20= '=' ( (lv_Bpadding_21_0= RULE_INT ) ) (otherlv_22= ',' )? )? (otherlv_23= 'Font-colour' otherlv_24= '=' ( (lv_fontColor_25_0= ruleprimaryColour ) ) (otherlv_26= ',' )? )? (otherlv_27= 'Font-size' otherlv_28= '=' ( (lv_fontSize_29_0= RULE_INT ) ) (otherlv_30= ',' )? )? (otherlv_31= 'Location' otherlv_32= '=' ( (lv_location_33_0= rulelocationexpression ) ) (otherlv_34= ',' )? )? otherlv_35= '>' otherlv_36= '=' ( (lv_url_37_0= RULE_STRING ) ) otherlv_38= ';' ) )
            // InternalPageGeneratorLanguare.g:858:2: (otherlv_0= 'Link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '<' (otherlv_3= 'target' otherlv_4= '=' ( (lv_target_5_0= RULE_STRING ) ) (otherlv_6= ',' )? )? (otherlv_7= 'Padding-left' otherlv_8= '=' ( (lv_Lpadding_9_0= RULE_INT ) ) (otherlv_10= ',' )? )? (otherlv_11= 'Padding-right' otherlv_12= '=' ( (lv_Rpadding_13_0= RULE_INT ) ) (otherlv_14= ',' )? )? (otherlv_15= 'Padding-top' otherlv_16= '=' ( (lv_Tpadding_17_0= RULE_INT ) ) (otherlv_18= ',' )? )? (otherlv_19= 'Padding-bottom' otherlv_20= '=' ( (lv_Bpadding_21_0= RULE_INT ) ) (otherlv_22= ',' )? )? (otherlv_23= 'Font-colour' otherlv_24= '=' ( (lv_fontColor_25_0= ruleprimaryColour ) ) (otherlv_26= ',' )? )? (otherlv_27= 'Font-size' otherlv_28= '=' ( (lv_fontSize_29_0= RULE_INT ) ) (otherlv_30= ',' )? )? (otherlv_31= 'Location' otherlv_32= '=' ( (lv_location_33_0= rulelocationexpression ) ) (otherlv_34= ',' )? )? otherlv_35= '>' otherlv_36= '=' ( (lv_url_37_0= RULE_STRING ) ) otherlv_38= ';' )
            {
            // InternalPageGeneratorLanguare.g:858:2: (otherlv_0= 'Link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '<' (otherlv_3= 'target' otherlv_4= '=' ( (lv_target_5_0= RULE_STRING ) ) (otherlv_6= ',' )? )? (otherlv_7= 'Padding-left' otherlv_8= '=' ( (lv_Lpadding_9_0= RULE_INT ) ) (otherlv_10= ',' )? )? (otherlv_11= 'Padding-right' otherlv_12= '=' ( (lv_Rpadding_13_0= RULE_INT ) ) (otherlv_14= ',' )? )? (otherlv_15= 'Padding-top' otherlv_16= '=' ( (lv_Tpadding_17_0= RULE_INT ) ) (otherlv_18= ',' )? )? (otherlv_19= 'Padding-bottom' otherlv_20= '=' ( (lv_Bpadding_21_0= RULE_INT ) ) (otherlv_22= ',' )? )? (otherlv_23= 'Font-colour' otherlv_24= '=' ( (lv_fontColor_25_0= ruleprimaryColour ) ) (otherlv_26= ',' )? )? (otherlv_27= 'Font-size' otherlv_28= '=' ( (lv_fontSize_29_0= RULE_INT ) ) (otherlv_30= ',' )? )? (otherlv_31= 'Location' otherlv_32= '=' ( (lv_location_33_0= rulelocationexpression ) ) (otherlv_34= ',' )? )? otherlv_35= '>' otherlv_36= '=' ( (lv_url_37_0= RULE_STRING ) ) otherlv_38= ';' )
            // InternalPageGeneratorLanguare.g:859:3: otherlv_0= 'Link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '<' (otherlv_3= 'target' otherlv_4= '=' ( (lv_target_5_0= RULE_STRING ) ) (otherlv_6= ',' )? )? (otherlv_7= 'Padding-left' otherlv_8= '=' ( (lv_Lpadding_9_0= RULE_INT ) ) (otherlv_10= ',' )? )? (otherlv_11= 'Padding-right' otherlv_12= '=' ( (lv_Rpadding_13_0= RULE_INT ) ) (otherlv_14= ',' )? )? (otherlv_15= 'Padding-top' otherlv_16= '=' ( (lv_Tpadding_17_0= RULE_INT ) ) (otherlv_18= ',' )? )? (otherlv_19= 'Padding-bottom' otherlv_20= '=' ( (lv_Bpadding_21_0= RULE_INT ) ) (otherlv_22= ',' )? )? (otherlv_23= 'Font-colour' otherlv_24= '=' ( (lv_fontColor_25_0= ruleprimaryColour ) ) (otherlv_26= ',' )? )? (otherlv_27= 'Font-size' otherlv_28= '=' ( (lv_fontSize_29_0= RULE_INT ) ) (otherlv_30= ',' )? )? (otherlv_31= 'Location' otherlv_32= '=' ( (lv_location_33_0= rulelocationexpression ) ) (otherlv_34= ',' )? )? otherlv_35= '>' otherlv_36= '=' ( (lv_url_37_0= RULE_STRING ) ) otherlv_38= ';'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
            		
            // InternalPageGeneratorLanguare.g:863:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPageGeneratorLanguare.g:864:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPageGeneratorLanguare.g:864:4: (lv_name_1_0= RULE_ID )
            // InternalPageGeneratorLanguare.g:865:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLinkAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getLinkAccess().getLessThanSignKeyword_2());
            		
            // InternalPageGeneratorLanguare.g:885:3: (otherlv_3= 'target' otherlv_4= '=' ( (lv_target_5_0= RULE_STRING ) ) (otherlv_6= ',' )? )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==32) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:886:4: otherlv_3= 'target' otherlv_4= '=' ( (lv_target_5_0= RULE_STRING ) ) (otherlv_6= ',' )?
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getLinkAccess().getTargetKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getLinkAccess().getEqualsSignKeyword_3_1());
                    			
                    // InternalPageGeneratorLanguare.g:894:4: ( (lv_target_5_0= RULE_STRING ) )
                    // InternalPageGeneratorLanguare.g:895:5: (lv_target_5_0= RULE_STRING )
                    {
                    // InternalPageGeneratorLanguare.g:895:5: (lv_target_5_0= RULE_STRING )
                    // InternalPageGeneratorLanguare.g:896:6: lv_target_5_0= RULE_STRING
                    {
                    lv_target_5_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

                    						newLeafNode(lv_target_5_0, grammarAccess.getLinkAccess().getTargetSTRINGTerminalRuleCall_3_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLinkRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"target",
                    							lv_target_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalPageGeneratorLanguare.g:912:4: (otherlv_6= ',' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==18) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalPageGeneratorLanguare.g:913:5: otherlv_6= ','
                            {
                            otherlv_6=(Token)match(input,18,FOLLOW_33); 

                            					newLeafNode(otherlv_6, grammarAccess.getLinkAccess().getCommaKeyword_3_3());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalPageGeneratorLanguare.g:919:3: (otherlv_7= 'Padding-left' otherlv_8= '=' ( (lv_Lpadding_9_0= RULE_INT ) ) (otherlv_10= ',' )? )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==26) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:920:4: otherlv_7= 'Padding-left' otherlv_8= '=' ( (lv_Lpadding_9_0= RULE_INT ) ) (otherlv_10= ',' )?
                    {
                    otherlv_7=(Token)match(input,26,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getLinkAccess().getPaddingLeftKeyword_4_0());
                    			
                    otherlv_8=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_8, grammarAccess.getLinkAccess().getEqualsSignKeyword_4_1());
                    			
                    // InternalPageGeneratorLanguare.g:928:4: ( (lv_Lpadding_9_0= RULE_INT ) )
                    // InternalPageGeneratorLanguare.g:929:5: (lv_Lpadding_9_0= RULE_INT )
                    {
                    // InternalPageGeneratorLanguare.g:929:5: (lv_Lpadding_9_0= RULE_INT )
                    // InternalPageGeneratorLanguare.g:930:6: lv_Lpadding_9_0= RULE_INT
                    {
                    lv_Lpadding_9_0=(Token)match(input,RULE_INT,FOLLOW_34); 

                    						newLeafNode(lv_Lpadding_9_0, grammarAccess.getLinkAccess().getLpaddingINTTerminalRuleCall_4_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLinkRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"Lpadding",
                    							lv_Lpadding_9_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalPageGeneratorLanguare.g:946:4: (otherlv_10= ',' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==18) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalPageGeneratorLanguare.g:947:5: otherlv_10= ','
                            {
                            otherlv_10=(Token)match(input,18,FOLLOW_35); 

                            					newLeafNode(otherlv_10, grammarAccess.getLinkAccess().getCommaKeyword_4_3());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalPageGeneratorLanguare.g:953:3: (otherlv_11= 'Padding-right' otherlv_12= '=' ( (lv_Rpadding_13_0= RULE_INT ) ) (otherlv_14= ',' )? )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==27) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:954:4: otherlv_11= 'Padding-right' otherlv_12= '=' ( (lv_Rpadding_13_0= RULE_INT ) ) (otherlv_14= ',' )?
                    {
                    otherlv_11=(Token)match(input,27,FOLLOW_6); 

                    				newLeafNode(otherlv_11, grammarAccess.getLinkAccess().getPaddingRightKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_12, grammarAccess.getLinkAccess().getEqualsSignKeyword_5_1());
                    			
                    // InternalPageGeneratorLanguare.g:962:4: ( (lv_Rpadding_13_0= RULE_INT ) )
                    // InternalPageGeneratorLanguare.g:963:5: (lv_Rpadding_13_0= RULE_INT )
                    {
                    // InternalPageGeneratorLanguare.g:963:5: (lv_Rpadding_13_0= RULE_INT )
                    // InternalPageGeneratorLanguare.g:964:6: lv_Rpadding_13_0= RULE_INT
                    {
                    lv_Rpadding_13_0=(Token)match(input,RULE_INT,FOLLOW_36); 

                    						newLeafNode(lv_Rpadding_13_0, grammarAccess.getLinkAccess().getRpaddingINTTerminalRuleCall_5_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLinkRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"Rpadding",
                    							lv_Rpadding_13_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalPageGeneratorLanguare.g:980:4: (otherlv_14= ',' )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==18) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalPageGeneratorLanguare.g:981:5: otherlv_14= ','
                            {
                            otherlv_14=(Token)match(input,18,FOLLOW_37); 

                            					newLeafNode(otherlv_14, grammarAccess.getLinkAccess().getCommaKeyword_5_3());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalPageGeneratorLanguare.g:987:3: (otherlv_15= 'Padding-top' otherlv_16= '=' ( (lv_Tpadding_17_0= RULE_INT ) ) (otherlv_18= ',' )? )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==28) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:988:4: otherlv_15= 'Padding-top' otherlv_16= '=' ( (lv_Tpadding_17_0= RULE_INT ) ) (otherlv_18= ',' )?
                    {
                    otherlv_15=(Token)match(input,28,FOLLOW_6); 

                    				newLeafNode(otherlv_15, grammarAccess.getLinkAccess().getPaddingTopKeyword_6_0());
                    			
                    otherlv_16=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_16, grammarAccess.getLinkAccess().getEqualsSignKeyword_6_1());
                    			
                    // InternalPageGeneratorLanguare.g:996:4: ( (lv_Tpadding_17_0= RULE_INT ) )
                    // InternalPageGeneratorLanguare.g:997:5: (lv_Tpadding_17_0= RULE_INT )
                    {
                    // InternalPageGeneratorLanguare.g:997:5: (lv_Tpadding_17_0= RULE_INT )
                    // InternalPageGeneratorLanguare.g:998:6: lv_Tpadding_17_0= RULE_INT
                    {
                    lv_Tpadding_17_0=(Token)match(input,RULE_INT,FOLLOW_38); 

                    						newLeafNode(lv_Tpadding_17_0, grammarAccess.getLinkAccess().getTpaddingINTTerminalRuleCall_6_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLinkRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"Tpadding",
                    							lv_Tpadding_17_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalPageGeneratorLanguare.g:1014:4: (otherlv_18= ',' )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==18) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalPageGeneratorLanguare.g:1015:5: otherlv_18= ','
                            {
                            otherlv_18=(Token)match(input,18,FOLLOW_39); 

                            					newLeafNode(otherlv_18, grammarAccess.getLinkAccess().getCommaKeyword_6_3());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalPageGeneratorLanguare.g:1021:3: (otherlv_19= 'Padding-bottom' otherlv_20= '=' ( (lv_Bpadding_21_0= RULE_INT ) ) (otherlv_22= ',' )? )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==29) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:1022:4: otherlv_19= 'Padding-bottom' otherlv_20= '=' ( (lv_Bpadding_21_0= RULE_INT ) ) (otherlv_22= ',' )?
                    {
                    otherlv_19=(Token)match(input,29,FOLLOW_6); 

                    				newLeafNode(otherlv_19, grammarAccess.getLinkAccess().getPaddingBottomKeyword_7_0());
                    			
                    otherlv_20=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_20, grammarAccess.getLinkAccess().getEqualsSignKeyword_7_1());
                    			
                    // InternalPageGeneratorLanguare.g:1030:4: ( (lv_Bpadding_21_0= RULE_INT ) )
                    // InternalPageGeneratorLanguare.g:1031:5: (lv_Bpadding_21_0= RULE_INT )
                    {
                    // InternalPageGeneratorLanguare.g:1031:5: (lv_Bpadding_21_0= RULE_INT )
                    // InternalPageGeneratorLanguare.g:1032:6: lv_Bpadding_21_0= RULE_INT
                    {
                    lv_Bpadding_21_0=(Token)match(input,RULE_INT,FOLLOW_40); 

                    						newLeafNode(lv_Bpadding_21_0, grammarAccess.getLinkAccess().getBpaddingINTTerminalRuleCall_7_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLinkRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"Bpadding",
                    							lv_Bpadding_21_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalPageGeneratorLanguare.g:1048:4: (otherlv_22= ',' )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==18) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalPageGeneratorLanguare.g:1049:5: otherlv_22= ','
                            {
                            otherlv_22=(Token)match(input,18,FOLLOW_41); 

                            					newLeafNode(otherlv_22, grammarAccess.getLinkAccess().getCommaKeyword_7_3());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalPageGeneratorLanguare.g:1055:3: (otherlv_23= 'Font-colour' otherlv_24= '=' ( (lv_fontColor_25_0= ruleprimaryColour ) ) (otherlv_26= ',' )? )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==24) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:1056:4: otherlv_23= 'Font-colour' otherlv_24= '=' ( (lv_fontColor_25_0= ruleprimaryColour ) ) (otherlv_26= ',' )?
                    {
                    otherlv_23=(Token)match(input,24,FOLLOW_6); 

                    				newLeafNode(otherlv_23, grammarAccess.getLinkAccess().getFontColourKeyword_8_0());
                    			
                    otherlv_24=(Token)match(input,15,FOLLOW_18); 

                    				newLeafNode(otherlv_24, grammarAccess.getLinkAccess().getEqualsSignKeyword_8_1());
                    			
                    // InternalPageGeneratorLanguare.g:1064:4: ( (lv_fontColor_25_0= ruleprimaryColour ) )
                    // InternalPageGeneratorLanguare.g:1065:5: (lv_fontColor_25_0= ruleprimaryColour )
                    {
                    // InternalPageGeneratorLanguare.g:1065:5: (lv_fontColor_25_0= ruleprimaryColour )
                    // InternalPageGeneratorLanguare.g:1066:6: lv_fontColor_25_0= ruleprimaryColour
                    {

                    						newCompositeNode(grammarAccess.getLinkAccess().getFontColorPrimaryColourParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_fontColor_25_0=ruleprimaryColour();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLinkRule());
                    						}
                    						set(
                    							current,
                    							"fontColor",
                    							lv_fontColor_25_0,
                    							"uk.ac.kcl.mdd.cw2.pageGenerator.PageGeneratorLanguare.primaryColour");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPageGeneratorLanguare.g:1083:4: (otherlv_26= ',' )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==18) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalPageGeneratorLanguare.g:1084:5: otherlv_26= ','
                            {
                            otherlv_26=(Token)match(input,18,FOLLOW_43); 

                            					newLeafNode(otherlv_26, grammarAccess.getLinkAccess().getCommaKeyword_8_3());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalPageGeneratorLanguare.g:1090:3: (otherlv_27= 'Font-size' otherlv_28= '=' ( (lv_fontSize_29_0= RULE_INT ) ) (otherlv_30= ',' )? )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==33) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:1091:4: otherlv_27= 'Font-size' otherlv_28= '=' ( (lv_fontSize_29_0= RULE_INT ) ) (otherlv_30= ',' )?
                    {
                    otherlv_27=(Token)match(input,33,FOLLOW_6); 

                    				newLeafNode(otherlv_27, grammarAccess.getLinkAccess().getFontSizeKeyword_9_0());
                    			
                    otherlv_28=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_28, grammarAccess.getLinkAccess().getEqualsSignKeyword_9_1());
                    			
                    // InternalPageGeneratorLanguare.g:1099:4: ( (lv_fontSize_29_0= RULE_INT ) )
                    // InternalPageGeneratorLanguare.g:1100:5: (lv_fontSize_29_0= RULE_INT )
                    {
                    // InternalPageGeneratorLanguare.g:1100:5: (lv_fontSize_29_0= RULE_INT )
                    // InternalPageGeneratorLanguare.g:1101:6: lv_fontSize_29_0= RULE_INT
                    {
                    lv_fontSize_29_0=(Token)match(input,RULE_INT,FOLLOW_44); 

                    						newLeafNode(lv_fontSize_29_0, grammarAccess.getLinkAccess().getFontSizeINTTerminalRuleCall_9_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLinkRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"fontSize",
                    							lv_fontSize_29_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalPageGeneratorLanguare.g:1117:4: (otherlv_30= ',' )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==18) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalPageGeneratorLanguare.g:1118:5: otherlv_30= ','
                            {
                            otherlv_30=(Token)match(input,18,FOLLOW_45); 

                            					newLeafNode(otherlv_30, grammarAccess.getLinkAccess().getCommaKeyword_9_3());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalPageGeneratorLanguare.g:1124:3: (otherlv_31= 'Location' otherlv_32= '=' ( (lv_location_33_0= rulelocationexpression ) ) (otherlv_34= ',' )? )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==25) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:1125:4: otherlv_31= 'Location' otherlv_32= '=' ( (lv_location_33_0= rulelocationexpression ) ) (otherlv_34= ',' )?
                    {
                    otherlv_31=(Token)match(input,25,FOLLOW_6); 

                    				newLeafNode(otherlv_31, grammarAccess.getLinkAccess().getLocationKeyword_10_0());
                    			
                    otherlv_32=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_32, grammarAccess.getLinkAccess().getEqualsSignKeyword_10_1());
                    			
                    // InternalPageGeneratorLanguare.g:1133:4: ( (lv_location_33_0= rulelocationexpression ) )
                    // InternalPageGeneratorLanguare.g:1134:5: (lv_location_33_0= rulelocationexpression )
                    {
                    // InternalPageGeneratorLanguare.g:1134:5: (lv_location_33_0= rulelocationexpression )
                    // InternalPageGeneratorLanguare.g:1135:6: lv_location_33_0= rulelocationexpression
                    {

                    						newCompositeNode(grammarAccess.getLinkAccess().getLocationLocationexpressionParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_location_33_0=rulelocationexpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLinkRule());
                    						}
                    						set(
                    							current,
                    							"location",
                    							lv_location_33_0,
                    							"uk.ac.kcl.mdd.cw2.pageGenerator.PageGeneratorLanguare.locationexpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPageGeneratorLanguare.g:1152:4: (otherlv_34= ',' )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==18) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalPageGeneratorLanguare.g:1153:5: otherlv_34= ','
                            {
                            otherlv_34=(Token)match(input,18,FOLLOW_30); 

                            					newLeafNode(otherlv_34, grammarAccess.getLinkAccess().getCommaKeyword_10_3());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_35=(Token)match(input,30,FOLLOW_6); 

            			newLeafNode(otherlv_35, grammarAccess.getLinkAccess().getGreaterThanSignKeyword_11());
            		
            otherlv_36=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_36, grammarAccess.getLinkAccess().getEqualsSignKeyword_12());
            		
            // InternalPageGeneratorLanguare.g:1167:3: ( (lv_url_37_0= RULE_STRING ) )
            // InternalPageGeneratorLanguare.g:1168:4: (lv_url_37_0= RULE_STRING )
            {
            // InternalPageGeneratorLanguare.g:1168:4: (lv_url_37_0= RULE_STRING )
            // InternalPageGeneratorLanguare.g:1169:5: lv_url_37_0= RULE_STRING
            {
            lv_url_37_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_url_37_0, grammarAccess.getLinkAccess().getUrlSTRINGTerminalRuleCall_13_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"url",
            						lv_url_37_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_38=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_38, grammarAccess.getLinkAccess().getSemicolonKeyword_14());
            		

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
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRulePicture"
    // InternalPageGeneratorLanguare.g:1193:1: entryRulePicture returns [EObject current=null] : iv_rulePicture= rulePicture EOF ;
    public final EObject entryRulePicture() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePicture = null;


        try {
            // InternalPageGeneratorLanguare.g:1193:48: (iv_rulePicture= rulePicture EOF )
            // InternalPageGeneratorLanguare.g:1194:2: iv_rulePicture= rulePicture EOF
            {
             newCompositeNode(grammarAccess.getPictureRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePicture=rulePicture();

            state._fsp--;

             current =iv_rulePicture; 
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
    // $ANTLR end "entryRulePicture"


    // $ANTLR start "rulePicture"
    // InternalPageGeneratorLanguare.g:1200:1: rulePicture returns [EObject current=null] : (otherlv_0= 'Picture' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '<' (otherlv_3= 'size' otherlv_4= '=' ( (lv_size_5_0= ruleprimarySize ) ) (otherlv_6= ',' )? )? (otherlv_7= 'alternative-text' otherlv_8= '=' ( (lv_alt_9_0= RULE_STRING ) ) (otherlv_10= ',' )? )? (otherlv_11= 'Location' otherlv_12= '=' ( (lv_location_13_0= rulelocationexpression ) ) (otherlv_14= ',' )? )? (otherlv_15= 'Padding-left' otherlv_16= '=' ( (lv_Lpadding_17_0= RULE_INT ) ) (otherlv_18= ',' )? )? (otherlv_19= 'Padding-right' otherlv_20= '=' ( (lv_Rpadding_21_0= RULE_INT ) ) (otherlv_22= ',' )? )? (otherlv_23= 'Padding-top' otherlv_24= '=' ( (lv_Tpadding_25_0= RULE_INT ) ) (otherlv_26= ',' )? )? (otherlv_27= 'Padding-bottom' otherlv_28= '=' ( (lv_Bpadding_29_0= RULE_INT ) ) (otherlv_30= ',' )? )? otherlv_31= '>' otherlv_32= '=' ( (lv_picUrl_33_0= RULE_STRING ) ) (otherlv_34= ',' )? otherlv_35= ';' ) ;
    public final EObject rulePicture() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_alt_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_Lpadding_17_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token lv_Rpadding_21_0=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token lv_Tpadding_25_0=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token lv_Bpadding_29_0=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token lv_picUrl_33_0=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        EObject lv_size_5_0 = null;

        EObject lv_location_13_0 = null;



        	enterRule();

        try {
            // InternalPageGeneratorLanguare.g:1206:2: ( (otherlv_0= 'Picture' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '<' (otherlv_3= 'size' otherlv_4= '=' ( (lv_size_5_0= ruleprimarySize ) ) (otherlv_6= ',' )? )? (otherlv_7= 'alternative-text' otherlv_8= '=' ( (lv_alt_9_0= RULE_STRING ) ) (otherlv_10= ',' )? )? (otherlv_11= 'Location' otherlv_12= '=' ( (lv_location_13_0= rulelocationexpression ) ) (otherlv_14= ',' )? )? (otherlv_15= 'Padding-left' otherlv_16= '=' ( (lv_Lpadding_17_0= RULE_INT ) ) (otherlv_18= ',' )? )? (otherlv_19= 'Padding-right' otherlv_20= '=' ( (lv_Rpadding_21_0= RULE_INT ) ) (otherlv_22= ',' )? )? (otherlv_23= 'Padding-top' otherlv_24= '=' ( (lv_Tpadding_25_0= RULE_INT ) ) (otherlv_26= ',' )? )? (otherlv_27= 'Padding-bottom' otherlv_28= '=' ( (lv_Bpadding_29_0= RULE_INT ) ) (otherlv_30= ',' )? )? otherlv_31= '>' otherlv_32= '=' ( (lv_picUrl_33_0= RULE_STRING ) ) (otherlv_34= ',' )? otherlv_35= ';' ) )
            // InternalPageGeneratorLanguare.g:1207:2: (otherlv_0= 'Picture' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '<' (otherlv_3= 'size' otherlv_4= '=' ( (lv_size_5_0= ruleprimarySize ) ) (otherlv_6= ',' )? )? (otherlv_7= 'alternative-text' otherlv_8= '=' ( (lv_alt_9_0= RULE_STRING ) ) (otherlv_10= ',' )? )? (otherlv_11= 'Location' otherlv_12= '=' ( (lv_location_13_0= rulelocationexpression ) ) (otherlv_14= ',' )? )? (otherlv_15= 'Padding-left' otherlv_16= '=' ( (lv_Lpadding_17_0= RULE_INT ) ) (otherlv_18= ',' )? )? (otherlv_19= 'Padding-right' otherlv_20= '=' ( (lv_Rpadding_21_0= RULE_INT ) ) (otherlv_22= ',' )? )? (otherlv_23= 'Padding-top' otherlv_24= '=' ( (lv_Tpadding_25_0= RULE_INT ) ) (otherlv_26= ',' )? )? (otherlv_27= 'Padding-bottom' otherlv_28= '=' ( (lv_Bpadding_29_0= RULE_INT ) ) (otherlv_30= ',' )? )? otherlv_31= '>' otherlv_32= '=' ( (lv_picUrl_33_0= RULE_STRING ) ) (otherlv_34= ',' )? otherlv_35= ';' )
            {
            // InternalPageGeneratorLanguare.g:1207:2: (otherlv_0= 'Picture' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '<' (otherlv_3= 'size' otherlv_4= '=' ( (lv_size_5_0= ruleprimarySize ) ) (otherlv_6= ',' )? )? (otherlv_7= 'alternative-text' otherlv_8= '=' ( (lv_alt_9_0= RULE_STRING ) ) (otherlv_10= ',' )? )? (otherlv_11= 'Location' otherlv_12= '=' ( (lv_location_13_0= rulelocationexpression ) ) (otherlv_14= ',' )? )? (otherlv_15= 'Padding-left' otherlv_16= '=' ( (lv_Lpadding_17_0= RULE_INT ) ) (otherlv_18= ',' )? )? (otherlv_19= 'Padding-right' otherlv_20= '=' ( (lv_Rpadding_21_0= RULE_INT ) ) (otherlv_22= ',' )? )? (otherlv_23= 'Padding-top' otherlv_24= '=' ( (lv_Tpadding_25_0= RULE_INT ) ) (otherlv_26= ',' )? )? (otherlv_27= 'Padding-bottom' otherlv_28= '=' ( (lv_Bpadding_29_0= RULE_INT ) ) (otherlv_30= ',' )? )? otherlv_31= '>' otherlv_32= '=' ( (lv_picUrl_33_0= RULE_STRING ) ) (otherlv_34= ',' )? otherlv_35= ';' )
            // InternalPageGeneratorLanguare.g:1208:3: otherlv_0= 'Picture' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '<' (otherlv_3= 'size' otherlv_4= '=' ( (lv_size_5_0= ruleprimarySize ) ) (otherlv_6= ',' )? )? (otherlv_7= 'alternative-text' otherlv_8= '=' ( (lv_alt_9_0= RULE_STRING ) ) (otherlv_10= ',' )? )? (otherlv_11= 'Location' otherlv_12= '=' ( (lv_location_13_0= rulelocationexpression ) ) (otherlv_14= ',' )? )? (otherlv_15= 'Padding-left' otherlv_16= '=' ( (lv_Lpadding_17_0= RULE_INT ) ) (otherlv_18= ',' )? )? (otherlv_19= 'Padding-right' otherlv_20= '=' ( (lv_Rpadding_21_0= RULE_INT ) ) (otherlv_22= ',' )? )? (otherlv_23= 'Padding-top' otherlv_24= '=' ( (lv_Tpadding_25_0= RULE_INT ) ) (otherlv_26= ',' )? )? (otherlv_27= 'Padding-bottom' otherlv_28= '=' ( (lv_Bpadding_29_0= RULE_INT ) ) (otherlv_30= ',' )? )? otherlv_31= '>' otherlv_32= '=' ( (lv_picUrl_33_0= RULE_STRING ) ) (otherlv_34= ',' )? otherlv_35= ';'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getPictureAccess().getPictureKeyword_0());
            		
            // InternalPageGeneratorLanguare.g:1212:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPageGeneratorLanguare.g:1213:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPageGeneratorLanguare.g:1213:4: (lv_name_1_0= RULE_ID )
            // InternalPageGeneratorLanguare.g:1214:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPictureAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPictureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_46); 

            			newLeafNode(otherlv_2, grammarAccess.getPictureAccess().getLessThanSignKeyword_2());
            		
            // InternalPageGeneratorLanguare.g:1234:3: (otherlv_3= 'size' otherlv_4= '=' ( (lv_size_5_0= ruleprimarySize ) ) (otherlv_6= ',' )? )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==35) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:1235:4: otherlv_3= 'size' otherlv_4= '=' ( (lv_size_5_0= ruleprimarySize ) ) (otherlv_6= ',' )?
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getPictureAccess().getSizeKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,15,FOLLOW_47); 

                    				newLeafNode(otherlv_4, grammarAccess.getPictureAccess().getEqualsSignKeyword_3_1());
                    			
                    // InternalPageGeneratorLanguare.g:1243:4: ( (lv_size_5_0= ruleprimarySize ) )
                    // InternalPageGeneratorLanguare.g:1244:5: (lv_size_5_0= ruleprimarySize )
                    {
                    // InternalPageGeneratorLanguare.g:1244:5: (lv_size_5_0= ruleprimarySize )
                    // InternalPageGeneratorLanguare.g:1245:6: lv_size_5_0= ruleprimarySize
                    {

                    						newCompositeNode(grammarAccess.getPictureAccess().getSizePrimarySizeParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_48);
                    lv_size_5_0=ruleprimarySize();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPictureRule());
                    						}
                    						set(
                    							current,
                    							"size",
                    							lv_size_5_0,
                    							"uk.ac.kcl.mdd.cw2.pageGenerator.PageGeneratorLanguare.primarySize");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPageGeneratorLanguare.g:1262:4: (otherlv_6= ',' )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==18) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalPageGeneratorLanguare.g:1263:5: otherlv_6= ','
                            {
                            otherlv_6=(Token)match(input,18,FOLLOW_49); 

                            					newLeafNode(otherlv_6, grammarAccess.getPictureAccess().getCommaKeyword_3_3());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalPageGeneratorLanguare.g:1269:3: (otherlv_7= 'alternative-text' otherlv_8= '=' ( (lv_alt_9_0= RULE_STRING ) ) (otherlv_10= ',' )? )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==36) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:1270:4: otherlv_7= 'alternative-text' otherlv_8= '=' ( (lv_alt_9_0= RULE_STRING ) ) (otherlv_10= ',' )?
                    {
                    otherlv_7=(Token)match(input,36,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getPictureAccess().getAlternativeTextKeyword_4_0());
                    			
                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getPictureAccess().getEqualsSignKeyword_4_1());
                    			
                    // InternalPageGeneratorLanguare.g:1278:4: ( (lv_alt_9_0= RULE_STRING ) )
                    // InternalPageGeneratorLanguare.g:1279:5: (lv_alt_9_0= RULE_STRING )
                    {
                    // InternalPageGeneratorLanguare.g:1279:5: (lv_alt_9_0= RULE_STRING )
                    // InternalPageGeneratorLanguare.g:1280:6: lv_alt_9_0= RULE_STRING
                    {
                    lv_alt_9_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

                    						newLeafNode(lv_alt_9_0, grammarAccess.getPictureAccess().getAltSTRINGTerminalRuleCall_4_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPictureRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"alt",
                    							lv_alt_9_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalPageGeneratorLanguare.g:1296:4: (otherlv_10= ',' )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==18) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalPageGeneratorLanguare.g:1297:5: otherlv_10= ','
                            {
                            otherlv_10=(Token)match(input,18,FOLLOW_20); 

                            					newLeafNode(otherlv_10, grammarAccess.getPictureAccess().getCommaKeyword_4_3());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalPageGeneratorLanguare.g:1303:3: (otherlv_11= 'Location' otherlv_12= '=' ( (lv_location_13_0= rulelocationexpression ) ) (otherlv_14= ',' )? )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==25) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:1304:4: otherlv_11= 'Location' otherlv_12= '=' ( (lv_location_13_0= rulelocationexpression ) ) (otherlv_14= ',' )?
                    {
                    otherlv_11=(Token)match(input,25,FOLLOW_6); 

                    				newLeafNode(otherlv_11, grammarAccess.getPictureAccess().getLocationKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_12, grammarAccess.getPictureAccess().getEqualsSignKeyword_5_1());
                    			
                    // InternalPageGeneratorLanguare.g:1312:4: ( (lv_location_13_0= rulelocationexpression ) )
                    // InternalPageGeneratorLanguare.g:1313:5: (lv_location_13_0= rulelocationexpression )
                    {
                    // InternalPageGeneratorLanguare.g:1313:5: (lv_location_13_0= rulelocationexpression )
                    // InternalPageGeneratorLanguare.g:1314:6: lv_location_13_0= rulelocationexpression
                    {

                    						newCompositeNode(grammarAccess.getPictureAccess().getLocationLocationexpressionParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_location_13_0=rulelocationexpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPictureRule());
                    						}
                    						set(
                    							current,
                    							"location",
                    							lv_location_13_0,
                    							"uk.ac.kcl.mdd.cw2.pageGenerator.PageGeneratorLanguare.locationexpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPageGeneratorLanguare.g:1331:4: (otherlv_14= ',' )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==18) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // InternalPageGeneratorLanguare.g:1332:5: otherlv_14= ','
                            {
                            otherlv_14=(Token)match(input,18,FOLLOW_22); 

                            					newLeafNode(otherlv_14, grammarAccess.getPictureAccess().getCommaKeyword_5_3());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalPageGeneratorLanguare.g:1338:3: (otherlv_15= 'Padding-left' otherlv_16= '=' ( (lv_Lpadding_17_0= RULE_INT ) ) (otherlv_18= ',' )? )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==26) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:1339:4: otherlv_15= 'Padding-left' otherlv_16= '=' ( (lv_Lpadding_17_0= RULE_INT ) ) (otherlv_18= ',' )?
                    {
                    otherlv_15=(Token)match(input,26,FOLLOW_6); 

                    				newLeafNode(otherlv_15, grammarAccess.getPictureAccess().getPaddingLeftKeyword_6_0());
                    			
                    otherlv_16=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_16, grammarAccess.getPictureAccess().getEqualsSignKeyword_6_1());
                    			
                    // InternalPageGeneratorLanguare.g:1347:4: ( (lv_Lpadding_17_0= RULE_INT ) )
                    // InternalPageGeneratorLanguare.g:1348:5: (lv_Lpadding_17_0= RULE_INT )
                    {
                    // InternalPageGeneratorLanguare.g:1348:5: (lv_Lpadding_17_0= RULE_INT )
                    // InternalPageGeneratorLanguare.g:1349:6: lv_Lpadding_17_0= RULE_INT
                    {
                    lv_Lpadding_17_0=(Token)match(input,RULE_INT,FOLLOW_23); 

                    						newLeafNode(lv_Lpadding_17_0, grammarAccess.getPictureAccess().getLpaddingINTTerminalRuleCall_6_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPictureRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"Lpadding",
                    							lv_Lpadding_17_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalPageGeneratorLanguare.g:1365:4: (otherlv_18= ',' )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==18) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // InternalPageGeneratorLanguare.g:1366:5: otherlv_18= ','
                            {
                            otherlv_18=(Token)match(input,18,FOLLOW_24); 

                            					newLeafNode(otherlv_18, grammarAccess.getPictureAccess().getCommaKeyword_6_3());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalPageGeneratorLanguare.g:1372:3: (otherlv_19= 'Padding-right' otherlv_20= '=' ( (lv_Rpadding_21_0= RULE_INT ) ) (otherlv_22= ',' )? )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==27) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:1373:4: otherlv_19= 'Padding-right' otherlv_20= '=' ( (lv_Rpadding_21_0= RULE_INT ) ) (otherlv_22= ',' )?
                    {
                    otherlv_19=(Token)match(input,27,FOLLOW_6); 

                    				newLeafNode(otherlv_19, grammarAccess.getPictureAccess().getPaddingRightKeyword_7_0());
                    			
                    otherlv_20=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_20, grammarAccess.getPictureAccess().getEqualsSignKeyword_7_1());
                    			
                    // InternalPageGeneratorLanguare.g:1381:4: ( (lv_Rpadding_21_0= RULE_INT ) )
                    // InternalPageGeneratorLanguare.g:1382:5: (lv_Rpadding_21_0= RULE_INT )
                    {
                    // InternalPageGeneratorLanguare.g:1382:5: (lv_Rpadding_21_0= RULE_INT )
                    // InternalPageGeneratorLanguare.g:1383:6: lv_Rpadding_21_0= RULE_INT
                    {
                    lv_Rpadding_21_0=(Token)match(input,RULE_INT,FOLLOW_25); 

                    						newLeafNode(lv_Rpadding_21_0, grammarAccess.getPictureAccess().getRpaddingINTTerminalRuleCall_7_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPictureRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"Rpadding",
                    							lv_Rpadding_21_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalPageGeneratorLanguare.g:1399:4: (otherlv_22= ',' )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==18) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalPageGeneratorLanguare.g:1400:5: otherlv_22= ','
                            {
                            otherlv_22=(Token)match(input,18,FOLLOW_26); 

                            					newLeafNode(otherlv_22, grammarAccess.getPictureAccess().getCommaKeyword_7_3());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalPageGeneratorLanguare.g:1406:3: (otherlv_23= 'Padding-top' otherlv_24= '=' ( (lv_Tpadding_25_0= RULE_INT ) ) (otherlv_26= ',' )? )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==28) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:1407:4: otherlv_23= 'Padding-top' otherlv_24= '=' ( (lv_Tpadding_25_0= RULE_INT ) ) (otherlv_26= ',' )?
                    {
                    otherlv_23=(Token)match(input,28,FOLLOW_6); 

                    				newLeafNode(otherlv_23, grammarAccess.getPictureAccess().getPaddingTopKeyword_8_0());
                    			
                    otherlv_24=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_24, grammarAccess.getPictureAccess().getEqualsSignKeyword_8_1());
                    			
                    // InternalPageGeneratorLanguare.g:1415:4: ( (lv_Tpadding_25_0= RULE_INT ) )
                    // InternalPageGeneratorLanguare.g:1416:5: (lv_Tpadding_25_0= RULE_INT )
                    {
                    // InternalPageGeneratorLanguare.g:1416:5: (lv_Tpadding_25_0= RULE_INT )
                    // InternalPageGeneratorLanguare.g:1417:6: lv_Tpadding_25_0= RULE_INT
                    {
                    lv_Tpadding_25_0=(Token)match(input,RULE_INT,FOLLOW_27); 

                    						newLeafNode(lv_Tpadding_25_0, grammarAccess.getPictureAccess().getTpaddingINTTerminalRuleCall_8_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPictureRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"Tpadding",
                    							lv_Tpadding_25_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalPageGeneratorLanguare.g:1433:4: (otherlv_26= ',' )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==18) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalPageGeneratorLanguare.g:1434:5: otherlv_26= ','
                            {
                            otherlv_26=(Token)match(input,18,FOLLOW_28); 

                            					newLeafNode(otherlv_26, grammarAccess.getPictureAccess().getCommaKeyword_8_3());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalPageGeneratorLanguare.g:1440:3: (otherlv_27= 'Padding-bottom' otherlv_28= '=' ( (lv_Bpadding_29_0= RULE_INT ) ) (otherlv_30= ',' )? )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==29) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:1441:4: otherlv_27= 'Padding-bottom' otherlv_28= '=' ( (lv_Bpadding_29_0= RULE_INT ) ) (otherlv_30= ',' )?
                    {
                    otherlv_27=(Token)match(input,29,FOLLOW_6); 

                    				newLeafNode(otherlv_27, grammarAccess.getPictureAccess().getPaddingBottomKeyword_9_0());
                    			
                    otherlv_28=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_28, grammarAccess.getPictureAccess().getEqualsSignKeyword_9_1());
                    			
                    // InternalPageGeneratorLanguare.g:1449:4: ( (lv_Bpadding_29_0= RULE_INT ) )
                    // InternalPageGeneratorLanguare.g:1450:5: (lv_Bpadding_29_0= RULE_INT )
                    {
                    // InternalPageGeneratorLanguare.g:1450:5: (lv_Bpadding_29_0= RULE_INT )
                    // InternalPageGeneratorLanguare.g:1451:6: lv_Bpadding_29_0= RULE_INT
                    {
                    lv_Bpadding_29_0=(Token)match(input,RULE_INT,FOLLOW_29); 

                    						newLeafNode(lv_Bpadding_29_0, grammarAccess.getPictureAccess().getBpaddingINTTerminalRuleCall_9_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPictureRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"Bpadding",
                    							lv_Bpadding_29_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalPageGeneratorLanguare.g:1467:4: (otherlv_30= ',' )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==18) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // InternalPageGeneratorLanguare.g:1468:5: otherlv_30= ','
                            {
                            otherlv_30=(Token)match(input,18,FOLLOW_30); 

                            					newLeafNode(otherlv_30, grammarAccess.getPictureAccess().getCommaKeyword_9_3());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_31=(Token)match(input,30,FOLLOW_6); 

            			newLeafNode(otherlv_31, grammarAccess.getPictureAccess().getGreaterThanSignKeyword_10());
            		
            otherlv_32=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_32, grammarAccess.getPictureAccess().getEqualsSignKeyword_11());
            		
            // InternalPageGeneratorLanguare.g:1482:3: ( (lv_picUrl_33_0= RULE_STRING ) )
            // InternalPageGeneratorLanguare.g:1483:4: (lv_picUrl_33_0= RULE_STRING )
            {
            // InternalPageGeneratorLanguare.g:1483:4: (lv_picUrl_33_0= RULE_STRING )
            // InternalPageGeneratorLanguare.g:1484:5: lv_picUrl_33_0= RULE_STRING
            {
            lv_picUrl_33_0=(Token)match(input,RULE_STRING,FOLLOW_50); 

            					newLeafNode(lv_picUrl_33_0, grammarAccess.getPictureAccess().getPicUrlSTRINGTerminalRuleCall_12_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPictureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"picUrl",
            						lv_picUrl_33_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalPageGeneratorLanguare.g:1500:3: (otherlv_34= ',' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==18) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:1501:4: otherlv_34= ','
                    {
                    otherlv_34=(Token)match(input,18,FOLLOW_8); 

                    				newLeafNode(otherlv_34, grammarAccess.getPictureAccess().getCommaKeyword_13());
                    			

                    }
                    break;

            }

            otherlv_35=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_35, grammarAccess.getPictureAccess().getSemicolonKeyword_14());
            		

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
    // $ANTLR end "rulePicture"


    // $ANTLR start "entryRuleText"
    // InternalPageGeneratorLanguare.g:1514:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // InternalPageGeneratorLanguare.g:1514:45: (iv_ruleText= ruleText EOF )
            // InternalPageGeneratorLanguare.g:1515:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText; 
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
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // InternalPageGeneratorLanguare.g:1521:1: ruleText returns [EObject current=null] : (otherlv_0= 'Text' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '<' (otherlv_3= 'Font-colour' otherlv_4= '=' ( (lv_fontColor_5_0= ruleprimaryColour ) ) (otherlv_6= ',' )? )? (otherlv_7= 'Font-size' otherlv_8= '=' ( (lv_fontSize_9_0= RULE_INT ) ) (otherlv_10= ',' )? )? (otherlv_11= 'Location' otherlv_12= '=' ( (lv_location_13_0= rulelocationexpression ) ) (otherlv_14= ',' )? )? (otherlv_15= 'Padding-left' otherlv_16= '=' ( (lv_Lpadding_17_0= RULE_INT ) ) (otherlv_18= ',' )? )? (otherlv_19= 'Padding-right' otherlv_20= '=' ( (lv_Rpadding_21_0= RULE_INT ) ) (otherlv_22= ',' )? )? (otherlv_23= 'Padding-top' otherlv_24= '=' ( (lv_Tpadding_25_0= RULE_INT ) ) (otherlv_26= ',' )? )? (otherlv_27= 'Padding-bottom' otherlv_28= '=' ( (lv_Bpadding_29_0= RULE_INT ) ) (otherlv_30= ',' )? )? otherlv_31= '>' otherlv_32= '=' ( (lv_content_33_0= ruleContent ) ) otherlv_34= ';' ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_fontSize_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_Lpadding_17_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token lv_Rpadding_21_0=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token lv_Tpadding_25_0=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token lv_Bpadding_29_0=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        EObject lv_fontColor_5_0 = null;

        EObject lv_location_13_0 = null;

        EObject lv_content_33_0 = null;



        	enterRule();

        try {
            // InternalPageGeneratorLanguare.g:1527:2: ( (otherlv_0= 'Text' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '<' (otherlv_3= 'Font-colour' otherlv_4= '=' ( (lv_fontColor_5_0= ruleprimaryColour ) ) (otherlv_6= ',' )? )? (otherlv_7= 'Font-size' otherlv_8= '=' ( (lv_fontSize_9_0= RULE_INT ) ) (otherlv_10= ',' )? )? (otherlv_11= 'Location' otherlv_12= '=' ( (lv_location_13_0= rulelocationexpression ) ) (otherlv_14= ',' )? )? (otherlv_15= 'Padding-left' otherlv_16= '=' ( (lv_Lpadding_17_0= RULE_INT ) ) (otherlv_18= ',' )? )? (otherlv_19= 'Padding-right' otherlv_20= '=' ( (lv_Rpadding_21_0= RULE_INT ) ) (otherlv_22= ',' )? )? (otherlv_23= 'Padding-top' otherlv_24= '=' ( (lv_Tpadding_25_0= RULE_INT ) ) (otherlv_26= ',' )? )? (otherlv_27= 'Padding-bottom' otherlv_28= '=' ( (lv_Bpadding_29_0= RULE_INT ) ) (otherlv_30= ',' )? )? otherlv_31= '>' otherlv_32= '=' ( (lv_content_33_0= ruleContent ) ) otherlv_34= ';' ) )
            // InternalPageGeneratorLanguare.g:1528:2: (otherlv_0= 'Text' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '<' (otherlv_3= 'Font-colour' otherlv_4= '=' ( (lv_fontColor_5_0= ruleprimaryColour ) ) (otherlv_6= ',' )? )? (otherlv_7= 'Font-size' otherlv_8= '=' ( (lv_fontSize_9_0= RULE_INT ) ) (otherlv_10= ',' )? )? (otherlv_11= 'Location' otherlv_12= '=' ( (lv_location_13_0= rulelocationexpression ) ) (otherlv_14= ',' )? )? (otherlv_15= 'Padding-left' otherlv_16= '=' ( (lv_Lpadding_17_0= RULE_INT ) ) (otherlv_18= ',' )? )? (otherlv_19= 'Padding-right' otherlv_20= '=' ( (lv_Rpadding_21_0= RULE_INT ) ) (otherlv_22= ',' )? )? (otherlv_23= 'Padding-top' otherlv_24= '=' ( (lv_Tpadding_25_0= RULE_INT ) ) (otherlv_26= ',' )? )? (otherlv_27= 'Padding-bottom' otherlv_28= '=' ( (lv_Bpadding_29_0= RULE_INT ) ) (otherlv_30= ',' )? )? otherlv_31= '>' otherlv_32= '=' ( (lv_content_33_0= ruleContent ) ) otherlv_34= ';' )
            {
            // InternalPageGeneratorLanguare.g:1528:2: (otherlv_0= 'Text' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '<' (otherlv_3= 'Font-colour' otherlv_4= '=' ( (lv_fontColor_5_0= ruleprimaryColour ) ) (otherlv_6= ',' )? )? (otherlv_7= 'Font-size' otherlv_8= '=' ( (lv_fontSize_9_0= RULE_INT ) ) (otherlv_10= ',' )? )? (otherlv_11= 'Location' otherlv_12= '=' ( (lv_location_13_0= rulelocationexpression ) ) (otherlv_14= ',' )? )? (otherlv_15= 'Padding-left' otherlv_16= '=' ( (lv_Lpadding_17_0= RULE_INT ) ) (otherlv_18= ',' )? )? (otherlv_19= 'Padding-right' otherlv_20= '=' ( (lv_Rpadding_21_0= RULE_INT ) ) (otherlv_22= ',' )? )? (otherlv_23= 'Padding-top' otherlv_24= '=' ( (lv_Tpadding_25_0= RULE_INT ) ) (otherlv_26= ',' )? )? (otherlv_27= 'Padding-bottom' otherlv_28= '=' ( (lv_Bpadding_29_0= RULE_INT ) ) (otherlv_30= ',' )? )? otherlv_31= '>' otherlv_32= '=' ( (lv_content_33_0= ruleContent ) ) otherlv_34= ';' )
            // InternalPageGeneratorLanguare.g:1529:3: otherlv_0= 'Text' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '<' (otherlv_3= 'Font-colour' otherlv_4= '=' ( (lv_fontColor_5_0= ruleprimaryColour ) ) (otherlv_6= ',' )? )? (otherlv_7= 'Font-size' otherlv_8= '=' ( (lv_fontSize_9_0= RULE_INT ) ) (otherlv_10= ',' )? )? (otherlv_11= 'Location' otherlv_12= '=' ( (lv_location_13_0= rulelocationexpression ) ) (otherlv_14= ',' )? )? (otherlv_15= 'Padding-left' otherlv_16= '=' ( (lv_Lpadding_17_0= RULE_INT ) ) (otherlv_18= ',' )? )? (otherlv_19= 'Padding-right' otherlv_20= '=' ( (lv_Rpadding_21_0= RULE_INT ) ) (otherlv_22= ',' )? )? (otherlv_23= 'Padding-top' otherlv_24= '=' ( (lv_Tpadding_25_0= RULE_INT ) ) (otherlv_26= ',' )? )? (otherlv_27= 'Padding-bottom' otherlv_28= '=' ( (lv_Bpadding_29_0= RULE_INT ) ) (otherlv_30= ',' )? )? otherlv_31= '>' otherlv_32= '=' ( (lv_content_33_0= ruleContent ) ) otherlv_34= ';'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getTextAccess().getTextKeyword_0());
            		
            // InternalPageGeneratorLanguare.g:1533:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPageGeneratorLanguare.g:1534:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPageGeneratorLanguare.g:1534:4: (lv_name_1_0= RULE_ID )
            // InternalPageGeneratorLanguare.g:1535:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTextAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getTextAccess().getLessThanSignKeyword_2());
            		
            // InternalPageGeneratorLanguare.g:1555:3: (otherlv_3= 'Font-colour' otherlv_4= '=' ( (lv_fontColor_5_0= ruleprimaryColour ) ) (otherlv_6= ',' )? )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==24) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:1556:4: otherlv_3= 'Font-colour' otherlv_4= '=' ( (lv_fontColor_5_0= ruleprimaryColour ) ) (otherlv_6= ',' )?
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getTextAccess().getFontColourKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,15,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getTextAccess().getEqualsSignKeyword_3_1());
                    			
                    // InternalPageGeneratorLanguare.g:1564:4: ( (lv_fontColor_5_0= ruleprimaryColour ) )
                    // InternalPageGeneratorLanguare.g:1565:5: (lv_fontColor_5_0= ruleprimaryColour )
                    {
                    // InternalPageGeneratorLanguare.g:1565:5: (lv_fontColor_5_0= ruleprimaryColour )
                    // InternalPageGeneratorLanguare.g:1566:6: lv_fontColor_5_0= ruleprimaryColour
                    {

                    						newCompositeNode(grammarAccess.getTextAccess().getFontColorPrimaryColourParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_51);
                    lv_fontColor_5_0=ruleprimaryColour();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextRule());
                    						}
                    						set(
                    							current,
                    							"fontColor",
                    							lv_fontColor_5_0,
                    							"uk.ac.kcl.mdd.cw2.pageGenerator.PageGeneratorLanguare.primaryColour");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPageGeneratorLanguare.g:1583:4: (otherlv_6= ',' )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==18) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // InternalPageGeneratorLanguare.g:1584:5: otherlv_6= ','
                            {
                            otherlv_6=(Token)match(input,18,FOLLOW_52); 

                            					newLeafNode(otherlv_6, grammarAccess.getTextAccess().getCommaKeyword_3_3());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalPageGeneratorLanguare.g:1590:3: (otherlv_7= 'Font-size' otherlv_8= '=' ( (lv_fontSize_9_0= RULE_INT ) ) (otherlv_10= ',' )? )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==33) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:1591:4: otherlv_7= 'Font-size' otherlv_8= '=' ( (lv_fontSize_9_0= RULE_INT ) ) (otherlv_10= ',' )?
                    {
                    otherlv_7=(Token)match(input,33,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getTextAccess().getFontSizeKeyword_4_0());
                    			
                    otherlv_8=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_8, grammarAccess.getTextAccess().getEqualsSignKeyword_4_1());
                    			
                    // InternalPageGeneratorLanguare.g:1599:4: ( (lv_fontSize_9_0= RULE_INT ) )
                    // InternalPageGeneratorLanguare.g:1600:5: (lv_fontSize_9_0= RULE_INT )
                    {
                    // InternalPageGeneratorLanguare.g:1600:5: (lv_fontSize_9_0= RULE_INT )
                    // InternalPageGeneratorLanguare.g:1601:6: lv_fontSize_9_0= RULE_INT
                    {
                    lv_fontSize_9_0=(Token)match(input,RULE_INT,FOLLOW_19); 

                    						newLeafNode(lv_fontSize_9_0, grammarAccess.getTextAccess().getFontSizeINTTerminalRuleCall_4_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTextRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"fontSize",
                    							lv_fontSize_9_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalPageGeneratorLanguare.g:1617:4: (otherlv_10= ',' )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==18) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // InternalPageGeneratorLanguare.g:1618:5: otherlv_10= ','
                            {
                            otherlv_10=(Token)match(input,18,FOLLOW_20); 

                            					newLeafNode(otherlv_10, grammarAccess.getTextAccess().getCommaKeyword_4_3());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalPageGeneratorLanguare.g:1624:3: (otherlv_11= 'Location' otherlv_12= '=' ( (lv_location_13_0= rulelocationexpression ) ) (otherlv_14= ',' )? )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==25) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:1625:4: otherlv_11= 'Location' otherlv_12= '=' ( (lv_location_13_0= rulelocationexpression ) ) (otherlv_14= ',' )?
                    {
                    otherlv_11=(Token)match(input,25,FOLLOW_6); 

                    				newLeafNode(otherlv_11, grammarAccess.getTextAccess().getLocationKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_12, grammarAccess.getTextAccess().getEqualsSignKeyword_5_1());
                    			
                    // InternalPageGeneratorLanguare.g:1633:4: ( (lv_location_13_0= rulelocationexpression ) )
                    // InternalPageGeneratorLanguare.g:1634:5: (lv_location_13_0= rulelocationexpression )
                    {
                    // InternalPageGeneratorLanguare.g:1634:5: (lv_location_13_0= rulelocationexpression )
                    // InternalPageGeneratorLanguare.g:1635:6: lv_location_13_0= rulelocationexpression
                    {

                    						newCompositeNode(grammarAccess.getTextAccess().getLocationLocationexpressionParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_location_13_0=rulelocationexpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextRule());
                    						}
                    						set(
                    							current,
                    							"location",
                    							lv_location_13_0,
                    							"uk.ac.kcl.mdd.cw2.pageGenerator.PageGeneratorLanguare.locationexpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPageGeneratorLanguare.g:1652:4: (otherlv_14= ',' )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==18) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // InternalPageGeneratorLanguare.g:1653:5: otherlv_14= ','
                            {
                            otherlv_14=(Token)match(input,18,FOLLOW_22); 

                            					newLeafNode(otherlv_14, grammarAccess.getTextAccess().getCommaKeyword_5_3());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalPageGeneratorLanguare.g:1659:3: (otherlv_15= 'Padding-left' otherlv_16= '=' ( (lv_Lpadding_17_0= RULE_INT ) ) (otherlv_18= ',' )? )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==26) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:1660:4: otherlv_15= 'Padding-left' otherlv_16= '=' ( (lv_Lpadding_17_0= RULE_INT ) ) (otherlv_18= ',' )?
                    {
                    otherlv_15=(Token)match(input,26,FOLLOW_6); 

                    				newLeafNode(otherlv_15, grammarAccess.getTextAccess().getPaddingLeftKeyword_6_0());
                    			
                    otherlv_16=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_16, grammarAccess.getTextAccess().getEqualsSignKeyword_6_1());
                    			
                    // InternalPageGeneratorLanguare.g:1668:4: ( (lv_Lpadding_17_0= RULE_INT ) )
                    // InternalPageGeneratorLanguare.g:1669:5: (lv_Lpadding_17_0= RULE_INT )
                    {
                    // InternalPageGeneratorLanguare.g:1669:5: (lv_Lpadding_17_0= RULE_INT )
                    // InternalPageGeneratorLanguare.g:1670:6: lv_Lpadding_17_0= RULE_INT
                    {
                    lv_Lpadding_17_0=(Token)match(input,RULE_INT,FOLLOW_23); 

                    						newLeafNode(lv_Lpadding_17_0, grammarAccess.getTextAccess().getLpaddingINTTerminalRuleCall_6_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTextRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"Lpadding",
                    							lv_Lpadding_17_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalPageGeneratorLanguare.g:1686:4: (otherlv_18= ',' )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==18) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // InternalPageGeneratorLanguare.g:1687:5: otherlv_18= ','
                            {
                            otherlv_18=(Token)match(input,18,FOLLOW_24); 

                            					newLeafNode(otherlv_18, grammarAccess.getTextAccess().getCommaKeyword_6_3());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalPageGeneratorLanguare.g:1693:3: (otherlv_19= 'Padding-right' otherlv_20= '=' ( (lv_Rpadding_21_0= RULE_INT ) ) (otherlv_22= ',' )? )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==27) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:1694:4: otherlv_19= 'Padding-right' otherlv_20= '=' ( (lv_Rpadding_21_0= RULE_INT ) ) (otherlv_22= ',' )?
                    {
                    otherlv_19=(Token)match(input,27,FOLLOW_6); 

                    				newLeafNode(otherlv_19, grammarAccess.getTextAccess().getPaddingRightKeyword_7_0());
                    			
                    otherlv_20=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_20, grammarAccess.getTextAccess().getEqualsSignKeyword_7_1());
                    			
                    // InternalPageGeneratorLanguare.g:1702:4: ( (lv_Rpadding_21_0= RULE_INT ) )
                    // InternalPageGeneratorLanguare.g:1703:5: (lv_Rpadding_21_0= RULE_INT )
                    {
                    // InternalPageGeneratorLanguare.g:1703:5: (lv_Rpadding_21_0= RULE_INT )
                    // InternalPageGeneratorLanguare.g:1704:6: lv_Rpadding_21_0= RULE_INT
                    {
                    lv_Rpadding_21_0=(Token)match(input,RULE_INT,FOLLOW_25); 

                    						newLeafNode(lv_Rpadding_21_0, grammarAccess.getTextAccess().getRpaddingINTTerminalRuleCall_7_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTextRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"Rpadding",
                    							lv_Rpadding_21_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalPageGeneratorLanguare.g:1720:4: (otherlv_22= ',' )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==18) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // InternalPageGeneratorLanguare.g:1721:5: otherlv_22= ','
                            {
                            otherlv_22=(Token)match(input,18,FOLLOW_26); 

                            					newLeafNode(otherlv_22, grammarAccess.getTextAccess().getCommaKeyword_7_3());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalPageGeneratorLanguare.g:1727:3: (otherlv_23= 'Padding-top' otherlv_24= '=' ( (lv_Tpadding_25_0= RULE_INT ) ) (otherlv_26= ',' )? )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==28) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:1728:4: otherlv_23= 'Padding-top' otherlv_24= '=' ( (lv_Tpadding_25_0= RULE_INT ) ) (otherlv_26= ',' )?
                    {
                    otherlv_23=(Token)match(input,28,FOLLOW_6); 

                    				newLeafNode(otherlv_23, grammarAccess.getTextAccess().getPaddingTopKeyword_8_0());
                    			
                    otherlv_24=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_24, grammarAccess.getTextAccess().getEqualsSignKeyword_8_1());
                    			
                    // InternalPageGeneratorLanguare.g:1736:4: ( (lv_Tpadding_25_0= RULE_INT ) )
                    // InternalPageGeneratorLanguare.g:1737:5: (lv_Tpadding_25_0= RULE_INT )
                    {
                    // InternalPageGeneratorLanguare.g:1737:5: (lv_Tpadding_25_0= RULE_INT )
                    // InternalPageGeneratorLanguare.g:1738:6: lv_Tpadding_25_0= RULE_INT
                    {
                    lv_Tpadding_25_0=(Token)match(input,RULE_INT,FOLLOW_27); 

                    						newLeafNode(lv_Tpadding_25_0, grammarAccess.getTextAccess().getTpaddingINTTerminalRuleCall_8_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTextRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"Tpadding",
                    							lv_Tpadding_25_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalPageGeneratorLanguare.g:1754:4: (otherlv_26= ',' )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==18) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // InternalPageGeneratorLanguare.g:1755:5: otherlv_26= ','
                            {
                            otherlv_26=(Token)match(input,18,FOLLOW_28); 

                            					newLeafNode(otherlv_26, grammarAccess.getTextAccess().getCommaKeyword_8_3());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalPageGeneratorLanguare.g:1761:3: (otherlv_27= 'Padding-bottom' otherlv_28= '=' ( (lv_Bpadding_29_0= RULE_INT ) ) (otherlv_30= ',' )? )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==29) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:1762:4: otherlv_27= 'Padding-bottom' otherlv_28= '=' ( (lv_Bpadding_29_0= RULE_INT ) ) (otherlv_30= ',' )?
                    {
                    otherlv_27=(Token)match(input,29,FOLLOW_6); 

                    				newLeafNode(otherlv_27, grammarAccess.getTextAccess().getPaddingBottomKeyword_9_0());
                    			
                    otherlv_28=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_28, grammarAccess.getTextAccess().getEqualsSignKeyword_9_1());
                    			
                    // InternalPageGeneratorLanguare.g:1770:4: ( (lv_Bpadding_29_0= RULE_INT ) )
                    // InternalPageGeneratorLanguare.g:1771:5: (lv_Bpadding_29_0= RULE_INT )
                    {
                    // InternalPageGeneratorLanguare.g:1771:5: (lv_Bpadding_29_0= RULE_INT )
                    // InternalPageGeneratorLanguare.g:1772:6: lv_Bpadding_29_0= RULE_INT
                    {
                    lv_Bpadding_29_0=(Token)match(input,RULE_INT,FOLLOW_29); 

                    						newLeafNode(lv_Bpadding_29_0, grammarAccess.getTextAccess().getBpaddingINTTerminalRuleCall_9_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTextRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"Bpadding",
                    							lv_Bpadding_29_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalPageGeneratorLanguare.g:1788:4: (otherlv_30= ',' )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==18) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // InternalPageGeneratorLanguare.g:1789:5: otherlv_30= ','
                            {
                            otherlv_30=(Token)match(input,18,FOLLOW_30); 

                            					newLeafNode(otherlv_30, grammarAccess.getTextAccess().getCommaKeyword_9_3());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_31=(Token)match(input,30,FOLLOW_6); 

            			newLeafNode(otherlv_31, grammarAccess.getTextAccess().getGreaterThanSignKeyword_10());
            		
            otherlv_32=(Token)match(input,15,FOLLOW_18); 

            			newLeafNode(otherlv_32, grammarAccess.getTextAccess().getEqualsSignKeyword_11());
            		
            // InternalPageGeneratorLanguare.g:1803:3: ( (lv_content_33_0= ruleContent ) )
            // InternalPageGeneratorLanguare.g:1804:4: (lv_content_33_0= ruleContent )
            {
            // InternalPageGeneratorLanguare.g:1804:4: (lv_content_33_0= ruleContent )
            // InternalPageGeneratorLanguare.g:1805:5: lv_content_33_0= ruleContent
            {

            					newCompositeNode(grammarAccess.getTextAccess().getContentContentParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_8);
            lv_content_33_0=ruleContent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTextRule());
            					}
            					set(
            						current,
            						"content",
            						lv_content_33_0,
            						"uk.ac.kcl.mdd.cw2.pageGenerator.PageGeneratorLanguare.Content");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_34=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_34, grammarAccess.getTextAccess().getSemicolonKeyword_13());
            		

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
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleSection"
    // InternalPageGeneratorLanguare.g:1830:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // InternalPageGeneratorLanguare.g:1830:48: (iv_ruleSection= ruleSection EOF )
            // InternalPageGeneratorLanguare.g:1831:2: iv_ruleSection= ruleSection EOF
            {
             newCompositeNode(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSection=ruleSection();

            state._fsp--;

             current =iv_ruleSection; 
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
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // InternalPageGeneratorLanguare.g:1837:1: ruleSection returns [EObject current=null] : (otherlv_0= 'Section' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '<' (otherlv_3= 'Background-Colour' otherlv_4= '=' ( (lv_bgColor_5_0= ruleprimaryColour ) ) (otherlv_6= ',' )? )? (otherlv_7= 'Size' otherlv_8= '=' ( (lv_size_9_0= ruleprimarySize ) ) (otherlv_10= ',' )? )? (otherlv_11= 'Section-location' otherlv_12= '=' ( (lv_location_13_0= rulelocationexpression ) ) (otherlv_14= ',' )? )? (otherlv_15= 'Text-location' otherlv_16= '=' ( (lv_textLocation_17_0= rulelocationexpression ) ) (otherlv_18= ',' )? )? (otherlv_19= 'Padding-left' otherlv_20= '=' ( (lv_Lpadding_21_0= RULE_INT ) ) (otherlv_22= ',' )? )? (otherlv_23= 'Padding-right' otherlv_24= '=' ( (lv_Rpadding_25_0= RULE_INT ) ) (otherlv_26= ',' )? )? (otherlv_27= 'Padding-top' otherlv_28= '=' ( (lv_Tpadding_29_0= RULE_INT ) ) (otherlv_30= ',' )? )? (otherlv_31= 'Padding-bottom' otherlv_32= '=' ( (lv_Bpadding_33_0= RULE_INT ) ) (otherlv_34= ',' )? )? otherlv_35= '>' otherlv_36= '{' ( (lv_bodyElements_37_0= rulebodyElement ) )+ otherlv_38= '}' ) ;
    public final EObject ruleSection() throws RecognitionException {
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
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token lv_Lpadding_21_0=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token lv_Rpadding_25_0=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token lv_Tpadding_29_0=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token lv_Bpadding_33_0=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        EObject lv_bgColor_5_0 = null;

        EObject lv_size_9_0 = null;

        EObject lv_location_13_0 = null;

        EObject lv_textLocation_17_0 = null;

        EObject lv_bodyElements_37_0 = null;



        	enterRule();

        try {
            // InternalPageGeneratorLanguare.g:1843:2: ( (otherlv_0= 'Section' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '<' (otherlv_3= 'Background-Colour' otherlv_4= '=' ( (lv_bgColor_5_0= ruleprimaryColour ) ) (otherlv_6= ',' )? )? (otherlv_7= 'Size' otherlv_8= '=' ( (lv_size_9_0= ruleprimarySize ) ) (otherlv_10= ',' )? )? (otherlv_11= 'Section-location' otherlv_12= '=' ( (lv_location_13_0= rulelocationexpression ) ) (otherlv_14= ',' )? )? (otherlv_15= 'Text-location' otherlv_16= '=' ( (lv_textLocation_17_0= rulelocationexpression ) ) (otherlv_18= ',' )? )? (otherlv_19= 'Padding-left' otherlv_20= '=' ( (lv_Lpadding_21_0= RULE_INT ) ) (otherlv_22= ',' )? )? (otherlv_23= 'Padding-right' otherlv_24= '=' ( (lv_Rpadding_25_0= RULE_INT ) ) (otherlv_26= ',' )? )? (otherlv_27= 'Padding-top' otherlv_28= '=' ( (lv_Tpadding_29_0= RULE_INT ) ) (otherlv_30= ',' )? )? (otherlv_31= 'Padding-bottom' otherlv_32= '=' ( (lv_Bpadding_33_0= RULE_INT ) ) (otherlv_34= ',' )? )? otherlv_35= '>' otherlv_36= '{' ( (lv_bodyElements_37_0= rulebodyElement ) )+ otherlv_38= '}' ) )
            // InternalPageGeneratorLanguare.g:1844:2: (otherlv_0= 'Section' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '<' (otherlv_3= 'Background-Colour' otherlv_4= '=' ( (lv_bgColor_5_0= ruleprimaryColour ) ) (otherlv_6= ',' )? )? (otherlv_7= 'Size' otherlv_8= '=' ( (lv_size_9_0= ruleprimarySize ) ) (otherlv_10= ',' )? )? (otherlv_11= 'Section-location' otherlv_12= '=' ( (lv_location_13_0= rulelocationexpression ) ) (otherlv_14= ',' )? )? (otherlv_15= 'Text-location' otherlv_16= '=' ( (lv_textLocation_17_0= rulelocationexpression ) ) (otherlv_18= ',' )? )? (otherlv_19= 'Padding-left' otherlv_20= '=' ( (lv_Lpadding_21_0= RULE_INT ) ) (otherlv_22= ',' )? )? (otherlv_23= 'Padding-right' otherlv_24= '=' ( (lv_Rpadding_25_0= RULE_INT ) ) (otherlv_26= ',' )? )? (otherlv_27= 'Padding-top' otherlv_28= '=' ( (lv_Tpadding_29_0= RULE_INT ) ) (otherlv_30= ',' )? )? (otherlv_31= 'Padding-bottom' otherlv_32= '=' ( (lv_Bpadding_33_0= RULE_INT ) ) (otherlv_34= ',' )? )? otherlv_35= '>' otherlv_36= '{' ( (lv_bodyElements_37_0= rulebodyElement ) )+ otherlv_38= '}' )
            {
            // InternalPageGeneratorLanguare.g:1844:2: (otherlv_0= 'Section' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '<' (otherlv_3= 'Background-Colour' otherlv_4= '=' ( (lv_bgColor_5_0= ruleprimaryColour ) ) (otherlv_6= ',' )? )? (otherlv_7= 'Size' otherlv_8= '=' ( (lv_size_9_0= ruleprimarySize ) ) (otherlv_10= ',' )? )? (otherlv_11= 'Section-location' otherlv_12= '=' ( (lv_location_13_0= rulelocationexpression ) ) (otherlv_14= ',' )? )? (otherlv_15= 'Text-location' otherlv_16= '=' ( (lv_textLocation_17_0= rulelocationexpression ) ) (otherlv_18= ',' )? )? (otherlv_19= 'Padding-left' otherlv_20= '=' ( (lv_Lpadding_21_0= RULE_INT ) ) (otherlv_22= ',' )? )? (otherlv_23= 'Padding-right' otherlv_24= '=' ( (lv_Rpadding_25_0= RULE_INT ) ) (otherlv_26= ',' )? )? (otherlv_27= 'Padding-top' otherlv_28= '=' ( (lv_Tpadding_29_0= RULE_INT ) ) (otherlv_30= ',' )? )? (otherlv_31= 'Padding-bottom' otherlv_32= '=' ( (lv_Bpadding_33_0= RULE_INT ) ) (otherlv_34= ',' )? )? otherlv_35= '>' otherlv_36= '{' ( (lv_bodyElements_37_0= rulebodyElement ) )+ otherlv_38= '}' )
            // InternalPageGeneratorLanguare.g:1845:3: otherlv_0= 'Section' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '<' (otherlv_3= 'Background-Colour' otherlv_4= '=' ( (lv_bgColor_5_0= ruleprimaryColour ) ) (otherlv_6= ',' )? )? (otherlv_7= 'Size' otherlv_8= '=' ( (lv_size_9_0= ruleprimarySize ) ) (otherlv_10= ',' )? )? (otherlv_11= 'Section-location' otherlv_12= '=' ( (lv_location_13_0= rulelocationexpression ) ) (otherlv_14= ',' )? )? (otherlv_15= 'Text-location' otherlv_16= '=' ( (lv_textLocation_17_0= rulelocationexpression ) ) (otherlv_18= ',' )? )? (otherlv_19= 'Padding-left' otherlv_20= '=' ( (lv_Lpadding_21_0= RULE_INT ) ) (otherlv_22= ',' )? )? (otherlv_23= 'Padding-right' otherlv_24= '=' ( (lv_Rpadding_25_0= RULE_INT ) ) (otherlv_26= ',' )? )? (otherlv_27= 'Padding-top' otherlv_28= '=' ( (lv_Tpadding_29_0= RULE_INT ) ) (otherlv_30= ',' )? )? (otherlv_31= 'Padding-bottom' otherlv_32= '=' ( (lv_Bpadding_33_0= RULE_INT ) ) (otherlv_34= ',' )? )? otherlv_35= '>' otherlv_36= '{' ( (lv_bodyElements_37_0= rulebodyElement ) )+ otherlv_38= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getSectionAccess().getSectionKeyword_0());
            		
            // InternalPageGeneratorLanguare.g:1849:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPageGeneratorLanguare.g:1850:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPageGeneratorLanguare.g:1850:4: (lv_name_1_0= RULE_ID )
            // InternalPageGeneratorLanguare.g:1851:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSectionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSectionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_53); 

            			newLeafNode(otherlv_2, grammarAccess.getSectionAccess().getLessThanSignKeyword_2());
            		
            // InternalPageGeneratorLanguare.g:1871:3: (otherlv_3= 'Background-Colour' otherlv_4= '=' ( (lv_bgColor_5_0= ruleprimaryColour ) ) (otherlv_6= ',' )? )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==39) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:1872:4: otherlv_3= 'Background-Colour' otherlv_4= '=' ( (lv_bgColor_5_0= ruleprimaryColour ) ) (otherlv_6= ',' )?
                    {
                    otherlv_3=(Token)match(input,39,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getSectionAccess().getBackgroundColourKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,15,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getSectionAccess().getEqualsSignKeyword_3_1());
                    			
                    // InternalPageGeneratorLanguare.g:1880:4: ( (lv_bgColor_5_0= ruleprimaryColour ) )
                    // InternalPageGeneratorLanguare.g:1881:5: (lv_bgColor_5_0= ruleprimaryColour )
                    {
                    // InternalPageGeneratorLanguare.g:1881:5: (lv_bgColor_5_0= ruleprimaryColour )
                    // InternalPageGeneratorLanguare.g:1882:6: lv_bgColor_5_0= ruleprimaryColour
                    {

                    						newCompositeNode(grammarAccess.getSectionAccess().getBgColorPrimaryColourParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_54);
                    lv_bgColor_5_0=ruleprimaryColour();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSectionRule());
                    						}
                    						set(
                    							current,
                    							"bgColor",
                    							lv_bgColor_5_0,
                    							"uk.ac.kcl.mdd.cw2.pageGenerator.PageGeneratorLanguare.primaryColour");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPageGeneratorLanguare.g:1899:4: (otherlv_6= ',' )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==18) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // InternalPageGeneratorLanguare.g:1900:5: otherlv_6= ','
                            {
                            otherlv_6=(Token)match(input,18,FOLLOW_55); 

                            					newLeafNode(otherlv_6, grammarAccess.getSectionAccess().getCommaKeyword_3_3());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalPageGeneratorLanguare.g:1906:3: (otherlv_7= 'Size' otherlv_8= '=' ( (lv_size_9_0= ruleprimarySize ) ) (otherlv_10= ',' )? )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==40) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:1907:4: otherlv_7= 'Size' otherlv_8= '=' ( (lv_size_9_0= ruleprimarySize ) ) (otherlv_10= ',' )?
                    {
                    otherlv_7=(Token)match(input,40,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getSectionAccess().getSizeKeyword_4_0());
                    			
                    otherlv_8=(Token)match(input,15,FOLLOW_47); 

                    				newLeafNode(otherlv_8, grammarAccess.getSectionAccess().getEqualsSignKeyword_4_1());
                    			
                    // InternalPageGeneratorLanguare.g:1915:4: ( (lv_size_9_0= ruleprimarySize ) )
                    // InternalPageGeneratorLanguare.g:1916:5: (lv_size_9_0= ruleprimarySize )
                    {
                    // InternalPageGeneratorLanguare.g:1916:5: (lv_size_9_0= ruleprimarySize )
                    // InternalPageGeneratorLanguare.g:1917:6: lv_size_9_0= ruleprimarySize
                    {

                    						newCompositeNode(grammarAccess.getSectionAccess().getSizePrimarySizeParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_56);
                    lv_size_9_0=ruleprimarySize();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSectionRule());
                    						}
                    						set(
                    							current,
                    							"size",
                    							lv_size_9_0,
                    							"uk.ac.kcl.mdd.cw2.pageGenerator.PageGeneratorLanguare.primarySize");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPageGeneratorLanguare.g:1934:4: (otherlv_10= ',' )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==18) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // InternalPageGeneratorLanguare.g:1935:5: otherlv_10= ','
                            {
                            otherlv_10=(Token)match(input,18,FOLLOW_57); 

                            					newLeafNode(otherlv_10, grammarAccess.getSectionAccess().getCommaKeyword_4_3());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalPageGeneratorLanguare.g:1941:3: (otherlv_11= 'Section-location' otherlv_12= '=' ( (lv_location_13_0= rulelocationexpression ) ) (otherlv_14= ',' )? )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==41) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:1942:4: otherlv_11= 'Section-location' otherlv_12= '=' ( (lv_location_13_0= rulelocationexpression ) ) (otherlv_14= ',' )?
                    {
                    otherlv_11=(Token)match(input,41,FOLLOW_6); 

                    				newLeafNode(otherlv_11, grammarAccess.getSectionAccess().getSectionLocationKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_12, grammarAccess.getSectionAccess().getEqualsSignKeyword_5_1());
                    			
                    // InternalPageGeneratorLanguare.g:1950:4: ( (lv_location_13_0= rulelocationexpression ) )
                    // InternalPageGeneratorLanguare.g:1951:5: (lv_location_13_0= rulelocationexpression )
                    {
                    // InternalPageGeneratorLanguare.g:1951:5: (lv_location_13_0= rulelocationexpression )
                    // InternalPageGeneratorLanguare.g:1952:6: lv_location_13_0= rulelocationexpression
                    {

                    						newCompositeNode(grammarAccess.getSectionAccess().getLocationLocationexpressionParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_58);
                    lv_location_13_0=rulelocationexpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSectionRule());
                    						}
                    						set(
                    							current,
                    							"location",
                    							lv_location_13_0,
                    							"uk.ac.kcl.mdd.cw2.pageGenerator.PageGeneratorLanguare.locationexpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPageGeneratorLanguare.g:1969:4: (otherlv_14= ',' )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==18) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // InternalPageGeneratorLanguare.g:1970:5: otherlv_14= ','
                            {
                            otherlv_14=(Token)match(input,18,FOLLOW_59); 

                            					newLeafNode(otherlv_14, grammarAccess.getSectionAccess().getCommaKeyword_5_3());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalPageGeneratorLanguare.g:1976:3: (otherlv_15= 'Text-location' otherlv_16= '=' ( (lv_textLocation_17_0= rulelocationexpression ) ) (otherlv_18= ',' )? )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==42) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:1977:4: otherlv_15= 'Text-location' otherlv_16= '=' ( (lv_textLocation_17_0= rulelocationexpression ) ) (otherlv_18= ',' )?
                    {
                    otherlv_15=(Token)match(input,42,FOLLOW_6); 

                    				newLeafNode(otherlv_15, grammarAccess.getSectionAccess().getTextLocationKeyword_6_0());
                    			
                    otherlv_16=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_16, grammarAccess.getSectionAccess().getEqualsSignKeyword_6_1());
                    			
                    // InternalPageGeneratorLanguare.g:1985:4: ( (lv_textLocation_17_0= rulelocationexpression ) )
                    // InternalPageGeneratorLanguare.g:1986:5: (lv_textLocation_17_0= rulelocationexpression )
                    {
                    // InternalPageGeneratorLanguare.g:1986:5: (lv_textLocation_17_0= rulelocationexpression )
                    // InternalPageGeneratorLanguare.g:1987:6: lv_textLocation_17_0= rulelocationexpression
                    {

                    						newCompositeNode(grammarAccess.getSectionAccess().getTextLocationLocationexpressionParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_textLocation_17_0=rulelocationexpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSectionRule());
                    						}
                    						set(
                    							current,
                    							"textLocation",
                    							lv_textLocation_17_0,
                    							"uk.ac.kcl.mdd.cw2.pageGenerator.PageGeneratorLanguare.locationexpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPageGeneratorLanguare.g:2004:4: (otherlv_18= ',' )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==18) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // InternalPageGeneratorLanguare.g:2005:5: otherlv_18= ','
                            {
                            otherlv_18=(Token)match(input,18,FOLLOW_22); 

                            					newLeafNode(otherlv_18, grammarAccess.getSectionAccess().getCommaKeyword_6_3());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalPageGeneratorLanguare.g:2011:3: (otherlv_19= 'Padding-left' otherlv_20= '=' ( (lv_Lpadding_21_0= RULE_INT ) ) (otherlv_22= ',' )? )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==26) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:2012:4: otherlv_19= 'Padding-left' otherlv_20= '=' ( (lv_Lpadding_21_0= RULE_INT ) ) (otherlv_22= ',' )?
                    {
                    otherlv_19=(Token)match(input,26,FOLLOW_6); 

                    				newLeafNode(otherlv_19, grammarAccess.getSectionAccess().getPaddingLeftKeyword_7_0());
                    			
                    otherlv_20=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_20, grammarAccess.getSectionAccess().getEqualsSignKeyword_7_1());
                    			
                    // InternalPageGeneratorLanguare.g:2020:4: ( (lv_Lpadding_21_0= RULE_INT ) )
                    // InternalPageGeneratorLanguare.g:2021:5: (lv_Lpadding_21_0= RULE_INT )
                    {
                    // InternalPageGeneratorLanguare.g:2021:5: (lv_Lpadding_21_0= RULE_INT )
                    // InternalPageGeneratorLanguare.g:2022:6: lv_Lpadding_21_0= RULE_INT
                    {
                    lv_Lpadding_21_0=(Token)match(input,RULE_INT,FOLLOW_23); 

                    						newLeafNode(lv_Lpadding_21_0, grammarAccess.getSectionAccess().getLpaddingINTTerminalRuleCall_7_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSectionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"Lpadding",
                    							lv_Lpadding_21_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalPageGeneratorLanguare.g:2038:4: (otherlv_22= ',' )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==18) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // InternalPageGeneratorLanguare.g:2039:5: otherlv_22= ','
                            {
                            otherlv_22=(Token)match(input,18,FOLLOW_24); 

                            					newLeafNode(otherlv_22, grammarAccess.getSectionAccess().getCommaKeyword_7_3());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalPageGeneratorLanguare.g:2045:3: (otherlv_23= 'Padding-right' otherlv_24= '=' ( (lv_Rpadding_25_0= RULE_INT ) ) (otherlv_26= ',' )? )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==27) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:2046:4: otherlv_23= 'Padding-right' otherlv_24= '=' ( (lv_Rpadding_25_0= RULE_INT ) ) (otherlv_26= ',' )?
                    {
                    otherlv_23=(Token)match(input,27,FOLLOW_6); 

                    				newLeafNode(otherlv_23, grammarAccess.getSectionAccess().getPaddingRightKeyword_8_0());
                    			
                    otherlv_24=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_24, grammarAccess.getSectionAccess().getEqualsSignKeyword_8_1());
                    			
                    // InternalPageGeneratorLanguare.g:2054:4: ( (lv_Rpadding_25_0= RULE_INT ) )
                    // InternalPageGeneratorLanguare.g:2055:5: (lv_Rpadding_25_0= RULE_INT )
                    {
                    // InternalPageGeneratorLanguare.g:2055:5: (lv_Rpadding_25_0= RULE_INT )
                    // InternalPageGeneratorLanguare.g:2056:6: lv_Rpadding_25_0= RULE_INT
                    {
                    lv_Rpadding_25_0=(Token)match(input,RULE_INT,FOLLOW_25); 

                    						newLeafNode(lv_Rpadding_25_0, grammarAccess.getSectionAccess().getRpaddingINTTerminalRuleCall_8_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSectionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"Rpadding",
                    							lv_Rpadding_25_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalPageGeneratorLanguare.g:2072:4: (otherlv_26= ',' )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==18) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // InternalPageGeneratorLanguare.g:2073:5: otherlv_26= ','
                            {
                            otherlv_26=(Token)match(input,18,FOLLOW_26); 

                            					newLeafNode(otherlv_26, grammarAccess.getSectionAccess().getCommaKeyword_8_3());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalPageGeneratorLanguare.g:2079:3: (otherlv_27= 'Padding-top' otherlv_28= '=' ( (lv_Tpadding_29_0= RULE_INT ) ) (otherlv_30= ',' )? )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==28) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:2080:4: otherlv_27= 'Padding-top' otherlv_28= '=' ( (lv_Tpadding_29_0= RULE_INT ) ) (otherlv_30= ',' )?
                    {
                    otherlv_27=(Token)match(input,28,FOLLOW_6); 

                    				newLeafNode(otherlv_27, grammarAccess.getSectionAccess().getPaddingTopKeyword_9_0());
                    			
                    otherlv_28=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_28, grammarAccess.getSectionAccess().getEqualsSignKeyword_9_1());
                    			
                    // InternalPageGeneratorLanguare.g:2088:4: ( (lv_Tpadding_29_0= RULE_INT ) )
                    // InternalPageGeneratorLanguare.g:2089:5: (lv_Tpadding_29_0= RULE_INT )
                    {
                    // InternalPageGeneratorLanguare.g:2089:5: (lv_Tpadding_29_0= RULE_INT )
                    // InternalPageGeneratorLanguare.g:2090:6: lv_Tpadding_29_0= RULE_INT
                    {
                    lv_Tpadding_29_0=(Token)match(input,RULE_INT,FOLLOW_27); 

                    						newLeafNode(lv_Tpadding_29_0, grammarAccess.getSectionAccess().getTpaddingINTTerminalRuleCall_9_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSectionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"Tpadding",
                    							lv_Tpadding_29_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalPageGeneratorLanguare.g:2106:4: (otherlv_30= ',' )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==18) ) {
                        alt77=1;
                    }
                    switch (alt77) {
                        case 1 :
                            // InternalPageGeneratorLanguare.g:2107:5: otherlv_30= ','
                            {
                            otherlv_30=(Token)match(input,18,FOLLOW_28); 

                            					newLeafNode(otherlv_30, grammarAccess.getSectionAccess().getCommaKeyword_9_3());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalPageGeneratorLanguare.g:2113:3: (otherlv_31= 'Padding-bottom' otherlv_32= '=' ( (lv_Bpadding_33_0= RULE_INT ) ) (otherlv_34= ',' )? )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==29) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:2114:4: otherlv_31= 'Padding-bottom' otherlv_32= '=' ( (lv_Bpadding_33_0= RULE_INT ) ) (otherlv_34= ',' )?
                    {
                    otherlv_31=(Token)match(input,29,FOLLOW_6); 

                    				newLeafNode(otherlv_31, grammarAccess.getSectionAccess().getPaddingBottomKeyword_10_0());
                    			
                    otherlv_32=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_32, grammarAccess.getSectionAccess().getEqualsSignKeyword_10_1());
                    			
                    // InternalPageGeneratorLanguare.g:2122:4: ( (lv_Bpadding_33_0= RULE_INT ) )
                    // InternalPageGeneratorLanguare.g:2123:5: (lv_Bpadding_33_0= RULE_INT )
                    {
                    // InternalPageGeneratorLanguare.g:2123:5: (lv_Bpadding_33_0= RULE_INT )
                    // InternalPageGeneratorLanguare.g:2124:6: lv_Bpadding_33_0= RULE_INT
                    {
                    lv_Bpadding_33_0=(Token)match(input,RULE_INT,FOLLOW_29); 

                    						newLeafNode(lv_Bpadding_33_0, grammarAccess.getSectionAccess().getBpaddingINTTerminalRuleCall_10_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSectionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"Bpadding",
                    							lv_Bpadding_33_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalPageGeneratorLanguare.g:2140:4: (otherlv_34= ',' )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==18) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // InternalPageGeneratorLanguare.g:2141:5: otherlv_34= ','
                            {
                            otherlv_34=(Token)match(input,18,FOLLOW_30); 

                            					newLeafNode(otherlv_34, grammarAccess.getSectionAccess().getCommaKeyword_10_3());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_35=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_35, grammarAccess.getSectionAccess().getGreaterThanSignKeyword_11());
            		
            otherlv_36=(Token)match(input,12,FOLLOW_60); 

            			newLeafNode(otherlv_36, grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_12());
            		
            // InternalPageGeneratorLanguare.g:2155:3: ( (lv_bodyElements_37_0= rulebodyElement ) )+
            int cnt81=0;
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==21||LA81_0==31||(LA81_0>=34 && LA81_0<=35)||(LA81_0>=37 && LA81_0<=38)||LA81_0==44||LA81_0==49) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // InternalPageGeneratorLanguare.g:2156:4: (lv_bodyElements_37_0= rulebodyElement )
            	    {
            	    // InternalPageGeneratorLanguare.g:2156:4: (lv_bodyElements_37_0= rulebodyElement )
            	    // InternalPageGeneratorLanguare.g:2157:5: lv_bodyElements_37_0= rulebodyElement
            	    {

            	    					newCompositeNode(grammarAccess.getSectionAccess().getBodyElementsBodyElementParserRuleCall_13_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_bodyElements_37_0=rulebodyElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSectionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"bodyElements",
            	    						lv_bodyElements_37_0,
            	    						"uk.ac.kcl.mdd.cw2.pageGenerator.PageGeneratorLanguare.bodyElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt81 >= 1 ) break loop81;
                        EarlyExitException eee =
                            new EarlyExitException(81, input);
                        throw eee;
                }
                cnt81++;
            } while (true);

            otherlv_38=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_38, grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_14());
            		

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
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRulelocationexpression"
    // InternalPageGeneratorLanguare.g:2182:1: entryRulelocationexpression returns [EObject current=null] : iv_rulelocationexpression= rulelocationexpression EOF ;
    public final EObject entryRulelocationexpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelocationexpression = null;


        try {
            // InternalPageGeneratorLanguare.g:2182:59: (iv_rulelocationexpression= rulelocationexpression EOF )
            // InternalPageGeneratorLanguare.g:2183:2: iv_rulelocationexpression= rulelocationexpression EOF
            {
             newCompositeNode(grammarAccess.getLocationexpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulelocationexpression=rulelocationexpression();

            state._fsp--;

             current =iv_rulelocationexpression; 
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
    // $ANTLR end "entryRulelocationexpression"


    // $ANTLR start "rulelocationexpression"
    // InternalPageGeneratorLanguare.g:2189:1: rulelocationexpression returns [EObject current=null] : ( (lv_location_0_0= RULE_STRING ) ) ;
    public final EObject rulelocationexpression() throws RecognitionException {
        EObject current = null;

        Token lv_location_0_0=null;


        	enterRule();

        try {
            // InternalPageGeneratorLanguare.g:2195:2: ( ( (lv_location_0_0= RULE_STRING ) ) )
            // InternalPageGeneratorLanguare.g:2196:2: ( (lv_location_0_0= RULE_STRING ) )
            {
            // InternalPageGeneratorLanguare.g:2196:2: ( (lv_location_0_0= RULE_STRING ) )
            // InternalPageGeneratorLanguare.g:2197:3: (lv_location_0_0= RULE_STRING )
            {
            // InternalPageGeneratorLanguare.g:2197:3: (lv_location_0_0= RULE_STRING )
            // InternalPageGeneratorLanguare.g:2198:4: lv_location_0_0= RULE_STRING
            {
            lv_location_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_location_0_0, grammarAccess.getLocationexpressionAccess().getLocationSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getLocationexpressionRule());
            				}
            				setWithLastConsumed(
            					current,
            					"location",
            					lv_location_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
        }
        return current;
    }
    // $ANTLR end "rulelocationexpression"


    // $ANTLR start "entryRuleprimarySize"
    // InternalPageGeneratorLanguare.g:2217:1: entryRuleprimarySize returns [EObject current=null] : iv_ruleprimarySize= ruleprimarySize EOF ;
    public final EObject entryRuleprimarySize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprimarySize = null;


        try {
            // InternalPageGeneratorLanguare.g:2217:52: (iv_ruleprimarySize= ruleprimarySize EOF )
            // InternalPageGeneratorLanguare.g:2218:2: iv_ruleprimarySize= ruleprimarySize EOF
            {
             newCompositeNode(grammarAccess.getPrimarySizeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleprimarySize=ruleprimarySize();

            state._fsp--;

             current =iv_ruleprimarySize; 
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
    // $ANTLR end "entryRuleprimarySize"


    // $ANTLR start "ruleprimarySize"
    // InternalPageGeneratorLanguare.g:2224:1: ruleprimarySize returns [EObject current=null] : (this_SizeExpression_0= ruleSizeExpression | this_sizeValue_1= rulesizeValue ) ;
    public final EObject ruleprimarySize() throws RecognitionException {
        EObject current = null;

        EObject this_SizeExpression_0 = null;

        EObject this_sizeValue_1 = null;



        	enterRule();

        try {
            // InternalPageGeneratorLanguare.g:2230:2: ( (this_SizeExpression_0= ruleSizeExpression | this_sizeValue_1= rulesizeValue ) )
            // InternalPageGeneratorLanguare.g:2231:2: (this_SizeExpression_0= ruleSizeExpression | this_sizeValue_1= rulesizeValue )
            {
            // InternalPageGeneratorLanguare.g:2231:2: (this_SizeExpression_0= ruleSizeExpression | this_sizeValue_1= rulesizeValue )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==RULE_ID) ) {
                alt82=1;
            }
            else if ( (LA82_0==RULE_INT) ) {
                alt82=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:2232:3: this_SizeExpression_0= ruleSizeExpression
                    {

                    			newCompositeNode(grammarAccess.getPrimarySizeAccess().getSizeExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SizeExpression_0=ruleSizeExpression();

                    state._fsp--;


                    			current = this_SizeExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPageGeneratorLanguare.g:2241:3: this_sizeValue_1= rulesizeValue
                    {

                    			newCompositeNode(grammarAccess.getPrimarySizeAccess().getSizeValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_sizeValue_1=rulesizeValue();

                    state._fsp--;


                    			current = this_sizeValue_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleprimarySize"


    // $ANTLR start "entryRuleSizeDeclaration"
    // InternalPageGeneratorLanguare.g:2253:1: entryRuleSizeDeclaration returns [EObject current=null] : iv_ruleSizeDeclaration= ruleSizeDeclaration EOF ;
    public final EObject entryRuleSizeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSizeDeclaration = null;


        try {
            // InternalPageGeneratorLanguare.g:2253:56: (iv_ruleSizeDeclaration= ruleSizeDeclaration EOF )
            // InternalPageGeneratorLanguare.g:2254:2: iv_ruleSizeDeclaration= ruleSizeDeclaration EOF
            {
             newCompositeNode(grammarAccess.getSizeDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSizeDeclaration=ruleSizeDeclaration();

            state._fsp--;

             current =iv_ruleSizeDeclaration; 
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
    // $ANTLR end "entryRuleSizeDeclaration"


    // $ANTLR start "ruleSizeDeclaration"
    // InternalPageGeneratorLanguare.g:2260:1: ruleSizeDeclaration returns [EObject current=null] : (otherlv_0= 'size' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_width_3_0= RULE_INT ) ) otherlv_4= '*' ( (lv_height_5_0= RULE_INT ) ) otherlv_6= ';' ) ;
    public final EObject ruleSizeDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_width_3_0=null;
        Token otherlv_4=null;
        Token lv_height_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalPageGeneratorLanguare.g:2266:2: ( (otherlv_0= 'size' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_width_3_0= RULE_INT ) ) otherlv_4= '*' ( (lv_height_5_0= RULE_INT ) ) otherlv_6= ';' ) )
            // InternalPageGeneratorLanguare.g:2267:2: (otherlv_0= 'size' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_width_3_0= RULE_INT ) ) otherlv_4= '*' ( (lv_height_5_0= RULE_INT ) ) otherlv_6= ';' )
            {
            // InternalPageGeneratorLanguare.g:2267:2: (otherlv_0= 'size' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_width_3_0= RULE_INT ) ) otherlv_4= '*' ( (lv_height_5_0= RULE_INT ) ) otherlv_6= ';' )
            // InternalPageGeneratorLanguare.g:2268:3: otherlv_0= 'size' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_width_3_0= RULE_INT ) ) otherlv_4= '*' ( (lv_height_5_0= RULE_INT ) ) otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getSizeDeclarationAccess().getSizeKeyword_0());
            		
            // InternalPageGeneratorLanguare.g:2272:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPageGeneratorLanguare.g:2273:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPageGeneratorLanguare.g:2273:4: (lv_name_1_0= RULE_ID )
            // InternalPageGeneratorLanguare.g:2274:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSizeDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSizeDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getSizeDeclarationAccess().getEqualsSignKeyword_2());
            		
            // InternalPageGeneratorLanguare.g:2294:3: ( (lv_width_3_0= RULE_INT ) )
            // InternalPageGeneratorLanguare.g:2295:4: (lv_width_3_0= RULE_INT )
            {
            // InternalPageGeneratorLanguare.g:2295:4: (lv_width_3_0= RULE_INT )
            // InternalPageGeneratorLanguare.g:2296:5: lv_width_3_0= RULE_INT
            {
            lv_width_3_0=(Token)match(input,RULE_INT,FOLLOW_61); 

            					newLeafNode(lv_width_3_0, grammarAccess.getSizeDeclarationAccess().getWidthINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSizeDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"width",
            						lv_width_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,43,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getSizeDeclarationAccess().getAsteriskKeyword_4());
            		
            // InternalPageGeneratorLanguare.g:2316:3: ( (lv_height_5_0= RULE_INT ) )
            // InternalPageGeneratorLanguare.g:2317:4: (lv_height_5_0= RULE_INT )
            {
            // InternalPageGeneratorLanguare.g:2317:4: (lv_height_5_0= RULE_INT )
            // InternalPageGeneratorLanguare.g:2318:5: lv_height_5_0= RULE_INT
            {
            lv_height_5_0=(Token)match(input,RULE_INT,FOLLOW_8); 

            					newLeafNode(lv_height_5_0, grammarAccess.getSizeDeclarationAccess().getHeightINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSizeDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"height",
            						lv_height_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getSizeDeclarationAccess().getSemicolonKeyword_6());
            		

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
    // $ANTLR end "ruleSizeDeclaration"


    // $ANTLR start "entryRulesizeValue"
    // InternalPageGeneratorLanguare.g:2342:1: entryRulesizeValue returns [EObject current=null] : iv_rulesizeValue= rulesizeValue EOF ;
    public final EObject entryRulesizeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesizeValue = null;


        try {
            // InternalPageGeneratorLanguare.g:2342:50: (iv_rulesizeValue= rulesizeValue EOF )
            // InternalPageGeneratorLanguare.g:2343:2: iv_rulesizeValue= rulesizeValue EOF
            {
             newCompositeNode(grammarAccess.getSizeValueRule()); 
            pushFollow(FOLLOW_1);
            iv_rulesizeValue=rulesizeValue();

            state._fsp--;

             current =iv_rulesizeValue; 
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
    // $ANTLR end "entryRulesizeValue"


    // $ANTLR start "rulesizeValue"
    // InternalPageGeneratorLanguare.g:2349:1: rulesizeValue returns [EObject current=null] : ( ( (lv_width_0_0= RULE_INT ) ) otherlv_1= '*' ( (lv_height_2_0= RULE_INT ) ) ) ;
    public final EObject rulesizeValue() throws RecognitionException {
        EObject current = null;

        Token lv_width_0_0=null;
        Token otherlv_1=null;
        Token lv_height_2_0=null;


        	enterRule();

        try {
            // InternalPageGeneratorLanguare.g:2355:2: ( ( ( (lv_width_0_0= RULE_INT ) ) otherlv_1= '*' ( (lv_height_2_0= RULE_INT ) ) ) )
            // InternalPageGeneratorLanguare.g:2356:2: ( ( (lv_width_0_0= RULE_INT ) ) otherlv_1= '*' ( (lv_height_2_0= RULE_INT ) ) )
            {
            // InternalPageGeneratorLanguare.g:2356:2: ( ( (lv_width_0_0= RULE_INT ) ) otherlv_1= '*' ( (lv_height_2_0= RULE_INT ) ) )
            // InternalPageGeneratorLanguare.g:2357:3: ( (lv_width_0_0= RULE_INT ) ) otherlv_1= '*' ( (lv_height_2_0= RULE_INT ) )
            {
            // InternalPageGeneratorLanguare.g:2357:3: ( (lv_width_0_0= RULE_INT ) )
            // InternalPageGeneratorLanguare.g:2358:4: (lv_width_0_0= RULE_INT )
            {
            // InternalPageGeneratorLanguare.g:2358:4: (lv_width_0_0= RULE_INT )
            // InternalPageGeneratorLanguare.g:2359:5: lv_width_0_0= RULE_INT
            {
            lv_width_0_0=(Token)match(input,RULE_INT,FOLLOW_61); 

            					newLeafNode(lv_width_0_0, grammarAccess.getSizeValueAccess().getWidthINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSizeValueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"width",
            						lv_width_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,43,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getSizeValueAccess().getAsteriskKeyword_1());
            		
            // InternalPageGeneratorLanguare.g:2379:3: ( (lv_height_2_0= RULE_INT ) )
            // InternalPageGeneratorLanguare.g:2380:4: (lv_height_2_0= RULE_INT )
            {
            // InternalPageGeneratorLanguare.g:2380:4: (lv_height_2_0= RULE_INT )
            // InternalPageGeneratorLanguare.g:2381:5: lv_height_2_0= RULE_INT
            {
            lv_height_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_height_2_0, grammarAccess.getSizeValueAccess().getHeightINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSizeValueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"height",
            						lv_height_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
        }
        return current;
    }
    // $ANTLR end "rulesizeValue"


    // $ANTLR start "entryRuleSizeExpression"
    // InternalPageGeneratorLanguare.g:2401:1: entryRuleSizeExpression returns [EObject current=null] : iv_ruleSizeExpression= ruleSizeExpression EOF ;
    public final EObject entryRuleSizeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSizeExpression = null;


        try {
            // InternalPageGeneratorLanguare.g:2401:55: (iv_ruleSizeExpression= ruleSizeExpression EOF )
            // InternalPageGeneratorLanguare.g:2402:2: iv_ruleSizeExpression= ruleSizeExpression EOF
            {
             newCompositeNode(grammarAccess.getSizeExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSizeExpression=ruleSizeExpression();

            state._fsp--;

             current =iv_ruleSizeExpression; 
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
    // $ANTLR end "entryRuleSizeExpression"


    // $ANTLR start "ruleSizeExpression"
    // InternalPageGeneratorLanguare.g:2408:1: ruleSizeExpression returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleSizeExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalPageGeneratorLanguare.g:2414:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalPageGeneratorLanguare.g:2415:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalPageGeneratorLanguare.g:2415:2: ( (otherlv_0= RULE_ID ) )
            // InternalPageGeneratorLanguare.g:2416:3: (otherlv_0= RULE_ID )
            {
            // InternalPageGeneratorLanguare.g:2416:3: (otherlv_0= RULE_ID )
            // InternalPageGeneratorLanguare.g:2417:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSizeExpressionRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getSizeExpressionAccess().getSizeSizeDeclarationCrossReference_0());
            			

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
        }
        return current;
    }
    // $ANTLR end "ruleSizeExpression"


    // $ANTLR start "entryRuleprimaryColour"
    // InternalPageGeneratorLanguare.g:2431:1: entryRuleprimaryColour returns [EObject current=null] : iv_ruleprimaryColour= ruleprimaryColour EOF ;
    public final EObject entryRuleprimaryColour() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprimaryColour = null;


        try {
            // InternalPageGeneratorLanguare.g:2431:54: (iv_ruleprimaryColour= ruleprimaryColour EOF )
            // InternalPageGeneratorLanguare.g:2432:2: iv_ruleprimaryColour= ruleprimaryColour EOF
            {
             newCompositeNode(grammarAccess.getPrimaryColourRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleprimaryColour=ruleprimaryColour();

            state._fsp--;

             current =iv_ruleprimaryColour; 
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
    // $ANTLR end "entryRuleprimaryColour"


    // $ANTLR start "ruleprimaryColour"
    // InternalPageGeneratorLanguare.g:2438:1: ruleprimaryColour returns [EObject current=null] : (this_ColourExpression_0= ruleColourExpression | this_colourValue_1= rulecolourValue ) ;
    public final EObject ruleprimaryColour() throws RecognitionException {
        EObject current = null;

        EObject this_ColourExpression_0 = null;

        EObject this_colourValue_1 = null;



        	enterRule();

        try {
            // InternalPageGeneratorLanguare.g:2444:2: ( (this_ColourExpression_0= ruleColourExpression | this_colourValue_1= rulecolourValue ) )
            // InternalPageGeneratorLanguare.g:2445:2: (this_ColourExpression_0= ruleColourExpression | this_colourValue_1= rulecolourValue )
            {
            // InternalPageGeneratorLanguare.g:2445:2: (this_ColourExpression_0= ruleColourExpression | this_colourValue_1= rulecolourValue )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==RULE_ID) ) {
                alt83=1;
            }
            else if ( (LA83_0==RULE_STRING) ) {
                alt83=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:2446:3: this_ColourExpression_0= ruleColourExpression
                    {

                    			newCompositeNode(grammarAccess.getPrimaryColourAccess().getColourExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ColourExpression_0=ruleColourExpression();

                    state._fsp--;


                    			current = this_ColourExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPageGeneratorLanguare.g:2455:3: this_colourValue_1= rulecolourValue
                    {

                    			newCompositeNode(grammarAccess.getPrimaryColourAccess().getColourValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_colourValue_1=rulecolourValue();

                    state._fsp--;


                    			current = this_colourValue_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleprimaryColour"


    // $ANTLR start "entryRulecolourValue"
    // InternalPageGeneratorLanguare.g:2467:1: entryRulecolourValue returns [EObject current=null] : iv_rulecolourValue= rulecolourValue EOF ;
    public final EObject entryRulecolourValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecolourValue = null;


        try {
            // InternalPageGeneratorLanguare.g:2467:52: (iv_rulecolourValue= rulecolourValue EOF )
            // InternalPageGeneratorLanguare.g:2468:2: iv_rulecolourValue= rulecolourValue EOF
            {
             newCompositeNode(grammarAccess.getColourValueRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecolourValue=rulecolourValue();

            state._fsp--;

             current =iv_rulecolourValue; 
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
    // $ANTLR end "entryRulecolourValue"


    // $ANTLR start "rulecolourValue"
    // InternalPageGeneratorLanguare.g:2474:1: rulecolourValue returns [EObject current=null] : ( (lv_colour_0_0= RULE_STRING ) ) ;
    public final EObject rulecolourValue() throws RecognitionException {
        EObject current = null;

        Token lv_colour_0_0=null;


        	enterRule();

        try {
            // InternalPageGeneratorLanguare.g:2480:2: ( ( (lv_colour_0_0= RULE_STRING ) ) )
            // InternalPageGeneratorLanguare.g:2481:2: ( (lv_colour_0_0= RULE_STRING ) )
            {
            // InternalPageGeneratorLanguare.g:2481:2: ( (lv_colour_0_0= RULE_STRING ) )
            // InternalPageGeneratorLanguare.g:2482:3: (lv_colour_0_0= RULE_STRING )
            {
            // InternalPageGeneratorLanguare.g:2482:3: (lv_colour_0_0= RULE_STRING )
            // InternalPageGeneratorLanguare.g:2483:4: lv_colour_0_0= RULE_STRING
            {
            lv_colour_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_colour_0_0, grammarAccess.getColourValueAccess().getColourSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getColourValueRule());
            				}
            				setWithLastConsumed(
            					current,
            					"colour",
            					lv_colour_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
        }
        return current;
    }
    // $ANTLR end "rulecolourValue"


    // $ANTLR start "entryRuleColourRGB"
    // InternalPageGeneratorLanguare.g:2502:1: entryRuleColourRGB returns [EObject current=null] : iv_ruleColourRGB= ruleColourRGB EOF ;
    public final EObject entryRuleColourRGB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColourRGB = null;


        try {
            // InternalPageGeneratorLanguare.g:2502:50: (iv_ruleColourRGB= ruleColourRGB EOF )
            // InternalPageGeneratorLanguare.g:2503:2: iv_ruleColourRGB= ruleColourRGB EOF
            {
             newCompositeNode(grammarAccess.getColourRGBRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColourRGB=ruleColourRGB();

            state._fsp--;

             current =iv_ruleColourRGB; 
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
    // $ANTLR end "entryRuleColourRGB"


    // $ANTLR start "ruleColourRGB"
    // InternalPageGeneratorLanguare.g:2509:1: ruleColourRGB returns [EObject current=null] : (otherlv_0= 'Custom' otherlv_1= 'colour' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_rgb_4_0= '(' ) ) ( (lv_red_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_green_7_0= RULE_INT ) ) otherlv_8= ',' ( (lv_blue_9_0= RULE_INT ) ) otherlv_10= ')' otherlv_11= ';' ) ;
    public final EObject ruleColourRGB() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_rgb_4_0=null;
        Token lv_red_5_0=null;
        Token otherlv_6=null;
        Token lv_green_7_0=null;
        Token otherlv_8=null;
        Token lv_blue_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalPageGeneratorLanguare.g:2515:2: ( (otherlv_0= 'Custom' otherlv_1= 'colour' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_rgb_4_0= '(' ) ) ( (lv_red_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_green_7_0= RULE_INT ) ) otherlv_8= ',' ( (lv_blue_9_0= RULE_INT ) ) otherlv_10= ')' otherlv_11= ';' ) )
            // InternalPageGeneratorLanguare.g:2516:2: (otherlv_0= 'Custom' otherlv_1= 'colour' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_rgb_4_0= '(' ) ) ( (lv_red_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_green_7_0= RULE_INT ) ) otherlv_8= ',' ( (lv_blue_9_0= RULE_INT ) ) otherlv_10= ')' otherlv_11= ';' )
            {
            // InternalPageGeneratorLanguare.g:2516:2: (otherlv_0= 'Custom' otherlv_1= 'colour' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_rgb_4_0= '(' ) ) ( (lv_red_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_green_7_0= RULE_INT ) ) otherlv_8= ',' ( (lv_blue_9_0= RULE_INT ) ) otherlv_10= ')' otherlv_11= ';' )
            // InternalPageGeneratorLanguare.g:2517:3: otherlv_0= 'Custom' otherlv_1= 'colour' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_rgb_4_0= '(' ) ) ( (lv_red_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_green_7_0= RULE_INT ) ) otherlv_8= ',' ( (lv_blue_9_0= RULE_INT ) ) otherlv_10= ')' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_62); 

            			newLeafNode(otherlv_0, grammarAccess.getColourRGBAccess().getCustomKeyword_0());
            		
            otherlv_1=(Token)match(input,45,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getColourRGBAccess().getColourKeyword_1());
            		
            // InternalPageGeneratorLanguare.g:2525:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalPageGeneratorLanguare.g:2526:4: (lv_name_2_0= RULE_ID )
            {
            // InternalPageGeneratorLanguare.g:2526:4: (lv_name_2_0= RULE_ID )
            // InternalPageGeneratorLanguare.g:2527:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getColourRGBAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColourRGBRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_63); 

            			newLeafNode(otherlv_3, grammarAccess.getColourRGBAccess().getEqualsSignKeyword_3());
            		
            // InternalPageGeneratorLanguare.g:2547:3: ( (lv_rgb_4_0= '(' ) )
            // InternalPageGeneratorLanguare.g:2548:4: (lv_rgb_4_0= '(' )
            {
            // InternalPageGeneratorLanguare.g:2548:4: (lv_rgb_4_0= '(' )
            // InternalPageGeneratorLanguare.g:2549:5: lv_rgb_4_0= '('
            {
            lv_rgb_4_0=(Token)match(input,46,FOLLOW_15); 

            					newLeafNode(lv_rgb_4_0, grammarAccess.getColourRGBAccess().getRgbLeftParenthesisKeyword_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColourRGBRule());
            					}
            					setWithLastConsumed(current, "rgb", lv_rgb_4_0, "(");
            				

            }


            }

            // InternalPageGeneratorLanguare.g:2561:3: ( (lv_red_5_0= RULE_INT ) )
            // InternalPageGeneratorLanguare.g:2562:4: (lv_red_5_0= RULE_INT )
            {
            // InternalPageGeneratorLanguare.g:2562:4: (lv_red_5_0= RULE_INT )
            // InternalPageGeneratorLanguare.g:2563:5: lv_red_5_0= RULE_INT
            {
            lv_red_5_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            					newLeafNode(lv_red_5_0, grammarAccess.getColourRGBAccess().getRedINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColourRGBRule());
            					}
            					setWithLastConsumed(
            						current,
            						"red",
            						lv_red_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,18,FOLLOW_15); 

            			newLeafNode(otherlv_6, grammarAccess.getColourRGBAccess().getCommaKeyword_6());
            		
            // InternalPageGeneratorLanguare.g:2583:3: ( (lv_green_7_0= RULE_INT ) )
            // InternalPageGeneratorLanguare.g:2584:4: (lv_green_7_0= RULE_INT )
            {
            // InternalPageGeneratorLanguare.g:2584:4: (lv_green_7_0= RULE_INT )
            // InternalPageGeneratorLanguare.g:2585:5: lv_green_7_0= RULE_INT
            {
            lv_green_7_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            					newLeafNode(lv_green_7_0, grammarAccess.getColourRGBAccess().getGreenINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColourRGBRule());
            					}
            					setWithLastConsumed(
            						current,
            						"green",
            						lv_green_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,18,FOLLOW_15); 

            			newLeafNode(otherlv_8, grammarAccess.getColourRGBAccess().getCommaKeyword_8());
            		
            // InternalPageGeneratorLanguare.g:2605:3: ( (lv_blue_9_0= RULE_INT ) )
            // InternalPageGeneratorLanguare.g:2606:4: (lv_blue_9_0= RULE_INT )
            {
            // InternalPageGeneratorLanguare.g:2606:4: (lv_blue_9_0= RULE_INT )
            // InternalPageGeneratorLanguare.g:2607:5: lv_blue_9_0= RULE_INT
            {
            lv_blue_9_0=(Token)match(input,RULE_INT,FOLLOW_64); 

            					newLeafNode(lv_blue_9_0, grammarAccess.getColourRGBAccess().getBlueINTTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColourRGBRule());
            					}
            					setWithLastConsumed(
            						current,
            						"blue",
            						lv_blue_9_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_10=(Token)match(input,47,FOLLOW_8); 

            			newLeafNode(otherlv_10, grammarAccess.getColourRGBAccess().getRightParenthesisKeyword_10());
            		
            otherlv_11=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getColourRGBAccess().getSemicolonKeyword_11());
            		

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
    // $ANTLR end "ruleColourRGB"


    // $ANTLR start "entryRuleColourExpression"
    // InternalPageGeneratorLanguare.g:2635:1: entryRuleColourExpression returns [EObject current=null] : iv_ruleColourExpression= ruleColourExpression EOF ;
    public final EObject entryRuleColourExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColourExpression = null;


        try {
            // InternalPageGeneratorLanguare.g:2635:57: (iv_ruleColourExpression= ruleColourExpression EOF )
            // InternalPageGeneratorLanguare.g:2636:2: iv_ruleColourExpression= ruleColourExpression EOF
            {
             newCompositeNode(grammarAccess.getColourExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColourExpression=ruleColourExpression();

            state._fsp--;

             current =iv_ruleColourExpression; 
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
    // $ANTLR end "entryRuleColourExpression"


    // $ANTLR start "ruleColourExpression"
    // InternalPageGeneratorLanguare.g:2642:1: ruleColourExpression returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleColourExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalPageGeneratorLanguare.g:2648:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalPageGeneratorLanguare.g:2649:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalPageGeneratorLanguare.g:2649:2: ( (otherlv_0= RULE_ID ) )
            // InternalPageGeneratorLanguare.g:2650:3: (otherlv_0= RULE_ID )
            {
            // InternalPageGeneratorLanguare.g:2650:3: (otherlv_0= RULE_ID )
            // InternalPageGeneratorLanguare.g:2651:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getColourExpressionRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getColourExpressionAccess().getColourColourRGBCrossReference_0());
            			

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
        }
        return current;
    }
    // $ANTLR end "ruleColourExpression"


    // $ANTLR start "entryRuleContent"
    // InternalPageGeneratorLanguare.g:2665:1: entryRuleContent returns [EObject current=null] : iv_ruleContent= ruleContent EOF ;
    public final EObject entryRuleContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContent = null;


        try {
            // InternalPageGeneratorLanguare.g:2665:48: (iv_ruleContent= ruleContent EOF )
            // InternalPageGeneratorLanguare.g:2666:2: iv_ruleContent= ruleContent EOF
            {
             newCompositeNode(grammarAccess.getContentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContent=ruleContent();

            state._fsp--;

             current =iv_ruleContent; 
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
    // $ANTLR end "entryRuleContent"


    // $ANTLR start "ruleContent"
    // InternalPageGeneratorLanguare.g:2672:1: ruleContent returns [EObject current=null] : (this_primaryString_0= ruleprimaryString ( () ( ( (lv_separator_2_1= '+' | lv_separator_2_2= ',' ) ) ) ( (lv_right_3_0= ruleprimaryString ) ) )* ) ;
    public final EObject ruleContent() throws RecognitionException {
        EObject current = null;

        Token lv_separator_2_1=null;
        Token lv_separator_2_2=null;
        EObject this_primaryString_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPageGeneratorLanguare.g:2678:2: ( (this_primaryString_0= ruleprimaryString ( () ( ( (lv_separator_2_1= '+' | lv_separator_2_2= ',' ) ) ) ( (lv_right_3_0= ruleprimaryString ) ) )* ) )
            // InternalPageGeneratorLanguare.g:2679:2: (this_primaryString_0= ruleprimaryString ( () ( ( (lv_separator_2_1= '+' | lv_separator_2_2= ',' ) ) ) ( (lv_right_3_0= ruleprimaryString ) ) )* )
            {
            // InternalPageGeneratorLanguare.g:2679:2: (this_primaryString_0= ruleprimaryString ( () ( ( (lv_separator_2_1= '+' | lv_separator_2_2= ',' ) ) ) ( (lv_right_3_0= ruleprimaryString ) ) )* )
            // InternalPageGeneratorLanguare.g:2680:3: this_primaryString_0= ruleprimaryString ( () ( ( (lv_separator_2_1= '+' | lv_separator_2_2= ',' ) ) ) ( (lv_right_3_0= ruleprimaryString ) ) )*
            {

            			newCompositeNode(grammarAccess.getContentAccess().getPrimaryStringParserRuleCall_0());
            		
            pushFollow(FOLLOW_65);
            this_primaryString_0=ruleprimaryString();

            state._fsp--;


            			current = this_primaryString_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalPageGeneratorLanguare.g:2688:3: ( () ( ( (lv_separator_2_1= '+' | lv_separator_2_2= ',' ) ) ) ( (lv_right_3_0= ruleprimaryString ) ) )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==18||LA85_0==48) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // InternalPageGeneratorLanguare.g:2689:4: () ( ( (lv_separator_2_1= '+' | lv_separator_2_2= ',' ) ) ) ( (lv_right_3_0= ruleprimaryString ) )
            	    {
            	    // InternalPageGeneratorLanguare.g:2689:4: ()
            	    // InternalPageGeneratorLanguare.g:2690:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getContentAccess().getContentLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalPageGeneratorLanguare.g:2696:4: ( ( (lv_separator_2_1= '+' | lv_separator_2_2= ',' ) ) )
            	    // InternalPageGeneratorLanguare.g:2697:5: ( (lv_separator_2_1= '+' | lv_separator_2_2= ',' ) )
            	    {
            	    // InternalPageGeneratorLanguare.g:2697:5: ( (lv_separator_2_1= '+' | lv_separator_2_2= ',' ) )
            	    // InternalPageGeneratorLanguare.g:2698:6: (lv_separator_2_1= '+' | lv_separator_2_2= ',' )
            	    {
            	    // InternalPageGeneratorLanguare.g:2698:6: (lv_separator_2_1= '+' | lv_separator_2_2= ',' )
            	    int alt84=2;
            	    int LA84_0 = input.LA(1);

            	    if ( (LA84_0==48) ) {
            	        alt84=1;
            	    }
            	    else if ( (LA84_0==18) ) {
            	        alt84=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 84, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt84) {
            	        case 1 :
            	            // InternalPageGeneratorLanguare.g:2699:7: lv_separator_2_1= '+'
            	            {
            	            lv_separator_2_1=(Token)match(input,48,FOLLOW_18); 

            	            							newLeafNode(lv_separator_2_1, grammarAccess.getContentAccess().getSeparatorPlusSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getContentRule());
            	            							}
            	            							addWithLastConsumed(current, "separator", lv_separator_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalPageGeneratorLanguare.g:2710:7: lv_separator_2_2= ','
            	            {
            	            lv_separator_2_2=(Token)match(input,18,FOLLOW_18); 

            	            							newLeafNode(lv_separator_2_2, grammarAccess.getContentAccess().getSeparatorCommaKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getContentRule());
            	            							}
            	            							addWithLastConsumed(current, "separator", lv_separator_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalPageGeneratorLanguare.g:2723:4: ( (lv_right_3_0= ruleprimaryString ) )
            	    // InternalPageGeneratorLanguare.g:2724:5: (lv_right_3_0= ruleprimaryString )
            	    {
            	    // InternalPageGeneratorLanguare.g:2724:5: (lv_right_3_0= ruleprimaryString )
            	    // InternalPageGeneratorLanguare.g:2725:6: lv_right_3_0= ruleprimaryString
            	    {

            	    						newCompositeNode(grammarAccess.getContentAccess().getRightPrimaryStringParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_65);
            	    lv_right_3_0=ruleprimaryString();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getContentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"uk.ac.kcl.mdd.cw2.pageGenerator.PageGeneratorLanguare.primaryString");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop85;
                }
            } while (true);


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
    // $ANTLR end "ruleContent"


    // $ANTLR start "entryRuleprimaryString"
    // InternalPageGeneratorLanguare.g:2747:1: entryRuleprimaryString returns [EObject current=null] : iv_ruleprimaryString= ruleprimaryString EOF ;
    public final EObject entryRuleprimaryString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprimaryString = null;


        try {
            // InternalPageGeneratorLanguare.g:2747:54: (iv_ruleprimaryString= ruleprimaryString EOF )
            // InternalPageGeneratorLanguare.g:2748:2: iv_ruleprimaryString= ruleprimaryString EOF
            {
             newCompositeNode(grammarAccess.getPrimaryStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleprimaryString=ruleprimaryString();

            state._fsp--;

             current =iv_ruleprimaryString; 
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
    // $ANTLR end "entryRuleprimaryString"


    // $ANTLR start "ruleprimaryString"
    // InternalPageGeneratorLanguare.g:2754:1: ruleprimaryString returns [EObject current=null] : (this_stringValue_0= rulestringValue | this_stringReference_1= rulestringReference ) ;
    public final EObject ruleprimaryString() throws RecognitionException {
        EObject current = null;

        EObject this_stringValue_0 = null;

        EObject this_stringReference_1 = null;



        	enterRule();

        try {
            // InternalPageGeneratorLanguare.g:2760:2: ( (this_stringValue_0= rulestringValue | this_stringReference_1= rulestringReference ) )
            // InternalPageGeneratorLanguare.g:2761:2: (this_stringValue_0= rulestringValue | this_stringReference_1= rulestringReference )
            {
            // InternalPageGeneratorLanguare.g:2761:2: (this_stringValue_0= rulestringValue | this_stringReference_1= rulestringReference )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==RULE_STRING) ) {
                alt86=1;
            }
            else if ( (LA86_0==RULE_ID) ) {
                alt86=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }
            switch (alt86) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:2762:3: this_stringValue_0= rulestringValue
                    {

                    			newCompositeNode(grammarAccess.getPrimaryStringAccess().getStringValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_stringValue_0=rulestringValue();

                    state._fsp--;


                    			current = this_stringValue_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPageGeneratorLanguare.g:2771:3: this_stringReference_1= rulestringReference
                    {

                    			newCompositeNode(grammarAccess.getPrimaryStringAccess().getStringReferenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_stringReference_1=rulestringReference();

                    state._fsp--;


                    			current = this_stringReference_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleprimaryString"


    // $ANTLR start "entryRulestringValue"
    // InternalPageGeneratorLanguare.g:2783:1: entryRulestringValue returns [EObject current=null] : iv_rulestringValue= rulestringValue EOF ;
    public final EObject entryRulestringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestringValue = null;


        try {
            // InternalPageGeneratorLanguare.g:2783:52: (iv_rulestringValue= rulestringValue EOF )
            // InternalPageGeneratorLanguare.g:2784:2: iv_rulestringValue= rulestringValue EOF
            {
             newCompositeNode(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_1);
            iv_rulestringValue=rulestringValue();

            state._fsp--;

             current =iv_rulestringValue; 
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
    // $ANTLR end "entryRulestringValue"


    // $ANTLR start "rulestringValue"
    // InternalPageGeneratorLanguare.g:2790:1: rulestringValue returns [EObject current=null] : ( (lv_val_0_0= RULE_STRING ) ) ;
    public final EObject rulestringValue() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalPageGeneratorLanguare.g:2796:2: ( ( (lv_val_0_0= RULE_STRING ) ) )
            // InternalPageGeneratorLanguare.g:2797:2: ( (lv_val_0_0= RULE_STRING ) )
            {
            // InternalPageGeneratorLanguare.g:2797:2: ( (lv_val_0_0= RULE_STRING ) )
            // InternalPageGeneratorLanguare.g:2798:3: (lv_val_0_0= RULE_STRING )
            {
            // InternalPageGeneratorLanguare.g:2798:3: (lv_val_0_0= RULE_STRING )
            // InternalPageGeneratorLanguare.g:2799:4: lv_val_0_0= RULE_STRING
            {
            lv_val_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_val_0_0, grammarAccess.getStringValueAccess().getValSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringValueRule());
            				}
            				setWithLastConsumed(
            					current,
            					"val",
            					lv_val_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
        }
        return current;
    }
    // $ANTLR end "rulestringValue"


    // $ANTLR start "entryRulestringReference"
    // InternalPageGeneratorLanguare.g:2818:1: entryRulestringReference returns [EObject current=null] : iv_rulestringReference= rulestringReference EOF ;
    public final EObject entryRulestringReference() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestringReference = null;


        try {
            // InternalPageGeneratorLanguare.g:2818:56: (iv_rulestringReference= rulestringReference EOF )
            // InternalPageGeneratorLanguare.g:2819:2: iv_rulestringReference= rulestringReference EOF
            {
             newCompositeNode(grammarAccess.getStringReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_rulestringReference=rulestringReference();

            state._fsp--;

             current =iv_rulestringReference; 
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
    // $ANTLR end "entryRulestringReference"


    // $ANTLR start "rulestringReference"
    // InternalPageGeneratorLanguare.g:2825:1: rulestringReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject rulestringReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalPageGeneratorLanguare.g:2831:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalPageGeneratorLanguare.g:2832:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalPageGeneratorLanguare.g:2832:2: ( (otherlv_0= RULE_ID ) )
            // InternalPageGeneratorLanguare.g:2833:3: (otherlv_0= RULE_ID )
            {
            // InternalPageGeneratorLanguare.g:2833:3: (otherlv_0= RULE_ID )
            // InternalPageGeneratorLanguare.g:2834:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringReferenceRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getStringReferenceAccess().getStringreferenceStringDeclarationCrossReference_0());
            			

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
        }
        return current;
    }
    // $ANTLR end "rulestringReference"


    // $ANTLR start "entryRulestringDeclaration"
    // InternalPageGeneratorLanguare.g:2848:1: entryRulestringDeclaration returns [EObject current=null] : iv_rulestringDeclaration= rulestringDeclaration EOF ;
    public final EObject entryRulestringDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestringDeclaration = null;


        try {
            // InternalPageGeneratorLanguare.g:2848:58: (iv_rulestringDeclaration= rulestringDeclaration EOF )
            // InternalPageGeneratorLanguare.g:2849:2: iv_rulestringDeclaration= rulestringDeclaration EOF
            {
             newCompositeNode(grammarAccess.getStringDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulestringDeclaration=rulestringDeclaration();

            state._fsp--;

             current =iv_rulestringDeclaration; 
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
    // $ANTLR end "entryRulestringDeclaration"


    // $ANTLR start "rulestringDeclaration"
    // InternalPageGeneratorLanguare.g:2855:1: rulestringDeclaration returns [EObject current=null] : (otherlv_0= 'Hightlight-word' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '<' (otherlv_3= 'Font-colour' otherlv_4= '=' ( (lv_fontColor_5_0= ruleprimaryColour ) ) (otherlv_6= ',' )? )? (otherlv_7= 'Font-size' otherlv_8= '=' ( (lv_fontSize_9_0= RULE_INT ) ) (otherlv_10= ',' )? )? otherlv_11= '>' otherlv_12= '=' ( (lv_word_13_0= RULE_STRING ) ) otherlv_14= ';' ) ;
    public final EObject rulestringDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_fontSize_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_word_13_0=null;
        Token otherlv_14=null;
        EObject lv_fontColor_5_0 = null;



        	enterRule();

        try {
            // InternalPageGeneratorLanguare.g:2861:2: ( (otherlv_0= 'Hightlight-word' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '<' (otherlv_3= 'Font-colour' otherlv_4= '=' ( (lv_fontColor_5_0= ruleprimaryColour ) ) (otherlv_6= ',' )? )? (otherlv_7= 'Font-size' otherlv_8= '=' ( (lv_fontSize_9_0= RULE_INT ) ) (otherlv_10= ',' )? )? otherlv_11= '>' otherlv_12= '=' ( (lv_word_13_0= RULE_STRING ) ) otherlv_14= ';' ) )
            // InternalPageGeneratorLanguare.g:2862:2: (otherlv_0= 'Hightlight-word' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '<' (otherlv_3= 'Font-colour' otherlv_4= '=' ( (lv_fontColor_5_0= ruleprimaryColour ) ) (otherlv_6= ',' )? )? (otherlv_7= 'Font-size' otherlv_8= '=' ( (lv_fontSize_9_0= RULE_INT ) ) (otherlv_10= ',' )? )? otherlv_11= '>' otherlv_12= '=' ( (lv_word_13_0= RULE_STRING ) ) otherlv_14= ';' )
            {
            // InternalPageGeneratorLanguare.g:2862:2: (otherlv_0= 'Hightlight-word' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '<' (otherlv_3= 'Font-colour' otherlv_4= '=' ( (lv_fontColor_5_0= ruleprimaryColour ) ) (otherlv_6= ',' )? )? (otherlv_7= 'Font-size' otherlv_8= '=' ( (lv_fontSize_9_0= RULE_INT ) ) (otherlv_10= ',' )? )? otherlv_11= '>' otherlv_12= '=' ( (lv_word_13_0= RULE_STRING ) ) otherlv_14= ';' )
            // InternalPageGeneratorLanguare.g:2863:3: otherlv_0= 'Hightlight-word' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '<' (otherlv_3= 'Font-colour' otherlv_4= '=' ( (lv_fontColor_5_0= ruleprimaryColour ) ) (otherlv_6= ',' )? )? (otherlv_7= 'Font-size' otherlv_8= '=' ( (lv_fontSize_9_0= RULE_INT ) ) (otherlv_10= ',' )? )? otherlv_11= '>' otherlv_12= '=' ( (lv_word_13_0= RULE_STRING ) ) otherlv_14= ';'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getStringDeclarationAccess().getHightlightWordKeyword_0());
            		
            // InternalPageGeneratorLanguare.g:2867:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPageGeneratorLanguare.g:2868:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPageGeneratorLanguare.g:2868:4: (lv_name_1_0= RULE_ID )
            // InternalPageGeneratorLanguare.g:2869:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStringDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStringDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_66); 

            			newLeafNode(otherlv_2, grammarAccess.getStringDeclarationAccess().getLessThanSignKeyword_2());
            		
            // InternalPageGeneratorLanguare.g:2889:3: (otherlv_3= 'Font-colour' otherlv_4= '=' ( (lv_fontColor_5_0= ruleprimaryColour ) ) (otherlv_6= ',' )? )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==24) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:2890:4: otherlv_3= 'Font-colour' otherlv_4= '=' ( (lv_fontColor_5_0= ruleprimaryColour ) ) (otherlv_6= ',' )?
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getStringDeclarationAccess().getFontColourKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,15,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getStringDeclarationAccess().getEqualsSignKeyword_3_1());
                    			
                    // InternalPageGeneratorLanguare.g:2898:4: ( (lv_fontColor_5_0= ruleprimaryColour ) )
                    // InternalPageGeneratorLanguare.g:2899:5: (lv_fontColor_5_0= ruleprimaryColour )
                    {
                    // InternalPageGeneratorLanguare.g:2899:5: (lv_fontColor_5_0= ruleprimaryColour )
                    // InternalPageGeneratorLanguare.g:2900:6: lv_fontColor_5_0= ruleprimaryColour
                    {

                    						newCompositeNode(grammarAccess.getStringDeclarationAccess().getFontColorPrimaryColourParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_67);
                    lv_fontColor_5_0=ruleprimaryColour();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStringDeclarationRule());
                    						}
                    						set(
                    							current,
                    							"fontColor",
                    							lv_fontColor_5_0,
                    							"uk.ac.kcl.mdd.cw2.pageGenerator.PageGeneratorLanguare.primaryColour");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPageGeneratorLanguare.g:2917:4: (otherlv_6= ',' )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==18) ) {
                        alt87=1;
                    }
                    switch (alt87) {
                        case 1 :
                            // InternalPageGeneratorLanguare.g:2918:5: otherlv_6= ','
                            {
                            otherlv_6=(Token)match(input,18,FOLLOW_68); 

                            					newLeafNode(otherlv_6, grammarAccess.getStringDeclarationAccess().getCommaKeyword_3_3());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalPageGeneratorLanguare.g:2924:3: (otherlv_7= 'Font-size' otherlv_8= '=' ( (lv_fontSize_9_0= RULE_INT ) ) (otherlv_10= ',' )? )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==33) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalPageGeneratorLanguare.g:2925:4: otherlv_7= 'Font-size' otherlv_8= '=' ( (lv_fontSize_9_0= RULE_INT ) ) (otherlv_10= ',' )?
                    {
                    otherlv_7=(Token)match(input,33,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getStringDeclarationAccess().getFontSizeKeyword_4_0());
                    			
                    otherlv_8=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_8, grammarAccess.getStringDeclarationAccess().getEqualsSignKeyword_4_1());
                    			
                    // InternalPageGeneratorLanguare.g:2933:4: ( (lv_fontSize_9_0= RULE_INT ) )
                    // InternalPageGeneratorLanguare.g:2934:5: (lv_fontSize_9_0= RULE_INT )
                    {
                    // InternalPageGeneratorLanguare.g:2934:5: (lv_fontSize_9_0= RULE_INT )
                    // InternalPageGeneratorLanguare.g:2935:6: lv_fontSize_9_0= RULE_INT
                    {
                    lv_fontSize_9_0=(Token)match(input,RULE_INT,FOLLOW_29); 

                    						newLeafNode(lv_fontSize_9_0, grammarAccess.getStringDeclarationAccess().getFontSizeINTTerminalRuleCall_4_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStringDeclarationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"fontSize",
                    							lv_fontSize_9_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalPageGeneratorLanguare.g:2951:4: (otherlv_10= ',' )?
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==18) ) {
                        alt89=1;
                    }
                    switch (alt89) {
                        case 1 :
                            // InternalPageGeneratorLanguare.g:2952:5: otherlv_10= ','
                            {
                            otherlv_10=(Token)match(input,18,FOLLOW_30); 

                            					newLeafNode(otherlv_10, grammarAccess.getStringDeclarationAccess().getCommaKeyword_4_3());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,30,FOLLOW_6); 

            			newLeafNode(otherlv_11, grammarAccess.getStringDeclarationAccess().getGreaterThanSignKeyword_5());
            		
            otherlv_12=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_12, grammarAccess.getStringDeclarationAccess().getEqualsSignKeyword_6());
            		
            // InternalPageGeneratorLanguare.g:2966:3: ( (lv_word_13_0= RULE_STRING ) )
            // InternalPageGeneratorLanguare.g:2967:4: (lv_word_13_0= RULE_STRING )
            {
            // InternalPageGeneratorLanguare.g:2967:4: (lv_word_13_0= RULE_STRING )
            // InternalPageGeneratorLanguare.g:2968:5: lv_word_13_0= RULE_STRING
            {
            lv_word_13_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_word_13_0, grammarAccess.getStringDeclarationAccess().getWordSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStringDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"word",
            						lv_word_13_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_14=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getStringDeclarationAccess().getSemicolonKeyword_8());
            		

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
    // $ANTLR end "rulestringDeclaration"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0002100800100802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000026000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0002106C80302800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000007F040000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000007F000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000007E040000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000007E000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000007C040000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000007C000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000078040000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000078000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000070040000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000060040000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000040040000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000000037F000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000000027F040000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000000027F000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000000027B040000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000000027B000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000273040000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000273000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000263040000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000263000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000243040000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000243000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000242040000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000242000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000042040000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000042000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x000000187E000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x000000107E040000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x000000107E000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x000000027E040000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x000000027E000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x000007807C000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x000007007C040000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x000007007C000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x000006007C040000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x000006007C000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x000004007C040000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x000004007C000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0002106C80300800L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0001000000040002L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000241000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000240040000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000240000000L});

}