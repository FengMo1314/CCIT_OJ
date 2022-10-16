package 问题;

import java.util.Scanner;

public class w1528_2 {
	static int n;
	static long[] a=new long[105];
	//斐波那切数列第n项
	static long dfs(int n){
		if(n==0||n==1){
			return 1;
		}
		//查看第N项是否被计算过
		if(a[n]!=0){//计算过则返回原值
			return a[n];
		}

		//如果第n项没有被计算过，那么继续计算，
		a[n]= dfs(n-1)+dfs(n-2);
		return a[n];
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		a[0]=a[1]=1;
		System.out.println(dfs(n));
				sc.close();
	}

}
