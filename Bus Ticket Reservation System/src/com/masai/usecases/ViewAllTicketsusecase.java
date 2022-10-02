package com.masai.usecases;

import com.masai.dao.AdminDao;
import com.masai.dao.AdminDaoImpl;

public class ViewAllTicketsusecase {

public static void viewAllTicket() {
		
		AdminDao dao = new AdminDaoImpl();
		dao.viewAllTickets();
	}
}
