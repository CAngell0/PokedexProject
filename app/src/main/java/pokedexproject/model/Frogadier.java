package pokedexproject.model;

public class Frogadier extends Pokemon implements Water{
   public Frogadier(){
      super(657, "Frogadier");
      this.setCanEvolve(true);
   }

   public Frogadier(String name){
      super(657, name);
   }

   public int waterJet(int jetAmount){
      int scale = (int) (Math.random() * 6);
      return scale * jetAmount;
   }

   public void bubbles(){
      super.setHealth(this.getHealth() + 3);
   }
}
