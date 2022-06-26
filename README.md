# oop-code
ptivate
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

```public class BaiTap3 {
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
