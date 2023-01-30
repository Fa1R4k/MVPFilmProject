package com.example.mvpfilmproject.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mvpfilmproject.R
import com.example.mvpfilmproject.model.models.FilmData

class FilmAdapter(private val listFilmData: List<FilmData>, private val onClick:(String, String, String) -> Unit) : RecyclerView.Adapter<FilmViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_item_film, parent, false)
        return FilmViewHolder(view, onClick)
    }

    override fun getItemCount(): Int = listFilmData.size


    override fun onBindViewHolder(holder: FilmViewHolder, position: Int) {
        holder.onBind(listFilmData[position])
    }

}