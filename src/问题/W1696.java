package ����;

import java.util.Scanner;

public class W1696 {
	/*��Ȼ����֡���3=1+1+1��
	                        3=1+2;
	                        3=2+1;
	                        3=3.
	*/
	//��������
	static Scanner sc=new Scanner(System.in);
  static  int n=sc.nextInt();

	//�𳵳���
	static int[] a=new int[100];
	//��ʣ�����left���˵��𳵵�k�ڳ���
	static void dfs(int k,int left){
		//�߽�
		if(left==0){
			System.out.print(n+"=");
			for(int i=1;i<k-1;i++){
				System.out.print(a[i]+"+");
			}
			System.out.print(a[k-1]);
			System.out.println();
			return;
		}
		//�ѻ�����i�ŵ���k�ڳ���
		for(int i=left;i>=1;i--){
			//������Ż���������������С
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
