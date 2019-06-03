/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.prgmdl.dstmverifier.data.node;

import org.prgmdl.dstmverifier.data.analysis.*;

@SuppressWarnings("nls")
public final class ASimpletypeListSimpletypeList extends PSimpletypeList
{
    private PSimpletype _simpletype_;

    public ASimpletypeListSimpletypeList()
    {
        // Constructor
    }

    public ASimpletypeListSimpletypeList(
        @SuppressWarnings("hiding") PSimpletype _simpletype_)
    {
        // Constructor
        setSimpletype(_simpletype_);

    }

    @Override
    public Object clone()
    {
        return new ASimpletypeListSimpletypeList(
            cloneNode(this._simpletype_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASimpletypeListSimpletypeList(this);
    }

    public PSimpletype getSimpletype()
    {
        return this._simpletype_;
    }

    public void setSimpletype(PSimpletype node)
    {
        if(this._simpletype_ != null)
        {
            this._simpletype_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._simpletype_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._simpletype_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._simpletype_ == child)
        {
            this._simpletype_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._simpletype_ == oldChild)
        {
            setSimpletype((PSimpletype) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
