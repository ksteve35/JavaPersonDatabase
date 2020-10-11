/*

This program is just me having fun trying to program
a database from scratch without the use of SQL. In short,
this is a COSC 311 revisit for me as I reteach myself
the sorting algorithms we went over in that class, as
well as familiarizing myself with Java GUIOld programming.

*/

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

public class Main {
    
    public static Database db;
    public static byte selection = -1;
    
    public static void main(String[] args) {
        
        /*
        Asks if the user wants to start a brand new Database,
        load a previously saved Database, or use a template Databse.
        */
        GUIStartingUp gsu = new GUIStartingUp();
        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        gsu.setVisible(true);
        
        while (gsu.isVisible()) {
            try {
                //replace this while loop with some form of synchronization
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        switch (selection) {
            case 0:
                // Creates new Database with 1000 slots
                db = new Database(1000);
                break;
            case 1:
                // Loads Database from a JSON file
                loadDatabaseFromJSON();
                break;
            case 2:
                // Loads template Database for debugging purposes
                db = createTemplateDatabase();
                break;
            default:
                System.out.println("Error - Selection variable was not between 0 and 2 in main method.");
                break;
        }
        
        GUISelection gs = new GUISelection();
        gs.setTitle("Java Database");
        gs.setVisible(true);
    }
    
    public static void setBeginningSelection(byte b) {
        
        /*
        This method keeps track of what option the user chose
        when first launching the application such that the
        main() method knows what option to choose when launched.
        0 = Create New Database
        1 = Load Database JSON File
        2 = Load Template Database
        */
        
        switch (b) {
            case 0:
                selection = (byte) 0;
                break;
            case 1:
                selection = (byte) 1;
                break;
            case 2:
                selection = (byte) 2;
                break;
            default:
                System.out.println("Error - global selection method hit default switch option in Main.setBeginningSelection(byte b) method.");
                selection = 0;
                break;
        }
    }
    
    public static void saveDatabaseToJSON() {
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        jfc.setDialogTitle("Choose a directory to save your file: ");
        jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        jfc.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JSON File", "JSON");
        jfc.addChoosableFileFilter(filter);
        int retVal = jfc.showSaveDialog(null);
        if (retVal == JFileChooser.APPROVE_OPTION) {
            File selectedFile = jfc.getSelectedFile();
            
            int filelength = selectedFile.getAbsolutePath().length();
            if (!selectedFile.getAbsolutePath().substring(filelength - 5, filelength).toLowerCase().equals(".json"))
                selectedFile = new File(selectedFile.getAbsolutePath() + ".json");
            
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = gson.toJson(db);
            
            try {
                BufferedWriter out = new BufferedWriter(new FileWriter(selectedFile));
                out.write(json);
                out.close();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static void loadDatabaseFromJSON() {
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        jfc.setDialogTitle("Choose a file to load from: ");
        jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        jfc.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JSON File", "JSON");
        jfc.addChoosableFileFilter(filter);
        int retVal = jfc.showOpenDialog(null);
        if (retVal == JFileChooser.APPROVE_OPTION) {
            File selectedFile = jfc.getSelectedFile();
            Gson gson = new Gson();
            String json = "";
            try {
                Scanner scan = new Scanner(selectedFile);
                while (scan.hasNextLine())
                    json += scan.nextLine();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            db = gson.fromJson(json, Database.class);
        }
    }
    
    public static void addRecordToDatabase(String[] temp) {
        
        /*
        Adds data in the order of first name, last name, age,
        ID number, middle initial, height ft, height in, weight,
        living status, marital status.
        */
        
        db.addRecord(temp[0], temp[1], (short) Integer.parseInt(temp[2]), 100 + db.getCounter(),
                temp[3].charAt(0), (short) Integer.parseInt(temp[4]), (short) Integer.parseInt(temp[5]),
                Integer.parseInt(temp[6]), temp[7].equals("DECEASED"), temp[8].equals("MARRIED"));
        
    }
    
    public static void editRecordInDatabase(Record r, int i) {
        db.editRecord(r, i);
    }
    
    public static Record searchByID(int ID) {
        for (int i = 0; i < db.getCounter(); i++) {
            Record r = db.getRecord(i);
            if (ID == r.getID())
                return r;
        }
        Record notFound = new Record("NOT", "FOUND", (short) 0, 0);
        notFound.setDeleted(true);
        return notFound;
    }
    
    public static Database createTemplateDatabase() {
        // Fills the database with some records for debugging purposes.
        // Note: Method returns a brand new database and will overwrite
        // existing one. It will not simply add these records to an existing
        // database.
        Database database = new Database();
        
        database.addRecord(new Record("KYLE",       "STEVENSON",    (short) 23,     100 + database.getCounter(),    'W',    (short) 5,  (short) 9,  172, false, false));
        database.addRecord(new Record("ANDREW",     "MERVYN",       (short) 23,     100 + database.getCounter(),    'D',    (short) 5,  (short) 3,  143, false, false));
        database.addRecord(new Record("NICOLAS",    "MYNARCIK",     (short) 23,     100 + database.getCounter(),    'A',    (short) 5,  (short) 8,  191, false, false));
        database.addRecord(new Record("ADRIAN",     "WATT",         (short) 29,     100 + database.getCounter(),    'A',    (short) 6,  (short) 3,  183, false, false));
        database.addRecord(new Record("AMY",        "METZGAR",      (short) 27,     100 + database.getCounter(),    'P',    (short) 5,  (short) 4,  146, false, false));
        database.addRecord(new Record("SON",        "GOKU",         (short) 47,     100 + database.getCounter(),    'R',    (short) 6,  (short) 1,  213, false, true));
        database.addRecord(new Record("STAN",       "LEE",          (short) 95,     100 + database.getCounter(),    'M',    (short) 5,  (short) 6,  128, true, false));
        
        return database;
    }
    
    public static String databaseToString() { return db.toString(); }
    
}