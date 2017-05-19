package arrays;

public class FindSecondLargestElement {

	int arr[] = { 100, 50, 25, 12, 6, 3, 1, 0 };

	public static void main(String[] args) {
		new FindSecondLargestElement().findSecond();

	}

	private void findSecond() {
		int len = arr.length;
		int mid = len / 2;
		int secEle = Math.min(findSecondLargest(0, mid), findSecondLargest(mid + 1, len - 1));
		System.out.println("Second Largest Element " + secEle);
	}

	private int findSecondLargest(int i, int j) {
		if (i == j)
			return arr[i];
		else if (j == i + 1)
			return Math.max(arr[i], arr[j]);
		else {
			int mid = (i + j) / 2;
			return Math.max(findSecondLargest(i, mid), findSecondLargest(mid + 1, j));
		}
	}

}
