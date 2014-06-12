package homework_3;

public class ShapeMain {
	public static void main(String[] args) {
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		System.out.println("Area of " + c.getClass().getName() + " is " + c.computeArea(10));
		System.out.println("Circumference of " + c.getClass().getName() + " is " + c.computeCircumference(10));
		System.out.println("Area of " + r.getClass().getName() + " is " + r.computeArea(10));
		System.out.println("Circumference of " + r.getClass().getName() + " is " + r.computeCircumference(10));
	}
}
