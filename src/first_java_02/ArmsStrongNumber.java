package first_java_02;

import java.util.Scanner;

public class ArmsStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first interval");
		int num1 = sc.nextInt();
		System.out.println("Enter the second interval");
		int num2 = sc.nextInt();
		sc.close();
		
		for(int i = num1 ; i <= num2 ; i++){
	    int check, rem, sum = 0;
		 check = i;
			while(check != 0){
				rem = check % 10;
				sum = sum + (rem * rem * rem);
				check = check /10;
			}
			if(sum == i)
				System.out.println(i +" is Amstrong number");
		}

	}

}
