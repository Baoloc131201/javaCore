import java.util.Scanner;

public class whileTP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập vào số nguyên n > 0 :");
        int n= sc.nextInt();
//        String buider="";
        String nhiPhan="";
        while(n > 0) {
        	nhiPhan = n%2 + nhiPhan;
//        	StringBuilder str=new StringBuilder(nhiPhan);
//        	buider=str.reverse().toString();
        	n/=2;
        }
        System.out.println("Hệ số nhị phân: " + nhiPhan);
	}

}
