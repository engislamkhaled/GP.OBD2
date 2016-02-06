package PID.parser;

public class Distance_traveled_sincecodes_cleared {
public int DTSCValue_A;
	
	public int DTSCValue_B;
	public double DTSCValue;
	public double GetEngineRPMValue(String hexadecimalA, String hexadeciamlB){
		DTSCValue_A= Integer.parseInt(hexadecimalA, 16);
		DTSCValue_B=Integer.parseInt(hexadeciamlB,16);
		
		DTSCValue= ((DTSCValue_A *256 )+ DTSCValue_B) ;
		return DTSCValue;
	}
}
