// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.1.0.0

package test;

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

public class StructHashEx implements Comparable<Object>
{
    public HashMap<StructSimple, StructNested> f1 = new HashMap<StructSimple, StructNested>();
    public HashMap<StructSimple, StructNested> f2 = new HashMap<StructSimple, StructNested>();

    public StructHashEx() {}

    public StructHashEx(HashMap<StructSimple, StructNested> f1, HashMap<StructSimple, StructNested> f2)
    {
        this.f1 = f1;
        this.f2 = f2;
    }

    public StructHashEx(StructHashEx other)
    {
        this.f1 = other.f1;
        this.f2 = other.f2;
    }

    public StructHashEx clone()
    {
        // Serialize the struct to the FBE stream
        var writer = new test.fbe.StructHashExModel();
        writer.serialize(this);

        // Deserialize the struct from the FBE stream
        var reader = new test.fbe.StructHashExModel();
        reader.attach(writer.getBuffer());
        return reader.deserialize();
    }

    @Override
    public int compareTo(Object other)
    {
        if (other == null)
            return -1;

        if (!StructHashEx.class.isAssignableFrom(other.getClass()))
            return -1;

        final StructHashEx obj = (StructHashEx)other;

        int result = 0;
        return result;
    }

    @Override
    public boolean equals(Object other)
    {
        if (other == null)
            return false;

        if (!StructHashEx.class.isAssignableFrom(other.getClass()))
            return false;

        final StructHashEx obj = (StructHashEx)other;

        return true;
    }

    @Override
    public int hashCode()
    {
        int hash = 17;
        return hash;
    }

    @Override
    public String toString()
    {
        var sb = new StringBuilder();
        sb.append("StructHashEx(");
        if (f1 != null)
        {
            boolean first = true;
            sb.append("f1=[").append(f1.size()).append("][{");
            for (var item : f1.entrySet())
            {
                sb.append(first ? "" : ",").append(item.getKey());
                sb.append("->");
                sb.append(item.getValue());
                first = false;
            }
            sb.append("}]");
        }
        if (f2 != null)
        {
            boolean first = true;
            sb.append(",f2=[").append(f2.size()).append("][{");
            for (var item : f2.entrySet())
            {
                sb.append(first ? "" : ",").append(item.getKey());
                sb.append("->");
                if (item.getValue() != null) sb.append(item.getValue()); else sb.append("null");
                first = false;
            }
            sb.append("}]");
        }
        sb.append(")");
        return sb.toString();
    }

    public String toJson() { return test.fbe.Json.getEngine().toJson(this); }
    public static StructHashEx fromJson(String json) { return test.fbe.Json.getEngine().fromJson(json, StructHashEx.class); }
}
