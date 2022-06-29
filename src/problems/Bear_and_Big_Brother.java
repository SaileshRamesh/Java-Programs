package problems;

import java.util.Scanner;

public class Bear_and_Big_Brother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int cnt = 0;
		while (!(a > b)) {
			a = a * 3;
			b = b * 2;
			cnt++;
		}
		System.out.println(cnt);
	}
}
