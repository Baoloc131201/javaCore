
public class HinhChuNhat extends Hinh {
    private double chieudai,chieurong;
	public HinhChuNhat(ToaDo toaDo ) {
		super(toaDo);
		// TODO Auto-generated constructor stub
	}

	public HinhChuNhat(ToaDo toaDo, double chieudai, double chieurong) {
		super(toaDo);
		this.chieudai = chieudai;
		this.chieurong = chieurong;
	}

	@Override
	public double tinhDientich() {
		// TODO Auto-generated method stub
		return this.chieudai*this.chieurong;
	}

	public double getChieudai() {
		return chieudai;
	}

	public void setChieudai(double chieudai) {
		this.chieudai = chieudai;
	}

	public double getChieurong() {
		return chieurong;
	}

	public void setChieurong(double chieurong) {
		this.chieurong = chieurong;
	}

}
