
public class MultithreadExample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SharedArea1 area = new SharedArea1();
		area.account1 = new Account("111-111-1111", "�̸���", 20000000);
		area.account2 = new Account("222-222-2222", "������", 10000000);
		TransferThread thread1 = new TransferThread(area);
		PrintThread1 thread2 = new PrintThread1(area);
		thread1.start();
		thread2.start();
		
	}

}