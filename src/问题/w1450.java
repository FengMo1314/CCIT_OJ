package Œ Ã‚;

import java.util.Arrays;
import java.util.Scanner;

public class w1450 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		for (int element : a) {
			System.out.print(element+"\t");
		}
sc.close();
	}

}
