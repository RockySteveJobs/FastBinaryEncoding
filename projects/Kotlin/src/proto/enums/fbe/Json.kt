// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding

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

// Fast Binary Encoding enums JSON class
object Json
{
    // Get the JSON engine
    val engine: Gson = register(GsonBuilder()).create()

    @Suppress("MemberVisibilityCanBePrivate")
    fun register(builder: GsonBuilder): GsonBuilder
    {
        fbe.Json.register(builder)
        builder.registerTypeAdapter(EnumByte::class.java, EnumByteJson())
        builder.registerTypeAdapter(EnumChar::class.java, EnumCharJson())
        builder.registerTypeAdapter(EnumWChar::class.java, EnumWCharJson())
        builder.registerTypeAdapter(EnumInt8::class.java, EnumInt8Json())
        builder.registerTypeAdapter(EnumUInt8::class.java, EnumUInt8Json())
        builder.registerTypeAdapter(EnumInt16::class.java, EnumInt16Json())
        builder.registerTypeAdapter(EnumUInt16::class.java, EnumUInt16Json())
        builder.registerTypeAdapter(EnumInt32::class.java, EnumInt32Json())
        builder.registerTypeAdapter(EnumUInt32::class.java, EnumUInt32Json())
        builder.registerTypeAdapter(EnumInt64::class.java, EnumInt64Json())
        builder.registerTypeAdapter(EnumUInt64::class.java, EnumUInt64Json())
        return builder
    }
}
