package problem;

import java.util.Scanner;

public class W1092 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int j = 0; j < a.length; j++) {
			a[j] = sc.nextInt();
		}
		zhi(a);
		sc.close();
	}

	static void zhi(int[] a) {
		while (true) {
			int sum = 0;// 筛选器
			int[] temp = new int[a.length - 1];
			for (int i = 1; i < a.length - 1; i++) {
				if (a[i] > a[i - 1] && a[i] > a[i + 1]) {
					temp[i] = a[i];
					sum++;
				}
			}
			if (sum == 0) {
				break;
			}
			a = new int[sum];
			for (int i = 0, j = 0; i < temp.length; i++) {
				if (temp[i] != 0) {
					a[j++] = temp[i];
				}
			}

		}
		for (int k : a) {
			System.out.print(k + " ");
		}
	}
}
