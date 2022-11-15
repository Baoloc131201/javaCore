import java.util.Arrays;

public class ArrayCop {
	public static void main(String[] args) {
		// coppy kiểu gán => nhưng thay đổi phần tử của mảng mới thì mảng gốc sẽ bị ảnh hưởng
		double []arr1= {1,2,3};
		double [] arr2=arr1;
		arr2[0]=2;
		System.out.println(Arrays.toString(arr1));
		
		// coppy kiểu clone() => sẽ không ảnh hưởng tới mảng gốc khi thay đổi giá trị của mảng mới
		int []arr3= {1,2,3};
		int [] arr4=arr3.clone();
		arr4[0]=2;
		System.out.println(Arrays.toString(arr4));
		
		// coppy kiểu System.arraycopy() => sẽ không ảnh hưởng mảng gốc nhưng dùng cách này sẽ coppy vị trí mình cần copy
		int []arr5= {4,5,6};
		int []arr6 = new int[10];
	     System.arraycopy(arr5, 1, arr6 , 7, arr5.length-1);
		System.out.println(Arrays.toString(arr6));
     	}
	
}
