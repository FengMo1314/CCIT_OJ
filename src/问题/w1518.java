package Œ Ã‚;

import java.util.Arrays;
import java.util.Scanner;

public class w1518 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int[] temp=new int[1000];
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		int []b=new int[temp.length];
		int m=0;
		Arrays.sort(a);
		for(int i=0;i<a.length;i++){
			temp[a[i]]++;
		}
		for(int i=0;i<temp.length;i++){
			if(temp[i]!=0){
				b[m]=i;
				m++;
			}

		}

      System.out.println(m);
      for(int i=0;i<m;i++){
    	  System.out.println(b[i]);
	}
      sc.close();
	}
}
