package problem;

import java.util.Scanner;

public class W1141 {
//不管求n得多少（k）次的最后的m位数字，只要每次将n的后m为平方且持续k次（循环变量从1~k即表示执行k次的乘法运算）
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		// if (n < 10) {
		// sum = n;
		// for (int i = 1; i < n; i++) {
		// sum = sum * n % 100;
		// }
		// } else {//
		sum = n % 100;
		for (int j = 1; j < n; j++) {
			sum = sum * n % 100;
			// }
		}
		System.out.println(sum);
		sc.close();
	}

}
