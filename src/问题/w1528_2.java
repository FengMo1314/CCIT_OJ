package ����;

import java.util.Scanner;

public class w1528_2 {
	static int n;
	static long[] a=new long[105];
	//쳲��������е�n��
	static long dfs(int n){
		if(n==0||n==1){
			return 1;
		}
		//�鿴��N���Ƿ񱻼����
		if(a[n]!=0){//������򷵻�ԭֵ
			return a[n];
		}

		//�����n��û�б����������ô�������㣬
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
