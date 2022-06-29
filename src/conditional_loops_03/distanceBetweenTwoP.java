package conditional_loops_03;

public class distanceBetweenTwoP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x1,x2,y1,y2;
	    double dis;
	    x1=1;y1=1;x2=4;y2=4;
	    dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));	 	    
        System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+dis);
	}

}
//To calculate the power in java .. use Math.pow(a,b) a is the base, b is the power
//a = 2
//b = 3
//System.out.println(Math.pow(a,b))
//Calculate Depreciation of Value is just minus the percentage to the total number
//avg=totalruns/(innings-notout); to calculate batting average
//cgpa = sum / number;
//double principle = 10000, rate = 10.25, time = 5;

/* Calculate compound interest */
//double CI = principle * (Math.pow((1 + rate / 100), time));
