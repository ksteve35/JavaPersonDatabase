
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yonde
 */
public class GUISelection extends javax.swing.JFrame {

    /**
     * Creates new form GUISelection
     */
    public GUISelection() {
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

        TitleOfPageLabel = new javax.swing.JLabel();
        RecordAlterationLabel = new javax.swing.JLabel();
        PrintSortedDatabaseLabel = new javax.swing.JLabel();
        AddRecordButton = new javax.swing.JButton();
        EditRecordButton = new javax.swing.JButton();
        DeleteRecordButton = new javax.swing.JButton();
        VariableComboBox = new javax.swing.JComboBox<>();
        SortingComboBox = new javax.swing.JComboBox<>();
        PrintDatabaseButton = new javax.swing.JButton();
        FileManagementLabel = new javax.swing.JLabel();
        SaveDatabaseButton = new javax.swing.JButton();
        LoadDatabaseButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TitleOfPageLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TitleOfPageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleOfPageLabel.setText("Please Select an Option:");
        TitleOfPageLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        TitleOfPageLabel.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                TitleOfPageLabelAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        RecordAlterationLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RecordAlterationLabel.setText("Record Alteration:");

        PrintSortedDatabaseLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PrintSortedDatabaseLabel.setText("Print Sorted Database:");

        AddRecordButton.setText("Add a Record");
        AddRecordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddRecordButtonActionPerformed(evt);
            }
        });

        EditRecordButton.setText("Edit a Record");
        EditRecordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditRecordButtonActionPerformed(evt);
            }
        });

        DeleteRecordButton.setText("Delete a Record");

        VariableComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "First Name", "Last Name" }));
        VariableComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VariableComboBoxActionPerformed(evt);
            }
        });

        SortingComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ascending", "Descending" }));
        SortingComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SortingComboBoxActionPerformed(evt);
            }
        });

        PrintDatabaseButton.setText("Print Database");
        PrintDatabaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintDatabaseButtonActionPerformed(evt);
            }
        });

        FileManagementLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        FileManagementLabel.setText("File Management:");

        SaveDatabaseButton.setText("Save Database");
        SaveDatabaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveDatabaseButtonActionPerformed(evt);
            }
        });

        LoadDatabaseButton.setText("Load Database");
        LoadDatabaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadDatabaseButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TitleOfPageLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RecordAlterationLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(AddRecordButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DeleteRecordButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EditRecordButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PrintSortedDatabaseLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(VariableComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SortingComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PrintDatabaseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FileManagementLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SaveDatabaseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LoadDatabaseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitleOfPageLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RecordAlterationLabel)
                    .addComponent(PrintSortedDatabaseLabel)
                    .addComponent(FileManagementLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AddRecordButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EditRecordButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(VariableComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SortingComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SaveDatabaseButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PrintDatabaseButton)
                            .addComponent(LoadDatabaseButton))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DeleteRecordButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TitleOfPageLabelAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_TitleOfPageLabelAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_TitleOfPageLabelAncestorAdded

    private void VariableComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VariableComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VariableComboBoxActionPerformed

    private void SortingComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SortingComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SortingComboBoxActionPerformed

    private void AddRecordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddRecordButtonActionPerformed
        GUIAddRecord gar = new GUIAddRecord();
        gar.setTitle("Adding a Record");
        gar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        gar.setVisible(true);
    }//GEN-LAST:event_AddRecordButtonActionPerformed

    private void EditRecordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditRecordButtonActionPerformed
        GUIEditRecord ger = new GUIEditRecord();
        ger.setTitle("Editing a Record");
        ger.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ger.setVisible(true);
    }//GEN-LAST:event_EditRecordButtonActionPerformed

    private void PrintDatabaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintDatabaseButtonActionPerformed
        JFrame data = new JFrame();
        JPanel resultsPanel = new JPanel();
        JTextPane results = new JTextPane();
        Font font = new Font(Font.MONOSPACED, Font.PLAIN, 15);
        String vcb = VariableComboBox.getSelectedItem().toString();
        String scb = SortingComboBox.getSelectedItem().toString();
        results.setFont(font);
        results.setText(Main.databaseToString());
        resultsPanel.add(results);
        data.add(resultsPanel);
        data.setTitle(vcb + " " + scb);
        data.setSize(920, 500);
        data.setResizable(false);
        data.setVisible(true);
    }//GEN-LAST:event_PrintDatabaseButtonActionPerformed

    private void SaveDatabaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveDatabaseButtonActionPerformed
        Main.saveDatabaseToJSON();
    }//GEN-LAST:event_SaveDatabaseButtonActionPerformed

    private void LoadDatabaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadDatabaseButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoadDatabaseButtonActionPerformed

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
            java.util.logging.Logger.getLogger(GUISelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUISelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUISelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUISelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUISelection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddRecordButton;
    private javax.swing.JButton DeleteRecordButton;
    private javax.swing.JButton EditRecordButton;
    private javax.swing.JLabel FileManagementLabel;
    private javax.swing.JButton LoadDatabaseButton;
    private javax.swing.JButton PrintDatabaseButton;
    private javax.swing.JLabel PrintSortedDatabaseLabel;
    private javax.swing.JLabel RecordAlterationLabel;
    private javax.swing.JButton SaveDatabaseButton;
    private javax.swing.JComboBox<String> SortingComboBox;
    private javax.swing.JLabel TitleOfPageLabel;
    private javax.swing.JComboBox<String> VariableComboBox;
    // End of variables declaration//GEN-END:variables
}