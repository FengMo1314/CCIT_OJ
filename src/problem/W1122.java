package problem;

import java.util.Scanner;

public class W1122 {

	public static void main(String[] args) {
		// 最小公倍数——两数之积除以二者的最大公约数的商；
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int j = n * m;
		while ((n - m) != 0) {
			if (n > m) {
				n = n - m;
			} else {
				m = m - n;
			}
		}
		int result = j / m;
		System.out.println(result);
		sc.close();
	}

}
