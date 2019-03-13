
import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse the standard input
 * according to the problem statement.
 **/
class Player {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int W = in.nextInt(); // width of the building.
		int H = in.nextInt(); // height of the building.
		int N = in.nextInt(); // maximum number of turns before game over.
		int X0 = in.nextInt();
		int Y0 = in.nextInt();

		String[][] building = new String[W][H];

		for (int i = 0; i < W; i++) {

			for (int j = 0; j < H; j++) {

				building[i][j] = String.valueOf(i + " " + j);
			}
		}
		// game loop
		while (true) {

			String bombDir = in.next(); // the direction of the bombs from batman's current location (U, UR, R, DR, D,
										// DL, L or UL)

			switch (bombDir) {

			case ("U"):
				System.out.println(building[X0][Y0 + search(H)]);
				Y0 += 1;

				break;
			case ("UR"):

				System.out.println(building[X0+ search(W)][Y0 +search(H)]);
				Y0 += 1;
				X0 += 1;
				break;
			case ("R"):
				System.out.println(building[X0 +  search(W)][Y0]);
				X0 += 1;

				break;
			case ("DR"):

				System.out.println(building[X0 +  search(W)][Y0 - search(H)]);
				Y0 -= 1;
				X0 += 1;
				break;
			case ("D"):
				System.out.println(building[X0][Y0 -search(H)]);
				Y0 -= 1;

				break;
			case ("DL"):

				System.out.println(building[X0 -  search(W)][Y0 - search(H)]);
				X0 -= 1;
				Y0 -= 1;
				break;
			case ("L"):
				System.out.println(building[X0 -search(H)][Y0]);
				X0 -= 1;

				break;
			case ("UL"):

				System.out.println(building[X0 -  search(W)][Y0 + search(H)]);
				X0 -= 1;
				Y0 += 1;
				break;
			}

			// Write an action using System.out.println()
			// To debug: System.err.println("Debug messages...");

			// the location of the next window Batman should jump to.

		}
	}

	public static String getElement(int[][] arrayOfInts, int indexX, int indexY) {
		return String.valueOf(arrayOfInts[indexX][0] + arrayOfInts[0][indexY]);
	}
	
	public static int search(int max) {
		
		int min = 0;
		return (int) ((Math.random() * ((max - min) + 1)) + min);
	}
}



//
//
//import java.util.*;
//import java.io.*;
//import java.math.*;
//
///**
// * Auto-generated code below aims at helping you parse the standard input
// * according to the problem statement.
// **/
//class Player {
//
//	public static void main(String args[]) {
//		Scanner in = new Scanner(System.in);
//		int W = in.nextInt(); // width of the building.
//		int H = in.nextInt(); // height of the building.
//		int N = in.nextInt(); // maximum number of turns before game over.
//		int X0 = in.nextInt();
//		int Y0 = in.nextInt();
//
//		String[][] building = new String[W][H];
//
//		for (int i = 0; i < W; i++) {
//
//			for (int j = 0; j < H; j++) {
//
//				building[i][j] = String.valueOf(i + " " + j);
//			}
//		}
//		// game loop
//		while (true) {
//
//			String bombDir = in.next(); // the direction of the bombs from batman's current location (U, UR, R, DR, D,
//										// DL, L or UL)
//
//			switch (bombDir) {
//
//			case ("U"):
//				System.out.println(building[X0][Y0 - 1]);
//				Y0 -= 1;
//
//				break;
//			case ("UR"):
//
//				System.out.println(building[X0 + 1][Y0 - 1]);
//				Y0 -= 1;
//				X0 += 1;
//				break;
//			case ("R"):
//				System.out.println(building[X0 + 1][Y0]);
//				X0 += 1;
//
//				break;
//			case ("DR"):
//
//				System.out.println(building[X0 + 1][Y0 + 1]);
//				Y0 += 1;
//				X0 += 1;
//				break;
//			case ("D"):
//				System.out.println(building[X0][Y0 + 1]);
//				Y0 += 1;
//
//				break;
//			case ("DL"):
//
//				System.out.println(building[X0 - 1][Y0 + 1]);
//				X0 -= 1;
//				Y0 += 1;
//				break;
//			case ("L"):
//				System.out.println(building[X0 - 1][Y0]);
//				X0 -= 1;
//
//				break;
//			case ("UL"):
//
//				System.out.println(building[X0 - 1][Y0 - 1]);
//				X0 -= 1;
//				Y0 -= 1;
//				break;
//			}
//
//			// Write an action using System.out.println()
//			// To debug: System.err.println("Debug messages...");
//
//			// the location of the next window Batman should jump to.
//
//		}
//	}
//
//	public static String getElement(int[][] arrayOfInts, int indexX, int indexY) {
//		return String.valueOf(arrayOfInts[indexX][0] + arrayOfInts[0][indexY]);
//	}
//}


