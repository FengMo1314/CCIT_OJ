package 问题;

import java.util.Scanner;

public class W1010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		double a = (double)9 / 5 * c + 32;//公式中的数据必须强制转换为double型。
		System.out.printf("%.2f", a);
		sc.close();
	}

}
