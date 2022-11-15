
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Ngay ngay1=new Ngay(13,12,2001);
       Ngay ngay2=new Ngay(15,11,2004);
       Ngay ngay3=new Ngay(20,9,2010);
       
       HangSanXuat hangsx1=new HangSanXuat("Bosch", "VietNam");
       HangSanXuat hangsx2=new HangSanXuat("VNG", "American");
       HangSanXuat hangsx3=new HangSanXuat("Yoddy", "Japan");
       
       BoPhim boPhim1=new BoPhim("Bố Già", 2001, hangsx1, 200000, ngay1);
       BoPhim boPhim2=new BoPhim("Tom and Yerri", 2010, hangsx2, 900000, ngay2);
       System.out.println("Tên hãng sản xuất: "+boPhim1.getTenSanXuatPhim());
       System.out.println("Tên hãng sản xuất: "+boPhim2.getTenSanXuatPhim());
       boPhim1.checkGiaVeReHon(boPhim2);
	}

}
