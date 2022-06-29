package functions_04;
/*Notes
 * 2 is the only even prime number
 * All even numbers are not prime, because they are divisible by 2
 * 1 is neither prime nor composite
 */

public class primeNaive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        if(isPrime(7)){
        	System.out.println("Prime");
        }
        else 
        	System.out.println("Not Prime");
	}

	static boolean isPrime(int n) {
		if (n == 1)
			return false;
		for (int i = 2; i < n; i++){
			if (n % i == 0)
				return false;
		}
		return true;
	}
}      
//T.C = O(N)

/*More optimization all the factors are sum of smaller and larger number
 We concentrate on smaller number and take the factors only till sqrt of the number
 for(int i = 2 ; i*i = n; i++)
  if(n % i == 0)
  T.C = O(srt(N))
 */


