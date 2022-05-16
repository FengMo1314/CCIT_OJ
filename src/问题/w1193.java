package Œ Ã‚;

import java.util.Scanner;

public class w1193 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i < m + n; i++) {
			if (i + m > n && i + n > m) {
				sum++;
			}
		}
		System.out.println(sum);
		sc.close();
	}

}
