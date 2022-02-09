import java.util.ArrayList;

public class Parking {

	private ArrayList<Slot> slots;
	private Slot[] slotsArray = new Slot[10];
//	private ArrayList<ArrayList<Slot>> group = new ArrayList<ArrayList<Slot>>(4);

	public Slot[] getSlotsArr() {
		return slotsArray;
	}

	public void setSlotsArr(Slot[] slotsArray) {
		this.slotsArray = slotsArray;
	}

	public ArrayList<Slot> getSlots() {
		return slots;
	}

	public void setSlots(ArrayList<Slot> slots) {
		this.slots = slots;
	}
	
}
