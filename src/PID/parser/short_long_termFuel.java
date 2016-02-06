package PID.parser;

public class short_long_termFuel {
	private int short_long_termFuel_value;
	public int Get_short_long_termFuelValue(String hexadecimal){
		short_long_termFuel_value = Integer.parseInt(hexadecimal, 16);
		short_long_termFuel_value = ((short_long_termFuel_value - 128)*100)/128;	//Percentage Output
		return short_long_termFuel_value ;

}
}