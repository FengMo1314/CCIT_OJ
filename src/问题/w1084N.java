package Œ Ã‚;

import java.util.Scanner;

public class w1084N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		// int[] t = new int[180];
		int[] b = new int[180];
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		/*
		 * for (int i = 0; i < a.length ; i++) { for (int j = i+1; j < a.length
		 * ; j++) { for(int k=j+1;k<a.length;k++){ if(a[i]+a[j]+a[k]==180){
		 * sum++; } } } }
		 */
		for (int i = 0; i < a.length; i++) {
			b[a[i]]++;
		}

		for (int i = 0; i < b.length; i++) {
			if (b[i] != 0) {
				for (int j = i + 1; j < b.length; j++) {
					if (b[j] != 0) {
						for (int k = j + 1; k < b.length; k++) {

							if (i + j + k == 180) {
								// if (i + j + k == 180) {
								sum++;
								// }
							}
						}
					}
				}
			}
		}
		// for(int i=0;i<=b.length;i++){
		// if(b[i]>0){
		// for(int j=i+1;j<=b.length;j++){
		// if(b[j]>0){
		// int k=180-i-j;
		// if(b[k]>0&&k>j){
		// sum++;
		// }
		// }
		// }
		// }
		// }
		System.out.println(sum);
	}
}
