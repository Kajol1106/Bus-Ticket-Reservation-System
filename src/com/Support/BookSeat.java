package com.Support;

public class BookSeat extends Status {
	// z for no. of transactions.
    int z=0;

    int flag1=0;

    String name[][] = new String[30][10];
    int age[][] = new int[30][10];
    int b_code[] = new int[10];
    int no_pass[] = new int[10];
    long ph_no[] = new long[10];
    int senior[] = new int[10];
    int adult[] = new int[10];
    int minor[] = new int[10];
    float amt[] = new float[10];


    public void book()
    {
        senior[z] = 0;
        minor[z] = 0;
        disp();

        System.out.println("Enter Bus Code:");
        b_code[z] = sc.nextInt();
        if(b_code[z]<0 || b_code[z]>4)
        {
            System.out.println("Error: Invalid bus code...");
            System.out.println("Enter Bus Code:");
            b_code[z] = sc.nextInt();
        }

        System.out.println("Enter no. passangers:");
        no_pass[z] = sc.nextInt();
        if(no_pass[z]<1)
        {
            System.out.println("Error: No. of Passanger can't be '0'");
        }
        if(no_pass[z]>seats[b_code[z]])
        {
            System.out.println("We are sorry...We don't have enough seats for your transactions.");
            System.out.println("Please check other buses...");
            return;
        }
        //String name[] = new String[no_pass];
        //int age[] = new int[no_pass];

        System.out.println("Please provide a mobile number:");
        ph_no[z] = sc.nextLong();

        System.out.println("Please enter name(s) and age(s) for "+no_pass[z]+" person(s):");
        for (int i = 0; i < no_pass[z]; i++) {
            System.out.println("Enter name:");
            name[i][z] = sc.next();
            if (z!=0) {
                for ( i = 0; i < z; i++) {
                    for (int j = 0; j < 10; j++) {
                        if (name[i][z].equals(name[i][j])) {
                            flag1=1;
                        }
                    }
                }
                if (flag1==1) {
                    System.out.println("Error: Passanger name already exists...");
                    System.out.println("Try entering full passanger name");
                    System.out.println("Please enter passanger name:");
                    name[i][z] = sc.next();
                }
            }
            System.out.println("Enter age:");
            age[i][z] = sc.nextInt();
            if(age[i][z]>100 || age[i][z]<0)
            {
                System.out.println("Error: Not a valid age");
                System.out.println("Enter a valid age:");
                age[i][z] = sc.nextInt();
            }
            else if(age[i][z]>70)
            {
                senior[z]++;
            }
            else if(age[i][z]<12)
            {
                minor[z]++;
            }
        }

        System.out.println("Booking successeful !");

        seats[b_code[z]]=seats[b_code[z]]-no_pass[z];
    
        amt[z] = ((charge[b_code[z]])*(no_pass[z]))-((charge[b_code[z]]*15/100)*senior[z]);

        System.out.println("Please pay INR:"+amt[z]+"/-");
        if(senior[z]!=0)
        {
            System.out.println("[15 % discount applied for "+senior[z]+" senior(s)...]");
        }

        //adult[z] = no_pass[z]-(senior[z]+minor[z]);

        z++;
    }
}
