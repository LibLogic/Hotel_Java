package hotel;

public class Room {
	private int number;
	private String type;
	private int floor;
	boolean isOccupied;
	boolean needsCleaning;
	Client occupant;
	float averagePrice;
	
	public void reserve() {
		this.isOccupied = true;
	}
	
	public void checkout() {
		this.isOccupied = false;
		this.needsCleaning = true;
		// this Client = null;
		System.out.println("Outstandin balance: " + 0);
	}
	
	public void clean() {}
}
