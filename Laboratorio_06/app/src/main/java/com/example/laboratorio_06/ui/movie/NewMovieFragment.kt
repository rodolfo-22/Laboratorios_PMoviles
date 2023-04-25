package com.example.laboratorio_06.ui.movie

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.findNavController
import com.example.laboratorio_06.R
import com.example.laboratorio_06.data.model.MovieModel
import com.example.laboratorio_06.data.model.movies
import com.example.laboratorio_06.repositories.MovieRepository

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//private const val ARG_PARAM1 = "param1"
//private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [NewMovieFragment.newInstance] factory method to
 * create an instance of this fragment.
 * Add movies to application data
 */
class NewMovieFragment : Fragment() {
    // TODO: Rename and change types of parameters
    //private var param1: String? = null
    //private var param2: String? = null
    private lateinit var btnSubmit : Button
    private lateinit var editTextName : EditText
    private lateinit var editTextCategory : EditText
    private lateinit var editTextQualification : EditText
    private lateinit var editTextDescription : EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            //param1 = it.getString(ARG_PARAM1)
            //param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_new_movie, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bind()
        listeners()
    }

    private fun bind(){
        btnSubmit = view?.findViewById(R.id.btn_submit) as Button
        editTextName = view?.findViewById(R.id.edit_text_name) as EditText
        editTextCategory = view?.findViewById(R.id.edit_text_category) as EditText
        editTextDescription = view?.findViewById(R.id.edit_text_description) as EditText
        editTextQualification = view?.findViewById(R.id.edit_text_calification) as EditText
    }

    private fun listeners(){

        btnSubmit.setOnClickListener{
            if(!safeNullData()){
                saveData()
                it.findNavController().navigate(R.id.action_newMovieFragment_to_billBoardFragment);
            }
        }
    }

    private fun safeNullData(): Boolean{
        return when{
            editTextName.text.isEmpty() -> true
            editTextCategory.text.isEmpty() -> true
            editTextDescription.text.isEmpty() -> true
            editTextQualification.text.isEmpty() -> true
            else -> false
        }
    }

    private fun saveData(){
        val newMovie = MovieModel(
            editTextName.text.toString(),
            editTextCategory.text.toString(),
            editTextDescription.text.toString(),
            editTextQualification.text.toString())

        MovieRepository(movies).setMovies(newMovie)
    }
    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment NewMovieFragment.
         */
        // TODO: Rename and change types and number of parameters
        //@JvmStatic
        //fun newInstance(param1: String, param2: String) =
            //NewMovieFragment().apply {
                //arguments = Bundle().apply {
                    //putString(ARG_PARAM1, param1)
                   //putString(ARG_PARAM2, param2)
                //}
            //}
    }
}