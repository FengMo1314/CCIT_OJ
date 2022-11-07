package problem;

import java.util.Scanner;

public class W1120 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		sc.close();
		while (n != 1 && sum <= 1000) {
			if (n % 2 == 0) {
				n = n / 2;
			} else {
				n = n * 3 + 1;
			}
			sum = sum + 1;
		}
		System.out.println(sum);
	}

}
