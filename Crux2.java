package Lec1;
import java.util.*;
public class Crux2 {

	public static void main(String[] args) {
		//largest no. in 3 given no.
		//1. ternary operator
		//2. if-else
		//3.array-list collections.max
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int largest_no=(a>b && a>c)?a:(b>a && b>c)?b:c;
		System.out.println("greatest no. is : "+largest_no);
		
		if(a>b && a>c) {
			System.out.println("greatest no. is : "+ a);
		}
		else if(b>a && b>c) {
			System.out.println("greatest no. is : "+ b);
		}
		
		else {
			System.out.println("greatest no. is : "+ c);
		}
		
		
		ArrayList<Integer> x= new ArrayList<>();
		x.add(a);
		x.add(b);
		x.add(c);
		System.out.println("greatest no. is : "+ Collections.max(x));
		
	}

}
