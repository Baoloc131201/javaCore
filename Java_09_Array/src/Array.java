import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[];
       int tong=0;
       a=new int[10];
       for(int i=0;i<a.length;i++) {
    	   Scanner sc=new Scanner(System.in);
    	   a[i]=sc.nextInt();
       }
       for(int i=0;i<a.length;i++) {
    	   tong+=a[i];
       }
       System.out.println(tong);
	}

}
