package Œ Ã‚;

import java.util.Scanner;

public class w1049 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] n=new int[3];
		for(int i=0;i<n.length;i++){
			n[i]=sc.nextInt();
		}
		for(int i=0;i<n.length-1;i++){
			for(int j=0;j<n.length-1-i;j++){
				if(n[j]<=n[j+1]){
					int temp=n[j];
					n[j]=n[j+1];
					n[j+1]=temp;
				}
			}
		}
		int h=n[0]-(n[1]+n[2]);
		if(h>0){
			System.out.println(h);
		}else{
			System.out.println(-h);
		}
sc.close();
	}

}
