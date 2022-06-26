# bài tập cơ bản của cơ bản

```public class TamGiac {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Nhap x, y, z: ");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			double z = sc.nextDouble();
			
			if(x>=0 && y>=0 && z>=0) {
				if(x+y>z && x+z>y && y+z>x) {
					System.out.println("3 canh co lap thanh tam giac");
					
					double p = (x+y+z)/2;
					double S = Math.sqrt(p*(p-x)*(p-y)*(p-z));
					System.out.printf("Chu vi = %.2f", p*2);
					
					System.out.printf("\nDien tich = %.2f", S);
				} else 
					System.out.println("3 canh KHONG lap thanh tam giac");
			} else
				System.out.println("Do dai nhap khong hop le!!!");
		}
	}
}
#in ra snt
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
