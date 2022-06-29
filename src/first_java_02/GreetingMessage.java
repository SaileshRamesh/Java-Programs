package first_java_02;

import java.util.Scanner;

public class GreetingMessage {
	/**
	 * @author Sailesh Ramesh
	 *
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name");
		String name = sc.nextLine();
		if (name.equals("Sailesh"))
			System.out.println("Welcome Sai");
		else
			System.out.println("Your not welcome Stranger");
		sc.close();
	}

}
