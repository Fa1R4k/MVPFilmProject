package com.example.mvpfilmproject.ui

import com.example.mvpfilmproject.model.models.FilmData

interface FilmView {
    fun showFilms(films: List<FilmData>)
}
