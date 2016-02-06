package PID.parser;

public class EngineLoad {
	private int engineLoadValue;
	public int GetEngineLoadValue(String hexadecimal){
		engineLoadValue = Integer.parseInt(hexadecimal, 16);
		engineLoadValue = engineLoadValue * 100/255;	//Percentage Output
		return engineLoadValue;
	}
	//toDO
	//Function to request EngineLoadValue from website to raspberryPI
	//requesting engine load convert to hexadecimal and send to raspberryPI
}
