package com.wbtcb.process.fiat.dto.message

import java.io.Serializable
import java.util.UUID

data class InboundTransferUpdateMessage constructor(
    val orderRef: UUID
    // TODO
) : Serializable
