package com.Main;

import java.util.Scanner;

import com.Support.*;


public class BusTicketReservation {
	public static void main(String[] args) {

        int ch,x=1;

        Scanner sc = new Scanner(System.in);

        Menu m = new Menu();
        Charge b = new Charge();
       
        do {
           m.getMenu();
           System.out.println("Enter choice:");
           ch = sc.nextInt();
           switch (ch) {
               case 1:
                   b.disp();
                   break;
               case 2:
                   b.book();    
                   break;
               case 3:
                   //System.out.println("Service under developement...");
                   b.getBill();
                   break;
               case 4:
                   System.out.println("Thank you for interacting with Bus Ticket Reservation System...");
                   System.exit(0);
               default:
                   System.out.println("Wrong choice:");
                   break;
           }
           System.out.println("Do you want to continue? [0/1]...");
           x=sc.nextInt();
           if(x!=0 && x!=1)
           {
               System.out.println("Invalid input...");
           }
        } while (x!=0);
        System.out.println("Thank you for interacting with Bus Ticket Reservation System...");
   }
}
