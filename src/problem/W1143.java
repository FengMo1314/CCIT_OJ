/**
 *
 */
package problem;

import java.util.Scanner;

/**
 * @author LiuHe
 *
 */
public class W1143 {

	public static boolean isZhi(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int min = 0;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (isZhi(i) && n % i == 0) {
				min = i;
				break;
			}
		}
		int max = n / min;
		System.out.println(max);
	}

}
