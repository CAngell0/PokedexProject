package pokedexproject.model.pokemon;

import pokedexproject.model.Pokemon;
import pokedexproject.model.types.Ghost;
import pokedexproject.model.types.Psychic;

public class Lunala extends Pokemon implements Psychic, Ghost {
   public Lunala(){
      super(792, "Lunala");
      this.setup(400, false);
   }

   public Lunala(String name){
      super(792, name);
      this.setup(400, false);
   }

   public void permeate() {
      super.setHealth(this.getHealth() + 12);
   }

   public int haunt(int amount) {
      int scale = (int) (Math.random() * 7);
      return scale * amount;
   }

   public double hipnotize() {
      double chance = Math.random();
      return chance;
   }

   public int psychicBeam(int amount) {
      int scale = (int) (Math.random() * 15);
      return scale * amount;
   }
}
