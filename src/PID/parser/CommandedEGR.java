package PID.parser;

public class CommandedEGR {
	private int commandedEGRValue;
	public int GetCommandedEGRValue(String hexadecimal){
		commandedEGRValue = Integer.parseInt(hexadecimal, 16);
		commandedEGRValue = commandedEGRValue * 100/255;	//Percentage Output
		return commandedEGRValue;
	}

}
