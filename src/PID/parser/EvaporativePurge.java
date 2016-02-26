package PID.parser;

public class EvaporativePurge 
{
	private int evaporativePurgeValue;
	
	public int GetEvaporative_purge_Value(String hexadecimal){
		evaporativePurgeValue = Integer.parseInt(hexadecimal, 16);
		evaporativePurgeValue = evaporativePurgeValue * 100/255;	//Percentage Output
		return evaporativePurgeValue;
	}
}
