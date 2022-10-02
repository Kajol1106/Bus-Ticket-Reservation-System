package com.masai.usecases;

import com.masai.dao.CustomerDao;
import com.masai.dao.CustomerDaoImpl;
import com.masai.model.Customer;

public class ViewTicketusecase {

	public static void viewTicket(Customer customer) {
		
		CustomerDao dao = new CustomerDaoImpl();
		
		dao.viewTicket(customer.getCusId());
	}
}
