package PID.parser;

public class DistanceTraveledWithMILOn {
public int DistanceTraveledWithMILOnValue_A;
	
	public int DistanceTraveledWithMILOnValue_B;
	public int DistanceTraveledWithMILOnValue;
	public int GetDistanceTraveledWithMILOn(String hexadecimalA, String hexadeciamlB){
		DistanceTraveledWithMILOnValue_A= Integer.parseInt(hexadecimalA, 16);
		DistanceTraveledWithMILOnValue_B=Integer.parseInt(hexadeciamlB,16);
		
		DistanceTraveledWithMILOnValue= ((DistanceTraveledWithMILOnValue_A *256 )+ DistanceTraveledWithMILOnValue_B) ;
		return DistanceTraveledWithMILOnValue;
	}

}
