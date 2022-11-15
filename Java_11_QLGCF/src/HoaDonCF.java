
public class HoaDonCF {
	private String name;
	private double kilogram;
	private double price;

	public HoaDonCF(String name, double kilogram, double price) {
		super();
		this.name = name;
		this.kilogram = kilogram;
		this.price = price;
	}
    
	public double tinhtong() {
		return this.kilogram * this.price;
	}
	public double saleCF(double x) {
		return x/100 * this.tinhtong();
	}
	public boolean checkPrice(double price) {
		return this.price >= price;
	}
	public double QuyKhachCanTra(double x,double price) {
		if(checkPrice(price)) {
			return this.tinhtong()-this.saleCF(x);
		}
		return this.tinhtong();
	}

}
