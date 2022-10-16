package 问题;

import java.util.Scanner;

public class w1121 {

	public static void main(String[] args) {
		//更相减损术
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
		/*穷举法——如果大数可以整除小数，那么最大公约数为小数
		 如果不能整除小数，则这两个数就按大到小依次对比较小数小的数求余；
		 一遇到能够整除的，则就是最大公约数。
		  */
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		if(m>=n){
			for(int i=n;i>=1;i--){
				if(m%i==0&&n%i==0){
					System.out.println(n);//此时m和n都是i的倍数。
					break;
				}
			}
		}
		else{
			for(int j=m;j>=1;j--){
				if(m%j==0&&n%j==0){
					System.out.println(n);//此时m和n都是i的倍数。
					break;
				}
			}
		}
		sc.close();
	}
	public void zhanZhuanXiangChu(){
		/*辗转相除法——用大数对小数求余，若余数为0，则除数为最大公约数。
		  不为0，则将此余数作为除数，较小的数作为被除数，重新求余，直到余数为0.
		  此时的余数即为最大公约数。
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
