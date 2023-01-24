package com.example.mvpfilmproject.presenter

import com.example.mvpfilmproject.model.FilmRepository
import com.example.mvpfilmproject.model.FilmRepositoryImpl
import com.example.mvpfilmproject.ui.FilmView

class FilmPresenterImpl(private var view: FilmView?) : FilmPresenter {

    private val repository: FilmRepository = FilmRepositoryImpl()

    override fun getFilms() {
            view?.showFilms(repository.getFilms())
    }

    override fun onClear() {
        view = null
    }
}