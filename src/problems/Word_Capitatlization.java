package problems;

import java.util.Scanner;

public class Word_Capitatlization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		String s = sc.next();
		s.toCharArray();
		System.out.println(s.substring(0,1).toUpperCase()+s.substring(1));
		sc.close();
	}

}
