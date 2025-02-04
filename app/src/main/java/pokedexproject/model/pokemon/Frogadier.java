package pokedexproject.model.pokemon;

import pokedexproject.model.Pokemon;
import pokedexproject.model.types.Water;

public class Frogadier extends Pokemon implements Water{
   public Frogadier(){
      super(657, "Frogadier");
      this.setup(100, true);
   }

   public Frogadier(String name){
      super(657, name);
      this.setup(100, true);
   }

   public int waterJet(int jetAmount){
      int scale = (int) (Math.random() * 6);
      return scale * jetAmount;
   }

   public void bubbles(){
      super.setHealth(this.getHealth() + 3);
   }
}
