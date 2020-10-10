
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kyle
 */
public class GUIEditRecord extends javax.swing.JFrame {

    /**
     * Creates new form GUIAddRecord
     */
    public GUIEditRecord() {
        initComponents();
        AgeLabel.setVisible(false);
        AgeTextField.setVisible(false);
        DeceasedCheckBox.setVisible(false);
        FirstNameLabel.setVisible(false);
        FirstNameTextField.setVisible(false);
        HeightFeetLabel.setVisible(false);
        HeightFeetTextField.setVisible(false);
        HeightInchesLabel.setVisible(false);
        HeightInchesTextField.setVisible(false);
        HeightLabel.setVisible(false);
        LastNameLabel.setVisible(false);
        LastNameTextField.setVisible(false);
        MaritalCheckBox.setVisible(false);
        MiddleInitialLabel.setVisible(false);
        MiddleInitialTextField.setVisible(false);
        OptionalFieldsLabel.setVisible(false);
        RequiredFieldsLabel.setText("ID # of Record to Edit:");
        StatusLabel.setVisible(false);
        SubmissionButton.setVisible(false);
        WeightLabel.setVisible(false);
        WeightPoundsLabel.setVisible(false);
        WeightTextField.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        FirstNameLabel = new javax.swing.JLabel();
        TitleOfPageLabel = new javax.swing.JLabel();
        FirstNameTextField = new javax.swing.JTextField();
        MiddleInitialLabel = new javax.swing.JLabel();
        MiddleInitialTextField = new javax.swing.JTextField();
        LastNameLabel = new javax.swing.JLabel();
        LastNameTextField = new javax.swing.JTextField();
        AgeLabel = new javax.swing.JLabel();
        AgeTextField = new javax.swing.JTextField();
        HeightInchesTextField = new javax.swing.JTextField();
        HeightFeetTextField = new javax.swing.JTextField();
        HeightLabel = new javax.swing.JLabel();
        WeightLabel = new javax.swing.JLabel();
        WeightTextField = new javax.swing.JTextField();
        DeceasedCheckBox = new javax.swing.JCheckBox();
        MaritalCheckBox = new javax.swing.JCheckBox();
        SubmissionButton = new javax.swing.JButton();
        RequiredFieldsLabel = new javax.swing.JLabel();
        OptionalFieldsLabel = new javax.swing.JLabel();
        HeightFeetLabel = new javax.swing.JLabel();
        HeightInchesLabel = new javax.swing.JLabel();
        WeightPoundsLabel = new javax.swing.JLabel();
        StatusLabel = new javax.swing.JLabel();
        SearchTextField = new javax.swing.JTextField();
        SearchButton = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        FirstNameLabel.setText("First Name:");

        TitleOfPageLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TitleOfPageLabel.setText("Editing Record");
        TitleOfPageLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        FirstNameTextField.setColumns(25);
        FirstNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstNameTextFieldActionPerformed(evt);
            }
        });

        MiddleInitialLabel.setText("Middle Initial:");

        MiddleInitialTextField.setColumns(1);
        MiddleInitialTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MiddleInitialTextFieldActionPerformed(evt);
            }
        });

        LastNameLabel.setText("Last Name:");

        LastNameTextField.setColumns(25);
        LastNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastNameTextFieldActionPerformed(evt);
            }
        });

        AgeLabel.setText("Age:");

        AgeTextField.setColumns(3);
        AgeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgeTextFieldActionPerformed(evt);
            }
        });

        HeightInchesTextField.setColumns(3);
        HeightInchesTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HeightInchesTextFieldActionPerformed(evt);
            }
        });

        HeightFeetTextField.setColumns(3);
        HeightFeetTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HeightFeetTextFieldActionPerformed(evt);
            }
        });

        HeightLabel.setText("Height:");

        WeightLabel.setText("Weight:");

        WeightTextField.setColumns(3);
        WeightTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WeightTextFieldActionPerformed(evt);
            }
        });

        DeceasedCheckBox.setText("Deceased");
        DeceasedCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeceasedCheckBoxActionPerformed(evt);
            }
        });

        MaritalCheckBox.setText("Married");
        MaritalCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaritalCheckBoxActionPerformed(evt);
            }
        });

        SubmissionButton.setText("Submit Edited Record");
        SubmissionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmissionButtonActionPerformed(evt);
            }
        });

        RequiredFieldsLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RequiredFieldsLabel.setText("Required Fields:");

        OptionalFieldsLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        OptionalFieldsLabel.setText("Optional Fields:");

        HeightFeetLabel.setText("feet");

        HeightInchesLabel.setText("inches");

        WeightPoundsLabel.setText("pounds");

        StatusLabel.setText("Status:");

        SearchTextField.setColumns(3);
        SearchTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchTextFieldActionPerformed(evt);
            }
        });

        SearchButton.setText("Search");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SubmissionButton)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(FirstNameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FirstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LastNameLabel)
                                    .addComponent(AgeLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AgeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(RequiredFieldsLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SearchButton)))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OptionalFieldsLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MiddleInitialLabel)
                                    .addComponent(HeightLabel)
                                    .addComponent(WeightLabel)
                                    .addComponent(StatusLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(WeightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(WeightPoundsLabel))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(HeightFeetTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(HeightFeetLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(HeightInchesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(HeightInchesLabel))
                                    .addComponent(MiddleInitialTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(DeceasedCheckBox)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(MaritalCheckBox)))))))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TitleOfPageLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitleOfPageLabel)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RequiredFieldsLabel)
                    .addComponent(OptionalFieldsLabel)
                    .addComponent(SearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FirstNameLabel)
                    .addComponent(FirstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MiddleInitialLabel)
                    .addComponent(MiddleInitialTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LastNameLabel)
                    .addComponent(LastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HeightLabel)
                    .addComponent(HeightFeetTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HeightInchesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HeightFeetLabel)
                    .addComponent(HeightInchesLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgeLabel)
                    .addComponent(AgeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WeightLabel)
                    .addComponent(WeightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WeightPoundsLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeceasedCheckBox)
                    .addComponent(MaritalCheckBox)
                    .addComponent(StatusLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SubmissionButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FirstNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstNameTextFieldActionPerformed

    private void MiddleInitialTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiddleInitialTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MiddleInitialTextFieldActionPerformed

    private void LastNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastNameTextFieldActionPerformed

    private void AgeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgeTextFieldActionPerformed

    private void HeightInchesTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HeightInchesTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HeightInchesTextFieldActionPerformed

    private void HeightFeetTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HeightFeetTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HeightFeetTextFieldActionPerformed

    private void WeightTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WeightTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WeightTextFieldActionPerformed

    private void DeceasedCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeceasedCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeceasedCheckBoxActionPerformed

    private void MaritalCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaritalCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaritalCheckBoxActionPerformed

    private void SubmissionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmissionButtonActionPerformed
        String[] data = {FirstNameTextField.getText(),
                        LastNameTextField.getText(),
                        AgeTextField.getText(),
                        (MiddleInitialTextField.getText().equals("") ? "-" : MiddleInitialTextField.getText()),
                        (HeightFeetTextField.getText().equals("") ? "0" : HeightFeetTextField.getText()),
                        (HeightInchesTextField.getText().equals("") ? "0" : HeightInchesTextField.getText()),
                        (WeightTextField.getText().equals("") ? "0" : WeightTextField.getText()),
                        (DeceasedCheckBox.isSelected() ? "DECEASED" : "ALIVE"),
                        (MaritalCheckBox.isSelected() ? "MARRIED" : "SINGLE")};
        
        if (data[0].equals("")) {
            // Handle having no first name
            JOptionPane.showMessageDialog(new JFrame(), "Cannot save record with no first name.", "Error - No First Name Given", JOptionPane.ERROR_MESSAGE);
        } else if (data[1].equals("")) {
            // Handle having no last name
            JOptionPane.showMessageDialog(new JFrame(), "Cannot save record with no last name.", "Error - No Last Name Given", JOptionPane.ERROR_MESSAGE);
        } else if (data[2].equals("")) {
            // Handle having no age
            JOptionPane.showMessageDialog(new JFrame(), "Cannot save record with no age.", "Error - No Age Given", JOptionPane.ERROR_MESSAGE);
        } else {
            Main.editRecordToDatabaseThroughGUI(new Record(data[0], data[1], (short) Integer.parseInt(data[2]),
                    Integer.parseInt(SearchTextField.getText()), data[3].charAt(0), (short) Integer.parseInt(data[4]),
                    (short) Integer.parseInt(data[5]), Integer.parseInt(data[6]), data[7].equals("DECEASED"),
                    data[8].equals("MARRIED")), Integer.parseInt(SearchTextField.getText()) - 100);
            JOptionPane.showMessageDialog(new JFrame(), "Record edited!", "Record Successfully Edited", JOptionPane.PLAIN_MESSAGE);
            this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
            
        }
        
    }//GEN-LAST:event_SubmissionButtonActionPerformed

    private void SearchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchTextFieldActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        try {
            Record r = Main.searchByID(Integer.parseInt(SearchTextField.getText()));
            if (r.getDeleted())
                throw new Exception();
            else {
                AgeLabel.setVisible(true);
                AgeTextField.setVisible(true);
                DeceasedCheckBox.setVisible(true);
                FirstNameLabel.setVisible(true);
                FirstNameTextField.setVisible(true);
                HeightFeetLabel.setVisible(true);
                HeightFeetTextField.setVisible(true);
                HeightInchesLabel.setVisible(true);
                HeightInchesTextField.setVisible(true);
                HeightLabel.setVisible(true);
                LastNameLabel.setVisible(true);
                LastNameTextField.setVisible(true);
                MaritalCheckBox.setVisible(true);
                MiddleInitialLabel.setVisible(true);
                MiddleInitialTextField.setVisible(true);
                OptionalFieldsLabel.setVisible(true);
                RequiredFieldsLabel.setText("Required Fields:");
                StatusLabel.setVisible(true);
                SubmissionButton.setVisible(true);
                WeightLabel.setVisible(true);
                WeightPoundsLabel.setVisible(true);
                WeightTextField.setVisible(true);
                SearchTextField.setVisible(false);
                SearchButton.setVisible(false);
                
                FirstNameTextField.setText(r.getFirstName());
                LastNameTextField.setText(r.getLastName());
                AgeTextField.setText(r.getAge()+"");
                MiddleInitialTextField.setText(r.getMiddleInitial()+"");
                HeightFeetTextField.setText(r.getHeightFeet()+"");
                HeightInchesTextField.setText(r.getHeightInches()+"");
                WeightTextField.setText(r.getWeight()+"");
                DeceasedCheckBox.setSelected(r.getDeceased());
                MaritalCheckBox.setSelected(r.getMarried());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(new JFrame(), "Could not find Record #" + SearchTextField.getText() + ".", "Error - No Record Found", JOptionPane.ERROR_MESSAGE);
            SearchTextField.setText("");
        }
    }//GEN-LAST:event_SearchButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIAddRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIAddRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIAddRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIAddRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIAddRecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AgeLabel;
    private javax.swing.JTextField AgeTextField;
    private javax.swing.JCheckBox DeceasedCheckBox;
    private javax.swing.JLabel FirstNameLabel;
    private javax.swing.JTextField FirstNameTextField;
    private javax.swing.JLabel HeightFeetLabel;
    private javax.swing.JTextField HeightFeetTextField;
    private javax.swing.JLabel HeightInchesLabel;
    private javax.swing.JTextField HeightInchesTextField;
    private javax.swing.JLabel HeightLabel;
    private javax.swing.JLabel LastNameLabel;
    private javax.swing.JTextField LastNameTextField;
    private javax.swing.JCheckBox MaritalCheckBox;
    private javax.swing.JLabel MiddleInitialLabel;
    private javax.swing.JTextField MiddleInitialTextField;
    private javax.swing.JLabel OptionalFieldsLabel;
    private javax.swing.JLabel RequiredFieldsLabel;
    private javax.swing.JButton SearchButton;
    private javax.swing.JTextField SearchTextField;
    private javax.swing.JLabel StatusLabel;
    private javax.swing.JButton SubmissionButton;
    private javax.swing.JLabel TitleOfPageLabel;
    private javax.swing.JLabel WeightLabel;
    private javax.swing.JLabel WeightPoundsLabel;
    private javax.swing.JTextField WeightTextField;
    private javax.swing.JDialog jDialog1;
    // End of variables declaration//GEN-END:variables
}
