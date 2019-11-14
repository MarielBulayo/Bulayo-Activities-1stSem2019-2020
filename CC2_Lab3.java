public class CC2_Lab3{
  public static void main(String [] args){
    char letter1= 'M';
    char letter2= 'A';
    char letter3= 'R';
    char letter4= '!';
    
    int code1= letter1;
    int code2= letter2;
    int code3= letter3;
    int code4= letter4;
    
    int sum= letter1 + letter2 + letter3 + letter4;
    int product= letter1 * letter2 * letter3 * letter4;
    int average= (letter1 + letter2 + letter3)/3;
    int r= product % average;
    
    System.out.println(letter1 +" - " + code1);
    System.out.println(letter2 +" - " + code2);
    System.out.println(letter3 +" - " + code3);
    System.out.println(letter4 +" - " + code4 + "\n"+ letter1 
                        + letter2  + letter3 + letter4);
    
    System.out.println("sum: " + sum);
    System.out.println("product: "+ product);
    System.out.println("average: " + average);
    System.out.println("remainder: " + r);
  }
}