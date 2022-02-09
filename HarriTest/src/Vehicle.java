import java.util.ArrayList;

public abstract class Vehicle {

	  String type;//car, motor, bus
	  ArrayList <Slot> takenSlots;
	  int slotSize;

	  public void takeSlot(Slot slot) {
		  takenSlots.add(slot);
	  }
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
