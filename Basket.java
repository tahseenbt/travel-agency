
public class Basket {
	
	private Reservation[] r;
	
	public Basket() {
		this.r = new Reservation[0];
	}
	
	public Reservation[] getProducts() {
		Reservation[] ret = this.r;
		return ret;
	}
	
	public int add(Reservation res) {
		Reservation[] newR = new Reservation[r.length+1];
		for (int i = 0; i<r.length; i++) {
			newR[i] = r[i];
		}
		newR[r.length]=res;
		this.r = newR;
		return r.length;
	}
	
	public boolean remove(Reservation res) {
		Reservation[] newR = new Reservation[r.length-1];
		int d = 0;
		for (int i = 0; i<r.length; i++) {
			if (r[i].equals(res)) {
				d = 1;
			}
			else if (d == 0) {
				newR[i] = r[i];
			}
			else {
				newR[i-1] = r[i];
			}
		}
		
		if (d == 0) {
			return false;
		}
		
		this.r = newR;
		return true;
	}
	
	public void clear() {
		this.r = new Reservation[0];
	}
	
	public int getNumOfReservations() {
		return r.length;
	}
	
	public int getTotalCost() {
		int cost = 0;
		for (int i=0; i<r.length; i++) {
			cost+=r[i].getCost();
		}
		return cost;
	}

	public static void main(String[] args) {
	}

}
