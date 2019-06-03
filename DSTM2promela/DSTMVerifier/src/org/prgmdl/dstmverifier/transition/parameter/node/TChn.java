/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.prgmdl.dstmverifier.transition.parameter.node;

import org.prgmdl.dstmverifier.transition.parameter.analysis.*;

@SuppressWarnings("nls")
public final class TChn extends Token
{
    public TChn()
    {
        super.setText("Chn");
    }

    public TChn(int line, int pos)
    {
        super.setText("Chn");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TChn(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTChn(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TChn text.");
    }
}