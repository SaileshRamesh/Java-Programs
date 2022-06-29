package conditional_loops_03;

import java.util.Scanner;

public class GeometryProblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter if you want to calculate area, perimeter");
		Scanner sc = new Scanner(System.in);
		String shape = sc.next();
		switch(shape.toLowerCase()){
		     case "area":
		       System.out.println("Enter Circle or Triangle to find the area");
		       String areaShape = sc.next();
		       switch(areaShape.toLowerCase()){
		          case "circle":
		        	  System.out.println("Enter the radius of circle");
		        	  int radius = sc.nextInt();
		        	  System.out.println("Area of the circle is "+ (3.14 * radius * radius));
		        	  break;
		          case "triangle":
		        	  System.out.println("Enter the base of triangle");
		        	  int base = sc.nextInt();
		        	  System.out.println("Enter the height of triangle");
		        	  int height = sc.nextInt();
		        	  System.out.println("Area of the circle is "+ (0.5 * base * height));
		        	  break;
		          default:
		        	  System.out.println("Enter valid input");
		        	  break;
		       }
		     break;
		     case "perimeter":
		    	 System.out.println("Enter the Circle or Triangle to find perimeter");
		    	 String perimeterShape = sc.next();
		    	 switch(perimeterShape.toLowerCase()){
		          case "circle":
		        	  System.out.println("Enter the radius of circle");
		        	  int radius = sc.nextInt();
		        	  System.out.println("Area of the circle is "+ (3.14 * 2 * radius));
		        	  break;
		          case "triangle":
		        	  System.out.println("Enter the side of triangle");
		        	  int side = sc.nextInt();
		        	  System.out.println("Area of the triangle is "+ (3 * side));
		        	  break;
		          default:
		        	  System.out.println("Enter valid input");
		        	  break;
		       }
		   break;
		   default:
			   System.out.println("Enter valid input");
			   sc.close();
			   break;	 
		}

	}

}
