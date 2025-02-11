package pokedexproject.view;

import pokedexproject.controller.Controller;

import javax.swing.*;
import java.awt.Color;
import java.awt.GridLayout;

public class PokePanel extends JPanel {
   Controller app;

   private JPanel fieldPanel;
   private JScrollPane scrollPane;
   private SpringLayout layout;
   
   private JButton updateButton;
   private JCheckBox evolveCheckBox;
   private JTextArea typeArea;

   private JTextField nameField;
   private JTextField healthField;
   private JTextField numberField;

   private JLabel nameLabel;
   private JLabel healthLabel;
   private JLabel numberLabel;

   private JLabel imageLabel;
   private ImageIcon pokemonImage;
   private JComboBox<String> pokedexSelector;

   public PokePanel(Controller app){
      super();
      this.app = app;

      this.fieldPanel = new JPanel(new GridLayout(0,2));
      this.scrollPane = new JScrollPane();
      this.layout = new SpringLayout();

      this.healthField = new JTextField("health");
      this.nameField = new JTextField("name");
      this.numberField = new JTextField("number");

      this.nameLabel = new JLabel("Pokemon Name: ");
      this.healthLabel = new JLabel("Pokemon Health: ");
      this.numberLabel = new JLabel("Pokedex Number: ");

      this.updateButton = new JButton();
      this.evolveCheckBox = new JCheckBox("Pokemon Can Evolve: ", false);
      this.typeArea = new JTextArea(20, 20);

      this.pokemonImage = new ImageIcon();
      this.imageLabel = new JLabel("image");
      this.pokedexSelector = new JComboBox<String>();

      setupPanel();
      setupListeners();
      setupLayout();

      updateDisplay("");
   }

   private void updateDisplay(String name){
      String path = "/pokedexproject/view/images/";
      String extension = ".png";
      String defaultName = "pokeball";

      try {
         pokemonImage = new ImageIcon(getClass().getResource(path + name + extension));
      } catch (NullPointerException error){
         pokemonImage = new ImageIcon(getClass().getResource(path + defaultName + extension));
      }
      
      imageLabel.setIcon(pokemonImage);
      repaint();
   }

   private void setupPanel(){
      // this.setLayout();
      this.setLayout(layout);
      this.setBackground(Color.CYAN);

      this.numberField.setEnabled(false);
      this.typeArea.setEnabled(false);
      this.scrollPane.setViewportView(typeArea);
      this.scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
      this.scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

      fieldPanel.add(healthLabel);
      fieldPanel.add(healthField);

      fieldPanel.add(healthLabel);
      fieldPanel.add(healthField);

      fieldPanel.add(numberLabel);
      fieldPanel.add(numberField);

      fieldPanel.add(evolveCheckBox);
      fieldPanel.add(scrollPane);

      this.add(fieldPanel);
      this.add(imageLabel);
      this.add(pokedexSelector);
   }
   private void setupListeners(){

   }
   private void setupLayout(){
      layout.putConstraint(SpringLayout.WEST, fieldPanel, -250, SpringLayout.EAST, this);
      layout.putConstraint(SpringLayout.EAST, fieldPanel, 25, SpringLayout.EAST, this);
      layout.putConstraint(SpringLayout.SOUTH, fieldPanel, -25, SpringLayout.SOUTH, this);
      layout.putConstraint(SpringLayout.NORTH, fieldPanel, 25, SpringLayout.NORTH, this);

      layout.putConstraint(SpringLayout.WEST, imageLabel, 350, SpringLayout.WEST, this);
      layout.putConstraint(SpringLayout.EAST, imageLabel, -100, SpringLayout.WEST, fieldPanel);
      layout.putConstraint(SpringLayout.NORTH, imageLabel, 150, SpringLayout.NORTH, this);

      layout.putConstraint(SpringLayout.WEST, pokedexSelector, 150, SpringLayout.WEST, this);
      layout.putConstraint(SpringLayout.EAST, pokedexSelector, -150, SpringLayout.WEST, fieldPanel);
      layout.putConstraint(SpringLayout.SOUTH, pokedexSelector, -150, SpringLayout.SOUTH, this);
   }
}
