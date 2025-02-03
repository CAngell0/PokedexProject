package pokedexproject.controller;

import pokedexproject.model.*;
import pokedexproject.model.pokemon.*;
import pokedexproject.view.PokeFrame;

import java.util.ArrayList;

public class Controller {
   private ArrayList<Pokemon> pokedex;
   private PokeFrame window;

   public Controller(){
      this.pokedex = new ArrayList<Pokemon>();
      this.window = new PokeFrame(this);
   }

   public void start(){
      createPokedex();
   }

   private void createPokedex(){
      pokedex.add(new Combee());
      pokedex.add(new Frogadier("Frogger"));
      pokedex.add(new Lunala("Moon Guy"));
      pokedex.add(new Marill());
      pokedex.add(new Rowlet("Owl"));
      pokedex.add(new Snorlax());
      pokedex.add(new Snorlax("Marshmallow"));
      pokedex.add(new Combee("Big Bee"));
      pokedex.add(new Marill("Water Hose"));
      pokedex.add(new Rowlet());
   }
}
