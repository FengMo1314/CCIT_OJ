package Œ Ã‚;

import java.util.Scanner;

public class w1009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI = 3.14;
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		double c = 2 * PI * r;
		double s = PI * r * r;
		System.out.printf("%.2f", s);
		System.out.println();
		System.out.printf("%.2f", c);
		sc.close();
	}

}
