/* Name: Kweku Ofori
 * NetID: kofori
 * Assignment Number: 3
 * Lab Section: MW 4:50pm
 * I did not collaborate with anyone on this assignment
*/
package mypackage; // help eclipse compile the code due to system error

import java.time.LocalDate;
public class License{
	protected LocalDate expiration;
	protected long number;
	protected Person holder;
	
	public License(Person holder, long number, LocalDate expiration) {
		this.holder = holder;
		this.number = number;
		this.expiration = expiration;
	}
	public Person getHolder() {
		return holder;
	}
	public void setHolder(Person holder) {
		this.holder = holder;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber() {
		this.number = number;
	}
	
	public String toString() {
		return "<License: name " + holder + " number " + number + " expiration " + expiration + " >";
	}
	
	public Boolean isBefore(LocalDate date ) {
		if(date.compareTo(expiration) < 0) {
			return true;
		}
		return false;
	}

	public Boolean expired() {
		LocalDate timeNow = LocalDate.now();
		if(!(isBefore(timeNow))) {
			return true;
		}
		return false;
		
	}
	public Boolean equals(License L1, License L2) {
		if(L1.holder.equals(L2)  && L1.number == L2.number) {
			return true;
		}
		return false;
	}

}
