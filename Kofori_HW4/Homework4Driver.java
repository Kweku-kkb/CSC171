package mypackage;
import java.time.LocalDate;
public class Homework4Driver{

    public static void main(String[] args) {


	// These are our "people" for testing.
	Person buster = new Person("Buster Tester", 12345);
	Person someoneElse = new Person("Someone Else", 54321);

	// These are our dates for testing license expiration.
	LocalDate inThePast = LocalDate.parse("2000-01-01");
	LocalDate inTheFuture = LocalDate.parse("2199-01-01");

	// License
	System.out.println("Testing base class License ...");

	License base1 = new License(buster, 345, inThePast);
	License base2 = new License(buster, 456, inTheFuture);
	License base3 = new License(someoneElse, 789, inTheFuture);		
	
	System.out.println("    base1 = " + base1);
	System.out.println("    base2 = " + base2);

	if (!base1.expired() || base2.expired())
	    System.out.println("    Expiration calculation BROKEN for base class License.");
	else
	    System.out.println("    Expiration calculation OK for base class License.");


	if (!base1.equals(base1) || base1.equals(base2))
	    System.out.println("    Equality checking BROKEN for base class License.");
	else
	    System.out.println("    Equality checking OK for base class License.");


	System.out.println("");
	
	// DriversLicense
	System.out.println("Testing subclass DriversLicense ...");
	DriversLicense dl1 = new DriversLicense(buster, 345, inThePast, "NY");
	DriversLicense dl2 = new DriversLicense(buster, 456, inTheFuture, "NY");	
	DriversLicense dl3 = new DriversLicense(someoneElse, 345, inThePast, "CA");

	System.out.println("    dl1 = " + dl1);
	System.out.println("    dl2 = " + dl2);
	System.out.println("    dl3 = " + dl3);


	if (!dl1.expired() || dl2.expired())
	    System.out.println("    Expiration calculation BROKEN for subclass DriversLicense.");
	else
	    System.out.println("    Expiration calculation BROKEN for subclass DriversLicense.");

	if (!dl1.equals(dl1) || dl1.equals(dl3))
	    System.out.println("    Equality checking BROKEN for subclass DriversLicense.");
	else
	    System.out.println("    Equality checking OK for subclass DriversLicense.");	

	System.out.println("");	
	
	// TruckDriversLicense
	System.out.println("Testing subclass TruckDriversLicense ...");
	TruckDriversLicense tdl1 = new TruckDriversLicense(buster, 345, inThePast, "NY");
	TruckDriversLicense tdl2 = new TruckDriversLicense(buster, 456, inTheFuture, "NY");	
	TruckDriversLicense tdl3 = new TruckDriversLicense(someoneElse, 345, inThePast, "CA", 32000);

	System.out.println("    tdl1 = " + tdl1);
	System.out.println("    tdl2 = " + tdl2);
	System.out.println("    tdl3 = " + tdl3);


	if (!tdl1.expired() || tdl2.expired())
	    System.out.println("    Expiration calculation BROKEN for subclass TruckDriversLicense.");
	else
	    System.out.println("    Expiration calculation BROKEN for subclass TruckDriversLicense.");

	if (!tdl1.equals(tdl1) || tdl1.equals(tdl3))
	    System.out.println("    Equality checking BROKEN for subclass TruckDriversLicense.");
	else
	    System.out.println("    Equality checking OK for subclass TruckDriversLicense.");

	if (tdl1.getMaximumWeight() != 26000 || tdl3.getMaximumWeight() != 32000)
	    System.out.println("    Maximum weight BROKEN for TruckDriversDriversLicense.");
	else
	    System.out.println("    Maximum weight OK for TruckDriversDriversLicense.");



	System.out.println("");
	
	// Fishing
	FishingLicense fl1 = new FishingLicense(buster, 345, inTheFuture, "Salmon");
	System.out.println("Testing subclass FishingLicense...");
	System.out.println("    fl1 = " + fl1);

	System.out.println("");

	// Inheritance and Polymorphism

	System.out.println("Testing polymorphism...");

	License dl = dl1;
	License tdl = tdl1;
	License fl = fl1;

	System.out.println("    DriversLicense: " + dl);
	System.out.println("    TruckDriversLicense: " + tdl);
	System.out.println("    FishingLicense: " + fl);

	


    }
}
