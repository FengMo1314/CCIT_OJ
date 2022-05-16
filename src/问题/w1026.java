package ÎÊÌâ;

import java.util.Scanner;

public class w1026 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year1 = sc.nextInt();
		int month1 = sc.nextInt();
		int day1 = sc.nextInt();
		int year2 = sc.nextInt();
		int month2 = sc.nextInt();
		int day2 = sc.nextInt();
		sc.close();
		if (year1 > year2) {
			System.out.println("No");
		} else if (year1 == year2) {
			if (month1 > month2) {
				System.out.println("No");
			} else if (month1 == month2) {
				if (day1 > day2) {
					System.out.println("No");
				} else if (day1 == day2) {
					System.out.println("No");
				} else {
					System.out.println("Yes");
				}
			} else {
				System.out.println("Yes");
			}
		} else {
			System.out.println("Yes");
		}
	}
}
