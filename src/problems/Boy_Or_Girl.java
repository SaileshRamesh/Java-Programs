package problems;

import java.util.Scanner;

public class Boy_Or_Girl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		long ss = s.chars().distinct().count();
		if (ss % 2 == 0) {
			System.out.println("CHAT WITH HER!");
		} else {
			System.out.println("IGNORE HIM!");
		}
		sc.close();
	}

}
