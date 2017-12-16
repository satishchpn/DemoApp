package com.surbhi.demo;
public class MainTest {

	public static void main(String[] args) {
		TestCalculator cal = new TestCalculator();
		cal.beforeClass();
		cal.testAdd();
		cal.testSubtract();
		cal.testMultiply();
		cal.afterClass();

	}

}
