package problems;

import java.util.Scanner;

public class Elephant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        
        sum = sum+ n/5;
        n = n%5;
        
        sum =sum+ n/4;
        n = n%4;
        
        sum = sum+n/3;
        n = n%3;
        
        sum = sum+n/2;
        n = n%2;
        
        sum = sum+n/1;
        n = n%1;
        
        System.out.println(sum); 
        sc.close();

	}

}
