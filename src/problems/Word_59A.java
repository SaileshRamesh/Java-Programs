package problems;

import java.util.Scanner;

public class Word_59A {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int upper = 0, lower = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'A' && ch <= 'Z')
				upper++;
			if (ch >= 'a' && ch <= 'z')
				lower++;
		}
		if(upper>lower){
			System.out.println(s.toUpperCase());
		}
		else{
			System.out.println(s.toLowerCase());
		}
		sc.close();
	}
}
