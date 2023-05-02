package com.example.laboratorio_07.respository

import com.example.laboratorio_07.data.model.MovieModel

class MovieRepository (private  val movies: MutableList<MovieModel>){
    fun getMovies () = movies

    fun setMovies (movie: MovieModel) = movies.add(movie)
}