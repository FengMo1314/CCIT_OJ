package ÎÊÌâ;

import java.util.Scanner;

public class w1020 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner m=new Scanner(System.in);
		double a=m.nextDouble();
		double b=m.nextDouble();
		double c=m.nextDouble();
		if ((a+b)>c&&(b+c)>a&&(a+c)>b){
		System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
		m.close();
	}
}
