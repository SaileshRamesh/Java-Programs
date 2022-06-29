package problems;

import java.util.Scanner;

public class Tram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // No: of stops
		int a, b;
		int current = 0;
		int minCapacity = 0;
		while (n-- >= 1) {
			a = sc.nextInt();
			b = sc.nextInt();
			current = b + (current - a);
			if (current > minCapacity) {
				minCapacity = current;
			}
		}
		System.out.println(minCapacity);
		sc.close();
	}
}
