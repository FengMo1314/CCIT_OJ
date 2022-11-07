package problem;

import java.util.Scanner;

public class W1142 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] zu = new int[n];
		for (int i = 0; i < zu.length; i++) {
			zu[i] = sc.nextInt();
		}
		int j = 0;
		while (j < zu.length - 2) {
			if (zu[j] < zu[j + 1] && zu[j + 1] > zu[j + 2]) {
				System.out.println(zu[j + 1]);
			}
			j++;
		}
		sc.close();
	}

}
