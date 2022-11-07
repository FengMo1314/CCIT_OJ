package problem;

import java.util.Scanner;

public class W1187 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String z = sc.next();
		StringBuffer sb = new StringBuffer(z);
		sb.reverse();
		if (z.equals(sb.toString())) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		sc.close();
	}

}
