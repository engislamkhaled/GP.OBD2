package PID.parser;

public class FuelPressure {
	private int fuelPressure;
	public int GetFuelPressure(String hexadecimal){
		fuelPressure = Integer.parseInt(hexadecimal, 16);
		fuelPressure = fuelPressure * 3; //kPa
		return fuelPressure;
	}
}
