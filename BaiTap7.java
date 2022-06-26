package NguyenQuangQuoc_19477141;

import java.util.Scanner;

public class BaiTap7 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Nhap n: ");
			int n = sc.nextInt();
			
			int[] arr = new int[n];
			System.out.println("Nhap cac phan tu mang: ");
			for(int i = 0; i < n; i++) {	
				do {
					System.out.print("a[" + i + "] = ");
					arr[i] = sc.nextInt();
				}while(arr[i] <= 0);
			}
			
			int max = 0;
			for(int i = 0; i < n; i++) {
				if(arr[i] > max)
					max=arr[i];
			}
			
			System.out.println("Phan tu co gia tri lon nhat la: " + max);
		}
	}
}
