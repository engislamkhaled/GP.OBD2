package PID.parser;

public class EGR_Error 
{

	private int EGR_ErrorValue;
	public int GetEGR_ErrorValue(String hexadecimal){
		EGR_ErrorValue = Integer.parseInt(hexadecimal, 16);
		EGR_ErrorValue = EGR_ErrorValue * 100/255;	//Percentage Output
		return EGR_ErrorValue;
	}
}
