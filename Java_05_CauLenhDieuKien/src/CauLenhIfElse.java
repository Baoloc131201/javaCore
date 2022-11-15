import java.util.Scanner;

public class CauLenhIfElse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Mời bạn nhập số:");
        int n= sc.nextInt();
        System.out.println(n%2==0 ? "Là số Chẵn" : "Là số Lẻ");
	}
}
