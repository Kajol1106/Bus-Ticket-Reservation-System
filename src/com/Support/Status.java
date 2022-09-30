package com.Support;

import java.util.Scanner;

public class Status {
	String location[] = {"Pune-Mumbai","Pune-Goa","Goa-Mumbai","Mumbai-Pune","Nashik-Pune"};
    int charge[] = {450,1200,960,460,550};
    int seats[] = {50,20,30,40,20};
    double arrival[] = {11.30,6.45,14.30,16.00,22.00};
    double departure[] = {12.00,23.00,2.00,17.45,1.00};

    Scanner sc = new Scanner(System.in);

    public void disp()
    {
        System.out.println("Bus Number \tSource-Destination\tArrival Time\tDeparture Time\tTicket Fare\tAvailable Seats");
        System.out.println("-----------------------------------------------------------------------------------------------");

        for (int i = 0; i < 5; i++) {
            System.out.println(i+"\t\t"+location[i]+"\t\t"+arrival[i]+"\t\t"+departure[i]+"\t\t"+charge[i]+"\t\t"+seats[i]);
        }
        
        System.out.println("-----------------------------------------------------------------------------------------------");

    }
    
//    public static void main(String[] args) {
//    	Status s = new Status();
//    	s.disp();
//    }
}
