package PID.parser;

public class ThrottlePosition {
	private int ThrottlePositionValue;
	public int GetThrottlePositionValue(String hexadecimal){
		ThrottlePositionValue = Integer.parseInt(hexadecimal, 16);
		ThrottlePositionValue = ThrottlePositionValue * 100/255;	//Percentage Output
		return ThrottlePositionValue;
	}

}
