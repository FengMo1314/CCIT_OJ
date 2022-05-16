package Œ Ã‚;

import java.util.Scanner;

public class w1657 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] a = new int[m][n];
		// ???????
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		//???????
		int max = a[0][0], min = a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] < min) {
					min = a[i][j];
				}
				if (a[i][j] > max) {
					max = a[i][j];
				}
			}
		}
		//???????ÔøΩÔøΩ??
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] == max) {
					a[i][j] = min;
				} else if (a[i][j] == min) {
					a[i][j] = max;
				}
			}
		}
		//?????????????
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}


	

