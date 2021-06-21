package com.LP;

import java.util.Scanner;

class LineComparison {
	// variables
	int x1, y1, x2, y2;
	int ans = 0;

	void welcome()// method to print welcome msg.
	{
		System.out.println("Welcome to empwage computation");
	}

	void calculate() // method to calulate length of line using cartetion system
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x1, for line : ");
		int x1 = sc.nextInt();
		System.out.print("Enter y1, for line1 : ");
		int y1 = sc.nextInt();
		System.out.print("Enter x2, for line1 : ");
		int x2 = sc.nextInt();
		System.out.print("Enter y2, for line1 : ");
		int y2 = sc.nextInt();
		double ans = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		System.out.println("length of line is:" + ans);
	}

	public static void main(String args[]) {

		LineComparison line1 = new LineComparison();
		line1.welcome();
		System.out.println("coordinates of line 1 are");
		line1.calculate();

		System.out.println("coordinates of line 2 are");
		LineComparison line2 = new LineComparison();
		line2.calculate();

	}

}
