package problem;

import java.util.Scanner;

public class W1045 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int inde = s.indexOf("+");
		String a = s.substring(0, inde);
		String b = s.substring(inde + 1);
		int m = Integer.parseInt(a);
		int n = Integer.parseInt(b);
		System.out.println(m + n);
		sc.close();
	}

}
