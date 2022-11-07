package problem;

import java.util.Scanner;

public class W1114 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		// System.out.println(s);
		char bai = s.charAt(0);
		char shi = s.charAt(1);
		// System.out.println(bai);
		int b = sc.nextInt();
		sc.close();
		for (int i = 0; i < 10; i++) {
			int rest = bai * 100 + shi * 10 + i;
			if (rest % b == 0) {
				System.out.println(i);
			}
		}

	}

}
