package PID.parser;

public class FuelrailPressure_relative_to_manifold_vacuum_ {
public int FuelrailPressureValue_A;
	
	public int FuelrailPressureValue_B;
	public double FuelrailPressureValue;
	public double GetFuelrailPressure(String hexadecimalA, String hexadeciamlB){
		FuelrailPressureValue_A= Integer.parseInt(hexadecimalA, 16);
		FuelrailPressureValue_B=Integer.parseInt(hexadeciamlB,16);
		
		FuelrailPressureValue= ((FuelrailPressureValue_A *256 )+ FuelrailPressureValue_B)* 0.079 ;
		return FuelrailPressureValue;
	}
}
