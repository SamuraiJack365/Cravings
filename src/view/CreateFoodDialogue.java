/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

/**
 *
 * @author Jackson Hofmann
 */
public class CreateFoodDialogue extends javax.swing.JDialog {

    /**
     * Creates new form CreateDialogue
     */
    public CreateFoodDialogue() {
        this.setUndecorated(true);
        initComponents();
    }
    public JLabel getNewFoodName()
    {
        return this.newFoodName;
    }
    public JButton getSubmit()
    {
        return this.submit;
    }
    public JComboBox getFSEList()
    {
        return this.LocationSelection;
    }
    public JComboBox getGenreList()
    {
        return this.foodGenreList;
    }
    public ButtonGroup getVegLevel()
    {
        return this.VegLevel;
    }
    public JRadioButton getNeitherRadio()
    {
        return this.neitherRadio;
    }
    public JRadioButton getVeganRadio()
    {
        return this.veganRadio;
    }
    public JRadioButton getVegitRadio()
    {
        return this.vegitarianRadio;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        VegLevel = new javax.swing.ButtonGroup();
        newFoodName = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        veganRadio = new javax.swing.JRadioButton();
        vegitarianRadio = new javax.swing.JRadioButton();
        neitherRadio = new javax.swing.JRadioButton();
        FoodGenreLabel = new javax.swing.JLabel();
        foodGenreList = new javax.swing.JComboBox();
        foodLocationLabel = new javax.swing.JLabel();
        LocationSelection = new javax.swing.JComboBox();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 34), new java.awt.Dimension(0, 34), new java.awt.Dimension(32767, 46));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 33), new java.awt.Dimension(0, 33), new java.awt.Dimension(32767, 46));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 33), new java.awt.Dimension(0, 33), new java.awt.Dimension(32767, 46));
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 34), new java.awt.Dimension(0, 34), new java.awt.Dimension(32767, 34));
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(25, 0), new java.awt.Dimension(25, 0), new java.awt.Dimension(25, 32767));
        submit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 200));
        setMinimumSize(new java.awt.Dimension(400, 200));
        setPreferredSize(new java.awt.Dimension(400, 200));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        newFoodName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        newFoodName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newFoodName.setText("Food Name");
        newFoodName.setMaximumSize(new java.awt.Dimension(400, 22));
        newFoodName.setMinimumSize(new java.awt.Dimension(400, 22));
        newFoodName.setPreferredSize(new java.awt.Dimension(400, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(newFoodName, gridBagConstraints);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pick one"));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        VegLevel.add(veganRadio);
        veganRadio.setText("Vegan");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel1.add(veganRadio, gridBagConstraints);

        VegLevel.add(vegitarianRadio);
        vegitarianRadio.setText("Vegitarian");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel1.add(vegitarianRadio, gridBagConstraints);

        VegLevel.add(neitherRadio);
        neitherRadio.setText("Neither");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel1.add(neitherRadio, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 5;
        getContentPane().add(jPanel1, gridBagConstraints);

        FoodGenreLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FoodGenreLabel.setText("Food Genre:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        getContentPane().add(FoodGenreLabel, gridBagConstraints);

        foodGenreList.setEditable(true);
        foodGenreList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(foodGenreList, gridBagConstraints);

        foodLocationLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        foodLocationLabel.setText("Location:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(foodLocationLabel, gridBagConstraints);

        LocationSelection.setEditable(true);
        LocationSelection.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "LocationList" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(LocationSelection, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        getContentPane().add(filler1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        getContentPane().add(filler2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        getContentPane().add(filler3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        getContentPane().add(filler4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        getContentPane().add(filler5, gridBagConstraints);

        submit.setText("Submit");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 7;
        getContentPane().add(submit, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FoodGenreLabel;
    private javax.swing.JComboBox LocationSelection;
    private javax.swing.ButtonGroup VegLevel;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.JComboBox foodGenreList;
    private javax.swing.JLabel foodLocationLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton neitherRadio;
    private javax.swing.JLabel newFoodName;
    private javax.swing.JButton submit;
    private javax.swing.JRadioButton veganRadio;
    private javax.swing.JRadioButton vegitarianRadio;
    // End of variables declaration//GEN-END:variables
}
