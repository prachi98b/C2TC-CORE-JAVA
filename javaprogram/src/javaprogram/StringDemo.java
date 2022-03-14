package javaprogram;

public class StringDemo {

	public static void main(String[] args) {
		String s = new String("Prachi");  //string is a separate class in java.
		s.concat("Bhanushali"); //string objects are immutable in nature. 
		System.out.println(s);  //string class is a child class of the object class.
		
		/*
		 * Object:- 1. String, 2. StringBuffer-mutable in nature, 
		 * 3. StringBuilder-
		 */
		
		StringBuffer a = new StringBuffer("Hello ");
		a.append("World");
		System.out.println(a.length());
		System.out.println(a);
		/* system is a class, out is the object of system class. 
		 * the import java.lang.*; package is imported by default to every class,
		 *  it is a imp package.
		 *  String is an imp class in java, used more than others.
		 *  interview questions on this.
		 *  SCP (String Constant Pool)
		 *  Duplicate string is not allowed in SCP
		 *  
		 *  
		 * */
		String s1 = new String("Hello");  //1 object created in heap and 1 in SCP.
		String s2 = new String("Hello");  //1 object created in heap but in sCP no object will be created now because it already has string literal "hello"
		String s3 = "Hello";  //no changes in heap area, will use same string literal in SCP, no object will be created.
		String s4 = "Hello";  //no changes in heap area, will use same string literal in SCP, no object will be created.
		// # total objects created will be "3". 
		// Caching/enhancing the performance/provide security - advantages of being immutable in nature.
		//as minimizing its use security is enhanced.
		// literals in java can be of any data-type. and if it is literal then u cn't modify it.
		//performance is increased because we r doing memory management.
		// difference between string and character array, that 
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
	}

}
