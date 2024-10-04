import javax.swing.JOptionPane;

public class FirstGUI {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "Hello " +name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter you age"));
		JOptionPane.showMessageDialog(null, "You are "+age+"years old");
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter you age"));
		JOptionPane.showMessageDialog(null, "You are "+height);
	}

}
