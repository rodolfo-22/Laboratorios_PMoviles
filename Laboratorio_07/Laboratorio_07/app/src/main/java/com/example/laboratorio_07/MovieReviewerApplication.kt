package com.example.laboratorio_07

import android.app.Application
import com.example.laboratorio_07.data.movies
import com.example.laboratorio_07.respository.MovieRepository

class MovieReviewerApplication : Application() {
    val movieRepository : MovieRepository by lazy {
        MovieRepository(movies)
    }
}