package problems;

import java.util.Scanner;

public class Wrong_Subtraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long k = sc.nextLong();
		long i = 0, r = 0;

		for (i = 0; i < k; i++) {
			r = n % 10;

			if (r != 0) {
				n = n - 1;
			} else if (r == 0) {
				n = n / 10;
			}
		}

		System.out.println(n);
	}
}
