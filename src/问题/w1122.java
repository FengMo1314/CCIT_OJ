package ����;

import java.util.Scanner;

public class w1122 {

	public static void main(String[] args) {
		// ��С��������������֮�����Զ��ߵ����Լ�����̣�
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int j=n*m;
		while((n-m)!=0){
			if(n>m){
				n=n-m;
			}
			else{
				m=m-n;
			}
		}
         int result=j/m;
         System.out.println(result);
         sc.close();
	}

}
