package problem;

import java.util.Scanner;

public class W1030 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 1;
		double sum = 0;
		sc.close();
		for (int i = 1; i <= n; i++) {
			sum = sum + (double) a / i;

		}
		System.out.printf("%.3f", sum);
	}

}
