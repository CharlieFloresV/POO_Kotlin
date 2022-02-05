package com.platzi.poo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pokemonOne = Pokemon("Pikachu")
        val pokemonTwo = Pokemon("Charmander")
        val cancha = CanchaPokemon()

        println("========================================================================")
        println("Resultado de batalla [${pokemonOne.name}] vs [${pokemonTwo.name}]")
        println("Poder de ${pokemonOne.name} -> ${pokemonOne.power}")
        println("Poder de ${pokemonTwo.name} -> ${pokemonTwo.power}")
        println("Ganador definitivo [${cancha.fight(pokemonOne,pokemonTwo)}]")
        println("FELICIDADES!!!!")
        println("========================================================================")
    }
}