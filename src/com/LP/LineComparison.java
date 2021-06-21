package com.LP;

import java.util.Scanner;

class LineComparison {
	// variables
	int x1, y1, x2, y2;
	int ans;

	void welcome()// method to print welcome msg.
	{
		System.out.println("Welcome to empwage computation");
	}

	public Double calculate()
	// use_case 1 (method to calulate length of line using cartetion system)
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
		Double ans = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		System.out.println("length is" + ans);
		return ans;
	}

	public static void main(String args[]) {
		LineComparison line1 = new LineComparison();
		line1.welcome();
		System.out.println("coordinates of line 1 are");
		Double length1 = line1.calculate();// calulate length of first line

		System.out.println("coordinates of line 2 are");
		LineComparison line2 = new LineComparison();
		Double length2 = line2.calculate();// calulate length of second line
		boolean a = length1.equals(length2);
		System.out.println("" + length1.equals(length2));// usecase 2 check the equality of two line
		if (a == true)
			System.out.println("Two lines are equal");
		else {
			System.out.println("Two lines are  not equal");
		}
		int b = length1.compareTo(length2);// uc_3 comparison of two line
		System.out.println(length1.compareTo(length2));
		if (b == 0)
			System.out.println("Two lines are equal");
		else if (b == -1)
			System.out.println("first line is greater than second line");
		else if (b == 1) {
			System.out.println("second line is greater than first line");
		}

	}
}
