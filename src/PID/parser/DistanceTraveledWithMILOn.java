package PID.parser;

public class DistanceTraveledWithMILOn {
	
	public int distanceTraveledWithMILOnValue_A;
	public int distanceTraveledWithMILOnValue_B;
	public int distanceTraveledWithMILOnValue;
	public int GetDistanceTraveledWithMILOn(String hexadecimalA, String hexadeciamlB){
		
		distanceTraveledWithMILOnValue_A= Integer.parseInt(hexadecimalA, 16);
		distanceTraveledWithMILOnValue_B=Integer.parseInt(hexadeciamlB,16);
		
		distanceTraveledWithMILOnValue= ((distanceTraveledWithMILOnValue_A *256 )+ distanceTraveledWithMILOnValue_B) ;
		return distanceTraveledWithMILOnValue;
	}

}
