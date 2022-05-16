package Œ Ã‚;

import java.util.Scanner;

public class w1044 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n = sc.nextInt();
		int zu[] = new int[n];
		int i, j, temp = 0;
		for (i = 0; i < zu.length; i++) {
			zu[i] = sc.nextInt();
		}
		for (i = 0; i < zu.length - 1; i++) {
			for (j = 0; j < zu.length - 1 - i; j++) {
				if (zu[j] >zu[j + 1]) {
					temp = zu[j];
					zu[j] = zu[j + 1];
					zu[j + 1] = temp;
				}
			}
		}
		for (i = 0; i < zu.length; i++) {
			System.out.print(zu[i] + " ");
		}
		sc.close();
	}

}
