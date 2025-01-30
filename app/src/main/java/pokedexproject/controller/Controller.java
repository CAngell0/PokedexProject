package pokedexproject.controller;

import pokedexproject.model.*;

import java.util.ArrayList;

public class Controller {
   private ArrayList<Pokemon> pokedex;

   public Controller(){
      this.pokedex = new ArrayList<Pokemon>();
   }

   public void start(){
      createPokedex();
   }

   private void createPokedex(){
      pokedex.add(new Combee());
      pokedex.add(new Frogadier());
      pokedex.add(new Lunala());
      pokedex.add(new Marill());
      pokedex.add(new Rowlet());
      pokedex.add(new Snorlax());
   }
}
