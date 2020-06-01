

public class Airport {
	
	private int x;
	
	private int y;
	
	private int fees;
	
	public Airport(int x, int y, int fees) {
		this.x = x;
		this.y = y;
		this.fees = fees;
	}
	
	public int getFees() {
		return this.fees;
	}
	
	public static int getDistance(Airport a, Airport b) {
		return (int)Math.ceil(Math.sqrt(Math.pow((a.x-b.x), 2) + Math.pow((a.y-b.y), 2)));
	}

	public static void main(String[] args) {
		int[] a = {1};
		int[] b = a;
		b[0] += 1;

	}

}
