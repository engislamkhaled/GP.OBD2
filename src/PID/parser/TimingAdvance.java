package PID.parser;

public class TimingAdvance {
	private int TimingAdvanceValue;
	public int GetTimingAdvance(String hexadecimal){
		TimingAdvanceValue = Integer.parseInt(hexadecimal, 16);
		TimingAdvanceValue = (TimingAdvanceValue- 128)/2;
		return TimingAdvanceValue;
	}

}
