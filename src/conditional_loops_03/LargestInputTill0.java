package conditional_loops_03;

import java.util.Scanner;

public class LargestInputTill0 {

	public static void main(String[] args) {
		System.out.println("Enter the numbers to find the largest among them, enter 0 to exit");
		Scanner sc = new Scanner(System.in);
		int large = 0;
		while(true){
			int num = sc.nextInt();
			if(num > large)
				large = num;
			if(num == 0)
				break;
		}
		System.out.println("The largest number among the numbers is "+large);
        sc.close();
	}

}
