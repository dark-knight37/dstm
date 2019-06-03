/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.prgmdl.dstmverifier.data.node;

import org.prgmdl.dstmverifier.data.analysis.*;

@SuppressWarnings("nls")
public final class AIdentifierMultitypeName extends PMultitypeName
{
    private PUnique _unique_;

    public AIdentifierMultitypeName()
    {
        // Constructor
    }

    public AIdentifierMultitypeName(
        @SuppressWarnings("hiding") PUnique _unique_)
    {
        // Constructor
        setUnique(_unique_);

    }

    @Override
    public Object clone()
    {
        return new AIdentifierMultitypeName(
            cloneNode(this._unique_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIdentifierMultitypeName(this);
    }

    public PUnique getUnique()
    {
        return this._unique_;
    }

    public void setUnique(PUnique node)
    {
        if(this._unique_ != null)
        {
            this._unique_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._unique_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._unique_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._unique_ == child)
        {
            this._unique_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._unique_ == oldChild)
        {
            setUnique((PUnique) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
