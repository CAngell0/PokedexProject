package pokedexproject.model.pokemon;

import pokedexproject.model.Pokemon;
import pokedexproject.model.types.Normal;

public class Snorlax extends Pokemon implements Normal {
   public Snorlax(){
      super(143, "Snorlax");
      this.setup(130, false);
   }

   public Snorlax(String name){
      super(143, name);
      this.setup(130, false);
   }

   public int punch(int amount) {
      int scale = (int) (Math.random() * 6);
      return scale * amount;
   }

   public int tackle(int amount) {
      int scale = (int) (Math.random() * 5);
      return scale * amount;
   }
}
