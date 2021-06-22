package com.LP;

import java.util.Scanner;

public class LineComparison {
	public static void main(String args[]) {
		System.out.println("Welcome to Line Comparison Computation Program:");

		Scanner scan = new Scanner(System.in);

		// Input values from user for Line A and compute the length of Line A
		float[] input1 = inputValues(scan);
		System.out.println("The 2 points of the line A are: (" + input1[0] + "," + input1[1] + ") and (" + input1[2]
				+ "," + input1[3] + ")");
		double lengthLineA = computeLength(input1);

		// Input values from user for Line B and compute the length of Line B
		float[] input2 = inputValues(scan);
		System.out.println("The 2 points of the line B are: (" + input2[0] + "," + input2[1] + ") and (" + input2[2]
				+ "," + input2[3] + ")");
		double lengthLineB = computeLength(input2);

		// Print the lengths of Line A and Line B
		System.out.println("Length of the line A is : " + lengthLineA + " units.");
		System.out.println("Length of the line B is : " + lengthLineB + " units.");

		// Compare the lengths of line A and line B
		compareLength(lengthLineA, lengthLineB);
	}

	private static float[] inputValues(Scanner input) {
		System.out.print("Enter the value of (x1,y1) and (x2,y2): ");
		float x1 = input.nextFloat();
		float y1 = input.nextFloat();
		float x2 = input.nextFloat();
		float y2 = input.nextFloat();

		return new float[] { x1, y1, x2, y2 };
	}

	private static double computeLength(float[] input) {
		double lengthLine = Math.sqrt(Math.pow(input[2] - input[0], 2) + Math.pow(input[3] - input[1], 2));

		return lengthLine;
	}

	private static void compareLength(double lengthLineA, double lengthLineB) {
		String lineA = String.valueOf(lengthLineA);
		String lineB = String.valueOf(lengthLineB);

		if (lineA.compareTo(lineB) == 0)
			System.out.println("Line A and Line B are equal");
		else if (lineA.compareTo(lineB) > 0)
			System.out.println("Line A is greater than Line B");
		else if (lineB.compareTo(lineA) > 0)
			System.out.println("Line B is greater than Line A");
	}

}
