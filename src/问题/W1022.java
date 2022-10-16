package Œ Ã‚;

import java.util.Scanner;

public class W1022 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long n=sc.nextInt();
		if((n%4==0&&n%100!=0)||n%400==0){
			System.out.println("Yes");
		}
		else{
		System.out.println("No");
		}
		sc.close();
	}
}
