package PID.parser;

public class O2Sn_WR_lambda {
	public int O2Sn_WR_lambdaValue_A;
	public int O2Sn_WR_lambdaValue_B;
	public int O2Sn_WR_lambdaValue_C;
	public int O2Sn_WR_lambdaValue_D;
	
	
	public int[] GetO2Sn_WR_lambda(String hexadecimalA, String hexadeciamlB, String hexadeciamlC , String hexadeciamlD){
		int[] returnvalues = new int[2];
	
		O2Sn_WR_lambdaValue_A= Integer.parseInt(hexadecimalA,16);
		O2Sn_WR_lambdaValue_B=Integer.parseInt(hexadeciamlB,16);
		O2Sn_WR_lambdaValue_C=Integer.parseInt(hexadeciamlC,16);
		O2Sn_WR_lambdaValue_D=Integer.parseInt(hexadeciamlD,16);
		 
		O2Sn_WR_lambdaValue_A= ((O2Sn_WR_lambdaValue_A *256 )+ O2Sn_WR_lambdaValue_B )*2/65535;
		O2Sn_WR_lambdaValue_C=((O2Sn_WR_lambdaValue_C *256 )+ O2Sn_WR_lambdaValue_D )*8/65535;
		returnvalues[0]=O2Sn_WR_lambdaValue_A;
		returnvalues[1]=O2Sn_WR_lambdaValue_C;
		
		return returnvalues;
	}


}
