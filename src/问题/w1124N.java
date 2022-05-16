package 问题;

import java.util.Scanner;
      //时间超限
public class w1124N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long sum = 1, end = 0;
		sc.close();
		for (int i = 1; i <= n; i++) {
			sum = sum * i;	
			if (sum%10 == 0) {
				while(sum%10==0){
				sum= sum/ 10;
				end++;
				}
			}
		}
		System.out.println(end);
	}

}
