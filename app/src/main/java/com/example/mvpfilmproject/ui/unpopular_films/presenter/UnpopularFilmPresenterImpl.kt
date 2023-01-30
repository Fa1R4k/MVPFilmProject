package com.example.mvpfilmproject.ui.unpopular_films.presenter

import com.example.mvpfilmproject.domain.repository.FilmRepository
import com.example.mvpfilmproject.data.FilmRepositoryImpl
import com.example.mvpfilmproject.ui.films.FilmView

class UnpopularFilmPresenterImpl(private var view: FilmView?) : UnpopularFilmPresenter {

    private val repository: FilmRepository = FilmRepositoryImpl()


    override fun getUnpopularFilms() {
        view?.showFilms(repository.getFilms())
    }

    override fun onClear() {
        view = null
    }
}