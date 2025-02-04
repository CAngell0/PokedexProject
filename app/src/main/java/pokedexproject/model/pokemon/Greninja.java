package pokedexproject.model.pokemon;

import pokedexproject.model.types.Dark;

public class Greninja extends Frogadier implements Dark {
   public Greninja(){
      super();
      this.setup(200, false, 658);
   }
   public Greninja(String name){
      super(name);
      this.setup(200, false, 658);
   }

   public int waterJet(int jetAmount){
      int scale = (int) (Math.random() * 10);
      return scale * jetAmount;
   }

   public void bubbles(){
      super.setHealth(this.getHealth() + 5);
   }

   @Override
   public int consume(int amount){
      int scale = (int) (Math.random() * 15);
      return scale * amount;
   }

   @Override
   public void hide(){

   }
}
