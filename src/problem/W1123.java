package problem;

import java.util.Scanner;

public class W1123 {

	public static boolean isSuShu(int n) {
		int i;
		for (i = 2; i <= n; i++) {
			if (n % i == 0) {
				break;// 非质数
			}
		}
		if (i >= n) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		for (int i = 2; i <= n; i++) {
			if (!isSuShu(i)) {
				continue;
			}
			while (true) {
				if (temp % i == 0) {
					temp = temp / i;
					System.out.println(i);
				} else {
					break;
				}
			}
		}
		sc.close();
	}

}
