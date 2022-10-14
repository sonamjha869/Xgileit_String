package com.test.string; // created package name is....

import java.util.Scanner;   // imported scanner class

public class TestStringSubstring {  // created class name
public static void main(String...args) { // main method for the code execution
	Scanner sc = new Scanner(System.in); // created scanner object
	System.out.println("Enter a String");  //Printed enter a string
	String s1 = sc.next();   // reading string input
	System.out.println("Enter starting index"); // Printed enter starting index
	int start =  sc.nextInt();  // reading integer input for starting index
	System.out.println("Enter ending index"); // Printed enter ending index
	int end = sc.nextInt();  //reading integer input for ending index
	String result = s1.substring(start, end); // calling substring method for substring
	System.out.println("substring is : "+ result); //Printing result
	sc.close();

		
	}

}
