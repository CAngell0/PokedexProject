package pokedexproject.model;

import java.io.Serializable;
import java.util.ArrayList;

public class Pokemon implements Serializable {
   private int pokedexNumber;
   private int health;
   private boolean canEvolve;
   private String name;

   public Pokemon(int pokedexNumber, String name) {
      this.pokedexNumber = pokedexNumber;
      this.health = 100;
      this.canEvolve = false;
      this.name = name;
   }

   public String[] getTypes() {
      String[] types = null;
      ArrayList<String> implementedTypes = new ArrayList<String>();
      Class<?> currentClass = this.getClass();

      while (currentClass.getSuperclass() != null) {
         Class<?>[] pokemonTypes = currentClass.getInterfaces();
         types = new String[pokemonTypes.length];
         for (int index = 0; index < types.length; index++) {
            String currentInterface = pokemonTypes[index].getSimpleName();

            if (!implementedTypes.contains(currentInterface) && !currentInterface.contains("Serializable")) {
               implementedTypes.add(currentInterface);
            }
         }
         currentClass = currentClass.getSuperclass();
      }
      types = new String[implementedTypes.size()];
      for (int index = 0; index < implementedTypes.size(); index++) {
         types[index] = implementedTypes.get(index);
      }

      return types;
   }

   public void setup(int health, boolean canEvolve){
      this.health = health;
      this.canEvolve = canEvolve;
   }

   public int getPokedexNumber() {
      return pokedexNumber;
   }

   public int getHealth() {
      return health;
   }

   public boolean getCanEvolve() {
      return canEvolve;
   }

   public String getName() {
      return name;
   }

   public void setPokedexNumber(int pokedexNumber) {
      this.pokedexNumber = pokedexNumber;
   }

   public void setHealth(int health) {
      this.health = health;
   }

   public void setCanEvolve(boolean canEvolve) {
      this.canEvolve = canEvolve;
   }

   public void setName(String name) {
      this.name = name;
   }

   @Override
   public String toString() {
      return "Pokemon Info:" + "\n\tName: " + name + "\n\tPokedex Number: " + pokedexNumber + "\n\tHealth: " + health
            + "\n\tCan Evolve: " + canEvolve;
   }
}
