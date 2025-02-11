package pokedexproject.view;

import javax.swing.JOptionPane;

public class Popup {
   private PokeFrame window;

   public Popup(PokeFrame window){
      this.window = window;
   }

   public void displayMessage(String message){
      JOptionPane.showMessageDialog(window, message);
   }
}
