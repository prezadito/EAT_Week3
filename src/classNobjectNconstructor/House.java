package classNobjectNconstructor;

// outer class
public class House {
    // global variables belong to class

    // keywords - static & final
    // variables with the 'final' prefix keyword cannot be changed once assigned
    // static methods can only access static variables
    // to access static properties, use class name; to access non-static properties, use class object
    // static variables don't belong to object instances, it belongs to the class itself

    int houseNumber;
    String street;
    String city;
    String state;
    int zipCode;
    int tenants;
    int rent;
    int sqft;
    boolean garage;
    static int numberOfDogs;
    int offer;

    // access modifier: public, private, protected, default (unwritten)
    // public - accessible to all classes, in all packages
    // private - accessible only within the same class, not instances of it
    // protected - accessible only within the same package

    // constructor - must contain class name, because they are constructors of classes
    // constructors condition how the objects are created
    // constructor 1
    public House(int myHouseNumber, String myStreet, String myCity, String myState, int myZipCode, int myTenants, int myRent) {

        // "this." is used to assign global variables
        // without it, priority is given to the local variable provided by parameter (if they share the same name)
        this.houseNumber = myHouseNumber;
        this.street = myStreet;
        this.city = myCity;
        this.state = myState;
        this.zipCode = myZipCode;
        this.tenants = myTenants;
        this.rent = myRent;
    }

    // a class can contain multiple constructors, but they can't have the same parameter
    // constructor 2
    public House(int mySqFt, boolean myGarage) {
        this.sqft = mySqFt;
        this.garage = myGarage;
    }

    // default constructor - will have access to all global variables and methods
    // constructor 3
    public House() {

    }

    // create subclass instance *why not do it in the main class?*
    Backyard by = new Backyard();

    // subclass (inner class)
    public class Backyard { // why did I HAVE to make it static?
        public void backyardSize() {
            System.out.println("The backyard has a basketball hoop");
        }
        public int numberOfPlants() {
            return 7;
        }
    }

    String[] rooms = {"Bedroom", "Bathroom", "Living Room", "Kitchen", "Master Bedroom"};

    public void bedroom() {
        System.out.println("Here's the " + rooms[0]);
    }

    public void bathroom() {
        System.out.println("This is the " + rooms[1]);
    }

    public void livingRoom() {
        System.out.println("The " + rooms[2] + " is where everybody hangs out");
    }

    public void kitchen() {
        System.out.println("We just remodeled the " + rooms[3]);
    }

    public void masterBedroom() {
        System.out.println("The biggest room in the house is the " + rooms[4]);
    }

    public int getRent() {
        return rent;
    }

    public int getTenants() {
        return tenants;
    }

    public void summary() {
        System.out.println("The house is located at " + houseNumber + " " + street + " " + city + ", " + state + " " + zipCode);
    }

    public String garage() {
        if (garage) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public static void numDogs(int numberOfDogs) {
        // must access static properties by using 'class_name.' and not 'this.'
        House.numberOfDogs = numberOfDogs;
        System.out.println("This family has " + numberOfDogs + " dogs");
    }

    public void setOffer(int myOffer) {
        this.offer = myOffer;
    }

    public int getOffer() {
        return this.offer;
    }
}
