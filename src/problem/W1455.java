package problem;

import java.util.Scanner;

public class W1455 {
	// 杨辉三角
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = new int[n][n];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < i + 1; j++) {
				if (j == 0) {
					a[i][0] = 1;
				} else if (i == j) {
					a[i][j] = 1;
				} else {
					a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
				}
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
