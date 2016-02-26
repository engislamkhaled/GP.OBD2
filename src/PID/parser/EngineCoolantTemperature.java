package PID.parser;

public class EngineCoolantTemperature {
	private int engineCoolantTemperature;
	public int GetEngineCoolantTemperature(String hexadecimal){
		engineCoolantTemperature = Integer.parseInt(hexadecimal, 16);
		engineCoolantTemperature = engineCoolantTemperature - 40;
		return engineCoolantTemperature;
	}
}
