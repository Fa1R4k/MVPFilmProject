package com.example.mvpfilmproject.domain.models

data class UnpopularFilmData(
    val id: Int,
    val imageLink: String,
    val name: String,
    val rating: String,
    val isOskar: Boolean,
    val description: String
    )