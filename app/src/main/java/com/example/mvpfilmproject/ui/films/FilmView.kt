package com.example.mvpfilmproject.ui.films

import com.example.mvpfilmproject.domain.models.FilmData

interface FilmView {
    fun showFilms(films: List<FilmData>)
}
