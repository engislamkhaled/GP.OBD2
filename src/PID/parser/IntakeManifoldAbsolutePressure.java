package PID.parser;

public class IntakeManifoldAbsolutePressure {
	private int IntakeManifoldAbsolutePressure;
	public int GetEngineCoolantTemperature(String hexadecimal){
		IntakeManifoldAbsolutePressure= Integer.parseInt(hexadecimal, 16);
		
		return IntakeManifoldAbsolutePressure;
	}

}
