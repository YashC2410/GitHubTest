package org.git.test.main;

public class AddTest {
//Performing Addition
	public int add(int a,int b) {
		 System.out.println("Performing Addition Process");
		if(a<0 || b<0) {
			//Checking Conditions
      
			throw new ArithmeticException("Negative Numbers Occured While Addition");
		}
		else
		{
			return a+b;
		}
	}
}
