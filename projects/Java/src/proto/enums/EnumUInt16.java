// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// Version: 1.1.0.0

package enums;

import java.io.*;
import java.lang.*;
import java.lang.reflect.*;
import java.math.*;
import java.nio.ByteBuffer;
import java.nio.charset.*;
import java.time.*;
import java.util.*;

import fbe.*;

public final class EnumUInt16 implements Comparable<EnumUInt16>
{
    public static final EnumUInt16 ENUM_VALUE_0 = new EnumUInt16(EnumUInt16Enum.ENUM_VALUE_0);
    public static final EnumUInt16 ENUM_VALUE_1 = new EnumUInt16(EnumUInt16Enum.ENUM_VALUE_1);
    public static final EnumUInt16 ENUM_VALUE_2 = new EnumUInt16(EnumUInt16Enum.ENUM_VALUE_2);
    public static final EnumUInt16 ENUM_VALUE_3 = new EnumUInt16(EnumUInt16Enum.ENUM_VALUE_3);
    public static final EnumUInt16 ENUM_VALUE_4 = new EnumUInt16(EnumUInt16Enum.ENUM_VALUE_4);
    public static final EnumUInt16 ENUM_VALUE_5 = new EnumUInt16(EnumUInt16Enum.ENUM_VALUE_5);

    private EnumUInt16Enum value = EnumUInt16Enum.values()[0];

    public EnumUInt16() {}
    public EnumUInt16(short value) { setEnum(value); }
    public EnumUInt16(EnumUInt16Enum value) { setEnum(value); }
    public EnumUInt16(EnumUInt16 value) { setEnum(value); }

    public EnumUInt16Enum getEnum() { return value; }
    public short getRaw() { return value.getRaw(); }

    public void setDefault() { setEnum((short)0); }

    public void setEnum(short value) { this.value = EnumUInt16Enum.mapValue(value); }
    public void setEnum(EnumUInt16Enum value) { this.value = value; }
    public void setEnum(EnumUInt16 value) { this.value = value.value; }

    @Override
    public int compareTo(EnumUInt16 other)
    {
        if (value == null)
            return -1;
        if (other.value == null)
            return 1;
        return (int)(value.getRaw() - other.value.getRaw());
    }

    @Override
    public boolean equals(Object other)
    {
        if (other == null)
            return false;

        if (!EnumUInt16.class.isAssignableFrom(other.getClass()))
            return false;

        final EnumUInt16 enm = (EnumUInt16)other;

        if ((value == null) || (enm.value == null))
            return false;
        if (value.getRaw() != enm.value.getRaw())
            return false;
        return true;
    }

    @Override
    public int hashCode()
    {
        int hash = 17;
        hash = hash * 31 + ((value != null) ? value.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() { return (value != null) ? value.toString() : "<unknown>"; }
}
