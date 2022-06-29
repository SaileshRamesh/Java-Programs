package functions_04;

import java.util.Scanner;

public class MaximumMinimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 3 numbers to find maximum and minimum number");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		System.out.println("Max number is "+max(num1,num2,num3));
		System.out.println("Min number is "+min(num1,num2,num3));
		sc.close();
	}
	static int max(int num1, int num2, int num3){
		int max = num1;
		if(num2 > max){
		    max = num2;
		}
		if(num3 > max){
			max = num3;
		}
		return max;	
	}
	static int min(int num1, int num2, int num3){
		int min = num1;
		if(num2 < min){
		    min = num2;
		}
		if(num3 < min){
			min = num3;
		}
		return min;	
	}

}
