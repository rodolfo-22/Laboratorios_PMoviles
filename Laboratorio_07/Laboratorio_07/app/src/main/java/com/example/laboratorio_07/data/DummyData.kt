package com.example.laboratorio_07.data

import com.example.laboratorio_07.data.model.MovieModel

//model 01
const val name = "Batman: The Dark Knight"
const val category = "Action"
const val description = "Batman raises the stakes in his war on crime. With the help of Lt. Jim Gordon and District Attorney Harvey Dent, Batman sets out to dismantle the remaining criminal organizations that plague the streets. The partnership proves to be effective, but they soon find themselves prey to a reign of chaos unleashed by a rising criminal mastermind known to the terrified citizens of Gotham as the Joker."
const val qualification = "8.4"

//model 02
const val name2 = "Blade Runner 2049"
const val category2 = "Action"
const val description2 = "Thirty   years after the events of the first film, a new blade runner, LAPD Officer K, unearths a long-buried secret that has the potential to plunge what's left of society into chaos. K's discovery leads him on a quest to find Rick Deckard, a former LAPD blade runner who has been missing for 30 years."
const val qualification2 = "8.0"

var movies = mutableListOf(
    MovieModel(name, category, description, qualification),
    MovieModel(name2, category2, description2, qualification2),
)