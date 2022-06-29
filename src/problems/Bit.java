package problems;

import java.util.Scanner;

public class Bit {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int line = sc.nextInt();
		int X = 0;
		for(int i=0; i<=line; i++){
			String val = sc.nextLine();
			
			if(val.equals("++X") || val.equals("X++")){
				X++;
			}
			if(val.equals("--X") || val.equals("X--")){
				X--;
			}
		}
		System.out.println(X);
	}

}
