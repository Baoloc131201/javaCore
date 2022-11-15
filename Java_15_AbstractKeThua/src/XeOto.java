
public class XeOto extends phuongTienDiChuyen {
	
	private String loaiNhienLieu;

	public XeOto(String loaiPhuongTien, HangSanXuat hangsanxuat,String loaiNhienLieu) {
		super(loaiPhuongTien, hangsanxuat);
		this.loaiNhienLieu = loaiNhienLieu;
		// TODO Auto-generated constructor stub
	}


	public String getLoaiNhienLieu() {
		return loaiNhienLieu;
	}

	public void setLoaiNhienLieu(String loaiNhienLieu) {
		this.loaiNhienLieu = loaiNhienLieu;
	}


	@Override
	public double layvantoc() {
		// TODO Auto-generated method stub
		return 200;
	}
	
}
