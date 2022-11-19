package Lec1;

import java.util.Scanner;

public class Crux6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
		int b=1;
		int c;
		for(int i=1;i<=n;i++) {
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println(a);
	}

}
