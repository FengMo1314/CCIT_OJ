package 随心所欲;

public class Xin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (float y = 1.5f; y > -1.5f; y -= 0.1f) {
			for (float x = -1.5f; x < 1.55f; x += 0.05f) {
				float a = x * x + y * y - 1;
				if ((a * a * a - x * x * y * y * y) < 0.0f) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}

}
