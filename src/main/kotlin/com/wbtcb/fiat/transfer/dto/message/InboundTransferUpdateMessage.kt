package com.wbtcb.fiat.transfer.dto.message

import java.io.Serializable
import java.util.UUID

data class InboundTransferUpdateMessage constructor(
    val externalId: UUID
    // TODO
) : Serializable
