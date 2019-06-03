package org.xtext.unina.xdstmdata.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.unina.xdstmdata.services.XdstmdataGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXdstmdataParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Enum'", "'{'", "','", "'}'", "';'", "'Struct'", "'Int'", "'Bool'", "'Chn['", "']'", "'Chn[Int]'", "'Chn[Bool]'", "'Mtype'", "'Chn'", "'internal'", "'['", "'of'", "'external'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalXdstmdataParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalXdstmdataParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalXdstmdataParser.tokenNames; }
    public String getGrammarFileName() { return "InternalXdstmdata.g"; }



     	private XdstmdataGrammarAccess grammarAccess;

        public InternalXdstmdataParser(TokenStream input, XdstmdataGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "tTypes";
       	}

       	@Override
       	protected XdstmdataGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuletTypes"
    // InternalXdstmdata.g:64:1: entryRuletTypes returns [EObject current=null] : iv_ruletTypes= ruletTypes EOF ;
    public final EObject entryRuletTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletTypes = null;


        try {
            // InternalXdstmdata.g:64:47: (iv_ruletTypes= ruletTypes EOF )
            // InternalXdstmdata.g:65:2: iv_ruletTypes= ruletTypes EOF
            {
             newCompositeNode(grammarAccess.getTTypesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletTypes=ruletTypes();

            state._fsp--;

             current =iv_ruletTypes; 
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
    // $ANTLR end "entryRuletTypes"


    // $ANTLR start "ruletTypes"
    // InternalXdstmdata.g:71:1: ruletTypes returns [EObject current=null] : ( ( ( (lv_tEnum_0_0= ruletEnum ) ) | ( (lv_tCompound_1_0= ruletCompound ) ) | ( (lv_tMultitype_2_0= ruletMultitype ) ) )* ( ( (lv_cIntchannel_3_0= rulecIntchannel ) ) | ( (lv_cExtchannel_4_0= rulecExtchannel ) ) | ( (lv_vVariable_5_0= rulevVariable ) ) )* ) ;
    public final EObject ruletTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_tEnum_0_0 = null;

        EObject lv_tCompound_1_0 = null;

        EObject lv_tMultitype_2_0 = null;

        EObject lv_cIntchannel_3_0 = null;

        EObject lv_cExtchannel_4_0 = null;

        EObject lv_vVariable_5_0 = null;



        	enterRule();

        try {
            // InternalXdstmdata.g:77:2: ( ( ( ( (lv_tEnum_0_0= ruletEnum ) ) | ( (lv_tCompound_1_0= ruletCompound ) ) | ( (lv_tMultitype_2_0= ruletMultitype ) ) )* ( ( (lv_cIntchannel_3_0= rulecIntchannel ) ) | ( (lv_cExtchannel_4_0= rulecExtchannel ) ) | ( (lv_vVariable_5_0= rulevVariable ) ) )* ) )
            // InternalXdstmdata.g:78:2: ( ( ( (lv_tEnum_0_0= ruletEnum ) ) | ( (lv_tCompound_1_0= ruletCompound ) ) | ( (lv_tMultitype_2_0= ruletMultitype ) ) )* ( ( (lv_cIntchannel_3_0= rulecIntchannel ) ) | ( (lv_cExtchannel_4_0= rulecExtchannel ) ) | ( (lv_vVariable_5_0= rulevVariable ) ) )* )
            {
            // InternalXdstmdata.g:78:2: ( ( ( (lv_tEnum_0_0= ruletEnum ) ) | ( (lv_tCompound_1_0= ruletCompound ) ) | ( (lv_tMultitype_2_0= ruletMultitype ) ) )* ( ( (lv_cIntchannel_3_0= rulecIntchannel ) ) | ( (lv_cExtchannel_4_0= rulecExtchannel ) ) | ( (lv_vVariable_5_0= rulevVariable ) ) )* )
            // InternalXdstmdata.g:79:3: ( ( (lv_tEnum_0_0= ruletEnum ) ) | ( (lv_tCompound_1_0= ruletCompound ) ) | ( (lv_tMultitype_2_0= ruletMultitype ) ) )* ( ( (lv_cIntchannel_3_0= rulecIntchannel ) ) | ( (lv_cExtchannel_4_0= rulecExtchannel ) ) | ( (lv_vVariable_5_0= rulevVariable ) ) )*
            {
            // InternalXdstmdata.g:79:3: ( ( (lv_tEnum_0_0= ruletEnum ) ) | ( (lv_tCompound_1_0= ruletCompound ) ) | ( (lv_tMultitype_2_0= ruletMultitype ) ) )*
            loop1:
            do {
                int alt1=4;
                switch ( input.LA(1) ) {
                case 11:
                    {
                    alt1=1;
                    }
                    break;
                case 16:
                    {
                    alt1=2;
                    }
                    break;
                case 23:
                    {
                    alt1=3;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // InternalXdstmdata.g:80:4: ( (lv_tEnum_0_0= ruletEnum ) )
            	    {
            	    // InternalXdstmdata.g:80:4: ( (lv_tEnum_0_0= ruletEnum ) )
            	    // InternalXdstmdata.g:81:5: (lv_tEnum_0_0= ruletEnum )
            	    {
            	    // InternalXdstmdata.g:81:5: (lv_tEnum_0_0= ruletEnum )
            	    // InternalXdstmdata.g:82:6: lv_tEnum_0_0= ruletEnum
            	    {

            	    						newCompositeNode(grammarAccess.getTTypesAccess().getTEnumTEnumParserRuleCall_0_0_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_tEnum_0_0=ruletEnum();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTTypesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"tEnum",
            	    							lv_tEnum_0_0,
            	    							"org.xtext.unina.xdstmdata.Xdstmdata.tEnum");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalXdstmdata.g:100:4: ( (lv_tCompound_1_0= ruletCompound ) )
            	    {
            	    // InternalXdstmdata.g:100:4: ( (lv_tCompound_1_0= ruletCompound ) )
            	    // InternalXdstmdata.g:101:5: (lv_tCompound_1_0= ruletCompound )
            	    {
            	    // InternalXdstmdata.g:101:5: (lv_tCompound_1_0= ruletCompound )
            	    // InternalXdstmdata.g:102:6: lv_tCompound_1_0= ruletCompound
            	    {

            	    						newCompositeNode(grammarAccess.getTTypesAccess().getTCompoundTCompoundParserRuleCall_0_1_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_tCompound_1_0=ruletCompound();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTTypesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"tCompound",
            	    							lv_tCompound_1_0,
            	    							"org.xtext.unina.xdstmdata.Xdstmdata.tCompound");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalXdstmdata.g:120:4: ( (lv_tMultitype_2_0= ruletMultitype ) )
            	    {
            	    // InternalXdstmdata.g:120:4: ( (lv_tMultitype_2_0= ruletMultitype ) )
            	    // InternalXdstmdata.g:121:5: (lv_tMultitype_2_0= ruletMultitype )
            	    {
            	    // InternalXdstmdata.g:121:5: (lv_tMultitype_2_0= ruletMultitype )
            	    // InternalXdstmdata.g:122:6: lv_tMultitype_2_0= ruletMultitype
            	    {

            	    						newCompositeNode(grammarAccess.getTTypesAccess().getTMultitypeTMultitypeParserRuleCall_0_2_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_tMultitype_2_0=ruletMultitype();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTTypesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"tMultitype",
            	    							lv_tMultitype_2_0,
            	    							"org.xtext.unina.xdstmdata.Xdstmdata.tMultitype");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalXdstmdata.g:140:3: ( ( (lv_cIntchannel_3_0= rulecIntchannel ) ) | ( (lv_cExtchannel_4_0= rulecExtchannel ) ) | ( (lv_vVariable_5_0= rulevVariable ) ) )*
            loop2:
            do {
                int alt2=4;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==24) ) {
                    int LA2_2 = input.LA(2);

                    if ( (LA2_2==25) ) {
                        alt2=1;
                    }
                    else if ( (LA2_2==28) ) {
                        alt2=2;
                    }


                }
                else if ( (LA2_0==RULE_ID||(LA2_0>=17 && LA2_0<=19)||(LA2_0>=21 && LA2_0<=22)) ) {
                    alt2=3;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalXdstmdata.g:141:4: ( (lv_cIntchannel_3_0= rulecIntchannel ) )
            	    {
            	    // InternalXdstmdata.g:141:4: ( (lv_cIntchannel_3_0= rulecIntchannel ) )
            	    // InternalXdstmdata.g:142:5: (lv_cIntchannel_3_0= rulecIntchannel )
            	    {
            	    // InternalXdstmdata.g:142:5: (lv_cIntchannel_3_0= rulecIntchannel )
            	    // InternalXdstmdata.g:143:6: lv_cIntchannel_3_0= rulecIntchannel
            	    {

            	    						newCompositeNode(grammarAccess.getTTypesAccess().getCIntchannelCIntchannelParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_cIntchannel_3_0=rulecIntchannel();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTTypesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"cIntchannel",
            	    							lv_cIntchannel_3_0,
            	    							"org.xtext.unina.xdstmdata.Xdstmdata.cIntchannel");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalXdstmdata.g:161:4: ( (lv_cExtchannel_4_0= rulecExtchannel ) )
            	    {
            	    // InternalXdstmdata.g:161:4: ( (lv_cExtchannel_4_0= rulecExtchannel ) )
            	    // InternalXdstmdata.g:162:5: (lv_cExtchannel_4_0= rulecExtchannel )
            	    {
            	    // InternalXdstmdata.g:162:5: (lv_cExtchannel_4_0= rulecExtchannel )
            	    // InternalXdstmdata.g:163:6: lv_cExtchannel_4_0= rulecExtchannel
            	    {

            	    						newCompositeNode(grammarAccess.getTTypesAccess().getCExtchannelCExtchannelParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_cExtchannel_4_0=rulecExtchannel();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTTypesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"cExtchannel",
            	    							lv_cExtchannel_4_0,
            	    							"org.xtext.unina.xdstmdata.Xdstmdata.cExtchannel");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalXdstmdata.g:181:4: ( (lv_vVariable_5_0= rulevVariable ) )
            	    {
            	    // InternalXdstmdata.g:181:4: ( (lv_vVariable_5_0= rulevVariable ) )
            	    // InternalXdstmdata.g:182:5: (lv_vVariable_5_0= rulevVariable )
            	    {
            	    // InternalXdstmdata.g:182:5: (lv_vVariable_5_0= rulevVariable )
            	    // InternalXdstmdata.g:183:6: lv_vVariable_5_0= rulevVariable
            	    {

            	    						newCompositeNode(grammarAccess.getTTypesAccess().getVVariableVVariableParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_vVariable_5_0=rulevVariable();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTTypesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"vVariable",
            	    							lv_vVariable_5_0,
            	    							"org.xtext.unina.xdstmdata.Xdstmdata.vVariable");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruletTypes"


    // $ANTLR start "entryRuletEnum"
    // InternalXdstmdata.g:205:1: entryRuletEnum returns [EObject current=null] : iv_ruletEnum= ruletEnum EOF ;
    public final EObject entryRuletEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletEnum = null;


        try {
            // InternalXdstmdata.g:205:46: (iv_ruletEnum= ruletEnum EOF )
            // InternalXdstmdata.g:206:2: iv_ruletEnum= ruletEnum EOF
            {
             newCompositeNode(grammarAccess.getTEnumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletEnum=ruletEnum();

            state._fsp--;

             current =iv_ruletEnum; 
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
    // $ANTLR end "entryRuletEnum"


    // $ANTLR start "ruletEnum"
    // InternalXdstmdata.g:212:1: ruletEnum returns [EObject current=null] : (otherlv_0= 'Enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_literals_5_0= RULE_ID ) ) )* otherlv_6= '}' otherlv_7= ';' ) ;
    public final EObject ruletEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_literals_3_0=null;
        Token otherlv_4=null;
        Token lv_literals_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalXdstmdata.g:218:2: ( (otherlv_0= 'Enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_literals_5_0= RULE_ID ) ) )* otherlv_6= '}' otherlv_7= ';' ) )
            // InternalXdstmdata.g:219:2: (otherlv_0= 'Enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_literals_5_0= RULE_ID ) ) )* otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalXdstmdata.g:219:2: (otherlv_0= 'Enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_literals_5_0= RULE_ID ) ) )* otherlv_6= '}' otherlv_7= ';' )
            // InternalXdstmdata.g:220:3: otherlv_0= 'Enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_literals_5_0= RULE_ID ) ) )* otherlv_6= '}' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTEnumAccess().getEnumKeyword_0());
            		
            // InternalXdstmdata.g:224:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXdstmdata.g:225:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXdstmdata.g:225:4: (lv_name_1_0= RULE_ID )
            // InternalXdstmdata.g:226:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTEnumAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTEnumRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getTEnumAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXdstmdata.g:246:3: ( (lv_literals_3_0= RULE_ID ) )
            // InternalXdstmdata.g:247:4: (lv_literals_3_0= RULE_ID )
            {
            // InternalXdstmdata.g:247:4: (lv_literals_3_0= RULE_ID )
            // InternalXdstmdata.g:248:5: lv_literals_3_0= RULE_ID
            {
            lv_literals_3_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_literals_3_0, grammarAccess.getTEnumAccess().getLiteralsIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTEnumRule());
            					}
            					addWithLastConsumed(
            						current,
            						"literals",
            						lv_literals_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalXdstmdata.g:264:3: (otherlv_4= ',' ( (lv_literals_5_0= RULE_ID ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalXdstmdata.g:265:4: otherlv_4= ',' ( (lv_literals_5_0= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_5); 

            	    				newLeafNode(otherlv_4, grammarAccess.getTEnumAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalXdstmdata.g:269:4: ( (lv_literals_5_0= RULE_ID ) )
            	    // InternalXdstmdata.g:270:5: (lv_literals_5_0= RULE_ID )
            	    {
            	    // InternalXdstmdata.g:270:5: (lv_literals_5_0= RULE_ID )
            	    // InternalXdstmdata.g:271:6: lv_literals_5_0= RULE_ID
            	    {
            	    lv_literals_5_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            	    						newLeafNode(lv_literals_5_0, grammarAccess.getTEnumAccess().getLiteralsIDTerminalRuleCall_4_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getTEnumRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"literals",
            	    							lv_literals_5_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getTEnumAccess().getRightCurlyBracketKeyword_5());
            		
            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getTEnumAccess().getSemicolonKeyword_6());
            		

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
    // $ANTLR end "ruletEnum"


    // $ANTLR start "entryRuletCompound"
    // InternalXdstmdata.g:300:1: entryRuletCompound returns [EObject current=null] : iv_ruletCompound= ruletCompound EOF ;
    public final EObject entryRuletCompound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletCompound = null;


        try {
            // InternalXdstmdata.g:300:50: (iv_ruletCompound= ruletCompound EOF )
            // InternalXdstmdata.g:301:2: iv_ruletCompound= ruletCompound EOF
            {
             newCompositeNode(grammarAccess.getTCompoundRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletCompound=ruletCompound();

            state._fsp--;

             current =iv_ruletCompound; 
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
    // $ANTLR end "entryRuletCompound"


    // $ANTLR start "ruletCompound"
    // InternalXdstmdata.g:307:1: ruletCompound returns [EObject current=null] : (otherlv_0= 'Struct' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_subtypes_3_0= rulesubtype ) ) (otherlv_4= ',' ( (lv_subtypes_5_0= rulesubtype ) ) )* otherlv_6= '}' otherlv_7= ';' ) ;
    public final EObject ruletCompound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_subtypes_3_0 = null;

        EObject lv_subtypes_5_0 = null;



        	enterRule();

        try {
            // InternalXdstmdata.g:313:2: ( (otherlv_0= 'Struct' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_subtypes_3_0= rulesubtype ) ) (otherlv_4= ',' ( (lv_subtypes_5_0= rulesubtype ) ) )* otherlv_6= '}' otherlv_7= ';' ) )
            // InternalXdstmdata.g:314:2: (otherlv_0= 'Struct' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_subtypes_3_0= rulesubtype ) ) (otherlv_4= ',' ( (lv_subtypes_5_0= rulesubtype ) ) )* otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalXdstmdata.g:314:2: (otherlv_0= 'Struct' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_subtypes_3_0= rulesubtype ) ) (otherlv_4= ',' ( (lv_subtypes_5_0= rulesubtype ) ) )* otherlv_6= '}' otherlv_7= ';' )
            // InternalXdstmdata.g:315:3: otherlv_0= 'Struct' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_subtypes_3_0= rulesubtype ) ) (otherlv_4= ',' ( (lv_subtypes_5_0= rulesubtype ) ) )* otherlv_6= '}' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTCompoundAccess().getStructKeyword_0());
            		
            // InternalXdstmdata.g:319:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXdstmdata.g:320:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXdstmdata.g:320:4: (lv_name_1_0= RULE_ID )
            // InternalXdstmdata.g:321:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTCompoundAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTCompoundRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getTCompoundAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXdstmdata.g:341:3: ( (lv_subtypes_3_0= rulesubtype ) )
            // InternalXdstmdata.g:342:4: (lv_subtypes_3_0= rulesubtype )
            {
            // InternalXdstmdata.g:342:4: (lv_subtypes_3_0= rulesubtype )
            // InternalXdstmdata.g:343:5: lv_subtypes_3_0= rulesubtype
            {

            					newCompositeNode(grammarAccess.getTCompoundAccess().getSubtypesSubtypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_subtypes_3_0=rulesubtype();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTCompoundRule());
            					}
            					add(
            						current,
            						"subtypes",
            						lv_subtypes_3_0,
            						"org.xtext.unina.xdstmdata.Xdstmdata.subtype");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXdstmdata.g:360:3: (otherlv_4= ',' ( (lv_subtypes_5_0= rulesubtype ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalXdstmdata.g:361:4: otherlv_4= ',' ( (lv_subtypes_5_0= rulesubtype ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_9); 

            	    				newLeafNode(otherlv_4, grammarAccess.getTCompoundAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalXdstmdata.g:365:4: ( (lv_subtypes_5_0= rulesubtype ) )
            	    // InternalXdstmdata.g:366:5: (lv_subtypes_5_0= rulesubtype )
            	    {
            	    // InternalXdstmdata.g:366:5: (lv_subtypes_5_0= rulesubtype )
            	    // InternalXdstmdata.g:367:6: lv_subtypes_5_0= rulesubtype
            	    {

            	    						newCompositeNode(grammarAccess.getTCompoundAccess().getSubtypesSubtypeParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_subtypes_5_0=rulesubtype();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTCompoundRule());
            	    						}
            	    						add(
            	    							current,
            	    							"subtypes",
            	    							lv_subtypes_5_0,
            	    							"org.xtext.unina.xdstmdata.Xdstmdata.subtype");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getTCompoundAccess().getRightCurlyBracketKeyword_5());
            		
            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getTCompoundAccess().getSemicolonKeyword_6());
            		

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
    // $ANTLR end "ruletCompound"


    // $ANTLR start "entryRulesubtype"
    // InternalXdstmdata.g:397:1: entryRulesubtype returns [EObject current=null] : iv_rulesubtype= rulesubtype EOF ;
    public final EObject entryRulesubtype() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesubtype = null;


        try {
            // InternalXdstmdata.g:397:48: (iv_rulesubtype= rulesubtype EOF )
            // InternalXdstmdata.g:398:2: iv_rulesubtype= rulesubtype EOF
            {
             newCompositeNode(grammarAccess.getSubtypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulesubtype=rulesubtype();

            state._fsp--;

             current =iv_rulesubtype; 
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
    // $ANTLR end "entryRulesubtype"


    // $ANTLR start "rulesubtype"
    // InternalXdstmdata.g:404:1: rulesubtype returns [EObject current=null] : ( ( (lv_tString_0_0= 'Int' ) ) | ( (lv_tString_1_0= 'Bool' ) ) | ( (lv_tChn_2_0= rulechannel_specifier ) ) | ( (lv_tID_3_0= RULE_ID ) ) ) ;
    public final EObject rulesubtype() throws RecognitionException {
        EObject current = null;

        Token lv_tString_0_0=null;
        Token lv_tString_1_0=null;
        Token lv_tID_3_0=null;
        EObject lv_tChn_2_0 = null;



        	enterRule();

        try {
            // InternalXdstmdata.g:410:2: ( ( ( (lv_tString_0_0= 'Int' ) ) | ( (lv_tString_1_0= 'Bool' ) ) | ( (lv_tChn_2_0= rulechannel_specifier ) ) | ( (lv_tID_3_0= RULE_ID ) ) ) )
            // InternalXdstmdata.g:411:2: ( ( (lv_tString_0_0= 'Int' ) ) | ( (lv_tString_1_0= 'Bool' ) ) | ( (lv_tChn_2_0= rulechannel_specifier ) ) | ( (lv_tID_3_0= RULE_ID ) ) )
            {
            // InternalXdstmdata.g:411:2: ( ( (lv_tString_0_0= 'Int' ) ) | ( (lv_tString_1_0= 'Bool' ) ) | ( (lv_tChn_2_0= rulechannel_specifier ) ) | ( (lv_tID_3_0= RULE_ID ) ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt5=1;
                }
                break;
            case 18:
                {
                alt5=2;
                }
                break;
            case 19:
            case 21:
            case 22:
                {
                alt5=3;
                }
                break;
            case RULE_ID:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalXdstmdata.g:412:3: ( (lv_tString_0_0= 'Int' ) )
                    {
                    // InternalXdstmdata.g:412:3: ( (lv_tString_0_0= 'Int' ) )
                    // InternalXdstmdata.g:413:4: (lv_tString_0_0= 'Int' )
                    {
                    // InternalXdstmdata.g:413:4: (lv_tString_0_0= 'Int' )
                    // InternalXdstmdata.g:414:5: lv_tString_0_0= 'Int'
                    {
                    lv_tString_0_0=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(lv_tString_0_0, grammarAccess.getSubtypeAccess().getTStringIntKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSubtypeRule());
                    					}
                    					setWithLastConsumed(current, "tString", lv_tString_0_0, "Int");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXdstmdata.g:427:3: ( (lv_tString_1_0= 'Bool' ) )
                    {
                    // InternalXdstmdata.g:427:3: ( (lv_tString_1_0= 'Bool' ) )
                    // InternalXdstmdata.g:428:4: (lv_tString_1_0= 'Bool' )
                    {
                    // InternalXdstmdata.g:428:4: (lv_tString_1_0= 'Bool' )
                    // InternalXdstmdata.g:429:5: lv_tString_1_0= 'Bool'
                    {
                    lv_tString_1_0=(Token)match(input,18,FOLLOW_2); 

                    					newLeafNode(lv_tString_1_0, grammarAccess.getSubtypeAccess().getTStringBoolKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSubtypeRule());
                    					}
                    					setWithLastConsumed(current, "tString", lv_tString_1_0, "Bool");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalXdstmdata.g:442:3: ( (lv_tChn_2_0= rulechannel_specifier ) )
                    {
                    // InternalXdstmdata.g:442:3: ( (lv_tChn_2_0= rulechannel_specifier ) )
                    // InternalXdstmdata.g:443:4: (lv_tChn_2_0= rulechannel_specifier )
                    {
                    // InternalXdstmdata.g:443:4: (lv_tChn_2_0= rulechannel_specifier )
                    // InternalXdstmdata.g:444:5: lv_tChn_2_0= rulechannel_specifier
                    {

                    					newCompositeNode(grammarAccess.getSubtypeAccess().getTChnChannel_specifierParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_tChn_2_0=rulechannel_specifier();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSubtypeRule());
                    					}
                    					set(
                    						current,
                    						"tChn",
                    						lv_tChn_2_0,
                    						"org.xtext.unina.xdstmdata.Xdstmdata.channel_specifier");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalXdstmdata.g:462:3: ( (lv_tID_3_0= RULE_ID ) )
                    {
                    // InternalXdstmdata.g:462:3: ( (lv_tID_3_0= RULE_ID ) )
                    // InternalXdstmdata.g:463:4: (lv_tID_3_0= RULE_ID )
                    {
                    // InternalXdstmdata.g:463:4: (lv_tID_3_0= RULE_ID )
                    // InternalXdstmdata.g:464:5: lv_tID_3_0= RULE_ID
                    {
                    lv_tID_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_tID_3_0, grammarAccess.getSubtypeAccess().getTIDIDTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSubtypeRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"tID",
                    						lv_tID_3_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


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
    // $ANTLR end "rulesubtype"


    // $ANTLR start "entryRulechannel_specifier"
    // InternalXdstmdata.g:484:1: entryRulechannel_specifier returns [EObject current=null] : iv_rulechannel_specifier= rulechannel_specifier EOF ;
    public final EObject entryRulechannel_specifier() throws RecognitionException {
        EObject current = null;

        EObject iv_rulechannel_specifier = null;


        try {
            // InternalXdstmdata.g:484:58: (iv_rulechannel_specifier= rulechannel_specifier EOF )
            // InternalXdstmdata.g:485:2: iv_rulechannel_specifier= rulechannel_specifier EOF
            {
             newCompositeNode(grammarAccess.getChannel_specifierRule()); 
            pushFollow(FOLLOW_1);
            iv_rulechannel_specifier=rulechannel_specifier();

            state._fsp--;

             current =iv_rulechannel_specifier; 
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
    // $ANTLR end "entryRulechannel_specifier"


    // $ANTLR start "rulechannel_specifier"
    // InternalXdstmdata.g:491:1: rulechannel_specifier returns [EObject current=null] : ( ( () otherlv_1= 'Chn[' ( (lv_type_2_0= RULE_ID ) ) otherlv_3= ']' ) | otherlv_4= 'Chn[Int]' | otherlv_5= 'Chn[Bool]' ) ;
    public final EObject rulechannel_specifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_type_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalXdstmdata.g:497:2: ( ( ( () otherlv_1= 'Chn[' ( (lv_type_2_0= RULE_ID ) ) otherlv_3= ']' ) | otherlv_4= 'Chn[Int]' | otherlv_5= 'Chn[Bool]' ) )
            // InternalXdstmdata.g:498:2: ( ( () otherlv_1= 'Chn[' ( (lv_type_2_0= RULE_ID ) ) otherlv_3= ']' ) | otherlv_4= 'Chn[Int]' | otherlv_5= 'Chn[Bool]' )
            {
            // InternalXdstmdata.g:498:2: ( ( () otherlv_1= 'Chn[' ( (lv_type_2_0= RULE_ID ) ) otherlv_3= ']' ) | otherlv_4= 'Chn[Int]' | otherlv_5= 'Chn[Bool]' )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt6=1;
                }
                break;
            case 21:
                {
                alt6=2;
                }
                break;
            case 22:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalXdstmdata.g:499:3: ( () otherlv_1= 'Chn[' ( (lv_type_2_0= RULE_ID ) ) otherlv_3= ']' )
                    {
                    // InternalXdstmdata.g:499:3: ( () otherlv_1= 'Chn[' ( (lv_type_2_0= RULE_ID ) ) otherlv_3= ']' )
                    // InternalXdstmdata.g:500:4: () otherlv_1= 'Chn[' ( (lv_type_2_0= RULE_ID ) ) otherlv_3= ']'
                    {
                    // InternalXdstmdata.g:500:4: ()
                    // InternalXdstmdata.g:501:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getChannel_specifierAccess().getChannel_specifierAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,19,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getChannel_specifierAccess().getChnKeyword_0_1());
                    			
                    // InternalXdstmdata.g:511:4: ( (lv_type_2_0= RULE_ID ) )
                    // InternalXdstmdata.g:512:5: (lv_type_2_0= RULE_ID )
                    {
                    // InternalXdstmdata.g:512:5: (lv_type_2_0= RULE_ID )
                    // InternalXdstmdata.g:513:6: lv_type_2_0= RULE_ID
                    {
                    lv_type_2_0=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(lv_type_2_0, grammarAccess.getChannel_specifierAccess().getTypeIDTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChannel_specifierRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"type",
                    							lv_type_2_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getChannel_specifierAccess().getRightSquareBracketKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXdstmdata.g:535:3: otherlv_4= 'Chn[Int]'
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_2); 

                    			newLeafNode(otherlv_4, grammarAccess.getChannel_specifierAccess().getChnIntKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalXdstmdata.g:540:3: otherlv_5= 'Chn[Bool]'
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_2); 

                    			newLeafNode(otherlv_5, grammarAccess.getChannel_specifierAccess().getChnBoolKeyword_2());
                    		

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
    // $ANTLR end "rulechannel_specifier"


    // $ANTLR start "entryRuletMultitype"
    // InternalXdstmdata.g:548:1: entryRuletMultitype returns [EObject current=null] : iv_ruletMultitype= ruletMultitype EOF ;
    public final EObject entryRuletMultitype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletMultitype = null;


        try {
            // InternalXdstmdata.g:548:51: (iv_ruletMultitype= ruletMultitype EOF )
            // InternalXdstmdata.g:549:2: iv_ruletMultitype= ruletMultitype EOF
            {
             newCompositeNode(grammarAccess.getTMultitypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletMultitype=ruletMultitype();

            state._fsp--;

             current =iv_ruletMultitype; 
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
    // $ANTLR end "entryRuletMultitype"


    // $ANTLR start "ruletMultitype"
    // InternalXdstmdata.g:555:1: ruletMultitype returns [EObject current=null] : (otherlv_0= 'Mtype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_composingtypes_3_0= rulecomposingtype ) ) (otherlv_4= ',' ( (lv_composingtypes_5_0= rulecomposingtype ) ) )* otherlv_6= '}' otherlv_7= ';' ) ;
    public final EObject ruletMultitype() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_composingtypes_3_0 = null;

        EObject lv_composingtypes_5_0 = null;



        	enterRule();

        try {
            // InternalXdstmdata.g:561:2: ( (otherlv_0= 'Mtype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_composingtypes_3_0= rulecomposingtype ) ) (otherlv_4= ',' ( (lv_composingtypes_5_0= rulecomposingtype ) ) )* otherlv_6= '}' otherlv_7= ';' ) )
            // InternalXdstmdata.g:562:2: (otherlv_0= 'Mtype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_composingtypes_3_0= rulecomposingtype ) ) (otherlv_4= ',' ( (lv_composingtypes_5_0= rulecomposingtype ) ) )* otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalXdstmdata.g:562:2: (otherlv_0= 'Mtype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_composingtypes_3_0= rulecomposingtype ) ) (otherlv_4= ',' ( (lv_composingtypes_5_0= rulecomposingtype ) ) )* otherlv_6= '}' otherlv_7= ';' )
            // InternalXdstmdata.g:563:3: otherlv_0= 'Mtype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_composingtypes_3_0= rulecomposingtype ) ) (otherlv_4= ',' ( (lv_composingtypes_5_0= rulecomposingtype ) ) )* otherlv_6= '}' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTMultitypeAccess().getMtypeKeyword_0());
            		
            // InternalXdstmdata.g:567:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXdstmdata.g:568:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXdstmdata.g:568:4: (lv_name_1_0= RULE_ID )
            // InternalXdstmdata.g:569:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTMultitypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTMultitypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getTMultitypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXdstmdata.g:589:3: ( (lv_composingtypes_3_0= rulecomposingtype ) )
            // InternalXdstmdata.g:590:4: (lv_composingtypes_3_0= rulecomposingtype )
            {
            // InternalXdstmdata.g:590:4: (lv_composingtypes_3_0= rulecomposingtype )
            // InternalXdstmdata.g:591:5: lv_composingtypes_3_0= rulecomposingtype
            {

            					newCompositeNode(grammarAccess.getTMultitypeAccess().getComposingtypesComposingtypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_composingtypes_3_0=rulecomposingtype();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTMultitypeRule());
            					}
            					add(
            						current,
            						"composingtypes",
            						lv_composingtypes_3_0,
            						"org.xtext.unina.xdstmdata.Xdstmdata.composingtype");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXdstmdata.g:608:3: (otherlv_4= ',' ( (lv_composingtypes_5_0= rulecomposingtype ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==13) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalXdstmdata.g:609:4: otherlv_4= ',' ( (lv_composingtypes_5_0= rulecomposingtype ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_9); 

            	    				newLeafNode(otherlv_4, grammarAccess.getTMultitypeAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalXdstmdata.g:613:4: ( (lv_composingtypes_5_0= rulecomposingtype ) )
            	    // InternalXdstmdata.g:614:5: (lv_composingtypes_5_0= rulecomposingtype )
            	    {
            	    // InternalXdstmdata.g:614:5: (lv_composingtypes_5_0= rulecomposingtype )
            	    // InternalXdstmdata.g:615:6: lv_composingtypes_5_0= rulecomposingtype
            	    {

            	    						newCompositeNode(grammarAccess.getTMultitypeAccess().getComposingtypesComposingtypeParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_composingtypes_5_0=rulecomposingtype();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTMultitypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"composingtypes",
            	    							lv_composingtypes_5_0,
            	    							"org.xtext.unina.xdstmdata.Xdstmdata.composingtype");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getTMultitypeAccess().getRightCurlyBracketKeyword_5());
            		
            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getTMultitypeAccess().getSemicolonKeyword_6());
            		

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
    // $ANTLR end "ruletMultitype"


    // $ANTLR start "entryRulecomposingtype"
    // InternalXdstmdata.g:645:1: entryRulecomposingtype returns [EObject current=null] : iv_rulecomposingtype= rulecomposingtype EOF ;
    public final EObject entryRulecomposingtype() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecomposingtype = null;


        try {
            // InternalXdstmdata.g:645:54: (iv_rulecomposingtype= rulecomposingtype EOF )
            // InternalXdstmdata.g:646:2: iv_rulecomposingtype= rulecomposingtype EOF
            {
             newCompositeNode(grammarAccess.getComposingtypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecomposingtype=rulecomposingtype();

            state._fsp--;

             current =iv_rulecomposingtype; 
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
    // $ANTLR end "entryRulecomposingtype"


    // $ANTLR start "rulecomposingtype"
    // InternalXdstmdata.g:652:1: rulecomposingtype returns [EObject current=null] : ( ( (lv_tString_0_0= 'Int' ) ) | ( (lv_tString_1_0= 'Bool' ) ) | ( (lv_tChn_2_0= rulechannel_specifier ) ) | ( (lv_tID_3_0= RULE_ID ) ) ) ;
    public final EObject rulecomposingtype() throws RecognitionException {
        EObject current = null;

        Token lv_tString_0_0=null;
        Token lv_tString_1_0=null;
        Token lv_tID_3_0=null;
        EObject lv_tChn_2_0 = null;



        	enterRule();

        try {
            // InternalXdstmdata.g:658:2: ( ( ( (lv_tString_0_0= 'Int' ) ) | ( (lv_tString_1_0= 'Bool' ) ) | ( (lv_tChn_2_0= rulechannel_specifier ) ) | ( (lv_tID_3_0= RULE_ID ) ) ) )
            // InternalXdstmdata.g:659:2: ( ( (lv_tString_0_0= 'Int' ) ) | ( (lv_tString_1_0= 'Bool' ) ) | ( (lv_tChn_2_0= rulechannel_specifier ) ) | ( (lv_tID_3_0= RULE_ID ) ) )
            {
            // InternalXdstmdata.g:659:2: ( ( (lv_tString_0_0= 'Int' ) ) | ( (lv_tString_1_0= 'Bool' ) ) | ( (lv_tChn_2_0= rulechannel_specifier ) ) | ( (lv_tID_3_0= RULE_ID ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt8=1;
                }
                break;
            case 18:
                {
                alt8=2;
                }
                break;
            case 19:
            case 21:
            case 22:
                {
                alt8=3;
                }
                break;
            case RULE_ID:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalXdstmdata.g:660:3: ( (lv_tString_0_0= 'Int' ) )
                    {
                    // InternalXdstmdata.g:660:3: ( (lv_tString_0_0= 'Int' ) )
                    // InternalXdstmdata.g:661:4: (lv_tString_0_0= 'Int' )
                    {
                    // InternalXdstmdata.g:661:4: (lv_tString_0_0= 'Int' )
                    // InternalXdstmdata.g:662:5: lv_tString_0_0= 'Int'
                    {
                    lv_tString_0_0=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(lv_tString_0_0, grammarAccess.getComposingtypeAccess().getTStringIntKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getComposingtypeRule());
                    					}
                    					setWithLastConsumed(current, "tString", lv_tString_0_0, "Int");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXdstmdata.g:675:3: ( (lv_tString_1_0= 'Bool' ) )
                    {
                    // InternalXdstmdata.g:675:3: ( (lv_tString_1_0= 'Bool' ) )
                    // InternalXdstmdata.g:676:4: (lv_tString_1_0= 'Bool' )
                    {
                    // InternalXdstmdata.g:676:4: (lv_tString_1_0= 'Bool' )
                    // InternalXdstmdata.g:677:5: lv_tString_1_0= 'Bool'
                    {
                    lv_tString_1_0=(Token)match(input,18,FOLLOW_2); 

                    					newLeafNode(lv_tString_1_0, grammarAccess.getComposingtypeAccess().getTStringBoolKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getComposingtypeRule());
                    					}
                    					setWithLastConsumed(current, "tString", lv_tString_1_0, "Bool");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalXdstmdata.g:690:3: ( (lv_tChn_2_0= rulechannel_specifier ) )
                    {
                    // InternalXdstmdata.g:690:3: ( (lv_tChn_2_0= rulechannel_specifier ) )
                    // InternalXdstmdata.g:691:4: (lv_tChn_2_0= rulechannel_specifier )
                    {
                    // InternalXdstmdata.g:691:4: (lv_tChn_2_0= rulechannel_specifier )
                    // InternalXdstmdata.g:692:5: lv_tChn_2_0= rulechannel_specifier
                    {

                    					newCompositeNode(grammarAccess.getComposingtypeAccess().getTChnChannel_specifierParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_tChn_2_0=rulechannel_specifier();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getComposingtypeRule());
                    					}
                    					set(
                    						current,
                    						"tChn",
                    						lv_tChn_2_0,
                    						"org.xtext.unina.xdstmdata.Xdstmdata.channel_specifier");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalXdstmdata.g:710:3: ( (lv_tID_3_0= RULE_ID ) )
                    {
                    // InternalXdstmdata.g:710:3: ( (lv_tID_3_0= RULE_ID ) )
                    // InternalXdstmdata.g:711:4: (lv_tID_3_0= RULE_ID )
                    {
                    // InternalXdstmdata.g:711:4: (lv_tID_3_0= RULE_ID )
                    // InternalXdstmdata.g:712:5: lv_tID_3_0= RULE_ID
                    {
                    lv_tID_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_tID_3_0, grammarAccess.getComposingtypeAccess().getTIDIDTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getComposingtypeRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"tID",
                    						lv_tID_3_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


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
    // $ANTLR end "rulecomposingtype"


    // $ANTLR start "entryRulecIntchannel"
    // InternalXdstmdata.g:732:1: entryRulecIntchannel returns [EObject current=null] : iv_rulecIntchannel= rulecIntchannel EOF ;
    public final EObject entryRulecIntchannel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecIntchannel = null;


        try {
            // InternalXdstmdata.g:732:52: (iv_rulecIntchannel= rulecIntchannel EOF )
            // InternalXdstmdata.g:733:2: iv_rulecIntchannel= rulecIntchannel EOF
            {
             newCompositeNode(grammarAccess.getCIntchannelRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecIntchannel=rulecIntchannel();

            state._fsp--;

             current =iv_rulecIntchannel; 
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
    // $ANTLR end "entryRulecIntchannel"


    // $ANTLR start "rulecIntchannel"
    // InternalXdstmdata.g:739:1: rulecIntchannel returns [EObject current=null] : (otherlv_0= 'Chn' otherlv_1= 'internal' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( (lv_bound_4_0= RULE_INT ) ) otherlv_5= ']' otherlv_6= 'of' ( ( (lv_tString_7_0= 'Int' ) ) | ( (lv_tString_8_0= 'Bool' ) ) | ( (lv_tChn_9_0= rulechannel_specifier ) ) | ( (lv_tID_10_0= RULE_ID ) ) ) otherlv_11= ';' ) ;
    public final EObject rulecIntchannel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_bound_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_tString_7_0=null;
        Token lv_tString_8_0=null;
        Token lv_tID_10_0=null;
        Token otherlv_11=null;
        EObject lv_tChn_9_0 = null;



        	enterRule();

        try {
            // InternalXdstmdata.g:745:2: ( (otherlv_0= 'Chn' otherlv_1= 'internal' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( (lv_bound_4_0= RULE_INT ) ) otherlv_5= ']' otherlv_6= 'of' ( ( (lv_tString_7_0= 'Int' ) ) | ( (lv_tString_8_0= 'Bool' ) ) | ( (lv_tChn_9_0= rulechannel_specifier ) ) | ( (lv_tID_10_0= RULE_ID ) ) ) otherlv_11= ';' ) )
            // InternalXdstmdata.g:746:2: (otherlv_0= 'Chn' otherlv_1= 'internal' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( (lv_bound_4_0= RULE_INT ) ) otherlv_5= ']' otherlv_6= 'of' ( ( (lv_tString_7_0= 'Int' ) ) | ( (lv_tString_8_0= 'Bool' ) ) | ( (lv_tChn_9_0= rulechannel_specifier ) ) | ( (lv_tID_10_0= RULE_ID ) ) ) otherlv_11= ';' )
            {
            // InternalXdstmdata.g:746:2: (otherlv_0= 'Chn' otherlv_1= 'internal' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( (lv_bound_4_0= RULE_INT ) ) otherlv_5= ']' otherlv_6= 'of' ( ( (lv_tString_7_0= 'Int' ) ) | ( (lv_tString_8_0= 'Bool' ) ) | ( (lv_tChn_9_0= rulechannel_specifier ) ) | ( (lv_tID_10_0= RULE_ID ) ) ) otherlv_11= ';' )
            // InternalXdstmdata.g:747:3: otherlv_0= 'Chn' otherlv_1= 'internal' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( (lv_bound_4_0= RULE_INT ) ) otherlv_5= ']' otherlv_6= 'of' ( ( (lv_tString_7_0= 'Int' ) ) | ( (lv_tString_8_0= 'Bool' ) ) | ( (lv_tChn_9_0= rulechannel_specifier ) ) | ( (lv_tID_10_0= RULE_ID ) ) ) otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getCIntchannelAccess().getChnKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getCIntchannelAccess().getInternalKeyword_1());
            		
            // InternalXdstmdata.g:755:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalXdstmdata.g:756:4: (lv_name_2_0= RULE_ID )
            {
            // InternalXdstmdata.g:756:4: (lv_name_2_0= RULE_ID )
            // InternalXdstmdata.g:757:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_2_0, grammarAccess.getCIntchannelAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCIntchannelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getCIntchannelAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalXdstmdata.g:777:3: ( (lv_bound_4_0= RULE_INT ) )
            // InternalXdstmdata.g:778:4: (lv_bound_4_0= RULE_INT )
            {
            // InternalXdstmdata.g:778:4: (lv_bound_4_0= RULE_INT )
            // InternalXdstmdata.g:779:5: lv_bound_4_0= RULE_INT
            {
            lv_bound_4_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_bound_4_0, grammarAccess.getCIntchannelAccess().getBoundINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCIntchannelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"bound",
            						lv_bound_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getCIntchannelAccess().getRightSquareBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,27,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getCIntchannelAccess().getOfKeyword_6());
            		
            // InternalXdstmdata.g:803:3: ( ( (lv_tString_7_0= 'Int' ) ) | ( (lv_tString_8_0= 'Bool' ) ) | ( (lv_tChn_9_0= rulechannel_specifier ) ) | ( (lv_tID_10_0= RULE_ID ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt9=1;
                }
                break;
            case 18:
                {
                alt9=2;
                }
                break;
            case 19:
            case 21:
            case 22:
                {
                alt9=3;
                }
                break;
            case RULE_ID:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalXdstmdata.g:804:4: ( (lv_tString_7_0= 'Int' ) )
                    {
                    // InternalXdstmdata.g:804:4: ( (lv_tString_7_0= 'Int' ) )
                    // InternalXdstmdata.g:805:5: (lv_tString_7_0= 'Int' )
                    {
                    // InternalXdstmdata.g:805:5: (lv_tString_7_0= 'Int' )
                    // InternalXdstmdata.g:806:6: lv_tString_7_0= 'Int'
                    {
                    lv_tString_7_0=(Token)match(input,17,FOLLOW_8); 

                    						newLeafNode(lv_tString_7_0, grammarAccess.getCIntchannelAccess().getTStringIntKeyword_7_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCIntchannelRule());
                    						}
                    						setWithLastConsumed(current, "tString", lv_tString_7_0, "Int");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXdstmdata.g:819:4: ( (lv_tString_8_0= 'Bool' ) )
                    {
                    // InternalXdstmdata.g:819:4: ( (lv_tString_8_0= 'Bool' ) )
                    // InternalXdstmdata.g:820:5: (lv_tString_8_0= 'Bool' )
                    {
                    // InternalXdstmdata.g:820:5: (lv_tString_8_0= 'Bool' )
                    // InternalXdstmdata.g:821:6: lv_tString_8_0= 'Bool'
                    {
                    lv_tString_8_0=(Token)match(input,18,FOLLOW_8); 

                    						newLeafNode(lv_tString_8_0, grammarAccess.getCIntchannelAccess().getTStringBoolKeyword_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCIntchannelRule());
                    						}
                    						setWithLastConsumed(current, "tString", lv_tString_8_0, "Bool");
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalXdstmdata.g:834:4: ( (lv_tChn_9_0= rulechannel_specifier ) )
                    {
                    // InternalXdstmdata.g:834:4: ( (lv_tChn_9_0= rulechannel_specifier ) )
                    // InternalXdstmdata.g:835:5: (lv_tChn_9_0= rulechannel_specifier )
                    {
                    // InternalXdstmdata.g:835:5: (lv_tChn_9_0= rulechannel_specifier )
                    // InternalXdstmdata.g:836:6: lv_tChn_9_0= rulechannel_specifier
                    {

                    						newCompositeNode(grammarAccess.getCIntchannelAccess().getTChnChannel_specifierParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_tChn_9_0=rulechannel_specifier();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCIntchannelRule());
                    						}
                    						set(
                    							current,
                    							"tChn",
                    							lv_tChn_9_0,
                    							"org.xtext.unina.xdstmdata.Xdstmdata.channel_specifier");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalXdstmdata.g:854:4: ( (lv_tID_10_0= RULE_ID ) )
                    {
                    // InternalXdstmdata.g:854:4: ( (lv_tID_10_0= RULE_ID ) )
                    // InternalXdstmdata.g:855:5: (lv_tID_10_0= RULE_ID )
                    {
                    // InternalXdstmdata.g:855:5: (lv_tID_10_0= RULE_ID )
                    // InternalXdstmdata.g:856:6: lv_tID_10_0= RULE_ID
                    {
                    lv_tID_10_0=(Token)match(input,RULE_ID,FOLLOW_8); 

                    						newLeafNode(lv_tID_10_0, grammarAccess.getCIntchannelAccess().getTIDIDTerminalRuleCall_7_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCIntchannelRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"tID",
                    							lv_tID_10_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getCIntchannelAccess().getSemicolonKeyword_8());
            		

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
    // $ANTLR end "rulecIntchannel"


    // $ANTLR start "entryRulecExtchannel"
    // InternalXdstmdata.g:881:1: entryRulecExtchannel returns [EObject current=null] : iv_rulecExtchannel= rulecExtchannel EOF ;
    public final EObject entryRulecExtchannel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecExtchannel = null;


        try {
            // InternalXdstmdata.g:881:52: (iv_rulecExtchannel= rulecExtchannel EOF )
            // InternalXdstmdata.g:882:2: iv_rulecExtchannel= rulecExtchannel EOF
            {
             newCompositeNode(grammarAccess.getCExtchannelRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecExtchannel=rulecExtchannel();

            state._fsp--;

             current =iv_rulecExtchannel; 
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
    // $ANTLR end "entryRulecExtchannel"


    // $ANTLR start "rulecExtchannel"
    // InternalXdstmdata.g:888:1: rulecExtchannel returns [EObject current=null] : (otherlv_0= 'Chn' otherlv_1= 'external' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'of' ( ( (lv_tString_4_0= 'Int' ) ) | ( (lv_tString_5_0= 'Bool' ) ) | ( (lv_tChn_6_0= rulechannel_specifier ) ) | ( (lv_tID_7_0= RULE_ID ) ) ) otherlv_8= ';' ) ;
    public final EObject rulecExtchannel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_tString_4_0=null;
        Token lv_tString_5_0=null;
        Token lv_tID_7_0=null;
        Token otherlv_8=null;
        EObject lv_tChn_6_0 = null;



        	enterRule();

        try {
            // InternalXdstmdata.g:894:2: ( (otherlv_0= 'Chn' otherlv_1= 'external' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'of' ( ( (lv_tString_4_0= 'Int' ) ) | ( (lv_tString_5_0= 'Bool' ) ) | ( (lv_tChn_6_0= rulechannel_specifier ) ) | ( (lv_tID_7_0= RULE_ID ) ) ) otherlv_8= ';' ) )
            // InternalXdstmdata.g:895:2: (otherlv_0= 'Chn' otherlv_1= 'external' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'of' ( ( (lv_tString_4_0= 'Int' ) ) | ( (lv_tString_5_0= 'Bool' ) ) | ( (lv_tChn_6_0= rulechannel_specifier ) ) | ( (lv_tID_7_0= RULE_ID ) ) ) otherlv_8= ';' )
            {
            // InternalXdstmdata.g:895:2: (otherlv_0= 'Chn' otherlv_1= 'external' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'of' ( ( (lv_tString_4_0= 'Int' ) ) | ( (lv_tString_5_0= 'Bool' ) ) | ( (lv_tChn_6_0= rulechannel_specifier ) ) | ( (lv_tID_7_0= RULE_ID ) ) ) otherlv_8= ';' )
            // InternalXdstmdata.g:896:3: otherlv_0= 'Chn' otherlv_1= 'external' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'of' ( ( (lv_tString_4_0= 'Int' ) ) | ( (lv_tString_5_0= 'Bool' ) ) | ( (lv_tChn_6_0= rulechannel_specifier ) ) | ( (lv_tID_7_0= RULE_ID ) ) ) otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getCExtchannelAccess().getChnKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getCExtchannelAccess().getExternalKeyword_1());
            		
            // InternalXdstmdata.g:904:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalXdstmdata.g:905:4: (lv_name_2_0= RULE_ID )
            {
            // InternalXdstmdata.g:905:4: (lv_name_2_0= RULE_ID )
            // InternalXdstmdata.g:906:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_2_0, grammarAccess.getCExtchannelAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCExtchannelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getCExtchannelAccess().getOfKeyword_3());
            		
            // InternalXdstmdata.g:926:3: ( ( (lv_tString_4_0= 'Int' ) ) | ( (lv_tString_5_0= 'Bool' ) ) | ( (lv_tChn_6_0= rulechannel_specifier ) ) | ( (lv_tID_7_0= RULE_ID ) ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt10=1;
                }
                break;
            case 18:
                {
                alt10=2;
                }
                break;
            case 19:
            case 21:
            case 22:
                {
                alt10=3;
                }
                break;
            case RULE_ID:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalXdstmdata.g:927:4: ( (lv_tString_4_0= 'Int' ) )
                    {
                    // InternalXdstmdata.g:927:4: ( (lv_tString_4_0= 'Int' ) )
                    // InternalXdstmdata.g:928:5: (lv_tString_4_0= 'Int' )
                    {
                    // InternalXdstmdata.g:928:5: (lv_tString_4_0= 'Int' )
                    // InternalXdstmdata.g:929:6: lv_tString_4_0= 'Int'
                    {
                    lv_tString_4_0=(Token)match(input,17,FOLLOW_8); 

                    						newLeafNode(lv_tString_4_0, grammarAccess.getCExtchannelAccess().getTStringIntKeyword_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCExtchannelRule());
                    						}
                    						setWithLastConsumed(current, "tString", lv_tString_4_0, "Int");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXdstmdata.g:942:4: ( (lv_tString_5_0= 'Bool' ) )
                    {
                    // InternalXdstmdata.g:942:4: ( (lv_tString_5_0= 'Bool' ) )
                    // InternalXdstmdata.g:943:5: (lv_tString_5_0= 'Bool' )
                    {
                    // InternalXdstmdata.g:943:5: (lv_tString_5_0= 'Bool' )
                    // InternalXdstmdata.g:944:6: lv_tString_5_0= 'Bool'
                    {
                    lv_tString_5_0=(Token)match(input,18,FOLLOW_8); 

                    						newLeafNode(lv_tString_5_0, grammarAccess.getCExtchannelAccess().getTStringBoolKeyword_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCExtchannelRule());
                    						}
                    						setWithLastConsumed(current, "tString", lv_tString_5_0, "Bool");
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalXdstmdata.g:957:4: ( (lv_tChn_6_0= rulechannel_specifier ) )
                    {
                    // InternalXdstmdata.g:957:4: ( (lv_tChn_6_0= rulechannel_specifier ) )
                    // InternalXdstmdata.g:958:5: (lv_tChn_6_0= rulechannel_specifier )
                    {
                    // InternalXdstmdata.g:958:5: (lv_tChn_6_0= rulechannel_specifier )
                    // InternalXdstmdata.g:959:6: lv_tChn_6_0= rulechannel_specifier
                    {

                    						newCompositeNode(grammarAccess.getCExtchannelAccess().getTChnChannel_specifierParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_tChn_6_0=rulechannel_specifier();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCExtchannelRule());
                    						}
                    						set(
                    							current,
                    							"tChn",
                    							lv_tChn_6_0,
                    							"org.xtext.unina.xdstmdata.Xdstmdata.channel_specifier");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalXdstmdata.g:977:4: ( (lv_tID_7_0= RULE_ID ) )
                    {
                    // InternalXdstmdata.g:977:4: ( (lv_tID_7_0= RULE_ID ) )
                    // InternalXdstmdata.g:978:5: (lv_tID_7_0= RULE_ID )
                    {
                    // InternalXdstmdata.g:978:5: (lv_tID_7_0= RULE_ID )
                    // InternalXdstmdata.g:979:6: lv_tID_7_0= RULE_ID
                    {
                    lv_tID_7_0=(Token)match(input,RULE_ID,FOLLOW_8); 

                    						newLeafNode(lv_tID_7_0, grammarAccess.getCExtchannelAccess().getTIDIDTerminalRuleCall_4_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCExtchannelRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"tID",
                    							lv_tID_7_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getCExtchannelAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "rulecExtchannel"


    // $ANTLR start "entryRulevVariable"
    // InternalXdstmdata.g:1004:1: entryRulevVariable returns [EObject current=null] : iv_rulevVariable= rulevVariable EOF ;
    public final EObject entryRulevVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevVariable = null;


        try {
            // InternalXdstmdata.g:1004:50: (iv_rulevVariable= rulevVariable EOF )
            // InternalXdstmdata.g:1005:2: iv_rulevVariable= rulevVariable EOF
            {
             newCompositeNode(grammarAccess.getVVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevVariable=rulevVariable();

            state._fsp--;

             current =iv_rulevVariable; 
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
    // $ANTLR end "entryRulevVariable"


    // $ANTLR start "rulevVariable"
    // InternalXdstmdata.g:1011:1: rulevVariable returns [EObject current=null] : ( ( ( (lv_tString_0_0= 'Int' ) ) | ( (lv_tString_1_0= 'Bool' ) ) | ( (lv_tChn_2_0= rulechannel_specifier ) ) | ( (lv_tID_3_0= RULE_ID ) ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' ) ;
    public final EObject rulevVariable() throws RecognitionException {
        EObject current = null;

        Token lv_tString_0_0=null;
        Token lv_tString_1_0=null;
        Token lv_tID_3_0=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        EObject lv_tChn_2_0 = null;



        	enterRule();

        try {
            // InternalXdstmdata.g:1017:2: ( ( ( ( (lv_tString_0_0= 'Int' ) ) | ( (lv_tString_1_0= 'Bool' ) ) | ( (lv_tChn_2_0= rulechannel_specifier ) ) | ( (lv_tID_3_0= RULE_ID ) ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' ) )
            // InternalXdstmdata.g:1018:2: ( ( ( (lv_tString_0_0= 'Int' ) ) | ( (lv_tString_1_0= 'Bool' ) ) | ( (lv_tChn_2_0= rulechannel_specifier ) ) | ( (lv_tID_3_0= RULE_ID ) ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' )
            {
            // InternalXdstmdata.g:1018:2: ( ( ( (lv_tString_0_0= 'Int' ) ) | ( (lv_tString_1_0= 'Bool' ) ) | ( (lv_tChn_2_0= rulechannel_specifier ) ) | ( (lv_tID_3_0= RULE_ID ) ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' )
            // InternalXdstmdata.g:1019:3: ( ( (lv_tString_0_0= 'Int' ) ) | ( (lv_tString_1_0= 'Bool' ) ) | ( (lv_tChn_2_0= rulechannel_specifier ) ) | ( (lv_tID_3_0= RULE_ID ) ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';'
            {
            // InternalXdstmdata.g:1019:3: ( ( (lv_tString_0_0= 'Int' ) ) | ( (lv_tString_1_0= 'Bool' ) ) | ( (lv_tChn_2_0= rulechannel_specifier ) ) | ( (lv_tID_3_0= RULE_ID ) ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt11=1;
                }
                break;
            case 18:
                {
                alt11=2;
                }
                break;
            case 19:
            case 21:
            case 22:
                {
                alt11=3;
                }
                break;
            case RULE_ID:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalXdstmdata.g:1020:4: ( (lv_tString_0_0= 'Int' ) )
                    {
                    // InternalXdstmdata.g:1020:4: ( (lv_tString_0_0= 'Int' ) )
                    // InternalXdstmdata.g:1021:5: (lv_tString_0_0= 'Int' )
                    {
                    // InternalXdstmdata.g:1021:5: (lv_tString_0_0= 'Int' )
                    // InternalXdstmdata.g:1022:6: lv_tString_0_0= 'Int'
                    {
                    lv_tString_0_0=(Token)match(input,17,FOLLOW_5); 

                    						newLeafNode(lv_tString_0_0, grammarAccess.getVVariableAccess().getTStringIntKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVVariableRule());
                    						}
                    						setWithLastConsumed(current, "tString", lv_tString_0_0, "Int");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXdstmdata.g:1035:4: ( (lv_tString_1_0= 'Bool' ) )
                    {
                    // InternalXdstmdata.g:1035:4: ( (lv_tString_1_0= 'Bool' ) )
                    // InternalXdstmdata.g:1036:5: (lv_tString_1_0= 'Bool' )
                    {
                    // InternalXdstmdata.g:1036:5: (lv_tString_1_0= 'Bool' )
                    // InternalXdstmdata.g:1037:6: lv_tString_1_0= 'Bool'
                    {
                    lv_tString_1_0=(Token)match(input,18,FOLLOW_5); 

                    						newLeafNode(lv_tString_1_0, grammarAccess.getVVariableAccess().getTStringBoolKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVVariableRule());
                    						}
                    						setWithLastConsumed(current, "tString", lv_tString_1_0, "Bool");
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalXdstmdata.g:1050:4: ( (lv_tChn_2_0= rulechannel_specifier ) )
                    {
                    // InternalXdstmdata.g:1050:4: ( (lv_tChn_2_0= rulechannel_specifier ) )
                    // InternalXdstmdata.g:1051:5: (lv_tChn_2_0= rulechannel_specifier )
                    {
                    // InternalXdstmdata.g:1051:5: (lv_tChn_2_0= rulechannel_specifier )
                    // InternalXdstmdata.g:1052:6: lv_tChn_2_0= rulechannel_specifier
                    {

                    						newCompositeNode(grammarAccess.getVVariableAccess().getTChnChannel_specifierParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_tChn_2_0=rulechannel_specifier();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVVariableRule());
                    						}
                    						set(
                    							current,
                    							"tChn",
                    							lv_tChn_2_0,
                    							"org.xtext.unina.xdstmdata.Xdstmdata.channel_specifier");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalXdstmdata.g:1070:4: ( (lv_tID_3_0= RULE_ID ) )
                    {
                    // InternalXdstmdata.g:1070:4: ( (lv_tID_3_0= RULE_ID ) )
                    // InternalXdstmdata.g:1071:5: (lv_tID_3_0= RULE_ID )
                    {
                    // InternalXdstmdata.g:1071:5: (lv_tID_3_0= RULE_ID )
                    // InternalXdstmdata.g:1072:6: lv_tID_3_0= RULE_ID
                    {
                    lv_tID_3_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(lv_tID_3_0, grammarAccess.getVVariableAccess().getTIDIDTerminalRuleCall_0_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVVariableRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"tID",
                    							lv_tID_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXdstmdata.g:1089:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalXdstmdata.g:1090:4: (lv_name_4_0= RULE_ID )
            {
            // InternalXdstmdata.g:1090:4: (lv_name_4_0= RULE_ID )
            // InternalXdstmdata.g:1091:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_4_0, grammarAccess.getVVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getVVariableAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "rulevVariable"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001EF0812L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000016E0012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000006E0010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L});

}