
public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new Shape("pink", true);
		Circle c = new Circle(14.0, "purple", false);
		Rectangle r = new Rectangle(6.0, 27.0, "blue", true);
		Square S = new Square(9.0);
		
		System.out.println(s.toString());
		System.out.println(c.toString());
		System.out.println(r.toString());
		System.out.println(S.toString());
		
		System.out.println(c.getArea());
		System.out.println(c.getPerimeter());
		System.out.println(r.getArea());
		System.out.println(r.getPerimeter());
		System.out.println(S.getArea());
		System.out.println(S.getPerimeter());
	}
}

