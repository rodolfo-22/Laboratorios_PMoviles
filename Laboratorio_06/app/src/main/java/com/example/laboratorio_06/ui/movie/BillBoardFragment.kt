package com.example.laboratorio_06.ui.movie

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.laboratorio_06.R
import com.example.laboratorio_06.data.adapter.MovieAdapter
import com.example.laboratorio_06.data.model.movies
import com.example.laboratorio_06.repositories.MovieRepository
import com.google.android.material.floatingactionbutton.FloatingActionButton

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//private const val ARG_PARAM1 = "param1"
//private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [BillBoardFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BillBoardFragment : Fragment() {
    // TODO: Rename and change types of parameters
    //private var param1: String? = null
    //private var param2: String? = null


    private lateinit var buttonFragmentNewMovie: FloatingActionButton
    private lateinit var recyclerViewMovies: RecyclerView
    //private lateinit var cardViewFragmentStarWars: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //arguments?.let {
            //param1 = it.getString(ARG_PARAM1)
            //param2 = it.getString(ARG_PARAM2)
        //}
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bill_board, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bind()
        listeners()

        val repository = MovieRepository(movies)
        val adapter = MovieAdapter()
        adapter.setData(repository.getMovies())

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

    //companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment BillBoardFragment.
         */
        // TODO: Rename and change types and number of parameters
      //  @JvmStatic
        //fun newInstance(param1: String, param2: String) =
            //BillBoardFragment().apply {
                //arguments = Bundle().apply {
                    //putString(ARG_PARAM1, param1)
                    //putString(ARG_PARAM2, param2)
                //}
            //}
    //}
//}