package ????;

import java.util.Scanner;

public class w1029 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		sc.close();
		for (int i = 2; i <= n; i = i + 2) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
}
