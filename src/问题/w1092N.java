package Œ Ã‚;

import java.util.Scanner;

public class w1092N {
	static int n;
	static void zhi(int[] a, int n) {
		int m = 0;
		int[] zhicheng = new int[n];

		int j = 2;
		while (j < zhicheng.length - 1) {
			j=0;
			if (a[j] < a[j + 1] && a[j + 1] > a[j + 2]) {
				zhicheng[m] = a[j + 1];
				m++;
			}
			j++;
		}

		zhi(zhicheng, m);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] a = new int[n];
		for (int j = 0; j < a.length; j++) {
			a[j] = sc.nextInt();
		}
		zhi(a, n);
		sc.close();
	}
}
