import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class SungJukExample {
	public static void main(String[] args) {
		JFrame frame = new JFrame("���� ���α׷�");
		frame.setPreferredSize(new Dimension(500, 300));
		frame.setLocation(500, 400);
		Container contenPane = frame.getContentPane();
		String colNames[] = { "�й�", "�̸�", "����","����","����","����","���","���"};
		DefaultTableModel model = new DefaultTableModel(colNames, 0);
		JTable table = new JTable(model);
		contenPane.add(new JScrollPane(table), BorderLayout.CENTER);
		JPanel panel = new JPanel();
		JPanel panel2 = new JPanel();

		JTextField text1 = new JTextField(5);
		JTextField text2 = new JTextField(5);
		JTextField text3 = new JTextField(2);
		JTextField text4 = new JTextField(2);
		JTextField text5 = new JTextField(2);
		JButton button1 = new JButton("�߰�");
		JButton button2 = new JButton("����");
		JButton button3 = new JButton("����");
		panel.add(new JLabel("�й�"));
		panel.add(text1);
		panel.add(new JLabel("�̸�"));
		panel.add(text2);
		panel.add(new JLabel("����"));
		panel.add(text3);
		panel.add(new JLabel("����"));
		panel.add(text4);
		panel.add(new JLabel("����"));
		panel.add(text5);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		contenPane.add(panel, BorderLayout.SOUTH);
		
		button1.addActionListener(new SungjukListener(table, text1, text2, text3,text4,text5));
		button2.addActionListener(new SungjukListener(table, text1, text2, text3,text4,text5));
		button3.addActionListener(new SungjukListener(table, text1, text2, text3,text4,text5));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

}