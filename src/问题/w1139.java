package 问题;

import java.util.Scanner;

public class w1139 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n = sc.nextInt();
		int zu[] = new int[n];
		int i, j, sum = 0, sub = 0;// sub默认下标代换量
		double av = 0;
		for (i = 0; i < zu.length; i++) {
			zu[i] = sc.nextInt();
		}
		for (j = 0; j < zu.length; j++) {
			sum = sum + zu[j];
			av = (double) sum / n;
		}
		System.out.printf("AV="+"%.1f",av);
		System.out.println();
		for (i = 0; i < zu.length; i++) {
			if (zu[i] > av) {
				sub = i + 1;
				System.out.print(sub + ":" + zu[i] + " ");
			}
		}

		sc.close();
	}

}
