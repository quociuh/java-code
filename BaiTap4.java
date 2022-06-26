package NguyenQuangQuoc_19477141;

import java.util.Scanner;

public class BaiTap4 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n;
			int sum = 0;
			do {
				System.out.print("Nhap so nguyen duong n: ");
				n = sc.nextInt();
			}while(n<=0);
			
			System.out.println("Tong tat ca so chan trong khoang tu 0-n:");
			for(int i = 1; i <= n; i++) {
				if(i % 2 == 0)
					sum += i;
			}
			
			System.out.println("sum = " + sum);
		}
	}
}