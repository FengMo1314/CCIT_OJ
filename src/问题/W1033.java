package Œ Ã‚;

import java.util.Scanner;

public class W1033 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int t=1;
        sc.close();
        for(int i=1;i<=n;i++){
        	t=t*i;
        	sum=sum+t;
        }
        System.out.println(sum);
	}

}
