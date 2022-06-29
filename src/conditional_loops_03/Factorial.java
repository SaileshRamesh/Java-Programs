package conditional_loops_03;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for which you want find factorial");
		int num = sc.nextInt();
		int fact = 1;
		for(int i = 1 ; i <= num ; i++){
			fact *= i;
		}
		System.out.println("The factorial is "+fact);
		sc.close();
	}
}
