package com.example.mvpfilmproject.model

import com.example.mvpfilmproject.model.models.FilmData


interface FilmRepository {

    fun getFilms(): List<FilmData>
}