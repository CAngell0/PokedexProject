package pokedexproject.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JPanel;

public class RoundedPanel extends JPanel {
   private int topLeftRadius = 0;
   private int topRightRadius = 0;
   private int bottomLeftRadius = 0;
   private int bottomRightRadius = 0;

   public RoundedPanel(){
      setOpaque(false);
   }
   public RoundedPanel(LayoutManager layoutManager){
      super(layoutManager);
      setOpaque(false);
   }
   
   @Override
   protected void paintComponent(Graphics graphics) {
      Graphics2D graphics2d = (Graphics2D) graphics.create();
      graphics2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      graphics2d.setBackground(super.getBackground());
      graphics2d.setColor(getBackground());

      Area area = new Area(new Area(createRoundedTopLeft()));
      if (topRightRadius > 0) area.intersect(new Area(createRoundedTopRight()));
      if (bottomLeftRadius > 0) area.intersect(new Area(createRoundedBottomLeft()));
      if (bottomRightRadius > 0) area.intersect(new Area(createRoundedBottomRight()));
      
      graphics2d.fill(area);

      graphics2d.dispose();
      super.paintComponent(graphics);
   }


   private Shape createRoundedTopLeft(){
      int width = this.getWidth();
      int height = this.getHeight();
      int roundX = Math.min(width, topLeftRadius);
      int roundY = Math.min(height, topLeftRadius);

      Area area = new Area(new RoundRectangle2D.Double(0, 0, width, height, roundX, roundY));

      area.add(new Area(new Rectangle2D.Double(
         roundX / 2, 
         0, 
         width - (roundX / 2), 
         height
      )));
      area.add(new Area(new Rectangle2D.Double(
         0, 
         roundY / 2, 
         width, 
         height - (roundY / 2)
      )));
      
      return area;
   }
   public int getTopLeftRadius() {
      return topLeftRadius;
   }
   public void setTopLeftRadius(int topLeftRadius) {
      this.topLeftRadius = topLeftRadius;
      repaint();
   }



   private Shape createRoundedTopRight(){
      int width = this.getWidth();
      int height = this.getHeight();
      int roundX = Math.min(width, topRightRadius);
      int roundY = Math.min(height, topRightRadius);

      Area area = new Area(new RoundRectangle2D.Double(0, 0, width, height, roundX, roundY));

      area.add(new Area(new Rectangle2D.Double(
         0, 
         0, 
         width - (roundX / 2), 
         height - (roundY / 2)
      )));
      area.add(new Area(new Rectangle2D.Double(
         roundX / 2, 
         roundY / 2, 
         width, 
         height - (roundY / 2)
      )));
      
      return area;
   }
   public int getTopRightRadius() {
      return topRightRadius;
   }
   public void setTopRightRadius(int topRightRadius) {
      this.topRightRadius = topRightRadius;
      repaint();
   }



   private Shape createRoundedBottomLeft(){
      int width = this.getWidth();
      int height = this.getHeight();
      int roundX = Math.min(width, bottomLeftRadius);
      int roundY = Math.min(height, bottomLeftRadius);

      Area area = new Area(new RoundRectangle2D.Double(0, 0, width, height, roundX, roundY));

      area.add(new Area(new Rectangle2D.Double(
         roundX / 2, 
         0, 
         width - (roundX / 2), 
         height
      )));
      area.add(new Area(new Rectangle2D.Double(
         0, 
         0, 
         width, 
         height - (roundY / 2)
      )));
      
      return area;
   }
   public int getBottomLeftRadius() {
      return bottomLeftRadius;
   }
   public void setBottomLeftRadius(int bottomLeftRadius) {
      this.bottomLeftRadius = bottomLeftRadius;
      repaint();
   }



   private Shape createRoundedBottomRight(){
      int width = this.getWidth();
      int height = this.getHeight();
      int roundX = Math.min(width, bottomRightRadius);
      int roundY = Math.min(height, bottomRightRadius);

      Area area = new Area(new RoundRectangle2D.Double(0, 0, width, height, roundX, roundY));

      area.add(new Area(new Rectangle2D.Double(
         0, 
         0, 
         width - (roundX / 2), 
         height
      )));
      area.add(new Area(new Rectangle2D.Double(
         0, 
         0, 
         width, 
         height - (roundY / 2)
      )));
      
      return area;
   }
   public int getBottomRightRadius() {
      return bottomRightRadius;
   }
   public void setBottomRightRadius(int bottomRightRadius) {
      this.bottomRightRadius = bottomRightRadius;
      repaint();
   }



   public void setAllRadius(int radius){
      this.setTopLeftRadius(radius);
      this.setTopRightRadius(radius);
      this.setBottomLeftRadius(radius);
      this.setBottomRightRadius(radius);
      repaint();
   }
}
