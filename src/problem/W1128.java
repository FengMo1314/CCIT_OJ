package problem;

import java.util.Scanner;

public class W1128 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		for (int t = n; t >= 1; t--) {
			for (int c = 1; c <= n - t; c++) {
				System.out.print(" ");
			}
			for (int c = 1; c <= 2 * t - 1; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
