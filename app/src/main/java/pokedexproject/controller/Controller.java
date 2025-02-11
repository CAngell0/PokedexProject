package pokedexproject.controller;

import pokedexproject.model.*;
import pokedexproject.model.pokemon.*;
import pokedexproject.view.PokeFrame;
import pokedexproject.view.Popup;

import java.util.ArrayList;

public class Controller {
   private ArrayList<Pokemon> pokemonList;
   private Popup popup;
   private PokeFrame window;

   public Controller(){
      this.pokemonList = new ArrayList<Pokemon>();
      this.window = new PokeFrame(this);
      this.popup = new Popup(window);
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

   public boolean validateNumber(String text){
      boolean isValid = false;

      try {
         Integer.parseInt(text);
         isValid = true;
      } catch (NumberFormatException error){
         popup.displayMessage("Please make sure to type a number.");
      }

      return isValid;
   }
}
