package arrays;

public class FindThreeSortedSubArr {
	int arr[] = { 12, 11, 10, 5, 6, 2, 30 };

	public static void main(String[] args) {
		FindThreeSortedSubArr arrObj = new FindThreeSortedSubArr();
		arrObj.findSubArr();

	}

	public void findSubArr() {
		int n = arr.length;
		int[] smallArr = new int[n];
		int[] bigArr = new int[n];
		int min = 0;
		int max = n - 1;
		smallArr[0] = -1;
		bigArr[max] = -1;
		for (int i = 1; i < n; i++) {
			if (arr[i] < arr[min]) {
				min = i;
				smallArr[i] = -1;
			} else
				smallArr[i] = min;
		}
		for (int i = n - 2; i >= 0; i--) {
			if (arr[i] > arr[max]) {
				max = i;
				bigArr[i] = -1;
			} else
				bigArr[i] = max;
		}
		for (int i = 1; i < n - 1; i++) {
			if (smallArr[i] != -1 && bigArr[i] != -1) {
				System.out.println("Elements are :" + arr[smallArr[i]] + " , " + arr[i] + " , " + arr[bigArr[i]]);
				break;
			}
		}
	}
}
