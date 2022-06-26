package NguyenQuangQuoc_19477141;

import java.util.Scanner;

public class BaiTap9 {
    public static void orderByASC(int[] arr) {
        int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    
    public static int[] insert(int[] arr, int k) {
        int arrIndex = arr.length - 1;
        int tempIndex = arr.length;
        int[] tempArr = new int [tempIndex + 1];
        boolean inserted = false;
         
        for (int i = tempIndex; i >= 0; i--) {
            if (arrIndex > -1 && arr[arrIndex] > k) {
                tempArr[i] = arr[arrIndex--];
            } else if (!inserted) {
                    tempArr[i] = k;
                    inserted = true;
            } else 
            	tempArr[i] = arr[arrIndex--];
        }
        return tempArr;
    }

    public static void In(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void main(String[] args) {
    	try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Nhap n: ");
			int n = sc.nextInt();
			
			int[] arr = new int [n];
			System.out.println("Nhap cac phan tu mang:");
			for (int i = 0; i < n; i++) {
			    System.out.print("a[" + i + "] = ");
			    arr[i] = sc.nextInt();
			}
			
			orderByASC(arr);
			System.out.print("Sap xep mang tang: ");
			In(arr);
			
			System.out.print("\nNhap phan tu k can chen: ");
			int k = sc.nextInt();
			
			System.out.print("Sap xep mang tang sau khi chen " + k + " la: ");
			arr = insert(arr, k);
			In(arr);
		}
    }
}