package problem;

import java.math.BigInteger;
import java.util.Scanner;

public class W1528_3 {

	static BigInteger[] a = new BigInteger[200];

	static BigInteger dfs(int n) {
		if (n == 0 || n == 1) {
			return BigInteger.ONE;
		}
		if (a[n] != BigInteger.ZERO) {
			return a[n];
		}
		a[n] = dfs(n - 1).add(dfs(n - 2));
		return a[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < a.length; i++) {
			a[i] = BigInteger.ZERO;
		}
		a[0] = a[1] = BigInteger.ONE;
		System.out.println(dfs(n));
		sc.close();
	}

}
