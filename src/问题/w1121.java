package ����;

import java.util.Scanner;

public class w1121 {

	public static void main(String[] args) {
		//���������
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n=sc.nextInt();
		while((m-n)!=0){
			if(m>n){
				m=m-n;
			}
			else{
				n=n-m;
			}
		}
       System.out.println(m);
       sc.close();
	}
	public void qiongJu(){
		/*��ٷ��������������������С������ô���Լ��ΪС��
		 �����������С���������������Ͱ���С���ζԱȽ�С��С�������ࣻ
		 һ�����ܹ������ģ���������Լ����
		  */
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		if(m>=n){
			for(int i=n;i>=1;i--){
				if(m%i==0&&n%i==0){
					System.out.println(n);//��ʱm��n����i�ı�����
					break;
				}
			}
		}
		else{
			for(int j=m;j>=1;j--){
				if(m%j==0&&n%j==0){
					System.out.println(n);//��ʱm��n����i�ı�����
					break;
				}
			}
		}
		sc.close();
	}
	public void zhanZhuanXiangChu(){
		/*շת����������ô�����С�����࣬������Ϊ0�������Ϊ���Լ����
		  ��Ϊ0���򽫴�������Ϊ��������С������Ϊ���������������ֱ࣬������Ϊ0.
		  ��ʱ��������Ϊ���Լ����
		 */
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		if(m>=n){
			int temp=m%n;
			while(temp!=0){
				m=n;
				n=temp;
				temp=m%n;
			}
			System.out.println(n);
		}
		else{
			int temp1=n%m;
			while(temp1!=0){
				n=m;
				m=temp1;
				temp1=n%m;
			}
			System.out.println(m);
		}
		sc.close();
	}
}
