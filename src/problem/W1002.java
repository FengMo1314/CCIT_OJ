package problem;

import java.util.Scanner;

public class W1002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = (a + b) * (a - b);
		System.out.println(c);
		sc.close();
	}
}
