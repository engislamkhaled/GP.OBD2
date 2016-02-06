package PID.parser;

public class Parser {
	public int commandedEGRValue;
	public int distanceTraveledWithMILOnValue_A;
	public int distanceTraveledWithMILOnValue_B;
	public int distanceTraveledWithMILOnValue;
	public int egrErrorValue;
	public int engineCoolantTemperature;
	public int engineLoadValue;
	public int engineRPMValue_A;
	public int engineRPMValue_B;
	public int engineRPMValue;
	public int evaporativePurgeValue;
	public int fuelLevelInputValue;
	public int fuelPressure;
	public int fuelrailPressureValue_A;
	public int fuelrailPressureValue_B;
	public double fuelrailPressureValue;
	public int fuelrailPressureDGDInject_A;
	public int fuelrailPressureDGDInject_B;
	public double fuelrailPressureDGDInject;
	public int intakeAirTemperatureValue;
	public int intakeManifoldAbsolutePressure;
	public int mAFAirFlowRateValue_A;
	public int mAFAirFlowRateValue_B;
	public int mAFAirFlowRateValue;
	public int O2Sn_WR_lambdaValue_A;
	public int O2Sn_WR_lambdaValue_B;
	public int O2Sn_WR_lambdaValue_C;
	public int O2Sn_WR_lambdaValue_D;
	public int oxygen_bankValue_A;
	public int oxygen_SensorsValue_B;
	public int runtimeSinceEngineStartValue_A;
	public int runtimeSinceEngineStartValue_B;
	public int runtimeSinceEngineStartValue;
	public int short_long_termFuel_value;
	public int throttlePositionValue;
	public int timingAdvanceValue;
	public int vehicleSpeed;
	
	public int GetVehicleSpeed(String hexadecimal){
		vehicleSpeed= Integer.parseInt(hexadecimal, 16);
		
		return vehicleSpeed;
	}

	public int GetTimingAdvance(String hexadecimal){
		timingAdvanceValue = Integer.parseInt(hexadecimal, 16);
		timingAdvanceValue = (timingAdvanceValue- 128)/2;
		return timingAdvanceValue;
	}
	public int GetThrottlePositionValue(String hexadecimal){

		throttlePositionValue = Integer.parseInt(hexadecimal, 16);
		throttlePositionValue = throttlePositionValue * 100/255;	//Percentage Output
		return throttlePositionValue;
	}
	public int Get_short_long_termFuelValue(String hexadecimal){
		short_long_termFuel_value = Integer.parseInt(hexadecimal, 16);
		short_long_termFuel_value = ((short_long_termFuel_value - 128)*100)/128;	//Percentage Output
		return short_long_termFuel_value ;

	}
	
	public int GetRuntimeSinceEngineStart(String hexadecimalA, String hexadeciamlB){
		runtimeSinceEngineStartValue_A= Integer.parseInt(hexadecimalA, 16);
		runtimeSinceEngineStartValue_B=Integer.parseInt(hexadeciamlB,16);
		
		runtimeSinceEngineStartValue= ((runtimeSinceEngineStartValue_A *256 )+ runtimeSinceEngineStartValue_B) ;
		return runtimeSinceEngineStartValue;
	}
	
	public int[] GetOxygenSensors_bank(String hexadecimalA, String hexadeciamlB){
		int[] returnvalues = new int[2];

		
		oxygen_bankValue_A= Integer.parseInt(hexadecimalA, 16);
		if (hexadeciamlB == "FF")
		{
			System.out.println("sensor is not used in trim calc");
			oxygen_SensorsValue_B = 0;
		}
		else{
		oxygen_SensorsValue_B=Integer.parseInt(hexadeciamlB,16);}
		
		oxygen_bankValue_A=oxygen_bankValue_A/200;
		oxygen_SensorsValue_B=(oxygen_SensorsValue_B -128)*100 /128;
		returnvalues[0]=oxygen_bankValue_A;
		returnvalues[1]=oxygen_SensorsValue_B;
		
		return returnvalues;
	}
	
	
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
	public int GetMAFAirFlowRate(String hexadecimalA, String hexadeciamlB){
		mAFAirFlowRateValue_A= Integer.parseInt(hexadecimalA, 16);
		mAFAirFlowRateValue_B=Integer.parseInt(hexadeciamlB,16);
		
		mAFAirFlowRateValue= ((mAFAirFlowRateValue_A *256 )+ mAFAirFlowRateValue_B)/100 ;
		return mAFAirFlowRateValue;
	}
	public int GetIntakeManifoldAbsolutePressure(String hexadecimal){
		intakeManifoldAbsolutePressure= Integer.parseInt(hexadecimal, 16);
		
		return intakeManifoldAbsolutePressure;
	}
	
	public int GetIntakeAirTemperatureValue(String hexadecimal){
		intakeAirTemperatureValue= Integer.parseInt(hexadecimal, 16);
		intakeAirTemperatureValue = intakeAirTemperatureValue - 40;
		return intakeAirTemperatureValue;
	}

	
	public double GetFuelrailPressureDGDinject(String hexadecimalA, String hexadeciamlB){
		fuelrailPressureDGDInject_A= Integer.parseInt(hexadecimalA, 16);
		fuelrailPressureDGDInject_B=Integer.parseInt(hexadeciamlB,16);
		
		fuelrailPressureDGDInject= ((fuelrailPressureDGDInject_A *256 )+ fuelrailPressureDGDInject_B)* 10 ;
		return fuelrailPressureDGDInject;
	}
	public double FuelrailPressure_relative_to_manifold_vacuum_(String hexadecimalA, String hexadeciamlB){
		fuelrailPressureValue_A= Integer.parseInt(hexadecimalA, 16);
		fuelrailPressureValue_B=Integer.parseInt(hexadeciamlB,16);
		
		fuelrailPressureValue= ((fuelrailPressureValue_A *256 )+ fuelrailPressureValue_B)* 0.079 ;
		return fuelrailPressureValue;
	}
	public int GetFuelPressure(String hexadecimal){
		fuelPressure = Integer.parseInt(hexadecimal, 16);
		fuelPressure = fuelPressure * 3; //kPa
		return fuelPressure;
	}
	
	public int GetFuel_Level_Input_Value(String hexadecimal){
		fuelLevelInputValue = Integer.parseInt(hexadecimal, 16);
		fuelLevelInputValue = fuelLevelInputValue * 100/255;	//Percentage Output
		return fuelLevelInputValue;
	}
	
	public int GetEvaporative_purge_Value(String hexadecimal){
		evaporativePurgeValue = Integer.parseInt(hexadecimal, 16);
		evaporativePurgeValue = evaporativePurgeValue * 100/255;	//Percentage Output
		return evaporativePurgeValue;
	}
	
	public int GetEngineRPMValue(String hexadecimalA, String hexadeciamlB){
		engineRPMValue_A= Integer.parseInt(hexadecimalA, 16);
		engineRPMValue_B=Integer.parseInt(hexadeciamlB,16);
		
		engineRPMValue= ((engineRPMValue_A *256 )+ engineRPMValue_B)/4 ;
		return engineRPMValue;
	}
	
	public int GetEngineLoadValue(String hexadecimal){
		engineLoadValue = Integer.parseInt(hexadecimal, 16);
		engineLoadValue = engineLoadValue * 100/255;	//Percentage Output
		return engineLoadValue;
	}
	
	public int GetEngineCoolantTemperature(String hexadecimal){
		engineCoolantTemperature = Integer.parseInt(hexadecimal, 16);
		engineCoolantTemperature = engineCoolantTemperature - 40;
		return engineCoolantTemperature;
	}
	public int GetEGR_ErrorValue(String hexadecimal){
		egrErrorValue = Integer.parseInt(hexadecimal, 16);
		egrErrorValue = egrErrorValue * 100/255;	//Percentage Output
		return egrErrorValue;
	}

	public int GetDistanceTraveledWithMILOn(String hexadecimalA, String hexadeciamlB){
		
		distanceTraveledWithMILOnValue_A= Integer.parseInt(hexadecimalA, 16);
		distanceTraveledWithMILOnValue_B=Integer.parseInt(hexadeciamlB,16);
		
		distanceTraveledWithMILOnValue= ((distanceTraveledWithMILOnValue_A *256 )+ distanceTraveledWithMILOnValue_B) ;
		return distanceTraveledWithMILOnValue;
	}
	
	public int GetCommandedEGRValue(String hexadecimal){
		commandedEGRValue = Integer.parseInt(hexadecimal, 16);
		commandedEGRValue = commandedEGRValue * 100/255;	//Percentage Output
		return commandedEGRValue;
	}
}
