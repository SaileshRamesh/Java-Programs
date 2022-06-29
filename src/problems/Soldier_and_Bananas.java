package problems;

import java.util.Scanner;

public class Soldier_and_Bananas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		int w = sc.nextInt();
		int sum = (((w * (w + 1)) * k) / 2);
		if (sum - n < 0) {
			System.out.println("0");
		} else {
			System.out.println(sum - n);
			sc.close();
		}
	}

}
