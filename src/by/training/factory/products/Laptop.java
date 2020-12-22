package by.training.factory.products;

import by.training.factory.check.Check;
import by.training.factory.device.Device;

public class Laptop extends Device {
	private double battery_capacity;
	private String operation_system;
	private double memory_room;
	private double system_memory;
	private double cpu;
	private double display_inches;
	
	public Laptop()
	{
		battery_capacity = Check.checkDouble("battery capacity >> ");
		operation_system = Check.checkString("OS >> ");
		memory_room = Check.checkDouble("memory room >> ");
		system_memory = Check.checkDouble("system memory >> ");
		cpu = Check.checkDouble("cpu >> ");
		display_inches = Check.checkDouble("display inches >> ");
	}
	
	public void outputData() {
		System.out.print("parameters: battery capacity = " + battery_capacity + "; OS = " + operation_system
				+ "; memory room = " + memory_room + "; system memory = " + system_memory + "; CPU = " + cpu + "; display inches= " + display_inches + " ...");

	}
}
