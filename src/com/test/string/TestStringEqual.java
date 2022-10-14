package com.test.string; // created package name is....

import java.util.Scanner; // imported scanner class

public class TestStringEqual {  // created class name
	public static void main(String...args) {  // main method for the code execution
		Scanner sc = new Scanner(System.in); // created scanner object
		System.out.println("Enter a string");  //Printed enter a string
		String s1 = sc.next();   // reading string input
		System.out.println("Enter another string"); // Printed enter another string
		String s2 = sc.next();  //reading string input
		if(s1.equals(s2)) {  //calling equals method to compare two string  as if condition
			System.out.println("Strings are equal"); // printed string are equal if condition satisfied
		}
		else {
			System.out.println("Strings are not equal"); //printed string are not equal if condition not satisfied
		}
		sc.close();
}

}