package vananhcute;

public class Square extends Shape {
	public double a;
	public Square(double a) {
		this.a=a;
	}
	@Override
	public double area() {
		return a*a;
	}
	@Override
	public double circumference() {
		return 4*a;
	}

}
