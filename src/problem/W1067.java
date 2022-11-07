/**
 *
 */
package problem;

import java.util.Scanner;

/**
 * @author 柳和(本地)
 *
 */
public class W1067 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		short chinese = sc.nextShort();
		short math = sc.nextShort();
		short english = sc.nextShort();
		short number = sc.nextShort();
		short[] all = new short[3 * number];
		for (short i = 0; i < all.length; i++) {
			all[i] = sc.nextShort();
		}
		short maxChinese = -1;
		for (int i = 0; i < all.length; i += 3) {
			if (all[i] > maxChinese) {
				maxChinese = all[i];
			}
		}
		short maxMath = -1;
		for (int i = 1; i < all.length; i += 3) {
			if (all[i] > maxMath) {
				maxMath = all[i];
			}
		}
		short maxEnglish = -1;
		for (int i = 2; i < all.length; i += 3) {
			if (all[i] > maxEnglish) {
				maxEnglish = all[i];
			}
		}
		int isChinese = (maxChinese - chinese) > 0 ? (maxChinese - chinese) : 0;
		int isMath = (maxMath - math) > 0 ? (maxMath - math) : 0;
		int isEnglish = (maxEnglish - english) > 0 ? (maxEnglish - english) : 0;
		System.out.println(isChinese + " " + isMath + " " + isEnglish);
	}

}
