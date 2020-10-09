
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
public class GUIAddRecord extends javax.swing.JFrame {

    /**
     * Creates new form GUIAddRecord
     */
    public GUIAddRecord() {
        initComponents();
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
        TitleOfPageLabel.setText("Adding A Record");
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

        SubmissionButton.setText("Submit New Record");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TitleOfPageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SubmissionButton)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(RequiredFieldsLabel)
                                .addGap(225, 225, 225)
                                .addComponent(OptionalFieldsLabel))
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
                                            .addComponent(LastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(56, 56, 56)
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
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitleOfPageLabel)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RequiredFieldsLabel)
                    .addComponent(OptionalFieldsLabel))
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
            JOptionPane.showMessageDialog(new JFrame(), "Cannot add record with no first name.", "Error - No First Name Given", JOptionPane.ERROR_MESSAGE);
        } else if (data[1].equals("")) {
            // Handle having no last name
            JOptionPane.showMessageDialog(new JFrame(), "Cannot add record with no last name.", "Error - No Last Name Given", JOptionPane.ERROR_MESSAGE);
        } else if (data[2].equals("")) {
            // Handle having no age
            JOptionPane.showMessageDialog(new JFrame(), "Cannot add record with no age.", "Error - No Age Given", JOptionPane.ERROR_MESSAGE);
        } else {
            Main.addRecordToDatabaseThroughGUI(data);
            FirstNameTextField.setText("");
            LastNameTextField.setText("");
            AgeTextField.setText("");
            MiddleInitialTextField.setText("");
            HeightFeetTextField.setText("");
            HeightInchesTextField.setText("");
            WeightTextField.setText("");
            DeceasedCheckBox.setSelected(false);
            MaritalCheckBox.setSelected(false);
            JOptionPane.showMessageDialog(new JFrame(), "Record added!", "Record Successfully Added", JOptionPane.PLAIN_MESSAGE);
        }
        
    }//GEN-LAST:event_SubmissionButtonActionPerformed

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
    private javax.swing.JLabel StatusLabel;
    private javax.swing.JButton SubmissionButton;
    private javax.swing.JLabel TitleOfPageLabel;
    private javax.swing.JLabel WeightLabel;
    private javax.swing.JLabel WeightPoundsLabel;
    private javax.swing.JTextField WeightTextField;
    private javax.swing.JDialog jDialog1;
    // End of variables declaration//GEN-END:variables
}