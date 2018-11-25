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

// Fast Binary Encoding protoex sender class
public class Sender extends fbe.Sender
{
    // Imported senders
    public final proto.fbe.Sender protoSender;

    // Sender models accessors
    public final OrderModel OrderModel;
    public final BalanceModel BalanceModel;
    public final AccountModel AccountModel;

    public Sender()
    {
        protoSender = new proto.fbe.Sender(getBuffer());
        OrderModel = new OrderModel(getBuffer());
        BalanceModel = new BalanceModel(getBuffer());
        AccountModel = new AccountModel(getBuffer());
    }
    public Sender(Buffer buffer)
    {
        super(buffer);
        protoSender = new proto.fbe.Sender(getBuffer());
        OrderModel = new OrderModel(getBuffer());
        BalanceModel = new BalanceModel(getBuffer());
        AccountModel = new AccountModel(getBuffer());
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
