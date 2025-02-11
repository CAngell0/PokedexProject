package pokedexproject.view;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class RoundedPanel extends JPanel {

   public RoundedPanel(){
      setOpaque(false);
   }
   
   @Override
   protected void paintComponent(Graphics graphics) {

      super.paintComponent(graphics);
   }
}
