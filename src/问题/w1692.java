package ����;

import java.util.Scanner;

public class w1692 {
	// T1692
	static Scanner sc=new Scanner(System.in);
	static int n=sc.nextInt();
	static int[] a = new int[100];

	// �������a�ĵ�k������
	static void fun(int k) {
		
		//���߽������� ���k=n+1��
		if (k == n + 1) {
			for (int i = 1; i < k; i++) {
				System.out.print(a[i]);
			}
			System.out.println();
			return;
		}
		//��1~n����ѡһ����
		for (int i = 1; i <= n; i++) {
			//
			a[k] = i;
			// ���K+1������
			fun(k + 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 fun(1);//�ӵ�K�����ӿ�ʼ��
	}

}
