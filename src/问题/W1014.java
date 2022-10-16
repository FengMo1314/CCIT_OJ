package ÎÊÌâ;

import java.util.Scanner;

public class W1014 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a>=86){
			System.out.println("VERY GOOD");
		}
		else if(a>=60&&a<=85){
			System.out.println("GOOD");
		}
		else{
			System.out.println("BAD");
		}
		sc.close();
	}

}
