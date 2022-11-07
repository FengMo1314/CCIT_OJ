package problem;

import java.util.Scanner;

public class W1694 {
	static Scanner sc = new Scanner(System.in);
	static int n = sc.nextInt();
	static int[] a = new int[100];
	static int[] v = new int[100];

	// 填充数组a的第k个格子
	static void fun(int k) {

		// （边界条件） 如果k=n+1，
		if (k == n + 1) {
			for (int i = 1; i < k; i++) {
				System.out.print(a[i]);
			}
			System.out.println();
			return;
		}
		// 从1~n中挑选一个填
		for (int i = 1; i <= n; i++) {
			// 如果内容值未被使用过——即标记为0时
			if (v[i] == 0) {
				a[k] = i;
				v[i] = 1;

				// 填充K+1个格子
				fun(k + 1);
				// 标记恢复——下一次时各个格子数值重新开始。
				v[i] = 0;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun(1);// 从第K个格子开始填
	}

}
