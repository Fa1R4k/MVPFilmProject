package com.example.mvpfilmproject.data

import com.example.mvpfilmproject.Server
import com.example.mvpfilmproject.domain.models.FilmData
import com.example.mvpfilmproject.domain.repository.FilmRepository

class FilmRepositoryImpl : FilmRepository {
    override fun getFilms(): List<FilmData> {
        return Server.getFilms()
    }
}