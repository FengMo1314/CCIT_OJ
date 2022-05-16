package 问题;

import java.util.Scanner;

public class w1108N {
          //运行错误——调用限制函数
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		int len = s2.length(), sum = 0;
		sc.close();
		for (int i = 0; i < s1.length() - 1; i++) {
			if (s1.substring(i, i + len).equals(s2)) {
				sum++;
			}
		}
		System.out.println(sum);
	}

}
