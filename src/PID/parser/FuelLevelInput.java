package PID.parser;

public class FuelLevelInput
{
	private int fuelLevelInputValue;
	public int GetFuel_Level_Input_Value(String hexadecimal){
		fuelLevelInputValue = Integer.parseInt(hexadecimal, 16);
		fuelLevelInputValue = fuelLevelInputValue * 100/255;	//Percentage Output
		return fuelLevelInputValue;
	}

}
