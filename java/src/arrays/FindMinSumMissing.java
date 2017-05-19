package arrays;

public class FindMinSumMissing {
	int[] arr = { 1, 1, 3,4 };
	// { 1, 3, 6, 10, 11, 15 };

	public static void main(String[] args) {
		new FindMinSumMissing().findMissingSum();

	}

	private void findMissingSum() {
		int len = arr.length;
		int sum = 1;
		for (int i = 0; i < len && sum >= arr[i]; i++)
			sum += arr[i];
		System.out.println(sum);
	}

}
