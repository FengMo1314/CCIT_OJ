package ����;

import java.util.Scanner;

public class W1528_1 {
	static int n;
	private static Scanner sc;
	static long dfs(int n){
		//��쳲��������е�n��
		if(n==0||n==1){
			return 1;
		}
		return dfs(n-1)+dfs(n-2);
	}

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(dfs(n));

	}

}
