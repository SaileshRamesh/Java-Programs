/*PROGRAM TO REVERSE A STRING*/

package problems;

import java.util.Scanner;

public class ReverseAString {

	static void Reverse(String s) {     //pass the parameter string
		char[] rev = s.toCharArray();   //Convert the string to character array
		for (int i = rev.length - 1; i >= 0; i--)   //Loop to go from n-1(last count)
			System.out.print(rev[i]);
	}
	//Driver method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);  //Scanner class to accept the input
		String s = sc.next();
		Reverse(s);    //Call the method 
		sc.close();
	}

}
