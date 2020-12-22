package by.training.factory.products;

import by.training.factory.check.Check;
import by.training.factory.device.Device;

public class VacuumCleaner extends Device{
	private double power_consumption;
	private String filter_type;
	private String bag_type;
	private String wand_type;
	private double motor_speed_regulation;
	private double cleaning_width;
	
	public VacuumCleaner()
	{
		power_consumption = Check.checkDouble("ower consumption >> ");
		filter_type = Check.checkString("filter type >> ");
		bag_type = Check.checkString("bag type >> ");
		wand_type = Check.checkString("wand type >> ");
		motor_speed_regulation = Check.checkDouble("motor speed regulation >> ");
		cleaning_width = Check.checkDouble("cleaning width >>");
	}

	public void outputData() {
		System.out.print("parameters: power consumption = " + power_consumption + "; filter type = " + filter_type
				+ "; bag type = " + bag_type + "; wand type = " + wand_type + "; motor speed regulation = " + motor_speed_regulation + "; cleaning width = " + cleaning_width + " ...");

	}
}
