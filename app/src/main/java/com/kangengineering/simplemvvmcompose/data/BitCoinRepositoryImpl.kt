package com.kangengineering.simplemvvmcompose.data

class BitCoinRepositoryImpl : BitCoinRepository {
    override fun getBitCoins(): List<BitCoin> {
        return listOf(
            BitCoin(
                id = "bitcoin",
                rank = "1",
                symbol = "BTC",
                name = "Bitcoin",
                supply = "19491137.0000000000000000",
                maxSupply = "21000000.0000000000000000",
                marketCapUsd = "579831758825.26721715782590",
                volumeUsd24Hr = "13498581823.77219900000000",
                priceUsd = "29744.83940954",
                changePercent24Hr = "0.2210357023929800",
                vwap24Hr = "29791.03387823000000"
            ),
            BitCoin(
                id = "ethereum",
                rank = "2",
                symbol = "ETH",
                name = "Ethereum",
                supply = "120226645.8944000000000000",
                maxSupply = null,
                marketCapUsd = "224836294428.83595453752690",
                volumeUsd24Hr = "7484346974.24408900000000",
                priceUsd = "1870.02685374",
                changePercent24Hr = "0.5725998911767600",
                vwap24Hr = "1871.81999653000000"
            ),
            BitCoin(
                id = "tether",
                rank = "3",
                symbol = "USDT",
                name = "Tether",
                supply = "83253465420.52309000000000",
                maxSupply = null,
                marketCapUsd = "83264724794.16434595691340",
                volumeUsd24Hr = "18114261246.09115100000000",
                priceUsd = "1.000135299739",
                changePercent24Hr = "-0.0015657834036600",
                vwap24Hr = "1.0000828887700000"
            )
        )
    }
}