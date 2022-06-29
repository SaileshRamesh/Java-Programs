package conditional_loops_03;

import java.util.Scanner;

public class CheckCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character to check the case?");
		char c = sc.next().trim().charAt(0); // trim() removes the whitespaces,
												// chartAt gives the char at
												// that place
		sc.close();
		if (c >= 'a' && c <= 'z')
			System.out.println("LowerCase Character");
		else
			System.out.println("UpperCase Character");
	}

}
