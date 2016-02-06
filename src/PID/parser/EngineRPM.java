
package PID.parser;

public class EngineRPM {
	public int EngineRPMValue_A;
	
	public int EngineRPMValue_B;
	public int EngineRPMValue;
	public int GetEngineRPMValue(String hexadecimalA, String hexadeciamlB){
		EngineRPMValue_A= Integer.parseInt(hexadecimalA, 16);
		EngineRPMValue_B=Integer.parseInt(hexadeciamlB,16);
		
		EngineRPMValue= ((EngineRPMValue_A *256 )+ EngineRPMValue_B)/4 ;
		return EngineRPMValue;
	}
}

