
public class NestedClassExample10 {
	public static void main(String[] args) {
		Player obj = new Player() {
			
			@Override
			public void stop() {
				// TODO Auto-generated method stub
				System.out.println("�÷��� ����");
			}
			
			@Override
			public void play(String source) {
				// TODO Auto-generated method stub
			System.out.println("�÷��� ����:" + source);	
			}
		};
		obj.play("LetItBe.mp3");
		obj.stop();
	}
}