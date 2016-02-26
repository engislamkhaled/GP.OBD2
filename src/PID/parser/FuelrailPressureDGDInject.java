package PID.parser;

public class FuelrailPressureDGDInject {
	
	public int fuelrailPressureDGDInject_A;
	public int fuelrailPressureDGDInject_B;
	public double fuelrailPressureDGDInject;
	public double GetFuelrailPressure(String hexadecimalA, String hexadeciamlB){
		fuelrailPressureDGDInject_A= Integer.parseInt(hexadecimalA, 16);
		fuelrailPressureDGDInject_B=Integer.parseInt(hexadeciamlB,16);
		
		fuelrailPressureDGDInject= ((fuelrailPressureDGDInject_A *256 )+ fuelrailPressureDGDInject_B)* 10 ;
		return fuelrailPressureDGDInject;
	}

}
