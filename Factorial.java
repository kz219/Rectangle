import javax.swing.*;

public class Factorial {
	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
		int count = n;
		if(count==0) {
			n= 1;
			JOptionPane.showMessageDialog(null, n);
		} else if (count<0) {
			JOptionPane.showMessageDialog(null, "Input cannot be a negative number!");
		} else {
			while(count>1) {
				n*=(count-1);
				count--;
			}
				JOptionPane.showMessageDialog(null, n);
		}
	}
}



