package problem;

import java.util.Scanner;

public class W1048N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String p = sc.next();
		int h = sc.nextInt();
		int m = sc.nextInt();
		int s = sc.nextInt();
		sc.close();
		if (t == 12) {
			h = h + 12;
			System.out.println(h + ":" + m + ":" + s);
		} else if (t == 24) {
			if (h <= 12)
				p = "AM";
			System.out.println(p + " " + h + ":" + m + ":" + s);
		} else if (h > 12 && h < 24) {
			h = h - 12;
			p = "PM";
			System.out.println(p + " " + h + ":" + m + ":" + s);
		} else if (h == 24) {
			h = h - 12;
			p = "AM";
			System.out.println(p + " " + h + ":" + m + ":" + s);
		}
	}
}
