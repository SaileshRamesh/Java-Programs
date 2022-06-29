package functions_04;

import java.util.Arrays;

public class SeiveOfErathosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		seive(10);
	}
	static void seive(int n){
		Boolean[] isPrime = new Boolean[n+1];
		Arrays.fill(isPrime, true);
		for(int i = 2; i*i <= n ; i++){
			//System.out.println(i+" "); shorter code
			if(isPrime[i]){
				for(int j = i*i ; j <= n ; j = j+i){  //naive will be int j = 2*i
					isPrime[j] = false;
				}
			}
		}
		for(int i = 2 ; i <=n ; i++){
			if(isPrime[i])
			System.out.println(i+" ");
		}
	}
}

//Time complexity = O(NloglogN) == very small almost equal to linear
