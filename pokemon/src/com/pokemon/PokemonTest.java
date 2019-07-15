package com.pokemon;

public class PokemonTest extends Pokedex {

	public static void main(String[] args) {
		Pokedex pokedex = new Pokedex();
		Pokemon blastoise = pokedex.createPokemon("Blastoise", "Water", 79);
		Pokemon diglett = pokedex.createPokemon("Diglett", "Earth", 10);
		
		pokedex.attackPokemon(blastoise);
		pokedex.pokemonInfo(blastoise);
		pokedex.pokemonInfo(diglett);
	}

}