package PID.parser;

public class IntakeAirTemperature {
	private int intakeAirTemperatureValue;
	public int GetIntakeAirTemperatureValue(String hexadecimal){
		intakeAirTemperatureValue= Integer.parseInt(hexadecimal, 16);
		intakeAirTemperatureValue = intakeAirTemperatureValue - 40;
		return intakeAirTemperatureValue;
	}

}
