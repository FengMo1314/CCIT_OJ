package Œ Ã‚;

import java.util.Scanner;

public class w1050 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		int sum=0;
		for (int element : a) {
			sum=sum+element;
		}
		if(sum/5<0){
			System.out.println(5);
		}
		if(sum%5==0){
			System.out.println(sum);
		}
		if(sum%5>0){
			System.out.println(sum/5*5+5);
		}
		sc.close();
	}
}
