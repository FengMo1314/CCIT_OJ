/**
 * 
 */
package problem;

import java.util.Scanner;

/**
 * @author LiuHe
 *
 */
public class Luogu {

	/**
	 * @param args ### 样例输入 #1
	 * 
	 *             ``` 10 20 40 32 67 40 20 89 300 400 15 ```
	 * 
	 *             ### 样例输出 #1
	 * 
	 *             ``` 8 15 20 32 40 67 89 300 400 ```
	 * 
	 *             ##
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int[] zu=new int[a];
		int[] rest=new int[1005];
		for(int i=0;i<a;i++) {
			zu[i]=sc.nextInt();
		}
		for(int i=0;i<a;i++) {
			rest[zu[i]]=zu[i];
		}
		int sum=0;
		for(int i=0;i<1005;i++) {
			if(rest[i]!=0) {
				sum++;
			}
		}
		System.out.println(sum);
		for(int i=0;i<1005;i++) {
			if(rest[i]!=0) {
				System.out.print(rest[i]+" ");
			}
		}
	}

}
