/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.prgmdl.dstmverifier.transition.action.node;

import org.prgmdl.dstmverifier.transition.action.analysis.*;

@SuppressWarnings("nls")
public final class AEqEqop extends PEqop
{
    private TEq _eq_;

    public AEqEqop()
    {
        // Constructor
    }

    public AEqEqop(
        @SuppressWarnings("hiding") TEq _eq_)
    {
        // Constructor
        setEq(_eq_);

    }

    @Override
    public Object clone()
    {
        return new AEqEqop(
            cloneNode(this._eq_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEqEqop(this);
    }

    public TEq getEq()
    {
        return this._eq_;
    }

    public void setEq(TEq node)
    {
        if(this._eq_ != null)
        {
            this._eq_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._eq_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._eq_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._eq_ == child)
        {
            this._eq_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._eq_ == oldChild)
        {
            setEq((TEq) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
