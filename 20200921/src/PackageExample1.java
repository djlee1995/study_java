import geometry.Circle;

//package geometry;

class PackageExample1 {
	public static void main(String args[]) {
		Circle obj = new Circle(5);
		System.out.println("������ = " + obj.radius);
		System.out.println("���� = " + obj.getArea());
	}
}