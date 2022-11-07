package problem;

import java.util.Scanner;

public class W1191 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] temp = new int[2010];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for (int j = 0; j < a.length; j++) {
			temp[a[j]]++;
		}
		int max = temp[0];
		for (int element : temp) {
			if (element > max) {
				max = element;
			}
		}
		for (int i = 0; i < temp.length; i++) {
			if (temp[i] == max) {
				System.out.println(i);
				break;
			}
		}
		System.out.println(max);
		for (int j = 0; j < temp.length; j++) {
			if (temp[j] != 0) {
				for (int i = 1; i <= temp[j]; i++) {
					System.out.print(j + " ");
				}
			}
		}
		sc.close();
	}

}
