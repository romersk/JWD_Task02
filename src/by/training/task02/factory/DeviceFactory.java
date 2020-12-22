package by.training.task02.factory;

import java.util.HashMap;

import by.training.task02.entity.Appliance;

public abstract class DeviceFactory {
	
	public Appliance orderElectronics(String type,HashMap<String, Object> requirements) {
		Appliance electronics;
		electronics=createElectronics(type,requirements);
		return electronics;
	}
	
	abstract Appliance createElectronics(String type,HashMap<String, Object> requirements);
}
