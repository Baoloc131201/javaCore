import java.util.Arrays;

public class main {
    public static int [] reverse(int [] x){
        int [] newArr= new int[x.length];
        int index=0;
        for (int i=x.length-1;i>=0;i--){
            newArr[index]=x[i];
            index++;
        }
        return newArr;
    }
    public static void main(String[] args) {
        int []a=new int[]{1,8,2,6,9,7,5,3};
        int []b=new int[15];
        // hàm sắp xếp tăng dần;
        System.out.println("arr chưa sắp xếp: "+Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("arr đã sắp xếp: "+Arrays.toString(a));

        //hàm tìm kiếm => sử dụng tìm kiếm khi mảng được sắp xếp rùi, trả ra vị trí phần tử đang đứng
        System.out.println(Arrays.binarySearch(a,3));

        //hàm điền giá trị vào 1 mảng
        Arrays.fill(b,10);
        System.out.println("mảng b sau khi thêm: "+Arrays.toString(b));

        // hàm sắp xếp giảm dần
        System.out.println("Mảng a sau khi giảm dần:"+Arrays.toString(reverse(a)));
    }
}