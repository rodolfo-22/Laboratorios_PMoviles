package com.example.laboratorio_07.ui.movie

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.navigation.ActivityNavigatorExtras
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.laboratorio_07.R
import com.example.laboratorio_07.data.adapter.MovieAdapter
import com.example.laboratorio_07.data.movies
import com.example.laboratorio_07.databinding.FragmentBillBoardBinding
import com.example.laboratorio_07.databinding.FragmentMovieBinding
import com.example.laboratorio_07.databinding.FragmentNewMovieBinding
import com.example.laboratorio_07.respository.MovieRepository
import com.google.android.material.floatingactionbutton.FloatingActionButton

/**
 * Billboard fragment works as main view wich displays
 * each movie data information.
 * Use it to display information on main screen
 */
class BillBoardFragment : Fragment() {

    private lateinit var buttonFragmentNewMovie: FloatingActionButton
    private lateinit var recyclerViewMovies: RecyclerView
    private lateinit var binding : FragmentBillBoardBinding
    private val movieViewModel: MovieViewModel by activityViewModels<MovieViewModel> {
        MovieViewModel.Factory
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding  = FragmentBillBoardBinding.inflate(inflater, container , false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bind()
        listeners()

        val adapter = MovieAdapter()
        adapter.setData(movieViewModel.getMovies())
        //adapter.setData(MovieRepository(movies).getMovies())

        recyclerViewMovies.adapter = adapter
        recyclerViewMovies.layoutManager = LinearLayoutManager(context)
    }

    private fun bind(){
        //cardViewFragmentStarWars = view?.findViewById(R.id.card_view_star_wars) as CardView
        buttonFragmentNewMovie = view?.findViewById(R.id.btn_link_new_movie) as FloatingActionButton
        recyclerViewMovies = view?.findViewById(R.id.movies_recycle_view) as RecyclerView
    }

    private fun listeners(){
        buttonFragmentNewMovie.setOnClickListener{
            it.findNavController().navigate(R.id.action_billBoardFragment_to_newMovieFragment)
        }

        //cardViewFragmentStarWars.setOnClickListener{
        //it.findNavController().navigate(R.id.action_billBoardFragment_to_movieFragment)
        //}
    }
}
