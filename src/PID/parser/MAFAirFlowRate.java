package PID.parser;

public class MAFAirFlowRate {

public int mAFAirFlowRateValue_A;
	
	public int mAFAirFlowRateValue_B;
	public int mAFAirFlowRateValue;
	public int GetMAFAirFlowRate(String hexadecimalA, String hexadeciamlB){
		mAFAirFlowRateValue_A= Integer.parseInt(hexadecimalA, 16);
		mAFAirFlowRateValue_B=Integer.parseInt(hexadeciamlB,16);
		
		mAFAirFlowRateValue= ((mAFAirFlowRateValue_A *256 )+ mAFAirFlowRateValue_B)/100 ;
		return mAFAirFlowRateValue;
	}
}
