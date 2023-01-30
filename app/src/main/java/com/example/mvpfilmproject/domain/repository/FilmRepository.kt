package com.example.mvpfilmproject.domain.repository

import com.example.mvpfilmproject.domain.models.FilmData


interface FilmRepository {

    fun getFilms(): List<FilmData>
}