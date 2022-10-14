package com.test.string; // created package name is....
import java.util.Scanner; // imported scanner class

public class TestStringConcat { // created class name
public static void main(String...args) { // main method for the code execution
		Scanner sc = new Scanner(System.in); // created scanner object
		System.out.println("Enter a string"); //Printed enter a string
		String s1 = sc.next();      // reading string input
		System.out.println("Enter another string"); // Printed enter another string
		String s2 = sc.next();        //reading string input
		String result = s1.concat(s2); // calling concat method to concat two string
		System.out.println("concat string is : "+result);  //printing result
		sc.close();



}
}
