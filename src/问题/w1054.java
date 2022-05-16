package Œ Ã‚;

import java.util.Scanner;

public class w1054 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n = sc.nextInt();
		int zu[]=new int[n];
		int i, j,ji=0,ou=0;
		for(i=0;i<zu.length;i++){
			zu[i]=sc.nextInt();
		}
		for(j=0;j<zu.length;j++){
			if(zu[j]%2!=0){
				ji=ji+zu[j];
			}
			else{
				ou=ou+zu[j];
			}
		}
		System.out.println(ji+"\n"+ou);
		sc.close();
	}

}
