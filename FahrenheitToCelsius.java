import java.util.Scanner;

public class FahrenheitToCelsius{
	public static void main(String [] args){
	
		double TemperatureF;
		double TemperatureC;
		Scanner in= new Scanner (System.in);
		
		System.out.print("Enter Temperature: ");
		TemperatureF= in.nextDouble();
		
		TemperatureC= (TemperatureF - 32)*5/9;
		System.out.print("Temperature in Celsius: " + TemperatureC +" Celsius");
	}
}