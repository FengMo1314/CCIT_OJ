package problem;

import java.util.Scanner;

public class W1031 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = 1;
		sc.close();
		for (int i = 1; i <= n; i++) {
			t = t * i;
		}
		System.out.println(t);
	}

}
