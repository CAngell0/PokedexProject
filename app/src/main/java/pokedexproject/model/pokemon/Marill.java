package pokedexproject.model.pokemon;

import pokedexproject.model.Pokemon;
import pokedexproject.model.types.Fairy;
import pokedexproject.model.types.Water;

public class Marill extends Pokemon implements Water, Fairy {
   public Marill(){
      super(184, "Marill");
      this.setup(100, true);
   }

   public Marill(String name){
      super(184, name);
      this.setup(100, true);
   }

   public void twinkle() {
      super.setHealth(this.getHealth() + 4);
   }

   public int fairyDust(int amount) {
      int scale = (int) (Math.random() * 9);
      return scale * amount;
   }

   public int waterJet(int amount) {
      int scale = (int) (Math.random() * 7);
      return scale * amount;
   }

   public void bubbles() {
      super.setHealth(this.getHealth() + 6);
   }
}
