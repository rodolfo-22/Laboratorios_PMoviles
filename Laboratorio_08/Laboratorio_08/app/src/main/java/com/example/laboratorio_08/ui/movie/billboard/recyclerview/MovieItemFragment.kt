package com.example.laboratorio_08.ui.movie.billboard.recyclerview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.laboratorio_08.databinding.FragmentMovieItemBinding

/**
 * Fragment to display movie items in main screen
 */
class MovieItemFragment : Fragment() {

    private lateinit var binding: FragmentMovieItemBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentMovieItemBinding.inflate(inflater, container, false)
        return binding.root
    }

}