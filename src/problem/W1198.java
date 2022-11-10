package problem;

import java.util.Scanner;

public class W1198 {

	private static Scanner sc;

	public static String fenJie(int num) {
		StringBuffer sb = new StringBuffer(num + "=");
		int i = 2;
		while (i <= num) {
			if (num % i == 0) {
				sb.append(i + "*");
				num = num / i;
				i = 2;
			} else {
				i++;
			}
		}
		return sb.toString().substring(0, sb.toString().length() - 1);
	}

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int i, j;
		for (i = a; i <= b; i++) {
			j = 1;
			while (j <= Math.sqrt(i)) {
				if (i % j == 0) {
					System.out.println(fenJie(i));
					break;
				} else {
					System.out.println(i + "=" + i);
				}
				j++;
			}
		}
		sc.close();
	}

}
