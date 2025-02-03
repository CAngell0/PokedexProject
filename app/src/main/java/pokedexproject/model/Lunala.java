package pokedexproject.model;

public class Lunala extends Pokemon implements Psychic, Ghost {
   public Lunala(){
      super(792, "Lunala");
      this.setCanEvolve(false);
   }

   public Lunala(String name){
      super(792, name);
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
