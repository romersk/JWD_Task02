package by.training.factory.check;

import java.util.Scanner;

public class Check {

	public static double checkDouble(String mess)
	{
		double answer;
		System.out.println(mess);
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		while (!sc.hasNextDouble())
		{
			sc.next();
			System.out.println(mess);
		}
		
		answer = sc.nextDouble();
		
		return answer;
	}
	
	
	public static int checkInt(String mess)
	{
		int answer;
		System.out.println(mess);
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		while (!sc.hasNextInt())
		{
			sc.next();
			System.out.println(mess);
		}
		
		answer = sc.nextInt();
		
		return answer;
	}
	
	public static String checkString(String mess)
	{
		String answer;
		System.out.println(mess);
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		answer = sc.nextLine();
		
		return answer;
	}
	
}
