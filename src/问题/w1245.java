package Œ Ã‚;

import java.util.Scanner;

public class w1245 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		String c=sc.next();
		int rest;
		switch(c){
		case "+":rest=a+b;
		System.out.println(rest);
		break;
		case  "-":rest=a-b;
		System.out.println(rest);
		break;
		case "*":rest=a*b;
		System.out.println(rest);
		break;
		case "/":rest=a/b;
		System.out.println(rest);
		break;
		case "%":rest=a%b;
		System.out.println(rest);
		break;
		//System.exit(0);
		}
        sc.close();
	}

}
