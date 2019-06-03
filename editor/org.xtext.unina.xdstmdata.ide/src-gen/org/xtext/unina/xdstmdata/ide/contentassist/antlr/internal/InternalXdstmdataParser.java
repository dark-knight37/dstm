package org.xtext.unina.xdstmdata.ide.contentassist.antlr.internal;

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
import org.xtext.unina.xdstmdata.services.XdstmdataGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXdstmdataParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Chn[Int]'", "'Chn[Bool]'", "'Enum'", "'{'", "'}'", "';'", "','", "'Struct'", "'Chn['", "']'", "'Mtype'", "'Chn'", "'internal'", "'['", "'of'", "'external'", "'Int'", "'Bool'"
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

    	public void setGrammarAccess(XdstmdataGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuletTypes"
    // InternalXdstmdata.g:53:1: entryRuletTypes : ruletTypes EOF ;
    public final void entryRuletTypes() throws RecognitionException {
        try {
            // InternalXdstmdata.g:54:1: ( ruletTypes EOF )
            // InternalXdstmdata.g:55:1: ruletTypes EOF
            {
             before(grammarAccess.getTTypesRule()); 
            pushFollow(FOLLOW_1);
            ruletTypes();

            state._fsp--;

             after(grammarAccess.getTTypesRule()); 
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
    // $ANTLR end "entryRuletTypes"


    // $ANTLR start "ruletTypes"
    // InternalXdstmdata.g:62:1: ruletTypes : ( ( rule__TTypes__Group__0 ) ) ;
    public final void ruletTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:66:2: ( ( ( rule__TTypes__Group__0 ) ) )
            // InternalXdstmdata.g:67:2: ( ( rule__TTypes__Group__0 ) )
            {
            // InternalXdstmdata.g:67:2: ( ( rule__TTypes__Group__0 ) )
            // InternalXdstmdata.g:68:3: ( rule__TTypes__Group__0 )
            {
             before(grammarAccess.getTTypesAccess().getGroup()); 
            // InternalXdstmdata.g:69:3: ( rule__TTypes__Group__0 )
            // InternalXdstmdata.g:69:4: rule__TTypes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TTypes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTTypesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruletTypes"


    // $ANTLR start "entryRuletEnum"
    // InternalXdstmdata.g:78:1: entryRuletEnum : ruletEnum EOF ;
    public final void entryRuletEnum() throws RecognitionException {
        try {
            // InternalXdstmdata.g:79:1: ( ruletEnum EOF )
            // InternalXdstmdata.g:80:1: ruletEnum EOF
            {
             before(grammarAccess.getTEnumRule()); 
            pushFollow(FOLLOW_1);
            ruletEnum();

            state._fsp--;

             after(grammarAccess.getTEnumRule()); 
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
    // $ANTLR end "entryRuletEnum"


    // $ANTLR start "ruletEnum"
    // InternalXdstmdata.g:87:1: ruletEnum : ( ( rule__TEnum__Group__0 ) ) ;
    public final void ruletEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:91:2: ( ( ( rule__TEnum__Group__0 ) ) )
            // InternalXdstmdata.g:92:2: ( ( rule__TEnum__Group__0 ) )
            {
            // InternalXdstmdata.g:92:2: ( ( rule__TEnum__Group__0 ) )
            // InternalXdstmdata.g:93:3: ( rule__TEnum__Group__0 )
            {
             before(grammarAccess.getTEnumAccess().getGroup()); 
            // InternalXdstmdata.g:94:3: ( rule__TEnum__Group__0 )
            // InternalXdstmdata.g:94:4: rule__TEnum__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TEnum__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTEnumAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruletEnum"


    // $ANTLR start "entryRuletCompound"
    // InternalXdstmdata.g:103:1: entryRuletCompound : ruletCompound EOF ;
    public final void entryRuletCompound() throws RecognitionException {
        try {
            // InternalXdstmdata.g:104:1: ( ruletCompound EOF )
            // InternalXdstmdata.g:105:1: ruletCompound EOF
            {
             before(grammarAccess.getTCompoundRule()); 
            pushFollow(FOLLOW_1);
            ruletCompound();

            state._fsp--;

             after(grammarAccess.getTCompoundRule()); 
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
    // $ANTLR end "entryRuletCompound"


    // $ANTLR start "ruletCompound"
    // InternalXdstmdata.g:112:1: ruletCompound : ( ( rule__TCompound__Group__0 ) ) ;
    public final void ruletCompound() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:116:2: ( ( ( rule__TCompound__Group__0 ) ) )
            // InternalXdstmdata.g:117:2: ( ( rule__TCompound__Group__0 ) )
            {
            // InternalXdstmdata.g:117:2: ( ( rule__TCompound__Group__0 ) )
            // InternalXdstmdata.g:118:3: ( rule__TCompound__Group__0 )
            {
             before(grammarAccess.getTCompoundAccess().getGroup()); 
            // InternalXdstmdata.g:119:3: ( rule__TCompound__Group__0 )
            // InternalXdstmdata.g:119:4: rule__TCompound__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TCompound__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTCompoundAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruletCompound"


    // $ANTLR start "entryRulesubtype"
    // InternalXdstmdata.g:128:1: entryRulesubtype : rulesubtype EOF ;
    public final void entryRulesubtype() throws RecognitionException {
        try {
            // InternalXdstmdata.g:129:1: ( rulesubtype EOF )
            // InternalXdstmdata.g:130:1: rulesubtype EOF
            {
             before(grammarAccess.getSubtypeRule()); 
            pushFollow(FOLLOW_1);
            rulesubtype();

            state._fsp--;

             after(grammarAccess.getSubtypeRule()); 
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
    // $ANTLR end "entryRulesubtype"


    // $ANTLR start "rulesubtype"
    // InternalXdstmdata.g:137:1: rulesubtype : ( ( rule__Subtype__Alternatives ) ) ;
    public final void rulesubtype() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:141:2: ( ( ( rule__Subtype__Alternatives ) ) )
            // InternalXdstmdata.g:142:2: ( ( rule__Subtype__Alternatives ) )
            {
            // InternalXdstmdata.g:142:2: ( ( rule__Subtype__Alternatives ) )
            // InternalXdstmdata.g:143:3: ( rule__Subtype__Alternatives )
            {
             before(grammarAccess.getSubtypeAccess().getAlternatives()); 
            // InternalXdstmdata.g:144:3: ( rule__Subtype__Alternatives )
            // InternalXdstmdata.g:144:4: rule__Subtype__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Subtype__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSubtypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulesubtype"


    // $ANTLR start "entryRulechannel_specifier"
    // InternalXdstmdata.g:153:1: entryRulechannel_specifier : rulechannel_specifier EOF ;
    public final void entryRulechannel_specifier() throws RecognitionException {
        try {
            // InternalXdstmdata.g:154:1: ( rulechannel_specifier EOF )
            // InternalXdstmdata.g:155:1: rulechannel_specifier EOF
            {
             before(grammarAccess.getChannel_specifierRule()); 
            pushFollow(FOLLOW_1);
            rulechannel_specifier();

            state._fsp--;

             after(grammarAccess.getChannel_specifierRule()); 
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
    // $ANTLR end "entryRulechannel_specifier"


    // $ANTLR start "rulechannel_specifier"
    // InternalXdstmdata.g:162:1: rulechannel_specifier : ( ( rule__Channel_specifier__Alternatives ) ) ;
    public final void rulechannel_specifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:166:2: ( ( ( rule__Channel_specifier__Alternatives ) ) )
            // InternalXdstmdata.g:167:2: ( ( rule__Channel_specifier__Alternatives ) )
            {
            // InternalXdstmdata.g:167:2: ( ( rule__Channel_specifier__Alternatives ) )
            // InternalXdstmdata.g:168:3: ( rule__Channel_specifier__Alternatives )
            {
             before(grammarAccess.getChannel_specifierAccess().getAlternatives()); 
            // InternalXdstmdata.g:169:3: ( rule__Channel_specifier__Alternatives )
            // InternalXdstmdata.g:169:4: rule__Channel_specifier__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Channel_specifier__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getChannel_specifierAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulechannel_specifier"


    // $ANTLR start "entryRuletMultitype"
    // InternalXdstmdata.g:178:1: entryRuletMultitype : ruletMultitype EOF ;
    public final void entryRuletMultitype() throws RecognitionException {
        try {
            // InternalXdstmdata.g:179:1: ( ruletMultitype EOF )
            // InternalXdstmdata.g:180:1: ruletMultitype EOF
            {
             before(grammarAccess.getTMultitypeRule()); 
            pushFollow(FOLLOW_1);
            ruletMultitype();

            state._fsp--;

             after(grammarAccess.getTMultitypeRule()); 
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
    // $ANTLR end "entryRuletMultitype"


    // $ANTLR start "ruletMultitype"
    // InternalXdstmdata.g:187:1: ruletMultitype : ( ( rule__TMultitype__Group__0 ) ) ;
    public final void ruletMultitype() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:191:2: ( ( ( rule__TMultitype__Group__0 ) ) )
            // InternalXdstmdata.g:192:2: ( ( rule__TMultitype__Group__0 ) )
            {
            // InternalXdstmdata.g:192:2: ( ( rule__TMultitype__Group__0 ) )
            // InternalXdstmdata.g:193:3: ( rule__TMultitype__Group__0 )
            {
             before(grammarAccess.getTMultitypeAccess().getGroup()); 
            // InternalXdstmdata.g:194:3: ( rule__TMultitype__Group__0 )
            // InternalXdstmdata.g:194:4: rule__TMultitype__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TMultitype__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTMultitypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruletMultitype"


    // $ANTLR start "entryRulecomposingtype"
    // InternalXdstmdata.g:203:1: entryRulecomposingtype : rulecomposingtype EOF ;
    public final void entryRulecomposingtype() throws RecognitionException {
        try {
            // InternalXdstmdata.g:204:1: ( rulecomposingtype EOF )
            // InternalXdstmdata.g:205:1: rulecomposingtype EOF
            {
             before(grammarAccess.getComposingtypeRule()); 
            pushFollow(FOLLOW_1);
            rulecomposingtype();

            state._fsp--;

             after(grammarAccess.getComposingtypeRule()); 
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
    // $ANTLR end "entryRulecomposingtype"


    // $ANTLR start "rulecomposingtype"
    // InternalXdstmdata.g:212:1: rulecomposingtype : ( ( rule__Composingtype__Alternatives ) ) ;
    public final void rulecomposingtype() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:216:2: ( ( ( rule__Composingtype__Alternatives ) ) )
            // InternalXdstmdata.g:217:2: ( ( rule__Composingtype__Alternatives ) )
            {
            // InternalXdstmdata.g:217:2: ( ( rule__Composingtype__Alternatives ) )
            // InternalXdstmdata.g:218:3: ( rule__Composingtype__Alternatives )
            {
             before(grammarAccess.getComposingtypeAccess().getAlternatives()); 
            // InternalXdstmdata.g:219:3: ( rule__Composingtype__Alternatives )
            // InternalXdstmdata.g:219:4: rule__Composingtype__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Composingtype__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComposingtypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulecomposingtype"


    // $ANTLR start "entryRulecIntchannel"
    // InternalXdstmdata.g:228:1: entryRulecIntchannel : rulecIntchannel EOF ;
    public final void entryRulecIntchannel() throws RecognitionException {
        try {
            // InternalXdstmdata.g:229:1: ( rulecIntchannel EOF )
            // InternalXdstmdata.g:230:1: rulecIntchannel EOF
            {
             before(grammarAccess.getCIntchannelRule()); 
            pushFollow(FOLLOW_1);
            rulecIntchannel();

            state._fsp--;

             after(grammarAccess.getCIntchannelRule()); 
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
    // $ANTLR end "entryRulecIntchannel"


    // $ANTLR start "rulecIntchannel"
    // InternalXdstmdata.g:237:1: rulecIntchannel : ( ( rule__CIntchannel__Group__0 ) ) ;
    public final void rulecIntchannel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:241:2: ( ( ( rule__CIntchannel__Group__0 ) ) )
            // InternalXdstmdata.g:242:2: ( ( rule__CIntchannel__Group__0 ) )
            {
            // InternalXdstmdata.g:242:2: ( ( rule__CIntchannel__Group__0 ) )
            // InternalXdstmdata.g:243:3: ( rule__CIntchannel__Group__0 )
            {
             before(grammarAccess.getCIntchannelAccess().getGroup()); 
            // InternalXdstmdata.g:244:3: ( rule__CIntchannel__Group__0 )
            // InternalXdstmdata.g:244:4: rule__CIntchannel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CIntchannel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCIntchannelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulecIntchannel"


    // $ANTLR start "entryRulecExtchannel"
    // InternalXdstmdata.g:253:1: entryRulecExtchannel : rulecExtchannel EOF ;
    public final void entryRulecExtchannel() throws RecognitionException {
        try {
            // InternalXdstmdata.g:254:1: ( rulecExtchannel EOF )
            // InternalXdstmdata.g:255:1: rulecExtchannel EOF
            {
             before(grammarAccess.getCExtchannelRule()); 
            pushFollow(FOLLOW_1);
            rulecExtchannel();

            state._fsp--;

             after(grammarAccess.getCExtchannelRule()); 
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
    // $ANTLR end "entryRulecExtchannel"


    // $ANTLR start "rulecExtchannel"
    // InternalXdstmdata.g:262:1: rulecExtchannel : ( ( rule__CExtchannel__Group__0 ) ) ;
    public final void rulecExtchannel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:266:2: ( ( ( rule__CExtchannel__Group__0 ) ) )
            // InternalXdstmdata.g:267:2: ( ( rule__CExtchannel__Group__0 ) )
            {
            // InternalXdstmdata.g:267:2: ( ( rule__CExtchannel__Group__0 ) )
            // InternalXdstmdata.g:268:3: ( rule__CExtchannel__Group__0 )
            {
             before(grammarAccess.getCExtchannelAccess().getGroup()); 
            // InternalXdstmdata.g:269:3: ( rule__CExtchannel__Group__0 )
            // InternalXdstmdata.g:269:4: rule__CExtchannel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CExtchannel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCExtchannelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulecExtchannel"


    // $ANTLR start "entryRulevVariable"
    // InternalXdstmdata.g:278:1: entryRulevVariable : rulevVariable EOF ;
    public final void entryRulevVariable() throws RecognitionException {
        try {
            // InternalXdstmdata.g:279:1: ( rulevVariable EOF )
            // InternalXdstmdata.g:280:1: rulevVariable EOF
            {
             before(grammarAccess.getVVariableRule()); 
            pushFollow(FOLLOW_1);
            rulevVariable();

            state._fsp--;

             after(grammarAccess.getVVariableRule()); 
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
    // $ANTLR end "entryRulevVariable"


    // $ANTLR start "rulevVariable"
    // InternalXdstmdata.g:287:1: rulevVariable : ( ( rule__VVariable__Group__0 ) ) ;
    public final void rulevVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:291:2: ( ( ( rule__VVariable__Group__0 ) ) )
            // InternalXdstmdata.g:292:2: ( ( rule__VVariable__Group__0 ) )
            {
            // InternalXdstmdata.g:292:2: ( ( rule__VVariable__Group__0 ) )
            // InternalXdstmdata.g:293:3: ( rule__VVariable__Group__0 )
            {
             before(grammarAccess.getVVariableAccess().getGroup()); 
            // InternalXdstmdata.g:294:3: ( rule__VVariable__Group__0 )
            // InternalXdstmdata.g:294:4: rule__VVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulevVariable"


    // $ANTLR start "rule__TTypes__Alternatives_0"
    // InternalXdstmdata.g:302:1: rule__TTypes__Alternatives_0 : ( ( ( rule__TTypes__TEnumAssignment_0_0 ) ) | ( ( rule__TTypes__TCompoundAssignment_0_1 ) ) | ( ( rule__TTypes__TMultitypeAssignment_0_2 ) ) );
    public final void rule__TTypes__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:306:1: ( ( ( rule__TTypes__TEnumAssignment_0_0 ) ) | ( ( rule__TTypes__TCompoundAssignment_0_1 ) ) | ( ( rule__TTypes__TMultitypeAssignment_0_2 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt1=1;
                }
                break;
            case 18:
                {
                alt1=2;
                }
                break;
            case 21:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalXdstmdata.g:307:2: ( ( rule__TTypes__TEnumAssignment_0_0 ) )
                    {
                    // InternalXdstmdata.g:307:2: ( ( rule__TTypes__TEnumAssignment_0_0 ) )
                    // InternalXdstmdata.g:308:3: ( rule__TTypes__TEnumAssignment_0_0 )
                    {
                     before(grammarAccess.getTTypesAccess().getTEnumAssignment_0_0()); 
                    // InternalXdstmdata.g:309:3: ( rule__TTypes__TEnumAssignment_0_0 )
                    // InternalXdstmdata.g:309:4: rule__TTypes__TEnumAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TTypes__TEnumAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTTypesAccess().getTEnumAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXdstmdata.g:313:2: ( ( rule__TTypes__TCompoundAssignment_0_1 ) )
                    {
                    // InternalXdstmdata.g:313:2: ( ( rule__TTypes__TCompoundAssignment_0_1 ) )
                    // InternalXdstmdata.g:314:3: ( rule__TTypes__TCompoundAssignment_0_1 )
                    {
                     before(grammarAccess.getTTypesAccess().getTCompoundAssignment_0_1()); 
                    // InternalXdstmdata.g:315:3: ( rule__TTypes__TCompoundAssignment_0_1 )
                    // InternalXdstmdata.g:315:4: rule__TTypes__TCompoundAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__TTypes__TCompoundAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTTypesAccess().getTCompoundAssignment_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXdstmdata.g:319:2: ( ( rule__TTypes__TMultitypeAssignment_0_2 ) )
                    {
                    // InternalXdstmdata.g:319:2: ( ( rule__TTypes__TMultitypeAssignment_0_2 ) )
                    // InternalXdstmdata.g:320:3: ( rule__TTypes__TMultitypeAssignment_0_2 )
                    {
                     before(grammarAccess.getTTypesAccess().getTMultitypeAssignment_0_2()); 
                    // InternalXdstmdata.g:321:3: ( rule__TTypes__TMultitypeAssignment_0_2 )
                    // InternalXdstmdata.g:321:4: rule__TTypes__TMultitypeAssignment_0_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__TTypes__TMultitypeAssignment_0_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getTTypesAccess().getTMultitypeAssignment_0_2()); 

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
    // $ANTLR end "rule__TTypes__Alternatives_0"


    // $ANTLR start "rule__TTypes__Alternatives_1"
    // InternalXdstmdata.g:329:1: rule__TTypes__Alternatives_1 : ( ( ( rule__TTypes__CIntchannelAssignment_1_0 ) ) | ( ( rule__TTypes__CExtchannelAssignment_1_1 ) ) | ( ( rule__TTypes__VVariableAssignment_1_2 ) ) );
    public final void rule__TTypes__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:333:1: ( ( ( rule__TTypes__CIntchannelAssignment_1_0 ) ) | ( ( rule__TTypes__CExtchannelAssignment_1_1 ) ) | ( ( rule__TTypes__VVariableAssignment_1_2 ) ) )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==22) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==23) ) {
                    alt2=1;
                }
                else if ( (LA2_1==26) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==RULE_ID||(LA2_0>=11 && LA2_0<=12)||LA2_0==19||(LA2_0>=27 && LA2_0<=28)) ) {
                alt2=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalXdstmdata.g:334:2: ( ( rule__TTypes__CIntchannelAssignment_1_0 ) )
                    {
                    // InternalXdstmdata.g:334:2: ( ( rule__TTypes__CIntchannelAssignment_1_0 ) )
                    // InternalXdstmdata.g:335:3: ( rule__TTypes__CIntchannelAssignment_1_0 )
                    {
                     before(grammarAccess.getTTypesAccess().getCIntchannelAssignment_1_0()); 
                    // InternalXdstmdata.g:336:3: ( rule__TTypes__CIntchannelAssignment_1_0 )
                    // InternalXdstmdata.g:336:4: rule__TTypes__CIntchannelAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TTypes__CIntchannelAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTTypesAccess().getCIntchannelAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXdstmdata.g:340:2: ( ( rule__TTypes__CExtchannelAssignment_1_1 ) )
                    {
                    // InternalXdstmdata.g:340:2: ( ( rule__TTypes__CExtchannelAssignment_1_1 ) )
                    // InternalXdstmdata.g:341:3: ( rule__TTypes__CExtchannelAssignment_1_1 )
                    {
                     before(grammarAccess.getTTypesAccess().getCExtchannelAssignment_1_1()); 
                    // InternalXdstmdata.g:342:3: ( rule__TTypes__CExtchannelAssignment_1_1 )
                    // InternalXdstmdata.g:342:4: rule__TTypes__CExtchannelAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__TTypes__CExtchannelAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTTypesAccess().getCExtchannelAssignment_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXdstmdata.g:346:2: ( ( rule__TTypes__VVariableAssignment_1_2 ) )
                    {
                    // InternalXdstmdata.g:346:2: ( ( rule__TTypes__VVariableAssignment_1_2 ) )
                    // InternalXdstmdata.g:347:3: ( rule__TTypes__VVariableAssignment_1_2 )
                    {
                     before(grammarAccess.getTTypesAccess().getVVariableAssignment_1_2()); 
                    // InternalXdstmdata.g:348:3: ( rule__TTypes__VVariableAssignment_1_2 )
                    // InternalXdstmdata.g:348:4: rule__TTypes__VVariableAssignment_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__TTypes__VVariableAssignment_1_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getTTypesAccess().getVVariableAssignment_1_2()); 

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
    // $ANTLR end "rule__TTypes__Alternatives_1"


    // $ANTLR start "rule__Subtype__Alternatives"
    // InternalXdstmdata.g:356:1: rule__Subtype__Alternatives : ( ( ( rule__Subtype__TStringAssignment_0 ) ) | ( ( rule__Subtype__TStringAssignment_1 ) ) | ( ( rule__Subtype__TChnAssignment_2 ) ) | ( ( rule__Subtype__TIDAssignment_3 ) ) );
    public final void rule__Subtype__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:360:1: ( ( ( rule__Subtype__TStringAssignment_0 ) ) | ( ( rule__Subtype__TStringAssignment_1 ) ) | ( ( rule__Subtype__TChnAssignment_2 ) ) | ( ( rule__Subtype__TIDAssignment_3 ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt3=1;
                }
                break;
            case 28:
                {
                alt3=2;
                }
                break;
            case 11:
            case 12:
            case 19:
                {
                alt3=3;
                }
                break;
            case RULE_ID:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalXdstmdata.g:361:2: ( ( rule__Subtype__TStringAssignment_0 ) )
                    {
                    // InternalXdstmdata.g:361:2: ( ( rule__Subtype__TStringAssignment_0 ) )
                    // InternalXdstmdata.g:362:3: ( rule__Subtype__TStringAssignment_0 )
                    {
                     before(grammarAccess.getSubtypeAccess().getTStringAssignment_0()); 
                    // InternalXdstmdata.g:363:3: ( rule__Subtype__TStringAssignment_0 )
                    // InternalXdstmdata.g:363:4: rule__Subtype__TStringAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Subtype__TStringAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSubtypeAccess().getTStringAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXdstmdata.g:367:2: ( ( rule__Subtype__TStringAssignment_1 ) )
                    {
                    // InternalXdstmdata.g:367:2: ( ( rule__Subtype__TStringAssignment_1 ) )
                    // InternalXdstmdata.g:368:3: ( rule__Subtype__TStringAssignment_1 )
                    {
                     before(grammarAccess.getSubtypeAccess().getTStringAssignment_1()); 
                    // InternalXdstmdata.g:369:3: ( rule__Subtype__TStringAssignment_1 )
                    // InternalXdstmdata.g:369:4: rule__Subtype__TStringAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Subtype__TStringAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSubtypeAccess().getTStringAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXdstmdata.g:373:2: ( ( rule__Subtype__TChnAssignment_2 ) )
                    {
                    // InternalXdstmdata.g:373:2: ( ( rule__Subtype__TChnAssignment_2 ) )
                    // InternalXdstmdata.g:374:3: ( rule__Subtype__TChnAssignment_2 )
                    {
                     before(grammarAccess.getSubtypeAccess().getTChnAssignment_2()); 
                    // InternalXdstmdata.g:375:3: ( rule__Subtype__TChnAssignment_2 )
                    // InternalXdstmdata.g:375:4: rule__Subtype__TChnAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Subtype__TChnAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getSubtypeAccess().getTChnAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalXdstmdata.g:379:2: ( ( rule__Subtype__TIDAssignment_3 ) )
                    {
                    // InternalXdstmdata.g:379:2: ( ( rule__Subtype__TIDAssignment_3 ) )
                    // InternalXdstmdata.g:380:3: ( rule__Subtype__TIDAssignment_3 )
                    {
                     before(grammarAccess.getSubtypeAccess().getTIDAssignment_3()); 
                    // InternalXdstmdata.g:381:3: ( rule__Subtype__TIDAssignment_3 )
                    // InternalXdstmdata.g:381:4: rule__Subtype__TIDAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Subtype__TIDAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getSubtypeAccess().getTIDAssignment_3()); 

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
    // $ANTLR end "rule__Subtype__Alternatives"


    // $ANTLR start "rule__Channel_specifier__Alternatives"
    // InternalXdstmdata.g:389:1: rule__Channel_specifier__Alternatives : ( ( ( rule__Channel_specifier__Group_0__0 ) ) | ( 'Chn[Int]' ) | ( 'Chn[Bool]' ) );
    public final void rule__Channel_specifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:393:1: ( ( ( rule__Channel_specifier__Group_0__0 ) ) | ( 'Chn[Int]' ) | ( 'Chn[Bool]' ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt4=1;
                }
                break;
            case 11:
                {
                alt4=2;
                }
                break;
            case 12:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalXdstmdata.g:394:2: ( ( rule__Channel_specifier__Group_0__0 ) )
                    {
                    // InternalXdstmdata.g:394:2: ( ( rule__Channel_specifier__Group_0__0 ) )
                    // InternalXdstmdata.g:395:3: ( rule__Channel_specifier__Group_0__0 )
                    {
                     before(grammarAccess.getChannel_specifierAccess().getGroup_0()); 
                    // InternalXdstmdata.g:396:3: ( rule__Channel_specifier__Group_0__0 )
                    // InternalXdstmdata.g:396:4: rule__Channel_specifier__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Channel_specifier__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getChannel_specifierAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXdstmdata.g:400:2: ( 'Chn[Int]' )
                    {
                    // InternalXdstmdata.g:400:2: ( 'Chn[Int]' )
                    // InternalXdstmdata.g:401:3: 'Chn[Int]'
                    {
                     before(grammarAccess.getChannel_specifierAccess().getChnIntKeyword_1()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getChannel_specifierAccess().getChnIntKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXdstmdata.g:406:2: ( 'Chn[Bool]' )
                    {
                    // InternalXdstmdata.g:406:2: ( 'Chn[Bool]' )
                    // InternalXdstmdata.g:407:3: 'Chn[Bool]'
                    {
                     before(grammarAccess.getChannel_specifierAccess().getChnBoolKeyword_2()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getChannel_specifierAccess().getChnBoolKeyword_2()); 

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
    // $ANTLR end "rule__Channel_specifier__Alternatives"


    // $ANTLR start "rule__Composingtype__Alternatives"
    // InternalXdstmdata.g:416:1: rule__Composingtype__Alternatives : ( ( ( rule__Composingtype__TStringAssignment_0 ) ) | ( ( rule__Composingtype__TStringAssignment_1 ) ) | ( ( rule__Composingtype__TChnAssignment_2 ) ) | ( ( rule__Composingtype__TIDAssignment_3 ) ) );
    public final void rule__Composingtype__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:420:1: ( ( ( rule__Composingtype__TStringAssignment_0 ) ) | ( ( rule__Composingtype__TStringAssignment_1 ) ) | ( ( rule__Composingtype__TChnAssignment_2 ) ) | ( ( rule__Composingtype__TIDAssignment_3 ) ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt5=1;
                }
                break;
            case 28:
                {
                alt5=2;
                }
                break;
            case 11:
            case 12:
            case 19:
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
                    // InternalXdstmdata.g:421:2: ( ( rule__Composingtype__TStringAssignment_0 ) )
                    {
                    // InternalXdstmdata.g:421:2: ( ( rule__Composingtype__TStringAssignment_0 ) )
                    // InternalXdstmdata.g:422:3: ( rule__Composingtype__TStringAssignment_0 )
                    {
                     before(grammarAccess.getComposingtypeAccess().getTStringAssignment_0()); 
                    // InternalXdstmdata.g:423:3: ( rule__Composingtype__TStringAssignment_0 )
                    // InternalXdstmdata.g:423:4: rule__Composingtype__TStringAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Composingtype__TStringAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComposingtypeAccess().getTStringAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXdstmdata.g:427:2: ( ( rule__Composingtype__TStringAssignment_1 ) )
                    {
                    // InternalXdstmdata.g:427:2: ( ( rule__Composingtype__TStringAssignment_1 ) )
                    // InternalXdstmdata.g:428:3: ( rule__Composingtype__TStringAssignment_1 )
                    {
                     before(grammarAccess.getComposingtypeAccess().getTStringAssignment_1()); 
                    // InternalXdstmdata.g:429:3: ( rule__Composingtype__TStringAssignment_1 )
                    // InternalXdstmdata.g:429:4: rule__Composingtype__TStringAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Composingtype__TStringAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getComposingtypeAccess().getTStringAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXdstmdata.g:433:2: ( ( rule__Composingtype__TChnAssignment_2 ) )
                    {
                    // InternalXdstmdata.g:433:2: ( ( rule__Composingtype__TChnAssignment_2 ) )
                    // InternalXdstmdata.g:434:3: ( rule__Composingtype__TChnAssignment_2 )
                    {
                     before(grammarAccess.getComposingtypeAccess().getTChnAssignment_2()); 
                    // InternalXdstmdata.g:435:3: ( rule__Composingtype__TChnAssignment_2 )
                    // InternalXdstmdata.g:435:4: rule__Composingtype__TChnAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Composingtype__TChnAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getComposingtypeAccess().getTChnAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalXdstmdata.g:439:2: ( ( rule__Composingtype__TIDAssignment_3 ) )
                    {
                    // InternalXdstmdata.g:439:2: ( ( rule__Composingtype__TIDAssignment_3 ) )
                    // InternalXdstmdata.g:440:3: ( rule__Composingtype__TIDAssignment_3 )
                    {
                     before(grammarAccess.getComposingtypeAccess().getTIDAssignment_3()); 
                    // InternalXdstmdata.g:441:3: ( rule__Composingtype__TIDAssignment_3 )
                    // InternalXdstmdata.g:441:4: rule__Composingtype__TIDAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Composingtype__TIDAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getComposingtypeAccess().getTIDAssignment_3()); 

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
    // $ANTLR end "rule__Composingtype__Alternatives"


    // $ANTLR start "rule__CIntchannel__Alternatives_7"
    // InternalXdstmdata.g:449:1: rule__CIntchannel__Alternatives_7 : ( ( ( rule__CIntchannel__TStringAssignment_7_0 ) ) | ( ( rule__CIntchannel__TStringAssignment_7_1 ) ) | ( ( rule__CIntchannel__TChnAssignment_7_2 ) ) | ( ( rule__CIntchannel__TIDAssignment_7_3 ) ) );
    public final void rule__CIntchannel__Alternatives_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:453:1: ( ( ( rule__CIntchannel__TStringAssignment_7_0 ) ) | ( ( rule__CIntchannel__TStringAssignment_7_1 ) ) | ( ( rule__CIntchannel__TChnAssignment_7_2 ) ) | ( ( rule__CIntchannel__TIDAssignment_7_3 ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt6=1;
                }
                break;
            case 28:
                {
                alt6=2;
                }
                break;
            case 11:
            case 12:
            case 19:
                {
                alt6=3;
                }
                break;
            case RULE_ID:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalXdstmdata.g:454:2: ( ( rule__CIntchannel__TStringAssignment_7_0 ) )
                    {
                    // InternalXdstmdata.g:454:2: ( ( rule__CIntchannel__TStringAssignment_7_0 ) )
                    // InternalXdstmdata.g:455:3: ( rule__CIntchannel__TStringAssignment_7_0 )
                    {
                     before(grammarAccess.getCIntchannelAccess().getTStringAssignment_7_0()); 
                    // InternalXdstmdata.g:456:3: ( rule__CIntchannel__TStringAssignment_7_0 )
                    // InternalXdstmdata.g:456:4: rule__CIntchannel__TStringAssignment_7_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CIntchannel__TStringAssignment_7_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCIntchannelAccess().getTStringAssignment_7_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXdstmdata.g:460:2: ( ( rule__CIntchannel__TStringAssignment_7_1 ) )
                    {
                    // InternalXdstmdata.g:460:2: ( ( rule__CIntchannel__TStringAssignment_7_1 ) )
                    // InternalXdstmdata.g:461:3: ( rule__CIntchannel__TStringAssignment_7_1 )
                    {
                     before(grammarAccess.getCIntchannelAccess().getTStringAssignment_7_1()); 
                    // InternalXdstmdata.g:462:3: ( rule__CIntchannel__TStringAssignment_7_1 )
                    // InternalXdstmdata.g:462:4: rule__CIntchannel__TStringAssignment_7_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__CIntchannel__TStringAssignment_7_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getCIntchannelAccess().getTStringAssignment_7_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXdstmdata.g:466:2: ( ( rule__CIntchannel__TChnAssignment_7_2 ) )
                    {
                    // InternalXdstmdata.g:466:2: ( ( rule__CIntchannel__TChnAssignment_7_2 ) )
                    // InternalXdstmdata.g:467:3: ( rule__CIntchannel__TChnAssignment_7_2 )
                    {
                     before(grammarAccess.getCIntchannelAccess().getTChnAssignment_7_2()); 
                    // InternalXdstmdata.g:468:3: ( rule__CIntchannel__TChnAssignment_7_2 )
                    // InternalXdstmdata.g:468:4: rule__CIntchannel__TChnAssignment_7_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__CIntchannel__TChnAssignment_7_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getCIntchannelAccess().getTChnAssignment_7_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalXdstmdata.g:472:2: ( ( rule__CIntchannel__TIDAssignment_7_3 ) )
                    {
                    // InternalXdstmdata.g:472:2: ( ( rule__CIntchannel__TIDAssignment_7_3 ) )
                    // InternalXdstmdata.g:473:3: ( rule__CIntchannel__TIDAssignment_7_3 )
                    {
                     before(grammarAccess.getCIntchannelAccess().getTIDAssignment_7_3()); 
                    // InternalXdstmdata.g:474:3: ( rule__CIntchannel__TIDAssignment_7_3 )
                    // InternalXdstmdata.g:474:4: rule__CIntchannel__TIDAssignment_7_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__CIntchannel__TIDAssignment_7_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getCIntchannelAccess().getTIDAssignment_7_3()); 

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
    // $ANTLR end "rule__CIntchannel__Alternatives_7"


    // $ANTLR start "rule__CExtchannel__Alternatives_4"
    // InternalXdstmdata.g:482:1: rule__CExtchannel__Alternatives_4 : ( ( ( rule__CExtchannel__TStringAssignment_4_0 ) ) | ( ( rule__CExtchannel__TStringAssignment_4_1 ) ) | ( ( rule__CExtchannel__TChnAssignment_4_2 ) ) | ( ( rule__CExtchannel__TIDAssignment_4_3 ) ) );
    public final void rule__CExtchannel__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:486:1: ( ( ( rule__CExtchannel__TStringAssignment_4_0 ) ) | ( ( rule__CExtchannel__TStringAssignment_4_1 ) ) | ( ( rule__CExtchannel__TChnAssignment_4_2 ) ) | ( ( rule__CExtchannel__TIDAssignment_4_3 ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt7=1;
                }
                break;
            case 28:
                {
                alt7=2;
                }
                break;
            case 11:
            case 12:
            case 19:
                {
                alt7=3;
                }
                break;
            case RULE_ID:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalXdstmdata.g:487:2: ( ( rule__CExtchannel__TStringAssignment_4_0 ) )
                    {
                    // InternalXdstmdata.g:487:2: ( ( rule__CExtchannel__TStringAssignment_4_0 ) )
                    // InternalXdstmdata.g:488:3: ( rule__CExtchannel__TStringAssignment_4_0 )
                    {
                     before(grammarAccess.getCExtchannelAccess().getTStringAssignment_4_0()); 
                    // InternalXdstmdata.g:489:3: ( rule__CExtchannel__TStringAssignment_4_0 )
                    // InternalXdstmdata.g:489:4: rule__CExtchannel__TStringAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CExtchannel__TStringAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCExtchannelAccess().getTStringAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXdstmdata.g:493:2: ( ( rule__CExtchannel__TStringAssignment_4_1 ) )
                    {
                    // InternalXdstmdata.g:493:2: ( ( rule__CExtchannel__TStringAssignment_4_1 ) )
                    // InternalXdstmdata.g:494:3: ( rule__CExtchannel__TStringAssignment_4_1 )
                    {
                     before(grammarAccess.getCExtchannelAccess().getTStringAssignment_4_1()); 
                    // InternalXdstmdata.g:495:3: ( rule__CExtchannel__TStringAssignment_4_1 )
                    // InternalXdstmdata.g:495:4: rule__CExtchannel__TStringAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__CExtchannel__TStringAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getCExtchannelAccess().getTStringAssignment_4_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXdstmdata.g:499:2: ( ( rule__CExtchannel__TChnAssignment_4_2 ) )
                    {
                    // InternalXdstmdata.g:499:2: ( ( rule__CExtchannel__TChnAssignment_4_2 ) )
                    // InternalXdstmdata.g:500:3: ( rule__CExtchannel__TChnAssignment_4_2 )
                    {
                     before(grammarAccess.getCExtchannelAccess().getTChnAssignment_4_2()); 
                    // InternalXdstmdata.g:501:3: ( rule__CExtchannel__TChnAssignment_4_2 )
                    // InternalXdstmdata.g:501:4: rule__CExtchannel__TChnAssignment_4_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__CExtchannel__TChnAssignment_4_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getCExtchannelAccess().getTChnAssignment_4_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalXdstmdata.g:505:2: ( ( rule__CExtchannel__TIDAssignment_4_3 ) )
                    {
                    // InternalXdstmdata.g:505:2: ( ( rule__CExtchannel__TIDAssignment_4_3 ) )
                    // InternalXdstmdata.g:506:3: ( rule__CExtchannel__TIDAssignment_4_3 )
                    {
                     before(grammarAccess.getCExtchannelAccess().getTIDAssignment_4_3()); 
                    // InternalXdstmdata.g:507:3: ( rule__CExtchannel__TIDAssignment_4_3 )
                    // InternalXdstmdata.g:507:4: rule__CExtchannel__TIDAssignment_4_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__CExtchannel__TIDAssignment_4_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getCExtchannelAccess().getTIDAssignment_4_3()); 

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
    // $ANTLR end "rule__CExtchannel__Alternatives_4"


    // $ANTLR start "rule__VVariable__Alternatives_0"
    // InternalXdstmdata.g:515:1: rule__VVariable__Alternatives_0 : ( ( ( rule__VVariable__TStringAssignment_0_0 ) ) | ( ( rule__VVariable__TStringAssignment_0_1 ) ) | ( ( rule__VVariable__TChnAssignment_0_2 ) ) | ( ( rule__VVariable__TIDAssignment_0_3 ) ) );
    public final void rule__VVariable__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:519:1: ( ( ( rule__VVariable__TStringAssignment_0_0 ) ) | ( ( rule__VVariable__TStringAssignment_0_1 ) ) | ( ( rule__VVariable__TChnAssignment_0_2 ) ) | ( ( rule__VVariable__TIDAssignment_0_3 ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt8=1;
                }
                break;
            case 28:
                {
                alt8=2;
                }
                break;
            case 11:
            case 12:
            case 19:
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
                    // InternalXdstmdata.g:520:2: ( ( rule__VVariable__TStringAssignment_0_0 ) )
                    {
                    // InternalXdstmdata.g:520:2: ( ( rule__VVariable__TStringAssignment_0_0 ) )
                    // InternalXdstmdata.g:521:3: ( rule__VVariable__TStringAssignment_0_0 )
                    {
                     before(grammarAccess.getVVariableAccess().getTStringAssignment_0_0()); 
                    // InternalXdstmdata.g:522:3: ( rule__VVariable__TStringAssignment_0_0 )
                    // InternalXdstmdata.g:522:4: rule__VVariable__TStringAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VVariable__TStringAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVVariableAccess().getTStringAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXdstmdata.g:526:2: ( ( rule__VVariable__TStringAssignment_0_1 ) )
                    {
                    // InternalXdstmdata.g:526:2: ( ( rule__VVariable__TStringAssignment_0_1 ) )
                    // InternalXdstmdata.g:527:3: ( rule__VVariable__TStringAssignment_0_1 )
                    {
                     before(grammarAccess.getVVariableAccess().getTStringAssignment_0_1()); 
                    // InternalXdstmdata.g:528:3: ( rule__VVariable__TStringAssignment_0_1 )
                    // InternalXdstmdata.g:528:4: rule__VVariable__TStringAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__VVariable__TStringAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getVVariableAccess().getTStringAssignment_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXdstmdata.g:532:2: ( ( rule__VVariable__TChnAssignment_0_2 ) )
                    {
                    // InternalXdstmdata.g:532:2: ( ( rule__VVariable__TChnAssignment_0_2 ) )
                    // InternalXdstmdata.g:533:3: ( rule__VVariable__TChnAssignment_0_2 )
                    {
                     before(grammarAccess.getVVariableAccess().getTChnAssignment_0_2()); 
                    // InternalXdstmdata.g:534:3: ( rule__VVariable__TChnAssignment_0_2 )
                    // InternalXdstmdata.g:534:4: rule__VVariable__TChnAssignment_0_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__VVariable__TChnAssignment_0_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getVVariableAccess().getTChnAssignment_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalXdstmdata.g:538:2: ( ( rule__VVariable__TIDAssignment_0_3 ) )
                    {
                    // InternalXdstmdata.g:538:2: ( ( rule__VVariable__TIDAssignment_0_3 ) )
                    // InternalXdstmdata.g:539:3: ( rule__VVariable__TIDAssignment_0_3 )
                    {
                     before(grammarAccess.getVVariableAccess().getTIDAssignment_0_3()); 
                    // InternalXdstmdata.g:540:3: ( rule__VVariable__TIDAssignment_0_3 )
                    // InternalXdstmdata.g:540:4: rule__VVariable__TIDAssignment_0_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__VVariable__TIDAssignment_0_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getVVariableAccess().getTIDAssignment_0_3()); 

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
    // $ANTLR end "rule__VVariable__Alternatives_0"


    // $ANTLR start "rule__TTypes__Group__0"
    // InternalXdstmdata.g:548:1: rule__TTypes__Group__0 : rule__TTypes__Group__0__Impl rule__TTypes__Group__1 ;
    public final void rule__TTypes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:552:1: ( rule__TTypes__Group__0__Impl rule__TTypes__Group__1 )
            // InternalXdstmdata.g:553:2: rule__TTypes__Group__0__Impl rule__TTypes__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__TTypes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TTypes__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TTypes__Group__0"


    // $ANTLR start "rule__TTypes__Group__0__Impl"
    // InternalXdstmdata.g:560:1: rule__TTypes__Group__0__Impl : ( ( rule__TTypes__Alternatives_0 )* ) ;
    public final void rule__TTypes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:564:1: ( ( ( rule__TTypes__Alternatives_0 )* ) )
            // InternalXdstmdata.g:565:1: ( ( rule__TTypes__Alternatives_0 )* )
            {
            // InternalXdstmdata.g:565:1: ( ( rule__TTypes__Alternatives_0 )* )
            // InternalXdstmdata.g:566:2: ( rule__TTypes__Alternatives_0 )*
            {
             before(grammarAccess.getTTypesAccess().getAlternatives_0()); 
            // InternalXdstmdata.g:567:2: ( rule__TTypes__Alternatives_0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==13||LA9_0==18||LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalXdstmdata.g:567:3: rule__TTypes__Alternatives_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__TTypes__Alternatives_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getTTypesAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TTypes__Group__0__Impl"


    // $ANTLR start "rule__TTypes__Group__1"
    // InternalXdstmdata.g:575:1: rule__TTypes__Group__1 : rule__TTypes__Group__1__Impl ;
    public final void rule__TTypes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:579:1: ( rule__TTypes__Group__1__Impl )
            // InternalXdstmdata.g:580:2: rule__TTypes__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TTypes__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TTypes__Group__1"


    // $ANTLR start "rule__TTypes__Group__1__Impl"
    // InternalXdstmdata.g:586:1: rule__TTypes__Group__1__Impl : ( ( rule__TTypes__Alternatives_1 )* ) ;
    public final void rule__TTypes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:590:1: ( ( ( rule__TTypes__Alternatives_1 )* ) )
            // InternalXdstmdata.g:591:1: ( ( rule__TTypes__Alternatives_1 )* )
            {
            // InternalXdstmdata.g:591:1: ( ( rule__TTypes__Alternatives_1 )* )
            // InternalXdstmdata.g:592:2: ( rule__TTypes__Alternatives_1 )*
            {
             before(grammarAccess.getTTypesAccess().getAlternatives_1()); 
            // InternalXdstmdata.g:593:2: ( rule__TTypes__Alternatives_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||(LA10_0>=11 && LA10_0<=12)||LA10_0==19||LA10_0==22||(LA10_0>=27 && LA10_0<=28)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalXdstmdata.g:593:3: rule__TTypes__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__TTypes__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getTTypesAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TTypes__Group__1__Impl"


    // $ANTLR start "rule__TEnum__Group__0"
    // InternalXdstmdata.g:602:1: rule__TEnum__Group__0 : rule__TEnum__Group__0__Impl rule__TEnum__Group__1 ;
    public final void rule__TEnum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:606:1: ( rule__TEnum__Group__0__Impl rule__TEnum__Group__1 )
            // InternalXdstmdata.g:607:2: rule__TEnum__Group__0__Impl rule__TEnum__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__TEnum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TEnum__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TEnum__Group__0"


    // $ANTLR start "rule__TEnum__Group__0__Impl"
    // InternalXdstmdata.g:614:1: rule__TEnum__Group__0__Impl : ( 'Enum' ) ;
    public final void rule__TEnum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:618:1: ( ( 'Enum' ) )
            // InternalXdstmdata.g:619:1: ( 'Enum' )
            {
            // InternalXdstmdata.g:619:1: ( 'Enum' )
            // InternalXdstmdata.g:620:2: 'Enum'
            {
             before(grammarAccess.getTEnumAccess().getEnumKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTEnumAccess().getEnumKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TEnum__Group__0__Impl"


    // $ANTLR start "rule__TEnum__Group__1"
    // InternalXdstmdata.g:629:1: rule__TEnum__Group__1 : rule__TEnum__Group__1__Impl rule__TEnum__Group__2 ;
    public final void rule__TEnum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:633:1: ( rule__TEnum__Group__1__Impl rule__TEnum__Group__2 )
            // InternalXdstmdata.g:634:2: rule__TEnum__Group__1__Impl rule__TEnum__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__TEnum__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TEnum__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TEnum__Group__1"


    // $ANTLR start "rule__TEnum__Group__1__Impl"
    // InternalXdstmdata.g:641:1: rule__TEnum__Group__1__Impl : ( ( rule__TEnum__NameAssignment_1 ) ) ;
    public final void rule__TEnum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:645:1: ( ( ( rule__TEnum__NameAssignment_1 ) ) )
            // InternalXdstmdata.g:646:1: ( ( rule__TEnum__NameAssignment_1 ) )
            {
            // InternalXdstmdata.g:646:1: ( ( rule__TEnum__NameAssignment_1 ) )
            // InternalXdstmdata.g:647:2: ( rule__TEnum__NameAssignment_1 )
            {
             before(grammarAccess.getTEnumAccess().getNameAssignment_1()); 
            // InternalXdstmdata.g:648:2: ( rule__TEnum__NameAssignment_1 )
            // InternalXdstmdata.g:648:3: rule__TEnum__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TEnum__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTEnumAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TEnum__Group__1__Impl"


    // $ANTLR start "rule__TEnum__Group__2"
    // InternalXdstmdata.g:656:1: rule__TEnum__Group__2 : rule__TEnum__Group__2__Impl rule__TEnum__Group__3 ;
    public final void rule__TEnum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:660:1: ( rule__TEnum__Group__2__Impl rule__TEnum__Group__3 )
            // InternalXdstmdata.g:661:2: rule__TEnum__Group__2__Impl rule__TEnum__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__TEnum__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TEnum__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TEnum__Group__2"


    // $ANTLR start "rule__TEnum__Group__2__Impl"
    // InternalXdstmdata.g:668:1: rule__TEnum__Group__2__Impl : ( '{' ) ;
    public final void rule__TEnum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:672:1: ( ( '{' ) )
            // InternalXdstmdata.g:673:1: ( '{' )
            {
            // InternalXdstmdata.g:673:1: ( '{' )
            // InternalXdstmdata.g:674:2: '{'
            {
             before(grammarAccess.getTEnumAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTEnumAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TEnum__Group__2__Impl"


    // $ANTLR start "rule__TEnum__Group__3"
    // InternalXdstmdata.g:683:1: rule__TEnum__Group__3 : rule__TEnum__Group__3__Impl rule__TEnum__Group__4 ;
    public final void rule__TEnum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:687:1: ( rule__TEnum__Group__3__Impl rule__TEnum__Group__4 )
            // InternalXdstmdata.g:688:2: rule__TEnum__Group__3__Impl rule__TEnum__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__TEnum__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TEnum__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TEnum__Group__3"


    // $ANTLR start "rule__TEnum__Group__3__Impl"
    // InternalXdstmdata.g:695:1: rule__TEnum__Group__3__Impl : ( ( rule__TEnum__LiteralsAssignment_3 ) ) ;
    public final void rule__TEnum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:699:1: ( ( ( rule__TEnum__LiteralsAssignment_3 ) ) )
            // InternalXdstmdata.g:700:1: ( ( rule__TEnum__LiteralsAssignment_3 ) )
            {
            // InternalXdstmdata.g:700:1: ( ( rule__TEnum__LiteralsAssignment_3 ) )
            // InternalXdstmdata.g:701:2: ( rule__TEnum__LiteralsAssignment_3 )
            {
             before(grammarAccess.getTEnumAccess().getLiteralsAssignment_3()); 
            // InternalXdstmdata.g:702:2: ( rule__TEnum__LiteralsAssignment_3 )
            // InternalXdstmdata.g:702:3: rule__TEnum__LiteralsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TEnum__LiteralsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTEnumAccess().getLiteralsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TEnum__Group__3__Impl"


    // $ANTLR start "rule__TEnum__Group__4"
    // InternalXdstmdata.g:710:1: rule__TEnum__Group__4 : rule__TEnum__Group__4__Impl rule__TEnum__Group__5 ;
    public final void rule__TEnum__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:714:1: ( rule__TEnum__Group__4__Impl rule__TEnum__Group__5 )
            // InternalXdstmdata.g:715:2: rule__TEnum__Group__4__Impl rule__TEnum__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__TEnum__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TEnum__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TEnum__Group__4"


    // $ANTLR start "rule__TEnum__Group__4__Impl"
    // InternalXdstmdata.g:722:1: rule__TEnum__Group__4__Impl : ( ( rule__TEnum__Group_4__0 )* ) ;
    public final void rule__TEnum__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:726:1: ( ( ( rule__TEnum__Group_4__0 )* ) )
            // InternalXdstmdata.g:727:1: ( ( rule__TEnum__Group_4__0 )* )
            {
            // InternalXdstmdata.g:727:1: ( ( rule__TEnum__Group_4__0 )* )
            // InternalXdstmdata.g:728:2: ( rule__TEnum__Group_4__0 )*
            {
             before(grammarAccess.getTEnumAccess().getGroup_4()); 
            // InternalXdstmdata.g:729:2: ( rule__TEnum__Group_4__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==17) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalXdstmdata.g:729:3: rule__TEnum__Group_4__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__TEnum__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getTEnumAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TEnum__Group__4__Impl"


    // $ANTLR start "rule__TEnum__Group__5"
    // InternalXdstmdata.g:737:1: rule__TEnum__Group__5 : rule__TEnum__Group__5__Impl rule__TEnum__Group__6 ;
    public final void rule__TEnum__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:741:1: ( rule__TEnum__Group__5__Impl rule__TEnum__Group__6 )
            // InternalXdstmdata.g:742:2: rule__TEnum__Group__5__Impl rule__TEnum__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__TEnum__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TEnum__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TEnum__Group__5"


    // $ANTLR start "rule__TEnum__Group__5__Impl"
    // InternalXdstmdata.g:749:1: rule__TEnum__Group__5__Impl : ( '}' ) ;
    public final void rule__TEnum__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:753:1: ( ( '}' ) )
            // InternalXdstmdata.g:754:1: ( '}' )
            {
            // InternalXdstmdata.g:754:1: ( '}' )
            // InternalXdstmdata.g:755:2: '}'
            {
             before(grammarAccess.getTEnumAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTEnumAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TEnum__Group__5__Impl"


    // $ANTLR start "rule__TEnum__Group__6"
    // InternalXdstmdata.g:764:1: rule__TEnum__Group__6 : rule__TEnum__Group__6__Impl ;
    public final void rule__TEnum__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:768:1: ( rule__TEnum__Group__6__Impl )
            // InternalXdstmdata.g:769:2: rule__TEnum__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TEnum__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TEnum__Group__6"


    // $ANTLR start "rule__TEnum__Group__6__Impl"
    // InternalXdstmdata.g:775:1: rule__TEnum__Group__6__Impl : ( ';' ) ;
    public final void rule__TEnum__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:779:1: ( ( ';' ) )
            // InternalXdstmdata.g:780:1: ( ';' )
            {
            // InternalXdstmdata.g:780:1: ( ';' )
            // InternalXdstmdata.g:781:2: ';'
            {
             before(grammarAccess.getTEnumAccess().getSemicolonKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTEnumAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TEnum__Group__6__Impl"


    // $ANTLR start "rule__TEnum__Group_4__0"
    // InternalXdstmdata.g:791:1: rule__TEnum__Group_4__0 : rule__TEnum__Group_4__0__Impl rule__TEnum__Group_4__1 ;
    public final void rule__TEnum__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:795:1: ( rule__TEnum__Group_4__0__Impl rule__TEnum__Group_4__1 )
            // InternalXdstmdata.g:796:2: rule__TEnum__Group_4__0__Impl rule__TEnum__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__TEnum__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TEnum__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TEnum__Group_4__0"


    // $ANTLR start "rule__TEnum__Group_4__0__Impl"
    // InternalXdstmdata.g:803:1: rule__TEnum__Group_4__0__Impl : ( ',' ) ;
    public final void rule__TEnum__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:807:1: ( ( ',' ) )
            // InternalXdstmdata.g:808:1: ( ',' )
            {
            // InternalXdstmdata.g:808:1: ( ',' )
            // InternalXdstmdata.g:809:2: ','
            {
             before(grammarAccess.getTEnumAccess().getCommaKeyword_4_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTEnumAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TEnum__Group_4__0__Impl"


    // $ANTLR start "rule__TEnum__Group_4__1"
    // InternalXdstmdata.g:818:1: rule__TEnum__Group_4__1 : rule__TEnum__Group_4__1__Impl ;
    public final void rule__TEnum__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:822:1: ( rule__TEnum__Group_4__1__Impl )
            // InternalXdstmdata.g:823:2: rule__TEnum__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TEnum__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TEnum__Group_4__1"


    // $ANTLR start "rule__TEnum__Group_4__1__Impl"
    // InternalXdstmdata.g:829:1: rule__TEnum__Group_4__1__Impl : ( ( rule__TEnum__LiteralsAssignment_4_1 ) ) ;
    public final void rule__TEnum__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:833:1: ( ( ( rule__TEnum__LiteralsAssignment_4_1 ) ) )
            // InternalXdstmdata.g:834:1: ( ( rule__TEnum__LiteralsAssignment_4_1 ) )
            {
            // InternalXdstmdata.g:834:1: ( ( rule__TEnum__LiteralsAssignment_4_1 ) )
            // InternalXdstmdata.g:835:2: ( rule__TEnum__LiteralsAssignment_4_1 )
            {
             before(grammarAccess.getTEnumAccess().getLiteralsAssignment_4_1()); 
            // InternalXdstmdata.g:836:2: ( rule__TEnum__LiteralsAssignment_4_1 )
            // InternalXdstmdata.g:836:3: rule__TEnum__LiteralsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__TEnum__LiteralsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTEnumAccess().getLiteralsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TEnum__Group_4__1__Impl"


    // $ANTLR start "rule__TCompound__Group__0"
    // InternalXdstmdata.g:845:1: rule__TCompound__Group__0 : rule__TCompound__Group__0__Impl rule__TCompound__Group__1 ;
    public final void rule__TCompound__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:849:1: ( rule__TCompound__Group__0__Impl rule__TCompound__Group__1 )
            // InternalXdstmdata.g:850:2: rule__TCompound__Group__0__Impl rule__TCompound__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__TCompound__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TCompound__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TCompound__Group__0"


    // $ANTLR start "rule__TCompound__Group__0__Impl"
    // InternalXdstmdata.g:857:1: rule__TCompound__Group__0__Impl : ( 'Struct' ) ;
    public final void rule__TCompound__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:861:1: ( ( 'Struct' ) )
            // InternalXdstmdata.g:862:1: ( 'Struct' )
            {
            // InternalXdstmdata.g:862:1: ( 'Struct' )
            // InternalXdstmdata.g:863:2: 'Struct'
            {
             before(grammarAccess.getTCompoundAccess().getStructKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTCompoundAccess().getStructKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TCompound__Group__0__Impl"


    // $ANTLR start "rule__TCompound__Group__1"
    // InternalXdstmdata.g:872:1: rule__TCompound__Group__1 : rule__TCompound__Group__1__Impl rule__TCompound__Group__2 ;
    public final void rule__TCompound__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:876:1: ( rule__TCompound__Group__1__Impl rule__TCompound__Group__2 )
            // InternalXdstmdata.g:877:2: rule__TCompound__Group__1__Impl rule__TCompound__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__TCompound__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TCompound__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TCompound__Group__1"


    // $ANTLR start "rule__TCompound__Group__1__Impl"
    // InternalXdstmdata.g:884:1: rule__TCompound__Group__1__Impl : ( ( rule__TCompound__NameAssignment_1 ) ) ;
    public final void rule__TCompound__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:888:1: ( ( ( rule__TCompound__NameAssignment_1 ) ) )
            // InternalXdstmdata.g:889:1: ( ( rule__TCompound__NameAssignment_1 ) )
            {
            // InternalXdstmdata.g:889:1: ( ( rule__TCompound__NameAssignment_1 ) )
            // InternalXdstmdata.g:890:2: ( rule__TCompound__NameAssignment_1 )
            {
             before(grammarAccess.getTCompoundAccess().getNameAssignment_1()); 
            // InternalXdstmdata.g:891:2: ( rule__TCompound__NameAssignment_1 )
            // InternalXdstmdata.g:891:3: rule__TCompound__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TCompound__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTCompoundAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TCompound__Group__1__Impl"


    // $ANTLR start "rule__TCompound__Group__2"
    // InternalXdstmdata.g:899:1: rule__TCompound__Group__2 : rule__TCompound__Group__2__Impl rule__TCompound__Group__3 ;
    public final void rule__TCompound__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:903:1: ( rule__TCompound__Group__2__Impl rule__TCompound__Group__3 )
            // InternalXdstmdata.g:904:2: rule__TCompound__Group__2__Impl rule__TCompound__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__TCompound__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TCompound__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TCompound__Group__2"


    // $ANTLR start "rule__TCompound__Group__2__Impl"
    // InternalXdstmdata.g:911:1: rule__TCompound__Group__2__Impl : ( '{' ) ;
    public final void rule__TCompound__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:915:1: ( ( '{' ) )
            // InternalXdstmdata.g:916:1: ( '{' )
            {
            // InternalXdstmdata.g:916:1: ( '{' )
            // InternalXdstmdata.g:917:2: '{'
            {
             before(grammarAccess.getTCompoundAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTCompoundAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TCompound__Group__2__Impl"


    // $ANTLR start "rule__TCompound__Group__3"
    // InternalXdstmdata.g:926:1: rule__TCompound__Group__3 : rule__TCompound__Group__3__Impl rule__TCompound__Group__4 ;
    public final void rule__TCompound__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:930:1: ( rule__TCompound__Group__3__Impl rule__TCompound__Group__4 )
            // InternalXdstmdata.g:931:2: rule__TCompound__Group__3__Impl rule__TCompound__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__TCompound__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TCompound__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TCompound__Group__3"


    // $ANTLR start "rule__TCompound__Group__3__Impl"
    // InternalXdstmdata.g:938:1: rule__TCompound__Group__3__Impl : ( ( rule__TCompound__SubtypesAssignment_3 ) ) ;
    public final void rule__TCompound__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:942:1: ( ( ( rule__TCompound__SubtypesAssignment_3 ) ) )
            // InternalXdstmdata.g:943:1: ( ( rule__TCompound__SubtypesAssignment_3 ) )
            {
            // InternalXdstmdata.g:943:1: ( ( rule__TCompound__SubtypesAssignment_3 ) )
            // InternalXdstmdata.g:944:2: ( rule__TCompound__SubtypesAssignment_3 )
            {
             before(grammarAccess.getTCompoundAccess().getSubtypesAssignment_3()); 
            // InternalXdstmdata.g:945:2: ( rule__TCompound__SubtypesAssignment_3 )
            // InternalXdstmdata.g:945:3: rule__TCompound__SubtypesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TCompound__SubtypesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTCompoundAccess().getSubtypesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TCompound__Group__3__Impl"


    // $ANTLR start "rule__TCompound__Group__4"
    // InternalXdstmdata.g:953:1: rule__TCompound__Group__4 : rule__TCompound__Group__4__Impl rule__TCompound__Group__5 ;
    public final void rule__TCompound__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:957:1: ( rule__TCompound__Group__4__Impl rule__TCompound__Group__5 )
            // InternalXdstmdata.g:958:2: rule__TCompound__Group__4__Impl rule__TCompound__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__TCompound__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TCompound__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TCompound__Group__4"


    // $ANTLR start "rule__TCompound__Group__4__Impl"
    // InternalXdstmdata.g:965:1: rule__TCompound__Group__4__Impl : ( ( rule__TCompound__Group_4__0 )* ) ;
    public final void rule__TCompound__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:969:1: ( ( ( rule__TCompound__Group_4__0 )* ) )
            // InternalXdstmdata.g:970:1: ( ( rule__TCompound__Group_4__0 )* )
            {
            // InternalXdstmdata.g:970:1: ( ( rule__TCompound__Group_4__0 )* )
            // InternalXdstmdata.g:971:2: ( rule__TCompound__Group_4__0 )*
            {
             before(grammarAccess.getTCompoundAccess().getGroup_4()); 
            // InternalXdstmdata.g:972:2: ( rule__TCompound__Group_4__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==17) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalXdstmdata.g:972:3: rule__TCompound__Group_4__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__TCompound__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getTCompoundAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TCompound__Group__4__Impl"


    // $ANTLR start "rule__TCompound__Group__5"
    // InternalXdstmdata.g:980:1: rule__TCompound__Group__5 : rule__TCompound__Group__5__Impl rule__TCompound__Group__6 ;
    public final void rule__TCompound__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:984:1: ( rule__TCompound__Group__5__Impl rule__TCompound__Group__6 )
            // InternalXdstmdata.g:985:2: rule__TCompound__Group__5__Impl rule__TCompound__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__TCompound__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TCompound__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TCompound__Group__5"


    // $ANTLR start "rule__TCompound__Group__5__Impl"
    // InternalXdstmdata.g:992:1: rule__TCompound__Group__5__Impl : ( '}' ) ;
    public final void rule__TCompound__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:996:1: ( ( '}' ) )
            // InternalXdstmdata.g:997:1: ( '}' )
            {
            // InternalXdstmdata.g:997:1: ( '}' )
            // InternalXdstmdata.g:998:2: '}'
            {
             before(grammarAccess.getTCompoundAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTCompoundAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TCompound__Group__5__Impl"


    // $ANTLR start "rule__TCompound__Group__6"
    // InternalXdstmdata.g:1007:1: rule__TCompound__Group__6 : rule__TCompound__Group__6__Impl ;
    public final void rule__TCompound__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1011:1: ( rule__TCompound__Group__6__Impl )
            // InternalXdstmdata.g:1012:2: rule__TCompound__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TCompound__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TCompound__Group__6"


    // $ANTLR start "rule__TCompound__Group__6__Impl"
    // InternalXdstmdata.g:1018:1: rule__TCompound__Group__6__Impl : ( ';' ) ;
    public final void rule__TCompound__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1022:1: ( ( ';' ) )
            // InternalXdstmdata.g:1023:1: ( ';' )
            {
            // InternalXdstmdata.g:1023:1: ( ';' )
            // InternalXdstmdata.g:1024:2: ';'
            {
             before(grammarAccess.getTCompoundAccess().getSemicolonKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTCompoundAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TCompound__Group__6__Impl"


    // $ANTLR start "rule__TCompound__Group_4__0"
    // InternalXdstmdata.g:1034:1: rule__TCompound__Group_4__0 : rule__TCompound__Group_4__0__Impl rule__TCompound__Group_4__1 ;
    public final void rule__TCompound__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1038:1: ( rule__TCompound__Group_4__0__Impl rule__TCompound__Group_4__1 )
            // InternalXdstmdata.g:1039:2: rule__TCompound__Group_4__0__Impl rule__TCompound__Group_4__1
            {
            pushFollow(FOLLOW_11);
            rule__TCompound__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TCompound__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TCompound__Group_4__0"


    // $ANTLR start "rule__TCompound__Group_4__0__Impl"
    // InternalXdstmdata.g:1046:1: rule__TCompound__Group_4__0__Impl : ( ',' ) ;
    public final void rule__TCompound__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1050:1: ( ( ',' ) )
            // InternalXdstmdata.g:1051:1: ( ',' )
            {
            // InternalXdstmdata.g:1051:1: ( ',' )
            // InternalXdstmdata.g:1052:2: ','
            {
             before(grammarAccess.getTCompoundAccess().getCommaKeyword_4_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTCompoundAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TCompound__Group_4__0__Impl"


    // $ANTLR start "rule__TCompound__Group_4__1"
    // InternalXdstmdata.g:1061:1: rule__TCompound__Group_4__1 : rule__TCompound__Group_4__1__Impl ;
    public final void rule__TCompound__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1065:1: ( rule__TCompound__Group_4__1__Impl )
            // InternalXdstmdata.g:1066:2: rule__TCompound__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TCompound__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TCompound__Group_4__1"


    // $ANTLR start "rule__TCompound__Group_4__1__Impl"
    // InternalXdstmdata.g:1072:1: rule__TCompound__Group_4__1__Impl : ( ( rule__TCompound__SubtypesAssignment_4_1 ) ) ;
    public final void rule__TCompound__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1076:1: ( ( ( rule__TCompound__SubtypesAssignment_4_1 ) ) )
            // InternalXdstmdata.g:1077:1: ( ( rule__TCompound__SubtypesAssignment_4_1 ) )
            {
            // InternalXdstmdata.g:1077:1: ( ( rule__TCompound__SubtypesAssignment_4_1 ) )
            // InternalXdstmdata.g:1078:2: ( rule__TCompound__SubtypesAssignment_4_1 )
            {
             before(grammarAccess.getTCompoundAccess().getSubtypesAssignment_4_1()); 
            // InternalXdstmdata.g:1079:2: ( rule__TCompound__SubtypesAssignment_4_1 )
            // InternalXdstmdata.g:1079:3: rule__TCompound__SubtypesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__TCompound__SubtypesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTCompoundAccess().getSubtypesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TCompound__Group_4__1__Impl"


    // $ANTLR start "rule__Channel_specifier__Group_0__0"
    // InternalXdstmdata.g:1088:1: rule__Channel_specifier__Group_0__0 : rule__Channel_specifier__Group_0__0__Impl rule__Channel_specifier__Group_0__1 ;
    public final void rule__Channel_specifier__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1092:1: ( rule__Channel_specifier__Group_0__0__Impl rule__Channel_specifier__Group_0__1 )
            // InternalXdstmdata.g:1093:2: rule__Channel_specifier__Group_0__0__Impl rule__Channel_specifier__Group_0__1
            {
            pushFollow(FOLLOW_12);
            rule__Channel_specifier__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Channel_specifier__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel_specifier__Group_0__0"


    // $ANTLR start "rule__Channel_specifier__Group_0__0__Impl"
    // InternalXdstmdata.g:1100:1: rule__Channel_specifier__Group_0__0__Impl : ( () ) ;
    public final void rule__Channel_specifier__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1104:1: ( ( () ) )
            // InternalXdstmdata.g:1105:1: ( () )
            {
            // InternalXdstmdata.g:1105:1: ( () )
            // InternalXdstmdata.g:1106:2: ()
            {
             before(grammarAccess.getChannel_specifierAccess().getChannel_specifierAction_0_0()); 
            // InternalXdstmdata.g:1107:2: ()
            // InternalXdstmdata.g:1107:3: 
            {
            }

             after(grammarAccess.getChannel_specifierAccess().getChannel_specifierAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel_specifier__Group_0__0__Impl"


    // $ANTLR start "rule__Channel_specifier__Group_0__1"
    // InternalXdstmdata.g:1115:1: rule__Channel_specifier__Group_0__1 : rule__Channel_specifier__Group_0__1__Impl rule__Channel_specifier__Group_0__2 ;
    public final void rule__Channel_specifier__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1119:1: ( rule__Channel_specifier__Group_0__1__Impl rule__Channel_specifier__Group_0__2 )
            // InternalXdstmdata.g:1120:2: rule__Channel_specifier__Group_0__1__Impl rule__Channel_specifier__Group_0__2
            {
            pushFollow(FOLLOW_6);
            rule__Channel_specifier__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Channel_specifier__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel_specifier__Group_0__1"


    // $ANTLR start "rule__Channel_specifier__Group_0__1__Impl"
    // InternalXdstmdata.g:1127:1: rule__Channel_specifier__Group_0__1__Impl : ( 'Chn[' ) ;
    public final void rule__Channel_specifier__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1131:1: ( ( 'Chn[' ) )
            // InternalXdstmdata.g:1132:1: ( 'Chn[' )
            {
            // InternalXdstmdata.g:1132:1: ( 'Chn[' )
            // InternalXdstmdata.g:1133:2: 'Chn['
            {
             before(grammarAccess.getChannel_specifierAccess().getChnKeyword_0_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getChannel_specifierAccess().getChnKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel_specifier__Group_0__1__Impl"


    // $ANTLR start "rule__Channel_specifier__Group_0__2"
    // InternalXdstmdata.g:1142:1: rule__Channel_specifier__Group_0__2 : rule__Channel_specifier__Group_0__2__Impl rule__Channel_specifier__Group_0__3 ;
    public final void rule__Channel_specifier__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1146:1: ( rule__Channel_specifier__Group_0__2__Impl rule__Channel_specifier__Group_0__3 )
            // InternalXdstmdata.g:1147:2: rule__Channel_specifier__Group_0__2__Impl rule__Channel_specifier__Group_0__3
            {
            pushFollow(FOLLOW_13);
            rule__Channel_specifier__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Channel_specifier__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel_specifier__Group_0__2"


    // $ANTLR start "rule__Channel_specifier__Group_0__2__Impl"
    // InternalXdstmdata.g:1154:1: rule__Channel_specifier__Group_0__2__Impl : ( ( rule__Channel_specifier__TypeAssignment_0_2 ) ) ;
    public final void rule__Channel_specifier__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1158:1: ( ( ( rule__Channel_specifier__TypeAssignment_0_2 ) ) )
            // InternalXdstmdata.g:1159:1: ( ( rule__Channel_specifier__TypeAssignment_0_2 ) )
            {
            // InternalXdstmdata.g:1159:1: ( ( rule__Channel_specifier__TypeAssignment_0_2 ) )
            // InternalXdstmdata.g:1160:2: ( rule__Channel_specifier__TypeAssignment_0_2 )
            {
             before(grammarAccess.getChannel_specifierAccess().getTypeAssignment_0_2()); 
            // InternalXdstmdata.g:1161:2: ( rule__Channel_specifier__TypeAssignment_0_2 )
            // InternalXdstmdata.g:1161:3: rule__Channel_specifier__TypeAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Channel_specifier__TypeAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getChannel_specifierAccess().getTypeAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel_specifier__Group_0__2__Impl"


    // $ANTLR start "rule__Channel_specifier__Group_0__3"
    // InternalXdstmdata.g:1169:1: rule__Channel_specifier__Group_0__3 : rule__Channel_specifier__Group_0__3__Impl ;
    public final void rule__Channel_specifier__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1173:1: ( rule__Channel_specifier__Group_0__3__Impl )
            // InternalXdstmdata.g:1174:2: rule__Channel_specifier__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Channel_specifier__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel_specifier__Group_0__3"


    // $ANTLR start "rule__Channel_specifier__Group_0__3__Impl"
    // InternalXdstmdata.g:1180:1: rule__Channel_specifier__Group_0__3__Impl : ( ']' ) ;
    public final void rule__Channel_specifier__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1184:1: ( ( ']' ) )
            // InternalXdstmdata.g:1185:1: ( ']' )
            {
            // InternalXdstmdata.g:1185:1: ( ']' )
            // InternalXdstmdata.g:1186:2: ']'
            {
             before(grammarAccess.getChannel_specifierAccess().getRightSquareBracketKeyword_0_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getChannel_specifierAccess().getRightSquareBracketKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel_specifier__Group_0__3__Impl"


    // $ANTLR start "rule__TMultitype__Group__0"
    // InternalXdstmdata.g:1196:1: rule__TMultitype__Group__0 : rule__TMultitype__Group__0__Impl rule__TMultitype__Group__1 ;
    public final void rule__TMultitype__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1200:1: ( rule__TMultitype__Group__0__Impl rule__TMultitype__Group__1 )
            // InternalXdstmdata.g:1201:2: rule__TMultitype__Group__0__Impl rule__TMultitype__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__TMultitype__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TMultitype__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMultitype__Group__0"


    // $ANTLR start "rule__TMultitype__Group__0__Impl"
    // InternalXdstmdata.g:1208:1: rule__TMultitype__Group__0__Impl : ( 'Mtype' ) ;
    public final void rule__TMultitype__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1212:1: ( ( 'Mtype' ) )
            // InternalXdstmdata.g:1213:1: ( 'Mtype' )
            {
            // InternalXdstmdata.g:1213:1: ( 'Mtype' )
            // InternalXdstmdata.g:1214:2: 'Mtype'
            {
             before(grammarAccess.getTMultitypeAccess().getMtypeKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTMultitypeAccess().getMtypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMultitype__Group__0__Impl"


    // $ANTLR start "rule__TMultitype__Group__1"
    // InternalXdstmdata.g:1223:1: rule__TMultitype__Group__1 : rule__TMultitype__Group__1__Impl rule__TMultitype__Group__2 ;
    public final void rule__TMultitype__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1227:1: ( rule__TMultitype__Group__1__Impl rule__TMultitype__Group__2 )
            // InternalXdstmdata.g:1228:2: rule__TMultitype__Group__1__Impl rule__TMultitype__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__TMultitype__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TMultitype__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMultitype__Group__1"


    // $ANTLR start "rule__TMultitype__Group__1__Impl"
    // InternalXdstmdata.g:1235:1: rule__TMultitype__Group__1__Impl : ( ( rule__TMultitype__NameAssignment_1 ) ) ;
    public final void rule__TMultitype__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1239:1: ( ( ( rule__TMultitype__NameAssignment_1 ) ) )
            // InternalXdstmdata.g:1240:1: ( ( rule__TMultitype__NameAssignment_1 ) )
            {
            // InternalXdstmdata.g:1240:1: ( ( rule__TMultitype__NameAssignment_1 ) )
            // InternalXdstmdata.g:1241:2: ( rule__TMultitype__NameAssignment_1 )
            {
             before(grammarAccess.getTMultitypeAccess().getNameAssignment_1()); 
            // InternalXdstmdata.g:1242:2: ( rule__TMultitype__NameAssignment_1 )
            // InternalXdstmdata.g:1242:3: rule__TMultitype__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TMultitype__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTMultitypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMultitype__Group__1__Impl"


    // $ANTLR start "rule__TMultitype__Group__2"
    // InternalXdstmdata.g:1250:1: rule__TMultitype__Group__2 : rule__TMultitype__Group__2__Impl rule__TMultitype__Group__3 ;
    public final void rule__TMultitype__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1254:1: ( rule__TMultitype__Group__2__Impl rule__TMultitype__Group__3 )
            // InternalXdstmdata.g:1255:2: rule__TMultitype__Group__2__Impl rule__TMultitype__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__TMultitype__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TMultitype__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMultitype__Group__2"


    // $ANTLR start "rule__TMultitype__Group__2__Impl"
    // InternalXdstmdata.g:1262:1: rule__TMultitype__Group__2__Impl : ( '{' ) ;
    public final void rule__TMultitype__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1266:1: ( ( '{' ) )
            // InternalXdstmdata.g:1267:1: ( '{' )
            {
            // InternalXdstmdata.g:1267:1: ( '{' )
            // InternalXdstmdata.g:1268:2: '{'
            {
             before(grammarAccess.getTMultitypeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTMultitypeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMultitype__Group__2__Impl"


    // $ANTLR start "rule__TMultitype__Group__3"
    // InternalXdstmdata.g:1277:1: rule__TMultitype__Group__3 : rule__TMultitype__Group__3__Impl rule__TMultitype__Group__4 ;
    public final void rule__TMultitype__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1281:1: ( rule__TMultitype__Group__3__Impl rule__TMultitype__Group__4 )
            // InternalXdstmdata.g:1282:2: rule__TMultitype__Group__3__Impl rule__TMultitype__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__TMultitype__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TMultitype__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMultitype__Group__3"


    // $ANTLR start "rule__TMultitype__Group__3__Impl"
    // InternalXdstmdata.g:1289:1: rule__TMultitype__Group__3__Impl : ( ( rule__TMultitype__ComposingtypesAssignment_3 ) ) ;
    public final void rule__TMultitype__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1293:1: ( ( ( rule__TMultitype__ComposingtypesAssignment_3 ) ) )
            // InternalXdstmdata.g:1294:1: ( ( rule__TMultitype__ComposingtypesAssignment_3 ) )
            {
            // InternalXdstmdata.g:1294:1: ( ( rule__TMultitype__ComposingtypesAssignment_3 ) )
            // InternalXdstmdata.g:1295:2: ( rule__TMultitype__ComposingtypesAssignment_3 )
            {
             before(grammarAccess.getTMultitypeAccess().getComposingtypesAssignment_3()); 
            // InternalXdstmdata.g:1296:2: ( rule__TMultitype__ComposingtypesAssignment_3 )
            // InternalXdstmdata.g:1296:3: rule__TMultitype__ComposingtypesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TMultitype__ComposingtypesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTMultitypeAccess().getComposingtypesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMultitype__Group__3__Impl"


    // $ANTLR start "rule__TMultitype__Group__4"
    // InternalXdstmdata.g:1304:1: rule__TMultitype__Group__4 : rule__TMultitype__Group__4__Impl rule__TMultitype__Group__5 ;
    public final void rule__TMultitype__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1308:1: ( rule__TMultitype__Group__4__Impl rule__TMultitype__Group__5 )
            // InternalXdstmdata.g:1309:2: rule__TMultitype__Group__4__Impl rule__TMultitype__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__TMultitype__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TMultitype__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMultitype__Group__4"


    // $ANTLR start "rule__TMultitype__Group__4__Impl"
    // InternalXdstmdata.g:1316:1: rule__TMultitype__Group__4__Impl : ( ( rule__TMultitype__Group_4__0 )* ) ;
    public final void rule__TMultitype__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1320:1: ( ( ( rule__TMultitype__Group_4__0 )* ) )
            // InternalXdstmdata.g:1321:1: ( ( rule__TMultitype__Group_4__0 )* )
            {
            // InternalXdstmdata.g:1321:1: ( ( rule__TMultitype__Group_4__0 )* )
            // InternalXdstmdata.g:1322:2: ( rule__TMultitype__Group_4__0 )*
            {
             before(grammarAccess.getTMultitypeAccess().getGroup_4()); 
            // InternalXdstmdata.g:1323:2: ( rule__TMultitype__Group_4__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==17) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalXdstmdata.g:1323:3: rule__TMultitype__Group_4__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__TMultitype__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getTMultitypeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMultitype__Group__4__Impl"


    // $ANTLR start "rule__TMultitype__Group__5"
    // InternalXdstmdata.g:1331:1: rule__TMultitype__Group__5 : rule__TMultitype__Group__5__Impl rule__TMultitype__Group__6 ;
    public final void rule__TMultitype__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1335:1: ( rule__TMultitype__Group__5__Impl rule__TMultitype__Group__6 )
            // InternalXdstmdata.g:1336:2: rule__TMultitype__Group__5__Impl rule__TMultitype__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__TMultitype__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TMultitype__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMultitype__Group__5"


    // $ANTLR start "rule__TMultitype__Group__5__Impl"
    // InternalXdstmdata.g:1343:1: rule__TMultitype__Group__5__Impl : ( '}' ) ;
    public final void rule__TMultitype__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1347:1: ( ( '}' ) )
            // InternalXdstmdata.g:1348:1: ( '}' )
            {
            // InternalXdstmdata.g:1348:1: ( '}' )
            // InternalXdstmdata.g:1349:2: '}'
            {
             before(grammarAccess.getTMultitypeAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTMultitypeAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMultitype__Group__5__Impl"


    // $ANTLR start "rule__TMultitype__Group__6"
    // InternalXdstmdata.g:1358:1: rule__TMultitype__Group__6 : rule__TMultitype__Group__6__Impl ;
    public final void rule__TMultitype__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1362:1: ( rule__TMultitype__Group__6__Impl )
            // InternalXdstmdata.g:1363:2: rule__TMultitype__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TMultitype__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMultitype__Group__6"


    // $ANTLR start "rule__TMultitype__Group__6__Impl"
    // InternalXdstmdata.g:1369:1: rule__TMultitype__Group__6__Impl : ( ';' ) ;
    public final void rule__TMultitype__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1373:1: ( ( ';' ) )
            // InternalXdstmdata.g:1374:1: ( ';' )
            {
            // InternalXdstmdata.g:1374:1: ( ';' )
            // InternalXdstmdata.g:1375:2: ';'
            {
             before(grammarAccess.getTMultitypeAccess().getSemicolonKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTMultitypeAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMultitype__Group__6__Impl"


    // $ANTLR start "rule__TMultitype__Group_4__0"
    // InternalXdstmdata.g:1385:1: rule__TMultitype__Group_4__0 : rule__TMultitype__Group_4__0__Impl rule__TMultitype__Group_4__1 ;
    public final void rule__TMultitype__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1389:1: ( rule__TMultitype__Group_4__0__Impl rule__TMultitype__Group_4__1 )
            // InternalXdstmdata.g:1390:2: rule__TMultitype__Group_4__0__Impl rule__TMultitype__Group_4__1
            {
            pushFollow(FOLLOW_11);
            rule__TMultitype__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TMultitype__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMultitype__Group_4__0"


    // $ANTLR start "rule__TMultitype__Group_4__0__Impl"
    // InternalXdstmdata.g:1397:1: rule__TMultitype__Group_4__0__Impl : ( ',' ) ;
    public final void rule__TMultitype__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1401:1: ( ( ',' ) )
            // InternalXdstmdata.g:1402:1: ( ',' )
            {
            // InternalXdstmdata.g:1402:1: ( ',' )
            // InternalXdstmdata.g:1403:2: ','
            {
             before(grammarAccess.getTMultitypeAccess().getCommaKeyword_4_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTMultitypeAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMultitype__Group_4__0__Impl"


    // $ANTLR start "rule__TMultitype__Group_4__1"
    // InternalXdstmdata.g:1412:1: rule__TMultitype__Group_4__1 : rule__TMultitype__Group_4__1__Impl ;
    public final void rule__TMultitype__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1416:1: ( rule__TMultitype__Group_4__1__Impl )
            // InternalXdstmdata.g:1417:2: rule__TMultitype__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TMultitype__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMultitype__Group_4__1"


    // $ANTLR start "rule__TMultitype__Group_4__1__Impl"
    // InternalXdstmdata.g:1423:1: rule__TMultitype__Group_4__1__Impl : ( ( rule__TMultitype__ComposingtypesAssignment_4_1 ) ) ;
    public final void rule__TMultitype__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1427:1: ( ( ( rule__TMultitype__ComposingtypesAssignment_4_1 ) ) )
            // InternalXdstmdata.g:1428:1: ( ( rule__TMultitype__ComposingtypesAssignment_4_1 ) )
            {
            // InternalXdstmdata.g:1428:1: ( ( rule__TMultitype__ComposingtypesAssignment_4_1 ) )
            // InternalXdstmdata.g:1429:2: ( rule__TMultitype__ComposingtypesAssignment_4_1 )
            {
             before(grammarAccess.getTMultitypeAccess().getComposingtypesAssignment_4_1()); 
            // InternalXdstmdata.g:1430:2: ( rule__TMultitype__ComposingtypesAssignment_4_1 )
            // InternalXdstmdata.g:1430:3: rule__TMultitype__ComposingtypesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__TMultitype__ComposingtypesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTMultitypeAccess().getComposingtypesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMultitype__Group_4__1__Impl"


    // $ANTLR start "rule__CIntchannel__Group__0"
    // InternalXdstmdata.g:1439:1: rule__CIntchannel__Group__0 : rule__CIntchannel__Group__0__Impl rule__CIntchannel__Group__1 ;
    public final void rule__CIntchannel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1443:1: ( rule__CIntchannel__Group__0__Impl rule__CIntchannel__Group__1 )
            // InternalXdstmdata.g:1444:2: rule__CIntchannel__Group__0__Impl rule__CIntchannel__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__CIntchannel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CIntchannel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CIntchannel__Group__0"


    // $ANTLR start "rule__CIntchannel__Group__0__Impl"
    // InternalXdstmdata.g:1451:1: rule__CIntchannel__Group__0__Impl : ( 'Chn' ) ;
    public final void rule__CIntchannel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1455:1: ( ( 'Chn' ) )
            // InternalXdstmdata.g:1456:1: ( 'Chn' )
            {
            // InternalXdstmdata.g:1456:1: ( 'Chn' )
            // InternalXdstmdata.g:1457:2: 'Chn'
            {
             before(grammarAccess.getCIntchannelAccess().getChnKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCIntchannelAccess().getChnKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CIntchannel__Group__0__Impl"


    // $ANTLR start "rule__CIntchannel__Group__1"
    // InternalXdstmdata.g:1466:1: rule__CIntchannel__Group__1 : rule__CIntchannel__Group__1__Impl rule__CIntchannel__Group__2 ;
    public final void rule__CIntchannel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1470:1: ( rule__CIntchannel__Group__1__Impl rule__CIntchannel__Group__2 )
            // InternalXdstmdata.g:1471:2: rule__CIntchannel__Group__1__Impl rule__CIntchannel__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__CIntchannel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CIntchannel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CIntchannel__Group__1"


    // $ANTLR start "rule__CIntchannel__Group__1__Impl"
    // InternalXdstmdata.g:1478:1: rule__CIntchannel__Group__1__Impl : ( 'internal' ) ;
    public final void rule__CIntchannel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1482:1: ( ( 'internal' ) )
            // InternalXdstmdata.g:1483:1: ( 'internal' )
            {
            // InternalXdstmdata.g:1483:1: ( 'internal' )
            // InternalXdstmdata.g:1484:2: 'internal'
            {
             before(grammarAccess.getCIntchannelAccess().getInternalKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCIntchannelAccess().getInternalKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CIntchannel__Group__1__Impl"


    // $ANTLR start "rule__CIntchannel__Group__2"
    // InternalXdstmdata.g:1493:1: rule__CIntchannel__Group__2 : rule__CIntchannel__Group__2__Impl rule__CIntchannel__Group__3 ;
    public final void rule__CIntchannel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1497:1: ( rule__CIntchannel__Group__2__Impl rule__CIntchannel__Group__3 )
            // InternalXdstmdata.g:1498:2: rule__CIntchannel__Group__2__Impl rule__CIntchannel__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__CIntchannel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CIntchannel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CIntchannel__Group__2"


    // $ANTLR start "rule__CIntchannel__Group__2__Impl"
    // InternalXdstmdata.g:1505:1: rule__CIntchannel__Group__2__Impl : ( ( rule__CIntchannel__NameAssignment_2 ) ) ;
    public final void rule__CIntchannel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1509:1: ( ( ( rule__CIntchannel__NameAssignment_2 ) ) )
            // InternalXdstmdata.g:1510:1: ( ( rule__CIntchannel__NameAssignment_2 ) )
            {
            // InternalXdstmdata.g:1510:1: ( ( rule__CIntchannel__NameAssignment_2 ) )
            // InternalXdstmdata.g:1511:2: ( rule__CIntchannel__NameAssignment_2 )
            {
             before(grammarAccess.getCIntchannelAccess().getNameAssignment_2()); 
            // InternalXdstmdata.g:1512:2: ( rule__CIntchannel__NameAssignment_2 )
            // InternalXdstmdata.g:1512:3: rule__CIntchannel__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CIntchannel__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCIntchannelAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CIntchannel__Group__2__Impl"


    // $ANTLR start "rule__CIntchannel__Group__3"
    // InternalXdstmdata.g:1520:1: rule__CIntchannel__Group__3 : rule__CIntchannel__Group__3__Impl rule__CIntchannel__Group__4 ;
    public final void rule__CIntchannel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1524:1: ( rule__CIntchannel__Group__3__Impl rule__CIntchannel__Group__4 )
            // InternalXdstmdata.g:1525:2: rule__CIntchannel__Group__3__Impl rule__CIntchannel__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__CIntchannel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CIntchannel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CIntchannel__Group__3"


    // $ANTLR start "rule__CIntchannel__Group__3__Impl"
    // InternalXdstmdata.g:1532:1: rule__CIntchannel__Group__3__Impl : ( '[' ) ;
    public final void rule__CIntchannel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1536:1: ( ( '[' ) )
            // InternalXdstmdata.g:1537:1: ( '[' )
            {
            // InternalXdstmdata.g:1537:1: ( '[' )
            // InternalXdstmdata.g:1538:2: '['
            {
             before(grammarAccess.getCIntchannelAccess().getLeftSquareBracketKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCIntchannelAccess().getLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CIntchannel__Group__3__Impl"


    // $ANTLR start "rule__CIntchannel__Group__4"
    // InternalXdstmdata.g:1547:1: rule__CIntchannel__Group__4 : rule__CIntchannel__Group__4__Impl rule__CIntchannel__Group__5 ;
    public final void rule__CIntchannel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1551:1: ( rule__CIntchannel__Group__4__Impl rule__CIntchannel__Group__5 )
            // InternalXdstmdata.g:1552:2: rule__CIntchannel__Group__4__Impl rule__CIntchannel__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__CIntchannel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CIntchannel__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CIntchannel__Group__4"


    // $ANTLR start "rule__CIntchannel__Group__4__Impl"
    // InternalXdstmdata.g:1559:1: rule__CIntchannel__Group__4__Impl : ( ( rule__CIntchannel__BoundAssignment_4 ) ) ;
    public final void rule__CIntchannel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1563:1: ( ( ( rule__CIntchannel__BoundAssignment_4 ) ) )
            // InternalXdstmdata.g:1564:1: ( ( rule__CIntchannel__BoundAssignment_4 ) )
            {
            // InternalXdstmdata.g:1564:1: ( ( rule__CIntchannel__BoundAssignment_4 ) )
            // InternalXdstmdata.g:1565:2: ( rule__CIntchannel__BoundAssignment_4 )
            {
             before(grammarAccess.getCIntchannelAccess().getBoundAssignment_4()); 
            // InternalXdstmdata.g:1566:2: ( rule__CIntchannel__BoundAssignment_4 )
            // InternalXdstmdata.g:1566:3: rule__CIntchannel__BoundAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__CIntchannel__BoundAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCIntchannelAccess().getBoundAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CIntchannel__Group__4__Impl"


    // $ANTLR start "rule__CIntchannel__Group__5"
    // InternalXdstmdata.g:1574:1: rule__CIntchannel__Group__5 : rule__CIntchannel__Group__5__Impl rule__CIntchannel__Group__6 ;
    public final void rule__CIntchannel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1578:1: ( rule__CIntchannel__Group__5__Impl rule__CIntchannel__Group__6 )
            // InternalXdstmdata.g:1579:2: rule__CIntchannel__Group__5__Impl rule__CIntchannel__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__CIntchannel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CIntchannel__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CIntchannel__Group__5"


    // $ANTLR start "rule__CIntchannel__Group__5__Impl"
    // InternalXdstmdata.g:1586:1: rule__CIntchannel__Group__5__Impl : ( ']' ) ;
    public final void rule__CIntchannel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1590:1: ( ( ']' ) )
            // InternalXdstmdata.g:1591:1: ( ']' )
            {
            // InternalXdstmdata.g:1591:1: ( ']' )
            // InternalXdstmdata.g:1592:2: ']'
            {
             before(grammarAccess.getCIntchannelAccess().getRightSquareBracketKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCIntchannelAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CIntchannel__Group__5__Impl"


    // $ANTLR start "rule__CIntchannel__Group__6"
    // InternalXdstmdata.g:1601:1: rule__CIntchannel__Group__6 : rule__CIntchannel__Group__6__Impl rule__CIntchannel__Group__7 ;
    public final void rule__CIntchannel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1605:1: ( rule__CIntchannel__Group__6__Impl rule__CIntchannel__Group__7 )
            // InternalXdstmdata.g:1606:2: rule__CIntchannel__Group__6__Impl rule__CIntchannel__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__CIntchannel__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CIntchannel__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CIntchannel__Group__6"


    // $ANTLR start "rule__CIntchannel__Group__6__Impl"
    // InternalXdstmdata.g:1613:1: rule__CIntchannel__Group__6__Impl : ( 'of' ) ;
    public final void rule__CIntchannel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1617:1: ( ( 'of' ) )
            // InternalXdstmdata.g:1618:1: ( 'of' )
            {
            // InternalXdstmdata.g:1618:1: ( 'of' )
            // InternalXdstmdata.g:1619:2: 'of'
            {
             before(grammarAccess.getCIntchannelAccess().getOfKeyword_6()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCIntchannelAccess().getOfKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CIntchannel__Group__6__Impl"


    // $ANTLR start "rule__CIntchannel__Group__7"
    // InternalXdstmdata.g:1628:1: rule__CIntchannel__Group__7 : rule__CIntchannel__Group__7__Impl rule__CIntchannel__Group__8 ;
    public final void rule__CIntchannel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1632:1: ( rule__CIntchannel__Group__7__Impl rule__CIntchannel__Group__8 )
            // InternalXdstmdata.g:1633:2: rule__CIntchannel__Group__7__Impl rule__CIntchannel__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__CIntchannel__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CIntchannel__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CIntchannel__Group__7"


    // $ANTLR start "rule__CIntchannel__Group__7__Impl"
    // InternalXdstmdata.g:1640:1: rule__CIntchannel__Group__7__Impl : ( ( rule__CIntchannel__Alternatives_7 ) ) ;
    public final void rule__CIntchannel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1644:1: ( ( ( rule__CIntchannel__Alternatives_7 ) ) )
            // InternalXdstmdata.g:1645:1: ( ( rule__CIntchannel__Alternatives_7 ) )
            {
            // InternalXdstmdata.g:1645:1: ( ( rule__CIntchannel__Alternatives_7 ) )
            // InternalXdstmdata.g:1646:2: ( rule__CIntchannel__Alternatives_7 )
            {
             before(grammarAccess.getCIntchannelAccess().getAlternatives_7()); 
            // InternalXdstmdata.g:1647:2: ( rule__CIntchannel__Alternatives_7 )
            // InternalXdstmdata.g:1647:3: rule__CIntchannel__Alternatives_7
            {
            pushFollow(FOLLOW_2);
            rule__CIntchannel__Alternatives_7();

            state._fsp--;


            }

             after(grammarAccess.getCIntchannelAccess().getAlternatives_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CIntchannel__Group__7__Impl"


    // $ANTLR start "rule__CIntchannel__Group__8"
    // InternalXdstmdata.g:1655:1: rule__CIntchannel__Group__8 : rule__CIntchannel__Group__8__Impl ;
    public final void rule__CIntchannel__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1659:1: ( rule__CIntchannel__Group__8__Impl )
            // InternalXdstmdata.g:1660:2: rule__CIntchannel__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CIntchannel__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CIntchannel__Group__8"


    // $ANTLR start "rule__CIntchannel__Group__8__Impl"
    // InternalXdstmdata.g:1666:1: rule__CIntchannel__Group__8__Impl : ( ';' ) ;
    public final void rule__CIntchannel__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1670:1: ( ( ';' ) )
            // InternalXdstmdata.g:1671:1: ( ';' )
            {
            // InternalXdstmdata.g:1671:1: ( ';' )
            // InternalXdstmdata.g:1672:2: ';'
            {
             before(grammarAccess.getCIntchannelAccess().getSemicolonKeyword_8()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCIntchannelAccess().getSemicolonKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CIntchannel__Group__8__Impl"


    // $ANTLR start "rule__CExtchannel__Group__0"
    // InternalXdstmdata.g:1682:1: rule__CExtchannel__Group__0 : rule__CExtchannel__Group__0__Impl rule__CExtchannel__Group__1 ;
    public final void rule__CExtchannel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1686:1: ( rule__CExtchannel__Group__0__Impl rule__CExtchannel__Group__1 )
            // InternalXdstmdata.g:1687:2: rule__CExtchannel__Group__0__Impl rule__CExtchannel__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__CExtchannel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CExtchannel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CExtchannel__Group__0"


    // $ANTLR start "rule__CExtchannel__Group__0__Impl"
    // InternalXdstmdata.g:1694:1: rule__CExtchannel__Group__0__Impl : ( 'Chn' ) ;
    public final void rule__CExtchannel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1698:1: ( ( 'Chn' ) )
            // InternalXdstmdata.g:1699:1: ( 'Chn' )
            {
            // InternalXdstmdata.g:1699:1: ( 'Chn' )
            // InternalXdstmdata.g:1700:2: 'Chn'
            {
             before(grammarAccess.getCExtchannelAccess().getChnKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCExtchannelAccess().getChnKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CExtchannel__Group__0__Impl"


    // $ANTLR start "rule__CExtchannel__Group__1"
    // InternalXdstmdata.g:1709:1: rule__CExtchannel__Group__1 : rule__CExtchannel__Group__1__Impl rule__CExtchannel__Group__2 ;
    public final void rule__CExtchannel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1713:1: ( rule__CExtchannel__Group__1__Impl rule__CExtchannel__Group__2 )
            // InternalXdstmdata.g:1714:2: rule__CExtchannel__Group__1__Impl rule__CExtchannel__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__CExtchannel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CExtchannel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CExtchannel__Group__1"


    // $ANTLR start "rule__CExtchannel__Group__1__Impl"
    // InternalXdstmdata.g:1721:1: rule__CExtchannel__Group__1__Impl : ( 'external' ) ;
    public final void rule__CExtchannel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1725:1: ( ( 'external' ) )
            // InternalXdstmdata.g:1726:1: ( 'external' )
            {
            // InternalXdstmdata.g:1726:1: ( 'external' )
            // InternalXdstmdata.g:1727:2: 'external'
            {
             before(grammarAccess.getCExtchannelAccess().getExternalKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCExtchannelAccess().getExternalKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CExtchannel__Group__1__Impl"


    // $ANTLR start "rule__CExtchannel__Group__2"
    // InternalXdstmdata.g:1736:1: rule__CExtchannel__Group__2 : rule__CExtchannel__Group__2__Impl rule__CExtchannel__Group__3 ;
    public final void rule__CExtchannel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1740:1: ( rule__CExtchannel__Group__2__Impl rule__CExtchannel__Group__3 )
            // InternalXdstmdata.g:1741:2: rule__CExtchannel__Group__2__Impl rule__CExtchannel__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__CExtchannel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CExtchannel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CExtchannel__Group__2"


    // $ANTLR start "rule__CExtchannel__Group__2__Impl"
    // InternalXdstmdata.g:1748:1: rule__CExtchannel__Group__2__Impl : ( ( rule__CExtchannel__NameAssignment_2 ) ) ;
    public final void rule__CExtchannel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1752:1: ( ( ( rule__CExtchannel__NameAssignment_2 ) ) )
            // InternalXdstmdata.g:1753:1: ( ( rule__CExtchannel__NameAssignment_2 ) )
            {
            // InternalXdstmdata.g:1753:1: ( ( rule__CExtchannel__NameAssignment_2 ) )
            // InternalXdstmdata.g:1754:2: ( rule__CExtchannel__NameAssignment_2 )
            {
             before(grammarAccess.getCExtchannelAccess().getNameAssignment_2()); 
            // InternalXdstmdata.g:1755:2: ( rule__CExtchannel__NameAssignment_2 )
            // InternalXdstmdata.g:1755:3: rule__CExtchannel__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CExtchannel__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCExtchannelAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CExtchannel__Group__2__Impl"


    // $ANTLR start "rule__CExtchannel__Group__3"
    // InternalXdstmdata.g:1763:1: rule__CExtchannel__Group__3 : rule__CExtchannel__Group__3__Impl rule__CExtchannel__Group__4 ;
    public final void rule__CExtchannel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1767:1: ( rule__CExtchannel__Group__3__Impl rule__CExtchannel__Group__4 )
            // InternalXdstmdata.g:1768:2: rule__CExtchannel__Group__3__Impl rule__CExtchannel__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__CExtchannel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CExtchannel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CExtchannel__Group__3"


    // $ANTLR start "rule__CExtchannel__Group__3__Impl"
    // InternalXdstmdata.g:1775:1: rule__CExtchannel__Group__3__Impl : ( 'of' ) ;
    public final void rule__CExtchannel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1779:1: ( ( 'of' ) )
            // InternalXdstmdata.g:1780:1: ( 'of' )
            {
            // InternalXdstmdata.g:1780:1: ( 'of' )
            // InternalXdstmdata.g:1781:2: 'of'
            {
             before(grammarAccess.getCExtchannelAccess().getOfKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCExtchannelAccess().getOfKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CExtchannel__Group__3__Impl"


    // $ANTLR start "rule__CExtchannel__Group__4"
    // InternalXdstmdata.g:1790:1: rule__CExtchannel__Group__4 : rule__CExtchannel__Group__4__Impl rule__CExtchannel__Group__5 ;
    public final void rule__CExtchannel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1794:1: ( rule__CExtchannel__Group__4__Impl rule__CExtchannel__Group__5 )
            // InternalXdstmdata.g:1795:2: rule__CExtchannel__Group__4__Impl rule__CExtchannel__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__CExtchannel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CExtchannel__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CExtchannel__Group__4"


    // $ANTLR start "rule__CExtchannel__Group__4__Impl"
    // InternalXdstmdata.g:1802:1: rule__CExtchannel__Group__4__Impl : ( ( rule__CExtchannel__Alternatives_4 ) ) ;
    public final void rule__CExtchannel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1806:1: ( ( ( rule__CExtchannel__Alternatives_4 ) ) )
            // InternalXdstmdata.g:1807:1: ( ( rule__CExtchannel__Alternatives_4 ) )
            {
            // InternalXdstmdata.g:1807:1: ( ( rule__CExtchannel__Alternatives_4 ) )
            // InternalXdstmdata.g:1808:2: ( rule__CExtchannel__Alternatives_4 )
            {
             before(grammarAccess.getCExtchannelAccess().getAlternatives_4()); 
            // InternalXdstmdata.g:1809:2: ( rule__CExtchannel__Alternatives_4 )
            // InternalXdstmdata.g:1809:3: rule__CExtchannel__Alternatives_4
            {
            pushFollow(FOLLOW_2);
            rule__CExtchannel__Alternatives_4();

            state._fsp--;


            }

             after(grammarAccess.getCExtchannelAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CExtchannel__Group__4__Impl"


    // $ANTLR start "rule__CExtchannel__Group__5"
    // InternalXdstmdata.g:1817:1: rule__CExtchannel__Group__5 : rule__CExtchannel__Group__5__Impl ;
    public final void rule__CExtchannel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1821:1: ( rule__CExtchannel__Group__5__Impl )
            // InternalXdstmdata.g:1822:2: rule__CExtchannel__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CExtchannel__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CExtchannel__Group__5"


    // $ANTLR start "rule__CExtchannel__Group__5__Impl"
    // InternalXdstmdata.g:1828:1: rule__CExtchannel__Group__5__Impl : ( ';' ) ;
    public final void rule__CExtchannel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1832:1: ( ( ';' ) )
            // InternalXdstmdata.g:1833:1: ( ';' )
            {
            // InternalXdstmdata.g:1833:1: ( ';' )
            // InternalXdstmdata.g:1834:2: ';'
            {
             before(grammarAccess.getCExtchannelAccess().getSemicolonKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCExtchannelAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CExtchannel__Group__5__Impl"


    // $ANTLR start "rule__VVariable__Group__0"
    // InternalXdstmdata.g:1844:1: rule__VVariable__Group__0 : rule__VVariable__Group__0__Impl rule__VVariable__Group__1 ;
    public final void rule__VVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1848:1: ( rule__VVariable__Group__0__Impl rule__VVariable__Group__1 )
            // InternalXdstmdata.g:1849:2: rule__VVariable__Group__0__Impl rule__VVariable__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__VVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VVariable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VVariable__Group__0"


    // $ANTLR start "rule__VVariable__Group__0__Impl"
    // InternalXdstmdata.g:1856:1: rule__VVariable__Group__0__Impl : ( ( rule__VVariable__Alternatives_0 ) ) ;
    public final void rule__VVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1860:1: ( ( ( rule__VVariable__Alternatives_0 ) ) )
            // InternalXdstmdata.g:1861:1: ( ( rule__VVariable__Alternatives_0 ) )
            {
            // InternalXdstmdata.g:1861:1: ( ( rule__VVariable__Alternatives_0 ) )
            // InternalXdstmdata.g:1862:2: ( rule__VVariable__Alternatives_0 )
            {
             before(grammarAccess.getVVariableAccess().getAlternatives_0()); 
            // InternalXdstmdata.g:1863:2: ( rule__VVariable__Alternatives_0 )
            // InternalXdstmdata.g:1863:3: rule__VVariable__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__VVariable__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getVVariableAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VVariable__Group__0__Impl"


    // $ANTLR start "rule__VVariable__Group__1"
    // InternalXdstmdata.g:1871:1: rule__VVariable__Group__1 : rule__VVariable__Group__1__Impl rule__VVariable__Group__2 ;
    public final void rule__VVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1875:1: ( rule__VVariable__Group__1__Impl rule__VVariable__Group__2 )
            // InternalXdstmdata.g:1876:2: rule__VVariable__Group__1__Impl rule__VVariable__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__VVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VVariable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VVariable__Group__1"


    // $ANTLR start "rule__VVariable__Group__1__Impl"
    // InternalXdstmdata.g:1883:1: rule__VVariable__Group__1__Impl : ( ( rule__VVariable__NameAssignment_1 ) ) ;
    public final void rule__VVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1887:1: ( ( ( rule__VVariable__NameAssignment_1 ) ) )
            // InternalXdstmdata.g:1888:1: ( ( rule__VVariable__NameAssignment_1 ) )
            {
            // InternalXdstmdata.g:1888:1: ( ( rule__VVariable__NameAssignment_1 ) )
            // InternalXdstmdata.g:1889:2: ( rule__VVariable__NameAssignment_1 )
            {
             before(grammarAccess.getVVariableAccess().getNameAssignment_1()); 
            // InternalXdstmdata.g:1890:2: ( rule__VVariable__NameAssignment_1 )
            // InternalXdstmdata.g:1890:3: rule__VVariable__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VVariable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVVariableAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VVariable__Group__1__Impl"


    // $ANTLR start "rule__VVariable__Group__2"
    // InternalXdstmdata.g:1898:1: rule__VVariable__Group__2 : rule__VVariable__Group__2__Impl ;
    public final void rule__VVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1902:1: ( rule__VVariable__Group__2__Impl )
            // InternalXdstmdata.g:1903:2: rule__VVariable__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VVariable__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VVariable__Group__2"


    // $ANTLR start "rule__VVariable__Group__2__Impl"
    // InternalXdstmdata.g:1909:1: rule__VVariable__Group__2__Impl : ( ';' ) ;
    public final void rule__VVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1913:1: ( ( ';' ) )
            // InternalXdstmdata.g:1914:1: ( ';' )
            {
            // InternalXdstmdata.g:1914:1: ( ';' )
            // InternalXdstmdata.g:1915:2: ';'
            {
             before(grammarAccess.getVVariableAccess().getSemicolonKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getVVariableAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VVariable__Group__2__Impl"


    // $ANTLR start "rule__TTypes__TEnumAssignment_0_0"
    // InternalXdstmdata.g:1925:1: rule__TTypes__TEnumAssignment_0_0 : ( ruletEnum ) ;
    public final void rule__TTypes__TEnumAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1929:1: ( ( ruletEnum ) )
            // InternalXdstmdata.g:1930:2: ( ruletEnum )
            {
            // InternalXdstmdata.g:1930:2: ( ruletEnum )
            // InternalXdstmdata.g:1931:3: ruletEnum
            {
             before(grammarAccess.getTTypesAccess().getTEnumTEnumParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruletEnum();

            state._fsp--;

             after(grammarAccess.getTTypesAccess().getTEnumTEnumParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TTypes__TEnumAssignment_0_0"


    // $ANTLR start "rule__TTypes__TCompoundAssignment_0_1"
    // InternalXdstmdata.g:1940:1: rule__TTypes__TCompoundAssignment_0_1 : ( ruletCompound ) ;
    public final void rule__TTypes__TCompoundAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1944:1: ( ( ruletCompound ) )
            // InternalXdstmdata.g:1945:2: ( ruletCompound )
            {
            // InternalXdstmdata.g:1945:2: ( ruletCompound )
            // InternalXdstmdata.g:1946:3: ruletCompound
            {
             before(grammarAccess.getTTypesAccess().getTCompoundTCompoundParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruletCompound();

            state._fsp--;

             after(grammarAccess.getTTypesAccess().getTCompoundTCompoundParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TTypes__TCompoundAssignment_0_1"


    // $ANTLR start "rule__TTypes__TMultitypeAssignment_0_2"
    // InternalXdstmdata.g:1955:1: rule__TTypes__TMultitypeAssignment_0_2 : ( ruletMultitype ) ;
    public final void rule__TTypes__TMultitypeAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1959:1: ( ( ruletMultitype ) )
            // InternalXdstmdata.g:1960:2: ( ruletMultitype )
            {
            // InternalXdstmdata.g:1960:2: ( ruletMultitype )
            // InternalXdstmdata.g:1961:3: ruletMultitype
            {
             before(grammarAccess.getTTypesAccess().getTMultitypeTMultitypeParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruletMultitype();

            state._fsp--;

             after(grammarAccess.getTTypesAccess().getTMultitypeTMultitypeParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TTypes__TMultitypeAssignment_0_2"


    // $ANTLR start "rule__TTypes__CIntchannelAssignment_1_0"
    // InternalXdstmdata.g:1970:1: rule__TTypes__CIntchannelAssignment_1_0 : ( rulecIntchannel ) ;
    public final void rule__TTypes__CIntchannelAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1974:1: ( ( rulecIntchannel ) )
            // InternalXdstmdata.g:1975:2: ( rulecIntchannel )
            {
            // InternalXdstmdata.g:1975:2: ( rulecIntchannel )
            // InternalXdstmdata.g:1976:3: rulecIntchannel
            {
             before(grammarAccess.getTTypesAccess().getCIntchannelCIntchannelParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            rulecIntchannel();

            state._fsp--;

             after(grammarAccess.getTTypesAccess().getCIntchannelCIntchannelParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TTypes__CIntchannelAssignment_1_0"


    // $ANTLR start "rule__TTypes__CExtchannelAssignment_1_1"
    // InternalXdstmdata.g:1985:1: rule__TTypes__CExtchannelAssignment_1_1 : ( rulecExtchannel ) ;
    public final void rule__TTypes__CExtchannelAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:1989:1: ( ( rulecExtchannel ) )
            // InternalXdstmdata.g:1990:2: ( rulecExtchannel )
            {
            // InternalXdstmdata.g:1990:2: ( rulecExtchannel )
            // InternalXdstmdata.g:1991:3: rulecExtchannel
            {
             before(grammarAccess.getTTypesAccess().getCExtchannelCExtchannelParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulecExtchannel();

            state._fsp--;

             after(grammarAccess.getTTypesAccess().getCExtchannelCExtchannelParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TTypes__CExtchannelAssignment_1_1"


    // $ANTLR start "rule__TTypes__VVariableAssignment_1_2"
    // InternalXdstmdata.g:2000:1: rule__TTypes__VVariableAssignment_1_2 : ( rulevVariable ) ;
    public final void rule__TTypes__VVariableAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:2004:1: ( ( rulevVariable ) )
            // InternalXdstmdata.g:2005:2: ( rulevVariable )
            {
            // InternalXdstmdata.g:2005:2: ( rulevVariable )
            // InternalXdstmdata.g:2006:3: rulevVariable
            {
             before(grammarAccess.getTTypesAccess().getVVariableVVariableParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulevVariable();

            state._fsp--;

             after(grammarAccess.getTTypesAccess().getVVariableVVariableParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TTypes__VVariableAssignment_1_2"


    // $ANTLR start "rule__TEnum__NameAssignment_1"
    // InternalXdstmdata.g:2015:1: rule__TEnum__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TEnum__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:2019:1: ( ( RULE_ID ) )
            // InternalXdstmdata.g:2020:2: ( RULE_ID )
            {
            // InternalXdstmdata.g:2020:2: ( RULE_ID )
            // InternalXdstmdata.g:2021:3: RULE_ID
            {
             before(grammarAccess.getTEnumAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTEnumAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TEnum__NameAssignment_1"


    // $ANTLR start "rule__TEnum__LiteralsAssignment_3"
    // InternalXdstmdata.g:2030:1: rule__TEnum__LiteralsAssignment_3 : ( RULE_ID ) ;
    public final void rule__TEnum__LiteralsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:2034:1: ( ( RULE_ID ) )
            // InternalXdstmdata.g:2035:2: ( RULE_ID )
            {
            // InternalXdstmdata.g:2035:2: ( RULE_ID )
            // InternalXdstmdata.g:2036:3: RULE_ID
            {
             before(grammarAccess.getTEnumAccess().getLiteralsIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTEnumAccess().getLiteralsIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TEnum__LiteralsAssignment_3"


    // $ANTLR start "rule__TEnum__LiteralsAssignment_4_1"
    // InternalXdstmdata.g:2045:1: rule__TEnum__LiteralsAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__TEnum__LiteralsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:2049:1: ( ( RULE_ID ) )
            // InternalXdstmdata.g:2050:2: ( RULE_ID )
            {
            // InternalXdstmdata.g:2050:2: ( RULE_ID )
            // InternalXdstmdata.g:2051:3: RULE_ID
            {
             before(grammarAccess.getTEnumAccess().getLiteralsIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTEnumAccess().getLiteralsIDTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TEnum__LiteralsAssignment_4_1"


    // $ANTLR start "rule__TCompound__NameAssignment_1"
    // InternalXdstmdata.g:2060:1: rule__TCompound__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TCompound__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:2064:1: ( ( RULE_ID ) )
            // InternalXdstmdata.g:2065:2: ( RULE_ID )
            {
            // InternalXdstmdata.g:2065:2: ( RULE_ID )
            // InternalXdstmdata.g:2066:3: RULE_ID
            {
             before(grammarAccess.getTCompoundAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTCompoundAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TCompound__NameAssignment_1"


    // $ANTLR start "rule__TCompound__SubtypesAssignment_3"
    // InternalXdstmdata.g:2075:1: rule__TCompound__SubtypesAssignment_3 : ( rulesubtype ) ;
    public final void rule__TCompound__SubtypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:2079:1: ( ( rulesubtype ) )
            // InternalXdstmdata.g:2080:2: ( rulesubtype )
            {
            // InternalXdstmdata.g:2080:2: ( rulesubtype )
            // InternalXdstmdata.g:2081:3: rulesubtype
            {
             before(grammarAccess.getTCompoundAccess().getSubtypesSubtypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulesubtype();

            state._fsp--;

             after(grammarAccess.getTCompoundAccess().getSubtypesSubtypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TCompound__SubtypesAssignment_3"


    // $ANTLR start "rule__TCompound__SubtypesAssignment_4_1"
    // InternalXdstmdata.g:2090:1: rule__TCompound__SubtypesAssignment_4_1 : ( rulesubtype ) ;
    public final void rule__TCompound__SubtypesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:2094:1: ( ( rulesubtype ) )
            // InternalXdstmdata.g:2095:2: ( rulesubtype )
            {
            // InternalXdstmdata.g:2095:2: ( rulesubtype )
            // InternalXdstmdata.g:2096:3: rulesubtype
            {
             before(grammarAccess.getTCompoundAccess().getSubtypesSubtypeParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            rulesubtype();

            state._fsp--;

             after(grammarAccess.getTCompoundAccess().getSubtypesSubtypeParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TCompound__SubtypesAssignment_4_1"


    // $ANTLR start "rule__Subtype__TStringAssignment_0"
    // InternalXdstmdata.g:2105:1: rule__Subtype__TStringAssignment_0 : ( ( 'Int' ) ) ;
    public final void rule__Subtype__TStringAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:2109:1: ( ( ( 'Int' ) ) )
            // InternalXdstmdata.g:2110:2: ( ( 'Int' ) )
            {
            // InternalXdstmdata.g:2110:2: ( ( 'Int' ) )
            // InternalXdstmdata.g:2111:3: ( 'Int' )
            {
             before(grammarAccess.getSubtypeAccess().getTStringIntKeyword_0_0()); 
            // InternalXdstmdata.g:2112:3: ( 'Int' )
            // InternalXdstmdata.g:2113:4: 'Int'
            {
             before(grammarAccess.getSubtypeAccess().getTStringIntKeyword_0_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSubtypeAccess().getTStringIntKeyword_0_0()); 

            }

             after(grammarAccess.getSubtypeAccess().getTStringIntKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtype__TStringAssignment_0"


    // $ANTLR start "rule__Subtype__TStringAssignment_1"
    // InternalXdstmdata.g:2124:1: rule__Subtype__TStringAssignment_1 : ( ( 'Bool' ) ) ;
    public final void rule__Subtype__TStringAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:2128:1: ( ( ( 'Bool' ) ) )
            // InternalXdstmdata.g:2129:2: ( ( 'Bool' ) )
            {
            // InternalXdstmdata.g:2129:2: ( ( 'Bool' ) )
            // InternalXdstmdata.g:2130:3: ( 'Bool' )
            {
             before(grammarAccess.getSubtypeAccess().getTStringBoolKeyword_1_0()); 
            // InternalXdstmdata.g:2131:3: ( 'Bool' )
            // InternalXdstmdata.g:2132:4: 'Bool'
            {
             before(grammarAccess.getSubtypeAccess().getTStringBoolKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSubtypeAccess().getTStringBoolKeyword_1_0()); 

            }

             after(grammarAccess.getSubtypeAccess().getTStringBoolKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtype__TStringAssignment_1"


    // $ANTLR start "rule__Subtype__TChnAssignment_2"
    // InternalXdstmdata.g:2143:1: rule__Subtype__TChnAssignment_2 : ( rulechannel_specifier ) ;
    public final void rule__Subtype__TChnAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:2147:1: ( ( rulechannel_specifier ) )
            // InternalXdstmdata.g:2148:2: ( rulechannel_specifier )
            {
            // InternalXdstmdata.g:2148:2: ( rulechannel_specifier )
            // InternalXdstmdata.g:2149:3: rulechannel_specifier
            {
             before(grammarAccess.getSubtypeAccess().getTChnChannel_specifierParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulechannel_specifier();

            state._fsp--;

             after(grammarAccess.getSubtypeAccess().getTChnChannel_specifierParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtype__TChnAssignment_2"


    // $ANTLR start "rule__Subtype__TIDAssignment_3"
    // InternalXdstmdata.g:2158:1: rule__Subtype__TIDAssignment_3 : ( RULE_ID ) ;
    public final void rule__Subtype__TIDAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:2162:1: ( ( RULE_ID ) )
            // InternalXdstmdata.g:2163:2: ( RULE_ID )
            {
            // InternalXdstmdata.g:2163:2: ( RULE_ID )
            // InternalXdstmdata.g:2164:3: RULE_ID
            {
             before(grammarAccess.getSubtypeAccess().getTIDIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSubtypeAccess().getTIDIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtype__TIDAssignment_3"


    // $ANTLR start "rule__Channel_specifier__TypeAssignment_0_2"
    // InternalXdstmdata.g:2173:1: rule__Channel_specifier__TypeAssignment_0_2 : ( RULE_ID ) ;
    public final void rule__Channel_specifier__TypeAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:2177:1: ( ( RULE_ID ) )
            // InternalXdstmdata.g:2178:2: ( RULE_ID )
            {
            // InternalXdstmdata.g:2178:2: ( RULE_ID )
            // InternalXdstmdata.g:2179:3: RULE_ID
            {
             before(grammarAccess.getChannel_specifierAccess().getTypeIDTerminalRuleCall_0_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getChannel_specifierAccess().getTypeIDTerminalRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel_specifier__TypeAssignment_0_2"


    // $ANTLR start "rule__TMultitype__NameAssignment_1"
    // InternalXdstmdata.g:2188:1: rule__TMultitype__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TMultitype__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:2192:1: ( ( RULE_ID ) )
            // InternalXdstmdata.g:2193:2: ( RULE_ID )
            {
            // InternalXdstmdata.g:2193:2: ( RULE_ID )
            // InternalXdstmdata.g:2194:3: RULE_ID
            {
             before(grammarAccess.getTMultitypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTMultitypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMultitype__NameAssignment_1"


    // $ANTLR start "rule__TMultitype__ComposingtypesAssignment_3"
    // InternalXdstmdata.g:2203:1: rule__TMultitype__ComposingtypesAssignment_3 : ( rulecomposingtype ) ;
    public final void rule__TMultitype__ComposingtypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:2207:1: ( ( rulecomposingtype ) )
            // InternalXdstmdata.g:2208:2: ( rulecomposingtype )
            {
            // InternalXdstmdata.g:2208:2: ( rulecomposingtype )
            // InternalXdstmdata.g:2209:3: rulecomposingtype
            {
             before(grammarAccess.getTMultitypeAccess().getComposingtypesComposingtypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulecomposingtype();

            state._fsp--;

             after(grammarAccess.getTMultitypeAccess().getComposingtypesComposingtypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMultitype__ComposingtypesAssignment_3"


    // $ANTLR start "rule__TMultitype__ComposingtypesAssignment_4_1"
    // InternalXdstmdata.g:2218:1: rule__TMultitype__ComposingtypesAssignment_4_1 : ( rulecomposingtype ) ;
    public final void rule__TMultitype__ComposingtypesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:2222:1: ( ( rulecomposingtype ) )
            // InternalXdstmdata.g:2223:2: ( rulecomposingtype )
            {
            // InternalXdstmdata.g:2223:2: ( rulecomposingtype )
            // InternalXdstmdata.g:2224:3: rulecomposingtype
            {
             before(grammarAccess.getTMultitypeAccess().getComposingtypesComposingtypeParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            rulecomposingtype();

            state._fsp--;

             after(grammarAccess.getTMultitypeAccess().getComposingtypesComposingtypeParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TMultitype__ComposingtypesAssignment_4_1"


    // $ANTLR start "rule__Composingtype__TStringAssignment_0"
    // InternalXdstmdata.g:2233:1: rule__Composingtype__TStringAssignment_0 : ( ( 'Int' ) ) ;
    public final void rule__Composingtype__TStringAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:2237:1: ( ( ( 'Int' ) ) )
            // InternalXdstmdata.g:2238:2: ( ( 'Int' ) )
            {
            // InternalXdstmdata.g:2238:2: ( ( 'Int' ) )
            // InternalXdstmdata.g:2239:3: ( 'Int' )
            {
             before(grammarAccess.getComposingtypeAccess().getTStringIntKeyword_0_0()); 
            // InternalXdstmdata.g:2240:3: ( 'Int' )
            // InternalXdstmdata.g:2241:4: 'Int'
            {
             before(grammarAccess.getComposingtypeAccess().getTStringIntKeyword_0_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getComposingtypeAccess().getTStringIntKeyword_0_0()); 

            }

             after(grammarAccess.getComposingtypeAccess().getTStringIntKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composingtype__TStringAssignment_0"


    // $ANTLR start "rule__Composingtype__TStringAssignment_1"
    // InternalXdstmdata.g:2252:1: rule__Composingtype__TStringAssignment_1 : ( ( 'Bool' ) ) ;
    public final void rule__Composingtype__TStringAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:2256:1: ( ( ( 'Bool' ) ) )
            // InternalXdstmdata.g:2257:2: ( ( 'Bool' ) )
            {
            // InternalXdstmdata.g:2257:2: ( ( 'Bool' ) )
            // InternalXdstmdata.g:2258:3: ( 'Bool' )
            {
             before(grammarAccess.getComposingtypeAccess().getTStringBoolKeyword_1_0()); 
            // InternalXdstmdata.g:2259:3: ( 'Bool' )
            // InternalXdstmdata.g:2260:4: 'Bool'
            {
             before(grammarAccess.getComposingtypeAccess().getTStringBoolKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getComposingtypeAccess().getTStringBoolKeyword_1_0()); 

            }

             after(grammarAccess.getComposingtypeAccess().getTStringBoolKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composingtype__TStringAssignment_1"


    // $ANTLR start "rule__Composingtype__TChnAssignment_2"
    // InternalXdstmdata.g:2271:1: rule__Composingtype__TChnAssignment_2 : ( rulechannel_specifier ) ;
    public final void rule__Composingtype__TChnAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:2275:1: ( ( rulechannel_specifier ) )
            // InternalXdstmdata.g:2276:2: ( rulechannel_specifier )
            {
            // InternalXdstmdata.g:2276:2: ( rulechannel_specifier )
            // InternalXdstmdata.g:2277:3: rulechannel_specifier
            {
             before(grammarAccess.getComposingtypeAccess().getTChnChannel_specifierParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulechannel_specifier();

            state._fsp--;

             after(grammarAccess.getComposingtypeAccess().getTChnChannel_specifierParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composingtype__TChnAssignment_2"


    // $ANTLR start "rule__Composingtype__TIDAssignment_3"
    // InternalXdstmdata.g:2286:1: rule__Composingtype__TIDAssignment_3 : ( RULE_ID ) ;
    public final void rule__Composingtype__TIDAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:2290:1: ( ( RULE_ID ) )
            // InternalXdstmdata.g:2291:2: ( RULE_ID )
            {
            // InternalXdstmdata.g:2291:2: ( RULE_ID )
            // InternalXdstmdata.g:2292:3: RULE_ID
            {
             before(grammarAccess.getComposingtypeAccess().getTIDIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComposingtypeAccess().getTIDIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composingtype__TIDAssignment_3"


    // $ANTLR start "rule__CIntchannel__NameAssignment_2"
    // InternalXdstmdata.g:2301:1: rule__CIntchannel__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__CIntchannel__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:2305:1: ( ( RULE_ID ) )
            // InternalXdstmdata.g:2306:2: ( RULE_ID )
            {
            // InternalXdstmdata.g:2306:2: ( RULE_ID )
            // InternalXdstmdata.g:2307:3: RULE_ID
            {
             before(grammarAccess.getCIntchannelAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCIntchannelAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CIntchannel__NameAssignment_2"


    // $ANTLR start "rule__CIntchannel__BoundAssignment_4"
    // InternalXdstmdata.g:2316:1: rule__CIntchannel__BoundAssignment_4 : ( RULE_INT ) ;
    public final void rule__CIntchannel__BoundAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:2320:1: ( ( RULE_INT ) )
            // InternalXdstmdata.g:2321:2: ( RULE_INT )
            {
            // InternalXdstmdata.g:2321:2: ( RULE_INT )
            // InternalXdstmdata.g:2322:3: RULE_INT
            {
             before(grammarAccess.getCIntchannelAccess().getBoundINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCIntchannelAccess().getBoundINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CIntchannel__BoundAssignment_4"


    // $ANTLR start "rule__CIntchannel__TStringAssignment_7_0"
    // InternalXdstmdata.g:2331:1: rule__CIntchannel__TStringAssignment_7_0 : ( ( 'Int' ) ) ;
    public final void rule__CIntchannel__TStringAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:2335:1: ( ( ( 'Int' ) ) )
            // InternalXdstmdata.g:2336:2: ( ( 'Int' ) )
            {
            // InternalXdstmdata.g:2336:2: ( ( 'Int' ) )
            // InternalXdstmdata.g:2337:3: ( 'Int' )
            {
             before(grammarAccess.getCIntchannelAccess().getTStringIntKeyword_7_0_0()); 
            // InternalXdstmdata.g:2338:3: ( 'Int' )
            // InternalXdstmdata.g:2339:4: 'Int'
            {
             before(grammarAccess.getCIntchannelAccess().getTStringIntKeyword_7_0_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCIntchannelAccess().getTStringIntKeyword_7_0_0()); 

            }

             after(grammarAccess.getCIntchannelAccess().getTStringIntKeyword_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CIntchannel__TStringAssignment_7_0"


    // $ANTLR start "rule__CIntchannel__TStringAssignment_7_1"
    // InternalXdstmdata.g:2350:1: rule__CIntchannel__TStringAssignment_7_1 : ( ( 'Bool' ) ) ;
    public final void rule__CIntchannel__TStringAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:2354:1: ( ( ( 'Bool' ) ) )
            // InternalXdstmdata.g:2355:2: ( ( 'Bool' ) )
            {
            // InternalXdstmdata.g:2355:2: ( ( 'Bool' ) )
            // InternalXdstmdata.g:2356:3: ( 'Bool' )
            {
             before(grammarAccess.getCIntchannelAccess().getTStringBoolKeyword_7_1_0()); 
            // InternalXdstmdata.g:2357:3: ( 'Bool' )
            // InternalXdstmdata.g:2358:4: 'Bool'
            {
             before(grammarAccess.getCIntchannelAccess().getTStringBoolKeyword_7_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCIntchannelAccess().getTStringBoolKeyword_7_1_0()); 

            }

             after(grammarAccess.getCIntchannelAccess().getTStringBoolKeyword_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CIntchannel__TStringAssignment_7_1"


    // $ANTLR start "rule__CIntchannel__TChnAssignment_7_2"
    // InternalXdstmdata.g:2369:1: rule__CIntchannel__TChnAssignment_7_2 : ( rulechannel_specifier ) ;
    public final void rule__CIntchannel__TChnAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:2373:1: ( ( rulechannel_specifier ) )
            // InternalXdstmdata.g:2374:2: ( rulechannel_specifier )
            {
            // InternalXdstmdata.g:2374:2: ( rulechannel_specifier )
            // InternalXdstmdata.g:2375:3: rulechannel_specifier
            {
             before(grammarAccess.getCIntchannelAccess().getTChnChannel_specifierParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            rulechannel_specifier();

            state._fsp--;

             after(grammarAccess.getCIntchannelAccess().getTChnChannel_specifierParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CIntchannel__TChnAssignment_7_2"


    // $ANTLR start "rule__CIntchannel__TIDAssignment_7_3"
    // InternalXdstmdata.g:2384:1: rule__CIntchannel__TIDAssignment_7_3 : ( RULE_ID ) ;
    public final void rule__CIntchannel__TIDAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:2388:1: ( ( RULE_ID ) )
            // InternalXdstmdata.g:2389:2: ( RULE_ID )
            {
            // InternalXdstmdata.g:2389:2: ( RULE_ID )
            // InternalXdstmdata.g:2390:3: RULE_ID
            {
             before(grammarAccess.getCIntchannelAccess().getTIDIDTerminalRuleCall_7_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCIntchannelAccess().getTIDIDTerminalRuleCall_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CIntchannel__TIDAssignment_7_3"


    // $ANTLR start "rule__CExtchannel__NameAssignment_2"
    // InternalXdstmdata.g:2399:1: rule__CExtchannel__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__CExtchannel__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:2403:1: ( ( RULE_ID ) )
            // InternalXdstmdata.g:2404:2: ( RULE_ID )
            {
            // InternalXdstmdata.g:2404:2: ( RULE_ID )
            // InternalXdstmdata.g:2405:3: RULE_ID
            {
             before(grammarAccess.getCExtchannelAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCExtchannelAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CExtchannel__NameAssignment_2"


    // $ANTLR start "rule__CExtchannel__TStringAssignment_4_0"
    // InternalXdstmdata.g:2414:1: rule__CExtchannel__TStringAssignment_4_0 : ( ( 'Int' ) ) ;
    public final void rule__CExtchannel__TStringAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:2418:1: ( ( ( 'Int' ) ) )
            // InternalXdstmdata.g:2419:2: ( ( 'Int' ) )
            {
            // InternalXdstmdata.g:2419:2: ( ( 'Int' ) )
            // InternalXdstmdata.g:2420:3: ( 'Int' )
            {
             before(grammarAccess.getCExtchannelAccess().getTStringIntKeyword_4_0_0()); 
            // InternalXdstmdata.g:2421:3: ( 'Int' )
            // InternalXdstmdata.g:2422:4: 'Int'
            {
             before(grammarAccess.getCExtchannelAccess().getTStringIntKeyword_4_0_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCExtchannelAccess().getTStringIntKeyword_4_0_0()); 

            }

             after(grammarAccess.getCExtchannelAccess().getTStringIntKeyword_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CExtchannel__TStringAssignment_4_0"


    // $ANTLR start "rule__CExtchannel__TStringAssignment_4_1"
    // InternalXdstmdata.g:2433:1: rule__CExtchannel__TStringAssignment_4_1 : ( ( 'Bool' ) ) ;
    public final void rule__CExtchannel__TStringAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:2437:1: ( ( ( 'Bool' ) ) )
            // InternalXdstmdata.g:2438:2: ( ( 'Bool' ) )
            {
            // InternalXdstmdata.g:2438:2: ( ( 'Bool' ) )
            // InternalXdstmdata.g:2439:3: ( 'Bool' )
            {
             before(grammarAccess.getCExtchannelAccess().getTStringBoolKeyword_4_1_0()); 
            // InternalXdstmdata.g:2440:3: ( 'Bool' )
            // InternalXdstmdata.g:2441:4: 'Bool'
            {
             before(grammarAccess.getCExtchannelAccess().getTStringBoolKeyword_4_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCExtchannelAccess().getTStringBoolKeyword_4_1_0()); 

            }

             after(grammarAccess.getCExtchannelAccess().getTStringBoolKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CExtchannel__TStringAssignment_4_1"


    // $ANTLR start "rule__CExtchannel__TChnAssignment_4_2"
    // InternalXdstmdata.g:2452:1: rule__CExtchannel__TChnAssignment_4_2 : ( rulechannel_specifier ) ;
    public final void rule__CExtchannel__TChnAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:2456:1: ( ( rulechannel_specifier ) )
            // InternalXdstmdata.g:2457:2: ( rulechannel_specifier )
            {
            // InternalXdstmdata.g:2457:2: ( rulechannel_specifier )
            // InternalXdstmdata.g:2458:3: rulechannel_specifier
            {
             before(grammarAccess.getCExtchannelAccess().getTChnChannel_specifierParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            rulechannel_specifier();

            state._fsp--;

             after(grammarAccess.getCExtchannelAccess().getTChnChannel_specifierParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CExtchannel__TChnAssignment_4_2"


    // $ANTLR start "rule__CExtchannel__TIDAssignment_4_3"
    // InternalXdstmdata.g:2467:1: rule__CExtchannel__TIDAssignment_4_3 : ( RULE_ID ) ;
    public final void rule__CExtchannel__TIDAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:2471:1: ( ( RULE_ID ) )
            // InternalXdstmdata.g:2472:2: ( RULE_ID )
            {
            // InternalXdstmdata.g:2472:2: ( RULE_ID )
            // InternalXdstmdata.g:2473:3: RULE_ID
            {
             before(grammarAccess.getCExtchannelAccess().getTIDIDTerminalRuleCall_4_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCExtchannelAccess().getTIDIDTerminalRuleCall_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CExtchannel__TIDAssignment_4_3"


    // $ANTLR start "rule__VVariable__TStringAssignment_0_0"
    // InternalXdstmdata.g:2482:1: rule__VVariable__TStringAssignment_0_0 : ( ( 'Int' ) ) ;
    public final void rule__VVariable__TStringAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:2486:1: ( ( ( 'Int' ) ) )
            // InternalXdstmdata.g:2487:2: ( ( 'Int' ) )
            {
            // InternalXdstmdata.g:2487:2: ( ( 'Int' ) )
            // InternalXdstmdata.g:2488:3: ( 'Int' )
            {
             before(grammarAccess.getVVariableAccess().getTStringIntKeyword_0_0_0()); 
            // InternalXdstmdata.g:2489:3: ( 'Int' )
            // InternalXdstmdata.g:2490:4: 'Int'
            {
             before(grammarAccess.getVVariableAccess().getTStringIntKeyword_0_0_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getVVariableAccess().getTStringIntKeyword_0_0_0()); 

            }

             after(grammarAccess.getVVariableAccess().getTStringIntKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VVariable__TStringAssignment_0_0"


    // $ANTLR start "rule__VVariable__TStringAssignment_0_1"
    // InternalXdstmdata.g:2501:1: rule__VVariable__TStringAssignment_0_1 : ( ( 'Bool' ) ) ;
    public final void rule__VVariable__TStringAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:2505:1: ( ( ( 'Bool' ) ) )
            // InternalXdstmdata.g:2506:2: ( ( 'Bool' ) )
            {
            // InternalXdstmdata.g:2506:2: ( ( 'Bool' ) )
            // InternalXdstmdata.g:2507:3: ( 'Bool' )
            {
             before(grammarAccess.getVVariableAccess().getTStringBoolKeyword_0_1_0()); 
            // InternalXdstmdata.g:2508:3: ( 'Bool' )
            // InternalXdstmdata.g:2509:4: 'Bool'
            {
             before(grammarAccess.getVVariableAccess().getTStringBoolKeyword_0_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getVVariableAccess().getTStringBoolKeyword_0_1_0()); 

            }

             after(grammarAccess.getVVariableAccess().getTStringBoolKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VVariable__TStringAssignment_0_1"


    // $ANTLR start "rule__VVariable__TChnAssignment_0_2"
    // InternalXdstmdata.g:2520:1: rule__VVariable__TChnAssignment_0_2 : ( rulechannel_specifier ) ;
    public final void rule__VVariable__TChnAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:2524:1: ( ( rulechannel_specifier ) )
            // InternalXdstmdata.g:2525:2: ( rulechannel_specifier )
            {
            // InternalXdstmdata.g:2525:2: ( rulechannel_specifier )
            // InternalXdstmdata.g:2526:3: rulechannel_specifier
            {
             before(grammarAccess.getVVariableAccess().getTChnChannel_specifierParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            rulechannel_specifier();

            state._fsp--;

             after(grammarAccess.getVVariableAccess().getTChnChannel_specifierParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VVariable__TChnAssignment_0_2"


    // $ANTLR start "rule__VVariable__TIDAssignment_0_3"
    // InternalXdstmdata.g:2535:1: rule__VVariable__TIDAssignment_0_3 : ( RULE_ID ) ;
    public final void rule__VVariable__TIDAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:2539:1: ( ( RULE_ID ) )
            // InternalXdstmdata.g:2540:2: ( RULE_ID )
            {
            // InternalXdstmdata.g:2540:2: ( RULE_ID )
            // InternalXdstmdata.g:2541:3: RULE_ID
            {
             before(grammarAccess.getVVariableAccess().getTIDIDTerminalRuleCall_0_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVVariableAccess().getTIDIDTerminalRuleCall_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VVariable__TIDAssignment_0_3"


    // $ANTLR start "rule__VVariable__NameAssignment_1"
    // InternalXdstmdata.g:2550:1: rule__VVariable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VVariable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXdstmdata.g:2554:1: ( ( RULE_ID ) )
            // InternalXdstmdata.g:2555:2: ( RULE_ID )
            {
            // InternalXdstmdata.g:2555:2: ( RULE_ID )
            // InternalXdstmdata.g:2556:3: RULE_ID
            {
             before(grammarAccess.getVVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVVariableAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VVariable__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000018481810L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000242002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000018481812L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000018081810L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});

}