package ����;

import java.util.Scanner;

public class w1260 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����������¶���
		Scanner sc = new Scanner(System.in);
		// ��������
		// System.out.println("���������ʣ�");
		double x = sc.nextDouble();

		// �������������Ľ���
		double p1 = (double) (x * 0.1);
		double p2 = (double) (100000* 0.1) + (double) ((x - 100000) * 0.075);
		double p3 = (double) (100000* (0.1+0.075))+ (double) ((x - 200000) * 0.05);
		double p4 = (double) (100000* (0.1+0.075))+(double)(200000*(0.05+0)) + (double) ((x - 400000) * 0.03);
		double p5 = (double) (100000* (0.1+0.075))+(double)(200000*(0.05+0.03)) + (double) ((x - 600000) * 0.015);
		double p6 = (double) (100000* (0.1+0.075))+(double)(200000*(0.05+0.03))+(double)(400000*(0.015+0)) + (double) ((x - 1000000) * 0.01);

		// �ж���������Ӧ�����ʣ����������
		if (x <= 100000) {
			System.out.printf("%.2f",p1);
		} else if (x > 100000 && x <= 200000) {
			System.out.printf("%.2f",p2);
		} else if (x > 200000 && x <= 400000) {
			System.out.printf("%.2f",p3);
		} else if (x > 400000 && x <= 600000) {
			System.out.printf("%.2f",p4);
		} else if (x > 600000 && x <= 1000000) {
			System.out.printf("%.2f"+p5);
		} else if (x > 1000000) {
			System.out.printf("%.2f",p6);
		}
		sc.close();
	}

}
