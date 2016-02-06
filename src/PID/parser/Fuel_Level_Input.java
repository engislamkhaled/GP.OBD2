package PID.parser;

public class Fuel_Level_Input
{
	private int Fuel_Level_Input_Value;
	public int GetFuel_Level_Input_Value(String hexadecimal){
		Fuel_Level_Input_Value = Integer.parseInt(hexadecimal, 16);
		Fuel_Level_Input_Value = Fuel_Level_Input_Value * 100/255;	//Percentage Output
		return Fuel_Level_Input_Value;
	}

}
