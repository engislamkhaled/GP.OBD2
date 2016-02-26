package PID.parser;

public class IntakeManifoldAbsolutePressure {
	private int intakeManifoldAbsolutePressure;
	public int GetIntakeManifoldAbsolutePressure(String hexadecimal){
		intakeManifoldAbsolutePressure= Integer.parseInt(hexadecimal, 16);
		
		return intakeManifoldAbsolutePressure;
	}

}