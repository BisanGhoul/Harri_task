
public class Slot {

	private String type;//small, compact, large
	private Vehicle parkedVeh;
    private boolean available;
    private int number;
    private int row;
    private int level;
    
	public Slot(String type, boolean available, int number, int row, int level) {
		super();
		this.type = type;
		this.available = true;
		this.number = number;
		this.row = row;
		this.level = level;
	}
	
	public boolean fits(Vehicle v) {
		return available;
		
	}
	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public int getRow() {
		return row;
	}


	public void setRow(int row) {
		this.row = row;
	}


	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}


	public void parkVehicle(Vehicle v) {
		this.parkedVeh=v;
	}
    
	public Slot(String type, boolean available) {
	
		this.type = type;
		this.available = available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public boolean isAvaialble(Vehicle veh) {
		if(veh==null) {
			return true;
		}
		return false;
	}
	
	
}
