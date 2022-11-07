package problem;

import java.util.Scanner;

public class W1113 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		sc.close();
		for (int i = 100; i <= n; i++) {
			int b = i / 100;
			int s = i / 10 % 10;
			int g = i % 10;
			int amst = b * b * b + s * s * s + g * g * g;// 阿姆斯特朗数如：407=4^3+0^3+7^3.
			if (i == amst) {
				sum = sum + 1;
			}
		}
		System.out.println(sum);
	}

}
