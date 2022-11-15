import java.text.DecimalFormat;

public class KieuDuLieu {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("###.###");
		
          String tenSach="Lập Trình Java";
          int namXuatBan= 2022;
          double price=250.500;
          boolean flat=true;
          char maKho='L';
          System.out.println("Tên sách: "+ tenSach);
          System.out.println("Năm Xuất Bản: "+ namXuatBan);
          System.out.println("Giá Tiền: "+ df.format(price));
          System.out.println("Còn Sách: "+ flat);
          System.out.println("Mã Kho: "+ maKho);
	}
}
