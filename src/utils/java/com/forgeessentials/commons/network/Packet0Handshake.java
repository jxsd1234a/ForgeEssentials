package com.forgeessentials.commons.network;

import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import io.netty.buffer.ByteBuf;

public class Packet0Handshake implements IMessage
{
    public Packet0Handshake() {}

    @Override
    public void fromBytes(ByteBuf buf)
    {
        /* do nothing */
    }

    @Override
    public void toBytes(ByteBuf buf)
    {
        /* do nothing */
    }
    
}
