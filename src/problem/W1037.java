package problem;

public class W1037 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		for (int i = 1000; i <= 9999; i++) {
			a = i / 100;
			b = i % 100;
			if ((a + b) * (a + b) == i) {
				System.out.println(i);
			}
		}

	}

}
