/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.prgmdl.dstmverifier.transition.condition.node;

import org.prgmdl.dstmverifier.transition.condition.analysis.*;

@SuppressWarnings("nls")
public final class TInternal extends Token
{
    public TInternal()
    {
        super.setText("internal");
    }

    public TInternal(int line, int pos)
    {
        super.setText("internal");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TInternal(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTInternal(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TInternal text.");
    }
}
