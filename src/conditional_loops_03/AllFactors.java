package conditional_loops_03;

import java.util.Scanner;

public class AllFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for which you want the factors");
		int num = sc.nextInt();
		for(int i = 1 ; i <= num ; i++){
			if(num % i == 0){
				System.out.print(i+" ");
			}
		}
		sc.close();

	}

}
