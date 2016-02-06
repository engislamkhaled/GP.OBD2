package PID.parser;

public class OxygenSensors_bank {

	public int Oxygen_bankValue_A;
	public int Oxygen_SensorsValue_B;
	
	public int[] GetOxygenSensors_bank(String hexadecimalA, String hexadeciamlB){
		int[] returnvalues = new int[2];

		
		Oxygen_bankValue_A= Integer.parseInt(hexadecimalA, 16);
		if (hexadeciamlB == "FF")
		{
			System.out.println("sensor is not used in trim calc");
			Oxygen_SensorsValue_B = 0;
		}
		else{
		Oxygen_SensorsValue_B=Integer.parseInt(hexadeciamlB,16);}
		
		Oxygen_bankValue_A=Oxygen_bankValue_A/200;
		Oxygen_SensorsValue_B=(Oxygen_SensorsValue_B -128)*100 /128;
		returnvalues[0]=Oxygen_bankValue_A;
		returnvalues[1]=Oxygen_SensorsValue_B;
		
		return returnvalues;
	}

}
