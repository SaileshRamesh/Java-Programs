package conditional_loops_03;

public class ElectricBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // declare and initialize variable units  
        int units = 380;  
        // variable to calculate electricity bill to pay  
        double billToPay = 0;  
        // check whether units are less than 100  
        if(units < 100)  
        {  
            billToPay = units * 1.20;  
        }  
        // check whether the units are less than 300  
        else if(units < 300){  
            billToPay = 100 * 1.20 + (units - 100) * 2;  
        }  
        // check whether the units are greater than 300  
        else if(units > 300)  
        {  
            billToPay = 100 * 1.20 + 200 * 2 + (units - 300) * 3;  
        }  
        System.out.println("The electricity bill for " +units+ " is : " + billToPay);   
    }   

}

