package problems;

import java.io.IOException;
import java.util.Scanner;

public class Domino_piling {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m =sc.nextInt();
        int n =sc.nextInt();     
        System.out.println((int)m*n/2);
	}

}
