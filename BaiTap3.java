package NguyenQuangQuoc_19477141;

import java.util.Scanner;

public class BaiTap3 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n;
			boolean soNguyenTo = true;
			do {
				System.out.print("Nhap n: ");
				n = sc.nextInt();
			}while(n <= 0 || n >= 1000);
			
			System.out.println("Tat ca so nguyen to trong khoang tu 0-n:");
			for(int i = 1; i <= n; i++) {
				soNguyenTo = true;
				for(int j = 2; j < i; j++) {
					if(i%j == 0)
						soNguyenTo = false;
				}
				if(soNguyenTo == true)
					System.out.print(i + " ");
			}
		}
	}
}