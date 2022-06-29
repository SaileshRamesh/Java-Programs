package conditional_loops_03;

import java.util.Scanner;

public class FibonacciSeries {
	// fibonacci series is something series that it sum of previous two numbers,
	// this is to return the fibonnaci number
	public static void main(String[] args) {
		System.out.println("Enter the Number for which you want the fibonnaci number?");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int num1 = 0, num2 = 1, count = 2;
		while (count <= n) {
			int temp = num2;
			num2 = num1 + num2;
			num1 = temp;
			count++;
		}
		System.out.println(num2);
	}
}
/*
 * //To generate fibonacci series this is the code.. Scanner sc = new
 * Scanner(System.in);
 * System.out.println("Enter the limit for fibonacci series"); int limit =
 * sc.nextInt(); fibonacci(limit); sc.close();
 * 
 * } static void fibonacci(final int limit){ int num1 = 0, num2 = 1, num3 = 0,
 * i; System.out.print(num1+" "+num2); for(i = 2 ; i <= limit ; i++){ num3 =
 * num1 + num2; System.out.print(" " + num3); num1 = num2; num2 = num3; } }
 */
