package ÎÊÌâ;

import java.util.Scanner;

public class w1015 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int max;
		if (a > b) {
			max = a;
		} else if (b > c) {
			max = b;
		} else {
			max = c;
		}
		System.out.println(max);
		sc.close();
	}

}
