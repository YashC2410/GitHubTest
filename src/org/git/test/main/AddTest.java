package org.git.test.main;

public class AddTest {
//Performing Addition
	public int add(int a,int b) {
		if(a<0 || b<0) {
			throw new ArithmeticException("Negative Numbers Occured While Addition");
		}
		else
		{
			return a+b;
		}
	}
}
