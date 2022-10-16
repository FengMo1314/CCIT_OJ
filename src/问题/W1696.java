package 问题;

import java.util.Scanner;

public class W1696 {
	/*自然数拆分——3=1+1+1；
	                        3=1+2;
	                        3=2+1;
	                        3=3.
	*/
	//货物总量
	static Scanner sc=new Scanner(System.in);
  static  int n=sc.nextInt();

	//火车车厢
	static int[] a=new int[100];
	//把剩余货物left搬运到火车第k节车厢
	static void dfs(int k,int left){
		//边界
		if(left==0){
			System.out.print(n+"=");
			for(int i=1;i<k-1;i++){
				System.out.print(a[i]+"+");
			}
			System.out.print(a[k-1]);
			System.out.println();
			return;
		}
		//把货物量i放到第k节车厢
		for(int i=left;i>=1;i--){
			//如果待放货物量比左侧货物量小
			if(i<=a[k-1]){
				a[k]=i;
				dfs(k+1,left-i);
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     a[0]=1011010;

     dfs(1,n);
	}

}
