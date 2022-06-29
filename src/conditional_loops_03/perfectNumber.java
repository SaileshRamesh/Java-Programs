package conditional_loops_03;

import java.util.Scanner;
/*A number whose sum of factors (excluding the number itself) is equal to the number is called a perfect number. 
In other words, if the sum of positive divisors (excluding the number itself) of a number equals the number itself 
is called a perfect number.*/

public class perfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= num/2; i++) {
			if (num % i == 0)
				sum += i;
		}
		if (sum == num)
			System.out.println("Perfect Number");
		else
			System.out.println("Not Perfect Number");
		sc.close();
	}
}
