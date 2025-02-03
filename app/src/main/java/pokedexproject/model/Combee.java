package pokedexproject.model;

public class Combee extends Pokemon implements Bug, Flying {
   public Combee(){
      super(415, "Combee");
      this.setCanEvolve(true);
   }
   
   public Combee(String name){
      super(415, name);
   }

   public int soar(int amount) {
      int scale = (int) (Math.random() * 5);
      return scale * amount;
   }

   public int diveBomb(int amount) {
      int scale = (int) (Math.random() * 7);
      return scale * amount;
   }

   public int sting(int amount) {
      int scale = (int) (Math.random() * 5);
      return scale * amount;
   }

   public void buzz(int amount) {
      super.setHealth(this.getHealth() + 7);
   }
}
