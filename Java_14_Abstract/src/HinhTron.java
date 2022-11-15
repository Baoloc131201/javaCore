
public class HinhTron extends Hinh {
	private double r;

	public HinhTron(ToaDo toaDo) {
		super(toaDo);
		// TODO Auto-generated constructor stub
	}

	public HinhTron(ToaDo toaDo, double r) {
		super(toaDo);
		this.r = r;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	@Override
	public double tinhDientich() {
		// TODO Auto-generated method stub
		return Math.PI*this.r*this.r;
	}

}
