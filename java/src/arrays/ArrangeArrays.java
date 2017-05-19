package arrays;

import java.util.Arrays;

public class ArrangeArrays {

	int[] arr = { -5, -2, 5, -2, 4, 7, 1, 8, 0, -8 };
	// { 1, 2, 3, -4, -1, 4 };

	public static void main(String[] args) {
		ArrangeArrays arrays = new ArrangeArrays();
		// arrays.arrangeArrays();
		// arrays.arrangeArray();
		arrays.sortArr();
		arrays.displayArr();
		System.out.println();
		System.out.println((0x01));

	}

	private void displayArr() {
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			System.out.print(arr[i]);
			System.out.print(" ");
		}

	}

	public void sortArr() {
		Arrays.sort(arr);
	}

	public void arrangeArrays() {
		int len = arr.length;
		int startIndex = 0;
		int outOfPlace = -1;
		for (int i = 0; i < len; i++) {
			if (arr[i] < 0) {
				outOfPlace = i;
				int temp = arr[outOfPlace];
				for (int j = outOfPlace; j > startIndex; j--) {
					arr[j] = arr[j - 1];
				}

				arr[startIndex] = temp;
				startIndex += 2;
				// i=outOfPlace+1;
			}
		}
	}

	public void arrangeArray() {
		int len = arr.length;
		int start = 0;
		int notInPlace = 0;
		for (int i = 0; i < len; i++) {
			if (i % 2 == 0 && arr[i] < 0) {
				start = i;
				while (arr[start] < 0) {
					start++;
				}
				int temp = arr[start];
				for (int a = start; a > i + 1; a--) {
					arr[a] = arr[a - 1];
				}
				arr[i + 1] = temp;
				// i=+2;
				// System.out.println(arr[i]);
			}
			if (i % 2 == 1 && arr[i] >= 0) {

			}
		}
	}

}
