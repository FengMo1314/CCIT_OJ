package problem;

import java.util.Scanner;

public class W1084 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int[] b = new int[181];
		long sum = 0;
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		for (int i = 0; i < a.length; i++) {
			b[a[i]]++;
		}
		for (int i = 0; i < b.length; i++) {
			if (b[i] != 0) {
				for (int j = i + 1; j < b.length; j++) {
					if (b[j] != 0) {
						for (int k = j + 1; k < b.length; k++) {
							if (b[k] != 0) {
								if (i + j + k == 180) {
									sum = sum + b[j] * b[k] * b[i];
								}
							}
						}
					}
				}
			}
		}
		System.out.println(sum);
	}
}
