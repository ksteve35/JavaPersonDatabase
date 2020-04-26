/*

This class just holds the methods for creating a
database for the database records.

*/

public class Database {
    
    private Record[] records;
    private final String categories = String.format("%-7s", "ID") + String.format("%-16s", "FIRST NAME")
            + String.format("%-16s", "MIDDLE INITIAL") + String.format("%-16s", "LAST NAME")
            + String.format("%-5s", "AGE") + String.format("%-10s", "HEIGHT") + String.format("%-10s", "WEIGHT")
            + String.format("%-10s", "STATUS") + String.format("%-10s", "MARITAL") + "\n"
            + "---------------------------------------------------------------------------------------------------\n";
    private int counter = 0;
    
    public Database() {
        records = new Record[20];
    }
    
    public Database(int size) {
        records = new Record[size];
    }
    
    public int getCounter() { return counter; }
    public String getCategories() { return categories; }
    
    private String recordPrettyPrint(Record r, boolean b) {
        // boolean b says whether or not to print the categories header
        String retVal = (b ? categories : "");
        retVal += String.format("%-7s", r.getID()) + String.format("%-16s", r.getFirstName())
                + String.format("%-16s", r.getMiddleInitial()) + String.format("%-16s", r.getLastName())
                + String.format("%-5s", r.getAge()) + String.format("%-10s", r.getHeightFeet() + "\'" + r.getHeightInches() + "\"")
                + String.format("%-10s", r.getWeight() + " lbs") + String.format("%-10s", (r.getDeceased() ? "DECEASED" : "ALIVE"))
                + String.format("%-10s", (r.getMarried() && !r.getDeceased() ? "MARRIED" : "SINGLE"));
        return retVal;
    }
    
    public void printDatabase() {
        // If Database isn't empty, print out the records
        if (counter > 0) {
            String retVal = "";
            retVal += recordPrettyPrint(records[0], true) + "\n";
            for (int i = 1; i < records.length; i++) {
                if (i < counter)
                    retVal += recordPrettyPrint(records[i], false) + "\n";
                else
                    break;
            }
            System.out.println(retVal);
        } else {
            System.out.println("Error: Database is empty! Cannot print null records.");
        }
    }
    
    public void addRecord(String fn, String ln, short a, int i) {
        if (counter < records.length)
            records[counter++] = new Record(fn, ln, a, i);
        else
            System.out.println("Error: Database is full! Cannot create new records.");
    }
    
    public void addRecord(String fn, String ln, short a, int i, char m, short hF, short hI, int w, boolean d, boolean ma) {
        if (counter < records.length)
            records[counter++] = new Record(fn, ln, a, i, m, hF, hI, w, d, ma);
        else
            System.out.println("Error: Database is full! Cannot create new records.");
    }
    
    public void addRecord(Record r) {
        if (counter < records.length)
            records[counter++] = new Record(new String(r.getFirstName()), new String(r.getLastName()),
                    r.getAge(), r.getID(), r.getMiddleInitial(), r.getHeightFeet(), r.getHeightInches(),
                    r.getWeight(), r.getDeceased(), r.getMarried());
        else
            System.out.println("Error: Database is full! Cannot create new records.");
    }
    
    public void editRecord(int i, int x, String s) {
        // i controls what variable gets changed, x controls which record, s is the data
        switch (i) {
            case 0:
                records[x].setID(Integer.parseInt(s));
                break;
            case 1:
                records[x].setFirstName(s);
                break;
            case 2:
                records[x].setMiddleInitial(s.charAt(0));
                break;
            case 3:
                records[x].setLastName(s);
                break;
            case 4:
                records[x].setAge(Short.valueOf(s));
                break;
            case 5:
                records[x].setHeightFeet(Short.valueOf(s));
                break;
            case 6:
                records[x].setHeightInches(Short.valueOf(s));
                break;
            case 7:
                records[x].setWeight(Integer.parseInt(s));
                break;
            case 8:
                if (s != null && s.trim().toUpperCase().equals("TRUE"))
                    records[x].setDeceased(false);
                else
                    records[x].setDeceased(true);
                break;
            case 9:
                if (s != null && s.trim().toUpperCase().equals("TRUE"))
                    records[x].setMarried(true);
                else
                    records[x].setMarried(false);
                break;
        }
    }
    
}