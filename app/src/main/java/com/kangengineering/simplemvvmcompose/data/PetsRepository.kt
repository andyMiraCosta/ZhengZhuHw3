package com.kangengineering.simplemvvmcompose.data

interface PetsRepository {
    fun getPets(): List<Pet>
}