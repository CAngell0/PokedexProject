package pokedexproject.model.pokemon;

import pokedexproject.model.Pokemon;
import pokedexproject.model.types.Flying;
import pokedexproject.model.types.Grass;

public class Rowlet extends Pokemon implements Grass, Flying {
   public Rowlet(){
      super(722, "Rowlet");
      this.setCanEvolve(true);
   }

   public Rowlet(String name){
      super(722, name);
   }

   public int soar(int amount) {
      int scale = (int) (Math.random() * 8);
      return scale * amount;
   }

   public int diveBomb(int amount) {
      int scale = (int) (Math.random() * 7);
      return scale * amount;
   }

   public int leafAttack(int amount) {
      int scale = (int) (Math.random() * 6);
      return scale * amount;
   }

   public void photoSynthesize() {
      super.setHealth(this.getHealth() + 10);
   }
}
