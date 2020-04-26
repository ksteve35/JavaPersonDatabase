/*

This program is just me having fun trying to program
a database from scratch without the use of SQL. In short,
this is a COSC 311 revisit for me as I reteach myself
the sorting algorithms we went over in that class.

*/

import java.util.Scanner;

public class Main {
    
    public static Scanner scan = new Scanner(System.in);
    public static Database db;
    public static final String MESSAGE = "\nPlease press one of the following to"
            + "issue out a command:\n\n[0] Print out the database\n[1] Add a record\n"
            + "[2] Edit a record\n[3] Delete a record\n";
    
    public static void main(String[] args) {
        
        db = createTemplateDatabase();
        db.printDatabase();
        
        System.out.println(MESSAGE);
        while (true) {
            try {
                int command = Integer.parseInt(scan.nextLine().trim());
                System.out.println("");
                switch (command) {
                    case 0: // Print out the database
                        db.printDatabase();
                        break;
                    case 1: // Add a record
                        addRecord();
                        System.out.println("New record added!");
                        break;
                    case 2: // Edit a record
                        
                        break;
                    case 3: // Delete a record
                        
                        break;
                }
                System.out.println(MESSAGE);
            } catch (Exception e) {
                System.out.println("\nInvalid selection. Please try again and type only the number for the wanted command.\n");
            }
        }
    }
    
    public static void addRecord() {
        String[] temp = new String[9];
        
        System.out.println("\nYou have chosen to add a new record.\nPlease type in the person's first name:");
        temp[0] = scan.nextLine().trim().toUpperCase();
        System.out.println("Next, please type in the person's last name:");
        temp[1] = scan.nextLine().trim().toUpperCase();
        System.out.println("Next, please type in the person's current age:");
        temp[2] = scan.nextLine().trim();
        temp[3] = "A";
        temp[4] = temp[5] = temp[6] = "0";
        temp[7] = "ALIVE";
        temp[8] = "SINGLE";
        
        System.out.println("Next, please decide if you wish to add any further details.\nType [Y] for yes or [N] for no without the brackets:");
        
        if (scan.nextLine().trim().toUpperCase().equals("Y")) {
            System.out.println("You have selected to add more details about this person.");
            addRecordWithExtraDetails(temp);
        } else {
            System.out.println("You have opted out of adding more details about this person.\nAttempting to add new record to database...");
            db.addRecord(temp[0], temp[1], (short) Integer.parseInt(temp[2]), 100 + db.getCounter());
        }
    }
    
    public static void addRecordWithExtraDetails(String[] temp) {
        
        boolean breakOut = true;
        while (breakOut) {
            
            System.out.println("Please type in which attribute you'd like to change:\n"
                    + "[1] First Name\n[2] Last Name\n[3] Age\n[4] Middle Initial\n"
                    + "[5] Height\n[6] Weight\n[7] Life Status\n[8] Marital Status\n"
                    + "[9] Finish and Add Record");
            
            try {
                int choice = Integer.parseInt(scan.nextLine().trim());
                int x, y;
                String s, t;
                
                switch (choice) {
                    case 1: // Change first name
                        System.out.println("Current first name: " + temp[0] + "\nPlease type [1] to keep this name or [2] to change it:");
                        x = Integer.parseInt(scan.nextLine().trim());
                        switch (x) {
                            case 1:
                                System.out.println("First name will remain unchanged.");
                                break;
                            case 2:
                                System.out.println("Please type what you'd like to change the first name to:");
                                temp[0] = scan.nextLine().trim().toUpperCase();
                                System.out.println("First name has been changed to " + temp[0] + ".");
                                break;
                            default:
                                System.out.println("Unknown command. First name will remain unchanged.");
                                break;
                        }
                        break;
                    case 2: // Change last name
                        System.out.println("Current last name: " + temp[1] + "\nPlease type [1] to keep this name or [2] to change it:");
                        x = Integer.parseInt(scan.nextLine().trim());
                        switch (x) {
                            case 1:
                                System.out.println("Last name will remain unchanged.");
                                break;
                            case 2:
                                System.out.println("Please type what you'd like to change the last name to:");
                                temp[1] = scan.nextLine().trim().toUpperCase();
                                System.out.println("Last name has been changed to " + temp[1] + ".");
                                break;
                            default:
                                System.out.println("Unknown command. Last name will remain unchanged.");
                                break;
                        }
                        break;
                    case 3: // Change age
                        System.out.println("Current age: " + temp[2] + "\nPlease type [1] to keep this age or [2] to change it:");
                        x = Integer.parseInt(scan.nextLine().trim());
                        switch (x) {
                            case 1:
                                System.out.println("Age will remain unchanged.");
                                break;
                            case 2:
                                System.out.println("Please type what you'd like to change the age to:");
                                s = scan.nextLine().trim();
                                try {
                                    // x's new value is never used, but if the line
                                    // doesn't throw an exception, then we know s
                                    // was successfully parsed as an integer
                                    x = Integer.parseInt(s);
                                    temp[2] = s;
                                    System.out.println("Age has been changed to " + temp[2] + ".");
                                } catch (Exception e) {
                                    System.out.println("Invalid age input. Age will remain unchanged.");
                                }
                                break;
                            default:
                                System.out.println("Unknown command. Age will remain unchanged.");
                                break;
                        }
                        break;
                    case 4: // Change middle initial
                        System.out.println("Current middle initial: " + temp[3] + "\nPlease type [1] to keep this initial or [2] to change it:");
                        x = Integer.parseInt(scan.nextLine().trim());
                        switch (x) {
                            case 1:
                                System.out.println("Middle initial will remain unchanged.");
                                break;
                            case 2:
                                System.out.println("Please type what you'd like to change the middle initial to:");
                                temp[3] = scan.nextLine().trim().toUpperCase();
                                System.out.println("Middle initial has been changed to " + temp[3] + ".");
                                break;
                            default:
                                System.out.println("Unknown command. Middle initial will remain unchanged.");
                                break;
                        }
                        break;
                    case 5: // Change height
                        System.out.println("Current height: " + temp[4] + "\'" + temp[5] + "\"\nPlease type [1] to keep this height or [2] to change it:");
                        x = Integer.parseInt(scan.nextLine().trim());
                        switch (x) {
                            case 1:
                                System.out.println("Height will remain unchanged.");
                                break;
                            case 2:
                                System.out.println("Please type what you'd like to change the height's feet to:");
                                try {
                                    s = scan.nextLine().trim();
                                    // x and y's new values are never used, but if the
                                    // lines don't throw exceptions, then we know s and
                                    // t were successfully parsed as integers
                                    x = Integer.parseInt(s);
                                    System.out.println("Please type what you'd like to change the height's inches to:");
                                    t = scan.nextLine().trim();
                                    y = Integer.parseInt(s);
                                    temp[4] = s;
                                    temp[5] = t;
                                    System.out.println("Height has been changed to " + temp[4] + "\'" + temp[5] + "\"." );
                                } catch (Exception e) {
                                    System.out.println("Invalid height input. Height will remain unchanged.");
                                }
                                break;
                            default:
                                System.out.println("Unknown command. Height will remain unchanged.");
                                break;
                        }
                        break;
                    case 6: // Change weight
                        System.out.println("Current weight: " + temp[6] + "\nPlease type [1] to keep this weight or [2] to change it:");
                        x = Integer.parseInt(scan.nextLine().trim());
                        switch (x) {
                            case 1:
                                System.out.println("Weight will remain unchanged.");
                                break;
                            case 2:
                                System.out.println("Please type what you'd like to change the weight to:");
                                s = scan.nextLine().trim();
                                try {
                                    // x's new value is never used, but if the line
                                    // doesn't throw an exception, then we know s
                                    // was successfully parsed as an integer
                                    x = Integer.parseInt(s);
                                    temp[6] = s;
                                    System.out.println("Weight has been changed to " + temp[6] + ".");
                                } catch (Exception e) {
                                    System.out.println("Invalid weight input. Weight will remain unchanged.");
                                }
                                break;
                            default:
                                System.out.println("Unknown command. Weight will remain unchanged.");
                                break;
                        }
                        break;
                    case 7: // Change life status
                        System.out.println("Current life status: " + temp[7] + "\nPlease type [1] to keep this status or [2] to change it:");
                        x = Integer.parseInt(scan.nextLine().trim());
                        switch (x) {
                            case 1:
                                System.out.println("Life status will remain unchanged.");
                                break;
                            case 2:
                                temp[7] = changeStatus(temp[7], false);
                                break;
                            default:
                                System.out.println("Unknown command. Life status will remain unchanged.");
                                break;
                        }
                        break;
                    case 8: // Change marital status
                        System.out.println("Current marital status: " + temp[8] + "\nPlease type [1] to keep this status or [2] to change it:");
                        x = Integer.parseInt(scan.nextLine().trim());
                        switch (x) {
                            case 1:
                                System.out.println("Marital status will remain unchanged.");
                                break;
                            case 2:
                                temp[8] = changeStatus(temp[8], true);
                                break;
                            default:
                                System.out.println("Unknown command. Marital status will remain unchanged.");
                                break;
                        }
                        break;
                    case 9: // Finish and add the new record
                        Record r = new Record(temp[0], temp[1], (short) Integer.parseInt(temp[2]), 100 + db.getCounter(),
                                temp[3].charAt(0), (short) Integer.parseInt(temp[4]), (short) Integer.parseInt(temp[5]),
                                Integer.parseInt(temp[6]), temp[7].equals("DECEASED"), temp[8].equals("MARRIED"));
                        System.out.println("Record will be added with the following attributes:\n" + db.getCategories()
                                + String.format("%-7s", r.getID()) + String.format("%-16s", r.getFirstName())
                                + String.format("%-16s", r.getMiddleInitial()) + String.format("%-16s", r.getLastName())
                                + String.format("%-5s", r.getAge()) + String.format("%-10s", r.getHeightFeet() + "\'" + r.getHeightInches() + "\"")
                                + String.format("%-10s", r.getWeight() + " lbs") + String.format("%-10s", (r.getDeceased() ? "DECEASED" : "ALIVE"))
                                + String.format("%-10s", (r.getMarried() && !r.getDeceased() ? "MARRIED" : "SINGLE")));
                        db.addRecord(r);
                        breakOut = false;
                        break;
                }
                
            } catch (Exception e) {
                System.out.println("\nInvalid selection. Please try again and type only the number for the wanted attribute.\n");
            }
        }
    }
    
    public static String changeStatus(String s, boolean b) {
        // This method is used to change either the life or marital status of a record.
        String[] words;
        
        // If b is true, this is changing marital status, else changing life status
        if (b)
            words = new String[] {"Marital", "marital", "SINGLE", "MARRIED"};
        else
            words = new String[] {"Life", "life", "ALIVE", "DECEASED"};
        
        System.out.println("Please type [Y] to change the " + words[1] + " status to " + (s.equals(words[2]) ? words[3] : words[2]) + ":");
        if (scan.nextLine().trim().toUpperCase().equals("Y")) {
            s = (s.equals(words[2]) ? words[3] : words[2]);
            System.out.println(words[0] + " status has been changed to " + s + ".");
        } else {
            System.out.println(words[0] + " status will remain unchanged.");
        }
        
        return s;
    }
    
    public static Database createTemplateDatabase() {
        // Fills the database with some records for debugging purposes.
        // Note: Method returns a brand new database and will overwrite
        // existing one. It will not simply add these records to an existing
        // database.
        Database database = new Database();
        
        database.addRecord(new Record("KYLE", "STEVENSON", (short) 23, 100 + database.getCounter(), 'W', (short) 5, (short) 9, 172, false, false));
        database.addRecord(new Record("ANDREW", "MERVYN", (short) 23, 100 + database.getCounter(), 'D', (short) 5, (short) 3, 143, false, false));
        database.addRecord(new Record("NICOLAS", "MYNARCIK", (short) 23, 100 + database.getCounter(), 'A', (short) 5, (short) 8, 191, false, false));
        database.addRecord(new Record("ADRIAN", "WATT", (short) 29, 100 + database.getCounter(), 'A', (short) 6, (short) 3, 183, false, false));
        database.addRecord(new Record("AMY", "METZGAR", (short) 27, 100 + database.getCounter(), 'P', (short) 5, (short) 4, 146, false, false));
        database.addRecord(new Record("SON", "GOKU", (short) 47, 100 + database.getCounter(), 'R', (short) 6, (short) 1, 213, false, true));
        database.addRecord(new Record("STAN", "LEE", (short) 95, 100 + database.getCounter(), 'M', (short) 5, (short) 6, 128, true, false));
        
        return database;
    }
    
}