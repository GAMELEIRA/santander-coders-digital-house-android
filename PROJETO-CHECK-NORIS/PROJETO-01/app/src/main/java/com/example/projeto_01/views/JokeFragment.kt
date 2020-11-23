package com.example.projeto_01.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.projeto_01.R
import com.example.projeto_01.models.ApiReponse
import com.example.projeto_01.repository.Piadas
import com.example.projeto_01.views.models.JokeViewModel

import com.squareup.picasso.Picasso

class JokeFragment : Fragment() {
    private lateinit var _viewModel: JokeViewModel
    private lateinit var _view: View
    private var category: String? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_joke, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _view = view

        category = arguments?.getString("category")


        _viewModel = ViewModelProvider(
            this,
            JokeViewModel.JokeViewModelFactory(Piadas())
        ).get(JokeViewModel::class.java)

        _viewModel.getJoke(category!!).observe(viewLifecycleOwner, {
            showResults(it)
        })

    }

    private fun showResults(joke: ApiReponse) {

        val jokeImage = _view.findViewById<ImageView>(R.id.imgJoke)
        val jokeText = _view.findViewById<TextView>(R.id.txtJoke)

        jokeText.text = joke.value
        Picasso.get()
            .load(joke.icon_url)
            .into(jokeImage)
    }
}