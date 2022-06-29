package functions_04;

import java.util.Scanner;

public class pythagoreanTripletNaive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = in.nextInt();
        System.out.println("Enter the array to find if it has triplet");
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
        	arr[i] = in.nextInt();
        }
        in.close();
        System.out.println(isTriplet(arr,n));
	}
    static Boolean isTriplet(int[] arr, int n){
      	for(int i = 0 ; i < n ; i++){
      		for(int j = i + 1 ; j < n ; j++){
      			for(int k = j + 1 ; k < n ; k++){
      				int x = arr[i] * arr[i]; int y = arr[j] * arr[j]; int z = arr[k] * arr[k];
      				if(x == y + z || y == x + z || z == x + y)
      					return true;
      			}
      		}
      	}
      	return false;
    }
}

//Time Complexity = O(N.pow(3))
