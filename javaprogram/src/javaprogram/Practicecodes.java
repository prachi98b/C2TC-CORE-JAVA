package javaprogram;
import java.util.Scanner;

public class Practicecodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	int m=5, n=10;
		System.out.println("m= "+m);
		System.out.println("n= "+n);
		System.out.println("++m= "+ ++m);
		System.out.println("n++= "+ n++);
		System.out.println("m= "+m);
		System.out.println("n= "+n);
		System.out.println("--m= "+ --m);
		System.out.println("m= "+m);
		System.out.println("n--= "+ n--);
		System.out.println("n= "+n);
	*/	
		
		Scanner input= new Scanner(System.in);
		int a, b, c;
		System.out.println("Enter a number for a:");
		a = input.nextInt();
		System.out.println("Enter a number for b:");
		b = input.nextInt();
		System.out.println("Enter a number for c:");
		c = input.nextInt();
		
		a = a|4;
		System.out.println("a="+a);
		b>>=1;
		System.out.println("b="+b);
		c<<=1;
		System.out.println("c="+c);
		
		
	}

}
