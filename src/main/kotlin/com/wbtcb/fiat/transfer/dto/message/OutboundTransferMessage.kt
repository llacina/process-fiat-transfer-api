package com.wbtcb.fiat.transfer.dto.message

import java.io.Serializable
import java.util.UUID

data class OutboundTransferMessage constructor(
    val externalId: UUID
    // TODO
) : Serializable
