/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.prgmdl.dstmverifier.transition.trigger.node;

import org.prgmdl.dstmverifier.transition.trigger.analysis.*;

@SuppressWarnings("nls")
public final class TAmpAmp extends Token
{
    public TAmpAmp()
    {
        super.setText("&&");
    }

    public TAmpAmp(int line, int pos)
    {
        super.setText("&&");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TAmpAmp(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTAmpAmp(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TAmpAmp text.");
    }
}
