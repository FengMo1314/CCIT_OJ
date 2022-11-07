package problem;

import java.util.Scanner;

public class W1657 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] a = new int[m][n];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		int max = a[0][0], min = a[0][0];
		for (int[] element : a) {
			for (int element2 : element) {
				if (element2 < min) {
					min = element2;
				}
				if (element2 > max) {
					max = element2;
				}
			}
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] == max) {
					a[i][j] = min;
				} else if (a[i][j] == min) {
					a[i][j] = max;
				}
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
