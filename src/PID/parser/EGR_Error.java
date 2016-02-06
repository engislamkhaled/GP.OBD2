package PID.parser;

public class EGR_Error 
{

	private int egrErrorValue;
	public int GetEGR_ErrorValue(String hexadecimal){
		egrErrorValue = Integer.parseInt(hexadecimal, 16);
		egrErrorValue = egrErrorValue * 100/255;	//Percentage Output
		return egrErrorValue;
	}
}
