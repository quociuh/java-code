package NguyenQuangQuoc_19477141;

import java.util.Scanner;

public class BaiTap1 {	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Nhap vao mot so nguyen: ");
			int soNguyen = sc.nextInt();
			
			if(soNguyen >= 0)
				System.out.println("Day la so nguyen duong");
			else
				System.out.println("Day la so nguyen am");
		}
	}
}
