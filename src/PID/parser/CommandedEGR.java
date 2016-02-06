package PID.parser;

public class CommandedEGR {
	private int CommandedEGRValue;
	public int GetCommandedEGRValue(String hexadecimal){
		CommandedEGRValue = Integer.parseInt(hexadecimal, 16);
		CommandedEGRValue = CommandedEGRValue * 100/255;	//Percentage Output
		return CommandedEGRValue;
	}

}
