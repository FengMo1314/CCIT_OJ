package ����;

import java.util.Scanner;

public class w1003 {
	// ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int metal = sc.nextInt();// �������
		int some = sc.nextInt();// ��������
		int c = metal * 10 + some;
		int d = c / 16;// ʮ����һ��Ľ���
		int e = c % 16;// ʮ����һ�������
		System.out.println(d);
		System.out.println(e);
		sc.close();
	}

}
