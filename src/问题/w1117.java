package ����;

import java.util.Scanner;

public class w1117 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		int big = 0;//��д��ĸ������
		int smal = 0;//Сд��ĸ������
		sc.close();
		for (int i = 0; i < n.length(); i++) {
			char ch = n.charAt(i);//��ȡÿһ����ĸ
			if (ch >= 'a' && ch <= 'z') {
				smal = smal + 1;
			} else if (ch >= 'A' && ch <= 'Z') {
				big = big + 1;
			}
		}
		System.out.println(big);
	}

}
