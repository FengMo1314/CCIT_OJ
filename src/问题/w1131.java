package Œ Ã‚;

import java.util.Scanner;

public class w1131 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int i,j,k;
		for(i=1;i<=n;i++){
			for(j=1;j<=n-i;j++){
				System.out.print(" ");
			}
			for(j=1;j<=2*i-1;j++){
				k=i;
				System.out.print(k);
			
			}
			System.out.println();
		}
		
	}

}
