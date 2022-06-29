package conditional_loops_03;

import java.util.Scanner;

public class EvenDaysOfMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int days = 0;
		int count = 0;
		System.out.println("Enter the month to check the days kunal can go out");
		Scanner sc = new Scanner(System.in);
		String month = sc.next();
		if(month.equalsIgnoreCase("febraury")){
			days = 28;
		}
		else if (month.equalsIgnoreCase("january") || month.equalsIgnoreCase("march") || month.equalsIgnoreCase("may") || month.equalsIgnoreCase("august") || month.equalsIgnoreCase("october") || month.equalsIgnoreCase("december")){
			days = 31;
		}
		else{ 
			days = 30;
		}
		for(int i = 1 ; i <= days ; i++){
			if (i % 2 == 0)
				count++;
		}
		System.out.println("The count of days Kunal can go out is "+count);
		sc.close();
	}

}
