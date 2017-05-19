package arrays;

public class SmallestMissingNumberFromUnsortedArray {

	static int segregatePositiveNegative(int[] arr) {
		int ind = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= 0) {
				int temp = arr[i];
				arr[i] = arr[ind];
				arr[ind++] = temp;
			}
		}

		return ind;
	}

	static int getSmallestMissingNumber(int[] arr, int shift) {
		int n = arr.length;
		System.out.println("Shift is " + shift);
		for (int i = shift; i < n; i++) {
			System.out.println(" ---> "+ Math.abs(arr[i] - 1));
			if (Math.abs(arr[i] - 1) < n - shift && arr[shift + Math.abs(arr[i] - 1)] > 0)
				arr[shift + Math.abs(arr[i] - 1)] = -arr[shift + Math.abs(arr[i] - 1)];
		}

		for (int i = shift; i < n; i++) {
			if (arr[i] > 0)
				return i + 1 - shift;
		}

		return n + 1 - shift;
	}

	static int getSmallestMissingNumberUnsortedArray(int[] arr) {

		int shift = segregatePositiveNegative(arr);

		return getSmallestMissingNumber(arr, shift);
	}

	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 7, 6, 8, -1, -10, 15 };

		printArray(arr);

		System.out.println("ans = " + getSmallestMissingNumberUnsortedArray(arr));
	}
}
