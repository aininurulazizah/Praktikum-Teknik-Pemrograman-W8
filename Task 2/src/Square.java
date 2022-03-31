
public class Square extends Rectangle {
	
	public Square(double side) {
		super(side, side);
	}
	
	public void setLength(double side) {
		super.setLength(side);
		super.setWidth(side);
	}
	
	public void setWidth(double side) {
		super.setLength(side);
		super.setWidth(side);
	}
	
	public double getSide() {
		return super.getLength();
	}
	
	public void setSide(double side) {
		super.setLength(side);
		super.setWidth(side);		
	}
	
	@Override
	public String toString() {
		return "A Square with side = " + super.getWidth() + " which is a subclass of " + super.toString();
	}
	
	@Override
	public double getArea() {
		return super.getArea();
	}
	
	@Override
	public double getPerimeter() {
		return super.getPerimeter();
	}
	
}

