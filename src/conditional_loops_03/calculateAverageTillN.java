package conditional_loops_03;

import java.util.Scanner;

public class calculateAverageTillN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number N till where we want to find average");
		Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    int sum = 0;
	    int average = 0;
	    int count = 1;
	    while(count <= N){
	    	int num = sc.nextInt();
	    	sum += num;
	    	count++;
	    }
        average = sum/N;
        System.out.println(average);
        sc.close();
	}

}
