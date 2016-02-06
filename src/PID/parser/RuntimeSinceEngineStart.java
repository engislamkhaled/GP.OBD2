package PID.parser;

public class RuntimeSinceEngineStart {
public int RuntimeSinceEngineStartValue_A;
	
	public int RuntimeSinceEngineStartValue_B;
	public int RuntimeSinceEngineStartValue;
	public int GetRuntimeSinceEngineStart(String hexadecimalA, String hexadeciamlB){
		RuntimeSinceEngineStartValue_A= Integer.parseInt(hexadecimalA, 16);
		RuntimeSinceEngineStartValue_B=Integer.parseInt(hexadeciamlB,16);
		
		RuntimeSinceEngineStartValue= ((RuntimeSinceEngineStartValue_A *256 )+ RuntimeSinceEngineStartValue_B) ;
		return RuntimeSinceEngineStartValue;
	}

}
