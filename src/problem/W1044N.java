package problem;

import java.util.Scanner;

public class W1044N {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int j, k;
		int n = sc.nextInt();
		int ni[] = new int[n];
		int len = ni.length;
		for (k = 0; k < len; k++) {
			ni[k] = sc.nextInt();
		}
		for (k = 0; k < len; k++) {
			for (j = len - 1; j > k; j--)
				if (ni[j - 1] > ni[j]) {
					int t = ni[j - 1];
					ni[j - 1] = ni[j];
					ni[j] = t;
				}
			for (k = 0; k < len; k++)
				System.out.print(ni[k] + " ");
		}
		sc.close();
	}

}
