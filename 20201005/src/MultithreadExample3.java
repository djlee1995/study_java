
public class MultithreadExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new Thread(new SmallLetters());
		thread.start();
		char arr[]= {'��','��','��','��','��','��','��','��','��','��','��','��','��','��'};
		for (char ch : arr)
			System.out.print(ch);
	}

}