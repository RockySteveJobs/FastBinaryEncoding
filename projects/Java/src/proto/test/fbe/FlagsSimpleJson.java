// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.1.0.0

package test.fbe;;

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

import com.google.gson.*;

public final class FlagsSimpleJson implements JsonSerializer<FlagsSimple>, JsonDeserializer<FlagsSimple>
{

    @Override
    public JsonElement serialize(FlagsSimple src, Type typeOfSrc, JsonSerializationContext context)
    {
        return new JsonPrimitive(src.getRaw());
    }

    @Override
    public FlagsSimple deserialize(JsonElement json, Type type, JsonDeserializationContext context) throws JsonParseException
    {
        return new FlagsSimple(json.getAsJsonPrimitive().getAsInt());
    }
}
