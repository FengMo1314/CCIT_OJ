package ����;

import java.util.Scanner;

public class w1141 {
//������n�ö��٣�k���ε�����mλ���֣�ֻҪÿ�ν�n�ĺ�mΪƽ���ҳ���k�Σ�ѭ��������1~k����ʾִ��k�εĳ˷����㣩
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		//if (n < 10) {
			//sum = n;
			//for (int i = 1; i < n; i++) {
				//sum = sum * n % 100;
			//}
	//	} else {//
			sum = n % 100;
			for (int j = 1; j < n; j++) {
				sum = sum * n % 100;
			//}
		}
		System.out.println(sum);
		sc.close();
	}

}
