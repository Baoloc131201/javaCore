
public class Diem extends Hinh {
    private int diem;


	public Diem(ToaDo toaDo) {
		super(toaDo);
		// TODO Auto-generated constructor stub
	}


	public Diem(ToaDo toaDo, int diem) {
		super(toaDo);
		this.diem = diem;
	}


	public int getDiem() {
		return diem;
	}


	public void setDiem(int diem) {
		this.diem = diem;
	}


	@Override
	public double tinhDientich() {
		// TODO Auto-generated method stub
		return diem;
	}
  
}
