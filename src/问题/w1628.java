package 问题;

import java.util.Scanner;

public class w1628 {
	// 地图——矩形或正方形，建立平面坐标，以坐标点上的值设置阻碍
	static int[][] a = new int[30][30];
	// 制作标记位v——以便记录是否已经用过
	static int[][] v = new int[30][30];
	static int m, n;// 实际地图要求
	static int sum = 0;// 计数器——记录走出迷宫的方法

	// 从地图的[x,y]开始(即入口坐标)
	private static void dfs(int x, int y) {
		// 出口——x=m,y=n.
		if (x == m && y == n) {
			sum++;
			return;
		}
		// 越界则返回——
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
