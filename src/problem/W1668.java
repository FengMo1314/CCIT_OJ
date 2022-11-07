package problem;

import java.util.Scanner;

public class W1668 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] a = s.split(" ");
		int rest = 0;
		boolean b = false;
		for (String element : a) {
			int temp = 0;
			for (int j = 0; j < element.length(); j++) {
				char ch = element.charAt(j);
				if (ch >= '0' && ch <= '9') {
					temp = temp * 10 + (ch - '0');
					b = true;
				} else {
					rest = rest + temp;
					temp = 0;
					b = false;
				}
			}
			rest = rest + temp;
		}
		if (!b) {
			System.out.println("0");
		} else {
			System.out.println(rest);
		}
		sc.close();
	}

}
