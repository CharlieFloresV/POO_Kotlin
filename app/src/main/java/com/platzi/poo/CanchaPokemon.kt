package com.platzi.poo

class CanchaPokemon {
    fun fight(pokemonOne: Pokemon, pokemonTwo: Pokemon): String{
        return when {
            pokemonOne.power > pokemonTwo.power -> pokemonOne.name
            pokemonTwo.power > pokemonOne.power -> pokemonTwo.name
            else -> "Empate!!!"
        }
    }
}