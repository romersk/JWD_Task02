package by.training.task02.main;

import by.training.task02.entity.Appliance;

public class PrintApplianceInfo {

	public static void print(Appliance appliance) {
			if(appliance!=null){
			System.out.println("Device was found");
			System.out.println();
			System.out.println(appliance.toString());
			System.out.println();
			}else {
				System.out.println();
				System.out.println("Not found!");
				System.out.println();
		}
	}

}