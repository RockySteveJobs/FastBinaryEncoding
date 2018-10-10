// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding

@file:Suppress("UnusedImport", "unused")

package protoex

import java.io.*
import java.lang.*
import java.lang.reflect.*
import java.math.*
import java.nio.charset.*
import java.time.*
import java.util.*
import fbe.*
import proto.*

@Suppress("MemberVisibilityCanBePrivate", "RemoveRedundantCallsOfConversionMethods")
open class Balance : proto.Balance
{
    var locked: Double = 0.0

    constructor()

    constructor(parent: proto.Balance, locked: Double): super(parent.clone())
    {
        this.locked = locked
    }

    constructor(other: Balance): super(other)
    {
        this.locked = other.locked
    }

    override fun clone(): Balance
    {
        // Serialize the struct to the FBE stream
        val writer = protoex.fbe.BalanceModel()
        writer.serialize(this)

        // Deserialize the struct from the FBE stream
        val reader = protoex.fbe.BalanceModel()
        reader.attach(writer.buffer)
        return reader.deserialize()
    }

    override fun compareTo(other: Any?): Int
    {
        if (other == null)
            return -1

        if (!Balance::class.java.isAssignableFrom(other.javaClass))
            return -1

        @Suppress("UNUSED_VARIABLE")
        val obj = other as Balance? ?: return -1

        @Suppress("VARIABLE_WITH_REDUNDANT_INITIALIZER", "CanBeVal", "UnnecessaryVariable")
        var result = 0
        result = super.compareTo(obj)
        if (result != 0)
            return result
        return result
    }

    override fun equals(other: Any?): Boolean
    {
        if (other == null)
            return false

        if (!Balance::class.java.isAssignableFrom(other.javaClass))
            return false

        @Suppress("UNUSED_VARIABLE")
        val obj = other as Balance? ?: return false

        if (!super.equals(obj))
            return false
        return true
    }

    override fun hashCode(): Int
    {
        @Suppress("CanBeVal", "UnnecessaryVariable")
        var hash = 17
        hash = hash * 31 + super.hashCode()
        return hash
    }

    override fun toString(): String
    {
        val sb = StringBuilder()
        sb.append("Balance(")
        sb.append(super.toString())
        sb.append(",locked="); sb.append(locked)
        sb.append(")")
        return sb.toString()
    }

    override fun toJson(): String = protoex.fbe.Json.engine.toJson(this)
    companion object
    {
        fun fromJson(json: String): Balance = protoex.fbe.Json.engine.fromJson(json, Balance::class.java)
    }
}
