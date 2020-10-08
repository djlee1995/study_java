package Teacher;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

class EventActionListener implements ActionListener {
	JButton btn[];
	JTextField txtVal;

	EventActionListener(JButton btn[], JTextField txtVal) {
		this.btn = btn;
		this.txtVal = txtVal;
		// TODO Auto-generated constructor stub
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("0")) {
			txtVal.setText(txtVal.getText() + "0");
		} else if (e.getActionCommand().equals("1")) {
			txtVal.setText(txtVal.getText() + "1");
		} else if (e.getActionCommand().equals("2")) {
			txtVal.setText(txtVal.getText() + "2");
		} else if (e.getActionCommand().equals("3")) {
			txtVal.setText(txtVal.getText() + "3");
		} else if (e.getActionCommand().equals("4")) {
			txtVal.setText(txtVal.getText() + "4");
		} else if (e.getActionCommand().equals("5")) {
			txtVal.setText(txtVal.getText() + "5");
		} else if (e.getActionCommand().equals("6")) {
			txtVal.setText(txtVal.getText() + "6");
		} else if (e.getActionCommand().equals("7")) {
			txtVal.setText(txtVal.getText() + "7");
		} else if (e.getActionCommand().equals("8")) {
			txtVal.setText(txtVal.getText() + "8");
		} else if (e.getActionCommand().equals("9")) {
			txtVal.setText(txtVal.getText() + "9");
		} else if (e.getActionCommand().equals("+")) {
			txtVal.setText(txtVal.getText() + "+");
		} else if (e.getActionCommand().equals("-")) {
			txtVal.setText(txtVal.getText() + "-");
		} else if (e.getActionCommand().equals("*")) {
			txtVal.setText(txtVal.getText() + "*");
		} else if (e.getActionCommand().equals("/")) {
			txtVal.setText(txtVal.getText() + "/");
		} else if (e.getActionCommand().equals("=")) {
			calcu();
		} else if (e.getActionCommand().equals("Clear")) {
			txtVal.setText("");
		} else {
			txtVal.setText(txtVal.getText().substring(0, txtVal.getText().length() - 1));
		}

	}

	void calcu() {
		String str = txtVal.getText();
		StringTokenizer token = new StringTokenizer(str, "+-*/", true);

		String token_str = token.nextToken();
		if (input_check(token_str)) {
			JOptionPane.showMessageDialog(null, "���� �Է� ����-1~!!");
			return;
		}
		int result = Integer.parseInt(token_str);
		while (token.hasMoreTokens()) {// ��ū�� ���������� �ݺ�
			token_str = token.nextToken();// ¦����° ��ū�� ����(������)
			char ch = token_str.charAt(0);// ���ڿ����� ������ ����
			if (token.hasMoreTokens()) {
				token_str = token.nextToken();// Ȧ����° ��ū�� ����(����)
			} else {
				JOptionPane.showMessageDialog(null, "���� �Է� ����-2~!!");
				return;
			}
			if (input_check(token_str)) {// input_check() ������ �������� �˻�
				JOptionPane.showMessageDialog(null, "���� �Է� ����-3~!!");
				return;
			}
			switch (ch) {

			case '+':
				result += Integer.parseInt(token_str);
				break;
			case '-':
				result -= Integer.parseInt(token_str);
				break;
			case '*':
				result *= Integer.parseInt(token_str);
				break;
			case '/':
				result /= Integer.parseInt(token_str);
				break;

			}// switch
		} // while()
		txtVal.setText(txtVal.getText() + "=" + result);

	}

	boolean input_check(String str) {
		char ch;
		for (int i = 0; i < str.length(); i++) { // ��ū�� �����޹޾� ���ڿ� ���̸�ŭ �ѹ��ھ� �˻�
			ch = str.charAt(i); // ���ڿ����� �ѹ��ھ� ����

			if (ch < '0' || ch > '9')// ch�� �������� �˻� �����ڵ�� ��
				return true;
		}
		return false;
	}
}