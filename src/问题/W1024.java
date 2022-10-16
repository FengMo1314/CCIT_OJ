package 问题;

import java.util.Scanner;

public class W1024 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();// 月-m
		int d = sc.nextInt();// 日-d
		int y = sc.nextInt();// 年-y
		sc.close();
		if (m == 12 && d >= 31) {
			y = y + 1;
			m = 1;
			d = 1;
		} else {
			switch (m) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if (d < 31) {
					d = d + 1;
				} else {
					m = m + 1;
					d = 1;
				}

				break;
			case 2:
				if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
					if (d < 29) {
						d = d + 1;
					} else {
						m = m + 1;
						d = 1;
					}
				} else {
					if (d < 28) {
						d = d + 1;
					} else {
						d = 1;
						m = m + 1;
					}
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				if (d < 30) {
					d = d + 1;
				} else {
					d = 1;
					m = m + 1;
				}

			}
		}
		System.out.println(m + "/" + d + "/" + y);
	}
}
