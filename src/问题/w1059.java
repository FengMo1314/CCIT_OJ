/**
 * 
 */
package 问题;

import java.util.Scanner;

/**
 * @author 柳和(本地)
 *
 */
public class w1059 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		while (input.length() >= 1) {
			String rest = "";
			int[] sum = new int[257];
			for (int j = 0; j < input.length(); j++) {
				for (char i = 'a'; i <= 'z'; i++) {
					char chick = input.charAt(j);
					if (chick == i) {
						sum[i]++;
					}
				}
			}
			int max = 0;
			int tepIndex = 0;
			for (int i = 'a'; i <= 'z'; i++) {
				if (max < sum[i]) {
					max = sum[i];
					tepIndex = i;
				}
			}
			for (int i = 'a'; i <= 'z'; i++) {
				if (max == sum[i] && i < tepIndex) {
					max = sum[i];
					break;
				}

			}
			for (int i = 0; i < input.length(); i++) {
				char chick = input.charAt(i);
				if (chick != tepIndex) {
					rest += chick;
				}
			}
			input = rest;
			System.out.println(rest);
		}
	}
}
