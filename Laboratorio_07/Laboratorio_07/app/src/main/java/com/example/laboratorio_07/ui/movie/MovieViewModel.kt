package com.example.laboratorio_07.ui.movie

import android.text.Spannable.Factory
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.laboratorio_07.MovieReviewerApplication
import com.example.laboratorio_07.data.model.MovieModel
import com.example.laboratorio_07.respository.MovieRepository

class MovieViewModel (private val repository: MovieRepository): ViewModel() {
    val name = MutableLiveData("")
    val category = MutableLiveData("")
    val description = MutableLiveData("")
    val qualification = MutableLiveData("")
    val status = MutableLiveData("")

    fun getMovies () = repository.getMovies()

    private fun addMovie (movie: MovieModel) = repository.setMovies(movie)

    fun createMovie(){
        if(!validateData()){
            status.value = WRONG_INFORMATION
            return
        }
        val movie = MovieModel(
            name.value!!,
            category.value!!,
            description.value!!,
            qualification.value!!,

        )
        addMovie(movie)
        clearData()

        status.value = MOVIE_CREATED
    }

    private fun validateData(): Boolean{
        when{
            name.value.isNullOrBlank() -> return false
            category.value.isNullOrBlank() -> return false
            description.value.isNullOrBlank() -> return false
            qualification.value.isNullOrBlank() -> return false
        }
        return true
    }

    private fun clearData(){
        name.value = ""
        category.value = ""
        description.value = ""
        qualification.value = ""
    }
    fun clearStatus(){
        status.value = INACTIVE
    }

    companion object{
        val Factory = viewModelFactory {
            initializer {
                val movieRepositoryApp = (this[APPLICATION_KEY] as MovieReviewerApplication).movieRepository

                MovieViewModel(movieRepositoryApp)
            }
        }
        const val MOVIE_CREATED = "Movie created"
        const val  WRONG_INFORMATION = "Wrong information"
        const val INACTIVE = ""

    }
}