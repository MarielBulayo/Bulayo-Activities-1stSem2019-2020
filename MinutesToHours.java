import javax.swing.JOptionPane;

public class MinutesToHours{
	public static void main(String [] args){
	
		int min;
		
		min= Integer.parseInt(JOptionPane.showInputDialog("Enter Minutes: "));
		
		int hours= min/60; 
		int hm= min%60;
		
		JOptionPane.showMessageDialog(null,"there are" + hours + " hours and " + hm + " minutes. ");
	}
}