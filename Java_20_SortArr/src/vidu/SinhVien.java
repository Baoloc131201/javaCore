//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class SinhVien implements Comparable<SinhVien> {
    private int masinhvien;
    private double diem;
    private String name;
    private String tenlop;

    public SinhVien(int masinhvien, double diem, String name, String tenlop) {
        this.masinhvien = masinhvien;
        this.diem = diem;
        this.name = name;
        this.tenlop = tenlop;
    }

    public int getMasinhvien() {
        return this.masinhvien;
    }

    public void setMasinhvien(int masinhvien) {
        this.masinhvien = masinhvien;
    }

    public double getDiem() {
        return this.diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTenlop() {
        return this.tenlop;
    }

    public void setTenlop(String tenlop) {
        this.tenlop = tenlop;
    }

    public String getTen() {
        String s = this.name.trim();
        if (s.indexOf(" ") >= 0) {
            int vt = s.lastIndexOf(" ");
            System.out.println(s.substring(vt + 1));
            return s.substring(vt + 1);
        } else {
            System.out.println(s);
            return s;
        }
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "masinhvien=" + masinhvien +
                ", diem=" + diem +
                ", name='" + name + '\'' +
                ", tenlop='" + tenlop + '\'' +
                '}';
    }

    public int compareTo(SinhVien o) {
        String ten1 = this.getTen();
        String ten2 = o.getTen();
        return ten1.compareTo(ten2);
    }
}

