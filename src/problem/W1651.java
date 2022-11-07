package problem;

import java.util.Scanner;

public class W1651 {
	// 二维数组最值
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] a = new int[n][m];
		int max = -1;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for (int[] element : a) {
			for (int j = 0; j < element.length; j++) {
				if (element[j] > max) {
					max = element[j];
				}
			}
		}
		System.out.println(max);
		sc.close();
	}

}
