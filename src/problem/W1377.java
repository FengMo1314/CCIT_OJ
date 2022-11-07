package problem;

import java.util.Scanner;

public class W1377 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int suma = 1, sumb = 1, resta = 0, restb = 0;
		for (int i = 2; i <= Math.sqrt(a); i++) {
			if (a % i == 0) {
				resta = a / i;
				suma = suma + i + resta;
			}

		}
		for (int j = 2; j <= Math.sqrt(b); j++) {
			if (b % j == 0) {
				restb = b / j;
				sumb = sumb + j + restb;
			}
		}
		if (suma == b && sumb == a) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		sc.close();
	}

}
