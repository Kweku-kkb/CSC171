package mypackage; // help eclipse compile the code due to system error

import java.time.LocalDate;

public class TruckDriversLicense extends DriversLicense {
	protected long maxWeight;
	public TruckDriversLicense(Person holder, long number, LocalDate expiration, String state) {
		super(holder, number, expiration, state);
		this.maxWeight = 26000;
	}
	
	public TruckDriversLicense(Person holder, long number, LocalDate expr, String state, long maxWeight) {
		super(holder, number,expr, state);
	}
	public long getMaximumWeight() {
		return maxWeight;	
	}
	public void setMaximumWeight(long maxWeight) {
		this.maxWeight = maxWeight;
	}
	@Override
	public String toString() {
		return "<TruckDriversLicense: name " + holder + " number " + number + " expiration " + expiration + " state " + " maxWeight " + maxWeight + " (lbs)";
	}
	

}
