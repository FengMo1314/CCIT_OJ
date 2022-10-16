package ÎÊÌâ;

import java.util.Scanner;

public class W1017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int max;
		int middle;
		int min;
		if (a > b&&b>c) {
				max = a;
			middle = b;
			min = c;
			System.out.println(max+" "+middle+" "+min);
		} else if (a > c&&c>b) {
			
				max = a;
			middle = c;
			min = b;
			System.out.println(max+" "+middle+" "+min);
		} else if (b > c&&c>a) {
			
				max = b;
			middle = c;
			min = a;
			System.out.println(max+" "+middle+" "+min);
		} else if (b > a&&a>c) {
			
				max = b;
			middle = a;
			min = c;
			System.out.println(max+" "+middle+" "+min);
		} else if (c > a&&a>b) {
	
				max = c;
			middle = a;
			min = b;
			System.out.println(max+" "+middle+" "+min);
		} else {
				max = c;
			middle = b;
			min = a;
			System.out.println(max+" "+middle+" "+min);
		}
		sc.close();
	}
}
