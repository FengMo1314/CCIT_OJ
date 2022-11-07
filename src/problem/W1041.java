package problem;

public class W1041 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 92;
		for (int i = 1; i < 1992; i++) {
			sum = (sum * 92) % 100;
		}
		System.out.println(sum);
	}

}
