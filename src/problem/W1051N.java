package problem;

import java.util.Scanner;

public class W1051N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] n = new int[3];
		int max = 0;
		for (int i = 0; i < n.length; i++) {
			n[i] = sc.nextInt();
			if (max < n[i]) {
				max = n[i];
			}
		}
		long s = 1;
		for (int i = 2; i < max; i++) {
			boolean b = false;
			for (int j = 0; j < 3; j++) {
				if (n[j] % i == 0) {
					n[j] = n[j] / i;
					b = true;
				}
			}
			if (b) {
				s *= i;
				i--;
			}
		}
		for (int i = 0; i < 3; i++) {
			s *= n[i];
		}
		System.out.println(s);
		sc.close();
	}

}
