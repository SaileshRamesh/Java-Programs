package functions_04;

public class factorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(factorial(4));
	}
	static int factorial(int n){
		int fact = 1;
		for(int i = 1 ; i <= n ; i++){
			fact *= i;
		}
		return fact;	
	}

}
