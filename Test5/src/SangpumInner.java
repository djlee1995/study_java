import java.util.ArrayList;
import java.util.Scanner;

public class SangpumInner {

	public SangpumInner() {
		// TODO Auto-generated constructor stub
	}

	private ArrayList<Sangpum> list = new ArrayList<Sangpum>();

	public ArrayList<Sangpum> getlist() {
		return list;
	}

	void addSangpum(Sangpum obj) {
		list.add(obj);
		System.out.println("��ǰ�� �߰��Ǿ����ϴ�.");
	}

	void removeSangpum(Sangpum obj) {
		list.remove(obj);
		System.out.println("��ǰ�� �����Ǿ����ϴ�.");
	}

	Sangpum getSangpum(int index) {
		return list.get(index);
	}

	boolean checkSangpum(Sangpum obj) {
		for (Sangpum dat : list) {
			if (dat.code.equals(obj.code)) {
				return true;
			}
		}
		return false;
	}

	int getSungjukNum() {
		return list.size();
	}

	int getTotal() {
		int total = 0;
		for (Sangpum obj : list)
			total += obj.count*obj.price;

		return total;
	}

	class Sangpum {
		String code, name;
		int count, price;
		String estimate = "����";

		Sangpum() {

		}

		void input_Sangpum() {
			Scanner scan = new Scanner(System.in);
			System.out.println("�ڵ带 �Է�=> ");
			code = scan.next();
			System.out.println("��ǰ���� �Է�=> ");
			name = scan.next();
			System.out.println("������ �Է�=> ");
			count = scan.nextInt();
			System.out.println("�ܰ� �Է�=> ");
			price = scan.nextInt();

		}

		void output_Sangpum() {
			System.out.printf("%2s %5s %4d  %4d %4d %5s\n", code, name, count, price, count*price, estimate);
		}

	}
}