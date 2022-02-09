
public abstract class VehicleFactory {
	

	public abstract Vehicle create(String type);
	
	public Vehicle getVehicle(String type) {
		Vehicle vehicle = create(type);
		return vehicle;
		
	}
}
