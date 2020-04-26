/*

This class is for the objects that act
as the database records for each person.

 */

class Record {
    
    // Height is in feet and inches, weight is in pounds
    private String firstName, lastName;
    private char middleInitial;
    private short age, heightFeet, heightInches;
    private int weight, ID;
    private boolean deceased, married;
    
    public Record(String fn, String ln, short a, int i) {
        firstName = new String(fn).toUpperCase();
        lastName = new String(ln).toUpperCase();
        age = a;
        ID = i;
        middleInitial = 'A';
    }
    
    public Record(String fn, String ln, short a, int i, char m, short hF, short hI, int w, boolean d, boolean ma) {
        firstName = new String(fn).toUpperCase();
        lastName = new String(ln).toUpperCase();
        age = a;
        ID = i;
        middleInitial = m;
        heightFeet = hF;
        heightInches = hI;
        weight = w;
        deceased = d;
        married = ma;
    }
    
    public Record(Record r) {
         firstName = new String(r.getFirstName()).toUpperCase();
         lastName = new String(r.getLastName()).toUpperCase();
         age = r.getAge();
         ID = r.getID();
         middleInitial = r.getMiddleInitial();
         heightFeet = r.getHeightFeet();
         heightInches = r.getHeightInches();
         weight = r.getWeight();
         deceased = r.getDeceased();
         married = r.getMarried();
    }
    
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public char getMiddleInitial() { return middleInitial; }
    public short getAge() { return age; }
    public short getHeightFeet() { return heightFeet; }
    public short getHeightInches() { return heightInches; }
    public int getWeight() { return weight; }
    public int getID() { return ID; }
    public boolean getDeceased() { return deceased; }
    public boolean getMarried() { return married; }
    
    public void setFirstName(String s) { firstName = new String(s); }
    public void setLastName(String s) { lastName = new String(s); }
    public void setMiddleInitial(char c) { middleInitial = c; }
    public void setAge(short s) { age = s; }
    public void setHeightFeet(short s) { heightFeet = s; }
    public void setHeightInches(short s) { heightInches = s; }
    public void setWeight(int i) { weight = i; }
    public void setID(int i) { ID = i; }
    public void setDeceased(boolean b) { deceased = b; }
    public void setMarried(boolean b) { married = b; }
    
}