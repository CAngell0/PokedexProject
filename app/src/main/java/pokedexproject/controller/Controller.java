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
   private String dataFile;

   public Controller(){
      this.pokemonList = new ArrayList<Pokemon>();
      this.window = new PokeFrame(this);
      this.popup = new Popup(window);
      this.dataFile = "save.pokemon";
   }

   public void start(){
      createPokedex();

      ArrayList<Pokemon> saved = IOController.loadData(dataFile, this);
      if (saved != null && saved.size() > 0){
         this.pokemonList = saved;
      }
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

   public void updateCurrentPokemon(int index, String name, int health, boolean canEvolve){
      Pokemon currentPokemon = pokemonList.get(index);

      currentPokemon.setHealth(health);
      currentPokemon.setName(name);
      currentPokemon.setCanEvolve(canEvolve);
   }

   public String[] buildPokedexText(){
      String[] pokemonNames = new String[pokemonList.size()];

      for (int index = 0; index < pokemonNames.length; index++){
         pokemonNames[index] = index + ": " + pokemonList.get(index).getClass().getSimpleName();
      }

      return pokemonNames;
   }

   public String[] getPokemonData(int index){
      String[] data = new String[5];

      Pokemon currentPokemon = pokemonList.get(index);
      data[0] = currentPokemon.getName();
      data[1] = currentPokemon.getCanEvolve() + "";
      data[2] = currentPokemon.getHealth() + "";
      data[3] = currentPokemon.getPokedexNumber() + "";

      String types = "";
      for (String type : currentPokemon.getTypes()){
         types += type + "\n";
      }
      data[4] = types;

      return data;
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

   public void save(){
      IOController.saveData(dataFile, pokemonList, this);
   }

   public Popup getPopup(){
      return popup;
   }
}
