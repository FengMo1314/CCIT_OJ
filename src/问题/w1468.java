package 问题;

import java.util.Scanner;

public class w1468 {
	//词组缩写
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] a = new String[n];
		sc.nextLine();
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextLine();
		}
		for (int i = 0; i < a.length; i++) {
			a[i] = a[i].trim();//去除a[i]两端的空格
			String[] temp = a[i].split(" +");
			for (String element : temp) {
				char first = element.charAt(0);
				if (first >= 'A' && first <= 'Z') {
					System.out.print(first);
				} else if (first >= 'a' && first <= 'z') {
					System.out.print((char) (first - ('a' - 'A')));
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
