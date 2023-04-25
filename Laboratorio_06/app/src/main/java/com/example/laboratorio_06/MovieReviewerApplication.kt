package com.example.laboratorio_06

import android.app.Application
import com.example.laboratorio_06.data.model.movies
import com.example.laboratorio_06.repositories.MovieRepository

class MovieReviewerApplication : Application() {
    val movieRepository: MovieRepository by lazy {
        MovieRepository(movies)
    }
}