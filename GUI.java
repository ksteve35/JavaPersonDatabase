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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;


public class GUI implements ActionListener {
    
    private JFrame frame;
    private JPanel containingPanel, buttonPanel;
    private JLabel commandPrompt;
    private JButton[] buttons;
    private final String[] buttonLabels = { "Add a record", "Edit a record", "Delete a record",
                                            "Print by ID Ascending", "Print by ID Descending", "Print by First Name Ascending"};
    
    public GUI() {
        frame = new JFrame();
        containingPanel = new JPanel();
        buttonPanel = new JPanel();
        buttons = new JButton[6];
        commandPrompt = new JLabel("Please press one of the following to issue out a command:", SwingConstants.CENTER);
        
        // Create buttons and their ActionListeners
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton(buttonLabels[i]);
            buttons[i].addActionListener(new DetectListener(i));
        }
        
        
        
        
        //JTextField firstNameTextField = new JTextField(20);
        
        containingPanel.setLayout(new BorderLayout(0, 12));
        buttonPanel.setLayout(new GridLayout(2, 3));
        containingPanel.add(commandPrompt, BorderLayout.NORTH);
        
        // Adds buttons to buttonPanel's GridLayout
        for (int i = 0; i < buttons.length; i++) {
            buttonPanel.add(buttons[i]);
        }
        containingPanel.add(buttonPanel, BorderLayout.CENTER);
        frame.add(containingPanel);
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
            JFrame data = new JFrame();
            JPanel resultsPanel = new JPanel();
            JTextPane results = new JTextPane();
            Font font = new Font(Font.MONOSPACED, Font.PLAIN, 15);
            results.setFont(font);
            
            switch (buttonID) {
                case 3:
                    results.setText(getResults());
                    resultsPanel.add(results);
                    data.add(resultsPanel);
                    data.setTitle("Results - ID Ascending");
                    data.setSize(920, 500);
                    data.setResizable(false);
                    data.setVisible(true);
                    break;
            }
        }
        
        public String getResults() {
            String retVal = "";
            retVal += Main.databaseToString();
            return retVal;
        }
    }
    
    
    
}