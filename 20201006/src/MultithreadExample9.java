
public class MultithreadExample9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalcThread thread1 = new CalcThread();
		PrintThread thread2 = new PrintThread();
		//MonitorThread thread3= new MonitorThread(thread1);
		MonitorThread thread3= new MonitorThread(thread2);
		SharedArea obj = new SharedArea();
		thread1.sharedArea = obj;
		thread2.sharedArea = obj;		
		thread1.start();		
		thread2.start();		
		thread3.start();		
		
	}

}