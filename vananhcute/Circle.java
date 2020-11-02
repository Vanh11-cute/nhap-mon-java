package vananhcute;

public class Circle extends Shape {
	public double r;
	public Circle(double r) {
		this.r=r;
	}
	@Override
	public double area() {
		return 3.14*r*r;
	}
	
	@Override
	public double circumference() {
		return 2*3.14*r;
		
	}

}
