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

import com.google.gson.*;

// Fast Binary Encoding proto JSON class
public final class Json
{
    private static final Gson _engine;

    // Get the JSON engine
    public static Gson getEngine() { return _engine; }

    static
    {
        _engine = register(new GsonBuilder()).create();
    }

    private Json() {}

    public static GsonBuilder register(GsonBuilder builder)
    {
        fbe.Json.register(builder);
        builder.registerTypeAdapter(OrderSide.class, new OrderSideJson());
        builder.registerTypeAdapter(OrderType.class, new OrderTypeJson());
        builder.registerTypeAdapter(State.class, new StateJson());
        return builder;
    }
}
