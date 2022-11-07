package problem;

import java.util.Scanner;

public class W1399 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		for (int element : a) {
			sum = sum + element;
		}
		sum = sum / n;
		System.out.println(sum);
	}
}
