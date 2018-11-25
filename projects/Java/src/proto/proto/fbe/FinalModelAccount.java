// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// Version: 1.1.0.0

package proto.fbe;

import java.io.*;
import java.lang.*;
import java.lang.reflect.*;
import java.math.*;
import java.nio.ByteBuffer;
import java.nio.charset.*;
import java.time.*;
import java.util.*;

import fbe.*;
import proto.*;

// Fast Binary Encoding Account final model class
public final class FinalModelAccount extends FinalModel
{
    public final FinalModelInt32 uid;
    public final FinalModelString name;
    public final FinalModelState state;
    public final FinalModelBalance wallet;
    public final FinalModelOptionalBalance asset;
    public final FinalModelVectorOrder orders;

    public FinalModelAccount(Buffer buffer, long offset)
    {
        super(buffer, offset);
        uid = new FinalModelInt32(buffer, 0);
        name = new FinalModelString(buffer, 0);
        state = new FinalModelState(buffer, 0);
        wallet = new FinalModelBalance(buffer, 0);
        asset = new FinalModelOptionalBalance(buffer, 0);
        orders = new FinalModelVectorOrder(buffer, 0);
    }

    // Get the allocation size
    public long fbeAllocationSize(Account fbeValue)
    {
        long fbeResult = 0
            + uid.fbeAllocationSize(fbeValue.uid)
            + name.fbeAllocationSize(fbeValue.name)
            + state.fbeAllocationSize(fbeValue.state)
            + wallet.fbeAllocationSize(fbeValue.wallet)
            + asset.fbeAllocationSize(fbeValue.asset)
            + orders.fbeAllocationSize(fbeValue.orders)
            ;
        return fbeResult;
    }

    // Get the field type
    public static final long fbeTypeConst = 3;
    public long fbeType() { return fbeTypeConst; }

    // Check if the struct value is valid
    @Override
    public long verify()
    {
        _buffer.shift(fbeOffset());
        long fbeResult = verifyFields();
        _buffer.unshift(fbeOffset());
        return fbeResult;
    }

    // Check if the struct fields are valid
    public long verifyFields()
    {
        long fbeCurrentOffset = 0;
        long fbeFieldSize = 0;

        uid.fbeOffset(fbeCurrentOffset);
        fbeFieldSize = uid.verify();
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE;
        fbeCurrentOffset += fbeFieldSize;

        name.fbeOffset(fbeCurrentOffset);
        fbeFieldSize = name.verify();
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE;
        fbeCurrentOffset += fbeFieldSize;

        state.fbeOffset(fbeCurrentOffset);
        fbeFieldSize = state.verify();
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE;
        fbeCurrentOffset += fbeFieldSize;

        wallet.fbeOffset(fbeCurrentOffset);
        fbeFieldSize = wallet.verify();
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE;
        fbeCurrentOffset += fbeFieldSize;

        asset.fbeOffset(fbeCurrentOffset);
        fbeFieldSize = asset.verify();
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE;
        fbeCurrentOffset += fbeFieldSize;

        orders.fbeOffset(fbeCurrentOffset);
        fbeFieldSize = orders.verify();
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE;
        fbeCurrentOffset += fbeFieldSize;

        return fbeCurrentOffset;
    }

    // Get the struct value
    public Account get(Size fbeSize) { return get(fbeSize, new Account()); }
    public Account get(Size fbeSize, Account fbeValue)
    {
        _buffer.shift(fbeOffset());
        fbeSize.value = getFields(fbeValue);
        _buffer.unshift(fbeOffset());
        return fbeValue;
    }

    // Get the struct fields values
    public long getFields(Account fbeValue)
    {
        long fbeCurrentOffset = 0;
        long fbeCurrentSize = 0;
        var fbeFieldSize = new Size(0);

        uid.fbeOffset(fbeCurrentOffset);
        fbeValue.uid = uid.get(fbeFieldSize);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        name.fbeOffset(fbeCurrentOffset);
        fbeValue.name = name.get(fbeFieldSize);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        state.fbeOffset(fbeCurrentOffset);
        fbeValue.state = state.get(fbeFieldSize);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        wallet.fbeOffset(fbeCurrentOffset);
        fbeValue.wallet = wallet.get(fbeFieldSize);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        asset.fbeOffset(fbeCurrentOffset);
        fbeValue.asset = asset.get(fbeFieldSize);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        orders.fbeOffset(fbeCurrentOffset);
        fbeFieldSize.value = orders.get(fbeValue.orders);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        return fbeCurrentSize;
    }

    // Set the struct value
    public long set(Account fbeValue)
    {
        _buffer.shift(fbeOffset());
        long fbeSize = setFields(fbeValue);
        _buffer.unshift(fbeOffset());
        return fbeSize;
    }

    // Set the struct fields values
    public long setFields(Account fbeValue)
    {
        long fbeCurrentOffset = 0;
        long fbeCurrentSize = 0;
        var fbeFieldSize = new Size(0);

        uid.fbeOffset(fbeCurrentOffset);
        fbeFieldSize.value = uid.set(fbeValue.uid);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        name.fbeOffset(fbeCurrentOffset);
        fbeFieldSize.value = name.set(fbeValue.name);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        state.fbeOffset(fbeCurrentOffset);
        fbeFieldSize.value = state.set(fbeValue.state);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        wallet.fbeOffset(fbeCurrentOffset);
        fbeFieldSize.value = wallet.set(fbeValue.wallet);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        asset.fbeOffset(fbeCurrentOffset);
        fbeFieldSize.value = asset.set(fbeValue.asset);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        orders.fbeOffset(fbeCurrentOffset);
        fbeFieldSize.value = orders.set(fbeValue.orders);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        return fbeCurrentSize;
    }
}
