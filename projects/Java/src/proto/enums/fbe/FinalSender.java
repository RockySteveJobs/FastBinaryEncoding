// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// Version: 1.1.0.0

package enums.fbe;

import java.io.*;
import java.lang.*;
import java.lang.reflect.*;
import java.math.*;
import java.nio.ByteBuffer;
import java.nio.charset.*;
import java.time.*;
import java.util.*;

import fbe.*;
import enums.*;

// Fast Binary Encoding enums final sender
public class FinalSender extends fbe.Sender
{
    // Sender models accessors
    public final EnumsFinalModel EnumsModel;

    public FinalSender()
    {
        super(true);
        EnumsModel = new EnumsFinalModel(getBuffer());
    }
    public FinalSender(Buffer buffer)
    {
        super(buffer, true);
        EnumsModel = new EnumsFinalModel(getBuffer());
    }

    public long send(enums.Enums value)
    {
        // Serialize the value into the FBE stream
        long serialized = EnumsModel.serialize(value);
        assert (serialized > 0) : "enums.Enums serialization failed!";
        assert EnumsModel.verify() : "enums.Enums validation failed!";

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
    protected long onSend(byte[] buffer, long offset, long size) { throw new UnsupportedOperationException("enums.fbe.Sender.onSend() not implemented!"); }
}
