package problem;

import java.util.Scanner;

public class W1108N {
	// 运行错误——调用限制函数
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		// 匹配的子串在字符串中的下标
		int index = 0;
		// 计算出现的次数
		int count = 0;
//        String findStr = "Hello";
		while ((index = s1.indexOf(s2, index)) != -1) {
//            System.out.print(s1.charAt(index) + " ");
			index += s2.length();
			count++;
		}
		System.out.println(count);

	}

}
