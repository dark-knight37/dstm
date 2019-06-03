/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.prgmdl.dstmverifier.transition.trigger.node;

import org.prgmdl.dstmverifier.transition.trigger.analysis.*;

@SuppressWarnings("nls")
public final class TLteq extends Token
{
    public TLteq()
    {
        super.setText("<=");
    }

    public TLteq(int line, int pos)
    {
        super.setText("<=");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TLteq(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTLteq(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TLteq text.");
    }
}
