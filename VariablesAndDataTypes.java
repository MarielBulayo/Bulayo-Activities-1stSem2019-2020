public class VariablesAndDataTypes{
    public static void main (String [] args){
    String Baguio= "The temperature in Baguio City has warmed through out the years.";
    char a= 'A';
    float deg1= 16.0f;
    double deg2= 23.5;
    byte hours= 24;
    int days= 7;
    short weeks= 4;
    long months= 12;
    boolean tf= true;
    
    if (tf) {
       System.out.print(Baguio + "\n \t" + a + " recent news article stated that the City has been averaging " + deg1 
                        + " degrgees celcius at dawn and " + deg2 + " at noon." + "\n \t \t"+ "Regardless, lowlanders still feel cold " 
                        + hours + " hours a day, " + days + " days a week, " + weeks + " weeks per month, " + months + " months each year.");
       
    }else{
      System.out.print("The boolean was changed to False value");
    }
   
    }
}