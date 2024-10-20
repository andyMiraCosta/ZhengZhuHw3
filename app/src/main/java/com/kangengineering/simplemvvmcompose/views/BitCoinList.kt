package com.kangengineering.simplemvvmcompose.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kangengineering.simplemvvmcompose.viewmodel.BitCoinViewModel
import org.koin.androidx.compose.koinViewModel

@Composable
fun BitCoinList(modifier: Modifier) {
    val bitCoinViewModel: BitCoinViewModel = koinViewModel()
    LazyColumn(
        modifier = modifier
    ) {
        items(bitCoinViewModel.getBitCoins()) { bitCoin ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = "Name: ${bitCoin.name}(${bitCoin.symbol})")
                Text(text = "Price: ${bitCoin.priceUsd}")
            }
        }
    }
}