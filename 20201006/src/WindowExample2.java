import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class WindowExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Hello Program");
		frame.setLocation(500, 400);
		frame.setPreferredSize(new Dimension(300,200));
		Container contentPane = frame.getContentPane();
		JTextField text = new JTextField();
		JButton button = new JButton("Ȯ��");
		JLabel label = new JLabel("Hello");
		contentPane.add(text,BorderLayout.CENTER);
		contentPane.add(button,BorderLayout.EAST);
		contentPane.add(label,BorderLayout.SOUTH);
		ActionListener listener = 
				new ConfirmButtonActionListener(text,label);
		button.addActionListener(listener);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

}
