package Œ Ã‚;

public class w1040 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 0; i < 1000; i++) {
			if (i / 1000 == 3 || i / 10 % 10 == 3 || i % 10 == 3
					|| i / 100 == 3) {
				sum = sum + 1;

			}
		}
		System.out.println(sum);
	}
}
