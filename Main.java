/*

This program is just me having fun trying to program
a database from scratch without the use of SQL. In short,
this is a COSC 311 revisit for me as I reteach myself
the sorting algorithms we went over in that class, as
well as familiarizing myself with Java GUI programming.

*/

public class Main {
    
    public static Database db;
    
    public static void main(String[] args) {
        
        db = createTemplateDatabase();
        System.out.println("Template Database created!");
        
        new GUI();
        
    }
    
    public static void addRecordToDatabaseThroughGUI(String[] temp) {
        
        /*
        Adds data in the order of first name, last name, age,
        ID number, middle initial, height ft, height in, weight,
        living status, marital status.
        */
        
        db.addRecord(temp[0], temp[1], (short) Integer.parseInt(temp[2]), 100 + db.getCounter(),
                temp[3].charAt(0), (short) Integer.parseInt(temp[4]), (short) Integer.parseInt(temp[5]),
                Integer.parseInt(temp[6]), temp[7].equals("DECEASED"), temp[8].equals("MARRIED"));
        
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