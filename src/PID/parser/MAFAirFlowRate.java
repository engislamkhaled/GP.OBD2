package PID.parser;

public class MAFAirFlowRate {

public int MAFAirFlowRateValue_A;
	
	public int MAFAirFlowRateValue_B;
	public int MAFAirFlowRateValue;
	public int GetMAFAirFlowRate(String hexadecimalA, String hexadeciamlB){
		MAFAirFlowRateValue_A= Integer.parseInt(hexadecimalA, 16);
		MAFAirFlowRateValue_B=Integer.parseInt(hexadeciamlB,16);
		
		MAFAirFlowRateValue= ((MAFAirFlowRateValue_A *256 )+ MAFAirFlowRateValue_B)/100 ;
		return MAFAirFlowRateValue;
	}
}
