package com.wbtcb.process.fiat.dto.message

import com.fasterxml.jackson.databind.JsonNode
import com.wbtcb.process.fiat.enum.PaymentStatus
import java.io.Serializable
import java.math.BigDecimal
import java.util.UUID

data class PaymentUpdateMessage constructor(
    val orderRef: UUID,
    val channelCode: String,
    val currencyCode: String,
    val paymentAddress: String?,
    val amount: BigDecimal,
    val comment: String?,
    val status: PaymentStatus,
    val metadata: JsonNode?,
    val transactionHash: String? = null,
    val fee: BigDecimal? = null
) : Serializable
