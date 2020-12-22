package by.training.factory.device_creator;

import by.training.factory.decice_type.DeviceType;
import by.training.factory.device.Device;

public abstract class DeviceCreator {
	private void receiveOrder()
	{
		System.out.println("The order is received");
	}
	
	private void deliverOrder()
	{
		System.out.println("The order is ready");
	}
	
	public Device orderDevice(DeviceType type)
	{
		this.receiveOrder();
		System.out.println();
		
		Device device = createDevice(type);
		System.out.println();
		
		this.deliverOrder();
		System.out.println();
		
		System.out.println("Thanks for order");
		return device;
	}
	
	public abstract Device createDevice(DeviceType type);
}
