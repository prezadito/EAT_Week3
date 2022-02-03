package classNobjectNconstructor;

public class UseHouse {

    public static void main(String[] args) {

        // object = new class instance
        House crib = new House(1400, "Hudson Ave.", "Albany", "NY", 14222, 6, 2800); // C1
        House crib2 = new House(10000, true); // C2
        House crib3 = new House(); // C3

        crib.summary();

        crib2.bathroom();
        crib2.bedroom();

        crib3.livingRoom();
        crib3.kitchen();
        crib3.masterBedroom();

        System.out.println("Rent is $" + crib.getRent());
        System.out.println("The house can fit " + crib.getTenants());
        System.out.println("That comes out to $" + (crib.rent / crib.tenants) + " per person");

        System.out.println("House Size: " + crib2.sqft + " Sq Feet\n" +
                           "Garage: " + crib2.garage());

        // use subclass methods by calling class_instance.subclass_instance
        crib.by.backyardSize();
        System.out.println("The backyard has " + crib.by.numberOfPlants() + " plants");

        // use class name to access static properties like methods and variables
        House.numDogs(2);

        crib.setOffer(2500);
        System.out.println("Tenant is offering $" + crib.getOffer());

    }
}
