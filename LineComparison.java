package linecomparison;

import java.util.Scanner;

public class LineComparison {
	public static void main(String[] args) {
		int x1, x2, y1, y2, a1, a2, b1, b2;
		Double distance1, distance2;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the point x1 ");
		x1 = scan.nextInt();
		System.out.println("Enter the point y1 ");
		y1 = scan.nextInt();
		System.out.println("Enter the point x2 ");
		x2 = scan.nextInt();
		System.out.println("Enter the point y2 ");
		y2 = scan.nextInt();
		System.out.println("Enter the point a1 ");
		a1 = scan.nextInt();
		System.out.println("Enter the point b1 ");
		b1 = scan.nextInt();
		System.out.println("Enter the point a2 ");
		a2 = scan.nextInt();
		System.out.println("Enter the point b2 ");
		b2 = scan.nextInt();

		distance1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		distance2 = Math.sqrt((a2 - a1) * (a2 - a1) + (b2 - b1) * (b2 - b1));

		System.out.println("Length of a line1 is " + distance1);
		System.out.println("Length of a line2 is " + distance2);

		int compareValue = distance1.compareTo(distance2);

		if (compareValue == 0) {
			System.out.println("distance1 and distance2 are EQUAL ");
		} else if (compareValue < 0) {
			System.out.println("distance1 is LESS than distance2");
		} else {
			System.out.println("distance1 is GREATER than distance2");
		}
	}
}
