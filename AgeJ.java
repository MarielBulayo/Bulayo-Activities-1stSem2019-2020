import javax.swing.JOptionPane;;

public class AgeJ{
    public static void main(String [] args){
    
    int age;
    age= Integer.parseInt(JOptionPane.showInputDialog("Enter Your Age:"));
   
    
    if(age < 0 || age > 122){
      JOptionPane.showMessageDialog(null,"Invalid Input!");  
    }else if(age <= 3){
      JOptionPane.showMessageDialog(null,"Baby!");
    }else if(age <= 12){
      JOptionPane.showMessageDialog(null,"Child!");
    }else if(age <= 19){
      JOptionPane.showMessageDialog(null,"Teen!");
    }else if(age <= 32){
      JOptionPane.showMessageDialog(null,"Young Adult!");
    }else if(age <= 45){
      JOptionPane.showMessageDialog(null,"Middle Aged!");
    }else if(age <= 59){
      JOptionPane.showMessageDialog(null,"Adult!");
    }else if(age <= 122){
      JOptionPane.showMessageDialog(null,"Senior!");  
    }
    }
}