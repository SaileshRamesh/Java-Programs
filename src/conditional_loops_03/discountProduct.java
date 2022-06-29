package conditional_loops_03;

import java.util.Scanner;

public class discountProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the product price");
		int price = sc.nextInt();
		System.out.println("Enter the discount");
		int discount = sc.nextInt();
		discount = price * (100 - discount)/100; //To get the price after deduction of discount
		System.out.println("Price after discount " +discount);
        sc.close();
	}

}
