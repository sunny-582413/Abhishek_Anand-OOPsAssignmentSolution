package com.assessment1.driver;

import java.util.Scanner;
import com.assessment1.model.*;

public class Main {

	public static void main(String[] args) {

		/*
		 * → Driver class Main will be used to create objects of HrDepartment,
		 * TechDepartment, AdminDepartment 
		 * → Each department will display all its
		 * functionalities. 
		 * → Each department will display whether today is a holiday or
		 * not with the help of the Super Department. (SuperDepartment will act as a
		 * super class for all the departments)
		 * 
		 */

		// Variables declaration

		boolean choice;
		
		Scanner sc = new Scanner(System.in);
		byte input;

		do {
			choice = false;

			// Creating Objects within each class.

			SuperDepartment obj_SupDep = new SuperDepartment();
			AdminDepartment obj_AdminDep = new AdminDepartment();
			HrDepartment obj_HrDep = new HrDepartment();
			TechDepartment obj_TecDep = new TechDepartment();

			System.out.println("Welcome, select your department.");
			System.out.println("1.Super Department");
			System.out.println("2.Admin Department");
			System.out.println("3.Hr Department");
			System.out.println("4.Tech Department");
			input = sc.nextByte();
			sc.close();
			switch (input) {

			case 1:
				System.out.println("Welcome to the " + obj_SupDep.departmentName());
				System.out.println(obj_SupDep.getTodaysWork());
				System.out.println(obj_SupDep.getWorkDeadline());
				System.out.println(obj_SupDep.isTodayAHoliday());

				break;

			case 2:
				System.out.println("Welcome to the " + obj_AdminDep.departmentName());
				System.out.println(obj_AdminDep.getTodaysWork());
				System.out.println(obj_AdminDep.getWorkDeadline());
				System.out.println(obj_AdminDep.isTodayAHoliday());

				break;

			case 3:
				System.out.println("Welcome to the " + obj_HrDep.departmentName());
				System.out.println(obj_HrDep.doActivity());
				System.out.println(obj_HrDep.getTodaysWork());
				System.out.println(obj_HrDep.getWorkDeadline());
				System.out.println(obj_HrDep.isTodayAHoliday());

				break;

			case 4:
				System.out.println("Welcome to the " + obj_TecDep.departmentName());
				System.out.println(obj_TecDep.getTodaysWork());
				System.out.println(obj_TecDep.getWorkDeadline());
				System.out.println(obj_TecDep.getTechStackInformation());
				System.out.println(obj_TecDep.isTodayAHoliday());

				break;

			default:
				System.out.println("Please select correct department!");
			}
			
			
		} while (choice);
	}

}
