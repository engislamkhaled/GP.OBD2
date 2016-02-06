package PID.parser;

public class FuelrailPressure_diesel_gasolinedirectinject {
public int FuelrailPressure_dieselValue_A;
	
	public int FuelrailPressure_dieselValue_B;
	public double FuelrailPressure_dieselValue;
	public double GetFuelrailPressure(String hexadecimalA, String hexadeciamlB){
		FuelrailPressure_dieselValue_A= Integer.parseInt(hexadecimalA, 16);
		FuelrailPressure_dieselValue_B=Integer.parseInt(hexadeciamlB,16);
		
		FuelrailPressure_dieselValue= ((FuelrailPressure_dieselValue_A *256 )+ FuelrailPressure_dieselValue_B)* 10 ;
		return FuelrailPressure_dieselValue;
	}

}
