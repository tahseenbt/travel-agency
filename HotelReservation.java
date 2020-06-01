
public class HotelReservation extends Reservation {
	
	private Hotel hotelName;
	
	private String type;
	
	private int nights;
	
	private int price;
	
	
	public HotelReservation(String name, Hotel h, String type, int nights) {
		super(name);
		
		this.hotelName = h;
		
		this.type = type;
		
		this.nights = nights;
		
		this.price = h.reserveRoom(type);
		
	}
	
	public int getNumOfNights() {
		return this.nights;
	}
	
	public int getCost() {
		return this.price*this.nights;
	}
	
	public boolean equals(Object o) {
		if (this.getClass() == o.getClass()) {
			HotelReservation hr = (HotelReservation)o;
			if ( hr.reservationName() == this.reservationName() && hr.type == this.type && this.nights == hr.nights && this.getCost() == hr.getCost()) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

	}

}
