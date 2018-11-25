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

// Fast Binary Encoding OptionalFlagsSimple array field model class
public final class FieldModelArrayOptionalFlagsSimple extends FieldModel
{
    private final FieldModelOptionalFlagsSimple _model;
    private final long _size;

    public FieldModelArrayOptionalFlagsSimple(Buffer buffer, long offset, long size)
    {
        super(buffer, offset);
        _model = new FieldModelOptionalFlagsSimple(buffer, offset);
        _size = size;
    }

    // Get the field size
    @Override
    public long fbeSize() { return _size * _model.fbeSize(); }
    // Get the field extra size
    @Override
    public long fbeExtra() { return 0; }

    // Get the array offset
    public long getOffset() { return 0; }
    // Get the array size
    public long getSize() { return _size; }

    // Array index operator
    public FieldModelOptionalFlagsSimple getItem(long index)
    {
        assert ((_buffer.getOffset() + fbeOffset() + fbeSize()) <= _buffer.getSize()) : "Model is broken!";
        assert (index < _size) : "Index is out of bounds!";

        _model.fbeOffset(fbeOffset());
        _model.fbeShift(index * _model.fbeSize());
        return _model;
    }

    // Check if the array is valid
    @Override
    public boolean verify()
    {
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return false;

        _model.fbeOffset(fbeOffset());
        for (long i = _size; i-- > 0;)
        {
            if (!_model.verify())
                return false;
            _model.fbeShift(_model.fbeSize());
        }

        return true;
    }

    // Get the array
    public FlagsSimple[] get()
    {
        var values = new FlagsSimple[(int)_size];

        var fbeModel = getItem(0);
        for (long i = 0; i < _size; i++)
        {
            values[(int)i] = fbeModel.get();
            fbeModel.fbeShift(fbeModel.fbeSize());
        }
        return values;
    }

    // Get the array
    public void get(FlagsSimple[] values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        var fbeModel = getItem(0);
        for (long i = 0; (i < values.length) && (i < _size); i++)
        {
            values[(int)i] = fbeModel.get();
            fbeModel.fbeShift(fbeModel.fbeSize());
        }
    }

    // Get the array as ArrayList
    public void get(ArrayList<FlagsSimple> values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        values.clear();
        values.ensureCapacity((int)_size);

        var fbeModel = getItem(0);
        for (long i = _size; i-- > 0;)
        {
            FlagsSimple value = fbeModel.get();
            values.add(value);
            fbeModel.fbeShift(fbeModel.fbeSize());
        }
    }

    // Set the array
    public void set(FlagsSimple[] values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        assert ((_buffer.getOffset() + fbeOffset() + fbeSize()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return;

        var fbeModel = getItem(0);
        for (long i = 0; (i < values.length) && (i < _size); i++)
        {
            fbeModel.set(values[(int)i]);
            fbeModel.fbeShift(fbeModel.fbeSize());
        }
    }

    // Set the array as List
    public void set(ArrayList<FlagsSimple> values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        assert ((_buffer.getOffset() + fbeOffset() + fbeSize()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return;

        var fbeModel = getItem(0);
        for (long i = 0; (i < values.size()) && (i < _size); i++)
        {
            fbeModel.set(values.get((int)i));
            fbeModel.fbeShift(fbeModel.fbeSize());
        }
    }
}
