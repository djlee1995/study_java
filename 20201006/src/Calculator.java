import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;

import javax.swing.*;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	JTextField text;
	JButton btn[];

	public Calculator(JTextField text, JButton btn[]) {
		// TODO Auto-generated constructor stub
		this.text = text;
		this.btn = btn;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("0")) {
			text.setText(text.getText() + "0");
		} else if (e.getActionCommand().equals("1")) {
			text.setText(text.getText() + "1");
		} else if (e.getActionCommand().equals("2")) {
			text.setText(text.getText() + "2");
		} else if (e.getActionCommand().equals("3")) {
			text.setText(text.getText() + "3");
		} else if (e.getActionCommand().equals("4")) {
			text.setText(text.getText() + "4");
		} else if (e.getActionCommand().equals("5")) {
			text.setText(text.getText() + "5");
		} else if (e.getActionCommand().equals("6")) {
			text.setText(text.getText() + "6");
		} else if (e.getActionCommand().equals("7")) {
			text.setText(text.getText() + "7");
		} else if (e.getActionCommand().equals("8")) {
			text.setText(text.getText() + "8");
		} else if (e.getActionCommand().equals("9")) {
			text.setText(text.getText() + "9");
		} else if (e.getActionCommand().equals("+")) {
			text.setText(text.getText() + "+");
		} else if (e.getActionCommand().equals("-")) {
			text.setText(text.getText() + "-");
		} else if (e.getActionCommand().equals("*")) {
			text.setText(text.getText() + "*");
		} else if (e.getActionCommand().equals("/")) {
			text.setText(text.getText() + "/");
		} else if (e.getActionCommand().equals("Clear")) {
			text.setText("");
		} else if (e.getActionCommand().equals("=")) {
			Calcul();
		} else {
			text.setText(text.getText().substring(0, text.getText().length() - 1));
		}

	}

	void Calcul() {
		String str = text.getText();
		StringTokenizer token = new StringTokenizer(str, "+-*/",true);

		String token_str = token.nextToken();
		if (input_check(token_str)) {
			JOptionPane.showMessageDialog(null, "�����Է¿���-1~!!");// �����ڷ� ������ ������ ���
			return;
		}
		int result = Integer.parseInt(token_str);
		while (token.hasMoreTokens()) {// ��ū�� ���������� �ݺ�
			token_str = token.nextToken();// ¦����° ��ū�� ����(������)
			char ch = token_str.charAt(0);// ���ڿ����� ������ ����
			if (token.hasMoreTokens()) {
				token_str = token.nextToken();// Ȧ����° ��ū�� ����(����)
			} else {
				JOptionPane.showMessageDialog(null, "�����Է¿���-2~!!");// �����ڷ� ������ ������ ���
				return;
			}
			if (input_check(token_str)) {// input_check() ������ �������� �˻�
				JOptionPane.showMessageDialog(null, "�����Է¿���-3~!!");// �����ڷ� ������ ������ ���
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
		} // while (token.hasMoreTokens())

		text.setText(text.getText() + "=" + result);

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