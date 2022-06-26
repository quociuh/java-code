package NguyenQuangQuoc_19477141;

import java.util.Scanner;

public class BaiTap5 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Nhap mot so nguyen: ");
			int n = sc.nextInt();
			
			System.out.println("Phep nhan cua " + n + " voi cac so tu 1-20:");
			for(int i = 1; i <= 20; i++) {
				System.out.println(n + " x " + i + " = " + n*i);
			}
		}
	}

}