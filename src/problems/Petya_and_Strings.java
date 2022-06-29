package problems;

import java.io.IOException;
import java.util.Scanner;

public class Petya_and_Strings {
	public static void main(String args[]) throws IOException{
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		
		String aa = a.toLowerCase();
		String bb = b.toLowerCase();
	
		if(aa.compareTo(bb) == 0){
			System.out.println("0");
		}
		if(aa.compareTo(bb) > 0){
			System.out.println("1");
		}
		
		if(aa.compareTo(bb) < 0){
			System.out.println("-1");
		}
		sc.close();
	}
}
