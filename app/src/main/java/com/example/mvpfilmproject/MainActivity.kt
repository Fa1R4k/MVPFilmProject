package com.example.mvpfilmproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mvpfilmproject.ui.FilmDescFragment
import com.example.mvpfilmproject.ui.FilmFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val onClick: (String, String, String) -> Unit = { a, b, c ->
            supportFragmentManager
                .beginTransaction()
                .add(R.id.desc_frame, FilmDescFragment.newInstance(a, b, c))
                .addToBackStack("secondBack")
                .commit()
        }
        supportFragmentManager
            .beginTransaction()
            .add(R.id.film_frame, FilmFragment(onClick))
            .addToBackStack("back")
            .commit()
    }

    override fun onBackPressed() {
        if (supportFragmentManager.backStackEntryCount == 0) {
            super.onBackPressed()
        } else {
            supportFragmentManager.popBackStack()
        }
    }

}