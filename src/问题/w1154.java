package Œ Ã‚;

import java.util.Scanner;

public class w1154 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int i,  t, sum = 0;
		for (i = 0; i <=n; i++) {
		t = i;
		while (t >0) {
					if (t%10== x) {
						sum++;
					}
					t = t / 10;
				}

			}
		sc.close();
		System.out.println(sum);
	}

}
