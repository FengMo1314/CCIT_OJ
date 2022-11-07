package problem;

import java.util.Scanner;

public class W1130N {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i, j, t;
		for (i = 1; i <= n + 1; i++) {
			for (j = 1; j <= n + 1 - i; j++) {
				System.out.print(" ");
			}
			for (t = 1; t <= 2 * i - 1; t++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (i = n; i > 0; i--) {

			for (t = n + 1 - i; t > 0; t--) {
				System.out.print(" ");
			}
			for (j = 2 * i - 1; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
