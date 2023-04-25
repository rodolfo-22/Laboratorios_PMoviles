package com.example.laboratorio_06.data.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.laboratorio_06.R
import com.example.laboratorio_06.data.model.MovieModel

class MovieAdapter : RecyclerView.Adapter <MovieAdapter.ViewHolder>(){
    private var movies: List<MovieModel>? = null

    inner class ViewHolder(var itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(movie: MovieModel){
            val nameTextView: TextView = itemView.findViewById(R.id.text_view_name)
            val qualificationTextView: TextView = itemView.findViewById(R.id.text_view_qualification)

            nameTextView.text = movie.name
            qualificationTextView.text = movie.qualification

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_item_movie, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount()= movies?.size ?: 0

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        movies?.let{
            holder.bind(it[position])
        }
    }

    fun setData(movies: List<MovieModel>){
        this.movies = movies
        notifyDataSetChanged()
    }
}