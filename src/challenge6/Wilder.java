package challenge6;

public class Wilder {
	
	private String firstName;
	private boolean aware;
	
	public Wilder(String firstName, boolean aware) {
		this.firstName = firstName;
		this.aware = aware;	
	}
	
	public String getFirstName() {
		String firstName = this.firstName;
		return firstName;
	}
	public boolean getAware() {
		boolean aware = this.aware;
		return aware;	
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
	public void setAware(boolean aware) {
		this.aware = aware;
	}
	
	public void whoAmI() {
		if (getAware()) {
			System.out.println("je m'appelle " + getFirstName() + " et je suis aware");
		}else {
			System.out.println("je m'appelle " + getFirstName() + " et je ne suis pas aware");
		}
	}

}
