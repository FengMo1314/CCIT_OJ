package problem;

import java.util.Scanner;

public class W1025 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s;
		int f;
		int m;
		sc.close();
		if (n >= 0 && n < 86400) {
			s = n / 3600;
			f = (n - s * 3600) / 60;
			m = (n - s * 3600 - f * 60);
			if (s < 10 && f < 10 && m < 10) {
				System.out.println("0" + s + ":" + "0" + f + ":" + "0" + m);
			} else if (s < 10 && f < 10 && m >= 10) {
				System.out.println("0" + s + ":" + "0" + f + ":" + m);
			} else if (s < 10 && f >= 10 && m < 10) {
				System.out.println("0" + s + ":" + f + "0" + ":" + m);
			} else if (s < 10 && f >= 10 && m >= 10) {
				System.out.println("0" + s + ":" + f + ":" + m);
			} else if (s > 9 && f < 10 && m < 10) {
				System.out.println(s + ":" + "0" + f + ":" + "0" + m);
			} else if (s > 9 && f < 10 && m >= 10) {
				System.out.println(s + ":" + "0" + f + ":" + m);
			} else if (s > 9 && f >= 10 && m <= 10) {
				System.out.println(s + ":" + f + ":" + "0" + m);
			} else {
				System.out.println(s + ":" + f + ":" + m);
			}
		} else {
			System.out.println("输入非法");
		}
	}
}
