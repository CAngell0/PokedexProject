package pokedexproject.view;

import javax.swing.JFrame;



public class PokeFrame extends JFrame {
   public PokeFrame(){
      super();
      setupFrame();
   }

   private void setupFrame(){
      this.setTitle("Pokemon Project");
      this.setSize(1920, 1080);
      this.setResizable(false);
      this.setDefaultCloseOperation(EXIT_ON_CLOSE);
      this.setVisible(true);
   }
}
