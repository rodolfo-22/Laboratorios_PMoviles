package com.example.laboratorio_07.ui.movie

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.laboratorio_07.R
import com.example.laboratorio_07.databinding.FragmentMovieBinding
import com.example.laboratorio_07.databinding.FragmentNewMovieBinding

/**
 * this fragment handles show each movie complete information
 */
class MovieFragment : Fragment() {

    private lateinit var binding : FragmentMovieBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding  = FragmentMovieBinding.inflate(inflater, container , false)
        return binding.root
    }
}