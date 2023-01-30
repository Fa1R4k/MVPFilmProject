package com.example.mvpfilmproject.ui.films.presenter

import com.example.mvpfilmproject.domain.repository.FilmRepository
import com.example.mvpfilmproject.data.FilmRepositoryImpl
import com.example.mvpfilmproject.ui.films.FilmView

class FilmPresenterImpl(private var view: FilmView?) : FilmPresenter {

    private val repository: FilmRepository = FilmRepositoryImpl()

    override fun getFilms() {
            view?.showFilms(repository.getFilms())
    }

    override fun onClear() {
        view = null
    }
}