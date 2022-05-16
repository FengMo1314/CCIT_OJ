package 问题;

import java.util.Scanner;

public class w1042 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int moth = sc.nextInt();
		int day = sc.nextInt();
		sc.close();
		boolean leap = year % 400 == 0 || year % 100 != 0 && year % 4 == 0;//判断是否闰年
		int total = year - 1980 + (year - 1980 + 3) / 4;//计算1980年与输入年月日之间的总天数
		System.out.println(total);
		for (int i = moth - 1; i > 0; i--) {
			switch (i) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
				total += 31;
				System.out.println(total);
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				total += 30;
				break;
			case 2:
				total += leap ? 29 : 28;//是闰年为前者；否则为后者；
			}
		}
		total += day;
		System.out.println(total);
		int week = 1;
		week = (week + total) % 7;
		switch (week) {
		case 0:
			System.out.println("7");
			break;
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		case 4:
			System.out.println("4");
			break;
		case 5:
			System.out.println("5");
			break;
		case 6:
			System.out.println("6");
			break;
		}
	}
}
