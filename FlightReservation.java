
public class FlightReservation extends Reservation {
	
	private Airport pod;
	
	private Airport poa;
	
	public FlightReservation(String name, Airport pod, Airport poa) {
		super(name);
		
		this.pod=pod;
		
		this.poa=poa;
		
		if (this.pod.equals(this.poa)) {
			throw new IllegalArgumentException("the input airports are the same");
		}
	}
	
	public int getCost() {
		int total = (int)Math.ceil(Airport.getDistance(this.pod, this.poa)/167.52*124)+this.poa.getFees()+this.pod.getFees()+5375;
		return total;
	}

	public boolean equals(Object o) {
		if ( this.getClass() == o.getClass() ) {
			FlightReservation f = (FlightReservation)o;
			if ( this.reservationName() == f.reservationName() && this.poa.equals(f.poa) && this.pod.equals(f.pod) ) {
			return true;
		}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Airport a1 = new Airport(1, 2, 3);
		Airport a2 = new Airport(1, 2, 3);
		FlightReservation r = new FlightReservation("TBT", a1, a2);
		Airport b1 = new Airport(1, 2, 3);
		Airport b2 = new Airport(1, 2, 3);
		FlightReservation q = new FlightReservation("TBT", b1, b2);
		System.out.println(r.equals(q));
	}

}
