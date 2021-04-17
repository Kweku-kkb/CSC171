
package mypackage; // help eclipse compile the code due to system error
import java.time.LocalDate;

public class DriversLicense extends License {
	protected String state;
	public DriversLicense(Person holder, long number, LocalDate expiration, String State) {
		super(holder, number, expiration); 
		this.state = state;
		}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "<DriversLicense:name " + holder + " number " + number + " expiration " + " state " + state + " >";
	}
	@Override
	public Boolean equals(License L1, License L2) {
		return super.equals(L1, L2);
	}
	
}
