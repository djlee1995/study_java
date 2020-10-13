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
import javax.swing.table.TableColumn;

public class GUI_Sungjuk {
	public static void main(String[] args) {
		JFrame frame = new JFrame("���� ���α׷�");
		frame.setPreferredSize(new Dimension(500, 800));
		frame.setLocation(500, 400);
		Container contenPane = frame.getContentPane();
		DrawingPanel drawingPanel = new DrawingPanel();
		String colNames[] = { "�й�", "�̸�", "����", "����", "����", "����", "���", "���" };
		DefaultTableModel model = new DefaultTableModel(colNames, 0);
		JTable table = new JTable(model);
		int width[] = { 70, 70, 50, 50, 50, 50, 50, 50 };
		for (int i = 0; i < width.length; i++) {
			TableColumn colum = table.getColumnModel().getColumn(i);
			colum.setPreferredWidth(width[i]);
		}
	


		JTextField txtHakbun = new JTextField(5);
		JTextField txtIrum = new JTextField(5);
		JTextField txtKor = new JTextField(3);
		JTextField txtEng = new JTextField(3);
		JTextField txtMath = new JTextField(3);

		JButton button1 = new JButton("�߰�");
		JButton button2 = new JButton("����");
		JButton button3 = new JButton("����");
		JButton button4 = new JButton("�׷��� ���");
		
		
		JPanel panel = new JPanel();
		panel.add(new JLabel("�й�"));
		panel.add(txtHakbun);
		panel.add(new JLabel("�̸�"));
		panel.add(txtIrum);
		panel.add(new JLabel("����"));
		panel.add(txtKor);
		panel.add(new JLabel("����"));
		panel.add(txtEng);
		panel.add(new JLabel("����"));
		panel.add(txtMath);
		
		JPanel panel2 = new JPanel();
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		
		JPanel panel4 = new JPanel();
		panel4.add(new JScrollPane(table), BorderLayout.CENTER);
	
		
		JPanel panel3 = new JPanel(new BorderLayout());
		panel3.add(panel, BorderLayout.CENTER);
		panel3.add(panel2, BorderLayout.SOUTH);
		
		
		contenPane.add(drawingPanel, BorderLayout.CENTER);
		contenPane.add(panel4,BorderLayout.NORTH);
		contenPane.add(panel3, BorderLayout.SOUTH);
		button1.addActionListener(new EventActionListener(table, txtHakbun, txtIrum, txtKor, txtEng, txtMath));
		button2.addActionListener(new EventActionListener(table));
		button3.addActionListener(new EventActionListener(table, txtHakbun, txtIrum, txtKor, txtEng, txtMath));
		button4.addActionListener(new DrawActionListner(txtKor, txtEng, txtMath, drawingPanel));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

}