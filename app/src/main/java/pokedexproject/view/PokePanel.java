package pokedexproject.view;

import pokedexproject.controller.Controller;

import javax.swing.*;
import javax.swing.border.EtchedBorder;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

public class PokePanel extends JPanel {
   Controller app;

   private RoundedPanel fieldPanel;
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

      this.fieldPanel = new RoundedPanel(new GridLayout(0,2));
      this.scrollPane = new JScrollPane();
      this.layout = new SpringLayout();

      this.healthField = new JTextField("Health");
      this.nameField = new JTextField("Name");
      this.numberField = new JTextField("Number");

      this.nameLabel = new JLabel("Pokemon Name: ");
      this.healthLabel = new JLabel("Pokemon Health: ");
      this.numberLabel = new JLabel("Pokedex Number: ");

      this.updateButton = new JButton();
      this.evolveCheckBox = new JCheckBox("Pokemon Evolves: ", false);
      this.typeArea = new JTextArea(20, 20);

      this.pokemonImage = new ImageIcon();
      this.imageLabel = new JLabel("Pokemon Image:");
      this.pokedexSelector = new JComboBox<String>();

      this.updateButton = new JButton("Update Pokemon");

      setupPanel();
      setupListeners();
      setupLayout();

      updateDisplay("");
   }

   private void collectInput(){
      String name = nameField.getText();
      String healthText = healthField.getText();
      boolean canEvolve = evolveCheckBox.isSelected();
      int index = pokedexSelector.getSelectedIndex();

      if (app.validateNumber(healthText) && index > -1){
         int health = Integer.parseInt(healthText);
         app.updateCurrentPokemon(name, index, health, canEvolve);
      }
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
      this.setLayout(layout);
      this.setBackground(new Color(237, 237, 237));

      this.numberField.setEnabled(false);
      this.typeArea.setEnabled(false);

      this.scrollPane.setViewportView(typeArea);
      this.scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
      this.scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

      this.imageLabel.setHorizontalTextPosition(JLabel.CENTER);
      this.imageLabel.setVerticalTextPosition((int) JPanel.BOTTOM_ALIGNMENT);
      this.imageLabel.setFont(new Font("Serif", Font.BOLD, 32));

      this.nameLabel.setHorizontalAlignment((int) CENTER_ALIGNMENT);
   this.healthLabel.setHorizontalAlignment((int) CENTER_ALIGNMENT);
      this.numberLabel.setHorizontalAlignment((int) CENTER_ALIGNMENT);

      this.nameField.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
      this.healthField.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
      this.numberField.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
      this.scrollPane.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));

      fieldPanel.setTopLeftRadius(50);
      fieldPanel.setBottomLeftRadius(50);
      fieldPanel.setBackground(Color.white);

      fieldPanel.add(nameLabel);
      fieldPanel.add(nameField);

      fieldPanel.add(healthLabel);
      fieldPanel.add(healthField);

      fieldPanel.add(numberLabel);
      fieldPanel.add(numberField);

      fieldPanel.add(evolveCheckBox);
      fieldPanel.add(scrollPane);

      fieldPanel.add(new JLabel(" "));
      fieldPanel.add(updateButton);

      this.add(fieldPanel);
      this.add(imageLabel);
      this.add(pokedexSelector);
   }

   private void setupListeners(){
      updateButton.addActionListener(click -> collectInput());
   }

   private void setupLayout(){
      layout.putConstraint(SpringLayout.WEST, fieldPanel, -300, SpringLayout.EAST, this);
      layout.putConstraint(SpringLayout.EAST, fieldPanel, 0, SpringLayout.EAST, this);
      layout.putConstraint(SpringLayout.SOUTH, fieldPanel, -100, SpringLayout.SOUTH, this);
      layout.putConstraint(SpringLayout.NORTH, fieldPanel, 100, SpringLayout.NORTH, this);

      layout.putConstraint(SpringLayout.WEST, imageLabel, 350, SpringLayout.WEST, this);
      layout.putConstraint(SpringLayout.EAST, imageLabel, -100, SpringLayout.WEST, fieldPanel);
      layout.putConstraint(SpringLayout.NORTH, imageLabel, 150, SpringLayout.NORTH, this);

      layout.putConstraint(SpringLayout.WEST, pokedexSelector, 150, SpringLayout.WEST, this);
      layout.putConstraint(SpringLayout.EAST, pokedexSelector, -150, SpringLayout.WEST, fieldPanel);
      layout.putConstraint(SpringLayout.SOUTH, pokedexSelector, -100, SpringLayout.SOUTH, this);
   }
}
