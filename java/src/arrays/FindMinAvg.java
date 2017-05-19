package arrays;

public class FindMinAvg {
	int arr[] = { 3, 7, 90, 20, 10, 50, 40 };
	int k = 3;

	public static void main(String[] args) {
		new FindMinAvg().findArr();

	}

	private void findArr() {
		int len = arr.length;
		int currSum = 0;
		int maxIndex = 0;
		int minSum = 0;
		for (int i = 0; i < k; i++) {
			currSum += arr[i];
			maxIndex = i;
		}
		minSum = currSum;
		for (int i = k; i < len; i++) {
			currSum += arr[i] - arr[i - k];
			if (currSum < minSum) {
				minSum = currSum;
				maxIndex = i;
			}
		}
		System.out.println("Subarray is from : " + (maxIndex - k + 1) + " , " + maxIndex);
	}

}
