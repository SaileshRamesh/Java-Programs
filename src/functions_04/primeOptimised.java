package functions_04;

public class primeOptimised {
/*Notes
 * We are giving check points for our number to decrease the number of steps required to check if prime
 * first one is checking for 2 and 3 and we get the answer
 * 4 is divisible by 2 so we skipping it
 * from 5 we check and 5+2 = 7 (look at the code to understand better)
 * Then we increment by 6 to get the answer
 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(isPrime(101))
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}
	static Boolean isPrime(int n){
		if(n == 1) return false;
		if(n == 2 || n == 3) return true;
		if(n % 2 == 0 || n % 3 == 0) return false;
		for(int i = 5; i * i <= n ; i+=6){
			if(n % i == 0)
				return false;
		}
		return true;
	}

}

//Time Complexity = O(sqrt(n))