package problems;

import java.util.Scanner;

public class Watermelon4A {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner sc = new Scanner(System.in);
		int weight = sc.nextInt();
		
		if(weight > 2 && weight %2 == 0){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}

	}

}
