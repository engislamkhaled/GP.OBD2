package PID.parser;

public class IntakeAirTemperature {
	private int IntakeAirTemperatureValue;
	public int GetIntakeAirTemperatureValue(String hexadecimal){
		IntakeAirTemperatureValue= Integer.parseInt(hexadecimal, 16);
		IntakeAirTemperatureValue = IntakeAirTemperatureValue - 40;
		return IntakeAirTemperatureValue;
	}

}
