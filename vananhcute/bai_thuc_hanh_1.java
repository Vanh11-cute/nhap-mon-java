package vananhcute;
import java.util.Scanner;
public class bai_thuc_hanh_1 {
	public static void main(String[] args) {
		
		Scanner Vanh = new Scanner(System.in);
		System.out.println("Nhap ban kinh hinh tron: ");
		double r = Vanh.nextDouble();
		Circle circle=new Circle(r);
		
		System.out.println("Nhap canh hinh vuong: ");
		double a = Vanh.nextDouble();
		Square square=new Square(a);
		
		System.out.println("Dien tich hinh tron:  "+circle.area());
		System.out.println("Chu vi hinh tron:   "+circle.circumference());
		System.out.println("Dien tich hinh vuong:  "+square.area());
		System.out.println("Chu vi hinh vuong:  "+square.circumference());
		
	}

}
