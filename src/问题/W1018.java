package ÎÊÌâ;

import java.util.Scanner;

public class W1018 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = n / 10 / 10;
		int b = n / 10 % 10;
		int c = n % 10;
		sc.close();
		int max;
		int middle;
		int min;
		if (a > b && b > c) {
			max = a;
			middle = b;
			min = c;
			System.out.println(max * 100 + middle * 10 + min);
		} else if (a > c && c > b) {
			max = a;
			middle = c;
			min = b;
			System.out.println(max * 100 + middle * 10 + min);
		} else if (b > a && a > c) {
			max = b;
			middle = a;
			min = c;
			System.out.println(max * 100 + middle * 10 + min);
		} else if (b > c && c > a) {
			max = b;
			middle = c;
			min = a;
			System.out.println(max * 100 + middle * 10 + min);
		} else if (c > a && a > b) {
			max = c;
			middle = a;
			min = b;
			System.out.println(max * 100 + middle * 10 + min);
		} else {
			max = c;
			middle = b;
			min = a;
			System.out.println(max * 100 + middle * 10 + min);
		}
	}
}