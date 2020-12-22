package by.training.factory.main;

import by.training.factory.check.Check;
import by.training.factory.decice_type.DeviceType;
import by.training.factory.device_creator.DeviceCreator;
import by.training.factory.products_creator.*;

public class Main {

	public static void main(String[] args) {
		int choice;
		boolean start = true;
		DeviceCreator device;
		
		while (start)
		{
			menuAll();
			
			choice = Check.checkInt("choice >> ");
			
			switch(choice)
			{
			case 1:
				device = new OvenCreator();
				device.orderDevice(DeviceType.Oven);
				break;
			case 2:
				device = new LaptopCreator();
				device.orderDevice(DeviceType.Laptop);
				break;
			case 3:
				device = new RefrigeratorCreator();
				device.orderDevice(DeviceType.Refrigirator);
				break;
			case 4:
				device = new VacuumCleanerCreator();
				device.orderDevice(DeviceType.VacuumCleaner);
				break;
			case 5:
				device = new TabletPCreator();
				device.orderDevice(DeviceType.TabletPC);
				break;
			case 6:
				device = new SpeakersCreator();
				device.orderDevice(DeviceType.Speakers);
				break;
			case 7:
				start = false;
				break;
			}
			
			System.out.println("Press Any Key To Continue...");
	        new java.util.Scanner(System.in).nextLine();
	    
		}
		
	}

	private static void menuAll()
	{
		System.out.println("Welecome to Factory!");
		System.out.println("What would you like to order?");
		System.out.println();
		System.out.print("1. Oven");
		System.out.println();
		System.out.print("2. Laptop");
		System.out.println();
		System.out.print("3. Refrigerator");
		System.out.println();
		System.out.print("4. Vacuum Cleaner");
		System.out.println();
		System.out.print("5. Tablet PC");
		System.out.println();
		System.out.print("6. Speakers");
		System.out.println();
		System.out.print("7. Exit");
		System.out.println();
	}
}
