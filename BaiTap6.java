package NguyenQuangQuoc_19477141;

import java.util.Scanner;

public class BaiTap6 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Nhap n: ");
			int n = sc.nextInt();
			
			int[] arr = new int[n];
			System.out.println("Nhap cac phan tu mang: ");
			for(int i = 0; i < n; i++) {
				System.out.printf("a[%d] = ", i);
				arr[i] = sc.nextInt();
			}
			
			int sum = 0;
			for(int i = 0; i < n; i++)
				sum += arr[i];
			System.out.println("Gia tri trung binh mang la: " + sum/n);
		}
	}
}