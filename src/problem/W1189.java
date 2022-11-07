package problem;

import java.util.Scanner;

public class W1189 {
	static boolean huiWen(String s) {
		if (s.length() == 0 || s.length() == 1) {
			return true;
		}
		char start = s.charAt(0);
		char end = s.charAt(s.length() - 1);
		if (start == end && huiWen(s.substring(1, s.length() - 1))) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			String s = Integer.toString(i);// intתString
			if (huiWen(s)) {
				sum++;
			}
		}
		System.out.println(sum);
		sc.close();
	}

}
