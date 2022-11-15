
public class BoPhim {
	private String tenPhim;
	private int namSanXuat;
	private HangSanXuat hangSanXuat;
	private double giaVe;
	private Ngay ngay;

	public BoPhim(String tenPhim, int namSanXuat, HangSanXuat hangSanXuat, double giaVe, Ngay ngay) {
		this.tenPhim = tenPhim;
		this.namSanXuat = namSanXuat;
		this.hangSanXuat = hangSanXuat;
		this.giaVe = giaVe;
		this.ngay = ngay;
	}

	public String getTenPhim() {
		return tenPhim;
	}

	public void setTenPhim(String tenPhim) {
		this.tenPhim = tenPhim;
	}

	public int getNamSanXuat() {
		return namSanXuat;
	}

	public void setNamSanXuat(int namSanXuat) {
		this.namSanXuat = namSanXuat;
	}

	public HangSanXuat getHangSanXuat() {
		return hangSanXuat;
	}

	public void setHangSanXuat(HangSanXuat hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}

	public double getGiaVe() {
		return giaVe;
	}

	public void setGiaVe(double giaVe) {
		this.giaVe = giaVe;
	}

	public Ngay getNgay() {
		return ngay;
	}

	public void setNgay(Ngay ngay) {
		this.ngay = ngay;
	}

	public String getTenSanXuatPhim() {
         return hangSanXuat.getTenHangSanXuat();
	}
	public void checkGiaVeReHon(BoPhim boPhim) {
		if(this.giaVe<boPhim.giaVe) {
			System.out.println(this.getTenPhim() + " Rẻ hơn");
		}
		else if(this.giaVe==boPhim.giaVe) {
			System.out.println("2 bộ phim bằng giá nhau");
		}
		else {
			System.out.println(boPhim.getTenPhim() + " Rẻ hơn");
		}
	}
}
