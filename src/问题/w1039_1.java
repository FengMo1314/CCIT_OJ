package ����;

import java.util.Scanner;

public class w1039_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int  sum = 0;
		for (int i = 1; i <= n; i++) {
			int temp=i;//��temp����i(��Ҫ���������)�������򣬽�����ѭ��
			if (temp % 5 == 0) {
				while (temp != 0) {
					if (temp%10 == 5) {
						sum++;
						break;
					}
					temp= temp/ 10;
				}
			}
		}
		System.out.println(sum);
		sc.close();
	}
}
