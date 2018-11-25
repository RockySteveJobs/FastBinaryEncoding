// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.1.0.0

package test.fbe;

import java.io.*;
import java.lang.*;
import java.lang.reflect.*;
import java.math.*;
import java.nio.ByteBuffer;
import java.nio.charset.*;
import java.time.*;
import java.util.*;

import fbe.*;
import test.*;

// Fast Binary Encoding optional Decimal final model class
public final class FinalModelOptionalDecimal extends FinalModel
{
    public FinalModelOptionalDecimal(Buffer buffer, long offset)
    {
        super(buffer, offset);
        value = new FinalModelDecimal(buffer, 0);
    }

    // Get the allocation size
    public long fbeAllocationSize(BigDecimal optional) { return 1 + ((optional != null) ? value.fbeAllocationSize(optional) : 0); }

    // Checks whether the object contains a value
    public boolean hasValue()
    {
        if ((_buffer.getOffset() + fbeOffset() + 1) > _buffer.getSize())
            return false;

        byte fbeHasValue = readInt8(fbeOffset());
        return (fbeHasValue != 0);
    }

    // Base final model value
    public final FinalModelDecimal value;

    // Check if the optional value is valid
    @Override
    public long verify()
    {
        if ((_buffer.getOffset() + fbeOffset() + 1) > _buffer.getSize())
            return Long.MAX_VALUE;

        byte fbeHasValue = readInt8(fbeOffset());
        if (fbeHasValue == 0)
            return 1;

        _buffer.shift(fbeOffset() + 1);
        long fbeResult = value.verify();
        _buffer.unshift(fbeOffset() + 1);
        return 1 + fbeResult;
    }

    // Get the optional value
    public BigDecimal get(Size size)
    {
        assert ((_buffer.getOffset() + fbeOffset() + 1) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + 1) > _buffer.getSize())
        {
            size.value = 0;
            return null;
        }

        if (!hasValue())
        {
            size.value = 1;
            return null;
        }

        _buffer.shift(fbeOffset() + 1);
        BigDecimal optional = value.get(size);
        _buffer.unshift(fbeOffset() + 1);
        size.value += 1;
        return optional;
    }

    // Set the optional value
    public long set(BigDecimal optional)
    {
        assert ((_buffer.getOffset() + fbeOffset() + 1) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + 1) > _buffer.getSize())
            return 0;

        byte fbeHasValue = (byte)((optional != null) ? 1 : 0);
        write(fbeOffset(), fbeHasValue);
        if (fbeHasValue == 0)
            return 1;

        _buffer.shift(fbeOffset() + 1);
        long size = value.set(optional);
        _buffer.unshift(fbeOffset() + 1);
        return 1 + size;
    }
}
