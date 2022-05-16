package Œ Ã‚;

import java.util.Scanner;

public class w1129 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		for(int i=1;i<=n;i++){
			for(int t=1;t<=n-i;t++){
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++){
			       int k=j;
					System.out.print(k);
			}
			System.out.println();
		}

	}

}
