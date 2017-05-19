package arrays;

public class FindMaxIArriSum {
	int arr[] = { 10, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

	public static void main(String args[]) {
		FindMaxIArriSum arriSum = new FindMaxIArriSum();
		arriSum.findSum();

	}

	private void findSum() {
		int len = arr.length;
		int sumArr = 0;
		int arrSum = 0;
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < len; i++) {
			sumArr += (i * arr[i]);
			arrSum += arr[i];
		}
		maxSum = sumArr;
		for (int i = 1; i < len; i++) {
			sumArr = sumArr + arrSum - len * arr[len - i];
			if (sumArr > maxSum)
				maxSum = sumArr;
		}
		System.out.println("Max sum is : " + maxSum);
	}

}
