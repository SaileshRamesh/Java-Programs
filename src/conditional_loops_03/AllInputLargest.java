package conditional_loops_03;

import java.util.Scanner;

public class AllInputLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   System.out.println("Enter the numbers to find out the largest number, Enter 0 to exit");
       Scanner sc = new Scanner(System.in);
       int large = 0;
       while(true){
    	   int num = sc.nextInt();
    	   if (num > large)
    		   large = num;
    	   if(num == 0)
    		   break;
       }
       System.out.println("Largest number is "+large);
       sc.close();
	}

}
