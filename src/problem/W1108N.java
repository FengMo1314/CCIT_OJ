package problem;

import java.util.Scanner;

public class W1108N {
	// 运行错误——调用限制函数
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		int len = s2.length(), sum = 0;
		sc.close();
		for (int i = 0; i < s1.length(); i++) {
			char a=s1.charAt(i);
			if(i==len) len++;
			for(int j=i;j<len;j++) {
				char b=s2.charAt(j);
				if(a==b) {
					sum++;
				}
			}
		}
		System.out.println(sum);
	}

}
