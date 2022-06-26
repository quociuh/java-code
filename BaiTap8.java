package NguyenQuangQuoc_19477141;

import java.util.Scanner;

public class BaiTap8 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.print("Nhap n: ");
			int n = sc.nextInt();
			
			int[] arr = new int[n];
			System.out.println("Nhap vao cac phan tu mang so nguyen:");
			for(int i = 0; i < n; i++) {
				System.out.print("a[" + i + "] = ");
				arr[i] = sc.nextInt();
			}
			
			int temp;
			for(int i = 0; i < n - 1; i++) {
				for(int j = i + 1; j < n; j++) {
					if(arr[i] > arr[j]) {
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			
			System.out.print("Sap xep tang dan: ");
			for(int i = 0; i < n; i++) {
				System.out.print(" " + arr[i]);
			}
		}
	}
}