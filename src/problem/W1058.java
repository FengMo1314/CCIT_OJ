package problem;

import java.util.Scanner;

public class W1058 {
	// 奶牛的相似性
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] a = new int[2 * n][m];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		int sum = 0;
		for (int i = 0; i < a.length / 2; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] != a[a.length / 2 + i][j]) {
					sum++;
				}
			}
		}
		System.out.println(m * n - sum);
		sc.close();
	}

}
