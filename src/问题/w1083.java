package Œ Ã‚;

import java.util.Scanner;

public class w1083 {
		       public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				int m=sc.nextInt();
				int n=sc.nextInt();
				int h=sc.nextInt();
				sc.close();
				int sum=0;
				int count=1;
				if(m<=n&&m<h){
					System.out.println("impossible");
				}else{
					for(;sum<h-m;sum=sum+m-n){
						count++;
					}
					System.out.println(count);
				}

			}
}
