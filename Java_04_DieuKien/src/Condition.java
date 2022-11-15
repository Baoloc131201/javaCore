import java.util.Scanner;

public class Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 System.out.println("Nhập số a:");
			
			int a=sc.nextInt();
			System.out.println("Nhập số b:");
			int b=sc.nextInt();
			System.out.println(a + "=" + b +":"+ (a==b) );
			System.out.println(a + ">" + b +":"+ (a>b) );
			System.out.println(a + "<" + b +":"+ (a<b) );
			System.out.println(a + "<=" + b +":"+ (a<=b) );
			System.out.println(a + ">=" + b +":"+ (a>=b) );
			System.out.println(a + "!=" + b +":"+ (a!=b) );
	}

}
