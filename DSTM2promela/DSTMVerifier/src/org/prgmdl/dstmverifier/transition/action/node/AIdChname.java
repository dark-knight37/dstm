/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.prgmdl.dstmverifier.transition.action.node;

import org.prgmdl.dstmverifier.transition.action.analysis.*;

@SuppressWarnings("nls")
public final class AIdChname extends PChname
{
    private TIdentifier _identifier_;

    public AIdChname()
    {
        // Constructor
    }

    public AIdChname(
        @SuppressWarnings("hiding") TIdentifier _identifier_)
    {
        // Constructor
        setIdentifier(_identifier_);

    }

    @Override
    public Object clone()
    {
        return new AIdChname(
            cloneNode(this._identifier_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIdChname(this);
    }

    public TIdentifier getIdentifier()
    {
        return this._identifier_;
    }

    public void setIdentifier(TIdentifier node)
    {
        if(this._identifier_ != null)
        {
            this._identifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._identifier_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._identifier_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._identifier_ == child)
        {
            this._identifier_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._identifier_ == oldChild)
        {
            setIdentifier((TIdentifier) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
