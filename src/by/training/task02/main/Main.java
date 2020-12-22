package by.training.task02.main;

import static by.training.task02.entity.criteria.SearchCriteria.*;

import java.io.IOException;

import by.training.task02.entity.Appliance;
import by.training.task02.entity.criteria.Criteria;
import by.training.task02.service.ApplianceService;
import by.training.task02.service.ServiceFactory;


public class Main {

	public static void main(String[] args) throws IOException {
		Appliance appliance;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();
		
		boolean start = true;
		int power;
		double battery;
		
		while(start)
		{
			switch(Menu.mainMenu())
			{
			case 1:
				Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());
				power = ReadParam.getPower();
				criteriaOven.add(Oven.CAPACITY.toString(), power);
				appliance = service.find(criteriaOven);
				PrintApplianceInfo.print(appliance);
				break;
			case 2:
				Criteria criteriaLaptop = new Criteria(Laptop.class.getSimpleName());
				battery = ReadParam.getBatteryCapacity();
				criteriaLaptop.add(Laptop.BATTERY_CAPACITY.toString(),battery);
				appliance = service.find(criteriaLaptop);
				PrintApplianceInfo.print(appliance);
				break;
			case 3:
				Criteria criteriaRefr = new Criteria(Refrigerator.class.getSimpleName());
				power = ReadParam.getPower();
				criteriaRefr.add(Refrigerator.POWER_CONSUMPTION.toString(),power);
				appliance = service.find(criteriaRefr);
				PrintApplianceInfo.print(appliance);
				break;
			case 4:
				Criteria criteriaVaccum = new Criteria(VacuumCleaner.class.getSimpleName());
				power = ReadParam.getPower();
				criteriaVaccum.add(VacuumCleaner.POWER_CONSUMPTION.toString(),power);
				appliance = service.find(criteriaVaccum);
				PrintApplianceInfo.print(appliance);
				break;
			case 5:
				Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
				criteriaTabletPC.add(TabletPC.COLOR.toString(),"blue");
				criteriaTabletPC.add(TabletPC.DISPLAY_INCHES.toString(), 14);
				criteriaTabletPC.add(TabletPC.MEMORY_ROM.toString(), 8000);
				appliance = service.find(criteriaTabletPC);
				PrintApplianceInfo.print(appliance);
				break;
			case 6:
				Criteria criteriaSpeakers = new Criteria(Speakers.class.getSimpleName());
				power = ReadParam.getPower();
				criteriaSpeakers.add(Speakers.POWER_CONSUMPTION.toString(),power);
				appliance = service.find(criteriaSpeakers);
				PrintApplianceInfo.print(appliance);
				break;
			case 7:
				start = false;
				break;
			default : 
				System.out.println("Wrong choice");
			}
			
			System.out.println("Press Any Key To Continue...");
	        new java.util.Scanner(System.in).nextLine();
		}
		

	}

}