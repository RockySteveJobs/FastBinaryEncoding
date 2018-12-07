// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: protoex.fbe
// Version: 1.1.0.0

package protoex.fbe;

import java.io.*;
import java.lang.*;
import java.lang.reflect.*;
import java.math.*;
import java.nio.ByteBuffer;
import java.nio.charset.*;
import java.time.*;
import java.util.*;

import fbe.*;
import protoex.*;

// Fast Binary Encoding protoex final sender
public class FinalSender extends fbe.Sender
{
    // Imported senders
    public final proto.fbe.FinalSender protoSender;

    // Sender models accessors
    public final OrderFinalModel OrderModel;
    public final BalanceFinalModel BalanceModel;
    public final AccountFinalModel AccountModel;

    public FinalSender()
    {
        super(true);
        protoSender = new proto.fbe.FinalSender(getBuffer());
        OrderModel = new OrderFinalModel(getBuffer());
        BalanceModel = new BalanceFinalModel(getBuffer());
        AccountModel = new AccountFinalModel(getBuffer());
    }
    public FinalSender(Buffer buffer)
    {
        super(buffer, true);
        protoSender = new proto.fbe.FinalSender(getBuffer());
        OrderModel = new OrderFinalModel(getBuffer());
        BalanceModel = new BalanceFinalModel(getBuffer());
        AccountModel = new AccountFinalModel(getBuffer());
    }

    public long send(protoex.Order value)
    {
        // Serialize the value into the FBE stream
        long serialized = OrderModel.serialize(value);
        assert (serialized > 0) : "protoex.Order serialization failed!";
        assert OrderModel.verify() : "protoex.Order validation failed!";

        // Log the value
        if (getLogging())
        {
            String message = value.toString();
            onSendLog(message);
        }

        // Send the serialized value
        return sendSerialized(serialized);
    }
    public long send(protoex.Balance value)
    {
        // Serialize the value into the FBE stream
        long serialized = BalanceModel.serialize(value);
        assert (serialized > 0) : "protoex.Balance serialization failed!";
        assert BalanceModel.verify() : "protoex.Balance validation failed!";

        // Log the value
        if (getLogging())
        {
            String message = value.toString();
            onSendLog(message);
        }

        // Send the serialized value
        return sendSerialized(serialized);
    }
    public long send(protoex.Account value)
    {
        // Serialize the value into the FBE stream
        long serialized = AccountModel.serialize(value);
        assert (serialized > 0) : "protoex.Account serialization failed!";
        assert AccountModel.verify() : "protoex.Account validation failed!";

        // Log the value
        if (getLogging())
        {
            String message = value.toString();
            onSendLog(message);
        }

        // Send the serialized value
        return sendSerialized(serialized);
    }

    // Send message handler
    @Override
    protected long onSend(byte[] buffer, long offset, long size) { throw new UnsupportedOperationException("protoex.fbe.Sender.onSend() not implemented!"); }
}
