package problem;

import java.util.Scanner;

public class W1118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int sum = 0, n = 1, i = 1;
		sc.close();
		while (n <= m) {
			n = n + i;
			i = i + 2;
			sum++;
		}
		System.out.println(sum);

	}

}
