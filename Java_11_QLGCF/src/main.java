
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       HoaDonCF hd=new HoaDonCF("Trung Nguyên", 1.5, 90000);
       System.out.println("Số Tiền cà phê: "+hd.tinhtong());
       System.out.println("Số Tiền cà phê được khuyến mãi: "+hd.saleCF(10));
       System.out.println("Số Tiền cà phê quý khách có được giảm giá không: "+hd.checkPrice(100000));
       System.out.println("Số Tiền cà phê quý khách cần phải trả: "+hd.QuyKhachCanTra(10,100000));
	}

}
