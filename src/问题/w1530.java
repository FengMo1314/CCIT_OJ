package ÎÊÌâ;

import java.util.Scanner;

public class w1530 {
	static void xin(int n) {

		if(n==0){
			return;
		}

		for (int i = 0; i < n; i++) {
			System.out.print("*");
		}
		System.out.println();
		xin(n - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		xin(n);
		sc.close();
	}

}
