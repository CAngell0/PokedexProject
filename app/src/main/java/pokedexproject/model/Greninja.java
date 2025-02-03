package pokedexproject.model;

public class Greninja extends Frogadier implements Water, Dark {
   public Greninja(){
      super();
      setPokedexNumber(658);
   }
   public Greninja(String name){
      super(name);
      setPokedexNumber(658);
   }

   public int waterJet(int jetAmount){
      int scale = (int) (Math.random() * 10);
      return scale * jetAmount;
   }

   public void bubbles(){
      super.setHealth(this.getHealth() + 5);
   }

   public int consume(int amount){
      int scale = (int) (Math.random() * 15);
      return scale * amount;
   }

   public void hide(){

   }
}
