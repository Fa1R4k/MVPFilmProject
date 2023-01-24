package com.example.mvpfilmproject.model

import com.example.mvpfilmproject.model.models.FilmData

class FilmRepositoryImpl : FilmRepository {
    override fun getFilms(): List<FilmData> {
        return Server.getFilms()
    }
}