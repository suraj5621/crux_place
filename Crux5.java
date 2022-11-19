package Lec1;

import java.util.Scanner;

public class Crux5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=2;n>1;i++) {
			while(n%i==0) {
				System.out.println(i);
				n=n/i;
			}
		}

	}

}
