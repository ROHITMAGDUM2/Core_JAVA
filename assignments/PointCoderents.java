package assignments;

import java.util.Scanner;

//Given a point (x, y), write a program to find out if it lies on the x-axis, y-axis or at the origin, x or y (0, 0).
public class PointCoderents {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the x-coordinate: ");
		int x = scanner.nextInt();
		System.out.print("Enter the y-coordinate: ");
		int y = scanner.nextInt();
		scanner.close();

		if (x == 0 && y == 0) {
			System.out.println("The point is at the origin (0, 0).");
		} else if (x == 0) {
			System.out.println("The point lies on the y-axis at (0, " + y + ").");
		} else if (y == 0) {
			System.out.println("The point lies on the x-axis at (" + x + ", 0).");
		} else {
			String location = (x > 0) ? "right" : "left";
			location += " of ";
			location += (y > 0) ? "above" : "below";
			System.out.println("The point is in the " + location + " quadrant.");
		}
	}
}
