package first_java_02;

import java.util.Scanner;

/**
 * @author Sailesh Ramesh
 *
 */
public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check odd or even?");
		int num = sc.nextInt();
		if (num % 2 == 0)
			System.out.println("The number is even");
		else
			System.out.println("The number is odd");
		sc.close();
	}

}
