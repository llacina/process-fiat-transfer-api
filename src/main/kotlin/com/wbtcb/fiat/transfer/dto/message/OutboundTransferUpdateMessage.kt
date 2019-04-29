package com.wbtcb.coin.transfer.dto.message

import java.io.Serializable
import java.util.UUID

data class OutboundTransferUpdateMessage constructor(
    val externalId: UUID
    // TODO
) : Serializable
