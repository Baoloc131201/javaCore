import java.util.Scanner;

public class GiaiPTBac2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b, c, x1, x2, delta;
		Scanner sc = new Scanner(System.in);
		System.out.println("Mời bạn nhập số a:");
		a = sc.nextDouble();
		System.out.println("Mời bạn nhập số b:");
		b = sc.nextDouble();
		System.out.println("Mời bạn nhập số c:");
		c = sc.nextDouble();
		delta = Math.pow(b, 2) - 4 * a * c;
		if (a == 0) {
			System.out.println("Nhập dữ liệu sai");
		} else {
			if (delta < 0) {
				System.out.println("Phương trình vô nghiệm");
			} else if (delta == 0) {
				System.out.println("Phương trình có nghiệm kép là:" + "x1" + "=" + "x2" + "=" + -b / 2 * a);
			} else {
				System.out.println("Phương trình có 2 nghiệm phân biệt:");
				System.out.println("x1 =" + (-b - (Math.sqrt(delta)) / (2 * a)));
				System.out.println("x2 =" + (-b + (Math.sqrt(delta)) / (2 * a)));
			}
		}
	}

}
