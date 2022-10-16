package Œ Ã‚;

import java.util.Scanner;

public class W1043 {
	private interface Convertor<R, T> {
		R convert(T t) throws RuntimeException;
	}

	private static class IntBinConvertor implements Convertor<String, Integer> {
		@Override
		public String convert(Integer integer) throws RuntimeException {
			return Integer.toBinaryString(integer);
		}
	}

	public static void main(String... args) {

		Scanner sc = new Scanner(System.in);
		System.out.println(new IntBinConvertor().convert(sc.nextInt()));
		sc.close();
	}

}
