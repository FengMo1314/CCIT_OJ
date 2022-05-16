package Œ Ã‚;

public class w1136N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		int temp = 0, a = 0, b = 0, c = 0, d = 0;
		// boolean rest = true;
		for (i = 1000; i < 3000; i++) {
			boolean rest = true;
			a = i / 1000;
			b = i / 100 % 10;
			c = i / 10 % 10;
			d = i % 10;

			for (j = 2; j <= Math.sqrt(i); j++) {
				//a = i / 1000;
				//b = i / 100 % 10;
				//c = i / 10 % 10;
				//d = i % 10;

				if (i % j == 0) {
					rest = false;
					break;
				}
			}
			if (true) {
				temp = b * 100 + c * 10 + d;
				for (int k = 2; k <= Math.sqrt(temp); k++) {
					if (temp % k == 0) {
						rest = false;
						break;
					}
					
				}
				if (rest) {
					temp = c * 10 + d;
					for (int t = 2; t <= Math.sqrt(temp); t++) {
						if (temp % t == 0) {
							rest = false;
							break;
						}
					}
					if (rest) {
						temp = d;
						// System.out.println(temp);
						for (int h = 2; h <= Math.sqrt(temp); h++) {
							if (temp % h == 0) {
								rest = false;
								break;
							}

						}
						if (rest) {
							// sum++;
							temp = a * 1000 + b * 100 + c * 10 + d;
							System.out.println(temp);
						}
					}
				}
			}
		}
		// System.out.println(sum);
	}

}
