package com.example.laboratorio_08.ui.movie

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.laboratorio_08.databinding.FragmentMovieBinding
import com.example.laboratorio_08.ui.movie.viewmodel.MovieViewModel

/**
 * this fragment handles show each movie complete information
 */
class MovieFragment : Fragment() {

    private val movieViewModel: MovieViewModel by activityViewModels {
        MovieViewModel.Factory
    }
    private lateinit var binding : FragmentMovieBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        movieViewModel.SetMovieFragment()


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setViewModel()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding  = FragmentMovieBinding.inflate(inflater, container , false)
        return binding.root
    }

    private fun setViewModel(){
        binding.viewmodel = movieViewModel
    }
}