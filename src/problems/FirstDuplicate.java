package problems;

import java.util.Scanner;

public class FirstDuplicate {

	static final int no_chars = 250; // Declare the size
	static char count[] = new char[no_chars]; // Declare an array

	// method to calculate the size of string passed
	static void getCount(String str) {
		for (int i = 0; i < str.length(); i++)
			count[str.charAt(i)]++;
	}

	// method to find index of the non first duplicate character
	static int firstDuplicate(String str) {
		getCount(str);
		int index = -1, i; // if condition is false return -1, so the value -1
		for (i = 0; i < str.length(); i++) {
			if (count[str.charAt(i)] == 1) {  //value of first occurence and frequency value as 1
				index = i;   //keep the value of i in index                 
				break;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int index = firstDuplicate(str);
		System.out.println(
				index == -1 ? "All characters repeating/empty" : "First non duplicate character " + str.charAt(index));
		sc.close();

	}

}
