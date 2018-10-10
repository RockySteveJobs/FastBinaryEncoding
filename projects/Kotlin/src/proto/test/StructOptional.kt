// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding

@file:Suppress("UnusedImport", "unused")

package test

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
open class StructOptional : StructSimple
{
    var f100: Boolean? = null
    var f101: Boolean? = true
    var f102: Boolean? = null
    var f103: Byte? = null
    var f104: Byte? = 255.toByte()
    var f105: Byte? = null
    var f106: Char? = null
    var f107: Char? = '!'.toChar()
    var f108: Char? = null
    var f109: Char? = null
    var f110: Char? = 0x0444.toChar()
    var f111: Char? = null
    var f112: Byte? = null
    var f113: Byte? = 127
    var f114: Byte? = null
    var f115: UByte? = null
    var f116: UByte? = 255u
    var f117: UByte? = null
    var f118: Short? = null
    var f119: Short? = 32767
    var f120: Short? = null
    var f121: UShort? = null
    var f122: UShort? = 65535u
    var f123: UShort? = null
    var f124: Int? = null
    var f125: Int? = 2147483647
    var f126: Int? = null
    var f127: UInt? = null
    var f128: UInt? = 0xFFFFFFFFu
    var f129: UInt? = null
    var f130: Long? = null
    var f131: Long? = 9223372036854775807L
    var f132: Long? = null
    var f133: ULong? = null
    var f134: ULong? = 0xFFFFFFFFFFFFFFFFuL
    var f135: ULong? = null
    var f136: Float? = null
    var f137: Float? = 123.456f
    var f138: Float? = null
    var f139: Double? = null
    var f140: Double? = -123.456e+123
    var f141: Double? = null
    var f142: BigDecimal? = null
    var f143: BigDecimal? = BigDecimal.valueOf(123456.123456)
    var f144: BigDecimal? = null
    var f145: String? = null
    var f146: String? = "Initial string!"
    var f147: String? = null
    var f148: Instant? = null
    var f149: Instant? = Instant.now()
    var f150: Instant? = null
    var f151: UUID? = null
    var f152: UUID? = UUID.fromString("123e4567-e89b-12d3-a456-426655440000")
    var f153: UUID? = null
    var f154: proto.OrderSide? = null
    var f155: proto.OrderSide? = null
    var f156: proto.OrderType? = null
    var f157: proto.OrderType? = null
    var f158: proto.Order? = null
    var f159: proto.Order? = null
    var f160: proto.Balance? = null
    var f161: proto.Balance? = null
    var f162: proto.State? = null
    var f163: proto.State? = null
    var f164: proto.Account? = null
    var f165: proto.Account? = null

    constructor()

    constructor(parent: StructSimple, f100: Boolean?, f101: Boolean?, f102: Boolean?, f103: Byte?, f104: Byte?, f105: Byte?, f106: Char?, f107: Char?, f108: Char?, f109: Char?, f110: Char?, f111: Char?, f112: Byte?, f113: Byte?, f114: Byte?, f115: UByte?, f116: UByte?, f117: UByte?, f118: Short?, f119: Short?, f120: Short?, f121: UShort?, f122: UShort?, f123: UShort?, f124: Int?, f125: Int?, f126: Int?, f127: UInt?, f128: UInt?, f129: UInt?, f130: Long?, f131: Long?, f132: Long?, f133: ULong?, f134: ULong?, f135: ULong?, f136: Float?, f137: Float?, f138: Float?, f139: Double?, f140: Double?, f141: Double?, f142: BigDecimal?, f143: BigDecimal?, f144: BigDecimal?, f145: String?, f146: String?, f147: String?, f148: Instant?, f149: Instant?, f150: Instant?, f151: UUID?, f152: UUID?, f153: UUID?, f154: proto.OrderSide?, f155: proto.OrderSide?, f156: proto.OrderType?, f157: proto.OrderType?, f158: proto.Order?, f159: proto.Order?, f160: proto.Balance?, f161: proto.Balance?, f162: proto.State?, f163: proto.State?, f164: proto.Account?, f165: proto.Account?): super(parent.clone())
    {
        this.f100 = f100
        this.f101 = f101
        this.f102 = f102
        this.f103 = f103
        this.f104 = f104
        this.f105 = f105
        this.f106 = f106
        this.f107 = f107
        this.f108 = f108
        this.f109 = f109
        this.f110 = f110
        this.f111 = f111
        this.f112 = f112
        this.f113 = f113
        this.f114 = f114
        this.f115 = f115
        this.f116 = f116
        this.f117 = f117
        this.f118 = f118
        this.f119 = f119
        this.f120 = f120
        this.f121 = f121
        this.f122 = f122
        this.f123 = f123
        this.f124 = f124
        this.f125 = f125
        this.f126 = f126
        this.f127 = f127
        this.f128 = f128
        this.f129 = f129
        this.f130 = f130
        this.f131 = f131
        this.f132 = f132
        this.f133 = f133
        this.f134 = f134
        this.f135 = f135
        this.f136 = f136
        this.f137 = f137
        this.f138 = f138
        this.f139 = f139
        this.f140 = f140
        this.f141 = f141
        this.f142 = f142
        this.f143 = f143
        this.f144 = f144
        this.f145 = f145
        this.f146 = f146
        this.f147 = f147
        this.f148 = f148
        this.f149 = f149
        this.f150 = f150
        this.f151 = f151
        this.f152 = f152
        this.f153 = f153
        this.f154 = f154
        this.f155 = f155
        this.f156 = f156
        this.f157 = f157
        this.f158 = f158
        this.f159 = f159
        this.f160 = f160
        this.f161 = f161
        this.f162 = f162
        this.f163 = f163
        this.f164 = f164
        this.f165 = f165
    }

    constructor(other: StructOptional): super(other)
    {
        this.f100 = other.f100
        this.f101 = other.f101
        this.f102 = other.f102
        this.f103 = other.f103
        this.f104 = other.f104
        this.f105 = other.f105
        this.f106 = other.f106
        this.f107 = other.f107
        this.f108 = other.f108
        this.f109 = other.f109
        this.f110 = other.f110
        this.f111 = other.f111
        this.f112 = other.f112
        this.f113 = other.f113
        this.f114 = other.f114
        this.f115 = other.f115
        this.f116 = other.f116
        this.f117 = other.f117
        this.f118 = other.f118
        this.f119 = other.f119
        this.f120 = other.f120
        this.f121 = other.f121
        this.f122 = other.f122
        this.f123 = other.f123
        this.f124 = other.f124
        this.f125 = other.f125
        this.f126 = other.f126
        this.f127 = other.f127
        this.f128 = other.f128
        this.f129 = other.f129
        this.f130 = other.f130
        this.f131 = other.f131
        this.f132 = other.f132
        this.f133 = other.f133
        this.f134 = other.f134
        this.f135 = other.f135
        this.f136 = other.f136
        this.f137 = other.f137
        this.f138 = other.f138
        this.f139 = other.f139
        this.f140 = other.f140
        this.f141 = other.f141
        this.f142 = other.f142
        this.f143 = other.f143
        this.f144 = other.f144
        this.f145 = other.f145
        this.f146 = other.f146
        this.f147 = other.f147
        this.f148 = other.f148
        this.f149 = other.f149
        this.f150 = other.f150
        this.f151 = other.f151
        this.f152 = other.f152
        this.f153 = other.f153
        this.f154 = other.f154
        this.f155 = other.f155
        this.f156 = other.f156
        this.f157 = other.f157
        this.f158 = other.f158
        this.f159 = other.f159
        this.f160 = other.f160
        this.f161 = other.f161
        this.f162 = other.f162
        this.f163 = other.f163
        this.f164 = other.f164
        this.f165 = other.f165
    }

    override fun clone(): StructOptional
    {
        // Serialize the struct to the FBE stream
        val writer = test.fbe.StructOptionalModel()
        writer.serialize(this)

        // Deserialize the struct from the FBE stream
        val reader = test.fbe.StructOptionalModel()
        reader.attach(writer.buffer)
        return reader.deserialize()
    }

    override fun compareTo(other: Any?): Int
    {
        if (other == null)
            return -1

        if (!StructOptional::class.java.isAssignableFrom(other.javaClass))
            return -1

        @Suppress("UNUSED_VARIABLE")
        val obj = other as StructOptional? ?: return -1

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

        if (!StructOptional::class.java.isAssignableFrom(other.javaClass))
            return false

        @Suppress("UNUSED_VARIABLE")
        val obj = other as StructOptional? ?: return false

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
        sb.append("StructOptional(")
        sb.append(super.toString())
        sb.append(",f100="); if (f100 != null) sb.append(if (f100!!) "true" else "false"); else sb.append("null")
        sb.append(",f101="); if (f101 != null) sb.append(if (f101!!) "true" else "false"); else sb.append("null")
        sb.append(",f102="); if (f102 != null) sb.append(if (f102!!) "true" else "false"); else sb.append("null")
        sb.append(",f103="); if (f103 != null) sb.append(f103!!); else sb.append("null")
        sb.append(",f104="); if (f104 != null) sb.append(f104!!); else sb.append("null")
        sb.append(",f105="); if (f105 != null) sb.append(f105!!); else sb.append("null")
        sb.append(",f106="); if (f106 != null) sb.append("'").append(f106!!).append("'"); else sb.append("null")
        sb.append(",f107="); if (f107 != null) sb.append("'").append(f107!!).append("'"); else sb.append("null")
        sb.append(",f108="); if (f108 != null) sb.append("'").append(f108!!).append("'"); else sb.append("null")
        sb.append(",f109="); if (f109 != null) sb.append("'").append(f109!!).append("'"); else sb.append("null")
        sb.append(",f110="); if (f110 != null) sb.append("'").append(f110!!).append("'"); else sb.append("null")
        sb.append(",f111="); if (f111 != null) sb.append("'").append(f111!!).append("'"); else sb.append("null")
        sb.append(",f112="); if (f112 != null) sb.append(f112!!); else sb.append("null")
        sb.append(",f113="); if (f113 != null) sb.append(f113!!); else sb.append("null")
        sb.append(",f114="); if (f114 != null) sb.append(f114!!); else sb.append("null")
        sb.append(",f115="); if (f115 != null) sb.append(f115!!); else sb.append("null")
        sb.append(",f116="); if (f116 != null) sb.append(f116!!); else sb.append("null")
        sb.append(",f117="); if (f117 != null) sb.append(f117!!); else sb.append("null")
        sb.append(",f118="); if (f118 != null) sb.append(f118!!); else sb.append("null")
        sb.append(",f119="); if (f119 != null) sb.append(f119!!); else sb.append("null")
        sb.append(",f120="); if (f120 != null) sb.append(f120!!); else sb.append("null")
        sb.append(",f121="); if (f121 != null) sb.append(f121!!); else sb.append("null")
        sb.append(",f122="); if (f122 != null) sb.append(f122!!); else sb.append("null")
        sb.append(",f123="); if (f123 != null) sb.append(f123!!); else sb.append("null")
        sb.append(",f124="); if (f124 != null) sb.append(f124!!); else sb.append("null")
        sb.append(",f125="); if (f125 != null) sb.append(f125!!); else sb.append("null")
        sb.append(",f126="); if (f126 != null) sb.append(f126!!); else sb.append("null")
        sb.append(",f127="); if (f127 != null) sb.append(f127!!); else sb.append("null")
        sb.append(",f128="); if (f128 != null) sb.append(f128!!); else sb.append("null")
        sb.append(",f129="); if (f129 != null) sb.append(f129!!); else sb.append("null")
        sb.append(",f130="); if (f130 != null) sb.append(f130!!); else sb.append("null")
        sb.append(",f131="); if (f131 != null) sb.append(f131!!); else sb.append("null")
        sb.append(",f132="); if (f132 != null) sb.append(f132!!); else sb.append("null")
        sb.append(",f133="); if (f133 != null) sb.append(f133!!); else sb.append("null")
        sb.append(",f134="); if (f134 != null) sb.append(f134!!); else sb.append("null")
        sb.append(",f135="); if (f135 != null) sb.append(f135!!); else sb.append("null")
        sb.append(",f136="); if (f136 != null) sb.append(f136!!); else sb.append("null")
        sb.append(",f137="); if (f137 != null) sb.append(f137!!); else sb.append("null")
        sb.append(",f138="); if (f138 != null) sb.append(f138!!); else sb.append("null")
        sb.append(",f139="); if (f139 != null) sb.append(f139!!); else sb.append("null")
        sb.append(",f140="); if (f140 != null) sb.append(f140!!); else sb.append("null")
        sb.append(",f141="); if (f141 != null) sb.append(f141!!); else sb.append("null")
        sb.append(",f142="); if (f142 != null) sb.append(f142!!); else sb.append("null")
        sb.append(",f143="); if (f143 != null) sb.append(f143!!); else sb.append("null")
        sb.append(",f144="); if (f144 != null) sb.append(f144!!); else sb.append("null")
        sb.append(",f145="); if (f145 != null) sb.append("\"").append(f145!!).append("\""); else sb.append("null")
        sb.append(",f146="); if (f146 != null) sb.append("\"").append(f146!!).append("\""); else sb.append("null")
        sb.append(",f147="); if (f147 != null) sb.append("\"").append(f147!!).append("\""); else sb.append("null")
        sb.append(",f148="); if (f148 != null) sb.append(f148!!.epochSecond * 1000000000 + f148!!.nano); else sb.append("null")
        sb.append(",f149="); if (f149 != null) sb.append(f149!!.epochSecond * 1000000000 + f149!!.nano); else sb.append("null")
        sb.append(",f150="); if (f150 != null) sb.append(f150!!.epochSecond * 1000000000 + f150!!.nano); else sb.append("null")
        sb.append(",f151="); if (f151 != null) sb.append("\"").append(f151!!).append("\""); else sb.append("null")
        sb.append(",f152="); if (f152 != null) sb.append("\"").append(f152!!).append("\""); else sb.append("null")
        sb.append(",f153="); if (f153 != null) sb.append("\"").append(f153!!).append("\""); else sb.append("null")
        sb.append(",f154="); if (f154 != null) sb.append(f154!!); else sb.append("null")
        sb.append(",f155="); if (f155 != null) sb.append(f155!!); else sb.append("null")
        sb.append(",f156="); if (f156 != null) sb.append(f156!!); else sb.append("null")
        sb.append(",f157="); if (f157 != null) sb.append(f157!!); else sb.append("null")
        sb.append(",f158="); if (f158 != null) sb.append(f158!!); else sb.append("null")
        sb.append(",f159="); if (f159 != null) sb.append(f159!!); else sb.append("null")
        sb.append(",f160="); if (f160 != null) sb.append(f160!!); else sb.append("null")
        sb.append(",f161="); if (f161 != null) sb.append(f161!!); else sb.append("null")
        sb.append(",f162="); if (f162 != null) sb.append(f162!!); else sb.append("null")
        sb.append(",f163="); if (f163 != null) sb.append(f163!!); else sb.append("null")
        sb.append(",f164="); if (f164 != null) sb.append(f164!!); else sb.append("null")
        sb.append(",f165="); if (f165 != null) sb.append(f165!!); else sb.append("null")
        sb.append(")")
        return sb.toString()
    }

    override fun toJson(): String = test.fbe.Json.engine.toJson(this)
    companion object
    {
        fun fromJson(json: String): StructOptional = test.fbe.Json.engine.fromJson(json, StructOptional::class.java)
    }
}
