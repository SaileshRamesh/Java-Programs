package functions_04;

import java.util.Scanner;

public class EligibleToVote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 System.out.println("Enter the age");
     Scanner sc = new Scanner(System.in);
     int age = sc.nextInt();
     eligibility(age);
     sc.close();
	}
	static void eligibility(int age){
		if(age >= 18)
			System.out.println("Eligible to Vote");
		else
			System.out.println("Not Eligible to Vote");
	}

}
