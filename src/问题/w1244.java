package Œ Ã‚;

import java.util.Scanner;

public class w1244 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] zu = new int[n];
		int i, j, sum = 0;
		for (i = 0; i < zu.length; i++) {
			zu[i] = sc.nextInt();
		}
		sc.close();
		for (i = 0; i < zu.length; i++) {
			if (zu[i] == 0) {
				sum++;
			}
		}
		int t = 0;
		int[] newzu = new int[zu.length - sum];
		for (i = 0; i < zu.length; i++) {
			if (zu[i] != 0) {
				newzu[t] = zu[i];
				t++;
			}
		}
		for (j = 0; j < newzu.length; j++) {
			System.out.print(newzu[j]+"\t");
		}
		System.out.println();
		System.out.println(newzu.length);
	}

}
