import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
public class SwingTest2 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("SwingTest");
		frame.setBounds(200,200,400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton button = new JButton("TewtSwing");
		frame.getContentPane().add(button,BorderLayout.EAST);
		frame.setVisible(false);
	}

}
