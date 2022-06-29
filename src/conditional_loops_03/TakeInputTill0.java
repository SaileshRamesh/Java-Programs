package conditional_loops_03;

import java.util.Scanner;

public class TakeInputTill0 {

	public static void main(String[] args) {
		System.out.println("Enter the numbers to find the sum , Enter 0 to exit and get sum");
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while (true) {
			int num = sc.nextInt();
			sum += num;
			if (num == 0)
				break;
		}
		System.out.println("The sum of the all the inputs is " + sum);
		sc.close();
	}

}
