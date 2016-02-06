package PID.parser;

public class VehicleSpeed {
	private int VehicleSpeed;
	public int GetVehicleSpeed(String hexadecimal){
		VehicleSpeed= Integer.parseInt(hexadecimal, 16);
		
		return VehicleSpeed;
	}

}
