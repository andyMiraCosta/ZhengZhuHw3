package com.kangengineering.simplemvvmcompose.viewmodel

import androidx.lifecycle.ViewModel
import com.kangengineering.simplemvvmcompose.data.BitCoinRepository

class BitCoinViewModel(
    private val bitCoinRepository: BitCoinRepository
): ViewModel() {

    fun getBitCoins() = bitCoinRepository.getBitCoins()
}