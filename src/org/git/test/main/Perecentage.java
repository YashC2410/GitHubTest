package org.git.test.main;

public class Perecentage {

	public double percentCal(int a, int b) {
		if(b == 0) {
			throw new ArithmeticException("Division By 0");
		}
		else
		{
			return (a/b)*100;
		}
	}
}
