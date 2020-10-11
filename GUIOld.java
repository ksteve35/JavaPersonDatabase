/*
This class is for the graphical user interface
which is the view part of this project according
to MVC terminology.
 */

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.UnsupportedLookAndFeelException;


public class GUIOld implements ActionListener {
    
    private JFrame frame;
    private JPanel containingPanel, buttonPanel;
    private JLabel commandPrompt;
    private JButton[] buttons;
    private final String[] buttonLabels = { "Add a record", "Edit a record", "Delete a record",
                                            "Print by ID Ascending", "Print by ID Descending",
                                            "Print by First Name Ascending", "Print by First Name Descending",
                                            "Print by Last Name Ascending", "Print by Last Name Descending"};
    
    public GUIOld() {
        frame = new JFrame();
        containingPanel = new JPanel();
        buttonPanel = new JPanel();
        buttons = new JButton[buttonLabels.length];
        commandPrompt = new JLabel("Please press one of the following to issue out a command:", SwingConstants.CENTER);
        
        // Create buttons and their ActionListeners
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton(buttonLabels[i]);
            buttons[i].addActionListener(new DetectListener(i));
        }
        
        containingPanel.setLayout(new BorderLayout(0, 12));
        buttonPanel.setLayout(new GridLayout(buttons.length / 3, buttons.length / 3));
        containingPanel.add(commandPrompt, BorderLayout.NORTH);
        
        // Adds buttons to buttonPanel's GridLayout
        for (int i = 0; i < buttons.length; i++) {
            buttonPanel.add(buttons[i]);
        }
        containingPanel.add(buttonPanel, BorderLayout.CENTER);
        frame.add(containingPanel);
        
        /*try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUIOld.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(GUIOld.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(GUIOld.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(GUIOld.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Java Database");
        frame.setSize(960, 540);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {}
    
    private class DetectListener implements ActionListener {
        
        private final int buttonID;
        
        public DetectListener(int bID) {
            buttonID = bID;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String[] titles = { "Adding a Record", "Editing a Record", "Results - ID Ascending",
                                "Results - ID Descending", "Results - First Name Ascending",
                                "Results - First Name Descending", "Results - Last Name Ascending",
                                "Results - Last Name Descending"};
            JFrame data = new JFrame();
            JPanel resultsPanel = new JPanel();
            JTextPane results = new JTextPane();
            Font font = new Font(Font.MONOSPACED, Font.PLAIN, 15);
            results.setFont(font);
            
            switch (buttonID) {
                case 0:     // Adding a Record
                    GUIAddRecord gar = new GUIAddRecord();
                    gar.setTitle(titles[0]);
                    gar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    gar.setVisible(true);
                    break;
                case 1:     // Editing a Record
                    GUIEditRecord ger = new GUIEditRecord();
                    ger.setTitle(titles[1]);
                    ger.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    ger.setVisible(true);
                    break;
                case 2:     // Deleting a Record
                    break;
                case 3:     // ID Ascending
                    results.setText(getResults());
                    resultsPanel.add(results);
                    dataJFrameHelper(data, resultsPanel, titles[2]);
                    break;
                case 4:     // ID Descending
                    results.setText(getResults());
                    resultsPanel.add(results);
                    dataJFrameHelper(data, resultsPanel, titles[3]);
                    break;
                case 5:     // First Name Ascending
                    results.setText(getResults());
                    resultsPanel.add(results);
                    dataJFrameHelper(data, resultsPanel, titles[4]);
                    break;
                case 6:     // First Name Descending
                    results.setText(getResults());
                    resultsPanel.add(results);
                    dataJFrameHelper(data, resultsPanel, titles[5]);
                    break;
                case 7:     // Last Name Ascending
                    results.setText(getResults());
                    resultsPanel.add(results);
                    dataJFrameHelper(data, resultsPanel, titles[6]);
                    break;
                case 8:     // Last Name Descending
                    results.setText(getResults());
                    resultsPanel.add(results);
                    dataJFrameHelper(data, resultsPanel, titles[7]);
                    break;
            }
        }
        
        public String getResults() {
            String retVal = "";
            retVal += Main.databaseToString();
            return retVal;
        }
        
        public void dataJFrameHelper(JFrame data, JPanel resultsPanel, String title) {
            data.add(resultsPanel);
            data.setTitle(title);
            data.setSize(920, 500);
            data.setResizable(false);
            data.setVisible(true);
        }
        
    }
    
}