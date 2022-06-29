package first_java_02;

import java.util.Scanner;

public class SimpleInterestCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Principal");
		int principal = sc.nextInt();
		System.out.println("Enter the Time");
		int time = sc.nextInt();
		System.out.println("Enter the Rate");
		int rate = sc.nextInt();
		int simpleInterest = (principal * time * rate) / 100;
		System.out.println("This is your simpleInterest: " + simpleInterest);
		sc.close();
	}

}
