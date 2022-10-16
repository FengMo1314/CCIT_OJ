package Œ Ã‚;

import java.util.Scanner;

public class W1032 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		double sum = 1;
		int a = 1,b=2;
		for (int i = 1; i <n; i++) {
			sum = sum + (double) a / b;
			int c=a+b;
			a=b;
			b=c;
		}
		System.out.printf("%.3f",sum);
	}

}
