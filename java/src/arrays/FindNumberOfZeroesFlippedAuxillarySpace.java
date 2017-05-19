package arrays;

public class FindNumberOfZeroesFlippedAuxillarySpace {

	int[] arr =  {1, 1, 0, 1, 1, 0, 0, 1, 1, 1};
	int m = 2;

	public static void main(String[] args) {
		new FindNumberOfZeroesFlippedAuxillarySpace().findNum();
//		new FindNumberOfZeroesFlippedAuxillarySpace().

	}

	private void findNum() {

		int len = arr.length;
		findZeroes(arr, len, m);
//		int[] left = new int[len];
//		int[] right = new int[len];
//		int zeroCount = 0;
//		int count = 0;
//		for (int i = 0; i < len; i++) {
//			left[i] = 0;
//			right[i] = 0;
//		}
//		for (int i = 0; i < len; i++) {
//			if (arr[i] == 1) {
//				count++;
//			} else {
//				left[i] = count;
//				zeroCount++;
//				count = 0;
//			}
//		}
//		int[] zeroIn = new int[zeroCount];
//		int countR = 0;
//		int a = zeroCount - 1;
//		;
//		for (int i = len - 1; i >= 0; i--) {
//			if (arr[i] == 1) {
//				countR++;
//			} else {
//				right[i] = countR;
//				zeroIn[a] = i;
//				a--;
//				countR = 0;
//			}
//		}
//		if (m < zeroCount) {
//			int curOne = 0;
//			int maxOne = 0;
//			int i = 0;
//			int maxIn = 0;
//			for (; i <= m - 1; i++) {
//				curOne += left[zeroIn[i]];
//			}
//			curOne += right[i];
//			maxOne = curOne;
//			maxIn = i;
//			for (int j = m; j < zeroCount; j++) {
//				curOne += right[zeroIn[j]] - left[zeroIn[j - m]];
//				if (curOne > maxOne) {
//					maxOne = curOne;
//					maxIn = j;
//				}
//			}
//			int minIn = maxIn - m + 1;
//			System.out.print("Index are : ");
//			for (int j = minIn; j <= maxIn; j++) {
//				System.out.print(zeroIn[j] + " ");
//			}
//		} else {
//			for (int j = 0; j < zeroCount; j++) {
//				System.out.print(zeroIn[j] + " ");
//			}
//		}
	}

	void findZeroes(int arr[], int n, int m) {
		// Left and right indexes of current window
		int wL = 0, wR = 0;

		// Left index and size of the widest window
		int bestL = 0, bestWindow = 0;

		// Count of zeroes in current window
		int zeroCount = 0;

		// While right boundary of current window doesn't cross
		// right end
		while (wR < n) {
			// If zero count of current window is less than m,
			// widen the window toward right
			if (zeroCount <= m) {
				if (arr[wR] == 0)
					zeroCount++;
				wR++;
			}

			// If zero count of current window is more than m,
			// reduce the window from left
			if (zeroCount > m) {
				if (arr[wL] == 0)
					zeroCount--;
				wL++;
			}

			// Updqate widest window if this window size is more
			if (wR - wL > bestWindow) {
				bestWindow = wR - wL;
				bestL = wL;
			}
		}

		// Print positions of zeroes in the widest window
		for (int i = 0; i < bestWindow; i++) {
			if (arr[bestL + i] == 0)
				System.out.print((bestL + i) + " ");
		}
	}

}
