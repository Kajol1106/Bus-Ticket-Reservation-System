package com.Support;

public class Charge extends BookSeat {
	public void getBill()
    {
        int flag=0;
        String ename;
        System.out.println("Enter passanger name to get details:");
        ename = sc.next();
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 10; j++) {
                if (ename.equals(name[i][j])) {
                    System.out.println("Journy:- "+location[b_code[i]]);
                    System.out.println("Name of passangers      Age");
                    System.out.println("---------------------------");
                    for ( i = 0; i < no_pass[j]; i++) {
                        System.out.println(name[i][j]+"\t\t\t"+age[i][j]);
                    }
                    System.out.println("---------------------------");
                    System.out.println("Contact no: "+ph_no[j]);
                    System.out.println("---------------------------");
                    System.out.println("No. of Minors:"+minor[j]);
                    System.out.println("No. of Seniors:"+senior[j]);
                    System.out.println("---------------------------");
                    System.out.println("Amount paid:"+amt[j]+" /- INR.");
                    System.out.println("---------------------------");
                    System.out.println("Wish you a happy journey!!!");
                    System.out.println("---------------------------");
                }
                flag = 1;

            }
        }
        if (flag==0) {
            System.out.println("Passenger name not found !!");
        }
    }
}
