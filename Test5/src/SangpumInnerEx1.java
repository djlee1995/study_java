import java.util.*;

public class SangpumInnerEx1 {
	public static void main(String args[]) {
		SangpumInner sangpum = new SangpumInner();
		Scanner scan = new Scanner(System.in);

		int menu;
		while (true) {
			printMenu();
			System.out.print("�޴� ���� => ");
			menu = scan.nextInt();
			System.out.println();

			if (menu == 6) {
				System.out.println("The End...");
				break;
			}

			switch (menu) {
			case 1:
				inputSangpum(sangpum);
				break;
			case 2:
				outputSangpum(sangpum);
				break;
			case 3:
				searchSangpum(sangpum);
				break;
			case 4:
				updateSangpum(sangpum);
				break;
			case 5:
				deleteSangpum(sangpum);
				break;
			default:
				System.out.println("�޴��� �ٽ� �����ϼ���!!!\n");
			}

		}

	}

	static void printMenu() {
		System.out.println("*** ��ǰ���� ***");
		System.out.println("1. ��ǰ���� �Է�");
		System.out.println("2. ��ǰ���� ���");
		System.out.println("3. ��ǰ���� ��ȸ");
		System.out.println("4. ��ǰ���� ����");
		System.out.println("5. ��ǰ���� ����");
		System.out.println("6. ���α׷� ����");
		System.out.println();
	}

	static void inputSangpum(SangpumInner sangpum) {
		SangpumInner.Sangpum obj = sangpum.new Sangpum();
		obj.input_Sangpum();
		if (sangpum.checkSangpum(obj)) {
			System.out.println("�ڵ��ߺ�����!!\n");
			return;
		}
		sangpum.addSangpum(obj);

	}

	static void outputSangpum(SangpumInner sangpum) {
		if (sangpum.getSungjukNum() == 0) {
			System.out.println("����� ��ǰ������ �����ϴ�.");
			return;
		}
		System.out.println("             *** �Ǹ� ��Ȳ ***");
		System.out.println("=======================================");
		System.out.println("�ڵ�    ��ǰ��    ����    �ܰ�         �ݾ�            ��   ");
		System.out.println("=======================================");
		for (SangpumInner.Sangpum dat : sangpum.getlist()) {
			dat.output_Sangpum();
		}
		System.out.println("=======================================");
		System.out.println("                            �� �Ǹűݾ�: " + sangpum.getTotal());
	}

	static void searchSangpum(SangpumInner sangpum) {
		Scanner scan = new Scanner(System.in);
		System.out.println("��ȸ�� ��ǰ�ڵ带 �Է����ּ���=> ");
		String code = scan.next();
		for (SangpumInner.Sangpum dat : sangpum.getlist()) {
			if (code.equals(dat.code)) {
				System.out.println("\n�ڵ�    ��ǰ��    ����    �ܰ�   �ݾ�    ��   ");
				System.out.println("=======================================");
				dat.output_Sangpum();
				System.out.println("=======================================");
				return;
			}
		}
		System.out.println("��ȸ�� �й� ����!!\n");
	}

	static void updateSangpum(SangpumInner sangpum) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������ ��ǰ�ڵ带 �Է����ּ���");
		String code = scan.next();
		for (SangpumInner.Sangpum dat : sangpum.getlist()) {
			if (code.equals(dat.code)) {

				System.out.println("��ǰ���� �Է�=> ");
				dat.name = scan.next();
				System.out.println("������ �Է�=> ");
				dat.count = scan.nextInt();
				System.out.println("�ܰ� �Է�=> ");
				dat.price = scan.nextInt();
				System.out.println("����Ϸ�!!");
				return;

			}
		}
		System.out.println("������ ��ǰ�ڵ� ����!!\n");
	}

	static void deleteSangpum(SangpumInner sangpum) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������ ��ǰ�ڵ带 �Է����ּ���");
		String code = scan.next();
		for (SangpumInner.Sangpum dat : sangpum.getlist()) {
			if (code.equals(dat.code)) {
				sangpum.removeSangpum(dat);

				return;
			}
		}
		System.out.println("������ ��ǰ�ڵ� ����!!\n");
	}
}