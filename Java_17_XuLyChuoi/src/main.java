
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Bảo Lộc";
		String s2 = "Bảo Lộc";
		String s3 = "bảo lộc";
		// hàm equals: so sánh 2 chuỗi giống nhau và có phân biệt hoa thường
		System.out.println(s1.equals(s3));
		//hàm equalsIgnoreCase:so sánh k phân biệt chữ hoa thường và chỉ so sánh nội dung giống nhau
		System.out.println(s1.equalsIgnoreCase(s3));
		// hàm compareTo => so sánh > < =, hàm này sẽ trả ra cho mình 3 giá trị:âm, 0, 1 con số dương
		// nó sẽ kiểm tra kí tự và chuyển đổi thành số trong bảng mã ascii
		String v1="Huỳnh Bảo Lộc";
		String v2="Huỳnh Bảo Văn";
		String v3="Huỳnh Anh Dự";
		System.out.println(v1.compareTo(v3));
		
		// hàm compareToIgnoreCase => tương tự hàm compareTo nhưng k phân biệt chữ hoa chữ thường
		String vv1="Huỳnh Bảo Lộc";
		String vv2="Huỳnh Bảo lộc";
		String vv3="Huỳnh Anh Dự";
		System.out.println(vv1.compareToIgnoreCase(vv2));
		
		// hàm regionMatches => so sánh 1 đoạn chuỗi
		// tham số thứ nhất là vị trí kí tự chuỗi thứ 1 cần so sánh
		// tham số thứ 2 là biến chuỗi nào cần so sánh
		// tham số thứ 3 là vị trí biến chuỗi cần so sánh
		// tham số thứ 4 là cần so sánh bao nhiêu kí tự
		String r1="Huỳnh Bảo Lộc";
		String r2="Huỳnh Bảo Văn";
		System.out.println("regionMatches :"+r1.regionMatches(6, r2, 6, 4));
		
		//hàm startWith => hàm kiểm tra chuỗi bắt đầu bằng .....
		String st1="0337041207";
		System.out.println(st1.startsWith("033"));
		
		//hàm endWith => hàm kiểm tra chuỗi kết thúc bằng.......
		String tenfile="iloveyou.PDF";
		
		if(tenfile.endsWith("PDF")) {
			System.out.println("đây là file PDF");
		}
		else {
			System.out.println("đây không phải là file PDF");
		}
		
		// hàm indexOf=> hàm trả về vị trí khi tìm kiếm 1 kí tự nào đó
		String i1="Huỳnh Bảo Lộc, lộc, Huỳnh Bảo Lộc";
		String i2="Bảo Lộc";
		String i3="lộc";
		System.out.println(i1.indexOf(i2));
		System.out.println(i1.indexOf(i3, 10));
		// hàm lastIndexOf => y chang hàm indexOf nhưng sẽ tìm kiếm vị trí từ cuối lên đầu của 1 chuỗi
		System.out.println(i1.lastIndexOf(i2));
		
		// hàm concat => hàm nối 2 chuỗi với nhau
		String c1="Huỳnh ";
		String c2="Bảo Lộc";
		System.out.println(c1.concat(c2));

		// hàm replace => thay thế 
		String s5="Huỳnh Anh dự";
		String s6=s5.replaceAll("dự", c2);
		System.out.println(s6);
		
		// hàm toLowerCase()=>biến chuỗi hoa thành thường
		// hàm toUppercase()=>biến chuỗi thường thành chữ hoa
		// hàm trim()=> xóa bỏ khoảng trắng đầu vs cuối dòng của 1 chuỗi
		
	    // hàm subString() => cắt chuỗi 
		String s10="Huỳnh Bảo Lộc";
		String s11=s10.substring(2);// vị trí cần cắt đến hết
		String s12=s10.substring(2, 7);// vị trí cần cắt và vị trí kết thúc
		System.out.println(s11+"----"+s12);
		System.out.println("------------------------------------------------");
		
		
		//-------------------------------------Xử lý chuỗi---------------------------------
		
		
	}

}