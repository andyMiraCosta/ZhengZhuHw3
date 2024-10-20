package com.kangengineering.simplemvvmcompose.viewmodel

import androidx.lifecycle.ViewModel
import com.kangengineering.simplemvvmcompose.data.PetsRepository

class PetsViewModel(
    private val petsRepository: PetsRepository
): ViewModel() {

    fun getPets() = petsRepository.getPets()
}