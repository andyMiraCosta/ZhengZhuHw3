package com.kangengineering.simplemvvmcompose.data

interface BitCoinRepository {
    fun getBitCoins(): List<BitCoin>
}