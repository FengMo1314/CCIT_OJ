package Œ Ã‚;


import java.util.Scanner;

public class w1511 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int number = sc.nextInt();
		int[] a = new int[n];
		int m=0,temp=0;
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a.length-1-i;j++){
				if(a[j]<a[j+1]){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int i=0;i<=a.length;i++){
			if(a[i]==number){
				m=i;
				break;
			}
		}

System.out.println(m+1);
		sc.close();
	}
}
