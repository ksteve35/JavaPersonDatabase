/*

This class just holds the methods for creating a
database for the database records.

*/

import java.util.ArrayList;

public class Database {
    
    private ArrayList<Record> records;
    private final String categories = String.format("%-7s", "ID") + String.format("%-16s", "FIRST NAME")
            + String.format("%-16s", "MIDDLE INITIAL") + String.format("%-16s", "LAST NAME")
            + String.format("%-5s", "AGE") + String.format("%-10s", "HEIGHT") + String.format("%-10s", "WEIGHT")
            + String.format("%-10s", "STATUS") + String.format("%-10s", "MARITAL") + "\n"
            + "---------------------------------------------------------------------------------------------------\n";
    private int counter = 0;
    
    public Database() {
        records = new ArrayList<Record>();
    }
    
    public Record getRecord(int i) { return records.get(i); }
    public int getCounter() { return counter; }
    public String getCategories() { return categories; }
    
    private String recordPrettyPrint(Record r, boolean b) {
        // boolean b says whether or not to print the categories header
        String retVal = (b ? categories : "");
        retVal += String.format("%-7s", r.getID())
                + String.format("%-16s", r.getFirstName())
                + String.format("%-16s", r.getMiddleInitial())
                + String.format("%-16s", r.getLastName())
                + String.format("%-5s", r.getAge())
                + String.format("%-10s", (r.getHeightFeet() == 0 && r.getHeightInches() == 0 ? "N/A" : r.getHeightFeet() + "\'" + r.getHeightInches() + "\""))
                + String.format("%-10s", (r.getWeight() == 0 ? "N/A" : r.getWeight() + " lbs"))
                + String.format("%-10s", (r.getDeceased() ? "DECEASED" : "ALIVE"))
                + String.format("%-10s", (r.getMarried() && !r.getDeceased() ? "MARRIED" : "SINGLE"));
        return retVal;
    }
    
    public void printDatabase() {
        // If Database isn't empty, print out the records
        if (counter > 0) {
            String retVal = "";
            retVal += recordPrettyPrint(records.get(0), true) + "\n";
            for (int i = 1; i < records.size(); i++) {
                if (i < counter)
                    retVal += recordPrettyPrint(records.get(i), false) + "\n";
                else
                    break;
            }
            System.out.println(retVal);
        } else {
            System.out.println("Error: Database is empty! Cannot print null records.");
        }
    }
    
    @Override
    public String toString() {        
        // If Database isn't empty, print out the records
        String retVal = "";
        if (counter > 0) {
            retVal += recordPrettyPrint(records.get(0), true) + "\n";
            for (int i = 1; i < records.size(); i++) {
                if (i < counter)
                    retVal += recordPrettyPrint(records.get(i), false) + "\n";
                else
                    break;
            }
        } else {
            retVal = "Error: Database is empty! Cannot print null records.";
        }
        
        return retVal;
    }
    
    public void addRecord(String fn, String ln, short a, int i) {
        records.add(new Record(fn, ln, a, i));
        counter++;
    }
    
    public void addRecord(String fn, String ln, short a, int i, char m, short hF, short hI, int w, boolean d, boolean ma) {
        records.add(new Record(fn, ln, a, i, m, hF, hI, w, d, ma));
        counter++;
    }
    
    public void addRecordForTemplate(Record r) {
        records.add(new Record(new String(r.getFirstName()), new String(r.getLastName()),
            r.getAge(), r.getID(), r.getMiddleInitial(), r.getHeightFeet(), r.getHeightInches(),
            r.getWeight(), r.getDeceased(), r.getMarried()));
        counter++;
    }
    
    public void editRecord(Record r, int i) {
        records.set(i, r);
    }
    
}