package com.wbtcb.process.fiat

class RabbitMqConstants {

    companion object {

        /**
            Claim transfer process
         */
        const val CLAIM_EXCHANGE = "claim"

        // Routing key
        const val CLAIM_FIAT_ROUTING_PREFIX_KEY = "$CLAIM_EXCHANGE.fiat"

        /**
            Payment transfer process
         */
        const val PAYMENT_EXCHANGE = "pay"

        const val PAYMENT_FIAT_ROUTING_PREFIX_KEY = "$PAYMENT_EXCHANGE.fiat"
    }
}
