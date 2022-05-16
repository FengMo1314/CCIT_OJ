package Œ Ã‚;

import java.util.Scanner;

public class w1200 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		if(s1.length()!=s2.length()) {
			System.out.println(1);
		}else {
			if(s1.equals(s2)) {
				System.out.println(2);
			}else if(s1.equalsIgnoreCase(s2)) {
				System.out.println(3);
			}else {
				System.out.println(4);
			}
		}
sc.close();
	}

}
