package org.xtext.unina.xdstm.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.unina.xdstm.services.XdstmGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXdstmParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "';'", "'DSTM'", "'{'", "'machines'", "'='", "','", "'main'", "'}'", "'Machine'", "'vertexes'", "'transitions'", "'Node'", "'Box'", "'instantiation'", "'('", "')'", "'EnteringNode'", "'InitialNode'", "'ExitingNode'", "'Fork'", "'Join'", "'Transition'", "'source'", "'exiting_node'", "'destination'", "'entering_node'", "'isPreemptive'", "'trigger'", "'condition'", "'actions'", "'par_instantiation'", "'requirements'"
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
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalXdstmParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalXdstmParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalXdstmParser.tokenNames; }
    public String getGrammarFileName() { return "InternalXdstm.g"; }



     	private XdstmGrammarAccess grammarAccess;

        public InternalXdstmParser(TokenStream input, XdstmGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected XdstmGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalXdstm.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalXdstm.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalXdstm.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalXdstm.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_include_0_0= ruleinclude ) ) ( (lv_machines_1_0= ruleMachine ) ) ( (lv_machines_2_0= ruleMachine ) )* ( (lv_dstm_3_0= ruleDSTM ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_include_0_0 = null;

        EObject lv_machines_1_0 = null;

        EObject lv_machines_2_0 = null;

        EObject lv_dstm_3_0 = null;



        	enterRule();

        try {
            // InternalXdstm.g:77:2: ( ( ( (lv_include_0_0= ruleinclude ) ) ( (lv_machines_1_0= ruleMachine ) ) ( (lv_machines_2_0= ruleMachine ) )* ( (lv_dstm_3_0= ruleDSTM ) ) ) )
            // InternalXdstm.g:78:2: ( ( (lv_include_0_0= ruleinclude ) ) ( (lv_machines_1_0= ruleMachine ) ) ( (lv_machines_2_0= ruleMachine ) )* ( (lv_dstm_3_0= ruleDSTM ) ) )
            {
            // InternalXdstm.g:78:2: ( ( (lv_include_0_0= ruleinclude ) ) ( (lv_machines_1_0= ruleMachine ) ) ( (lv_machines_2_0= ruleMachine ) )* ( (lv_dstm_3_0= ruleDSTM ) ) )
            // InternalXdstm.g:79:3: ( (lv_include_0_0= ruleinclude ) ) ( (lv_machines_1_0= ruleMachine ) ) ( (lv_machines_2_0= ruleMachine ) )* ( (lv_dstm_3_0= ruleDSTM ) )
            {
            // InternalXdstm.g:79:3: ( (lv_include_0_0= ruleinclude ) )
            // InternalXdstm.g:80:4: (lv_include_0_0= ruleinclude )
            {
            // InternalXdstm.g:80:4: (lv_include_0_0= ruleinclude )
            // InternalXdstm.g:81:5: lv_include_0_0= ruleinclude
            {

            					newCompositeNode(grammarAccess.getModelAccess().getIncludeIncludeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_include_0_0=ruleinclude();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"include",
            						lv_include_0_0,
            						"org.xtext.unina.xdstm.Xdstm.include");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXdstm.g:98:3: ( (lv_machines_1_0= ruleMachine ) )
            // InternalXdstm.g:99:4: (lv_machines_1_0= ruleMachine )
            {
            // InternalXdstm.g:99:4: (lv_machines_1_0= ruleMachine )
            // InternalXdstm.g:100:5: lv_machines_1_0= ruleMachine
            {

            					newCompositeNode(grammarAccess.getModelAccess().getMachinesMachineParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_machines_1_0=ruleMachine();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					add(
            						current,
            						"machines",
            						lv_machines_1_0,
            						"org.xtext.unina.xdstm.Xdstm.Machine");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXdstm.g:117:3: ( (lv_machines_2_0= ruleMachine ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==20) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalXdstm.g:118:4: (lv_machines_2_0= ruleMachine )
            	    {
            	    // InternalXdstm.g:118:4: (lv_machines_2_0= ruleMachine )
            	    // InternalXdstm.g:119:5: lv_machines_2_0= ruleMachine
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getMachinesMachineParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_machines_2_0=ruleMachine();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"machines",
            	    						lv_machines_2_0,
            	    						"org.xtext.unina.xdstm.Xdstm.Machine");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalXdstm.g:136:3: ( (lv_dstm_3_0= ruleDSTM ) )
            // InternalXdstm.g:137:4: (lv_dstm_3_0= ruleDSTM )
            {
            // InternalXdstm.g:137:4: (lv_dstm_3_0= ruleDSTM )
            // InternalXdstm.g:138:5: lv_dstm_3_0= ruleDSTM
            {

            					newCompositeNode(grammarAccess.getModelAccess().getDstmDSTMParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_dstm_3_0=ruleDSTM();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					add(
            						current,
            						"dstm",
            						lv_dstm_3_0,
            						"org.xtext.unina.xdstm.Xdstm.DSTM");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleinclude"
    // InternalXdstm.g:159:1: entryRuleinclude returns [EObject current=null] : iv_ruleinclude= ruleinclude EOF ;
    public final EObject entryRuleinclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleinclude = null;


        try {
            // InternalXdstm.g:159:48: (iv_ruleinclude= ruleinclude EOF )
            // InternalXdstm.g:160:2: iv_ruleinclude= ruleinclude EOF
            {
             newCompositeNode(grammarAccess.getIncludeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleinclude=ruleinclude();

            state._fsp--;

             current =iv_ruleinclude; 
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
    // $ANTLR end "entryRuleinclude"


    // $ANTLR start "ruleinclude"
    // InternalXdstm.g:166:1: ruleinclude returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) ;
    public final EObject ruleinclude() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalXdstm.g:172:2: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) )
            // InternalXdstm.g:173:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' )
            {
            // InternalXdstm.g:173:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' )
            // InternalXdstm.g:174:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getIncludeAccess().getImportKeyword_0());
            		
            // InternalXdstm.g:178:3: ( (lv_importURI_1_0= RULE_STRING ) )
            // InternalXdstm.g:179:4: (lv_importURI_1_0= RULE_STRING )
            {
            // InternalXdstm.g:179:4: (lv_importURI_1_0= RULE_STRING )
            // InternalXdstm.g:180:5: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_importURI_1_0, grammarAccess.getIncludeAccess().getImportURISTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIncludeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"importURI",
            						lv_importURI_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getIncludeAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleinclude"


    // $ANTLR start "entryRuleDSTM"
    // InternalXdstm.g:204:1: entryRuleDSTM returns [EObject current=null] : iv_ruleDSTM= ruleDSTM EOF ;
    public final EObject entryRuleDSTM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDSTM = null;


        try {
            // InternalXdstm.g:204:45: (iv_ruleDSTM= ruleDSTM EOF )
            // InternalXdstm.g:205:2: iv_ruleDSTM= ruleDSTM EOF
            {
             newCompositeNode(grammarAccess.getDSTMRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDSTM=ruleDSTM();

            state._fsp--;

             current =iv_ruleDSTM; 
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
    // $ANTLR end "entryRuleDSTM"


    // $ANTLR start "ruleDSTM"
    // InternalXdstm.g:211:1: ruleDSTM returns [EObject current=null] : (otherlv_0= 'DSTM' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'machines' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ';' otherlv_9= 'main' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' otherlv_12= '}' otherlv_13= ';' ) ;
    public final EObject ruleDSTM() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
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
        Token otherlv_12=null;
        Token otherlv_13=null;


        	enterRule();

        try {
            // InternalXdstm.g:217:2: ( (otherlv_0= 'DSTM' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'machines' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ';' otherlv_9= 'main' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' otherlv_12= '}' otherlv_13= ';' ) )
            // InternalXdstm.g:218:2: (otherlv_0= 'DSTM' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'machines' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ';' otherlv_9= 'main' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' otherlv_12= '}' otherlv_13= ';' )
            {
            // InternalXdstm.g:218:2: (otherlv_0= 'DSTM' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'machines' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ';' otherlv_9= 'main' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' otherlv_12= '}' otherlv_13= ';' )
            // InternalXdstm.g:219:3: otherlv_0= 'DSTM' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'machines' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ';' otherlv_9= 'main' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' otherlv_12= '}' otherlv_13= ';'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDSTMAccess().getDSTMKeyword_0());
            		
            // InternalXdstm.g:223:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXdstm.g:224:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXdstm.g:224:4: (lv_name_1_0= RULE_ID )
            // InternalXdstm.g:225:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDSTMAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSTMRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getDSTMAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getDSTMAccess().getMachinesKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getDSTMAccess().getEqualsSignKeyword_4());
            		
            // InternalXdstm.g:253:3: ( (otherlv_5= RULE_ID ) )
            // InternalXdstm.g:254:4: (otherlv_5= RULE_ID )
            {
            // InternalXdstm.g:254:4: (otherlv_5= RULE_ID )
            // InternalXdstm.g:255:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSTMRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_5, grammarAccess.getDSTMAccess().getMachinesMachineCrossReference_5_0());
            				

            }


            }

            // InternalXdstm.g:266:3: (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalXdstm.g:267:4: otherlv_6= ',' ( (otherlv_7= RULE_ID ) )
            	    {
            	    otherlv_6=(Token)match(input,17,FOLLOW_7); 

            	    				newLeafNode(otherlv_6, grammarAccess.getDSTMAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalXdstm.g:271:4: ( (otherlv_7= RULE_ID ) )
            	    // InternalXdstm.g:272:5: (otherlv_7= RULE_ID )
            	    {
            	    // InternalXdstm.g:272:5: (otherlv_7= RULE_ID )
            	    // InternalXdstm.g:273:6: otherlv_7= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDSTMRule());
            	    						}
            	    					
            	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_11); 

            	    						newLeafNode(otherlv_7, grammarAccess.getDSTMAccess().getMachinesMachineCrossReference_6_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_8=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_8, grammarAccess.getDSTMAccess().getSemicolonKeyword_7());
            		
            otherlv_9=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getDSTMAccess().getMainKeyword_8());
            		
            // InternalXdstm.g:293:3: ( (otherlv_10= RULE_ID ) )
            // InternalXdstm.g:294:4: (otherlv_10= RULE_ID )
            {
            // InternalXdstm.g:294:4: (otherlv_10= RULE_ID )
            // InternalXdstm.g:295:5: otherlv_10= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDSTMRule());
            					}
            				
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_10, grammarAccess.getDSTMAccess().getMainMachineCrossReference_9_0());
            				

            }


            }

            otherlv_11=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_11, grammarAccess.getDSTMAccess().getSemicolonKeyword_10());
            		
            otherlv_12=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_12, grammarAccess.getDSTMAccess().getRightCurlyBracketKeyword_11());
            		
            otherlv_13=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getDSTMAccess().getSemicolonKeyword_12());
            		

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
    // $ANTLR end "ruleDSTM"


    // $ANTLR start "entryRuleMachine"
    // InternalXdstm.g:322:1: entryRuleMachine returns [EObject current=null] : iv_ruleMachine= ruleMachine EOF ;
    public final EObject entryRuleMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMachine = null;


        try {
            // InternalXdstm.g:322:48: (iv_ruleMachine= ruleMachine EOF )
            // InternalXdstm.g:323:2: iv_ruleMachine= ruleMachine EOF
            {
             newCompositeNode(grammarAccess.getMachineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMachine=ruleMachine();

            state._fsp--;

             current =iv_ruleMachine; 
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
    // $ANTLR end "entryRuleMachine"


    // $ANTLR start "ruleMachine"
    // InternalXdstm.g:329:1: ruleMachine returns [EObject current=null] : (otherlv_0= 'Machine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'vertexes' otherlv_4= '{' ( (lv_vertexes_5_0= ruleVertex ) ) (otherlv_6= ',' ( (lv_vertexes_7_0= ruleVertex ) ) )* otherlv_8= '}' otherlv_9= 'transitions' otherlv_10= '{' ( (lv_transitions_11_0= ruleTransition ) ) (otherlv_12= ',' ( (lv_transitions_13_0= ruleTransition ) ) )* otherlv_14= '}' otherlv_15= '}' otherlv_16= ';' ) ;
    public final EObject ruleMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        EObject lv_vertexes_5_0 = null;

        EObject lv_vertexes_7_0 = null;

        EObject lv_transitions_11_0 = null;

        EObject lv_transitions_13_0 = null;



        	enterRule();

        try {
            // InternalXdstm.g:335:2: ( (otherlv_0= 'Machine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'vertexes' otherlv_4= '{' ( (lv_vertexes_5_0= ruleVertex ) ) (otherlv_6= ',' ( (lv_vertexes_7_0= ruleVertex ) ) )* otherlv_8= '}' otherlv_9= 'transitions' otherlv_10= '{' ( (lv_transitions_11_0= ruleTransition ) ) (otherlv_12= ',' ( (lv_transitions_13_0= ruleTransition ) ) )* otherlv_14= '}' otherlv_15= '}' otherlv_16= ';' ) )
            // InternalXdstm.g:336:2: (otherlv_0= 'Machine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'vertexes' otherlv_4= '{' ( (lv_vertexes_5_0= ruleVertex ) ) (otherlv_6= ',' ( (lv_vertexes_7_0= ruleVertex ) ) )* otherlv_8= '}' otherlv_9= 'transitions' otherlv_10= '{' ( (lv_transitions_11_0= ruleTransition ) ) (otherlv_12= ',' ( (lv_transitions_13_0= ruleTransition ) ) )* otherlv_14= '}' otherlv_15= '}' otherlv_16= ';' )
            {
            // InternalXdstm.g:336:2: (otherlv_0= 'Machine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'vertexes' otherlv_4= '{' ( (lv_vertexes_5_0= ruleVertex ) ) (otherlv_6= ',' ( (lv_vertexes_7_0= ruleVertex ) ) )* otherlv_8= '}' otherlv_9= 'transitions' otherlv_10= '{' ( (lv_transitions_11_0= ruleTransition ) ) (otherlv_12= ',' ( (lv_transitions_13_0= ruleTransition ) ) )* otherlv_14= '}' otherlv_15= '}' otherlv_16= ';' )
            // InternalXdstm.g:337:3: otherlv_0= 'Machine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'vertexes' otherlv_4= '{' ( (lv_vertexes_5_0= ruleVertex ) ) (otherlv_6= ',' ( (lv_vertexes_7_0= ruleVertex ) ) )* otherlv_8= '}' otherlv_9= 'transitions' otherlv_10= '{' ( (lv_transitions_11_0= ruleTransition ) ) (otherlv_12= ',' ( (lv_transitions_13_0= ruleTransition ) ) )* otherlv_14= '}' otherlv_15= '}' otherlv_16= ';'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getMachineAccess().getMachineKeyword_0());
            		
            // InternalXdstm.g:341:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXdstm.g:342:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXdstm.g:342:4: (lv_name_1_0= RULE_ID )
            // InternalXdstm.g:343:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMachineAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMachineRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getMachineAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getMachineAccess().getVertexesKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getMachineAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalXdstm.g:371:3: ( (lv_vertexes_5_0= ruleVertex ) )
            // InternalXdstm.g:372:4: (lv_vertexes_5_0= ruleVertex )
            {
            // InternalXdstm.g:372:4: (lv_vertexes_5_0= ruleVertex )
            // InternalXdstm.g:373:5: lv_vertexes_5_0= ruleVertex
            {

            					newCompositeNode(grammarAccess.getMachineAccess().getVertexesVertexParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_16);
            lv_vertexes_5_0=ruleVertex();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMachineRule());
            					}
            					add(
            						current,
            						"vertexes",
            						lv_vertexes_5_0,
            						"org.xtext.unina.xdstm.Xdstm.Vertex");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXdstm.g:390:3: (otherlv_6= ',' ( (lv_vertexes_7_0= ruleVertex ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalXdstm.g:391:4: otherlv_6= ',' ( (lv_vertexes_7_0= ruleVertex ) )
            	    {
            	    otherlv_6=(Token)match(input,17,FOLLOW_15); 

            	    				newLeafNode(otherlv_6, grammarAccess.getMachineAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalXdstm.g:395:4: ( (lv_vertexes_7_0= ruleVertex ) )
            	    // InternalXdstm.g:396:5: (lv_vertexes_7_0= ruleVertex )
            	    {
            	    // InternalXdstm.g:396:5: (lv_vertexes_7_0= ruleVertex )
            	    // InternalXdstm.g:397:6: lv_vertexes_7_0= ruleVertex
            	    {

            	    						newCompositeNode(grammarAccess.getMachineAccess().getVertexesVertexParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_vertexes_7_0=ruleVertex();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMachineRule());
            	    						}
            	    						add(
            	    							current,
            	    							"vertexes",
            	    							lv_vertexes_7_0,
            	    							"org.xtext.unina.xdstm.Xdstm.Vertex");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_8=(Token)match(input,19,FOLLOW_17); 

            			newLeafNode(otherlv_8, grammarAccess.getMachineAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_9=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getMachineAccess().getTransitionsKeyword_8());
            		
            otherlv_10=(Token)match(input,14,FOLLOW_18); 

            			newLeafNode(otherlv_10, grammarAccess.getMachineAccess().getLeftCurlyBracketKeyword_9());
            		
            // InternalXdstm.g:427:3: ( (lv_transitions_11_0= ruleTransition ) )
            // InternalXdstm.g:428:4: (lv_transitions_11_0= ruleTransition )
            {
            // InternalXdstm.g:428:4: (lv_transitions_11_0= ruleTransition )
            // InternalXdstm.g:429:5: lv_transitions_11_0= ruleTransition
            {

            					newCompositeNode(grammarAccess.getMachineAccess().getTransitionsTransitionParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_16);
            lv_transitions_11_0=ruleTransition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMachineRule());
            					}
            					add(
            						current,
            						"transitions",
            						lv_transitions_11_0,
            						"org.xtext.unina.xdstm.Xdstm.Transition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXdstm.g:446:3: (otherlv_12= ',' ( (lv_transitions_13_0= ruleTransition ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalXdstm.g:447:4: otherlv_12= ',' ( (lv_transitions_13_0= ruleTransition ) )
            	    {
            	    otherlv_12=(Token)match(input,17,FOLLOW_18); 

            	    				newLeafNode(otherlv_12, grammarAccess.getMachineAccess().getCommaKeyword_11_0());
            	    			
            	    // InternalXdstm.g:451:4: ( (lv_transitions_13_0= ruleTransition ) )
            	    // InternalXdstm.g:452:5: (lv_transitions_13_0= ruleTransition )
            	    {
            	    // InternalXdstm.g:452:5: (lv_transitions_13_0= ruleTransition )
            	    // InternalXdstm.g:453:6: lv_transitions_13_0= ruleTransition
            	    {

            	    						newCompositeNode(grammarAccess.getMachineAccess().getTransitionsTransitionParserRuleCall_11_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_transitions_13_0=ruleTransition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMachineRule());
            	    						}
            	    						add(
            	    							current,
            	    							"transitions",
            	    							lv_transitions_13_0,
            	    							"org.xtext.unina.xdstm.Xdstm.Transition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_14=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_14, grammarAccess.getMachineAccess().getRightCurlyBracketKeyword_12());
            		
            otherlv_15=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_15, grammarAccess.getMachineAccess().getRightCurlyBracketKeyword_13());
            		
            otherlv_16=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getMachineAccess().getSemicolonKeyword_14());
            		

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
    // $ANTLR end "ruleMachine"


    // $ANTLR start "entryRuleVertex"
    // InternalXdstm.g:487:1: entryRuleVertex returns [EObject current=null] : iv_ruleVertex= ruleVertex EOF ;
    public final EObject entryRuleVertex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVertex = null;


        try {
            // InternalXdstm.g:487:47: (iv_ruleVertex= ruleVertex EOF )
            // InternalXdstm.g:488:2: iv_ruleVertex= ruleVertex EOF
            {
             newCompositeNode(grammarAccess.getVertexRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVertex=ruleVertex();

            state._fsp--;

             current =iv_ruleVertex; 
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
    // $ANTLR end "entryRuleVertex"


    // $ANTLR start "ruleVertex"
    // InternalXdstm.g:494:1: ruleVertex returns [EObject current=null] : (this_Node_0= ruleNode | this_Box_1= ruleBox | this_EnteringNodeAbs_2= ruleEnteringNodeAbs | this_ExitingNode_3= ruleExitingNode | this_Fork_4= ruleFork | this_Join_5= ruleJoin ) ;
    public final EObject ruleVertex() throws RecognitionException {
        EObject current = null;

        EObject this_Node_0 = null;

        EObject this_Box_1 = null;

        EObject this_EnteringNodeAbs_2 = null;

        EObject this_ExitingNode_3 = null;

        EObject this_Fork_4 = null;

        EObject this_Join_5 = null;



        	enterRule();

        try {
            // InternalXdstm.g:500:2: ( (this_Node_0= ruleNode | this_Box_1= ruleBox | this_EnteringNodeAbs_2= ruleEnteringNodeAbs | this_ExitingNode_3= ruleExitingNode | this_Fork_4= ruleFork | this_Join_5= ruleJoin ) )
            // InternalXdstm.g:501:2: (this_Node_0= ruleNode | this_Box_1= ruleBox | this_EnteringNodeAbs_2= ruleEnteringNodeAbs | this_ExitingNode_3= ruleExitingNode | this_Fork_4= ruleFork | this_Join_5= ruleJoin )
            {
            // InternalXdstm.g:501:2: (this_Node_0= ruleNode | this_Box_1= ruleBox | this_EnteringNodeAbs_2= ruleEnteringNodeAbs | this_ExitingNode_3= ruleExitingNode | this_Fork_4= ruleFork | this_Join_5= ruleJoin )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt5=1;
                }
                break;
            case 24:
                {
                alt5=2;
                }
                break;
            case 28:
            case 29:
                {
                alt5=3;
                }
                break;
            case 30:
                {
                alt5=4;
                }
                break;
            case 31:
                {
                alt5=5;
                }
                break;
            case 32:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalXdstm.g:502:3: this_Node_0= ruleNode
                    {

                    			newCompositeNode(grammarAccess.getVertexAccess().getNodeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Node_0=ruleNode();

                    state._fsp--;


                    			current = this_Node_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXdstm.g:511:3: this_Box_1= ruleBox
                    {

                    			newCompositeNode(grammarAccess.getVertexAccess().getBoxParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Box_1=ruleBox();

                    state._fsp--;


                    			current = this_Box_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalXdstm.g:520:3: this_EnteringNodeAbs_2= ruleEnteringNodeAbs
                    {

                    			newCompositeNode(grammarAccess.getVertexAccess().getEnteringNodeAbsParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_EnteringNodeAbs_2=ruleEnteringNodeAbs();

                    state._fsp--;


                    			current = this_EnteringNodeAbs_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalXdstm.g:529:3: this_ExitingNode_3= ruleExitingNode
                    {

                    			newCompositeNode(grammarAccess.getVertexAccess().getExitingNodeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExitingNode_3=ruleExitingNode();

                    state._fsp--;


                    			current = this_ExitingNode_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalXdstm.g:538:3: this_Fork_4= ruleFork
                    {

                    			newCompositeNode(grammarAccess.getVertexAccess().getForkParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Fork_4=ruleFork();

                    state._fsp--;


                    			current = this_Fork_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalXdstm.g:547:3: this_Join_5= ruleJoin
                    {

                    			newCompositeNode(grammarAccess.getVertexAccess().getJoinParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Join_5=ruleJoin();

                    state._fsp--;


                    			current = this_Join_5;
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
    // $ANTLR end "ruleVertex"


    // $ANTLR start "entryRuleEnteringNodeAbs"
    // InternalXdstm.g:559:1: entryRuleEnteringNodeAbs returns [EObject current=null] : iv_ruleEnteringNodeAbs= ruleEnteringNodeAbs EOF ;
    public final EObject entryRuleEnteringNodeAbs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnteringNodeAbs = null;


        try {
            // InternalXdstm.g:559:56: (iv_ruleEnteringNodeAbs= ruleEnteringNodeAbs EOF )
            // InternalXdstm.g:560:2: iv_ruleEnteringNodeAbs= ruleEnteringNodeAbs EOF
            {
             newCompositeNode(grammarAccess.getEnteringNodeAbsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnteringNodeAbs=ruleEnteringNodeAbs();

            state._fsp--;

             current =iv_ruleEnteringNodeAbs; 
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
    // $ANTLR end "entryRuleEnteringNodeAbs"


    // $ANTLR start "ruleEnteringNodeAbs"
    // InternalXdstm.g:566:1: ruleEnteringNodeAbs returns [EObject current=null] : (this_EnteringNode_0= ruleEnteringNode | this_InitialNode_1= ruleInitialNode ) ;
    public final EObject ruleEnteringNodeAbs() throws RecognitionException {
        EObject current = null;

        EObject this_EnteringNode_0 = null;

        EObject this_InitialNode_1 = null;



        	enterRule();

        try {
            // InternalXdstm.g:572:2: ( (this_EnteringNode_0= ruleEnteringNode | this_InitialNode_1= ruleInitialNode ) )
            // InternalXdstm.g:573:2: (this_EnteringNode_0= ruleEnteringNode | this_InitialNode_1= ruleInitialNode )
            {
            // InternalXdstm.g:573:2: (this_EnteringNode_0= ruleEnteringNode | this_InitialNode_1= ruleInitialNode )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==28) ) {
                alt6=1;
            }
            else if ( (LA6_0==29) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalXdstm.g:574:3: this_EnteringNode_0= ruleEnteringNode
                    {

                    			newCompositeNode(grammarAccess.getEnteringNodeAbsAccess().getEnteringNodeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EnteringNode_0=ruleEnteringNode();

                    state._fsp--;


                    			current = this_EnteringNode_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXdstm.g:583:3: this_InitialNode_1= ruleInitialNode
                    {

                    			newCompositeNode(grammarAccess.getEnteringNodeAbsAccess().getInitialNodeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_InitialNode_1=ruleInitialNode();

                    state._fsp--;


                    			current = this_InitialNode_1;
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
    // $ANTLR end "ruleEnteringNodeAbs"


    // $ANTLR start "entryRuleNode"
    // InternalXdstm.g:595:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalXdstm.g:595:45: (iv_ruleNode= ruleNode EOF )
            // InternalXdstm.g:596:2: iv_ruleNode= ruleNode EOF
            {
             newCompositeNode(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNode=ruleNode();

            state._fsp--;

             current =iv_ruleNode; 
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
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalXdstm.g:602:1: ruleNode returns [EObject current=null] : (otherlv_0= 'Node' ( (lv_name_1_0= RULE_ID ) ) ( (lv_requirements_2_0= ruleRequirements ) ) ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_requirements_2_0 = null;



        	enterRule();

        try {
            // InternalXdstm.g:608:2: ( (otherlv_0= 'Node' ( (lv_name_1_0= RULE_ID ) ) ( (lv_requirements_2_0= ruleRequirements ) ) ) )
            // InternalXdstm.g:609:2: (otherlv_0= 'Node' ( (lv_name_1_0= RULE_ID ) ) ( (lv_requirements_2_0= ruleRequirements ) ) )
            {
            // InternalXdstm.g:609:2: (otherlv_0= 'Node' ( (lv_name_1_0= RULE_ID ) ) ( (lv_requirements_2_0= ruleRequirements ) ) )
            // InternalXdstm.g:610:3: otherlv_0= 'Node' ( (lv_name_1_0= RULE_ID ) ) ( (lv_requirements_2_0= ruleRequirements ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getNodeAccess().getNodeKeyword_0());
            		
            // InternalXdstm.g:614:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXdstm.g:615:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXdstm.g:615:4: (lv_name_1_0= RULE_ID )
            // InternalXdstm.g:616:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_name_1_0, grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalXdstm.g:632:3: ( (lv_requirements_2_0= ruleRequirements ) )
            // InternalXdstm.g:633:4: (lv_requirements_2_0= ruleRequirements )
            {
            // InternalXdstm.g:633:4: (lv_requirements_2_0= ruleRequirements )
            // InternalXdstm.g:634:5: lv_requirements_2_0= ruleRequirements
            {

            					newCompositeNode(grammarAccess.getNodeAccess().getRequirementsRequirementsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_requirements_2_0=ruleRequirements();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNodeRule());
            					}
            					set(
            						current,
            						"requirements",
            						lv_requirements_2_0,
            						"org.xtext.unina.xdstm.Xdstm.Requirements");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleBox"
    // InternalXdstm.g:655:1: entryRuleBox returns [EObject current=null] : iv_ruleBox= ruleBox EOF ;
    public final EObject entryRuleBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBox = null;


        try {
            // InternalXdstm.g:655:44: (iv_ruleBox= ruleBox EOF )
            // InternalXdstm.g:656:2: iv_ruleBox= ruleBox EOF
            {
             newCompositeNode(grammarAccess.getBoxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBox=ruleBox();

            state._fsp--;

             current =iv_ruleBox; 
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
    // $ANTLR end "entryRuleBox"


    // $ANTLR start "ruleBox"
    // InternalXdstm.g:662:1: ruleBox returns [EObject current=null] : (otherlv_0= 'Box' ( (lv_name_1_0= RULE_ID ) ) ( (lv_requirements_2_0= ruleRequirements ) ) otherlv_3= '{' otherlv_4= 'instantiation' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ')' otherlv_10= '}' ) ;
    public final EObject ruleBox() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_requirements_2_0 = null;



        	enterRule();

        try {
            // InternalXdstm.g:668:2: ( (otherlv_0= 'Box' ( (lv_name_1_0= RULE_ID ) ) ( (lv_requirements_2_0= ruleRequirements ) ) otherlv_3= '{' otherlv_4= 'instantiation' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ')' otherlv_10= '}' ) )
            // InternalXdstm.g:669:2: (otherlv_0= 'Box' ( (lv_name_1_0= RULE_ID ) ) ( (lv_requirements_2_0= ruleRequirements ) ) otherlv_3= '{' otherlv_4= 'instantiation' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ')' otherlv_10= '}' )
            {
            // InternalXdstm.g:669:2: (otherlv_0= 'Box' ( (lv_name_1_0= RULE_ID ) ) ( (lv_requirements_2_0= ruleRequirements ) ) otherlv_3= '{' otherlv_4= 'instantiation' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ')' otherlv_10= '}' )
            // InternalXdstm.g:670:3: otherlv_0= 'Box' ( (lv_name_1_0= RULE_ID ) ) ( (lv_requirements_2_0= ruleRequirements ) ) otherlv_3= '{' otherlv_4= 'instantiation' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ')' otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getBoxAccess().getBoxKeyword_0());
            		
            // InternalXdstm.g:674:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXdstm.g:675:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXdstm.g:675:4: (lv_name_1_0= RULE_ID )
            // InternalXdstm.g:676:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_name_1_0, grammarAccess.getBoxAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBoxRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalXdstm.g:692:3: ( (lv_requirements_2_0= ruleRequirements ) )
            // InternalXdstm.g:693:4: (lv_requirements_2_0= ruleRequirements )
            {
            // InternalXdstm.g:693:4: (lv_requirements_2_0= ruleRequirements )
            // InternalXdstm.g:694:5: lv_requirements_2_0= ruleRequirements
            {

            					newCompositeNode(grammarAccess.getBoxAccess().getRequirementsRequirementsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_requirements_2_0=ruleRequirements();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBoxRule());
            					}
            					set(
            						current,
            						"requirements",
            						lv_requirements_2_0,
            						"org.xtext.unina.xdstm.Xdstm.Requirements");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getBoxAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getBoxAccess().getInstantiationKeyword_4());
            		
            otherlv_5=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getBoxAccess().getLeftParenthesisKeyword_5());
            		
            // InternalXdstm.g:723:3: ( (otherlv_6= RULE_ID ) )
            // InternalXdstm.g:724:4: (otherlv_6= RULE_ID )
            {
            // InternalXdstm.g:724:4: (otherlv_6= RULE_ID )
            // InternalXdstm.g:725:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBoxRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_6, grammarAccess.getBoxAccess().getInstantiationMachineCrossReference_6_0());
            				

            }


            }

            // InternalXdstm.g:736:3: (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalXdstm.g:737:4: otherlv_7= ',' ( (otherlv_8= RULE_ID ) )
            	    {
            	    otherlv_7=(Token)match(input,17,FOLLOW_7); 

            	    				newLeafNode(otherlv_7, grammarAccess.getBoxAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalXdstm.g:741:4: ( (otherlv_8= RULE_ID ) )
            	    // InternalXdstm.g:742:5: (otherlv_8= RULE_ID )
            	    {
            	    // InternalXdstm.g:742:5: (otherlv_8= RULE_ID )
            	    // InternalXdstm.g:743:6: otherlv_8= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getBoxRule());
            	    						}
            	    					
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_22); 

            	    						newLeafNode(otherlv_8, grammarAccess.getBoxAccess().getInstantiationMachineCrossReference_7_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_9=(Token)match(input,27,FOLLOW_13); 

            			newLeafNode(otherlv_9, grammarAccess.getBoxAccess().getRightParenthesisKeyword_8());
            		
            otherlv_10=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getBoxAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleBox"


    // $ANTLR start "entryRuleEnteringNode"
    // InternalXdstm.g:767:1: entryRuleEnteringNode returns [EObject current=null] : iv_ruleEnteringNode= ruleEnteringNode EOF ;
    public final EObject entryRuleEnteringNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnteringNode = null;


        try {
            // InternalXdstm.g:767:53: (iv_ruleEnteringNode= ruleEnteringNode EOF )
            // InternalXdstm.g:768:2: iv_ruleEnteringNode= ruleEnteringNode EOF
            {
             newCompositeNode(grammarAccess.getEnteringNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnteringNode=ruleEnteringNode();

            state._fsp--;

             current =iv_ruleEnteringNode; 
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
    // $ANTLR end "entryRuleEnteringNode"


    // $ANTLR start "ruleEnteringNode"
    // InternalXdstm.g:774:1: ruleEnteringNode returns [EObject current=null] : (otherlv_0= 'EnteringNode' ( (lv_name_1_0= RULE_ID ) ) ( (lv_requirements_2_0= ruleRequirements ) ) ) ;
    public final EObject ruleEnteringNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_requirements_2_0 = null;



        	enterRule();

        try {
            // InternalXdstm.g:780:2: ( (otherlv_0= 'EnteringNode' ( (lv_name_1_0= RULE_ID ) ) ( (lv_requirements_2_0= ruleRequirements ) ) ) )
            // InternalXdstm.g:781:2: (otherlv_0= 'EnteringNode' ( (lv_name_1_0= RULE_ID ) ) ( (lv_requirements_2_0= ruleRequirements ) ) )
            {
            // InternalXdstm.g:781:2: (otherlv_0= 'EnteringNode' ( (lv_name_1_0= RULE_ID ) ) ( (lv_requirements_2_0= ruleRequirements ) ) )
            // InternalXdstm.g:782:3: otherlv_0= 'EnteringNode' ( (lv_name_1_0= RULE_ID ) ) ( (lv_requirements_2_0= ruleRequirements ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getEnteringNodeAccess().getEnteringNodeKeyword_0());
            		
            // InternalXdstm.g:786:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXdstm.g:787:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXdstm.g:787:4: (lv_name_1_0= RULE_ID )
            // InternalXdstm.g:788:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEnteringNodeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnteringNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalXdstm.g:804:3: ( (lv_requirements_2_0= ruleRequirements ) )
            // InternalXdstm.g:805:4: (lv_requirements_2_0= ruleRequirements )
            {
            // InternalXdstm.g:805:4: (lv_requirements_2_0= ruleRequirements )
            // InternalXdstm.g:806:5: lv_requirements_2_0= ruleRequirements
            {

            					newCompositeNode(grammarAccess.getEnteringNodeAccess().getRequirementsRequirementsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_requirements_2_0=ruleRequirements();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnteringNodeRule());
            					}
            					set(
            						current,
            						"requirements",
            						lv_requirements_2_0,
            						"org.xtext.unina.xdstm.Xdstm.Requirements");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleEnteringNode"


    // $ANTLR start "entryRuleInitialNode"
    // InternalXdstm.g:827:1: entryRuleInitialNode returns [EObject current=null] : iv_ruleInitialNode= ruleInitialNode EOF ;
    public final EObject entryRuleInitialNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialNode = null;


        try {
            // InternalXdstm.g:827:52: (iv_ruleInitialNode= ruleInitialNode EOF )
            // InternalXdstm.g:828:2: iv_ruleInitialNode= ruleInitialNode EOF
            {
             newCompositeNode(grammarAccess.getInitialNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitialNode=ruleInitialNode();

            state._fsp--;

             current =iv_ruleInitialNode; 
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
    // $ANTLR end "entryRuleInitialNode"


    // $ANTLR start "ruleInitialNode"
    // InternalXdstm.g:834:1: ruleInitialNode returns [EObject current=null] : (otherlv_0= 'InitialNode' ( (lv_name_1_0= RULE_ID ) ) ( (lv_requirements_2_0= ruleRequirements ) ) ) ;
    public final EObject ruleInitialNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_requirements_2_0 = null;



        	enterRule();

        try {
            // InternalXdstm.g:840:2: ( (otherlv_0= 'InitialNode' ( (lv_name_1_0= RULE_ID ) ) ( (lv_requirements_2_0= ruleRequirements ) ) ) )
            // InternalXdstm.g:841:2: (otherlv_0= 'InitialNode' ( (lv_name_1_0= RULE_ID ) ) ( (lv_requirements_2_0= ruleRequirements ) ) )
            {
            // InternalXdstm.g:841:2: (otherlv_0= 'InitialNode' ( (lv_name_1_0= RULE_ID ) ) ( (lv_requirements_2_0= ruleRequirements ) ) )
            // InternalXdstm.g:842:3: otherlv_0= 'InitialNode' ( (lv_name_1_0= RULE_ID ) ) ( (lv_requirements_2_0= ruleRequirements ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getInitialNodeAccess().getInitialNodeKeyword_0());
            		
            // InternalXdstm.g:846:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXdstm.g:847:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXdstm.g:847:4: (lv_name_1_0= RULE_ID )
            // InternalXdstm.g:848:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_name_1_0, grammarAccess.getInitialNodeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInitialNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalXdstm.g:864:3: ( (lv_requirements_2_0= ruleRequirements ) )
            // InternalXdstm.g:865:4: (lv_requirements_2_0= ruleRequirements )
            {
            // InternalXdstm.g:865:4: (lv_requirements_2_0= ruleRequirements )
            // InternalXdstm.g:866:5: lv_requirements_2_0= ruleRequirements
            {

            					newCompositeNode(grammarAccess.getInitialNodeAccess().getRequirementsRequirementsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_requirements_2_0=ruleRequirements();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInitialNodeRule());
            					}
            					set(
            						current,
            						"requirements",
            						lv_requirements_2_0,
            						"org.xtext.unina.xdstm.Xdstm.Requirements");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleInitialNode"


    // $ANTLR start "entryRuleExitingNode"
    // InternalXdstm.g:887:1: entryRuleExitingNode returns [EObject current=null] : iv_ruleExitingNode= ruleExitingNode EOF ;
    public final EObject entryRuleExitingNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitingNode = null;


        try {
            // InternalXdstm.g:887:52: (iv_ruleExitingNode= ruleExitingNode EOF )
            // InternalXdstm.g:888:2: iv_ruleExitingNode= ruleExitingNode EOF
            {
             newCompositeNode(grammarAccess.getExitingNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExitingNode=ruleExitingNode();

            state._fsp--;

             current =iv_ruleExitingNode; 
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
    // $ANTLR end "entryRuleExitingNode"


    // $ANTLR start "ruleExitingNode"
    // InternalXdstm.g:894:1: ruleExitingNode returns [EObject current=null] : (otherlv_0= 'ExitingNode' ( (lv_name_1_0= RULE_ID ) ) ( (lv_requirements_2_0= ruleRequirements ) ) ) ;
    public final EObject ruleExitingNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_requirements_2_0 = null;



        	enterRule();

        try {
            // InternalXdstm.g:900:2: ( (otherlv_0= 'ExitingNode' ( (lv_name_1_0= RULE_ID ) ) ( (lv_requirements_2_0= ruleRequirements ) ) ) )
            // InternalXdstm.g:901:2: (otherlv_0= 'ExitingNode' ( (lv_name_1_0= RULE_ID ) ) ( (lv_requirements_2_0= ruleRequirements ) ) )
            {
            // InternalXdstm.g:901:2: (otherlv_0= 'ExitingNode' ( (lv_name_1_0= RULE_ID ) ) ( (lv_requirements_2_0= ruleRequirements ) ) )
            // InternalXdstm.g:902:3: otherlv_0= 'ExitingNode' ( (lv_name_1_0= RULE_ID ) ) ( (lv_requirements_2_0= ruleRequirements ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getExitingNodeAccess().getExitingNodeKeyword_0());
            		
            // InternalXdstm.g:906:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXdstm.g:907:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXdstm.g:907:4: (lv_name_1_0= RULE_ID )
            // InternalXdstm.g:908:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_name_1_0, grammarAccess.getExitingNodeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExitingNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalXdstm.g:924:3: ( (lv_requirements_2_0= ruleRequirements ) )
            // InternalXdstm.g:925:4: (lv_requirements_2_0= ruleRequirements )
            {
            // InternalXdstm.g:925:4: (lv_requirements_2_0= ruleRequirements )
            // InternalXdstm.g:926:5: lv_requirements_2_0= ruleRequirements
            {

            					newCompositeNode(grammarAccess.getExitingNodeAccess().getRequirementsRequirementsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_requirements_2_0=ruleRequirements();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExitingNodeRule());
            					}
            					set(
            						current,
            						"requirements",
            						lv_requirements_2_0,
            						"org.xtext.unina.xdstm.Xdstm.Requirements");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleExitingNode"


    // $ANTLR start "entryRuleFork"
    // InternalXdstm.g:947:1: entryRuleFork returns [EObject current=null] : iv_ruleFork= ruleFork EOF ;
    public final EObject entryRuleFork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFork = null;


        try {
            // InternalXdstm.g:947:45: (iv_ruleFork= ruleFork EOF )
            // InternalXdstm.g:948:2: iv_ruleFork= ruleFork EOF
            {
             newCompositeNode(grammarAccess.getForkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFork=ruleFork();

            state._fsp--;

             current =iv_ruleFork; 
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
    // $ANTLR end "entryRuleFork"


    // $ANTLR start "ruleFork"
    // InternalXdstm.g:954:1: ruleFork returns [EObject current=null] : (otherlv_0= 'Fork' ( (lv_name_1_0= RULE_ID ) ) ( (lv_requirements_2_0= ruleRequirements ) ) ) ;
    public final EObject ruleFork() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_requirements_2_0 = null;



        	enterRule();

        try {
            // InternalXdstm.g:960:2: ( (otherlv_0= 'Fork' ( (lv_name_1_0= RULE_ID ) ) ( (lv_requirements_2_0= ruleRequirements ) ) ) )
            // InternalXdstm.g:961:2: (otherlv_0= 'Fork' ( (lv_name_1_0= RULE_ID ) ) ( (lv_requirements_2_0= ruleRequirements ) ) )
            {
            // InternalXdstm.g:961:2: (otherlv_0= 'Fork' ( (lv_name_1_0= RULE_ID ) ) ( (lv_requirements_2_0= ruleRequirements ) ) )
            // InternalXdstm.g:962:3: otherlv_0= 'Fork' ( (lv_name_1_0= RULE_ID ) ) ( (lv_requirements_2_0= ruleRequirements ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getForkAccess().getForkKeyword_0());
            		
            // InternalXdstm.g:966:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXdstm.g:967:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXdstm.g:967:4: (lv_name_1_0= RULE_ID )
            // InternalXdstm.g:968:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_name_1_0, grammarAccess.getForkAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalXdstm.g:984:3: ( (lv_requirements_2_0= ruleRequirements ) )
            // InternalXdstm.g:985:4: (lv_requirements_2_0= ruleRequirements )
            {
            // InternalXdstm.g:985:4: (lv_requirements_2_0= ruleRequirements )
            // InternalXdstm.g:986:5: lv_requirements_2_0= ruleRequirements
            {

            					newCompositeNode(grammarAccess.getForkAccess().getRequirementsRequirementsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_requirements_2_0=ruleRequirements();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForkRule());
            					}
            					set(
            						current,
            						"requirements",
            						lv_requirements_2_0,
            						"org.xtext.unina.xdstm.Xdstm.Requirements");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleFork"


    // $ANTLR start "entryRuleJoin"
    // InternalXdstm.g:1007:1: entryRuleJoin returns [EObject current=null] : iv_ruleJoin= ruleJoin EOF ;
    public final EObject entryRuleJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoin = null;


        try {
            // InternalXdstm.g:1007:45: (iv_ruleJoin= ruleJoin EOF )
            // InternalXdstm.g:1008:2: iv_ruleJoin= ruleJoin EOF
            {
             newCompositeNode(grammarAccess.getJoinRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJoin=ruleJoin();

            state._fsp--;

             current =iv_ruleJoin; 
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
    // $ANTLR end "entryRuleJoin"


    // $ANTLR start "ruleJoin"
    // InternalXdstm.g:1014:1: ruleJoin returns [EObject current=null] : (otherlv_0= 'Join' ( (lv_name_1_0= RULE_ID ) ) ( (lv_requirements_2_0= ruleRequirements ) ) ) ;
    public final EObject ruleJoin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_requirements_2_0 = null;



        	enterRule();

        try {
            // InternalXdstm.g:1020:2: ( (otherlv_0= 'Join' ( (lv_name_1_0= RULE_ID ) ) ( (lv_requirements_2_0= ruleRequirements ) ) ) )
            // InternalXdstm.g:1021:2: (otherlv_0= 'Join' ( (lv_name_1_0= RULE_ID ) ) ( (lv_requirements_2_0= ruleRequirements ) ) )
            {
            // InternalXdstm.g:1021:2: (otherlv_0= 'Join' ( (lv_name_1_0= RULE_ID ) ) ( (lv_requirements_2_0= ruleRequirements ) ) )
            // InternalXdstm.g:1022:3: otherlv_0= 'Join' ( (lv_name_1_0= RULE_ID ) ) ( (lv_requirements_2_0= ruleRequirements ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getJoinAccess().getJoinKeyword_0());
            		
            // InternalXdstm.g:1026:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXdstm.g:1027:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXdstm.g:1027:4: (lv_name_1_0= RULE_ID )
            // InternalXdstm.g:1028:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_name_1_0, grammarAccess.getJoinAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJoinRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalXdstm.g:1044:3: ( (lv_requirements_2_0= ruleRequirements ) )
            // InternalXdstm.g:1045:4: (lv_requirements_2_0= ruleRequirements )
            {
            // InternalXdstm.g:1045:4: (lv_requirements_2_0= ruleRequirements )
            // InternalXdstm.g:1046:5: lv_requirements_2_0= ruleRequirements
            {

            					newCompositeNode(grammarAccess.getJoinAccess().getRequirementsRequirementsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_requirements_2_0=ruleRequirements();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJoinRule());
            					}
            					set(
            						current,
            						"requirements",
            						lv_requirements_2_0,
            						"org.xtext.unina.xdstm.Xdstm.Requirements");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleJoin"


    // $ANTLR start "entryRuleTransition"
    // InternalXdstm.g:1067:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalXdstm.g:1067:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalXdstm.g:1068:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalXdstm.g:1074:1: ruleTransition returns [EObject current=null] : (otherlv_0= 'Transition' ( (lv_name_1_0= RULE_ID ) ) ( (lv_requirements_2_0= ruleRequirements ) ) otherlv_3= '{' otherlv_4= 'source' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' otherlv_7= 'exiting_node' ( ( ruleEString ) ) )? otherlv_9= ',' otherlv_10= 'destination' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' otherlv_13= 'entering_node' ( ( ruleEString ) ) )? (otherlv_15= ',' ( (lv_is_preemptive_16_0= 'isPreemptive' ) ) )? (otherlv_17= ',' otherlv_18= 'trigger' ( (lv_trigger_19_0= RULE_STRING ) ) )? (otherlv_20= ',' otherlv_21= 'condition' ( (lv_condition_22_0= RULE_STRING ) ) )? (otherlv_23= ',' otherlv_24= 'actions' otherlv_25= '{' ( (lv_actions_26_0= RULE_STRING ) ) (otherlv_27= ',' ( (lv_actions_28_0= RULE_STRING ) ) )* otherlv_29= '}' )? (otherlv_30= ',' otherlv_31= 'par_instantiation' otherlv_32= '{' ( (lv_par_instantiation_33_0= RULE_STRING ) ) (otherlv_34= ',' ( (lv_par_instantiation_35_0= RULE_STRING ) ) )* otherlv_36= '}' )? otherlv_37= '}' ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token lv_is_preemptive_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_trigger_19_0=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token lv_condition_22_0=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token lv_actions_26_0=null;
        Token otherlv_27=null;
        Token lv_actions_28_0=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token lv_par_instantiation_33_0=null;
        Token otherlv_34=null;
        Token lv_par_instantiation_35_0=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        EObject lv_requirements_2_0 = null;



        	enterRule();

        try {
            // InternalXdstm.g:1080:2: ( (otherlv_0= 'Transition' ( (lv_name_1_0= RULE_ID ) ) ( (lv_requirements_2_0= ruleRequirements ) ) otherlv_3= '{' otherlv_4= 'source' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' otherlv_7= 'exiting_node' ( ( ruleEString ) ) )? otherlv_9= ',' otherlv_10= 'destination' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' otherlv_13= 'entering_node' ( ( ruleEString ) ) )? (otherlv_15= ',' ( (lv_is_preemptive_16_0= 'isPreemptive' ) ) )? (otherlv_17= ',' otherlv_18= 'trigger' ( (lv_trigger_19_0= RULE_STRING ) ) )? (otherlv_20= ',' otherlv_21= 'condition' ( (lv_condition_22_0= RULE_STRING ) ) )? (otherlv_23= ',' otherlv_24= 'actions' otherlv_25= '{' ( (lv_actions_26_0= RULE_STRING ) ) (otherlv_27= ',' ( (lv_actions_28_0= RULE_STRING ) ) )* otherlv_29= '}' )? (otherlv_30= ',' otherlv_31= 'par_instantiation' otherlv_32= '{' ( (lv_par_instantiation_33_0= RULE_STRING ) ) (otherlv_34= ',' ( (lv_par_instantiation_35_0= RULE_STRING ) ) )* otherlv_36= '}' )? otherlv_37= '}' ) )
            // InternalXdstm.g:1081:2: (otherlv_0= 'Transition' ( (lv_name_1_0= RULE_ID ) ) ( (lv_requirements_2_0= ruleRequirements ) ) otherlv_3= '{' otherlv_4= 'source' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' otherlv_7= 'exiting_node' ( ( ruleEString ) ) )? otherlv_9= ',' otherlv_10= 'destination' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' otherlv_13= 'entering_node' ( ( ruleEString ) ) )? (otherlv_15= ',' ( (lv_is_preemptive_16_0= 'isPreemptive' ) ) )? (otherlv_17= ',' otherlv_18= 'trigger' ( (lv_trigger_19_0= RULE_STRING ) ) )? (otherlv_20= ',' otherlv_21= 'condition' ( (lv_condition_22_0= RULE_STRING ) ) )? (otherlv_23= ',' otherlv_24= 'actions' otherlv_25= '{' ( (lv_actions_26_0= RULE_STRING ) ) (otherlv_27= ',' ( (lv_actions_28_0= RULE_STRING ) ) )* otherlv_29= '}' )? (otherlv_30= ',' otherlv_31= 'par_instantiation' otherlv_32= '{' ( (lv_par_instantiation_33_0= RULE_STRING ) ) (otherlv_34= ',' ( (lv_par_instantiation_35_0= RULE_STRING ) ) )* otherlv_36= '}' )? otherlv_37= '}' )
            {
            // InternalXdstm.g:1081:2: (otherlv_0= 'Transition' ( (lv_name_1_0= RULE_ID ) ) ( (lv_requirements_2_0= ruleRequirements ) ) otherlv_3= '{' otherlv_4= 'source' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' otherlv_7= 'exiting_node' ( ( ruleEString ) ) )? otherlv_9= ',' otherlv_10= 'destination' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' otherlv_13= 'entering_node' ( ( ruleEString ) ) )? (otherlv_15= ',' ( (lv_is_preemptive_16_0= 'isPreemptive' ) ) )? (otherlv_17= ',' otherlv_18= 'trigger' ( (lv_trigger_19_0= RULE_STRING ) ) )? (otherlv_20= ',' otherlv_21= 'condition' ( (lv_condition_22_0= RULE_STRING ) ) )? (otherlv_23= ',' otherlv_24= 'actions' otherlv_25= '{' ( (lv_actions_26_0= RULE_STRING ) ) (otherlv_27= ',' ( (lv_actions_28_0= RULE_STRING ) ) )* otherlv_29= '}' )? (otherlv_30= ',' otherlv_31= 'par_instantiation' otherlv_32= '{' ( (lv_par_instantiation_33_0= RULE_STRING ) ) (otherlv_34= ',' ( (lv_par_instantiation_35_0= RULE_STRING ) ) )* otherlv_36= '}' )? otherlv_37= '}' )
            // InternalXdstm.g:1082:3: otherlv_0= 'Transition' ( (lv_name_1_0= RULE_ID ) ) ( (lv_requirements_2_0= ruleRequirements ) ) otherlv_3= '{' otherlv_4= 'source' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' otherlv_7= 'exiting_node' ( ( ruleEString ) ) )? otherlv_9= ',' otherlv_10= 'destination' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' otherlv_13= 'entering_node' ( ( ruleEString ) ) )? (otherlv_15= ',' ( (lv_is_preemptive_16_0= 'isPreemptive' ) ) )? (otherlv_17= ',' otherlv_18= 'trigger' ( (lv_trigger_19_0= RULE_STRING ) ) )? (otherlv_20= ',' otherlv_21= 'condition' ( (lv_condition_22_0= RULE_STRING ) ) )? (otherlv_23= ',' otherlv_24= 'actions' otherlv_25= '{' ( (lv_actions_26_0= RULE_STRING ) ) (otherlv_27= ',' ( (lv_actions_28_0= RULE_STRING ) ) )* otherlv_29= '}' )? (otherlv_30= ',' otherlv_31= 'par_instantiation' otherlv_32= '{' ( (lv_par_instantiation_33_0= RULE_STRING ) ) (otherlv_34= ',' ( (lv_par_instantiation_35_0= RULE_STRING ) ) )* otherlv_36= '}' )? otherlv_37= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getTransitionKeyword_0());
            		
            // InternalXdstm.g:1086:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXdstm.g:1087:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXdstm.g:1087:4: (lv_name_1_0= RULE_ID )
            // InternalXdstm.g:1088:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTransitionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalXdstm.g:1104:3: ( (lv_requirements_2_0= ruleRequirements ) )
            // InternalXdstm.g:1105:4: (lv_requirements_2_0= ruleRequirements )
            {
            // InternalXdstm.g:1105:4: (lv_requirements_2_0= ruleRequirements )
            // InternalXdstm.g:1106:5: lv_requirements_2_0= ruleRequirements
            {

            					newCompositeNode(grammarAccess.getTransitionAccess().getRequirementsRequirementsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_requirements_2_0=ruleRequirements();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionRule());
            					}
            					set(
            						current,
            						"requirements",
            						lv_requirements_2_0,
            						"org.xtext.unina.xdstm.Xdstm.Requirements");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,34,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getSourceKeyword_4());
            		
            // InternalXdstm.g:1131:3: ( (otherlv_5= RULE_ID ) )
            // InternalXdstm.g:1132:4: (otherlv_5= RULE_ID )
            {
            // InternalXdstm.g:1132:4: (otherlv_5= RULE_ID )
            // InternalXdstm.g:1133:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getSourceSourceCrossReference_5_0());
            				

            }


            }

            // InternalXdstm.g:1144:3: (otherlv_6= ',' otherlv_7= 'exiting_node' ( ( ruleEString ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==35) ) {
                    alt8=1;
                }
            }
            switch (alt8) {
                case 1 :
                    // InternalXdstm.g:1145:4: otherlv_6= ',' otherlv_7= 'exiting_node' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,17,FOLLOW_25); 

                    				newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getCommaKeyword_6_0());
                    			
                    otherlv_7=(Token)match(input,35,FOLLOW_26); 

                    				newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getExiting_nodeKeyword_6_1());
                    			
                    // InternalXdstm.g:1153:4: ( ( ruleEString ) )
                    // InternalXdstm.g:1154:5: ( ruleEString )
                    {
                    // InternalXdstm.g:1154:5: ( ruleEString )
                    // InternalXdstm.g:1155:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTransitionAccess().getExiting_nodeExitingNodeCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_24);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FOLLOW_27); 

            			newLeafNode(otherlv_9, grammarAccess.getTransitionAccess().getCommaKeyword_7());
            		
            otherlv_10=(Token)match(input,36,FOLLOW_7); 

            			newLeafNode(otherlv_10, grammarAccess.getTransitionAccess().getDestinationKeyword_8());
            		
            // InternalXdstm.g:1178:3: ( (otherlv_11= RULE_ID ) )
            // InternalXdstm.g:1179:4: (otherlv_11= RULE_ID )
            {
            // InternalXdstm.g:1179:4: (otherlv_11= RULE_ID )
            // InternalXdstm.g:1180:5: otherlv_11= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				
            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_11, grammarAccess.getTransitionAccess().getDestinationDestinationCrossReference_9_0());
            				

            }


            }

            // InternalXdstm.g:1191:3: (otherlv_12= ',' otherlv_13= 'entering_node' ( ( ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==37) ) {
                    alt9=1;
                }
            }
            switch (alt9) {
                case 1 :
                    // InternalXdstm.g:1192:4: otherlv_12= ',' otherlv_13= 'entering_node' ( ( ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,17,FOLLOW_28); 

                    				newLeafNode(otherlv_12, grammarAccess.getTransitionAccess().getCommaKeyword_10_0());
                    			
                    otherlv_13=(Token)match(input,37,FOLLOW_26); 

                    				newLeafNode(otherlv_13, grammarAccess.getTransitionAccess().getEntering_nodeKeyword_10_1());
                    			
                    // InternalXdstm.g:1200:4: ( ( ruleEString ) )
                    // InternalXdstm.g:1201:5: ( ruleEString )
                    {
                    // InternalXdstm.g:1201:5: ( ruleEString )
                    // InternalXdstm.g:1202:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTransitionAccess().getEntering_nodeEnteringNodeAbsCrossReference_10_2_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXdstm.g:1217:3: (otherlv_15= ',' ( (lv_is_preemptive_16_0= 'isPreemptive' ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==38) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // InternalXdstm.g:1218:4: otherlv_15= ',' ( (lv_is_preemptive_16_0= 'isPreemptive' ) )
                    {
                    otherlv_15=(Token)match(input,17,FOLLOW_29); 

                    				newLeafNode(otherlv_15, grammarAccess.getTransitionAccess().getCommaKeyword_11_0());
                    			
                    // InternalXdstm.g:1222:4: ( (lv_is_preemptive_16_0= 'isPreemptive' ) )
                    // InternalXdstm.g:1223:5: (lv_is_preemptive_16_0= 'isPreemptive' )
                    {
                    // InternalXdstm.g:1223:5: (lv_is_preemptive_16_0= 'isPreemptive' )
                    // InternalXdstm.g:1224:6: lv_is_preemptive_16_0= 'isPreemptive'
                    {
                    lv_is_preemptive_16_0=(Token)match(input,38,FOLLOW_16); 

                    						newLeafNode(lv_is_preemptive_16_0, grammarAccess.getTransitionAccess().getIs_preemptiveIsPreemptiveKeyword_11_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionRule());
                    						}
                    						setWithLastConsumed(current, "is_preemptive", true, "isPreemptive");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXdstm.g:1237:3: (otherlv_17= ',' otherlv_18= 'trigger' ( (lv_trigger_19_0= RULE_STRING ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==39) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // InternalXdstm.g:1238:4: otherlv_17= ',' otherlv_18= 'trigger' ( (lv_trigger_19_0= RULE_STRING ) )
                    {
                    otherlv_17=(Token)match(input,17,FOLLOW_30); 

                    				newLeafNode(otherlv_17, grammarAccess.getTransitionAccess().getCommaKeyword_12_0());
                    			
                    otherlv_18=(Token)match(input,39,FOLLOW_5); 

                    				newLeafNode(otherlv_18, grammarAccess.getTransitionAccess().getTriggerKeyword_12_1());
                    			
                    // InternalXdstm.g:1246:4: ( (lv_trigger_19_0= RULE_STRING ) )
                    // InternalXdstm.g:1247:5: (lv_trigger_19_0= RULE_STRING )
                    {
                    // InternalXdstm.g:1247:5: (lv_trigger_19_0= RULE_STRING )
                    // InternalXdstm.g:1248:6: lv_trigger_19_0= RULE_STRING
                    {
                    lv_trigger_19_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

                    						newLeafNode(lv_trigger_19_0, grammarAccess.getTransitionAccess().getTriggerSTRINGTerminalRuleCall_12_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"trigger",
                    							lv_trigger_19_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXdstm.g:1265:3: (otherlv_20= ',' otherlv_21= 'condition' ( (lv_condition_22_0= RULE_STRING ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==17) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==40) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // InternalXdstm.g:1266:4: otherlv_20= ',' otherlv_21= 'condition' ( (lv_condition_22_0= RULE_STRING ) )
                    {
                    otherlv_20=(Token)match(input,17,FOLLOW_31); 

                    				newLeafNode(otherlv_20, grammarAccess.getTransitionAccess().getCommaKeyword_13_0());
                    			
                    otherlv_21=(Token)match(input,40,FOLLOW_5); 

                    				newLeafNode(otherlv_21, grammarAccess.getTransitionAccess().getConditionKeyword_13_1());
                    			
                    // InternalXdstm.g:1274:4: ( (lv_condition_22_0= RULE_STRING ) )
                    // InternalXdstm.g:1275:5: (lv_condition_22_0= RULE_STRING )
                    {
                    // InternalXdstm.g:1275:5: (lv_condition_22_0= RULE_STRING )
                    // InternalXdstm.g:1276:6: lv_condition_22_0= RULE_STRING
                    {
                    lv_condition_22_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

                    						newLeafNode(lv_condition_22_0, grammarAccess.getTransitionAccess().getConditionSTRINGTerminalRuleCall_13_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"condition",
                    							lv_condition_22_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXdstm.g:1293:3: (otherlv_23= ',' otherlv_24= 'actions' otherlv_25= '{' ( (lv_actions_26_0= RULE_STRING ) ) (otherlv_27= ',' ( (lv_actions_28_0= RULE_STRING ) ) )* otherlv_29= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==17) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==41) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // InternalXdstm.g:1294:4: otherlv_23= ',' otherlv_24= 'actions' otherlv_25= '{' ( (lv_actions_26_0= RULE_STRING ) ) (otherlv_27= ',' ( (lv_actions_28_0= RULE_STRING ) ) )* otherlv_29= '}'
                    {
                    otherlv_23=(Token)match(input,17,FOLLOW_32); 

                    				newLeafNode(otherlv_23, grammarAccess.getTransitionAccess().getCommaKeyword_14_0());
                    			
                    otherlv_24=(Token)match(input,41,FOLLOW_8); 

                    				newLeafNode(otherlv_24, grammarAccess.getTransitionAccess().getActionsKeyword_14_1());
                    			
                    otherlv_25=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_25, grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_14_2());
                    			
                    // InternalXdstm.g:1306:4: ( (lv_actions_26_0= RULE_STRING ) )
                    // InternalXdstm.g:1307:5: (lv_actions_26_0= RULE_STRING )
                    {
                    // InternalXdstm.g:1307:5: (lv_actions_26_0= RULE_STRING )
                    // InternalXdstm.g:1308:6: lv_actions_26_0= RULE_STRING
                    {
                    lv_actions_26_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

                    						newLeafNode(lv_actions_26_0, grammarAccess.getTransitionAccess().getActionsSTRINGTerminalRuleCall_14_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"actions",
                    							lv_actions_26_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalXdstm.g:1324:4: (otherlv_27= ',' ( (lv_actions_28_0= RULE_STRING ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==17) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalXdstm.g:1325:5: otherlv_27= ',' ( (lv_actions_28_0= RULE_STRING ) )
                    	    {
                    	    otherlv_27=(Token)match(input,17,FOLLOW_5); 

                    	    					newLeafNode(otherlv_27, grammarAccess.getTransitionAccess().getCommaKeyword_14_4_0());
                    	    				
                    	    // InternalXdstm.g:1329:5: ( (lv_actions_28_0= RULE_STRING ) )
                    	    // InternalXdstm.g:1330:6: (lv_actions_28_0= RULE_STRING )
                    	    {
                    	    // InternalXdstm.g:1330:6: (lv_actions_28_0= RULE_STRING )
                    	    // InternalXdstm.g:1331:7: lv_actions_28_0= RULE_STRING
                    	    {
                    	    lv_actions_28_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

                    	    							newLeafNode(lv_actions_28_0, grammarAccess.getTransitionAccess().getActionsSTRINGTerminalRuleCall_14_4_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTransitionRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"actions",
                    	    								lv_actions_28_0,
                    	    								"org.eclipse.xtext.common.Terminals.STRING");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,19,FOLLOW_16); 

                    				newLeafNode(otherlv_29, grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_14_5());
                    			

                    }
                    break;

            }

            // InternalXdstm.g:1353:3: (otherlv_30= ',' otherlv_31= 'par_instantiation' otherlv_32= '{' ( (lv_par_instantiation_33_0= RULE_STRING ) ) (otherlv_34= ',' ( (lv_par_instantiation_35_0= RULE_STRING ) ) )* otherlv_36= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==17) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalXdstm.g:1354:4: otherlv_30= ',' otherlv_31= 'par_instantiation' otherlv_32= '{' ( (lv_par_instantiation_33_0= RULE_STRING ) ) (otherlv_34= ',' ( (lv_par_instantiation_35_0= RULE_STRING ) ) )* otherlv_36= '}'
                    {
                    otherlv_30=(Token)match(input,17,FOLLOW_33); 

                    				newLeafNode(otherlv_30, grammarAccess.getTransitionAccess().getCommaKeyword_15_0());
                    			
                    otherlv_31=(Token)match(input,42,FOLLOW_8); 

                    				newLeafNode(otherlv_31, grammarAccess.getTransitionAccess().getPar_instantiationKeyword_15_1());
                    			
                    otherlv_32=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_32, grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_15_2());
                    			
                    // InternalXdstm.g:1366:4: ( (lv_par_instantiation_33_0= RULE_STRING ) )
                    // InternalXdstm.g:1367:5: (lv_par_instantiation_33_0= RULE_STRING )
                    {
                    // InternalXdstm.g:1367:5: (lv_par_instantiation_33_0= RULE_STRING )
                    // InternalXdstm.g:1368:6: lv_par_instantiation_33_0= RULE_STRING
                    {
                    lv_par_instantiation_33_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

                    						newLeafNode(lv_par_instantiation_33_0, grammarAccess.getTransitionAccess().getPar_instantiationSTRINGTerminalRuleCall_15_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"par_instantiation",
                    							lv_par_instantiation_33_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalXdstm.g:1384:4: (otherlv_34= ',' ( (lv_par_instantiation_35_0= RULE_STRING ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==17) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalXdstm.g:1385:5: otherlv_34= ',' ( (lv_par_instantiation_35_0= RULE_STRING ) )
                    	    {
                    	    otherlv_34=(Token)match(input,17,FOLLOW_5); 

                    	    					newLeafNode(otherlv_34, grammarAccess.getTransitionAccess().getCommaKeyword_15_4_0());
                    	    				
                    	    // InternalXdstm.g:1389:5: ( (lv_par_instantiation_35_0= RULE_STRING ) )
                    	    // InternalXdstm.g:1390:6: (lv_par_instantiation_35_0= RULE_STRING )
                    	    {
                    	    // InternalXdstm.g:1390:6: (lv_par_instantiation_35_0= RULE_STRING )
                    	    // InternalXdstm.g:1391:7: lv_par_instantiation_35_0= RULE_STRING
                    	    {
                    	    lv_par_instantiation_35_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

                    	    							newLeafNode(lv_par_instantiation_35_0, grammarAccess.getTransitionAccess().getPar_instantiationSTRINGTerminalRuleCall_15_4_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTransitionRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"par_instantiation",
                    	    								lv_par_instantiation_35_0,
                    	    								"org.eclipse.xtext.common.Terminals.STRING");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_36=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_36, grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_15_5());
                    			

                    }
                    break;

            }

            otherlv_37=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_37, grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_16());
            		

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
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleRequirements"
    // InternalXdstm.g:1421:1: entryRuleRequirements returns [EObject current=null] : iv_ruleRequirements= ruleRequirements EOF ;
    public final EObject entryRuleRequirements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirements = null;


        try {
            // InternalXdstm.g:1421:53: (iv_ruleRequirements= ruleRequirements EOF )
            // InternalXdstm.g:1422:2: iv_ruleRequirements= ruleRequirements EOF
            {
             newCompositeNode(grammarAccess.getRequirementsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequirements=ruleRequirements();

            state._fsp--;

             current =iv_ruleRequirements; 
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
    // $ANTLR end "entryRuleRequirements"


    // $ANTLR start "ruleRequirements"
    // InternalXdstm.g:1428:1: ruleRequirements returns [EObject current=null] : ( () (otherlv_1= '(' otherlv_2= 'requirements' otherlv_3= '=' ( (lv_requirements_4_0= RULE_STRING ) ) (otherlv_5= ',' ( (lv_requirements_6_0= RULE_STRING ) ) )* otherlv_7= ')' )? ) ;
    public final EObject ruleRequirements() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_requirements_4_0=null;
        Token otherlv_5=null;
        Token lv_requirements_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalXdstm.g:1434:2: ( ( () (otherlv_1= '(' otherlv_2= 'requirements' otherlv_3= '=' ( (lv_requirements_4_0= RULE_STRING ) ) (otherlv_5= ',' ( (lv_requirements_6_0= RULE_STRING ) ) )* otherlv_7= ')' )? ) )
            // InternalXdstm.g:1435:2: ( () (otherlv_1= '(' otherlv_2= 'requirements' otherlv_3= '=' ( (lv_requirements_4_0= RULE_STRING ) ) (otherlv_5= ',' ( (lv_requirements_6_0= RULE_STRING ) ) )* otherlv_7= ')' )? )
            {
            // InternalXdstm.g:1435:2: ( () (otherlv_1= '(' otherlv_2= 'requirements' otherlv_3= '=' ( (lv_requirements_4_0= RULE_STRING ) ) (otherlv_5= ',' ( (lv_requirements_6_0= RULE_STRING ) ) )* otherlv_7= ')' )? )
            // InternalXdstm.g:1436:3: () (otherlv_1= '(' otherlv_2= 'requirements' otherlv_3= '=' ( (lv_requirements_4_0= RULE_STRING ) ) (otherlv_5= ',' ( (lv_requirements_6_0= RULE_STRING ) ) )* otherlv_7= ')' )?
            {
            // InternalXdstm.g:1436:3: ()
            // InternalXdstm.g:1437:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRequirementsAccess().getRequirementsAction_0(),
            					current);
            			

            }

            // InternalXdstm.g:1443:3: (otherlv_1= '(' otherlv_2= 'requirements' otherlv_3= '=' ( (lv_requirements_4_0= RULE_STRING ) ) (otherlv_5= ',' ( (lv_requirements_6_0= RULE_STRING ) ) )* otherlv_7= ')' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalXdstm.g:1444:4: otherlv_1= '(' otherlv_2= 'requirements' otherlv_3= '=' ( (lv_requirements_4_0= RULE_STRING ) ) (otherlv_5= ',' ( (lv_requirements_6_0= RULE_STRING ) ) )* otherlv_7= ')'
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_34); 

                    				newLeafNode(otherlv_1, grammarAccess.getRequirementsAccess().getLeftParenthesisKeyword_1_0());
                    			
                    otherlv_2=(Token)match(input,43,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getRequirementsAccess().getRequirementsKeyword_1_1());
                    			
                    otherlv_3=(Token)match(input,16,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getRequirementsAccess().getEqualsSignKeyword_1_2());
                    			
                    // InternalXdstm.g:1456:4: ( (lv_requirements_4_0= RULE_STRING ) )
                    // InternalXdstm.g:1457:5: (lv_requirements_4_0= RULE_STRING )
                    {
                    // InternalXdstm.g:1457:5: (lv_requirements_4_0= RULE_STRING )
                    // InternalXdstm.g:1458:6: lv_requirements_4_0= RULE_STRING
                    {
                    lv_requirements_4_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

                    						newLeafNode(lv_requirements_4_0, grammarAccess.getRequirementsAccess().getRequirementsSTRINGTerminalRuleCall_1_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRequirementsRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"requirements",
                    							lv_requirements_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalXdstm.g:1474:4: (otherlv_5= ',' ( (lv_requirements_6_0= RULE_STRING ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==17) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalXdstm.g:1475:5: otherlv_5= ',' ( (lv_requirements_6_0= RULE_STRING ) )
                    	    {
                    	    otherlv_5=(Token)match(input,17,FOLLOW_5); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getRequirementsAccess().getCommaKeyword_1_4_0());
                    	    				
                    	    // InternalXdstm.g:1479:5: ( (lv_requirements_6_0= RULE_STRING ) )
                    	    // InternalXdstm.g:1480:6: (lv_requirements_6_0= RULE_STRING )
                    	    {
                    	    // InternalXdstm.g:1480:6: (lv_requirements_6_0= RULE_STRING )
                    	    // InternalXdstm.g:1481:7: lv_requirements_6_0= RULE_STRING
                    	    {
                    	    lv_requirements_6_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

                    	    							newLeafNode(lv_requirements_6_0, grammarAccess.getRequirementsAccess().getRequirementsSTRINGTerminalRuleCall_1_4_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getRequirementsRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"requirements",
                    	    								lv_requirements_6_0,
                    	    								"org.eclipse.xtext.common.Terminals.STRING");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getRequirementsAccess().getRightParenthesisKeyword_1_5());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleRequirements"


    // $ANTLR start "entryRuleEString"
    // InternalXdstm.g:1507:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalXdstm.g:1507:47: (iv_ruleEString= ruleEString EOF )
            // InternalXdstm.g:1508:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalXdstm.g:1514:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalXdstm.g:1520:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalXdstm.g:1521:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalXdstm.g:1521:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_ID) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalXdstm.g:1522:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXdstm.g:1530:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000001F1800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004004000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000080000000000L});

}