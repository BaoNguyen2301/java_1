import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		/*
		 * 1.Nhap cac bien xC, yC , xM, yM,ban kinh R
		 * 2.In thong bao nhap cac bien tren va cho nguoi dung nhap vao
		 * 3. Ap dung cong thuc Euclid
		 * D = Math.sqrt(Math.pow((xM - xC),2) + Math.pow((yM-yC),2))
		 * 4.Su dung if else
		 * D>R: diem (xM,yM) nam ngoai duong tron
		 *  D=R: diem (xM,yM) nam tren duong tron
		 *   D<R: diem (xM,yM) nam trong duong tron
		 *5.Xuat ra ket qua
		 **/
		float xC;
		float yC;
		float R;
		float xM;
		float yM;
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập vào điểm tâm hình tròn xC và yC:");
		xC = Float.parseFloat(scan.nextLine());
		yC = Float.parseFloat(scan.nextLine());
		System.out.println("Nhap bán kính hình tròn:");
		R = Float.parseFloat(scan.nextLine());
		System.out.println("Nhap vào điểm càn kiểm tra xM và yM:");
		xM = Float.parseFloat(scan.nextLine());
		yM = Float.parseFloat(scan.nextLine());
		
		double D = Math.sqrt(Math.pow((xM - xC),2) + Math.pow((yM - yC),2));
		
		if(D < R) {
			System.out.println("Điểm xM,yM nằm trong hình tròn");
		}
		else if (D == R) {
			System.out.println("Điểm xM,yM nằm trên hình tròn");
		}
		else {
			System.out.println("Điểm xM,yM nằm ngoài hình tròn");
		}
		
	}

}
