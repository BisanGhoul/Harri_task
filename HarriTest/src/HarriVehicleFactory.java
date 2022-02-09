
public class HarriVehicleFactory extends VehicleFactory{

	@Override
	public Vehicle create(String type) {

		if(type.equals(VehicleType.MOTOR.name())) {
			return new Motor();
		}else if(type.equals(VehicleType.CAR.name())) {
			return new Car();
		}else if(type.equals(VehicleType.BUS.name())) {
			return new Bus();
		}
		return null;
	}


}
