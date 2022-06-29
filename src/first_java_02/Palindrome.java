package first_java_02;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
		String str = sc.next();
		if(isPalindrome(str.toLowerCase())){
			System.out.println("This word is palindrome");
		}
		else {
            System.out.println("This word is not palindrome");
		}
		sc.close();
	}
	
	static boolean isPalindrome(final String str){
		int i = 0 , j = str.length() - 1;
		while(i < j){
			if (str.charAt(i) != str.charAt(j))
				return false;
				i++;
			    j--;
		}
		return true;
	}

}
