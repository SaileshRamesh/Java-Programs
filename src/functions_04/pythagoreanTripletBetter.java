package functions_04;

import java.util.Arrays;

public class pythagoreanTripletBetter {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = { 3, 1, 4, 6, 5 };
        if(TripletBetter(arr)){
        	System.out.println("Triplet exists");
        }
        else
        	System.out.println("Triplet doesn't exist");
	}
	static Boolean TripletBetter(int[] arr){
		//For squaring the numbers we are using this loop
		int n = arr.length;
		for(int i = 0 ; i < n ; i++){
			arr[i] = arr[i] * arr[i];
		}
		Arrays.sort(arr);
		for(int i = n - 1; i >= 2 ; i --){
			int l = 0;
			int r = i - 1;
			while(l < r){
			if(arr[l] + arr[r] == arr[i])
				return true;
			if(arr[l] + arr[r] < arr[i])
				l++;
			else 
				r--;
			}
		}
		return false;
	}
}
//Time Complexity = O(N.pow(2)), better than naive approach
//HashMap approach pending, but still the algorithm gives the same TC so we can see that later
