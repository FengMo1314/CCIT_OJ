package ����;

import java.util.Scanner;

public class W1035 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ai[]=new int[n];
		double sum=0;
		for(int j=0;j<ai.length;j++){
			 ai[j]=sc.nextInt();
			 sum=sum+ai[j];
		}
		sc.close();
		//System.out.println(sum);
		for(int i=0;i<ai.length-1;i++){
			for(int j=ai.length-1;j>i;j--)
				if(ai[j-1]>ai[j]){
					int t=ai[j-1];
					ai[j-1]=ai[j];
					ai[j]=t;
				}
			//for(i=0;i<ai.length;i++)//----��ѭ�����ÿһ������ai[]�ڰ���С����������ÿһ����
				//System.out.println(ai[i]+" ");
		}
		sum=(sum-ai[0]-ai[n-1])/(n-2);
		System.out.printf("%.2f",sum);

	}

}
