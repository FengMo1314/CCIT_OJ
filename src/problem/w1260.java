package problem;

import java.util.Scanner;

public class w1260 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创建输入的新对象
		Scanner sc = new Scanner(System.in);
		// 输入利率
		// System.out.println("请输入利率：");
		double x = sc.nextDouble();

		// 计算相对于区间的奖金
		double p1 = x * 0.1;
		double p2 = 100000 * 0.1 + (x - 100000) * 0.075;
		double p3 = 100000 * (0.1 + 0.075) + (x - 200000) * 0.05;
		double p4 = 100000 * (0.1 + 0.075) + 200000 * (0.05 + 0) + (x - 400000) * 0.03;
		double p5 = 100000 * (0.1 + 0.075) + 200000 * (0.05 + 0.03) + (x - 600000) * 0.015;
		double p6 = 100000 * (0.1 + 0.075) + 200000 * (0.05 + 0.03) + 400000 * (0.015 + 0) + (x - 1000000) * 0.01;

		// 判断利率所对应的利率，并输出奖金
		if (x <= 100000) {
			System.out.printf("%.2f", p1);
		} else if (x > 100000 && x <= 200000) {
			System.out.printf("%.2f", p2);
		} else if (x > 200000 && x <= 400000) {
			System.out.printf("%.2f", p3);
		} else if (x > 400000 && x <= 600000) {
			System.out.printf("%.2f", p4);
		} else if (x > 600000 && x <= 1000000) {
			System.out.printf("%.2f" + p5);
		} else if (x > 1000000) {
			System.out.printf("%.2f", p6);
		}
		sc.close();
	}

}
