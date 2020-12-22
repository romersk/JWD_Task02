package by.training.factory.products;

import by.training.factory.check.Check;
import by.training.factory.device.Device;

public class Oven extends Device {

	private double power_consumption;
	private double weight;
	private double capacity;
	private double depth;
	private double height;
	private double width;
	
	public Oven() {
		power_consumption = Check.checkDouble("power_consumption >> ");
		weight = Check.checkDouble("weight >> ");
		capacity = Check.checkDouble("capacity >> ");
		depth = Check.checkDouble("depth >> ");
		height = Check.checkDouble("height >> ");
		width = Check.checkDouble("width >> ");
	}

	public void outputData() {
		System.out.print("parameters: power consumption = " + power_consumption + "; weight = " + weight
				+ "; capacity = " + capacity + "; depth = " + depth + "; height = " + height + "; width = " + width + " ...");

	}
}
