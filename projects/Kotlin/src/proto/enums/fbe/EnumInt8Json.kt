// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// Version: 1.2.0.0

@file:Suppress("UnusedImport", "unused")

package enums.fbe

import java.io.*
import java.lang.*
import java.lang.reflect.*
import java.math.*
import java.nio.charset.*
import java.time.*
import java.util.*

import fbe.*
import enums.*

import com.google.gson.*

class EnumInt8Json : JsonSerializer<EnumInt8>, JsonDeserializer<EnumInt8>
{
    override fun serialize(src: EnumInt8, typeOfSrc: Type, context: JsonSerializationContext): JsonElement
    {
        return JsonPrimitive(src.raw)
    }

    @Throws(JsonParseException::class)
    override fun deserialize(json: JsonElement, type: Type, context: JsonDeserializationContext): EnumInt8
    {
        return EnumInt8(json.asJsonPrimitive.asByte)
    }
}
