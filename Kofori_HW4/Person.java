package mypackage;

import java.time.LocalDate;
public class Person {
    protected final String name;
    protected final long governmentID;

    public Person(String name, long governmentID) {
	System.out.println("Hello from Person constructor!");
	this.name = name;
	this.governmentID = governmentID;
    }

    public String getName() {
	return name;
    }

    public long getGovernmentID() {
	return governmentID;
    }

    @Override
    public String toString() {
	return "<Person: " + name + "; "  + governmentID + ">";
    }
}
