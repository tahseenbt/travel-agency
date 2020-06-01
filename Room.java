
public class Room {
	
	private String type;
	
	private int price;
	
	private boolean available;
	
	public Room(String type) {
		this.type = type;
		if (type == "double") {
			this.price = 9000;
		}
		
		else if (type == "queen") {
			this.price = 11000;
		}
		
		else if (type == "king") {
			this.price = 15000;
		}
		
		else {
			throw new IllegalArgumentException("No such room can be created.");
		}
		
		this.available = true;
	}
	
	public Room(Room r) {
		this.type = r.type;
		this.price = r.price;
		this.available = r.available;
	}
	
	public String getType() {
		return this.type;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void changeAvailability() {
		this.available = !(this.available);
	}
	
	public static Room findAvailableRoom(Room[] rooms, String type) {
		for (int i=0; i<rooms.length; i++) {
			if (rooms[i].type == type && rooms[i].available == true) {
				return rooms[i];
			}
		}
		return null;
	}
	
	public static boolean makeRoomAvailable(Room[] rooms, String type) {
		for (int i=0; i<rooms.length; i++) {
			if (rooms[i].type == type && rooms[i].available == false) {
				rooms[i].available=true;
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Room a = new Room("king");
		Room b = new Room("queen");
		Room c = new Room("double");
		Room[] d = new Room[3];
		d[0] = a;
		d[1] = b;
		d[2] = c;
		
		System.out.println(a.getPrice());
		System.out.println(d[0]);
		System.out.println(a.type);
	}

}
