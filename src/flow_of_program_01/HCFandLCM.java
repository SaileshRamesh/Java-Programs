package flow_of_program_01;

public class HCFandLCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hcf=0;

		int n1 =12;

		int n2 = 16;

		for(int i = 1; i <= n1 || i <= n2; i++) {

		if( n1%i == 0 && n2%i == 0 )

		hcf = i;

		}

		System.out.println("HCF of given two numbers is "+hcf);

		int lcm = (n1*n2)/hcf;

		System.out.println("LCM of given two numbers is "+lcm);

	}

}
