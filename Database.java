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
    private int numberOfNotDeletedRecords = 0;
    
    public Database() {
        records = new ArrayList<Record>();
    }
    
    public Record getRecord(int i) { return records.get(i); }
    public int getCounter() { return counter; }
    public int getNumberOfNotDeletedRecords() { return numberOfNotDeletedRecords; }
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
    
    @Override
    public String toString() {        
        // If Database isn't empty, print out the records
        String retVal = "";
        if (numberOfNotDeletedRecords > 0) {
            int firstExistingRecordIndex = -1;
            
            // Gets first index of a record where record's deleted variable is false
            for (int i = 0; i < records.size(); i++) {
                if (!records.get(i).getDeleted()) {
                    firstExistingRecordIndex = i;
                    break;
                }
            }
            
            retVal += recordPrettyPrint(records.get(firstExistingRecordIndex), true) + "\n";
            for (int i = firstExistingRecordIndex + 1; i <= records.size(); i++) {
                if (i < counter) {
                    if (!records.get(i).getDeleted()) {
                        retVal += recordPrettyPrint(records.get(i), false) + "\n";
                    }
                } else {
                    retVal += "\nPrinted " + numberOfNotDeletedRecords + " records!\n";
                    break;
                }
            }
        } else {
            retVal = "Error: Database is empty! Cannot print null records.";
        }
        
        return retVal;
    }
    
    public void addRecord(String fn, String ln, short a, int i) {
        records.add(new Record(fn, ln, a, i));
        counter++;
        numberOfNotDeletedRecords++;
    }
    
    public void addRecord(String fn, String ln, short a, int i, char m, short hF, short hI, int w, boolean d, boolean ma) {
        records.add(new Record(fn, ln, a, i, m, hF, hI, w, d, ma));
        counter++;
        numberOfNotDeletedRecords++;
    }
    
    public void addRecordForTemplate(Record r) {
        records.add(new Record(new String(r.getFirstName()), new String(r.getLastName()),
            r.getAge(), r.getID(), r.getMiddleInitial(), r.getHeightFeet(), r.getHeightInches(),
            r.getWeight(), r.getDeceased(), r.getMarried()));
        counter++;
        numberOfNotDeletedRecords++;
    }
    
    public void editRecord(Record r, int i) {
        records.set(i, r);
    }
    
    public void deleteRecord(int i) {
        Record r = records.get(i);
        r.setFirstName("");
        r.setMiddleInitial('-');
        r.setLastName("");
        r.setAge((short) 0);
        r.setHeightFeet((short) 0);
        r.setHeightInches((short) 0);
        r.setWeight(0);
        r.setDeceased(false);
        r.setMarried(false);
        r.setDeleted(true);
        numberOfNotDeletedRecords--;
    }
    
}