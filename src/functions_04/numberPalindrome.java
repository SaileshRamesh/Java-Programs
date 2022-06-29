package functions_04;

public class numberPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkPalindrome(121));
	}
    static Boolean checkPalindrome(int num){
        int rev = 0;
    	int orgnum = num;
    	while(num != 0){
    	 int rem = num % 10;
    	 rev = rev * 10 + rem;
    	 num /= 10;
    	}
    	if(orgnum == rev)
    		return true;
    	else
    		return false;
    }
}
