package 问题;

import java.util.Scanner;

public class w1116 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n[] = new int[20];//创建数组并指定长度
		int zheng = 0;
		int zero = 0;
		int fu = 0;

		for (int i = 0; i < 20; i++) {
			n[i] = sc.nextInt();
			if (n[i] > 0) {
				zheng = zheng + 1;
			} else if (n[i] == 0) {
				zero = zero + 1;
			} else {
				fu = fu + 1;
			}
		}
		System.out.println(zheng + " " + zero + " " + fu);
	}

}
