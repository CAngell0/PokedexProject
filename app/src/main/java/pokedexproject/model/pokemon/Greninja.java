package pokedexproject.model.pokemon;

import pokedexproject.model.types.Dark;

public class Greninja extends Frogadier implements Dark {
   public Greninja(){
      super();
      setPokedexNumber(658);
      this.setup(200, false);
   }
   public Greninja(String name){
      super(name);
      setPokedexNumber(658);
      this.setup(200, false);
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
