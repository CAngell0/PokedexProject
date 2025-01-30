package pokedexproject.view;

import pokedexproject.controller.Controller;

import javax.swing.JFrame;

public class PokeFrame extends JFrame {
   private Controller app;
   private PokePanel panel;

   public PokeFrame(Controller app){
      super();
      this.app = app;
      this.panel = new PokePanel(app);

      setupFrame();
   }

   private void setupFrame(){
      this.setTitle("Pokemon Project");
      this.setSize(1280, 720);
      this.setResizable(false);
      this.setDefaultCloseOperation(EXIT_ON_CLOSE);
      this.setContentPane(panel);
      this.setVisible(true);
   }
}
