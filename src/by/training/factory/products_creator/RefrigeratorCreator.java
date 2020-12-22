package by.training.factory.products_creator;

import by.training.factory.decice_type.DeviceType;
import by.training.factory.device.Device;
import by.training.factory.device_creator.DeviceCreator;
import by.training.factory.products.Refrigerator;

public class RefrigeratorCreator extends DeviceCreator {

	public Device createDevice(DeviceType type) {
		Device device = new Refrigerator();
		System.out.println();
		System.out.print("Creating " + type + " with ");
		device.outputData();
		System.out.println();
		return device;
	}
	
}
