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

public final class FlagsTypedJson implements JsonSerializer<FlagsTyped>, JsonDeserializer<FlagsTyped>
{

    @Override
    public JsonElement serialize(FlagsTyped src, Type typeOfSrc, JsonSerializationContext context)
    {
        return new JsonPrimitive(src.getRaw());
    }

    @Override
    public FlagsTyped deserialize(JsonElement json, Type type, JsonDeserializationContext context) throws JsonParseException
    {
        return new FlagsTyped(json.getAsJsonPrimitive().getAsLong());
    }
}
