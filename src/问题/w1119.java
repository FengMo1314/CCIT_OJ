package ����;

import java.util.Scanner;

public class w1119 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n1 = n;
		int i, sum = 0, sum1 = 0, s = 1, temp = 0;
		sc.close();
		while (n != 0) {
			n = n / 10;
			sum++;
		}// sumͳ�������nΪ��λ��
		//System.out.println(n);��ʱn=0(�����Ѿ��ı�)��
		for (i = 0; i < sum; i++) {
			temp = n1 / s % 10;
			s = s * 10;
			sum1 = sum1 + temp;
			// System.out.println(temp);
		}
		System.out.println(sum1);
	}

}
