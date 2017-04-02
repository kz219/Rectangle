import javax.swing.JOptionPane;

public class Month {

	public enum SelectMonth {
		December, January, February, March, April, May, June, July, August, September, October, November
	{

	public static void main(String[] args) {
		SelectMonth[] choices = { SelectMonth.December, SelectMonth.January, SelectMonth.February, SelectMonth.March, SelectMonth.April, SelectMonth.May, SelectMonth.June, SelectMonth.July, SelectMonth.August, SelectMonth.September, SelectMonth.October, SelectMonth.November };
		SelectMonth select = (SelectMonth) JOptionPane.showInputDialog(null, "Select a month.", "Select Month", JOptionPane.INFORMATION_MESSAGE, null, choices, choices[3]);

		while(select!=null) {
			switch(select) {
			case December:
				JOptionPane.showMessageDialog(null, "Do you want to build a snowman?");
				break;
			case January:
				JOptionPane.showMessageDialog(null, "Do you want to build a snowman?");
				break;
			case February:
				JOptionPane.showMessageDialog(null, "Do you want to build a snowman?");
				break;
			case March:
				JOptionPane.showMessageDialog(null, "Happy Spring days!");
				break;
			case April:
				JOptionPane.showMessageDialog(null, "Happy Spring days!");
				break;
			case May:
				JOptionPane.showMessageDialog(null, "Happy Spring days!");
				break;
			case June:
				JOptionPane.showMessageDialog(null, "It's summer time!");
				break;
			case July:
				JOptionPane.showMessageDialog(null, "It's summer time!");
				break;
			case August:
				JOptionPane.showMessageDialog(null, "It's summer time!");
				break;
			case September:
				JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
				break;
			case October:
				JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
				break;
			case November:
				JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
				break;
			}
			select = (SelectMonth) JOptionPane.showInputDialog(null, "Select a month.", "Select Month", JOptionPane.INFORMATION_MESSAGE, null, choices, choices[3]);

		}
		JOptionPane.showMessageDialog(null, "Goodbye!");
	}
}

