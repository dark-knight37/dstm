/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.prgmdl.dstmverifier.transition.condition.node;

import org.prgmdl.dstmverifier.transition.condition.analysis.*;

@SuppressWarnings("nls")
public final class TSharp extends Token
{
    public TSharp()
    {
        super.setText("#");
    }

    public TSharp(int line, int pos)
    {
        super.setText("#");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TSharp(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTSharp(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TSharp text.");
    }
}
