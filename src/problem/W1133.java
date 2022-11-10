package problem;

import java.util.Scanner;

public class W1133 {
	static int m;
	static char a = 'A';

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		m = n;
		ziMu(n);
		sc.close();
	}

	public static void ziMu(int n) {

		if (n == 0) {
			return;
		}
		ziMu(n - 1);
		for (int i = n; i < m; i++) {
			System.out.print(" ");
			a = 'A';
		}
		for (int i = 0; i < 2 * n - 1; i++) {
			System.out.print(a);
			a++;
		}
		System.out.println();
		a = 'A';
	}
}
