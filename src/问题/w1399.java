package Œ Ã‚;

import java.util.Scanner;

public class w1399 {

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
		for (int j = 0; j < a.length; j++) {
			sum = sum + a[j];
		}
		sum=sum/n;
		System.out.println(sum);
	}
}
