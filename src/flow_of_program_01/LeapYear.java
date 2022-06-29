package flow_of_program_01;

import java.util.Scanner;

/*A year is a leap year if −

1. It is evenly divisible by 100
2. If it is divisible by 100, then it should also be divisible by 400
3. Except this, all other years evenly divisible by 4 are leap years.*/

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
	      System.out.println("Enter an Year :: ");
	      Scanner sc = new Scanner(System.in);
	      year = sc.nextInt();

	      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
	         System.out.println("Specified year is a leap year");
	      else
	         System.out.println("Specified year is not a leap year");
	      sc.close();

	}

}
