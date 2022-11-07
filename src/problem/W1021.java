package problem;

import java.util.Scanner;

public class W1021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		if (a + b > c && b + c > a && a + c > b) {
			// int max=0;
			int d, e;
			if (a > b) {
				// max = a;
				d = b * b + c * c;
				e = a * a;
			} else if (b > c) {
				// max = b;
				d = a * a + c * c;
				e = b * b;
			} else {
				// max = c;
				d = a * a + b * b;
				e = c * c;
			}
			if (d > e) {
				System.out.println("ruijiao");
			} else if (d == e) {
				System.out.println("zhijiao");
			} else {
				System.out.println("dunjiao");
			}
		} else {
			System.out.println("no");
		}
		sc.close();
	}
}
