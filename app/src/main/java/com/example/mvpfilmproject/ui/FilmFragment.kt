package com.example.mvpfilmproject.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mvpfilmproject.R
import com.example.mvpfilmproject.model.models.FilmData
import com.example.mvpfilmproject.presenter.FilmPresenter
import com.example.mvpfilmproject.presenter.FilmPresenterImpl

class FilmFragment(private val onClick:(String, String, String) -> Unit) : Fragment(), FilmView {
    private var presenter: FilmPresenter? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        return inflater.inflate(R.layout.film_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter = FilmPresenterImpl(this)

        presenter?.getFilms()
    }

    override fun showFilms(films: List<FilmData>) {
        val adapter = FilmAdapter(films, onClick)
        val recycler = view?.findViewById<RecyclerView>(R.id.rvFilmList)
        recycler?.adapter = adapter
        recycler?.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
    }

    override fun onDestroyView() {
        super.onDestroyView()

        presenter?.onClear()
    }

}