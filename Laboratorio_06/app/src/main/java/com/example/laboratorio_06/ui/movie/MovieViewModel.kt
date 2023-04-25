package com.example.laboratorio_06.ui.movie

import android.text.Spannable.Factory
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.laboratorio_06.MovieReviewerApplication
import com.example.laboratorio_06.data.model.MovieModel
import com.example.laboratorio_06.repositories.MovieRepository

class MovieViewModel (private val repository: MovieRepository) : ViewModel() {
    fun getMovies ()= repository.getMovies()

    fun addMovies (movie: MovieModel) = repository.setMovies(movie)

    companion object{
        val Factory = viewModelFactory {
            initializer {
                val app = this[APPLICATION_KEY] as MovieReviewerApplication
                MovieViewModel(app.movieRepository)
            }
        }
    }
}