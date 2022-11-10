package problem;

import java.util.Scanner;

public class W1647 {
	// 二维数组的输入与输出
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] a = new int[n][m];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for (int[] element : a) {
			for (int element2 : element) {
				System.out.print(element2 + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
