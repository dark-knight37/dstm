/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.prgmdl.dstmverifier.transition.trigger.node;

import org.prgmdl.dstmverifier.transition.trigger.analysis.*;

@SuppressWarnings("nls")
public final class TEq extends Token
{
    public TEq()
    {
        super.setText("==");
    }

    public TEq(int line, int pos)
    {
        super.setText("==");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TEq(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTEq(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TEq text.");
    }
}
