package org.git.test.main;

import java.util.Scanner;

public class GitApp {

	public static void main(String[] args) {
          //Sample Testing of Git Commands
		Scanner sc = new Scanner(System.in);
		System.out.println("Testing Git Commands");
		int a = 0 ,b = 0;
		AddTest addTest = new AddTest();
		try {
			System.out.println("Enter Number 1: ");
			a = sc.nextInt();
			System.out.println("Enter Number 2: ");
			 b = sc.nextInt();
			addTest.add(a,b);
		}catch(ArithmeticException e) {
			System.out.println("Would You Still Like to Continue");
			String test = sc.nextLine();
			if(test.equalsIgnoreCase("yes") || test.equalsIgnoreCase("Yes")) {
				addTest.add(a, b);
			}
		}
           

	}

}
