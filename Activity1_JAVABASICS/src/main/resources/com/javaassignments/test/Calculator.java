package com.javaassignments.test;

public class Calculator {
	static CommonMethods objCommonMethods = new CommonMethods();
	
	public static void main(String[]args) {
		int compareValueEqual = 10;
		 CommonMethods objCommonMethods = new CommonMethods();
		int sum = objCommonMethods.addNumber(10, 5);
		 System.out.println(sum);
		int subtractNumber = objCommonMethods.subtractNumber(sum, 4);
		  System.out.println(subtractNumber);
		int decrementMethod = CommonMethods.decrementMethod(subtractNumber);
		System.out.println(decrementMethod);
        System.out.println(CommonMethods.isEqual(compareValueEqual, decrementMethod));
	}
}