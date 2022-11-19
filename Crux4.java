package Lec1;

import java.util.Scanner;

public class Crux4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		int q=sc.nextInt();
		int r=gcd1(p,q);
		int s=gcd2(p,q);
		int t=gcd3(p,q);
		System.out.println(r);
		System.out.println(s);
		System.out.println(t);
				
	}
	static int gcd1(int a,int b) {
		if(b==0) {
			return a;
			}
		else {
			return gcd1(b,Math.abs(a-b));
		}
	}
	
	static int gcd2(int a,int b) {
		if(b==0) {
			return a;
			}
		else {
			return gcd2(b,a%b);
		}
	}
	
	static int gcd3(int a,int b) {
		int n;
		if(a<b) {
			n=a;
		}
		else {
			n=b;
		}
		for(int i=n;i>=1;i--) {
			if(a%i==0 && b%i==0) {
				return i;
			}
		}
		return 1;
	}
	

}
