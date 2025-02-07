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
   private JCheckBox evolverCheckBox;
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
