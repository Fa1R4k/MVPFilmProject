package com.example.mvpfilmproject.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.mvpfilmproject.R

class FilmDescFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return layoutInflater.inflate((R.layout.film_fragment), container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView>(R.id.tvFilmName).text = arguments?.getString(KEY_NAME)
        view.findViewById<TextView>(R.id.tvFilmDesc).text = arguments?.getString(KEY_DESC)
        val imageLink = arguments?.getString(KEY_IMAGE)
        val image = view.findViewById<ImageView>(R.id.ivFilmImage)
        Glide.with(image).load(imageLink).into(image)
    }

    companion object {
        private val KEY_IMAGE = "KEY_IMAGE";
        private val KEY_NAME = "KEY_NAME";
        private val KEY_DESC = "KEY_DESC";

        fun newInstance(image: String, name: String, desc: String): FilmDescFragment {
            val fragment = FilmDescFragment()
            val args = Bundle()

            args.putString(KEY_IMAGE, image)
            args.putString(KEY_NAME, name)
            args.putString(KEY_DESC, desc)
            fragment.arguments = args
            return fragment
        }
    }
}