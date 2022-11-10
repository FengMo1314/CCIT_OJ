package problem;

import java.util.Scanner;

public class W1530 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		xin(n);
		sc.close();
	}

	static void xin(int n) {

		if (n == 0) {
			return;
		}

		for (int i = 0; i < n; i++) {
			System.out.print("*");
		}
		System.out.println();
		xin(n - 1);
	}

}
