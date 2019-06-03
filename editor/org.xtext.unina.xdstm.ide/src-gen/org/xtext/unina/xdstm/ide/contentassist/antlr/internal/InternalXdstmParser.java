package org.xtext.unina.xdstm.ide.contentassist.antlr.internal;

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
import org.xtext.unina.xdstm.services.XdstmGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXdstmParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "';'", "'DSTM'", "'{'", "'machines'", "'='", "'main'", "'}'", "','", "'Machine'", "'vertexes'", "'transitions'", "'Node'", "'Box'", "'instantiation'", "'('", "')'", "'EnteringNode'", "'InitialNode'", "'ExitingNode'", "'Fork'", "'Join'", "'Transition'", "'source'", "'destination'", "'exiting_node'", "'entering_node'", "'trigger'", "'condition'", "'actions'", "'par_instantiation'", "'requirements'", "'isPreemptive'"
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

    	public void setGrammarAccess(XdstmGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalXdstm.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalXdstm.g:54:1: ( ruleModel EOF )
            // InternalXdstm.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalXdstm.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalXdstm.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalXdstm.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalXdstm.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalXdstm.g:69:3: ( rule__Model__Group__0 )
            // InternalXdstm.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleinclude"
    // InternalXdstm.g:78:1: entryRuleinclude : ruleinclude EOF ;
    public final void entryRuleinclude() throws RecognitionException {
        try {
            // InternalXdstm.g:79:1: ( ruleinclude EOF )
            // InternalXdstm.g:80:1: ruleinclude EOF
            {
             before(grammarAccess.getIncludeRule()); 
            pushFollow(FOLLOW_1);
            ruleinclude();

            state._fsp--;

             after(grammarAccess.getIncludeRule()); 
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
    // $ANTLR end "entryRuleinclude"


    // $ANTLR start "ruleinclude"
    // InternalXdstm.g:87:1: ruleinclude : ( ( rule__Include__Group__0 ) ) ;
    public final void ruleinclude() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:91:2: ( ( ( rule__Include__Group__0 ) ) )
            // InternalXdstm.g:92:2: ( ( rule__Include__Group__0 ) )
            {
            // InternalXdstm.g:92:2: ( ( rule__Include__Group__0 ) )
            // InternalXdstm.g:93:3: ( rule__Include__Group__0 )
            {
             before(grammarAccess.getIncludeAccess().getGroup()); 
            // InternalXdstm.g:94:3: ( rule__Include__Group__0 )
            // InternalXdstm.g:94:4: rule__Include__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Include__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIncludeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleinclude"


    // $ANTLR start "entryRuleDSTM"
    // InternalXdstm.g:103:1: entryRuleDSTM : ruleDSTM EOF ;
    public final void entryRuleDSTM() throws RecognitionException {
        try {
            // InternalXdstm.g:104:1: ( ruleDSTM EOF )
            // InternalXdstm.g:105:1: ruleDSTM EOF
            {
             before(grammarAccess.getDSTMRule()); 
            pushFollow(FOLLOW_1);
            ruleDSTM();

            state._fsp--;

             after(grammarAccess.getDSTMRule()); 
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
    // $ANTLR end "entryRuleDSTM"


    // $ANTLR start "ruleDSTM"
    // InternalXdstm.g:112:1: ruleDSTM : ( ( rule__DSTM__Group__0 ) ) ;
    public final void ruleDSTM() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:116:2: ( ( ( rule__DSTM__Group__0 ) ) )
            // InternalXdstm.g:117:2: ( ( rule__DSTM__Group__0 ) )
            {
            // InternalXdstm.g:117:2: ( ( rule__DSTM__Group__0 ) )
            // InternalXdstm.g:118:3: ( rule__DSTM__Group__0 )
            {
             before(grammarAccess.getDSTMAccess().getGroup()); 
            // InternalXdstm.g:119:3: ( rule__DSTM__Group__0 )
            // InternalXdstm.g:119:4: rule__DSTM__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DSTM__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDSTMAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDSTM"


    // $ANTLR start "entryRuleMachine"
    // InternalXdstm.g:128:1: entryRuleMachine : ruleMachine EOF ;
    public final void entryRuleMachine() throws RecognitionException {
        try {
            // InternalXdstm.g:129:1: ( ruleMachine EOF )
            // InternalXdstm.g:130:1: ruleMachine EOF
            {
             before(grammarAccess.getMachineRule()); 
            pushFollow(FOLLOW_1);
            ruleMachine();

            state._fsp--;

             after(grammarAccess.getMachineRule()); 
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
    // $ANTLR end "entryRuleMachine"


    // $ANTLR start "ruleMachine"
    // InternalXdstm.g:137:1: ruleMachine : ( ( rule__Machine__Group__0 ) ) ;
    public final void ruleMachine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:141:2: ( ( ( rule__Machine__Group__0 ) ) )
            // InternalXdstm.g:142:2: ( ( rule__Machine__Group__0 ) )
            {
            // InternalXdstm.g:142:2: ( ( rule__Machine__Group__0 ) )
            // InternalXdstm.g:143:3: ( rule__Machine__Group__0 )
            {
             before(grammarAccess.getMachineAccess().getGroup()); 
            // InternalXdstm.g:144:3: ( rule__Machine__Group__0 )
            // InternalXdstm.g:144:4: rule__Machine__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMachine"


    // $ANTLR start "entryRuleVertex"
    // InternalXdstm.g:153:1: entryRuleVertex : ruleVertex EOF ;
    public final void entryRuleVertex() throws RecognitionException {
        try {
            // InternalXdstm.g:154:1: ( ruleVertex EOF )
            // InternalXdstm.g:155:1: ruleVertex EOF
            {
             before(grammarAccess.getVertexRule()); 
            pushFollow(FOLLOW_1);
            ruleVertex();

            state._fsp--;

             after(grammarAccess.getVertexRule()); 
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
    // $ANTLR end "entryRuleVertex"


    // $ANTLR start "ruleVertex"
    // InternalXdstm.g:162:1: ruleVertex : ( ( rule__Vertex__Alternatives ) ) ;
    public final void ruleVertex() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:166:2: ( ( ( rule__Vertex__Alternatives ) ) )
            // InternalXdstm.g:167:2: ( ( rule__Vertex__Alternatives ) )
            {
            // InternalXdstm.g:167:2: ( ( rule__Vertex__Alternatives ) )
            // InternalXdstm.g:168:3: ( rule__Vertex__Alternatives )
            {
             before(grammarAccess.getVertexAccess().getAlternatives()); 
            // InternalXdstm.g:169:3: ( rule__Vertex__Alternatives )
            // InternalXdstm.g:169:4: rule__Vertex__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Vertex__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVertexAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVertex"


    // $ANTLR start "entryRuleEnteringNodeAbs"
    // InternalXdstm.g:178:1: entryRuleEnteringNodeAbs : ruleEnteringNodeAbs EOF ;
    public final void entryRuleEnteringNodeAbs() throws RecognitionException {
        try {
            // InternalXdstm.g:179:1: ( ruleEnteringNodeAbs EOF )
            // InternalXdstm.g:180:1: ruleEnteringNodeAbs EOF
            {
             before(grammarAccess.getEnteringNodeAbsRule()); 
            pushFollow(FOLLOW_1);
            ruleEnteringNodeAbs();

            state._fsp--;

             after(grammarAccess.getEnteringNodeAbsRule()); 
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
    // $ANTLR end "entryRuleEnteringNodeAbs"


    // $ANTLR start "ruleEnteringNodeAbs"
    // InternalXdstm.g:187:1: ruleEnteringNodeAbs : ( ( rule__EnteringNodeAbs__Alternatives ) ) ;
    public final void ruleEnteringNodeAbs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:191:2: ( ( ( rule__EnteringNodeAbs__Alternatives ) ) )
            // InternalXdstm.g:192:2: ( ( rule__EnteringNodeAbs__Alternatives ) )
            {
            // InternalXdstm.g:192:2: ( ( rule__EnteringNodeAbs__Alternatives ) )
            // InternalXdstm.g:193:3: ( rule__EnteringNodeAbs__Alternatives )
            {
             before(grammarAccess.getEnteringNodeAbsAccess().getAlternatives()); 
            // InternalXdstm.g:194:3: ( rule__EnteringNodeAbs__Alternatives )
            // InternalXdstm.g:194:4: rule__EnteringNodeAbs__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EnteringNodeAbs__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEnteringNodeAbsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnteringNodeAbs"


    // $ANTLR start "entryRuleNode"
    // InternalXdstm.g:203:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // InternalXdstm.g:204:1: ( ruleNode EOF )
            // InternalXdstm.g:205:1: ruleNode EOF
            {
             before(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_1);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getNodeRule()); 
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
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalXdstm.g:212:1: ruleNode : ( ( rule__Node__Group__0 ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:216:2: ( ( ( rule__Node__Group__0 ) ) )
            // InternalXdstm.g:217:2: ( ( rule__Node__Group__0 ) )
            {
            // InternalXdstm.g:217:2: ( ( rule__Node__Group__0 ) )
            // InternalXdstm.g:218:3: ( rule__Node__Group__0 )
            {
             before(grammarAccess.getNodeAccess().getGroup()); 
            // InternalXdstm.g:219:3: ( rule__Node__Group__0 )
            // InternalXdstm.g:219:4: rule__Node__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleBox"
    // InternalXdstm.g:228:1: entryRuleBox : ruleBox EOF ;
    public final void entryRuleBox() throws RecognitionException {
        try {
            // InternalXdstm.g:229:1: ( ruleBox EOF )
            // InternalXdstm.g:230:1: ruleBox EOF
            {
             before(grammarAccess.getBoxRule()); 
            pushFollow(FOLLOW_1);
            ruleBox();

            state._fsp--;

             after(grammarAccess.getBoxRule()); 
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
    // $ANTLR end "entryRuleBox"


    // $ANTLR start "ruleBox"
    // InternalXdstm.g:237:1: ruleBox : ( ( rule__Box__Group__0 ) ) ;
    public final void ruleBox() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:241:2: ( ( ( rule__Box__Group__0 ) ) )
            // InternalXdstm.g:242:2: ( ( rule__Box__Group__0 ) )
            {
            // InternalXdstm.g:242:2: ( ( rule__Box__Group__0 ) )
            // InternalXdstm.g:243:3: ( rule__Box__Group__0 )
            {
             before(grammarAccess.getBoxAccess().getGroup()); 
            // InternalXdstm.g:244:3: ( rule__Box__Group__0 )
            // InternalXdstm.g:244:4: rule__Box__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Box__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBox"


    // $ANTLR start "entryRuleEnteringNode"
    // InternalXdstm.g:253:1: entryRuleEnteringNode : ruleEnteringNode EOF ;
    public final void entryRuleEnteringNode() throws RecognitionException {
        try {
            // InternalXdstm.g:254:1: ( ruleEnteringNode EOF )
            // InternalXdstm.g:255:1: ruleEnteringNode EOF
            {
             before(grammarAccess.getEnteringNodeRule()); 
            pushFollow(FOLLOW_1);
            ruleEnteringNode();

            state._fsp--;

             after(grammarAccess.getEnteringNodeRule()); 
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
    // $ANTLR end "entryRuleEnteringNode"


    // $ANTLR start "ruleEnteringNode"
    // InternalXdstm.g:262:1: ruleEnteringNode : ( ( rule__EnteringNode__Group__0 ) ) ;
    public final void ruleEnteringNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:266:2: ( ( ( rule__EnteringNode__Group__0 ) ) )
            // InternalXdstm.g:267:2: ( ( rule__EnteringNode__Group__0 ) )
            {
            // InternalXdstm.g:267:2: ( ( rule__EnteringNode__Group__0 ) )
            // InternalXdstm.g:268:3: ( rule__EnteringNode__Group__0 )
            {
             before(grammarAccess.getEnteringNodeAccess().getGroup()); 
            // InternalXdstm.g:269:3: ( rule__EnteringNode__Group__0 )
            // InternalXdstm.g:269:4: rule__EnteringNode__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnteringNode__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnteringNodeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnteringNode"


    // $ANTLR start "entryRuleInitialNode"
    // InternalXdstm.g:278:1: entryRuleInitialNode : ruleInitialNode EOF ;
    public final void entryRuleInitialNode() throws RecognitionException {
        try {
            // InternalXdstm.g:279:1: ( ruleInitialNode EOF )
            // InternalXdstm.g:280:1: ruleInitialNode EOF
            {
             before(grammarAccess.getInitialNodeRule()); 
            pushFollow(FOLLOW_1);
            ruleInitialNode();

            state._fsp--;

             after(grammarAccess.getInitialNodeRule()); 
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
    // $ANTLR end "entryRuleInitialNode"


    // $ANTLR start "ruleInitialNode"
    // InternalXdstm.g:287:1: ruleInitialNode : ( ( rule__InitialNode__Group__0 ) ) ;
    public final void ruleInitialNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:291:2: ( ( ( rule__InitialNode__Group__0 ) ) )
            // InternalXdstm.g:292:2: ( ( rule__InitialNode__Group__0 ) )
            {
            // InternalXdstm.g:292:2: ( ( rule__InitialNode__Group__0 ) )
            // InternalXdstm.g:293:3: ( rule__InitialNode__Group__0 )
            {
             before(grammarAccess.getInitialNodeAccess().getGroup()); 
            // InternalXdstm.g:294:3: ( rule__InitialNode__Group__0 )
            // InternalXdstm.g:294:4: rule__InitialNode__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InitialNode__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInitialNodeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInitialNode"


    // $ANTLR start "entryRuleExitingNode"
    // InternalXdstm.g:303:1: entryRuleExitingNode : ruleExitingNode EOF ;
    public final void entryRuleExitingNode() throws RecognitionException {
        try {
            // InternalXdstm.g:304:1: ( ruleExitingNode EOF )
            // InternalXdstm.g:305:1: ruleExitingNode EOF
            {
             before(grammarAccess.getExitingNodeRule()); 
            pushFollow(FOLLOW_1);
            ruleExitingNode();

            state._fsp--;

             after(grammarAccess.getExitingNodeRule()); 
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
    // $ANTLR end "entryRuleExitingNode"


    // $ANTLR start "ruleExitingNode"
    // InternalXdstm.g:312:1: ruleExitingNode : ( ( rule__ExitingNode__Group__0 ) ) ;
    public final void ruleExitingNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:316:2: ( ( ( rule__ExitingNode__Group__0 ) ) )
            // InternalXdstm.g:317:2: ( ( rule__ExitingNode__Group__0 ) )
            {
            // InternalXdstm.g:317:2: ( ( rule__ExitingNode__Group__0 ) )
            // InternalXdstm.g:318:3: ( rule__ExitingNode__Group__0 )
            {
             before(grammarAccess.getExitingNodeAccess().getGroup()); 
            // InternalXdstm.g:319:3: ( rule__ExitingNode__Group__0 )
            // InternalXdstm.g:319:4: rule__ExitingNode__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExitingNode__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExitingNodeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExitingNode"


    // $ANTLR start "entryRuleFork"
    // InternalXdstm.g:328:1: entryRuleFork : ruleFork EOF ;
    public final void entryRuleFork() throws RecognitionException {
        try {
            // InternalXdstm.g:329:1: ( ruleFork EOF )
            // InternalXdstm.g:330:1: ruleFork EOF
            {
             before(grammarAccess.getForkRule()); 
            pushFollow(FOLLOW_1);
            ruleFork();

            state._fsp--;

             after(grammarAccess.getForkRule()); 
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
    // $ANTLR end "entryRuleFork"


    // $ANTLR start "ruleFork"
    // InternalXdstm.g:337:1: ruleFork : ( ( rule__Fork__Group__0 ) ) ;
    public final void ruleFork() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:341:2: ( ( ( rule__Fork__Group__0 ) ) )
            // InternalXdstm.g:342:2: ( ( rule__Fork__Group__0 ) )
            {
            // InternalXdstm.g:342:2: ( ( rule__Fork__Group__0 ) )
            // InternalXdstm.g:343:3: ( rule__Fork__Group__0 )
            {
             before(grammarAccess.getForkAccess().getGroup()); 
            // InternalXdstm.g:344:3: ( rule__Fork__Group__0 )
            // InternalXdstm.g:344:4: rule__Fork__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Fork__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getForkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFork"


    // $ANTLR start "entryRuleJoin"
    // InternalXdstm.g:353:1: entryRuleJoin : ruleJoin EOF ;
    public final void entryRuleJoin() throws RecognitionException {
        try {
            // InternalXdstm.g:354:1: ( ruleJoin EOF )
            // InternalXdstm.g:355:1: ruleJoin EOF
            {
             before(grammarAccess.getJoinRule()); 
            pushFollow(FOLLOW_1);
            ruleJoin();

            state._fsp--;

             after(grammarAccess.getJoinRule()); 
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
    // $ANTLR end "entryRuleJoin"


    // $ANTLR start "ruleJoin"
    // InternalXdstm.g:362:1: ruleJoin : ( ( rule__Join__Group__0 ) ) ;
    public final void ruleJoin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:366:2: ( ( ( rule__Join__Group__0 ) ) )
            // InternalXdstm.g:367:2: ( ( rule__Join__Group__0 ) )
            {
            // InternalXdstm.g:367:2: ( ( rule__Join__Group__0 ) )
            // InternalXdstm.g:368:3: ( rule__Join__Group__0 )
            {
             before(grammarAccess.getJoinAccess().getGroup()); 
            // InternalXdstm.g:369:3: ( rule__Join__Group__0 )
            // InternalXdstm.g:369:4: rule__Join__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Join__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJoinAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJoin"


    // $ANTLR start "entryRuleTransition"
    // InternalXdstm.g:378:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // InternalXdstm.g:379:1: ( ruleTransition EOF )
            // InternalXdstm.g:380:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalXdstm.g:387:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:391:2: ( ( ( rule__Transition__Group__0 ) ) )
            // InternalXdstm.g:392:2: ( ( rule__Transition__Group__0 ) )
            {
            // InternalXdstm.g:392:2: ( ( rule__Transition__Group__0 ) )
            // InternalXdstm.g:393:3: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // InternalXdstm.g:394:3: ( rule__Transition__Group__0 )
            // InternalXdstm.g:394:4: rule__Transition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleRequirements"
    // InternalXdstm.g:403:1: entryRuleRequirements : ruleRequirements EOF ;
    public final void entryRuleRequirements() throws RecognitionException {
        try {
            // InternalXdstm.g:404:1: ( ruleRequirements EOF )
            // InternalXdstm.g:405:1: ruleRequirements EOF
            {
             before(grammarAccess.getRequirementsRule()); 
            pushFollow(FOLLOW_1);
            ruleRequirements();

            state._fsp--;

             after(grammarAccess.getRequirementsRule()); 
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
    // $ANTLR end "entryRuleRequirements"


    // $ANTLR start "ruleRequirements"
    // InternalXdstm.g:412:1: ruleRequirements : ( ( rule__Requirements__Group__0 ) ) ;
    public final void ruleRequirements() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:416:2: ( ( ( rule__Requirements__Group__0 ) ) )
            // InternalXdstm.g:417:2: ( ( rule__Requirements__Group__0 ) )
            {
            // InternalXdstm.g:417:2: ( ( rule__Requirements__Group__0 ) )
            // InternalXdstm.g:418:3: ( rule__Requirements__Group__0 )
            {
             before(grammarAccess.getRequirementsAccess().getGroup()); 
            // InternalXdstm.g:419:3: ( rule__Requirements__Group__0 )
            // InternalXdstm.g:419:4: rule__Requirements__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Requirements__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRequirementsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRequirements"


    // $ANTLR start "entryRuleEString"
    // InternalXdstm.g:428:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalXdstm.g:429:1: ( ruleEString EOF )
            // InternalXdstm.g:430:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalXdstm.g:437:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:441:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalXdstm.g:442:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalXdstm.g:442:2: ( ( rule__EString__Alternatives ) )
            // InternalXdstm.g:443:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalXdstm.g:444:3: ( rule__EString__Alternatives )
            // InternalXdstm.g:444:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "rule__Vertex__Alternatives"
    // InternalXdstm.g:452:1: rule__Vertex__Alternatives : ( ( ruleNode ) | ( ruleBox ) | ( ruleEnteringNodeAbs ) | ( ruleExitingNode ) | ( ruleFork ) | ( ruleJoin ) );
    public final void rule__Vertex__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:456:1: ( ( ruleNode ) | ( ruleBox ) | ( ruleEnteringNodeAbs ) | ( ruleExitingNode ) | ( ruleFork ) | ( ruleJoin ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt1=1;
                }
                break;
            case 24:
                {
                alt1=2;
                }
                break;
            case 28:
            case 29:
                {
                alt1=3;
                }
                break;
            case 30:
                {
                alt1=4;
                }
                break;
            case 31:
                {
                alt1=5;
                }
                break;
            case 32:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalXdstm.g:457:2: ( ruleNode )
                    {
                    // InternalXdstm.g:457:2: ( ruleNode )
                    // InternalXdstm.g:458:3: ruleNode
                    {
                     before(grammarAccess.getVertexAccess().getNodeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNode();

                    state._fsp--;

                     after(grammarAccess.getVertexAccess().getNodeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXdstm.g:463:2: ( ruleBox )
                    {
                    // InternalXdstm.g:463:2: ( ruleBox )
                    // InternalXdstm.g:464:3: ruleBox
                    {
                     before(grammarAccess.getVertexAccess().getBoxParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBox();

                    state._fsp--;

                     after(grammarAccess.getVertexAccess().getBoxParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXdstm.g:469:2: ( ruleEnteringNodeAbs )
                    {
                    // InternalXdstm.g:469:2: ( ruleEnteringNodeAbs )
                    // InternalXdstm.g:470:3: ruleEnteringNodeAbs
                    {
                     before(grammarAccess.getVertexAccess().getEnteringNodeAbsParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleEnteringNodeAbs();

                    state._fsp--;

                     after(grammarAccess.getVertexAccess().getEnteringNodeAbsParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalXdstm.g:475:2: ( ruleExitingNode )
                    {
                    // InternalXdstm.g:475:2: ( ruleExitingNode )
                    // InternalXdstm.g:476:3: ruleExitingNode
                    {
                     before(grammarAccess.getVertexAccess().getExitingNodeParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleExitingNode();

                    state._fsp--;

                     after(grammarAccess.getVertexAccess().getExitingNodeParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalXdstm.g:481:2: ( ruleFork )
                    {
                    // InternalXdstm.g:481:2: ( ruleFork )
                    // InternalXdstm.g:482:3: ruleFork
                    {
                     before(grammarAccess.getVertexAccess().getForkParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleFork();

                    state._fsp--;

                     after(grammarAccess.getVertexAccess().getForkParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalXdstm.g:487:2: ( ruleJoin )
                    {
                    // InternalXdstm.g:487:2: ( ruleJoin )
                    // InternalXdstm.g:488:3: ruleJoin
                    {
                     before(grammarAccess.getVertexAccess().getJoinParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleJoin();

                    state._fsp--;

                     after(grammarAccess.getVertexAccess().getJoinParserRuleCall_5()); 

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
    // $ANTLR end "rule__Vertex__Alternatives"


    // $ANTLR start "rule__EnteringNodeAbs__Alternatives"
    // InternalXdstm.g:497:1: rule__EnteringNodeAbs__Alternatives : ( ( ruleEnteringNode ) | ( ruleInitialNode ) );
    public final void rule__EnteringNodeAbs__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:501:1: ( ( ruleEnteringNode ) | ( ruleInitialNode ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==28) ) {
                alt2=1;
            }
            else if ( (LA2_0==29) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalXdstm.g:502:2: ( ruleEnteringNode )
                    {
                    // InternalXdstm.g:502:2: ( ruleEnteringNode )
                    // InternalXdstm.g:503:3: ruleEnteringNode
                    {
                     before(grammarAccess.getEnteringNodeAbsAccess().getEnteringNodeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEnteringNode();

                    state._fsp--;

                     after(grammarAccess.getEnteringNodeAbsAccess().getEnteringNodeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXdstm.g:508:2: ( ruleInitialNode )
                    {
                    // InternalXdstm.g:508:2: ( ruleInitialNode )
                    // InternalXdstm.g:509:3: ruleInitialNode
                    {
                     before(grammarAccess.getEnteringNodeAbsAccess().getInitialNodeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleInitialNode();

                    state._fsp--;

                     after(grammarAccess.getEnteringNodeAbsAccess().getInitialNodeParserRuleCall_1()); 

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
    // $ANTLR end "rule__EnteringNodeAbs__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalXdstm.g:518:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:522:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalXdstm.g:523:2: ( RULE_STRING )
                    {
                    // InternalXdstm.g:523:2: ( RULE_STRING )
                    // InternalXdstm.g:524:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXdstm.g:529:2: ( RULE_ID )
                    {
                    // InternalXdstm.g:529:2: ( RULE_ID )
                    // InternalXdstm.g:530:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalXdstm.g:539:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:543:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalXdstm.g:544:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalXdstm.g:551:1: rule__Model__Group__0__Impl : ( ( rule__Model__IncludeAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:555:1: ( ( ( rule__Model__IncludeAssignment_0 ) ) )
            // InternalXdstm.g:556:1: ( ( rule__Model__IncludeAssignment_0 ) )
            {
            // InternalXdstm.g:556:1: ( ( rule__Model__IncludeAssignment_0 ) )
            // InternalXdstm.g:557:2: ( rule__Model__IncludeAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getIncludeAssignment_0()); 
            // InternalXdstm.g:558:2: ( rule__Model__IncludeAssignment_0 )
            // InternalXdstm.g:558:3: rule__Model__IncludeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__IncludeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getIncludeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalXdstm.g:566:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:570:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalXdstm.g:571:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalXdstm.g:578:1: rule__Model__Group__1__Impl : ( ( rule__Model__MachinesAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:582:1: ( ( ( rule__Model__MachinesAssignment_1 ) ) )
            // InternalXdstm.g:583:1: ( ( rule__Model__MachinesAssignment_1 ) )
            {
            // InternalXdstm.g:583:1: ( ( rule__Model__MachinesAssignment_1 ) )
            // InternalXdstm.g:584:2: ( rule__Model__MachinesAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getMachinesAssignment_1()); 
            // InternalXdstm.g:585:2: ( rule__Model__MachinesAssignment_1 )
            // InternalXdstm.g:585:3: rule__Model__MachinesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__MachinesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getMachinesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalXdstm.g:593:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:597:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalXdstm.g:598:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalXdstm.g:605:1: rule__Model__Group__2__Impl : ( ( rule__Model__MachinesAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:609:1: ( ( ( rule__Model__MachinesAssignment_2 )* ) )
            // InternalXdstm.g:610:1: ( ( rule__Model__MachinesAssignment_2 )* )
            {
            // InternalXdstm.g:610:1: ( ( rule__Model__MachinesAssignment_2 )* )
            // InternalXdstm.g:611:2: ( rule__Model__MachinesAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getMachinesAssignment_2()); 
            // InternalXdstm.g:612:2: ( rule__Model__MachinesAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==20) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalXdstm.g:612:3: rule__Model__MachinesAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__MachinesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getMachinesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalXdstm.g:620:1: rule__Model__Group__3 : rule__Model__Group__3__Impl ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:624:1: ( rule__Model__Group__3__Impl )
            // InternalXdstm.g:625:2: rule__Model__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalXdstm.g:631:1: rule__Model__Group__3__Impl : ( ( rule__Model__DstmAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:635:1: ( ( ( rule__Model__DstmAssignment_3 ) ) )
            // InternalXdstm.g:636:1: ( ( rule__Model__DstmAssignment_3 ) )
            {
            // InternalXdstm.g:636:1: ( ( rule__Model__DstmAssignment_3 ) )
            // InternalXdstm.g:637:2: ( rule__Model__DstmAssignment_3 )
            {
             before(grammarAccess.getModelAccess().getDstmAssignment_3()); 
            // InternalXdstm.g:638:2: ( rule__Model__DstmAssignment_3 )
            // InternalXdstm.g:638:3: rule__Model__DstmAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Model__DstmAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getDstmAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Include__Group__0"
    // InternalXdstm.g:647:1: rule__Include__Group__0 : rule__Include__Group__0__Impl rule__Include__Group__1 ;
    public final void rule__Include__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:651:1: ( rule__Include__Group__0__Impl rule__Include__Group__1 )
            // InternalXdstm.g:652:2: rule__Include__Group__0__Impl rule__Include__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Include__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Include__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__0"


    // $ANTLR start "rule__Include__Group__0__Impl"
    // InternalXdstm.g:659:1: rule__Include__Group__0__Impl : ( 'import' ) ;
    public final void rule__Include__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:663:1: ( ( 'import' ) )
            // InternalXdstm.g:664:1: ( 'import' )
            {
            // InternalXdstm.g:664:1: ( 'import' )
            // InternalXdstm.g:665:2: 'import'
            {
             before(grammarAccess.getIncludeAccess().getImportKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getIncludeAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__0__Impl"


    // $ANTLR start "rule__Include__Group__1"
    // InternalXdstm.g:674:1: rule__Include__Group__1 : rule__Include__Group__1__Impl rule__Include__Group__2 ;
    public final void rule__Include__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:678:1: ( rule__Include__Group__1__Impl rule__Include__Group__2 )
            // InternalXdstm.g:679:2: rule__Include__Group__1__Impl rule__Include__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Include__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Include__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__1"


    // $ANTLR start "rule__Include__Group__1__Impl"
    // InternalXdstm.g:686:1: rule__Include__Group__1__Impl : ( ( rule__Include__ImportURIAssignment_1 ) ) ;
    public final void rule__Include__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:690:1: ( ( ( rule__Include__ImportURIAssignment_1 ) ) )
            // InternalXdstm.g:691:1: ( ( rule__Include__ImportURIAssignment_1 ) )
            {
            // InternalXdstm.g:691:1: ( ( rule__Include__ImportURIAssignment_1 ) )
            // InternalXdstm.g:692:2: ( rule__Include__ImportURIAssignment_1 )
            {
             before(grammarAccess.getIncludeAccess().getImportURIAssignment_1()); 
            // InternalXdstm.g:693:2: ( rule__Include__ImportURIAssignment_1 )
            // InternalXdstm.g:693:3: rule__Include__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Include__ImportURIAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIncludeAccess().getImportURIAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__1__Impl"


    // $ANTLR start "rule__Include__Group__2"
    // InternalXdstm.g:701:1: rule__Include__Group__2 : rule__Include__Group__2__Impl ;
    public final void rule__Include__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:705:1: ( rule__Include__Group__2__Impl )
            // InternalXdstm.g:706:2: rule__Include__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Include__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__2"


    // $ANTLR start "rule__Include__Group__2__Impl"
    // InternalXdstm.g:712:1: rule__Include__Group__2__Impl : ( ';' ) ;
    public final void rule__Include__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:716:1: ( ( ';' ) )
            // InternalXdstm.g:717:1: ( ';' )
            {
            // InternalXdstm.g:717:1: ( ';' )
            // InternalXdstm.g:718:2: ';'
            {
             before(grammarAccess.getIncludeAccess().getSemicolonKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getIncludeAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__2__Impl"


    // $ANTLR start "rule__DSTM__Group__0"
    // InternalXdstm.g:728:1: rule__DSTM__Group__0 : rule__DSTM__Group__0__Impl rule__DSTM__Group__1 ;
    public final void rule__DSTM__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:732:1: ( rule__DSTM__Group__0__Impl rule__DSTM__Group__1 )
            // InternalXdstm.g:733:2: rule__DSTM__Group__0__Impl rule__DSTM__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__DSTM__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSTM__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSTM__Group__0"


    // $ANTLR start "rule__DSTM__Group__0__Impl"
    // InternalXdstm.g:740:1: rule__DSTM__Group__0__Impl : ( 'DSTM' ) ;
    public final void rule__DSTM__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:744:1: ( ( 'DSTM' ) )
            // InternalXdstm.g:745:1: ( 'DSTM' )
            {
            // InternalXdstm.g:745:1: ( 'DSTM' )
            // InternalXdstm.g:746:2: 'DSTM'
            {
             before(grammarAccess.getDSTMAccess().getDSTMKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDSTMAccess().getDSTMKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSTM__Group__0__Impl"


    // $ANTLR start "rule__DSTM__Group__1"
    // InternalXdstm.g:755:1: rule__DSTM__Group__1 : rule__DSTM__Group__1__Impl rule__DSTM__Group__2 ;
    public final void rule__DSTM__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:759:1: ( rule__DSTM__Group__1__Impl rule__DSTM__Group__2 )
            // InternalXdstm.g:760:2: rule__DSTM__Group__1__Impl rule__DSTM__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__DSTM__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSTM__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSTM__Group__1"


    // $ANTLR start "rule__DSTM__Group__1__Impl"
    // InternalXdstm.g:767:1: rule__DSTM__Group__1__Impl : ( ( rule__DSTM__NameAssignment_1 ) ) ;
    public final void rule__DSTM__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:771:1: ( ( ( rule__DSTM__NameAssignment_1 ) ) )
            // InternalXdstm.g:772:1: ( ( rule__DSTM__NameAssignment_1 ) )
            {
            // InternalXdstm.g:772:1: ( ( rule__DSTM__NameAssignment_1 ) )
            // InternalXdstm.g:773:2: ( rule__DSTM__NameAssignment_1 )
            {
             before(grammarAccess.getDSTMAccess().getNameAssignment_1()); 
            // InternalXdstm.g:774:2: ( rule__DSTM__NameAssignment_1 )
            // InternalXdstm.g:774:3: rule__DSTM__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DSTM__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDSTMAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSTM__Group__1__Impl"


    // $ANTLR start "rule__DSTM__Group__2"
    // InternalXdstm.g:782:1: rule__DSTM__Group__2 : rule__DSTM__Group__2__Impl rule__DSTM__Group__3 ;
    public final void rule__DSTM__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:786:1: ( rule__DSTM__Group__2__Impl rule__DSTM__Group__3 )
            // InternalXdstm.g:787:2: rule__DSTM__Group__2__Impl rule__DSTM__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__DSTM__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSTM__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSTM__Group__2"


    // $ANTLR start "rule__DSTM__Group__2__Impl"
    // InternalXdstm.g:794:1: rule__DSTM__Group__2__Impl : ( '{' ) ;
    public final void rule__DSTM__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:798:1: ( ( '{' ) )
            // InternalXdstm.g:799:1: ( '{' )
            {
            // InternalXdstm.g:799:1: ( '{' )
            // InternalXdstm.g:800:2: '{'
            {
             before(grammarAccess.getDSTMAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDSTMAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSTM__Group__2__Impl"


    // $ANTLR start "rule__DSTM__Group__3"
    // InternalXdstm.g:809:1: rule__DSTM__Group__3 : rule__DSTM__Group__3__Impl rule__DSTM__Group__4 ;
    public final void rule__DSTM__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:813:1: ( rule__DSTM__Group__3__Impl rule__DSTM__Group__4 )
            // InternalXdstm.g:814:2: rule__DSTM__Group__3__Impl rule__DSTM__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__DSTM__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSTM__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSTM__Group__3"


    // $ANTLR start "rule__DSTM__Group__3__Impl"
    // InternalXdstm.g:821:1: rule__DSTM__Group__3__Impl : ( 'machines' ) ;
    public final void rule__DSTM__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:825:1: ( ( 'machines' ) )
            // InternalXdstm.g:826:1: ( 'machines' )
            {
            // InternalXdstm.g:826:1: ( 'machines' )
            // InternalXdstm.g:827:2: 'machines'
            {
             before(grammarAccess.getDSTMAccess().getMachinesKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDSTMAccess().getMachinesKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSTM__Group__3__Impl"


    // $ANTLR start "rule__DSTM__Group__4"
    // InternalXdstm.g:836:1: rule__DSTM__Group__4 : rule__DSTM__Group__4__Impl rule__DSTM__Group__5 ;
    public final void rule__DSTM__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:840:1: ( rule__DSTM__Group__4__Impl rule__DSTM__Group__5 )
            // InternalXdstm.g:841:2: rule__DSTM__Group__4__Impl rule__DSTM__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__DSTM__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSTM__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSTM__Group__4"


    // $ANTLR start "rule__DSTM__Group__4__Impl"
    // InternalXdstm.g:848:1: rule__DSTM__Group__4__Impl : ( '=' ) ;
    public final void rule__DSTM__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:852:1: ( ( '=' ) )
            // InternalXdstm.g:853:1: ( '=' )
            {
            // InternalXdstm.g:853:1: ( '=' )
            // InternalXdstm.g:854:2: '='
            {
             before(grammarAccess.getDSTMAccess().getEqualsSignKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDSTMAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSTM__Group__4__Impl"


    // $ANTLR start "rule__DSTM__Group__5"
    // InternalXdstm.g:863:1: rule__DSTM__Group__5 : rule__DSTM__Group__5__Impl rule__DSTM__Group__6 ;
    public final void rule__DSTM__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:867:1: ( rule__DSTM__Group__5__Impl rule__DSTM__Group__6 )
            // InternalXdstm.g:868:2: rule__DSTM__Group__5__Impl rule__DSTM__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__DSTM__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSTM__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSTM__Group__5"


    // $ANTLR start "rule__DSTM__Group__5__Impl"
    // InternalXdstm.g:875:1: rule__DSTM__Group__5__Impl : ( ( rule__DSTM__MachinesAssignment_5 ) ) ;
    public final void rule__DSTM__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:879:1: ( ( ( rule__DSTM__MachinesAssignment_5 ) ) )
            // InternalXdstm.g:880:1: ( ( rule__DSTM__MachinesAssignment_5 ) )
            {
            // InternalXdstm.g:880:1: ( ( rule__DSTM__MachinesAssignment_5 ) )
            // InternalXdstm.g:881:2: ( rule__DSTM__MachinesAssignment_5 )
            {
             before(grammarAccess.getDSTMAccess().getMachinesAssignment_5()); 
            // InternalXdstm.g:882:2: ( rule__DSTM__MachinesAssignment_5 )
            // InternalXdstm.g:882:3: rule__DSTM__MachinesAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__DSTM__MachinesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDSTMAccess().getMachinesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSTM__Group__5__Impl"


    // $ANTLR start "rule__DSTM__Group__6"
    // InternalXdstm.g:890:1: rule__DSTM__Group__6 : rule__DSTM__Group__6__Impl rule__DSTM__Group__7 ;
    public final void rule__DSTM__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:894:1: ( rule__DSTM__Group__6__Impl rule__DSTM__Group__7 )
            // InternalXdstm.g:895:2: rule__DSTM__Group__6__Impl rule__DSTM__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__DSTM__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSTM__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSTM__Group__6"


    // $ANTLR start "rule__DSTM__Group__6__Impl"
    // InternalXdstm.g:902:1: rule__DSTM__Group__6__Impl : ( ( rule__DSTM__Group_6__0 )* ) ;
    public final void rule__DSTM__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:906:1: ( ( ( rule__DSTM__Group_6__0 )* ) )
            // InternalXdstm.g:907:1: ( ( rule__DSTM__Group_6__0 )* )
            {
            // InternalXdstm.g:907:1: ( ( rule__DSTM__Group_6__0 )* )
            // InternalXdstm.g:908:2: ( rule__DSTM__Group_6__0 )*
            {
             before(grammarAccess.getDSTMAccess().getGroup_6()); 
            // InternalXdstm.g:909:2: ( rule__DSTM__Group_6__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalXdstm.g:909:3: rule__DSTM__Group_6__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__DSTM__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getDSTMAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSTM__Group__6__Impl"


    // $ANTLR start "rule__DSTM__Group__7"
    // InternalXdstm.g:917:1: rule__DSTM__Group__7 : rule__DSTM__Group__7__Impl rule__DSTM__Group__8 ;
    public final void rule__DSTM__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:921:1: ( rule__DSTM__Group__7__Impl rule__DSTM__Group__8 )
            // InternalXdstm.g:922:2: rule__DSTM__Group__7__Impl rule__DSTM__Group__8
            {
            pushFollow(FOLLOW_14);
            rule__DSTM__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSTM__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSTM__Group__7"


    // $ANTLR start "rule__DSTM__Group__7__Impl"
    // InternalXdstm.g:929:1: rule__DSTM__Group__7__Impl : ( ';' ) ;
    public final void rule__DSTM__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:933:1: ( ( ';' ) )
            // InternalXdstm.g:934:1: ( ';' )
            {
            // InternalXdstm.g:934:1: ( ';' )
            // InternalXdstm.g:935:2: ';'
            {
             before(grammarAccess.getDSTMAccess().getSemicolonKeyword_7()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDSTMAccess().getSemicolonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSTM__Group__7__Impl"


    // $ANTLR start "rule__DSTM__Group__8"
    // InternalXdstm.g:944:1: rule__DSTM__Group__8 : rule__DSTM__Group__8__Impl rule__DSTM__Group__9 ;
    public final void rule__DSTM__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:948:1: ( rule__DSTM__Group__8__Impl rule__DSTM__Group__9 )
            // InternalXdstm.g:949:2: rule__DSTM__Group__8__Impl rule__DSTM__Group__9
            {
            pushFollow(FOLLOW_8);
            rule__DSTM__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSTM__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSTM__Group__8"


    // $ANTLR start "rule__DSTM__Group__8__Impl"
    // InternalXdstm.g:956:1: rule__DSTM__Group__8__Impl : ( 'main' ) ;
    public final void rule__DSTM__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:960:1: ( ( 'main' ) )
            // InternalXdstm.g:961:1: ( 'main' )
            {
            // InternalXdstm.g:961:1: ( 'main' )
            // InternalXdstm.g:962:2: 'main'
            {
             before(grammarAccess.getDSTMAccess().getMainKeyword_8()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDSTMAccess().getMainKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSTM__Group__8__Impl"


    // $ANTLR start "rule__DSTM__Group__9"
    // InternalXdstm.g:971:1: rule__DSTM__Group__9 : rule__DSTM__Group__9__Impl rule__DSTM__Group__10 ;
    public final void rule__DSTM__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:975:1: ( rule__DSTM__Group__9__Impl rule__DSTM__Group__10 )
            // InternalXdstm.g:976:2: rule__DSTM__Group__9__Impl rule__DSTM__Group__10
            {
            pushFollow(FOLLOW_7);
            rule__DSTM__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSTM__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSTM__Group__9"


    // $ANTLR start "rule__DSTM__Group__9__Impl"
    // InternalXdstm.g:983:1: rule__DSTM__Group__9__Impl : ( ( rule__DSTM__MainAssignment_9 ) ) ;
    public final void rule__DSTM__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:987:1: ( ( ( rule__DSTM__MainAssignment_9 ) ) )
            // InternalXdstm.g:988:1: ( ( rule__DSTM__MainAssignment_9 ) )
            {
            // InternalXdstm.g:988:1: ( ( rule__DSTM__MainAssignment_9 ) )
            // InternalXdstm.g:989:2: ( rule__DSTM__MainAssignment_9 )
            {
             before(grammarAccess.getDSTMAccess().getMainAssignment_9()); 
            // InternalXdstm.g:990:2: ( rule__DSTM__MainAssignment_9 )
            // InternalXdstm.g:990:3: rule__DSTM__MainAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__DSTM__MainAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getDSTMAccess().getMainAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSTM__Group__9__Impl"


    // $ANTLR start "rule__DSTM__Group__10"
    // InternalXdstm.g:998:1: rule__DSTM__Group__10 : rule__DSTM__Group__10__Impl rule__DSTM__Group__11 ;
    public final void rule__DSTM__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1002:1: ( rule__DSTM__Group__10__Impl rule__DSTM__Group__11 )
            // InternalXdstm.g:1003:2: rule__DSTM__Group__10__Impl rule__DSTM__Group__11
            {
            pushFollow(FOLLOW_15);
            rule__DSTM__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSTM__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSTM__Group__10"


    // $ANTLR start "rule__DSTM__Group__10__Impl"
    // InternalXdstm.g:1010:1: rule__DSTM__Group__10__Impl : ( ';' ) ;
    public final void rule__DSTM__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1014:1: ( ( ';' ) )
            // InternalXdstm.g:1015:1: ( ';' )
            {
            // InternalXdstm.g:1015:1: ( ';' )
            // InternalXdstm.g:1016:2: ';'
            {
             before(grammarAccess.getDSTMAccess().getSemicolonKeyword_10()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDSTMAccess().getSemicolonKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSTM__Group__10__Impl"


    // $ANTLR start "rule__DSTM__Group__11"
    // InternalXdstm.g:1025:1: rule__DSTM__Group__11 : rule__DSTM__Group__11__Impl rule__DSTM__Group__12 ;
    public final void rule__DSTM__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1029:1: ( rule__DSTM__Group__11__Impl rule__DSTM__Group__12 )
            // InternalXdstm.g:1030:2: rule__DSTM__Group__11__Impl rule__DSTM__Group__12
            {
            pushFollow(FOLLOW_7);
            rule__DSTM__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSTM__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSTM__Group__11"


    // $ANTLR start "rule__DSTM__Group__11__Impl"
    // InternalXdstm.g:1037:1: rule__DSTM__Group__11__Impl : ( '}' ) ;
    public final void rule__DSTM__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1041:1: ( ( '}' ) )
            // InternalXdstm.g:1042:1: ( '}' )
            {
            // InternalXdstm.g:1042:1: ( '}' )
            // InternalXdstm.g:1043:2: '}'
            {
             before(grammarAccess.getDSTMAccess().getRightCurlyBracketKeyword_11()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDSTMAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSTM__Group__11__Impl"


    // $ANTLR start "rule__DSTM__Group__12"
    // InternalXdstm.g:1052:1: rule__DSTM__Group__12 : rule__DSTM__Group__12__Impl ;
    public final void rule__DSTM__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1056:1: ( rule__DSTM__Group__12__Impl )
            // InternalXdstm.g:1057:2: rule__DSTM__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DSTM__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSTM__Group__12"


    // $ANTLR start "rule__DSTM__Group__12__Impl"
    // InternalXdstm.g:1063:1: rule__DSTM__Group__12__Impl : ( ';' ) ;
    public final void rule__DSTM__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1067:1: ( ( ';' ) )
            // InternalXdstm.g:1068:1: ( ';' )
            {
            // InternalXdstm.g:1068:1: ( ';' )
            // InternalXdstm.g:1069:2: ';'
            {
             before(grammarAccess.getDSTMAccess().getSemicolonKeyword_12()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDSTMAccess().getSemicolonKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSTM__Group__12__Impl"


    // $ANTLR start "rule__DSTM__Group_6__0"
    // InternalXdstm.g:1079:1: rule__DSTM__Group_6__0 : rule__DSTM__Group_6__0__Impl rule__DSTM__Group_6__1 ;
    public final void rule__DSTM__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1083:1: ( rule__DSTM__Group_6__0__Impl rule__DSTM__Group_6__1 )
            // InternalXdstm.g:1084:2: rule__DSTM__Group_6__0__Impl rule__DSTM__Group_6__1
            {
            pushFollow(FOLLOW_8);
            rule__DSTM__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DSTM__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSTM__Group_6__0"


    // $ANTLR start "rule__DSTM__Group_6__0__Impl"
    // InternalXdstm.g:1091:1: rule__DSTM__Group_6__0__Impl : ( ',' ) ;
    public final void rule__DSTM__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1095:1: ( ( ',' ) )
            // InternalXdstm.g:1096:1: ( ',' )
            {
            // InternalXdstm.g:1096:1: ( ',' )
            // InternalXdstm.g:1097:2: ','
            {
             before(grammarAccess.getDSTMAccess().getCommaKeyword_6_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDSTMAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSTM__Group_6__0__Impl"


    // $ANTLR start "rule__DSTM__Group_6__1"
    // InternalXdstm.g:1106:1: rule__DSTM__Group_6__1 : rule__DSTM__Group_6__1__Impl ;
    public final void rule__DSTM__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1110:1: ( rule__DSTM__Group_6__1__Impl )
            // InternalXdstm.g:1111:2: rule__DSTM__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DSTM__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSTM__Group_6__1"


    // $ANTLR start "rule__DSTM__Group_6__1__Impl"
    // InternalXdstm.g:1117:1: rule__DSTM__Group_6__1__Impl : ( ( rule__DSTM__MachinesAssignment_6_1 ) ) ;
    public final void rule__DSTM__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1121:1: ( ( ( rule__DSTM__MachinesAssignment_6_1 ) ) )
            // InternalXdstm.g:1122:1: ( ( rule__DSTM__MachinesAssignment_6_1 ) )
            {
            // InternalXdstm.g:1122:1: ( ( rule__DSTM__MachinesAssignment_6_1 ) )
            // InternalXdstm.g:1123:2: ( rule__DSTM__MachinesAssignment_6_1 )
            {
             before(grammarAccess.getDSTMAccess().getMachinesAssignment_6_1()); 
            // InternalXdstm.g:1124:2: ( rule__DSTM__MachinesAssignment_6_1 )
            // InternalXdstm.g:1124:3: rule__DSTM__MachinesAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__DSTM__MachinesAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getDSTMAccess().getMachinesAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSTM__Group_6__1__Impl"


    // $ANTLR start "rule__Machine__Group__0"
    // InternalXdstm.g:1133:1: rule__Machine__Group__0 : rule__Machine__Group__0__Impl rule__Machine__Group__1 ;
    public final void rule__Machine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1137:1: ( rule__Machine__Group__0__Impl rule__Machine__Group__1 )
            // InternalXdstm.g:1138:2: rule__Machine__Group__0__Impl rule__Machine__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Machine__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__0"


    // $ANTLR start "rule__Machine__Group__0__Impl"
    // InternalXdstm.g:1145:1: rule__Machine__Group__0__Impl : ( 'Machine' ) ;
    public final void rule__Machine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1149:1: ( ( 'Machine' ) )
            // InternalXdstm.g:1150:1: ( 'Machine' )
            {
            // InternalXdstm.g:1150:1: ( 'Machine' )
            // InternalXdstm.g:1151:2: 'Machine'
            {
             before(grammarAccess.getMachineAccess().getMachineKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getMachineKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__0__Impl"


    // $ANTLR start "rule__Machine__Group__1"
    // InternalXdstm.g:1160:1: rule__Machine__Group__1 : rule__Machine__Group__1__Impl rule__Machine__Group__2 ;
    public final void rule__Machine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1164:1: ( rule__Machine__Group__1__Impl rule__Machine__Group__2 )
            // InternalXdstm.g:1165:2: rule__Machine__Group__1__Impl rule__Machine__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Machine__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__1"


    // $ANTLR start "rule__Machine__Group__1__Impl"
    // InternalXdstm.g:1172:1: rule__Machine__Group__1__Impl : ( ( rule__Machine__NameAssignment_1 ) ) ;
    public final void rule__Machine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1176:1: ( ( ( rule__Machine__NameAssignment_1 ) ) )
            // InternalXdstm.g:1177:1: ( ( rule__Machine__NameAssignment_1 ) )
            {
            // InternalXdstm.g:1177:1: ( ( rule__Machine__NameAssignment_1 ) )
            // InternalXdstm.g:1178:2: ( rule__Machine__NameAssignment_1 )
            {
             before(grammarAccess.getMachineAccess().getNameAssignment_1()); 
            // InternalXdstm.g:1179:2: ( rule__Machine__NameAssignment_1 )
            // InternalXdstm.g:1179:3: rule__Machine__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Machine__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__1__Impl"


    // $ANTLR start "rule__Machine__Group__2"
    // InternalXdstm.g:1187:1: rule__Machine__Group__2 : rule__Machine__Group__2__Impl rule__Machine__Group__3 ;
    public final void rule__Machine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1191:1: ( rule__Machine__Group__2__Impl rule__Machine__Group__3 )
            // InternalXdstm.g:1192:2: rule__Machine__Group__2__Impl rule__Machine__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Machine__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__2"


    // $ANTLR start "rule__Machine__Group__2__Impl"
    // InternalXdstm.g:1199:1: rule__Machine__Group__2__Impl : ( '{' ) ;
    public final void rule__Machine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1203:1: ( ( '{' ) )
            // InternalXdstm.g:1204:1: ( '{' )
            {
            // InternalXdstm.g:1204:1: ( '{' )
            // InternalXdstm.g:1205:2: '{'
            {
             before(grammarAccess.getMachineAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__2__Impl"


    // $ANTLR start "rule__Machine__Group__3"
    // InternalXdstm.g:1214:1: rule__Machine__Group__3 : rule__Machine__Group__3__Impl rule__Machine__Group__4 ;
    public final void rule__Machine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1218:1: ( rule__Machine__Group__3__Impl rule__Machine__Group__4 )
            // InternalXdstm.g:1219:2: rule__Machine__Group__3__Impl rule__Machine__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Machine__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__3"


    // $ANTLR start "rule__Machine__Group__3__Impl"
    // InternalXdstm.g:1226:1: rule__Machine__Group__3__Impl : ( 'vertexes' ) ;
    public final void rule__Machine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1230:1: ( ( 'vertexes' ) )
            // InternalXdstm.g:1231:1: ( 'vertexes' )
            {
            // InternalXdstm.g:1231:1: ( 'vertexes' )
            // InternalXdstm.g:1232:2: 'vertexes'
            {
             before(grammarAccess.getMachineAccess().getVertexesKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getVertexesKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__3__Impl"


    // $ANTLR start "rule__Machine__Group__4"
    // InternalXdstm.g:1241:1: rule__Machine__Group__4 : rule__Machine__Group__4__Impl rule__Machine__Group__5 ;
    public final void rule__Machine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1245:1: ( rule__Machine__Group__4__Impl rule__Machine__Group__5 )
            // InternalXdstm.g:1246:2: rule__Machine__Group__4__Impl rule__Machine__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Machine__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__4"


    // $ANTLR start "rule__Machine__Group__4__Impl"
    // InternalXdstm.g:1253:1: rule__Machine__Group__4__Impl : ( '{' ) ;
    public final void rule__Machine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1257:1: ( ( '{' ) )
            // InternalXdstm.g:1258:1: ( '{' )
            {
            // InternalXdstm.g:1258:1: ( '{' )
            // InternalXdstm.g:1259:2: '{'
            {
             before(grammarAccess.getMachineAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__4__Impl"


    // $ANTLR start "rule__Machine__Group__5"
    // InternalXdstm.g:1268:1: rule__Machine__Group__5 : rule__Machine__Group__5__Impl rule__Machine__Group__6 ;
    public final void rule__Machine__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1272:1: ( rule__Machine__Group__5__Impl rule__Machine__Group__6 )
            // InternalXdstm.g:1273:2: rule__Machine__Group__5__Impl rule__Machine__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__Machine__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__5"


    // $ANTLR start "rule__Machine__Group__5__Impl"
    // InternalXdstm.g:1280:1: rule__Machine__Group__5__Impl : ( ( rule__Machine__VertexesAssignment_5 ) ) ;
    public final void rule__Machine__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1284:1: ( ( ( rule__Machine__VertexesAssignment_5 ) ) )
            // InternalXdstm.g:1285:1: ( ( rule__Machine__VertexesAssignment_5 ) )
            {
            // InternalXdstm.g:1285:1: ( ( rule__Machine__VertexesAssignment_5 ) )
            // InternalXdstm.g:1286:2: ( rule__Machine__VertexesAssignment_5 )
            {
             before(grammarAccess.getMachineAccess().getVertexesAssignment_5()); 
            // InternalXdstm.g:1287:2: ( rule__Machine__VertexesAssignment_5 )
            // InternalXdstm.g:1287:3: rule__Machine__VertexesAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Machine__VertexesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getVertexesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__5__Impl"


    // $ANTLR start "rule__Machine__Group__6"
    // InternalXdstm.g:1295:1: rule__Machine__Group__6 : rule__Machine__Group__6__Impl rule__Machine__Group__7 ;
    public final void rule__Machine__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1299:1: ( rule__Machine__Group__6__Impl rule__Machine__Group__7 )
            // InternalXdstm.g:1300:2: rule__Machine__Group__6__Impl rule__Machine__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__Machine__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__6"


    // $ANTLR start "rule__Machine__Group__6__Impl"
    // InternalXdstm.g:1307:1: rule__Machine__Group__6__Impl : ( ( rule__Machine__Group_6__0 )* ) ;
    public final void rule__Machine__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1311:1: ( ( ( rule__Machine__Group_6__0 )* ) )
            // InternalXdstm.g:1312:1: ( ( rule__Machine__Group_6__0 )* )
            {
            // InternalXdstm.g:1312:1: ( ( rule__Machine__Group_6__0 )* )
            // InternalXdstm.g:1313:2: ( rule__Machine__Group_6__0 )*
            {
             before(grammarAccess.getMachineAccess().getGroup_6()); 
            // InternalXdstm.g:1314:2: ( rule__Machine__Group_6__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalXdstm.g:1314:3: rule__Machine__Group_6__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Machine__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getMachineAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__6__Impl"


    // $ANTLR start "rule__Machine__Group__7"
    // InternalXdstm.g:1322:1: rule__Machine__Group__7 : rule__Machine__Group__7__Impl rule__Machine__Group__8 ;
    public final void rule__Machine__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1326:1: ( rule__Machine__Group__7__Impl rule__Machine__Group__8 )
            // InternalXdstm.g:1327:2: rule__Machine__Group__7__Impl rule__Machine__Group__8
            {
            pushFollow(FOLLOW_19);
            rule__Machine__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__7"


    // $ANTLR start "rule__Machine__Group__7__Impl"
    // InternalXdstm.g:1334:1: rule__Machine__Group__7__Impl : ( '}' ) ;
    public final void rule__Machine__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1338:1: ( ( '}' ) )
            // InternalXdstm.g:1339:1: ( '}' )
            {
            // InternalXdstm.g:1339:1: ( '}' )
            // InternalXdstm.g:1340:2: '}'
            {
             before(grammarAccess.getMachineAccess().getRightCurlyBracketKeyword_7()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__7__Impl"


    // $ANTLR start "rule__Machine__Group__8"
    // InternalXdstm.g:1349:1: rule__Machine__Group__8 : rule__Machine__Group__8__Impl rule__Machine__Group__9 ;
    public final void rule__Machine__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1353:1: ( rule__Machine__Group__8__Impl rule__Machine__Group__9 )
            // InternalXdstm.g:1354:2: rule__Machine__Group__8__Impl rule__Machine__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__Machine__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__8"


    // $ANTLR start "rule__Machine__Group__8__Impl"
    // InternalXdstm.g:1361:1: rule__Machine__Group__8__Impl : ( 'transitions' ) ;
    public final void rule__Machine__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1365:1: ( ( 'transitions' ) )
            // InternalXdstm.g:1366:1: ( 'transitions' )
            {
            // InternalXdstm.g:1366:1: ( 'transitions' )
            // InternalXdstm.g:1367:2: 'transitions'
            {
             before(grammarAccess.getMachineAccess().getTransitionsKeyword_8()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getTransitionsKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__8__Impl"


    // $ANTLR start "rule__Machine__Group__9"
    // InternalXdstm.g:1376:1: rule__Machine__Group__9 : rule__Machine__Group__9__Impl rule__Machine__Group__10 ;
    public final void rule__Machine__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1380:1: ( rule__Machine__Group__9__Impl rule__Machine__Group__10 )
            // InternalXdstm.g:1381:2: rule__Machine__Group__9__Impl rule__Machine__Group__10
            {
            pushFollow(FOLLOW_20);
            rule__Machine__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__9"


    // $ANTLR start "rule__Machine__Group__9__Impl"
    // InternalXdstm.g:1388:1: rule__Machine__Group__9__Impl : ( '{' ) ;
    public final void rule__Machine__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1392:1: ( ( '{' ) )
            // InternalXdstm.g:1393:1: ( '{' )
            {
            // InternalXdstm.g:1393:1: ( '{' )
            // InternalXdstm.g:1394:2: '{'
            {
             before(grammarAccess.getMachineAccess().getLeftCurlyBracketKeyword_9()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getLeftCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__9__Impl"


    // $ANTLR start "rule__Machine__Group__10"
    // InternalXdstm.g:1403:1: rule__Machine__Group__10 : rule__Machine__Group__10__Impl rule__Machine__Group__11 ;
    public final void rule__Machine__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1407:1: ( rule__Machine__Group__10__Impl rule__Machine__Group__11 )
            // InternalXdstm.g:1408:2: rule__Machine__Group__10__Impl rule__Machine__Group__11
            {
            pushFollow(FOLLOW_18);
            rule__Machine__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__10"


    // $ANTLR start "rule__Machine__Group__10__Impl"
    // InternalXdstm.g:1415:1: rule__Machine__Group__10__Impl : ( ( rule__Machine__TransitionsAssignment_10 ) ) ;
    public final void rule__Machine__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1419:1: ( ( ( rule__Machine__TransitionsAssignment_10 ) ) )
            // InternalXdstm.g:1420:1: ( ( rule__Machine__TransitionsAssignment_10 ) )
            {
            // InternalXdstm.g:1420:1: ( ( rule__Machine__TransitionsAssignment_10 ) )
            // InternalXdstm.g:1421:2: ( rule__Machine__TransitionsAssignment_10 )
            {
             before(grammarAccess.getMachineAccess().getTransitionsAssignment_10()); 
            // InternalXdstm.g:1422:2: ( rule__Machine__TransitionsAssignment_10 )
            // InternalXdstm.g:1422:3: rule__Machine__TransitionsAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Machine__TransitionsAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getTransitionsAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__10__Impl"


    // $ANTLR start "rule__Machine__Group__11"
    // InternalXdstm.g:1430:1: rule__Machine__Group__11 : rule__Machine__Group__11__Impl rule__Machine__Group__12 ;
    public final void rule__Machine__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1434:1: ( rule__Machine__Group__11__Impl rule__Machine__Group__12 )
            // InternalXdstm.g:1435:2: rule__Machine__Group__11__Impl rule__Machine__Group__12
            {
            pushFollow(FOLLOW_18);
            rule__Machine__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__11"


    // $ANTLR start "rule__Machine__Group__11__Impl"
    // InternalXdstm.g:1442:1: rule__Machine__Group__11__Impl : ( ( rule__Machine__Group_11__0 )* ) ;
    public final void rule__Machine__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1446:1: ( ( ( rule__Machine__Group_11__0 )* ) )
            // InternalXdstm.g:1447:1: ( ( rule__Machine__Group_11__0 )* )
            {
            // InternalXdstm.g:1447:1: ( ( rule__Machine__Group_11__0 )* )
            // InternalXdstm.g:1448:2: ( rule__Machine__Group_11__0 )*
            {
             before(grammarAccess.getMachineAccess().getGroup_11()); 
            // InternalXdstm.g:1449:2: ( rule__Machine__Group_11__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalXdstm.g:1449:3: rule__Machine__Group_11__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Machine__Group_11__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getMachineAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__11__Impl"


    // $ANTLR start "rule__Machine__Group__12"
    // InternalXdstm.g:1457:1: rule__Machine__Group__12 : rule__Machine__Group__12__Impl rule__Machine__Group__13 ;
    public final void rule__Machine__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1461:1: ( rule__Machine__Group__12__Impl rule__Machine__Group__13 )
            // InternalXdstm.g:1462:2: rule__Machine__Group__12__Impl rule__Machine__Group__13
            {
            pushFollow(FOLLOW_15);
            rule__Machine__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__12"


    // $ANTLR start "rule__Machine__Group__12__Impl"
    // InternalXdstm.g:1469:1: rule__Machine__Group__12__Impl : ( '}' ) ;
    public final void rule__Machine__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1473:1: ( ( '}' ) )
            // InternalXdstm.g:1474:1: ( '}' )
            {
            // InternalXdstm.g:1474:1: ( '}' )
            // InternalXdstm.g:1475:2: '}'
            {
             before(grammarAccess.getMachineAccess().getRightCurlyBracketKeyword_12()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__12__Impl"


    // $ANTLR start "rule__Machine__Group__13"
    // InternalXdstm.g:1484:1: rule__Machine__Group__13 : rule__Machine__Group__13__Impl rule__Machine__Group__14 ;
    public final void rule__Machine__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1488:1: ( rule__Machine__Group__13__Impl rule__Machine__Group__14 )
            // InternalXdstm.g:1489:2: rule__Machine__Group__13__Impl rule__Machine__Group__14
            {
            pushFollow(FOLLOW_7);
            rule__Machine__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__13"


    // $ANTLR start "rule__Machine__Group__13__Impl"
    // InternalXdstm.g:1496:1: rule__Machine__Group__13__Impl : ( '}' ) ;
    public final void rule__Machine__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1500:1: ( ( '}' ) )
            // InternalXdstm.g:1501:1: ( '}' )
            {
            // InternalXdstm.g:1501:1: ( '}' )
            // InternalXdstm.g:1502:2: '}'
            {
             before(grammarAccess.getMachineAccess().getRightCurlyBracketKeyword_13()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__13__Impl"


    // $ANTLR start "rule__Machine__Group__14"
    // InternalXdstm.g:1511:1: rule__Machine__Group__14 : rule__Machine__Group__14__Impl ;
    public final void rule__Machine__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1515:1: ( rule__Machine__Group__14__Impl )
            // InternalXdstm.g:1516:2: rule__Machine__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group__14__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__14"


    // $ANTLR start "rule__Machine__Group__14__Impl"
    // InternalXdstm.g:1522:1: rule__Machine__Group__14__Impl : ( ';' ) ;
    public final void rule__Machine__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1526:1: ( ( ';' ) )
            // InternalXdstm.g:1527:1: ( ';' )
            {
            // InternalXdstm.g:1527:1: ( ';' )
            // InternalXdstm.g:1528:2: ';'
            {
             before(grammarAccess.getMachineAccess().getSemicolonKeyword_14()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getSemicolonKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__14__Impl"


    // $ANTLR start "rule__Machine__Group_6__0"
    // InternalXdstm.g:1538:1: rule__Machine__Group_6__0 : rule__Machine__Group_6__0__Impl rule__Machine__Group_6__1 ;
    public final void rule__Machine__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1542:1: ( rule__Machine__Group_6__0__Impl rule__Machine__Group_6__1 )
            // InternalXdstm.g:1543:2: rule__Machine__Group_6__0__Impl rule__Machine__Group_6__1
            {
            pushFollow(FOLLOW_17);
            rule__Machine__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_6__0"


    // $ANTLR start "rule__Machine__Group_6__0__Impl"
    // InternalXdstm.g:1550:1: rule__Machine__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Machine__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1554:1: ( ( ',' ) )
            // InternalXdstm.g:1555:1: ( ',' )
            {
            // InternalXdstm.g:1555:1: ( ',' )
            // InternalXdstm.g:1556:2: ','
            {
             before(grammarAccess.getMachineAccess().getCommaKeyword_6_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_6__0__Impl"


    // $ANTLR start "rule__Machine__Group_6__1"
    // InternalXdstm.g:1565:1: rule__Machine__Group_6__1 : rule__Machine__Group_6__1__Impl ;
    public final void rule__Machine__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1569:1: ( rule__Machine__Group_6__1__Impl )
            // InternalXdstm.g:1570:2: rule__Machine__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_6__1"


    // $ANTLR start "rule__Machine__Group_6__1__Impl"
    // InternalXdstm.g:1576:1: rule__Machine__Group_6__1__Impl : ( ( rule__Machine__VertexesAssignment_6_1 ) ) ;
    public final void rule__Machine__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1580:1: ( ( ( rule__Machine__VertexesAssignment_6_1 ) ) )
            // InternalXdstm.g:1581:1: ( ( rule__Machine__VertexesAssignment_6_1 ) )
            {
            // InternalXdstm.g:1581:1: ( ( rule__Machine__VertexesAssignment_6_1 ) )
            // InternalXdstm.g:1582:2: ( rule__Machine__VertexesAssignment_6_1 )
            {
             before(grammarAccess.getMachineAccess().getVertexesAssignment_6_1()); 
            // InternalXdstm.g:1583:2: ( rule__Machine__VertexesAssignment_6_1 )
            // InternalXdstm.g:1583:3: rule__Machine__VertexesAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Machine__VertexesAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getVertexesAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_6__1__Impl"


    // $ANTLR start "rule__Machine__Group_11__0"
    // InternalXdstm.g:1592:1: rule__Machine__Group_11__0 : rule__Machine__Group_11__0__Impl rule__Machine__Group_11__1 ;
    public final void rule__Machine__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1596:1: ( rule__Machine__Group_11__0__Impl rule__Machine__Group_11__1 )
            // InternalXdstm.g:1597:2: rule__Machine__Group_11__0__Impl rule__Machine__Group_11__1
            {
            pushFollow(FOLLOW_20);
            rule__Machine__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Machine__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_11__0"


    // $ANTLR start "rule__Machine__Group_11__0__Impl"
    // InternalXdstm.g:1604:1: rule__Machine__Group_11__0__Impl : ( ',' ) ;
    public final void rule__Machine__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1608:1: ( ( ',' ) )
            // InternalXdstm.g:1609:1: ( ',' )
            {
            // InternalXdstm.g:1609:1: ( ',' )
            // InternalXdstm.g:1610:2: ','
            {
             before(grammarAccess.getMachineAccess().getCommaKeyword_11_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getCommaKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_11__0__Impl"


    // $ANTLR start "rule__Machine__Group_11__1"
    // InternalXdstm.g:1619:1: rule__Machine__Group_11__1 : rule__Machine__Group_11__1__Impl ;
    public final void rule__Machine__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1623:1: ( rule__Machine__Group_11__1__Impl )
            // InternalXdstm.g:1624:2: rule__Machine__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Machine__Group_11__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_11__1"


    // $ANTLR start "rule__Machine__Group_11__1__Impl"
    // InternalXdstm.g:1630:1: rule__Machine__Group_11__1__Impl : ( ( rule__Machine__TransitionsAssignment_11_1 ) ) ;
    public final void rule__Machine__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1634:1: ( ( ( rule__Machine__TransitionsAssignment_11_1 ) ) )
            // InternalXdstm.g:1635:1: ( ( rule__Machine__TransitionsAssignment_11_1 ) )
            {
            // InternalXdstm.g:1635:1: ( ( rule__Machine__TransitionsAssignment_11_1 ) )
            // InternalXdstm.g:1636:2: ( rule__Machine__TransitionsAssignment_11_1 )
            {
             before(grammarAccess.getMachineAccess().getTransitionsAssignment_11_1()); 
            // InternalXdstm.g:1637:2: ( rule__Machine__TransitionsAssignment_11_1 )
            // InternalXdstm.g:1637:3: rule__Machine__TransitionsAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__Machine__TransitionsAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getTransitionsAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_11__1__Impl"


    // $ANTLR start "rule__Node__Group__0"
    // InternalXdstm.g:1646:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1650:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // InternalXdstm.g:1651:2: rule__Node__Group__0__Impl rule__Node__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Node__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__0"


    // $ANTLR start "rule__Node__Group__0__Impl"
    // InternalXdstm.g:1658:1: rule__Node__Group__0__Impl : ( 'Node' ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1662:1: ( ( 'Node' ) )
            // InternalXdstm.g:1663:1: ( 'Node' )
            {
            // InternalXdstm.g:1663:1: ( 'Node' )
            // InternalXdstm.g:1664:2: 'Node'
            {
             before(grammarAccess.getNodeAccess().getNodeKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getNodeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__0__Impl"


    // $ANTLR start "rule__Node__Group__1"
    // InternalXdstm.g:1673:1: rule__Node__Group__1 : rule__Node__Group__1__Impl rule__Node__Group__2 ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1677:1: ( rule__Node__Group__1__Impl rule__Node__Group__2 )
            // InternalXdstm.g:1678:2: rule__Node__Group__1__Impl rule__Node__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Node__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__1"


    // $ANTLR start "rule__Node__Group__1__Impl"
    // InternalXdstm.g:1685:1: rule__Node__Group__1__Impl : ( ( rule__Node__NameAssignment_1 ) ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1689:1: ( ( ( rule__Node__NameAssignment_1 ) ) )
            // InternalXdstm.g:1690:1: ( ( rule__Node__NameAssignment_1 ) )
            {
            // InternalXdstm.g:1690:1: ( ( rule__Node__NameAssignment_1 ) )
            // InternalXdstm.g:1691:2: ( rule__Node__NameAssignment_1 )
            {
             before(grammarAccess.getNodeAccess().getNameAssignment_1()); 
            // InternalXdstm.g:1692:2: ( rule__Node__NameAssignment_1 )
            // InternalXdstm.g:1692:3: rule__Node__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Node__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__1__Impl"


    // $ANTLR start "rule__Node__Group__2"
    // InternalXdstm.g:1700:1: rule__Node__Group__2 : rule__Node__Group__2__Impl ;
    public final void rule__Node__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1704:1: ( rule__Node__Group__2__Impl )
            // InternalXdstm.g:1705:2: rule__Node__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__2"


    // $ANTLR start "rule__Node__Group__2__Impl"
    // InternalXdstm.g:1711:1: rule__Node__Group__2__Impl : ( ( rule__Node__RequirementsAssignment_2 ) ) ;
    public final void rule__Node__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1715:1: ( ( ( rule__Node__RequirementsAssignment_2 ) ) )
            // InternalXdstm.g:1716:1: ( ( rule__Node__RequirementsAssignment_2 ) )
            {
            // InternalXdstm.g:1716:1: ( ( rule__Node__RequirementsAssignment_2 ) )
            // InternalXdstm.g:1717:2: ( rule__Node__RequirementsAssignment_2 )
            {
             before(grammarAccess.getNodeAccess().getRequirementsAssignment_2()); 
            // InternalXdstm.g:1718:2: ( rule__Node__RequirementsAssignment_2 )
            // InternalXdstm.g:1718:3: rule__Node__RequirementsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Node__RequirementsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getRequirementsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__2__Impl"


    // $ANTLR start "rule__Box__Group__0"
    // InternalXdstm.g:1727:1: rule__Box__Group__0 : rule__Box__Group__0__Impl rule__Box__Group__1 ;
    public final void rule__Box__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1731:1: ( rule__Box__Group__0__Impl rule__Box__Group__1 )
            // InternalXdstm.g:1732:2: rule__Box__Group__0__Impl rule__Box__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Box__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__0"


    // $ANTLR start "rule__Box__Group__0__Impl"
    // InternalXdstm.g:1739:1: rule__Box__Group__0__Impl : ( 'Box' ) ;
    public final void rule__Box__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1743:1: ( ( 'Box' ) )
            // InternalXdstm.g:1744:1: ( 'Box' )
            {
            // InternalXdstm.g:1744:1: ( 'Box' )
            // InternalXdstm.g:1745:2: 'Box'
            {
             before(grammarAccess.getBoxAccess().getBoxKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getBoxKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__0__Impl"


    // $ANTLR start "rule__Box__Group__1"
    // InternalXdstm.g:1754:1: rule__Box__Group__1 : rule__Box__Group__1__Impl rule__Box__Group__2 ;
    public final void rule__Box__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1758:1: ( rule__Box__Group__1__Impl rule__Box__Group__2 )
            // InternalXdstm.g:1759:2: rule__Box__Group__1__Impl rule__Box__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Box__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__1"


    // $ANTLR start "rule__Box__Group__1__Impl"
    // InternalXdstm.g:1766:1: rule__Box__Group__1__Impl : ( ( rule__Box__NameAssignment_1 ) ) ;
    public final void rule__Box__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1770:1: ( ( ( rule__Box__NameAssignment_1 ) ) )
            // InternalXdstm.g:1771:1: ( ( rule__Box__NameAssignment_1 ) )
            {
            // InternalXdstm.g:1771:1: ( ( rule__Box__NameAssignment_1 ) )
            // InternalXdstm.g:1772:2: ( rule__Box__NameAssignment_1 )
            {
             before(grammarAccess.getBoxAccess().getNameAssignment_1()); 
            // InternalXdstm.g:1773:2: ( rule__Box__NameAssignment_1 )
            // InternalXdstm.g:1773:3: rule__Box__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Box__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__1__Impl"


    // $ANTLR start "rule__Box__Group__2"
    // InternalXdstm.g:1781:1: rule__Box__Group__2 : rule__Box__Group__2__Impl rule__Box__Group__3 ;
    public final void rule__Box__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1785:1: ( rule__Box__Group__2__Impl rule__Box__Group__3 )
            // InternalXdstm.g:1786:2: rule__Box__Group__2__Impl rule__Box__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Box__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__2"


    // $ANTLR start "rule__Box__Group__2__Impl"
    // InternalXdstm.g:1793:1: rule__Box__Group__2__Impl : ( ( rule__Box__RequirementsAssignment_2 ) ) ;
    public final void rule__Box__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1797:1: ( ( ( rule__Box__RequirementsAssignment_2 ) ) )
            // InternalXdstm.g:1798:1: ( ( rule__Box__RequirementsAssignment_2 ) )
            {
            // InternalXdstm.g:1798:1: ( ( rule__Box__RequirementsAssignment_2 ) )
            // InternalXdstm.g:1799:2: ( rule__Box__RequirementsAssignment_2 )
            {
             before(grammarAccess.getBoxAccess().getRequirementsAssignment_2()); 
            // InternalXdstm.g:1800:2: ( rule__Box__RequirementsAssignment_2 )
            // InternalXdstm.g:1800:3: rule__Box__RequirementsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Box__RequirementsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getRequirementsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__2__Impl"


    // $ANTLR start "rule__Box__Group__3"
    // InternalXdstm.g:1808:1: rule__Box__Group__3 : rule__Box__Group__3__Impl rule__Box__Group__4 ;
    public final void rule__Box__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1812:1: ( rule__Box__Group__3__Impl rule__Box__Group__4 )
            // InternalXdstm.g:1813:2: rule__Box__Group__3__Impl rule__Box__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__Box__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__3"


    // $ANTLR start "rule__Box__Group__3__Impl"
    // InternalXdstm.g:1820:1: rule__Box__Group__3__Impl : ( '{' ) ;
    public final void rule__Box__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1824:1: ( ( '{' ) )
            // InternalXdstm.g:1825:1: ( '{' )
            {
            // InternalXdstm.g:1825:1: ( '{' )
            // InternalXdstm.g:1826:2: '{'
            {
             before(grammarAccess.getBoxAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__3__Impl"


    // $ANTLR start "rule__Box__Group__4"
    // InternalXdstm.g:1835:1: rule__Box__Group__4 : rule__Box__Group__4__Impl rule__Box__Group__5 ;
    public final void rule__Box__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1839:1: ( rule__Box__Group__4__Impl rule__Box__Group__5 )
            // InternalXdstm.g:1840:2: rule__Box__Group__4__Impl rule__Box__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__Box__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__4"


    // $ANTLR start "rule__Box__Group__4__Impl"
    // InternalXdstm.g:1847:1: rule__Box__Group__4__Impl : ( 'instantiation' ) ;
    public final void rule__Box__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1851:1: ( ( 'instantiation' ) )
            // InternalXdstm.g:1852:1: ( 'instantiation' )
            {
            // InternalXdstm.g:1852:1: ( 'instantiation' )
            // InternalXdstm.g:1853:2: 'instantiation'
            {
             before(grammarAccess.getBoxAccess().getInstantiationKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getInstantiationKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__4__Impl"


    // $ANTLR start "rule__Box__Group__5"
    // InternalXdstm.g:1862:1: rule__Box__Group__5 : rule__Box__Group__5__Impl rule__Box__Group__6 ;
    public final void rule__Box__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1866:1: ( rule__Box__Group__5__Impl rule__Box__Group__6 )
            // InternalXdstm.g:1867:2: rule__Box__Group__5__Impl rule__Box__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Box__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__5"


    // $ANTLR start "rule__Box__Group__5__Impl"
    // InternalXdstm.g:1874:1: rule__Box__Group__5__Impl : ( '(' ) ;
    public final void rule__Box__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1878:1: ( ( '(' ) )
            // InternalXdstm.g:1879:1: ( '(' )
            {
            // InternalXdstm.g:1879:1: ( '(' )
            // InternalXdstm.g:1880:2: '('
            {
             before(grammarAccess.getBoxAccess().getLeftParenthesisKeyword_5()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getLeftParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__5__Impl"


    // $ANTLR start "rule__Box__Group__6"
    // InternalXdstm.g:1889:1: rule__Box__Group__6 : rule__Box__Group__6__Impl rule__Box__Group__7 ;
    public final void rule__Box__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1893:1: ( rule__Box__Group__6__Impl rule__Box__Group__7 )
            // InternalXdstm.g:1894:2: rule__Box__Group__6__Impl rule__Box__Group__7
            {
            pushFollow(FOLLOW_23);
            rule__Box__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__6"


    // $ANTLR start "rule__Box__Group__6__Impl"
    // InternalXdstm.g:1901:1: rule__Box__Group__6__Impl : ( ( rule__Box__InstantiationAssignment_6 ) ) ;
    public final void rule__Box__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1905:1: ( ( ( rule__Box__InstantiationAssignment_6 ) ) )
            // InternalXdstm.g:1906:1: ( ( rule__Box__InstantiationAssignment_6 ) )
            {
            // InternalXdstm.g:1906:1: ( ( rule__Box__InstantiationAssignment_6 ) )
            // InternalXdstm.g:1907:2: ( rule__Box__InstantiationAssignment_6 )
            {
             before(grammarAccess.getBoxAccess().getInstantiationAssignment_6()); 
            // InternalXdstm.g:1908:2: ( rule__Box__InstantiationAssignment_6 )
            // InternalXdstm.g:1908:3: rule__Box__InstantiationAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Box__InstantiationAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getInstantiationAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__6__Impl"


    // $ANTLR start "rule__Box__Group__7"
    // InternalXdstm.g:1916:1: rule__Box__Group__7 : rule__Box__Group__7__Impl rule__Box__Group__8 ;
    public final void rule__Box__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1920:1: ( rule__Box__Group__7__Impl rule__Box__Group__8 )
            // InternalXdstm.g:1921:2: rule__Box__Group__7__Impl rule__Box__Group__8
            {
            pushFollow(FOLLOW_23);
            rule__Box__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__7"


    // $ANTLR start "rule__Box__Group__7__Impl"
    // InternalXdstm.g:1928:1: rule__Box__Group__7__Impl : ( ( rule__Box__Group_7__0 )* ) ;
    public final void rule__Box__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1932:1: ( ( ( rule__Box__Group_7__0 )* ) )
            // InternalXdstm.g:1933:1: ( ( rule__Box__Group_7__0 )* )
            {
            // InternalXdstm.g:1933:1: ( ( rule__Box__Group_7__0 )* )
            // InternalXdstm.g:1934:2: ( rule__Box__Group_7__0 )*
            {
             before(grammarAccess.getBoxAccess().getGroup_7()); 
            // InternalXdstm.g:1935:2: ( rule__Box__Group_7__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalXdstm.g:1935:3: rule__Box__Group_7__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Box__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getBoxAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__7__Impl"


    // $ANTLR start "rule__Box__Group__8"
    // InternalXdstm.g:1943:1: rule__Box__Group__8 : rule__Box__Group__8__Impl rule__Box__Group__9 ;
    public final void rule__Box__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1947:1: ( rule__Box__Group__8__Impl rule__Box__Group__9 )
            // InternalXdstm.g:1948:2: rule__Box__Group__8__Impl rule__Box__Group__9
            {
            pushFollow(FOLLOW_15);
            rule__Box__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__8"


    // $ANTLR start "rule__Box__Group__8__Impl"
    // InternalXdstm.g:1955:1: rule__Box__Group__8__Impl : ( ')' ) ;
    public final void rule__Box__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1959:1: ( ( ')' ) )
            // InternalXdstm.g:1960:1: ( ')' )
            {
            // InternalXdstm.g:1960:1: ( ')' )
            // InternalXdstm.g:1961:2: ')'
            {
             before(grammarAccess.getBoxAccess().getRightParenthesisKeyword_8()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getRightParenthesisKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__8__Impl"


    // $ANTLR start "rule__Box__Group__9"
    // InternalXdstm.g:1970:1: rule__Box__Group__9 : rule__Box__Group__9__Impl ;
    public final void rule__Box__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1974:1: ( rule__Box__Group__9__Impl )
            // InternalXdstm.g:1975:2: rule__Box__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Box__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__9"


    // $ANTLR start "rule__Box__Group__9__Impl"
    // InternalXdstm.g:1981:1: rule__Box__Group__9__Impl : ( '}' ) ;
    public final void rule__Box__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:1985:1: ( ( '}' ) )
            // InternalXdstm.g:1986:1: ( '}' )
            {
            // InternalXdstm.g:1986:1: ( '}' )
            // InternalXdstm.g:1987:2: '}'
            {
             before(grammarAccess.getBoxAccess().getRightCurlyBracketKeyword_9()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__9__Impl"


    // $ANTLR start "rule__Box__Group_7__0"
    // InternalXdstm.g:1997:1: rule__Box__Group_7__0 : rule__Box__Group_7__0__Impl rule__Box__Group_7__1 ;
    public final void rule__Box__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2001:1: ( rule__Box__Group_7__0__Impl rule__Box__Group_7__1 )
            // InternalXdstm.g:2002:2: rule__Box__Group_7__0__Impl rule__Box__Group_7__1
            {
            pushFollow(FOLLOW_8);
            rule__Box__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_7__0"


    // $ANTLR start "rule__Box__Group_7__0__Impl"
    // InternalXdstm.g:2009:1: rule__Box__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Box__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2013:1: ( ( ',' ) )
            // InternalXdstm.g:2014:1: ( ',' )
            {
            // InternalXdstm.g:2014:1: ( ',' )
            // InternalXdstm.g:2015:2: ','
            {
             before(grammarAccess.getBoxAccess().getCommaKeyword_7_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_7__0__Impl"


    // $ANTLR start "rule__Box__Group_7__1"
    // InternalXdstm.g:2024:1: rule__Box__Group_7__1 : rule__Box__Group_7__1__Impl ;
    public final void rule__Box__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2028:1: ( rule__Box__Group_7__1__Impl )
            // InternalXdstm.g:2029:2: rule__Box__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Box__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_7__1"


    // $ANTLR start "rule__Box__Group_7__1__Impl"
    // InternalXdstm.g:2035:1: rule__Box__Group_7__1__Impl : ( ( rule__Box__InstantiationAssignment_7_1 ) ) ;
    public final void rule__Box__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2039:1: ( ( ( rule__Box__InstantiationAssignment_7_1 ) ) )
            // InternalXdstm.g:2040:1: ( ( rule__Box__InstantiationAssignment_7_1 ) )
            {
            // InternalXdstm.g:2040:1: ( ( rule__Box__InstantiationAssignment_7_1 ) )
            // InternalXdstm.g:2041:2: ( rule__Box__InstantiationAssignment_7_1 )
            {
             before(grammarAccess.getBoxAccess().getInstantiationAssignment_7_1()); 
            // InternalXdstm.g:2042:2: ( rule__Box__InstantiationAssignment_7_1 )
            // InternalXdstm.g:2042:3: rule__Box__InstantiationAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Box__InstantiationAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getInstantiationAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group_7__1__Impl"


    // $ANTLR start "rule__EnteringNode__Group__0"
    // InternalXdstm.g:2051:1: rule__EnteringNode__Group__0 : rule__EnteringNode__Group__0__Impl rule__EnteringNode__Group__1 ;
    public final void rule__EnteringNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2055:1: ( rule__EnteringNode__Group__0__Impl rule__EnteringNode__Group__1 )
            // InternalXdstm.g:2056:2: rule__EnteringNode__Group__0__Impl rule__EnteringNode__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__EnteringNode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnteringNode__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnteringNode__Group__0"


    // $ANTLR start "rule__EnteringNode__Group__0__Impl"
    // InternalXdstm.g:2063:1: rule__EnteringNode__Group__0__Impl : ( 'EnteringNode' ) ;
    public final void rule__EnteringNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2067:1: ( ( 'EnteringNode' ) )
            // InternalXdstm.g:2068:1: ( 'EnteringNode' )
            {
            // InternalXdstm.g:2068:1: ( 'EnteringNode' )
            // InternalXdstm.g:2069:2: 'EnteringNode'
            {
             before(grammarAccess.getEnteringNodeAccess().getEnteringNodeKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getEnteringNodeAccess().getEnteringNodeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnteringNode__Group__0__Impl"


    // $ANTLR start "rule__EnteringNode__Group__1"
    // InternalXdstm.g:2078:1: rule__EnteringNode__Group__1 : rule__EnteringNode__Group__1__Impl rule__EnteringNode__Group__2 ;
    public final void rule__EnteringNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2082:1: ( rule__EnteringNode__Group__1__Impl rule__EnteringNode__Group__2 )
            // InternalXdstm.g:2083:2: rule__EnteringNode__Group__1__Impl rule__EnteringNode__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__EnteringNode__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnteringNode__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnteringNode__Group__1"


    // $ANTLR start "rule__EnteringNode__Group__1__Impl"
    // InternalXdstm.g:2090:1: rule__EnteringNode__Group__1__Impl : ( ( rule__EnteringNode__NameAssignment_1 ) ) ;
    public final void rule__EnteringNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2094:1: ( ( ( rule__EnteringNode__NameAssignment_1 ) ) )
            // InternalXdstm.g:2095:1: ( ( rule__EnteringNode__NameAssignment_1 ) )
            {
            // InternalXdstm.g:2095:1: ( ( rule__EnteringNode__NameAssignment_1 ) )
            // InternalXdstm.g:2096:2: ( rule__EnteringNode__NameAssignment_1 )
            {
             before(grammarAccess.getEnteringNodeAccess().getNameAssignment_1()); 
            // InternalXdstm.g:2097:2: ( rule__EnteringNode__NameAssignment_1 )
            // InternalXdstm.g:2097:3: rule__EnteringNode__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EnteringNode__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnteringNodeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnteringNode__Group__1__Impl"


    // $ANTLR start "rule__EnteringNode__Group__2"
    // InternalXdstm.g:2105:1: rule__EnteringNode__Group__2 : rule__EnteringNode__Group__2__Impl ;
    public final void rule__EnteringNode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2109:1: ( rule__EnteringNode__Group__2__Impl )
            // InternalXdstm.g:2110:2: rule__EnteringNode__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnteringNode__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnteringNode__Group__2"


    // $ANTLR start "rule__EnteringNode__Group__2__Impl"
    // InternalXdstm.g:2116:1: rule__EnteringNode__Group__2__Impl : ( ( rule__EnteringNode__RequirementsAssignment_2 ) ) ;
    public final void rule__EnteringNode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2120:1: ( ( ( rule__EnteringNode__RequirementsAssignment_2 ) ) )
            // InternalXdstm.g:2121:1: ( ( rule__EnteringNode__RequirementsAssignment_2 ) )
            {
            // InternalXdstm.g:2121:1: ( ( rule__EnteringNode__RequirementsAssignment_2 ) )
            // InternalXdstm.g:2122:2: ( rule__EnteringNode__RequirementsAssignment_2 )
            {
             before(grammarAccess.getEnteringNodeAccess().getRequirementsAssignment_2()); 
            // InternalXdstm.g:2123:2: ( rule__EnteringNode__RequirementsAssignment_2 )
            // InternalXdstm.g:2123:3: rule__EnteringNode__RequirementsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EnteringNode__RequirementsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEnteringNodeAccess().getRequirementsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnteringNode__Group__2__Impl"


    // $ANTLR start "rule__InitialNode__Group__0"
    // InternalXdstm.g:2132:1: rule__InitialNode__Group__0 : rule__InitialNode__Group__0__Impl rule__InitialNode__Group__1 ;
    public final void rule__InitialNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2136:1: ( rule__InitialNode__Group__0__Impl rule__InitialNode__Group__1 )
            // InternalXdstm.g:2137:2: rule__InitialNode__Group__0__Impl rule__InitialNode__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__InitialNode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialNode__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialNode__Group__0"


    // $ANTLR start "rule__InitialNode__Group__0__Impl"
    // InternalXdstm.g:2144:1: rule__InitialNode__Group__0__Impl : ( 'InitialNode' ) ;
    public final void rule__InitialNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2148:1: ( ( 'InitialNode' ) )
            // InternalXdstm.g:2149:1: ( 'InitialNode' )
            {
            // InternalXdstm.g:2149:1: ( 'InitialNode' )
            // InternalXdstm.g:2150:2: 'InitialNode'
            {
             before(grammarAccess.getInitialNodeAccess().getInitialNodeKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getInitialNodeAccess().getInitialNodeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialNode__Group__0__Impl"


    // $ANTLR start "rule__InitialNode__Group__1"
    // InternalXdstm.g:2159:1: rule__InitialNode__Group__1 : rule__InitialNode__Group__1__Impl rule__InitialNode__Group__2 ;
    public final void rule__InitialNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2163:1: ( rule__InitialNode__Group__1__Impl rule__InitialNode__Group__2 )
            // InternalXdstm.g:2164:2: rule__InitialNode__Group__1__Impl rule__InitialNode__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__InitialNode__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialNode__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialNode__Group__1"


    // $ANTLR start "rule__InitialNode__Group__1__Impl"
    // InternalXdstm.g:2171:1: rule__InitialNode__Group__1__Impl : ( ( rule__InitialNode__NameAssignment_1 ) ) ;
    public final void rule__InitialNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2175:1: ( ( ( rule__InitialNode__NameAssignment_1 ) ) )
            // InternalXdstm.g:2176:1: ( ( rule__InitialNode__NameAssignment_1 ) )
            {
            // InternalXdstm.g:2176:1: ( ( rule__InitialNode__NameAssignment_1 ) )
            // InternalXdstm.g:2177:2: ( rule__InitialNode__NameAssignment_1 )
            {
             before(grammarAccess.getInitialNodeAccess().getNameAssignment_1()); 
            // InternalXdstm.g:2178:2: ( rule__InitialNode__NameAssignment_1 )
            // InternalXdstm.g:2178:3: rule__InitialNode__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InitialNode__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInitialNodeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialNode__Group__1__Impl"


    // $ANTLR start "rule__InitialNode__Group__2"
    // InternalXdstm.g:2186:1: rule__InitialNode__Group__2 : rule__InitialNode__Group__2__Impl ;
    public final void rule__InitialNode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2190:1: ( rule__InitialNode__Group__2__Impl )
            // InternalXdstm.g:2191:2: rule__InitialNode__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InitialNode__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialNode__Group__2"


    // $ANTLR start "rule__InitialNode__Group__2__Impl"
    // InternalXdstm.g:2197:1: rule__InitialNode__Group__2__Impl : ( ( rule__InitialNode__RequirementsAssignment_2 ) ) ;
    public final void rule__InitialNode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2201:1: ( ( ( rule__InitialNode__RequirementsAssignment_2 ) ) )
            // InternalXdstm.g:2202:1: ( ( rule__InitialNode__RequirementsAssignment_2 ) )
            {
            // InternalXdstm.g:2202:1: ( ( rule__InitialNode__RequirementsAssignment_2 ) )
            // InternalXdstm.g:2203:2: ( rule__InitialNode__RequirementsAssignment_2 )
            {
             before(grammarAccess.getInitialNodeAccess().getRequirementsAssignment_2()); 
            // InternalXdstm.g:2204:2: ( rule__InitialNode__RequirementsAssignment_2 )
            // InternalXdstm.g:2204:3: rule__InitialNode__RequirementsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__InitialNode__RequirementsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInitialNodeAccess().getRequirementsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialNode__Group__2__Impl"


    // $ANTLR start "rule__ExitingNode__Group__0"
    // InternalXdstm.g:2213:1: rule__ExitingNode__Group__0 : rule__ExitingNode__Group__0__Impl rule__ExitingNode__Group__1 ;
    public final void rule__ExitingNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2217:1: ( rule__ExitingNode__Group__0__Impl rule__ExitingNode__Group__1 )
            // InternalXdstm.g:2218:2: rule__ExitingNode__Group__0__Impl rule__ExitingNode__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ExitingNode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExitingNode__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExitingNode__Group__0"


    // $ANTLR start "rule__ExitingNode__Group__0__Impl"
    // InternalXdstm.g:2225:1: rule__ExitingNode__Group__0__Impl : ( 'ExitingNode' ) ;
    public final void rule__ExitingNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2229:1: ( ( 'ExitingNode' ) )
            // InternalXdstm.g:2230:1: ( 'ExitingNode' )
            {
            // InternalXdstm.g:2230:1: ( 'ExitingNode' )
            // InternalXdstm.g:2231:2: 'ExitingNode'
            {
             before(grammarAccess.getExitingNodeAccess().getExitingNodeKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getExitingNodeAccess().getExitingNodeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExitingNode__Group__0__Impl"


    // $ANTLR start "rule__ExitingNode__Group__1"
    // InternalXdstm.g:2240:1: rule__ExitingNode__Group__1 : rule__ExitingNode__Group__1__Impl rule__ExitingNode__Group__2 ;
    public final void rule__ExitingNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2244:1: ( rule__ExitingNode__Group__1__Impl rule__ExitingNode__Group__2 )
            // InternalXdstm.g:2245:2: rule__ExitingNode__Group__1__Impl rule__ExitingNode__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__ExitingNode__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExitingNode__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExitingNode__Group__1"


    // $ANTLR start "rule__ExitingNode__Group__1__Impl"
    // InternalXdstm.g:2252:1: rule__ExitingNode__Group__1__Impl : ( ( rule__ExitingNode__NameAssignment_1 ) ) ;
    public final void rule__ExitingNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2256:1: ( ( ( rule__ExitingNode__NameAssignment_1 ) ) )
            // InternalXdstm.g:2257:1: ( ( rule__ExitingNode__NameAssignment_1 ) )
            {
            // InternalXdstm.g:2257:1: ( ( rule__ExitingNode__NameAssignment_1 ) )
            // InternalXdstm.g:2258:2: ( rule__ExitingNode__NameAssignment_1 )
            {
             before(grammarAccess.getExitingNodeAccess().getNameAssignment_1()); 
            // InternalXdstm.g:2259:2: ( rule__ExitingNode__NameAssignment_1 )
            // InternalXdstm.g:2259:3: rule__ExitingNode__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExitingNode__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExitingNodeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExitingNode__Group__1__Impl"


    // $ANTLR start "rule__ExitingNode__Group__2"
    // InternalXdstm.g:2267:1: rule__ExitingNode__Group__2 : rule__ExitingNode__Group__2__Impl ;
    public final void rule__ExitingNode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2271:1: ( rule__ExitingNode__Group__2__Impl )
            // InternalXdstm.g:2272:2: rule__ExitingNode__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExitingNode__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExitingNode__Group__2"


    // $ANTLR start "rule__ExitingNode__Group__2__Impl"
    // InternalXdstm.g:2278:1: rule__ExitingNode__Group__2__Impl : ( ( rule__ExitingNode__RequirementsAssignment_2 ) ) ;
    public final void rule__ExitingNode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2282:1: ( ( ( rule__ExitingNode__RequirementsAssignment_2 ) ) )
            // InternalXdstm.g:2283:1: ( ( rule__ExitingNode__RequirementsAssignment_2 ) )
            {
            // InternalXdstm.g:2283:1: ( ( rule__ExitingNode__RequirementsAssignment_2 ) )
            // InternalXdstm.g:2284:2: ( rule__ExitingNode__RequirementsAssignment_2 )
            {
             before(grammarAccess.getExitingNodeAccess().getRequirementsAssignment_2()); 
            // InternalXdstm.g:2285:2: ( rule__ExitingNode__RequirementsAssignment_2 )
            // InternalXdstm.g:2285:3: rule__ExitingNode__RequirementsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ExitingNode__RequirementsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExitingNodeAccess().getRequirementsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExitingNode__Group__2__Impl"


    // $ANTLR start "rule__Fork__Group__0"
    // InternalXdstm.g:2294:1: rule__Fork__Group__0 : rule__Fork__Group__0__Impl rule__Fork__Group__1 ;
    public final void rule__Fork__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2298:1: ( rule__Fork__Group__0__Impl rule__Fork__Group__1 )
            // InternalXdstm.g:2299:2: rule__Fork__Group__0__Impl rule__Fork__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Fork__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fork__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fork__Group__0"


    // $ANTLR start "rule__Fork__Group__0__Impl"
    // InternalXdstm.g:2306:1: rule__Fork__Group__0__Impl : ( 'Fork' ) ;
    public final void rule__Fork__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2310:1: ( ( 'Fork' ) )
            // InternalXdstm.g:2311:1: ( 'Fork' )
            {
            // InternalXdstm.g:2311:1: ( 'Fork' )
            // InternalXdstm.g:2312:2: 'Fork'
            {
             before(grammarAccess.getForkAccess().getForkKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getForkAccess().getForkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fork__Group__0__Impl"


    // $ANTLR start "rule__Fork__Group__1"
    // InternalXdstm.g:2321:1: rule__Fork__Group__1 : rule__Fork__Group__1__Impl rule__Fork__Group__2 ;
    public final void rule__Fork__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2325:1: ( rule__Fork__Group__1__Impl rule__Fork__Group__2 )
            // InternalXdstm.g:2326:2: rule__Fork__Group__1__Impl rule__Fork__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Fork__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fork__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fork__Group__1"


    // $ANTLR start "rule__Fork__Group__1__Impl"
    // InternalXdstm.g:2333:1: rule__Fork__Group__1__Impl : ( ( rule__Fork__NameAssignment_1 ) ) ;
    public final void rule__Fork__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2337:1: ( ( ( rule__Fork__NameAssignment_1 ) ) )
            // InternalXdstm.g:2338:1: ( ( rule__Fork__NameAssignment_1 ) )
            {
            // InternalXdstm.g:2338:1: ( ( rule__Fork__NameAssignment_1 ) )
            // InternalXdstm.g:2339:2: ( rule__Fork__NameAssignment_1 )
            {
             before(grammarAccess.getForkAccess().getNameAssignment_1()); 
            // InternalXdstm.g:2340:2: ( rule__Fork__NameAssignment_1 )
            // InternalXdstm.g:2340:3: rule__Fork__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Fork__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getForkAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fork__Group__1__Impl"


    // $ANTLR start "rule__Fork__Group__2"
    // InternalXdstm.g:2348:1: rule__Fork__Group__2 : rule__Fork__Group__2__Impl ;
    public final void rule__Fork__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2352:1: ( rule__Fork__Group__2__Impl )
            // InternalXdstm.g:2353:2: rule__Fork__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Fork__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fork__Group__2"


    // $ANTLR start "rule__Fork__Group__2__Impl"
    // InternalXdstm.g:2359:1: rule__Fork__Group__2__Impl : ( ( rule__Fork__RequirementsAssignment_2 ) ) ;
    public final void rule__Fork__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2363:1: ( ( ( rule__Fork__RequirementsAssignment_2 ) ) )
            // InternalXdstm.g:2364:1: ( ( rule__Fork__RequirementsAssignment_2 ) )
            {
            // InternalXdstm.g:2364:1: ( ( rule__Fork__RequirementsAssignment_2 ) )
            // InternalXdstm.g:2365:2: ( rule__Fork__RequirementsAssignment_2 )
            {
             before(grammarAccess.getForkAccess().getRequirementsAssignment_2()); 
            // InternalXdstm.g:2366:2: ( rule__Fork__RequirementsAssignment_2 )
            // InternalXdstm.g:2366:3: rule__Fork__RequirementsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Fork__RequirementsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getForkAccess().getRequirementsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fork__Group__2__Impl"


    // $ANTLR start "rule__Join__Group__0"
    // InternalXdstm.g:2375:1: rule__Join__Group__0 : rule__Join__Group__0__Impl rule__Join__Group__1 ;
    public final void rule__Join__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2379:1: ( rule__Join__Group__0__Impl rule__Join__Group__1 )
            // InternalXdstm.g:2380:2: rule__Join__Group__0__Impl rule__Join__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Join__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Join__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Join__Group__0"


    // $ANTLR start "rule__Join__Group__0__Impl"
    // InternalXdstm.g:2387:1: rule__Join__Group__0__Impl : ( 'Join' ) ;
    public final void rule__Join__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2391:1: ( ( 'Join' ) )
            // InternalXdstm.g:2392:1: ( 'Join' )
            {
            // InternalXdstm.g:2392:1: ( 'Join' )
            // InternalXdstm.g:2393:2: 'Join'
            {
             before(grammarAccess.getJoinAccess().getJoinKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getJoinAccess().getJoinKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Join__Group__0__Impl"


    // $ANTLR start "rule__Join__Group__1"
    // InternalXdstm.g:2402:1: rule__Join__Group__1 : rule__Join__Group__1__Impl rule__Join__Group__2 ;
    public final void rule__Join__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2406:1: ( rule__Join__Group__1__Impl rule__Join__Group__2 )
            // InternalXdstm.g:2407:2: rule__Join__Group__1__Impl rule__Join__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Join__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Join__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Join__Group__1"


    // $ANTLR start "rule__Join__Group__1__Impl"
    // InternalXdstm.g:2414:1: rule__Join__Group__1__Impl : ( ( rule__Join__NameAssignment_1 ) ) ;
    public final void rule__Join__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2418:1: ( ( ( rule__Join__NameAssignment_1 ) ) )
            // InternalXdstm.g:2419:1: ( ( rule__Join__NameAssignment_1 ) )
            {
            // InternalXdstm.g:2419:1: ( ( rule__Join__NameAssignment_1 ) )
            // InternalXdstm.g:2420:2: ( rule__Join__NameAssignment_1 )
            {
             before(grammarAccess.getJoinAccess().getNameAssignment_1()); 
            // InternalXdstm.g:2421:2: ( rule__Join__NameAssignment_1 )
            // InternalXdstm.g:2421:3: rule__Join__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Join__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getJoinAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Join__Group__1__Impl"


    // $ANTLR start "rule__Join__Group__2"
    // InternalXdstm.g:2429:1: rule__Join__Group__2 : rule__Join__Group__2__Impl ;
    public final void rule__Join__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2433:1: ( rule__Join__Group__2__Impl )
            // InternalXdstm.g:2434:2: rule__Join__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Join__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Join__Group__2"


    // $ANTLR start "rule__Join__Group__2__Impl"
    // InternalXdstm.g:2440:1: rule__Join__Group__2__Impl : ( ( rule__Join__RequirementsAssignment_2 ) ) ;
    public final void rule__Join__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2444:1: ( ( ( rule__Join__RequirementsAssignment_2 ) ) )
            // InternalXdstm.g:2445:1: ( ( rule__Join__RequirementsAssignment_2 ) )
            {
            // InternalXdstm.g:2445:1: ( ( rule__Join__RequirementsAssignment_2 ) )
            // InternalXdstm.g:2446:2: ( rule__Join__RequirementsAssignment_2 )
            {
             before(grammarAccess.getJoinAccess().getRequirementsAssignment_2()); 
            // InternalXdstm.g:2447:2: ( rule__Join__RequirementsAssignment_2 )
            // InternalXdstm.g:2447:3: rule__Join__RequirementsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Join__RequirementsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getJoinAccess().getRequirementsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Join__Group__2__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // InternalXdstm.g:2456:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2460:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalXdstm.g:2461:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0"


    // $ANTLR start "rule__Transition__Group__0__Impl"
    // InternalXdstm.g:2468:1: rule__Transition__Group__0__Impl : ( 'Transition' ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2472:1: ( ( 'Transition' ) )
            // InternalXdstm.g:2473:1: ( 'Transition' )
            {
            // InternalXdstm.g:2473:1: ( 'Transition' )
            // InternalXdstm.g:2474:2: 'Transition'
            {
             before(grammarAccess.getTransitionAccess().getTransitionKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getTransitionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0__Impl"


    // $ANTLR start "rule__Transition__Group__1"
    // InternalXdstm.g:2483:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2487:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalXdstm.g:2488:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Transition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1"


    // $ANTLR start "rule__Transition__Group__1__Impl"
    // InternalXdstm.g:2495:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__NameAssignment_1 ) ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2499:1: ( ( ( rule__Transition__NameAssignment_1 ) ) )
            // InternalXdstm.g:2500:1: ( ( rule__Transition__NameAssignment_1 ) )
            {
            // InternalXdstm.g:2500:1: ( ( rule__Transition__NameAssignment_1 ) )
            // InternalXdstm.g:2501:2: ( rule__Transition__NameAssignment_1 )
            {
             before(grammarAccess.getTransitionAccess().getNameAssignment_1()); 
            // InternalXdstm.g:2502:2: ( rule__Transition__NameAssignment_1 )
            // InternalXdstm.g:2502:3: rule__Transition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__2"
    // InternalXdstm.g:2510:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2514:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // InternalXdstm.g:2515:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Transition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2"


    // $ANTLR start "rule__Transition__Group__2__Impl"
    // InternalXdstm.g:2522:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__RequirementsAssignment_2 ) ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2526:1: ( ( ( rule__Transition__RequirementsAssignment_2 ) ) )
            // InternalXdstm.g:2527:1: ( ( rule__Transition__RequirementsAssignment_2 ) )
            {
            // InternalXdstm.g:2527:1: ( ( rule__Transition__RequirementsAssignment_2 ) )
            // InternalXdstm.g:2528:2: ( rule__Transition__RequirementsAssignment_2 )
            {
             before(grammarAccess.getTransitionAccess().getRequirementsAssignment_2()); 
            // InternalXdstm.g:2529:2: ( rule__Transition__RequirementsAssignment_2 )
            // InternalXdstm.g:2529:3: rule__Transition__RequirementsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Transition__RequirementsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getRequirementsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2__Impl"


    // $ANTLR start "rule__Transition__Group__3"
    // InternalXdstm.g:2537:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2541:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // InternalXdstm.g:2542:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__Transition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3"


    // $ANTLR start "rule__Transition__Group__3__Impl"
    // InternalXdstm.g:2549:1: rule__Transition__Group__3__Impl : ( '{' ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2553:1: ( ( '{' ) )
            // InternalXdstm.g:2554:1: ( '{' )
            {
            // InternalXdstm.g:2554:1: ( '{' )
            // InternalXdstm.g:2555:2: '{'
            {
             before(grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3__Impl"


    // $ANTLR start "rule__Transition__Group__4"
    // InternalXdstm.g:2564:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl rule__Transition__Group__5 ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2568:1: ( rule__Transition__Group__4__Impl rule__Transition__Group__5 )
            // InternalXdstm.g:2569:2: rule__Transition__Group__4__Impl rule__Transition__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Transition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__4"


    // $ANTLR start "rule__Transition__Group__4__Impl"
    // InternalXdstm.g:2576:1: rule__Transition__Group__4__Impl : ( 'source' ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2580:1: ( ( 'source' ) )
            // InternalXdstm.g:2581:1: ( 'source' )
            {
            // InternalXdstm.g:2581:1: ( 'source' )
            // InternalXdstm.g:2582:2: 'source'
            {
             before(grammarAccess.getTransitionAccess().getSourceKeyword_4()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getSourceKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__4__Impl"


    // $ANTLR start "rule__Transition__Group__5"
    // InternalXdstm.g:2591:1: rule__Transition__Group__5 : rule__Transition__Group__5__Impl rule__Transition__Group__6 ;
    public final void rule__Transition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2595:1: ( rule__Transition__Group__5__Impl rule__Transition__Group__6 )
            // InternalXdstm.g:2596:2: rule__Transition__Group__5__Impl rule__Transition__Group__6
            {
            pushFollow(FOLLOW_25);
            rule__Transition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__5"


    // $ANTLR start "rule__Transition__Group__5__Impl"
    // InternalXdstm.g:2603:1: rule__Transition__Group__5__Impl : ( ( rule__Transition__SourceAssignment_5 ) ) ;
    public final void rule__Transition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2607:1: ( ( ( rule__Transition__SourceAssignment_5 ) ) )
            // InternalXdstm.g:2608:1: ( ( rule__Transition__SourceAssignment_5 ) )
            {
            // InternalXdstm.g:2608:1: ( ( rule__Transition__SourceAssignment_5 ) )
            // InternalXdstm.g:2609:2: ( rule__Transition__SourceAssignment_5 )
            {
             before(grammarAccess.getTransitionAccess().getSourceAssignment_5()); 
            // InternalXdstm.g:2610:2: ( rule__Transition__SourceAssignment_5 )
            // InternalXdstm.g:2610:3: rule__Transition__SourceAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Transition__SourceAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getSourceAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__5__Impl"


    // $ANTLR start "rule__Transition__Group__6"
    // InternalXdstm.g:2618:1: rule__Transition__Group__6 : rule__Transition__Group__6__Impl rule__Transition__Group__7 ;
    public final void rule__Transition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2622:1: ( rule__Transition__Group__6__Impl rule__Transition__Group__7 )
            // InternalXdstm.g:2623:2: rule__Transition__Group__6__Impl rule__Transition__Group__7
            {
            pushFollow(FOLLOW_25);
            rule__Transition__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__6"


    // $ANTLR start "rule__Transition__Group__6__Impl"
    // InternalXdstm.g:2630:1: rule__Transition__Group__6__Impl : ( ( rule__Transition__Group_6__0 )? ) ;
    public final void rule__Transition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2634:1: ( ( ( rule__Transition__Group_6__0 )? ) )
            // InternalXdstm.g:2635:1: ( ( rule__Transition__Group_6__0 )? )
            {
            // InternalXdstm.g:2635:1: ( ( rule__Transition__Group_6__0 )? )
            // InternalXdstm.g:2636:2: ( rule__Transition__Group_6__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_6()); 
            // InternalXdstm.g:2637:2: ( rule__Transition__Group_6__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==36) ) {
                    alt9=1;
                }
            }
            switch (alt9) {
                case 1 :
                    // InternalXdstm.g:2637:3: rule__Transition__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transition__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__6__Impl"


    // $ANTLR start "rule__Transition__Group__7"
    // InternalXdstm.g:2645:1: rule__Transition__Group__7 : rule__Transition__Group__7__Impl rule__Transition__Group__8 ;
    public final void rule__Transition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2649:1: ( rule__Transition__Group__7__Impl rule__Transition__Group__8 )
            // InternalXdstm.g:2650:2: rule__Transition__Group__7__Impl rule__Transition__Group__8
            {
            pushFollow(FOLLOW_26);
            rule__Transition__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__7"


    // $ANTLR start "rule__Transition__Group__7__Impl"
    // InternalXdstm.g:2657:1: rule__Transition__Group__7__Impl : ( ',' ) ;
    public final void rule__Transition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2661:1: ( ( ',' ) )
            // InternalXdstm.g:2662:1: ( ',' )
            {
            // InternalXdstm.g:2662:1: ( ',' )
            // InternalXdstm.g:2663:2: ','
            {
             before(grammarAccess.getTransitionAccess().getCommaKeyword_7()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getCommaKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__7__Impl"


    // $ANTLR start "rule__Transition__Group__8"
    // InternalXdstm.g:2672:1: rule__Transition__Group__8 : rule__Transition__Group__8__Impl rule__Transition__Group__9 ;
    public final void rule__Transition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2676:1: ( rule__Transition__Group__8__Impl rule__Transition__Group__9 )
            // InternalXdstm.g:2677:2: rule__Transition__Group__8__Impl rule__Transition__Group__9
            {
            pushFollow(FOLLOW_8);
            rule__Transition__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__8"


    // $ANTLR start "rule__Transition__Group__8__Impl"
    // InternalXdstm.g:2684:1: rule__Transition__Group__8__Impl : ( 'destination' ) ;
    public final void rule__Transition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2688:1: ( ( 'destination' ) )
            // InternalXdstm.g:2689:1: ( 'destination' )
            {
            // InternalXdstm.g:2689:1: ( 'destination' )
            // InternalXdstm.g:2690:2: 'destination'
            {
             before(grammarAccess.getTransitionAccess().getDestinationKeyword_8()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getDestinationKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__8__Impl"


    // $ANTLR start "rule__Transition__Group__9"
    // InternalXdstm.g:2699:1: rule__Transition__Group__9 : rule__Transition__Group__9__Impl rule__Transition__Group__10 ;
    public final void rule__Transition__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2703:1: ( rule__Transition__Group__9__Impl rule__Transition__Group__10 )
            // InternalXdstm.g:2704:2: rule__Transition__Group__9__Impl rule__Transition__Group__10
            {
            pushFollow(FOLLOW_18);
            rule__Transition__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__9"


    // $ANTLR start "rule__Transition__Group__9__Impl"
    // InternalXdstm.g:2711:1: rule__Transition__Group__9__Impl : ( ( rule__Transition__DestinationAssignment_9 ) ) ;
    public final void rule__Transition__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2715:1: ( ( ( rule__Transition__DestinationAssignment_9 ) ) )
            // InternalXdstm.g:2716:1: ( ( rule__Transition__DestinationAssignment_9 ) )
            {
            // InternalXdstm.g:2716:1: ( ( rule__Transition__DestinationAssignment_9 ) )
            // InternalXdstm.g:2717:2: ( rule__Transition__DestinationAssignment_9 )
            {
             before(grammarAccess.getTransitionAccess().getDestinationAssignment_9()); 
            // InternalXdstm.g:2718:2: ( rule__Transition__DestinationAssignment_9 )
            // InternalXdstm.g:2718:3: rule__Transition__DestinationAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Transition__DestinationAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getDestinationAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__9__Impl"


    // $ANTLR start "rule__Transition__Group__10"
    // InternalXdstm.g:2726:1: rule__Transition__Group__10 : rule__Transition__Group__10__Impl rule__Transition__Group__11 ;
    public final void rule__Transition__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2730:1: ( rule__Transition__Group__10__Impl rule__Transition__Group__11 )
            // InternalXdstm.g:2731:2: rule__Transition__Group__10__Impl rule__Transition__Group__11
            {
            pushFollow(FOLLOW_18);
            rule__Transition__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__10"


    // $ANTLR start "rule__Transition__Group__10__Impl"
    // InternalXdstm.g:2738:1: rule__Transition__Group__10__Impl : ( ( rule__Transition__Group_10__0 )? ) ;
    public final void rule__Transition__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2742:1: ( ( ( rule__Transition__Group_10__0 )? ) )
            // InternalXdstm.g:2743:1: ( ( rule__Transition__Group_10__0 )? )
            {
            // InternalXdstm.g:2743:1: ( ( rule__Transition__Group_10__0 )? )
            // InternalXdstm.g:2744:2: ( rule__Transition__Group_10__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_10()); 
            // InternalXdstm.g:2745:2: ( rule__Transition__Group_10__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==37) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // InternalXdstm.g:2745:3: rule__Transition__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transition__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__10__Impl"


    // $ANTLR start "rule__Transition__Group__11"
    // InternalXdstm.g:2753:1: rule__Transition__Group__11 : rule__Transition__Group__11__Impl rule__Transition__Group__12 ;
    public final void rule__Transition__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2757:1: ( rule__Transition__Group__11__Impl rule__Transition__Group__12 )
            // InternalXdstm.g:2758:2: rule__Transition__Group__11__Impl rule__Transition__Group__12
            {
            pushFollow(FOLLOW_18);
            rule__Transition__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__11"


    // $ANTLR start "rule__Transition__Group__11__Impl"
    // InternalXdstm.g:2765:1: rule__Transition__Group__11__Impl : ( ( rule__Transition__Group_11__0 )? ) ;
    public final void rule__Transition__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2769:1: ( ( ( rule__Transition__Group_11__0 )? ) )
            // InternalXdstm.g:2770:1: ( ( rule__Transition__Group_11__0 )? )
            {
            // InternalXdstm.g:2770:1: ( ( rule__Transition__Group_11__0 )? )
            // InternalXdstm.g:2771:2: ( rule__Transition__Group_11__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_11()); 
            // InternalXdstm.g:2772:2: ( rule__Transition__Group_11__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==43) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // InternalXdstm.g:2772:3: rule__Transition__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transition__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__11__Impl"


    // $ANTLR start "rule__Transition__Group__12"
    // InternalXdstm.g:2780:1: rule__Transition__Group__12 : rule__Transition__Group__12__Impl rule__Transition__Group__13 ;
    public final void rule__Transition__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2784:1: ( rule__Transition__Group__12__Impl rule__Transition__Group__13 )
            // InternalXdstm.g:2785:2: rule__Transition__Group__12__Impl rule__Transition__Group__13
            {
            pushFollow(FOLLOW_18);
            rule__Transition__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__12"


    // $ANTLR start "rule__Transition__Group__12__Impl"
    // InternalXdstm.g:2792:1: rule__Transition__Group__12__Impl : ( ( rule__Transition__Group_12__0 )? ) ;
    public final void rule__Transition__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2796:1: ( ( ( rule__Transition__Group_12__0 )? ) )
            // InternalXdstm.g:2797:1: ( ( rule__Transition__Group_12__0 )? )
            {
            // InternalXdstm.g:2797:1: ( ( rule__Transition__Group_12__0 )? )
            // InternalXdstm.g:2798:2: ( rule__Transition__Group_12__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_12()); 
            // InternalXdstm.g:2799:2: ( rule__Transition__Group_12__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==38) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // InternalXdstm.g:2799:3: rule__Transition__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transition__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__12__Impl"


    // $ANTLR start "rule__Transition__Group__13"
    // InternalXdstm.g:2807:1: rule__Transition__Group__13 : rule__Transition__Group__13__Impl rule__Transition__Group__14 ;
    public final void rule__Transition__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2811:1: ( rule__Transition__Group__13__Impl rule__Transition__Group__14 )
            // InternalXdstm.g:2812:2: rule__Transition__Group__13__Impl rule__Transition__Group__14
            {
            pushFollow(FOLLOW_18);
            rule__Transition__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__13"


    // $ANTLR start "rule__Transition__Group__13__Impl"
    // InternalXdstm.g:2819:1: rule__Transition__Group__13__Impl : ( ( rule__Transition__Group_13__0 )? ) ;
    public final void rule__Transition__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2823:1: ( ( ( rule__Transition__Group_13__0 )? ) )
            // InternalXdstm.g:2824:1: ( ( rule__Transition__Group_13__0 )? )
            {
            // InternalXdstm.g:2824:1: ( ( rule__Transition__Group_13__0 )? )
            // InternalXdstm.g:2825:2: ( rule__Transition__Group_13__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_13()); 
            // InternalXdstm.g:2826:2: ( rule__Transition__Group_13__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==39) ) {
                    alt13=1;
                }
            }
            switch (alt13) {
                case 1 :
                    // InternalXdstm.g:2826:3: rule__Transition__Group_13__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transition__Group_13__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__13__Impl"


    // $ANTLR start "rule__Transition__Group__14"
    // InternalXdstm.g:2834:1: rule__Transition__Group__14 : rule__Transition__Group__14__Impl rule__Transition__Group__15 ;
    public final void rule__Transition__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2838:1: ( rule__Transition__Group__14__Impl rule__Transition__Group__15 )
            // InternalXdstm.g:2839:2: rule__Transition__Group__14__Impl rule__Transition__Group__15
            {
            pushFollow(FOLLOW_18);
            rule__Transition__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__14"


    // $ANTLR start "rule__Transition__Group__14__Impl"
    // InternalXdstm.g:2846:1: rule__Transition__Group__14__Impl : ( ( rule__Transition__Group_14__0 )? ) ;
    public final void rule__Transition__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2850:1: ( ( ( rule__Transition__Group_14__0 )? ) )
            // InternalXdstm.g:2851:1: ( ( rule__Transition__Group_14__0 )? )
            {
            // InternalXdstm.g:2851:1: ( ( rule__Transition__Group_14__0 )? )
            // InternalXdstm.g:2852:2: ( rule__Transition__Group_14__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_14()); 
            // InternalXdstm.g:2853:2: ( rule__Transition__Group_14__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==19) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==40) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // InternalXdstm.g:2853:3: rule__Transition__Group_14__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transition__Group_14__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__14__Impl"


    // $ANTLR start "rule__Transition__Group__15"
    // InternalXdstm.g:2861:1: rule__Transition__Group__15 : rule__Transition__Group__15__Impl rule__Transition__Group__16 ;
    public final void rule__Transition__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2865:1: ( rule__Transition__Group__15__Impl rule__Transition__Group__16 )
            // InternalXdstm.g:2866:2: rule__Transition__Group__15__Impl rule__Transition__Group__16
            {
            pushFollow(FOLLOW_18);
            rule__Transition__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__15"


    // $ANTLR start "rule__Transition__Group__15__Impl"
    // InternalXdstm.g:2873:1: rule__Transition__Group__15__Impl : ( ( rule__Transition__Group_15__0 )? ) ;
    public final void rule__Transition__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2877:1: ( ( ( rule__Transition__Group_15__0 )? ) )
            // InternalXdstm.g:2878:1: ( ( rule__Transition__Group_15__0 )? )
            {
            // InternalXdstm.g:2878:1: ( ( rule__Transition__Group_15__0 )? )
            // InternalXdstm.g:2879:2: ( rule__Transition__Group_15__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_15()); 
            // InternalXdstm.g:2880:2: ( rule__Transition__Group_15__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==19) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalXdstm.g:2880:3: rule__Transition__Group_15__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transition__Group_15__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__15__Impl"


    // $ANTLR start "rule__Transition__Group__16"
    // InternalXdstm.g:2888:1: rule__Transition__Group__16 : rule__Transition__Group__16__Impl ;
    public final void rule__Transition__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2892:1: ( rule__Transition__Group__16__Impl )
            // InternalXdstm.g:2893:2: rule__Transition__Group__16__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__16__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__16"


    // $ANTLR start "rule__Transition__Group__16__Impl"
    // InternalXdstm.g:2899:1: rule__Transition__Group__16__Impl : ( '}' ) ;
    public final void rule__Transition__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2903:1: ( ( '}' ) )
            // InternalXdstm.g:2904:1: ( '}' )
            {
            // InternalXdstm.g:2904:1: ( '}' )
            // InternalXdstm.g:2905:2: '}'
            {
             before(grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_16()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__16__Impl"


    // $ANTLR start "rule__Transition__Group_6__0"
    // InternalXdstm.g:2915:1: rule__Transition__Group_6__0 : rule__Transition__Group_6__0__Impl rule__Transition__Group_6__1 ;
    public final void rule__Transition__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2919:1: ( rule__Transition__Group_6__0__Impl rule__Transition__Group_6__1 )
            // InternalXdstm.g:2920:2: rule__Transition__Group_6__0__Impl rule__Transition__Group_6__1
            {
            pushFollow(FOLLOW_27);
            rule__Transition__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_6__0"


    // $ANTLR start "rule__Transition__Group_6__0__Impl"
    // InternalXdstm.g:2927:1: rule__Transition__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Transition__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2931:1: ( ( ',' ) )
            // InternalXdstm.g:2932:1: ( ',' )
            {
            // InternalXdstm.g:2932:1: ( ',' )
            // InternalXdstm.g:2933:2: ','
            {
             before(grammarAccess.getTransitionAccess().getCommaKeyword_6_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_6__0__Impl"


    // $ANTLR start "rule__Transition__Group_6__1"
    // InternalXdstm.g:2942:1: rule__Transition__Group_6__1 : rule__Transition__Group_6__1__Impl rule__Transition__Group_6__2 ;
    public final void rule__Transition__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2946:1: ( rule__Transition__Group_6__1__Impl rule__Transition__Group_6__2 )
            // InternalXdstm.g:2947:2: rule__Transition__Group_6__1__Impl rule__Transition__Group_6__2
            {
            pushFollow(FOLLOW_28);
            rule__Transition__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_6__1"


    // $ANTLR start "rule__Transition__Group_6__1__Impl"
    // InternalXdstm.g:2954:1: rule__Transition__Group_6__1__Impl : ( 'exiting_node' ) ;
    public final void rule__Transition__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2958:1: ( ( 'exiting_node' ) )
            // InternalXdstm.g:2959:1: ( 'exiting_node' )
            {
            // InternalXdstm.g:2959:1: ( 'exiting_node' )
            // InternalXdstm.g:2960:2: 'exiting_node'
            {
             before(grammarAccess.getTransitionAccess().getExiting_nodeKeyword_6_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getExiting_nodeKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_6__1__Impl"


    // $ANTLR start "rule__Transition__Group_6__2"
    // InternalXdstm.g:2969:1: rule__Transition__Group_6__2 : rule__Transition__Group_6__2__Impl ;
    public final void rule__Transition__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2973:1: ( rule__Transition__Group_6__2__Impl )
            // InternalXdstm.g:2974:2: rule__Transition__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_6__2"


    // $ANTLR start "rule__Transition__Group_6__2__Impl"
    // InternalXdstm.g:2980:1: rule__Transition__Group_6__2__Impl : ( ( rule__Transition__Exiting_nodeAssignment_6_2 ) ) ;
    public final void rule__Transition__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:2984:1: ( ( ( rule__Transition__Exiting_nodeAssignment_6_2 ) ) )
            // InternalXdstm.g:2985:1: ( ( rule__Transition__Exiting_nodeAssignment_6_2 ) )
            {
            // InternalXdstm.g:2985:1: ( ( rule__Transition__Exiting_nodeAssignment_6_2 ) )
            // InternalXdstm.g:2986:2: ( rule__Transition__Exiting_nodeAssignment_6_2 )
            {
             before(grammarAccess.getTransitionAccess().getExiting_nodeAssignment_6_2()); 
            // InternalXdstm.g:2987:2: ( rule__Transition__Exiting_nodeAssignment_6_2 )
            // InternalXdstm.g:2987:3: rule__Transition__Exiting_nodeAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Exiting_nodeAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getExiting_nodeAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_6__2__Impl"


    // $ANTLR start "rule__Transition__Group_10__0"
    // InternalXdstm.g:2996:1: rule__Transition__Group_10__0 : rule__Transition__Group_10__0__Impl rule__Transition__Group_10__1 ;
    public final void rule__Transition__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3000:1: ( rule__Transition__Group_10__0__Impl rule__Transition__Group_10__1 )
            // InternalXdstm.g:3001:2: rule__Transition__Group_10__0__Impl rule__Transition__Group_10__1
            {
            pushFollow(FOLLOW_29);
            rule__Transition__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_10__0"


    // $ANTLR start "rule__Transition__Group_10__0__Impl"
    // InternalXdstm.g:3008:1: rule__Transition__Group_10__0__Impl : ( ',' ) ;
    public final void rule__Transition__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3012:1: ( ( ',' ) )
            // InternalXdstm.g:3013:1: ( ',' )
            {
            // InternalXdstm.g:3013:1: ( ',' )
            // InternalXdstm.g:3014:2: ','
            {
             before(grammarAccess.getTransitionAccess().getCommaKeyword_10_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getCommaKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_10__0__Impl"


    // $ANTLR start "rule__Transition__Group_10__1"
    // InternalXdstm.g:3023:1: rule__Transition__Group_10__1 : rule__Transition__Group_10__1__Impl rule__Transition__Group_10__2 ;
    public final void rule__Transition__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3027:1: ( rule__Transition__Group_10__1__Impl rule__Transition__Group_10__2 )
            // InternalXdstm.g:3028:2: rule__Transition__Group_10__1__Impl rule__Transition__Group_10__2
            {
            pushFollow(FOLLOW_28);
            rule__Transition__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_10__1"


    // $ANTLR start "rule__Transition__Group_10__1__Impl"
    // InternalXdstm.g:3035:1: rule__Transition__Group_10__1__Impl : ( 'entering_node' ) ;
    public final void rule__Transition__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3039:1: ( ( 'entering_node' ) )
            // InternalXdstm.g:3040:1: ( 'entering_node' )
            {
            // InternalXdstm.g:3040:1: ( 'entering_node' )
            // InternalXdstm.g:3041:2: 'entering_node'
            {
             before(grammarAccess.getTransitionAccess().getEntering_nodeKeyword_10_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getEntering_nodeKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_10__1__Impl"


    // $ANTLR start "rule__Transition__Group_10__2"
    // InternalXdstm.g:3050:1: rule__Transition__Group_10__2 : rule__Transition__Group_10__2__Impl ;
    public final void rule__Transition__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3054:1: ( rule__Transition__Group_10__2__Impl )
            // InternalXdstm.g:3055:2: rule__Transition__Group_10__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_10__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_10__2"


    // $ANTLR start "rule__Transition__Group_10__2__Impl"
    // InternalXdstm.g:3061:1: rule__Transition__Group_10__2__Impl : ( ( rule__Transition__Entering_nodeAssignment_10_2 ) ) ;
    public final void rule__Transition__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3065:1: ( ( ( rule__Transition__Entering_nodeAssignment_10_2 ) ) )
            // InternalXdstm.g:3066:1: ( ( rule__Transition__Entering_nodeAssignment_10_2 ) )
            {
            // InternalXdstm.g:3066:1: ( ( rule__Transition__Entering_nodeAssignment_10_2 ) )
            // InternalXdstm.g:3067:2: ( rule__Transition__Entering_nodeAssignment_10_2 )
            {
             before(grammarAccess.getTransitionAccess().getEntering_nodeAssignment_10_2()); 
            // InternalXdstm.g:3068:2: ( rule__Transition__Entering_nodeAssignment_10_2 )
            // InternalXdstm.g:3068:3: rule__Transition__Entering_nodeAssignment_10_2
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Entering_nodeAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getEntering_nodeAssignment_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_10__2__Impl"


    // $ANTLR start "rule__Transition__Group_11__0"
    // InternalXdstm.g:3077:1: rule__Transition__Group_11__0 : rule__Transition__Group_11__0__Impl rule__Transition__Group_11__1 ;
    public final void rule__Transition__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3081:1: ( rule__Transition__Group_11__0__Impl rule__Transition__Group_11__1 )
            // InternalXdstm.g:3082:2: rule__Transition__Group_11__0__Impl rule__Transition__Group_11__1
            {
            pushFollow(FOLLOW_30);
            rule__Transition__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_11__0"


    // $ANTLR start "rule__Transition__Group_11__0__Impl"
    // InternalXdstm.g:3089:1: rule__Transition__Group_11__0__Impl : ( ',' ) ;
    public final void rule__Transition__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3093:1: ( ( ',' ) )
            // InternalXdstm.g:3094:1: ( ',' )
            {
            // InternalXdstm.g:3094:1: ( ',' )
            // InternalXdstm.g:3095:2: ','
            {
             before(grammarAccess.getTransitionAccess().getCommaKeyword_11_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getCommaKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_11__0__Impl"


    // $ANTLR start "rule__Transition__Group_11__1"
    // InternalXdstm.g:3104:1: rule__Transition__Group_11__1 : rule__Transition__Group_11__1__Impl ;
    public final void rule__Transition__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3108:1: ( rule__Transition__Group_11__1__Impl )
            // InternalXdstm.g:3109:2: rule__Transition__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_11__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_11__1"


    // $ANTLR start "rule__Transition__Group_11__1__Impl"
    // InternalXdstm.g:3115:1: rule__Transition__Group_11__1__Impl : ( ( rule__Transition__Is_preemptiveAssignment_11_1 ) ) ;
    public final void rule__Transition__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3119:1: ( ( ( rule__Transition__Is_preemptiveAssignment_11_1 ) ) )
            // InternalXdstm.g:3120:1: ( ( rule__Transition__Is_preemptiveAssignment_11_1 ) )
            {
            // InternalXdstm.g:3120:1: ( ( rule__Transition__Is_preemptiveAssignment_11_1 ) )
            // InternalXdstm.g:3121:2: ( rule__Transition__Is_preemptiveAssignment_11_1 )
            {
             before(grammarAccess.getTransitionAccess().getIs_preemptiveAssignment_11_1()); 
            // InternalXdstm.g:3122:2: ( rule__Transition__Is_preemptiveAssignment_11_1 )
            // InternalXdstm.g:3122:3: rule__Transition__Is_preemptiveAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Is_preemptiveAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getIs_preemptiveAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_11__1__Impl"


    // $ANTLR start "rule__Transition__Group_12__0"
    // InternalXdstm.g:3131:1: rule__Transition__Group_12__0 : rule__Transition__Group_12__0__Impl rule__Transition__Group_12__1 ;
    public final void rule__Transition__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3135:1: ( rule__Transition__Group_12__0__Impl rule__Transition__Group_12__1 )
            // InternalXdstm.g:3136:2: rule__Transition__Group_12__0__Impl rule__Transition__Group_12__1
            {
            pushFollow(FOLLOW_31);
            rule__Transition__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_12__0"


    // $ANTLR start "rule__Transition__Group_12__0__Impl"
    // InternalXdstm.g:3143:1: rule__Transition__Group_12__0__Impl : ( ',' ) ;
    public final void rule__Transition__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3147:1: ( ( ',' ) )
            // InternalXdstm.g:3148:1: ( ',' )
            {
            // InternalXdstm.g:3148:1: ( ',' )
            // InternalXdstm.g:3149:2: ','
            {
             before(grammarAccess.getTransitionAccess().getCommaKeyword_12_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getCommaKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_12__0__Impl"


    // $ANTLR start "rule__Transition__Group_12__1"
    // InternalXdstm.g:3158:1: rule__Transition__Group_12__1 : rule__Transition__Group_12__1__Impl rule__Transition__Group_12__2 ;
    public final void rule__Transition__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3162:1: ( rule__Transition__Group_12__1__Impl rule__Transition__Group_12__2 )
            // InternalXdstm.g:3163:2: rule__Transition__Group_12__1__Impl rule__Transition__Group_12__2
            {
            pushFollow(FOLLOW_6);
            rule__Transition__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_12__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_12__1"


    // $ANTLR start "rule__Transition__Group_12__1__Impl"
    // InternalXdstm.g:3170:1: rule__Transition__Group_12__1__Impl : ( 'trigger' ) ;
    public final void rule__Transition__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3174:1: ( ( 'trigger' ) )
            // InternalXdstm.g:3175:1: ( 'trigger' )
            {
            // InternalXdstm.g:3175:1: ( 'trigger' )
            // InternalXdstm.g:3176:2: 'trigger'
            {
             before(grammarAccess.getTransitionAccess().getTriggerKeyword_12_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getTriggerKeyword_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_12__1__Impl"


    // $ANTLR start "rule__Transition__Group_12__2"
    // InternalXdstm.g:3185:1: rule__Transition__Group_12__2 : rule__Transition__Group_12__2__Impl ;
    public final void rule__Transition__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3189:1: ( rule__Transition__Group_12__2__Impl )
            // InternalXdstm.g:3190:2: rule__Transition__Group_12__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_12__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_12__2"


    // $ANTLR start "rule__Transition__Group_12__2__Impl"
    // InternalXdstm.g:3196:1: rule__Transition__Group_12__2__Impl : ( ( rule__Transition__TriggerAssignment_12_2 ) ) ;
    public final void rule__Transition__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3200:1: ( ( ( rule__Transition__TriggerAssignment_12_2 ) ) )
            // InternalXdstm.g:3201:1: ( ( rule__Transition__TriggerAssignment_12_2 ) )
            {
            // InternalXdstm.g:3201:1: ( ( rule__Transition__TriggerAssignment_12_2 ) )
            // InternalXdstm.g:3202:2: ( rule__Transition__TriggerAssignment_12_2 )
            {
             before(grammarAccess.getTransitionAccess().getTriggerAssignment_12_2()); 
            // InternalXdstm.g:3203:2: ( rule__Transition__TriggerAssignment_12_2 )
            // InternalXdstm.g:3203:3: rule__Transition__TriggerAssignment_12_2
            {
            pushFollow(FOLLOW_2);
            rule__Transition__TriggerAssignment_12_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getTriggerAssignment_12_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_12__2__Impl"


    // $ANTLR start "rule__Transition__Group_13__0"
    // InternalXdstm.g:3212:1: rule__Transition__Group_13__0 : rule__Transition__Group_13__0__Impl rule__Transition__Group_13__1 ;
    public final void rule__Transition__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3216:1: ( rule__Transition__Group_13__0__Impl rule__Transition__Group_13__1 )
            // InternalXdstm.g:3217:2: rule__Transition__Group_13__0__Impl rule__Transition__Group_13__1
            {
            pushFollow(FOLLOW_32);
            rule__Transition__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_13__0"


    // $ANTLR start "rule__Transition__Group_13__0__Impl"
    // InternalXdstm.g:3224:1: rule__Transition__Group_13__0__Impl : ( ',' ) ;
    public final void rule__Transition__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3228:1: ( ( ',' ) )
            // InternalXdstm.g:3229:1: ( ',' )
            {
            // InternalXdstm.g:3229:1: ( ',' )
            // InternalXdstm.g:3230:2: ','
            {
             before(grammarAccess.getTransitionAccess().getCommaKeyword_13_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getCommaKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_13__0__Impl"


    // $ANTLR start "rule__Transition__Group_13__1"
    // InternalXdstm.g:3239:1: rule__Transition__Group_13__1 : rule__Transition__Group_13__1__Impl rule__Transition__Group_13__2 ;
    public final void rule__Transition__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3243:1: ( rule__Transition__Group_13__1__Impl rule__Transition__Group_13__2 )
            // InternalXdstm.g:3244:2: rule__Transition__Group_13__1__Impl rule__Transition__Group_13__2
            {
            pushFollow(FOLLOW_6);
            rule__Transition__Group_13__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_13__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_13__1"


    // $ANTLR start "rule__Transition__Group_13__1__Impl"
    // InternalXdstm.g:3251:1: rule__Transition__Group_13__1__Impl : ( 'condition' ) ;
    public final void rule__Transition__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3255:1: ( ( 'condition' ) )
            // InternalXdstm.g:3256:1: ( 'condition' )
            {
            // InternalXdstm.g:3256:1: ( 'condition' )
            // InternalXdstm.g:3257:2: 'condition'
            {
             before(grammarAccess.getTransitionAccess().getConditionKeyword_13_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getConditionKeyword_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_13__1__Impl"


    // $ANTLR start "rule__Transition__Group_13__2"
    // InternalXdstm.g:3266:1: rule__Transition__Group_13__2 : rule__Transition__Group_13__2__Impl ;
    public final void rule__Transition__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3270:1: ( rule__Transition__Group_13__2__Impl )
            // InternalXdstm.g:3271:2: rule__Transition__Group_13__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_13__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_13__2"


    // $ANTLR start "rule__Transition__Group_13__2__Impl"
    // InternalXdstm.g:3277:1: rule__Transition__Group_13__2__Impl : ( ( rule__Transition__ConditionAssignment_13_2 ) ) ;
    public final void rule__Transition__Group_13__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3281:1: ( ( ( rule__Transition__ConditionAssignment_13_2 ) ) )
            // InternalXdstm.g:3282:1: ( ( rule__Transition__ConditionAssignment_13_2 ) )
            {
            // InternalXdstm.g:3282:1: ( ( rule__Transition__ConditionAssignment_13_2 ) )
            // InternalXdstm.g:3283:2: ( rule__Transition__ConditionAssignment_13_2 )
            {
             before(grammarAccess.getTransitionAccess().getConditionAssignment_13_2()); 
            // InternalXdstm.g:3284:2: ( rule__Transition__ConditionAssignment_13_2 )
            // InternalXdstm.g:3284:3: rule__Transition__ConditionAssignment_13_2
            {
            pushFollow(FOLLOW_2);
            rule__Transition__ConditionAssignment_13_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getConditionAssignment_13_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_13__2__Impl"


    // $ANTLR start "rule__Transition__Group_14__0"
    // InternalXdstm.g:3293:1: rule__Transition__Group_14__0 : rule__Transition__Group_14__0__Impl rule__Transition__Group_14__1 ;
    public final void rule__Transition__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3297:1: ( rule__Transition__Group_14__0__Impl rule__Transition__Group_14__1 )
            // InternalXdstm.g:3298:2: rule__Transition__Group_14__0__Impl rule__Transition__Group_14__1
            {
            pushFollow(FOLLOW_33);
            rule__Transition__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_14__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_14__0"


    // $ANTLR start "rule__Transition__Group_14__0__Impl"
    // InternalXdstm.g:3305:1: rule__Transition__Group_14__0__Impl : ( ',' ) ;
    public final void rule__Transition__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3309:1: ( ( ',' ) )
            // InternalXdstm.g:3310:1: ( ',' )
            {
            // InternalXdstm.g:3310:1: ( ',' )
            // InternalXdstm.g:3311:2: ','
            {
             before(grammarAccess.getTransitionAccess().getCommaKeyword_14_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getCommaKeyword_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_14__0__Impl"


    // $ANTLR start "rule__Transition__Group_14__1"
    // InternalXdstm.g:3320:1: rule__Transition__Group_14__1 : rule__Transition__Group_14__1__Impl rule__Transition__Group_14__2 ;
    public final void rule__Transition__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3324:1: ( rule__Transition__Group_14__1__Impl rule__Transition__Group_14__2 )
            // InternalXdstm.g:3325:2: rule__Transition__Group_14__1__Impl rule__Transition__Group_14__2
            {
            pushFollow(FOLLOW_9);
            rule__Transition__Group_14__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_14__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_14__1"


    // $ANTLR start "rule__Transition__Group_14__1__Impl"
    // InternalXdstm.g:3332:1: rule__Transition__Group_14__1__Impl : ( 'actions' ) ;
    public final void rule__Transition__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3336:1: ( ( 'actions' ) )
            // InternalXdstm.g:3337:1: ( 'actions' )
            {
            // InternalXdstm.g:3337:1: ( 'actions' )
            // InternalXdstm.g:3338:2: 'actions'
            {
             before(grammarAccess.getTransitionAccess().getActionsKeyword_14_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getActionsKeyword_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_14__1__Impl"


    // $ANTLR start "rule__Transition__Group_14__2"
    // InternalXdstm.g:3347:1: rule__Transition__Group_14__2 : rule__Transition__Group_14__2__Impl rule__Transition__Group_14__3 ;
    public final void rule__Transition__Group_14__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3351:1: ( rule__Transition__Group_14__2__Impl rule__Transition__Group_14__3 )
            // InternalXdstm.g:3352:2: rule__Transition__Group_14__2__Impl rule__Transition__Group_14__3
            {
            pushFollow(FOLLOW_6);
            rule__Transition__Group_14__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_14__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_14__2"


    // $ANTLR start "rule__Transition__Group_14__2__Impl"
    // InternalXdstm.g:3359:1: rule__Transition__Group_14__2__Impl : ( '{' ) ;
    public final void rule__Transition__Group_14__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3363:1: ( ( '{' ) )
            // InternalXdstm.g:3364:1: ( '{' )
            {
            // InternalXdstm.g:3364:1: ( '{' )
            // InternalXdstm.g:3365:2: '{'
            {
             before(grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_14_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_14_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_14__2__Impl"


    // $ANTLR start "rule__Transition__Group_14__3"
    // InternalXdstm.g:3374:1: rule__Transition__Group_14__3 : rule__Transition__Group_14__3__Impl rule__Transition__Group_14__4 ;
    public final void rule__Transition__Group_14__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3378:1: ( rule__Transition__Group_14__3__Impl rule__Transition__Group_14__4 )
            // InternalXdstm.g:3379:2: rule__Transition__Group_14__3__Impl rule__Transition__Group_14__4
            {
            pushFollow(FOLLOW_18);
            rule__Transition__Group_14__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_14__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_14__3"


    // $ANTLR start "rule__Transition__Group_14__3__Impl"
    // InternalXdstm.g:3386:1: rule__Transition__Group_14__3__Impl : ( ( rule__Transition__ActionsAssignment_14_3 ) ) ;
    public final void rule__Transition__Group_14__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3390:1: ( ( ( rule__Transition__ActionsAssignment_14_3 ) ) )
            // InternalXdstm.g:3391:1: ( ( rule__Transition__ActionsAssignment_14_3 ) )
            {
            // InternalXdstm.g:3391:1: ( ( rule__Transition__ActionsAssignment_14_3 ) )
            // InternalXdstm.g:3392:2: ( rule__Transition__ActionsAssignment_14_3 )
            {
             before(grammarAccess.getTransitionAccess().getActionsAssignment_14_3()); 
            // InternalXdstm.g:3393:2: ( rule__Transition__ActionsAssignment_14_3 )
            // InternalXdstm.g:3393:3: rule__Transition__ActionsAssignment_14_3
            {
            pushFollow(FOLLOW_2);
            rule__Transition__ActionsAssignment_14_3();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getActionsAssignment_14_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_14__3__Impl"


    // $ANTLR start "rule__Transition__Group_14__4"
    // InternalXdstm.g:3401:1: rule__Transition__Group_14__4 : rule__Transition__Group_14__4__Impl rule__Transition__Group_14__5 ;
    public final void rule__Transition__Group_14__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3405:1: ( rule__Transition__Group_14__4__Impl rule__Transition__Group_14__5 )
            // InternalXdstm.g:3406:2: rule__Transition__Group_14__4__Impl rule__Transition__Group_14__5
            {
            pushFollow(FOLLOW_18);
            rule__Transition__Group_14__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_14__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_14__4"


    // $ANTLR start "rule__Transition__Group_14__4__Impl"
    // InternalXdstm.g:3413:1: rule__Transition__Group_14__4__Impl : ( ( rule__Transition__Group_14_4__0 )* ) ;
    public final void rule__Transition__Group_14__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3417:1: ( ( ( rule__Transition__Group_14_4__0 )* ) )
            // InternalXdstm.g:3418:1: ( ( rule__Transition__Group_14_4__0 )* )
            {
            // InternalXdstm.g:3418:1: ( ( rule__Transition__Group_14_4__0 )* )
            // InternalXdstm.g:3419:2: ( rule__Transition__Group_14_4__0 )*
            {
             before(grammarAccess.getTransitionAccess().getGroup_14_4()); 
            // InternalXdstm.g:3420:2: ( rule__Transition__Group_14_4__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==19) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalXdstm.g:3420:3: rule__Transition__Group_14_4__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Transition__Group_14_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getTransitionAccess().getGroup_14_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_14__4__Impl"


    // $ANTLR start "rule__Transition__Group_14__5"
    // InternalXdstm.g:3428:1: rule__Transition__Group_14__5 : rule__Transition__Group_14__5__Impl ;
    public final void rule__Transition__Group_14__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3432:1: ( rule__Transition__Group_14__5__Impl )
            // InternalXdstm.g:3433:2: rule__Transition__Group_14__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_14__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_14__5"


    // $ANTLR start "rule__Transition__Group_14__5__Impl"
    // InternalXdstm.g:3439:1: rule__Transition__Group_14__5__Impl : ( '}' ) ;
    public final void rule__Transition__Group_14__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3443:1: ( ( '}' ) )
            // InternalXdstm.g:3444:1: ( '}' )
            {
            // InternalXdstm.g:3444:1: ( '}' )
            // InternalXdstm.g:3445:2: '}'
            {
             before(grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_14_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_14_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_14__5__Impl"


    // $ANTLR start "rule__Transition__Group_14_4__0"
    // InternalXdstm.g:3455:1: rule__Transition__Group_14_4__0 : rule__Transition__Group_14_4__0__Impl rule__Transition__Group_14_4__1 ;
    public final void rule__Transition__Group_14_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3459:1: ( rule__Transition__Group_14_4__0__Impl rule__Transition__Group_14_4__1 )
            // InternalXdstm.g:3460:2: rule__Transition__Group_14_4__0__Impl rule__Transition__Group_14_4__1
            {
            pushFollow(FOLLOW_6);
            rule__Transition__Group_14_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_14_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_14_4__0"


    // $ANTLR start "rule__Transition__Group_14_4__0__Impl"
    // InternalXdstm.g:3467:1: rule__Transition__Group_14_4__0__Impl : ( ',' ) ;
    public final void rule__Transition__Group_14_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3471:1: ( ( ',' ) )
            // InternalXdstm.g:3472:1: ( ',' )
            {
            // InternalXdstm.g:3472:1: ( ',' )
            // InternalXdstm.g:3473:2: ','
            {
             before(grammarAccess.getTransitionAccess().getCommaKeyword_14_4_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getCommaKeyword_14_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_14_4__0__Impl"


    // $ANTLR start "rule__Transition__Group_14_4__1"
    // InternalXdstm.g:3482:1: rule__Transition__Group_14_4__1 : rule__Transition__Group_14_4__1__Impl ;
    public final void rule__Transition__Group_14_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3486:1: ( rule__Transition__Group_14_4__1__Impl )
            // InternalXdstm.g:3487:2: rule__Transition__Group_14_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_14_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_14_4__1"


    // $ANTLR start "rule__Transition__Group_14_4__1__Impl"
    // InternalXdstm.g:3493:1: rule__Transition__Group_14_4__1__Impl : ( ( rule__Transition__ActionsAssignment_14_4_1 ) ) ;
    public final void rule__Transition__Group_14_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3497:1: ( ( ( rule__Transition__ActionsAssignment_14_4_1 ) ) )
            // InternalXdstm.g:3498:1: ( ( rule__Transition__ActionsAssignment_14_4_1 ) )
            {
            // InternalXdstm.g:3498:1: ( ( rule__Transition__ActionsAssignment_14_4_1 ) )
            // InternalXdstm.g:3499:2: ( rule__Transition__ActionsAssignment_14_4_1 )
            {
             before(grammarAccess.getTransitionAccess().getActionsAssignment_14_4_1()); 
            // InternalXdstm.g:3500:2: ( rule__Transition__ActionsAssignment_14_4_1 )
            // InternalXdstm.g:3500:3: rule__Transition__ActionsAssignment_14_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__ActionsAssignment_14_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getActionsAssignment_14_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_14_4__1__Impl"


    // $ANTLR start "rule__Transition__Group_15__0"
    // InternalXdstm.g:3509:1: rule__Transition__Group_15__0 : rule__Transition__Group_15__0__Impl rule__Transition__Group_15__1 ;
    public final void rule__Transition__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3513:1: ( rule__Transition__Group_15__0__Impl rule__Transition__Group_15__1 )
            // InternalXdstm.g:3514:2: rule__Transition__Group_15__0__Impl rule__Transition__Group_15__1
            {
            pushFollow(FOLLOW_34);
            rule__Transition__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_15__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_15__0"


    // $ANTLR start "rule__Transition__Group_15__0__Impl"
    // InternalXdstm.g:3521:1: rule__Transition__Group_15__0__Impl : ( ',' ) ;
    public final void rule__Transition__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3525:1: ( ( ',' ) )
            // InternalXdstm.g:3526:1: ( ',' )
            {
            // InternalXdstm.g:3526:1: ( ',' )
            // InternalXdstm.g:3527:2: ','
            {
             before(grammarAccess.getTransitionAccess().getCommaKeyword_15_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getCommaKeyword_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_15__0__Impl"


    // $ANTLR start "rule__Transition__Group_15__1"
    // InternalXdstm.g:3536:1: rule__Transition__Group_15__1 : rule__Transition__Group_15__1__Impl rule__Transition__Group_15__2 ;
    public final void rule__Transition__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3540:1: ( rule__Transition__Group_15__1__Impl rule__Transition__Group_15__2 )
            // InternalXdstm.g:3541:2: rule__Transition__Group_15__1__Impl rule__Transition__Group_15__2
            {
            pushFollow(FOLLOW_9);
            rule__Transition__Group_15__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_15__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_15__1"


    // $ANTLR start "rule__Transition__Group_15__1__Impl"
    // InternalXdstm.g:3548:1: rule__Transition__Group_15__1__Impl : ( 'par_instantiation' ) ;
    public final void rule__Transition__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3552:1: ( ( 'par_instantiation' ) )
            // InternalXdstm.g:3553:1: ( 'par_instantiation' )
            {
            // InternalXdstm.g:3553:1: ( 'par_instantiation' )
            // InternalXdstm.g:3554:2: 'par_instantiation'
            {
             before(grammarAccess.getTransitionAccess().getPar_instantiationKeyword_15_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getPar_instantiationKeyword_15_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_15__1__Impl"


    // $ANTLR start "rule__Transition__Group_15__2"
    // InternalXdstm.g:3563:1: rule__Transition__Group_15__2 : rule__Transition__Group_15__2__Impl rule__Transition__Group_15__3 ;
    public final void rule__Transition__Group_15__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3567:1: ( rule__Transition__Group_15__2__Impl rule__Transition__Group_15__3 )
            // InternalXdstm.g:3568:2: rule__Transition__Group_15__2__Impl rule__Transition__Group_15__3
            {
            pushFollow(FOLLOW_6);
            rule__Transition__Group_15__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_15__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_15__2"


    // $ANTLR start "rule__Transition__Group_15__2__Impl"
    // InternalXdstm.g:3575:1: rule__Transition__Group_15__2__Impl : ( '{' ) ;
    public final void rule__Transition__Group_15__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3579:1: ( ( '{' ) )
            // InternalXdstm.g:3580:1: ( '{' )
            {
            // InternalXdstm.g:3580:1: ( '{' )
            // InternalXdstm.g:3581:2: '{'
            {
             before(grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_15_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_15_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_15__2__Impl"


    // $ANTLR start "rule__Transition__Group_15__3"
    // InternalXdstm.g:3590:1: rule__Transition__Group_15__3 : rule__Transition__Group_15__3__Impl rule__Transition__Group_15__4 ;
    public final void rule__Transition__Group_15__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3594:1: ( rule__Transition__Group_15__3__Impl rule__Transition__Group_15__4 )
            // InternalXdstm.g:3595:2: rule__Transition__Group_15__3__Impl rule__Transition__Group_15__4
            {
            pushFollow(FOLLOW_18);
            rule__Transition__Group_15__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_15__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_15__3"


    // $ANTLR start "rule__Transition__Group_15__3__Impl"
    // InternalXdstm.g:3602:1: rule__Transition__Group_15__3__Impl : ( ( rule__Transition__Par_instantiationAssignment_15_3 ) ) ;
    public final void rule__Transition__Group_15__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3606:1: ( ( ( rule__Transition__Par_instantiationAssignment_15_3 ) ) )
            // InternalXdstm.g:3607:1: ( ( rule__Transition__Par_instantiationAssignment_15_3 ) )
            {
            // InternalXdstm.g:3607:1: ( ( rule__Transition__Par_instantiationAssignment_15_3 ) )
            // InternalXdstm.g:3608:2: ( rule__Transition__Par_instantiationAssignment_15_3 )
            {
             before(grammarAccess.getTransitionAccess().getPar_instantiationAssignment_15_3()); 
            // InternalXdstm.g:3609:2: ( rule__Transition__Par_instantiationAssignment_15_3 )
            // InternalXdstm.g:3609:3: rule__Transition__Par_instantiationAssignment_15_3
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Par_instantiationAssignment_15_3();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getPar_instantiationAssignment_15_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_15__3__Impl"


    // $ANTLR start "rule__Transition__Group_15__4"
    // InternalXdstm.g:3617:1: rule__Transition__Group_15__4 : rule__Transition__Group_15__4__Impl rule__Transition__Group_15__5 ;
    public final void rule__Transition__Group_15__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3621:1: ( rule__Transition__Group_15__4__Impl rule__Transition__Group_15__5 )
            // InternalXdstm.g:3622:2: rule__Transition__Group_15__4__Impl rule__Transition__Group_15__5
            {
            pushFollow(FOLLOW_18);
            rule__Transition__Group_15__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_15__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_15__4"


    // $ANTLR start "rule__Transition__Group_15__4__Impl"
    // InternalXdstm.g:3629:1: rule__Transition__Group_15__4__Impl : ( ( rule__Transition__Group_15_4__0 )* ) ;
    public final void rule__Transition__Group_15__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3633:1: ( ( ( rule__Transition__Group_15_4__0 )* ) )
            // InternalXdstm.g:3634:1: ( ( rule__Transition__Group_15_4__0 )* )
            {
            // InternalXdstm.g:3634:1: ( ( rule__Transition__Group_15_4__0 )* )
            // InternalXdstm.g:3635:2: ( rule__Transition__Group_15_4__0 )*
            {
             before(grammarAccess.getTransitionAccess().getGroup_15_4()); 
            // InternalXdstm.g:3636:2: ( rule__Transition__Group_15_4__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==19) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalXdstm.g:3636:3: rule__Transition__Group_15_4__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Transition__Group_15_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getTransitionAccess().getGroup_15_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_15__4__Impl"


    // $ANTLR start "rule__Transition__Group_15__5"
    // InternalXdstm.g:3644:1: rule__Transition__Group_15__5 : rule__Transition__Group_15__5__Impl ;
    public final void rule__Transition__Group_15__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3648:1: ( rule__Transition__Group_15__5__Impl )
            // InternalXdstm.g:3649:2: rule__Transition__Group_15__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_15__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_15__5"


    // $ANTLR start "rule__Transition__Group_15__5__Impl"
    // InternalXdstm.g:3655:1: rule__Transition__Group_15__5__Impl : ( '}' ) ;
    public final void rule__Transition__Group_15__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3659:1: ( ( '}' ) )
            // InternalXdstm.g:3660:1: ( '}' )
            {
            // InternalXdstm.g:3660:1: ( '}' )
            // InternalXdstm.g:3661:2: '}'
            {
             before(grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_15_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_15_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_15__5__Impl"


    // $ANTLR start "rule__Transition__Group_15_4__0"
    // InternalXdstm.g:3671:1: rule__Transition__Group_15_4__0 : rule__Transition__Group_15_4__0__Impl rule__Transition__Group_15_4__1 ;
    public final void rule__Transition__Group_15_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3675:1: ( rule__Transition__Group_15_4__0__Impl rule__Transition__Group_15_4__1 )
            // InternalXdstm.g:3676:2: rule__Transition__Group_15_4__0__Impl rule__Transition__Group_15_4__1
            {
            pushFollow(FOLLOW_6);
            rule__Transition__Group_15_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_15_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_15_4__0"


    // $ANTLR start "rule__Transition__Group_15_4__0__Impl"
    // InternalXdstm.g:3683:1: rule__Transition__Group_15_4__0__Impl : ( ',' ) ;
    public final void rule__Transition__Group_15_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3687:1: ( ( ',' ) )
            // InternalXdstm.g:3688:1: ( ',' )
            {
            // InternalXdstm.g:3688:1: ( ',' )
            // InternalXdstm.g:3689:2: ','
            {
             before(grammarAccess.getTransitionAccess().getCommaKeyword_15_4_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getCommaKeyword_15_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_15_4__0__Impl"


    // $ANTLR start "rule__Transition__Group_15_4__1"
    // InternalXdstm.g:3698:1: rule__Transition__Group_15_4__1 : rule__Transition__Group_15_4__1__Impl ;
    public final void rule__Transition__Group_15_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3702:1: ( rule__Transition__Group_15_4__1__Impl )
            // InternalXdstm.g:3703:2: rule__Transition__Group_15_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_15_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_15_4__1"


    // $ANTLR start "rule__Transition__Group_15_4__1__Impl"
    // InternalXdstm.g:3709:1: rule__Transition__Group_15_4__1__Impl : ( ( rule__Transition__Par_instantiationAssignment_15_4_1 ) ) ;
    public final void rule__Transition__Group_15_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3713:1: ( ( ( rule__Transition__Par_instantiationAssignment_15_4_1 ) ) )
            // InternalXdstm.g:3714:1: ( ( rule__Transition__Par_instantiationAssignment_15_4_1 ) )
            {
            // InternalXdstm.g:3714:1: ( ( rule__Transition__Par_instantiationAssignment_15_4_1 ) )
            // InternalXdstm.g:3715:2: ( rule__Transition__Par_instantiationAssignment_15_4_1 )
            {
             before(grammarAccess.getTransitionAccess().getPar_instantiationAssignment_15_4_1()); 
            // InternalXdstm.g:3716:2: ( rule__Transition__Par_instantiationAssignment_15_4_1 )
            // InternalXdstm.g:3716:3: rule__Transition__Par_instantiationAssignment_15_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Par_instantiationAssignment_15_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getPar_instantiationAssignment_15_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_15_4__1__Impl"


    // $ANTLR start "rule__Requirements__Group__0"
    // InternalXdstm.g:3725:1: rule__Requirements__Group__0 : rule__Requirements__Group__0__Impl rule__Requirements__Group__1 ;
    public final void rule__Requirements__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3729:1: ( rule__Requirements__Group__0__Impl rule__Requirements__Group__1 )
            // InternalXdstm.g:3730:2: rule__Requirements__Group__0__Impl rule__Requirements__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Requirements__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Requirements__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirements__Group__0"


    // $ANTLR start "rule__Requirements__Group__0__Impl"
    // InternalXdstm.g:3737:1: rule__Requirements__Group__0__Impl : ( () ) ;
    public final void rule__Requirements__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3741:1: ( ( () ) )
            // InternalXdstm.g:3742:1: ( () )
            {
            // InternalXdstm.g:3742:1: ( () )
            // InternalXdstm.g:3743:2: ()
            {
             before(grammarAccess.getRequirementsAccess().getRequirementsAction_0()); 
            // InternalXdstm.g:3744:2: ()
            // InternalXdstm.g:3744:3: 
            {
            }

             after(grammarAccess.getRequirementsAccess().getRequirementsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirements__Group__0__Impl"


    // $ANTLR start "rule__Requirements__Group__1"
    // InternalXdstm.g:3752:1: rule__Requirements__Group__1 : rule__Requirements__Group__1__Impl ;
    public final void rule__Requirements__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3756:1: ( rule__Requirements__Group__1__Impl )
            // InternalXdstm.g:3757:2: rule__Requirements__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Requirements__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirements__Group__1"


    // $ANTLR start "rule__Requirements__Group__1__Impl"
    // InternalXdstm.g:3763:1: rule__Requirements__Group__1__Impl : ( ( rule__Requirements__Group_1__0 )? ) ;
    public final void rule__Requirements__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3767:1: ( ( ( rule__Requirements__Group_1__0 )? ) )
            // InternalXdstm.g:3768:1: ( ( rule__Requirements__Group_1__0 )? )
            {
            // InternalXdstm.g:3768:1: ( ( rule__Requirements__Group_1__0 )? )
            // InternalXdstm.g:3769:2: ( rule__Requirements__Group_1__0 )?
            {
             before(grammarAccess.getRequirementsAccess().getGroup_1()); 
            // InternalXdstm.g:3770:2: ( rule__Requirements__Group_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalXdstm.g:3770:3: rule__Requirements__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Requirements__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRequirementsAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirements__Group__1__Impl"


    // $ANTLR start "rule__Requirements__Group_1__0"
    // InternalXdstm.g:3779:1: rule__Requirements__Group_1__0 : rule__Requirements__Group_1__0__Impl rule__Requirements__Group_1__1 ;
    public final void rule__Requirements__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3783:1: ( rule__Requirements__Group_1__0__Impl rule__Requirements__Group_1__1 )
            // InternalXdstm.g:3784:2: rule__Requirements__Group_1__0__Impl rule__Requirements__Group_1__1
            {
            pushFollow(FOLLOW_35);
            rule__Requirements__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Requirements__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirements__Group_1__0"


    // $ANTLR start "rule__Requirements__Group_1__0__Impl"
    // InternalXdstm.g:3791:1: rule__Requirements__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Requirements__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3795:1: ( ( '(' ) )
            // InternalXdstm.g:3796:1: ( '(' )
            {
            // InternalXdstm.g:3796:1: ( '(' )
            // InternalXdstm.g:3797:2: '('
            {
             before(grammarAccess.getRequirementsAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRequirementsAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirements__Group_1__0__Impl"


    // $ANTLR start "rule__Requirements__Group_1__1"
    // InternalXdstm.g:3806:1: rule__Requirements__Group_1__1 : rule__Requirements__Group_1__1__Impl rule__Requirements__Group_1__2 ;
    public final void rule__Requirements__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3810:1: ( rule__Requirements__Group_1__1__Impl rule__Requirements__Group_1__2 )
            // InternalXdstm.g:3811:2: rule__Requirements__Group_1__1__Impl rule__Requirements__Group_1__2
            {
            pushFollow(FOLLOW_11);
            rule__Requirements__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Requirements__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirements__Group_1__1"


    // $ANTLR start "rule__Requirements__Group_1__1__Impl"
    // InternalXdstm.g:3818:1: rule__Requirements__Group_1__1__Impl : ( 'requirements' ) ;
    public final void rule__Requirements__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3822:1: ( ( 'requirements' ) )
            // InternalXdstm.g:3823:1: ( 'requirements' )
            {
            // InternalXdstm.g:3823:1: ( 'requirements' )
            // InternalXdstm.g:3824:2: 'requirements'
            {
             before(grammarAccess.getRequirementsAccess().getRequirementsKeyword_1_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getRequirementsAccess().getRequirementsKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirements__Group_1__1__Impl"


    // $ANTLR start "rule__Requirements__Group_1__2"
    // InternalXdstm.g:3833:1: rule__Requirements__Group_1__2 : rule__Requirements__Group_1__2__Impl rule__Requirements__Group_1__3 ;
    public final void rule__Requirements__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3837:1: ( rule__Requirements__Group_1__2__Impl rule__Requirements__Group_1__3 )
            // InternalXdstm.g:3838:2: rule__Requirements__Group_1__2__Impl rule__Requirements__Group_1__3
            {
            pushFollow(FOLLOW_6);
            rule__Requirements__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Requirements__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirements__Group_1__2"


    // $ANTLR start "rule__Requirements__Group_1__2__Impl"
    // InternalXdstm.g:3845:1: rule__Requirements__Group_1__2__Impl : ( '=' ) ;
    public final void rule__Requirements__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3849:1: ( ( '=' ) )
            // InternalXdstm.g:3850:1: ( '=' )
            {
            // InternalXdstm.g:3850:1: ( '=' )
            // InternalXdstm.g:3851:2: '='
            {
             before(grammarAccess.getRequirementsAccess().getEqualsSignKeyword_1_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRequirementsAccess().getEqualsSignKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirements__Group_1__2__Impl"


    // $ANTLR start "rule__Requirements__Group_1__3"
    // InternalXdstm.g:3860:1: rule__Requirements__Group_1__3 : rule__Requirements__Group_1__3__Impl rule__Requirements__Group_1__4 ;
    public final void rule__Requirements__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3864:1: ( rule__Requirements__Group_1__3__Impl rule__Requirements__Group_1__4 )
            // InternalXdstm.g:3865:2: rule__Requirements__Group_1__3__Impl rule__Requirements__Group_1__4
            {
            pushFollow(FOLLOW_23);
            rule__Requirements__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Requirements__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirements__Group_1__3"


    // $ANTLR start "rule__Requirements__Group_1__3__Impl"
    // InternalXdstm.g:3872:1: rule__Requirements__Group_1__3__Impl : ( ( rule__Requirements__RequirementsAssignment_1_3 ) ) ;
    public final void rule__Requirements__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3876:1: ( ( ( rule__Requirements__RequirementsAssignment_1_3 ) ) )
            // InternalXdstm.g:3877:1: ( ( rule__Requirements__RequirementsAssignment_1_3 ) )
            {
            // InternalXdstm.g:3877:1: ( ( rule__Requirements__RequirementsAssignment_1_3 ) )
            // InternalXdstm.g:3878:2: ( rule__Requirements__RequirementsAssignment_1_3 )
            {
             before(grammarAccess.getRequirementsAccess().getRequirementsAssignment_1_3()); 
            // InternalXdstm.g:3879:2: ( rule__Requirements__RequirementsAssignment_1_3 )
            // InternalXdstm.g:3879:3: rule__Requirements__RequirementsAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__Requirements__RequirementsAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getRequirementsAccess().getRequirementsAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirements__Group_1__3__Impl"


    // $ANTLR start "rule__Requirements__Group_1__4"
    // InternalXdstm.g:3887:1: rule__Requirements__Group_1__4 : rule__Requirements__Group_1__4__Impl rule__Requirements__Group_1__5 ;
    public final void rule__Requirements__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3891:1: ( rule__Requirements__Group_1__4__Impl rule__Requirements__Group_1__5 )
            // InternalXdstm.g:3892:2: rule__Requirements__Group_1__4__Impl rule__Requirements__Group_1__5
            {
            pushFollow(FOLLOW_23);
            rule__Requirements__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Requirements__Group_1__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirements__Group_1__4"


    // $ANTLR start "rule__Requirements__Group_1__4__Impl"
    // InternalXdstm.g:3899:1: rule__Requirements__Group_1__4__Impl : ( ( rule__Requirements__Group_1_4__0 )* ) ;
    public final void rule__Requirements__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3903:1: ( ( ( rule__Requirements__Group_1_4__0 )* ) )
            // InternalXdstm.g:3904:1: ( ( rule__Requirements__Group_1_4__0 )* )
            {
            // InternalXdstm.g:3904:1: ( ( rule__Requirements__Group_1_4__0 )* )
            // InternalXdstm.g:3905:2: ( rule__Requirements__Group_1_4__0 )*
            {
             before(grammarAccess.getRequirementsAccess().getGroup_1_4()); 
            // InternalXdstm.g:3906:2: ( rule__Requirements__Group_1_4__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==19) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalXdstm.g:3906:3: rule__Requirements__Group_1_4__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Requirements__Group_1_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getRequirementsAccess().getGroup_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirements__Group_1__4__Impl"


    // $ANTLR start "rule__Requirements__Group_1__5"
    // InternalXdstm.g:3914:1: rule__Requirements__Group_1__5 : rule__Requirements__Group_1__5__Impl ;
    public final void rule__Requirements__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3918:1: ( rule__Requirements__Group_1__5__Impl )
            // InternalXdstm.g:3919:2: rule__Requirements__Group_1__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Requirements__Group_1__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirements__Group_1__5"


    // $ANTLR start "rule__Requirements__Group_1__5__Impl"
    // InternalXdstm.g:3925:1: rule__Requirements__Group_1__5__Impl : ( ')' ) ;
    public final void rule__Requirements__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3929:1: ( ( ')' ) )
            // InternalXdstm.g:3930:1: ( ')' )
            {
            // InternalXdstm.g:3930:1: ( ')' )
            // InternalXdstm.g:3931:2: ')'
            {
             before(grammarAccess.getRequirementsAccess().getRightParenthesisKeyword_1_5()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRequirementsAccess().getRightParenthesisKeyword_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirements__Group_1__5__Impl"


    // $ANTLR start "rule__Requirements__Group_1_4__0"
    // InternalXdstm.g:3941:1: rule__Requirements__Group_1_4__0 : rule__Requirements__Group_1_4__0__Impl rule__Requirements__Group_1_4__1 ;
    public final void rule__Requirements__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3945:1: ( rule__Requirements__Group_1_4__0__Impl rule__Requirements__Group_1_4__1 )
            // InternalXdstm.g:3946:2: rule__Requirements__Group_1_4__0__Impl rule__Requirements__Group_1_4__1
            {
            pushFollow(FOLLOW_6);
            rule__Requirements__Group_1_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Requirements__Group_1_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirements__Group_1_4__0"


    // $ANTLR start "rule__Requirements__Group_1_4__0__Impl"
    // InternalXdstm.g:3953:1: rule__Requirements__Group_1_4__0__Impl : ( ',' ) ;
    public final void rule__Requirements__Group_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3957:1: ( ( ',' ) )
            // InternalXdstm.g:3958:1: ( ',' )
            {
            // InternalXdstm.g:3958:1: ( ',' )
            // InternalXdstm.g:3959:2: ','
            {
             before(grammarAccess.getRequirementsAccess().getCommaKeyword_1_4_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRequirementsAccess().getCommaKeyword_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirements__Group_1_4__0__Impl"


    // $ANTLR start "rule__Requirements__Group_1_4__1"
    // InternalXdstm.g:3968:1: rule__Requirements__Group_1_4__1 : rule__Requirements__Group_1_4__1__Impl ;
    public final void rule__Requirements__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3972:1: ( rule__Requirements__Group_1_4__1__Impl )
            // InternalXdstm.g:3973:2: rule__Requirements__Group_1_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Requirements__Group_1_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirements__Group_1_4__1"


    // $ANTLR start "rule__Requirements__Group_1_4__1__Impl"
    // InternalXdstm.g:3979:1: rule__Requirements__Group_1_4__1__Impl : ( ( rule__Requirements__RequirementsAssignment_1_4_1 ) ) ;
    public final void rule__Requirements__Group_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3983:1: ( ( ( rule__Requirements__RequirementsAssignment_1_4_1 ) ) )
            // InternalXdstm.g:3984:1: ( ( rule__Requirements__RequirementsAssignment_1_4_1 ) )
            {
            // InternalXdstm.g:3984:1: ( ( rule__Requirements__RequirementsAssignment_1_4_1 ) )
            // InternalXdstm.g:3985:2: ( rule__Requirements__RequirementsAssignment_1_4_1 )
            {
             before(grammarAccess.getRequirementsAccess().getRequirementsAssignment_1_4_1()); 
            // InternalXdstm.g:3986:2: ( rule__Requirements__RequirementsAssignment_1_4_1 )
            // InternalXdstm.g:3986:3: rule__Requirements__RequirementsAssignment_1_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Requirements__RequirementsAssignment_1_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRequirementsAccess().getRequirementsAssignment_1_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirements__Group_1_4__1__Impl"


    // $ANTLR start "rule__Model__IncludeAssignment_0"
    // InternalXdstm.g:3995:1: rule__Model__IncludeAssignment_0 : ( ruleinclude ) ;
    public final void rule__Model__IncludeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:3999:1: ( ( ruleinclude ) )
            // InternalXdstm.g:4000:2: ( ruleinclude )
            {
            // InternalXdstm.g:4000:2: ( ruleinclude )
            // InternalXdstm.g:4001:3: ruleinclude
            {
             before(grammarAccess.getModelAccess().getIncludeIncludeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleinclude();

            state._fsp--;

             after(grammarAccess.getModelAccess().getIncludeIncludeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__IncludeAssignment_0"


    // $ANTLR start "rule__Model__MachinesAssignment_1"
    // InternalXdstm.g:4010:1: rule__Model__MachinesAssignment_1 : ( ruleMachine ) ;
    public final void rule__Model__MachinesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:4014:1: ( ( ruleMachine ) )
            // InternalXdstm.g:4015:2: ( ruleMachine )
            {
            // InternalXdstm.g:4015:2: ( ruleMachine )
            // InternalXdstm.g:4016:3: ruleMachine
            {
             before(grammarAccess.getModelAccess().getMachinesMachineParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMachine();

            state._fsp--;

             after(grammarAccess.getModelAccess().getMachinesMachineParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__MachinesAssignment_1"


    // $ANTLR start "rule__Model__MachinesAssignment_2"
    // InternalXdstm.g:4025:1: rule__Model__MachinesAssignment_2 : ( ruleMachine ) ;
    public final void rule__Model__MachinesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:4029:1: ( ( ruleMachine ) )
            // InternalXdstm.g:4030:2: ( ruleMachine )
            {
            // InternalXdstm.g:4030:2: ( ruleMachine )
            // InternalXdstm.g:4031:3: ruleMachine
            {
             before(grammarAccess.getModelAccess().getMachinesMachineParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMachine();

            state._fsp--;

             after(grammarAccess.getModelAccess().getMachinesMachineParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__MachinesAssignment_2"


    // $ANTLR start "rule__Model__DstmAssignment_3"
    // InternalXdstm.g:4040:1: rule__Model__DstmAssignment_3 : ( ruleDSTM ) ;
    public final void rule__Model__DstmAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:4044:1: ( ( ruleDSTM ) )
            // InternalXdstm.g:4045:2: ( ruleDSTM )
            {
            // InternalXdstm.g:4045:2: ( ruleDSTM )
            // InternalXdstm.g:4046:3: ruleDSTM
            {
             before(grammarAccess.getModelAccess().getDstmDSTMParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDSTM();

            state._fsp--;

             after(grammarAccess.getModelAccess().getDstmDSTMParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__DstmAssignment_3"


    // $ANTLR start "rule__Include__ImportURIAssignment_1"
    // InternalXdstm.g:4055:1: rule__Include__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Include__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:4059:1: ( ( RULE_STRING ) )
            // InternalXdstm.g:4060:2: ( RULE_STRING )
            {
            // InternalXdstm.g:4060:2: ( RULE_STRING )
            // InternalXdstm.g:4061:3: RULE_STRING
            {
             before(grammarAccess.getIncludeAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getIncludeAccess().getImportURISTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__ImportURIAssignment_1"


    // $ANTLR start "rule__DSTM__NameAssignment_1"
    // InternalXdstm.g:4070:1: rule__DSTM__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DSTM__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:4074:1: ( ( RULE_ID ) )
            // InternalXdstm.g:4075:2: ( RULE_ID )
            {
            // InternalXdstm.g:4075:2: ( RULE_ID )
            // InternalXdstm.g:4076:3: RULE_ID
            {
             before(grammarAccess.getDSTMAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDSTMAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSTM__NameAssignment_1"


    // $ANTLR start "rule__DSTM__MachinesAssignment_5"
    // InternalXdstm.g:4085:1: rule__DSTM__MachinesAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__DSTM__MachinesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:4089:1: ( ( ( RULE_ID ) ) )
            // InternalXdstm.g:4090:2: ( ( RULE_ID ) )
            {
            // InternalXdstm.g:4090:2: ( ( RULE_ID ) )
            // InternalXdstm.g:4091:3: ( RULE_ID )
            {
             before(grammarAccess.getDSTMAccess().getMachinesMachineCrossReference_5_0()); 
            // InternalXdstm.g:4092:3: ( RULE_ID )
            // InternalXdstm.g:4093:4: RULE_ID
            {
             before(grammarAccess.getDSTMAccess().getMachinesMachineIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDSTMAccess().getMachinesMachineIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getDSTMAccess().getMachinesMachineCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSTM__MachinesAssignment_5"


    // $ANTLR start "rule__DSTM__MachinesAssignment_6_1"
    // InternalXdstm.g:4104:1: rule__DSTM__MachinesAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__DSTM__MachinesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:4108:1: ( ( ( RULE_ID ) ) )
            // InternalXdstm.g:4109:2: ( ( RULE_ID ) )
            {
            // InternalXdstm.g:4109:2: ( ( RULE_ID ) )
            // InternalXdstm.g:4110:3: ( RULE_ID )
            {
             before(grammarAccess.getDSTMAccess().getMachinesMachineCrossReference_6_1_0()); 
            // InternalXdstm.g:4111:3: ( RULE_ID )
            // InternalXdstm.g:4112:4: RULE_ID
            {
             before(grammarAccess.getDSTMAccess().getMachinesMachineIDTerminalRuleCall_6_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDSTMAccess().getMachinesMachineIDTerminalRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getDSTMAccess().getMachinesMachineCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSTM__MachinesAssignment_6_1"


    // $ANTLR start "rule__DSTM__MainAssignment_9"
    // InternalXdstm.g:4123:1: rule__DSTM__MainAssignment_9 : ( ( RULE_ID ) ) ;
    public final void rule__DSTM__MainAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:4127:1: ( ( ( RULE_ID ) ) )
            // InternalXdstm.g:4128:2: ( ( RULE_ID ) )
            {
            // InternalXdstm.g:4128:2: ( ( RULE_ID ) )
            // InternalXdstm.g:4129:3: ( RULE_ID )
            {
             before(grammarAccess.getDSTMAccess().getMainMachineCrossReference_9_0()); 
            // InternalXdstm.g:4130:3: ( RULE_ID )
            // InternalXdstm.g:4131:4: RULE_ID
            {
             before(grammarAccess.getDSTMAccess().getMainMachineIDTerminalRuleCall_9_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDSTMAccess().getMainMachineIDTerminalRuleCall_9_0_1()); 

            }

             after(grammarAccess.getDSTMAccess().getMainMachineCrossReference_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DSTM__MainAssignment_9"


    // $ANTLR start "rule__Machine__NameAssignment_1"
    // InternalXdstm.g:4142:1: rule__Machine__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Machine__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:4146:1: ( ( RULE_ID ) )
            // InternalXdstm.g:4147:2: ( RULE_ID )
            {
            // InternalXdstm.g:4147:2: ( RULE_ID )
            // InternalXdstm.g:4148:3: RULE_ID
            {
             before(grammarAccess.getMachineAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMachineAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__NameAssignment_1"


    // $ANTLR start "rule__Machine__VertexesAssignment_5"
    // InternalXdstm.g:4157:1: rule__Machine__VertexesAssignment_5 : ( ruleVertex ) ;
    public final void rule__Machine__VertexesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:4161:1: ( ( ruleVertex ) )
            // InternalXdstm.g:4162:2: ( ruleVertex )
            {
            // InternalXdstm.g:4162:2: ( ruleVertex )
            // InternalXdstm.g:4163:3: ruleVertex
            {
             before(grammarAccess.getMachineAccess().getVertexesVertexParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleVertex();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getVertexesVertexParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__VertexesAssignment_5"


    // $ANTLR start "rule__Machine__VertexesAssignment_6_1"
    // InternalXdstm.g:4172:1: rule__Machine__VertexesAssignment_6_1 : ( ruleVertex ) ;
    public final void rule__Machine__VertexesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:4176:1: ( ( ruleVertex ) )
            // InternalXdstm.g:4177:2: ( ruleVertex )
            {
            // InternalXdstm.g:4177:2: ( ruleVertex )
            // InternalXdstm.g:4178:3: ruleVertex
            {
             before(grammarAccess.getMachineAccess().getVertexesVertexParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVertex();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getVertexesVertexParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__VertexesAssignment_6_1"


    // $ANTLR start "rule__Machine__TransitionsAssignment_10"
    // InternalXdstm.g:4187:1: rule__Machine__TransitionsAssignment_10 : ( ruleTransition ) ;
    public final void rule__Machine__TransitionsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:4191:1: ( ( ruleTransition ) )
            // InternalXdstm.g:4192:2: ( ruleTransition )
            {
            // InternalXdstm.g:4192:2: ( ruleTransition )
            // InternalXdstm.g:4193:3: ruleTransition
            {
             before(grammarAccess.getMachineAccess().getTransitionsTransitionParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getTransitionsTransitionParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__TransitionsAssignment_10"


    // $ANTLR start "rule__Machine__TransitionsAssignment_11_1"
    // InternalXdstm.g:4202:1: rule__Machine__TransitionsAssignment_11_1 : ( ruleTransition ) ;
    public final void rule__Machine__TransitionsAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:4206:1: ( ( ruleTransition ) )
            // InternalXdstm.g:4207:2: ( ruleTransition )
            {
            // InternalXdstm.g:4207:2: ( ruleTransition )
            // InternalXdstm.g:4208:3: ruleTransition
            {
             before(grammarAccess.getMachineAccess().getTransitionsTransitionParserRuleCall_11_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getTransitionsTransitionParserRuleCall_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__TransitionsAssignment_11_1"


    // $ANTLR start "rule__Node__NameAssignment_1"
    // InternalXdstm.g:4217:1: rule__Node__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Node__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:4221:1: ( ( RULE_ID ) )
            // InternalXdstm.g:4222:2: ( RULE_ID )
            {
            // InternalXdstm.g:4222:2: ( RULE_ID )
            // InternalXdstm.g:4223:3: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__NameAssignment_1"


    // $ANTLR start "rule__Node__RequirementsAssignment_2"
    // InternalXdstm.g:4232:1: rule__Node__RequirementsAssignment_2 : ( ruleRequirements ) ;
    public final void rule__Node__RequirementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:4236:1: ( ( ruleRequirements ) )
            // InternalXdstm.g:4237:2: ( ruleRequirements )
            {
            // InternalXdstm.g:4237:2: ( ruleRequirements )
            // InternalXdstm.g:4238:3: ruleRequirements
            {
             before(grammarAccess.getNodeAccess().getRequirementsRequirementsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRequirements();

            state._fsp--;

             after(grammarAccess.getNodeAccess().getRequirementsRequirementsParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__RequirementsAssignment_2"


    // $ANTLR start "rule__Box__NameAssignment_1"
    // InternalXdstm.g:4247:1: rule__Box__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Box__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:4251:1: ( ( RULE_ID ) )
            // InternalXdstm.g:4252:2: ( RULE_ID )
            {
            // InternalXdstm.g:4252:2: ( RULE_ID )
            // InternalXdstm.g:4253:3: RULE_ID
            {
             before(grammarAccess.getBoxAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__NameAssignment_1"


    // $ANTLR start "rule__Box__RequirementsAssignment_2"
    // InternalXdstm.g:4262:1: rule__Box__RequirementsAssignment_2 : ( ruleRequirements ) ;
    public final void rule__Box__RequirementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:4266:1: ( ( ruleRequirements ) )
            // InternalXdstm.g:4267:2: ( ruleRequirements )
            {
            // InternalXdstm.g:4267:2: ( ruleRequirements )
            // InternalXdstm.g:4268:3: ruleRequirements
            {
             before(grammarAccess.getBoxAccess().getRequirementsRequirementsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRequirements();

            state._fsp--;

             after(grammarAccess.getBoxAccess().getRequirementsRequirementsParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__RequirementsAssignment_2"


    // $ANTLR start "rule__Box__InstantiationAssignment_6"
    // InternalXdstm.g:4277:1: rule__Box__InstantiationAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Box__InstantiationAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:4281:1: ( ( ( RULE_ID ) ) )
            // InternalXdstm.g:4282:2: ( ( RULE_ID ) )
            {
            // InternalXdstm.g:4282:2: ( ( RULE_ID ) )
            // InternalXdstm.g:4283:3: ( RULE_ID )
            {
             before(grammarAccess.getBoxAccess().getInstantiationMachineCrossReference_6_0()); 
            // InternalXdstm.g:4284:3: ( RULE_ID )
            // InternalXdstm.g:4285:4: RULE_ID
            {
             before(grammarAccess.getBoxAccess().getInstantiationMachineIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getInstantiationMachineIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getBoxAccess().getInstantiationMachineCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__InstantiationAssignment_6"


    // $ANTLR start "rule__Box__InstantiationAssignment_7_1"
    // InternalXdstm.g:4296:1: rule__Box__InstantiationAssignment_7_1 : ( ( RULE_ID ) ) ;
    public final void rule__Box__InstantiationAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:4300:1: ( ( ( RULE_ID ) ) )
            // InternalXdstm.g:4301:2: ( ( RULE_ID ) )
            {
            // InternalXdstm.g:4301:2: ( ( RULE_ID ) )
            // InternalXdstm.g:4302:3: ( RULE_ID )
            {
             before(grammarAccess.getBoxAccess().getInstantiationMachineCrossReference_7_1_0()); 
            // InternalXdstm.g:4303:3: ( RULE_ID )
            // InternalXdstm.g:4304:4: RULE_ID
            {
             before(grammarAccess.getBoxAccess().getInstantiationMachineIDTerminalRuleCall_7_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getInstantiationMachineIDTerminalRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getBoxAccess().getInstantiationMachineCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__InstantiationAssignment_7_1"


    // $ANTLR start "rule__EnteringNode__NameAssignment_1"
    // InternalXdstm.g:4315:1: rule__EnteringNode__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnteringNode__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:4319:1: ( ( RULE_ID ) )
            // InternalXdstm.g:4320:2: ( RULE_ID )
            {
            // InternalXdstm.g:4320:2: ( RULE_ID )
            // InternalXdstm.g:4321:3: RULE_ID
            {
             before(grammarAccess.getEnteringNodeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEnteringNodeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnteringNode__NameAssignment_1"


    // $ANTLR start "rule__EnteringNode__RequirementsAssignment_2"
    // InternalXdstm.g:4330:1: rule__EnteringNode__RequirementsAssignment_2 : ( ruleRequirements ) ;
    public final void rule__EnteringNode__RequirementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:4334:1: ( ( ruleRequirements ) )
            // InternalXdstm.g:4335:2: ( ruleRequirements )
            {
            // InternalXdstm.g:4335:2: ( ruleRequirements )
            // InternalXdstm.g:4336:3: ruleRequirements
            {
             before(grammarAccess.getEnteringNodeAccess().getRequirementsRequirementsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRequirements();

            state._fsp--;

             after(grammarAccess.getEnteringNodeAccess().getRequirementsRequirementsParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnteringNode__RequirementsAssignment_2"


    // $ANTLR start "rule__InitialNode__NameAssignment_1"
    // InternalXdstm.g:4345:1: rule__InitialNode__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InitialNode__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:4349:1: ( ( RULE_ID ) )
            // InternalXdstm.g:4350:2: ( RULE_ID )
            {
            // InternalXdstm.g:4350:2: ( RULE_ID )
            // InternalXdstm.g:4351:3: RULE_ID
            {
             before(grammarAccess.getInitialNodeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInitialNodeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialNode__NameAssignment_1"


    // $ANTLR start "rule__InitialNode__RequirementsAssignment_2"
    // InternalXdstm.g:4360:1: rule__InitialNode__RequirementsAssignment_2 : ( ruleRequirements ) ;
    public final void rule__InitialNode__RequirementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:4364:1: ( ( ruleRequirements ) )
            // InternalXdstm.g:4365:2: ( ruleRequirements )
            {
            // InternalXdstm.g:4365:2: ( ruleRequirements )
            // InternalXdstm.g:4366:3: ruleRequirements
            {
             before(grammarAccess.getInitialNodeAccess().getRequirementsRequirementsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRequirements();

            state._fsp--;

             after(grammarAccess.getInitialNodeAccess().getRequirementsRequirementsParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialNode__RequirementsAssignment_2"


    // $ANTLR start "rule__ExitingNode__NameAssignment_1"
    // InternalXdstm.g:4375:1: rule__ExitingNode__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ExitingNode__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:4379:1: ( ( RULE_ID ) )
            // InternalXdstm.g:4380:2: ( RULE_ID )
            {
            // InternalXdstm.g:4380:2: ( RULE_ID )
            // InternalXdstm.g:4381:3: RULE_ID
            {
             before(grammarAccess.getExitingNodeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExitingNodeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExitingNode__NameAssignment_1"


    // $ANTLR start "rule__ExitingNode__RequirementsAssignment_2"
    // InternalXdstm.g:4390:1: rule__ExitingNode__RequirementsAssignment_2 : ( ruleRequirements ) ;
    public final void rule__ExitingNode__RequirementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:4394:1: ( ( ruleRequirements ) )
            // InternalXdstm.g:4395:2: ( ruleRequirements )
            {
            // InternalXdstm.g:4395:2: ( ruleRequirements )
            // InternalXdstm.g:4396:3: ruleRequirements
            {
             before(grammarAccess.getExitingNodeAccess().getRequirementsRequirementsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRequirements();

            state._fsp--;

             after(grammarAccess.getExitingNodeAccess().getRequirementsRequirementsParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExitingNode__RequirementsAssignment_2"


    // $ANTLR start "rule__Fork__NameAssignment_1"
    // InternalXdstm.g:4405:1: rule__Fork__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Fork__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:4409:1: ( ( RULE_ID ) )
            // InternalXdstm.g:4410:2: ( RULE_ID )
            {
            // InternalXdstm.g:4410:2: ( RULE_ID )
            // InternalXdstm.g:4411:3: RULE_ID
            {
             before(grammarAccess.getForkAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForkAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fork__NameAssignment_1"


    // $ANTLR start "rule__Fork__RequirementsAssignment_2"
    // InternalXdstm.g:4420:1: rule__Fork__RequirementsAssignment_2 : ( ruleRequirements ) ;
    public final void rule__Fork__RequirementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:4424:1: ( ( ruleRequirements ) )
            // InternalXdstm.g:4425:2: ( ruleRequirements )
            {
            // InternalXdstm.g:4425:2: ( ruleRequirements )
            // InternalXdstm.g:4426:3: ruleRequirements
            {
             before(grammarAccess.getForkAccess().getRequirementsRequirementsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRequirements();

            state._fsp--;

             after(grammarAccess.getForkAccess().getRequirementsRequirementsParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fork__RequirementsAssignment_2"


    // $ANTLR start "rule__Join__NameAssignment_1"
    // InternalXdstm.g:4435:1: rule__Join__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Join__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:4439:1: ( ( RULE_ID ) )
            // InternalXdstm.g:4440:2: ( RULE_ID )
            {
            // InternalXdstm.g:4440:2: ( RULE_ID )
            // InternalXdstm.g:4441:3: RULE_ID
            {
             before(grammarAccess.getJoinAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJoinAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Join__NameAssignment_1"


    // $ANTLR start "rule__Join__RequirementsAssignment_2"
    // InternalXdstm.g:4450:1: rule__Join__RequirementsAssignment_2 : ( ruleRequirements ) ;
    public final void rule__Join__RequirementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:4454:1: ( ( ruleRequirements ) )
            // InternalXdstm.g:4455:2: ( ruleRequirements )
            {
            // InternalXdstm.g:4455:2: ( ruleRequirements )
            // InternalXdstm.g:4456:3: ruleRequirements
            {
             before(grammarAccess.getJoinAccess().getRequirementsRequirementsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRequirements();

            state._fsp--;

             after(grammarAccess.getJoinAccess().getRequirementsRequirementsParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Join__RequirementsAssignment_2"


    // $ANTLR start "rule__Transition__NameAssignment_1"
    // InternalXdstm.g:4465:1: rule__Transition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Transition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:4469:1: ( ( RULE_ID ) )
            // InternalXdstm.g:4470:2: ( RULE_ID )
            {
            // InternalXdstm.g:4470:2: ( RULE_ID )
            // InternalXdstm.g:4471:3: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__NameAssignment_1"


    // $ANTLR start "rule__Transition__RequirementsAssignment_2"
    // InternalXdstm.g:4480:1: rule__Transition__RequirementsAssignment_2 : ( ruleRequirements ) ;
    public final void rule__Transition__RequirementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:4484:1: ( ( ruleRequirements ) )
            // InternalXdstm.g:4485:2: ( ruleRequirements )
            {
            // InternalXdstm.g:4485:2: ( ruleRequirements )
            // InternalXdstm.g:4486:3: ruleRequirements
            {
             before(grammarAccess.getTransitionAccess().getRequirementsRequirementsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRequirements();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getRequirementsRequirementsParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__RequirementsAssignment_2"


    // $ANTLR start "rule__Transition__SourceAssignment_5"
    // InternalXdstm.g:4495:1: rule__Transition__SourceAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__SourceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:4499:1: ( ( ( RULE_ID ) ) )
            // InternalXdstm.g:4500:2: ( ( RULE_ID ) )
            {
            // InternalXdstm.g:4500:2: ( ( RULE_ID ) )
            // InternalXdstm.g:4501:3: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getSourceSourceCrossReference_5_0()); 
            // InternalXdstm.g:4502:3: ( RULE_ID )
            // InternalXdstm.g:4503:4: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getSourceSourceIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getSourceSourceIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getSourceSourceCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__SourceAssignment_5"


    // $ANTLR start "rule__Transition__Exiting_nodeAssignment_6_2"
    // InternalXdstm.g:4514:1: rule__Transition__Exiting_nodeAssignment_6_2 : ( ( ruleEString ) ) ;
    public final void rule__Transition__Exiting_nodeAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:4518:1: ( ( ( ruleEString ) ) )
            // InternalXdstm.g:4519:2: ( ( ruleEString ) )
            {
            // InternalXdstm.g:4519:2: ( ( ruleEString ) )
            // InternalXdstm.g:4520:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getExiting_nodeExitingNodeCrossReference_6_2_0()); 
            // InternalXdstm.g:4521:3: ( ruleEString )
            // InternalXdstm.g:4522:4: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getExiting_nodeExitingNodeEStringParserRuleCall_6_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getExiting_nodeExitingNodeEStringParserRuleCall_6_2_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getExiting_nodeExitingNodeCrossReference_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Exiting_nodeAssignment_6_2"


    // $ANTLR start "rule__Transition__DestinationAssignment_9"
    // InternalXdstm.g:4533:1: rule__Transition__DestinationAssignment_9 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__DestinationAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:4537:1: ( ( ( RULE_ID ) ) )
            // InternalXdstm.g:4538:2: ( ( RULE_ID ) )
            {
            // InternalXdstm.g:4538:2: ( ( RULE_ID ) )
            // InternalXdstm.g:4539:3: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getDestinationDestinationCrossReference_9_0()); 
            // InternalXdstm.g:4540:3: ( RULE_ID )
            // InternalXdstm.g:4541:4: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getDestinationDestinationIDTerminalRuleCall_9_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getDestinationDestinationIDTerminalRuleCall_9_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getDestinationDestinationCrossReference_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__DestinationAssignment_9"


    // $ANTLR start "rule__Transition__Entering_nodeAssignment_10_2"
    // InternalXdstm.g:4552:1: rule__Transition__Entering_nodeAssignment_10_2 : ( ( ruleEString ) ) ;
    public final void rule__Transition__Entering_nodeAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:4556:1: ( ( ( ruleEString ) ) )
            // InternalXdstm.g:4557:2: ( ( ruleEString ) )
            {
            // InternalXdstm.g:4557:2: ( ( ruleEString ) )
            // InternalXdstm.g:4558:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getEntering_nodeEnteringNodeAbsCrossReference_10_2_0()); 
            // InternalXdstm.g:4559:3: ( ruleEString )
            // InternalXdstm.g:4560:4: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getEntering_nodeEnteringNodeAbsEStringParserRuleCall_10_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getEntering_nodeEnteringNodeAbsEStringParserRuleCall_10_2_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getEntering_nodeEnteringNodeAbsCrossReference_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Entering_nodeAssignment_10_2"


    // $ANTLR start "rule__Transition__Is_preemptiveAssignment_11_1"
    // InternalXdstm.g:4571:1: rule__Transition__Is_preemptiveAssignment_11_1 : ( ( 'isPreemptive' ) ) ;
    public final void rule__Transition__Is_preemptiveAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:4575:1: ( ( ( 'isPreemptive' ) ) )
            // InternalXdstm.g:4576:2: ( ( 'isPreemptive' ) )
            {
            // InternalXdstm.g:4576:2: ( ( 'isPreemptive' ) )
            // InternalXdstm.g:4577:3: ( 'isPreemptive' )
            {
             before(grammarAccess.getTransitionAccess().getIs_preemptiveIsPreemptiveKeyword_11_1_0()); 
            // InternalXdstm.g:4578:3: ( 'isPreemptive' )
            // InternalXdstm.g:4579:4: 'isPreemptive'
            {
             before(grammarAccess.getTransitionAccess().getIs_preemptiveIsPreemptiveKeyword_11_1_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getIs_preemptiveIsPreemptiveKeyword_11_1_0()); 

            }

             after(grammarAccess.getTransitionAccess().getIs_preemptiveIsPreemptiveKeyword_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Is_preemptiveAssignment_11_1"


    // $ANTLR start "rule__Transition__TriggerAssignment_12_2"
    // InternalXdstm.g:4590:1: rule__Transition__TriggerAssignment_12_2 : ( RULE_STRING ) ;
    public final void rule__Transition__TriggerAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:4594:1: ( ( RULE_STRING ) )
            // InternalXdstm.g:4595:2: ( RULE_STRING )
            {
            // InternalXdstm.g:4595:2: ( RULE_STRING )
            // InternalXdstm.g:4596:3: RULE_STRING
            {
             before(grammarAccess.getTransitionAccess().getTriggerSTRINGTerminalRuleCall_12_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getTriggerSTRINGTerminalRuleCall_12_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__TriggerAssignment_12_2"


    // $ANTLR start "rule__Transition__ConditionAssignment_13_2"
    // InternalXdstm.g:4605:1: rule__Transition__ConditionAssignment_13_2 : ( RULE_STRING ) ;
    public final void rule__Transition__ConditionAssignment_13_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:4609:1: ( ( RULE_STRING ) )
            // InternalXdstm.g:4610:2: ( RULE_STRING )
            {
            // InternalXdstm.g:4610:2: ( RULE_STRING )
            // InternalXdstm.g:4611:3: RULE_STRING
            {
             before(grammarAccess.getTransitionAccess().getConditionSTRINGTerminalRuleCall_13_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getConditionSTRINGTerminalRuleCall_13_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__ConditionAssignment_13_2"


    // $ANTLR start "rule__Transition__ActionsAssignment_14_3"
    // InternalXdstm.g:4620:1: rule__Transition__ActionsAssignment_14_3 : ( RULE_STRING ) ;
    public final void rule__Transition__ActionsAssignment_14_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:4624:1: ( ( RULE_STRING ) )
            // InternalXdstm.g:4625:2: ( RULE_STRING )
            {
            // InternalXdstm.g:4625:2: ( RULE_STRING )
            // InternalXdstm.g:4626:3: RULE_STRING
            {
             before(grammarAccess.getTransitionAccess().getActionsSTRINGTerminalRuleCall_14_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getActionsSTRINGTerminalRuleCall_14_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__ActionsAssignment_14_3"


    // $ANTLR start "rule__Transition__ActionsAssignment_14_4_1"
    // InternalXdstm.g:4635:1: rule__Transition__ActionsAssignment_14_4_1 : ( RULE_STRING ) ;
    public final void rule__Transition__ActionsAssignment_14_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:4639:1: ( ( RULE_STRING ) )
            // InternalXdstm.g:4640:2: ( RULE_STRING )
            {
            // InternalXdstm.g:4640:2: ( RULE_STRING )
            // InternalXdstm.g:4641:3: RULE_STRING
            {
             before(grammarAccess.getTransitionAccess().getActionsSTRINGTerminalRuleCall_14_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getActionsSTRINGTerminalRuleCall_14_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__ActionsAssignment_14_4_1"


    // $ANTLR start "rule__Transition__Par_instantiationAssignment_15_3"
    // InternalXdstm.g:4650:1: rule__Transition__Par_instantiationAssignment_15_3 : ( RULE_STRING ) ;
    public final void rule__Transition__Par_instantiationAssignment_15_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:4654:1: ( ( RULE_STRING ) )
            // InternalXdstm.g:4655:2: ( RULE_STRING )
            {
            // InternalXdstm.g:4655:2: ( RULE_STRING )
            // InternalXdstm.g:4656:3: RULE_STRING
            {
             before(grammarAccess.getTransitionAccess().getPar_instantiationSTRINGTerminalRuleCall_15_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getPar_instantiationSTRINGTerminalRuleCall_15_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Par_instantiationAssignment_15_3"


    // $ANTLR start "rule__Transition__Par_instantiationAssignment_15_4_1"
    // InternalXdstm.g:4665:1: rule__Transition__Par_instantiationAssignment_15_4_1 : ( RULE_STRING ) ;
    public final void rule__Transition__Par_instantiationAssignment_15_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:4669:1: ( ( RULE_STRING ) )
            // InternalXdstm.g:4670:2: ( RULE_STRING )
            {
            // InternalXdstm.g:4670:2: ( RULE_STRING )
            // InternalXdstm.g:4671:3: RULE_STRING
            {
             before(grammarAccess.getTransitionAccess().getPar_instantiationSTRINGTerminalRuleCall_15_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getPar_instantiationSTRINGTerminalRuleCall_15_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Par_instantiationAssignment_15_4_1"


    // $ANTLR start "rule__Requirements__RequirementsAssignment_1_3"
    // InternalXdstm.g:4680:1: rule__Requirements__RequirementsAssignment_1_3 : ( RULE_STRING ) ;
    public final void rule__Requirements__RequirementsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:4684:1: ( ( RULE_STRING ) )
            // InternalXdstm.g:4685:2: ( RULE_STRING )
            {
            // InternalXdstm.g:4685:2: ( RULE_STRING )
            // InternalXdstm.g:4686:3: RULE_STRING
            {
             before(grammarAccess.getRequirementsAccess().getRequirementsSTRINGTerminalRuleCall_1_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRequirementsAccess().getRequirementsSTRINGTerminalRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirements__RequirementsAssignment_1_3"


    // $ANTLR start "rule__Requirements__RequirementsAssignment_1_4_1"
    // InternalXdstm.g:4695:1: rule__Requirements__RequirementsAssignment_1_4_1 : ( RULE_STRING ) ;
    public final void rule__Requirements__RequirementsAssignment_1_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstm.g:4699:1: ( ( RULE_STRING ) )
            // InternalXdstm.g:4700:2: ( RULE_STRING )
            {
            // InternalXdstm.g:4700:2: ( RULE_STRING )
            // InternalXdstm.g:4701:3: RULE_STRING
            {
             before(grammarAccess.getRequirementsAccess().getRequirementsSTRINGTerminalRuleCall_1_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRequirementsAccess().getRequirementsSTRINGTerminalRuleCall_1_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirements__RequirementsAssignment_1_4_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000081000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000001F1800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008080000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000040000000000L});

}