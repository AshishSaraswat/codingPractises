package arrays;

import java.util.Arrays;

public class CountTriplets {

	int arr[] = { 5, 1, 3, 4, 7 };

	public static void main(String[] args) {
		new CountTriplets().countTriple();

	}

	private void countTriple() {
		int sum = 12;
		int count = 0;
		int len = arr.length;
		Arrays.sort(arr);
		int i = 0;
		while (i < len - 2) {
			int j = i + 1;
			int k = len - 1;
			while (j < k) {
				if (arr[i] + arr[j] + arr[k] >= sum)
					k--;
				else {
					count += k - j;
					j++;
				}
			}
			i++;
		}
		System.out.println("Triplets are : " + count);

	}

}
