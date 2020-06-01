
public abstract class Reservation {
	private String name;
	
	public Reservation(String n) {
		this.name = n;
	}
	
	public final String reservationName() {
		return this.name;
	}
	
	public abstract int getCost();
	
	public abstract boolean equals(Object o);
}
