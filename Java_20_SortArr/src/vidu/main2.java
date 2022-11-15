import java.util.Arrays;

public class main2 {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien(100, 8.5, "Huỳnh Bảo Lộc", "CNTTD");
        SinhVien sv2 = new SinhVien(150, 9.5, "Huỳnh Bảo Dự", "CNTTC");
        SinhVien sv3 = new SinhVien(130, 9.5, "Huỳnh Bảo Văn", "CNTTA");
        SinhVien sv4 = new SinhVien(140, 9.5, "Huỳnh Quốc Bảo", "CNTTB");
        System.out.println(sv1.compareTo(sv2));

        SinhVien []arrSv=new SinhVien[]{sv1,sv2,sv3,sv4};
        System.out.println("Mảng chưa sắp xếp: "+Arrays.toString(arrSv));
        Arrays.sort(arrSv);
        System.out.println("Sắp xếp mảng sinh viên:"+ Arrays.toString(arrSv));

        // hàm tìm kiếm
        System.out.println(Arrays.binarySearch(arrSv,sv3));
    }
}
