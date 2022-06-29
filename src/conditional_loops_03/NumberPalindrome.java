package conditional_loops_03;

import java.util.Scanner;

public class NumberPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check if it is palindrome");
		int n = sc.nextInt();
		int originalNum = n;
		sc.close();
		int revNumber = 0;
		while(n != 0){
			int rem = n % 10;
			revNumber = revNumber * 10 + rem;
			n /= 10;
		}
		if(originalNum == revNumber)
			System.out.println("Palindrome Number");
		else
			System.out.println("Not a Palindrome Number");
	}

}
