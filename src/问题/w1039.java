package Œ Ã‚;

import java.util.Scanner;

public class w1039 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		sc.close();
		for (int i = 1; i <= n; i++) {
			if (i % 5 == 0
					&& (i / 1000%10== 5 || i / 100% 10 == 5
							||  i /10%10 == 5||i%10==5)) {
				sum=sum+1;
			}
		}
		System.out.println(sum);
	}

}
