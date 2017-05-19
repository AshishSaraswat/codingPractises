package matrix;

import java.util.ArrayList;

public class SpiralMatrix {
	int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

	public static void main(String[] args) {
		new SpiralMatrix().callspiralOrder();

	}

	private void callspiralOrder() {
		ArrayList<Integer> l = spiralOrder(arr);
		for (Integer i : l) {
			System.out.print(i + " ");
		}
		System.out.println();
		ArrayList<ArrayList<Integer>> m = generateMatrix(3);
		for(ArrayList<Integer> a : m){
			for(Integer i : a  ){
				System.out.print(i + " ");
			}
		} 
	}

	public ArrayList<Integer> spiralOrder(int[][] matrix) {
		// Start typing your Java solution below
		// DO NOT write main() function
		ArrayList<Integer> result = new ArrayList<Integer>();

		if (matrix == null || matrix.length == 0) {
			return result;
		}

		int beginX = 0;
		int endX = matrix[0].length - 1;

		int beginY = 0;
		int endY = matrix.length - 1;

		while (true) {
			for (int col = beginX; col <= endX; col++) {
				result.add(matrix[beginY][col]);
			}
			if (++beginY > endY) {
				break;
			}

			for (int row = beginY; row <= endY; row++) {
				result.add(matrix[row][endX]);
			}
			if (--endX < beginX) {
				break;
			}
			for (int col = endX; col >= beginX; col--) {
				result.add(matrix[endY][col]);
			}
			if (--endY < beginY) {
				break;
			}
			for (int row = endY; row >= beginY; row--) {
				result.add(matrix[row][beginX]);
			}
			if (++beginX > endX) {
				break;
			}
		}
		return result;
	}

	public ArrayList<ArrayList<Integer>> generateMatrix(int a) {
		if (a <= 0) {
			return new ArrayList<ArrayList<Integer>>();
		}
		ArrayList<Integer> m = new ArrayList<>(a);
		for (int i = 0; i < a; i++)
			m.add(i, 0);
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < a; i++) {
			matrix.add(i, new ArrayList<>(m));
		}
		matrix.remove(a-1);
		// matrix.add(m);

		int beginX = 0;
		int endX = a - 1;

		int beginY = 0;
		int endY = a - 1;
		int current = 1;
		matrix.add(m);
		while (current <= (a) * (a)) {
			for (int col = beginX; col <= endX; col++) {
				//System.out.println(matrix.get(col).size());
				matrix.get(beginY).set(col, current++);
			}
			beginY++;
			for (int row = beginY; row <= endY; row++) {
				//System.out.println(matrix.get(row).size());
				matrix.get(row).set(endX, current++);
			}
			endX--;

			for (int col = endX; col >= beginX; col--) {
				matrix.get(endY).set(col, current++);
			}
			endY--;

			for (int row = endY; row >= beginY; row--) {
				matrix.get(row).set(beginX, current++);
			}
			beginX++;
		}

		return matrix;
	}
}
