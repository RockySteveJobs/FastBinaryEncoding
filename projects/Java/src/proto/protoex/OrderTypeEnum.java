// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: protoex.fbe
// Version: 1.1.0.0

package protoex;

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

public enum OrderTypeEnum
{
    market((byte)0 + 0)
    , limit((byte)0 + 1)
    , stop((byte)0 + 2)
    , stoplimit((byte)0 + 3)
    ;

    private byte value;

    OrderTypeEnum(byte value) { this.value = value; }
    OrderTypeEnum(int value) { this.value = (byte)value; }
    OrderTypeEnum(OrderTypeEnum value) { this.value = value.value; }

    public byte getRaw() { return value; }

    public static OrderTypeEnum mapValue(byte value) { return mapping.get(value); }

    @Override
    public String toString()
    {
        if (this == market) return "market";
        if (this == limit) return "limit";
        if (this == stop) return "stop";
        if (this == stoplimit) return "stoplimit";
        return "<unknown>";
    }

    private static final Map<Byte, OrderTypeEnum> mapping = new HashMap<>();
    static
    {
        for (var value : OrderTypeEnum.values())
            mapping.put(value.value, value);
    }
}
