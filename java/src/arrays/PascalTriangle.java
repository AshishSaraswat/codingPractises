package arrays;

public class PascalTriangle {

	public static void main(String[] args) {

		int rows = 7;

		for (int i = 0; i < rows; i++) {

			int number = 1;

			//System.out.format("%" + (rows - i) * 2 + "s", "");

			for (int j = 0; j <= i; j++) {

				System.out.print( number + " ");

				number = number * (i - j) / (j + 1);

			}

			System.out.println();

		}

	}

}
