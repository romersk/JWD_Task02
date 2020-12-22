package by.training.factory.products;

import by.training.factory.check.Check;
import by.training.factory.device.Device;

public class Speakers extends Device {
	private double power_consumption;
	private int number_of_speakers;
	private String frequency_range;
	private double cord_length;
	
	public Speakers()
	{
		power_consumption = Check.checkDouble("power consumption >> ");
		number_of_speakers = Check.checkInt("number of speakers >> ");
		frequency_range = Check.checkString("frequency range >> ");
		cord_length = Check.checkDouble("cord length >> ");
	}
	
	public void outputData() {
		System.out.print("parameters: power consumption = " + power_consumption + "; number of speakers = " + number_of_speakers
				+ "; frequency range = " + frequency_range + "; cord length = " + cord_length + " ...");

	}
}
