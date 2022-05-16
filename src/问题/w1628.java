package ����;

import java.util.Scanner;

public class w1628 {
	// ��ͼ�������λ������Σ�����ƽ�����꣬��������ϵ�ֵ�����谭
	static int[][] a = new int[30][30];
	// �������λv�����Ա��¼�Ƿ��Ѿ��ù�
	static int[][] v = new int[30][30];
	static int m, n;// ʵ�ʵ�ͼҪ��
	static int sum = 0;// ������������¼�߳��Թ��ķ���

	// �ӵ�ͼ��[x,y]��ʼ(���������)
	private static void dfs(int x, int y) {
		// ���ڡ���x=m,y=n.
		if (x == m && y == n) {
			sum++;
			return;
		}
		// Խ���򷵻ء���
		if (x == 0 || y == 0 || x == m + 1 || y == n + 1) {
			return;
		}
		if (a[x][y] == 1) {
			return;
		}
		if (v[x][y] == 0) {
			v[x][y] = 1;
			dfs(x - 1, y);
			dfs(x, y - 1);
			dfs(x + 1, y);
			dfs(x, y + 1);
			v[x][y] = 0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		n = sc.nextInt();
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		dfs(1, 1);
		System.out.println(sum);
		sc.close();
	}

}
