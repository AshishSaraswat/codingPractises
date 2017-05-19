package arrays;

public class FindMaxUnimodalArr {

	int arr[] = { 1, 2, 3, 4, 5, 6,9, 5, 4, 3, 2, 1 };

	public static void main(String[] args) {
		new FindMaxUnimodalArr().findMax();

	}

	private void findMax() {
		int len = arr.length;
		int max = binSearch(0, len - 1);
		System.out.println("Max number is :" + max);

	}

	private int binSearch(int i, int j) {
		if (i == j)
			return arr[i];
		if (j == i + 1 && arr[i] < arr[j])
			return arr[j];
		int mid = (i + j) / 2;
		if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1])
			return arr[mid];
		else if (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1])
			return binSearch(mid, j);
		else
			return binSearch(i, mid);
	}

}
