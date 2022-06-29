package conditional_loops_03;

public class CountOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n  = 457585125;
		long count = 0, rem;
		while(n != 0){
			rem = n % 10; //Last digit of the number
		    if(rem == 5)
		    	count++;
		    n /= 10;
		}
		System.out.println("The count is "+count);
	}

}
