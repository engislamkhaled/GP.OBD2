package PID.parser;

public class Evaporative_purge 
{

	
	private int Evaporative_purge_Value;
	public int GetEvaporative_purge_Value(String hexadecimal){
		Evaporative_purge_Value = Integer.parseInt(hexadecimal, 16);
		Evaporative_purge_Value = Evaporative_purge_Value * 100/255;	//Percentage Output
		return Evaporative_purge_Value;
	}
}
