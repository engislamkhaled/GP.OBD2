package PID.parser;

public class ThrottlePosition {
	private int ThrottlePositionValue;
<<<<<<< HEAD
	public int GetThrottlepositionValue(String hexadecimal){
=======
	public int GetThrottlePositionValue(String hexadecimal){
>>>>>>> origin/Islam-Branch
		ThrottlePositionValue = Integer.parseInt(hexadecimal, 16);
		ThrottlePositionValue = ThrottlePositionValue * 100/255;	//Percentage Output
		return ThrottlePositionValue;
	}

}
