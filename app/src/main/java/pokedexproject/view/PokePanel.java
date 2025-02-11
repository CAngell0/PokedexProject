package pokedexproject.view;

import pokedexproject.controller.Controller;

import javax.swing.*;
import java.awt.Color;
import java.awt.GridLayout;

public class PokePanel extends JPanel {
   Controller app;

   private JPanel fieldPanel;
   private JScrollPane scrollPane;
   
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

      this.healthField = new JTextField("health");
      this.nameField = new JTextField("name");
      this.numberField = new JTextField("number");

      this.nameLabel = new JLabel("Pokemon Name: ");
      this.healthLabel = new JLabel("Pokemon Health: ");
      this.nameLabel = new JLabel("Pokemon Name: ");

      this.updateButton = new JButton();
      this.evolveCheckBox = new JCheckBox("Pokemon Can Evolve: ", false);
      this.typeArea = new JTextArea();

      this.imageLabel = new JLabel("image");
      this.pokemonImage = new ImageIcon();
      this.pokedexSelector = new JComboBox<String>();

      setupPanel();
      setupListeners();
      setupLayout();
   }

   private void setupPanel(){
      
   }
   private void setupListeners(){

   }
   private void setupLayout(){

   }
}
