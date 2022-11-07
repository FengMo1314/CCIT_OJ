package problem;

import java.util.Scanner;

public class W1253 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] a = s.split(" ");// 用“ ”空格为标准，拆分之后储存于a数组中
		int[] temp = new int[a.length];
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i].equals(a[j])) {
					temp[i]++;
				}
			}
			if (temp[i] == 0) {
				sum++;
			}
		}
		System.out.println(sum);
		sc.close();
	}
}
