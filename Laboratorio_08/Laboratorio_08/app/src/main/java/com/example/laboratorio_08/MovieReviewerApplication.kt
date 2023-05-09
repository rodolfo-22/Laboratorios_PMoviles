package com.example.laboratorio_08

import android.app.Application
import com.example.laboratorio_08.data.movies
import com.example.laboratorio_08.respository.MovieRepository

class MovieReviewerApplication : Application() {
    val movieRepository : MovieRepository by lazy {
        MovieRepository(movies)
    }
}