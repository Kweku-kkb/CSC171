package mypackage; // help eclipse compile the code due to system error
import java.time.LocalDate;

public class FishingLicense extends License{
	protected String permittedFish;
	public FishingLicense(Person holder, long number, LocalDate expiration, String permittedFish) {
		super(holder, number, expiration);
		this.permittedFish = permittedFish;
	}
	public String getPermittedFish() {
		return permittedFish;
	}
	@Override
	public String toString() {
		return "<FishingLicense: name " + holder + " number " + number + " expiration " + "allowedFish " + permittedFish + " >";
	}
	

}
