package flow_of_program_01;

import java.util.Scanner;

public class sumOfNumbersUntilX {
	static int findSum(int n) //taking this function because it is the most efficient way
	{
	    return n * (n + 1) / 2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, sum = 0;
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			 num = sc.nextInt();
			 sum += num;
		}
		System.out.println(sum);
		sc.close();
	}

}
//Time COmplexity of this solution is O(N).. we are traversing through the entire N
//We can do this in order of 1 by using the simple formula to find the sum of N numbers by N*(N+1)/2
