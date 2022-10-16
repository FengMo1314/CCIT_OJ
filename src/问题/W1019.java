package Œ Ã‚;

import java.util.Scanner;

public class W1019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a == b + 1 && a == c - 1 || b == a + 1 && b == c - 1 || c == a + 1
				&& c == b - 1 || a == b - 1 && a == c + 1 || b == a - 1
				&& b == c + 1 || c == a - 1 && c == b + 1) {
			System.out.println("TRUE");
		} else {
			System.out.println("FALSE");
		}
		sc.close();
	}

}
