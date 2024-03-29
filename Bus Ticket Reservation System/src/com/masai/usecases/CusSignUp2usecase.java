package com.masai.usecases;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.masai.custom.ConsoleColors;
import com.masai.dao.CustomerDao;
import com.masai.dao.CustomerDaoImpl;
import com.masai.model.Customer;



public class CusSignUp2usecase {

	public static boolean cusSignUp() {
		
		boolean flag = false;
		
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.println(ConsoleColors.ORANGE + "Enter Username" + ConsoleColors.RESET);
			String username = sc.next();
			
			System.out.println(ConsoleColors.ORANGE + "Enter Password" + ConsoleColors.RESET);
			String password = sc.next();
			
			System.out.println(ConsoleColors.ORANGE + "Enter First Name" + ConsoleColors.RESET);
			String firstName = sc.next();
			
			System.out.println(ConsoleColors.ORANGE + "Enter Last Name" + ConsoleColors.RESET);
			String lastName = sc.next();
			
			sc.nextLine();
			System.out.println(ConsoleColors.ORANGE + "Enter Address" + ConsoleColors.RESET);
			String address = sc.nextLine();
			
			System.out.println(ConsoleColors.ORANGE + "Enter Mobile" + ConsoleColors.RESET);
			String mobile = sc.next();
			
			CustomerDao dao = new CustomerDaoImpl();
			Customer customer = new Customer(username, password, firstName, lastName, address, mobile);
			
			String result = dao.cusSignUp(customer);
			
			
			if (result == "Sign up Successfull") {
				flag = true;
				System.out.println(ConsoleColors.GREEN_BACKGROUND + result + ConsoleColors.RESET);
			}
			else {
				System.out.println(ConsoleColors.RED_BACKGROUND + result + ConsoleColors.RESET);
			}
			
		}
		catch (InputMismatchException e) {
			System.out.println(ConsoleColors.RED_BACKGROUND + "Invalid Input" + ConsoleColors.RESET);
		}
		
		return flag;
	}

}
