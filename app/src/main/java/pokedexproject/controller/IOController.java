package pokedexproject.controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

import java.util.ArrayList;

import pokedexproject.model.Pokemon;

public class IOController {
   @SuppressWarnings("unchecked")
   public static ArrayList<Pokemon> loadData(String dataFile, Controller app){
      ArrayList<Pokemon> pokemonList = null;

      try (
         FileInputStream readingStream = new FileInputStream(dataFile);
         ObjectInputStream input = new ObjectInputStream(readingStream);
      ){
         ArrayList<Pokemon> loadedPokemon = new ArrayList<Pokemon>();
         loadedPokemon = (ArrayList<Pokemon>) input.readObject();
         pokemonList = loadedPokemon;
      } catch (IOException | ClassNotFoundException error){
         app.getPopup().displayMessage("Error Getting Data!");
         app.getPopup().displayMessage(error.getMessage());
      } 

      return pokemonList;
   }

   public static void saveData(String dataFile, ArrayList<Pokemon> pokemonList, Controller app){
      try (
         FileOutputStream writingStream = new FileOutputStream(dataFile);
         ObjectOutputStream output = new ObjectOutputStream(writingStream);
      ){
         output.writeObject(pokemonList);
      } catch (IOException error){
         app.getPopup().displayMessage("Error Saving File!");
         app.getPopup().displayMessage(error.getMessage());
      }
   }
}
