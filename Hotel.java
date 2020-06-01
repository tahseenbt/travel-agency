
public class Hotel {
	
	private String name;
	
	private Room[] rooms;
	
	public Hotel(String n, Room[] r) {
		this.name=n;
		this.rooms = new Room[r.length];
		for (int i=0; i<r.length; i++) {
			this.rooms[i] = new Room(r[i]);
		}
	}
	
	public int reserveRoom(String type) {
		Room room = Room.findAvailableRoom(this.rooms, type);
		if (room != null) {
			room.changeAvailability();
			return room.getPrice();
		}
		
		else {
			throw new IllegalArgumentException("No room was found");
		}
	}
	
	public boolean cancelRoom(String type) {
		boolean possible = Room.makeRoomAvailable(this.rooms, type);
		return possible;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
