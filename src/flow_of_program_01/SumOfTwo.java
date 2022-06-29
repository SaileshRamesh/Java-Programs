package flow_of_program_01;

import java.util.Scanner;

public class SumOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers for the sum");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("The sum of "+num1+" & "+num2+" is " +(num1+num2));
        sc.close();
	}

}
