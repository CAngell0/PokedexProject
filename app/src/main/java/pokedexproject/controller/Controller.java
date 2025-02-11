package pokedexproject.controller;

import pokedexproject.model.*;
import pokedexproject.model.pokemon.*;
import pokedexproject.view.PokeFrame;

import java.util.ArrayList;

public class Controller {
   private ArrayList<Pokemon> pokemonList;
   private PokeFrame window;

   public Controller(){
      this.pokemonList = new ArrayList<Pokemon>();
      this.window = new PokeFrame(this);
   }

   public void start(){
      createPokedex();
   }

   private void createPokedex(){
      pokemonList.add(new Combee());
      pokemonList.add(new Frogadier("Frogger"));
      pokemonList.add(new Lunala("Moon Guy"));
      pokemonList.add(new Marill());
      pokemonList.add(new Rowlet("Owl"));
      pokemonList.add(new Snorlax());
      pokemonList.add(new Snorlax("Marshmallow"));
      pokemonList.add(new Combee("Big Bee"));
      pokemonList.add(new Marill("Water Hose"));
      pokemonList.add(new Rowlet());
   }

   public void updateCurrentPokemon(String name, int index, int health, boolean canEvolve){
      Pokemon currentPokemon = pokemonList.get(index);

      currentPokemon.setHealth(health);
      currentPokemon.setName(name);
      currentPokemon.setCanEvolve(canEvolve);
   }
}
