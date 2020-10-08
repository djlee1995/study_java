import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.management.modelmbean.ModelMBean;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class SungjukListener implements ActionListener {
	JTable table;
	JTextField text1, text2, text3, text4, text5;

	SungjukListener(JTable table, JTextField text1, JTextField text2, JTextField text3, JTextField text4,
			JTextField text5) {
		this.table = table;
		this.text1 = text1;
		this.text2 = text2;
		this.text3 = text3;
		this.text4 = text4;
		this.text5 = text5;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String arr[] = new String[8];
		if (e.getActionCommand().equals("�߰�")) {

			arr[0] = text1.getText();// �й�
			arr[1] = text2.getText();// �̸�
			arr[2] = text3.getText();// ����
			arr[3] = text4.getText();// ����
			arr[4] = text5.getText();// ����
			arr[5] = sum();
			arr[6] = avg();
			arr[7] = process();
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			model.addRow(arr);
		} else if (e.getActionCommand().equals("����")) {
			TableModel model = table.getModel();
			int colNum = model.getColumnCount();
			for (int col = 0; col < colNum; col++) {
				if(text1.getText().equals(arr[0]))
				text3.setText(text3.getText());
				text4.setText(text4.getText());
				text5.setText(text5.getText());

			}
		} else {
			int row = table.getSelectedRow();

			if (row == -1)
				return;
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			model.removeRow(row);
		}
	}

	String sum() {
		return String.valueOf(Integer.parseInt(text3.getText()) + Integer.parseInt(text3.getText())
				+ Integer.parseInt(text3.getText()));
	}

	String avg() {
		return String.valueOf(Integer.parseInt(sum()) / 3.);

	}

	String process() { // �й� ���
		String grade;

		switch ((int) (Double.parseDouble(avg()) / 10)) {
		case 10:
		case 9:
			grade = "��";
			break;
		case 8:
			grade = "��";
			break;
		case 7:
			grade = "��";
			break;
		case 6:
			grade = "��";
			break;
		default:
			grade = "��";
		}
		return grade;
	}

}