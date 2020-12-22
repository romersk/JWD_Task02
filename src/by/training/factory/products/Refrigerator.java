package by.training.factory.products;

import by.training.factory.check.Check;
import by.training.factory.device.Device;

public class Refrigerator extends Device{

	private double power_consumption;
	private double weight;
	private double freezer_capacity;
	private double overall_capacity;
	private double height;
	private double width;
	
	public Refrigerator()
	{
		power_consumption = Check.checkDouble("power consumption >> ");
		weight = Check.checkDouble("weight >> ");
		freezer_capacity = Check.checkDouble("freezer capacity >> ");
		overall_capacity = Check.checkDouble("overall capacity >> ");
		height = Check.checkDouble("height");
		width = Check.checkDouble("width");
	}
	
	public void outputData() {
		System.out.print("parameters: power consumption = " + power_consumption + "; weight = " + weight
				+ "; freezer capacity = " + freezer_capacity + "; overall capacity = " + overall_capacity + "; height = " + height + "; width = " + width + " ...");

	}
}
