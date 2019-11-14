import java.util.Scanner;
import java.text.DecimalFormat;

public class Shape{
	public static void main (String [] args){

		Scanner scan= new Scanner(System.in);
		DecimalFormat df= new DecimalFormat("0.00");
		double radius, side, base, height, length, width;
		double areaC, areaS, areaT, areaR ;
		String shape="";
    char answer= 'y';
    String c= Circle;
    String s= Square;
    String t= Triangle;
    string r= Rectangle;
     
  
    do{  
    System.out.print("Please enter shape:");
		shape= scan.nextLine();

   
				if(shape.equals ("circle")){
					System.out.print("Enter Radius: ");
						radius= scan.nextInt();
						areaC= (radius*radius)*Math.PI;
					System.out.println("Area of the Circle is " + df.format(areaC));
					System.out.println("Do you want to try again? [y/n]");
            answer= scan.next().charAt(0);

				}else if(shape.equals ("square")){
					System.out.print("Enter side of Square: ");
						side= scan.nextInt();
						areaS= side*side;
					System.out.println("Area of Square is: " + df.format(areaS));
					System.out.println("Do you want to try again? [y/n]");
            answer= scan.next().charAt(0);

				}else if(shape.equals ("triangle")){
          System.out.print("Enter Base: ");
            base= scan.nextInt();
          System.out.print("Enter Height: ");
            height= scan.nextInt();
            areaT= (base*height)/2;
          System.out.println("Area of Triangle is: " + df.format(areaT));
          System.out.println("Do you want to try again? [y/n]");
            answer= scan.next().charAt(0);

        }else if(shape.equals ("rectangle")){
          System.out.print("Enter Length: ");
            length= scan.nextInt();
          System.out.print("Enter Width: ");
            width= scan.nextInt();
            areaR= length*width;
          System.out.println("Area of Rectangle is: " + df.format(areaR));
          System.out.println("Do you want to try again? [y/n]");
            answer= scan.next().charAt(0);
       }
    }while(answer == 'y' || answer == 'Y');
   
	}
}