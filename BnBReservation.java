
public class BnBReservation extends HotelReservation {
	
	public BnBReservation(String name, Hotel h, String type, int nights) {
		super(name, h, type, nights);
	}
	
	public int getCost() {
		int cost = super.getCost()+1000*this.getNumOfNights();
		return cost;
	}

	public static void main(String[] args) {
	}

}
