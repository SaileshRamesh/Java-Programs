package first_java_02;

import java.util.Scanner;

public class RupeeToUsd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter your money in ruppee");
       float money = sc.nextFloat();
       float dollar = money / 72;
       System.out.println("Your amount in dollars is " + dollar);
       sc.close();
	}

}
