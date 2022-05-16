package Œ Ã‚;

import java.util.Scanner;

public class w1137 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        int m[]=new int[n];
        int temp=0;
        for(int i=0;i<m.length;i++){
        	m[i]=sc.nextInt();
        	 //System.out.println(m[i]);
        }
        for(int j=0;j<m.length;j++){
        	temp=m[j];
            temp=m[n-1-j]; 
            System.out.print(temp+" ");
        }
        sc.close();
	}

}
