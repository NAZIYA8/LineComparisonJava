package linecomparison;

import java.util.Scanner;

public class LineComparison {
	public static void main(String[] args) {
		int x1,x2,y1,y2;
		double distance;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the point x1 ");
		x1 = scan.nextInt();
		System.out.println("Enter the point y1 ");
		y1 = scan.nextInt();
		System.out.println("Enter the point x2 ");
		x2 = scan.nextInt();
		System.out.println("Enter the point y2 ");
		y2 = scan.nextInt();
		
		distance = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		System.out.println("Length of a line is " + distance);
	}
}
