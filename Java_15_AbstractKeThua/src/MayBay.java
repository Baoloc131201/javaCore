
public class MayBay extends phuongTienDiChuyen {

	private String loainhienlieu;

	public MayBay(String loaiPhuongTien, HangSanXuat hangsanxuat, String loainhienlieu) {
		super(loaiPhuongTien, hangsanxuat);
		this.loainhienlieu = loainhienlieu;
		// TODO Auto-generated constructor stub
	}

	public String getLoainhienlieu() {
		return loainhienlieu;
	}

	public void setLoainhienlieu(String loainhienlieu) {
		this.loainhienlieu = loainhienlieu;
	}
    public void catcanh() {
    	System.out.println("cất cánh");
    }
    public void hacanh() {
    	System.out.println("hạ cánh");
    }
	@Override
	public double layvantoc() {
		// TODO Auto-generated method stub
		return 500;
	}
	
	
}
