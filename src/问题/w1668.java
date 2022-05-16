package Œ Ã‚;

import java.util.Scanner;

public class w1668 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] a = s.split(" ");
		int rest = 0;
		boolean b = false;
		for (int i = 0; i < a.length; i++) {
			int temp = 0;
			for (int j = 0; j < a[i].length(); j++) {
				char ch = a[i].charAt(j);
				if (ch >= '0' && ch <= '9') {
					temp = temp * 10 + (ch - '0');
					b=true;
				} else  {
					rest = rest + temp;
					temp=0;
					b=false;
				}	
			}
			rest = rest + temp;
		}
		if (b==false) {
		System.out.println("0");
		} else {
			System.out.println(rest);
		}
		sc.close();
	}

}
