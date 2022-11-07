package problem;

import java.util.Scanner;

public class W1082 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		int zhuan = 0;
		if (a + b + c == 180) {
			if (a > b) {
				zhuan = a;
				a = b;
				b = zhuan;
			}
			if (b > c) {
				zhuan = b;
				b = c;
				c = zhuan;
			}
			if (c > a) {
				zhuan = c;
				c = a;
				a = zhuan;
			}
			if (zhuan < 90) {
				System.out.println("ruijiao");
			} else if (zhuan == 90) {
				System.out.println("zhijiao");
			} else {
				System.out.println("dunjiao");
			}
		} else {
			System.out.println("impossible");
		}

	}

}
