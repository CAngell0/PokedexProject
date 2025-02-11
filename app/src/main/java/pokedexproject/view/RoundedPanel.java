package pokedexproject.view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

public class RoundedPanel extends JPanel {
   private int topLeftRadius = 0;
   private int topRightRadius = 0;
   private int bottomLeftRadius = 0;
   private int bottomRightRadius = 0;

   public RoundedPanel(){
      setOpaque(false);
   }
   
   @Override
   protected void paintComponent(Graphics graphics) {
      Graphics2D graphics2d = (Graphics2D) graphics.create();
      graphics2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      graphics2d.dispose();
      super.paintComponent(graphics);
   }

   public int getTopLeftRadius() {
      return topLeftRadius;
   }

   public void setTopLeftRadius(int topLeftRadius) {
      this.topLeftRadius = topLeftRadius;
   }

   public int getTopRightRadius() {
      return topRightRadius;
   }

   public void setTopRightRadius(int topRightRadius) {
      this.topRightRadius = topRightRadius;
   }

   public int getBottomLeftRadius() {
      return bottomLeftRadius;
   }

   public void setBottomLeftRadius(int bottomLeftRadius) {
      this.bottomLeftRadius = bottomLeftRadius;
   }

   public int getBottomRightRadius() {
      return bottomRightRadius;
   }

   public void setBottomRightRadius(int bottomRightRadius) {
      this.bottomRightRadius = bottomRightRadius;
   }
}
