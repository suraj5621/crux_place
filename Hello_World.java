package Lec1;

public class Hello_World {

	public static void main(String[] args) {
		
		int a=9;
		//
		if(a%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		
		if((a&1)==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		
		if((a|1)==a) {
			System.out.println("odd");
		}
		else {
			System.out.println("even");
		}
		
		
		if((a^1)==a+1) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		
		if(((a>>1)<<1)==a) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
	}

}
