package com.example.mvpfilmproject.domain.repository

import com.example.mvpfilmproject.domain.models.FilmData
import com.example.mvpfilmproject.domain.models.UnpopularFilmData

interface UnpopularFilmRepository {
    fun getUnpopularFilms(): List<UnpopularFilmData>

}