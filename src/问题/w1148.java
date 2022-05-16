package ����;

import java.util.Scanner;

public class w1148 {

	private static final int DOWN = 0; // ����
	private static final int LEFT = 1; // ����
	private static final int UP = 2; // ����
	private static final int RIGHT = 3; // ����
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		int[][] roundsNum = new int[n][n];
		int number = 1;
		int i = 0, j = 0;
		// �ȵ��������һ��
		while (i == 0 && j < n) {
			roundsNum[i][j] = number++;
			j++;
		}
		j--;

		int direction = 0;
		int step = n - 1;
		int currentStep = 0;

		while (roundsNum[i][j] != n * n) {
			switch (direction % 4) {
			case DOWN:
				System.out.print(roundsNum[i][j]+" ");
				i++;
			case LEFT:
				j--;
				System.out.print(roundsNum[i][j]+" ");
			case UP:
				i--;
				System.out.print(roundsNum[i][j]+" ");
			case RIGHT:
				j++;
				System.out.print(roundsNum[i][j]+" ");
				default:
					break;
			}
			roundsNum[i][j] = number++;
			currentStep++;
			System.out.println(roundsNum[i][j]+" ");
			if (currentStep % step == 0) {
				direction++;
				// ����һ�����������Σ��򽫵�ǰ���߲�����0������������1
				if (currentStep == step * 2) {
//					step--;
					currentStep = 0;
				}
			}

		}
	}
}
