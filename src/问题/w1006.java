package Œ Ã‚;

import java.util.Scanner;
public class w1006 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=a%10;
		int c=a/10%10;
		int d=a/10/10;
		int e=d+c*10+b*100;
		System.out.println(e);
		sc.close();
	}
}
