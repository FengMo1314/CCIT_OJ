package 问题;

import java.util.Scanner;

public class w1003 {
	// 半斤八两
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int metal = sc.nextInt();// 输入斤数
		int some = sc.nextInt();// 输入两数
		int c = metal * 10 + some;
		int d = c / 16;// 十六两一斤的斤数
		int e = c % 16;// 十六两一斤的两数
		System.out.println(d);
		System.out.println(e);
		sc.close();
	}

}
