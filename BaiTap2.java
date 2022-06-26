package NguyenQuangQuoc_19477141;

import java.util.Scanner;

public class BaiTap2 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Nhap vao 3 so thuc: ");
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			
			if(a<=0 || b <= 0 || c <= 0)
				System.out.println("Do dai nhap khong hop le!");
			else if(a+b>c && a+c>b && b+c>a)
				System.out.println("3 so vua nhap la 3 canh cua 1 tam giac");
			else
				System.out.println("3 so vua nhap KHONG la 3 canh cua 1 tam giac");
		}
	}
}