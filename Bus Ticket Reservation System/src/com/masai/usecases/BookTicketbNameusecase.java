package com.masai.usecases;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.masai.custom.ConsoleColors;
import com.masai.dao.CustomerDao;
import com.masai.dao.CustomerDaoImpl;
import com.masai.exceptions.BusException;
import com.masai.model.Customer;



public class BookTicketbNameusecase {

	public static void BookTicketbName(Customer customer) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(ConsoleColors.ORANGE + "Enter Bus Name" + ConsoleColors.RESET);
		String bName = sc.next();
		
		CustomerDao dao = new CustomerDaoImpl();
		try {
			System.out.println(ConsoleColors.ORANGE + "Enter no. of Tickets to Book" + ConsoleColors.RESET);
			int no = sc.nextInt();
			
			int cusId = customer.getCusId();
			String message = dao.bookTicket(bName, cusId, no);
			
			if (message.equals("Ticket Booked Successfully")) {
				System.out.println(ConsoleColors.GREEN_BACKGROUND + message + ConsoleColors.RESET);
			}
			else {
				System.out.println(ConsoleColors.RED_BACKGROUND + message + ConsoleColors.RESET);
			}
			
		} catch (BusException e) {
			System.out.println(ConsoleColors.RED_BACKGROUND + e.getMessage() + ConsoleColors.RESET);
		}
		catch (InputMismatchException e) {
			System.out.println(ConsoleColors.RED_BACKGROUND + "Invalid input" + ConsoleColors.RESET);
		}
		
	}
}
