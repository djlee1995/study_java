package Teacher;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class EventActionListener implements ActionListener {
	JTable table;
	JTextField txtHakbun, txtIrum, txtKor, txtEng, txtMath;

	EventActionListener() {

	}

	EventActionListener(JTable table) {
		this.table = table;

	}

	EventActionListener(JTable table, JTextField txtHakbun, JTextField txtIrum, JTextField txtKor, JTextField txtEng,
			JTextField txtMath) {
		this.table = table;
		this.txtHakbun = txtHakbun;
		this.txtIrum = txtIrum;
		this.txtKor = txtKor;
		this.txtEng = txtEng;
		this.txtMath = txtMath;
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("�߰�")) {

			insert();
		} else if (e.getActionCommand().equals("����")) {
			delite();

		}

		else {
			update();
		}
	}

	void insert() {
		Sungjuk obj = new Sungjuk();
		int i, rowNum, flag = 0;
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		obj.hakbun = txtHakbun.getText().trim();

		rowNum = model.getRowCount();
		for (i = 0; i < rowNum; i++) {
			String table_hakbun = model.getValueAt(i, 0).toString().trim();
			if (table_hakbun.equals(obj.hakbun)) {
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			obj.irum = txtIrum.getText().trim();
			obj.kor = Integer.parseInt(txtKor.getText().trim());
			obj.eng = Integer.parseInt(txtEng.getText().trim());
			obj.math = Integer.parseInt(txtMath.getText().trim());
			obj.process();
			
			Object arr[] = new Object[8];
			arr[0] = obj.hakbun;
			arr[1] = obj.irum;
			arr[2] = obj.kor;
			arr[3] = obj.eng;
			arr[4] = obj.math;
			arr[5] = obj.tot;
			arr[6] = obj.avg;
			arr[7] = obj.grade;
			
			model.addRow(arr);
			JOptionPane.showMessageDialog(null, "�й�" + obj.hakbun + "�߰�����!");

		} else
			JOptionPane.showMessageDialog(null, "�й�" + obj.hakbun + "�ߺ������� �߰� ����!");
		txtHakbun.setText("");
		txtIrum.setText("");
		txtKor.setText("");
		txtEng.setText("");
		txtMath.setText("");
	}

	void delite() {
		int row = table.getSelectedRow();
		if (row == -1)
			return;
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		String hakbun = model.getValueAt(row, 0).toString().trim();
		model.removeRow(row);
		JOptionPane.showMessageDialog(null, "�й�" + hakbun + "��������!");
	}

	void update() {
		int i, rowNum, flag = 0;
		String table_hakbun = null;
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		Sungjuk obj = new Sungjuk();

		obj.hakbun = txtHakbun.getText().trim();
		obj.kor = Integer.parseInt(txtKor.getText().trim());
		obj.eng = Integer.parseInt(txtEng.getText().trim());
		obj.math = Integer.parseInt(txtMath.getText().trim());
		obj.process();

		rowNum = model.getRowCount();
		for (i = 0; i < rowNum; i++) {
			table_hakbun = model.getValueAt(i, 0).toString().trim();
			if (table_hakbun.equals(obj.hakbun)) {
				model.setValueAt(obj.kor, i, 2);
				model.setValueAt(obj.eng, i, 3);
				model.setValueAt(obj.math, i, 4);
				model.setValueAt(obj.tot, i, 5);
				model.setValueAt(obj.avg, i, 6);
				model.setValueAt(obj.grade, i, 7);
				flag = 1;
				break;
			}
		}
		if (flag == 0)
			JOptionPane.showMessageDialog(null, "�й�" + obj.hakbun + "��������!");

		else
			JOptionPane.showMessageDialog(null, "�й�" + obj.hakbun + "��������!");

		txtHakbun.setText("");
		txtIrum.setText("");
		txtKor.setText("");
		txtEng.setText("");
		txtMath.setText("");
	}

}