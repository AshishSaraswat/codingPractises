package arrays;

public class LongestSubQEqual {

	int[] arr = { 1, 0, 1, 1, 1, 0, 0 };
	// { 0, 0, 1, 1, 0 };

	public static void main(String[] args) {
		LongestSubQEqual qEqual = new LongestSubQEqual();
		qEqual.callHashLongSubArr();

	}

	private void callHashLongSubArr() {
		int len = arr.length;
		int leftSum[] = new int[len];
		int max = arr[0];
		int maxIndex = Integer.MIN_VALUE;
		int startIndex = -1;
		int min = arr[0];
		leftSum[0] = ((arr[0] == 0) ? -1 : 1);
		for (int i = 1; i < len; i++) {
			leftSum[i] = leftSum[i - 1] + ((arr[i] == 0) ? -1 : 1);
			if (min > leftSum[i]) {
				min = leftSum[i];
			}
			if (max < leftSum[i]) {
				max = leftSum[i];
			}
		}
		for (int i = 0; i < len; i++) {
			System.out.println(i + " : " + leftSum[i] + " ");
		}
		int diff = max - min + 1;
		int[] hash = new int[diff];
		for (int i = 0; i < diff; i++) {
			hash[i] = -1;
		}
		for (int i = 0; i < len; i++) {
			if (leftSum[i] == 0) {
				maxIndex = i;
				startIndex = 0;
			}
			if (hash[leftSum[i] - min] == -1) {
				hash[leftSum[i] - min] = i;
				System.out.println((leftSum[i] - min) + " th :" + hash[leftSum[i] - min] + " ");
			} else if (i - hash[leftSum[i] - min] > maxIndex) {
				maxIndex = i - hash[leftSum[i] - min];
				startIndex = hash[leftSum[i] - min] + 1;
			}
		}
		if (startIndex == -1) {
			System.out.println("No Such Array");
		} else {
			System.out.println("Subarray is : " + startIndex + "," + maxIndex);
		}

	}

}
