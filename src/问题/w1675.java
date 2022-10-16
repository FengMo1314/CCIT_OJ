package Œ Ã‚;

import java.util.Scanner;

public class w1675 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int[] temp = new int[200];
		char[] b=new char[200];
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			temp[c]++;
		}
		int max = -1;
		for (int element : temp) {
			if (element > max) {
				max = element;
			}
		}
		int min=123,m=0;
		for (int j = 0; j < temp.length; j++) {
			if (temp[j] == max) {
				b[m]=(char)j;
				m++;
			}
		}
		for(int i=0;i<m;i++){
			if(min>b[i]){
				min=b[i];
			}
		}
		System.out.println((char)min+" "+max);
		sc.close();
	}

}
