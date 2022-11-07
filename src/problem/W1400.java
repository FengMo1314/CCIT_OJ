package problem;

import java.util.Scanner;

public class W1400 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int min = sc.nextInt();
		int max = sc.nextInt();
		int factor = sc.nextInt();
		sc.close();
		for (int i = min; i <= max; i++) {
			if (i % factor == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
