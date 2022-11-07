package problem;

import java.util.Scanner;

public class W1183 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		if (n == 1) {
			System.out.println(1);
		} else {
			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					sum++;
				}
			}
			System.out.println(sum + 2);
			sc.close();
		}
	}
}
