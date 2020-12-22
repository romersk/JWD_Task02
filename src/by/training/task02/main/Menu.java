package by.training.task02.main;

public class Menu {

	public static int mainMenu()
	{
		int choice;

		
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
		
		choice = Check.checkInt("Your choice >> ");
		
		return choice;
	}
	
}
