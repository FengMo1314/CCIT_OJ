package Œ Ã‚;

import java.util.Scanner;

public class w1007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int a = x / 10 / 10 / 10;
		int b = x / 10 / 10 % 10;
		int c = x / 10 % 10;
		int d = x % 10;
		int e = d * 1000 + c * 100 + b * 10 + a;
		System.out.println(e);
		sc.close();
	}

}
