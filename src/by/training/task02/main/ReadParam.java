package by.training.task02.main;

public class ReadParam {
	public static int getPower()
	{
		int power;
		
		power = Check.checkInt("Power consumption >> ");
		
		return power;
	}
	
	public static double getBatteryCapacity()
	{
		double battery_capacity;
		
		battery_capacity = Check.checkDouble("battery capacity >> ");
		
		return battery_capacity;
	}
}
