import java.util.Scanner;
import java.text.DecimalFormat;

public class AreaJ{
	public static void main (String [] args){

		Scanner scan= new Scanner(System.in);
		DecimalFormat df= new DecimalFormat("0.00");
		double radius, side, base, height, length, width;
		double areaC, areaS, areaT, areaR ;
		String shape="";
		char answer= 'y';
		
		
         
  
    do{ 
		System.out.println("Please enter shape:");
		shape= scan.nextLine();

			if(shape.equals ("circle") || shape.equals ("Circle") || shape.equals ("CIRCLE")){
					System.out.print("Enter Radius: ");
						radius= scan.nextDouble();
						areaC= (radius*radius)*Math.PI;
					System.out.println("Area of the Circle is " + df.format(areaC));
					System.out.println("Do you want to try again? [y/n]");
						answer= scan.next().charAt(0);

				}else if(shape.equals ("square") || shape.equals ("Square") || shape.equals ("SQUARE")){
					System.out.print("Enter side of Square: ");
						side= scan.nextDouble();
						areaS= side*side;
					System.out.println("Area of Square is: " + df.format(areaS));
					System.out.println("Do you want to try again? [y/n]");
						answer= scan.next().charAt(0);

				}else if(shape.equals ("triangle") || shape.equals ("Triangle") || shape.equals ("TRIANGLE")){
					System.out.print("Enter Base: ");
						base= scan.nextDouble();
					System.out.print("Enter Height: ");
						height= scan.nextDouble();
						areaT= (base*height)/2;
					System.out.println("Area of Triangle is: " + df.format(areaT));
					System.out.println("Do you want to try again? [y/n]");
						answer= scan.next().charAt(0);
	
				}else if(shape.equals ("rectangle") || shape.equals ("Rectangle") || shape.equals ("RECTANGLE") ){
					System.out.print("Enter Length: ");
						length= scan.nextDouble();
					System.out.print("Enter Width: ");
						width= scan.nextDouble();
						areaR= length*width;
					System.out.println("Area of Rectangle is: " + df.format(areaR));
					System.out.println("Do you want to try again? [y/n]");
						answer= scan.next().charAt(0);
				}
				
    }while(answer == 'y' || answer == 'Y');
	
				
   
	}
}