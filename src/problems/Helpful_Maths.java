package problems;

import java.util.Arrays;
import java.util.Scanner;

public class Helpful_Maths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String first = sc.next().replace("+", "");
		char arr[] = first.toCharArray();
		Arrays.sort(arr);
        
	 	for (int i = 0; i < arr.length-1; i++) {
			System.out.print(arr[i] + "+");
	    }
	 	System.out.print(arr[arr.length-1]);
	 	sc.close();
   }
}