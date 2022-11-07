package problem;

import java.util.Scanner;

public class W1048 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		if (t == 12) {
			String b = new String("AM");
			String p = sc.next();
			int h = sc.nextInt();
			int m = sc.nextInt();
			int s = sc.nextInt();

			if (p.equals(b)) {
				System.out.println(h + ":" + m + ":" + s);
			} else {
				h = h + 12;
				System.out.println(h + ":" + m + ":" + s);
			}
		}
		if (t == 24) {
			int h = sc.nextInt();
			int m = sc.nextInt();
			int s = sc.nextInt();
			String p1 = "AM";
			String p2 = "PM";
			if (h <= 12) {
				System.out.println(p1 + " " + h + ":" + m + ":" + s);
			} else if (h > 12 && h < 24) {
				h = h - 12;
				System.out.println(p2 + " " + h + ":" + m + ":" + s);
			} else {
				h = h - 12;
				System.out.println(p1 + " " + h + ":" + m + ":" + s);
			}
		}
		sc.close();
	}
}
