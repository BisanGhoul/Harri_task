import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args)  {

		Parking parking = new Parking();
		ArrayList<Slot> slots =  parking.getSlots();
		Slot[] array = parking.getSlotsArr();
		
//		slots = parking.getSlots();
		
		VehicleFactory vehicleFactory = new HarriVehicleFactory();
		Vehicle vehicle = vehicleFactory.getVehicle(VehicleType.MOTOR.name());
		
		

		
	}
	


}
