package Œ Ã‚;

import java.util.Scanner;

public class W1036 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		sc.close();
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 2 && i % 5 == 3 && i % 7 == 2) {
				sum++;
			}// else {
				//sum = sum;
			//}
		}
		System.out.println(sum);
	}

}
