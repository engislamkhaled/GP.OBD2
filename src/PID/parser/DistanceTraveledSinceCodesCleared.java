package PID.parser;

public class DistanceTraveledSinceCodesCleared {
	
	public int dtscValue_A;
	public int dtscValue_B;
	public double dtscValue;
	public double GetDistanceTraveledSinceCodesCleared(String hexadecimalA, String hexadeciamlB){
		dtscValue_A= Integer.parseInt(hexadecimalA, 16);
		dtscValue_B=Integer.parseInt(hexadeciamlB,16);
		
		dtscValue= ((dtscValue_A *256 )+ dtscValue_B) ;
		return dtscValue;
	}
}
