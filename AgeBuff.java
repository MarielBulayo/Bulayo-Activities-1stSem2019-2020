import java.io.*;

public class AgeBuff{
    public static void main(String [] args)throws IOException{
    
    BufferedReader b= new BufferedReader (new InputStreamReader (System.in));
   int age;
   System.out.print("Enter Age:");
    age= Integer.parseInt(b.readLine());
    
    if(age < 0 || age > 122){
      System.out.println("Invalid Input!");
    }else if(age <= 3){
      System.out.println("Baby!");
    }else if(age <= 12){
      System.out.println("Child!");
    }else if(age <= 19){
       System.out.println("Teen!");
    }else if(age <= 32){
      System.out.println("Young Adult!");
    }else if(age <= 45){
      System.out.println("Middle Aged!");
    }else if(age <= 59){
      System.out.println("Adult!");
    }else if(age <= 122){
      System.out.println("Senior!");
    }
    }
}