/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.prgmdl.dstmverifier.data.analysis;

import java.util.*;
import org.prgmdl.dstmverifier.data.node.*;

public class DepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getPNotation().apply(this);
        node.getEOF().apply(this);
        outStart(node);
    }

    public void inANotation(ANotation node)
    {
        defaultIn(node);
    }

    public void outANotation(ANotation node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANotation(ANotation node)
    {
        inANotation(node);
        {
            List<PDeclaration> copy = new ArrayList<PDeclaration>(node.getDeclaration());
            for(PDeclaration e : copy)
            {
                e.apply(this);
            }
        }
        outANotation(node);
    }

    public void inAChannelDeclaration(AChannelDeclaration node)
    {
        defaultIn(node);
    }

    public void outAChannelDeclaration(AChannelDeclaration node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAChannelDeclaration(AChannelDeclaration node)
    {
        inAChannelDeclaration(node);
        if(node.getChannelDeclaration() != null)
        {
            node.getChannelDeclaration().apply(this);
        }
        if(node.getSemi() != null)
        {
            node.getSemi().apply(this);
        }
        outAChannelDeclaration(node);
    }

    public void inAEnumDeclaration(AEnumDeclaration node)
    {
        defaultIn(node);
    }

    public void outAEnumDeclaration(AEnumDeclaration node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEnumDeclaration(AEnumDeclaration node)
    {
        inAEnumDeclaration(node);
        if(node.getEnumDeclaration() != null)
        {
            node.getEnumDeclaration().apply(this);
        }
        if(node.getSemi() != null)
        {
            node.getSemi().apply(this);
        }
        outAEnumDeclaration(node);
    }

    public void inAVariableDeclaration(AVariableDeclaration node)
    {
        defaultIn(node);
    }

    public void outAVariableDeclaration(AVariableDeclaration node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVariableDeclaration(AVariableDeclaration node)
    {
        inAVariableDeclaration(node);
        if(node.getVariableDeclaration() != null)
        {
            node.getVariableDeclaration().apply(this);
        }
        if(node.getSemi() != null)
        {
            node.getSemi().apply(this);
        }
        outAVariableDeclaration(node);
    }

    public void inAParamDeclaration(AParamDeclaration node)
    {
        defaultIn(node);
    }

    public void outAParamDeclaration(AParamDeclaration node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParamDeclaration(AParamDeclaration node)
    {
        inAParamDeclaration(node);
        if(node.getParamDeclaration() != null)
        {
            node.getParamDeclaration().apply(this);
        }
        if(node.getSemi() != null)
        {
            node.getSemi().apply(this);
        }
        outAParamDeclaration(node);
    }

    public void inACompoundDeclaration(ACompoundDeclaration node)
    {
        defaultIn(node);
    }

    public void outACompoundDeclaration(ACompoundDeclaration node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACompoundDeclaration(ACompoundDeclaration node)
    {
        inACompoundDeclaration(node);
        if(node.getCompoundDeclaration() != null)
        {
            node.getCompoundDeclaration().apply(this);
        }
        if(node.getSemi() != null)
        {
            node.getSemi().apply(this);
        }
        outACompoundDeclaration(node);
    }

    public void inAMultitypeDeclaration(AMultitypeDeclaration node)
    {
        defaultIn(node);
    }

    public void outAMultitypeDeclaration(AMultitypeDeclaration node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultitypeDeclaration(AMultitypeDeclaration node)
    {
        inAMultitypeDeclaration(node);
        if(node.getMultitypeDeclaration() != null)
        {
            node.getMultitypeDeclaration().apply(this);
        }
        if(node.getSemi() != null)
        {
            node.getSemi().apply(this);
        }
        outAMultitypeDeclaration(node);
    }

    public void inAIntVarType(AIntVarType node)
    {
        defaultIn(node);
    }

    public void outAIntVarType(AIntVarType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIntVarType(AIntVarType node)
    {
        inAIntVarType(node);
        if(node.getInt() != null)
        {
            node.getInt().apply(this);
        }
        outAIntVarType(node);
    }

    public void inABoolVarType(ABoolVarType node)
    {
        defaultIn(node);
    }

    public void outABoolVarType(ABoolVarType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABoolVarType(ABoolVarType node)
    {
        inABoolVarType(node);
        if(node.getBool() != null)
        {
            node.getBool().apply(this);
        }
        outABoolVarType(node);
    }

    public void inAENameVarType(AENameVarType node)
    {
        defaultIn(node);
    }

    public void outAENameVarType(AENameVarType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAENameVarType(AENameVarType node)
    {
        inAENameVarType(node);
        if(node.getENameUse() != null)
        {
            node.getENameUse().apply(this);
        }
        outAENameVarType(node);
    }

    public void inAChantVarType(AChantVarType node)
    {
        defaultIn(node);
    }

    public void outAChantVarType(AChantVarType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAChantVarType(AChantVarType node)
    {
        inAChantVarType(node);
        if(node.getChan() != null)
        {
            node.getChan().apply(this);
        }
        if(node.getLBkt() != null)
        {
            node.getLBkt().apply(this);
        }
        if(node.getDefined() != null)
        {
            node.getDefined().apply(this);
        }
        if(node.getRBkt() != null)
        {
            node.getRBkt().apply(this);
        }
        outAChantVarType(node);
    }

    public void inAChanVarType(AChanVarType node)
    {
        defaultIn(node);
    }

    public void outAChanVarType(AChanVarType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAChanVarType(AChanVarType node)
    {
        inAChanVarType(node);
        if(node.getChan() != null)
        {
            node.getChan().apply(this);
        }
        outAChanVarType(node);
    }

    public void inAIntBasic(AIntBasic node)
    {
        defaultIn(node);
    }

    public void outAIntBasic(AIntBasic node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIntBasic(AIntBasic node)
    {
        inAIntBasic(node);
        if(node.getInt() != null)
        {
            node.getInt().apply(this);
        }
        outAIntBasic(node);
    }

    public void inABoolBasic(ABoolBasic node)
    {
        defaultIn(node);
    }

    public void outABoolBasic(ABoolBasic node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABoolBasic(ABoolBasic node)
    {
        inABoolBasic(node);
        if(node.getBool() != null)
        {
            node.getBool().apply(this);
        }
        outABoolBasic(node);
    }

    public void inAENameBasic(AENameBasic node)
    {
        defaultIn(node);
    }

    public void outAENameBasic(AENameBasic node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAENameBasic(AENameBasic node)
    {
        inAENameBasic(node);
        if(node.getENameUse() != null)
        {
            node.getENameUse().apply(this);
        }
        outAENameBasic(node);
    }

    public void inAChantBasic(AChantBasic node)
    {
        defaultIn(node);
    }

    public void outAChantBasic(AChantBasic node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAChantBasic(AChantBasic node)
    {
        inAChantBasic(node);
        if(node.getChan() != null)
        {
            node.getChan().apply(this);
        }
        if(node.getLBkt() != null)
        {
            node.getLBkt().apply(this);
        }
        if(node.getDefined() != null)
        {
            node.getDefined().apply(this);
        }
        if(node.getRBkt() != null)
        {
            node.getRBkt().apply(this);
        }
        outAChantBasic(node);
    }

    public void inAChanBasic(AChanBasic node)
    {
        defaultIn(node);
    }

    public void outAChanBasic(AChanBasic node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAChanBasic(AChanBasic node)
    {
        inAChanBasic(node);
        if(node.getChan() != null)
        {
            node.getChan().apply(this);
        }
        outAChanBasic(node);
    }

    public void inAParamDeclarationParamDeclaration(AParamDeclarationParamDeclaration node)
    {
        defaultIn(node);
    }

    public void outAParamDeclarationParamDeclaration(AParamDeclarationParamDeclaration node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParamDeclarationParamDeclaration(AParamDeclarationParamDeclaration node)
    {
        inAParamDeclarationParamDeclaration(node);
        if(node.getParamkey() != null)
        {
            node.getParamkey().apply(this);
        }
        if(node.getPName() != null)
        {
            node.getPName().apply(this);
        }
        if(node.getColon() != null)
        {
            node.getColon().apply(this);
        }
        if(node.getVarType() != null)
        {
            node.getVarType().apply(this);
        }
        if(node.getOf() != null)
        {
            node.getOf().apply(this);
        }
        if(node.getMachineName() != null)
        {
            node.getMachineName().apply(this);
        }
        outAParamDeclarationParamDeclaration(node);
    }

    public void inAIdentifierPName(AIdentifierPName node)
    {
        defaultIn(node);
    }

    public void outAIdentifierPName(AIdentifierPName node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdentifierPName(AIdentifierPName node)
    {
        inAIdentifierPName(node);
        if(node.getUnique() != null)
        {
            node.getUnique().apply(this);
        }
        outAIdentifierPName(node);
    }

    public void inAIdentifierMachineName(AIdentifierMachineName node)
    {
        defaultIn(node);
    }

    public void outAIdentifierMachineName(AIdentifierMachineName node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdentifierMachineName(AIdentifierMachineName node)
    {
        inAIdentifierMachineName(node);
        if(node.getExtSymbol() != null)
        {
            node.getExtSymbol().apply(this);
        }
        outAIdentifierMachineName(node);
    }

    public void inAEnumDeclarationEnumDeclaration(AEnumDeclarationEnumDeclaration node)
    {
        defaultIn(node);
    }

    public void outAEnumDeclarationEnumDeclaration(AEnumDeclarationEnumDeclaration node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEnumDeclarationEnumDeclaration(AEnumDeclarationEnumDeclaration node)
    {
        inAEnumDeclarationEnumDeclaration(node);
        if(node.getEnum() != null)
        {
            node.getEnum().apply(this);
        }
        if(node.getEName() != null)
        {
            node.getEName().apply(this);
        }
        if(node.getLBrc() != null)
        {
            node.getLBrc().apply(this);
        }
        {
            List<PLiterals> copy = new ArrayList<PLiterals>(node.getLiterals());
            for(PLiterals e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getRBrc() != null)
        {
            node.getRBrc().apply(this);
        }
        outAEnumDeclarationEnumDeclaration(node);
    }

    public void inAIdentifierEName(AIdentifierEName node)
    {
        defaultIn(node);
    }

    public void outAIdentifierEName(AIdentifierEName node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdentifierEName(AIdentifierEName node)
    {
        inAIdentifierEName(node);
        if(node.getUnique() != null)
        {
            node.getUnique().apply(this);
        }
        outAIdentifierEName(node);
    }

    public void inAIdentifierENameUse(AIdentifierENameUse node)
    {
        defaultIn(node);
    }

    public void outAIdentifierENameUse(AIdentifierENameUse node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdentifierENameUse(AIdentifierENameUse node)
    {
        inAIdentifierENameUse(node);
        if(node.getDefined() != null)
        {
            node.getDefined().apply(this);
        }
        outAIdentifierENameUse(node);
    }

    public void inAIdLiterals(AIdLiterals node)
    {
        defaultIn(node);
    }

    public void outAIdLiterals(AIdLiterals node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdLiterals(AIdLiterals node)
    {
        inAIdLiterals(node);
        if(node.getLiteral() != null)
        {
            node.getLiteral().apply(this);
        }
        outAIdLiterals(node);
    }

    public void inAIdsLiterals(AIdsLiterals node)
    {
        defaultIn(node);
    }

    public void outAIdsLiterals(AIdsLiterals node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdsLiterals(AIdsLiterals node)
    {
        inAIdsLiterals(node);
        if(node.getLiterals() != null)
        {
            node.getLiterals().apply(this);
        }
        if(node.getComma() != null)
        {
            node.getComma().apply(this);
        }
        if(node.getLiteral() != null)
        {
            node.getLiteral().apply(this);
        }
        outAIdsLiterals(node);
    }

    public void inAIdentifierLiteral(AIdentifierLiteral node)
    {
        defaultIn(node);
    }

    public void outAIdentifierLiteral(AIdentifierLiteral node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdentifierLiteral(AIdentifierLiteral node)
    {
        inAIdentifierLiteral(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outAIdentifierLiteral(node);
    }

    public void inACompoundDeclarationCompoundDeclaration(ACompoundDeclarationCompoundDeclaration node)
    {
        defaultIn(node);
    }

    public void outACompoundDeclarationCompoundDeclaration(ACompoundDeclarationCompoundDeclaration node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACompoundDeclarationCompoundDeclaration(ACompoundDeclarationCompoundDeclaration node)
    {
        inACompoundDeclarationCompoundDeclaration(node);
        if(node.getStruct() != null)
        {
            node.getStruct().apply(this);
        }
        if(node.getCompoundName() != null)
        {
            node.getCompoundName().apply(this);
        }
        if(node.getLBrc() != null)
        {
            node.getLBrc().apply(this);
        }
        {
            List<PBasicList> copy = new ArrayList<PBasicList>(node.getBasicList());
            for(PBasicList e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getRBrc() != null)
        {
            node.getRBrc().apply(this);
        }
        outACompoundDeclarationCompoundDeclaration(node);
    }

    public void inABasicListBasicList(ABasicListBasicList node)
    {
        defaultIn(node);
    }

    public void outABasicListBasicList(ABasicListBasicList node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABasicListBasicList(ABasicListBasicList node)
    {
        inABasicListBasicList(node);
        if(node.getBasic() != null)
        {
            node.getBasic().apply(this);
        }
        outABasicListBasicList(node);
    }

    public void inAListsBasicList(AListsBasicList node)
    {
        defaultIn(node);
    }

    public void outAListsBasicList(AListsBasicList node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAListsBasicList(AListsBasicList node)
    {
        inAListsBasicList(node);
        if(node.getBasicList() != null)
        {
            node.getBasicList().apply(this);
        }
        if(node.getComma() != null)
        {
            node.getComma().apply(this);
        }
        if(node.getBasic() != null)
        {
            node.getBasic().apply(this);
        }
        outAListsBasicList(node);
    }

    public void inAIdentifierCompoundName(AIdentifierCompoundName node)
    {
        defaultIn(node);
    }

    public void outAIdentifierCompoundName(AIdentifierCompoundName node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdentifierCompoundName(AIdentifierCompoundName node)
    {
        inAIdentifierCompoundName(node);
        if(node.getUnique() != null)
        {
            node.getUnique().apply(this);
        }
        outAIdentifierCompoundName(node);
    }

    public void inAIdentifierCompoundNameUse(AIdentifierCompoundNameUse node)
    {
        defaultIn(node);
    }

    public void outAIdentifierCompoundNameUse(AIdentifierCompoundNameUse node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdentifierCompoundNameUse(AIdentifierCompoundNameUse node)
    {
        inAIdentifierCompoundNameUse(node);
        if(node.getDefined() != null)
        {
            node.getDefined().apply(this);
        }
        outAIdentifierCompoundNameUse(node);
    }

    public void inABasicSimpletype(ABasicSimpletype node)
    {
        defaultIn(node);
    }

    public void outABasicSimpletype(ABasicSimpletype node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABasicSimpletype(ABasicSimpletype node)
    {
        inABasicSimpletype(node);
        if(node.getBasic() != null)
        {
            node.getBasic().apply(this);
        }
        outABasicSimpletype(node);
    }

    public void inACompoundSimpletype(ACompoundSimpletype node)
    {
        defaultIn(node);
    }

    public void outACompoundSimpletype(ACompoundSimpletype node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACompoundSimpletype(ACompoundSimpletype node)
    {
        inACompoundSimpletype(node);
        if(node.getCompoundNameUse() != null)
        {
            node.getCompoundNameUse().apply(this);
        }
        outACompoundSimpletype(node);
    }

    public void inAMultitypeDeclarationMultitypeDeclaration(AMultitypeDeclarationMultitypeDeclaration node)
    {
        defaultIn(node);
    }

    public void outAMultitypeDeclarationMultitypeDeclaration(AMultitypeDeclarationMultitypeDeclaration node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultitypeDeclarationMultitypeDeclaration(AMultitypeDeclarationMultitypeDeclaration node)
    {
        inAMultitypeDeclarationMultitypeDeclaration(node);
        if(node.getMtype() != null)
        {
            node.getMtype().apply(this);
        }
        if(node.getMultitypeName() != null)
        {
            node.getMultitypeName().apply(this);
        }
        if(node.getLBrc() != null)
        {
            node.getLBrc().apply(this);
        }
        {
            List<PSimpletypeList> copy = new ArrayList<PSimpletypeList>(node.getSimpletypeList());
            for(PSimpletypeList e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getRBrc() != null)
        {
            node.getRBrc().apply(this);
        }
        outAMultitypeDeclarationMultitypeDeclaration(node);
    }

    public void inAIdentifierMultitypeName(AIdentifierMultitypeName node)
    {
        defaultIn(node);
    }

    public void outAIdentifierMultitypeName(AIdentifierMultitypeName node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdentifierMultitypeName(AIdentifierMultitypeName node)
    {
        inAIdentifierMultitypeName(node);
        if(node.getUnique() != null)
        {
            node.getUnique().apply(this);
        }
        outAIdentifierMultitypeName(node);
    }

    public void inASimpletypeListSimpletypeList(ASimpletypeListSimpletypeList node)
    {
        defaultIn(node);
    }

    public void outASimpletypeListSimpletypeList(ASimpletypeListSimpletypeList node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASimpletypeListSimpletypeList(ASimpletypeListSimpletypeList node)
    {
        inASimpletypeListSimpletypeList(node);
        if(node.getSimpletype() != null)
        {
            node.getSimpletype().apply(this);
        }
        outASimpletypeListSimpletypeList(node);
    }

    public void inAListsSimpleSimpletypeList(AListsSimpleSimpletypeList node)
    {
        defaultIn(node);
    }

    public void outAListsSimpleSimpletypeList(AListsSimpleSimpletypeList node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAListsSimpleSimpletypeList(AListsSimpleSimpletypeList node)
    {
        inAListsSimpleSimpletypeList(node);
        if(node.getSimpletypeList() != null)
        {
            node.getSimpletypeList().apply(this);
        }
        if(node.getComma() != null)
        {
            node.getComma().apply(this);
        }
        if(node.getSimpletype() != null)
        {
            node.getSimpletype().apply(this);
        }
        outAListsSimpleSimpletypeList(node);
    }

    public void inAIdentifierMultitypeNameUse(AIdentifierMultitypeNameUse node)
    {
        defaultIn(node);
    }

    public void outAIdentifierMultitypeNameUse(AIdentifierMultitypeNameUse node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdentifierMultitypeNameUse(AIdentifierMultitypeNameUse node)
    {
        inAIdentifierMultitypeNameUse(node);
        if(node.getDefined() != null)
        {
            node.getDefined().apply(this);
        }
        outAIdentifierMultitypeNameUse(node);
    }

    public void inASimpletypeType(ASimpletypeType node)
    {
        defaultIn(node);
    }

    public void outASimpletypeType(ASimpletypeType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASimpletypeType(ASimpletypeType node)
    {
        inASimpletypeType(node);
        if(node.getSimpletype() != null)
        {
            node.getSimpletype().apply(this);
        }
        outASimpletypeType(node);
    }

    public void inAMultiType(AMultiType node)
    {
        defaultIn(node);
    }

    public void outAMultiType(AMultiType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultiType(AMultiType node)
    {
        inAMultiType(node);
        if(node.getMultitypeNameUse() != null)
        {
            node.getMultitypeNameUse().apply(this);
        }
        outAMultiType(node);
    }

    public void inAVariableDeclarationVariableDeclaration(AVariableDeclarationVariableDeclaration node)
    {
        defaultIn(node);
    }

    public void outAVariableDeclarationVariableDeclaration(AVariableDeclarationVariableDeclaration node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVariableDeclarationVariableDeclaration(AVariableDeclarationVariableDeclaration node)
    {
        inAVariableDeclarationVariableDeclaration(node);
        if(node.getVarType() != null)
        {
            node.getVarType().apply(this);
        }
        if(node.getVarName() != null)
        {
            node.getVarName().apply(this);
        }
        outAVariableDeclarationVariableDeclaration(node);
    }

    public void inAIdentifierVarName(AIdentifierVarName node)
    {
        defaultIn(node);
    }

    public void outAIdentifierVarName(AIdentifierVarName node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdentifierVarName(AIdentifierVarName node)
    {
        inAIdentifierVarName(node);
        if(node.getUnique() != null)
        {
            node.getUnique().apply(this);
        }
        outAIdentifierVarName(node);
    }

    public void inAExternalChanDeclarationChannelDeclaration(AExternalChanDeclarationChannelDeclaration node)
    {
        defaultIn(node);
    }

    public void outAExternalChanDeclarationChannelDeclaration(AExternalChanDeclarationChannelDeclaration node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExternalChanDeclarationChannelDeclaration(AExternalChanDeclarationChannelDeclaration node)
    {
        inAExternalChanDeclarationChannelDeclaration(node);
        if(node.getChan() != null)
        {
            node.getChan().apply(this);
        }
        if(node.getExternal() != null)
        {
            node.getExternal().apply(this);
        }
        if(node.getChanName() != null)
        {
            node.getChanName().apply(this);
        }
        if(node.getOf() != null)
        {
            node.getOf().apply(this);
        }
        if(node.getType() != null)
        {
            node.getType().apply(this);
        }
        outAExternalChanDeclarationChannelDeclaration(node);
    }

    public void inAInternalChanDeclarationChannelDeclaration(AInternalChanDeclarationChannelDeclaration node)
    {
        defaultIn(node);
    }

    public void outAInternalChanDeclarationChannelDeclaration(AInternalChanDeclarationChannelDeclaration node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAInternalChanDeclarationChannelDeclaration(AInternalChanDeclarationChannelDeclaration node)
    {
        inAInternalChanDeclarationChannelDeclaration(node);
        if(node.getChan() != null)
        {
            node.getChan().apply(this);
        }
        if(node.getInternal() != null)
        {
            node.getInternal().apply(this);
        }
        if(node.getChanName() != null)
        {
            node.getChanName().apply(this);
        }
        if(node.getLBkt() != null)
        {
            node.getLBkt().apply(this);
        }
        if(node.getNumbers() != null)
        {
            node.getNumbers().apply(this);
        }
        if(node.getRBkt() != null)
        {
            node.getRBkt().apply(this);
        }
        if(node.getOf() != null)
        {
            node.getOf().apply(this);
        }
        if(node.getType() != null)
        {
            node.getType().apply(this);
        }
        outAInternalChanDeclarationChannelDeclaration(node);
    }

    public void inAIdentifierChanName(AIdentifierChanName node)
    {
        defaultIn(node);
    }

    public void outAIdentifierChanName(AIdentifierChanName node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdentifierChanName(AIdentifierChanName node)
    {
        inAIdentifierChanName(node);
        if(node.getUnique() != null)
        {
            node.getUnique().apply(this);
        }
        outAIdentifierChanName(node);
    }

    public void inASimpleExtSymbol(ASimpleExtSymbol node)
    {
        defaultIn(node);
    }

    public void outASimpleExtSymbol(ASimpleExtSymbol node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASimpleExtSymbol(ASimpleExtSymbol node)
    {
        inASimpleExtSymbol(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outASimpleExtSymbol(node);
    }

    public void inASimpleUnique(ASimpleUnique node)
    {
        defaultIn(node);
    }

    public void outASimpleUnique(ASimpleUnique node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASimpleUnique(ASimpleUnique node)
    {
        inASimpleUnique(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outASimpleUnique(node);
    }

    public void inASimpleDefined(ASimpleDefined node)
    {
        defaultIn(node);
    }

    public void outASimpleDefined(ASimpleDefined node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASimpleDefined(ASimpleDefined node)
    {
        inASimpleDefined(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outASimpleDefined(node);
    }
}
