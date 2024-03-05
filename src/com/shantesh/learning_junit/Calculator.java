package com.shantesh.learning_junit;

public class Calculator {

	public int add(int[] intArray) {
		int sum = 0;
		for (int i : intArray) {
			sum = sum + i;
		}
		return sum;
	}

}
