package flow_of_program_01;

import java.util.Scanner;

public class multiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number for which you want the multiplication table");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i <= 10 ; i++){
			System.out.println(n+" * "+i+" = "+(n*i));
		}
		sc.close();
	}
}
