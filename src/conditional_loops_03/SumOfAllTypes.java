package conditional_loops_03;

import java.util.Scanner;

public class SumOfAllTypes {

	/*Write a program to print the sum of negative numbers, 
	sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. 
	The list terminates when the user enters a zero.*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the numbers");
		int negSum =0, posEvenSum = 0, posOddSum = 0;
		Scanner sc = new Scanner(System.in);
		while(true){
			int num = sc.nextInt();
			if(num < 0)
				negSum += num;
			else if(num > 0){
				if(num % 2 == 0)
					posEvenSum += num;
				else
					posOddSum +=num;
			}
			if(num == 0)
				break;
		}
		System.out.println("Sum of negative numbers "+negSum);
		System.out.println("Sum of positive even numbers "+posEvenSum);
		System.out.println("Sum of positive odd numbers "+posOddSum);
		sc.close();
	}

}
