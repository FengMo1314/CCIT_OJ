package Œ Ã‚;

import java.util.Scanner;

public class w1132 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//String[] e = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K",
			//	"L", "M", "N", "O", "P", "Q","R","S","T","U","V","W","X","Y","Z"};
		// for(int j=0;j<e.length;j++){
		// e[j]=e;
		// }
		int i,j;
		char e='A';
		sc.close();
		for (i = 1; i <=n; i++) {
			for (j= 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (j= 1; j <= 2 * i - 1; j++) {
				System.out.print(e);
			}
			e++;
			System.out.println();
		}
		sc.close();
	}

}
