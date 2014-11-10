/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ListViewCntl;
import cravings.ViewType;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.AbstractTableModel;
/**
 * 
 * @author Jackson Hofmann
 */
public class ListView extends javax.swing.JPanel {
    
    private AbstractTableModel theTableModel;
    private ViewType theListType;
    private ListViewCntl theListViewCntl;

    /**
     * Create a new ListView.
     * @param myTableModel The table model that will be used for the read table
     * @param listType The type of list as a {@link cravings.ViewType}, either "food" or "fse".
     */
    public ListView(AbstractTableModel myTableModel, ViewType listType) {
        theTableModel = myTableModel;
        theListType = listType;
        initComponents();
    }
    public JLabel getCDLabel()
    {
        return this.typeTitleCDLabel;
    }
    public ViewType getViewType()
    {
        return theListType;
    }
    public JComboBox getCDAction()
    {
        return this.createDeleteAction;
    }
    public JComboBox getUpdateField()
    {
        return this.fieldToUpdate;
    }
    public JButton getCDButton()
    {
        return this.submitCreateDelete;
    }
    public JButton getUpdateButton()
    {
        return this.submitUpdate;
    }
    public JTextField getCDText()
    {
        return this.createDeleteField;
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

        titlePanel = new javax.swing.JPanel();
        viewTitle = new javax.swing.JLabel();
        readPane = new javax.swing.JScrollPane();
        viewReadData = new javax.swing.JTable();
        createDeletePanel = new javax.swing.JPanel();
        typeTitleCDLabel = new javax.swing.JLabel();
        actionLabel = new javax.swing.JLabel();
        createDeleteAction = new javax.swing.JComboBox();
        submitCreateDelete = new javax.swing.JButton();
        createDeleteField = new javax.swing.JTextField();
        betweenFieldsCD = new javax.swing.Box.Filler(new java.awt.Dimension(25, 0), new java.awt.Dimension(25, 0), new java.awt.Dimension(25, 32767));
        rightStrutCD = new javax.swing.Box.Filler(new java.awt.Dimension(25, 0), new java.awt.Dimension(25, 0), new java.awt.Dimension(25, 0));
        aboveSubmitCD = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        leftStrutCD = new javax.swing.Box.Filler(new java.awt.Dimension(25, 0), new java.awt.Dimension(25, 0), new java.awt.Dimension(25, 32767));
        updatePanel = new javax.swing.JPanel();
        typeLabel = new javax.swing.JLabel();
        newValueLabel = new javax.swing.JLabel();
        updateFieldLabel = new javax.swing.JLabel();
        oldValue = new javax.swing.JTextField();
        newValue = new javax.swing.JTextField();
        fieldToUpdate = new javax.swing.JComboBox();
        submitUpdate = new javax.swing.JButton();
        betweenFieldsUpdate = new javax.swing.Box.Filler(new java.awt.Dimension(25, 0), new java.awt.Dimension(25, 0), new java.awt.Dimension(25, 32767));
        rightStrutUpdate = new javax.swing.Box.Filler(new java.awt.Dimension(25, 0), new java.awt.Dimension(25, 0), new java.awt.Dimension(25, 0));
        aboveSubmitUpdate = new javax.swing.Box.Filler(new java.awt.Dimension(0, 21), new java.awt.Dimension(0, 21), new java.awt.Dimension(0, 21));
        belowOldValue = new javax.swing.Box.Filler(new java.awt.Dimension(0, 21), new java.awt.Dimension(0, 21), new java.awt.Dimension(0, 21));
        topStrutUpdate = new javax.swing.Box.Filler(new java.awt.Dimension(0, 22), new java.awt.Dimension(0, 22), new java.awt.Dimension(32767, 22));
        leftStrutUpdate = new javax.swing.Box.Filler(new java.awt.Dimension(25, 0), new java.awt.Dimension(25, 0), new java.awt.Dimension(25, 32767));
        bottomStrutUpdate = new javax.swing.Box.Filler(new java.awt.Dimension(0, 21), new java.awt.Dimension(0, 21), new java.awt.Dimension(32767, 21));
        aboveTitle = new javax.swing.Box.Filler(new java.awt.Dimension(0, 15), new java.awt.Dimension(0, 15), new java.awt.Dimension(32767, 15));
        belowTitle = new javax.swing.Box.Filler(new java.awt.Dimension(0, 25), new java.awt.Dimension(0, 25), new java.awt.Dimension(32767, 25));
        leftStrut = new javax.swing.Box.Filler(new java.awt.Dimension(25, 0), new java.awt.Dimension(25, 0), new java.awt.Dimension(25, 32767));
        rightStrut = new javax.swing.Box.Filler(new java.awt.Dimension(25, 0), new java.awt.Dimension(25, 0), new java.awt.Dimension(25, 32767));
        belowScrollPane = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        belowCDPane = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        belowUpdatePane = new javax.swing.Box.Filler(new java.awt.Dimension(0, 15), new java.awt.Dimension(0, 15), new java.awt.Dimension(32767, 15));
        titleStrut = new javax.swing.Box.Filler(new java.awt.Dimension(0, 50), new java.awt.Dimension(0, 50), new java.awt.Dimension(32767, 50));

        setMaximumSize(new java.awt.Dimension(600, 800));
        setMinimumSize(new java.awt.Dimension(600, 800));
        setLayout(new java.awt.GridBagLayout());

        titlePanel.setMaximumSize(new java.awt.Dimension(550, 50));
        titlePanel.setMinimumSize(new java.awt.Dimension(550, 50));
        titlePanel.setPreferredSize(new java.awt.Dimension(550, 50));
        titlePanel.setLayout(new java.awt.GridBagLayout());

        viewTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        viewTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        viewTitle.setText("Title");
        viewTitle.setMaximumSize(new java.awt.Dimension(550, 29));
        viewTitle.setMinimumSize(new java.awt.Dimension(550, 29));
        viewTitle.setPreferredSize(new java.awt.Dimension(550, 29));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        titlePanel.add(viewTitle, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        add(titlePanel, gridBagConstraints);

        readPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        readPane.setMaximumSize(new java.awt.Dimension(550, 300));
        readPane.setMinimumSize(new java.awt.Dimension(550, 300));
        readPane.setPreferredSize(new java.awt.Dimension(550, 300));

        viewReadData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        viewReadData.setFillsViewportHeight(true);
        readPane.setViewportView(viewReadData);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        add(readPane, gridBagConstraints);

        createDeletePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Create/Delete", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N
        createDeletePanel.setMaximumSize(new java.awt.Dimension(550, 150));
        createDeletePanel.setMinimumSize(new java.awt.Dimension(550, 150));
        createDeletePanel.setPreferredSize(new java.awt.Dimension(550, 150));
        createDeletePanel.setLayout(new java.awt.GridBagLayout());

        typeTitleCDLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        typeTitleCDLabel.setText("Type");
        typeTitleCDLabel.setMaximumSize(new java.awt.Dimension(100, 25));
        typeTitleCDLabel.setMinimumSize(new java.awt.Dimension(100, 25));
        typeTitleCDLabel.setPreferredSize(new java.awt.Dimension(100, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        createDeletePanel.add(typeTitleCDLabel, gridBagConstraints);

        actionLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        actionLabel.setText("Action:");
        actionLabel.setMaximumSize(new java.awt.Dimension(100, 25));
        actionLabel.setMinimumSize(new java.awt.Dimension(100, 25));
        actionLabel.setPreferredSize(new java.awt.Dimension(100, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        createDeletePanel.add(actionLabel, gridBagConstraints);

        createDeleteAction.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Create", "Delete" }));
        createDeleteAction.setToolTipText("");
        createDeleteAction.setMaximumSize(new java.awt.Dimension(158, 20));
        createDeleteAction.setMinimumSize(new java.awt.Dimension(158, 20));
        createDeleteAction.setPreferredSize(new java.awt.Dimension(158, 20));
        createDeleteAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createDeleteActionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        createDeletePanel.add(createDeleteAction, gridBagConstraints);

        submitCreateDelete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        submitCreateDelete.setText("Submit");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        createDeletePanel.add(submitCreateDelete, gridBagConstraints);

        createDeleteField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        createDeleteField.setMaximumSize(new java.awt.Dimension(317, 20));
        createDeleteField.setMinimumSize(new java.awt.Dimension(317, 20));
        createDeleteField.setPreferredSize(new java.awt.Dimension(317, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        createDeletePanel.add(createDeleteField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        createDeletePanel.add(betweenFieldsCD, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        createDeletePanel.add(rightStrutCD, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        createDeletePanel.add(aboveSubmitCD, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        createDeletePanel.add(leftStrutCD, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        add(createDeletePanel, gridBagConstraints);

        updatePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Update", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N
        updatePanel.setMaximumSize(new java.awt.Dimension(550, 200));
        updatePanel.setMinimumSize(new java.awt.Dimension(550, 200));
        updatePanel.setPreferredSize(new java.awt.Dimension(550, 200));
        updatePanel.setLayout(new java.awt.GridBagLayout());

        typeLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        typeLabel.setLabelFor(oldValue);
        typeLabel.setText("Old Value:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        updatePanel.add(typeLabel, gridBagConstraints);

        newValueLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        newValueLabel.setLabelFor(newValue);
        newValueLabel.setText("New Value:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        updatePanel.add(newValueLabel, gridBagConstraints);

        updateFieldLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        updateFieldLabel.setLabelFor(fieldToUpdate);
        updateFieldLabel.setText("Field:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        updatePanel.add(updateFieldLabel, gridBagConstraints);

        oldValue.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        oldValue.setToolTipText("Old Value");
        oldValue.setMaximumSize(new java.awt.Dimension(317, 20));
        oldValue.setMinimumSize(new java.awt.Dimension(317, 20));
        oldValue.setPreferredSize(new java.awt.Dimension(317, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        updatePanel.add(oldValue, gridBagConstraints);

        newValue.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        newValue.setToolTipText("New Value");
        newValue.setMaximumSize(new java.awt.Dimension(317, 20));
        newValue.setMinimumSize(new java.awt.Dimension(317, 20));
        newValue.setPreferredSize(new java.awt.Dimension(317, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        updatePanel.add(newValue, gridBagConstraints);

        fieldToUpdate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fieldToUpdate.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Name", "Type", "Location" }));
        fieldToUpdate.setMinimumSize(new java.awt.Dimension(158, 20));
        fieldToUpdate.setPreferredSize(new java.awt.Dimension(158, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        updatePanel.add(fieldToUpdate, gridBagConstraints);

        submitUpdate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        submitUpdate.setText("Submit");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        updatePanel.add(submitUpdate, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        updatePanel.add(betweenFieldsUpdate, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 5;
        updatePanel.add(rightStrutUpdate, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        updatePanel.add(aboveSubmitUpdate, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        updatePanel.add(belowOldValue, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        updatePanel.add(topStrutUpdate, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        updatePanel.add(leftStrutUpdate, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 8;
        updatePanel.add(bottomStrutUpdate, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        add(updatePanel, gridBagConstraints);

        aboveTitle.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        add(aboveTitle, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        add(belowTitle, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        add(leftStrut, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        add(rightStrut, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        add(belowScrollPane, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        add(belowCDPane, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        add(belowUpdatePane, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        add(titleStrut, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void createDeleteActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createDeleteActionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createDeleteActionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler aboveSubmitCD;
    private javax.swing.Box.Filler aboveSubmitUpdate;
    private javax.swing.Box.Filler aboveTitle;
    private javax.swing.JLabel actionLabel;
    private javax.swing.Box.Filler belowCDPane;
    private javax.swing.Box.Filler belowOldValue;
    private javax.swing.Box.Filler belowScrollPane;
    private javax.swing.Box.Filler belowTitle;
    private javax.swing.Box.Filler belowUpdatePane;
    private javax.swing.Box.Filler betweenFieldsCD;
    private javax.swing.Box.Filler betweenFieldsUpdate;
    private javax.swing.Box.Filler bottomStrutUpdate;
    private javax.swing.JComboBox createDeleteAction;
    private javax.swing.JTextField createDeleteField;
    private javax.swing.JPanel createDeletePanel;
    private javax.swing.JComboBox fieldToUpdate;
    private javax.swing.Box.Filler leftStrut;
    private javax.swing.Box.Filler leftStrutCD;
    private javax.swing.Box.Filler leftStrutUpdate;
    private javax.swing.JTextField newValue;
    private javax.swing.JLabel newValueLabel;
    private javax.swing.JTextField oldValue;
    private javax.swing.JScrollPane readPane;
    private javax.swing.Box.Filler rightStrut;
    private javax.swing.Box.Filler rightStrutCD;
    private javax.swing.Box.Filler rightStrutUpdate;
    private javax.swing.JButton submitCreateDelete;
    private javax.swing.JButton submitUpdate;
    private javax.swing.JPanel titlePanel;
    private javax.swing.Box.Filler titleStrut;
    private javax.swing.Box.Filler topStrutUpdate;
    private javax.swing.JLabel typeLabel;
    private javax.swing.JLabel typeTitleCDLabel;
    private javax.swing.JLabel updateFieldLabel;
    private javax.swing.JPanel updatePanel;
    private javax.swing.JTable viewReadData;
    private javax.swing.JLabel viewTitle;
    // End of variables declaration//GEN-END:variables
}
