package functions_04;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
        if(isEven(num)){
        	System.out.println("The number is even");
        }
        else
        	System.out.println("The number is odd");
        sc.close();
	}
    static boolean isEven(int num){
    	if(num % 2 == 0)
    		return true;
    	else 
    		return false;
    }
}
/*Bitwise OR operator we can find even or odd
represent binary form 8421 for ex: 15 - 1111
if the original number is even then it will be greater than the original number
after the XOR operation
condition
Condition check
        // if n|1 if greater than n then this number is even
        if ((n | 1) > n) {
 
            // Print statement
            System.out.println("Number is Even");
Condition Check
        // Bitwise AND of any odd number by 1 gives 1
        if ((n & 1) == 1) {
 
            // Print statement
            System.out.println("Number is Odd");
        }
 Condition Check
 if (a != 0) {
            if (Integer.toBinaryString(a).endsWith("0")) {
                return "Even";
            }
            else {
                return "Odd";
            }
        }
*/









