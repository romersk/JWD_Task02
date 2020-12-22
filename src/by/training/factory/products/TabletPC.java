package by.training.factory.products;

import by.training.factory.check.Check;
import by.training.factory.device.Device;

public class TabletPC extends Device{
	private double battery_capacity;
	private double display_inches;
	private double memory_rom;
	private double flah_memory_capacity;
	private String color;
	
	public TabletPC()
	{
		battery_capacity = Check.checkDouble("battery capacity >> ");
		display_inches = Check.checkDouble("display inches >> ");
		memory_rom = Check.checkDouble("memory rom >> ");
		flah_memory_capacity = Check.checkDouble("flah memory capacity >> ");
		color = Check.checkString("color >> ");
	}
	
	public void outputData() {
		System.out.print("parameters: battery capacity = " + battery_capacity + "; display inches = " + display_inches
				+ "; memory rom = " + memory_rom + "; flah memory capacity = " + flah_memory_capacity  + "; color = " + color + " ...");

	}
}
