
public class ExceptionExamlpe3 {
	public static void main(String[] args) {
		try {
			int result = add(1,-2);
			System.out.println(result);
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("�����߻�"+e.getMessage());
		}
	}
	static int add(int a ,int b) throws Exception {
		int result = a+b;
		if (result <0)
			throw new Exception("�����߻�");
		return result;
	}
}