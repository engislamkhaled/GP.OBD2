package PID.parser;

public class EngineRPM {
	
	public int engineRPMValue_A;
	public int engineRPMValue_B;
	public int engineRPMValue;
	public int GetEngineRPMValue(String hexadecimalA, String hexadeciamlB){
		engineRPMValue_A= Integer.parseInt(hexadecimalA, 16);
		engineRPMValue_B=Integer.parseInt(hexadeciamlB,16);
		
		engineRPMValue= ((engineRPMValue_A *256 )+ engineRPMValue_B)/4 ;
		return engineRPMValue;
	}
}