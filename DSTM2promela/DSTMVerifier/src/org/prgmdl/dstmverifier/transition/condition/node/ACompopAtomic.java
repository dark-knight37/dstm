/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.prgmdl.dstmverifier.transition.condition.node;

import org.prgmdl.dstmverifier.transition.condition.analysis.*;

@SuppressWarnings("nls")
public final class ACompopAtomic extends PAtomic
{
    private PLval _lval_;
    private PCmpop _cmpop_;
    private PRval _rval_;

    public ACompopAtomic()
    {
        // Constructor
    }

    public ACompopAtomic(
        @SuppressWarnings("hiding") PLval _lval_,
        @SuppressWarnings("hiding") PCmpop _cmpop_,
        @SuppressWarnings("hiding") PRval _rval_)
    {
        // Constructor
        setLval(_lval_);

        setCmpop(_cmpop_);

        setRval(_rval_);

    }

    @Override
    public Object clone()
    {
        return new ACompopAtomic(
            cloneNode(this._lval_),
            cloneNode(this._cmpop_),
            cloneNode(this._rval_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACompopAtomic(this);
    }

    public PLval getLval()
    {
        return this._lval_;
    }

    public void setLval(PLval node)
    {
        if(this._lval_ != null)
        {
            this._lval_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lval_ = node;
    }

    public PCmpop getCmpop()
    {
        return this._cmpop_;
    }

    public void setCmpop(PCmpop node)
    {
        if(this._cmpop_ != null)
        {
            this._cmpop_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._cmpop_ = node;
    }

    public PRval getRval()
    {
        return this._rval_;
    }

    public void setRval(PRval node)
    {
        if(this._rval_ != null)
        {
            this._rval_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rval_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._lval_)
            + toString(this._cmpop_)
            + toString(this._rval_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._lval_ == child)
        {
            this._lval_ = null;
            return;
        }

        if(this._cmpop_ == child)
        {
            this._cmpop_ = null;
            return;
        }

        if(this._rval_ == child)
        {
            this._rval_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._lval_ == oldChild)
        {
            setLval((PLval) newChild);
            return;
        }

        if(this._cmpop_ == oldChild)
        {
            setCmpop((PCmpop) newChild);
            return;
        }

        if(this._rval_ == oldChild)
        {
            setRval((PRval) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}