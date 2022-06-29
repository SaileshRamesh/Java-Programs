package functions_04;

import java.util.Arrays;

public class TwoSumBetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 1, 4, 45, 6, 10, -8 };
        int n = 16;
        if(checkSum(A, n)){
        	System.out.println("The sum exists");
        }
        else
        	System.out.println("The sum doesn't exists");
	}
	static Boolean checkSum(int[] A, int sum){
	   Arrays.sort(A); //This uses Tim Sort, the T.C O(nlogn)
	   int size = A.length;
	   int l = 0;
	   int r = size - 1;
	   while(l < r){
		   if(A[l] + A[r] == sum)
			   return true;
		   else if(A[l] + A[r] < sum)
			   l++;
		   else
			   r--;
	   }
	   return false;
	}
}
//Time Complexity = O(NLogN)
//Space Complexity = Uses Extra space, hence O(N)