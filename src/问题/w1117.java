package 问题;

import java.util.Scanner;

public class w1117 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		int big = 0;//大写字母计数器
		int smal = 0;//小写字母计数器
		sc.close();
		for (int i = 0; i < n.length(); i++) {
			char ch = n.charAt(i);//提取每一个字母
			if (ch >= 'a' && ch <= 'z') {
				smal = smal + 1;
			} else if (ch >= 'A' && ch <= 'Z') {
				big = big + 1;
			}
		}
		System.out.println(big);
	}

}
