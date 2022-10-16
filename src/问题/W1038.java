package Œ Ã‚;

public class W1038 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub+
		int a, b;
		for (int i = 100007; i <= 799999;i=i+10 ) {
			a = i / 10;
			b = 700000 + a;

			if (b == i * 4) {
				System.out.println(i);
			}
		}
	}

}
