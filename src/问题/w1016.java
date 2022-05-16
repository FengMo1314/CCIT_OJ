package ÎÊÌâ;

import java.util.Scanner;

public class w1016 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int where;
		if (a > b && b > c||b>a&&a>c) {
			where = 3;
		} else if (a > c && c > b||c > a && a > b) {
			where = 2;
		} else if (b > c && c > a) {
			where = 1;
		} else {
			where = 1;
		}
		System.out.println(where);
	}
}
