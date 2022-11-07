package problem;

import java.util.Scanner;

public class W1658 {
	// 将矩阵的右上部分变为0
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = new int[n][n];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a[i].length; j++) {
				a[i][j] = 0;
			}
		}
		for (int[] element : a) {
			for (int j = 0; j < element.length; j++) {
				System.out.print(element[j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
