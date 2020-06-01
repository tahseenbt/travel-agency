
public class Customer {
	
	private String name;
	
	private int balance;
	
	private Basket rsns;
	
	public Customer(String name, int balance) {
		this.rsns = new Basket();
		
		this.name = name;
		
		this.balance = balance;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getBalance() {
		return this.balance;
	}
	
	public Basket getBasket() {
		return this.rsns;
	}
	
	public int addFunds(int amnt) {
		if ( amnt >0 ) {
			this.balance+=amnt;
			return this.balance;
		}
		else {
			throw new IllegalArgumentException("The amount must be positive");
		}
	}
	
	public int addToBasket(Reservation r) {
		if ( this.name == r.reservationName() ) {
			rsns.add(r);
			return rsns.getNumOfReservations();
		}
		throw new IllegalArgumentException();
	}
	
	public int addToBasket(Hotel h, String type, int nights, boolean breakfast) {
		if (breakfast) {
			BnBReservation r = new BnBReservation(this.name, h,type,nights);
			rsns.add(r);
		}
		else {
			HotelReservation r = new HotelReservation(this.name, h, type, nights);
			rsns.add(r);
		}
		return rsns.getNumOfReservations();
	}
	
	public int addToBasket(Airport a1, Airport a2) {
		FlightReservation r = new FlightReservation(this.name, a1, a2);
		rsns.add(r);
		return rsns.getNumOfReservations();
	}
	
	public boolean removeFromBasket(Reservation r) {
		return rsns.remove(r);
	}
	
	public int checkOut() {
		if (this.getBalance() > rsns.getTotalCost()) {
			this.balance=this.balance-rsns.getTotalCost();
			rsns.clear();
			return this.balance;
		}
		throw new IllegalStateException();
	}

}
