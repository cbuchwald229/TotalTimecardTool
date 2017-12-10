package view;

import model.*;
import controller.*;
import java.util.List;
import java.util.Scanner;

public class RunProgram
{
	static Scanner in = new Scanner(System.in);
	//static TotalTimecardTool ttt = new TotalTimecardTool();
	
	public static void runMenu()
	{
		boolean goAgain = true;
		System.out.println("--- Welcome to the Total Timecard Tool! Please make a selection ---");
		while (goAgain)
		{
			System.out.println("*  Select an item:");
			System.out.println("*  1 -- Employee");
			System.out.println("*  2 -- Hours");
			System.out.println("*  3 -- Pay");
			System.out.println("*  4 -- Exit the awesome program");
			System.out.print("*  Your selection: ");
			int selection = in.nextInt();
			in.nextLine();
			
			if (selection == 1)
			{
				employeeMenu();
			}
			else if (selection == 2)
			{
				hoursMenu();
			}
			else if (selection == 3)
			{
				payMenu();
			}
			else
			{
				//ttt.cleanUp();
				System.out.println("  ---Goodbye!---  ");
				goAgain = false;
			}
		}
	}
	
	private static void employeeMenu()
	{
		boolean goAgain = true;
		System.out.println("--- Welcome to the Employee menu! Please make a selection ---");
		while (goAgain)
		{
			System.out.println("*  Select an item:");
			System.out.println("*  1 -- Add an Employee");
			System.out.println("*  2 -- Edit an Employee");
			System.out.println("*  3 -- Delete an Employee");
			System.out.println("*  4 -- View Employee List");
			System.out.println("*  5 -- Exit to main menu");
			int selection = in.nextInt();
			in.nextLine();
		
			if (selection == 1)
			{
				System.out.println("addEmployee.jsp");
			}
			else if (selection == 2)
			{
				System.out.println("editEmployee.jsp");
			}
			else if (selection == 3)
			{
				System.out.println("deleteEmployee.jsp");
			}
			else if (selection == 4)
			{
				System.out.println("viewEmployeeList.jsp");
			}
			else
			{
				//ttt.cleanUp();
				runMenu();
				goAgain = false;
			}
		}
	}
	
	private static void hoursMenu()
	{
		boolean goAgain = true;
		System.out.println("--- Welcome to the Hours menu! Please make a selection ---");
		while (goAgain)
		{
			System.out.println("*  Select an item:");
			System.out.println("*  1 -- Add Hours");
			System.out.println("*  2 -- Edit Hours");
			System.out.println("*  3 -- Delete Hours");
			System.out.println("*  4 -- View Hours");
			System.out.println("*  5 -- Exit to main menu");
			int selection = in.nextInt();
			in.nextLine();
			
			if (selection == 1)
			{
				System.out.println("addHours.jsp");
			}
			else if (selection == 2)
			{
				System.out.println("editHours.jsp");
			}
			else if (selection == 3)
			{
				System.out.println("deleteHours.jsp");
			}
			else if (selection == 4)
			{
				System.out.println("viewWeeklyHours.jsp");
			}
			else
			{
				//ttt.cleanUp();
				runMenu();
				goAgain = false;
			}
		}
	}
	
	private static void payMenu()
	{
		boolean goAgain = true;
		System.out.println("--- Welcome to the Pay menu! Please make a selection ---");
		while (goAgain)
		{
			System.out.println("*  Select an item:");
			System.out.println("*  1 -- Calculate approximate gross income for the week");
			System.out.println("*  3 -- Exit to main menu");
			int selection = in.nextInt();
			in.nextLine();
			
			if (selection == 1)
			{
				System.out.println("calculateGross.jsp");
			}
			else
			{
				//ttt.cleanUp();
				runMenu();
				goAgain = false;
			}
		}
	}
}