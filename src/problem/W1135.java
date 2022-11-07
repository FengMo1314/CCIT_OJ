package problem;

import java.util.Scanner;

public class W1135 {
	// 判断是否为素数（质数）--范围必须为大于1（不包括1）
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int sum = 0;
		sc.close();
		if (m <= 1 || n <= 1) {
			for (int i = 2; i <= n; i++) {
				boolean result = true;
				for (int j = 2; j <= Math.sqrt(i); j++) {
					if (i % j == 0) {
						result = false;
						break;
					}
				}
				if (result) {
					sum = sum + 1;
				}
			}
		} else {
			for (int i = m; i <= n; i++) {
				boolean result = true;
				for (int j = 2; j <= Math.sqrt(i); j++) {
					if (i % j == 0) {
						result = false;
						break;
					}
				}
				if (result) {
					sum = sum + 1;
				}
			}

		}
		System.out.println(sum);
	}
}
